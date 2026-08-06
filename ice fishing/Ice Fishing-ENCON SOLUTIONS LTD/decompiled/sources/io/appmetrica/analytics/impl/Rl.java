package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Rl implements NetworkResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Yl f5008a;

    /* renamed from: b, reason: collision with root package name */
    public final V2 f5009b;

    public Rl() {
        this(new Yl(), new V2());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0364dm handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC0572lo.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f5009b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                Yl yl = this.f5008a;
                yl.getClass();
                C0364dm c0364dm = new C0364dm();
                try {
                    yl.f5453h.getClass();
                    C0404fb c0404fb = new C0404fb(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = c0404fb.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0364dm.f5831h = str2;
                    c0364dm.f5832i = str;
                    yl.a(c0364dm, c0404fb);
                    c0364dm.f5824a = TextUtils.isEmpty(c0364dm.f5832i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0364dm = new C0364dm();
                    c0364dm.f5824a = 1;
                }
                if (2 == c0364dm.f5824a) {
                    return c0364dm;
                }
            }
        }
        return null;
    }

    public Rl(Yl yl, V2 v2) {
        this.f5008a = yl;
        this.f5009b = v2;
    }
}
