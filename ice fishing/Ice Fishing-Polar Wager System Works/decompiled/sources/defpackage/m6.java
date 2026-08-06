package defpackage;

/* loaded from: classes.dex */
public class m6 extends java.util.AbstractSet {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.util.Map xiZrDbcSW0;

    public /* synthetic */ m6(java.util.Map map, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((defpackage.ka1) this.xiZrDbcSW0).put((java.lang.Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.adDC3e2L) {
            case 1:
                ((defpackage.ka1) this.xiZrDbcSW0).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                java.lang.Object obj2 = ((defpackage.ka1) this.xiZrDbcSW0).get(entry.getKey());
                java.lang.Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        int i = this.adDC3e2L;
        java.util.Map map = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return new defpackage.p6((defpackage.r6) map);
            default:
                return new defpackage.ma1((defpackage.ka1) map);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        switch (this.adDC3e2L) {
            case 1:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((defpackage.ka1) this.xiZrDbcSW0).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.adDC3e2L;
        java.util.Map map = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                return ((defpackage.r6) map).AARZUJiTa;
            default:
                return ((defpackage.ka1) map).size();
        }
    }
}
