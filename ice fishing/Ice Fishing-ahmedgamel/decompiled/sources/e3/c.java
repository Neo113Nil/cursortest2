package e3;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: v, reason: collision with root package name */
    public final transient e f37272v;

    public c(e eVar) {
        this.f37272v = eVar;
    }

    @Override // e3.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f37272v.contains(obj);
    }

    @Override // e3.e
    public final e f() {
        return this.f37272v;
    }

    @Override // e3.e, java.util.List
    /* renamed from: g */
    public final e subList(int i, int i4) {
        e eVar = this.f37272v;
        S0.f.z(i, i4, eVar.size());
        return eVar.subList(eVar.size() - i4, eVar.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.f37272v;
        S0.f.y(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // e3.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f37272v.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // e3.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f37272v.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37272v.size();
    }
}
