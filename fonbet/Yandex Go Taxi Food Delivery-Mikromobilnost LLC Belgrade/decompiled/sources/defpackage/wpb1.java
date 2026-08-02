package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.check.CheckState;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class wpb1 {
    public static final void a(CharSequence charSequence, na11 na11Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1859663289);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2) | (btsVar.k(na11Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 k = an91.k(i9a1.d(c530.a), 8.0f);
            boolean c = btsVar.c(2) | btsVar.b(4.0f) | btsVar.a(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new jg0(24);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new ji40(tlsVar, na11Var, 0);
                btsVar.o0(Q2);
            }
            ohb1.b(null, false, null, (sls) Q2, wwg.S(1001480805, true, new or9(11, charSequence), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) charSequence, (Object) na11Var, tlsVar, i, 11);
        }
    }

    public static final void b(fbe fbeVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1775296325);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(fbeVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a.a(slsVar, ljs0.c(ljs0.e(an91.k(c530.a, 8.0f), 56.0f), 1.0f), ((YandexShapes) btsVar.m(qm51.a)).b(), 0L, 0L, null, false, null, null, null, wwg.S(-1825631246, true, new ota(7, fbeVar), btsVar), btsVar, (i2 >> 3) & 14, 4088);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(fbeVar, slsVar, i, 1);
        }
    }

    public static final void c(si40 si40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1810907400);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(si40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 24;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(233081459, true, new ut9(i3, tlsVar, si40Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(si40Var, tlsVar, i, i3);
        }
    }

    public static final void d(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1276533983);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.e(str, an91.m(c530.a, 18.0f, 0.0f, 2), ((el51) btsVar2.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar, (i2 & 14) | 24624, HProv.ALG_TYPE_SECURECHANNEL, 57320);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 10);
        }
    }

    public static final void e(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1456421291);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).f.c, null, btsVar, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 22, charSequence);
        }
    }

    public static final void f(na11 na11Var, na11 na11Var2, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1298674717);
        int i2 = i | (btsVar.k(na11Var) ? 4 : 2) | (btsVar.k(na11Var2) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean l = jl40.l(na11Var.b, na11Var2.b);
            c530 c530Var = c530.a;
            f530 c = ljs0.c(ljs0.e(c530Var, 56.0f), 1.0f);
            boolean a = btsVar.a(l);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                Q = new yce(l, 11);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c, false, (tls) Q);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new ji40(tlsVar, na11Var, 1);
                btsVar.o0(Q2);
            }
            f530 d = q791.d(b, false, null, null, (sls) Q2, 15);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
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
            qje.W(btsVar, d.d, d2);
            jeb1.f(na11Var.c, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 384, 0, 16378);
            btsVar = btsVar;
            xkb1.a(jl40.l(na11Var.b, na11Var2.b) ? CheckState.Checked : CheckState.Unchecked, ymb1.l(c530Var, cyk0.a), null, null, false, btsVar, 0, 28);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) na11Var, (Object) na11Var2, tlsVar, i, 12);
        }
    }

    public static final void g(List list, na11 na11Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(169735198);
        int i2 = i | (btsVar.k(list) ? 4 : 2) | (btsVar.k(na11Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new th40(i3, list, na11Var, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(c530.a, null, null, null, null, null, false, null, (tls) Q, btsVar, 6, 510);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240((Object) list, (Object) na11Var, tlsVar, i, 10);
        }
    }

    public static final Object h(long j, ContinuationImpl continuationImpl) {
        Object i = kotlinx.coroutines.a.i(j, continuationImpl);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : zy11.a;
    }
}
