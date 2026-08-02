package com.squareup.cash.crypto.backend.value;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientrouting.validation.CashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1;
import com.squareup.cash.clientsync.persistence.RealSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1;
import com.squareup.cash.clipboard.RealClipboardObserver$observeClipboard$$inlined$filter$1$2$1;
import com.squareup.cash.crow.sync_values.RestrictionsData;
import com.squareup.cash.crypto.address.CryptoAddress$BitcoinAddress;
import com.squareup.cash.crypto.amount.BitcoinAmount;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvest;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.autoinvest.RealCryptoAutoInvestRepo$special$$inlined$map$2$2$1;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$special$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.eligibility.status.RealBitcoinEligibilityStatusProvider;
import com.squareup.cash.crypto.backend.payroll.RealCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.profile.BitcoinDisplayUnit;
import com.squareup.cash.crypto.backend.profile.BitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.profile.BitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1;
import com.squareup.cash.crypto.backend.profile.LegacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfile;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.receiveasbitcoin.ReceiveP2PAsBitcoinState;
import com.squareup.cash.crypto.backend.roundups.BitcoinRoundUpsUsageStats;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo$special$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo$special$$inlined$map$2$2$1;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo$special$$inlined$map$3$2$1;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo$special$$inlined$map$1$2$1;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo$special$$inlined$map$2$2$1;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo$special$$inlined$map$3$2$1;
import com.squareup.cash.crypto.backend.walletaddress.RealCryptoAddressRepo$profileBased$$inlined$map$1$2$1;
import com.squareup.cash.data.db.PaymentHistoryConfig;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.db2.WalletAddressForCurrency;
import com.squareup.cash.db2.activity.CashActivity;
import com.squareup.cash.db2.entities.Sync_entity;
import com.squareup.cash.db2.profile.BalanceData;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.recurring.db.Recurring_preference;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.cryptoinvestflow.CryptoPayrollPreference;
import com.squareup.protos.franklin.app.CashLiteClientRoute;
import com.squareup.protos.franklin.app.CashLiteConfig;
import com.squareup.protos.franklin.ui.BalanceSnapshot;
import com.squareup.protos.franklin.ui.InvestmentOrderType;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.android.layout.LayoutHelpersKt;
import com.squareup.workflow1.ui.WorkflowViewStateKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.cryptocurrency.BtcP2pConversionBps;
import squareup.cash.cryptocurrency.CryptoEligibilities;
import squareup.cash.cryptocurrency.CryptocurrencyProfile;

/* loaded from: classes6.dex */
public final class RealCryptoValueRepo$special$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.crypto.backend.value.RealCryptoValueRepo$special$$inlined$map$1$2$1, reason: invalid class name */
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
            return RealCryptoValueRepo$special$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ RealCryptoValueRepo$special$$inlined$map$1$2(FlowCollector flowCollector, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        CashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1 cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1;
        int i2;
        List list;
        RealSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1 realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1;
        int i3;
        RealClipboardObserver$observeClipboard$$inlined$filter$1$2$1 realClipboardObserver$observeClipboard$$inlined$filter$1$2$1;
        int i4;
        RealCryptoAutoInvestRepo$special$$inlined$map$1$2$1 realCryptoAutoInvestRepo$special$$inlined$map$1$2$1;
        int i5;
        RealCryptoAutoInvestRepo$special$$inlined$map$2$2$1 realCryptoAutoInvestRepo$special$$inlined$map$2$2$1;
        int i6;
        RealCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1 realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1;
        int i7;
        RealCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1 realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1;
        int i8;
        RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1 realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1;
        int i9;
        RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1 realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1;
        int i10;
        Long l;
        RealRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1 realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1;
        int i11;
        Long l2;
        RealRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1 realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1;
        int i12;
        RealRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1 realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1;
        int i13;
        Long l3;
        RealCryptoDisclosuresRepo$special$$inlined$map$1$2$1 realCryptoDisclosuresRepo$special$$inlined$map$1$2$1;
        int i14;
        RealBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1 realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1;
        int i15;
        RealBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1 realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1;
        int i16;
        RealCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1 realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1;
        int i17;
        Object obj2;
        RealBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1 realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1;
        int i18;
        BitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1 bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1;
        int i19;
        Object translateBitcoinDisplayUnit;
        BitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1 bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1;
        int i20;
        Object obj3;
        LegacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1 legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1;
        int i21;
        RealBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1 realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1;
        int i22;
        RealReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1 realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1;
        int i23;
        Long l4;
        RealBitcoinRoundUpsRepo$special$$inlined$map$1$2$1 realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1;
        int i24;
        RealBitcoinRoundUpsRepo$special$$inlined$map$2$2$1 realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1;
        int i25;
        RealBitcoinRoundUpsRepo$special$$inlined$map$3$2$1 realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1;
        int i26;
        RealBitcoinConfigRepo$special$$inlined$map$1$2$1 realBitcoinConfigRepo$special$$inlined$map$1$2$1;
        int i27;
        RealBitcoinConfigRepo$special$$inlined$map$2$2$1 realBitcoinConfigRepo$special$$inlined$map$2$2$1;
        int i28;
        RealBitcoinConfigRepo$special$$inlined$map$3$2$1 realBitcoinConfigRepo$special$$inlined$map$3$2$1;
        int i29;
        RealCryptoAddressRepo$profileBased$$inlined$map$1$2$1 realCryptoAddressRepo$profileBased$$inlined$map$1$2$1;
        int i30;
        String str;
        int i31 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        r11 = null;
        Object obj4 = null;
        r11 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        r11 = null;
        Object cryptoAutoInvest = null;
        r11 = null;
        Object scheduledTransactionPreference = null;
        r11 = null;
        LinkedHashSet linkedHashSet = null;
        switch (i31) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i32 = anonymousClass1.label;
                    if ((i32 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i32 - PKIFailureInfo.systemUnavail;
                        Object obj9 = anonymousClass1.result;
                        Object obj10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            Object obj11 = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.defaultCurrency : null;
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj11, anonymousClass1) == obj10) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj92 = anonymousClass1.result;
                Object obj102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof CashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1) {
                    cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1 = (CashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1) continuation;
                    int i33 = cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.label;
                    if ((i33 & PKIFailureInfo.systemUnavail) != 0) {
                        cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.label = i33 - PKIFailureInfo.systemUnavail;
                        Object obj12 = cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.result;
                        Object obj13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            CashLiteConfig cashLiteConfig = (CashLiteConfig) obj;
                            if (cashLiteConfig != null && (list = cashLiteConfig.client_routes_allowlist) != null) {
                                linkedHashSet = new LinkedHashSet();
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    String str2 = ((CashLiteClientRoute) it.next()).spec_name;
                                    if (str2 != null) {
                                        linkedHashSet.add(str2);
                                    }
                                }
                            }
                            cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(linkedHashSet, cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1) == obj13) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1 = new CashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1(this, continuation);
                Object obj122 = cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.result;
                Object obj132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cashAppLiteRouteAllowlistProvider$special$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof RealSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1) {
                    realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1 = (RealSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1) continuation;
                    int i34 = realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label;
                    if ((i34 & PKIFailureInfo.systemUnavail) != 0) {
                        realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label = i34 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.result;
                        Object obj15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            List list2 = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(LayoutHelpersKt.access$toMultiplatform((Sync_entity) it2.next()));
                            }
                            realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList, realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1) == obj15) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1 = new RealSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1(this, continuation);
                Object obj142 = realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.result;
                Object obj152 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = realSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof RealClipboardObserver$observeClipboard$$inlined$filter$1$2$1) {
                    realClipboardObserver$observeClipboard$$inlined$filter$1$2$1 = (RealClipboardObserver$observeClipboard$$inlined$filter$1$2$1) continuation;
                    int i35 = realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.label;
                    if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                        realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.label = i35 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.result;
                        Object obj17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            ActivityEvent activityEvent = (ActivityEvent) obj;
                            if (activityEvent == ActivityEvent.RESUME || activityEvent == ActivityEvent.PAUSE) {
                                realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realClipboardObserver$observeClipboard$$inlined$filter$1$2$1) == obj17) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj16);
                        }
                        break;
                    }
                }
                realClipboardObserver$observeClipboard$$inlined$filter$1$2$1 = new RealClipboardObserver$observeClipboard$$inlined$filter$1$2$1(this, continuation);
                Object obj162 = realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.result;
                Object obj172 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = realClipboardObserver$observeClipboard$$inlined$filter$1$2$1.label;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof RealCryptoAutoInvestRepo$special$$inlined$map$1$2$1) {
                    realCryptoAutoInvestRepo$special$$inlined$map$1$2$1 = (RealCryptoAutoInvestRepo$special$$inlined$map$1$2$1) continuation;
                    int i36 = realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.label;
                    if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.label = i36 - PKIFailureInfo.systemUnavail;
                        Object obj18 = realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.result;
                        Object obj19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            Recurring_preference recurring_preference = (Recurring_preference) obj;
                            if ((recurring_preference == null || recurring_preference.enabled) && recurring_preference != null) {
                                scheduledTransactionPreference = new ScheduledTransactionPreference(Boolean.valueOf(recurring_preference.enabled), recurring_preference.amount, recurring_preference.schedule, recurring_preference.f1195type, recurring_preference.next_reload_at, recurring_preference.entity_id, 448);
                            }
                            realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(scheduledTransactionPreference, realCryptoAutoInvestRepo$special$$inlined$map$1$2$1) == obj19) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj18);
                        }
                        break;
                    }
                }
                realCryptoAutoInvestRepo$special$$inlined$map$1$2$1 = new RealCryptoAutoInvestRepo$special$$inlined$map$1$2$1(this, continuation);
                Object obj182 = realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.result;
                Object obj192 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realCryptoAutoInvestRepo$special$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof RealCryptoAutoInvestRepo$special$$inlined$map$2$2$1) {
                    realCryptoAutoInvestRepo$special$$inlined$map$2$2$1 = (RealCryptoAutoInvestRepo$special$$inlined$map$2$2$1) continuation;
                    int i37 = realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.label;
                    if ((i37 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.label = i37 - PKIFailureInfo.systemUnavail;
                        Object obj20 = realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.result;
                        Object obj21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            Recurring_preference recurring_preference2 = (Recurring_preference) obj;
                            if ((recurring_preference2 == null || recurring_preference2.enabled) && recurring_preference2 != null) {
                                String str3 = recurring_preference2.entity_id;
                                Money money = recurring_preference2.amount;
                                RecurringSchedule recurringSchedule = recurring_preference2.schedule;
                                Long l5 = recurring_preference2.next_reload_at;
                                l5.getClass();
                                cryptoAutoInvest = new CryptoAutoInvest(str3, money, l5.longValue(), recurringSchedule);
                            }
                            realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(cryptoAutoInvest, realCryptoAutoInvestRepo$special$$inlined$map$2$2$1) == obj21) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj20);
                        }
                        break;
                    }
                }
                realCryptoAutoInvestRepo$special$$inlined$map$2$2$1 = new RealCryptoAutoInvestRepo$special$$inlined$map$2$2$1(this, continuation);
                Object obj202 = realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.result;
                Object obj212 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realCryptoAutoInvestRepo$special$$inlined$map$2$2$1.label;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof RealCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1) {
                    realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1 = (RealCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1) continuation;
                    int i38 = realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.label;
                    if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.label = i38 - PKIFailureInfo.systemUnavail;
                        Object obj22 = realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.result;
                        Object obj23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            Triple triple = (Triple) obj;
                            if (triple != null) {
                                Long l6 = (Long) triple.second;
                                obj8 = new CryptoBalance$StablecoinBalance(l6 != null ? l6.longValue() : 0L, (String) triple.first);
                            }
                            realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj8, realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1) == obj23) {
                                break;
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj22);
                        }
                        break;
                    }
                }
                realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1 = new RealCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1(this, continuation);
                Object obj222 = realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.result;
                Object obj232 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realCryptoBalanceRepo$profileBasedStablecoin$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof RealCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1) {
                    realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1 = (RealCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1) continuation;
                    int i39 = realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.label;
                    if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.label = i39 - PKIFailureInfo.systemUnavail;
                        Object obj24 = realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.result;
                        Object obj25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj24);
                            Triple triple2 = (Triple) obj;
                            if (triple2 != null) {
                                String str4 = (String) triple2.first;
                                Long l7 = (Long) triple2.second;
                                obj7 = new CryptoBalance$BitcoinBalance(new BitcoinAmount(l7 != null ? l7.longValue() : 0L), str4, (Long) triple2.third);
                            }
                            realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj7, realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1) == obj25) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj24);
                        }
                        break;
                    }
                }
                realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1 = new RealCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1(this, continuation);
                Object obj242 = realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.result;
                Object obj252 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realCryptoBalanceRepo$profileBitcoinBalance$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1) {
                    realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1 = (RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1) continuation;
                    int i40 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.label;
                    if ((i40 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.label = i40 - PKIFailureInfo.systemUnavail;
                        Object obj26 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.result;
                        Object obj27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj26);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj28 : (List) obj) {
                                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj28;
                                if (balanceSnapshot.f1396type != BalanceSnapshot.Type.SECONDARY) {
                                    Money money2 = balanceSnapshot.balance;
                                    if ((money2 != null ? money2.currency_code : null) == CurrencyCode.XUS) {
                                        arrayList2.add(obj28);
                                    }
                                }
                            }
                            realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(arrayList2, realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1) == obj27) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj26);
                        }
                        break;
                    }
                }
                realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1 = new RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1(this, continuation);
                Object obj262 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.result;
                Object obj272 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1) {
                    realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1 = (RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1) continuation;
                    int i41 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.label;
                    if ((i41 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.label = i41 - PKIFailureInfo.systemUnavail;
                        Object obj29 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.result;
                        Object obj30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj29);
                            BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) CollectionsKt.firstOrNull((List) obj);
                            if (balanceSnapshot2 != null) {
                                Money money3 = balanceSnapshot2.balance;
                                if (money3 != null && (l = money3.amount) != null) {
                                    r5 = l.longValue();
                                }
                                String str5 = balanceSnapshot2.instrument_token;
                                str5.getClass();
                                obj6 = new CryptoBalance$StablecoinBalance(r5, str5);
                            }
                            realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj6, realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1) == obj30) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj29);
                        }
                        break;
                    }
                }
                realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1 = new RealCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1(this, continuation);
                Object obj292 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.result;
                Object obj302 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = realCryptoBalanceRepo$syncValueBasedStablecoin$$inlined$map$2$2$1.label;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof RealRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1) {
                    realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1 = (RealRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1) continuation;
                    int i42 = realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.label;
                    if ((i42 & PKIFailureInfo.systemUnavail) != 0) {
                        realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.label = i42 - PKIFailureInfo.systemUnavail;
                        Object obj31 = realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.result;
                        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj31);
                            Money money4 = (Money) obj;
                            Object valueOf = Boolean.valueOf(((money4 == null || (l2 = money4.amount) == null) ? 0L : l2.longValue()) > 0);
                            realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf, realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1) == obj32) {
                                break;
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj31);
                        }
                        break;
                    }
                }
                realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1 = new RealRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1(this, continuation);
                Object obj312 = realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.result;
                Object obj322 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realRestrictedBalanceStore$hasRestrictions$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof RealRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1) {
                    realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1 = (RealRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1) continuation;
                    int i43 = realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.label;
                    if ((i43 & PKIFailureInfo.systemUnavail) != 0) {
                        realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.label = i43 - PKIFailureInfo.systemUnavail;
                        Object obj33 = realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.result;
                        Object obj34 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj33);
                            RestrictionsData restrictionsData = (RestrictionsData) obj;
                            Object obj35 = restrictionsData != null ? restrictionsData.restricted_usd_svb_token : null;
                            realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj35, realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1) == obj34) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj33);
                        }
                        break;
                    }
                }
                realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1 = new RealRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1(this, continuation);
                Object obj332 = realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.result;
                Object obj342 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realRestrictedBalanceStore$restrictedBalanceToken$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof RealRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1) {
                    realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1 = (RealRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1) continuation;
                    int i44 = realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.label;
                    if ((i44 & PKIFailureInfo.systemUnavail) != 0) {
                        realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.label = i44 - PKIFailureInfo.systemUnavail;
                        Object obj36 = realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.result;
                        Object obj37 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj36);
                            RestrictionsData restrictionsData2 = (RestrictionsData) obj;
                            if (restrictionsData2 != null && (l3 = restrictionsData2.sum_of_usd_restrictions_amount_cents) != null) {
                                obj5 = new Money(l3, CurrencyCode.USD, 4);
                            }
                            realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj5, realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1) == obj37) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj36);
                        }
                        break;
                    }
                }
                realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1 = new RealRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1(this, continuation);
                Object obj362 = realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.result;
                Object obj372 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = realRestrictedBalanceStore$totalRestrictionsAmount$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof RealCryptoDisclosuresRepo$special$$inlined$map$1$2$1) {
                    realCryptoDisclosuresRepo$special$$inlined$map$1$2$1 = (RealCryptoDisclosuresRepo$special$$inlined$map$1$2$1) continuation;
                    int i45 = realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.label;
                    if ((i45 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.label = i45 - PKIFailureInfo.systemUnavail;
                        Object obj38 = realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.result;
                        Object obj39 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i14 = realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.label;
                        if (i14 != 0) {
                            SafeTrace.throwOnFailure(obj38);
                            Investing_settings investing_settings = (Investing_settings) obj;
                            Object obj40 = investing_settings != null ? investing_settings.crypto_disclosure_url : null;
                            realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj40, realCryptoDisclosuresRepo$special$$inlined$map$1$2$1) == obj39) {
                                break;
                            }
                        } else if (i14 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj38);
                        }
                        break;
                    }
                }
                realCryptoDisclosuresRepo$special$$inlined$map$1$2$1 = new RealCryptoDisclosuresRepo$special$$inlined$map$1$2$1(this, continuation);
                Object obj382 = realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.result;
                Object obj392 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i14 = realCryptoDisclosuresRepo$special$$inlined$map$1$2$1.label;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof RealBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1) {
                    realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1 = (RealBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1) continuation;
                    int i46 = realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.label;
                    if ((i46 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.label = i46 - PKIFailureInfo.systemUnavail;
                        Object obj41 = realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.result;
                        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i15 = realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.label;
                        if (i15 != 0) {
                            SafeTrace.throwOnFailure(obj41);
                            Object realBitcoinEligibilityStatusProvider = new RealBitcoinEligibilityStatusProvider((BalanceData) obj);
                            realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(realBitcoinEligibilityStatusProvider, realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1) == obj42) {
                                break;
                            }
                        } else if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj41);
                        }
                        break;
                    }
                }
                realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1 = new RealBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1(this, continuation);
                Object obj412 = realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.result;
                Object obj422 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i15 = realBitcoinEligibilityRepo$profileBase$$inlined$map$1$2$1.label;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof RealBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1) {
                    realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1 = (RealBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1) continuation;
                    int i47 = realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.label;
                    if ((i47 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.label = i47 - PKIFailureInfo.systemUnavail;
                        Object obj43 = realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.result;
                        Object obj44 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i16 = realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.label;
                        if (i16 != 0) {
                            SafeTrace.throwOnFailure(obj43);
                            Object realBitcoinEligibilityStatusProvider2 = new RealBitcoinEligibilityStatusProvider((CryptoEligibilities) obj);
                            realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(realBitcoinEligibilityStatusProvider2, realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1) == obj44) {
                                break;
                            }
                        } else if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj43);
                        }
                        break;
                    }
                }
                realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1 = new RealBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1(this, continuation);
                Object obj432 = realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.result;
                Object obj442 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i16 = realBitcoinEligibilityRepo$syncValueBased$$inlined$map$1$2$1.label;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof RealCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1) {
                    realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1 = (RealCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1) continuation;
                    int i48 = realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.label;
                    if ((i48 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.label = i48 - PKIFailureInfo.systemUnavail;
                        Object obj45 = realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.result;
                        Object obj46 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i17 = realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.label;
                        if (i17 != 0) {
                            SafeTrace.throwOnFailure(obj45);
                            List list3 = (List) obj;
                            ListIterator listIterator = list3.listIterator(list3.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj2 = listIterator.previous();
                                    CryptoPayrollPreference cryptoPayrollPreference = (CryptoPayrollPreference) obj2;
                                    if (cryptoPayrollPreference.source_currency != CurrencyCode.USD || cryptoPayrollPreference.target_currency != CurrencyCode.BTC) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CryptoPayrollPreference cryptoPayrollPreference2 = (CryptoPayrollPreference) obj2;
                            Object obj47 = cryptoPayrollPreference2 != null ? cryptoPayrollPreference2.allocation_bps : null;
                            realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj47, realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1) == obj46) {
                                break;
                            }
                        } else if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj45);
                        }
                        break;
                    }
                }
                realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1 = new RealCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1(this, continuation);
                Object obj452 = realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.result;
                Object obj462 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i17 = realCryptoPayrollProvider$bitcoinAllocationBps$$inlined$map$1$2$1.label;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof RealBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1) {
                    realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1 = (RealBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1) continuation;
                    int i49 = realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.label;
                    if ((i49 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.label = i49 - PKIFailureInfo.systemUnavail;
                        Object obj48 = realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.result;
                        Object obj49 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i18 = realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.label;
                        if (i18 != 0) {
                            SafeTrace.throwOnFailure(obj48);
                            JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                            Object obj50 = jurisdictionConfigManager$JurisdictionConfig2 != null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                            realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj50, realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1) == obj49) {
                                break;
                            }
                        } else if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj48);
                        }
                        break;
                    }
                }
                realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1 = new RealBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1(this, continuation);
                Object obj482 = realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.result;
                Object obj492 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i18 = realBitcoinPerformanceDataRepo$special$$inlined$map$1$2$1.label;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof BitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1) {
                    bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1 = (BitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1) continuation;
                    int i50 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.label;
                    if ((i50 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.label = i50 - PKIFailureInfo.systemUnavail;
                        Object obj51 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.result;
                        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i19 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.label;
                        if (i19 != 0) {
                            SafeTrace.throwOnFailure(obj51);
                            RealBitcoinProfile realBitcoinProfile = (RealBitcoinProfile) obj;
                            switch (realBitcoinProfile.$r8$classId) {
                                case 0:
                                    translateBitcoinDisplayUnit = WorkflowViewStateKt.translateBitcoinDisplayUnit(((CryptocurrencyProfile) realBitcoinProfile.profile).bitcoin_display_units);
                                    break;
                                default:
                                    translateBitcoinDisplayUnit = WorkflowViewStateKt.translateBitcoinDisplayUnit((BitcoinDisplayUnits) realBitcoinProfile.profile);
                                    break;
                            }
                            bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(translateBitcoinDisplayUnit, bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1) == obj52) {
                                break;
                            }
                        } else if (i19 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj51);
                        }
                        break;
                    }
                }
                bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1 = new BitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1(this, continuation);
                Object obj512 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.result;
                Object obj522 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i19 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$1$2$1.label;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof BitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1) {
                    bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1 = (BitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1) continuation;
                    int i51 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.label;
                    if ((i51 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.label = i51 - PKIFailureInfo.systemUnavail;
                        Object obj53 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.result;
                        Object obj54 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i20 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.label;
                        if (i20 != 0) {
                            SafeTrace.throwOnFailure(obj53);
                            BitcoinDisplayUnit bitcoinDisplayUnit = (BitcoinDisplayUnit) obj;
                            BitcoinDisplayUnit.Companion.getClass();
                            bitcoinDisplayUnit.getClass();
                            int ordinal = bitcoinDisplayUnit.ordinal();
                            if (ordinal == 0) {
                                obj3 = BitcoinDisplayUnits.BITCOIN;
                            } else if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                obj3 = BitcoinDisplayUnits.SATOSHIS;
                            }
                            bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj3, bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1) == obj54) {
                                break;
                            }
                        } else if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj53);
                        }
                        break;
                    }
                }
                bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1 = new BitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1(this, continuation);
                Object obj532 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.result;
                Object obj542 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i20 = bitcoinProfileRepoKt$displayUnitProto$$inlined$map$2$2$1.label;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof LegacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1) {
                    legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1 = (LegacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1) continuation;
                    int i52 = legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.label;
                    if ((i52 & PKIFailureInfo.systemUnavail) != 0) {
                        legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.label = i52 - PKIFailureInfo.systemUnavail;
                        Object obj55 = legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.result;
                        Object obj56 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i21 = legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.label;
                        if (i21 != 0) {
                            SafeTrace.throwOnFailure(obj55);
                            Object realBitcoinProfile2 = new RealBitcoinProfile((BitcoinDisplayUnits) obj);
                            legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(realBitcoinProfile2, legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1) == obj56) {
                                break;
                            }
                        } else if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj55);
                        }
                        break;
                    }
                }
                legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1 = new LegacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1(this, continuation);
                Object obj552 = legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.result;
                Object obj562 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i21 = legacyBitcoinProfile$Companion$getProfileFlow$$inlined$map$1$2$1.label;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof RealBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1) {
                    realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1 = (RealBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1) continuation;
                    int i53 = realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.label;
                    if ((i53 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.label = i53 - PKIFailureInfo.systemUnavail;
                        Object obj57 = realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.result;
                        Object obj58 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i22 = realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.label;
                        if (i22 != 0) {
                            SafeTrace.throwOnFailure(obj57);
                            Object realBitcoinProfile3 = new RealBitcoinProfile((CryptocurrencyProfile) obj);
                            realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(realBitcoinProfile3, realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1) == obj58) {
                                break;
                            }
                        } else if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj57);
                        }
                        break;
                    }
                }
                realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1 = new RealBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1(this, continuation);
                Object obj572 = realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.result;
                Object obj582 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i22 = realBitcoinProfileRepo$syncValueBased$$inlined$map$1$2$1.label;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof RealReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1) {
                    realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1 = (RealReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1) continuation;
                    int i54 = realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.label;
                    if ((i54 & PKIFailureInfo.systemUnavail) != 0) {
                        realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.label = i54 - PKIFailureInfo.systemUnavail;
                        Object obj59 = realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.result;
                        Object obj60 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i23 = realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.label;
                        if (i23 != 0) {
                            SafeTrace.throwOnFailure(obj59);
                            BtcP2pConversionBps btcP2pConversionBps = (BtcP2pConversionBps) obj;
                            long longValue = (btcP2pConversionBps == null || (l4 = btcP2pConversionBps.conversion_bps) == null) ? 0L : l4.longValue();
                            Object active = btcP2pConversionBps == null ? ReceiveP2PAsBitcoinState.Inactive.INSTANCE : longValue > 0 ? new ReceiveP2PAsBitcoinState.Active((int) (longValue / 100)) : ReceiveP2PAsBitcoinState.Paused.INSTANCE;
                            realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(active, realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1) == obj60) {
                                break;
                            }
                        } else if (i23 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj59);
                        }
                        break;
                    }
                }
                realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1 = new RealReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1(this, continuation);
                Object obj592 = realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.result;
                Object obj602 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i23 = realReceiveP2PAsBitcoinRepo$special$$inlined$map$1$2$1.label;
                if (i23 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof RealBitcoinRoundUpsRepo$special$$inlined$map$1$2$1) {
                    realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1 = (RealBitcoinRoundUpsRepo$special$$inlined$map$1$2$1) continuation;
                    int i55 = realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.label;
                    if ((i55 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.label = i55 - PKIFailureInfo.systemUnavail;
                        Object obj61 = realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.result;
                        Object obj62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i24 = realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.label;
                        if (i24 != 0) {
                            SafeTrace.throwOnFailure(obj61);
                            Object obj63 = ((PaymentHistoryConfig) obj).automated_investment_payment_types;
                            realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj63, realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1) == obj62) {
                                break;
                            }
                        } else if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj61);
                        }
                        break;
                    }
                }
                realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1 = new RealBitcoinRoundUpsRepo$special$$inlined$map$1$2$1(this, continuation);
                Object obj612 = realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.result;
                Object obj622 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i24 = realBitcoinRoundUpsRepo$special$$inlined$map$1$2$1.label;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof RealBitcoinRoundUpsRepo$special$$inlined$map$2$2$1) {
                    realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1 = (RealBitcoinRoundUpsRepo$special$$inlined$map$2$2$1) continuation;
                    int i56 = realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.label;
                    if ((i56 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.label = i56 - PKIFailureInfo.systemUnavail;
                        Object obj64 = realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.result;
                        Object obj65 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i25 = realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.label;
                        if (i25 != 0) {
                            SafeTrace.throwOnFailure(obj64);
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj66 : (List) obj) {
                                CashActivity cashActivity = (CashActivity) obj66;
                                if (cashActivity.is_bitcoin && cashActivity.investment_order_type == InvestmentOrderType.ROUNDUP_ORDER) {
                                    arrayList3.add(obj66);
                                }
                            }
                            realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(arrayList3, realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1) == obj65) {
                                break;
                            }
                        } else if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj64);
                        }
                        break;
                    }
                }
                realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1 = new RealBitcoinRoundUpsRepo$special$$inlined$map$2$2$1(this, continuation);
                Object obj642 = realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.result;
                Object obj652 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i25 = realBitcoinRoundUpsRepo$special$$inlined$map$2$2$1.label;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof RealBitcoinRoundUpsRepo$special$$inlined$map$3$2$1) {
                    realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1 = (RealBitcoinRoundUpsRepo$special$$inlined$map$3$2$1) continuation;
                    int i57 = realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.label;
                    if ((i57 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.label = i57 - PKIFailureInfo.systemUnavail;
                        Object obj67 = realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.result;
                        Object obj68 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i26 = realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.label;
                        if (i26 != 0) {
                            SafeTrace.throwOnFailure(obj67);
                            List list4 = (List) obj;
                            int size = list4.size();
                            Iterator it3 = list4.iterator();
                            long j = 0;
                            while (it3.hasNext()) {
                                Long l8 = ((CashActivity) it3.next()).amount;
                                j += l8 != null ? l8.longValue() : 0L;
                            }
                            Object bitcoinRoundUpsUsageStats = new BitcoinRoundUpsUsageStats(size, new Money(new Long(j), CurrencyCode.USD, 4));
                            realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(bitcoinRoundUpsUsageStats, realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1) == obj68) {
                                break;
                            }
                        } else if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj67);
                        }
                        break;
                    }
                }
                realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1 = new RealBitcoinRoundUpsRepo$special$$inlined$map$3$2$1(this, continuation);
                Object obj672 = realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.result;
                Object obj682 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i26 = realBitcoinRoundUpsRepo$special$$inlined$map$3$2$1.label;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof RealBitcoinConfigRepo$special$$inlined$map$1$2$1) {
                    realBitcoinConfigRepo$special$$inlined$map$1$2$1 = (RealBitcoinConfigRepo$special$$inlined$map$1$2$1) continuation;
                    int i58 = realBitcoinConfigRepo$special$$inlined$map$1$2$1.label;
                    if ((i58 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinConfigRepo$special$$inlined$map$1$2$1.label = i58 - PKIFailureInfo.systemUnavail;
                        Object obj69 = realBitcoinConfigRepo$special$$inlined$map$1$2$1.result;
                        Object obj70 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i27 = realBitcoinConfigRepo$special$$inlined$map$1$2$1.label;
                        if (i27 != 0) {
                            SafeTrace.throwOnFailure(obj69);
                            Object obj71 = ((Investing_settings) obj).bitcoin_investment_entity_token;
                            obj71.getClass();
                            realBitcoinConfigRepo$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj71, realBitcoinConfigRepo$special$$inlined$map$1$2$1) == obj70) {
                                break;
                            }
                        } else if (i27 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj69);
                        }
                        break;
                    }
                }
                realBitcoinConfigRepo$special$$inlined$map$1$2$1 = new RealBitcoinConfigRepo$special$$inlined$map$1$2$1(this, continuation);
                Object obj692 = realBitcoinConfigRepo$special$$inlined$map$1$2$1.result;
                Object obj702 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i27 = realBitcoinConfigRepo$special$$inlined$map$1$2$1.label;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof RealBitcoinConfigRepo$special$$inlined$map$2$2$1) {
                    realBitcoinConfigRepo$special$$inlined$map$2$2$1 = (RealBitcoinConfigRepo$special$$inlined$map$2$2$1) continuation;
                    int i59 = realBitcoinConfigRepo$special$$inlined$map$2$2$1.label;
                    if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinConfigRepo$special$$inlined$map$2$2$1.label = i59 - PKIFailureInfo.systemUnavail;
                        Object obj72 = realBitcoinConfigRepo$special$$inlined$map$2$2$1.result;
                        Object obj73 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i28 = realBitcoinConfigRepo$special$$inlined$map$2$2$1.label;
                        if (i28 != 0) {
                            SafeTrace.throwOnFailure(obj72);
                            Object obj74 = ((Investing_settings) obj).custom_order_configuration;
                            realBitcoinConfigRepo$special$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(obj74, realBitcoinConfigRepo$special$$inlined$map$2$2$1) == obj73) {
                                break;
                            }
                        } else if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj72);
                        }
                        break;
                    }
                }
                realBitcoinConfigRepo$special$$inlined$map$2$2$1 = new RealBitcoinConfigRepo$special$$inlined$map$2$2$1(this, continuation);
                Object obj722 = realBitcoinConfigRepo$special$$inlined$map$2$2$1.result;
                Object obj732 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i28 = realBitcoinConfigRepo$special$$inlined$map$2$2$1.label;
                if (i28 != 0) {
                }
            case 28:
                if (continuation instanceof RealBitcoinConfigRepo$special$$inlined$map$3$2$1) {
                    realBitcoinConfigRepo$special$$inlined$map$3$2$1 = (RealBitcoinConfigRepo$special$$inlined$map$3$2$1) continuation;
                    int i60 = realBitcoinConfigRepo$special$$inlined$map$3$2$1.label;
                    if ((i60 & PKIFailureInfo.systemUnavail) != 0) {
                        realBitcoinConfigRepo$special$$inlined$map$3$2$1.label = i60 - PKIFailureInfo.systemUnavail;
                        Object obj75 = realBitcoinConfigRepo$special$$inlined$map$3$2$1.result;
                        Object obj76 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i29 = realBitcoinConfigRepo$special$$inlined$map$3$2$1.label;
                        if (i29 != 0) {
                            SafeTrace.throwOnFailure(obj75);
                            Object obj77 = ((Investing_settings) obj).min_scheduled_btc_buy_amt;
                            realBitcoinConfigRepo$special$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(obj77, realBitcoinConfigRepo$special$$inlined$map$3$2$1) == obj76) {
                                break;
                            }
                        } else if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj75);
                        }
                        break;
                    }
                }
                realBitcoinConfigRepo$special$$inlined$map$3$2$1 = new RealBitcoinConfigRepo$special$$inlined$map$3$2$1(this, continuation);
                Object obj752 = realBitcoinConfigRepo$special$$inlined$map$3$2$1.result;
                Object obj762 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i29 = realBitcoinConfigRepo$special$$inlined$map$3$2$1.label;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof RealCryptoAddressRepo$profileBased$$inlined$map$1$2$1) {
                    realCryptoAddressRepo$profileBased$$inlined$map$1$2$1 = (RealCryptoAddressRepo$profileBased$$inlined$map$1$2$1) continuation;
                    int i61 = realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.label;
                    if ((i61 & PKIFailureInfo.systemUnavail) != 0) {
                        realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.label = i61 - PKIFailureInfo.systemUnavail;
                        Object obj78 = realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.result;
                        Object obj79 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i30 = realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.label;
                        if (i30 != 0) {
                            SafeTrace.throwOnFailure(obj78);
                            WalletAddressForCurrency walletAddressForCurrency = (WalletAddressForCurrency) obj;
                            if (walletAddressForCurrency != null && (str = walletAddressForCurrency.wallet_address) != null) {
                                obj4 = new CryptoAddress$BitcoinAddress(str);
                            }
                            realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj4, realCryptoAddressRepo$profileBased$$inlined$map$1$2$1) == obj79) {
                                break;
                            }
                        } else if (i30 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj78);
                        }
                        break;
                    }
                }
                realCryptoAddressRepo$profileBased$$inlined$map$1$2$1 = new RealCryptoAddressRepo$profileBased$$inlined$map$1$2$1(this, continuation);
                Object obj782 = realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.result;
                Object obj792 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i30 = realCryptoAddressRepo$profileBased$$inlined$map$1$2$1.label;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealCryptoValueRepo$special$$inlined$map$1$2(FlowCollector flowCollector, RealCryptoAutoInvestRepo realCryptoAutoInvestRepo, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
    }
}
