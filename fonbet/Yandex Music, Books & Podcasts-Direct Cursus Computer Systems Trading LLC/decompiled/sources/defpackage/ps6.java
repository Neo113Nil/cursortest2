package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ps6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts6 b;
    public final /* synthetic */ m7d c;

    public /* synthetic */ ps6(ts6 ts6Var, m7d m7dVar, int i) {
        this.a = i;
        this.b = ts6Var;
        this.c = m7dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e().f(this.c);
                break;
            default:
                this.b.e().f(this.c);
                break;
        }
    }
}
