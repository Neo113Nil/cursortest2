package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class szq implements f8l {
    public final /* synthetic */ int a;
    public final /* synthetic */ xqn b;
    public final /* synthetic */ mm6 c;
    public final /* synthetic */ ExoPlayer d;
    public final /* synthetic */ bqi e;
    public final /* synthetic */ bqi f;
    public final /* synthetic */ zwf g;

    public /* synthetic */ szq(xqn xqnVar, mm6 mm6Var, ExoPlayer exoPlayer, zwf zwfVar, bqi bqiVar, bqi bqiVar2, int i) {
        this.a = i;
        this.b = xqnVar;
        this.c = mm6Var;
        this.d = exoPlayer;
        this.g = zwfVar;
        this.e = bqiVar;
        this.f = bqiVar2;
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        switch (this.a) {
            case 0:
                xqn xqnVar = this.b;
                if (!z || xqnVar.a != null) {
                    r2f r2fVar = (r2f) xqnVar.a;
                    if (r2fVar != null) {
                        r2fVar.g(null);
                        break;
                    }
                } else {
                    rar y = x97.y(this.c, null, null, new lco(this.d, (vzq) this.g, this.e, this.f, (Continuation) null, 13), 3);
                    y.R(new i50(this.e, this.f, this.d, this, 21));
                    xqnVar.a = y;
                    break;
                }
                break;
            default:
                xqn xqnVar2 = this.b;
                if (!z || xqnVar2.a != null) {
                    r2f r2fVar2 = (r2f) xqnVar2.a;
                    if (r2fVar2 != null) {
                        r2fVar2.g(null);
                        break;
                    }
                } else {
                    rar y2 = x97.y(this.c, null, null, new lco(this.d, (xzq) this.g, this.e, this.f, (Continuation) null, 14), 3);
                    y2.R(new i50(this.e, this.f, this.d, this, 22));
                    xqnVar2.a = y2;
                    break;
                }
                break;
        }
    }
}
