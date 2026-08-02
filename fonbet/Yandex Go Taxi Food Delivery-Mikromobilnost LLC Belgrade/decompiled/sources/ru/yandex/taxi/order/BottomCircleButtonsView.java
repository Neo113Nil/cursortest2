package ru.yandex.taxi.order;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.p;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ba80;
import defpackage.bdc;
import defpackage.c0g;
import defpackage.evu0;
import defpackage.f0g;
import defpackage.fxx0;
import defpackage.iup0;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.lx4;
import defpackage.mqg0;
import defpackage.n0g;
import defpackage.o2y0;
import defpackage.oyr;
import defpackage.p4j;
import defpackage.p8h0;
import defpackage.pav;
import defpackage.pwf0;
import defpackage.q5z;
import defpackage.qeb1;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ud80;
import defpackage.xng0;
import defpackage.yb6;
import defpackage.zkh0;
import defpackage.zxf0;
import defpackage.zzf;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;
import ru.yandex.taxi.superapp.orders.models.ActionType;
import ru.yandex.taxi.widget.buttons.IconCircleButton;
import ru.yandex.taxi.widget.buttons.LoadingIconCircleButton;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002NOB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0018J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010\u001dJ\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\u000eJ\u000f\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u0014\u00101\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010+R\u0018\u0010A\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010.R\"\u0010E\u001a\u00020D8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lru/yandex/taxi/order/BottomCircleButtonsView;", "Lru/yandex/taxi/design/CircleButtonsPanelComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lfxx0;", "component", "Lzy11;", "init", "(Lfxx0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "", "getVisibleButtons", "()Ljava/util/List;", "getInvisibleButtons", "", "visible", "setCancelVisible", "(Z)V", BackendConfig.Restrictions.ENABLED, "setCancelEnabled", "cost", "setCancelCost", "(Ljava/lang/String;)V", "setMakeAnotherOrderVisible", "Landroid/view/View;", "makeAnotherOrderButton", "()Landroid/view/View;", "title", "showSafetyCenter", "hideSafetyCenter", "Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;", "getCandidateButton", "()Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;", "getOrCreateCandidate", "createCandidateButton", "driver", "Lru/yandex/taxi/widget/buttons/LoadingIconCircleButton;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "cancel", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "share", "makeAnotherOrder", "safetyCenterButton", "Landroid/view/ViewStub;", "transportInfoButtonStub", "Landroid/view/ViewStub;", "Lkdc;", "iconBackgroundColor", "Lkdc;", "iconColor", "Lru/yandex/taxi/order/BottomCircleButtonsView$a;", "uiDelegate", "Lru/yandex/taxi/order/BottomCircleButtonsView$a;", "getUiDelegate", "()Lru/yandex/taxi/order/BottomCircleButtonsView$a;", "setUiDelegate", "(Lru/yandex/taxi/order/BottomCircleButtonsView$a;)V", "candidate", "candidateDescription", "Ljava/lang/String;", "transportInfoButton", "Lcom/yandex/go/taxi/order/p;", "presenter", "Lcom/yandex/go/taxi/order/p;", "getPresenter", "()Lcom/yandex/go/taxi/order/p;", "setPresenter", "(Lcom/yandex/go/taxi/order/p;)V", "", "circleBtnIconPadding", CA20Status.STATUS_USER_I, "a", "ru/yandex/taxi/order/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BottomCircleButtonsView extends CircleButtonsPanelComponent {
    public static final int $stable = 8;
    private final IconCircleButton cancel;
    private LoadingIconCircleButton candidate;
    private String candidateDescription;
    private final int circleBtnIconPadding;
    private final LoadingIconCircleButton driver;
    private final kdc iconBackgroundColor;
    private final kdc iconColor;
    private final IconCircleButton makeAnotherOrder;
    public p presenter;
    private final IconCircleButton safetyCenterButton;
    private final IconCircleButton share;
    private IconCircleButton transportInfoButton;
    private final ViewStub transportInfoButtonStub;
    private a uiDelegate;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/order/BottomCircleButtonsView$a;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a extends zxf0 {
        void A4();

        void af();

        void onCancelClick();

        void se();
    }

    public BottomCircleButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ru.yandex.taxi.design.utils.c.q(this, zkh0.bottom_circle_button_view, true);
        int i = p8h0.driver;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.driver = (LoadingIconCircleButton) ((View) rp31.d(this, i));
        this.cancel = (IconCircleButton) ((View) rp31.d(this, p8h0.cancel));
        this.share = (IconCircleButton) ((View) rp31.d(this, p8h0.share));
        this.makeAnotherOrder = (IconCircleButton) ((View) rp31.d(this, p8h0.make_another_order));
        this.safetyCenterButton = (IconCircleButton) ((View) rp31.d(this, p8h0.safety_center));
        this.transportInfoButtonStub = (ViewStub) ((View) rp31.d(this, p8h0.transport_info_button_stub));
        this.iconBackgroundColor = new bdc(xng0.controlMinor);
        this.iconColor = new bdc(xng0.textOnControlMinor);
        this.uiDelegate = (a) ((zxf0) pwf0.c(a.class));
        this.circleBtnIconPadding = tje.u(14, getContext());
    }

    private final LoadingIconCircleButton createCandidateButton() {
        LoadingIconCircleButton loadingIconCircleButton = new LoadingIconCircleButton(getContext());
        loadingIconCircleButton.setDebounceClickListener(new yb6(this, 5));
        addView(loadingIconCircleButton, 0);
        loadingIconCircleButton.setBackgroundColor(this.iconBackgroundColor);
        String str = this.candidateDescription;
        if (str != null) {
            loadingIconCircleButton.setContentDescription(str);
        }
        return loadingIconCircleButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCandidateButton$lambda$0(BottomCircleButtonsView bottomCircleButtonsView) {
        p presenter = bottomCircleButtonsView.getPresenter();
        presenter.E.a(presenter.x.b().a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingIconCircleButton getOrCreateCandidate() {
        LoadingIconCircleButton loadingIconCircleButton = this.candidate;
        if (loadingIconCircleButton != null) {
            return loadingIconCircleButton;
        }
        LoadingIconCircleButton createCandidateButton = createCandidateButton();
        this.candidate = createCandidateButton;
        return createCandidateButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(BottomCircleButtonsView bottomCircleButtonsView) {
        p presenter = bottomCircleButtonsView.getPresenter();
        o2y0 o2y0Var = presenter.x;
        Driver driver = o2y0Var.b().V().g;
        if (jl40.l(driver, Driver.v)) {
            return;
        }
        p4j p4jVar = presenter.F;
        boolean z = driver.s;
        p4jVar.getClass();
        String a2 = p4j.a(ActionType.DRIVER);
        lx4 lx4Var = p4jVar.b;
        String str = p4jVar.a.b().a;
        String p = oyr.p("OrderDetails.", a2, ".Tapped");
        ru.yandex.taxi.analytics.j jVar = (ru.yandex.taxi.analytics.j) lx4Var;
        jVar.getClass();
        ru.yandex.taxi.analytics.i iVar = new ru.yandex.taxi.analytics.i(jVar, p, str);
        iVar.g("details_unavailable", z);
        iVar.m();
        if (driver.s) {
            return;
        }
        presenter.G.B(o2y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(BottomCircleButtonsView bottomCircleButtonsView) {
        bottomCircleButtonsView.uiDelegate.onCancelClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$2(BottomCircleButtonsView bottomCircleButtonsView) {
        p presenter = bottomCircleButtonsView.getPresenter();
        presenter.A.a(presenter.x);
        presenter.F.c("ShareRoute");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$3(BottomCircleButtonsView bottomCircleButtonsView) {
        bottomCircleButtonsView.uiDelegate.af();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4(BottomCircleButtonsView bottomCircleButtonsView) {
        bottomCircleButtonsView.uiDelegate.se();
    }

    /* renamed from: getCandidateButton, reason: from getter */
    public final LoadingIconCircleButton getCandidate() {
        return this.candidate;
    }

    public final List<String> getInvisibleButtons() {
        ArrayList arrayList = new ArrayList();
        if (this.cancel.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(this.cancel)) {
            arrayList.add("Cancel");
        }
        if (this.share.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(this.share)) {
            arrayList.add("ShareRoute");
        }
        if (this.makeAnotherOrder.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(this.makeAnotherOrder)) {
            arrayList.add("AddTaxi");
        }
        if (this.safetyCenterButton.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(this.safetyCenterButton)) {
            arrayList.add("SafetyCenter");
        }
        LoadingIconCircleButton loadingIconCircleButton = this.candidate;
        if ((loadingIconCircleButton != null && loadingIconCircleButton.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(loadingIconCircleButton)) || (this.driver.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(this.driver))) {
            arrayList.add("Driver");
        }
        IconCircleButton iconCircleButton = this.transportInfoButton;
        if (iconCircleButton != null && iconCircleButton.getVisibility() == 0 && !ru.yandex.taxi.design.utils.c.r(iconCircleButton)) {
            arrayList.add("TransportInfo");
        }
        return arrayList;
    }

    public final p getPresenter() {
        p pVar = this.presenter;
        if (pVar != null) {
            return pVar;
        }
        return null;
    }

    public final a getUiDelegate() {
        return this.uiDelegate;
    }

    public final List<String> getVisibleButtons() {
        ArrayList arrayList = new ArrayList();
        if (ru.yandex.taxi.design.utils.c.r(this.cancel)) {
            arrayList.add("Cancel");
        }
        if (ru.yandex.taxi.design.utils.c.r(this.share)) {
            arrayList.add("ShareRoute");
        }
        if (ru.yandex.taxi.design.utils.c.r(this.makeAnotherOrder)) {
            arrayList.add("AddTaxi");
        }
        if (ru.yandex.taxi.design.utils.c.r(this.safetyCenterButton)) {
            arrayList.add("SafetyCenter");
        }
        LoadingIconCircleButton loadingIconCircleButton = this.candidate;
        if ((loadingIconCircleButton != null && ru.yandex.taxi.design.utils.c.r(loadingIconCircleButton)) || ru.yandex.taxi.design.utils.c.r(this.driver)) {
            arrayList.add("Driver");
        }
        IconCircleButton iconCircleButton = this.transportInfoButton;
        if (iconCircleButton != null && ru.yandex.taxi.design.utils.c.r(iconCircleButton)) {
            arrayList.add("TransportInfo");
        }
        return arrayList;
    }

    public final void hideSafetyCenter() {
        this.safetyCenterButton.setVisibility(8);
    }

    public final void init(fxx0 component) {
        n0g n0gVar = (n0g) component;
        c0g c0gVar = n0gVar.c;
        Context context = (Context) c0gVar.U.get();
        o2y0 o2y0Var = n0gVar.f.a.a;
        q5z.i(o2y0Var);
        zzf zzfVar = n0gVar.b;
        tt2 tt2Var = (tt2) zzfVar.n.get();
        com.yandex.go.taxi.order.repositories.c cVar = (com.yandex.go.taxi.order.repositories.c) zzfVar.bb.get();
        f0g f0gVar = n0gVar.e;
        this.presenter = new p(context, o2y0Var, tt2Var, cVar, f0gVar.v1(), (ba80) zzfVar.wn.get(), (pav) zzfVar.p3.get(), (iup0) c0gVar.mm.get(), (ud80) f0gVar.X2.get(), (p4j) n0gVar.h.get(), f0gVar.s1(), zzfVar.x());
        this.driver.setBackgroundColor(this.iconBackgroundColor);
        this.cancel.setBackgroundColor(this.iconBackgroundColor);
        this.share.setBackgroundColor(this.iconBackgroundColor);
        this.makeAnotherOrder.setBackgroundColor(this.iconBackgroundColor);
        this.safetyCenterButton.setBackgroundColor(this.iconBackgroundColor);
        this.driver.setDebounceClickListener(new yb6(this, 0));
        this.cancel.setDebounceClickListener(new yb6(this, 1));
        this.share.setDebounceClickListener(new yb6(this, 2));
        this.makeAnotherOrder.setDebounceClickListener(new yb6(this, 3));
        this.safetyCenterButton.setDebounceClickListener(new yb6(this, 4));
    }

    public final View makeAnotherOrderButton() {
        return this.makeAnotherOrder;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPresenter().Kg(new ru.yandex.taxi.order.a(this));
    }

    @Override // ru.yandex.taxi.design.CircleButtonsPanelComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getPresenter().Cg();
        super.onDetachedFromWindow();
    }

    public final void setCancelCost(String cost) {
        if (cost == null || evu0.J(cost)) {
            this.cancel.setTitle(getResources().getString(kyh0.order_cancel));
            return;
        }
        this.cancel.setTitle(new SpannableStringBuilder(getResources().getString(kyh0.order_options_cancel_order)).append((CharSequence) "\n").append((CharSequence) qeb1.f(cost, getContext().getColor(mqg0.component_cinnaban_toxic), 1.0f)));
    }

    public final void setCancelEnabled(boolean enabled) {
        this.cancel.setEnabled(enabled);
        this.cancel.setAlpha(enabled ? 1.0f : 0.6f);
    }

    public final void setCancelVisible(boolean visible) {
        this.cancel.setVisibility(visible ? 0 : 8);
    }

    public final void setMakeAnotherOrderVisible(boolean visible) {
        this.makeAnotherOrder.setVisibility(visible ? 0 : 8);
    }

    public final void setPresenter(p pVar) {
        this.presenter = pVar;
    }

    public final void setUiDelegate(a aVar) {
        this.uiDelegate = aVar;
    }

    public final void showSafetyCenter(String title) {
        this.safetyCenterButton.setVisibility(0);
        this.safetyCenterButton.setTitle(title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomCircleButtonsView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BottomCircleButtonsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
