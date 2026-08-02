package com.squareup.cash.recipients.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.data.RecipientRepository$Result;
import com.squareup.cash.recipients.data.Section;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealRecipientRepository$suggestions$3 extends SuspendLambda implements Function5 {
    public final /* synthetic */ boolean $sortFavoritesFirst;
    public /* synthetic */ List L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ Set L$2;
    public /* synthetic */ List L$3;
    public List L$4;
    public int label;
    public final /* synthetic */ RealRecipientRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealRecipientRepository$suggestions$3(RealRecipientRepository realRecipientRepository, boolean z, Continuation continuation) {
        super(5, continuation);
        this.this$0 = realRecipientRepository;
        this.$sortFavoritesFirst = z;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        RealRecipientRepository$suggestions$3 realRecipientRepository$suggestions$3 = new RealRecipientRepository$suggestions$3(this.this$0, this.$sortFavoritesFirst, (Continuation) obj5);
        realRecipientRepository$suggestions$3.L$0 = (List) obj;
        realRecipientRepository$suggestions$3.L$1 = (List) obj2;
        realRecipientRepository$suggestions$3.L$2 = (Set) obj3;
        realRecipientRepository$suggestions$3.L$3 = (List) obj4;
        return realRecipientRepository$suggestions$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List list;
        List list2 = this.L$0;
        List list3 = this.L$1;
        Set set = this.L$2;
        List list4 = this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RealRecipientRepository realRecipientRepository = this.this$0;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            List<Recipient> list5 = list3;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
            for (Recipient recipient : list5) {
                String str = recipient.customerId;
                if (str == null && (str = recipient.lookupKey) == null) {
                    str = "";
                }
                arrayList2.add(str);
            }
            this.L$0 = null;
            this.L$1 = list3;
            this.L$2 = set;
            this.L$3 = list4;
            this.L$4 = arrayList2;
            this.label = 1;
            obj = JobKt.withContext(realRecipientRepository.ioDispatcher, new RealQrCodesPresenter$models$1$1(list2, realRecipientRepository, arrayList2, set, null, 13), this);
            if (obj != coroutineSingletons) {
                arrayList = arrayList2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.L$4;
            SafeTrace.throwOnFailure(obj);
            List list6 = (List) obj;
            List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, list6), new Section(Section.Type.CONTACTS, RealRecipientRepository.filterBlockedIfNeeded(RealRecipientRepository.access$enrichContactsWithAnalytics(realRecipientRepository, list4, list, set, list6.size()), true)), new Section(Section.Type.RESULTS, EmptyList.INSTANCE)});
            RecipientRepository$Result.Status status = RecipientRepository$Result.Status.SUCCESS;
            return new RecipientRepository$Result(listOf);
        }
        List list7 = this.L$4;
        SafeTrace.throwOnFailure(obj);
        arrayList = list7;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = set;
        this.L$3 = list4;
        this.L$4 = arrayList;
        this.label = 2;
        obj = RealRecipientRepository.access$buildSuggestedSection(realRecipientRepository, this.$sortFavoritesFirst, list3, (List) obj, arrayList, set, this);
        set = set;
        if (obj != coroutineSingletons) {
            list = arrayList;
            List list62 = (List) obj;
            List listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Section[]{new Section(Section.Type.SUGGESTED, list62), new Section(Section.Type.CONTACTS, RealRecipientRepository.filterBlockedIfNeeded(RealRecipientRepository.access$enrichContactsWithAnalytics(realRecipientRepository, list4, list, set, list62.size()), true)), new Section(Section.Type.RESULTS, EmptyList.INSTANCE)});
            RecipientRepository$Result.Status status2 = RecipientRepository$Result.Status.SUCCESS;
            return new RecipientRepository$Result(listOf2);
        }
        return coroutineSingletons;
    }
}
