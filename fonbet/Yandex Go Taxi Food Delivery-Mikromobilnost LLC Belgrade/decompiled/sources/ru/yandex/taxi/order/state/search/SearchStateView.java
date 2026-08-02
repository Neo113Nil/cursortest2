package ru.yandex.taxi.order.state.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardHorizontalButtons;
import com.yandex.go.taxi.order.domain.repositories.n;
import com.yandex.go.taxi.order.provider.a0;
import com.yandex.go.taxi.order.provider.y;
import com.yandex.go.taxi.order.state.search.ui.SearchStateViewPresenter$attachView$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.state.search.ui.SearchStateViewPresenter$observeDriverCancellation$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.order.state.search.ui.b;
import com.yandex.go.taxi.order.state.search.ui.e;
import defpackage.aup0;
import defpackage.axp0;
import defpackage.b6j;
import defpackage.b980;
import defpackage.bu1;
import defpackage.bxp0;
import defpackage.c0g;
import defpackage.d980;
import defpackage.dgb;
import defpackage.dim;
import defpackage.eim;
import defpackage.f6j;
import defpackage.fxx0;
import defpackage.g6y0;
import defpackage.h3y;
import defpackage.h4w;
import defpackage.htc;
import defpackage.il70;
import defpackage.iup0;
import defpackage.kz8;
import defpackage.l0g;
import defpackage.mdh;
import defpackage.n0g;
import defpackage.o2y0;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.q5z;
import defpackage.qnu0;
import defpackage.qyy0;
import defpackage.rbh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.ud00;
import defpackage.uyj;
import defpackage.vd00;
import defpackage.wqj;
import defpackage.ytp0;
import defpackage.zkh0;
import defpackage.zzf;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.order.state.TaxiOnTheWayStateView;
import ru.yandex.taxi.widget.InstructionsView;
import ru.yandex.taxi.widget.SearchProgressBar;
import ru.yandex.taxi.widget.TimerTextView;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00016B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/yandex/taxi/order/state/search/SearchStateView;", "Lru/yandex/taxi/order/state/TaxiOnTheWayStateView;", "Laxp0;", "Lil70;", "Lud00;", "Landroid/content/Context;", "context", "Lfxx0;", "component", "<init>", "(Landroid/content/Context;Lfxx0;)V", "Lzy11;", "updateHeaderDividerVisibility", "()V", "inflateStateView", "Lcom/yandex/go/taxi/order/state/search/ui/e;", "getPresenter", "()Lcom/yandex/go/taxi/order/state/search/ui/e;", "onAttachedToWindow", "onDetachedFromWindow", "Laup0;", ClidProvider.STATE, "render", "(Laup0;)V", "animateDriverCancellation", "Landroid/view/View;", "getPeekView", "()Landroid/view/View;", "", "Lh4w;", "models", "setOrderInstructionModels", "(Ljava/util/List;)V", "Lb980;", "orderTitles", "setTitles", "(Lb980;)V", "Lf6j;", "renderDriverSection", "(Lf6j;)V", "searchStateViewPresenter", "Lcom/yandex/go/taxi/order/state/search/ui/e;", "getSearchStateViewPresenter", "setSearchStateViewPresenter", "(Lcom/yandex/go/taxi/order/state/search/ui/e;)V", "Landroid/view/ViewGroup;", "headerContainer", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/widget/InstructionsView;", "instructionsView", "Lru/yandex/taxi/widget/InstructionsView;", "Leim;", "driverButtonSearchDecorator", "Leim;", "Lbxp0;", "header", "Lbxp0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchStateView extends TaxiOnTheWayStateView<axp0> implements axp0, il70, ud00 {
    public static final int $stable = 8;
    private final eim driverButtonSearchDecorator;
    private final bxp0 header;
    private final ViewGroup headerContainer;
    private final InstructionsView instructionsView;
    public e searchStateViewPresenter;

    public SearchStateView(Context context, fxx0 fxx0Var) {
        super(context);
        ViewGroup viewGroup = (ViewGroup) nonNullViewById(p8h0.header_container);
        this.headerContainer = viewGroup;
        InstructionsView instructionsView = (InstructionsView) nonNullViewById(p8h0.instructions_view);
        this.instructionsView = instructionsView;
        this.driverButtonSearchDecorator = new eim(this);
        this.header = new bxp0(context, viewGroup);
        n0g n0gVar = (n0g) fxx0Var;
        c0g c0gVar = n0gVar.c;
        this.activity = c0gVar.w;
        this.component = n0gVar;
        this.horizontalButtonsViewPresenter = n0gVar.b();
        l0g l0gVar = n0gVar.f;
        o2y0 o2y0Var = l0gVar.a.a;
        q5z.i(o2y0Var);
        this.orderHolder = o2y0Var;
        this.cancelPresenter = n0gVar.c();
        this.makeAnotherOrderButtonPresenter = (vd00) n0gVar.i.get();
        this.detailsCardHeightAnimationsInteractor = l0gVar.a();
        zzf zzfVar = n0gVar.b;
        this.imageLoader = (pav) zzfVar.p3.get();
        this.storiesUiHolderFactory = (qnu0) zzfVar.hk.get();
        this.travelCompanionDetailPresenter = n0gVar.g();
        this.travelCompanionStatusViewProvider = n0gVar.v;
        this.communicationsAdapterFactory = (htc) n0gVar.e.R5.a;
        this.carDescriptionTextViewProvider = n0gVar.w;
        this.sessionTimelineTracker = (g6y0) zzfVar.lh.get();
        this.coroutineScope = (tse) c0gVar.B.get();
        this.searchStateViewPresenter = (e) n0gVar.y.get();
        instructionsView.init(getImageLoader());
        afterConstruction();
    }

    private final void updateHeaderDividerVisibility() {
        DividerType dividerType;
        if (this.bottomCircleButtonsView.getVisibility() == 0) {
            dividerType = DividerType.MARGIN;
        } else {
            DetailsCardHorizontalButtons detailsCardHorizontalButtons = this.bottomHorizontalButtons;
            dividerType = (detailsCardHorizontalButtons == null || detailsCardHorizontalButtons.getVisibility() != 0) ? (this.driverSection.getVisibility() != 0 || this.driverSection.getMeasuredHeight() == 0) ? this.promoPlaqueTopSection.getVisibility() == 0 ? DividerType.MARGIN : DividerType.NONE : DividerType.MARGIN : DividerType.MARGIN;
        }
        this.header.a.setDividers(DividerPosition.BOTTOM, dividerType);
    }

    @Override // defpackage.axp0
    public void animateDriverCancellation() {
        this.driverButtonSearchDecorator.a(this.bottomCircleButtonsView.getCandidate());
        eim eimVar = this.driverButtonSearchDecorator;
        eimVar.getClass();
        dim dimVar = new dim(eimVar, 0);
        View view = (View) eimVar.d.get();
        if (view != null) {
            view.postDelayed(new wqj(8, eimVar, dimVar), 200L);
        }
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, com.yandex.go.taxi.order.state.OrderStateView
    /* renamed from: getPeekView */
    public View getTitlesContainer() {
        return this.headerContainer;
    }

    public final e getSearchStateViewPresenter() {
        e eVar = this.searchStateViewPresenter;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public void inflateStateView() {
        inflate(zkh0.search_state_view);
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        e searchStateViewPresenter = getSearchStateViewPresenter();
        searchStateViewPresenter.Ng(this);
        bu1 bu1Var = searchStateViewPresenter.R;
        o2y0 o2y0Var = searchStateViewPresenter.A;
        tje.N(searchStateViewPresenter.D, null, null, new SearchStateViewPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new a0(new y(bu1Var.a.b(o2y0Var), bu1Var), bu1Var)), null, searchStateViewPresenter), 3);
        h3y h3yVar = searchStateViewPresenter.S;
        d980 d980Var = (d980) h3yVar.get();
        d980Var.p = new dgb(4, searchStateViewPresenter);
        d980Var.u = true;
        d980Var.x = true;
        boolean z = false;
        qyy0.c(new kz8(2, d980Var, z, z));
        rbh a = searchStateViewPresenter.T.a(o2y0Var.b());
        ((d980) h3yVar.get()).d(a.b);
        ((d980) h3yVar.get()).c(a.c);
        b bVar = new b(((n) ((iup0) searchStateViewPresenter.a0.get())).h(o2y0Var));
        searchStateViewPresenter.Z.getClass();
        sjh sjhVar = uyj.a;
        tje.N(searchStateViewPresenter.Jg(), null, null, new SearchStateViewPresenter$observeDriverCancellation$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(bVar, mdh.b), null, searchStateViewPresenter), 3);
        super.onAttachedToWindow();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getSearchStateViewPresenter().Cg();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.axp0
    public void render(aup0 state) {
        bxp0 bxp0Var = this.header;
        bxp0Var.getClass();
        if (state.a()) {
            ytp0 ytp0Var = (ytp0) state;
            boolean z = ytp0Var.a;
            SearchProgressBar searchProgressBar = bxp0Var.b;
            if (z) {
                searchProgressBar.setVisibility(0);
                searchProgressBar.setDuration(ytp0Var.b, ytp0Var.c);
                searchProgressBar.start();
            } else {
                searchProgressBar.stopWithoutAnimation();
                searchProgressBar.setVisibility(8);
            }
            boolean z2 = ytp0Var.d;
            TimerTextView timerTextView = bxp0Var.c;
            if (!z2) {
                timerTextView.stopTimer();
            } else if (!timerTextView.isStarted()) {
                timerTextView.setStartTime(Long.valueOf(ytp0Var.e));
            }
            timerTextView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.jxx0
    public void renderDriverSection(f6j state) {
        if (state instanceof b6j) {
            return;
        }
        super.renderDriverSection(state);
    }

    @Override // defpackage.axp0
    public void setOrderInstructionModels(List<h4w> models) {
        boolean isCanBeExpandedFromAnchored = isCanBeExpandedFromAnchored();
        this.instructionsView.setInstructions(models);
        if (isCanBeExpandedFromAnchored != isCanBeExpandedFromAnchored()) {
            canBeExpandedFromAnchoredChanged();
        }
    }

    public final void setSearchStateViewPresenter(e eVar) {
        this.searchStateViewPresenter = eVar;
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView, defpackage.jxx0
    public void setTitles(b980 orderTitles) {
        bxp0 bxp0Var = this.header;
        bxp0Var.a.setTitle(orderTitles.a);
        bxp0 bxp0Var2 = this.header;
        bxp0Var2.a.setSubtitle(orderTitles.c);
        updateHeaderDividerVisibility();
    }

    @Override // ru.yandex.taxi.order.state.TaxiOnTheWayStateView
    public e getPresenter() {
        return getSearchStateViewPresenter();
    }
}
