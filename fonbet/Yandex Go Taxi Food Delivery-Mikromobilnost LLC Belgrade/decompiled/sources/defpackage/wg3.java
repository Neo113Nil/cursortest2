package defpackage;

import yads.t31;

/* loaded from: classes10.dex */
public final /* synthetic */ class wg3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ Object x;

    public /* synthetic */ wg3(int i, int i2, long j, long j2, Object obj) {
        this.a = i2;
        this.x = obj;
        this.b = i;
        this.c = j;
        this.w = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.x;
        switch (i) {
            case 0:
                xg3 xg3Var = (xg3) ((h0w) obj).c;
                int i2 = tw21.a;
                xg3Var.onAudioUnderrun(this.b, this.c, this.w);
                break;
            case 1:
                ((fp4) obj).b.onBandwidthSample(this.b, this.c, this.w);
                break;
            default:
                ep71 ep71Var = (ep71) ((b291) obj).b;
                vmn0 vmn0Var = ep71Var.w;
                wc71 w = ep71Var.w(((t31) vmn0Var.b).isEmpty() ? null : (v281) jla1.g((t31) vmn0Var.b));
                ep71Var.y(w, 1006, new u2v0(w, this.b, this.c, this.w));
                break;
        }
    }
}
