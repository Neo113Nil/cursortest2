package P1;

/* loaded from: classes.dex */
public final class c extends s.b {

    /* renamed from: B, reason: collision with root package name */
    public int f2353B;

    @Override // s.k, java.util.Map
    public final void clear() {
        this.f2353B = 0;
        super.clear();
    }

    @Override // s.k, java.util.Map
    public final int hashCode() {
        if (this.f2353B == 0) {
            this.f2353B = super.hashCode();
        }
        return this.f2353B;
    }

    @Override // s.k
    public final void i(s.k kVar) {
        this.f2353B = 0;
        super.i(kVar);
    }

    @Override // s.k
    public final Object j(int i) {
        this.f2353B = 0;
        return super.j(i);
    }

    @Override // s.k
    public final Object k(int i, Object obj) {
        this.f2353B = 0;
        return super.k(i, obj);
    }

    @Override // s.k, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f2353B = 0;
        return super.put(obj, obj2);
    }
}
