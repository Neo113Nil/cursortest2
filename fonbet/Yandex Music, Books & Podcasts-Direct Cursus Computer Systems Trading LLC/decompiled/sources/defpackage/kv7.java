package defpackage;

/* loaded from: classes5.dex */
public final class kv7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzc b;

    public /* synthetic */ kv7(qzc qzcVar, int i) {
        this.a = i;
        this.b = qzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.M(true);
                break;
            case 1:
                this.b.M(false);
                break;
            default:
                j8h j8hVar = (j8h) this.b.b;
                o2g.U("Channel must have been shut down", j8hVar.F.get());
                j8hVar.H = true;
                j8hVar.v(false);
                j8h.p(j8hVar);
                j8h.q(j8hVar);
                break;
        }
    }
}
