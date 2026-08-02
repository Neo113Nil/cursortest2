package ru.yandex.taxi.altpins.confirmation_screen.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.b2l0;
import defpackage.bdh0;
import defpackage.bf60;
import defpackage.bt00;
import defpackage.c0g;
import defpackage.cwa1;
import defpackage.cx1;
import defpackage.doy;
import defpackage.e0g;
import defpackage.e100;
import defpackage.f4c0;
import defpackage.f4e;
import defpackage.g4e;
import defpackage.gph0;
import defpackage.hz1;
import defpackage.i3y;
import defpackage.io9;
import defpackage.j01;
import defpackage.jrg0;
import defpackage.leh;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.o2e;
import defpackage.p2e;
import defpackage.pho;
import defpackage.pwy0;
import defpackage.q2e;
import defpackage.qy1;
import defpackage.r2e;
import defpackage.ry1;
import defpackage.s2e;
import defpackage.scc;
import defpackage.sls;
import defpackage.t1w;
import defpackage.t61;
import defpackage.tje;
import defpackage.u90;
import defpackage.v2e;
import defpackage.vy1;
import defpackage.w2e;
import defpackage.w4e0;
import defpackage.w511;
import defpackage.wt00;
import defpackage.xm00;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zw1;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.confirmation_screen.a;
import ru.yandex.taxi.altpins.confirmation_screen.modal.AlternativeDestinationModalView;
import ru.yandex.taxi.altpins.models.OptionType;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.map_common.style.source.e;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 N2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003@\u0002OB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J-\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010\u0005R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u00060@R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lru/yandex/taxi/altpins/confirmation_screen/fragment/ConfirmAlternativeDestinationFragment;", "Lru/yandex/taxi/fragment/MapFragment;", "Lhz1;", "Le0g;", "<init>", "()V", "Lzy11;", "applyTopFade", "Landroid/graphics/drawable/GradientDrawable;", "createTopGradientDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "updateFocusRect", "Ls2e;", ClidProvider.STATE, "renderViewModel", "(Ls2e;)V", "Lru/yandex/taxi/altpins/models/b$a;", "modal", "showModal", "(Lru/yandex/taxi/altpins/models/b$a;)V", "onCancel", "Lru/yandex/taxi/altpins/models/OptionType;", "optionType", "onConfirm", "(Lru/yandex/taxi/altpins/models/OptionType;)V", "type", "onChangeOptionType", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lzw1;", "modalViewFactory", "Lzw1;", "getModalViewFactory", "()Lzw1;", "setModalViewFactory", "(Lzw1;)V", "Lru/yandex/taxi/altpins/confirmation_screen/a;", "mapObjectHolder", "Lru/yandex/taxi/altpins/confirmation_screen/a;", "getMapObjectHolder", "()Lru/yandex/taxi/altpins/confirmation_screen/a;", "setMapObjectHolder", "(Lru/yandex/taxi/altpins/confirmation_screen/a;)V", "Lw2e;", "presenterFactory", "Lw2e;", "getPresenterFactory", "()Lw2e;", "setPresenterFactory", "(Lw2e;)V", "Lv2e;", "presenter", "Lv2e;", "Lq2e;", "innerView", "Lq2e;", "Lf4e;", "screenModel", "Lf4e;", "topMapFade", "Landroid/view/View;", "Lru/yandex/taxi/widget/RobotoTextView;", "titleView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/altpins/confirmation_screen/modal/AlternativeDestinationModalView;", "modalView", "Lru/yandex/taxi/altpins/confirmation_screen/modal/AlternativeDestinationModalView;", "Companion", "p2e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmAlternativeDestinationFragment extends MapFragment<hz1, e0g> {
    public static final p2e Companion = new p2e();
    private final q2e innerView = new q2e(this);
    public a mapObjectHolder;
    private AlternativeDestinationModalView modalView;
    public zw1 modalViewFactory;
    private v2e presenter;
    public w2e presenterFactory;
    private f4e screenModel;
    private RobotoTextView titleView;
    private View topMapFade;

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTopFade() {
        View nonNullViewById = nonNullViewById(bdh0.map_top_fade);
        nonNullViewById.setBackground(createTopGradientDrawable());
        nonNullViewById.setVisibility(0);
    }

    private final GradientDrawable createTopGradientDrawable() {
        int c = c.c(xng0.bgMain, asView());
        return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb((int) (Color.alpha(c) * 0.0f), Color.red(c), Color.green(c), Color.blue(c)), Color.argb((int) (Color.alpha(c) * 1.0f), Color.red(c), Color.green(c), Color.blue(c))});
    }

    public static final ConfirmAlternativeDestinationFragment newInstance(f4e f4eVar) {
        Companion.getClass();
        ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment = new ConfirmAlternativeDestinationFragment();
        confirmAlternativeDestinationFragment.screenModel = f4eVar;
        return confirmAlternativeDestinationFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancel() {
        getMapObjectHolder().b();
        requireCallback().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChangeOptionType(OptionType type) {
        v2e v2eVar = this.presenter;
        if (v2eVar != null) {
            v2eVar.D.l(type);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfirm(OptionType optionType) {
        int i = r2e.a[optionType.ordinal()];
        if (i == 1) {
            requireCallback().a.r(new j01(24));
        } else if (i == 2) {
            requireCallback().a();
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment, OptionType optionType) {
        v2e v2eVar = confirmAlternativeDestinationFragment.presenter;
        if (v2eVar != null) {
            v2eVar.D.l(optionType);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$1(ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment, t1w t1wVar) {
        View view = confirmAlternativeDestinationFragment.topMapFade;
        if (view != null) {
            c.D(view.getLayoutParams().width, c.d(jrg0.map_top_fade_height, confirmAlternativeDestinationFragment.asView()) + t1wVar.b, view);
        }
        RobotoTextView robotoTextView = confirmAlternativeDestinationFragment.titleView;
        if (robotoTextView == null) {
            return false;
        }
        xw31.E(robotoTextView, null, Integer.valueOf(c.h(32, confirmAlternativeDestinationFragment.asView()) + t1wVar.b), null, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderViewModel(s2e state) {
        ry1 ry1Var;
        updateFocusRect();
        showModal(state.a.e);
        a mapObjectHolder = getMapObjectHolder();
        mapObjectHolder.getClass();
        i3y i3yVar = mapObjectHolder.C;
        b bVar = state.a;
        DrivingRoute drivingRoute = state.b;
        qy1 qy1Var = bVar.b;
        WalkingRouteUiState walkingRouteUiState = bVar.f;
        vy1 vy1Var = bVar.d;
        qy1 qy1Var2 = bVar.b;
        OptionType optionType = bVar.g;
        qy1 qy1Var3 = bVar.c;
        qy1 qy1Var4 = qy1.f;
        boolean z = qy1Var.equals(qy1Var4) || qy1Var3.equals(qy1Var4);
        ru.yandex.taxi.altpins.map.a aVar = mapObjectHolder.y;
        if (drivingRoute == null) {
            ry1Var = new ry1(qy1Var2, qy1Var3, vy1Var, walkingRouteUiState);
        } else {
            Point point = (Point) kotlin.collections.a.b0(drivingRoute.getGeometry().getPoints());
            OptionType optionType2 = OptionType.ALTPIN;
            List g = point != null ? scc.g(point, cwa1.d((optionType == optionType2 ? qy1Var2 : qy1Var3).a)) : EmptyList.a;
            int i = g4e.a[optionType.ordinal()];
            if (i == 1) {
                g = kotlin.collections.a.m0(walkingRouteUiState.a, g);
            } else if (i != 2) {
                w511.b();
                return;
            }
            ry1Var = new ry1(qy1Var2, qy1Var3, vy1Var, new WalkingRouteUiState(g, optionType == optionType2 ? walkingRouteUiState.b : "", 0.0f, null, null, null, null, HProv.PP_SAME_MEDIA));
        }
        aVar.e(ry1Var);
        mapObjectHolder.I = bVar;
        if (z) {
            mapObjectHolder.F = null;
            ((xm00) i3yVar.getValue()).m();
        } else {
            mapObjectHolder.c();
            if (drivingRoute != null) {
                if (mapObjectHolder.F == null) {
                    mapObjectHolder.F = ((xm00) i3yVar.getValue()).s(drivingRoute.getGeometry());
                }
                w4e0 w4e0Var = mapObjectHolder.F;
                if (w4e0Var != null) {
                    w4e0Var.o(drivingRoute.getGeometry());
                }
                w4e0 w4e0Var2 = mapObjectHolder.F;
                if (w4e0Var2 != null) {
                    leh lehVar = mapObjectHolder.A;
                    o oVar = mapObjectHolder.x;
                    lehVar.getClass();
                    boolean a = leh.a(oVar);
                    b2l0 b2l0Var = mapObjectHolder.w;
                    if (a) {
                        b2l0Var.a(w4e0Var2);
                        w4e0Var2.x(drivingRoute);
                    } else {
                        ((bf60) b2l0Var.a.getValue()).a(w4e0Var2);
                    }
                }
            }
        }
        RobotoTextView robotoTextView = this.titleView;
        if (robotoTextView != null) {
            robotoTextView.setText(bVar.a);
        }
    }

    private final void showModal(b.a modal) {
        AlternativeDestinationModalView alternativeDestinationModalView = this.modalView;
        if (alternativeDestinationModalView != null) {
            alternativeDestinationModalView.updateModel(modal);
            return;
        }
        zw1 modalViewFactory = getModalViewFactory();
        ConfirmAlternativeDestinationFragment$showModal$1 confirmAlternativeDestinationFragment$showModal$1 = new ConfirmAlternativeDestinationFragment$showModal$1(0, this, ConfirmAlternativeDestinationFragment.class, "updateFocusRect", "updateFocusRect()V", 0);
        ConfirmAlternativeDestinationFragment$showModal$2 confirmAlternativeDestinationFragment$showModal$2 = new ConfirmAlternativeDestinationFragment$showModal$2(0, this, ConfirmAlternativeDestinationFragment.class, "onCancel", "onCancel()V", 0);
        ConfirmAlternativeDestinationFragment$showModal$3 confirmAlternativeDestinationFragment$showModal$3 = new ConfirmAlternativeDestinationFragment$showModal$3(1, this, ConfirmAlternativeDestinationFragment.class, "onConfirm", "onConfirm(Lru/yandex/taxi/altpins/models/OptionType;)V", 0);
        ConfirmAlternativeDestinationFragment$showModal$4 confirmAlternativeDestinationFragment$showModal$4 = new ConfirmAlternativeDestinationFragment$showModal$4(1, this, ConfirmAlternativeDestinationFragment.class, "onChangeOptionType", "onChangeOptionType(Lru/yandex/taxi/altpins/models/OptionType;)V", 0);
        AlternativeDestinationModalView alternativeDestinationModalView2 = new AlternativeDestinationModalView(modalViewFactory.a, new cx1(modal, modalViewFactory.b), confirmAlternativeDestinationFragment$showModal$3, confirmAlternativeDestinationFragment$showModal$2, confirmAlternativeDestinationFragment$showModal$4);
        alternativeDestinationModalView2.addOnLayoutChangeListener(new u90(3, confirmAlternativeDestinationFragment$showModal$1));
        modalViewCoordinator().s(alternativeDestinationModalView2, false);
        this.modalView = alternativeDestinationModalView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFocusRect() {
        AlternativeDestinationModalView alternativeDestinationModalView = (AlternativeDestinationModalView) modalViewCoordinator().i(AlternativeDestinationModalView.class);
        int contentHeight = alternativeDestinationModalView != null ? alternativeDestinationModalView.getContentHeight() : 0;
        a mapObjectHolder = getMapObjectHolder();
        Context context = mapObjectHolder.a;
        int u = tje.u(56, context);
        mapObjectHolder.b.Lc(mapObjectHolder, new Rect(u, u, u, contentHeight + context.getResources().getDimensionPixelSize(mrg0.go_design_m_space)));
    }

    public final a getMapObjectHolder() {
        a aVar = this.mapObjectHolder;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public final zw1 getModalViewFactory() {
        zw1 zw1Var = this.modalViewFactory;
        if (zw1Var != null) {
            return zw1Var;
        }
        return null;
    }

    public final w2e getPresenterFactory() {
        w2e w2eVar = this.presenterFactory;
        if (w2eVar != null) {
            return w2eVar;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        e0g injector = injector();
        zzf zzfVar = injector.b;
        this.receiverProvider = zzfVar.Yp;
        c0g c0gVar = injector.c;
        this.modalViewFactory = new zw1((Context) c0gVar.U.get(), new io9(new t61((pho) c0gVar.z.d0.get())));
        this.mapObjectHolder = new a((Context) c0gVar.U.get(), (a3v) c0gVar.Wb.get(), injector.a, c0gVar.Z5(), (o) zzfVar.q2.get(), injector.c(), new wt00((ah00) c0gVar.Vb.get()), (leh) zzfVar.um.get(), (ah00) c0gVar.Vb.get());
        this.presenterFactory = new w2e(injector.b(), new io9(new t61((pho) c0gVar.z.d0.get())), (bt00) zzfVar.Ok.get(), zzfVar.W0(), (pwy0) zzfVar.U.get());
        w2e presenterFactory = getPresenterFactory();
        f4e f4eVar = this.screenModel;
        if (f4eVar != null) {
            this.presenter = new v2e(f4eVar, presenterFactory.a, presenterFactory.b, presenterFactory.c, presenterFactory.d, presenterFactory.e);
            return inflater.inflate(gph0.confirm_alternative_destination_fragment, container, false);
        }
        ny61.r("Required value was null.");
        return null;
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        v2e v2eVar = this.presenter;
        if (v2eVar != null) {
            v2eVar.Cg();
        }
        getMapObjectHolder().b();
        super.onDestroyView();
    }

    @Override // ru.yandex.taxi.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getMenuButtonCoordinator().setVisibility(8);
        v2e v2eVar = this.presenter;
        final int i = 1;
        if (v2eVar != null) {
            q2e q2eVar = this.innerView;
            v2eVar.Bg(q2eVar);
            t61 t61Var = (t61) v2eVar.z.a;
            t61Var.a.a("AltpinB.ConfirmationScreen.Shown", new HashMap(), 1, new HashMap());
            ((e) v2eVar.A).d("pedestrian");
            tje.N(v2eVar.Jg(), null, null, new ConfirmAlternativeDestinationPresenter$attachView$1(v2eVar, q2eVar, null), 3);
        }
        getMapObjectHolder().a();
        a mapObjectHolder = getMapObjectHolder();
        final int i2 = 0;
        final o2e o2eVar = new o2e(this, i2);
        ru.yandex.taxi.altpins.map.a aVar = mapObjectHolder.y;
        e100 e100Var = aVar.j;
        sls slsVar = new sls() { // from class: ez1
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                o2e o2eVar2 = o2eVar;
                switch (i3) {
                    case 0:
                        o2eVar2.invoke(OptionType.ALTPIN);
                        break;
                    default:
                        o2eVar2.invoke(OptionType.ORIGINAL);
                        break;
                }
                return Boolean.TRUE;
            }
        };
        f4c0 f4c0Var = (f4c0) e100Var.w;
        if (f4c0Var != null) {
            f4c0Var.g(new doy(i, slsVar));
        }
        e100 e100Var2 = aVar.k;
        sls slsVar2 = new sls() { // from class: ez1
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                o2e o2eVar2 = o2eVar;
                switch (i3) {
                    case 0:
                        o2eVar2.invoke(OptionType.ALTPIN);
                        break;
                    default:
                        o2eVar2.invoke(OptionType.ORIGINAL);
                        break;
                }
                return Boolean.TRUE;
            }
        };
        f4c0 f4c0Var2 = (f4c0) e100Var2.w;
        if (f4c0Var2 != null) {
            f4c0Var2.g(new doy(i, slsVar2));
        }
        this.topMapFade = nonNullViewById(bdh0.map_top_fade);
        this.titleView = (RobotoTextView) nonNullViewById(bdh0.title);
        tje.i(view, 48, new o2e(this, i));
    }

    public final void setMapObjectHolder(a aVar) {
        this.mapObjectHolder = aVar;
    }

    public final void setModalViewFactory(zw1 zw1Var) {
        this.modalViewFactory = zw1Var;
    }

    public final void setPresenterFactory(w2e w2eVar) {
        this.presenterFactory = w2eVar;
    }
}
