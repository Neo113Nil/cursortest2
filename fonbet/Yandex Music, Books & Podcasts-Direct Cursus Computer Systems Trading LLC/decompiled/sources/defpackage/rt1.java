package defpackage;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class rt1 implements yqr {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ rt1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.yqr
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(st1.v(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 1:
                return new HandlerThread(st1.v(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            case 2:
                return new HandlerThread(wj7.u(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            case 3:
                return new HandlerThread(wj7.u(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            case 4:
                return new HandlerThread(tnn.a(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(tnn.a(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
