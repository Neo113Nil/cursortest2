package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hkh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ykh b;
    public final /* synthetic */ kkh c;

    public /* synthetic */ hkh(ykh ykhVar, kkh kkhVar, int i) {
        this.a = i;
        this.b = ykhVar;
        this.c = kkhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ykh ykhVar = this.b;
                kkh kkhVar = this.c;
                ykhVar.i = kkhVar;
                if (ykhVar.j) {
                    ykhVar.l(kkhVar);
                }
                ykhVar.a(new hkh(ykhVar, kkhVar, 1), new xkh(0, ykhVar));
                break;
            default:
                ykh ykhVar2 = this.b;
                kkh kkhVar2 = this.c;
                if (ykhVar2.a instanceof g6) {
                    kkhVar2.a();
                    break;
                }
                break;
        }
    }
}
