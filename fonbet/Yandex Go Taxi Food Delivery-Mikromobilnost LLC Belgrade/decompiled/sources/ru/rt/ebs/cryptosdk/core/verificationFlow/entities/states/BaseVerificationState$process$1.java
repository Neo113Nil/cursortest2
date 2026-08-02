package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.mvg;
import defpackage.mw2;
import defpackage.ny61;
import defpackage.vob1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.BaseVerificationState$process$1", f = "BaseVerificationState.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseVerificationState$process$1 extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerificationState$process$1(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = aVar;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseVerificationState$process$1(this.b, this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new BaseVerificationState$process$1(this.b, this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar = this.b;
                Object obj2 = this.c;
                this.a = 1;
                if (aVar.h(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            EbsLogger.INSTANCE.info("State[" + this.b.f() + "]> >>> finish");
            this.b.d(this.c);
            this.b.b = null;
        } catch (Exception e) {
            EbsLogger.INSTANCE.info("State[" + this.b.f() + "]> >>> error");
            boolean b = vob1.b(e);
            a aVar2 = this.b;
            if (b) {
                aVar2.b = new mw2(23, aVar2, this.c);
                aVar2.g(e);
            } else {
                aVar2.b = null;
                aVar2.c(e);
            }
        }
        return zy11.a;
    }
}
