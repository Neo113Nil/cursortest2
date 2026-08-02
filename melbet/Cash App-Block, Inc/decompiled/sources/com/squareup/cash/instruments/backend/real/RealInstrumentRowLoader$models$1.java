package com.squareup.cash.instruments.backend.real;

import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.common.Orientation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealInstrumentRowLoader$models$1 extends SuspendLambda implements Function7 {
    public final /* synthetic */ Money $amount;
    public final /* synthetic */ boolean $excludeColonFromSubtitle;
    public final /* synthetic */ boolean $includeCreditCards;
    public final /* synthetic */ boolean $includeDebitCards;
    public final /* synthetic */ boolean $includeGooglePay;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ List $recipients;
    public final /* synthetic */ InstrumentSelection $userSelectedInstrument;
    public /* synthetic */ BalanceSnapshot L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ InstrumentLinkingConfig L$2;
    public /* synthetic */ Profile L$3;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public final /* synthetic */ RealInstrumentRowLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInstrumentRowLoader$models$1(boolean z, Orientation orientation, List list, InstrumentSelection instrumentSelection, Money money, boolean z2, RealInstrumentRowLoader realInstrumentRowLoader, boolean z3, boolean z4, Continuation continuation) {
        super(7, continuation);
        this.$includeCreditCards = z;
        this.$orientation = orientation;
        this.$recipients = list;
        this.$userSelectedInstrument = instrumentSelection;
        this.$amount = money;
        this.$includeGooglePay = z2;
        this.this$0 = realInstrumentRowLoader;
        this.$excludeColonFromSubtitle = z3;
        this.$includeDebitCards = z4;
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        boolean booleanValue2 = ((Boolean) obj6).booleanValue();
        boolean z = this.$excludeColonFromSubtitle;
        boolean z2 = this.$includeDebitCards;
        RealInstrumentRowLoader$models$1 realInstrumentRowLoader$models$1 = new RealInstrumentRowLoader$models$1(this.$includeCreditCards, this.$orientation, this.$recipients, this.$userSelectedInstrument, this.$amount, this.$includeGooglePay, this.this$0, z, z2, (Continuation) serializable);
        realInstrumentRowLoader$models$1.L$0 = (BalanceSnapshot) obj;
        realInstrumentRowLoader$models$1.L$1 = (List) obj2;
        realInstrumentRowLoader$models$1.L$2 = (InstrumentLinkingConfig) obj3;
        realInstrumentRowLoader$models$1.L$3 = (Profile) obj4;
        realInstrumentRowLoader$models$1.Z$0 = booleanValue;
        realInstrumentRowLoader$models$1.Z$1 = booleanValue2;
        return realInstrumentRowLoader$models$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RealInstrumentSelectorManager realInstrumentSelectorManager = this.this$0.instrumentSelectorManager;
        BalanceSnapshot balanceSnapshot = this.L$0;
        List list = this.L$1;
        InstrumentLinkingConfig instrumentLinkingConfig = this.L$2;
        Profile profile = this.L$3;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        boolean z3 = this.$includeCreditCards && instrumentLinkingConfig.credit_card_linking_enabled;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Instrument instrument = (Instrument) obj2;
            if (z3 || instrument.cashInstrumentType != CashInstrumentType.CREDIT_CARD) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Instrument instrument2 = (Instrument) next;
            if (this.$includeDebitCards || instrument2.cashInstrumentType != CashInstrumentType.DEBIT_CARD) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((Instrument) next2).cashInstrumentType != CashInstrumentType.BANK_ACCOUNT) {
                arrayList3.add(next2);
            }
        }
        createListBuilder.addAll(arrayList3);
        InstrumentSelection instrumentSelection = this.$userSelectedInstrument;
        boolean areEqual = Intrinsics.areEqual(instrumentSelection != null ? instrumentSelection.instrument_token : null, "GOOGLE_PAY");
        Money money = this.$amount;
        if (areEqual) {
            createListBuilder.add(new Instrument("GOOGLE_PAY", CashInstrumentType.GOOGLE_PAY, (InstrumentType) null, (String) null, (String) null, (String) null, (String) null, (String) null, "Google Pay", (Boolean) null, (String) null, (String) null, (String) null, true, (String) null, (Long) null, 65536));
        } else if (this.$includeGooglePay) {
            if ((balanceSnapshot != null ? balanceSnapshot.balance : null) != null) {
                Long l = balanceSnapshot.balance.amount;
                long longValue = l != null ? l.longValue() : 0L;
                Long l2 = money.amount;
                if ((l2 != null ? l2.longValue() : 0L) > longValue) {
                    createListBuilder.add(new Instrument("GOOGLE_PAY", CashInstrumentType.GOOGLE_PAY, (InstrumentType) null, (String) null, (String) null, (String) null, (String) null, (String) null, "Google Pay", (Boolean) null, (String) null, (String) null, (String) null, true, (String) null, (Long) null, 65536));
                }
            }
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        InstrumentSelection loadInstrument = GoogleMapKt.loadInstrument(this.$orientation, this.$recipients, this.$userSelectedInstrument, profile, null, this.$amount, balanceSnapshot, build, instrumentLinkingConfig, Boolean.valueOf(z), true, z2, this.$includeGooglePay);
        return realInstrumentSelectorManager.createInstrumentSelectionViewModel(realInstrumentSelectorManager.getToolbarSubtitle(this.$orientation, this.$recipients, loadInstrument, null, this.$amount, profile, balanceSnapshot, build, instrumentLinkingConfig, Boolean.valueOf(z), z2, false), realInstrumentSelectorManager.getToolbarCreditCardFee(this.$orientation, this.$recipients, loadInstrument, null, this.$amount, profile, build, instrumentLinkingConfig, Boolean.valueOf(z), z2), this.$recipients, loadInstrument, null, this.$orientation, profile, balanceSnapshot, build, instrumentLinkingConfig, Boolean.valueOf(z), this.$amount, false, null, money.currency_code, this.$excludeColonFromSubtitle);
    }
}
