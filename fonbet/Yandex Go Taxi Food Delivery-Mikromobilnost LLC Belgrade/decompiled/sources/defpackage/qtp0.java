package defpackage;

import android.graphics.PointF;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.mapkit.ScreenRect;
import ru.yandex.taxi.search.overlay.legacy.animations.a;

/* loaded from: classes6.dex */
public final class qtp0 implements svp0 {
    public boolean A;
    public final ptp0 B = new ptp0(this, 0);
    public final ptp0 C = new ptp0(this, 1);
    public final o2y0 a;
    public final ndl0 b;
    public final jzf0 c;
    public final d w;
    public final a x;
    public final ah00 y;
    public final l390 z;

    public qtp0(o2y0 o2y0Var, ndl0 ndl0Var, jzf0 jzf0Var, d dVar, a aVar, ah00 ah00Var, l390 l390Var) {
        this.a = o2y0Var;
        this.b = ndl0Var;
        this.c = jzf0Var;
        this.w = dVar;
        this.x = aVar;
        this.y = ah00Var;
        this.z = l390Var;
    }

    @Override // defpackage.svp0
    public final void attach() {
        if (this.A) {
            return;
        }
        this.A = true;
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        if (!this.A || screenRect == null) {
            return;
        }
        this.c.getClass();
        PointF a = jzf0.a(screenRect);
        SearchViews I = this.w.I();
        if (I != null) {
            I.setPulsingCirclesViewAnchor(a);
        }
        ((gh00) this.y).y(this.z, screenRect);
    }

    @Override // defpackage.svp0
    public final void detach() {
        this.A = false;
        d dVar = this.w;
        dVar.B0(0.0f);
        ndl0 ndl0Var = this.b;
        ((i2f) ndl0Var.b).Hg(0.0f);
        dVar.M1(false);
        ((i2f) ndl0Var.b).setVisible(false);
        SearchViews I = dVar.I();
        if (I != null) {
            I.hidePollingBubblesView();
        }
        this.x.b(true);
    }

    @Override // defpackage.svp0
    public final yx01 p6() {
        return this.C;
    }

    @Override // defpackage.svp0
    public final void pause() {
    }

    @Override // defpackage.svp0
    public final void resume() {
    }

    @Override // defpackage.svp0
    public final yx01 s5() {
        return this.B;
    }

    @Override // defpackage.svp0
    public final void setVisible(boolean z) {
        ((i2f) this.b.b).setVisible(z);
    }
}
