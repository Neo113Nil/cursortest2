package com.squareup.cash.instruments.presenters;

import app.cash.local.presenters.LocalCashBalancePresenter;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.instruments.utils.HasNotPassedIdvSortRanking;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOptions;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.CashInstrumentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SelectPaymentInstrumentPresenter$initialModel$1 extends SuspendLambda implements Function6 {
    public /* synthetic */ Pair L$0;
    public /* synthetic */ SelectPaymentInstrumentPresenter$initialModel$Config L$1;
    public /* synthetic */ List L$2;
    public /* synthetic */ Profile L$3;
    public /* synthetic */ boolean Z$0;
    public final /* synthetic */ LocalCashBalancePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectPaymentInstrumentPresenter$initialModel$1(LocalCashBalancePresenter localCashBalancePresenter, Continuation continuation) {
        super(6, continuation);
        this.this$0 = localCashBalancePresenter;
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        SelectPaymentInstrumentPresenter$initialModel$1 selectPaymentInstrumentPresenter$initialModel$1 = new SelectPaymentInstrumentPresenter$initialModel$1(this.this$0, (Continuation) obj6);
        selectPaymentInstrumentPresenter$initialModel$1.L$0 = (Pair) obj;
        selectPaymentInstrumentPresenter$initialModel$1.L$1 = (SelectPaymentInstrumentPresenter$initialModel$Config) obj2;
        selectPaymentInstrumentPresenter$initialModel$1.L$2 = (List) obj3;
        selectPaymentInstrumentPresenter$initialModel$1.L$3 = (Profile) obj4;
        selectPaymentInstrumentPresenter$initialModel$1.Z$0 = booleanValue;
        return selectPaymentInstrumentPresenter$initialModel$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list;
        ArrayList arrayList;
        boolean z;
        SelectPaymentInstrumentArgs selectPaymentInstrumentArgs = (SelectPaymentInstrumentArgs) this.this$0.clock;
        Pair pair = this.L$0;
        SelectPaymentInstrumentPresenter$initialModel$Config selectPaymentInstrumentPresenter$initialModel$Config = this.L$1;
        List list2 = this.L$2;
        Profile profile = this.L$3;
        boolean z2 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BalanceSnapshot balanceSnapshot = (BalanceSnapshot) pair.first;
        List list3 = (List) pair.second;
        boolean z3 = selectPaymentInstrumentPresenter$initialModel$Config.creditLinking;
        boolean z4 = selectPaymentInstrumentPresenter$initialModel$Config.cashBalance;
        long j = selectPaymentInstrumentPresenter$initialModel$Config.creditCardFeeBps;
        List list4 = list2;
        Iterator it = list4.iterator();
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
        if (instrumentLinkingOptionManager$InstrumentLinkingOption != null) {
            j = instrumentLinkingOptionManager$InstrumentLinkingOption.feeBps.longValue();
        }
        long j2 = j;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list4) {
            if (((InstrumentLinkingOptionManager$InstrumentLinkingOption) obj3).showInInstrumentSelector) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((InstrumentLinkingOptionManager$InstrumentLinkingOption) it2.next()).cashInstrumentType, arrayList3);
        }
        HasNotPassedIdvSortRanking hasNotPassedIdvSortRanking = (z2 || profile.country_code != Country.US) ? HasNotPassedIdvSortRanking.INSTANCE$1 : HasNotPassedIdvSortRanking.INSTANCE;
        SelectPaymentInstrumentType type2 = selectPaymentInstrumentArgs.getType();
        if (z3) {
            list = list3;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list3) {
                if (((Instrument) obj4).cashInstrumentType != CashInstrumentType.CREDIT_CARD) {
                    arrayList4.add(obj4);
                }
            }
            list = arrayList4;
        }
        if (selectPaymentInstrumentArgs.getType() != SelectPaymentInstrumentType.SELECT_FROM_TYPES) {
            arrayList = arrayList3;
        } else {
            List instrumentTypes = selectPaymentInstrumentArgs.getInstrumentTypes();
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (instrumentTypes.contains((CashInstrumentType) next)) {
                    arrayList5.add(next);
                }
            }
            arrayList = arrayList5;
        }
        Money amount = selectPaymentInstrumentArgs.getAmount();
        List recipients = selectPaymentInstrumentArgs.getRecipients();
        if (!arrayList3.contains(CashInstrumentType.CREDIT_CARD)) {
            List list5 = list3;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    if (((Instrument) it4.next()).cashInstrumentType == CashInstrumentType.CREDIT_CARD) {
                    }
                }
            }
            z = false;
            return new SelectPaymentInstrumentOptions(type2, balanceSnapshot, list, arrayList, amount, recipients, z, z4, j2, selectPaymentInstrumentArgs.getShowDisabledOptions(), hasNotPassedIdvSortRanking, 512);
        }
        z = true;
        return new SelectPaymentInstrumentOptions(type2, balanceSnapshot, list, arrayList, amount, recipients, z, z4, j2, selectPaymentInstrumentArgs.getShowDisabledOptions(), hasNotPassedIdvSortRanking, 512);
    }
}
