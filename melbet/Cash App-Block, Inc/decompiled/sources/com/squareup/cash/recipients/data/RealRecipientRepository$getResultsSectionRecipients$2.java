package com.squareup.cash.recipients.data;

import androidx.core.graphics.drawable.DrawableCompat;
import app.cash.api.ApiResult;
import app.cash.zipline.loader.FastCodeUpdatesKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorCustomer;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchRequest;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact;
import com.squareup.protos.cash.customersearch.api.RecipientSelectorSearchResponse$ResultSource$Source$ServerResults;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecipientRepository$getResultsSectionRecipients$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Set $allowlistedTokens;
    public final /* synthetic */ List $contactsNotOnCash;
    public final /* synthetic */ List $contactsOnCash;
    public final /* synthetic */ String $externalId;
    public final /* synthetic */ List $favorites;
    public final /* synthetic */ ArrayList $favoritesIds;
    public final /* synthetic */ boolean $includeBusinessAccounts;
    public final /* synthetic */ boolean $includeNonCashUsers;
    public final /* synthetic */ boolean $includePlaceholders;
    public final /* synthetic */ String $query;
    public final /* synthetic */ String $searchType;
    public Ref$ObjectRef L$0;
    public Ref$BooleanRef L$1;
    public CustomerSearchClientService L$2;
    public int label;
    public final /* synthetic */ RealRecipientRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecipientRepository$getResultsSectionRecipients$2(ArrayList arrayList, RealRecipientRepository realRecipientRepository, String str, String str2, List list, List list2, String str3, List list3, boolean z, boolean z2, boolean z3, Set set, Continuation continuation) {
        super(2, continuation);
        this.$favoritesIds = arrayList;
        this.this$0 = realRecipientRepository;
        this.$query = str;
        this.$externalId = str2;
        this.$favorites = list;
        this.$contactsOnCash = list2;
        this.$searchType = str3;
        this.$contactsNotOnCash = list3;
        this.$includePlaceholders = z;
        this.$includeBusinessAccounts = z2;
        this.$includeNonCashUsers = z3;
        this.$allowlistedTokens = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealRecipientRepository$getResultsSectionRecipients$2(this.$favoritesIds, this.this$0, this.$query, this.$externalId, this.$favorites, this.$contactsOnCash, this.$searchType, this.$contactsNotOnCash, this.$includePlaceholders, this.$includeBusinessAccounts, this.$includeNonCashUsers, this.$allowlistedTokens, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealRecipientRepository$getResultsSectionRecipients$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e6, code lost:
    
        if (r0 == false) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x036e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        Object buildRecipientSelectorSearchRequest$data_impl;
        ArrayList arrayList;
        Ref$ObjectRef ref$ObjectRef;
        CustomerSearchClientService customerSearchClientService;
        Object recipientSelectorSearch;
        Ref$BooleanRef ref$BooleanRef2;
        boolean z;
        ArrayList arrayList2;
        List list;
        ArrayList arrayList3;
        RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite;
        List list2;
        boolean z2;
        int i;
        boolean z3;
        ArrayList arrayList4;
        Ref$ObjectRef ref$ObjectRef2;
        String str;
        List list3;
        RealRecipientRepository realRecipientRepository;
        ArrayList arrayList5;
        Set set;
        String str2;
        ArrayList arrayList6;
        Ref$ObjectRef ref$ObjectRef3;
        int i2;
        Set set2;
        int i3;
        ArrayList arrayList7;
        Recipient recipient;
        Object obj2;
        String str3;
        RecipientSelectorSearchResponse.LocalFavoriteResults localFavoriteResults;
        List list4;
        RecipientSelectorSearchResponse.LocalSyncedCustomerResults localSyncedCustomerResults;
        RecipientSelectorSearchResponse.ServerResults serverResults;
        List list5;
        RealRecipientRepository realRecipientRepository2;
        Set set3;
        List list6;
        Iterable iterable;
        Iterator it;
        RecipientSelectorSearchResponse.Section section;
        Set set4;
        ArrayList arrayList8;
        Throwable th;
        Recipient transform;
        boolean z4;
        RealRecipientRepository$getResultsSectionRecipients$2 realRecipientRepository$getResultsSectionRecipients$2 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = realRecipientRepository$getResultsSectionRecipients$2.label;
        List list7 = realRecipientRepository$getResultsSectionRecipients$2.$contactsOnCash;
        RealRecipientRepository realRecipientRepository3 = realRecipientRepository$getResultsSectionRecipients$2.this$0;
        ArrayList arrayList9 = realRecipientRepository$getResultsSectionRecipients$2.$favoritesIds;
        Throwable th2 = null;
        if (i4 == 0) {
            Ref$ObjectRef m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(obj);
            m.element = arrayList9;
            ref$BooleanRef = new Ref$BooleanRef();
            CustomerSearchClientService customerSearchClientService2 = realRecipientRepository3.api;
            realRecipientRepository$getResultsSectionRecipients$2.L$0 = m;
            realRecipientRepository$getResultsSectionRecipients$2.L$1 = ref$BooleanRef;
            realRecipientRepository$getResultsSectionRecipients$2.L$2 = customerSearchClientService2;
            realRecipientRepository$getResultsSectionRecipients$2.label = 1;
            buildRecipientSelectorSearchRequest$data_impl = realRecipientRepository3.buildRecipientSelectorSearchRequest$data_impl(realRecipientRepository$getResultsSectionRecipients$2.$query, realRecipientRepository$getResultsSectionRecipients$2.$externalId, arrayList9, realRecipientRepository$getResultsSectionRecipients$2.$favorites, list7, realRecipientRepository$getResultsSectionRecipients$2);
            arrayList = arrayList9;
            if (buildRecipientSelectorSearchRequest$data_impl != coroutineSingletons) {
                ref$ObjectRef = m;
                customerSearchClientService = customerSearchClientService2;
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$BooleanRef ref$BooleanRef3 = realRecipientRepository$getResultsSectionRecipients$2.L$1;
            Ref$ObjectRef ref$ObjectRef4 = realRecipientRepository$getResultsSectionRecipients$2.L$0;
            SafeTrace.throwOnFailure(obj);
            ref$ObjectRef = ref$ObjectRef4;
            arrayList = arrayList9;
            ref$BooleanRef2 = ref$BooleanRef3;
            recipientSelectorSearch = obj;
            ApiResult apiResult = (ApiResult) recipientSelectorSearch;
            RecipientSelectorSearchResponse recipientSelectorSearchResponse = (RecipientSelectorSearchResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
            z = realRecipientRepository3.mlRecipientSearchEnabled;
            List list8 = realRecipientRepository$getResultsSectionRecipients$2.$contactsNotOnCash;
            String str4 = realRecipientRepository$getResultsSectionRecipients$2.$searchType;
            boolean z5 = realRecipientRepository$getResultsSectionRecipients$2.$includePlaceholders;
            if (z) {
                RealRecipientRepository realRecipientRepository4 = realRecipientRepository3;
                arrayList2 = null;
                ArrayList arrayList10 = arrayList;
                List list9 = list8;
                if (recipientSelectorSearchResponse != null && (list = recipientSelectorSearchResponse.sections) != null) {
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        RecipientSelectorSearchResponse.Section section2 = (RecipientSelectorSearchResponse.Section) it2.next();
                        Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
                        List list10 = list7;
                        ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                        Iterator it3 = list10.iterator();
                        while (it3.hasNext()) {
                            String str5 = ((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it3.next()).recipient.customerId;
                            str5.getClass();
                            arrayList12.add(str5);
                        }
                        ref$ObjectRef5.element = arrayList12;
                        List list11 = section2.results;
                        ArrayList arrayList13 = new ArrayList();
                        Iterator it4 = list11.iterator();
                        while (it4.hasNext()) {
                            FastCodeUpdatesKt fastCodeUpdatesKt = ((RecipientSelectorSearchResponse.ResultSource) it4.next()).source;
                            RecipientSelectorSearchResponse$ResultSource$Source$ServerResults recipientSelectorSearchResponse$ResultSource$Source$ServerResults = fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$ServerResults ? (RecipientSelectorSearchResponse$ResultSource$Source$ServerResults) fastCodeUpdatesKt : null;
                            List list12 = (recipientSelectorSearchResponse$ResultSource$Source$ServerResults == null || (serverResults = recipientSelectorSearchResponse$ResultSource$Source$ServerResults.value) == null) ? null : serverResults.results;
                            RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact recipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact = fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact ? (RecipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact) fastCodeUpdatesKt : null;
                            List list13 = (recipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact == null || (localSyncedCustomerResults = recipientSelectorSearchResponse$ResultSource$Source$LocalSyncedContact.value) == null) ? null : localSyncedCustomerResults.results;
                            RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook recipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook = fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook ? (RecipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook) fastCodeUpdatesKt : null;
                            Iterator it5 = it2;
                            RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite2 = fastCodeUpdatesKt instanceof RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite ? (RecipientSelectorSearchResponse$ResultSource$Source$LocalFavorite) fastCodeUpdatesKt : null;
                            if (recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite2 == null || (localFavoriteResults = recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite2.value) == null || (list4 = localFavoriteResults.results) == null) {
                                recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite = recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite2;
                                list2 = list7;
                                z2 = z5;
                                i = 10;
                            } else {
                                List list14 = list4;
                                recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite = recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite2;
                                list2 = list7;
                                z2 = z5;
                                i = 10;
                                ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list14, 10));
                                Iterator it6 = list14.iterator();
                                while (it6.hasNext()) {
                                    String str6 = ((RecipientSelectorCustomer) it6.next()).token;
                                    str6.getClass();
                                    arrayList14.add(str6);
                                }
                                ref$ObjectRef.element = arrayList14;
                            }
                            if (ref$BooleanRef2.element || recipientSelectorSearchResponse$ResultSource$Source$LocalFavorite == null) {
                                z3 = true;
                            } else {
                                z3 = true;
                                ref$BooleanRef2.element = true;
                            }
                            String str7 = realRecipientRepository$getResultsSectionRecipients$2.$query;
                            Set set5 = realRecipientRepository$getResultsSectionRecipients$2.$allowlistedTokens;
                            if (list12 != null) {
                                List list15 = (List) ref$ObjectRef5.element;
                                Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef5;
                                String str8 = section2.title;
                                int size = list12.size();
                                str7.getClass();
                                set5.getClass();
                                ArrayList arrayList15 = new ArrayList();
                                ArrayList arrayList16 = arrayList13;
                                int i5 = 0;
                                for (Object obj3 : list12) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    RecipientSelectorCustomer recipientSelectorCustomer = (RecipientSelectorCustomer) obj3;
                                    if (list15 != null) {
                                        Iterator it7 = list15.iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                set = set5;
                                                str3 = 0;
                                                break;
                                            }
                                            str3 = it7.next();
                                            set = set5;
                                            if (Intrinsics.areEqual((String) str3, recipientSelectorCustomer.token)) {
                                                break;
                                            }
                                            set5 = set;
                                        }
                                        str2 = str3;
                                    } else {
                                        set = set5;
                                        str2 = null;
                                    }
                                    if (str2 == null) {
                                        Iterator it8 = list9.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            Object next = it8.next();
                                            Iterator it9 = it8;
                                            obj2 = next;
                                            if (Intrinsics.areEqual(((RecipientSuggestionsProvider$RecipientWithAnalyticsData) next).recipient.customerId, recipientSelectorCustomer.token)) {
                                                break;
                                            }
                                            it8 = it9;
                                        }
                                        if (obj2 == null) {
                                            if (!z2) {
                                                RecipientSelectorCustomer.Metadata metadata = recipientSelectorCustomer.metadata;
                                                if (metadata != null ? Intrinsics.areEqual(metadata.is_cash_customer, Boolean.FALSE) : false) {
                                                    arrayList6 = arrayList16;
                                                    ref$ObjectRef3 = ref$ObjectRef6;
                                                    i2 = size;
                                                    recipient = null;
                                                    set2 = set;
                                                    i3 = 10;
                                                    arrayList7 = arrayList10;
                                                    if (recipient != null) {
                                                        arrayList15.add(recipient);
                                                    }
                                                    ref$ObjectRef6 = ref$ObjectRef3;
                                                    i = i3;
                                                    arrayList10 = arrayList7;
                                                    set5 = set2;
                                                    i5 = i6;
                                                    size = i2;
                                                    arrayList16 = arrayList6;
                                                }
                                            }
                                            arrayList6 = arrayList16;
                                            i2 = size;
                                            arrayList7 = arrayList10;
                                            ref$ObjectRef3 = ref$ObjectRef6;
                                            set2 = set;
                                            i3 = 10;
                                            recipient = DrawableCompat.transform(str4, str7, str8, i5, i2, recipientSelectorCustomer, SuggestionStrategy.REMOTE, arrayList7, set2);
                                            if (recipient != null) {
                                            }
                                            ref$ObjectRef6 = ref$ObjectRef3;
                                            i = i3;
                                            arrayList10 = arrayList7;
                                            set5 = set2;
                                            i5 = i6;
                                            size = i2;
                                            arrayList16 = arrayList6;
                                        }
                                    }
                                    arrayList6 = arrayList16;
                                    ref$ObjectRef3 = ref$ObjectRef6;
                                    i2 = size;
                                    set2 = set;
                                    i3 = 10;
                                    arrayList7 = arrayList10;
                                    recipient = null;
                                    if (recipient != null) {
                                    }
                                    ref$ObjectRef6 = ref$ObjectRef3;
                                    i = i3;
                                    arrayList10 = arrayList7;
                                    set5 = set2;
                                    i5 = i6;
                                    size = i2;
                                    arrayList16 = arrayList6;
                                }
                                arrayList4 = arrayList16;
                                ref$ObjectRef2 = ref$ObjectRef6;
                                arrayList5 = arrayList15;
                            } else {
                                arrayList4 = arrayList13;
                                ArrayList arrayList17 = arrayList10;
                                int i7 = i;
                                ref$ObjectRef2 = ref$ObjectRef5;
                                if (list13 != null) {
                                    List list16 = list13;
                                    ArrayList arrayList18 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list16, i7));
                                    Iterator it10 = list16.iterator();
                                    while (it10.hasNext()) {
                                        String str9 = ((RecipientSelectorCustomer) it10.next()).token;
                                        str9.getClass();
                                        arrayList18.add(str9);
                                    }
                                    ref$ObjectRef2.element = arrayList18;
                                    arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list16, i7));
                                    int i8 = 0;
                                    for (Object obj4 : list16) {
                                        int i9 = i8 + 1;
                                        if (i8 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            throw null;
                                        }
                                        RecipientSelectorCustomer recipientSelectorCustomer2 = (RecipientSelectorCustomer) obj4;
                                        RecipientSelectorCustomer.Metadata metadata2 = recipientSelectorCustomer2.metadata;
                                        SuggestionStrategy suggestionStrategy = metadata2 != null ? Intrinsics.areEqual(metadata2.is_linked_account, Boolean.TRUE) : false ? SuggestionStrategy.LINKED_ACCOUNT : SuggestionStrategy.CONTACTS_ON_CASH;
                                        ArrayList arrayList19 = arrayList5;
                                        arrayList19.add(DrawableCompat.transform(str4, str7, section2.title, i8, list13.size(), recipientSelectorCustomer2, suggestionStrategy, arrayList17, set5));
                                        arrayList5 = arrayList19;
                                        i8 = i9;
                                    }
                                    arrayList10 = arrayList17;
                                } else {
                                    arrayList10 = arrayList17;
                                    if (recipientSelectorSearchResponse$ResultSource$Source$LocalAddressBook != null) {
                                        str = str4;
                                        list3 = list9;
                                        realRecipientRepository = realRecipientRepository4;
                                        arrayList5 = DrawableCompat.transform(RealRecipientRepository.appendAnalytics$default(realRecipientRepository, list3, section2.title, SuggestionStrategy.CONTACTS_OFF_CASH, str7, str, 16), arrayList10, set5);
                                    } else {
                                        str = str4;
                                        list3 = list9;
                                        realRecipientRepository = realRecipientRepository4;
                                        arrayList5 = null;
                                    }
                                    if (arrayList5 == null) {
                                        arrayList4.add(arrayList5);
                                    }
                                    z5 = z2;
                                    ref$ObjectRef5 = ref$ObjectRef2;
                                    arrayList13 = arrayList4;
                                    realRecipientRepository4 = realRecipientRepository;
                                    list9 = list3;
                                    str4 = str;
                                    it2 = it5;
                                    list7 = list2;
                                    realRecipientRepository$getResultsSectionRecipients$2 = this;
                                }
                            }
                            str = str4;
                            list3 = list9;
                            realRecipientRepository = realRecipientRepository4;
                            if (arrayList5 == null) {
                            }
                            z5 = z2;
                            ref$ObjectRef5 = ref$ObjectRef2;
                            arrayList13 = arrayList4;
                            realRecipientRepository4 = realRecipientRepository;
                            list9 = list3;
                            str4 = str;
                            it2 = it5;
                            list7 = list2;
                            realRecipientRepository$getResultsSectionRecipients$2 = this;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt__IterablesKt.flatten(arrayList13), arrayList11);
                        realRecipientRepository$getResultsSectionRecipients$2 = this;
                        list9 = list9;
                        str4 = str4;
                        it2 = it2;
                    }
                    arrayList3 = arrayList11;
                }
                arrayList3 = arrayList2;
            } else {
                String str10 = realRecipientRepository$getResultsSectionRecipients$2.$query;
                str10.getClass();
                Set set6 = realRecipientRepository$getResultsSectionRecipients$2.$allowlistedTokens;
                set6.getClass();
                if (recipientSelectorSearchResponse == null || (list5 = recipientSelectorSearchResponse.sections) == null) {
                    arrayList2 = null;
                    arrayList3 = arrayList2;
                } else {
                    ArrayList arrayList20 = new ArrayList();
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        RecipientSelectorSearchResponse.Section section3 = (RecipientSelectorSearchResponse.Section) it11.next();
                        List list17 = section3.full_results;
                        ArrayList arrayList21 = new ArrayList();
                        int i10 = 0;
                        for (Object obj5 : list17) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                Throwable th3 = th2;
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw th3;
                            }
                            RecipientSelectorCustomer recipientSelectorCustomer3 = (RecipientSelectorCustomer) obj5;
                            if (z5) {
                                it = it11;
                            } else {
                                RecipientSelectorCustomer.Metadata metadata3 = recipientSelectorCustomer3.metadata;
                                if (metadata3 != null) {
                                    it = it11;
                                    z4 = Intrinsics.areEqual(metadata3.is_cash_customer, Boolean.FALSE);
                                } else {
                                    it = it11;
                                    z4 = false;
                                }
                            }
                            if (realRecipientRepository$getResultsSectionRecipients$2.$includeBusinessAccounts || !Intrinsics.areEqual(recipientSelectorCustomer3.is_business, Boolean.TRUE)) {
                                section = section3;
                                set4 = set6;
                                arrayList8 = arrayList21;
                                th = null;
                                transform = DrawableCompat.transform(str4, str10, section3.title, i10, section3.full_results.size(), recipientSelectorCustomer3, SuggestionStrategy.REMOTE, arrayList, set4);
                                ArrayList arrayList22 = arrayList;
                                if (transform == null) {
                                    arrayList8.add(transform);
                                }
                                section3 = section;
                                arrayList21 = arrayList8;
                                arrayList = arrayList22;
                                set6 = set4;
                                i10 = i11;
                                th2 = th;
                                it11 = it;
                            }
                            set4 = set6;
                            section = section3;
                            arrayList8 = arrayList21;
                            transform = null;
                            th = null;
                            ArrayList arrayList222 = arrayList;
                            if (transform == null) {
                            }
                            section3 = section;
                            arrayList21 = arrayList8;
                            arrayList = arrayList222;
                            set6 = set4;
                            i10 = i11;
                            th2 = th;
                            it11 = it;
                        }
                        Iterator it12 = it11;
                        Set set7 = set6;
                        Throwable th4 = th2;
                        RecipientSelectorSearchResponse.Section section4 = section3;
                        ArrayList arrayList23 = arrayList21;
                        ArrayList arrayList24 = arrayList;
                        if (realRecipientRepository$getResultsSectionRecipients$2.$includeNonCashUsers) {
                            String str11 = str4;
                            String str12 = str10;
                            List list18 = list8;
                            set3 = set7;
                            ArrayList appendAnalytics$default = RealRecipientRepository.appendAnalytics$default(realRecipientRepository3, list18, section4.title, SuggestionStrategy.CONTACTS_OFF_CASH, str12, str11, 16);
                            realRecipientRepository2 = realRecipientRepository3;
                            list6 = list18;
                            str10 = str12;
                            str4 = str11;
                            iterable = DrawableCompat.transform(appendAnalytics$default, arrayList24, set3);
                        } else {
                            realRecipientRepository2 = realRecipientRepository3;
                            set3 = set7;
                            list6 = list8;
                            iterable = EmptyList.INSTANCE;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus(iterable, (Collection) arrayList23), arrayList20);
                        set6 = set3;
                        list8 = list6;
                        arrayList = arrayList24;
                        realRecipientRepository3 = realRecipientRepository2;
                        th2 = th4;
                        it11 = it12;
                    }
                    arrayList3 = arrayList20;
                }
            }
            return new Triple(arrayList3, ref$ObjectRef.element, Boolean.valueOf(ref$BooleanRef2.element));
        }
        customerSearchClientService = realRecipientRepository$getResultsSectionRecipients$2.L$2;
        Ref$BooleanRef ref$BooleanRef4 = realRecipientRepository$getResultsSectionRecipients$2.L$1;
        ref$ObjectRef = realRecipientRepository$getResultsSectionRecipients$2.L$0;
        SafeTrace.throwOnFailure(obj);
        ref$BooleanRef = ref$BooleanRef4;
        arrayList = arrayList9;
        buildRecipientSelectorSearchRequest$data_impl = obj;
        realRecipientRepository$getResultsSectionRecipients$2.L$0 = ref$ObjectRef;
        realRecipientRepository$getResultsSectionRecipients$2.L$1 = ref$BooleanRef;
        realRecipientRepository$getResultsSectionRecipients$2.L$2 = null;
        realRecipientRepository$getResultsSectionRecipients$2.label = 2;
        recipientSelectorSearch = customerSearchClientService.recipientSelectorSearch((RecipientSelectorSearchRequest) buildRecipientSelectorSearchRequest$data_impl, realRecipientRepository$getResultsSectionRecipients$2);
        if (recipientSelectorSearch != coroutineSingletons) {
            ref$BooleanRef2 = ref$BooleanRef;
            ApiResult apiResult2 = (ApiResult) recipientSelectorSearch;
            RecipientSelectorSearchResponse recipientSelectorSearchResponse2 = (RecipientSelectorSearchResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
            z = realRecipientRepository3.mlRecipientSearchEnabled;
            List list82 = realRecipientRepository$getResultsSectionRecipients$2.$contactsNotOnCash;
            String str42 = realRecipientRepository$getResultsSectionRecipients$2.$searchType;
            boolean z52 = realRecipientRepository$getResultsSectionRecipients$2.$includePlaceholders;
            if (z) {
            }
            return new Triple(arrayList3, ref$ObjectRef.element, Boolean.valueOf(ref$BooleanRef2.element));
        }
        return coroutineSingletons;
    }
}
