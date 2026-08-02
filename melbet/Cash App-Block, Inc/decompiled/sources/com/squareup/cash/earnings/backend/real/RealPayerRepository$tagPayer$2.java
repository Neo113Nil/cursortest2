package com.squareup.cash.earnings.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.PayerOperation;
import com.squareup.protos.cash.paychecks.api.v1.PayerUpdate;
import com.squareup.protos.cash.paychecks.api.v1.RecordPayerTaggingPromptDismissalRequest;
import com.squareup.protos.cash.paychecks.api.v1.UpdatePayersForCustomerRequest;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPayerRepository$tagPayer$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $payerToken;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealPayerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPayerRepository$tagPayer$2(RealPayerRepository realPayerRepository, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realPayerRepository;
        this.$payerToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$payerToken;
        RealPayerRepository realPayerRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealPayerRepository$tagPayer$2(realPayerRepository, str, continuation, 0);
            default:
                return new RealPayerRepository$tagPayer$2(realPayerRepository, str, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealPayerRepository$tagPayer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$payerToken;
        RealPayerRepository realPayerRepository = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaychecksAppService paychecksAppService = realPayerRepository.appService;
                    PayerOperation payerOperation = PayerOperation.PAYER_OPERATION_ADD;
                    ByteString byteString = ByteString.EMPTY;
                    UpdatePayersForCustomerRequest updatePayersForCustomerRequest = new UpdatePayersForCustomerRequest(CollectionsKt__CollectionsJVMKt.listOf(new PayerUpdate(str, payerOperation, byteString)), byteString);
                    this.label = 1;
                    obj = paychecksAppService.updatePayersForCustomer(updatePayersForCustomerRequest, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaychecksAppService paychecksAppService2 = realPayerRepository.appService;
                    RecordPayerTaggingPromptDismissalRequest recordPayerTaggingPromptDismissalRequest = new RecordPayerTaggingPromptDismissalRequest(CollectionsKt__CollectionsJVMKt.listOf(str), ByteString.EMPTY);
                    this.label = 1;
                    obj = paychecksAppService2.recordPayerTaggingPromptDismissal(recordPayerTaggingPromptDismissalRequest, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                if (!(apiResult2 instanceof ApiResult.Success)) {
                    if (!(apiResult2 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return null;
    }
}
