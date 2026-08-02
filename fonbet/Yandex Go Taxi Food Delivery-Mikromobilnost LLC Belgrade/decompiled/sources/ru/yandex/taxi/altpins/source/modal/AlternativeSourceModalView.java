package ru.yandex.taxi.altpins.source.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.ars0;
import defpackage.bdc;
import defpackage.bdh0;
import defpackage.bts0;
import defpackage.bv1;
import defpackage.cma1;
import defpackage.g0c;
import defpackage.g641;
import defpackage.gcc0;
import defpackage.gh00;
import defpackage.gph0;
import defpackage.h8;
import defpackage.hcc0;
import defpackage.he7;
import defpackage.hrs0;
import defpackage.i3y;
import defpackage.i5m;
import defpackage.j01;
import defpackage.jg;
import defpackage.jqr;
import defpackage.mqg0;
import defpackage.mx1;
import defpackage.mz1;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.qc6;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qx1;
import defpackage.rx1;
import defpackage.sls;
import defpackage.sx1;
import defpackage.sz1;
import defpackage.tje;
import defpackage.tn1;
import defpackage.u35;
import defpackage.u90;
import defpackage.ux1;
import defpackage.vrs0;
import defpackage.vx1;
import defpackage.vz1;
import defpackage.wrs0;
import defpackage.xng0;
import defpackage.xvf0;
import defpackage.xx1;
import defpackage.yfa;
import defpackage.yqs0;
import defpackage.z0s;
import defpackage.z541;
import defpackage.zxs;
import defpackage.zy11;
import defpackage.zz1;
import defpackage.zzs;
import java.util.Collections;
import java.util.HashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.altpins.AltpinSourceModalViewEntryPoint;
import ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB_\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u001b*\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J%\u0010,\u001a\u00020\u001b*\u00020\u001f2\u0006\u0010)\u001a\u00020(2\b\b\u0001\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0014¢\u0006\u0004\b.\u0010#J\u000f\u0010/\u001a\u00020\u001bH\u0014¢\u0006\u0004\b/\u0010#J\u0017\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020*H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001bH\u0014¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u001bH\u0014¢\u0006\u0004\b4\u0010#J\u001f\u00109\u001a\u00020\u00022\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010BR\u0018\u0010D\u001a\u00060CR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001b\u0010L\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010!R\u001b\u0010O\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010!R\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lru/yandex/taxi/altpins/source/modal/AlternativeSourceModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvx1;", "Landroid/content/Context;", "context", "Lbts0;", "slotItemViewFactory", "La3v;", "focusCoordinator", "Lars0;", "slotItemButtonViewFactory", "Lru/yandex/taxi/layers/presentation/walkroute/simple/a;", "walkInteractor", "Lz541;", "walkRouteDependencies", "Lru/yandex/taxi/altpins/source/overlay/a;", "overlay", "Lru/yandex/taxi/altpins/source/modal/d;", "presenter", "Lsz1;", "bubble", "Lgcc0;", "placesOrganizationCardNavigator", "<init>", "(Landroid/content/Context;Lbts0;La3v;Lars0;Lru/yandex/taxi/layers/presentation/walkroute/simple/a;Lz541;Lru/yandex/taxi/altpins/source/overlay/a;Lru/yandex/taxi/altpins/source/modal/d;Lsz1;Lgcc0;)V", "Lsx1;", ClidProvider.STATE, "Lzy11;", "renderState", "(Lsx1;)V", "renderButtons", "Lyqs0;", "createButton", "()Lyqs0;", "updateFocusRect", "()V", "Lqx1;", "button", "renderButton", "(Lyqs0;Lqx1;)V", "", "isLoading", "", "shaderColor", "renderLoading", "(Lyqs0;ZI)V", "onAttachedToWindow", "onDetachedFromWindow", "contentTop", "onModalViewAppear", "(I)V", "onModalViewDisappear", "onBackPressed", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvx1;", "La3v;", "Lars0;", "Lru/yandex/taxi/layers/presentation/walkroute/simple/a;", "Lz541;", "Lru/yandex/taxi/altpins/source/overlay/a;", "Lru/yandex/taxi/altpins/source/modal/d;", "Lsz1;", "Lgcc0;", "Lux1;", "innerView", "Lux1;", "Lmz1;", "adapter", "Lmz1;", "confirmButton$delegate", "Li3y;", "getConfirmButton", "confirmButton", "declineButton$delegate", "getDeclineButton", "declineButton", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lg641;", "walkRouteOverlay", "Lg641;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AlternativeSourceModalView extends SlideableBindingModalView<vx1> {
    private final mz1 adapter;
    private final sz1 bubble;

    /* renamed from: confirmButton$delegate, reason: from kotlin metadata */
    private final i3y confirmButton;

    /* renamed from: declineButton$delegate, reason: from kotlin metadata */
    private final i3y declineButton;
    private final a3v focusCoordinator;
    private final ux1 innerView;
    private final View.OnLayoutChangeListener layoutChangeListener;
    private final ru.yandex.taxi.altpins.source.overlay.a overlay;
    private final gcc0 placesOrganizationCardNavigator;
    private final d presenter;
    private final ars0 slotItemButtonViewFactory;
    private final ru.yandex.taxi.layers.presentation.walkroute.simple.a walkInteractor;
    private final z541 walkRouteDependencies;
    private g641 walkRouteOverlay;

    public AlternativeSourceModalView(Context context, bts0 bts0Var, a3v a3vVar, ars0 ars0Var, ru.yandex.taxi.layers.presentation.walkroute.simple.a aVar, z541 z541Var, ru.yandex.taxi.altpins.source.overlay.a aVar2, d dVar, sz1 sz1Var, gcc0 gcc0Var) {
        super(context);
        this.focusCoordinator = a3vVar;
        this.slotItemButtonViewFactory = ars0Var;
        this.walkInteractor = aVar;
        this.walkRouteDependencies = z541Var;
        this.overlay = aVar2;
        this.presenter = dVar;
        this.bubble = sz1Var;
        this.placesOrganizationCardNavigator = gcc0Var;
        this.innerView = new ux1(this);
        int i = qc6.T;
        g0c a = qoi0.a(rx1.class);
        final int i2 = 0;
        vz1 vz1Var = new vz1(bts0Var, i2);
        j01 j01Var = new j01(27);
        Class a2 = a.a();
        final int i3 = 1;
        mz1 mz1Var = new mz1(Collections.singletonList(new zxs(a2, 0, vz1Var, EmptyList.a, new he7(i3, j01Var), null)));
        this.adapter = mz1Var;
        sls slsVar = new sls(this) { // from class: tx1
            public final /* synthetic */ AlternativeSourceModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                yqs0 createButton;
                yqs0 createButton2;
                int i4 = i2;
                AlternativeSourceModalView alternativeSourceModalView = this.b;
                switch (i4) {
                    case 0:
                        createButton = alternativeSourceModalView.createButton();
                        return createButton;
                    default:
                        createButton2 = alternativeSourceModalView.createButton();
                        return createButton2;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.confirmButton = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        this.declineButton = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: tx1
            public final /* synthetic */ AlternativeSourceModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                yqs0 createButton;
                yqs0 createButton2;
                int i4 = i3;
                AlternativeSourceModalView alternativeSourceModalView = this.b;
                switch (i4) {
                    case 0:
                        createButton = alternativeSourceModalView.createButton();
                        return createButton;
                    default:
                        createButton2 = alternativeSourceModalView.createButton();
                        return createButton2;
                }
            }
        });
        this.layoutChangeListener = new u90(4, this);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setClickable(false);
        getBinding().b.setAdapter(mz1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yqs0 createButton() {
        ars0 ars0Var = this.slotItemButtonViewFactory;
        AttributeSet attributeSet = null;
        int i = 0;
        int i2 = 0;
        SlotItemButtonViewComponent slotItemButtonViewComponent = new SlotItemButtonViewComponent(getContext(), attributeSet, i, i2, ((hrs0) ars0Var).a, new tn1(13, this), 14, null);
        createButton$lambda$1(slotItemButtonViewComponent);
        return slotItemButtonViewComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 createButton$lambda$0(AlternativeSourceModalView alternativeSourceModalView, nqs0 nqs0Var, wrs0 wrs0Var) {
        mx1 mx1Var = nqs0Var instanceof mx1 ? (mx1) nqs0Var : null;
        if (mx1Var != null) {
            d dVar = alternativeSourceModalView.presenter;
            yfa yfaVar = dVar.E;
            String a = mx1Var.a();
            bv1 bv1Var = (bv1) yfaVar.a;
            bv1Var.getClass();
            HashMap hashMap = new HashMap();
            if (a != null) {
                hashMap.put("type", a);
            }
            bv1Var.a.a("AltPointA.ModalScreen.Tap", hashMap, 1, new HashMap());
            tje.N(dVar.Jg(), null, null, new AlternativeSourceModalViewPresenter$handleAction$1(mx1Var, dVar, null), 3);
        }
        return zy11.a;
    }

    private static final zy11 createButton$lambda$1(View view) {
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        return zy11.a;
    }

    private final yqs0 getConfirmButton() {
        return (yqs0) this.confirmButton.getValue();
    }

    private final yqs0 getDeclineButton() {
        return (yqs0) this.declineButton.getValue();
    }

    private static final zy11 onModalViewAppear$lambda$0(g641 g641Var, String str, zzs zzsVar) {
        g641Var.Hg(str, zzsVar, null);
        return zy11.a;
    }

    private final void renderButton(yqs0 yqs0Var, qx1 qx1Var) {
        yqs0Var.render(qx1Var.a, qx1Var.b);
        yqs0Var.renderBackground(qx1Var.c);
        nqs0 nqs0Var = qx1Var.a.d;
        wrs0.a.getClass();
        yqs0Var.setAction(nqs0Var, vrs0.b);
        View asView = yqs0Var.asView();
        boolean z = qx1Var.d;
        asView.setAlpha(z ? 1.0f : 0.5f);
        yqs0Var.setup(tje.u(56, getContext()), new bdc(xng0.controlPressed));
        renderLoading(yqs0Var, qx1Var.e, getContext().getColor(mqg0.transparent));
        yqs0Var.renderEnabled(z);
    }

    private final void renderButtons(sx1 state) {
        ru.yandex.taxi.design.utils.c.w(getBinding().e, getDeclineButton().asView());
        ru.yandex.taxi.design.utils.c.w(getBinding().d, getConfirmButton().asView());
        renderButton(getConfirmButton(), state.d);
        renderButton(getDeclineButton(), state.c);
    }

    private final void renderLoading(yqs0 yqs0Var, boolean z, int i) {
        yqs0Var.renderLoading(z);
        if (z) {
            View asView = yqs0Var.asView();
            ViewGroup viewGroup = asView instanceof ViewGroup ? (ViewGroup) asView : null;
            if (viewGroup != null) {
                h8 h8Var = new h8(3, viewGroup);
                while (h8Var.hasNext()) {
                    View view = (View) h8Var.next();
                    if (view instanceof ListItemComponent) {
                        ((ListItemComponent) view).startProgressAnimation(Integer.valueOf(i), 800);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderState(sx1 state) {
        getBinding().c.setTitle(state.a);
        this.adapter.submitList(state.b, null);
        renderButtons(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFocusRect() {
        this.focusCoordinator.q3(qoi0.a(AlternativeSourceModalView.class), tje.u(72, getContext()), tje.u(48, getContext()), tje.u(72, getContext()), getContentHeight() + tje.u(16, getContext()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vx1 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(gph0.alternative_source_modal_view, parent, false);
        int i = bdh0.altpin_card_items;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = bdh0.altpin_card_title;
            ListHeaderComponent listHeaderComponent = (ListHeaderComponent) cma1.O(i, inflate);
            if (listHeaderComponent != null) {
                i = bdh0.altpin_confirm_button;
                ViewStub viewStub = (ViewStub) cma1.O(i, inflate);
                if (viewStub != null) {
                    i = bdh0.altpin_decline_button;
                    ViewStub viewStub2 = (ViewStub) cma1.O(i, inflate);
                    if (viewStub2 != null) {
                        return new vx1((GoLinearLayout) inflate, recyclerView, listHeaderComponent, viewStub, viewStub2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setEnableBackgroundOnAppearing(false);
        qdb1.b(this, new jg(15, this));
        d dVar = this.presenter;
        ux1 ux1Var = this.innerView;
        dVar.Bg(ux1Var);
        yfa yfaVar = dVar.E;
        AltpinSourceModalViewEntryPoint altpinSourceModalViewEntryPoint = dVar.z.e;
        bv1 bv1Var = (bv1) yfaVar.a;
        String analyticsName = altpinSourceModalViewEntryPoint.getAnalyticsName();
        bv1Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("source", analyticsName);
        }
        bv1Var.a.a("AltPointA.ModalScreen.Shown", hashMap, 1, new HashMap());
        kotlinx.coroutines.flow.e.H(dVar.Jg(), new jqr(new c(new m0(kotlinx.coroutines.flow.e.t(dVar.A.a()), dVar.F, new AlternativeSourceModalViewPresenter$attachView$1(3, null)), dVar), new AlternativeSourceModalViewPresenter$attachView$3(ux1Var, dVar, null), 3));
        this.overlay.Hg(this.bubble);
        ((hcc0) this.placesOrganizationCardNavigator).a();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        d dVar = this.presenter;
        if (((Boolean) dVar.F.getValue()).booleanValue()) {
            tje.N(dVar.Jg(), null, null, new AlternativeSourceModalViewPresenter$onBackPressed$1(dVar, null), 3);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ru.yandex.taxi.altpins.source.overlay.a aVar = this.overlay;
        zz1 zz1Var = aVar.z;
        if (zz1Var != null) {
            zz1Var.Cg();
        }
        u35 u35Var = aVar.x.f;
        if (u35Var != null) {
            u35Var.m();
            ((gh00) ((ah00) aVar.b)).i.o(u35Var);
        }
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.focusCoordinator.b8(qoi0.a(AlternativeSourceModalView.class));
        addOnLayoutChangeListener(this.layoutChangeListener);
        g641 g641Var = (g641) i5m.a((xvf0) z0s.f(this.walkRouteDependencies, this.walkInteractor).y).get();
        this.walkRouteOverlay = g641Var;
        xx1 xx1Var = this.presenter.z;
        onModalViewAppear$lambda$0(g641Var, xx1Var.b.a, xx1Var.c);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        g641 g641Var = this.walkRouteOverlay;
        if (g641Var != null) {
            g641Var.detach();
        }
        this.walkRouteOverlay = null;
        removeOnLayoutChangeListener(this.layoutChangeListener);
        this.focusCoordinator.t4(qoi0.a(AlternativeSourceModalView.class));
        this.focusCoordinator.a0(qoi0.a(AlternativeSourceModalView.class));
    }
}
