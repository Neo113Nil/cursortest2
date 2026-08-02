package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class adx extends ocx {
    public final transient u7x f;
    public final transient Object[] g;
    public final transient int h;

    public adx(u7x u7xVar, Object[] objArr, int i) {
        super(1);
        this.f = u7xVar;
        this.g = objArr;
        this.h = i;
    }

    @Override // defpackage.r4x
    public final int a(Object[] objArr) {
        hcx hcxVar = this.d;
        if (hcxVar == null) {
            hcxVar = u();
            this.d = hcxVar;
        }
        return hcxVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        hcx hcxVar = this.d;
        if (hcxVar == null) {
            hcxVar = u();
            this.d = hcxVar;
        }
        return hcxVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }

    public final hcx u() {
        return new ycx(this);
    }
}
