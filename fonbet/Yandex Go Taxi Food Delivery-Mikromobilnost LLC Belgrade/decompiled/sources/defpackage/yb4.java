package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.a;

/* loaded from: classes9.dex */
public final class yb4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(yb4.class, "notCompletedCount$volatile");
    public final noh[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public yb4(noh[] nohVarArr) {
        this.a = nohVarArr;
        this.notCompletedCount$volatile = nohVarArr.length;
    }

    public final Object a(Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        noh[] nohVarArr = this.a;
        int length = nohVarArr.length;
        vb4[] vb4VarArr = new vb4[length];
        for (int i = 0; i < length; i++) {
            noh nohVar = nohVarArr[i];
            nohVar.start();
            vb4 vb4Var = new vb4(this, j18Var);
            vb4Var.B = a.o(nohVar, true, vb4Var);
            vb4VarArr[i] = vb4Var;
        }
        xb4 xb4Var = new xb4(vb4VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            vb4VarArr[i2].q(xb4Var);
        }
        if (j18Var.y()) {
            xb4Var.b();
        } else {
            j18Var.x(xb4Var);
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
