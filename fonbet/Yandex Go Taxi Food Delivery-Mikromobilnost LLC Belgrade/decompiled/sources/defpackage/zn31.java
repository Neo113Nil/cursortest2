package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class zn31 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a201 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int w;

    public /* synthetic */ zn31(a201 a201Var, int i, long j) {
        this.b = a201Var;
        this.w = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.w;
        long j = this.c;
        a201 a201Var = this.b;
        switch (i) {
            case 0:
                co31 co31Var = (co31) a201Var.c;
                int i3 = tw21.a;
                co31Var.onDroppedFrames(i2, j);
                break;
            default:
                co31 co31Var2 = (co31) a201Var.c;
                int i4 = tw21.a;
                co31Var2.onVideoFrameProcessingOffset(j, i2);
                break;
        }
    }

    public /* synthetic */ zn31(a201 a201Var, long j, int i) {
        this.b = a201Var;
        this.c = j;
        this.w = i;
    }
}
