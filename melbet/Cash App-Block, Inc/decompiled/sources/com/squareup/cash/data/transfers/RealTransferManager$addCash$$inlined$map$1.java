package com.squareup.cash.data.transfers;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.presenters.InputCardInfoPresenter;
import com.squareup.cash.blockers.presenters.PasscodeGenericGatedEndpointTypeTransformer;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.blockers.views.PasscodeViewKt$Passcode$3$1$1$1$2;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostProvider$getAllBoosts$$inlined$map$1$2;
import com.squareup.cash.boost.backend.RealBoostRepository$getBoostsForTokens$$inlined$map$1$2;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$lighting$$inlined$map$2;
import com.squareup.cash.card.onboarding.CardPreviewPresenter;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$stamps$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationPresenter;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.clientsync.RealRawSyncValueService;
import com.squareup.cash.clientsync.readers.RealSyncValueReaderV2;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.crypto.backend.eligibility.BitcoinEligibility;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.data.profile.RealCustomerLimitsManager;
import com.squareup.cash.data.profile.RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2;
import com.squareup.cash.data.profile.RealCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.db2.profile.Effective_limits;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealTransferManager$addCash$$inlined$map$1 implements Flow {
    public final /* synthetic */ Object $amount$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    public RealTransferManager$addCash$$inlined$map$1(StateFlow stateFlow, RealProfileAliasRepository realProfileAliasRepository) {
        this.$r8$classId = 20;
        UiAlias.Type.Companion companion = UiAlias.Type.Companion;
        this.$this_unsafeTransform$inlined = stateFlow;
        this.$amount$inlined = realProfileAliasRepository;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 16;
        int i3 = 18;
        int i4 = 22;
        int i5 = 24;
        int i6 = 1;
        int i7 = 25;
        int i8 = 28;
        Object obj = this.$amount$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = ((RealBadger2$setup$lambda$0$$inlined$mapNotNull$1) flow).collect(new AnonymousClass2(flowCollector, (Money) obj), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = flow.collect(new PasscodeViewKt$Passcode$3$1$1$1$2(i2, flowCollector, (InputCardInfoPresenter) obj), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = ((AppLockMonitor$special$$inlined$map$2) flow).collect(new PasscodeViewKt$Passcode$3$1$1$1$2(i3, flowCollector, (PasscodeGenericGatedEndpointTypeTransformer) obj), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = flow.collect(new PasscodeViewKt$Passcode$3$1$1$1$2(i5, flowCollector, (VerifyContactsPresenter) obj), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = flow.collect(new PasscodeViewKt$Passcode$3$1$1$1$2(i7, flowCollector, (FileBlockerView) obj), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new RealBoostProvider$getAllBoosts$$inlined$map$1$2(flowCollector, (RealBoostProvider) obj, 0), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = ((RealTransferManager$addCash$$inlined$map$1) flow).collect(new RealBoostRepository$getBoostsForTokens$$inlined$map$1$2(flowCollector, (ArrayList) obj, 0), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = flow.collect(new PasscodeViewKt$Passcode$3$1$1$1$2(27, flowCollector, (RealBorrowDataManager) obj), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = flow.collect(new PasscodeViewKt$Passcode$3$1$1$1$2(i8, flowCollector, (GlobalAddress) obj), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = ((SafeFlow) flow).collect(new CardModelView$lighting$$inlined$map$2.AnonymousClass2(flowCollector, (CardModelView) obj, i6), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = ((FinishSetupTileBadgeCounter) flow).collect(new CardPreviewPresenter$stamps$$inlined$map$1$2(flowCollector, (CardPreviewPresenter) obj, 0), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = ((FinishSetupTileBadgeCounter) flow).collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(7, flowCollector, (CardStylePickerPresenter) obj), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object collect13 = ((FinishSetupTileBadgeCounter) flow).collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(9, flowCollector, (PaymentDeviceCustomizationPresenter) obj), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object collect14 = flow.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i2, flowCollector, (RealRawSyncValueService) obj), continuation);
                if (collect14 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object collect15 = flow.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(17, flowCollector, (RealSyncValueReaderV2) obj), continuation);
                if (collect15 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object collect16 = flow.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i3, flowCollector, (RealClipboardObserver) obj), continuation);
                if (collect16 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object collect17 = ((SafeFlow) flow).collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(19, flowCollector, (NavigationModel.Ready.Swipe) obj), continuation);
                if (collect17 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object collect18 = flow.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(20, flowCollector, (BitcoinEligibility) obj), continuation);
                if (collect18 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object collect19 = ((FinishSetupTileBadgeCounter) flow).collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, (RealAppConfigManager) obj, 11), continuation);
                if (collect19 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object collect20 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) flow).collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i4, flowCollector, (RealAppConfigManager) obj), continuation);
                if (collect20 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                UiAlias.Type.Companion companion = UiAlias.Type.Companion;
                Object collect21 = flow.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, (RealProfileAliasRepository) obj), continuation);
                if (collect21 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object collect22 = flow.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(23, flowCollector, (ClientScenario) obj), continuation);
                if (collect22 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object collect23 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, (RealProfileNotificationsRepository) obj, 21), continuation);
                if (collect23 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object collect24 = flow.collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, (RealProfileNotificationsRepository) obj, i4), continuation);
                if (collect24 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object collect25 = flow.collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i5, flowCollector, (NotificationChannelId) obj), continuation);
                if (collect25 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object collect26 = ((FinishSetupTileBadgeCounter) flow).collect(new RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2(flowCollector, (RealDocumentEntitiesMapper) obj, 0), continuation);
                if (collect26 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object collect27 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new RealDocumentEntitiesMapper$documentForToken$$inlined$map$1$2(flowCollector, (RealDocumentEntitiesMapper) obj, 1), continuation);
                if (collect27 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object collect28 = ((FlowQuery$mapToList$$inlined$map$1) flow).collect(new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i7, flowCollector, (RealDocumentsManager) obj), continuation);
                if (collect28 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object collect29 = ((FinishSetupTileBadgeCounter) flow).collect(new RealAppConfigManager$cashLiteConfig$$inlined$map$1.AnonymousClass2(flowCollector, (RealCashDepositBarcodeManager) obj, i8), continuation);
                if (collect29 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect30 = ((FlowKt__ZipKt$combine$$inlined$unsafeFlow$1) flow).collect(new RealCustomerLimitsManager$getBuyCryptocurrencyLimit$$inlined$map$1$2(flowCollector, (CurrencyCode) obj), continuation);
                if (collect30 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ Money $amount$inlined;
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(FlowCollector flowCollector, RealCustomerLimitsManager realCustomerLimitsManager, Money money) {
            this.$this_unsafeFlow = flowCollector;
            this.$amount$inlined = money;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            RealCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1 realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1;
            int i2;
            Money money;
            int i3 = this.$r8$classId;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                TransferData copy$default = TransferData.copy$default((TransferData) obj, this.$amount$inlined, null, null, null, null, null, null, null, TiffTagConstants.COMPRESSION_VALUE_NEXT);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(copy$default, anonymousClass1) == coroutineSingletons) {
                                    break;
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
                default:
                    if (continuation instanceof RealCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1) {
                        realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1 = (RealCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1) continuation;
                        int i5 = realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Effective_limits effective_limits = (Effective_limits) obj;
                                Money money2 = this.$amount$inlined;
                                if (effective_limits == null || (money = effective_limits.limit_amount) == null) {
                                    money = money2;
                                }
                                CustomerLimitsManager.TransactionLimit transactionLimit = new CustomerLimitsManager.TransactionLimit(effective_limits, Moneys.min(money, money2));
                                realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(transactionLimit, realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
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
                    realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1 = new RealCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1(this, continuation);
                    Object obj32 = realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = realCustomerLimitsManager$getSellCryptocurrencyLimit$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        public AnonymousClass2(FlowCollector flowCollector, Money money) {
            this.$this_unsafeFlow = flowCollector;
            this.$amount$inlined = money;
        }
    }

    public /* synthetic */ RealTransferManager$addCash$$inlined$map$1(Flow flow, Object obj, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$amount$inlined = obj;
    }
}
