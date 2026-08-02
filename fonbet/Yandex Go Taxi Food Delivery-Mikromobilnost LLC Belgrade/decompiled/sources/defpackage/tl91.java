package defpackage;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class tl91 {
    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1864834268);
        if (btsVar.V(i & 1, i != 0)) {
            dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530.a, 56.0f, 0.0f, 16.0f, 0.0f, 10));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new txk(i, 3);
        }
    }

    public static final void b(l8v l8vVar, String str, String str2, ldc ldcVar, ldc ldcVar2, float f, sls slsVar, fid fidVar, int i) {
        float f2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2060774178);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(l8vVar) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.k(str2) ? 256 : 128) | (btsVar.k(ldcVar) ? 2048 : 1024) | (btsVar.k(ldcVar2) ? 16384 : 8192) | (btsVar.b(f) ? 131072 : 65536) | (btsVar.e(slsVar) ? 1048576 : 524288);
        if (btsVar.V(i2 & 1, (i2 & 599187) != 599186)) {
            float f3 = ((y7m) y6i0.a(new y7m(cjb1.d(40.0f, 64.0f, f) - cjb1.d((str == null || str.length() == 0) ? 0.0f : 36.0f, 0.0f, f)), new y7m(16.0f))).a;
            float d = cjb1.d(0.0f, 64.0f, f);
            float d2 = cjb1.d(200.0f, 128.0f, f);
            float d3 = cjb1.d(24.0f, 16.0f, f);
            float d4 = cjb1.d(14.0f, 9.0f, f);
            float d5 = cjb1.d(1.0f, 0.32f, f);
            f530 o = an91.o(ljs0.c, 0.0f, f3, 0.0f, d, 5);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d6 = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d6);
            int i3 = i2 >> 3;
            h740.b(str, str2, f, true, btsVar, (i3 & 14) | HProv.ALG_TYPE_SECURECHANNEL | (i3 & 112) | ((i2 >> 9) & 896), 0);
            long n = tje.n(AppColor$Palette.EverFront, btsVar);
            if (f < 1.0f) {
                f2 = d2;
                z = true;
            } else {
                f2 = d2;
                z = false;
            }
            f530 m = ljs0.m(q791.b(c530.a, null, null, z, null, new awk0(0), slsVar, 8), f2);
            boolean b = btsVar.b(d5);
            Object Q = btsVar.Q();
            int i4 = 6;
            if (b || Q == did.a) {
                Q = new yo1(d5, i4);
                btsVar.o0(Q);
            }
            f530 k = an91.k(m4m0.b(ymb1.l(androidx.compose.ui.graphics.d.a(m, (tls) Q), cyk0.c(d3)), n, qke.q), d4);
            z910 d7 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d8 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d7);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d8);
            if (l8vVar != null) {
                btsVar.e0(1290679433);
                int i5 = i2 >> 6;
                h740.a(l8vVar, ldcVar, ldcVar2, f, mhe.b, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i5 & 112) | (i5 & 896) | (i5 & 7168));
                btsVar.t(false);
            } else {
                btsVar.e0(1290947552);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new f740(l8vVar, str, str2, ldcVar, ldcVar2, f, slsVar, i, 1);
        }
    }

    public static final vu41 c(kd5 kd5Var) {
        WebBackForwardList c = kd5Var.c();
        boolean z = c.getCurrentIndex() > 0;
        WebHistoryItem currentItem = c.getCurrentItem();
        return new vu41(kd5Var.d(), currentItem != null ? currentItem.getTitle() : null, z);
    }
}
