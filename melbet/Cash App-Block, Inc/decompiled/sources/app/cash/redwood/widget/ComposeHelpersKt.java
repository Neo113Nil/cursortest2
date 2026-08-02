package app.cash.redwood.widget;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class ComposeHelpersKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewEarnerCustomerTaggingWithToken.deepLinkSpecs;
    }

    public static final void move(int i, int i2, int i3, List list) {
        list.getClass();
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = list.subList(i, i3 + i);
            ArrayList mutableList = CollectionsKt.toMutableList((Collection) subList);
            subList.clear();
            list.addAll(i4, mutableList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }
}
