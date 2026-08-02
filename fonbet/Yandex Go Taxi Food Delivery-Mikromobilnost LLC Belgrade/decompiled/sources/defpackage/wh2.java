package defpackage;

import android.view.Choreographer;

/* loaded from: classes10.dex */
public final /* synthetic */ class wh2 implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ wh2(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
