package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class xy0 extends ciq implements Map {
    public sy0 d;
    public uy0 e;
    public wy0 f;

    public xy0(xy0 xy0Var) {
        super(0);
        g(xy0Var);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        sy0 sy0Var = this.d;
        if (sy0Var != null) {
            return sy0Var;
        }
        sy0 sy0Var2 = new sy0(0, this);
        this.d = sy0Var2;
        return sy0Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        uy0 uy0Var = this.e;
        if (uy0Var != null) {
            return uy0Var;
        }
        uy0 uy0Var2 = new uy0(this);
        this.e = uy0Var2;
        return uy0Var2;
    }

    public final boolean l(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    public final boolean m(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                h(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        wy0 wy0Var = this.f;
        if (wy0Var != null) {
            return wy0Var;
        }
        wy0 wy0Var2 = new wy0(this);
        this.f = wy0Var2;
        return wy0Var2;
    }
}
