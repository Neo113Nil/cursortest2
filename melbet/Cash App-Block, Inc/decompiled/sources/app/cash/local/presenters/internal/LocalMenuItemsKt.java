package app.cash.local.presenters.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.local.primitives.DiscountToken;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.MenuDiscountSummary;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.Modifier;
import app.cash.local.primitives.math.LocalMoneysKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes3.dex */
public abstract class LocalMenuItemsKt {
    public static final String discountText(MenuItem menuItem, Map map) {
        map.getClass();
        ArrayList arrayList = menuItem.discountTokens;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MenuDiscountSummary menuDiscountSummary = (MenuDiscountSummary) map.get(new DiscountToken(((DiscountToken) it.next()).value));
            String str = menuDiscountSummary != null ? menuDiscountSummary.name : null;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62);
        if (joinToString$default.length() > 0) {
            return joinToString$default;
        }
        return null;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewConfirmDeposit.deepLinkSpecs;
    }

    public static final String priceRangeAsString(MenuItem menuItem, List list) {
        Object next;
        LocalMoney localMoney;
        menuItem.getClass();
        list.getClass();
        ArrayList arrayList = menuItem.variations;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((MenuItemVariation) obj).availability != LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_SOLD_OUT) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((MenuItemVariation) it.next()).price);
        }
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.flatMapIterable(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(list, 1), new Data$$ExternalSyntheticLambda0(24)), LocalMenuItemsKt$priceRange$$inlined$filterIsInstance$1.INSTANCE), new Data$$ExternalSyntheticLambda0(25)), new Data$$ExternalSyntheticLambda0(26)));
        if (filteringSequence$iterator$1.hasNext()) {
            next = filteringSequence$iterator$1.next();
            if (filteringSequence$iterator$1.hasNext()) {
                LocalMoney localMoney2 = ((Modifier) next).price;
                localMoney2.getClass();
                long j = localMoney2.amount;
                do {
                    Object next2 = filteringSequence$iterator$1.next();
                    LocalMoney localMoney3 = ((Modifier) next2).price;
                    localMoney3.getClass();
                    long j2 = localMoney3.amount;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (filteringSequence$iterator$1.hasNext());
            }
        } else {
            next = null;
        }
        Modifier modifier = (Modifier) next;
        Iterator it2 = arrayList3.iterator();
        if (!it2.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object next3 = it2.next();
        if (it2.hasNext()) {
            long j3 = ((LocalMoney) next3).amount;
            do {
                Object next4 = it2.next();
                long j4 = ((LocalMoney) next4).amount;
                if (j3 > j4) {
                    next3 = next4;
                    j3 = j4;
                }
            } while (it2.hasNext());
        }
        LocalMoney localMoney4 = (LocalMoney) next3;
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Object next5 = it3.next();
        if (it3.hasNext()) {
            long j5 = ((LocalMoney) next5).amount;
            do {
                Object next6 = it3.next();
                long j6 = ((LocalMoney) next6).amount;
                if (j5 < j6) {
                    next5 = next6;
                    j5 = j6;
                }
            } while (it3.hasNext());
        }
        LocalMoney localMoney5 = (LocalMoney) next5;
        if (modifier == null || (localMoney = modifier.price) == null) {
            localMoney = new LocalMoney(0L, LocalCurrencyCode.USD);
        }
        LocalMoney plus = LocalMoneysKt.plus(localMoney5, localMoney);
        return localMoney4.amount != plus.amount ? Recorder$$ExternalSyntheticOutline2.m(LocalsKt.prettyPrint$default(localMoney4, false, null, 7), "-", LocalsKt.prettyPrint$default(plus, false, null, 7)) : LocalsKt.prettyPrint$default(localMoney4, false, null, 7);
    }
}
