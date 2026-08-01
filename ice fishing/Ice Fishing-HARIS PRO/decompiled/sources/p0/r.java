package p0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4210a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f4211b;

    public /* synthetic */ r() {
    }

    @Override // p0.n, p0.k
    public void b(m mVar) {
        switch (this.f4210a) {
            case 1:
                C0323a c0323a = (C0323a) this.f4211b;
                if (!c0323a.f4150D) {
                    c0323a.G();
                    c0323a.f4150D = true;
                    break;
                }
                break;
        }
    }

    @Override // p0.k
    public final void c(m mVar) {
        switch (this.f4210a) {
            case 0:
                this.f4211b.z();
                mVar.x(this);
                break;
            default:
                C0323a c0323a = (C0323a) this.f4211b;
                int i = c0323a.f4149C - 1;
                c0323a.f4149C = i;
                if (i == 0) {
                    c0323a.f4150D = false;
                    c0323a.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f4211b = mVar;
    }
}
