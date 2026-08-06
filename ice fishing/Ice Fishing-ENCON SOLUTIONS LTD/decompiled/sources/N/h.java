package N;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class h {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: N.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
