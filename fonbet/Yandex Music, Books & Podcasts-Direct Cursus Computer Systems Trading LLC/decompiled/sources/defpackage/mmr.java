package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes6.dex */
public final class mmr extends scl {
    public final axh a;
    public final ExoPlayer b;
    public final yjj c;
    public final jmr d;
    public final Handler e;
    public boolean f;

    public mmr(axh axhVar, ExoPlayer exoPlayer, yjj yjjVar, jmr jmrVar, Looper looper) {
        axhVar.getClass();
        exoPlayer.getClass();
        yjjVar.getClass();
        jmrVar.getClass();
        looper.getClass();
        this.a = axhVar;
        this.b = exoPlayer;
        this.c = yjjVar;
        this.d = jmrVar;
        this.e = new Handler(looper);
    }

    @Override // defpackage.f8l
    public final void S(int i, boolean z) {
        Handler handler = this.e;
        if (i != 2) {
            this.f = false;
            handler.removeCallbacksAndMessages(null);
            return;
        }
        this.f = false;
        handler.removeCallbacksAndMessages(null);
        jmr jmrVar = this.d;
        if (!jmrVar.e || this.f) {
            handler.postDelayed(new lmr(this.a, this.b, this.c, jmrVar), jmrVar.b);
        }
    }
}
