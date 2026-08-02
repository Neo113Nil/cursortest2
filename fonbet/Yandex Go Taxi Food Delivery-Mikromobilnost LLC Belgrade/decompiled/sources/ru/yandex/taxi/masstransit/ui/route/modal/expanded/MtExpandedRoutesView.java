package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.c2x0;
import defpackage.c57;
import defpackage.cf30;
import defpackage.cma1;
import defpackage.d2x0;
import defpackage.ei;
import defpackage.lj30;
import defpackage.ny61;
import defpackage.pj30;
import defpackage.qj30;
import defpackage.qoi0;
import defpackage.reh0;
import defpackage.rhy;
import defpackage.sf30;
import defpackage.t1w;
import defpackage.tje;
import defpackage.uqh0;
import defpackage.vx30;
import defpackage.xng0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardCloseReason;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\",B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/yandex/taxi/masstransit/ui/route/modal/expanded/MtExpandedRoutesView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Llj30;", "presenter", "Lc2x0;", "systemBarsCoordinator", "Landroid/content/Context;", "context", "<init>", "(Llj30;Lc2x0;Landroid/content/Context;)V", "Lzy11;", "handleTransportCardLayoutAccessibility", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lt1w;", "insets", "applyInsets", "(Lt1w;)V", "", "isReadyToShow", "updateContentVisibility", "(Z)V", "expanded", "onExpandChange", "Llj30;", "Lc2x0;", "Lqj30;", "binding", "Lqj30;", "Lpj30;", "inner", "Lpj30;", "Lcf30;", "adapter", "Lcf30;", "Lc57;", "Lhj30;", "routeButtonsContract", "Lc57;", "rj30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtExpandedRoutesView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final cf30 adapter;
    private final qj30 binding;
    private final pj30 inner;
    private final lj30 presenter;
    private final c57 routeButtonsContract;
    private final c2x0 systemBarsCoordinator;

    public MtExpandedRoutesView(lj30 lj30Var, c2x0 c2x0Var, Context context) {
        super(context, null, 0, 0, 14, null);
        this.presenter = lj30Var;
        this.systemBarsCoordinator = c2x0Var;
        LayoutInflater.from(context).inflate(uqh0.mt_expanded_routes_view, this);
        int i = reh0.back_button;
        FloatButtonIconComponent floatButtonIconComponent = (FloatButtonIconComponent) cma1.O(i, this);
        if (floatButtonIconComponent != null) {
            i = reh0.bottom_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout != null) {
                i = reh0.bottom_container_shadow;
                GoImageView goImageView = (GoImageView) cma1.O(i, this);
                if (goImageView != null) {
                    i = reh0.filter_icon;
                    FloatButtonIconComponent floatButtonIconComponent2 = (FloatButtonIconComponent) cma1.O(i, this);
                    if (floatButtonIconComponent2 != null) {
                        i = reh0.header;
                        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                        if (listItemComponent != null) {
                            i = reh0.header_layout;
                            if (((GoConstraintLayout) cma1.O(i, this)) != null) {
                                i = reh0.route_items;
                                RecyclerView recyclerView = (RecyclerView) cma1.O(i, this);
                                if (recyclerView != null) {
                                    i = reh0.routes_buttons;
                                    ButtonsView buttonsView = (ButtonsView) cma1.O(i, this);
                                    if (buttonsView != null) {
                                        i = reh0.transport_card_image;
                                        GoImageButton goImageButton = (GoImageButton) cma1.O(i, this);
                                        if (goImageButton != null) {
                                            i = reh0.transport_card_layout;
                                            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, this);
                                            if (goConstraintLayout != null) {
                                                i = reh0.transport_card_status_image;
                                                GoImageButton goImageButton2 = (GoImageButton) cma1.O(i, this);
                                                if (goImageButton2 != null) {
                                                    i = reh0.transport_card_text;
                                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                                                    if (robotoTextView != null) {
                                                        this.binding = new qj30(this, floatButtonIconComponent, goLinearLayout, goImageView, floatButtonIconComponent2, listItemComponent, recyclerView, buttonsView, goImageButton, goConstraintLayout, goImageButton2, robotoTextView);
                                                        this.inner = new pj30(this);
                                                        cf30 cf30Var = new cf30(new MtExpandedRoutesView$adapter$1(1, lj30Var, lj30.class, "itemClicked", "itemClicked(Lru/yandex/taxi/masstransit/ui/route/modal/expanded/DetailRouteItem;)V", 0), new MtExpandedRoutesView$adapter$2(1, lj30Var, lj30.class, "openThreadVariants", "openThreadVariants(Lru/yandex/taxi/masstransit/model/ThreadVariantsState;)V", 0), new MtExpandedRoutesView$adapter$3(1, lj30Var, lj30.class, "onTrainsScheduleClicked", "onTrainsScheduleClicked(Lru/yandex/taxi/masstransit/ui/route/modal/expanded/TrainsScheduleButton;)V", 0), new MtExpandedRoutesView$adapter$4(1, lj30Var, lj30.class, "onTrainsTicketsClicked", "onTrainsTicketsClicked(Lru/yandex/taxi/masstransit/ui/route/modal/expanded/TrainsTicketsButton;)V", 0));
                                                        this.adapter = cf30Var;
                                                        this.routeButtonsContract = buttonsView.buttonsContract();
                                                        floatButtonIconComponent.setTranslationY(tje.w(8, getContext()));
                                                        floatButtonIconComponent2.setTranslationY(tje.w(8, getContext()));
                                                        goImageButton2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(24));
                                                        goImageButton2.setClipToOutline(true);
                                                        recyclerView.setAdapter(cf30Var);
                                                        recyclerView.setHasFixedSize(true);
                                                        recyclerView.addItemDecoration(new rhy(context));
                                                        RecyclerView.c itemAnimator = recyclerView.getItemAnimator();
                                                        b1 b1Var = itemAnimator instanceof b1 ? (b1) itemAnimator : null;
                                                        if (b1Var != null) {
                                                            b1Var.g = false;
                                                        }
                                                        floatButtonIconComponent.setDebounceClickListener(new sf30(2, lj30Var));
                                                        recyclerView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(24, getContext())));
                                                        recyclerView.setClipToOutline(true);
                                                        handleTransportCardLayoutAccessibility();
                                                        setBackgroundAttr(xng0.bgMinor);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void handleTransportCardLayoutAccessibility() {
        androidx.core.view.b.p(this.binding.i, new ei(13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$backClicked(lj30 lj30Var) {
        lj30Var.B.a(MtDetailRouteCardCloseReason.CARD_BACK_BUTTON, TransportRouteAnalytics$DetailCardSource.Transport, TransportRouteAnalytics$DetailCardType.Horizontal);
        MtRoutesModalView mtRoutesModalView = ((vx30) lj30Var.x.a).U;
        if (mtRoutesModalView != null) {
            mtRoutesModalView.collapse();
        }
    }

    public final void applyInsets(t1w insets) {
        MtExpandedRoutesView mtExpandedRoutesView = this.binding.a;
        mtExpandedRoutesView.setPadding(mtExpandedRoutesView.getPaddingLeft(), insets.b, mtExpandedRoutesView.getPaddingRight(), mtExpandedRoutesView.getPaddingBottom());
        int visibility = this.binding.c.getVisibility();
        qj30 qj30Var = this.binding;
        View view = visibility == 0 ? qj30Var.c : qj30Var.f;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.d);
    }

    @Override // com.yandex.go.design.view.GoConstraintLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((d2x0) this.systemBarsCoordinator).e(0, qoi0.a(MtExpandedRoutesView.class));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lj30 lj30Var = this.presenter;
        pj30 pj30Var = this.inner;
        lj30Var.Bg(pj30Var);
        tje.N(lj30Var.Jg(), null, null, new MtExpandedRoutesPresenter$attachView$1(lj30Var, pj30Var, null), 3);
        tje.N(lj30Var.Jg(), null, null, new MtExpandedRoutesPresenter$attachView$2(lj30Var, pj30Var, null), 3);
        tje.N(lj30Var.Jg(), null, null, new MtExpandedRoutesPresenter$attachView$3(lj30Var, pj30Var, null), 3);
        ((d2x0) this.systemBarsCoordinator).e(0, qoi0.a(MtExpandedRoutesView.class));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        ((d2x0) this.systemBarsCoordinator).b(qoi0.a(MtExpandedRoutesView.class));
    }

    public final void onExpandChange(boolean expanded) {
        Object value;
        r0 r0Var = this.presenter.K;
        do {
            value = r0Var.getValue();
            ((Boolean) value).getClass();
        } while (!r0Var.k(value, Boolean.valueOf(expanded)));
    }

    public final void updateContentVisibility(boolean isReadyToShow) {
        this.binding.b.setVisibility(isReadyToShow ? 0 : 4);
    }
}
