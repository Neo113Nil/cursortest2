package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zx1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zx1(Object obj, int i, long j, long j2, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = i;
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
                fy1Var.O(this.b, this.c, this.d);
                break;
            default:
                ((wk2) obj).b.c(this.b, this.c, this.d);
                break;
        }
    }
}
