package com.squareup.cash.family.familyhub.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentRequest;
import com.squareup.protos.cash.aegis.api.GetAllowlistLimitForDependentResponse;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerRequest;
import com.squareup.protos.cash.blockly.api.GetAllowlistForCustomerResponse;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersRequest;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ManagedAccountControlPresenter$onInitialize$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ManagedAccountControlPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ManagedAccountControlPresenter$onInitialize$2(ManagedAccountControlPresenter managedAccountControlPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = managedAccountControlPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ManagedAccountControlPresenter managedAccountControlPresenter = this.this$0;
        switch (i) {
            case 0:
                return new ManagedAccountControlPresenter$onInitialize$2(managedAccountControlPresenter, continuation, 0);
            case 1:
                return new ManagedAccountControlPresenter$onInitialize$2(managedAccountControlPresenter, continuation, 1);
            default:
                return new ManagedAccountControlPresenter$onInitialize$2(managedAccountControlPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ManagedAccountControlPresenter$onInitialize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ManagedAccountControlPresenter managedAccountControlPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlocklyService blocklyService = managedAccountControlPresenter.blocklyService;
                    GetBlockedCustomersRequest getBlockedCustomersRequest = new GetBlockedCustomersRequest(((DependentControlScreen.ManagedAccount) managedAccountControlPresenter.args).dependentCustomerToken, BlockingContext.FAMILY_BLOCKLIST);
                    this.label = 1;
                    obj = blocklyService.getBlockedCustomers(getBlockedCustomersRequest, this);
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
                if (apiResult instanceof ApiResult.Success) {
                    managedAccountControlPresenter.blockListResponse$delegate.setValue((GetBlockedCustomersResponse) ((ApiResult.Success) apiResult).response);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlocklyService blocklyService2 = managedAccountControlPresenter.blocklyService;
                    GetAllowlistForCustomerRequest getAllowlistForCustomerRequest = new GetAllowlistForCustomerRequest(((DependentControlScreen.ManagedAccount) managedAccountControlPresenter.args).dependentCustomerToken);
                    this.label = 1;
                    obj = blocklyService2.getAllowlistForCustomer(getAllowlistForCustomerRequest, this);
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
                if (apiResult2 instanceof ApiResult.Success) {
                    managedAccountControlPresenter.allowListResponse$delegate.setValue((GetAllowlistForCustomerResponse) ((ApiResult.Success) apiResult2).response);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AegisService aegisService = managedAccountControlPresenter.aegis;
                    GetAllowlistLimitForDependentRequest getAllowlistLimitForDependentRequest = new GetAllowlistLimitForDependentRequest(((DependentControlScreen.ManagedAccount) managedAccountControlPresenter.args).dependentCustomerToken);
                    this.label = 1;
                    obj = aegisService.getAllowlistLimitForDependent(getAllowlistLimitForDependentRequest, this);
                    if (obj == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult3 = (ApiResult) obj;
                if (apiResult3 instanceof ApiResult.Success) {
                    managedAccountControlPresenter.allowListLimitResponse$delegate.setValue((GetAllowlistLimitForDependentResponse) ((ApiResult.Success) apiResult3).response);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
