package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class rzs implements f8l {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ zt3 b;

    public rzs(zt3 zt3Var, ExoPlayer exoPlayer) {
        this.a = exoPlayer;
        this.b = zt3Var;
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        if (i == 3) {
            this.a.x0(this);
            r7o r7oVar = z7o.b;
            this.b.resumeWith(Unit.a);
        }
    }
}
