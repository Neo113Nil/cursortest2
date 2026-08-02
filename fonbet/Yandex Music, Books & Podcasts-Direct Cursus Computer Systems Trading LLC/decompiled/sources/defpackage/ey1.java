package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class ey1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ey1(long j, ju7 ju7Var) {
        this.b = j;
        this.c = ju7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                fy1 fy1Var = (fy1) ((xiu) obj).c;
                int i2 = dvt.a;
                fy1Var.B(j);
                break;
            default:
                Thread.sleep(j);
                ((ju7) obj).b(Unit.a);
                break;
        }
    }

    public /* synthetic */ ey1(xiu xiuVar, long j) {
        this.c = xiuVar;
        this.b = j;
    }
}
