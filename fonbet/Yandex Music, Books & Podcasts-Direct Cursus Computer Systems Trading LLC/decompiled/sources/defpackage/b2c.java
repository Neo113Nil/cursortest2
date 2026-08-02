package defpackage;

import android.graphics.PointF;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes4.dex */
public class b2c implements rc, b0q, p7q, d2k, xwt, kg3, myf, lci, mu6, s8e, olr {
    public static final b2c a = new b2c();
    public static final iz2 b = new iz2(-1.0f, -1.0f);
    public static final iz2 c = new iz2(0.0f, -1.0f);
    public static final iz2 d = new iz2(1.0f, -1.0f);
    public static final iz2 e = new iz2(-1.0f, 0.0f);
    public static final iz2 f = new iz2(0.0f, 0.0f);
    public static final iz2 g = new iz2(1.0f, 0.0f);
    public static final iz2 h = new iz2(-1.0f, 1.0f);
    public static final iz2 i = new iz2(0.0f, 1.0f);
    public static final iz2 j = new iz2(1.0f, 1.0f);
    public static final hz2 k = new hz2(-1.0f);
    public static final hz2 l = new hz2(0.0f);
    public static final hz2 m = new hz2(1.0f);
    public static final gz2 n = new gz2(-1.0f);
    public static final gz2 o = new gz2(0.0f);
    public static final gz2 p = new gz2(1.0f);
    public static final b2c q = new b2c();
    public static final b2c r = new b2c();
    public static final b2c s = new b2c();
    public static final b2c t = new b2c();
    public static final b2c u = new b2c();
    public static final b2c v = new b2c();
    public static final e7o w = new e7o(26);
    public static final arv x = new arv();
    public static final b2c y = new b2c();
    public static final b2c z = new b2c();

    public static i94 A(String str) {
        if (str == null) {
            return null;
        }
        for (i94 i94Var : i94.values()) {
            if (i94Var.a.equals(str)) {
                return i94Var;
            }
        }
        return null;
    }

    public static float v(boolean z2, hq5 hq5Var) {
        return ((((irv.d(hq5Var) - (z2 ? 170 : 130)) - 50) - 56) - irv.f(hq5Var)) - irv.e(hq5Var);
    }

    public static ad6 z(String str) {
        String str2;
        String obj;
        if (str == null || (obj = StringsKt.t0(str).toString()) == null) {
            str2 = null;
        } else {
            str2 = obj.toLowerCase(Locale.ROOT);
            str2.getClass();
        }
        if (str2 == null || StringsKt.U(str2)) {
            return null;
        }
        return str2.equals("bookmate") ? zc6.a : str2.equals("kids") ? wc6.a : str2.equals("alice-pro") ? vc6.a : str2.equals("lumen") ? xc6.a : new yc6(str2);
    }

    @Override // defpackage.b0q
    public Object B(aaq aaqVar) {
        aaqVar.getClass();
        if (aaqVar instanceof t9q) {
            return ((t9q) aaqVar).a;
        }
        if ((aaqVar instanceof u9q) || (aaqVar instanceof x9q) || Intrinsics.d(aaqVar, y9q.a) || (aaqVar instanceof hbq) || (aaqVar instanceof uaq) || (aaqVar instanceof caq) || (aaqVar instanceof paq)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return xc5Var.a;
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        g1qVar.getClass();
        if (g1qVar instanceof d1q) {
            return ((d1q) g1qVar).a;
        }
        if ((g1qVar instanceof f1q) || (g1qVar instanceof i1q) || (g1qVar instanceof l1q) || (g1qVar instanceof s1q) || (g1qVar instanceof v1q) || (g1qVar instanceof b2q)) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        return null;
    }

    @Override // defpackage.myf
    public void b(zyf zyfVar) {
        zyfVar.b();
    }

    @Override // defpackage.s8e
    public nsg c(String str) {
        return cwi.a;
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return null;
    }

    @Override // defpackage.rc
    public String e() {
        return "";
    }

    @Override // defpackage.olr
    public nlr g() {
        return null;
    }

    @Override // defpackage.kg3
    public long h(idp idpVar, int i2) {
        return idpVar.f.h(i2);
    }

    @Override // defpackage.rc
    public String j() {
        return "";
    }

    @Override // defpackage.olr
    public String k(String str, VideoData videoData, String str2, long j2, boolean z2, int i2, boolean z3) {
        str.getClass();
        return videoData.getManifestUrl();
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.olr
    public Map o() {
        return null;
    }

    @Override // defpackage.mu6
    public ru6 p(v2q v2qVar, v2q v2qVar2, boolean z2) {
        boolean z3;
        v2qVar2.getClass();
        if (!nt0.t(v2qVar2, v2qVar) && (v2qVar2 instanceof u2q)) {
            u2q u2qVar = (u2q) v2qVar2;
            if (u2qVar.d) {
                gy1 gy1Var = u2qVar.c;
                u2q u2qVar2 = v2qVar instanceof u2q ? (u2q) v2qVar : null;
                if (gy1Var == (u2qVar2 != null ? u2qVar2.c : null)) {
                    z3 = true;
                    return new ru6(v2qVar2, v2qVar, z3);
                }
            }
        }
        z3 = false;
        return new ru6(v2qVar2, v2qVar, z3);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.xwt
    public Object r(b7f b7fVar, float f2) {
        int peek = b7fVar.peek();
        if (peek == 1) {
            return p7f.b(b7fVar, f2);
        }
        if (peek == 3) {
            return p7f.b(b7fVar, f2);
        }
        if (peek != 7) {
            xq0.x("Cannot convert json to point. Next token is ".concat(f1d.x(peek)));
            return null;
        }
        PointF pointF = new PointF(((float) b7fVar.nextDouble()) * f2, ((float) b7fVar.nextDouble()) * f2);
        while (b7fVar.hasNext()) {
            b7fVar.w();
        }
        return pointF;
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        d0tVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return null;
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        aouVar.getClass();
        return null;
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new dm3(0, new hs4(16));
    }

    @Override // defpackage.olr
    public void a() {
    }

    @Override // defpackage.olr
    public void stop() {
    }

    @Override // defpackage.myf
    public void l(zyf zyfVar) {
    }

    @Override // defpackage.olr
    public void f(paw pawVar, Map map, boolean z2) {
    }

    @Override // defpackage.d2k
    public int i(utf utfVar, int i2, int i3) {
        return i2;
    }
}
