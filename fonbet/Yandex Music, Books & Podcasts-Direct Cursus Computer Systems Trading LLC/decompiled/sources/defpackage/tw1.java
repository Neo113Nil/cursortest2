package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tw1 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final dv1 d;
    public final boolean e;
    public final Object f;

    public tw1(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, dv1 dv1Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = dv1Var;
        this.e = z;
        int i2 = dvt.a;
        if (i2 < 26) {
            this.b = new sw1(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = new AudioFocusRequest.Builder(i).setAudioAttributes((AudioAttributes) dv1Var.b().a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw1)) {
            return false;
        }
        tw1 tw1Var = (tw1) obj;
        return this.a == tw1Var.a && this.e == tw1Var.e && Objects.equals(this.b, tw1Var.b) && Objects.equals(this.c, tw1Var.c) && Objects.equals(this.d, tw1Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
