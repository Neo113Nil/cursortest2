package app.cash.local.primitives;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class MarketingMessageDataKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDependentSavingsGoal.deepLinkSpecs;
    }

    public static final List withRedeemedStatus(List list, Set set) {
        list.getClass();
        set.getClass();
        if (set.isEmpty()) {
            return list;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MarketingMessageData) it.next()).withRedeemedStatus(set));
        }
        return arrayList;
    }
}
