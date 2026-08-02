package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class zfg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ agg b;

    public /* synthetic */ zfg(agg aggVar, int i) {
        this.a = i;
        this.b = aggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        agg aggVar = this.b;
        switch (i) {
            case 0:
                aggVar.b();
                break;
            default:
                aggVar.b();
                break;
        }
    }
}
