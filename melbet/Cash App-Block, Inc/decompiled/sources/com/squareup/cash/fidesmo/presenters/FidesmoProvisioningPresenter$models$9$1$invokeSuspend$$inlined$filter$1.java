package com.squareup.cash.fidesmo.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.views.brand.menu.LocalMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1;
import app.cash.local.views.brand.menu.LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1;
import com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1 implements Flow {
    public final /* synthetic */ MutableState $activationPhase$delegate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ MutableState $activationPhase$delegate$inlined;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, MutableState mutableState, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.$activationPhase$delegate$inlined = mutableState;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            LocalMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1 localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i2;
            LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1 localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1;
            int i3;
            CardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1 cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1;
            int i4;
            CardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1 cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1;
            int i5;
            FidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1 fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1;
            int i6;
            int i7 = this.$r8$classId;
            FidesmoDeviceState.Disconnected disconnected = FidesmoDeviceState.Disconnected.INSTANCE;
            FidesmoDeviceState.Connected connected = FidesmoDeviceState.Connected.INSTANCE;
            MutableState mutableState = this.$activationPhase$delegate$inlined;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i7) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i8 = anonymousClass1.label;
                        if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i8 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                FidesmoDeviceState fidesmoDeviceState = (FidesmoDeviceState) obj;
                                if ((Intrinsics.areEqual(fidesmoDeviceState, connected) || Intrinsics.areEqual(fidesmoDeviceState, disconnected)) && Intrinsics.areEqual((FidesmoProvisioningPresenter.ActivationPhase) mutableState.getValue(), FidesmoProvisioningPresenter.ActivationPhase.Activating.INSTANCE)) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutineSingletons) {
                                        break;
                                    }
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    break;
                case 1:
                    if (continuation instanceof LocalMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1 = (LocalMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i9 = localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                            localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                            Object obj3 = localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                    localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1 = new LocalMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj32 = localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = localMenuComboDetailsViewKt$LocalMenuComboDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1) {
                        localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1 = (LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i10 = localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                            localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label = i10 - PKIFailureInfo.systemUnavail;
                            Object obj4 = localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                    localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons4) {
                                        break;
                                    }
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1 = new LocalMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj42 = localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = localMenuItemDetailsViewKt$LocalMenuItemDetailsView$1$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof CardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1) {
                        cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1 = (CardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                        int i11 = cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                        if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.label = i11 - PKIFailureInfo.systemUnavail;
                            Object obj5 = cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj5);
                                ((Number) obj).intValue();
                                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                    cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons5) {
                                        break;
                                    }
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj5);
                            }
                            break;
                        }
                    }
                    cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    Object obj52 = cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = cardStylePickerViewKt$CardStylePicker$1$1$1$4$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof CardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1) {
                        cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1 = (CardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1) continuation;
                        int i12 = cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                        if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                            cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.label = i12 - PKIFailureInfo.systemUnavail;
                            Object obj6 = cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                ((Number) obj).intValue();
                                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                                    cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1) == coroutineSingletons6) {
                                        break;
                                    }
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1(this, continuation);
                    Object obj62 = cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.result;
                    CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = cardStylePickerViewKt$CardStylePicker$1$1$1$5$1$invokeSuspend$$inlined$filterNot$1$2$1.label;
                    if (i5 != 0) {
                    }
                default:
                    if (continuation instanceof FidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1) {
                        fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1 = (FidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i13 = fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                            fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.label = i13 - PKIFailureInfo.systemUnavail;
                            Object obj7 = fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj7);
                                FidesmoDeviceState fidesmoDeviceState2 = (FidesmoDeviceState) obj;
                                if ((Intrinsics.areEqual(fidesmoDeviceState2, connected) || Intrinsics.areEqual(fidesmoDeviceState2, disconnected)) && Intrinsics.areEqual((FidesmoDeprovisioningPresenter.DeprovisionPhase) mutableState.getValue(), FidesmoDeprovisioningPresenter.DeprovisionPhase.AwaitingTag.INSTANCE)) {
                                    fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons7) {
                                        break;
                                    }
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj7);
                            }
                            break;
                        }
                    }
                    fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1 = new FidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    Object obj72 = fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = fidesmoDeprovisioningPresenter$models$10$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i6 != 0) {
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1(Flow flow, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$activationPhase$delegate$inlined = mutableState;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$activationPhase$delegate$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, mutableState, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new AnonymousClass2(flowCollector, mutableState, 5), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
