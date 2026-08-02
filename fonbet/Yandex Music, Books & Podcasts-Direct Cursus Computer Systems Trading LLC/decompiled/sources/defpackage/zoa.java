package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class zoa {
    public static final kr3 a;
    public static final kr3 b;

    static {
        int i = 3;
        Continuation continuation = null;
        a = new kr3(i, 1, continuation);
        b = new kr3(i, 2, continuation);
    }

    public static yci a(yci yciVar, cpa cpaVar, bxj bxjVar, boolean z, uoi uoiVar, boolean z2, pyc pycVar, pyc pycVar2, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            uoiVar = null;
        }
        return yciVar.f(new DraggableElement(cpaVar, bxjVar, z4, uoiVar, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? a : pycVar, pycVar2, (i & 128) != 0 ? false : z3));
    }

    public static final cpa b(Function1 function1, hq5 hq5Var) {
        aqi o0 = szf.o0(function1, hq5Var);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (K == gq5.a) {
            nl7 nl7Var = new nl7(new kf0(o0, 4));
            oq5Var.k0(nl7Var);
            K = nl7Var;
        }
        return (cpa) K;
    }
}
