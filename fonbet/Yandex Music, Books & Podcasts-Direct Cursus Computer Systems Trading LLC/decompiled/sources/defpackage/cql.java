package defpackage;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;

/* loaded from: classes.dex */
public final class cql implements f8l, View.OnClickListener, lbl, bbl {
    public final ois a = new ois();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public cql(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // defpackage.f8l
    public final void G(int i, boolean z) {
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        playerView.k();
        if (!playerView.d() || !playerView.D) {
            playerView.e(false);
            return;
        }
        nbl nblVar = playerView.l;
        if (nblVar != null) {
            nblVar.f();
        }
    }

    @Override // defpackage.f8l
    public final void M(e3t e3tVar) {
        PlayerView playerView = this.c;
        i8l i8lVar = playerView.s;
        i8lVar.getClass();
        sis V = i8lVar.V0(17) ? i8lVar.V() : sis.a;
        if (V.p()) {
            this.b = null;
        } else {
            boolean V0 = i8lVar.V0(30);
            ois oisVar = this.a;
            if (!V0 || i8lVar.O().a.isEmpty()) {
                Object obj = this.b;
                if (obj != null) {
                    int b = V.b(obj);
                    if (b != -1) {
                        if (i8lVar.v0() == V.f(b, oisVar, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = V.f(i8lVar.k0(), oisVar, true).b;
            }
        }
        playerView.n(false);
    }

    @Override // defpackage.bbl
    public final void c() {
        int i = PlayerView.G;
    }

    @Override // defpackage.lbl
    public final void d() {
        int i = PlayerView.G;
        this.c.l();
    }

    @Override // defpackage.f8l
    public final void j(int i, int i2) {
        PlayerView playerView = this.c;
        View view = playerView.d;
        if (dvt.a == 34 && (view instanceof SurfaceView) && playerView.F) {
            fql fqlVar = playerView.f;
            fqlVar.getClass();
            playerView.o.post(new cy1(27, fqlVar, (SurfaceView) view, new dyg(19, playerView)));
        }
    }

    @Override // defpackage.f8l
    public final void k(tcu tcuVar) {
        PlayerView playerView;
        i8l i8lVar;
        if (tcuVar.equals(tcu.d) || (i8lVar = (playerView = this.c).s) == null || i8lVar.c() == 1) {
            return;
        }
        playerView.j();
    }

    @Override // defpackage.f8l
    public final void l(sv6 sv6Var) {
        SubtitleView subtitleView = this.c.i;
        if (subtitleView != null) {
            subtitleView.setCues(sv6Var.a);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.G;
        this.c.i();
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        playerView.k();
        playerView.m();
        if (!playerView.d() || !playerView.D) {
            playerView.e(false);
            return;
        }
        nbl nblVar = playerView.l;
        if (nblVar != null) {
            nblVar.f();
        }
    }

    @Override // defpackage.f8l
    public final void u(int i, g8l g8lVar, g8l g8lVar2) {
        nbl nblVar;
        int i2 = PlayerView.G;
        PlayerView playerView = this.c;
        if (playerView.d() && playerView.D && (nblVar = playerView.l) != null) {
            nblVar.f();
        }
    }

    @Override // defpackage.f8l
    public final void y() {
        PlayerView playerView = this.c;
        View view = playerView.c;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.b()) {
                playerView.c();
                return;
            }
            ImageView imageView = playerView.g;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }
}
