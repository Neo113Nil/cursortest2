package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class b5 extends m21 implements Map {
    public a5 JFJ3QoxA;
    public w4 encWxUiV2;
    public y4 mOu10nynGul;

    public final boolean JFJ3QoxA(Collection collection) {
        int i = this.AvO7iQsrTN;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.AvO7iQsrTN;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        w4 w4Var = this.encWxUiV2;
        if (w4Var != null) {
            return w4Var;
        }
        w4 w4Var2 = new w4(this, 0);
        this.encWxUiV2 = w4Var2;
        return w4Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        y4 y4Var = this.mOu10nynGul;
        if (y4Var != null) {
            return y4Var;
        }
        y4 y4Var2 = new y4(this);
        this.mOu10nynGul = y4Var2;
        return y4Var2;
    }

    public final boolean mOu10nynGul(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.AvO7iQsrTN;
        int i = this.AvO7iQsrTN;
        int[] iArr = this.OOA6hdeuvCS;
        if (iArr.length < size) {
            this.OOA6hdeuvCS = Arrays.copyOf(iArr, size);
            this.EljAMC1QTz = Arrays.copyOf(this.EljAMC1QTz, size * 2);
        }
        if (this.AvO7iQsrTN != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        a5 a5Var = this.JFJ3QoxA;
        if (a5Var != null) {
            return a5Var;
        }
        a5 a5Var2 = new a5(this);
        this.JFJ3QoxA = a5Var2;
        return a5Var2;
    }
}
