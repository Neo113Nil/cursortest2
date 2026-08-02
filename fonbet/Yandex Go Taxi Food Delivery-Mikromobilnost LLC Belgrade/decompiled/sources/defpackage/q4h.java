package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class q4h implements ruy {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int w;

    public /* synthetic */ q4h(h42 h42Var, int i, long j) {
        this.b = h42Var;
        this.w = i;
        this.c = j;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        int i2 = this.w;
        long j = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onDroppedVideoFrames(h42Var, i2, j);
                break;
            default:
                j42Var.onVideoFrameProcessingOffset(h42Var, j, i2);
                break;
        }
    }

    public /* synthetic */ q4h(h42 h42Var, long j, int i) {
        this.b = h42Var;
        this.c = j;
        this.w = i;
    }
}
