package defpackage;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;

/* loaded from: classes11.dex */
public abstract class xnb1 {
    public static final void a(qor qorVar, f530 f530Var, rbn rbnVar, a aVar, a aVar2, fid fidVar, int i) {
        qor qorVar2;
        zls zlsVar;
        zls zlsVar2;
        dmw0 dmw0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1511184764);
        dmw0 dmw0Var2 = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            Object Q = btsVar.Q();
            if (Q == did.a) {
                qorVar2 = qorVar;
                dmw0Var = dmw0Var2;
                Q = new gbc(qorVar2, rbnVar);
                btsVar.o0(Q);
            } else {
                qorVar2 = qorVar;
                dmw0Var = dmw0Var2;
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, z910Var);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            cj6 cj6Var = cj6.a;
            zlsVar = aVar;
            zlsVar.invoke(cj6Var, btsVar, 54);
            btsVar.t(true);
            f530 t = ljs0.t(c530Var, x4c.D, true);
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, t);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d5);
            zlsVar2 = aVar2;
            zlsVar2.invoke(cj6Var, btsVar, 54);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            qorVar2 = qorVar;
            zlsVar = aVar;
            zlsVar2 = aVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(f530Var, (Object) qorVar2, (Object) rbnVar, (Object) zlsVar, (Object) zlsVar2, i, 7);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1322501279);
        if (btsVar.V(i & 1, i != 0)) {
            mdb1.d(271.0f, 6, btsVar, null);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 8);
        }
    }

    public static final void c(ModalViewType modalViewType, y7m y7mVar, fid fidVar, int i) {
        f530 f530Var;
        so5 so5Var = x4c.G;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1564517748);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.c(modalViewType.ordinal()) ? 4 : 2) | i | (btsVar.k(y7mVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            if (y7mVar == null || (f530Var = ljs0.e(c530Var, y7mVar.a)) == null) {
                f530Var = c530Var;
            }
            int i3 = b330.a[modalViewType.ordinal()];
            g43 g43Var = lr20.c;
            if (i3 == 1) {
                btsVar.e0(437080852);
                f530 m = an91.m(f530Var, 16.0f, 0.0f, 2);
                sic a = qic.a(g43Var, so5Var, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, m);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, d.f, a);
                qje.W(btsVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar, hashCode, wlsVar);
                }
                qje.W(btsVar, d.d, d);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                mdb1.a(321.0f, an91.o(c530Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), btsVar, 438, 0);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                b(btsVar, 0);
                b(btsVar, 0);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(437611820);
                f530 m2 = an91.m(f530Var, 16.0f, 0.0f, 2);
                sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = b.d(btsVar, m2);
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
                qje.W(btsVar, d.f, a2);
                qje.W(btsVar, d.e, o2);
                wls wlsVar2 = d.g;
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                    b64.z(hashCode2, btsVar, hashCode2, wlsVar2);
                }
                qje.W(btsVar, d.d, d2);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                mdb1.b(56.0f, btsVar, 0);
                oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
                mdb1.b(160.0f, btsVar, 6);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                b(btsVar, 0);
                b(btsVar, 0);
                b(btsVar, 0);
                mdb1.b(56.0f, btsVar, 0);
                oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
                btsVar.t(true);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(modalViewType, y7mVar, i, 23);
        }
    }

    public static final String d(String str) {
        Spanned fromHtml = Html.fromHtml(str);
        URLSpan[] uRLSpanArr = (URLSpan[]) new SpannableStringBuilder(fromHtml).getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr.length == 0) {
            return null;
        }
        return uRLSpanArr[0].getURL();
    }
}
