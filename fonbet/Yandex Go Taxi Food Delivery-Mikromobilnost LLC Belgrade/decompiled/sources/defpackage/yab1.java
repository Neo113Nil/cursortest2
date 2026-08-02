package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzls;
import java.util.Collections;
import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class yab1 extends r9b1 {
    public static final boolean Jg(String str) {
        String str2 = (String) nw91.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r8.G().r()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vab1 Hg(String str) {
        g gVar = (g) this.b;
        n nVar = this.c;
        b bVar = nVar.c;
        p8a1 p8a1Var = nVar.a;
        n.O(bVar);
        n3a1 Ih = bVar.Ih(str);
        vab1 vab1Var = null;
        if (Ih == null || !Ih.y()) {
            return new vab1(Ig(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, null);
        }
        bda1 s = n0.s();
        s.j(2);
        zzin a = zzin.a(Ih.t());
        cvw.l(a);
        s.i(a);
        String E = Ih.E();
        n.O(p8a1Var);
        r Sg = p8a1Var.Sg(str);
        if (Sg != null) {
            b bVar2 = nVar.c;
            n.O(bVar2);
            n3a1 Ih2 = bVar2.Ih(str);
            if (Ih2 != null) {
                if (!Sg.F() || Sg.G().r() != 100) {
                    ieb1 ieb1Var = gVar.B;
                    g.e(ieb1Var);
                    if (!ieb1Var.fh(str, Ih2.C())) {
                        if (!TextUtils.isEmpty(E)) {
                        }
                    }
                }
                String D = Ih.D();
                s.j(2);
                n.O(p8a1Var);
                r Sg2 = p8a1Var.Sg(Ih.D());
                if (Sg2 == null || !Sg2.F()) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.H.b(D, "[sgtm] Missing sgtm_setting in remote config. appId");
                    s.l(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(Ih.C())) {
                        hashMap.put("x-gtm-server-preview", Ih.C());
                    }
                    String s2 = Sg2.G().s();
                    zzin a2 = zzin.a(Ih.t());
                    if (a2 != null && a2 != zzin.CLIENT_UPLOAD_ELIGIBLE) {
                        s.i(a2);
                    } else if (Jg(Ih.D())) {
                        s.i(zzin.PINNED_TO_SERVICE_UPLOAD);
                    } else if (TextUtils.isEmpty(s2)) {
                        s.i(zzin.MISSING_SGTM_SERVER_URL);
                    } else {
                        y1a1 y1a1Var2 = gVar.y;
                        g.g(y1a1Var2);
                        y1a1Var2.H.b(D, "[sgtm] Eligible for client side upload. appId");
                        s.j(3);
                        s.i(zzin.CLIENT_UPLOAD_ELIGIBLE);
                        vab1Var = new vab1(s2, hashMap, zzls.SGTM_CLIENT, (n0) s.f());
                    }
                    Sg2.G().getClass();
                    Sg2.G().getClass();
                    gVar.getClass();
                    y1a1 y1a1Var3 = gVar.y;
                    if (TextUtils.isEmpty(s2)) {
                        s.l(6);
                        g.g(y1a1Var3);
                        y1a1Var3.H.b(Ih.D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        g.g(y1a1Var3);
                        y1a1Var3.H.b(D, "[sgtm] Eligible for local service direct upload. appId");
                        s.j(5);
                        s.l(2);
                        vab1Var = new vab1(s2, hashMap, zzls.SGTM, (n0) s.f());
                    }
                }
                return vab1Var != null ? vab1Var : new vab1(Ig(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (n0) s.f());
            }
        }
        s.l(3);
        return new vab1(Ig(str), Collections.EMPTY_MAP, zzls.GOOGLE_ANALYTICS, (n0) s.f());
    }

    public final String Ig(String str) {
        p8a1 p8a1Var = this.c.a;
        n.O(p8a1Var);
        String Tg = p8a1Var.Tg(str);
        if (TextUtils.isEmpty(Tg)) {
            return (String) nw91.r.a(null);
        }
        Uri parse = Uri.parse((String) nw91.r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(Tg).length() + 1 + String.valueOf(authority).length());
        sb.append(Tg);
        sb.append(Extension.DOT_CHAR);
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }
}
