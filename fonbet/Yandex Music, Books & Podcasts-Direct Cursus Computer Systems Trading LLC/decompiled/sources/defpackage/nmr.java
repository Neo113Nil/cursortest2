package defpackage;

import android.view.TextureView;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.ui.SubtitleView;

/* loaded from: classes6.dex */
public final class nmr implements f8l, View.OnLayoutChangeListener, View.OnClickListener, lbl, bbl {
    public final ois a = new ois();
    public Object b;
    public final /* synthetic */ omr c;

    public nmr(omr omrVar) {
        this.c = omrVar;
    }

    @Override // defpackage.f8l
    public final void G(int i, boolean z) {
        nbl nblVar;
        omr omrVar = this.c;
        omrVar.h();
        if (omrVar.b() && omrVar.t && (nblVar = omrVar.j) != null) {
            nblVar.f();
        }
    }

    @Override // defpackage.f8l
    public final void M(e3t e3tVar) {
        omr omrVar = this.c;
        i8l i8lVar = omrVar.k;
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
        omrVar.j(false);
    }

    @Override // defpackage.lbl
    public final void d() {
        this.c.i();
    }

    @Override // defpackage.f8l
    public final void k(tcu tcuVar) {
        this.c.g();
    }

    @Override // defpackage.f8l
    public final void l(sv6 sv6Var) {
        SubtitleView subtitleView = this.c.g;
        if (subtitleView != null) {
            subtitleView.setCues(sv6Var.a);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        omr.a((TextureView) view);
    }

    @Override // defpackage.f8l
    public final void p(int i) {
        nbl nblVar;
        omr omrVar = this.c;
        if (omrVar.o && i == 3) {
            omrVar.m.removeCallbacksAndMessages(null);
            omrVar.f(false);
        }
        omrVar.h();
        AppCompatTextView appCompatTextView = omrVar.i;
        if (appCompatTextView != null) {
            i8l i8lVar = omrVar.k;
            if (i8lVar != null) {
                i8lVar.k();
            }
            appCompatTextView.setVisibility(8);
        }
        if (omrVar.b() && omrVar.t && (nblVar = omrVar.j) != null) {
            nblVar.f();
        }
    }

    @Override // defpackage.f8l
    public final void u(int i, g8l g8lVar, g8l g8lVar2) {
        nbl nblVar;
        omr omrVar = this.c;
        if (omrVar.b() && omrVar.t && (nblVar = omrVar.j) != null) {
            nblVar.f();
        }
    }

    @Override // defpackage.f8l
    public final void y() {
        this.c.e(false);
    }

    @Override // defpackage.bbl
    public final void c() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
