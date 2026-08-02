package androidx.compose.runtime;

import com.squareup.cash.featureflags.FeatureFlag$Option;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class AbstractApplier implements Applier {
    public Object current;
    public final Object root;
    public final List stack;

    public AbstractApplier(Object obj) {
        this.root = obj;
        this.stack = new ArrayList();
        this.current = obj;
    }

    public static void move(int i, int i2, int i3, ArrayList arrayList) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List subList = arrayList.subList(i, i3 + i);
            ArrayList mutableList = CollectionsKt.toMutableList((Collection) subList);
            subList.clear();
            arrayList.addAll(i4, mutableList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            arrayList.set(i, arrayList.set(i2, arrayList.get(i)));
        } else {
            arrayList.add(i4, arrayList.remove(i));
        }
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        ((ArrayList) this.stack).clear();
        this.current = this.root;
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(Object obj) {
        ((ArrayList) this.stack).add(this.current);
        this.current = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return this.current;
    }

    public FeatureFlag$Option getOption(String str, String str2) {
        Object obj;
        Iterator it = this.stack.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((FeatureFlag$Option) obj).getIdentifier(), str2)) {
                break;
            }
        }
        return (FeatureFlag$Option) obj;
    }

    public abstract void onClear();

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.current = ((ArrayList) this.stack).remove(r0.size() - 1);
    }

    public AbstractApplier(String str, FeatureFlag$Option featureFlag$Option, List list) {
        this.root = str;
        this.current = featureFlag$Option;
        this.stack = list;
    }
}
