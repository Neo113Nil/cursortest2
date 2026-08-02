package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ssn extends hee {
    public final transient cee d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    public ssn(cee ceeVar, Object[] objArr, int i, int i2) {
        this.d = ceeVar;
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.qde, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qde
    public final int g(int i, Object[] objArr) {
        return a().g(i, objArr);
    }

    @Override // defpackage.qde
    public final boolean r() {
        return true;
    }

    @Override // defpackage.qde
    /* renamed from: s */
    public final xkt iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.hee
    public final yde w() {
        return new rsn(this);
    }

    @Override // defpackage.hee, defpackage.qde
    public Object writeReplace() {
        return super.writeReplace();
    }
}
