package defpackage;

/* loaded from: classes6.dex */
public final /* synthetic */ class suj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ avj b;

    public /* synthetic */ suj(avj avjVar, int i) {
        this.a = i;
        this.b = avjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                avj avjVar = this.b;
                synchronized (avjVar) {
                    if (!avjVar.f.f) {
                        avjVar.f.f = true;
                        avjVar.M();
                    }
                }
                return;
            case 1:
                this.b.P();
                return;
            default:
                this.b.O();
                return;
        }
    }
}
