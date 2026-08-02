package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class fk7 {
    public final Handler a = new Handler(Looper.myLooper());
    public final ek7 b = new ek7(this);
    public final /* synthetic */ gk7 c;

    public fk7(gk7 gk7Var) {
        this.c = gk7Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
