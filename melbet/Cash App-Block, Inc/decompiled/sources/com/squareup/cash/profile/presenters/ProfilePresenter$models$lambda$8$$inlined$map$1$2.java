package com.squareup.cash.profile.presenters;

import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.db2.profile.DirectDepositAccount;
import com.squareup.cash.family.familyhub.backend.api.Dependent;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager$getDependent$$inlined$map$1$2$1;
import com.squareup.cash.fidesmo.api.FidesmoProvisioningData;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1;
import com.squareup.cash.google.pay.FranklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1;
import com.squareup.cash.google.pay.GooglePayProvisioningPayload;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager$withToken$$inlined$map$1$2$1;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1;
import com.squareup.cash.offers.db.OffersCollectionDetail;
import com.squareup.cash.permissions.AndroidPermissionChecker$create$1$denied$$inlined$filter$1$2$1;
import com.squareup.cash.pools.backend.real.RealPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ProfilePresenter$models$lambda$8$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ String $customerToken$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.profile.presenters.ProfilePresenter$models$lambda$8$$inlined$map$1$2$1, reason: invalid class name */
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
            return ProfilePresenter$models$lambda$8$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public ProfilePresenter$models$lambda$8$$inlined$map$1$2(FlowCollector flowCollector, RealDemandDepositAccountManager realDemandDepositAccountManager, String str) {
        this.$r8$classId = 4;
        this.$this_unsafeFlow = flowCollector;
        this.$customerToken$inlined = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1 localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1;
        int i2;
        AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1 accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1;
        int i3;
        AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1 accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1;
        int i4;
        RealDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1 realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1;
        int i5;
        RealFamilyAccountsManager$getDependent$$inlined$map$1$2$1 realFamilyAccountsManager$getDependent$$inlined$map$1$2$1;
        int i6;
        RealFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1 realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1;
        int i7;
        FranklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1;
        int i8;
        RealInstrumentManager$withToken$$inlined$map$1$2$1 realInstrumentManager$withToken$$inlined$map$1$2$1;
        int i9;
        RealOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1 realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1;
        int i10;
        AndroidPermissionChecker$create$1$denied$$inlined$filter$1$2$1 androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1;
        int i11;
        RealPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1 realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1;
        int i12;
        ProfilePresenter$models$lambda$10$$inlined$map$1$2$1 profilePresenter$models$lambda$10$$inlined$map$1$2$1;
        int i13;
        int i14 = this.$r8$classId;
        String str = this.$customerToken$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        Object obj2 = null;
        switch (i14) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i15 = anonymousClass1.label;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i15 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((Recipient) it.next()).customerId);
                            }
                            Boolean valueOf = Boolean.valueOf(arrayList.contains(str));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1) {
                    localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1 = (LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1) continuation;
                    int i16 = localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.label;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                        Object obj4 = localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            Set set = (Set) obj;
                            if (str != null && set.contains(str)) {
                                r4 = true;
                            }
                            Boolean valueOf2 = Boolean.valueOf(r4);
                            localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf2, localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1 = new LocalBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1(this, continuation);
                Object obj42 = localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = localBrandProfilePresenter$models$lambda$102$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1) {
                    accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1 = (AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1) continuation;
                    int i17 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.label;
                    if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                        Object obj5 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel(this.$customerToken$inlined, (List) obj, (StatementType) null, (String) null, 28);
                            accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel, accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1 = new AccountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1(this, continuation);
                Object obj52 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = accountDocumentsPresenter$statementsForMonthViewModel$$inlined$map$4$2$1.label;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1) {
                    accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1 = (AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1) continuation;
                    int i18 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.label;
                    if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                        Object obj6 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            AccountDocumentsViewModel accountDocumentsViewModel2 = new AccountDocumentsViewModel(this.$customerToken$inlined, (List) obj, (StatementType) null, (String) null, 28);
                            accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel2, accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj6);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1 = new AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1(this, continuation);
                Object obj62 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$3$2$1.label;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof RealDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1) {
                    realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1 = (RealDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1) continuation;
                    int i19 = realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.label;
                    if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                        realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                        Object obj7 = realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            DirectDepositAccount directDepositAccount = (DirectDepositAccount) obj;
                            if (directDepositAccount != null) {
                                String str2 = directDepositAccount.routing_number;
                                String str3 = directDepositAccount.account_number_prefix;
                                boolean z = directDepositAccount.is_placeholder;
                                String str4 = this.$customerToken$inlined;
                                obj2 = new com.squareup.protos.franklin.common.DirectDepositAccount(str2, str4, str3, Boolean.valueOf(z || str4 == null), directDepositAccount.explanation_text, null, directDepositAccount.display_complete_account_number, directDepositAccount.support_node_token, null, ByteString.EMPTY);
                            }
                            realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1) == coroutineSingletons6) {
                                break;
                            }
                        } else if (i5 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1 = new RealDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj72 = realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realDemandDepositAccountManager$getDemandDepositAccount$lambda$0$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof RealFamilyAccountsManager$getDependent$$inlined$map$1$2$1) {
                    realFamilyAccountsManager$getDependent$$inlined$map$1$2$1 = (RealFamilyAccountsManager$getDependent$$inlined$map$1$2$1) continuation;
                    int i20 = realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.label;
                    if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                        realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                        Object obj8 = realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            Iterator it2 = ((List) obj).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((Dependent) next).customerToken.equals(str)) {
                                        obj2 = next;
                                    }
                                }
                            }
                            realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, realFamilyAccountsManager$getDependent$$inlined$map$1$2$1) == coroutineSingletons7) {
                                break;
                            }
                        } else if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                realFamilyAccountsManager$getDependent$$inlined$map$1$2$1 = new RealFamilyAccountsManager$getDependent$$inlined$map$1$2$1(this, continuation);
                Object obj82 = realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = realFamilyAccountsManager$getDependent$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof RealFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1) {
                    realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1 = (RealFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1) continuation;
                    int i21 = realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.label;
                    if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                        realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            if (Intrinsics.areEqual(((FidesmoProvisioningData) obj).fidesmoId, str)) {
                                realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1) == coroutineSingletons8) {
                                    break;
                                }
                            }
                        } else if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj9);
                        }
                        break;
                    }
                }
                realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1 = new RealFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1(this, continuation);
                Object obj92 = realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realFidesmoClient$waitForProvisioningData$$inlined$filter$1$2$1.label;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof FranklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1) {
                    franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 = (FranklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1) continuation;
                    int i22 = franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label;
                    if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                        franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                        Object obj10 = franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            GooglePayProvisioningPayload.Success success = new GooglePayProvisioningPayload.Success(str, ((IssuedCardFactory.IssuedCard) obj).lastFour);
                            franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(success, franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1) == coroutineSingletons9) {
                                break;
                            }
                        } else if (i8 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj10);
                        }
                        break;
                    }
                }
                franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1 = new FranklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1(this, continuation);
                Object obj102 = franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = franklinGooglePayProvisioningGateway$provision$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof RealInstrumentManager$withToken$$inlined$map$1$2$1) {
                    realInstrumentManager$withToken$$inlined$map$1$2$1 = (RealInstrumentManager$withToken$$inlined$map$1$2$1) continuation;
                    int i23 = realInstrumentManager$withToken$$inlined$map$1$2$1.label;
                    if ((i23 & PKIFailureInfo.systemUnavail) != 0) {
                        realInstrumentManager$withToken$$inlined$map$1$2$1.label = i23 - PKIFailureInfo.systemUnavail;
                        Object obj11 = realInstrumentManager$withToken$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = realInstrumentManager$withToken$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            Iterator it3 = ((List) obj).iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    if (Intrinsics.areEqual(((Instrument) next2).token, str)) {
                                        obj2 = next2;
                                    }
                                }
                            }
                            realInstrumentManager$withToken$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(obj2, realInstrumentManager$withToken$$inlined$map$1$2$1) == coroutineSingletons10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj11);
                        }
                        break;
                    }
                }
                realInstrumentManager$withToken$$inlined$map$1$2$1 = new RealInstrumentManager$withToken$$inlined$map$1$2$1(this, continuation);
                Object obj112 = realInstrumentManager$withToken$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = realInstrumentManager$withToken$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof RealOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1) {
                    realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1 = (RealOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1) continuation;
                    int i24 = realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.label;
                    if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                        realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                        Object obj12 = realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            Pair pair = new Pair(str, (OffersCollectionDetail) obj);
                            realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(pair, realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1) == coroutineSingletons11) {
                                break;
                            }
                        } else if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj12);
                        }
                        break;
                    }
                }
                realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1 = new RealOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1(this, continuation);
                Object obj122 = realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = realOffersTabRepository$getCollectionResponseFromCache$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof AndroidPermissionChecker$create$1$denied$$inlined$filter$1$2$1) {
                    androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1 = (AndroidPermissionChecker$create$1$denied$$inlined$filter$1$2$1) continuation;
                    int i25 = androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.label;
                    if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                        androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                        Object obj13 = androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj13);
                            if (str.equals(obj)) {
                                androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.label = 1;
                                if (flowCollector.emit(obj, androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1) == coroutineSingletons12) {
                                    break;
                                }
                            }
                        } else if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj13);
                        }
                        break;
                    }
                }
                androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1 = new AndroidPermissionChecker$create$1$denied$$inlined$filter$1$2$1(this, continuation);
                Object obj132 = androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = androidPermissionChecker$create$1$denied$$inlined$filter$1$2$1.label;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof RealPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1) {
                    realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1 = (RealPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1) continuation;
                    int i26 = realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.label;
                    if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                        realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            Boolean valueOf3 = Boolean.valueOf(((Set) obj).contains(str));
                            realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf3, realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1) == coroutineSingletons13) {
                                break;
                            }
                        } else if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj14);
                        }
                        break;
                    }
                }
                realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1 = new RealPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1(this, continuation);
                Object obj142 = realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realPoolsRepository$hasSeenGoalMetAnimation$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
            default:
                if (continuation instanceof ProfilePresenter$models$lambda$10$$inlined$map$1$2$1) {
                    profilePresenter$models$lambda$10$$inlined$map$1$2$1 = (ProfilePresenter$models$lambda$10$$inlined$map$1$2$1) continuation;
                    int i27 = profilePresenter$models$lambda$10$$inlined$map$1$2$1.label;
                    if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                        profilePresenter$models$lambda$10$$inlined$map$1$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                        Object obj15 = profilePresenter$models$lambda$10$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i13 = profilePresenter$models$lambda$10$$inlined$map$1$2$1.label;
                        if (i13 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            Boolean valueOf4 = Boolean.valueOf(((Set) obj).contains(str));
                            profilePresenter$models$lambda$10$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(valueOf4, profilePresenter$models$lambda$10$$inlined$map$1$2$1) == coroutineSingletons14) {
                                break;
                            }
                        } else if (i13 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj15);
                        }
                        break;
                    }
                }
                profilePresenter$models$lambda$10$$inlined$map$1$2$1 = new ProfilePresenter$models$lambda$10$$inlined$map$1$2$1(this, continuation);
                Object obj152 = profilePresenter$models$lambda$10$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons142 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i13 = profilePresenter$models$lambda$10$$inlined$map$1$2$1.label;
                if (i13 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProfilePresenter$models$lambda$8$$inlined$map$1$2(FlowCollector flowCollector, String str, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$customerToken$inlined = str;
    }
}
