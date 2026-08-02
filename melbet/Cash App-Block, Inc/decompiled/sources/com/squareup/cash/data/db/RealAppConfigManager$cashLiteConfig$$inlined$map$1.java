package com.squareup.cash.data.db;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter$special$$inlined$map$1$2;
import com.squareup.cash.borrow.backend.BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2;
import com.squareup.cash.data.contacts.ContactModifiablePermissions;
import com.squareup.cash.data.contacts.ContactModifiablePermissions$granted$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1;
import com.squareup.cash.data.contacts.ContactsStatus;
import com.squareup.cash.data.contacts.ContactsSyncState;
import com.squareup.cash.data.contacts.RealContactRepository$contactByAlias$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactRepository$contactById$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactRepository$contacts$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactRepository$contactsWithAliasIds$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactRepository$recipients$$inlined$map$1$2$1;
import com.squareup.cash.data.contacts.RealContactRepository$shouldShowConfirm$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.RealAddressManager$legacyProfileAddress$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager$profileBased$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileManager$displayUnitFlow$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1;
import com.squareup.cash.data.profile.documents.AccountStatementsManager$AccountStatementsInfo;
import com.squareup.cash.data.profile.documents.RealAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.documents.RealAccountStatementsManager$customerToken$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager$customerToken$$inlined$map$1$2$1;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1;
import com.squareup.cash.data.transfers.RealTransferManager$transferData$$inlined$map$1$2$1;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientUtil;
import com.squareup.cash.db2.BankingConfig;
import com.squareup.cash.db2.CashLiteConfig;
import com.squareup.cash.db2.contacts.Recipients;
import com.squareup.cash.db2.contacts.WithContactAliasId;
import com.squareup.cash.db2.profile.BtcDisplayUnits;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.db2.profile.documents.CustomerStatementType;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.db2.recipients.RecentRecipient;
import com.squareup.cash.deposits.physical.backend.api.barcode.BarcodeInfo;
import com.squareup.cash.deposits.physical.backend.real.barcode.RealCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1;
import com.squareup.cash.deposits.physical.db.AddressSearch;
import com.squareup.cash.deposits.physical.db.PaperDepositBarcodeInfo;
import com.squareup.cash.deposits.physical.db.PhysicalDepositUsAddressSearch;
import com.squareup.cash.deposits.physical.db.RecentAddressSearchQueries$addresses$$inlined$map$1$2$1;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.limits.presenters.LimitsPresenter$models$lambda$2$$inlined$map$1$2;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$filter$1$2;
import com.squareup.cash.session.backend.RealUrlAuthenticator$special$$inlined$filter$1$2;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.protos.franklin.common.ClientData;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiJurisdictionConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final class RealAppConfigManager$cashLiteConfig$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinishSetupTileBadgeCounter $this_unsafeTransform$inlined;

    public /* synthetic */ RealAppConfigManager$cashLiteConfig$$inlined$map$1(FinishSetupTileBadgeCounter finishSetupTileBadgeCounter, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = finishSetupTileBadgeCounter;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = 23;
        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = finishSetupTileBadgeCounter.collect(new AnonymousClass2(flowCollector, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = finishSetupTileBadgeCounter.collect(new RealDisclosureProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, 24), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = finishSetupTileBadgeCounter.collect(new BitcoinTransferPresenter$special$$inlined$map$1$2(flowCollector, 20), continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = finishSetupTileBadgeCounter.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 9), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object collect5 = finishSetupTileBadgeCounter.collect(new BorrowDataReadUtilsKt$hasBorrowData$$inlined$map$1$2(flowCollector, 22), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object collect6 = finishSetupTileBadgeCounter.collect(new CardModelView$cardHeat$$inlined$map$1.AnonymousClass2(flowCollector, 18), continuation);
                if (collect6 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object collect7 = finishSetupTileBadgeCounter.collect(new RealCryptoValueRepo$special$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect7 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object collect8 = finishSetupTileBadgeCounter.collect(new AnonymousClass2(flowCollector, 7), continuation);
                if (collect8 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object collect9 = finishSetupTileBadgeCounter.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, 10), continuation);
                if (collect9 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object collect10 = finishSetupTileBadgeCounter.collect(new Camera$special$$inlined$map$1.AnonymousClass2(flowCollector, i2), continuation);
                if (collect10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object collect11 = finishSetupTileBadgeCounter.collect(new LimitsPresenter$models$lambda$2$$inlined$map$1$2(flowCollector, i2), continuation);
                if (collect11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object collect12 = finishSetupTileBadgeCounter.collect(new AndroidPermissionChecker$granted$$inlined$filter$1$2(flowCollector, 17), continuation);
                if (collect12 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect13 = finishSetupTileBadgeCounter.collect(new RealUrlAuthenticator$special$$inlined$filter$1$2(flowCollector, 3), continuation);
                if (collect13 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(FlowCollector flowCollector, RealProfileAliasRepository realProfileAliasRepository) {
            this.$r8$classId = 17;
            UiAlias.Type.Companion companion = UiAlias.Type.Companion;
            this.$this_unsafeFlow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0264  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x026e  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:198:0x030a  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0349  */
        /* JADX WARN: Removed duplicated region for block: B:216:0x0353  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x0392  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x039c  */
        /* JADX WARN: Removed duplicated region for block: B:251:0x03d6  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x03e0  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x0455  */
        /* JADX WARN: Removed duplicated region for block: B:291:0x045f  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x04a8  */
        /* JADX WARN: Removed duplicated region for block: B:319:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x04fb  */
        /* JADX WARN: Removed duplicated region for block: B:347:0x0505  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:359:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:365:0x0547  */
        /* JADX WARN: Removed duplicated region for block: B:380:0x057d  */
        /* JADX WARN: Removed duplicated region for block: B:386:0x0587  */
        /* JADX WARN: Removed duplicated region for block: B:398:0x05bd  */
        /* JADX WARN: Removed duplicated region for block: B:404:0x05c7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:416:0x0613  */
        /* JADX WARN: Removed duplicated region for block: B:422:0x061d  */
        /* JADX WARN: Removed duplicated region for block: B:434:0x0657  */
        /* JADX WARN: Removed duplicated region for block: B:440:0x0663  */
        /* JADX WARN: Removed duplicated region for block: B:472:0x0755  */
        /* JADX WARN: Removed duplicated region for block: B:479:0x0760  */
        /* JADX WARN: Removed duplicated region for block: B:496:0x07c4  */
        /* JADX WARN: Removed duplicated region for block: B:503:0x07cf  */
        /* JADX WARN: Removed duplicated region for block: B:520:0x080e  */
        /* JADX WARN: Removed duplicated region for block: B:527:0x0819  */
        /* JADX WARN: Removed duplicated region for block: B:544:0x086f  */
        /* JADX WARN: Removed duplicated region for block: B:551:0x087a  */
        /* JADX WARN: Removed duplicated region for block: B:568:0x08d4  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:575:0x08df  */
        /* JADX WARN: Removed duplicated region for block: B:592:0x093a  */
        /* JADX WARN: Removed duplicated region for block: B:598:0x0944  */
        /* JADX WARN: Removed duplicated region for block: B:610:0x0977  */
        /* JADX WARN: Removed duplicated region for block: B:616:0x0981  */
        /* JADX WARN: Removed duplicated region for block: B:628:0x09b7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:634:0x09c1  */
        /* JADX WARN: Removed duplicated region for block: B:650:0x0a08  */
        /* JADX WARN: Removed duplicated region for block: B:656:0x0a12  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            ContactModifiablePermissions$granted$$inlined$map$1$2$1 contactModifiablePermissions$granted$$inlined$map$1$2$1;
            int i2;
            ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1 contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1;
            int i3;
            ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1 contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1;
            int i4;
            RealContactRepository$contactByAlias$$inlined$map$1$2$1 realContactRepository$contactByAlias$$inlined$map$1$2$1;
            int i5;
            RealContactRepository$contactById$$inlined$map$1$2$1 realContactRepository$contactById$$inlined$map$1$2$1;
            int i6;
            RealContactRepository$contacts$$inlined$map$1$2$1 realContactRepository$contacts$$inlined$map$1$2$1;
            int i7;
            RealContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1 realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1;
            int i8;
            RealContactRepository$contactsWithAliasIds$$inlined$map$1$2$1 realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1;
            int i9;
            RealContactRepository$recipients$$inlined$map$1$2$1 realContactRepository$recipients$$inlined$map$1$2$1;
            int i10;
            RealContactRepository$shouldShowConfirm$$inlined$map$1$2$1 realContactRepository$shouldShowConfirm$$inlined$map$1$2$1;
            int i11;
            RealAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1 realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1;
            int i12;
            RealAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1 realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1;
            int i13;
            RealAddressManager$legacyProfileAddress$$inlined$map$1$2$1 realAddressManager$legacyProfileAddress$$inlined$map$1$2$1;
            int i14;
            RealDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1 realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1;
            int i15;
            RealJurisdictionConfigManager$profileBased$$inlined$map$1$2$1 realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1;
            int i16;
            List list;
            RealJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1 realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1;
            int i17;
            List list2;
            RealProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1 realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1;
            int i18;
            RealProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1 realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1;
            int i19;
            Object obj2;
            RealProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1 realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1;
            int i20;
            RealProfileManager$displayUnitFlow$$inlined$map$1$2$1 realProfileManager$displayUnitFlow$$inlined$map$1$2$1;
            int i21;
            RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1 realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1;
            int i22;
            RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1 realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1;
            int i23;
            RealAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1 realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1;
            int i24;
            RealAccountStatementsManager$customerToken$$inlined$map$1$2$1 realAccountStatementsManager$customerToken$$inlined$map$1$2$1;
            int i25;
            RealAfterpayStatementManager$customerToken$$inlined$map$1$2$1 realAfterpayStatementManager$customerToken$$inlined$map$1$2$1;
            int i26;
            RealDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1 realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1;
            int i27;
            RealTransferManager$transferData$$inlined$map$1$2$1 realTransferManager$transferData$$inlined$map$1$2$1;
            int i28;
            RealCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1 realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1;
            int i29;
            Object failure;
            RecentAddressSearchQueries$addresses$$inlined$map$1$2$1 recentAddressSearchQueries$addresses$$inlined$map$1$2$1;
            int i30;
            int i31 = this.$r8$classId;
            int i32 = 7;
            int i33 = 23;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i31) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i34 = anonymousClass1.label;
                        if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i34 - PKIFailureInfo.systemUnavail;
                            Object obj3 = anonymousClass1.result;
                            Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Object obj5 = ((CashLiteConfig) obj).config;
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(obj5, anonymousClass1) == obj4) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.result;
                    Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof ContactModifiablePermissions$granted$$inlined$map$1$2$1) {
                        contactModifiablePermissions$granted$$inlined$map$1$2$1 = (ContactModifiablePermissions$granted$$inlined$map$1$2$1) continuation;
                        int i35 = contactModifiablePermissions$granted$$inlined$map$1$2$1.label;
                        if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                            contactModifiablePermissions$granted$$inlined$map$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                            Object obj6 = contactModifiablePermissions$granted$$inlined$map$1$2$1.result;
                            Object obj7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = contactModifiablePermissions$granted$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                ContactModifiablePermissions.PermissionTuple permissionTuple = (ContactModifiablePermissions.PermissionTuple) obj;
                                Object valueOf = Boolean.valueOf(ContactModifiablePermissions.PermissionTuple.WhenMappings.$EnumSwitchMapping$0[permissionTuple.syncState.ordinal()] == 1 ? false : permissionTuple.granted);
                                contactModifiablePermissions$granted$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf, contactModifiablePermissions$granted$$inlined$map$1$2$1) == obj7) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    contactModifiablePermissions$granted$$inlined$map$1$2$1 = new ContactModifiablePermissions$granted$$inlined$map$1$2$1(this, continuation);
                    Object obj62 = contactModifiablePermissions$granted$$inlined$map$1$2$1.result;
                    Object obj72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = contactModifiablePermissions$granted$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1) {
                        contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1 = (ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1) continuation;
                        int i36 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.label;
                        if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                            contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                            Object obj8 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.result;
                            Object obj9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj8);
                                Object obj10 = (Boolean) obj;
                                obj10.getClass();
                                contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj10, contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1) == obj9) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj8);
                            }
                            break;
                        }
                    }
                    contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1 = new ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1(this, continuation);
                    Object obj82 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.result;
                    Object obj92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                case 3:
                    if (continuation instanceof ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1) {
                        contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1 = (ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1) continuation;
                        int i37 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.label;
                        if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                            contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                            Object obj11 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.result;
                            Object obj12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj11);
                                contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit((ContactsSyncState) obj, contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1) == obj12) {
                                    break;
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj11);
                            }
                            break;
                        }
                    }
                    contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1 = new ContactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1(this, continuation);
                    Object obj112 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.result;
                    Object obj122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = contactModifiablePermissions$shouldShowRequestPermissionRationale$$inlined$map$2$2$1.label;
                    if (i4 != 0) {
                    }
                case 4:
                    if (continuation instanceof RealContactRepository$contactByAlias$$inlined$map$1$2$1) {
                        realContactRepository$contactByAlias$$inlined$map$1$2$1 = (RealContactRepository$contactByAlias$$inlined$map$1$2$1) continuation;
                        int i38 = realContactRepository$contactByAlias$$inlined$map$1$2$1.label;
                        if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$contactByAlias$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                            Object obj13 = realContactRepository$contactByAlias$$inlined$map$1$2$1.result;
                            Object obj14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i5 = realContactRepository$contactByAlias$$inlined$map$1$2$1.label;
                            if (i5 != 0) {
                                SafeTrace.throwOnFailure(obj13);
                                List list3 = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                Iterator it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(RecipientUtil.createRecipient((Recipients) it.next()));
                                }
                                Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
                                realContactRepository$contactByAlias$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull, realContactRepository$contactByAlias$$inlined$map$1$2$1) == obj14) {
                                    break;
                                }
                            } else if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj13);
                            }
                            break;
                        }
                    }
                    realContactRepository$contactByAlias$$inlined$map$1$2$1 = new RealContactRepository$contactByAlias$$inlined$map$1$2$1(this, continuation);
                    Object obj132 = realContactRepository$contactByAlias$$inlined$map$1$2$1.result;
                    Object obj142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i5 = realContactRepository$contactByAlias$$inlined$map$1$2$1.label;
                    if (i5 != 0) {
                    }
                case 5:
                    if (continuation instanceof RealContactRepository$contactById$$inlined$map$1$2$1) {
                        realContactRepository$contactById$$inlined$map$1$2$1 = (RealContactRepository$contactById$$inlined$map$1$2$1) continuation;
                        int i39 = realContactRepository$contactById$$inlined$map$1$2$1.label;
                        if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$contactById$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                            Object obj15 = realContactRepository$contactById$$inlined$map$1$2$1.result;
                            Object obj16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i6 = realContactRepository$contactById$$inlined$map$1$2$1.label;
                            if (i6 != 0) {
                                SafeTrace.throwOnFailure(obj15);
                                List list4 = (List) obj;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(RecipientUtil.createRecipient((Recipients) it2.next()));
                                }
                                Object firstOrNull2 = CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
                                realContactRepository$contactById$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(firstOrNull2, realContactRepository$contactById$$inlined$map$1$2$1) == obj16) {
                                    break;
                                }
                            } else if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj15);
                            }
                            break;
                        }
                    }
                    realContactRepository$contactById$$inlined$map$1$2$1 = new RealContactRepository$contactById$$inlined$map$1$2$1(this, continuation);
                    Object obj152 = realContactRepository$contactById$$inlined$map$1$2$1.result;
                    Object obj162 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i6 = realContactRepository$contactById$$inlined$map$1$2$1.label;
                    if (i6 != 0) {
                    }
                case 6:
                    if (continuation instanceof RealContactRepository$contacts$$inlined$map$1$2$1) {
                        realContactRepository$contacts$$inlined$map$1$2$1 = (RealContactRepository$contacts$$inlined$map$1$2$1) continuation;
                        int i40 = realContactRepository$contacts$$inlined$map$1$2$1.label;
                        if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$contacts$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                            Object obj17 = realContactRepository$contacts$$inlined$map$1$2$1.result;
                            Object obj18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i7 = realContactRepository$contacts$$inlined$map$1$2$1.label;
                            if (i7 != 0) {
                                SafeTrace.throwOnFailure(obj17);
                                List list5 = (List) obj;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                Iterator it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(RecipientUtil.createRecipient((Recipients) it3.next()));
                                }
                                realContactRepository$contacts$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList3, realContactRepository$contacts$$inlined$map$1$2$1) == obj18) {
                                    break;
                                }
                            } else if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj17);
                            }
                            break;
                        }
                    }
                    realContactRepository$contacts$$inlined$map$1$2$1 = new RealContactRepository$contacts$$inlined$map$1$2$1(this, continuation);
                    Object obj172 = realContactRepository$contacts$$inlined$map$1$2$1.result;
                    Object obj182 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i7 = realContactRepository$contacts$$inlined$map$1$2$1.label;
                    if (i7 != 0) {
                    }
                case 7:
                    if (continuation instanceof RealContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1) {
                        realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1 = (RealContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1) continuation;
                        int i41 = realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.label;
                        if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                            Object obj19 = realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.result;
                            Object obj20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i8 = realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.label;
                            if (i8 != 0) {
                                SafeTrace.throwOnFailure(obj19);
                                Object obj21 = ((Boolean) obj).booleanValue() ? ContactsStatus.IN_CONTACTS : ContactsStatus.NOT_IN_CONTACTS;
                                realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj21, realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1) == obj20) {
                                    break;
                                }
                            } else if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj19);
                            }
                            break;
                        }
                    }
                    realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1 = new RealContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1(this, continuation);
                    Object obj192 = realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.result;
                    Object obj202 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i8 = realContactRepository$contactsStatusForCustomer$$inlined$map$1$2$1.label;
                    if (i8 != 0) {
                    }
                case 8:
                    if (continuation instanceof RealContactRepository$contactsWithAliasIds$$inlined$map$1$2$1) {
                        realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1 = (RealContactRepository$contactsWithAliasIds$$inlined$map$1$2$1) continuation;
                        int i42 = realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.label;
                        if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                            Object obj22 = realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.result;
                            Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i9 = realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.label;
                            if (i9 != 0) {
                                SafeTrace.throwOnFailure(obj22);
                                List<WithContactAliasId> list6 = (List) obj;
                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                for (WithContactAliasId withContactAliasId : list6) {
                                    withContactAliasId.getClass();
                                    arrayList4.add(new com.squareup.cash.db.contacts.WithContactAliasId(withContactAliasId.lookup_key, withContactAliasId.hashed_alias, withContactAliasId.hashed_alias_id, withContactAliasId.sms, withContactAliasId.email));
                                }
                                realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList4, realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1) == obj23) {
                                    break;
                                }
                            } else if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj22);
                            }
                            break;
                        }
                    }
                    realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1 = new RealContactRepository$contactsWithAliasIds$$inlined$map$1$2$1(this, continuation);
                    Object obj222 = realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.result;
                    Object obj232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i9 = realContactRepository$contactsWithAliasIds$$inlined$map$1$2$1.label;
                    if (i9 != 0) {
                    }
                case 9:
                    if (continuation instanceof RealContactRepository$recipients$$inlined$map$1$2$1) {
                        realContactRepository$recipients$$inlined$map$1$2$1 = (RealContactRepository$recipients$$inlined$map$1$2$1) continuation;
                        int i43 = realContactRepository$recipients$$inlined$map$1$2$1.label;
                        if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$recipients$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                            Object obj24 = realContactRepository$recipients$$inlined$map$1$2$1.result;
                            Object obj25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i10 = realContactRepository$recipients$$inlined$map$1$2$1.label;
                            if (i10 != 0) {
                                SafeTrace.throwOnFailure(obj24);
                                List list7 = (List) obj;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                Iterator it4 = list7.iterator();
                                while (it4.hasNext()) {
                                    RecentRecipient recentRecipient = (RecentRecipient) it4.next();
                                    recentRecipient.getClass();
                                    String str = recentRecipient.lookup_key;
                                    String str2 = recentRecipient.email;
                                    String str3 = recentRecipient.sms;
                                    String str4 = recentRecipient.cashtag;
                                    String str5 = recentRecipient.customer_id;
                                    String str6 = recentRecipient.threaded_customer_id;
                                    boolean z = recentRecipient.can_accept_payments;
                                    boolean z2 = recentRecipient.is_cash_customer;
                                    String str7 = recentRecipient.contact_display_name;
                                    String str8 = recentRecipient.customer_display_name;
                                    String str9 = ((z2 || str7 == null || str == null) && str8 != null) ? str8 : str7;
                                    MerchantData merchantData = recentRecipient.merchant_data;
                                    Iterator it5 = it4;
                                    Region region = recentRecipient.region;
                                    String str10 = recentRecipient.category;
                                    Color color = recentRecipient.themed_accent_color;
                                    long j = recentRecipient.credit_card_fee;
                                    boolean z3 = recentRecipient.is_verified;
                                    boolean z4 = recentRecipient.is_business;
                                    Image image = recentRecipient.photo;
                                    boolean z5 = recentRecipient.already_invited;
                                    String str11 = recentRecipient.email_addresses;
                                    boolean z6 = recentRecipient.has_multiple_customers;
                                    BlockState blockState = recentRecipient.blocked;
                                    if (blockState == null) {
                                        blockState = BlockState.NOT_BLOCKED;
                                    }
                                    arrayList5.add(new Recipient(str, z5, z6, str5, str6, str4, z2, z3, z4, str2, str3, image, str11, recentRecipient.sms_numbers, z, j, blockState, merchantData, false, null, color, region, str10, null, str9, str7, null, recentRecipient.reward_token, str != null, null, false, false, null, null, -461111296, 63));
                                    it4 = it5;
                                }
                                Object sortedWith = CollectionsKt.sortedWith(arrayList5, new b.C0008b(8));
                                realContactRepository$recipients$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(sortedWith, realContactRepository$recipients$$inlined$map$1$2$1) == obj25) {
                                    break;
                                }
                            } else if (i10 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj24);
                            }
                            break;
                        }
                    }
                    realContactRepository$recipients$$inlined$map$1$2$1 = new RealContactRepository$recipients$$inlined$map$1$2$1(this, continuation);
                    Object obj242 = realContactRepository$recipients$$inlined$map$1$2$1.result;
                    Object obj252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = realContactRepository$recipients$$inlined$map$1$2$1.label;
                    if (i10 != 0) {
                    }
                case 10:
                    if (continuation instanceof RealContactRepository$shouldShowConfirm$$inlined$map$1$2$1) {
                        realContactRepository$shouldShowConfirm$$inlined$map$1$2$1 = (RealContactRepository$shouldShowConfirm$$inlined$map$1$2$1) continuation;
                        int i44 = realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.label;
                        if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                            realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                            Object obj26 = realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.result;
                            Object obj27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i11 = realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.label;
                            if (i11 != 0) {
                                SafeTrace.throwOnFailure(obj26);
                                Object valueOf2 = Boolean.valueOf(((List) obj).isEmpty());
                                realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf2, realContactRepository$shouldShowConfirm$$inlined$map$1$2$1) == obj27) {
                                    break;
                                }
                            } else if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj26);
                            }
                            break;
                        }
                    }
                    realContactRepository$shouldShowConfirm$$inlined$map$1$2$1 = new RealContactRepository$shouldShowConfirm$$inlined$map$1$2$1(this, continuation);
                    Object obj262 = realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.result;
                    Object obj272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i11 = realContactRepository$shouldShowConfirm$$inlined$map$1$2$1.label;
                    if (i11 != 0) {
                    }
                case 11:
                    if (continuation instanceof RealAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1) {
                        realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1 = (RealAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1) continuation;
                        int i45 = realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.label;
                        if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                            realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                            Object obj28 = realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.result;
                            Object obj29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i12 = realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.label;
                            if (i12 != 0) {
                                SafeTrace.throwOnFailure(obj28);
                                BankingConfig bankingConfig = (BankingConfig) obj;
                                Object encodeByteString = new com.squareup.protos.franklin.app.BankingConfig(new BankingConfig.Strings(bankingConfig.getMain_screen_title(), bankingConfig.getMain_screen_balance_subtitle()), bankingConfig.getRecurring_deposits_dda_upsell()).encodeByteString();
                                realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(encodeByteString, realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1) == obj29) {
                                    break;
                                }
                            } else if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj28);
                            }
                            break;
                        }
                    }
                    realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1 = new RealAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj282 = realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.result;
                    Object obj292 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i12 = realAppConfigManager$bankingConfigByteStringFlow$$inlined$map$1$2$1.label;
                    if (i12 != 0) {
                    }
                case 12:
                    if (continuation instanceof RealAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1) {
                        realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1 = (RealAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1) continuation;
                        int i46 = realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.label;
                        if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                            realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                            Object obj30 = realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.result;
                            Object obj31 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i13 = realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.label;
                            if (i13 != 0) {
                                SafeTrace.throwOnFailure(obj30);
                                Object encodeByteString2 = ((ClientData) obj).encodeByteString();
                                realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(encodeByteString2, realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1) == obj31) {
                                    break;
                                }
                            } else if (i13 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj30);
                            }
                            break;
                        }
                    }
                    realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1 = new RealAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj302 = realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.result;
                    Object obj312 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i13 = realAppConfigManager$clientDataByteStringFlow$$inlined$map$1$2$1.label;
                    if (i13 != 0) {
                    }
                case 13:
                    if (continuation instanceof RealAddressManager$legacyProfileAddress$$inlined$map$1$2$1) {
                        realAddressManager$legacyProfileAddress$$inlined$map$1$2$1 = (RealAddressManager$legacyProfileAddress$$inlined$map$1$2$1) continuation;
                        int i47 = realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.label;
                        if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                            realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                            Object obj33 = realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.result;
                            Object obj34 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i14 = realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.label;
                            if (i14 != 0) {
                                SafeTrace.throwOnFailure(obj33);
                                Profile profile = (Profile) obj;
                                Object obj35 = profile != null ? profile.address : null;
                                realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj35, realAddressManager$legacyProfileAddress$$inlined$map$1$2$1) == obj34) {
                                    break;
                                }
                            } else if (i14 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj33);
                            }
                            break;
                        }
                    }
                    realAddressManager$legacyProfileAddress$$inlined$map$1$2$1 = new RealAddressManager$legacyProfileAddress$$inlined$map$1$2$1(this, continuation);
                    Object obj332 = realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.result;
                    Object obj342 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i14 = realAddressManager$legacyProfileAddress$$inlined$map$1$2$1.label;
                    if (i14 != 0) {
                    }
                case 14:
                    if (continuation instanceof RealDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1) {
                        realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1 = (RealDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1) continuation;
                        int i48 = realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.label;
                        if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                            realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                            Object obj36 = realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.result;
                            Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i15 = realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.label;
                            if (i15 != 0) {
                                SafeTrace.throwOnFailure(obj36);
                                Object valueOf3 = Boolean.valueOf(((Profile) obj).direct_deposit_account_enabled);
                                realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(valueOf3, realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1) == obj37) {
                                    break;
                                }
                            } else if (i15 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj36);
                            }
                            break;
                        }
                    }
                    realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1 = new RealDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1(this, continuation);
                    Object obj362 = realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.result;
                    Object obj372 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i15 = realDemandDepositAccountManager$selectUiDda$$inlined$map$1$2$1.label;
                    if (i15 != 0) {
                    }
                case 15:
                    if (continuation instanceof RealJurisdictionConfigManager$profileBased$$inlined$map$1$2$1) {
                        realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1 = (RealJurisdictionConfigManager$profileBased$$inlined$map$1$2$1) continuation;
                        int i49 = realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.label;
                        if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                            realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                            Object obj38 = realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.result;
                            Object obj39 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i16 = realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.label;
                            if (i16 != 0) {
                                SafeTrace.throwOnFailure(obj38);
                                Profile profile2 = (Profile) obj;
                                CurrencyCode currencyCode = profile2 != null ? profile2.default_currency : null;
                                Country country = profile2 != null ? profile2.country_code : null;
                                if (profile2 == null || (list = profile2.available_p2p_target_regions) == null) {
                                    list = EmptyList.INSTANCE;
                                }
                                Object jurisdictionConfigManager$JurisdictionConfig = new JurisdictionConfigManager$JurisdictionConfig(currencyCode, country, list);
                                realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(jurisdictionConfigManager$JurisdictionConfig, realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1) == obj39) {
                                    break;
                                }
                            } else if (i16 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj38);
                            }
                            break;
                        }
                    }
                    realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1 = new RealJurisdictionConfigManager$profileBased$$inlined$map$1$2$1(this, continuation);
                    Object obj382 = realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.result;
                    Object obj392 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i16 = realJurisdictionConfigManager$profileBased$$inlined$map$1$2$1.label;
                    if (i16 != 0) {
                    }
                    break;
                case 16:
                    if (continuation instanceof RealJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1) {
                        realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1 = (RealJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1) continuation;
                        int i50 = realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.label;
                        if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                            realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                            Object obj40 = realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.result;
                            Object obj41 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i17 = realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.label;
                            if (i17 != 0) {
                                SafeTrace.throwOnFailure(obj40);
                                UiJurisdictionConfig uiJurisdictionConfig = (UiJurisdictionConfig) obj;
                                CurrencyCode currencyCode2 = uiJurisdictionConfig != null ? uiJurisdictionConfig.default_currency : null;
                                Country country2 = uiJurisdictionConfig != null ? uiJurisdictionConfig.country_code : null;
                                if (uiJurisdictionConfig == null || (list2 = uiJurisdictionConfig.available_p2p_target_regions) == null) {
                                    list2 = EmptyList.INSTANCE;
                                }
                                Object jurisdictionConfigManager$JurisdictionConfig2 = new JurisdictionConfigManager$JurisdictionConfig(currencyCode2, country2, list2);
                                realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(jurisdictionConfigManager$JurisdictionConfig2, realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1) == obj41) {
                                    break;
                                }
                            } else if (i17 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj40);
                            }
                            break;
                        }
                    }
                    realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1 = new RealJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1(this, continuation);
                    Object obj402 = realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.result;
                    Object obj412 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i17 = realJurisdictionConfigManager$syncValueBased$$inlined$map$1$2$1.label;
                    if (i17 != 0) {
                    }
                    break;
                case 17:
                    if (continuation instanceof RealProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1) {
                        realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1 = (RealProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1) continuation;
                        int i51 = realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.label;
                        if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                            Object obj43 = realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.result;
                            Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i18 = realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.label;
                            if (i18 != 0) {
                                SafeTrace.throwOnFailure(obj43);
                                List list8 = (List) obj;
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                                Iterator it6 = list8.iterator();
                                while (it6.hasNext()) {
                                    arrayList6.add(RealProfileAliasRepository.toProfileAlias((ProfileAlias) it6.next()));
                                }
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it7 = arrayList6.iterator();
                                while (it7.hasNext()) {
                                    Object next = it7.next();
                                    if (((com.squareup.cash.db.profile.ProfileAlias) next).f1121type == UiAlias.Type.EMAIL) {
                                        arrayList7.add(next);
                                    }
                                }
                                realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList7, realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1) == obj44) {
                                    break;
                                }
                            } else if (i18 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj43);
                            }
                            break;
                        }
                    }
                    realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1 = new RealProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1(this, continuation);
                    Object obj432 = realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.result;
                    Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i18 = realProfileAliasRepository$forAliasTypeSyncValues$$inlined$map$1$2$1.label;
                    if (i18 != 0) {
                    }
                case 18:
                    if (continuation instanceof RealProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1) {
                        realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1 = (RealProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1) continuation;
                        int i52 = realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.label;
                        if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                            Object obj45 = realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.result;
                            Object obj46 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i19 = realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.label;
                            if (i19 != 0) {
                                SafeTrace.throwOnFailure(obj45);
                                BtcDisplayUnits btcDisplayUnits = (BtcDisplayUnits) obj;
                                if (btcDisplayUnits == null || (obj2 = btcDisplayUnits.bitcoin_display_units) == null) {
                                    obj2 = BitcoinDisplayUnits.BITCOIN;
                                }
                                realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj2, realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1) == obj46) {
                                    break;
                                }
                            } else if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj45);
                            }
                            break;
                        }
                    }
                    realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1 = new RealProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1(this, continuation);
                    Object obj452 = realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.result;
                    Object obj462 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i19 = realProfileManager$bitcoinDisplayUnits$$inlined$map$1$2$1.label;
                    if (i19 != 0) {
                    }
                    break;
                case 19:
                    if (continuation instanceof RealProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1) {
                        realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1 = (RealProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                        int i53 = realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                            Object obj47 = realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.result;
                            Object obj48 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i20 = realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.label;
                            if (i20 != 0) {
                                SafeTrace.throwOnFailure(obj47);
                                Object upperCase = ((BitcoinDisplayUnits) obj).name().toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(upperCase, realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1) == obj48) {
                                    break;
                                }
                            } else if (i20 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj47);
                            }
                            break;
                        }
                    }
                    realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1 = new RealProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                    Object obj472 = realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.result;
                    Object obj482 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i20 = realProfileManager$displayUnit$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if (i20 != 0) {
                    }
                case 20:
                    if (continuation instanceof RealProfileManager$displayUnitFlow$$inlined$map$1$2$1) {
                        realProfileManager$displayUnitFlow$$inlined$map$1$2$1 = (RealProfileManager$displayUnitFlow$$inlined$map$1$2$1) continuation;
                        int i54 = realProfileManager$displayUnitFlow$$inlined$map$1$2$1.label;
                        if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileManager$displayUnitFlow$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                            Object obj49 = realProfileManager$displayUnitFlow$$inlined$map$1$2$1.result;
                            Object obj50 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i21 = realProfileManager$displayUnitFlow$$inlined$map$1$2$1.label;
                            if (i21 != 0) {
                                SafeTrace.throwOnFailure(obj49);
                                Object upperCase2 = ((BitcoinDisplayUnits) obj).name().toUpperCase(Locale.ROOT);
                                upperCase2.getClass();
                                realProfileManager$displayUnitFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(upperCase2, realProfileManager$displayUnitFlow$$inlined$map$1$2$1) == obj50) {
                                    break;
                                }
                            } else if (i21 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj49);
                            }
                            break;
                        }
                    }
                    realProfileManager$displayUnitFlow$$inlined$map$1$2$1 = new RealProfileManager$displayUnitFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj492 = realProfileManager$displayUnitFlow$$inlined$map$1$2$1.result;
                    Object obj502 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i21 = realProfileManager$displayUnitFlow$$inlined$map$1$2$1.label;
                    if (i21 != 0) {
                    }
                case 21:
                    if (continuation instanceof RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1) {
                        realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1 = (RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1) continuation;
                        int i55 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.label;
                        if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                            Object obj51 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.result;
                            Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i22 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.label;
                            if (i22 != 0) {
                                SafeTrace.throwOnFailure(obj51);
                                List list9 = RealProfileNotificationsRepository.TYPE_ORDER;
                                Object sortedWith2 = CollectionsKt.sortedWith((List) obj, new VideoCapture$$ExternalSyntheticLambda6(new RealAppConfigManager$$ExternalSyntheticLambda6(i33), i32));
                                realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(sortedWith2, realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1) == obj52) {
                                    break;
                                }
                            } else if (i22 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj51);
                            }
                            break;
                        }
                    }
                    realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1 = new RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1(this, continuation);
                    Object obj512 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.result;
                    Object obj522 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i22 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$1$2$1.label;
                    if (i22 != 0) {
                    }
                case 22:
                    if (continuation instanceof RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1) {
                        realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1 = (RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1) continuation;
                        int i56 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.label;
                        if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                            realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                            Object obj53 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.result;
                            Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i23 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.label;
                            if (i23 != 0) {
                                SafeTrace.throwOnFailure(obj53);
                                List list10 = RealProfileNotificationsRepository.TYPE_ORDER;
                                Object sortedWith3 = CollectionsKt.sortedWith((List) obj, new VideoCapture$$ExternalSyntheticLambda6(new RealAppConfigManager$$ExternalSyntheticLambda6(i33), i32));
                                realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.label = 1;
                                if (flowCollector.emit(sortedWith3, realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1) == obj54) {
                                    break;
                                }
                            } else if (i23 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj53);
                            }
                            break;
                        }
                    }
                    realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1 = new RealProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1(this, continuation);
                    Object obj532 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.result;
                    Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i23 = realProfileNotificationsRepository$getAliasNotificationPreferences$$inlined$map$2$2$1.label;
                    if (i23 != 0) {
                    }
                case 23:
                    if (continuation instanceof RealAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1) {
                        realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1 = (RealAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1) continuation;
                        int i57 = realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.label;
                        if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                            realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                            Object obj55 = realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.result;
                            Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i24 = realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.label;
                            if (i24 != 0) {
                                SafeTrace.throwOnFailure(obj55);
                                List list11 = (List) obj;
                                Object singleAccount = list11.size() > 1 ? AccountStatementsManager$AccountStatementsInfo.MultipleAccounts.INSTANCE : list11.size() == 1 ? new AccountStatementsManager$AccountStatementsInfo.SingleAccount(((CustomerStatementType) list11.get(0)).customer_token, ((CustomerStatementType) list11.get(0)).statement_type) : AccountStatementsManager$AccountStatementsInfo.NoAccounts.INSTANCE;
                                realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(singleAccount, realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1) == obj56) {
                                    break;
                                }
                            } else if (i24 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj55);
                            }
                            break;
                        }
                    }
                    realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1 = new RealAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1(this, continuation);
                    Object obj552 = realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.result;
                    Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i24 = realAccountStatementsManager$accountStatementInfo$$inlined$map$1$2$1.label;
                    if (i24 != 0) {
                    }
                case 24:
                    if (continuation instanceof RealAccountStatementsManager$customerToken$$inlined$map$1$2$1) {
                        realAccountStatementsManager$customerToken$$inlined$map$1$2$1 = (RealAccountStatementsManager$customerToken$$inlined$map$1$2$1) continuation;
                        int i58 = realAccountStatementsManager$customerToken$$inlined$map$1$2$1.label;
                        if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                            realAccountStatementsManager$customerToken$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                            Object obj57 = realAccountStatementsManager$customerToken$$inlined$map$1$2$1.result;
                            Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i25 = realAccountStatementsManager$customerToken$$inlined$map$1$2$1.label;
                            if (i25 != 0) {
                                SafeTrace.throwOnFailure(obj57);
                                Object obj59 = ((Profile) obj).profile_id;
                                realAccountStatementsManager$customerToken$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj59, realAccountStatementsManager$customerToken$$inlined$map$1$2$1) == obj58) {
                                    break;
                                }
                            } else if (i25 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj57);
                            }
                            break;
                        }
                    }
                    realAccountStatementsManager$customerToken$$inlined$map$1$2$1 = new RealAccountStatementsManager$customerToken$$inlined$map$1$2$1(this, continuation);
                    Object obj572 = realAccountStatementsManager$customerToken$$inlined$map$1$2$1.result;
                    Object obj582 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i25 = realAccountStatementsManager$customerToken$$inlined$map$1$2$1.label;
                    if (i25 != 0) {
                    }
                case 25:
                    if (continuation instanceof RealAfterpayStatementManager$customerToken$$inlined$map$1$2$1) {
                        realAfterpayStatementManager$customerToken$$inlined$map$1$2$1 = (RealAfterpayStatementManager$customerToken$$inlined$map$1$2$1) continuation;
                        int i59 = realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.label;
                        if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                            realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                            Object obj60 = realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.result;
                            Object obj61 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i26 = realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.label;
                            if (i26 != 0) {
                                SafeTrace.throwOnFailure(obj60);
                                Object obj63 = ((Profile) obj).profile_id;
                                realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj63, realAfterpayStatementManager$customerToken$$inlined$map$1$2$1) == obj61) {
                                    break;
                                }
                            } else if (i26 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj60);
                            }
                            break;
                        }
                    }
                    realAfterpayStatementManager$customerToken$$inlined$map$1$2$1 = new RealAfterpayStatementManager$customerToken$$inlined$map$1$2$1(this, continuation);
                    Object obj602 = realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.result;
                    Object obj612 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i26 = realAfterpayStatementManager$customerToken$$inlined$map$1$2$1.label;
                    if (i26 != 0) {
                    }
                case 26:
                    if (continuation instanceof RealDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1) {
                        realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1 = (RealDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1) continuation;
                        int i60 = realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.label;
                        if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                            realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                            Object obj64 = realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.result;
                            Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i27 = realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.label;
                            if (i27 != 0) {
                                SafeTrace.throwOnFailure(obj64);
                                Document document = (Document) obj;
                                Object obj66 = document != null ? document.display_date : null;
                                realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj66, realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1) == obj65) {
                                    break;
                                }
                            } else if (i27 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj64);
                            }
                            break;
                        }
                    }
                    realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1 = new RealDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1(this, continuation);
                    Object obj642 = realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.result;
                    Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i27 = realDocumentEntitiesMapper$monthlyDocumentDateForToken$$inlined$map$1$2$1.label;
                    if (i27 != 0) {
                    }
                case 27:
                    if (continuation instanceof RealTransferManager$transferData$$inlined$map$1$2$1) {
                        realTransferManager$transferData$$inlined$map$1$2$1 = (RealTransferManager$transferData$$inlined$map$1$2$1) continuation;
                        int i61 = realTransferManager$transferData$$inlined$map$1$2$1.label;
                        if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                            realTransferManager$transferData$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                            Object obj67 = realTransferManager$transferData$$inlined$map$1$2$1.result;
                            Object obj68 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i28 = realTransferManager$transferData$$inlined$map$1$2$1.label;
                            if (i28 != 0) {
                                SafeTrace.throwOnFailure(obj67);
                                Object obj69 = ((P2pSettingsManager$P2pSettings) obj).depositPreferenceData;
                                realTransferManager$transferData$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(obj69, realTransferManager$transferData$$inlined$map$1$2$1) == obj68) {
                                    break;
                                }
                            } else if (i28 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj67);
                            }
                            break;
                        }
                    }
                    realTransferManager$transferData$$inlined$map$1$2$1 = new RealTransferManager$transferData$$inlined$map$1$2$1(this, continuation);
                    Object obj672 = realTransferManager$transferData$$inlined$map$1$2$1.result;
                    Object obj682 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i28 = realTransferManager$transferData$$inlined$map$1$2$1.label;
                    if (i28 != 0) {
                    }
                case 28:
                    if (continuation instanceof RealCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1) {
                        realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1 = (RealCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1) continuation;
                        int i62 = realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.label;
                        if ((i62 & PKIFailureInfo.systemUnavail) != 0) {
                            realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.label = i62 - PKIFailureInfo.systemUnavail;
                            Object obj70 = realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.result;
                            Object obj71 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i29 = realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.label;
                            if (i29 != 0) {
                                SafeTrace.throwOnFailure(obj70);
                                PaperDepositBarcodeInfo paperDepositBarcodeInfo = (PaperDepositBarcodeInfo) obj;
                                if (paperDepositBarcodeInfo.success != null) {
                                    Long l = paperDepositBarcodeInfo.expires_at;
                                    l.getClass();
                                    long longValue = l.longValue();
                                    GetPaperCashDepositBarcodeResponse.Success success = paperDepositBarcodeInfo.success;
                                    success.getClass();
                                    failure = new BarcodeInfo.Success(longValue, success);
                                } else {
                                    failure = new BarcodeInfo.Failure(paperDepositBarcodeInfo.failure);
                                }
                                realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(failure, realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1) == obj71) {
                                    break;
                                }
                            } else if (i29 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj70);
                            }
                            break;
                        }
                    }
                    realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1 = new RealCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj702 = realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.result;
                    Object obj712 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i29 = realCashDepositBarcodeManager$barcodeInfoFlow$$inlined$map$1$2$1.label;
                    if (i29 != 0) {
                    }
                default:
                    if (continuation instanceof RecentAddressSearchQueries$addresses$$inlined$map$1$2$1) {
                        recentAddressSearchQueries$addresses$$inlined$map$1$2$1 = (RecentAddressSearchQueries$addresses$$inlined$map$1$2$1) continuation;
                        int i63 = recentAddressSearchQueries$addresses$$inlined$map$1$2$1.label;
                        if ((i63 & PKIFailureInfo.systemUnavail) != 0) {
                            recentAddressSearchQueries$addresses$$inlined$map$1$2$1.label = i63 - PKIFailureInfo.systemUnavail;
                            Object obj73 = recentAddressSearchQueries$addresses$$inlined$map$1$2$1.result;
                            Object obj74 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i30 = recentAddressSearchQueries$addresses$$inlined$map$1$2$1.label;
                            if (i30 != 0) {
                                SafeTrace.throwOnFailure(obj73);
                                List<PhysicalDepositUsAddressSearch> list12 = (List) obj;
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list12, 10));
                                for (PhysicalDepositUsAddressSearch physicalDepositUsAddressSearch : list12) {
                                    arrayList8.add(new AddressSearch(physicalDepositUsAddressSearch.identifier, physicalDepositUsAddressSearch.created_at, physicalDepositUsAddressSearch.formatted_address, physicalDepositUsAddressSearch.primary_text, physicalDepositUsAddressSearch.secondary_text, physicalDepositUsAddressSearch.latitude, physicalDepositUsAddressSearch.longitude));
                                }
                                recentAddressSearchQueries$addresses$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList8, recentAddressSearchQueries$addresses$$inlined$map$1$2$1) == obj74) {
                                    break;
                                }
                            } else if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj73);
                            }
                            break;
                        }
                    }
                    recentAddressSearchQueries$addresses$$inlined$map$1$2$1 = new RecentAddressSearchQueries$addresses$$inlined$map$1$2$1(this, continuation);
                    Object obj732 = recentAddressSearchQueries$addresses$$inlined$map$1$2$1.result;
                    Object obj742 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i30 = recentAddressSearchQueries$addresses$$inlined$map$1$2$1.label;
                    if (i30 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, Object obj, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
        }
    }
}
