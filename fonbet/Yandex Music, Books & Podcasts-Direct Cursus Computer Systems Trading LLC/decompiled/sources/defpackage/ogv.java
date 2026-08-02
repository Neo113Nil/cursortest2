package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class ogv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qgv b;

    public /* synthetic */ ogv(qgv qgvVar, int i) {
        this.a = i;
        this.b = qgvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c.invoke();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
