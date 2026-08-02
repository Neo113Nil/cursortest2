package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a0r implements f8l {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ ExoPlayer d;
    public final /* synthetic */ bqi e;
    public final /* synthetic */ zwf f;

    public /* synthetic */ a0r(xqn xqnVar, mm6 mm6Var, ExoPlayer exoPlayer, zwf zwfVar, bqi bqiVar, int i) {
        this.a = i;
        this.b = xqnVar;
        this.c = mm6Var;
        this.d = exoPlayer;
        this.f = zwfVar;
        this.e = bqiVar;
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        switch (this.a) {
            case 0:
                xqn xqnVar = this.b;
                Continuation continuation = null;
                if (!z || xqnVar.a != null) {
                    r2f r2fVar = (r2f) xqnVar.a;
                    if (r2fVar != null) {
                        r2fVar.g(null);
                        break;
                    }
                } else {
                    ExoPlayer exoPlayer = this.d;
                    bqi bqiVar = this.e;
                    rar y = x97.y(this.c, null, null, new fpq(exoPlayer, (e0r) this.f, bqiVar, continuation, 5), 3);
                    y.R(new zzq(0, bqiVar, exoPlayer, this));
                    xqnVar.a = y;
                    break;
                }
                break;
            default:
                xqn xqnVar2 = this.b;
                Continuation continuation2 = null;
                if (!z || xqnVar2.a != null) {
                    r2f r2fVar2 = (r2f) xqnVar2.a;
                    if (r2fVar2 != null) {
                        r2fVar2.g(null);
                        break;
                    }
                } else {
                    ExoPlayer exoPlayer2 = this.d;
                    bqi bqiVar2 = this.e;
                    rar y2 = x97.y(this.c, null, null, new fpq(exoPlayer2, (e0r) this.f, bqiVar2, continuation2, 6), 3);
                    y2.R(new zzq(1, bqiVar2, exoPlayer2, this));
                    xqnVar2.a = y2;
                    break;
                }
                break;
        }
    }
}
