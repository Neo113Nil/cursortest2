package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class luk {
    public static final agr a = new agr(xuj.C);

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(nwf nwfVar, v3 v3Var, cg6 cg6Var) {
        juk jukVar;
        int i;
        if (cg6Var instanceof juk) {
            jukVar = (juk) cg6Var;
            int i2 = jukVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jukVar.k = i2 - Integer.MIN_VALUE;
                Object obj = jukVar.j;
                nm6 nm6Var = nm6.a;
                i = jukVar.k;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                qgg.h0(obj);
                if (!nwfVar.a.n) {
                    xq0.x("establishTextInputSession called from an unattached node");
                    return;
                }
                uzj G = bcx.G(nwfVar);
                a aVar = (a) bcx.F(nwfVar).B;
                aVar.getClass();
                if (weo.L(aVar, a) != null) {
                    l1j.f();
                    return;
                } else {
                    jukVar.k = 1;
                    b(G, v3Var, jukVar);
                    return;
                }
            }
        }
        jukVar = new juk(cg6Var);
        Object obj2 = jukVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jukVar.k;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(uzj uzjVar, Function2 function2, cg6 cg6Var) {
        kuk kukVar;
        int i;
        if (cg6Var instanceof kuk) {
            kukVar = (kuk) cg6Var;
            int i2 = kukVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kukVar.k = i2 - Integer.MIN_VALUE;
                Object obj = kukVar.j;
                nm6 nm6Var = nm6.a;
                i = kukVar.k;
                if (i != 0) {
                    qgg.h0(obj);
                    kukVar.k = 1;
                    ((AndroidComposeView) uzjVar).L(function2, kukVar);
                    return;
                } else {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    if (i == 2) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
            }
        }
        kukVar = new kuk(cg6Var);
        Object obj2 = kukVar.j;
        nm6 nm6Var2 = nm6.a;
        i = kukVar.k;
        if (i != 0) {
        }
    }
}
