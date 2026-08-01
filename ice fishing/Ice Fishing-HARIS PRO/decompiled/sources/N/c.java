package N;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f631c;

    public c(int i) {
        super(i);
        this.f631c = new Object();
    }

    @Override // N.b
    public final Object a() {
        Object a2;
        synchronized (this.f631c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // N.b
    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.f631c) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
