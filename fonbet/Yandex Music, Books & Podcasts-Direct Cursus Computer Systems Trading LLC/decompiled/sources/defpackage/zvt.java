package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class zvt {
    public static final long a = ia6.h(0, 0, 0, 0);
    public static final xkn b = new xkn(lmq.c);

    public static final rce a(Object obj, jd6 jd6Var, hq5 hq5Var) {
        bnq bnqVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1677680258);
        boolean z = obj instanceof rce;
        if (z) {
            rce rceVar = (rce) obj;
            if (rceVar.E.a != null) {
                oq5Var.p(false);
                return rceVar;
            }
        }
        oq5Var.a0(-679565543);
        boolean d = Intrinsics.d(jd6Var, hd6.f);
        kjn kjnVar = gq5.a;
        if (d) {
            bnqVar = b;
        } else {
            oq5Var.a0(-679565452);
            Object K = oq5Var.K();
            if (K == kjnVar) {
                K = new ka6();
                oq5Var.k0(K);
            }
            bnqVar = (ka6) K;
            oq5Var.p(false);
        }
        oq5Var.p(false);
        if (z) {
            oq5Var.a0(-679565365);
            oq5Var.a0(-679565358);
            boolean f = oq5Var.f(obj) | oq5Var.f(bnqVar);
            Object K2 = oq5Var.K();
            if (f || K2 == kjnVar) {
                pce a2 = rce.a((rce) obj);
                a2.x = bnqVar;
                a2.d();
                K2 = a2.a();
                oq5Var.k0(K2);
            }
            rce rceVar2 = (rce) K2;
            f1d.u(oq5Var, false, false, false);
            return rceVar2;
        }
        oq5Var.a0(-679565199);
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        oq5Var.a0(-679565153);
        boolean f2 = oq5Var.f(context) | oq5Var.f(obj) | oq5Var.f(bnqVar);
        Object K3 = oq5Var.K();
        if (f2 || K3 == kjnVar) {
            pce pceVar = new pce(context);
            pceVar.c = obj;
            pceVar.x = bnqVar;
            pceVar.d();
            K3 = pceVar.a();
            oq5Var.k0(K3);
        }
        rce rceVar3 = (rce) K3;
        f1d.u(oq5Var, false, false, false);
        return rceVar3;
    }
}
