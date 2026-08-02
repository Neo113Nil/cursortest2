package yads;

import defpackage.nl61;
import defpackage.nw71;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class mn extends SuspendLambda implements zls {
    public int b;
    public /* synthetic */ nl61 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ nw71 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(nw71 nw71Var, Continuation continuation) {
        super(3, continuation);
        this.e = nw71Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mn mnVar = new mn(this.e, (Continuation) obj3);
        mnVar.c = (nl61) obj;
        mnVar.d = obj2;
        return mnVar.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            nl61 nl61Var = this.c;
            Object obj2 = this.d;
            nw71 nw71Var = this.e;
            this.c = null;
            this.b = 1;
            if (nw71Var.a(nl61Var, obj2, this) == coroutineSingletons) {
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
