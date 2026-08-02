package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.viewmodels.DialogViewModel;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentPresenter$models$6$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $dialogModel$delegate;
    public final /* synthetic */ int $r8$classId;
    public MutableState L$0;
    public int label;
    public final /* synthetic */ PersonalizePaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersonalizePaymentPresenter$models$6$3(PersonalizePaymentPresenter personalizePaymentPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = personalizePaymentPresenter;
        this.$dialogModel$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$dialogModel$delegate;
        PersonalizePaymentPresenter personalizePaymentPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PersonalizePaymentPresenter$models$6$3(personalizePaymentPresenter, mutableState, continuation, 0);
            default:
                return new PersonalizePaymentPresenter$models$6$3(personalizePaymentPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PersonalizePaymentPresenter$models$6$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$dialogModel$delegate;
        PersonalizePaymentPresenter personalizePaymentPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = mutableState;
                    this.label = 1;
                    obj = PersonalizePaymentPresenter.access$retryResourceRefresh(personalizePaymentPresenter, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue((DialogViewModel) obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(personalizePaymentPresenter.personalizePaymentManager.personalizationRepository.loadBackgrounds(false), 2);
                    this.label = 1;
                    obj = FlowKt.first(cashQrScannerPresenter$special$$inlined$filter$1, this);
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue((DialogViewModel) obj);
                    break;
                }
                if (((List) obj).isEmpty()) {
                    this.L$0 = mutableState;
                    this.label = 2;
                    obj = PersonalizePaymentPresenter.access$retryResourceRefresh(personalizePaymentPresenter, this);
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
