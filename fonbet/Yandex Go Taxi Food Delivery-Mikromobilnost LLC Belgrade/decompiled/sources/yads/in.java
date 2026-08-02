package yads;

import defpackage.fk71;
import defpackage.j18;
import defpackage.nl61;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class in extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ fk71 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(fk71 fk71Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.c = fk71Var;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new in(this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new in(this.c, this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            fk71 fk71Var = this.c;
            mn mnVar = fk71Var.e;
            nl61 nl61Var = fk71Var.b;
            Object obj2 = this.d;
            this.b = 1;
            if (mnVar.invoke(nl61Var, obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        fk71 fk71Var2 = this.c;
        fk71Var2.d.a(fk71Var2.b, this.d);
        j18 j18Var = this.c.a;
        zy11 zy11Var = zy11.a;
        j18Var.resumeWith(zy11Var);
        return zy11Var;
    }
}
