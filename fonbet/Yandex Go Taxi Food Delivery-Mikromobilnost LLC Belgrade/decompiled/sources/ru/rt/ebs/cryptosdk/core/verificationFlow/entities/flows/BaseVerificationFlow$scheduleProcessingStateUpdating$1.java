package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.GlobalProcessingState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "ru.rt.ebs.cryptosdk.core.verificationFlow.entities.flows.BaseVerificationFlow$scheduleProcessingStateUpdating$1", f = "BaseVerificationFlow.kt", l = {82, 83, HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseVerificationFlow$scheduleProcessingStateUpdating$1 extends SuspendLambda implements wls {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ GlobalProcessingState c;
    public final /* synthetic */ tls d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVerificationFlow$scheduleProcessingStateUpdating$1(a aVar, GlobalProcessingState globalProcessingState, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.b = aVar;
        this.c = globalProcessingState;
        this.d = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseVerificationFlow$scheduleProcessingStateUpdating$1(this.b, this.c, this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseVerificationFlow$scheduleProcessingStateUpdating$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r2 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (kotlinx.coroutines.a.i(4000, r7) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            this.a = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    tls tlsVar = this.d;
                    this.a = 3;
                    return tlsVar.invoke(this) == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (i == 3) {
                    b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        r0 r0Var = this.b.d;
        GlobalProcessingState globalProcessingState = this.c;
        this.a = 2;
        r0Var.emit(globalProcessingState, this);
    }
}
