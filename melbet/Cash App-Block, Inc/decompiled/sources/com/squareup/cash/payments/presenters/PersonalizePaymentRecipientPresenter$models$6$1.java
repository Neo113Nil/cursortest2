package com.squareup.cash.payments.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentRecipientPresenter$models$6$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $dialogModel$delegate;
    public final /* synthetic */ MutableState $personalizationLoadingState$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PersonalizePaymentRecipientPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersonalizePaymentRecipientPresenter$models$6$1(PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = personalizePaymentRecipientPresenter;
        this.$personalizationLoadingState$delegate = mutableState;
        this.$dialogModel$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PersonalizePaymentRecipientPresenter$models$6$1(this.this$0, this.$personalizationLoadingState$delegate, this.$dialogModel$delegate, continuation, 0);
            default:
                return new PersonalizePaymentRecipientPresenter$models$6$1(this.this$0, this.$personalizationLoadingState$delegate, this.$dialogModel$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PersonalizePaymentRecipientPresenter$models$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
    
        if (((java.lang.Boolean) r12).booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0097, code lost:
    
        if ((((com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState) r10.getValue()) instanceof com.squareup.cash.payments.viewmodels.PersonalizedPaymentLoadingState.Error) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r11.$dialogModel$delegate.setValue(new com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog(r5.get(com.squareup.cash.R.string.retry_personalization_title), r5.get(com.squareup.cash.R.string.retry_personalization_message), r5.get(com.squareup.cash.R.string.retry_personalization_refresh_positive_button), r5.get(com.squareup.cash.R.string.retry_personalization_refresh_negative_button)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r12 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r12 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (r4.markViewed(r12, r11) == r6) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter = this.this$0;
                    CoroutineContext coroutineContext = personalizePaymentRecipientPresenter.ioDispatcher;
                    PersonalizePaymentRecipientPresenter$models$6$1 personalizePaymentRecipientPresenter$models$6$1 = new PersonalizePaymentRecipientPresenter$models$6$1(personalizePaymentRecipientPresenter, this.$personalizationLoadingState$delegate, this.$dialogModel$delegate, null, 1);
                    this.label = 1;
                    if (JobKt.withContext(coroutineContext, personalizePaymentRecipientPresenter$models$6$1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                PersonalizePaymentRecipientPresenter personalizePaymentRecipientPresenter2 = this.this$0;
                RealPersonalizePaymentManager realPersonalizePaymentManager = personalizePaymentRecipientPresenter2.personalizePaymentManager;
                AndroidStringManager androidStringManager = personalizePaymentRecipientPresenter2.stringManager;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                MutableState mutableState = this.$personalizationLoadingState$delegate;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((PersonalizedPaymentLoadingState) mutableState.getValue()) instanceof PersonalizedPaymentLoadingState.Loaded) {
                        PersonalizedPaymentLoadingState personalizedPaymentLoadingState = (PersonalizedPaymentLoadingState) mutableState.getValue();
                        personalizedPaymentLoadingState.getClass();
                        if (!((PersonalizedPaymentLoadingState.Loaded) personalizedPaymentLoadingState).isCurrentCustomerSender) {
                            String str = personalizePaymentRecipientPresenter2.args.entity.entity_token;
                            if (str == null) {
                                str = "";
                            }
                            this.label = 1;
                            break;
                        }
                    }
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    if (((List) obj).isEmpty()) {
                        this.label = 3;
                        obj = realPersonalizePaymentManager.personalizationRepository.refreshPersonalizationResources(this);
                        break;
                    }
                    break;
                } else if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(realPersonalizePaymentManager.personalizationRepository.loadBackgrounds(true), 2);
                this.label = 2;
                obj = FlowKt.first(cashQrScannerPresenter$special$$inlined$filter$1, this);
                break;
        }
        return Unit.INSTANCE;
    }
}
