package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class ek7 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ fk7 a;

    public ek7(fk7 fk7Var) {
        this.a = fk7Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        gk7 gk7Var;
        ly1 ly1Var;
        if (audioTrack.equals(this.a.c.v) && (ly1Var = (gk7Var = this.a.c).r) != null && gk7Var.V) {
            ly1Var.X();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.a.c.v)) {
            this.a.c.U = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        gk7 gk7Var;
        ly1 ly1Var;
        if (audioTrack.equals(this.a.c.v) && (ly1Var = (gk7Var = this.a.c).r) != null && gk7Var.V) {
            ly1Var.X();
        }
    }
}
