package com.squareup.cash.recipients.backend.real;

import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientTokenizer;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1;
import com.squareup.cash.portfolio.graphs.GraphPresenterData;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.recipients.backend.api.Bucket;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$SuggestionType;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.portfolios.GetPortfoliosHistoricalDataResponse;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.squareup.protos.franklin.investing.resources.StatementType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ boolean $includeNonCashUsers$inlined;
    public final /* synthetic */ Object $query$inlined;
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object $supportedRegions$inlined;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ Object this$0;

    /* renamed from: com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
            return RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2(FlowCollector flowCollector, InvestingPortfolioPresenter investingPortfolioPresenter, HistoricalRange historicalRange, TextGeometricTransformKt textGeometricTransformKt, boolean z) {
        this.$this_unsafeFlow = flowCollector;
        this.$query$inlined = investingPortfolioPresenter;
        this.this$0 = historicalRange;
        this.$supportedRegions$inlined = textGeometricTransformKt;
        this.$includeNonCashUsers$inlined = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0330, code lost:
    
        if (r7.matchesFilter(r4) == true) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x034b, code lost:
    
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith(r7, (java.lang.String) kotlin.collections.ArraysKt___ArraysKt.first(r4), r10) == r10) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x034d, code lost:
    
        r4 = kotlin.collections.CollectionsKt__CollectionsJVMKt.listOf(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        Map mapOf;
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        Integer valueOf;
        Integer num;
        AccountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1 accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1;
        int i3;
        InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1 investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1;
        int i4;
        int i5 = this.$r8$classId;
        boolean z5 = this.$includeNonCashUsers$inlined;
        Object obj2 = this.$supportedRegions$inlined;
        Object obj3 = this.this$0;
        Object obj4 = this.$query$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i5) {
            case 0:
                String str2 = (String) obj4;
                Set set = (Set) obj2;
                RealRecipientSuggestionsProvider realRecipientSuggestionsProvider = (RealRecipientSuggestionsProvider) obj3;
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i6 = anonymousClass1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj5 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            RealRecipientSuggestionsProvider.Suggestions suggestions = (RealRecipientSuggestionsProvider.Suggestions) obj;
                            if (StringsKt.isBlank(str2)) {
                                List<RecipientSuggestionsProvider$RecipientWithAnalyticsData> list = suggestions.recent;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                for (RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData : list) {
                                    arrayList.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData, Bucket.SUGGESTED, null, null, null, null, null, null, null, null, null, 1048574)));
                                }
                                ArrayList access$applyClientSideFilters = RealRecipientSuggestionsProvider.access$applyClientSideFilters(realRecipientSuggestionsProvider, arrayList, z5, set);
                                List<RecipientSuggestionsProvider$RecipientWithAnalyticsData> list2 = suggestions.localContacts;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                for (RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData2 : list2) {
                                    arrayList2.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData2, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData2.analyticsData, Bucket.CONTACTS, null, null, null, null, null, null, null, null, null, 1048574)));
                                }
                                mapOf = MapsKt__MapsKt.mapOf(new Pair(RecipientSuggestionsProvider$SuggestionType.SUGGESTED, access$applyClientSideFilters), new Pair(RecipientSuggestionsProvider$SuggestionType.CONTACTS, CollectionsKt.sortedWith(RealRecipientSuggestionsProvider.access$applyClientSideFilters(realRecipientSuggestionsProvider, arrayList2, z5, set), ComparisonsKt__ComparisonsKt.compareBy(new RealSandboxer$$ExternalSyntheticLambda0(realRecipientSuggestionsProvider, 3), new OpenSourceKt$$ExternalSyntheticLambda8(22)))));
                                i2 = 1;
                            } else {
                                RecipientSuggestionsProvider$SuggestionType recipientSuggestionsProvider$SuggestionType = RecipientSuggestionsProvider$SuggestionType.RESULTS;
                                RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData3 = suggestions.exactMatch;
                                List list3 = suggestions.serverSuggestions;
                                List list4 = suggestions.recent;
                                List list5 = suggestions.localContacts;
                                String obj6 = str2.toString();
                                Locale locale = Locale.US;
                                locale.getClass();
                                String lowerCase = obj6.toLowerCase(locale);
                                lowerCase.getClass();
                                String[] strArr = RecipientTokenizer.tokenizeUniqueName(lowerCase);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = CollectionsKt.plus((Iterable) list5, (Collection) list4).iterator();
                                while (it.hasNext()) {
                                    RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData4 = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) it.next();
                                    RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData = recipientSuggestionsProvider$RecipientWithAnalyticsData4.analyticsData;
                                    Recipient recipient = recipientSuggestionsProvider$RecipientWithAnalyticsData4.recipient;
                                    Iterator it2 = it;
                                    String str3 = recipient.cashtag;
                                    String str4 = recipient.displayName;
                                    if (str3 != null) {
                                        if (strArr != null) {
                                            str = str4;
                                            z2 = true;
                                            if (recipient.matchesFilter(strArr)) {
                                                z3 = true;
                                                z4 = z3;
                                                boolean z6 = strArr == null && strArr.length == z2 && StringsKt__StringsJVMKt.startsWith(str3, (String) ArraysKt___ArraysKt.first(strArr), z2);
                                                if ((strArr != null || z4 || z6) && !linkedHashMap.containsKey(str3)) {
                                                    if (z4) {
                                                        if (z6) {
                                                            valueOf = Integer.valueOf(str3.length());
                                                            num = valueOf;
                                                        }
                                                        num = null;
                                                    } else {
                                                        if (str != null) {
                                                            valueOf = Integer.valueOf(str.length());
                                                            num = valueOf;
                                                        }
                                                        num = null;
                                                    }
                                                    linkedHashMap.put(str3, RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData4, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientAnalyticsData, null, null, null, null, null, null, null, num, null, null, 1047551)));
                                                }
                                            }
                                        } else {
                                            str = str4;
                                            z2 = true;
                                        }
                                        z3 = false;
                                        z4 = z3;
                                        if (strArr == null) {
                                        }
                                        if (strArr != null) {
                                        }
                                        if (z4) {
                                        }
                                        linkedHashMap.put(str3, RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData4, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientAnalyticsData, null, null, null, null, null, null, null, num, null, null, 1047551)));
                                    } else if (strArr == null || recipient.matchesFilter(strArr)) {
                                        arrayList3.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData4, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientAnalyticsData, null, null, null, null, null, null, null, str4 != null ? Integer.valueOf(str4.length()) : null, null, null, 1047551)));
                                    }
                                    it = it2;
                                }
                                Collection values = linkedHashMap.values();
                                values.getClass();
                                ArrayList plus = CollectionsKt.plus((Iterable) arrayList3, values);
                                if (strArr != null) {
                                    if (recipientSuggestionsProvider$RecipientWithAnalyticsData3 != null && (r7 = recipientSuggestionsProvider$RecipientWithAnalyticsData3.recipient) != null) {
                                        z = true;
                                        break;
                                    } else {
                                        z = true;
                                    }
                                    if (strArr.length == z) {
                                        if (recipientSuggestionsProvider$RecipientWithAnalyticsData3 != null) {
                                            Recipient recipient2 = recipientSuggestionsProvider$RecipientWithAnalyticsData3.recipient;
                                            if (recipient2 != null) {
                                                String str5 = recipient2.cashtag;
                                                if (str5 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                Collection collection = EmptyList.INSTANCE;
                                ArrayList plus2 = CollectionsKt.plus((Iterable) list3, (Collection) CollectionsKt.plus((Iterable) plus, collection));
                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus2, 10));
                                Iterator it3 = plus2.iterator();
                                while (it3.hasNext()) {
                                    RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData5 = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) it3.next();
                                    arrayList4.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData5, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData5.analyticsData, Bucket.SEARCH, null, null, null, null, null, null, null, null, null, 1048574)));
                                }
                                mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(recipientSuggestionsProvider$SuggestionType, RealRecipientSuggestionsProvider.access$applyClientSideFilters(realRecipientSuggestionsProvider, arrayList4, z5, set)));
                                i2 = 1;
                            }
                            anonymousClass1.label = i2;
                            if (flowCollector.emit(mapOf, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj52 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                break;
            case 1:
                String str6 = (String) obj4;
                AndroidStringManager androidStringManager = ((AccountDocumentsPresenter) obj3).stringManager;
                if (continuation instanceof AccountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1) {
                    accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1 = (AccountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1) continuation;
                    int i7 = accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj7 = accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj7);
                            String str7 = (String) obj;
                            if (z5 && str7 != null) {
                                str6 = str7;
                            }
                            ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new AccountDocumentsViewModel.DocumentModel.HeaderModel(androidStringManager.get(R.string.stock_documents_type_selection_header)));
                            mutableListOf.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager.get(R.string.documents_type_tax_form), new AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload(StatementType.STOCK_TAX_FORM)));
                            mutableListOf.add(new AccountDocumentsViewModel.DocumentModel.SectionModel(androidStringManager.get(R.string.documents_type_stock_monthly_statement), new AccountDocumentsViewEvent$SectionPayload$TypeSelectionPayload(StatementType.STOCK_MONTHLY_STATEMENT)));
                            mutableListOf.add(new AccountDocumentsViewModel.DocumentModel.DisclosureModel(str6));
                            AccountDocumentsViewModel accountDocumentsViewModel = new AccountDocumentsViewModel((String) obj2, mutableListOf, (StatementType) null, (String) null, 28);
                            accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(accountDocumentsViewModel, accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj7);
                        }
                        break;
                    }
                }
                accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1 = new AccountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1(this, continuation);
                Object obj72 = accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = accountDocumentsPresenter$stockDocumentTypeSelectionViewModel$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
            default:
                if (continuation instanceof InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1) {
                    investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1 = (InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1) continuation;
                    int i8 = investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj8 = investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj8);
                            GraphPresenterData presenterDataFor = ((InvestingPortfolioPresenter) obj4).graphCalculator.presenterDataFor((GetPortfoliosHistoricalDataResponse) ((PolledData) obj).value, (HistoricalRange) obj3, (TextGeometricTransformKt) obj2, this.$includeNonCashUsers$inlined, new Float(RecyclerView.DECELERATION_RATE));
                            if (presenterDataFor != null) {
                                investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.label = 1;
                                if (flowCollector.emit(presenterDataFor, investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj8);
                        }
                        break;
                    }
                }
                investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1 = new InvestingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1(this, continuation);
                Object obj82 = investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = investingPortfolioPresenter$graphModels$lambda$1$$inlined$mapNotNull$1$2$1.label;
                if (i4 != 0) {
                }
        }
        return Unit.INSTANCE;
    }

    public RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2(FlowCollector flowCollector, String str, RealRecipientSuggestionsProvider realRecipientSuggestionsProvider, boolean z, Set set) {
        this.$this_unsafeFlow = flowCollector;
        this.$query$inlined = str;
        this.this$0 = realRecipientSuggestionsProvider;
        this.$includeNonCashUsers$inlined = z;
        this.$supportedRegions$inlined = set;
    }

    public RealRecipientSuggestionsProvider$sections$lambda$1$$inlined$map$1$2(FlowCollector flowCollector, boolean z, String str, AccountDocumentsPresenter accountDocumentsPresenter, String str2) {
        this.$this_unsafeFlow = flowCollector;
        this.$includeNonCashUsers$inlined = z;
        this.$query$inlined = str;
        this.this$0 = accountDocumentsPresenter;
        this.$supportedRegions$inlined = str2;
    }
}
