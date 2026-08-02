package defpackage;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.b;
import com.google.common.base.c;

/* loaded from: classes10.dex */
public final class vf3 {
    public final rhw0 a;
    public final Handler b;
    public uf3 c;
    public ue3 d;
    public int f;
    public b h;
    public float g = 1.0f;
    public int e = 0;

    public vf3(Context context, Looper looper, uf3 uf3Var) {
        this.a = c.a(new tf3(context, 0));
        this.c = uf3Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.a.get();
        b bVar = this.h;
        if (tw21.a < 26) {
            audioManager.abandonAudioFocus(bVar.b);
            return;
        }
        AudioFocusRequest audioFocusRequest = bVar.f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        uf3 uf3Var = this.c;
        if (uf3Var != null) {
            uf3Var.setVolumeMultiplier(f);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        int requestAudioFocus;
        yf3 yf3Var;
        boolean z2 = false;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                b bVar = this.h;
                if (bVar == null) {
                    if (bVar == null) {
                        yf3Var = new yf3();
                        yf3Var.c = ue3.c;
                        yf3Var.a = i2;
                    } else {
                        yf3 yf3Var2 = new yf3();
                        yf3Var2.a = bVar.a;
                        yf3Var2.c = bVar.d;
                        yf3Var2.b = bVar.e;
                        yf3Var = yf3Var2;
                    }
                    ue3 ue3Var = this.d;
                    if (ue3Var != null && ue3Var.a == 1) {
                        z2 = true;
                    }
                    ue3Var.getClass();
                    yf3Var.c = ue3Var;
                    yf3Var.b = z2;
                    o72 o72Var = new o72(1, this);
                    Handler handler = this.b;
                    handler.getClass();
                    this.h = new b(yf3Var.a, o72Var, handler, (ue3) yf3Var.c, yf3Var.b);
                }
                AudioManager audioManager = (AudioManager) this.a.get();
                b bVar2 = this.h;
                if (tw21.a >= 26) {
                    AudioFocusRequest audioFocusRequest = bVar2.f;
                    audioFocusRequest.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(audioFocusRequest);
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = bVar2.b;
                    bVar2.d.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, bVar2.a);
                }
                if (requestAudioFocus == 1) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (i3 == 1) {
                return -1;
            }
            if (i3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
