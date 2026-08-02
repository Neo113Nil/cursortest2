package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class tio implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wio b;

    public /* synthetic */ tio(wio wioVar, int i) {
        this.a = i;
        this.b = wioVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wio.d(this.b);
                break;
            default:
                wio.d(this.b);
                break;
        }
    }
}
