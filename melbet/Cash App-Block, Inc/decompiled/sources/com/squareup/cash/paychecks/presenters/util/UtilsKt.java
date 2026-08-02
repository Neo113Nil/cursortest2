package com.squareup.cash.paychecks.presenters.util;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public abstract class UtilsKt {
    public static final TimeZone paycheckTimeZone;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("EST");
        timeZone.getClass();
        paycheckTimeZone = timeZone;
    }

    public static final boolean destinationIsAllocated(PaycheckAllocationDistribution paycheckAllocationDistribution, AllocationDestination allocationDestination) {
        Object obj;
        allocationDestination.getClass();
        Iterator it = paycheckAllocationDistribution.allocations.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((PaycheckAllocationDistribution.DestinationAndShare) obj).destination, allocationDestination)) {
                break;
            }
        }
        return obj != null;
    }

    public static final float forceToWholePercentage(float f) {
        return ((float) Math.rint(f * 100.0f)) / 100.0f;
    }

    public static final long getBasisPoints(float f) {
        return MathKt__MathJVMKt.roundToLong(f * 10000.0f);
    }

    public static final float maxAllocationFor(Object obj, List list, Function1 function1, Function1 function12) {
        list.getClass();
        boolean isEmpty = list.isEmpty();
        float f = RecyclerView.DECELERATION_RATE;
        if (!isEmpty) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object previous = listIterator.previous();
                AllocationDestination allocationDestination = (AllocationDestination) function1.invoke(previous);
                allocationDestination.getClass();
                if (!(allocationDestination instanceof AllocationDestination.CashBalanceDestination) && !Intrinsics.areEqual(previous, obj)) {
                    f = (((Number) function12.invoke(previous)).longValue() / 10000.0f) + f;
                }
            }
        }
        return forceToWholePercentage(1.0f - f);
    }

    public static final Money realizedAmount(PaychecksUiState.Paycheck paycheck) {
        Object next;
        Object next2;
        ArrayList arrayList = paycheck.realizedAllocationAmounts;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((PaychecksUiState.RealizedAllocationAmount) it.next()).realizedAmount);
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            while (it2.hasNext()) {
                next = Moneys.plus((Money) next, (Money) it2.next());
            }
        } else {
            next = null;
        }
        Money money = (Money) next;
        if (money == null) {
            money = new Money((Long) 0L, (CurrencyCode) null, 6);
        }
        ArrayList arrayList3 = paycheck.deductions;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((PaychecksUiState.Deduction) it3.next()).amount);
        }
        Iterator it4 = arrayList4.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            while (it4.hasNext()) {
                next2 = Moneys.plus((Money) next2, (Money) it4.next());
            }
        } else {
            next2 = null;
        }
        Money money2 = (Money) next2;
        if (money2 == null) {
            money2 = new Money((Long) 0L, (CurrencyCode) null, 6);
        }
        return Moneys.plus(money, money2);
    }

    public static final PaychecksReceiptViewModel.Section.Row receiptRow(PaychecksUiState.RealizedAllocationAmount realizedAllocationAmount, PaychecksUiConfiguration paychecksUiConfiguration, MoneyFormatter moneyFormatter, AndroidStringManager androidStringManager) {
        realizedAllocationAmount.getClass();
        moneyFormatter.getClass();
        PaychecksUiConfiguration.PaychecksDestinationUi.DestinationUiConfiguration configForDestination = com.squareup.cash.paychecks.common.presenters.UtilsKt.getConfigForDestination(paychecksUiConfiguration, realizedAllocationAmount.destination);
        Color color = configForDestination.tint;
        String str = configForDestination.name;
        String format2 = moneyFormatter.format(realizedAllocationAmount.realizedAmount);
        PaychecksReceiptViewModel.Section.Row.Treatment treatment = realizedAllocationAmount.state == PaychecksUiState.RealizedAllocationAmount.State.ERRORED ? PaychecksReceiptViewModel.Section.Row.Treatment.FAILED_ALLOCATION : PaychecksReceiptViewModel.Section.Row.Treatment.ALLOCATION;
        String str2 = realizedAllocationAmount.note;
        ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "name", str);
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.receipt_distribution_destination_accessibility_template)).format(m);
        format3.getClass();
        return new PaychecksReceiptViewModel.Section.Row(color, str, format2, treatment, str2, format3);
    }

    public static final List toAllocations(ArrayList arrayList, Long l) {
        if (l == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PaychecksUiState.Deduction deduction = (PaychecksUiState.Deduction) it.next();
            Color color = deduction.tint;
            deduction.amount.amount.getClass();
            arrayList2.add(new DistributionWheelViewModel.SingleAllocation(r1.longValue() / l.longValue(), color));
        }
        return arrayList2;
    }

    public static final Integer toDestinationType(AllocationDestination allocationDestination) {
        allocationDestination.getClass();
        if (allocationDestination instanceof AllocationDestination.CashBalanceDestination) {
            return 1;
        }
        if (allocationDestination instanceof AllocationDestination.SavingsDestination) {
            return 2;
        }
        if (allocationDestination instanceof AllocationDestination.BitcoinDestination) {
            return 3;
        }
        return allocationDestination instanceof AllocationDestination.InvestingDestination ? 4 : null;
    }

    public static final PaychecksReceiptViewModel.Section.Row receiptRow(PaychecksUiState.Deduction deduction, MoneyFormatter moneyFormatter, AndroidStringManager androidStringManager) {
        deduction.getClass();
        moneyFormatter.getClass();
        Color color = deduction.tint;
        String str = deduction.description;
        String format2 = moneyFormatter.format(Moneys.times(deduction.amount, -1L));
        PaychecksReceiptViewModel.Section.Row.Treatment treatment = PaychecksReceiptViewModel.Section.Row.Treatment.DEDUCTION;
        String str2 = deduction.note;
        String str3 = deduction.description;
        ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, str3, "name", str3);
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.receipt_deduction_accessibility_template)).format(m);
        format3.getClass();
        return new PaychecksReceiptViewModel.Section.Row(color, str, format2, treatment, str2, format3);
    }
}
