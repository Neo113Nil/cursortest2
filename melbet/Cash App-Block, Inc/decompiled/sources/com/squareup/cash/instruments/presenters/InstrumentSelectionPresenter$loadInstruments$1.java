package com.squareup.cash.instruments.presenters;

import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.utils.HasNotPassedIdvSortRanking;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOptions;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function8;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class InstrumentSelectionPresenter$loadInstruments$1 extends SuspendLambda implements Function8 {
    public final /* synthetic */ boolean $googlePayAvailable;
    public /* synthetic */ BalanceSnapshot L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ InstrumentLinkingConfig L$2;
    public /* synthetic */ List L$3;
    public /* synthetic */ Profile L$4;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public final /* synthetic */ TransfersPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSelectionPresenter$loadInstruments$1(TransfersPresenter transfersPresenter, boolean z, Continuation continuation) {
        super(8, continuation);
        this.this$0 = transfersPresenter;
        this.$googlePayAvailable = z;
    }

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        boolean booleanValue = ((Boolean) obj6).booleanValue();
        boolean booleanValue2 = ((Boolean) obj7).booleanValue();
        InstrumentSelectionPresenter$loadInstruments$1 instrumentSelectionPresenter$loadInstruments$1 = new InstrumentSelectionPresenter$loadInstruments$1(this.this$0, this.$googlePayAvailable, (Continuation) serializable);
        instrumentSelectionPresenter$loadInstruments$1.L$0 = (BalanceSnapshot) obj;
        instrumentSelectionPresenter$loadInstruments$1.L$1 = (List) obj2;
        instrumentSelectionPresenter$loadInstruments$1.L$2 = (InstrumentLinkingConfig) obj3;
        instrumentSelectionPresenter$loadInstruments$1.L$3 = (List) obj4;
        instrumentSelectionPresenter$loadInstruments$1.L$4 = (Profile) obj5;
        instrumentSelectionPresenter$loadInstruments$1.Z$0 = booleanValue;
        instrumentSelectionPresenter$loadInstruments$1.Z$1 = booleanValue2;
        return instrumentSelectionPresenter$loadInstruments$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        BalanceSnapshot balanceSnapshot = this.L$0;
        List list = this.L$1;
        InstrumentLinkingConfig instrumentLinkingConfig = this.L$2;
        List list2 = this.L$3;
        Profile profile = this.L$4;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        InstrumentSelectionScreen instrumentSelectionScreen = (InstrumentSelectionScreen) this.this$0.initialTab;
        boolean z3 = instrumentSelectionScreen.includeCreditCards && instrumentLinkingConfig.credit_card_linking_enabled;
        List list3 = list2;
        Iterator it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((InstrumentLinkingOptionManager$InstrumentLinkingOption) obj2).cashInstrumentType.contains(CashInstrumentType.CREDIT_CARD)) {
                break;
            }
        }
        InstrumentLinkingOptionManager$InstrumentLinkingOption instrumentLinkingOptionManager$InstrumentLinkingOption = (InstrumentLinkingOptionManager$InstrumentLinkingOption) obj2;
        long longValue = instrumentLinkingOptionManager$InstrumentLinkingOption != null ? instrumentLinkingOptionManager$InstrumentLinkingOption.feeBps.longValue() : instrumentLinkingConfig.credit_card_fee_bps;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((Instrument) obj3).cashInstrumentType != CashInstrumentType.CASH_BALANCE) {
                arrayList.add(obj3);
            }
        }
        boolean z4 = this.$googlePayAvailable;
        if (z4) {
            arrayList = CollectionsKt.plus((Collection) arrayList, (Object) new Instrument("GOOGLE_PAY", CashInstrumentType.GOOGLE_PAY, (InstrumentType) null, (String) null, (String) null, (String) null, (String) null, (String) null, "Google Pay", (Boolean) null, (String) null, (String) null, (String) null, true, (String) null, (Long) null, 65536));
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(CashInstrumentType.CASH_BALANCE);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Instrument) it2.next()).cashInstrumentType);
        }
        createListBuilder.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list3) {
            if (((InstrumentLinkingOptionManager$InstrumentLinkingOption) obj4).showInInstrumentSelector) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((InstrumentLinkingOptionManager$InstrumentLinkingOption) it3.next()).cashInstrumentType, arrayList4);
        }
        createListBuilder.addAll(arrayList4);
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        ArrayList arrayList5 = new ArrayList();
        ListIterator listIterator = build.listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                break;
            }
            Object next = itr.next();
            CashInstrumentType cashInstrumentType = (CashInstrumentType) next;
            if (z3 || cashInstrumentType != CashInstrumentType.CREDIT_CARD) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            CashInstrumentType cashInstrumentType2 = (CashInstrumentType) next2;
            if (instrumentSelectionScreen.includeBankAccounts || cashInstrumentType2 != CashInstrumentType.BANK_ACCOUNT) {
                arrayList6.add(next2);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            CashInstrumentType cashInstrumentType3 = (CashInstrumentType) next3;
            if (z4 || cashInstrumentType3 != CashInstrumentType.GOOGLE_PAY) {
                arrayList7.add(next3);
            }
        }
        return new SelectPaymentInstrumentOptions(instrumentSelectionScreen.selectInstrumentType, balanceSnapshot, (List) arrayList, CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList7)), instrumentSelectionScreen.amount, instrumentSelectionScreen.recipients, z3, instrumentLinkingConfig.cash_balance_enabled, longValue, instrumentSelectionScreen.includeDebitCards, true, (z || z2 || profile.country_code != Country.US) ? HasNotPassedIdvSortRanking.INSTANCE$1 : HasNotPassedIdvSortRanking.INSTANCE);
    }
}
