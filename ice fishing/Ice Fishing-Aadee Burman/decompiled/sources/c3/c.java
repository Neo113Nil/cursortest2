package c3;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: v, reason: collision with root package name */
    public final transient e f5557v;

    public c(e eVar) {
        this.f5557v = eVar;
    }

    @Override // c3.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5557v.contains(obj);
    }

    @Override // c3.e
    public final e f() {
        return this.f5557v;
    }

    @Override // c3.e, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final e subList(int i, int i6) {
        e eVar = this.f5557v;
        com.bumptech.glide.e.m(i, i6, eVar.size());
        return eVar.subList(eVar.size() - i6, eVar.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.f5557v;
        com.bumptech.glide.e.l(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // c3.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f5557v.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // c3.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f5557v.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5557v.size();
    }
}
