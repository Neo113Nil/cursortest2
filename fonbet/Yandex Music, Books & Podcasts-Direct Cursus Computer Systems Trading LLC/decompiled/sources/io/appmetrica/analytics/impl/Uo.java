package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Uo implements NetworkResponseHandler {
    public final C0184cp a;
    public final K3 b;

    public Uo() {
        this(new C0184cp(), new K3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0328hp handle(@NonNull ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!AbstractC0734vr.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C0184cp c0184cp = this.a;
                c0184cp.getClass();
                C0328hp c0328hp = new C0328hp();
                try {
                    c0184cp.h.getClass();
                    Ec ec = new Ec(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = ec.optJSONObject("device_id");
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString(Constants.KEY_VALUE);
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0328hp.h = str2;
                    c0328hp.i = str;
                    c0184cp.a(c0328hp, ec);
                    c0328hp.a = TextUtils.isEmpty(c0328hp.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0328hp = new C0328hp();
                    c0328hp.a = 1;
                }
                if (2 == c0328hp.a) {
                    return c0328hp;
                }
            }
        }
        return null;
    }

    public Uo(C0184cp c0184cp, K3 k3) {
        this.a = c0184cp;
        this.b = k3;
    }
}
