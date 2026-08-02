package ru.yandex.taxi.favorites.address.impl.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.adp;
import defpackage.aii0;
import defpackage.an91;
import defpackage.azd;
import defpackage.bts;
import defpackage.c530;
import defpackage.cx20;
import defpackage.d0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.gv9;
import defpackage.h7d;
import defpackage.i0;
import defpackage.j2d;
import defpackage.jeb1;
import defpackage.kj5;
import defpackage.kq5;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.o430;
import defpackage.oz40;
import defpackage.q0;
import defpackage.rcb1;
import defpackage.sg0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tnb1;
import defpackage.u5t0;
import defpackage.uep;
import defpackage.up2;
import defpackage.uu21;
import defpackage.vg0;
import defpackage.vuz;
import defpackage.wls;
import defpackage.wo1;
import defpackage.wu40;
import defpackage.wwg;
import defpackage.xya1;
import defpackage.ydb1;
import defpackage.zcp;
import defpackage.zpn;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(String str, String str2, fid fidVar, int i) {
        f530 a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2083626021);
        int i2 = 2;
        int i3 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.k(str2) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            a = androidx.compose.ui.b.a(an91.o(c530.a, 16.0f, 0.0f, 16.0f, 8.0f, 2), m.a(), new j2d(3));
            h7d.a.getClass();
            ydb1.a(a, h7d.b, wwg.S(1607922476, true, new i0(str, str2, i2), btsVar), null, null, null, null, false, btsVar, 438, 248);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str2, i, i2);
        }
    }

    public static final void b(boolean z, String str, String str2, uu21 uu21Var, u5t0 u5t0Var, oz40 oz40Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(590428835);
        int i2 = i | (btsVar2.a(z) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.k(uu21Var) ? 2048 : 1024) | (btsVar2.k(u5t0Var) ? 16384 : 8192) | (btsVar2.e(tlsVar) ? 1048576 : 524288);
        int i3 = 0;
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(str);
                btsVar2.o0(Q);
            }
            oz40 oz40Var2 = (oz40) Q;
            boolean z2 = (i2 & 112) == 32;
            Object Q2 = btsVar2.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new FavoriteAddressForTaxiModalKt$EmojiInput$1$1(oz40Var2, str, null);
                btsVar2.o0(Q2);
            }
            zpn.e(btsVar2, (wls) Q2, str);
            f530 o = an91.o(c530.a, 16.0f, 0.0f, 16.0f, 8.0f, 2);
            String str3 = (String) oz40Var2.getValue();
            boolean z3 = (3670016 & i2) == 1048576;
            Object Q3 = btsVar2.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new d0(tlsVar, oz40Var2, 5);
                btsVar2.o0(Q3);
            }
            btsVar = btsVar2;
            rcb1.a(str3, (tls) Q3, o, z, null, null, null, null, str2, null, null, null, null, null, null, false, 0.0f, null, null, null, null, false, 0, 0, null, null, null, wwg.S(112718933, true, new gv9(uu21Var, z, u5t0Var, oz40Var, 2), btsVar2), null, wwg.S(-1219261104, true, new zcp(i3, oz40Var2), btsVar2), btsVar, ((i2 << 9) & 7168) | 384 | ((i2 << 21) & 1879048192), 100663296, 6, 805305840);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wo1(z, str, str2, uu21Var, u5t0Var, oz40Var, tlsVar, i);
        }
    }

    public static final void c(tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1934368824);
        int i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new adp(0, tlsVar);
                btsVar.o0(Q);
            }
            androidx.compose.ui.viewinterop.b.a((tls) Q, ljs0.e(ljs0.c(c530.a, 1.0f), 367.0f), null, btsVar, 48, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sg0(i, 10, tlsVar);
        }
    }

    public static final void d(boolean z, uep uepVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1712928095);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(uepVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean k = btsVar.k(uepVar.b);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = f.j(uepVar.b);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            u5t0 u5t0Var = (u5t0) btsVar.m(j.q);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            boolean f = vuz.o(btsVar).c.f();
            boolean z2 = (i2 & 896) == 256;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == o430Var) {
                Q3 = new azd(18, tlsVar);
                btsVar.o0(Q3);
            }
            sls slsVar = (sls) Q3;
            Boolean valueOf = Boolean.valueOf(f);
            boolean a = btsVar.a(f);
            Object Q4 = btsVar.Q();
            if (a || Q4 == o430Var) {
                Q4 = new FavoriteAddressForTaxiModalKt$FavoriteAddressForTaxiModal$1$1(f, oz40Var2, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, valueOf);
            cx20.a(null, null, tnb1.e(z ? new up2(ldc.l) : AppColor$Palette.Fog, z ? null : slsVar, btsVar, 4), null, null, false, false, wwg.S(1680143177, true, new wu40(3, slsVar), btsVar), wwg.S(-2003874543, true, new vg0((Object) uepVar, (Object) u5t0Var, (Object) oz40Var2, tlsVar, (Object) oz40Var, 5), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(z, uepVar, tlsVar, i, 4);
        }
    }

    public static final void e(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1005978912);
        int i2 = (btsVar2.k(str) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            f530 o = an91.o(c530.a, 16.0f, 0.0f, 16.0f, 12.0f, 2);
            btsVar = btsVar2;
            jeb1.f(str == null ? "" : str, o, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).e.d, btsVar, 48, 0, 16380);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 24);
        }
    }
}
