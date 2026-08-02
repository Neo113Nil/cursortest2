package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bhd b;
    public final /* synthetic */ int c;

    public /* synthetic */ wld(bhd bhdVar, int i, int i2) {
        this.a = i2;
        this.b = bhdVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                irh irhVar = ((yld) ((vx6) this.b.h).d).d;
                if (irhVar != null) {
                    irhVar.j(this.c);
                    break;
                }
                break;
            default:
                irh irhVar2 = ((yld) ((vx6) this.b.h).d).d;
                if (irhVar2 != null) {
                    irhVar2.k(this.c);
                    break;
                }
                break;
        }
    }
}
