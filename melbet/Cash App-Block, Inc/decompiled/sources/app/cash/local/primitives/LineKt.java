package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public abstract class LineKt {
    public static final Line toLine(LocalCart.Line line) {
        line.getClass();
        LocalCart.Line.Selection selection = line.selection;
        selection.getClass();
        Selection selection2 = SelectionKt.toSelection(selection);
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney = line.total_price_before_discounts;
        LocalMoney money = localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = line.total_price;
        localMoney2.getClass();
        LocalMoney money2 = LocalMoneyKt.toMoney(localMoney2);
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney3 = line.discount_amount;
        LocalMoney money3 = localMoney3 != null ? LocalMoneyKt.toMoney(localMoney3) : null;
        ArrayList plus = CollectionsKt.plus((Iterable) line.discount_texts, (Collection) CollectionsKt__CollectionsKt.listOfNotNull(line.discount_text));
        ArrayList arrayList = new ArrayList();
        Iterator it = plus.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((String) next).length() > 0) {
                arrayList.add(next);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62);
        return new Line(selection2, money, money2, money3, joinToString$default.length() > 0 ? joinToString$default : null, line.menu_item_name, line.menu_item_variation_name);
    }
}
