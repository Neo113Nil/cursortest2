package app.cash.local.presenters.internal;

import app.cash.local.presenters.internal.OrderRow;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.order.RowIdentifier;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.local.client.v1.DynamicChargesBreakdown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class DynamicChargesBreakdownComputer {
    public final OrderSummary orderSummary;
    public final AndroidStringManager stringManager;

    public DynamicChargesBreakdownComputer(DynamicChargesBreakdown dynamicChargesBreakdown, AndroidStringManager androidStringManager) {
        OrderRow.Visibility visibility;
        LocalMoney localMoney;
        Throwable th;
        OrderRow.Visibility visibility2;
        OrderRow.Orientation orientation;
        this.stringManager = androidStringManager;
        List<DynamicChargesBreakdown.RowCalculation> list = dynamicChargesBreakdown.rows;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DynamicChargesBreakdown.RowCalculation rowCalculation : list) {
            String str = rowCalculation.identifier;
            str.getClass();
            DynamicChargesBreakdown.RowCalculation.Visibility visibility3 = rowCalculation.visibility;
            int i = visibility3 == null ? -1 : DynamicChargesBreakdownComputerKt$WhenMappings.$EnumSwitchMapping$1[visibility3.ordinal()];
            if (i == -1 || i == 1 || i == 2) {
                visibility = OrderRow.Visibility.VISIBLE;
            } else if (i == 3) {
                visibility = OrderRow.Visibility.HIDDEN_IF_ZERO;
            } else {
                if (i != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw null;
                }
                visibility = OrderRow.Visibility.HIDDEN;
            }
            String str2 = rowCalculation.display_label;
            String str3 = rowCalculation.display_value_zero;
            com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = rowCalculation.base_amount;
            if (localMoney2 != null) {
                localMoney = LocalMoneyKt.toMoney(localMoney2);
                th = null;
                visibility2 = visibility;
            } else {
                th = null;
                visibility2 = visibility;
                localMoney = new LocalMoney(0L, LocalCurrencyCode.USD);
            }
            DynamicChargesBreakdown.RowCalculation.Orientation orientation2 = rowCalculation.orientation;
            int i2 = orientation2 == null ? -1 : DynamicChargesBreakdownComputerKt$WhenMappings.$EnumSwitchMapping$2[orientation2.ordinal()];
            if (i2 == -1 || i2 == 1 || i2 == 2) {
                orientation = OrderRow.Orientation.DEBIT;
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    throw th;
                }
                orientation = OrderRow.Orientation.CREDIT;
            }
            List<String> list2 = rowCalculation.dependencies;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (String str4 : list2) {
                str4.getClass();
                arrayList2.add(new RowIdentifier(str4));
            }
            arrayList.add(new OrderRow(str, visibility2, str2, str3, localMoney, orientation, arrayList2, Intrinsics.areEqual(rowCalculation.bold_treatment, Boolean.TRUE)));
        }
        String str5 = dynamicChargesBreakdown.customer_tip_identifier;
        String str6 = str5 != null ? str5 : null;
        String str7 = dynamicChargesBreakdown.local_cash_identifier;
        String str8 = str7 != null ? str7 : null;
        String str9 = dynamicChargesBreakdown.subtotal_identifier;
        String str10 = str9 != null ? str9 : null;
        String str11 = dynamicChargesBreakdown.total_before_tip_identifier;
        String str12 = str11 != null ? str11 : null;
        String str13 = dynamicChargesBreakdown.total_without_discounts_identifier;
        String str14 = str13 != null ? str13 : null;
        String str15 = dynamicChargesBreakdown.grand_total_identifier;
        this.orderSummary = new OrderSummary(arrayList, str6, str8, str10, str12, str14, str15 != null ? str15 : null);
    }
}
