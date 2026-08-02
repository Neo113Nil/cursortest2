package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class yx1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yx1(Object obj, String str, long j, long j2, int i) {
        this.a = i;
        this.e = obj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                fy1 fy1Var = (fy1) ((xiu) obj).c;
                int i2 = dvt.a;
                fy1Var.E(this.c, this.d, this.b);
                break;
            default:
                ccu ccuVar = (ccu) ((dxr) obj).b;
                int i3 = dvt.a;
                ccuVar.g(this.c, this.d, this.b);
                break;
        }
    }
}
