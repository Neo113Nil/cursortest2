package androidx.compose.material3.internal;

import defpackage.aur;
import defpackage.bxj;
import defpackage.cg6;
import defpackage.e90;
import defpackage.f90;
import defpackage.gld;
import defpackage.hqi;
import defpackage.ia0;
import defpackage.l90;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.yci;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Function0 function0, Function2 function2, cg6 cg6Var) {
        f90 f90Var;
        int i;
        if (cg6Var instanceof f90) {
            f90Var = (f90) cg6Var;
            int i2 = f90Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f90Var.k = i2 - Integer.MIN_VALUE;
                Object obj = f90Var.j;
                nm6 nm6Var = nm6.a;
                i = f90Var.k;
                if (i != 0) {
                    qgg.h0(obj);
                    l90 l90Var = new l90(function0, function2, null, 0);
                    f90Var.k = 1;
                    if (gld.Q(l90Var, f90Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        f90Var = new f90(cg6Var);
        Object obj2 = f90Var.j;
        nm6 nm6Var2 = nm6.a;
        i = f90Var.k;
        if (i != 0) {
        }
        return Unit.a;
    }

    public static final Object b(ia0 ia0Var, Object obj, float f, aur aurVar) {
        Object d = ia0Var.d(obj, hqi.a, new e90(ia0Var, f, null, 0), aurVar);
        return d == nm6.a ? d : Unit.a;
    }

    public static final yci c(yci yciVar, ia0 ia0Var, Function2 function2) {
        bxj bxjVar = bxj.a;
        return yciVar.f(new DraggableAnchorsElement(ia0Var, function2));
    }
}
