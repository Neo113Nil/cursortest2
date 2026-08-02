package com.squareup.cash.account.presenters.documents;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$RecordPayload$StandardPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$CategoryPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$YearPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.data.profile.documents.AccountStatementsManager$AccountStatementsInfo;
import com.squareup.cash.data.profile.documents.DocumentsManager$DocumentSection;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel;
import com.squareup.cash.data.profile.documents.ProfileDocumentModel$TitleNamingConvention$AppendName;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.cash.db2.profile.documents.DocumentCategory;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.JsonFeatureFlags$TaxesDocumentsTaxReturnsData;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.tax.DocumentsTaxReturnsConfiguration;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.Headers;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ AccountDocumentsPresenter this$0;

    /* renamed from: com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2$1, reason: invalid class name */
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
            return AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2.this.emit(null, this);
        }
    }

    public /* synthetic */ AccountDocumentsPresenter$taxFormsViewModel$$inlined$map$2$2(int i, AccountDocumentsPresenter accountDocumentsPresenter, FlowCollector flowCollector) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = accountDocumentsPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v28, types: [kotlin.collections.EmptyList] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1 accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1;
        int i2;
        AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1 accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1;
        int i3;
        List arrayList;
        String str;
        CoroutineSingletons coroutineSingletons;
        boolean z;
        boolean z2;
        List list;
        Object obj2;
        AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1 accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1;
        int i4;
        int i5 = this.$r8$classId;
        AccountDocumentsPresenter accountDocumentsPresenter = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i5) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i6 = anonymousClass1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ArrayList arrayList2 = new ArrayList();
                            for (Map.Entry entry : ((Map) obj).entrySet()) {
                                int intValue = ((Number) entry.getKey()).intValue();
                                List list2 = (List) entry.getValue();
                                Headers.Builder builder = new Headers.Builder(2);
                                builder.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(String.valueOf(intValue)));
                                List<ProfileDocumentModel> list3 = list2;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                for (ProfileDocumentModel profileDocumentModel : list3) {
                                    FillrWidgetFactory fillrWidgetFactory = profileDocumentModel.titleNamingConvention;
                                    String str2 = profileDocumentModel.name;
                                    if (fillrWidgetFactory instanceof ProfileDocumentModel$TitleNamingConvention$AppendName) {
                                        AndroidStringManager androidStringManager = accountDocumentsPresenter.stringManager;
                                        String str3 = ((ProfileDocumentModel$TitleNamingConvention$AppendName) fillrWidgetFactory).dependentName;
                                        str2.getClass();
                                        Object[] objArr = {str3, str2};
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        str2 = new MessageFormat(resources.getString(R.string.documents_full_name_dependents)).format(objArr);
                                        str2.getClass();
                                    }
                                    arrayList3.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(str2, new AccountDocumentsViewEvent$RecordPayload$StandardPayload(profileDocumentModel.token, profileDocumentModel.url, profileDocumentModel.emailForwardable, profileDocumentModel.category)));
                                }
                                builder.addSpread(arrayList3.toArray(new AccountDocumentsViewModel.DocumentModel.RecordModel[0]));
                                ArrayList arrayList4 = builder.namesAndValues;
                                CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__CollectionsKt.listOf(arrayList4.toArray(new AccountDocumentsViewModel.DocumentModel[arrayList4.size()])), arrayList2);
                            }
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(arrayList2, anonymousClass1) == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj32 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            case 1:
                if (continuation instanceof AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1) {
                    accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1 = (AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1) continuation;
                    int i7 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj4 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            String str4 = ((Boolean) obj).booleanValue() ? ((DocumentsTaxReturnsConfiguration) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) accountDocumentsPresenter.taxesDocumentsTaxReturnsDataProvider.featureFlagManager).peekCurrentValue(JsonFeatureFlags$TaxesDocumentsTaxReturnsData.INSTANCE)).value).category_text : null;
                            accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(str4, accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj4);
                        }
                        return Unit.INSTANCE;
                    }
                }
                accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1 = new AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1(this, continuation);
                Object obj42 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 2:
                AndroidStringManager androidStringManager2 = accountDocumentsPresenter.stringManager;
                if (continuation instanceof AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1) {
                    accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1 = (AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1) continuation;
                    int i8 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj5 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            AccountDocumentsPresenter.CategoryContent categoryContent = (AccountDocumentsPresenter.CategoryContent) obj;
                            AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo = categoryContent.accountStatementsInfo;
                            AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo2 = categoryContent.savingStatementsInfo;
                            boolean z3 = categoryContent.hasSavingsTaxDocuments;
                            AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo3 = categoryContent.payOverTimeStatementsInfo;
                            boolean z4 = categoryContent.hasAfterpayStatements;
                            boolean z5 = categoryContent.hasLegalDocuments;
                            List list4 = categoryContent.categories;
                            List<DocumentsManager$DocumentSection> list5 = categoryContent.documents;
                            String str5 = categoryContent.categoryName;
                            String str6 = categoryContent.taxReturnsTitle;
                            boolean z6 = categoryContent.showInvestingDocuments;
                            boolean z7 = categoryContent.showBitcoinDocuments;
                            AccountStatementsManager$AccountStatementsInfo accountStatementsManager$AccountStatementsInfo4 = categoryContent.cardFeesStatementsInfo;
                            boolean z8 = categoryContent.hasWagesDocuments;
                            boolean isEmpty = list4.isEmpty();
                            boolean isEmpty2 = list5.isEmpty();
                            boolean z9 = accountStatementsManager$AccountStatementsInfo.hasAccountStatements;
                            boolean z10 = accountStatementsManager$AccountStatementsInfo2.hasAccountStatements || z3;
                            boolean z11 = accountStatementsManager$AccountStatementsInfo3.hasAccountStatements;
                            boolean z12 = str6 != null;
                            if (z6 || z7 || z9 || z10 || z11 || !isEmpty || !isEmpty2 || z12 || z5 || z4 || z8) {
                                arrayList = new ArrayList();
                                if (z6 || z7 || !isEmpty || z9 || z10 || z11 || z12 || z5 || z4 || z8) {
                                    str = str5;
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(androidStringManager2.get(R.string.documents_category_header)));
                                } else {
                                    str = str5;
                                }
                                AccountStatementsManager$AccountStatementsInfo.MultipleAccounts multipleAccounts = AccountStatementsManager$AccountStatementsInfo.MultipleAccounts.INSTANCE;
                                boolean equals = accountStatementsManager$AccountStatementsInfo.equals(multipleAccounts);
                                boolean z13 = z10;
                                AccountStatementsManager$AccountStatementsInfo.NoAccounts noAccounts = AccountStatementsManager$AccountStatementsInfo.NoAccounts.INSTANCE;
                                AccountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload accountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload = AccountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload.INSTANCE;
                                if (equals) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_statements), accountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload));
                                    coroutineSingletons = coroutineSingletons4;
                                    z = z4;
                                    z2 = z5;
                                    list = list4;
                                } else if (accountStatementsManager$AccountStatementsInfo instanceof AccountStatementsManager$AccountStatementsInfo.SingleAccount) {
                                    z = z4;
                                    z2 = z5;
                                    AccountStatementsManager$AccountStatementsInfo.SingleAccount singleAccount = (AccountStatementsManager$AccountStatementsInfo.SingleAccount) accountStatementsManager$AccountStatementsInfo;
                                    list = list4;
                                    coroutineSingletons = coroutineSingletons4;
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_statements), new AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload(singleAccount.customerToken, singleAccount.statementType, androidStringManager2.get(R.string.documents_category_statements))));
                                } else {
                                    coroutineSingletons = coroutineSingletons4;
                                    z = z4;
                                    z2 = z5;
                                    list = list4;
                                    if (!accountStatementsManager$AccountStatementsInfo.equals(noAccounts)) {
                                        obj2 = null;
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return obj2;
                                    }
                                }
                                if (z13) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_savings), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.SAVINGS)));
                                }
                                if (accountStatementsManager$AccountStatementsInfo3.equals(multipleAccounts)) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_cash_app_afterpay), accountDocumentsViewEvent$SectionPayload$MultiStatementAccountPayload));
                                } else if (accountStatementsManager$AccountStatementsInfo3 instanceof AccountStatementsManager$AccountStatementsInfo.SingleAccount) {
                                    AccountStatementsManager$AccountStatementsInfo.SingleAccount singleAccount2 = (AccountStatementsManager$AccountStatementsInfo.SingleAccount) accountStatementsManager$AccountStatementsInfo3;
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_cash_app_afterpay), new AccountDocumentsViewEvent$SectionPayload$StatementAccountPayload(singleAccount2.customerToken, singleAccount2.statementType, androidStringManager2.get(R.string.documents_category_cash_app_afterpay))));
                                } else if (!accountStatementsManager$AccountStatementsInfo3.equals(noAccounts)) {
                                    obj2 = null;
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return obj2;
                                }
                                if (z6) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_stocks), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.STOCKS)));
                                }
                                if (z7) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_bitcoin), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.BITCOIN)));
                                }
                                if (z) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_afterpay), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.AFTERPAY)));
                                }
                                if (z2) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_legal), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.LEGAL)));
                                }
                                if (z12) {
                                    str6.getClass();
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(str6, new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.TAX_RETURNS)));
                                }
                                if (accountStatementsManager$AccountStatementsInfo4.hasAccountStatements) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_card_fees), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.CARD_FEES)));
                                }
                                if (z8) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager2.get(R.string.documents_category_wages), new AccountDocumentsViewEvent$SectionPayload$CategoryPayload(AccountDocumentsViewEvent.DocumentCategory.WAGES)));
                                }
                                List<DocumentCategory> list6 = list;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                for (DocumentCategory documentCategory : list6) {
                                    arrayList5.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(documentCategory.display_name, new AccountDocumentsViewEvent$SectionPayload$EntityCategoryPayload(documentCategory.category_id)));
                                }
                                arrayList.addAll(arrayList5);
                                for (DocumentsManager$DocumentSection documentsManager$DocumentSection : list5) {
                                    arrayList.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(documentsManager$DocumentSection.title));
                                    List<Document> list7 = documentsManager$DocumentSection.documents;
                                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                                    for (Document document : list7) {
                                        String str7 = document.title;
                                        String str8 = document.entity_id;
                                        String str9 = document.client_route;
                                        if (str9 == null) {
                                            str9 = document.url;
                                            str9.getClass();
                                        }
                                        arrayList6.add(new AccountDocumentsViewModel.DocumentModel.RecordModel(str7, new AccountDocumentsViewEvent$RecordPayload$StandardPayload(str8, str9, false, null)));
                                    }
                                    arrayList.addAll(arrayList6);
                                }
                            } else {
                                arrayList = EmptyList.INSTANCE;
                                coroutineSingletons = coroutineSingletons4;
                                str = str5;
                            }
                            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel(str, arrayList, (StatementType) null, (String) null, 28);
                            accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.label = 1;
                            CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                            if (flowCollector.emit(accountDocumentsViewModel, accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj5);
                        }
                        return Unit.INSTANCE;
                    }
                }
                accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1 = new AccountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1(this, continuation);
                Object obj52 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = accountDocumentsPresenter$documentCategoryViewModel$$inlined$map$3$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1) {
                    accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1 = (AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1) continuation;
                    int i9 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj6 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj6);
                            Set set = (Set) obj;
                            ArrayList arrayList7 = new ArrayList();
                            if (!set.isEmpty()) {
                                arrayList7.add(new AccountDocumentsViewModel.DocumentModel.HeaderModel(accountDocumentsPresenter.stringManager.get(R.string.stock_monthly_statements_year_title)));
                            }
                            Set set2 = set;
                            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                int intValue2 = ((Number) it.next()).intValue();
                                arrayList8.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(String.valueOf(intValue2), new AccountDocumentsViewEvent$SectionPayload$YearPayload(intValue2)));
                            }
                            CollectionsKt__MutableCollectionsKt.addAll(arrayList7, arrayList8.toArray(new AccountDocumentsViewModel.DocumentModel.SectionModel[0]));
                            accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(arrayList7, accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj6);
                        }
                        return Unit.INSTANCE;
                    }
                }
                accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1 = new AccountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1(this, continuation);
                Object obj62 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = accountDocumentsPresenter$statementsForYearViewModel$$inlined$map$2$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
        }
    }
}
