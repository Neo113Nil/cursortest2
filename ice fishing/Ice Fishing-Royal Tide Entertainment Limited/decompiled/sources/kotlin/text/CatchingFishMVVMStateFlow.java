package kotlin.text;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class CatchingFishMVVMStateFlow extends CatchingFishHiltRoom {
    public static void CatchingFishAppCompat(AbstractList abstractList, Iterable iterable) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(abstractList, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }
}
