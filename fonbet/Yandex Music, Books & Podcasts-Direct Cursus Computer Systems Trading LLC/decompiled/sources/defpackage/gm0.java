package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class gm0 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ gm0(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            default:
                this.b.run();
                break;
        }
    }
}
