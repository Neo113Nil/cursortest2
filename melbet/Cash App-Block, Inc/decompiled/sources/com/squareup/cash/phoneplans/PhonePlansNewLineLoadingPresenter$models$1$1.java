package com.squareup.cash.phoneplans;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusRequest;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.GetNewLineActivationStatusResponse;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PhonePlansNewLineLoadingPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PhonePlansNewLineLoadingPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PhonePlansNewLineLoadingPresenter$models$1$1(PhonePlansNewLineLoadingPresenter phonePlansNewLineLoadingPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = phonePlansNewLineLoadingPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PhonePlansNewLineLoadingPresenter phonePlansNewLineLoadingPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PhonePlansNewLineLoadingPresenter$models$1$1(phonePlansNewLineLoadingPresenter, continuation, 0);
            default:
                return new PhonePlansNewLineLoadingPresenter$models$1$1(phonePlansNewLineLoadingPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PhonePlansNewLineLoadingPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (r1 == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r9, r19) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004e, code lost:
    
        if (r1 == r0) goto L52;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cf -> B:42:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object newLineActivationStatus;
        long j;
        Integer num;
        int i = this.$r8$classId;
        PhonePlansNewLineLoadingPresenter phonePlansNewLineLoadingPresenter = this.this$0;
        switch (i) {
            case 0:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    PhonePlansNewLineLoadingBlockerScreen phonePlansNewLineLoadingBlockerScreen = phonePlansNewLineLoadingPresenter.args;
                    BlockerAction blockerAction = phonePlansNewLineLoadingBlockerScreen.retreatAction;
                    if (blockerAction == null) {
                        blockerAction = phonePlansNewLineLoadingBlockerScreen.dismissAction;
                    }
                    BlockerAction blockerAction2 = blockerAction;
                    if (blockerAction2 != null) {
                        obj2 = BlockersHelper.handleBlockerAction$default(phonePlansNewLineLoadingPresenter.blockersHelper, blockerAction2, phonePlansNewLineLoadingBlockerScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (obj2 != obj3) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        phonePlansNewLineLoadingPresenter.navigator.goTo(phonePlansNewLineLoadingBlockerScreen.blockersData.exitScreen);
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        newLineActivationStatus = obj;
                        ApiResult apiResult = (ApiResult) newLineActivationStatus;
                        ApiResult.Success success = apiResult instanceof ApiResult.Success ? (ApiResult.Success) apiResult : null;
                        GetNewLineActivationStatusResponse getNewLineActivationStatusResponse = success != null ? (GetNewLineActivationStatusResponse) success.response : null;
                        GetNewLineActivationStatusResponse.ActivationStatus activationStatus = getNewLineActivationStatusResponse != null ? getNewLineActivationStatusResponse.status : null;
                        int i4 = activationStatus == null ? -1 : PhonePlansNewLineLoadingPresenter$models$2$1$WhenMappings.$EnumSwitchMapping$0[activationStatus.ordinal()];
                        if (i4 == -1 || i4 == 1 || i4 == 2) {
                            if (getNewLineActivationStatusResponse == null || (num = getNewLineActivationStatusResponse.poll_interval_seconds) == null) {
                                j = PhonePlansNewLineLoadingPresenter.POLL_INTERVAL_DEFAULT;
                            } else {
                                Duration.Companion companion = Duration.Companion;
                                j = DurationKt.toDuration(num.intValue(), DurationUnit.SECONDS);
                            }
                            this.label = 2;
                            break;
                        } else {
                            if (i4 != 3 && i4 != 4) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            this.label = 3;
                            RealBlockersHelper realBlockersHelper = phonePlansNewLineLoadingPresenter.blockersHelper;
                            PhonePlansNewLineLoadingBlockerScreen phonePlansNewLineLoadingBlockerScreen2 = phonePlansNewLineLoadingPresenter.args;
                            String obj4 = activationStatus.toString();
                            BlockersData blockersData = phonePlansNewLineLoadingBlockerScreen2.blockersData;
                            ClientScenario clientScenario = blockersData.clientScenario;
                            clientScenario.getClass();
                            Object collect = realBlockersHelper.selectOption(phonePlansNewLineLoadingBlockerScreen2, obj4, blockersData, clientScenario).collect(new HomeViewPresenter$models$4$1$2(phonePlansNewLineLoadingPresenter, 29), this);
                            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                collect = Unit.INSTANCE;
                                break;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i3 != 2) {
                        if (i3 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                CashSubscriptionsAppService cashSubscriptionsAppService = phonePlansNewLineLoadingPresenter.subscriptionsAppService;
                GetNewLineActivationStatusRequest getNewLineActivationStatusRequest = new GetNewLineActivationStatusRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                this.label = 1;
                newLineActivationStatus = cashSubscriptionsAppService.getNewLineActivationStatus(getNewLineActivationStatusRequest, this);
                break;
        }
    }
}
