package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zbu implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dxr b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ zbu(dxr dxrVar, int i, long j) {
        this.b = dxrVar;
        this.d = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.d;
        long j = this.c;
        dxr dxrVar = this.b;
        switch (i) {
            case 0:
                ccu ccuVar = (ccu) dxrVar.b;
                int i3 = dvt.a;
                ccuVar.G(i2, j);
                break;
            default:
                ccu ccuVar2 = (ccu) dxrVar.b;
                int i4 = dvt.a;
                ccuVar2.z(i2, j);
                break;
        }
    }

    public /* synthetic */ zbu(dxr dxrVar, long j, int i) {
        this.b = dxrVar;
        this.c = j;
        this.d = i;
    }
}
