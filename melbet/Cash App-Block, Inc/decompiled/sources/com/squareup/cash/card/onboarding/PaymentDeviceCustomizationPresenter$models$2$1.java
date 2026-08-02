package com.squareup.cash.card.onboarding;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.StampsConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PaymentDeviceCustomizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentDeviceCustomizationPresenter$models$2$1(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = paymentDeviceCustomizationPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PaymentDeviceCustomizationPresenter$models$2$1(paymentDeviceCustomizationPresenter, continuation, 0);
            default:
                return new PaymentDeviceCustomizationPresenter$models$2$1(paymentDeviceCustomizationPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentDeviceCustomizationPresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (((com.squareup.cash.data.db.RealAppConfigManager) r0).update(true, r9) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r10 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        int i = this.$r8$classId;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext(paymentDeviceCustomizationPresenter.ioDispatcher, new PaymentDeviceCustomizationPresenter$models$3$1$1(paymentDeviceCustomizationPresenter, continuation, i2), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                AppConfigManager appConfigManager = paymentDeviceCustomizationPresenter.appConfig;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter stampConfig = ((RealAppConfigManager) appConfigManager).stampConfig();
                    this.label = 1;
                    obj = FlowKt.first(stampConfig, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(((RealAppConfigManager) appConfigManager).stampConfig(), paymentDeviceCustomizationPresenter, 12);
                        this.label = 3;
                        first = FlowKt.first(realTransferManager$addCash$$inlined$map$1, this);
                        if (first != coroutineSingletons) {
                            return first;
                        }
                        return coroutineSingletons;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((StampsConfig) obj).stamps == null) {
                    this.label = 2;
                    break;
                }
                RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$12 = new RealTransferManager$addCash$$inlined$map$1(((RealAppConfigManager) appConfigManager).stampConfig(), paymentDeviceCustomizationPresenter, 12);
                this.label = 3;
                first = FlowKt.first(realTransferManager$addCash$$inlined$map$12, this);
                if (first != coroutineSingletons) {
                }
                return coroutineSingletons;
        }
    }
}
