package yads;

import defpackage.eq81;
import defpackage.fh71;
import defpackage.ny61;
import defpackage.rj81;
import defpackage.u981;
import defpackage.w511;
import defpackage.wls;
import defpackage.wm81;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class or2 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ u981 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(u981 u981Var, Continuation continuation) {
        super(2, continuation);
        this.c = u981Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new or2(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new or2(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            b.b(obj);
            fh71 fh71Var = this.c.f;
            s41 s41Var = s41.f;
            this.b = 1;
            obj = fh71Var.c(s41Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        eq81 eq81Var = (eq81) obj;
        if (eq81Var instanceof wm81) {
            return null;
        }
        if (eq81Var instanceof rj81) {
            return sr2.c;
        }
        w511.b();
        return null;
    }
}
