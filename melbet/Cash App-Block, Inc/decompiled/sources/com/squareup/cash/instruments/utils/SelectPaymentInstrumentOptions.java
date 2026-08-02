package com.squareup.cash.instruments.utils;

import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.common.SelectPaymentInstrumentType;
import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.util.cash.Bps;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes6.dex */
public final class SelectPaymentInstrumentOptions {
    public final boolean insufficientBalance;
    public final List options;
    public final Money totalAmount;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CashInstrumentType.GOOGLE_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SelectPaymentInstrumentType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SelectPaymentInstrumentType selectPaymentInstrumentType = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SelectPaymentInstrumentType selectPaymentInstrumentType2 = SelectPaymentInstrumentType.SELECT_FROM_INSTRUMENTS;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public SelectPaymentInstrumentOptions(SelectPaymentInstrumentType selectPaymentInstrumentType, BalanceSnapshot balanceSnapshot, List list, List list2, Money money, Money money2, boolean z, boolean z2, long j, boolean z3, boolean z4, HasNotPassedIdvSortRanking hasNotPassedIdvSortRanking) {
        selectPaymentInstrumentType.getClass();
        list.getClass();
        list2.getClass();
        hasNotPassedIdvSortRanking.getClass();
        this.totalAmount = money;
        ArrayList arrayList = new ArrayList();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        int ordinal = selectPaymentInstrumentType.ordinal();
        if (ordinal == 0) {
            if (balanceSnapshot != null && z2 && balanceSnapshot.balance.currency_code == money.currency_code) {
                _init_$maybeAddCashBalance(this, arrayList, z4, ref$BooleanRef, balanceSnapshot);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Instrument instrument = (Instrument) it.next();
                int i = WhenMappings.$EnumSwitchMapping$0[instrument.cashInstrumentType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, null, 14));
                        }
                    } else if (z3) {
                        arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, null, 14));
                    }
                } else if (z) {
                    arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, money2, 12));
                }
            }
        } else if (ordinal == 1) {
            _init_$addFromAvailableTypes(balanceSnapshot, list, z, arrayList, j, z3, money2, z2, this, z4, ref$BooleanRef, list2);
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            _init_$addFromAvailableTypes(balanceSnapshot, list, z, arrayList, j, z3, money2, z2, this, z4, ref$BooleanRef, CollectionsKt__CollectionsKt.listOf((Object[]) new CashInstrumentType[]{CashInstrumentType.DEBIT_CARD, CashInstrumentType.CREDIT_CARD, CashInstrumentType.CASH_BALANCE, CashInstrumentType.GOOGLE_PAY}));
        }
        this.options = CollectionsKt.sortedWith(arrayList, new SemanticsSortKt$special$$inlined$thenBy$1(hasNotPassedIdvSortRanking, 6));
        this.insufficientBalance = ref$BooleanRef.element;
    }

    public static final void _init_$addFromAvailableTypes(BalanceSnapshot balanceSnapshot, List list, boolean z, ArrayList arrayList, long j, boolean z2, Money money, boolean z3, SelectPaymentInstrumentOptions selectPaymentInstrumentOptions, boolean z4, Ref$BooleanRef ref$BooleanRef, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            CashInstrumentType cashInstrumentType = (CashInstrumentType) it.next();
            if (cashInstrumentType != CashInstrumentType.CASH_BALANCE) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((Instrument) obj).cashInstrumentType == cashInstrumentType) {
                        arrayList2.add(obj);
                    }
                }
                Set<Instrument> set = CollectionsKt.toSet(arrayList2);
                int i = 2;
                if (set.isEmpty()) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 && z2) {
                            arrayList.add(new SelectPaymentInstrumentOption.NewInstrument(cashInstrumentType, 0L));
                        }
                    } else if (z) {
                        arrayList.add(new SelectPaymentInstrumentOption.NewInstrument(cashInstrumentType, j));
                    }
                } else {
                    for (Instrument instrument : set) {
                        int i3 = WhenMappings.$EnumSwitchMapping$0[cashInstrumentType.ordinal()];
                        if (i3 != 1) {
                            if (i3 != i) {
                                if (i3 != 3) {
                                    arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, null, 14));
                                } else {
                                    arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, null, 14));
                                }
                            } else if (z2) {
                                arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, null, 14));
                            }
                        } else if (z) {
                            arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingInstrument(instrument, money, 12));
                        }
                        i = 2;
                    }
                }
            } else if (balanceSnapshot != null && z3 && balanceSnapshot.balance.currency_code == selectPaymentInstrumentOptions.totalAmount.currency_code) {
                _init_$maybeAddCashBalance(selectPaymentInstrumentOptions, arrayList, z4, ref$BooleanRef, balanceSnapshot);
            }
        }
    }

    public static final void _init_$maybeAddCashBalance(SelectPaymentInstrumentOptions selectPaymentInstrumentOptions, ArrayList arrayList, boolean z, Ref$BooleanRef ref$BooleanRef, BalanceSnapshot balanceSnapshot) {
        Long l = balanceSnapshot.balance.amount;
        l.getClass();
        long longValue = l.longValue();
        Long l2 = selectPaymentInstrumentOptions.totalAmount.amount;
        l2.getClass();
        boolean z2 = longValue >= l2.longValue();
        if (z2) {
            arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance(balanceSnapshot, z2));
        } else if (longValue > 0 || z) {
            arrayList.add(new SelectPaymentInstrumentOption.ExistingOption.ExistingCashBalance(balanceSnapshot, z2));
            ref$BooleanRef.element = true;
        }
    }

    public /* synthetic */ SelectPaymentInstrumentOptions(SelectPaymentInstrumentType selectPaymentInstrumentType, BalanceSnapshot balanceSnapshot, List list, List list2, Money money, List list3, boolean z, boolean z2, long j, boolean z3, HasNotPassedIdvSortRanking hasNotPassedIdvSortRanking, int i) {
        this(selectPaymentInstrumentType, balanceSnapshot, list, list2, money, list3, z, z2, j, true, (i & 1024) != 0 ? true : z3, (i & 2048) != 0 ? HasNotPassedIdvSortRanking.INSTANCE$1 : hasNotPassedIdvSortRanking);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectPaymentInstrumentOptions(SelectPaymentInstrumentType selectPaymentInstrumentType, BalanceSnapshot balanceSnapshot, List list, List list2, Money money, List list3, boolean z, boolean z2, long j, boolean z3, boolean z4, HasNotPassedIdvSortRanking hasNotPassedIdvSortRanking) {
        this(selectPaymentInstrumentType, balanceSnapshot, list, list2, r8, Moneys.amount(money) <= 0 ? null : Bps.computeFee$default(money, (Iterable) r4), z, z2, j, z3, z4, hasNotPassedIdvSortRanking);
        ?? listOf;
        selectPaymentInstrumentType.getClass();
        list.getClass();
        list2.getClass();
        money.getClass();
        list3.getClass();
        hasNotPassedIdvSortRanking.getClass();
        long size = list3.size();
        Money times = Moneys.times(money, size < 1 ? 1L : size);
        if (!list3.isEmpty()) {
            List<RecipientPaymentInfo> list4 = list3;
            listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
            for (RecipientPaymentInfo recipientPaymentInfo : list4) {
                long j2 = recipientPaymentInfo.creditCardFeeBps;
                if (j2 <= 0 && !recipientPaymentInfo.isBusinessCustomer) {
                    j2 = j;
                }
                listOf.add(Long.valueOf(j2));
            }
        } else {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(j));
        }
    }
}
