package defpackage;

/* loaded from: classes3.dex */
public final class v6e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Exception b;
    public final /* synthetic */ qdc c;

    public /* synthetic */ v6e(qdc qdcVar, Exception exc, int i) {
        this.a = i;
        this.c = qdcVar;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((v7o) this.c.b).onError(veb.b(this.b));
                break;
            default:
                ((v7o) this.c.b).onError(veb.b(this.b));
                break;
        }
    }
}
