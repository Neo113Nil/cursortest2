package com.squareup.cash.recipients.data;

import androidx.core.graphics.drawable.DrawableCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$SuggestionType;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.recipients.data.Section;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.android.Emails;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.Regions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecipientRepository$search$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ UUID $externalId;
    public final /* synthetic */ boolean $filterOutBlockedRecipients;
    public final /* synthetic */ boolean $includeBusinessAccounts;
    public final /* synthetic */ boolean $includeNonCashUsers;
    public final /* synthetic */ boolean $includePlaceholders;
    public final /* synthetic */ String $query;
    public final /* synthetic */ boolean $shouldIncludeStablecoinAddresses;
    public final /* synthetic */ boolean $sortFavoritesFirst;
    public final /* synthetic */ Region $userRegion;
    public int I$0;
    public /* synthetic */ Triple L$0;
    public /* synthetic */ BitcoinPayments.Stablecoin L$1;
    public List L$10;
    public Ref$ObjectRef L$11;
    public Ref$ObjectRef L$12;
    public List L$13;
    public List L$3;
    public Set L$4;
    public ArrayList L$5;
    public List L$6;
    public List L$7;
    public String L$8;
    public Ref$ObjectRef L$9;
    public int label;
    public final /* synthetic */ RealRecipientRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecipientRepository$search$1(RealRecipientRepository realRecipientRepository, String str, Region region, UUID uuid, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Continuation continuation) {
        super(3, continuation);
        this.this$0 = realRecipientRepository;
        this.$query = str;
        this.$userRegion = region;
        this.$externalId = uuid;
        this.$includePlaceholders = z;
        this.$includeBusinessAccounts = z2;
        this.$includeNonCashUsers = z3;
        this.$filterOutBlockedRecipients = z4;
        this.$sortFavoritesFirst = z5;
        this.$shouldIncludeStablecoinAddresses = z6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = this.$sortFavoritesFirst;
        boolean z2 = this.$shouldIncludeStablecoinAddresses;
        RealRecipientRepository$search$1 realRecipientRepository$search$1 = new RealRecipientRepository$search$1(this.this$0, this.$query, this.$userRegion, this.$externalId, this.$includePlaceholders, this.$includeBusinessAccounts, this.$includeNonCashUsers, this.$filterOutBlockedRecipients, z, z2, (Continuation) obj3);
        realRecipientRepository$search$1.L$0 = (Triple) obj;
        realRecipientRepository$search$1.L$1 = (BitcoinPayments.Stablecoin) obj2;
        return realRecipientRepository$search$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0622 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0363  */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.String, java.util.ArrayList, java.util.List, java.util.Set, kotlin.Triple, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v93, types: [int] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [com.squareup.cash.recipients.data.Recipient$Analytics] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.squareup.cash.recipients.data.Recipient$Analytics] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        Set set;
        int i;
        ArrayList arrayList;
        RealRecipientRepository realRecipientRepository;
        Iterable transform;
        List list2;
        List list3;
        boolean z;
        Throwable th2;
        List list4;
        String str2;
        Object withContext;
        List list5;
        Ref$ObjectRef ref$ObjectRef2;
        Set set2;
        List list6;
        List list7;
        Ref$ObjectRef ref$ObjectRef3;
        Iterator it;
        Ref$ObjectRef ref$ObjectRef4;
        Iterator it2;
        List list8;
        Object orderFavoriteRecipients$data_impl;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        List list9;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        ?? r36;
        ?? r35;
        ?? r5;
        Object access$getStablecoinClipboardRecipient;
        Ref$ObjectRef ref$ObjectRef7;
        Ref$ObjectRef ref$ObjectRef8;
        Object access$getStablecoinRecipients;
        boolean z2;
        List list10;
        ArrayList arrayList4;
        Iterator it4;
        List list11;
        Triple triple = this.L$0;
        BitcoinPayments.Stablecoin stablecoin = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        String str3 = this.$query;
        RealRecipientRepository realRecipientRepository2 = this.this$0;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            Map map = (Map) triple.first;
            List list12 = (List) triple.second;
            Set set3 = (Set) triple.third;
            List<Recipient> list13 = list12;
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list13, 10));
            for (Recipient recipient : list13) {
                String str4 = recipient.customerId;
                if (str4 == null && (str4 = recipient.lookupKey) == null) {
                    str4 = "";
                }
                arrayList5.add(str4);
            }
            List list14 = (List) map.get(RecipientSuggestionsProvider$SuggestionType.SUGGESTED);
            if (list14 == null) {
                list14 = EmptyList.INSTANCE;
            }
            list = (List) map.get(RecipientSuggestionsProvider$SuggestionType.CONTACTS);
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            str3.getClass();
            String normalize = Emails.normalize(str3);
            if (normalize != null && normalize.length() != 0) {
                str = "email";
            } else if (Cashtags.isCashtag(str3)) {
                str = "cashtag";
            } else {
                Region region = this.$userRegion;
                if (region == null) {
                    region = Region.USA;
                }
                str = PhoneNumbers.isValid(str3, Regions.toCountry(region).name()) ? "sms" : "full text";
            }
            ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = arrayList5;
            if (str3.length() > 0) {
                List list15 = (List) map.get(RecipientSuggestionsProvider$SuggestionType.RESULTS);
                if (list15 == null) {
                    list15 = EmptyList.INSTANCE;
                }
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : list15) {
                    List list16 = list14;
                    if (((RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj2).recipient.isCashCustomer) {
                        arrayList6.add(obj2);
                    } else {
                        arrayList7.add(obj2);
                    }
                    list14 = list16;
                }
                List list17 = list14;
                String valueOf = String.valueOf(this.$externalId);
                this.L$0 = null;
                this.L$1 = stablecoin;
                this.L$3 = list12;
                this.L$4 = set3;
                this.L$5 = arrayList5;
                this.L$6 = list17;
                this.L$7 = list;
                this.L$8 = str;
                this.L$9 = ref$ObjectRef;
                this.L$10 = list15;
                this.L$11 = null;
                this.L$12 = null;
                this.I$0 = 0;
                this.label = 1;
                CoroutineContext coroutineContext = realRecipientRepository2.ioDispatcher;
                i = 0;
                realRecipientRepository = realRecipientRepository2;
                String str5 = str;
                th2 = null;
                RealRecipientRepository$getResultsSectionRecipients$2 realRecipientRepository$getResultsSectionRecipients$2 = new RealRecipientRepository$getResultsSectionRecipients$2(arrayList5, realRecipientRepository, this.$query, valueOf, list12, arrayList6, str5, arrayList7, this.$includePlaceholders, this.$includeBusinessAccounts, this.$includeNonCashUsers, set3, null);
                arrayList = arrayList5;
                list4 = list12;
                str2 = str5;
                withContext = JobKt.withContext(coroutineContext, realRecipientRepository$getResultsSectionRecipients$2, this);
                if (withContext != coroutineSingletons) {
                    list5 = list15;
                    ref$ObjectRef2 = ref$ObjectRef;
                    set2 = set3;
                    list6 = list;
                    list7 = list17;
                }
                return coroutineSingletons;
            }
            List list18 = list14;
            th = null;
            set = set3;
            i = 0;
            String str6 = str;
            arrayList = arrayList5;
            List list19 = (List) map.get(RecipientSuggestionsProvider$SuggestionType.RESULTS);
            if (list19 == null) {
                list19 = EmptyList.INSTANCE;
            }
            realRecipientRepository = realRecipientRepository2;
            transform = DrawableCompat.transform(RealRecipientRepository.appendAnalytics$default(realRecipientRepository2, list19, null, SuggestionStrategy.REMOTE, this.$query, str6, 17), arrayList, set);
            list2 = list18;
            list3 = list12;
            z = false;
            ref$ObjectRef3 = new Ref$ObjectRef();
            List list20 = list2;
            List list21 = list2;
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list20, 10));
            it = list20.iterator();
            int i3 = i;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th;
                }
                RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = (RecipientSuggestionsProvider$RecipientWithAnalyticsData) next;
                Iterator it5 = it;
                com.squareup.cash.db.contacts.Recipient recipient2 = recipientSuggestionsProvider$RecipientWithAnalyticsData.recipient;
                Iterable iterable = transform;
                String str7 = recipient2.customerId;
                if (str7 == null) {
                    str7 = recipient2.lookupKey;
                }
                if (CollectionsKt.contains(arrayList, str7)) {
                    RecipientSuggestionsProvider$RecipientAnalyticsData recipientSuggestionsProvider$RecipientAnalyticsData = recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData;
                    GenerationStrategy generationStrategy = GenerationStrategy.RECENT;
                    recipientSuggestionsProvider$RecipientWithAnalyticsData = RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientAnalyticsData, null, null, null, null, null, null, null, null, SuggestionStrategy.FAVORITE, null, 1046525));
                }
                arrayList8.add(RecipientSuggestionsProvider$RecipientWithAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData, RecipientSuggestionsProvider$RecipientAnalyticsData.copy$default(recipientSuggestionsProvider$RecipientWithAnalyticsData.analyticsData, null, new Integer(i3), null, "SUGGESTED", new Integer(i3), new Integer(list21.size()), null, null, null, null, 1048123)));
                i3 = i4;
                it = it5;
                transform = iterable;
            }
            ArrayList transform2 = DrawableCompat.transform(arrayList8, arrayList, set);
            ref$ObjectRef3.element = transform2;
            ref$ObjectRef4 = new Ref$ObjectRef();
            Section.Type type2 = Section.Type.SUGGESTED;
            ref$ObjectRef4.element = RealRecipientRepository.access$enrichContactsWithAnalytics(realRecipientRepository, list, arrayList, set, transform2.size());
            Iterable iterable2 = transform;
            ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            it2 = iterable2.iterator();
            int i5 = i;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th;
                }
                Recipient recipient3 = (Recipient) next2;
                String str8 = recipient3.customerId;
                if (str8 == null) {
                    str8 = recipient3.lookupKey;
                }
                if (CollectionsKt.contains(arrayList, str8)) {
                    Recipient.Analytics analytics = recipient3.analytics;
                    if (analytics != null) {
                        GenerationStrategy generationStrategy2 = GenerationStrategy.RECENT;
                        SuggestionStrategy suggestionStrategy = SuggestionStrategy.CONTACTS_ON_CASH;
                        r35 = Recipient.Analytics.copy$default(analytics, null, null, null, null, 16775165);
                    } else {
                        r35 = th;
                    }
                    recipient3 = Recipient.copy$default(recipient3, null, null, null, null, null, null, r35, false, false, -1073741825, 3);
                }
                Recipient.Analytics analytics2 = recipient3.analytics;
                Iterator it6 = it2;
                if (analytics2 != null) {
                    arrayList3 = arrayList;
                    r36 = Recipient.Analytics.copy$default(analytics2, new Integer(((Collection) ref$ObjectRef4.element).size() + ((Collection) ref$ObjectRef3.element).size() + i5), "RESULTS", new Integer(i5), null, 16777019);
                } else {
                    arrayList3 = arrayList;
                    r36 = th;
                }
                arrayList9.add(Recipient.copy$default(recipient3, null, null, null, null, null, null, r36, false, false, -1073741825, 3));
                it2 = it6;
                i5 = i6;
                arrayList = arrayList3;
            }
            List list22 = (List) ref$ObjectRef3.element;
            boolean z3 = this.$filterOutBlockedRecipients;
            ref$ObjectRef3.element = RealRecipientRepository.filterBlockedIfNeeded(list22, z3);
            ref$ObjectRef4.element = RealRecipientRepository.filterBlockedIfNeeded((List) ref$ObjectRef4.element, z3);
            List filterBlockedIfNeeded = RealRecipientRepository.filterBlockedIfNeeded(arrayList9, z3);
            if (this.$sortFavoritesFirst) {
                if (!((Collection) ref$ObjectRef3.element).isEmpty() || !((Collection) ref$ObjectRef4.element).isEmpty()) {
                    Iterable iterable3 = (Iterable) ref$ObjectRef3.element;
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj3 : iterable3) {
                        if (((Recipient) obj3).isFavorited) {
                            arrayList10.add(obj3);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList10, 10));
                    Iterator it7 = arrayList10.iterator();
                    while (it7.hasNext()) {
                        Recipient recipient4 = (Recipient) it7.next();
                        String str9 = recipient4.customerId;
                        if (str9 == null && (str9 = recipient4.lookupKey) == null) {
                            str9 = "";
                        }
                        arrayList11.add(str9);
                    }
                    Iterable iterable4 = (Iterable) ref$ObjectRef4.element;
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj4 : iterable4) {
                        Recipient recipient5 = (Recipient) obj4;
                        String str10 = recipient5.customerId;
                        if (str10 == null && (str10 = recipient5.lookupKey) == null) {
                            str10 = "";
                        }
                        if (recipient5.isFavorited && !arrayList11.contains(str10)) {
                            arrayList12.add(obj4);
                        }
                    }
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        Object next3 = it8.next();
                        Recipient recipient6 = (Recipient) next3;
                        List list23 = filterBlockedIfNeeded;
                        String str11 = recipient6.customerId;
                        if (str11 == null && (str11 = recipient6.lookupKey) == null) {
                            str11 = "";
                        }
                        if (arrayList11.contains(str11)) {
                            arrayList2 = arrayList11;
                            it3 = it8;
                        } else {
                            arrayList2 = arrayList11;
                            it3 = it8;
                            ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList12, 10));
                            Iterator it9 = arrayList12.iterator();
                            while (it9.hasNext()) {
                                Recipient recipient7 = (Recipient) it9.next();
                                Iterator it10 = it9;
                                String str12 = recipient7.customerId;
                                if (str12 == null && (str12 = recipient7.lookupKey) == null) {
                                    str12 = "";
                                }
                                arrayList14.add(str12);
                                it9 = it10;
                            }
                            if (!arrayList14.contains(str11)) {
                                arrayList13.add(next3);
                            }
                        }
                        filterBlockedIfNeeded = list23;
                        arrayList11 = arrayList2;
                        it8 = it3;
                    }
                    List list24 = filterBlockedIfNeeded;
                    ArrayList plus = CollectionsKt.plus((Iterable) CollectionsKt.sortedWith(arrayList13, new LinkedHashTreeMap.AnonymousClass1(11)), (Collection) CollectionsKt.plus((Iterable) arrayList12, (Collection) arrayList10));
                    ?? r14 = th;
                    this.L$0 = r14;
                    this.L$1 = stablecoin;
                    this.L$3 = r14;
                    this.L$4 = r14;
                    this.L$5 = r14;
                    this.L$6 = r14;
                    this.L$7 = r14;
                    this.L$8 = r14;
                    this.L$9 = r14;
                    this.L$10 = r14;
                    this.L$11 = ref$ObjectRef3;
                    this.L$12 = ref$ObjectRef4;
                    this.L$13 = list24;
                    this.I$0 = z ? 1 : 0;
                    this.label = 2;
                    orderFavoriteRecipients$data_impl = realRecipientRepository.orderFavoriteRecipients$data_impl(plus, this);
                    if (orderFavoriteRecipients$data_impl != coroutineSingletons) {
                        ref$ObjectRef5 = ref$ObjectRef3;
                        ref$ObjectRef6 = ref$ObjectRef4;
                        list9 = list24;
                        z2 = z;
                        List list25 = (List) orderFavoriteRecipients$data_impl;
                        Iterable iterable5 = (Iterable) ref$ObjectRef5.element;
                        ArrayList arrayList15 = new ArrayList();
                        while (r6.hasNext()) {
                        }
                        ref$ObjectRef5.element = CollectionsKt.plus((Iterable) arrayList15, (Collection) list25);
                        list8 = list9;
                        ref$ObjectRef4 = ref$ObjectRef6;
                        ref$ObjectRef3 = ref$ObjectRef5;
                        r5 = z2;
                        if (this.$shouldIncludeStablecoinAddresses) {
                            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realRecipientRepository.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled()) {
                            }
                        }
                        ArrayList plus2 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
                        arrayList4 = new ArrayList();
                        it4 = plus2.iterator();
                        while (it4.hasNext()) {
                        }
                        if (!arrayList4.isEmpty()) {
                        }
                        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
                        RecipientRepository$Result.Status status = RecipientRepository$Result.Status.SUCCESS;
                        return new RecipientRepository$Result(listOf);
                    }
                    return coroutineSingletons;
                }
                if (!filterBlockedIfNeeded.isEmpty() && z) {
                    List list26 = filterBlockedIfNeeded;
                    ArrayList arrayList16 = new ArrayList();
                    for (Object obj5 : list26) {
                        if (CollectionsKt.contains((Iterable) ref$ObjectRef.element, ((Recipient) obj5).customerId)) {
                            arrayList16.add(obj5);
                        }
                    }
                    ArrayList arrayList17 = new ArrayList();
                    for (Object obj6 : list26) {
                        if (!CollectionsKt.contains((Iterable) ref$ObjectRef.element, ((Recipient) obj6).customerId)) {
                            arrayList17.add(obj6);
                        }
                    }
                    list8 = CollectionsKt.plus((Iterable) arrayList17, (Collection) arrayList16);
                    r5 = z;
                    if (this.$shouldIncludeStablecoinAddresses) {
                    }
                    ArrayList plus22 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
                    arrayList4 = new ArrayList();
                    it4 = plus22.iterator();
                    while (it4.hasNext()) {
                    }
                    if (!arrayList4.isEmpty()) {
                    }
                    List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
                    RecipientRepository$Result.Status status2 = RecipientRepository$Result.Status.SUCCESS;
                    return new RecipientRepository$Result(listOf2);
                }
            }
            list8 = filterBlockedIfNeeded;
            r5 = z;
            if (this.$shouldIncludeStablecoinAddresses) {
            }
            ArrayList plus222 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
            arrayList4 = new ArrayList();
            it4 = plus222.iterator();
            while (it4.hasNext()) {
            }
            if (!arrayList4.isEmpty()) {
            }
            List listOf22 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
            RecipientRepository$Result.Status status22 = RecipientRepository$Result.Status.SUCCESS;
            return new RecipientRepository$Result(listOf22);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    list8 = this.L$13;
                    ref$ObjectRef8 = this.L$12;
                    ref$ObjectRef7 = this.L$11;
                    List list27 = this.L$10;
                    List list28 = this.L$7;
                    List list29 = this.L$6;
                    Set set4 = this.L$4;
                    List list30 = this.L$3;
                    SafeTrace.throwOnFailure(obj);
                    access$getStablecoinRecipients = obj;
                    list10 = (List) access$getStablecoinRecipients;
                    ref$ObjectRef4 = ref$ObjectRef8;
                    ref$ObjectRef3 = ref$ObjectRef7;
                    list11 = list10;
                    if (!list11.isEmpty()) {
                    }
                    ArrayList plus2222 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
                    arrayList4 = new ArrayList();
                    it4 = plus2222.iterator();
                    while (it4.hasNext()) {
                    }
                    if (!arrayList4.isEmpty()) {
                    }
                    List listOf222 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
                    RecipientRepository$Result.Status status222 = RecipientRepository$Result.Status.SUCCESS;
                    return new RecipientRepository$Result(listOf222);
                }
                if (i2 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list8 = this.L$13;
                ref$ObjectRef8 = this.L$12;
                ref$ObjectRef7 = this.L$11;
                List list31 = this.L$10;
                List list32 = this.L$7;
                List list33 = this.L$6;
                Set set5 = this.L$4;
                List list34 = this.L$3;
                SafeTrace.throwOnFailure(obj);
                access$getStablecoinClipboardRecipient = obj;
                list10 = CollectionsKt__CollectionsKt.listOfNotNull((Recipient) access$getStablecoinClipboardRecipient);
                ref$ObjectRef4 = ref$ObjectRef8;
                ref$ObjectRef3 = ref$ObjectRef7;
                list11 = list10;
                if (!list11.isEmpty()) {
                    ref$ObjectRef3.element = CollectionsKt.plus((Iterable) ref$ObjectRef3.element, (Collection) list11);
                }
                ArrayList plus22222 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
                arrayList4 = new ArrayList();
                it4 = plus22222.iterator();
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    Recipient.CryptoRecipientPayment cryptoRecipientPayment = ((Recipient) next4).invoice;
                    if ((cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Stablecoin) || (cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Solana)) {
                        arrayList4.add(next4);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    ref$ObjectRef3.element = arrayList4;
                    list8 = EmptyList.INSTANCE;
                    ref$ObjectRef4.element = list8;
                }
                List listOf2222 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
                RecipientRepository$Result.Status status2222 = RecipientRepository$Result.Status.SUCCESS;
                return new RecipientRepository$Result(listOf2222);
            }
            ?? r1 = this.I$0;
            list9 = this.L$13;
            ref$ObjectRef6 = this.L$12;
            ref$ObjectRef5 = this.L$11;
            List list35 = this.L$10;
            List list36 = this.L$7;
            List list37 = this.L$6;
            Set set6 = this.L$4;
            List list38 = this.L$3;
            SafeTrace.throwOnFailure(obj);
            z2 = r1;
            realRecipientRepository = realRecipientRepository2;
            orderFavoriteRecipients$data_impl = obj;
            List list252 = (List) orderFavoriteRecipients$data_impl;
            Iterable iterable52 = (Iterable) ref$ObjectRef5.element;
            ArrayList arrayList152 = new ArrayList();
            for (Object obj7 : iterable52) {
                if (!((Recipient) obj7).isFavorited) {
                    arrayList152.add(obj7);
                }
            }
            ref$ObjectRef5.element = CollectionsKt.plus((Iterable) arrayList152, (Collection) list252);
            list8 = list9;
            ref$ObjectRef4 = ref$ObjectRef6;
            ref$ObjectRef3 = ref$ObjectRef5;
            r5 = z2;
            if (this.$shouldIncludeStablecoinAddresses && (stablecoin != null || str3.length() > 0)) {
                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) realRecipientRepository.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = ref$ObjectRef3;
                    this.L$12 = ref$ObjectRef4;
                    this.L$13 = list8;
                    this.I$0 = r5;
                    this.label = 4;
                    access$getStablecoinClipboardRecipient = RealRecipientRepository.access$getStablecoinClipboardRecipient(realRecipientRepository, str3, stablecoin, this);
                    if (access$getStablecoinClipboardRecipient != coroutineSingletons) {
                        ref$ObjectRef7 = ref$ObjectRef3;
                        ref$ObjectRef8 = ref$ObjectRef4;
                        list10 = CollectionsKt__CollectionsKt.listOfNotNull((Recipient) access$getStablecoinClipboardRecipient);
                        ref$ObjectRef4 = ref$ObjectRef8;
                        ref$ObjectRef3 = ref$ObjectRef7;
                        list11 = list10;
                        if (!list11.isEmpty()) {
                        }
                    }
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.L$11 = ref$ObjectRef3;
                    this.L$12 = ref$ObjectRef4;
                    this.L$13 = list8;
                    this.I$0 = r5;
                    this.label = 3;
                    access$getStablecoinRecipients = RealRecipientRepository.access$getStablecoinRecipients(realRecipientRepository, str3, this);
                    if (access$getStablecoinRecipients != coroutineSingletons) {
                        ref$ObjectRef7 = ref$ObjectRef3;
                        ref$ObjectRef8 = ref$ObjectRef4;
                        list10 = (List) access$getStablecoinRecipients;
                        ref$ObjectRef4 = ref$ObjectRef8;
                        ref$ObjectRef3 = ref$ObjectRef7;
                        list11 = list10;
                        if (!list11.isEmpty()) {
                        }
                    }
                }
                return coroutineSingletons;
            }
            ArrayList plus222222 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
            arrayList4 = new ArrayList();
            it4 = plus222222.iterator();
            while (it4.hasNext()) {
            }
            if (!arrayList4.isEmpty()) {
            }
            List listOf22222 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
            RecipientRepository$Result.Status status22222 = RecipientRepository$Result.Status.SUCCESS;
            return new RecipientRepository$Result(listOf22222);
        }
        List list39 = this.L$10;
        ref$ObjectRef2 = this.L$9;
        String str13 = this.L$8;
        List list40 = this.L$7;
        List list41 = this.L$6;
        ArrayList arrayList18 = this.L$5;
        set2 = this.L$4;
        List list42 = this.L$3;
        SafeTrace.throwOnFailure(obj);
        list5 = list39;
        th2 = null;
        list4 = list42;
        str2 = str13;
        list6 = list40;
        i = 0;
        arrayList = arrayList18;
        realRecipientRepository = realRecipientRepository2;
        list7 = list41;
        withContext = obj;
        Triple triple2 = (Triple) withContext;
        transform = (List) triple2.first;
        th = th2;
        List list43 = (List) triple2.second;
        boolean booleanValue = ((Boolean) triple2.third).booleanValue();
        ref$ObjectRef2.element = list43;
        if (transform == null) {
            RealRecipientRepository realRecipientRepository3 = realRecipientRepository;
            realRecipientRepository = realRecipientRepository3;
            transform = DrawableCompat.transform(RealRecipientRepository.appendAnalytics$default(realRecipientRepository3, list5, null, SuggestionStrategy.REMOTE, this.$query, str2, 17), arrayList, set2);
        }
        list2 = list7;
        list3 = list4;
        list = list6;
        set = set2;
        ref$ObjectRef = ref$ObjectRef2;
        z = booleanValue;
        ref$ObjectRef3 = new Ref$ObjectRef();
        List list202 = list2;
        List list212 = list2;
        ArrayList arrayList82 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list202, 10));
        it = list202.iterator();
        int i32 = i;
        while (it.hasNext()) {
        }
        ArrayList transform22 = DrawableCompat.transform(arrayList82, arrayList, set);
        ref$ObjectRef3.element = transform22;
        ref$ObjectRef4 = new Ref$ObjectRef();
        Section.Type type22 = Section.Type.SUGGESTED;
        ref$ObjectRef4.element = RealRecipientRepository.access$enrichContactsWithAnalytics(realRecipientRepository, list, arrayList, set, transform22.size());
        Iterable iterable22 = transform;
        ArrayList arrayList92 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable22, 10));
        it2 = iterable22.iterator();
        int i52 = i;
        while (it2.hasNext()) {
        }
        List list222 = (List) ref$ObjectRef3.element;
        boolean z32 = this.$filterOutBlockedRecipients;
        ref$ObjectRef3.element = RealRecipientRepository.filterBlockedIfNeeded(list222, z32);
        ref$ObjectRef4.element = RealRecipientRepository.filterBlockedIfNeeded((List) ref$ObjectRef4.element, z32);
        List filterBlockedIfNeeded2 = RealRecipientRepository.filterBlockedIfNeeded(arrayList92, z32);
        if (this.$sortFavoritesFirst) {
        }
        list8 = filterBlockedIfNeeded2;
        r5 = z;
        if (this.$shouldIncludeStablecoinAddresses) {
        }
        ArrayList plus2222222 = CollectionsKt.plus((Iterable) list8, (Collection) CollectionsKt.plus((Iterable) ref$ObjectRef4.element, (Collection) ref$ObjectRef3.element));
        arrayList4 = new ArrayList();
        it4 = plus2222222.iterator();
        while (it4.hasNext()) {
        }
        if (!arrayList4.isEmpty()) {
        }
        List listOf222222 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, (List) ref$ObjectRef3.element), new Section(Section.Type.CONTACTS, (List) ref$ObjectRef4.element), new Section(Section.Type.RESULTS, list8)});
        RecipientRepository$Result.Status status222222 = RecipientRepository$Result.Status.SUCCESS;
        return new RecipientRepository$Result(listOf222222);
    }
}
