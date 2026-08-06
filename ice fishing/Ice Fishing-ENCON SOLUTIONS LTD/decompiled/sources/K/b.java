package K;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1022b;

    public /* synthetic */ b(e eVar, int i2) {
        this.f1021a = i2;
        this.f1022b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1021a) {
            case 0:
                this.f1022b.f1035j.onDismiss(null);
                break;
            default:
                e eVar = this.f1022b;
                if (eVar.f1029d != null) {
                    if (eVar.f1029d == null) {
                        I0.b bVar = new I0.b(1, false);
                        Object obj = e.f1025n;
                        bVar.f721b = obj;
                        bVar.f722c = obj;
                        bVar.f723d = obj;
                        eVar.f1029d = bVar;
                    }
                    eVar.f1029d.getClass();
                    break;
                }
                break;
        }
    }
}
