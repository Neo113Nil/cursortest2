package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class w53 extends ycs0 implements Map {
    public q53 w;
    public s53 x;
    public u53 y;

    public w53(w53 w53Var) {
        super(0);
        if (w53Var != null) {
            g(w53Var);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        q53 q53Var = this.w;
        if (q53Var != null) {
            return q53Var;
        }
        q53 q53Var2 = new q53(this);
        this.w = q53Var2;
        return q53Var2;
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
        s53 s53Var = this.x;
        if (s53Var != null) {
            return s53Var;
        }
        s53 s53Var2 = new s53(this);
        this.x = s53Var2;
        return s53Var2;
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
        u53 u53Var = this.y;
        if (u53Var != null) {
            return u53Var;
        }
        u53 u53Var2 = new u53(this);
        this.y = u53Var2;
        return u53Var2;
    }

    public w53() {
    }
}
