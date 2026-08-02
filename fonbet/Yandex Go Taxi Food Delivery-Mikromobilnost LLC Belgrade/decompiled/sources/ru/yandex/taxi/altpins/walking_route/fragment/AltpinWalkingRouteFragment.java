package ru.yandex.taxi.altpins.walking_route.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.c0g;
import defpackage.e02;
import defpackage.e0g;
import defpackage.f02;
import defpackage.g02;
import defpackage.g741;
import defpackage.gh00;
import defpackage.gph0;
import defpackage.gzx;
import defpackage.h02;
import defpackage.h741;
import defpackage.hxx;
import defpackage.i02;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.pep0;
import defpackage.po21;
import defpackage.qwc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u90;
import defpackage.w1j;
import defpackage.wt00;
import defpackage.y1j;
import defpackage.yvf0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzf;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.order.e;
import ru.yandex.taxi.altpins.walking_route.map.a;
import ru.yandex.taxi.altpins.walking_route.modal.WalkingRouteModalView;
import ru.yandex.taxi.fragment.MapFragment;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00025+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0005R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/yandex/taxi/altpins/walking_route/fragment/AltpinWalkingRouteFragment;", "Lru/yandex/taxi/fragment/MapFragment;", "", "Le0g;", "<init>", "()V", "Lzy11;", "onModalLayoutChanged", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lyvf0;", "Ly1j;", "modalViewRouterProvider", "Lyvf0;", "getModalViewRouterProvider", "()Lyvf0;", "setModalViewRouterProvider", "(Lyvf0;)V", "Loep0;", "screenStackNavigator", "Loep0;", "getScreenStackNavigator", "()Loep0;", "setScreenStackNavigator", "(Loep0;)V", "Lru/yandex/taxi/altpins/walking_route/map/a;", "mapObjectHolder", "Lru/yandex/taxi/altpins/walking_route/map/a;", "getMapObjectHolder", "()Lru/yandex/taxi/altpins/walking_route/map/a;", "setMapObjectHolder", "(Lru/yandex/taxi/altpins/walking_route/map/a;)V", "Lh02;", "modalViewRouter", "Lh02;", "Lh741;", ClidProvider.STATE, "Lh741;", "Landroid/view/View$OnLayoutChangeListener;", "modalLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Companion", "g02", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AltpinWalkingRouteFragment extends MapFragment<Object, e0g> {
    public static final g02 Companion = new g02();
    public a mapObjectHolder;
    private final View.OnLayoutChangeListener modalLayoutChangeListener = new u90(5, this);
    private h02 modalViewRouter;
    public yvf0 modalViewRouterProvider;
    public oep0 screenStackNavigator;
    private h741 state;

    /* JADX INFO: Access modifiers changed from: private */
    public final void onModalLayoutChanged() {
        WalkingRouteModalView walkingRouteModalView = (WalkingRouteModalView) modalViewCoordinator().i(WalkingRouteModalView.class);
        int contentHeight = walkingRouteModalView != null ? walkingRouteModalView.getContentHeight() : 0;
        a mapObjectHolder = getMapObjectHolder();
        avj0 avj0Var = (avj0) mapObjectHolder.g;
        int u = tje.u(56, avj0Var.a);
        int u2 = tje.u(16, avj0Var.a);
        mapObjectHolder.e.Lc(mapObjectHolder, new Rect(u, u2, u, contentHeight + u2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$1$0(AltpinWalkingRouteFragment altpinWalkingRouteFragment) {
        if (altpinWalkingRouteFragment.callback == 0) {
            return zy11.a;
        }
        ny61.u();
        return null;
    }

    public final a getMapObjectHolder() {
        a aVar = this.mapObjectHolder;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final yvf0 getModalViewRouterProvider() {
        yvf0 yvf0Var = this.modalViewRouterProvider;
        if (yvf0Var != null) {
            return yvf0Var;
        }
        return null;
    }

    public final oep0 getScreenStackNavigator() {
        oep0 oep0Var = this.screenStackNavigator;
        if (oep0Var != null) {
            return oep0Var;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        e0g injector = injector();
        zzf zzfVar = injector.b;
        this.receiverProvider = zzfVar.Yp;
        this.modalViewRouterProvider = injector.p;
        c0g c0gVar = injector.c;
        this.screenStackNavigator = (oep0) c0gVar.T.get();
        this.mapObjectHolder = new a(injector.c(), (p2y0) zzfVar.J2.get(), new e((tt2) zzfVar.n.get(), injector.b(), (e02) c0gVar.sm.get()), new wt00((ah00) c0gVar.Vb.get()), (a3v) c0gVar.Wb.get(), (ah00) c0gVar.Vb.get(), (zuj0) zzfVar.W.get(), (po21) zzfVar.Y1.get(), (gzx) c0gVar.ne.get(), (qwc) zzfVar.mm.get());
        return inflater.inflate(gph0.walking_route_fragment, container, false);
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        a mapObjectHolder = getMapObjectHolder();
        ((gh00) mapObjectHolder.f).u(mapObjectHolder.n);
        mapObjectHolder.e.a0(mapObjectHolder);
        mapObjectHolder.k.b();
        mapObjectHolder.i.detach();
        mapObjectHolder.a.d();
        h02 h02Var = this.modalViewRouter;
        if (h02Var != null) {
            h02Var.i();
        }
        this.modalViewRouter = null;
        super.onDestroyView();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        g741 g741Var;
        String str;
        super.onViewCreated(view, savedInstanceState);
        getMenuButtonCoordinator().setVisibility(8);
        h741 h741Var = this.state;
        if (h741Var != null && (str = h741Var.a) != null) {
            getMapObjectHolder().a(str);
        }
        h741 h741Var2 = this.state;
        if (h741Var2 == null || (g741Var = h741Var2.b) == null) {
            return;
        }
        String str2 = h741Var2.a;
        if (str2 == null) {
            str2 = "";
        }
        w1j w1jVar = new w1j(str2, g741Var, this.modalLayoutChangeListener, new i02(getMapObjectHolder()));
        h02 h02Var = new h02((y1j) getModalViewRouterProvider().get(), new f02(0, this));
        this.modalViewRouter = h02Var;
        ((pep0) getScreenStackNavigator()).f(h02Var, w1jVar, hxx.a);
    }

    public final void setMapObjectHolder(a aVar) {
        this.mapObjectHolder = aVar;
    }

    public final void setModalViewRouterProvider(yvf0 yvf0Var) {
        this.modalViewRouterProvider = yvf0Var;
    }

    public final void setScreenStackNavigator(oep0 oep0Var) {
        this.screenStackNavigator = oep0Var;
    }
}
