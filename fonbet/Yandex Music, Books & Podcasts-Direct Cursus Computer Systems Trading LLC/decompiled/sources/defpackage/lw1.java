package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class lw1 implements f8l {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zt3 b;
    public final /* synthetic */ i8l c;

    public lw1(i8l i8lVar, zt3 zt3Var) {
        this.c = i8lVar;
        this.b = zt3Var;
    }

    @Override // defpackage.f8l
    public final void X(boolean z) {
        int i = this.a;
        i8l i8lVar = this.c;
        zt3 zt3Var = this.b;
        switch (i) {
            case 0:
                if (z && zt3Var.w()) {
                    r7o r7oVar = z7o.b;
                    zt3Var.resumeWith(Unit.a);
                    ((ExoPlayer) i8lVar).x0(this);
                    break;
                }
                break;
            default:
                if (z) {
                    i8lVar.x0(this);
                    if (zt3Var.w()) {
                        r7o r7oVar2 = z7o.b;
                        zt3Var.resumeWith(Unit.a);
                        break;
                    }
                }
                break;
        }
    }

    public lw1(zt3 zt3Var, ExoPlayer exoPlayer) {
        this.b = zt3Var;
        this.c = exoPlayer;
    }
}
