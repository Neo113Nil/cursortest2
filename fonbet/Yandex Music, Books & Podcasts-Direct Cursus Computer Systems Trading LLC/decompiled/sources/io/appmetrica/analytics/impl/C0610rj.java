package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0610rj extends AbstractC0697uj {
    public C0610rj(P5 p5) {
        super(p5);
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter(Constants.KEY_REFERRER);
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0104a3 c0104a3 = this.a.u().z;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0104a3)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final void b() {
        Hr hr = this.a.t;
        synchronized (hr) {
            hr.b(hr.a() + 1);
        }
        this.a.A();
        U9 u9 = this.a.l;
        if (u9.c == null) {
            u9.a();
        }
        W9 w9 = u9.c;
        w9.getClass();
        w9.b = new HashSet();
        w9.d = 0;
        W9 w92 = u9.c;
        w92.a = true;
        Z9 z9 = u9.b;
        IBinaryDataHelper iBinaryDataHelper = z9.c;
        Y9 y9 = z9.b;
        z9.a.getClass();
        iBinaryDataHelper.insert("event_hashes", y9.toByteArray((Y9) X9.a(w92)));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NonNull H6 h6) {
        String value = h6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            Hr hr = this.a.t;
            synchronized (hr) {
                hr.d(hr.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            h6.n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str, String str2, C0104a3 c0104a3) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0104a3 == null) {
            return false;
        }
        for (Pair pair : c0104a3.a) {
            if (AbstractC0734vr.a(pair.first, str) && ((obj = pair.second) == null || ((Z2) obj).a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
