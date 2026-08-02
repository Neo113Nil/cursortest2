package defpackage;

/* loaded from: classes5.dex */
public final class k2f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdg b;
    public final /* synthetic */ ckp c;

    public /* synthetic */ k2f(cdg cdgVar, ckp ckpVar, int i) {
        this.a = i;
        this.b = cdgVar;
        this.c = ckpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
