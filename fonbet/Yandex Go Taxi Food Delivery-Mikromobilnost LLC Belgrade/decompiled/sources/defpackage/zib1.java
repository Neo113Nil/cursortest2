package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class zib1 {
    public static au2 a;

    public static final void a(yha yhaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1313529939);
        int i2 = (btsVar.k(yhaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            wg6 a2 = b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            a S = wwg.S(-836978918, true, new wg0(11, tlsVar), btsVar);
            a S2 = wwg.S(1901127865, true, new sp5(15, yhaVar, tlsVar), btsVar);
            a S3 = wwg.S(-1540641011, true, new l0(9, yhaVar, tlsVar), btsVar);
            btsVar = btsVar;
            c.a(null, a2, null, false, false, null, null, null, S, null, S2, S3, btsVar, 100663296, 54, 765);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pha(yhaVar, tlsVar, i, 0);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(108013867);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 b = pfb1.b(i9a1.d(an91.k(ljs0.c(c530Var, 1.0f), 8.0f)), true, 30);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            f530 c = ljs0.c(c530Var, 1.0f);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new bgc(12);
                btsVar.o0(Q);
            }
            d5d.a.getClass();
            d17.c(c, false, null, buttonStyle, null, (sls) Q, d5d.b, btsVar, 1772598, 20);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    public static final void c(yha yhaVar, tls tlsVar, fid fidVar, int i) {
        ?? r10;
        boolean z;
        boolean z2;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-382165534);
        int i2 = (btsVar.k(yhaVar) ? 4 : 2) | i | (btsVar.e(tlsVar2) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            qgy.b(yhaVar.b, null, an91.n(ljs0.c(c530Var, 1.0f), 16.0f, 24.0f, 16.0f, 16.0f), null, 0L, 0L, null, 0L, 2, 2, 0, xya1.b(btsVar).e, null, btsVar, 805306752, 6, 10746);
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            wha whaVar = yhaVar.c;
            if (whaVar == null) {
                btsVar.e0(1866097304);
                btsVar.t(false);
                z = true;
                z2 = false;
            } else {
                btsVar.e0(1866097305);
                z = true;
                z2 = false;
                e(whaVar.b, whaVar.a, null, false, tlsVar2, btsVar, ((i2 << 9) & HProv.ALG_CLASS_ALL) | 3456);
                btsVar.t(false);
            }
            xha xhaVar = yhaVar.d;
            if (xhaVar == null) {
                btsVar.e0(1866325774);
                btsVar.t(z2);
                tlsVar2 = tlsVar;
            } else {
                btsVar.e0(1866325775);
                tlsVar2 = tlsVar;
                e(xhaVar.b, xhaVar.a, xhaVar.c, (yhaVar.g ? 1 : 0) ^ (z ? 1 : 0), tlsVar2, btsVar, (i2 << 9) & HProv.ALG_CLASS_ALL);
                btsVar.t(z2);
            }
            btsVar.t(z);
            r10 = z;
        } else {
            r10 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pha(yhaVar, tlsVar2, i, r10);
        }
    }

    public static final void d(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-989157238);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(n.e(c530Var, 34.0f, btsVar, c530Var, 1.0f), 16.0f), cyk0.a, false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            f(btsVar, 0);
            f(btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mq5(i, 29);
        }
    }

    public static final void e(CharSequence charSequence, String str, wj90 wj90Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(565092820);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar.k(wj90Var) : btsVar.e(wj90Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ydb1.a(null, wwg.S(752222206, true, new le(str, i4), btsVar), wwg.S(1494516515, true, new or9(i3, charSequence), btsVar), null, wwg.S(325298601, true, new jfa(wj90Var, z, tlsVar, i5), btsVar), null, null, false, btsVar, 25008, 233);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(charSequence, str, wj90Var, z, tlsVar, i, 6);
        }
    }

    public static final void f(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2117134072);
        int i2 = 0;
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f530 m = ljs0.m(c530Var, 24.0f);
            byk0 byk0Var = cyk0.a;
            com.yandex.go.design.compose.loading.b.a(m, byk0Var, false, null, null, null, false, btsVar, 6, 252);
            oeb1.c(btsVar, ljs0.q(c530Var, 16.0f));
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(c530Var, 1.0f), 16.0f), byk0Var, false, null, null, null, false, btsVar, 6, 252);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qha(i, i2);
        }
    }

    public static Rect g(Context context, int i, int i2) {
        TypedArray d = yvy0.d(context, null, z2i0.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = d.getDimensionPixelSize(z2i0.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(org0.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = d.getDimensionPixelSize(z2i0.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(org0.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = d.getDimensionPixelSize(z2i0.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(org0.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = d.getDimensionPixelSize(z2i0.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(org0.mtrl_alert_dialog_background_inset_bottom));
        d.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i3 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }
}
