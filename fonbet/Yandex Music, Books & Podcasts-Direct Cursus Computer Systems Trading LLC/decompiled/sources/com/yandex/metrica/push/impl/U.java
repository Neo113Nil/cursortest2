package com.yandex.metrica.push.impl;

import android.content.Context;
import com.yandex.metrica.push.PushFilter;
import com.yandex.metrica.push.common.utils.CoreUtils;
import com.yandex.metrica.push.common.utils.InternalLogger;
import com.yandex.metrica.push.core.model.LazyPushRequestInfo;
import com.yandex.metrica.push.core.model.PushMessage;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class U extends Y {
    private static final long[] c = {1, 1, 1};
    private final Context a;
    private final B b;

    public U(Context context) {
        this.a = context;
        this.b = new B(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.yandex.metrica.push.impl.Z] */
    @Override // com.yandex.metrica.push.impl.Y
    public Z a(PushMessage pushMessage) {
        LazyPushRequestInfo lazyPushRequestInfo = pushMessage.getLazyPushRequestInfo();
        String url = lazyPushRequestInfo == null ? null : lazyPushRequestInfo.getUrl();
        if (CoreUtils.isEmpty(url)) {
            return Z.a(pushMessage);
        }
        PushFilter.FilterResult filter = C0077n.a(this.a).d().filter(pushMessage);
        if (filter.isSilence()) {
            throw new X(filter.category, filter.details);
        }
        com.yandex.metrica.push.utils.k a = new com.yandex.metrica.push.utils.k("[{]", "[}]").a(new p0()).a(new q0(this.a)).a(new t0(pushMessage.getNotificationId())).a(new u0(this.a)).a(new s0(this.b, lazyPushRequestInfo.getLocation()));
        String a2 = a.a(url);
        Map<String, String> headers = lazyPushRequestInfo.getHeaders();
        HashMap hashMap = new HashMap();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                hashMap.put(entry.getKey(), a.a(entry.getValue()));
            }
        }
        try {
            long[] retryStrategySeconds = lazyPushRequestInfo.getRetryStrategySeconds();
            if (retryStrategySeconds == null) {
                retryStrategySeconds = c;
            }
            r0 a3 = a(a2, hashMap, retryStrategySeconds);
            if (!a3.d()) {
                return Z.a(pushMessage, "Unknown response by backend", a3.a());
            }
            if (a3.e()) {
                return Z.a(pushMessage, "Filtered by backend", a3.b());
            }
            try {
                pushMessage = Z.a(pushMessage.append(a3.c()));
                return pushMessage;
            } catch (Throwable th) {
                return Z.a(pushMessage, "Failed merge push messages", th.getMessage());
            }
        } catch (Throwable th2) {
            return Boolean.TRUE.equals(lazyPushRequestInfo.getUseCurPushAsFallback()) ? Z.a(pushMessage) : Z.a(pushMessage, "Backend not available", th2.getMessage());
        }
    }

    private r0 a(String str, Map<String, String> map, long[] jArr) throws IOException {
        InternalLogger.i("Request lazy push from %s with retry policy %s", str, Arrays.toString(jArr));
        int i = 0;
        while (true) {
            try {
                InternalLogger.i("Request #%d for %s", Integer.valueOf(i), str);
                M0 m0 = new M0(str);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    m0.a(entry.getKey(), entry.getValue());
                }
                byte[] a = m0.a();
                InternalLogger.i("Response for %s: '%s'", str, new String(a, Charset.forName("UTF-8")));
                return new r0(a);
            } catch (IOException e) {
                if (i < jArr.length) {
                    int i2 = i + 1;
                    try {
                        long j = jArr[i];
                        InternalLogger.i("Wait %d seconds before next request for %s", Long.valueOf(j), str);
                        Thread.sleep(TimeUnit.SECONDS.toMillis(j));
                    } catch (InterruptedException e2) {
                        InternalLogger.e(e2, e2.getMessage(), new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                    i = i2;
                } else {
                    throw e;
                }
            }
        }
    }
}
