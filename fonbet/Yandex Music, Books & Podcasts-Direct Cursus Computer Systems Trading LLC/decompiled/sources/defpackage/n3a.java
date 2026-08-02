package defpackage;

/* loaded from: classes5.dex */
public final class n3a implements dzf {
    public final /* synthetic */ int a;
    public final Object b;

    public n3a() {
        this.a = 1;
        this.b = new gzf(this);
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        switch (this.a) {
            case 0:
                return ((o3a) this.b).h();
            default:
                return (gzf) this.b;
        }
    }

    public n3a(o3a o3aVar) {
        this.a = 0;
        this.b = o3aVar;
    }
}
