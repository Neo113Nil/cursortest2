package com.squareup.cash.clientrouting.routers.profile;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CustomerProfileRouter$route$recipient$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $cashtag;
    public final /* synthetic */ String $currency;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CustomerProfileRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerProfileRouter$route$recipient$1(CustomerProfileRouter customerProfileRouter, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = customerProfileRouter;
        this.$currency = str;
        this.$cashtag = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CustomerProfileRouter$route$recipient$1(this.this$0, this.$currency, this.$cashtag, continuation, 0);
            default:
                return new CustomerProfileRouter$route$recipient$1(this.this$0, this.$currency, this.$cashtag, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CustomerProfileRouter$route$recipient$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$cashtag;
        String str2 = this.$currency;
        CustomerProfileRouter customerProfileRouter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealRecipientFinder realRecipientFinder = customerProfileRouter.recipientFinder;
                this.label = 1;
                Object findByCashtag = realRecipientFinder.findByCashtag(str2, str, this);
                return findByCashtag == coroutineSingletons ? coroutineSingletons : findByCashtag;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealRecipientFinder realRecipientFinder2 = customerProfileRouter.recipientFinder;
                this.label = 1;
                Object findByCashtag2 = realRecipientFinder2.findByCashtag(str2, str, this);
                return findByCashtag2 == coroutineSingletons2 ? coroutineSingletons2 : findByCashtag2;
        }
    }
}
