package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.search.ui.overlay.proxy.c;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.yandex.go.taxi.order.search.ui.search_views.d;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes14.dex */
public final class vxf0 extends r8 implements svp0, wxf0 {
    public final ut A;
    public final ii9 B;
    public final ht0 C;
    public final q150 D;
    public final fy30 E;
    public final a3y0 F;
    public svp0 G;
    public SearchOverlayType H;
    public ScreenRect I;
    public final l390 c;
    public final d w;
    public final ndl0 x;
    public final c y;
    public final cys0 z;

    public vxf0(ah00 ah00Var, l390 l390Var, d dVar, ndl0 ndl0Var, c cVar, cys0 cys0Var, ut utVar, ii9 ii9Var, ht0 ht0Var, q150 q150Var, fy30 fy30Var) {
        super(5, ah00Var);
        this.c = l390Var;
        this.w = dVar;
        this.x = ndl0Var;
        this.y = cVar;
        this.z = cys0Var;
        this.A = utVar;
        this.B = ii9Var;
        this.C = ht0Var;
        this.D = q150Var;
        this.E = fy30Var;
        this.F = new a3y0(TaxiOrderLogGroup.MAP.getTag(), "ProxySearchOverlay");
        this.G = (svp0) cys0Var.get();
        this.H = SearchOverlayType.NONE;
    }

    @Override // defpackage.wxf0
    public final void P5(SearchOverlayType searchOverlayType) {
        SearchOverlayType searchOverlayType2 = SearchOverlayType.ORDINARY;
        a3y0 a3y0Var = this.F;
        if ((searchOverlayType == searchOverlayType2 && this.H == SearchOverlayType.DISPLAY_BANNERS) || (searchOverlayType == SearchOverlayType.DISPLAY_BANNERS && this.H == searchOverlayType2)) {
            this.H = searchOverlayType;
        } else if (this.H != searchOverlayType) {
            a3y0Var.getClass();
            a3y0.h(new String[]{"showCoverSearchType"});
            hst hstVar = jst.e;
            yvf0 yvf0Var = null;
            switch (uxf0.a[searchOverlayType.ordinal()]) {
                case 1:
                    yvf0Var = this.z;
                    break;
                case 2:
                    yvf0Var = this.B;
                    break;
                case 3:
                    yvf0Var = this.D;
                    break;
                case 4:
                case 7:
                    break;
                case 5:
                case 6:
                    yvf0Var = this.A;
                    break;
                case 8:
                    yvf0Var = this.C;
                    break;
                case 9:
                    yvf0Var = this.E;
                    break;
                default:
                    w511.b();
                    return;
            }
            if (yvf0Var != null) {
                svp0 svp0Var = (svp0) yvf0Var.get();
                svp0 svp0Var2 = this.G;
                if (svp0Var2 != null && this.H != searchOverlayType) {
                    a3y0.h(new String[]{"handleExitTransition"});
                    svp0Var2.p6().a().start();
                }
                yx01 s5 = svp0Var.s5();
                if (this.H != searchOverlayType) {
                    a3y0.h(new String[]{"handleEnterTransition"});
                    s5.c.add(new xmf0(1, svp0Var, this));
                    s5.a().start();
                }
                this.G = svp0Var;
                this.H = searchOverlayType;
                return;
            }
            return;
        }
        a3y0Var.getClass();
        a3y0.h(new String[]{"showCoverSearchType"});
        hst hstVar2 = jst.e;
    }

    @Override // defpackage.svp0
    public final void attach() {
        this.w.h();
        this.y.Bg(this);
        ((gh00) ((ah00) this.b)).p(this.c);
        svp0 svp0Var = this.G;
        if (svp0Var != null) {
            svp0Var.attach();
        }
    }

    @Override // defpackage.svp0
    public final void b9(ScreenRect screenRect) {
        this.I = screenRect;
        svp0 svp0Var = this.G;
        if (svp0Var != null) {
            svp0Var.b9(screenRect);
        }
    }

    @Override // defpackage.svp0
    public final void detach() {
        ah00 ah00Var = (ah00) this.b;
        d dVar = this.w;
        dVar.a.Cg();
        SearchViews I = dVar.I();
        if (I != null) {
            I.setOnMyLocationClickListener(new d82(1));
        }
        this.y.Cg();
        svp0 svp0Var = this.G;
        if (svp0Var != null) {
            svp0Var.detach();
        }
        this.H = null;
        this.G = null;
        dVar.B0(0.0f);
        dVar.M1(false);
        ndl0 ndl0Var = this.x;
        ((i2f) ndl0Var.b).Hg(0.0f);
        ((i2f) ndl0Var.b).setVisible(false);
        gh00 gh00Var = (gh00) ah00Var;
        rq7 rq7Var = gh00Var.a;
        l390 l390Var = this.c;
        if (rq7Var.e(l390Var)) {
            gh00Var.r(l390Var);
        }
    }

    @Override // defpackage.svp0
    public final yx01 p6() {
        yx01 rvp0Var;
        svp0 svp0Var = this.G;
        if (svp0Var == null || (rvp0Var = svp0Var.p6()) == null) {
            rvp0Var = new rvp0(this, 1);
        }
        rvp0Var.d.add(new txf0(this, 1));
        return rvp0Var;
    }

    @Override // defpackage.svp0
    public final void pause() {
        this.y.pause();
        svp0 svp0Var = this.G;
        if (svp0Var != null) {
            svp0Var.pause();
        }
    }

    @Override // defpackage.svp0
    public final void resume() {
        this.y.resume();
        svp0 svp0Var = this.G;
        if (svp0Var != null) {
            svp0Var.resume();
        }
    }

    @Override // defpackage.svp0
    public final yx01 s5() {
        yx01 rvp0Var;
        svp0 svp0Var = this.G;
        if (svp0Var == null || (rvp0Var = svp0Var.s5()) == null) {
            rvp0Var = new rvp0(this, 0);
        }
        rvp0Var.c.add(new txf0(this, 0));
        return rvp0Var;
    }

    @Override // defpackage.svp0
    public final void setVisible(boolean z) {
        svp0 svp0Var = this.G;
        if (svp0Var != null) {
            svp0Var.setVisible(z);
        }
    }
}
