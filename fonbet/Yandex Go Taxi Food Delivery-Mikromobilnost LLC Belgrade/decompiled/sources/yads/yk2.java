package yads;

import defpackage.wr71;
import java.util.Map;

/* loaded from: classes7.dex */
public final class yk2 extends y31 {
    public final transient w31 w;
    public final transient Object[] x;
    public final transient int y;

    public yk2(w31 w31Var, Object[] objArr, int i) {
        this.w = w31Var;
        this.x = objArr;
        this.y = i;
    }

    @Override // yads.n31
    public final int a(int i, Object[] objArr) {
        return b().a(i, objArr);
    }

    @Override // yads.n31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.w.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.n31
    public final boolean i() {
        return true;
    }

    @Override // yads.n31
    /* renamed from: j */
    public final wr71 iterator() {
        return b().listIterator(0);
    }

    @Override // yads.y31
    public final t31 m() {
        return new xk2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.y;
    }
}
