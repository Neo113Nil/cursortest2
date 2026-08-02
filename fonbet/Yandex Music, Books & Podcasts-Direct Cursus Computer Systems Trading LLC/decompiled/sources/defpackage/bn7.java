package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class bn7 extends ltg implements Map {
    public final /* synthetic */ int q = 1;
    public final Map r;

    public bn7() {
        super(25);
        this.r = new HashMap();
    }

    @Override // defpackage.ltg
    public final Object B() {
        switch (this.q) {
            case 0:
                return this.r;
            default:
                return (HashMap) this.r;
        }
    }

    public final boolean P(Object obj) {
        return S().containsKey(obj);
    }

    public final boolean R(Object obj) {
        return S().containsValue(obj);
    }

    public final Map S() {
        switch (this.q) {
            case 0:
                return this.r;
            default:
                return (HashMap) this.r;
        }
    }

    public double U() {
        HashMap hashMap = (HashMap) this.r;
        if (hashMap.isEmpty()) {
            return 0.0d;
        }
        Iterator it = hashMap.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            if (((qxj) it.next()).d()) {
                i++;
            }
        }
        return (i / i2) * 100.0d;
    }

    public final Set V() {
        return S().entrySet();
    }

    public final boolean X(Object obj) {
        return obj == this || S().equals(obj);
    }

    public final Object Y(Object obj) {
        return S().get(obj);
    }

    public final int Z() {
        return S().hashCode();
    }

    public final boolean a0() {
        return S().isEmpty();
    }

    public final Set b0() {
        return S().keySet();
    }

    public final int c0() {
        return S().size();
    }

    @Override // java.util.Map
    public final void clear() {
        S().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        switch (this.q) {
            case 0:
                return obj != null && P(obj);
            default:
                return P(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        switch (this.q) {
            case 0:
                Iterator it = ((rop) entrySet()).iterator();
                it.getClass();
                if (obj == null) {
                    while (it.hasNext()) {
                        if (((Map.Entry) it.next()).getValue() == null) {
                            return true;
                        }
                    }
                    return false;
                }
                while (it.hasNext()) {
                    if (obj.equals(((Map.Entry) it.next()).getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return R(obj);
        }
    }

    @Override // java.util.Map
    public Set entrySet() {
        switch (this.q) {
            case 0:
                return ezf.z(V(), new an7(0));
            default:
                return V();
        }
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        switch (this.q) {
            case 0:
                return obj != null && gdg.v(obj, this);
            default:
                return X(obj);
        }
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        switch (this.q) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) Y(obj);
            default:
                return Y(obj);
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        switch (this.q) {
            case 0:
                return ezf.E(entrySet());
            default:
                return Z();
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        switch (this.q) {
            case 0:
                if (a0()) {
                    return true;
                }
                return c0() == 1 && P(null);
            default:
                return a0();
        }
    }

    @Override // java.util.Map
    public Set keySet() {
        switch (this.q) {
            case 0:
                return ezf.z(b0(), new an7(1));
            default:
                return b0();
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return S().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        S().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return S().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        switch (this.q) {
            case 0:
                return c0() - (P(null) ? 1 : 0);
            default:
                return c0();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        return S().values();
    }

    public bn7(Map map) {
        super(25);
        this.r = map;
    }
}
