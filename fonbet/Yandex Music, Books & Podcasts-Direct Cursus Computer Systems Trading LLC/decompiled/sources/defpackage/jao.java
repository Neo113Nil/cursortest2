package defpackage;

/* loaded from: classes5.dex */
public final class jao implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lao b;
    public final /* synthetic */ jtc c;

    public /* synthetic */ jao(jtc jtcVar, lao laoVar, int i) {
        this.a = i;
        this.c = jtcVar;
        this.b = laoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        jtc jtcVar = this.c;
        switch (i) {
            case 0:
                ((x7h) jtcVar.b).b.execute(new dsd(27, this));
                break;
            default:
                x7h x7hVar = (x7h) jtcVar.b;
                l2i l2iVar = x7h.E;
                x7hVar.g(this.b);
                break;
        }
    }
}
