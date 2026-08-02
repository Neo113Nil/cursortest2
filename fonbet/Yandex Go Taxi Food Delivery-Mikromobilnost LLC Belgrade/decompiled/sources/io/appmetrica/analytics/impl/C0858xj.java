package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;
import org.json.JSONObject;
import ru.CryptoPro.JCP.VMInspector.OpenList;

/* renamed from: io.appmetrica.analytics.impl.xj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0858xj extends Aj {
    public C0858xj(S5 s5) {
        super(s5);
    }

    public final boolean a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("referrer");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C0178a3 c0178a3 = this.a.u().z;
                    for (String str2 : Uri.decode(queryParameter).split("&")) {
                        String decode = Uri.decode(str2);
                        int indexOf = decode.indexOf("=");
                        if (indexOf >= 0 && a(Uri.decode(decode.substring(0, indexOf)), Uri.decode(decode.substring(indexOf + 1)), c0178a3)) {
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
        as asVar = this.a.t;
        synchronized (asVar) {
            asVar.b(asVar.a() + 1);
        }
        this.a.A();
        C0214ba c0214ba = this.a.l;
        if (c0214ba.c == null) {
            c0214ba.a();
        }
        C0272da c0272da = c0214ba.c;
        c0272da.getClass();
        c0272da.b = new HashSet();
        c0272da.d = 0;
        C0272da c0272da2 = c0214ba.c;
        c0272da2.a = true;
        C0358ga c0358ga = c0214ba.b;
        IBinaryDataHelper iBinaryDataHelper = c0358ga.c;
        C0329fa c0329fa = c0358ga.b;
        c0358ga.a.getClass();
        iBinaryDataHelper.insert("event_hashes", c0329fa.toByteArray((C0329fa) C0300ea.a(c0272da2)));
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        String value = k6.getValue();
        if (TextUtils.isEmpty(value)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(value);
            if (!OpenList.STR_OPEN.equals(jSONObject.optString("type"))) {
                return false;
            }
            as asVar = this.a.t;
            synchronized (asVar) {
                asVar.d(asVar.b() + 1);
            }
            if (!a(jSONObject.optString("link"))) {
                return false;
            }
            k6.n = Boolean.TRUE;
            b();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(String str, String str2, C0178a3 c0178a3) {
        Object obj;
        if ("reattribution".equals(str) && "1".equals(str2)) {
            return true;
        }
        if (c0178a3 == null) {
            return false;
        }
        for (Pair pair : c0178a3.a) {
            if (Or.a(pair.first, str) && ((obj = pair.second) == null || ((Z2) obj).a.equals(str2))) {
                return true;
            }
        }
        return false;
    }
}
