package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Og extends Rg {
    public Og(X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        String value = p5.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!"open".equals(jSONObject.optString("type"))) {
                return false;
            }
            C0883xo c0883xo = this.f4998a.t;
            synchronized (c0883xo) {
                c0883xo.c(c0883xo.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            p5.f4917n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void b() {
        C0883xo c0883xo = this.f4998a.t;
        synchronized (c0883xo) {
            c0883xo.a(c0883xo.a() + 1);
        }
        this.f4998a.z();
        M8 m8 = this.f4998a.f5357l;
        if (m8.f4743c == null) {
            m8.a();
        }
        O8 o8 = m8.f4743c;
        o8.getClass();
        o8.f4856b = new HashSet();
        o8.f4858d = 0;
        O8 o82 = m8.f4743c;
        o82.f4855a = true;
        R8 r8 = m8.f4742b;
        IBinaryDataHelper iBinaryDataHelper = r8.f4990c;
        Q8 q8 = r8.f4989b;
        r8.f4988a.getClass();
        iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o82)));
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0576m2 c0576m2 = this.f4998a.t().f6025y;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0576m2)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(String str, String str2, C0576m2 c0576m2) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0576m2 == null) {
            return false;
        }
        for (Pair pair : c0576m2.f6474a) {
            if (AbstractC0572lo.a(pair.first, str) && ((obj = pair.second) == null || ((C0550l2) obj).f6412a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
