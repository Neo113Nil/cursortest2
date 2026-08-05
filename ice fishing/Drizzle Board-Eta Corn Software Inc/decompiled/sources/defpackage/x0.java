package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class x0 extends p70 implements Map {
    public u0 P7K7Inc8;
    public s0 VgvYg0wo;
    public w0 b2ZJblxo;

    public final boolean eVhOlqcC(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        s0 s0Var = this.VgvYg0wo;
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0(this);
        this.VgvYg0wo = s0Var2;
        return s0Var2;
    }

    public final boolean k3x7lurq(Collection collection) {
        int i = this.wxUZMvaN;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.wxUZMvaN;
    }

    @Override // java.util.Map
    public final Set keySet() {
        u0 u0Var = this.P7K7Inc8;
        if (u0Var != null) {
            return u0Var;
        }
        u0 u0Var2 = new u0(this);
        this.P7K7Inc8 = u0Var2;
        return u0Var2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        NCTxEWno(map.size() + this.wxUZMvaN);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        w0 w0Var = this.b2ZJblxo;
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(this);
        this.b2ZJblxo = w0Var2;
        return w0Var2;
    }
}
