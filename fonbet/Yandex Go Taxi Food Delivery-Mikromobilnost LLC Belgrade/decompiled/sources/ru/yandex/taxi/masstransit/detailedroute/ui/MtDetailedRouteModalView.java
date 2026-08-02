package ru.yandex.taxi.masstransit.detailedroute.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.yandex.go.design.view.GoConstraintLayout;
import defpackage.a230;
import defpackage.bf30;
import defpackage.cf30;
import defpackage.cma1;
import defpackage.cta1;
import defpackage.dwc;
import defpackage.e230;
import defpackage.eg3;
import defpackage.f1h0;
import defpackage.gh00;
import defpackage.jl40;
import defpackage.k141;
import defpackage.kyh0;
import defpackage.l141;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.qdb1;
import defpackage.reh0;
import defpackage.rhy;
import defpackage.sf30;
import defpackage.sls;
import defpackage.su30;
import defpackage.tf30;
import defpackage.tje;
import defpackage.uf30;
import defpackage.uqh0;
import defpackage.vf30;
import defpackage.vng;
import defpackage.w511;
import defpackage.wf30;
import defpackage.wtb1;
import defpackage.xng0;
import defpackage.yw30;
import java.util.Iterator;
import kotlin.Metadata;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardCloseReason;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRouteModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002IJB5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u0011J\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0014¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010(\u001a\u00020\u001dH\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001fH\u0014¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0014¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u000f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020-0,H\u0014¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u001dH\u0014¢\u0006\u0004\b4\u00105R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010E¨\u0006K"}, d2 = {"Lru/yandex/taxi/masstransit/detailedroute/ui/MtDetailedRouteModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwf30;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/masstransit/detailedroute/ui/c;", "presenter", "Ldwc;", "compassButtonPresenter", "Lpwy0;", "themeSwitcherProvider", "Lk141;", "walkingNavigationExperimentRepository", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/masstransit/detailedroute/ui/c;Ldwc;Lpwy0;Lk141;)V", "Lzy11;", "refreshButtonsVisibility", "()V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwf30;", "onAttachedToWindow", "onDetachedFromWindow", "", "newState", "", "movedByUser", "onBehaviorStateChanged", "(IZ)V", "", "newOffset", "onDialogSlide", "(F)V", "onSlideOut", "getMaxAnchoredHeight", "()I", "canDragToExpandFromAnchored", "()Z", "Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;", "Landroid/view/View;", "behavior", "initBehavior", "(Lru/yandex/taxi/coordinator/AnchorBottomSheetBehavior;)V", "bottomSheetBehavior", "setInitialBehaviorState", "contentTop", "onModalViewAppear", "(I)V", "Lru/yandex/taxi/masstransit/detailedroute/ui/c;", "Ldwc;", "Lpwy0;", "Lk141;", "Lcf30;", "routeAdapter", "Lcf30;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "backButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "floatButtonLayoutHolder", "Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "compassButton", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "routeFocusButton", "userLocationFocusButton", "currentFocusButton", "vf30", "uf30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtDetailedRouteModalView extends SlideableBindingModalView<wf30> {
    public static final int $stable = 8;
    private final FloatButtonIconComponent backButton;
    private final RotatableFloatButton compassButton;
    private final dwc compassButtonPresenter;
    private RotatableFloatButton currentFocusButton;
    private final FloatButtonHolderLayout floatButtonLayoutHolder;
    private final c presenter;
    private final cf30 routeAdapter;
    private final RotatableFloatButton routeFocusButton;
    private final pwy0 themeSwitcherProvider;
    private final RotatableFloatButton userLocationFocusButton;
    private final k141 walkingNavigationExperimentRepository;

    public MtDetailedRouteModalView(Context context, c cVar, dwc dwcVar, pwy0 pwy0Var, k141 k141Var) {
        super(context);
        this.presenter = cVar;
        this.compassButtonPresenter = dwcVar;
        this.themeSwitcherProvider = pwy0Var;
        this.walkingNavigationExperimentRepository = k141Var;
        cf30 cf30Var = new cf30(new MtDetailedRouteModalView$routeAdapter$1(1, cVar, c.class, "onItemClicked", "onItemClicked(Lru/yandex/taxi/masstransit/ui/route/modal/expanded/DetailRouteItem;)V", 0), new MtDetailedRouteModalView$routeAdapter$2(1, cVar, c.class, "openThreadVariants", "openThreadVariants(Lru/yandex/taxi/masstransit/model/ThreadVariantsState;)V", 0), new MtDetailedRouteModalView$routeAdapter$3(1, cVar, c.class, "onTrainsScheduleClicked", "onTrainsScheduleClicked(Lru/yandex/taxi/masstransit/ui/route/modal/expanded/TrainsScheduleButton;)V", 0), new MtDetailedRouteModalView$routeAdapter$4(1, cVar, c.class, "onTrainsTicketsClicked", "onTrainsTicketsClicked(Lru/yandex/taxi/masstransit/ui/route/modal/expanded/TrainsTicketsButton;)V", 0));
        this.routeAdapter = cf30Var;
        int i = 0;
        this.backButton = qdb1.b(this, new sf30(i, cVar));
        FloatButtonHolderLayout c = eg3.c(this, 12);
        c.setOrientation(0);
        if (!((l141) k141Var).a()) {
            c.setVisibility(8);
        }
        this.floatButtonLayoutHolder = c;
        this.compassButton = eg3.a(c, new tf30(dwcVar, i));
        RotatableFloatButton rotatableFloatButton = new RotatableFloatButton(context, null, 0, 0, 14, null);
        rotatableFloatButton.setImageDrawable(vng.t(f1h0.ic_route, rotatableFloatButton.getContext()));
        rotatableFloatButton.setIconTintAttr(xng0.textMain);
        ru.yandex.taxi.design.utils.c.z(new MtDetailedRouteModalView$routeFocusButton$1$1(0, cVar, c.class, "routeFocusButtonClicked", "routeFocusButtonClicked()V", 0), rotatableFloatButton);
        rotatableFloatButton.setContentDescription(rotatableFloatButton.getContext().getString(kyh0.route_on_the_map));
        this.routeFocusButton = rotatableFloatButton;
        RotatableFloatButton rotatableFloatButton2 = new RotatableFloatButton(context, null, 0, 0, 14, null);
        rotatableFloatButton2.setImageDrawable(vng.t(f1h0.ic_location_fill_24, rotatableFloatButton2.getContext()));
        rotatableFloatButton2.setIconTintAttr(xng0.textMain);
        ru.yandex.taxi.design.utils.c.z(new MtDetailedRouteModalView$userLocationFocusButton$1$1(0, cVar, c.class, "userLocationFocusButtonClicked", "userLocationFocusButtonClicked()V", 0), rotatableFloatButton2);
        rotatableFloatButton2.setContentDescription(rotatableFloatButton2.getContext().getString(kyh0.detect_my_location_description));
        this.userLocationFocusButton = rotatableFloatButton2;
        setCardMode(SlideableModalView.CardMode.SLIDEABLE_CARD);
        setClickable(false);
        getBottomSheetBehavior().Z = false;
        setEnableBackgroundOnAppearing(false);
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setAdapter(cf30Var);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.addItemDecoration(new rhy(context));
        RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
        b1 b1Var = itemAnimator instanceof b1 ? (b1) itemAnimator : null;
        if (b1Var != null) {
            b1Var.g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void backButton$onBackPressed(c cVar) {
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        yw30 yw30Var = cVar.C;
        MtDetailRouteCardCloseReason mtDetailRouteCardCloseReason = MtDetailRouteCardCloseReason.CARD_BACK_BUTTON;
        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = cVar.z;
        int i2 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = cVar.A;
                i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                        yw30Var.a(mtDetailRouteCardCloseReason, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                        cVar.y.a();
                    } else if (i != 2) {
                        w511.b();
                        return;
                    }
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                yw30Var.a(mtDetailRouteCardCloseReason, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
                cVar.y.a();
            }
            if (i2 != 2) {
                w511.b();
                return;
            }
        }
        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = cVar.A;
        if (mtDetailedRouteAnalyticType2 != null) {
        }
        if (i != -1) {
        }
        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        yw30Var.a(mtDetailRouteCardCloseReason, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
        cVar.y.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void compassButton$onCompassButtonClicked(dwc dwcVar) {
        ((gh00) dwcVar.x).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(MtDetailedRouteModalView mtDetailedRouteModalView) {
        return mtDetailedRouteModalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$1(MtDetailedRouteModalView mtDetailedRouteModalView) {
        return mtDetailedRouteModalView.getBinding().b;
    }

    private final void refreshButtonsVisibility() {
        float x = getBottomSheetBehavior().x();
        if (x != 1.0f) {
            float f = 1.0f - x;
            r3 = (getSlideOffset() - x) / (f >= 0.0f ? f : 0.0f);
        }
        boolean z = r3 < 0.5f;
        this.backButton.setVisibility(z ? 0 : 8);
        if (((l141) this.walkingNavigationExperimentRepository).a()) {
            this.floatButtonLayoutHolder.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wf30 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uqh0.mt_detailed_route_modal_view, parent, false);
        int i = reh0.route_items;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = reh0.route_title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                return new wf30((GoConstraintLayout) inflate, recyclerView, robotoTextView);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getMaxAnchoredHeight() {
        return (int) (getContext().getResources().getDisplayMetrics().heightPixels / 2.5f);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void initBehavior(AnchorBottomSheetBehavior<View> behavior) {
        super.initBehavior(behavior);
        behavior.W = false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        final int i = 0;
        final int i2 = 1;
        return new a230(3, new sls(this) { // from class: rf30
            public final /* synthetic */ MtDetailedRouteModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View insetsType$lambda$0;
                View insetsType$lambda$1;
                int i3 = i;
                MtDetailedRouteModalView mtDetailedRouteModalView = this.b;
                switch (i3) {
                    case 0:
                        insetsType$lambda$0 = MtDetailedRouteModalView.insetsType$lambda$0(mtDetailedRouteModalView);
                        return insetsType$lambda$0;
                    default:
                        insetsType$lambda$1 = MtDetailedRouteModalView.insetsType$lambda$1(mtDetailedRouteModalView);
                        return insetsType$lambda$1;
                }
            }
        }, new sls(this) { // from class: rf30
            public final /* synthetic */ MtDetailedRouteModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View insetsType$lambda$0;
                View insetsType$lambda$1;
                int i3 = i2;
                MtDetailedRouteModalView mtDetailedRouteModalView = this.b;
                switch (i3) {
                    case 0:
                        insetsType$lambda$0 = MtDetailedRouteModalView.insetsType$lambda$0(mtDetailedRouteModalView);
                        return insetsType$lambda$0;
                    default:
                        insetsType$lambda$1 = MtDetailedRouteModalView.insetsType$lambda$1(mtDetailedRouteModalView);
                        return insetsType$lambda$1;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        Object obj;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        super.onAttachedToWindow();
        int i2 = 0;
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        setOnTouchOutsideListener(null);
        c cVar = this.presenter;
        vf30 vf30Var = new vf30(this);
        su30 su30Var = cVar.x;
        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = cVar.z;
        cVar.Bg(vf30Var);
        Iterator<E> it = MtDetailRouteCardOpenReason.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((MtDetailRouteCardOpenReason) obj).getValue(), mtDetailedRouteAnalyticSource != null ? mtDetailedRouteAnalyticSource.getValue() : null)) {
                    break;
                }
            }
        }
        MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason = (MtDetailRouteCardOpenReason) obj;
        if (mtDetailRouteCardOpenReason != null) {
            yw30 yw30Var = cVar.C;
            TransportRouteAnalytics$DetailCardOrigin e = wtb1.e(mtDetailRouteCardOpenReason);
            boolean e2 = cta1.e(su30Var);
            int i3 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
            if (i3 != -1) {
                if (i3 == 1) {
                    transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                    MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = cVar.A;
                    i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                            yw30Var.a.f(e2, e, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(su30Var.a));
                        } else if (i != 2) {
                            w511.b();
                            return;
                        }
                    }
                    transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                    yw30Var.a.f(e2, e, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(su30Var.a));
                } else if (i3 != 2) {
                    w511.b();
                    return;
                }
            }
            transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
            MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = cVar.A;
            if (mtDetailedRouteAnalyticType2 != null) {
            }
            if (i != -1) {
            }
            transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
            yw30Var.a.f(e2, e, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(su30Var.a));
        }
        tje.N(cVar.Jg(), null, null, new MtDetailedRoutePresenter$attachView$3(cVar, vf30Var, null), 3);
        if (((l141) cVar.J).a()) {
            tje.N(cVar.Jg(), null, null, new MtDetailedRoutePresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.d(cVar.B.a), null, vf30Var), 3);
        }
        if (((l141) this.walkingNavigationExperimentRepository).a()) {
            this.compassButtonPresenter.Kg(new uf30(this, i2));
        }
        refreshButtonsVisibility();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onBehaviorStateChanged(int newState, boolean movedByUser) {
        super.onBehaviorStateChanged(newState, movedByUser);
        refreshButtonsVisibility();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        if (((l141) this.walkingNavigationExperimentRepository).a()) {
            this.compassButtonPresenter.Cg();
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onDialogSlide(float newOffset) {
        super.onDialogSlide(newOffset);
        refreshButtonsVisibility();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        if (tje.L(getContext())) {
            getBottomSheetBehavior().O(3);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void setInitialBehaviorState(AnchorBottomSheetBehavior<View> bottomSheetBehavior) {
        if (tje.L(getContext())) {
            bottomSheetBehavior.O(3);
        } else {
            super.setInitialBehaviorState(bottomSheetBehavior);
        }
    }
}
