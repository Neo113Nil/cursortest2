package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* renamed from: io.appmetrica.analytics.impl.mp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0546mp implements NetworkResponseHandler {
    public final C0777up a;
    public final K3 b;

    public C0546mp() {
        this(new C0777up(), new K3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0922zp handle(ResponseDataHolder responseDataHolder) {
        String str;
        String str2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!Or.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C0777up c0777up = this.a;
                c0777up.getClass();
                C0922zp c0922zp = new C0922zp();
                try {
                    c0777up.h.getClass();
                    Uc uc = new Uc(new String(responseData, "UTF-8"));
                    JSONObject optJSONObject = uc.optJSONObject(MetaDataField.DEVICE_ID_FIELD);
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("hash");
                        str2 = optJSONObject.optString("value");
                    } else {
                        str = "";
                        str2 = "";
                    }
                    c0922zp.h = str2;
                    c0922zp.i = str;
                    c0777up.a(c0922zp, uc);
                    c0922zp.a = TextUtils.isEmpty(c0922zp.i) ? 1 : 2;
                } catch (Throwable unused) {
                    c0922zp = new C0922zp();
                    c0922zp.a = 1;
                }
                if (2 == c0922zp.a) {
                    return c0922zp;
                }
            }
        }
        return null;
    }

    public C0546mp(C0777up c0777up, K3 k3) {
        this.a = c0777up;
        this.b = k3;
    }
}
