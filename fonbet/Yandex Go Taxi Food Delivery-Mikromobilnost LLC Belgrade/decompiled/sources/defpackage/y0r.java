package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class y0r implements Runnable {
    public final /* synthetic */ z0r a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ y0r(z0r z0rVar, long j, long j2) {
        this.a = z0rVar;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w0r w0rVar = this.a.w;
        if (w0rVar != null) {
            w0rVar.f(this.b, this.c);
        }
    }
}
