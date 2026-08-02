package defpackage;

import com.google.android.gms.tasks.zzw;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public class wut {
    public static Object a(rma0 rma0Var, IsReadyToPayRequest isReadyToPayRequest, SuspendLambda suspendLambda) {
        j18 j18Var = new j18(1, dvw.b(suspendLambda));
        j18Var.u();
        rma0Var.getClass();
        ysx0 a = zsx0.a();
        a.d = 23705;
        a.a = new va90(isReadyToPayRequest);
        zzw d = rma0Var.d(0, a.a());
        d.b(new vut(j18Var));
        d.d(new gp50(19, j18Var));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }
}
