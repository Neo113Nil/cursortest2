package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class r7x extends u6x {
    public final transient u7x c;
    public final transient Object[] d;
    public final transient int e;

    public r7x(u7x u7xVar, Object[] objArr, int i) {
        this.c = u7xVar;
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.a6x
    public final int a(Object[] objArr) {
        return o().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return o().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.u6x
    public final i6x t() {
        return new q7x(this);
    }
}
