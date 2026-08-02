package defpackage;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.parks.nearest.presentation.ui.NearestZoneErrorModalView;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.transition.a;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;
import ru.yandex.taxi.search.address.view.NoInternetConnectionModalView;
import ru.yandex.taxi.statebar.data.LocationErrorReason;
import ru.yandex.taxi.widget.address.b;
import ru.yandex.taxi.widget.modalview.ModalViewProcessing$ProcessingState;

/* loaded from: classes14.dex */
public final class v3s0 extends a {
    public final Context R;
    public final h3y S;
    public final x8z T;
    public final aju U;
    public final zwx0 V;
    public ModalViewProcessing$ProcessingState W;

    public v3s0(wj10 wj10Var, bk4 bk4Var, i130 i130Var, yit0 yit0Var, biv0 biv0Var, a3v a3vVar, tit0 tit0Var, c9l0 c9l0Var, hp0 hp0Var, qy41 qy41Var, nqz0 nqz0Var, Context context, h3y h3yVar, x8z x8zVar, aju ajuVar, zwx0 zwx0Var) {
        super(a3vVar, i130Var, yit0Var, biv0Var, bk4Var, wj10Var, tit0Var, c9l0Var, hp0Var, qy41Var, nqz0Var);
        this.R = context;
        this.S = h3yVar;
        this.T = x8zVar;
        this.U = ajuVar;
        this.V = zwx0Var;
        this.W = ModalViewProcessing$ProcessingState.DONE;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void M0() {
        if (M1()) {
            return;
        }
        if (B0()) {
            h();
            return;
        }
        this.F = false;
        this.G = false;
        I();
    }

    public final void N3(boolean z) {
        this.F = false;
        this.G = true;
        I();
        if (z) {
            this.c.a(MapPositionAction.DEFAULT);
        }
        this.b.a().c(NearestZoneErrorModalView.class, true, null);
        if (this.W == ModalViewProcessing$ProcessingState.LOADING) {
            return;
        }
        ((ShortcutsMainScreen) this.S.get()).minimizeMainModalView$impl();
    }

    public final b Q2() {
        return ((ShortcutsMainScreen) this.S.get()).getAddressOnMapController();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void Rf() {
        this.T.a(LocationErrorReason.LOCATION_RESOLVING_ERROR_REASON);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void T6() {
        ((ShortcutsMainScreen) this.S.get()).ensureMainModalView$impl(new qa0(29, this));
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void c3(boolean z) {
        p6(false, !z);
        if (z) {
            return;
        }
        s5();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final zwx0 cc() {
        return this.V;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void d2(String str) {
        if (B0()) {
            h();
        } else {
            this.F = false;
            this.G = false;
            I();
        }
        this.T.c(str, this.R.getString(kyh0.state_bar_location_permission_on_subtitle), LocationErrorReason.LOCATION_RESOLVING_ERROR_REASON, null);
        s5();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void f4() {
        ((ShortcutsMainScreen) this.S.get()).dismiss();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void fb() {
        ITransitionCoordinator.VisibilityChangeReason visibilityChangeReason = ITransitionCoordinator.VisibilityChangeReason.MODAL_VIEW;
        N3(true);
        p6(true, false);
        h();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void k3(boolean z, ITransitionCoordinator.VisibilityChangeReason visibilityChangeReason) {
        ((ru.yandex.taxi.badge.b) this.x).a(a.N);
        N3(z);
        if (this.W == ModalViewProcessing$ProcessingState.LOADING) {
            h();
        } else if (q4()) {
            Q2().c(true);
            Q2().d(false);
        }
    }

    public final void p6(boolean z, boolean z2) {
        String subtitleText;
        if (!z2 || !q4() || (subtitleText = Q2().a.getSubtitleText()) == null || subtitleText.length() == 0) {
            Q2().a(z);
        } else {
            Q2().c(z);
        }
    }

    public final boolean q4() {
        if (this.A.b() || F4() || ((ShortcutsMainScreen) this.S.get()).isExpanded() || !B0() || this.K || !this.E) {
            return false;
        }
        i130 i130Var = this.b;
        u45 e = i130Var.a().e();
        return ((e instanceof NoInternetConnectionModalView) || (e instanceof NearestZoneErrorModalView) || this.L != MainScreen.MainScreenMode.DEFAULT || ((ry41) this.C).f() || ((Boolean) this.U.a.c()).booleanValue() || i130Var.a().j() != null) ? false : true;
    }

    public final void s5() {
        ShortcutsMainScreen shortcutsMainScreen = (ShortcutsMainScreen) this.S.get();
        if (shortcutsMainScreen.modalViewShown()) {
            shortcutsMainScreen.ensureAutolocateButton$impl();
        }
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void setSourceAddress(Address address) {
        String F = address != null ? q5z.F(address) : null;
        if (F == null) {
            F = "";
        }
        Q2().a.setSubtitle(F);
        b Q2 = Q2();
        boolean B0 = B0();
        h3y h3yVar = this.S;
        Q2.a.setVisibility((B0 && ((ShortcutsMainScreen) h3yVar.get()).getIsAddressViewVisible()) ? 0 : 8);
        p6(true, true);
        ((ShortcutsMainScreen) h3yVar.get()).onSourceAddressSet$impl();
        if (!M1() && address != null) {
            this.W = ModalViewProcessing$ProcessingState.DONE;
        }
        s5();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void showControlElements(boolean z) {
        if (((ShortcutsMainScreen) this.S.get()).isProcessing()) {
            return;
        }
        h();
        if (B0() && this.b.a().isEmpty()) {
            if (B0()) {
                h();
            } else {
                this.F = false;
                this.G = false;
                I();
            }
        }
        p6(z, true);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void ta(boolean z) {
        p6(false, false);
        Q2().a.setVisibility(8);
        p6(z, false);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void v7() {
        this.K = true;
        ((ru.yandex.taxi.badge.b) this.x).a(a.O);
        ((ShortcutsMainScreen) this.S.get()).removeAutolocateButton$impl();
        p6(false, false);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void wa() {
        s5();
    }
}
