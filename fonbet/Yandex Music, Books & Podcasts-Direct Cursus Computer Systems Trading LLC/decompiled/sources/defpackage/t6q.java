package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes4.dex */
public final class t6q implements d80 {
    public final /* synthetic */ wzc a;
    public final /* synthetic */ int b;

    public t6q(ExoPlayer exoPlayer, wzc wzcVar, int i) {
        this.a = wzcVar;
        this.b = i;
    }

    @Override // defpackage.d80
    public final void n(c80 c80Var) {
        this.a.d.remove(Integer.valueOf(this.b));
    }
}
