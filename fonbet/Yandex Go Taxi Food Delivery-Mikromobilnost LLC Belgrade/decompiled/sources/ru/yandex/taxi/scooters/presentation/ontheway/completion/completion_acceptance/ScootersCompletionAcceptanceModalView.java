package ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.analytics.ScootersOrderCompletionCardAnalytics$ButtonName;
import com.yandex.go.scooters.utils.a;
import defpackage.ca1;
import defpackage.cma1;
import defpackage.d9n0;
import defpackage.e230;
import defpackage.g0c;
import defpackage.g4b1;
import defpackage.he7;
import defpackage.i2b1;
import defpackage.iws;
import defpackage.jho0;
import defpackage.k47;
import defpackage.k8n0;
import defpackage.lj1;
import defpackage.lq31;
import defpackage.m8n0;
import defpackage.n8n0;
import defpackage.nj1;
import defpackage.ny61;
import defpackage.p5o0;
import defpackage.pav;
import defpackage.pfh0;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qrh0;
import defpackage.r7p0;
import defpackage.r8n0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.u8n0;
import defpackage.uiy0;
import defpackage.uyj;
import defpackage.v8n0;
import defpackage.viy0;
import defpackage.w8n0;
import defpackage.wnn0;
import defpackage.xnn0;
import defpackage.y8n0;
import defpackage.z2v0;
import defpackage.zuo0;
import defpackage.zxs;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptanceModalView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017BY\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0014¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J%\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010)0(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/completion_acceptance/ScootersCompletionAcceptanceModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ln8n0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lp5o0;", "orderCompletionCardAnalytics", "Ljho0;", "photoOfDamageCardAnalytics", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "Lkotlin/Function0;", "Lzy11;", "onDoneClick", "Lr7p0;", "vehicleNumber", "Lr8n0;", "scootersCompletionAcceptancePresenter", "<init>", "(Landroid/content/Context;Lpav;Lp5o0;Ljho0;Ljava/lang/String;Lsls;Lr7p0;Lr8n0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln8n0;", "Le230;", "insetsType", "()Le230;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Llq31;", "eventType", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lp5o0;", "Ljho0;", "Ljava/lang/String;", "Lsls;", "Lr7p0;", "Lr8n0;", "onBackListener", "Ljava/lang/Runnable;", "Lk8n0;", "itemsAdapter", "Lk8n0;", "m8n0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCompletionAcceptanceModalView extends SlideableBindingModalView<n8n0> {
    public static final int $stable = 8;
    private final k8n0 itemsAdapter;
    private Runnable onBackListener;
    private final sls onDoneClick;
    private final p5o0 orderCompletionCardAnalytics;
    private final String orderId;
    private final jho0 photoOfDamageCardAnalytics;
    private final r8n0 scootersCompletionAcceptancePresenter;
    private final r7p0 vehicleNumber;

    public ScootersCompletionAcceptanceModalView(Context context, pav pavVar, p5o0 p5o0Var, jho0 jho0Var, String str, sls slsVar, r7p0 r7p0Var, r8n0 r8n0Var) {
        super(context);
        this.orderCompletionCardAnalytics = p5o0Var;
        this.photoOfDamageCardAnalytics = jho0Var;
        this.orderId = str;
        this.onDoneClick = slsVar;
        this.vehicleNumber = r7p0Var;
        this.scootersCompletionAcceptancePresenter = r8n0Var;
        int i = ca1.g0;
        g0c a = qoi0.a(u8n0.class);
        lj1 lj1Var = new lj1(context, 15);
        iws iwsVar = new iws(24);
        Class a2 = a.a();
        final int i2 = 1;
        he7 he7Var = new he7(1, iwsVar);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, lj1Var, emptyList, he7Var, null);
        int i3 = viy0.V;
        g0c a3 = qoi0.a(w8n0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new z2v0(context, 5), emptyList, new he7(1, new uiy0(12)), null);
        int i4 = nj1.Z;
        g0c a4 = qoi0.a(v8n0.class);
        k8n0 k8n0Var = new k8n0(scc.g(zxsVar, zxsVar2, new zxs(a4.a(), 0, new lj1(context, 16), emptyList, new he7(1, new k47(pavVar, i2)), null)));
        this.itemsAdapter = k8n0Var;
        final int i5 = 0;
        qdb1.b(this, new Runnable(this) { // from class: l8n0
            public final /* synthetic */ ScootersCompletionAcceptanceModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i5;
                ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView = this.b;
                switch (i6) {
                    case 0:
                        ScootersCompletionAcceptanceModalView._init_$lambda$0(scootersCompletionAcceptanceModalView);
                        break;
                    case 1:
                        ScootersCompletionAcceptanceModalView.lambda$1$0(scootersCompletionAcceptanceModalView);
                        break;
                    default:
                        ScootersCompletionAcceptanceModalView.lambda$1$1(scootersCompletionAcceptanceModalView);
                        break;
                }
            }
        });
        n8n0 binding = getBinding();
        binding.e.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView = binding.e;
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(k8n0Var);
        binding.c.setDebounceClickListener(new Runnable(this) { // from class: l8n0
            public final /* synthetic */ ScootersCompletionAcceptanceModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i6 = i2;
                ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView = this.b;
                switch (i6) {
                    case 0:
                        ScootersCompletionAcceptanceModalView._init_$lambda$0(scootersCompletionAcceptanceModalView);
                        break;
                    case 1:
                        ScootersCompletionAcceptanceModalView.lambda$1$0(scootersCompletionAcceptanceModalView);
                        break;
                    default:
                        ScootersCompletionAcceptanceModalView.lambda$1$1(scootersCompletionAcceptanceModalView);
                        break;
                }
            }
        });
        ButtonComponent buttonComponent = binding.d;
        final int i6 = 2;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: l8n0
            public final /* synthetic */ ScootersCompletionAcceptanceModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i62 = i6;
                ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView = this.b;
                switch (i62) {
                    case 0:
                        ScootersCompletionAcceptanceModalView._init_$lambda$0(scootersCompletionAcceptanceModalView);
                        break;
                    case 1:
                        ScootersCompletionAcceptanceModalView.lambda$1$0(scootersCompletionAcceptanceModalView);
                        break;
                    default:
                        ScootersCompletionAcceptanceModalView.lambda$1$1(scootersCompletionAcceptanceModalView);
                        break;
                }
            }
        });
        g4b1.c(getBinding().b, getBinding().e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView) {
        Runnable runnable = scootersCompletionAcceptanceModalView.onBackListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$0(ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView) {
        scootersCompletionAcceptanceModalView.orderCompletionCardAnalytics.a(ScootersOrderCompletionCardAnalytics$ButtonName.Done, scootersCompletionAcceptanceModalView.orderId);
        scootersCompletionAcceptanceModalView.onDoneClick.invoke();
        scootersCompletionAcceptanceModalView.photoOfDamageCardAnalytics.a(scootersCompletionAcceptanceModalView.orderId, scootersCompletionAcceptanceModalView.vehicleNumber.a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$1(ScootersCompletionAcceptanceModalView scootersCompletionAcceptanceModalView) {
        scootersCompletionAcceptanceModalView.orderCompletionCardAnalytics.a(ScootersOrderCompletionCardAnalytics$ButtonName.OpenLock, scootersCompletionAcceptanceModalView.orderId);
        r8n0 r8n0Var = scootersCompletionAcceptanceModalView.scootersCompletionAcceptancePresenter;
        tje.N(r8n0Var.Jg(), null, null, new ScootersCompletionAcceptancePresenter$openLock$1(r8n0Var, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public n8n0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_completion_acceptance_modal_view, parent, false);
        int i = pfh0.bottom_buttons_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
        if (goLinearLayout != null) {
            i = pfh0.done;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = pfh0.open_lock;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = pfh0.rv;
                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                    if (recyclerView != null) {
                        return new n8n0((GoFrameLayout) inflate, goLinearLayout, buttonComponent, buttonComponent2, recyclerView);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return b.l(new Pair("scooter_number", this.vehicleNumber), new Pair("order_id", this.orderId));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return i2b1.b(this, getBinding().b, getBinding().e);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r8n0 r8n0Var = this.scootersCompletionAcceptancePresenter;
        m8n0 m8n0Var = new m8n0(this);
        r8n0Var.Bg(m8n0Var);
        y8n0 y8n0Var = r8n0Var.y;
        zuo0 zuo0Var = r8n0Var.A;
        d9n0 d9n0Var = r8n0Var.B;
        tpr a = y8n0Var.b.a();
        xnn0 xnn0Var = y8n0Var.d;
        wnn0.Companion.getClass();
        tpr t = e.t(new m0(a, a.a(xnn0Var, wnn0.e), new ScootersCompletionAcceptanceUiStateInteractor$uiStateFlow$1(y8n0Var, d9n0Var, zuo0Var, null)));
        y8n0Var.a.getClass();
        tje.N(r8n0Var.Jg(), null, null, new ScootersCompletionAcceptancePresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, m8n0Var), 3);
        setAnalyticsContext(createAnalyticsContext("ScootersOrderCompletionCard", new LinkedHashSet()));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scootersCompletionAcceptancePresenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackListener = onBackPressedListener;
    }
}
