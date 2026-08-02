package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.scc;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRuleProvider;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.model.LazyPushRequestInfo;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.push.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1009a1 extends C2 {
    public static final long[] b = {1, 1, 1};
    public final Context a;

    public C1009a1(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.impl.C2
    public final D2 a(PushMessage pushMessage) {
        LazyPushRequestInfo lazyPushRequestInfo = pushMessage.getLazyPushRequestInfo();
        String url = lazyPushRequestInfo == null ? null : lazyPushRequestInfo.getUrl();
        if (CoreUtils.isEmpty(url)) {
            return new D2(pushMessage, PushFilter.FilterResult.show());
        }
        PushFilter.FilterResult filter = r.a(this.a).c().a.filter(pushMessage);
        if (filter.isSilence()) {
            throw new B2(filter.category, filter.details);
        }
        Context context = this.a;
        List g = scc.g(new C0(context), new U1(), new J2(context), new C1029f1(context), new K());
        q2 q2Var = new q2();
        ArrayList arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            LazyPushTransformRule rule = ((LazyPushTransformRuleProvider) it.next()).getRule(pushMessage);
            if (rule != null) {
                arrayList.add(rule);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LazyPushTransformRule lazyPushTransformRule = (LazyPushTransformRule) it2.next();
            Iterator<String> it3 = lazyPushTransformRule.getPatternList().iterator();
            while (it3.hasNext()) {
                q2Var.a.put(it3.next(), lazyPushTransformRule);
            }
        }
        String a = q2Var.a(url);
        Map<String, String> headers = lazyPushRequestInfo.getHeaders();
        HashMap hashMap = new HashMap();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                hashMap.put(entry.getKey(), q2Var.a(entry.getValue()));
            }
        }
        try {
            long[] retryStrategySeconds = lazyPushRequestInfo.getRetryStrategySeconds();
            if (retryStrategySeconds == null) {
                retryStrategySeconds = b;
            }
            Z0 a2 = a(a, hashMap, retryStrategySeconds);
            String str = a2.a;
            if (str != null) {
                return C2.a(pushMessage, "Unknown response by backend", str);
            }
            String str2 = a2.b;
            if (str2 != null) {
                return C2.a(pushMessage, "Filtered by backend", str2);
            }
            try {
                return new D2(pushMessage.append(a2.c), PushFilter.FilterResult.show());
            } catch (Throwable th) {
                return C2.a(pushMessage, "Failed merge push messages", th.getMessage());
            }
        } catch (Throwable th2) {
            return Boolean.TRUE.equals(lazyPushRequestInfo.getUseCurPushAsFallback()) ? new D2(pushMessage, PushFilter.FilterResult.show()) : C2.a(pushMessage, "Backend not available", th2.getMessage());
        }
    }

    public static Z0 a(String str, HashMap hashMap, long[] jArr) {
        PublicLogger.INSTANCE.info("Request lazy push from %s with retry policy %s", str, Arrays.toString(jArr));
        int i = 0;
        while (true) {
            try {
                PublicLogger.INSTANCE.info("Request #%d for %s", Integer.valueOf(i), str);
                O0 o0 = new O0(str);
                for (Map.Entry entry : hashMap.entrySet()) {
                    o0.a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                byte[] a = o0.a();
                PublicLogger.INSTANCE.info("Response for %s: '%s'", str, new String(a, Charset.forName("UTF-8")));
                return new Z0(a);
            } catch (IOException e) {
                if (i < jArr.length) {
                    int i2 = i + 1;
                    try {
                        long j = jArr[i];
                        PublicLogger.INSTANCE.info("Wait %d seconds before next request for %s", Long.valueOf(j), str);
                        Thread.sleep(TimeUnit.SECONDS.toMillis(j));
                    } catch (InterruptedException e2) {
                        PublicLogger.INSTANCE.error(e2, e2.getMessage(), new Object[0]);
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
