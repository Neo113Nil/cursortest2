package yads;

import defpackage.j5b;
import defpackage.ny61;
import defpackage.q251;
import defpackage.vb71;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes2.dex */
public final class e21 extends SuspendLambda implements wls {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vb71 d;
    public final /* synthetic */ Set e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(vb71 vb71Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.d = vb71Var;
        this.e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e21 e21Var = new e21(this.d, this.e, continuation);
        e21Var.c = obj;
        return e21Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((e21) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            y6f0 y6f0Var = (y6f0) this.c;
            this.d.a(this.e, new j5b(y6f0Var));
            this.b = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, new q251(10), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
