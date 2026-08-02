package defpackage;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final /* synthetic */ class qt1 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt1(iih iihVar, ckh ckhVar, int i) {
        this.a = i;
        this.b = ckhVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                ((ckh) this.b).c(j);
                break;
            case 1:
                ((ckh) this.b).c(j);
                break;
            case 2:
                ((ckh) this.b).c(j);
                break;
            default:
                ((ckh) this.b).c(j);
                break;
        }
    }
}
