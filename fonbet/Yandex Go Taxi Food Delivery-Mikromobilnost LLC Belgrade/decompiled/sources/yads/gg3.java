package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import defpackage.nba1;
import defpackage.rf71;

/* loaded from: classes7.dex */
public final class gg3 implements Choreographer.FrameCallback, Handler.Callback {
    public static final gg3 f = new gg3();
    public volatile long b = -9223372036854775807L;
    public final Handler c;
    public Choreographer d;
    public int e;

    public gg3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = rf71.a;
        Handler handler = new Handler(looper, this);
        this.c = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.b = j;
        Choreographer choreographer = this.d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.d = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e) {
                nba1.b("Vsync sampling disabled due to platform error", e);
                nba1.e();
                return true;
            }
        }
        if (i == 1) {
            Choreographer choreographer = this.d;
            if (choreographer != null) {
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.d;
            if (choreographer2 != null) {
                int i3 = this.e - 1;
                this.e = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.b = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
