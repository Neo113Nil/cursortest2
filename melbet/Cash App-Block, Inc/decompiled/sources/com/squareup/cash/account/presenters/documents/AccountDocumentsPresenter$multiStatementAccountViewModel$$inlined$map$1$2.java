package com.squareup.cash.account.presenters.documents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$SavingsTaxDocumentsPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.db2.profile.documents.AvailableAccountStatement;
import com.squareup.cash.db2.profile.documents.CustomerStatementType;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.registrar.api.StatementType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatementType $statementType$inlined;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ String $title$inlined;
    public final /* synthetic */ AccountDocumentsPresenter this$0;

    /* renamed from: com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2$1, reason: invalid class name */
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
            return AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ AccountDocumentsPresenter$multiStatementAccountViewModel$$inlined$map$1$2(FlowCollector flowCollector, StatementType statementType, AccountDocumentsPresenter accountDocumentsPresenter, String str, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$statementType$inlined = statementType;
        this.this$0 = accountDocumentsPresenter;
        this.$title$inlined = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        AccountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1 accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        Integer num;
        zzko zzkoVar;
        StatementCoverage.Annual annual;
        zzko zzkoVar2;
        StatementCoverage.Monthly monthly;
        int i3 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        AccountDocumentsPresenter accountDocumentsPresenter = this.this$0;
        StatementType statementType = this.$statementType$inlined;
        switch (i3) {
            case 0:
                AndroidStringManager androidStringManager = accountDocumentsPresenter.stringManager;
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
                            ArrayList<CustomerStatementType> arrayList = new ArrayList();
                            ArrayList<CustomerStatementType> arrayList2 = new ArrayList();
                            for (Object obj3 : (List) obj) {
                                CustomerStatementType customerStatementType = (CustomerStatementType) obj3;
                                if (Intrinsics.areEqual(customerStatementType.is_sponsored_account, Boolean.TRUE) && Intrinsics.areEqual(customerStatementType.is_active_sponsored_account, Boolean.FALSE)) {
                                    arrayList.add(obj3);
                                } else {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (statementType == StatementType.SAVINGS_STATEMENT) {
                                arrayList3.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager.get(R.string.documents_type_tax_form), AccountDocumentsViewEvent$SectionPayload$SavingsTaxDocumentsPayload.INSTANCE));
                            }
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                            for (CustomerStatementType customerStatementType2 : arrayList2) {
                                String str = customerStatementType2.display_name;
                                str.getClass();
                                String str2 = customerStatementType2.customer_token;
                                StatementType statementType2 = customerStatementType2.statement_type;
                                String str3 = customerStatementType2.display_name;
                                str3.getClass();
                                arrayList4.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(str, new AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload(str2, statementType2, str3)));
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList4, arrayList3);
                            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (CustomerStatementType customerStatementType3 : arrayList) {
                                String str4 = customerStatementType3.display_name;
                                str4.getClass();
                                String str5 = customerStatementType3.customer_token;
                                StatementType statementType3 = customerStatementType3.statement_type;
                                String str6 = customerStatementType3.display_name;
                                str6.getClass();
                                arrayList5.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(str4, new AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload(str5, statementType3, str6)));
                            }
                            if (!arrayList.isEmpty()) {
                                arrayList3 = CollectionsKt.plus((Iterable) arrayList5, (Collection) CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new AccountDocumentsViewModel.DocumentModel.HeaderModel(androidStringManager.get(R.string.documents_inactive_dependent_account_statements_section_header))), (Collection) CollectionsKt.plus((Iterable) arrayList3, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new AccountDocumentsViewModel.DocumentModel.HeaderModel(androidStringManager.get(R.string.documents_normal_account_statements_section_header))))));
                            }
                            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel(this.$title$inlined, arrayList3, (com.squareup.protos.franklin.investing.resources.StatementType) null, (String) null, 28);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel, anonymousClass1) == coroutineSingletons) {
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
                break;
            default:
                AndroidStringManager androidStringManager2 = accountDocumentsPresenter.stringManager;
                if (continuation instanceof AccountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1 = (AccountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i5 = accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj4 = accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            List list = (List) obj;
                            ArrayList arrayList6 = new ArrayList();
                            list.getClass();
                            Comparator reversed = new SemanticsSortKt$special$$inlined$thenBy$1(new LinkedHashTreeMap.AnonymousClass1(8), 13).reversed();
                            reversed.getClass();
                            int i6 = 0;
                            for (AvailableAccountStatement availableAccountStatement : CollectionsKt.sortedWith(list, reversed)) {
                                availableAccountStatement.getClass();
                                StatementCoverage statementCoverage = availableAccountStatement.statementCoverage;
                                if (statementCoverage == null || (zzkoVar2 = statementCoverage.f1334type) == null || (monthly = CurveFit.getMonthly(zzkoVar2)) == null || (num = monthly.year) == null) {
                                    num = (statementCoverage == null || (zzkoVar = statementCoverage.f1334type) == null || (annual = CurveFit.getAnnual(zzkoVar)) == null) ? null : annual.year;
                                }
                                if (num != null && i6 != num.intValue()) {
                                    i6 = num.intValue();
                                    arrayList6.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(String.valueOf(num.intValue())));
                                }
                                String str7 = availableAccountStatement.display_name;
                                str7.getClass();
                                String str8 = availableAccountStatement.statement_token;
                                String str9 = availableAccountStatement.statement_url;
                                str9.getClass();
                                arrayList6.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(str7, new AccountDocumentsViewEvent$RecordPayload$ViewAccountStatementPayload(str9, str7, str8)));
                            }
                            if (!arrayList6.isEmpty() && statementType == StatementType.ACCOUNT_GENERAL_STATEMENT) {
                                arrayList6.add(new AccountDocumentsViewModel.DocumentModel.FooterModel(androidStringManager2.get(R.string.documents_account_statements_footer_label), androidStringManager2.get(R.string.documents_account_statements_footer_button), Recorder$$ExternalSyntheticOutline2.m$1(accountDocumentsPresenter.webPortalBaseUrl, androidStringManager2.get(R.string.documents_account_statements_footer_button_url))));
                            }
                            AccountDocumentsViewModel accountDocumentsViewModel2 = new AccountDocumentsViewModel(this.$title$inlined, arrayList6, (com.squareup.protos.franklin.investing.resources.StatementType) null, AccountDocumentsPresenter$statementsViewModel$1$WhenMappings.$EnumSwitchMapping$0[statementType.ordinal()] == 1 ? androidStringManager2.get(R.string.documents_empty_state_description_savings_statements) : null, 12);
                            accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel2, accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1 = new AccountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj42 = accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = accountDocumentsPresenter$statementsViewModel$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
