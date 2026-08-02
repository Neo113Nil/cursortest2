package app.cash.local.primitives;

import app.cash.local.primitives.ComputedOrderSummary;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ComputedOrderSummaryKt {
    public static final ComputedOrderSummary.Row getCustomerTipRow(ComputedOrderSummary computedOrderSummary) {
        Object obj;
        Iterator it = computedOrderSummary.rows.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((ComputedOrderSummary.Row) obj).identifier;
            String str2 = computedOrderSummary.customerTipIdentifier;
            if (str2 == null ? false : Intrinsics.areEqual(str, str2)) {
                break;
            }
        }
        return (ComputedOrderSummary.Row) obj;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewCustomerProfileSms.deepLinkSpecs;
    }

    public static final ComputedOrderSummary.Row getGrandTotalRow(ComputedOrderSummary computedOrderSummary) {
        Object obj;
        computedOrderSummary.getClass();
        Iterator it = computedOrderSummary.rows.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((ComputedOrderSummary.Row) obj).identifier;
            String str2 = computedOrderSummary.grandTotalIdentifier;
            if (str2 == null ? false : Intrinsics.areEqual(str, str2)) {
                break;
            }
        }
        return (ComputedOrderSummary.Row) obj;
    }

    public static final ComputedOrderSummary.Row getTotalWithoutDiscountsRow(ComputedOrderSummary computedOrderSummary) {
        Object obj;
        Iterator it = computedOrderSummary.rows.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = ((ComputedOrderSummary.Row) obj).identifier;
            String str2 = computedOrderSummary.totalWithoutDiscountsIdentifier;
            if (str2 == null ? false : Intrinsics.areEqual(str, str2)) {
                break;
            }
        }
        return (ComputedOrderSummary.Row) obj;
    }
}
