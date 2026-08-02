package yads;

import defpackage.kd71;
import defpackage.kn1;
import defpackage.lr71;
import defpackage.wls;
import defpackage.z371;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class gh extends SuspendLambda implements wls {
    public final /* synthetic */ kd71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(kd71 kd71Var, Continuation continuation) {
        super(2, continuation);
        this.b = kd71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new gh(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        gh ghVar = new gh(this.b, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        ghVar.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        try {
            long b = this.b.e.a.b("ExitInfoAnrLastReportedTimestamp");
            kd71 kd71Var = this.b;
            z371 z371Var = kd71Var.c;
            kn1 kn1Var = kd71Var.a;
            List a = z371Var.a(kn1Var.b, kn1Var.c, b);
            boolean isEmpty = a.isEmpty();
            kd71 kd71Var2 = this.b;
            zy11 zy11Var = zy11.a;
            if (isEmpty) {
                kd71Var2.h.set(false);
                return zy11Var;
            }
            lr71 lr71Var = kd71Var2.g;
            ArrayList b2 = lr71.b(a);
            boolean isEmpty2 = b2.isEmpty();
            kd71 kd71Var3 = this.b;
            if (isEmpty2) {
                kd71Var3.h.set(false);
                return zy11Var;
            }
            ArrayList a2 = kd71Var3.g.a(b2);
            boolean isEmpty3 = a2.isEmpty();
            kd71 kd71Var4 = this.b;
            if (isEmpty3) {
                kd71Var4.h.set(false);
                return zy11Var;
            }
            kd71Var4.d.a(a2);
            kd71.a(this.b, a2);
            return zy11Var;
        } finally {
            this.b.h.set(false);
        }
    }
}
