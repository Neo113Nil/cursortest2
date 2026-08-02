package ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.analytics.ScootersRideCardAnalytics$CardState;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ahn0;
import defpackage.aki0;
import defpackage.bys;
import defpackage.c1o0;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.cuz;
import defpackage.d1o0;
import defpackage.e1o0;
import defpackage.ehn0;
import defpackage.f1o0;
import defpackage.f3x;
import defpackage.ffn0;
import defpackage.g1o0;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h1o0;
import defpackage.hes0;
import defpackage.hhn0;
import defpackage.i1o0;
import defpackage.i3y;
import defpackage.ifn0;
import defpackage.j3x;
import defpackage.jfn0;
import defpackage.jl40;
import defpackage.kfn0;
import defpackage.lbb0;
import defpackage.mfn0;
import defpackage.mgn0;
import defpackage.mrg0;
import defpackage.nso0;
import defpackage.ny61;
import defpackage.ofn0;
import defpackage.pav;
import defpackage.pfh0;
import defpackage.pfn0;
import defpackage.qje;
import defpackage.qke;
import defpackage.qrh0;
import defpackage.scc;
import defpackage.six;
import defpackage.sls;
import defpackage.t7l0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.uwh0;
import defpackage.vam0;
import defpackage.ven0;
import defpackage.vtz;
import defpackage.wen0;
import defpackage.wls;
import defpackage.wxs;
import defpackage.wys;
import defpackage.xen0;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.y2b1;
import defpackage.zno0;
import defpackage.zuo0;
import defpackage.zxs;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderV2ModalView;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.ScootersNewControlPanelView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.progress.SpinnerProgressBar;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0017'LMNB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0015\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u001b\u0010%\u001a\u00020\u0013*\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010)\u001a\u00020\u0013*\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u0013*\u00020\u001f2\u0006\u0010+\u001a\u00020#H\u0002¢\u0006\u0004\b,\u0010&J\u001d\u0010/\u001a\u00020\u00132\f\u0010.\u001a\b\u0012\u0004\u0012\u00020#0-H\u0002¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00132\f\u00101\u001a\b\u0012\u0004\u0012\u00020#0-H\u0002¢\u0006\u0004\b2\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00106R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010:R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010;R$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R*\u0010@\u001a\u0016\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u0013\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR#\u0010H\u001a\n\u0012\u0006\b\u0000\u0012\u00020C0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR#\u0010K\u001a\n\u0012\u0006\b\u0000\u0012\u00020C0B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010G¨\u0006O"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpav;", "imageLoader", "Lpfn0;", "analytics", "Lzno0;", "promotionAnalytics", "Lkotlin/Function1;", "Ljfn0;", "Lzy11;", "onPromoPlateShown", "init", "(Lpav;Lpfn0;Lzno0;Ltls;)V", "Lf1o0;", "onActionButtonClickListener", "setOnActionButtonClickListener", "(Lf1o0;)V", "Lahn0;", Constants.KEY_DATA, "updateState", "(Lahn0;)V", "Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;", "createNewTopActionButtonHorizontal", "()Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;", "createNewTopActionButtonVertical", "Lmgn0;", "action", "bindNewTopActionButtonHorizontal", "(Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;Lmgn0;)V", "Lg1o0;", "actionWrapper", "bindNewTopActionButtonVertical", "(Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;Lg1o0;)V", "progressableAction", "bindNewTopActionButton", "", "newTopActions", "updateTopActions", "(Ljava/util/List;)V", "newRemainingActions", "updateRemainingActions", "Li1o0;", "binding", "Li1o0;", "Lpav;", "Lpfn0;", "scootersPromotionsAnalytics", "Lzno0;", "Ltls;", "Lf1o0;", "Lkfn0;", "onActionButtonClickListenerDecorator", "Lkotlin/Function2;", "", "onActionToggleClickListenerDecorator", "Lwls;", "Lbys;", "", "topButtonsRvAdapter$delegate", "Li3y;", "getTopButtonsRvAdapter", "()Lbys;", "topButtonsRvAdapter", "remainingButtonsRvAdapter$delegate", "getRemainingButtonsRvAdapter", "remainingButtonsRvAdapter", "NewTopActionButton", "d1o0", "e1o0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersNewControlPanelView extends GoLinearLayout {
    public static final int $stable = 8;
    private pfn0 analytics;
    private final i1o0 binding;
    private pav imageLoader;
    private f1o0 onActionButtonClickListener;
    private tls onActionButtonClickListenerDecorator;
    private wls onActionToggleClickListenerDecorator;
    private tls onPromoPlateShown;

    /* renamed from: remainingButtonsRvAdapter$delegate, reason: from kotlin metadata */
    private final i3y remainingButtonsRvAdapter;
    private zno0 scootersPromotionsAnalytics;

    /* renamed from: topButtonsRvAdapter$delegate, reason: from kotlin metadata */
    private final i3y topButtonsRvAdapter;

    public ScootersNewControlPanelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(qrh0.scooters_new_control_panel_view, this);
        int i3 = pfh0.remaining_buttons_rv;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i3, this);
        if (recyclerView != null) {
            i3 = pfh0.top_buttons_rv;
            RecyclerView recyclerView2 = (RecyclerView) cma1.O(i3, this);
            if (recyclerView2 != null) {
                this.binding = new i1o0(this, recyclerView, recyclerView2);
                setOrientation(1);
                recyclerView.setItemAnimator(null);
                recyclerView.setNestedScrollingEnabled(false);
                recyclerView2.setItemAnimator(null);
                tmm0 tmm0Var = new tmm0(25, context, this);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                this.topButtonsRvAdapter = kotlin.a.b(lazyThreadSafetyMode, tmm0Var);
                this.remainingButtonsRvAdapter = kotlin.a.b(lazyThreadSafetyMode, new ehn0(10, this));
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
        throw null;
    }

    private final void bindNewTopActionButton(NewTopActionButton newTopActionButton, mgn0 mgn0Var) {
        newTopActionButton.setAction(mgn0Var, new c1o0(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindNewTopActionButton$lambda$0(ScootersNewControlPanelView scootersNewControlPanelView, kfn0 kfn0Var) {
        tls tlsVar = scootersNewControlPanelView.onActionButtonClickListenerDecorator;
        if (tlsVar != null) {
            tlsVar.invoke(kfn0Var);
        }
        return zy11.a;
    }

    private final void bindNewTopActionButtonHorizontal(NewTopActionButton newTopActionButton, mgn0 mgn0Var) {
        bindNewTopActionButton(newTopActionButton, mgn0Var);
    }

    private final void bindNewTopActionButtonVertical(NewTopActionButton newTopActionButton, g1o0 g1o0Var) {
        bindNewTopActionButton(newTopActionButton, g1o0Var.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewTopActionButton createNewTopActionButtonHorizontal() {
        return new NewTopActionButton(getContext(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewTopActionButton createNewTopActionButtonVertical() {
        return new NewTopActionButton(getContext(), 1);
    }

    private final bys getRemainingButtonsRvAdapter() {
        return (bys) this.remainingButtonsRvAdapter.getValue();
    }

    private final bys getTopButtonsRvAdapter() {
        return (bys) this.topButtonsRvAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bys remainingButtonsRvAdapter_delegate$lambda$0(ScootersNewControlPanelView scootersNewControlPanelView) {
        RecyclerView recyclerView = scootersNewControlPanelView.binding.b;
        j3x j3xVar = new j3x();
        remainingButtonsRvAdapter_delegate$lambda$0$0(scootersNewControlPanelView, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        return bysVar;
    }

    private static final zy11 remainingButtonsRvAdapter_delegate$lambda$0$0(ScootersNewControlPanelView scootersNewControlPanelView, j3x j3xVar) {
        int i = qrh0.scooters_ontheway_action_list_item;
        j3xVar.getClass();
        j3xVar.a.add(new zxs(mgn0.class, i, new c1o0(scootersNewControlPanelView, 2)));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wys remainingButtonsRvAdapter_delegate$lambda$0$0$0(ScootersNewControlPanelView scootersNewControlPanelView, View view) {
        return new g((ListItemComponent) view, scootersNewControlPanelView.imageLoader, scootersNewControlPanelView.scootersPromotionsAnalytics, new c1o0(scootersNewControlPanelView, 0), new c1o0(scootersNewControlPanelView, 1), new lbb0(29, scootersNewControlPanelView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 remainingButtonsRvAdapter_delegate$lambda$0$0$0$0(ScootersNewControlPanelView scootersNewControlPanelView, jfn0 jfn0Var) {
        tls tlsVar = scootersNewControlPanelView.onPromoPlateShown;
        if (tlsVar != null) {
            tlsVar.invoke(jfn0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 remainingButtonsRvAdapter_delegate$lambda$0$0$0$1(ScootersNewControlPanelView scootersNewControlPanelView, kfn0 kfn0Var) {
        tls tlsVar = scootersNewControlPanelView.onActionButtonClickListenerDecorator;
        if (tlsVar != null) {
            tlsVar.invoke(kfn0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 remainingButtonsRvAdapter_delegate$lambda$0$0$0$2(ScootersNewControlPanelView scootersNewControlPanelView, kfn0 kfn0Var, boolean z) {
        wls wlsVar = scootersNewControlPanelView.onActionToggleClickListenerDecorator;
        if (wlsVar != null) {
            wlsVar.invoke(kfn0Var, Boolean.valueOf(z));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bys topButtonsRvAdapter_delegate$lambda$0(Context context, ScootersNewControlPanelView scootersNewControlPanelView) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 12);
        scootersNewControlPanelView.binding.c.addItemDecoration(new e1o0(tje.u(8, scootersNewControlPanelView.getContext())));
        RecyclerView recyclerView = scootersNewControlPanelView.binding.c;
        j3x j3xVar = new j3x();
        topButtonsRvAdapter_delegate$lambda$0$0(gridLayoutManager, scootersNewControlPanelView, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        gridLayoutManager.h0 = new d1o0(bysVar);
        bysVar.registerAdapterDataObserver(new h1o0(gridLayoutManager, scootersNewControlPanelView));
        return bysVar;
    }

    private static final zy11 topButtonsRvAdapter_delegate$lambda$0$0(GridLayoutManager gridLayoutManager, final ScootersNewControlPanelView scootersNewControlPanelView, j3x j3xVar) {
        j3xVar.b = gridLayoutManager;
        final int i = 0;
        aki0.b(new f3x(mgn0.class, j3xVar, new ScootersNewControlPanelView$topButtonsRvAdapter$2$adapter$1$1(0, scootersNewControlPanelView, ScootersNewControlPanelView.class, "createNewTopActionButtonHorizontal", "createNewTopActionButtonHorizontal()Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;", 0)), new wls(scootersNewControlPanelView) { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.b
            public final /* synthetic */ ScootersNewControlPanelView b;

            {
                this.b = scootersNewControlPanelView;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 zy11Var;
                zy11 zy11Var2;
                ScootersNewControlPanelView.NewTopActionButton newTopActionButton = (ScootersNewControlPanelView.NewTopActionButton) obj;
                switch (i) {
                    case 0:
                        zy11Var = ScootersNewControlPanelView.topButtonsRvAdapter_delegate$lambda$0$0$0(this.b, newTopActionButton, (mgn0) obj2);
                        return zy11Var;
                    default:
                        zy11Var2 = ScootersNewControlPanelView.topButtonsRvAdapter_delegate$lambda$0$0$1(this.b, newTopActionButton, (g1o0) obj2);
                        return zy11Var2;
                }
            }
        });
        final int i2 = 1;
        aki0.b(new f3x(g1o0.class, j3xVar, new ScootersNewControlPanelView$topButtonsRvAdapter$2$adapter$1$3(0, scootersNewControlPanelView, ScootersNewControlPanelView.class, "createNewTopActionButtonVertical", "createNewTopActionButtonVertical()Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;", 0)), new wls(scootersNewControlPanelView) { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.b
            public final /* synthetic */ ScootersNewControlPanelView b;

            {
                this.b = scootersNewControlPanelView;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 zy11Var;
                zy11 zy11Var2;
                ScootersNewControlPanelView.NewTopActionButton newTopActionButton = (ScootersNewControlPanelView.NewTopActionButton) obj;
                switch (i2) {
                    case 0:
                        zy11Var = ScootersNewControlPanelView.topButtonsRvAdapter_delegate$lambda$0$0$0(this.b, newTopActionButton, (mgn0) obj2);
                        return zy11Var;
                    default:
                        zy11Var2 = ScootersNewControlPanelView.topButtonsRvAdapter_delegate$lambda$0$0$1(this.b, newTopActionButton, (g1o0) obj2);
                        return zy11Var2;
                }
            }
        });
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 topButtonsRvAdapter_delegate$lambda$0$0$0(ScootersNewControlPanelView scootersNewControlPanelView, NewTopActionButton newTopActionButton, mgn0 mgn0Var) {
        scootersNewControlPanelView.bindNewTopActionButtonHorizontal(newTopActionButton, mgn0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 topButtonsRvAdapter_delegate$lambda$0$0$1(ScootersNewControlPanelView scootersNewControlPanelView, NewTopActionButton newTopActionButton, g1o0 g1o0Var) {
        scootersNewControlPanelView.bindNewTopActionButtonVertical(newTopActionButton, g1o0Var);
        return zy11.a;
    }

    private final void updateRemainingActions(List<mgn0> newRemainingActions) {
        if (jl40.l(getRemainingButtonsRvAdapter().x.f, newRemainingActions)) {
            return;
        }
        getRemainingButtonsRvAdapter().submitList(newRemainingActions, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateState$lambda$0(ScootersNewControlPanelView scootersNewControlPanelView, ahn0 ahn0Var, kfn0 kfn0Var) {
        nso0 nso0Var;
        f1o0 f1o0Var = scootersNewControlPanelView.onActionButtonClickListener;
        if (f1o0Var != null) {
            ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = ((hhn0) f1o0Var).a;
            nso0Var = scootersDetailedOrderV2ModalView.scootersRideCardAnalytics;
            String str = ahn0Var.d.getNumber().a;
            String str2 = kfn0Var.c;
            zuo0 zuo0Var = ahn0Var.d;
            String status = y2b1.b(zuo0Var).getStatus();
            ScootersRideCardAnalytics$CardState scootersRideCardAnalytics$CardState = ScootersRideCardAnalytics$CardState.Detailed;
            String m = zuo0Var.m();
            nso0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button_name", str2);
            if (m != null) {
                hashMap.put("order_id", m);
            }
            if (str != null) {
                hashMap.put("scooter_number", str);
            }
            if (scootersRideCardAnalytics$CardState != null) {
                hashMap.put(ClidProvider.STATE, scootersRideCardAnalytics$CardState.getEventValue());
            }
            if (status != null) {
                hashMap.put(ACSPConstants.STATUS, status);
            }
            nso0Var.a.a("ScootersRideCard.Tapped", hashMap, 1, new HashMap());
            scootersDetailedOrderV2ModalView.onActionClicked(kfn0Var, ahn0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateState$lambda$1(ScootersNewControlPanelView scootersNewControlPanelView, ahn0 ahn0Var, kfn0 kfn0Var, boolean z) {
        nso0 nso0Var;
        f1o0 f1o0Var = scootersNewControlPanelView.onActionButtonClickListener;
        if (f1o0Var != null) {
            ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = ((hhn0) f1o0Var).a;
            nso0Var = scootersDetailedOrderV2ModalView.scootersRideCardAnalytics;
            String str = ahn0Var.d.getNumber().a;
            String str2 = kfn0Var.c;
            zuo0 zuo0Var = ahn0Var.d;
            String status = y2b1.b(zuo0Var).getStatus();
            ScootersRideCardAnalytics$CardState scootersRideCardAnalytics$CardState = ScootersRideCardAnalytics$CardState.Detailed;
            String m = zuo0Var.m();
            Boolean valueOf = Boolean.valueOf(z);
            nso0Var.getClass();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("scooter_number", str);
            }
            hashMap.put("button_name", str2);
            if (status != null) {
                hashMap.put(ACSPConstants.STATUS, status);
            }
            if (m != null) {
                hashMap.put("order_id", m);
            }
            if (scootersRideCardAnalytics$CardState != null) {
                hashMap.put(ClidProvider.STATE, scootersRideCardAnalytics$CardState.getEventValue());
            }
            nso0Var.a.a("ScootersRideCard.Toggle.Tapped", hashMap, 1, g8e.v(hashMap, "new_value", valueOf));
            scootersDetailedOrderV2ModalView.onActionToggleClicked(zuo0Var, kfn0Var, z);
        }
        return zy11.a;
    }

    private final void updateTopActions(List<mgn0> newTopActions) {
        ListBuilder listBuilder = new ListBuilder(newTopActions.size());
        int f = scc.f(newTopActions);
        int size = newTopActions.size();
        for (int i = 0; i < size; i++) {
            int size2 = newTopActions.size();
            if (size2 == 1) {
                listBuilder.add(newTopActions.get(f));
            } else if (size2 == 2) {
                listBuilder.add(new g1o0(newTopActions.get(i)));
            } else if (size2 != 3 && size2 != 4) {
                listBuilder.add(new g1o0(newTopActions.get(i)));
            } else if (i < f) {
                listBuilder.add(new g1o0(newTopActions.get(i)));
            } else {
                listBuilder.add(newTopActions.get(f));
            }
        }
        getTopButtonsRvAdapter().submitList(listBuilder.j(), null);
    }

    public final void init(pav imageLoader, pfn0 analytics, zno0 promotionAnalytics, tls onPromoPlateShown) {
        this.imageLoader = imageLoader;
        this.analytics = analytics;
        this.scootersPromotionsAnalytics = promotionAnalytics;
        this.onPromoPlateShown = onPromoPlateShown;
    }

    public final void setOnActionButtonClickListener(f1o0 onActionButtonClickListener) {
        this.onActionButtonClickListener = onActionButtonClickListener;
    }

    public final void updateState(ahn0 data) {
        updateTopActions(data.c.a);
        updateRemainingActions(data.c.b);
        this.onActionButtonClickListenerDecorator = new vam0(20, this, data);
        this.onActionToggleClickListenerDecorator = new t7l0(23, this, data);
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u000bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u0004*\u00020\u000bH\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0004*\u00020\u000bH\u0003¢\u0006\u0004\b\u001d\u0010\u0018J)\u0010\u001e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\f2\b\b\u0001\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%J!\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010'J\u0017\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\f2\b\b\u0001\u0010#\u001a\u00020\u0004¢\u0006\u0004\b,\u0010%J\u0017\u0010.\u001a\u00020\f2\b\b\u0001\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010%J\u0017\u00100\u001a\u00020\f2\b\b\u0001\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u0010%J=\u00105\u001a\u00020\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\f¢\u0006\u0004\b7\u0010\u0016J\u001f\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001a2\b\b\u0001\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010C¨\u0006L"}, d2 = {"Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "", "contentOrientation", "<init>", "(Landroid/content/Context;I)V", "Lmgn0;", "progressableAction", "Lkotlin/Function1;", "Lkfn0;", "Lzy11;", "onClick", "applyAction", "(Lmgn0;Ltls;)V", "Lofn0;", "scootersDetailedOrderActionImage", "tintColor", "setImage", "(Lru/yandex/taxi/scooters/presentation/detailed_order/v2/components/actions/ScootersNewControlPanelView$NewTopActionButton;Lofn0;I)V", "applyAnimationTint", "()V", "titleColor", "(Lkfn0;)I", "imageColor", "", "isSpecialTitleColorForDarkTheme", "(Lkfn0;)Z", "colorInt", "setAction", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "color", "setBackgroundColor", "(I)V", "drawableRes", "(II)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "setTitleTextColor", "dimenId", "setTitleTextSize", "animationRes", "setAnimation", "start", "top", "end", "bottom", "setAnimationViewMargins", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "playAnimation", BackendConfig.Restrictions.ENABLED, "setProgress", "(ZI)V", "currentAction", "Lmgn0;", "currentOnClick", "Ltls;", CA20Status.STATUS_USER_I, "Li3y;", "Lcom/airbnb/lottie/LottieAnimationView;", "lottiViewLazy", "Li3y;", "Lcom/yandex/go/design/view/GoImageView;", "imageView", "Lcom/yandex/go/design/view/GoImageView;", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/widget/progress/SpinnerProgressBar;", "progressBarLazy", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NewTopActionButton extends GoLinearLayout {
        private mgn0 currentAction;
        private tls currentOnClick;
        private int imageColor;
        private final GoImageView imageView;
        private final i3y lottiViewLazy;
        private final i3y progressBarLazy;
        private final RobotoTextView textView;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public NewTopActionButton(final Context context, int i) {
            super(context, null, 0, r4, 14, r6);
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i2 = 0;
            final int i3 = 0;
            sls slsVar = new sls() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.c
                @Override // defpackage.sls
                public final Object invoke() {
                    LottieAnimationView lottiViewLazy$lambda$0;
                    SpinnerProgressBar progressBarLazy$lambda$0;
                    int i4 = i3;
                    Context context2 = context;
                    switch (i4) {
                        case 0:
                            lottiViewLazy$lambda$0 = ScootersNewControlPanelView.NewTopActionButton.lottiViewLazy$lambda$0(context2);
                            return lottiViewLazy$lambda$0;
                        default:
                            progressBarLazy$lambda$0 = ScootersNewControlPanelView.NewTopActionButton.progressBarLazy$lambda$0(context2);
                            return progressBarLazy$lambda$0;
                    }
                }
            };
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.lottiViewLazy = kotlin.a.b(lazyThreadSafetyMode, slsVar);
            int u = tje.u(20, getContext());
            int u2 = tje.u(20, getContext());
            int i4 = 6;
            AttributeSet attributeSet = null;
            GoImageView goImageView = new GoImageView(context, attributeSet, i2, i4, defaultConstructorMarker);
            goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(u, u2));
            this.imageView = goImageView;
            RobotoTextView robotoTextView = new RobotoTextView(context, attributeSet, i2, i4, defaultConstructorMarker);
            robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            robotoTextView.setGravity(17);
            robotoTextView.setTextTypeface(5);
            this.textView = robotoTextView;
            final int i5 = 1;
            this.progressBarLazy = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.c
                @Override // defpackage.sls
                public final Object invoke() {
                    LottieAnimationView lottiViewLazy$lambda$0;
                    SpinnerProgressBar progressBarLazy$lambda$0;
                    int i42 = i5;
                    Context context2 = context;
                    switch (i42) {
                        case 0:
                            lottiViewLazy$lambda$0 = ScootersNewControlPanelView.NewTopActionButton.lottiViewLazy$lambda$0(context2);
                            return lottiViewLazy$lambda$0;
                        default:
                            progressBarLazy$lambda$0 = ScootersNewControlPanelView.NewTopActionButton.progressBarLazy$lambda$0(context2);
                            return progressBarLazy$lambda$0;
                    }
                }
            });
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setOrientation(i);
            setGravity(17);
            setMinimumHeight(tje.u(56, getContext()));
            setTitleTextSize(mrg0.component_text_size_caption);
            if (i == 0) {
                xw31.F(goImageView, null, null, Integer.valueOf(tje.u(5, getContext())), null);
            }
            addView(goImageView);
            addView(robotoTextView);
            setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(16, getContext())));
            setClipToOutline(true);
        }

        private final void applyAction(mgn0 progressableAction, final tls onClick) {
            final kfn0 kfn0Var = progressableAction.a;
            boolean z = progressableAction.b;
            int titleColor = titleColor(kfn0Var);
            this.textView.setVisibility(0);
            this.imageView.setVisibility(0);
            setTitle(kfn0Var.b);
            setTitleTextColor(titleColor);
            setImage(this, kfn0Var.a, imageColor(kfn0Var));
            setBackgroundColor(colorInt(kfn0Var));
            if (kfn0Var instanceof ifn0) {
                this.imageView.setVisibility(8);
                setAnimation(uwh0.scooters_where_is_animation);
                setAnimationViewMargins$default(this, Integer.valueOf(tje.u(1, getContext())), null, null, null, 14, null);
                ru.yandex.taxi.design.utils.c.z(new sls() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.d
                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 applyAction$lambda$0;
                        applyAction$lambda$0 = ScootersNewControlPanelView.NewTopActionButton.applyAction$lambda$0(ScootersNewControlPanelView.NewTopActionButton.this, onClick, kfn0Var);
                        return applyAction$lambda$0;
                    }
                }, this);
            } else {
                setAnimation(0);
                setAnimationViewMargins$default(this, 0, null, null, null, 14, null);
                ru.yandex.taxi.design.utils.c.z(new sls() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.e
                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 applyAction$lambda$1;
                        applyAction$lambda$1 = ScootersNewControlPanelView.NewTopActionButton.applyAction$lambda$1(tls.this, kfn0Var);
                        return applyAction$lambda$1;
                    }
                }, this);
            }
            if (z) {
                this.imageView.setVisibility(8);
                this.textView.setVisibility(8);
            }
            setProgress(z, titleColor);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zy11 applyAction$lambda$0(NewTopActionButton newTopActionButton, tls tlsVar, kfn0 kfn0Var) {
            newTopActionButton.playAnimation();
            qke.E(newTopActionButton.getContext(), HapticController$Effect.BZZ, false, 12);
            tlsVar.invoke(kfn0Var);
            return zy11.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final zy11 applyAction$lambda$1(tls tlsVar, kfn0 kfn0Var) {
            tlsVar.invoke(kfn0Var);
            return zy11.a;
        }

        private final void applyAnimationTint() {
            if (this.lottiViewLazy.isInitialized()) {
                ((LottieAnimationView) this.lottiViewLazy.getValue()).addValueCallback(new six("**"), (six) cuz.I, new hes0() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.components.actions.f
                    @Override // defpackage.hes0
                    public final ColorFilter a(vtz vtzVar) {
                        ColorFilter applyAnimationTint$lambda$0;
                        applyAnimationTint$lambda$0 = ScootersNewControlPanelView.NewTopActionButton.applyAnimationTint$lambda$0(ScootersNewControlPanelView.NewTopActionButton.this, vtzVar);
                        return applyAnimationTint$lambda$0;
                    }
                });
                ((LottieAnimationView) this.lottiViewLazy.getValue()).invalidate();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ColorFilter applyAnimationTint$lambda$0(NewTopActionButton newTopActionButton, vtz vtzVar) {
            return new PorterDuffColorFilter(newTopActionButton.imageColor, PorterDuff.Mode.SRC_ATOP);
        }

        private final int colorInt(kfn0 kfn0Var) {
            Integer num = kfn0Var.f;
            if (num == null) {
                return qje.t(kfn0Var.d, getContext());
            }
            return getContext().getColor(num.intValue());
        }

        private final int imageColor(kfn0 kfn0Var) {
            return titleColor(kfn0Var);
        }

        private final boolean isSpecialTitleColorForDarkTheme(kfn0 kfn0Var) {
            return ((kfn0Var instanceof wen0) || (kfn0Var instanceof ven0)) ? kfn0Var.h : (kfn0Var instanceof ffn0) || (kfn0Var instanceof xen0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LottieAnimationView lottiViewLazy$lambda$0(Context context) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            lottieAnimationView.setLayoutParams(new LinearLayout.LayoutParams(tje.u(20, lottieAnimationView.getContext()), tje.u(20, lottieAnimationView.getContext())));
            return lottieAnimationView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SpinnerProgressBar progressBarLazy$lambda$0(Context context) {
            SpinnerProgressBar spinnerProgressBar = new SpinnerProgressBar(context, null, 0, 0, 14, null);
            spinnerProgressBar.setLayoutParams(new LinearLayout.LayoutParams(tje.u(24, spinnerProgressBar.getContext()), tje.u(24, spinnerProgressBar.getContext())));
            return spinnerProgressBar;
        }

        public static /* synthetic */ void setAnimationViewMargins$default(NewTopActionButton newTopActionButton, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                num2 = null;
            }
            if ((i & 4) != 0) {
                num3 = null;
            }
            if ((i & 8) != 0) {
                num4 = null;
            }
            newTopActionButton.setAnimationViewMargins(num, num2, num3, num4);
        }

        private final int titleColor(kfn0 kfn0Var) {
            return isSpecialTitleColorForDarkTheme(kfn0Var) ? qje.t(xng0.textOnControl, getContext()) : qje.t(xng0.textMain, getContext());
        }

        @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
        public void applyTheme(ThemeType themeType) {
            tls tlsVar;
            super.applyTheme(themeType);
            mgn0 mgn0Var = this.currentAction;
            if (mgn0Var == null || (tlsVar = this.currentOnClick) == null) {
                return;
            }
            applyAction(mgn0Var, tlsVar);
        }

        public final void playAnimation() {
            if (this.lottiViewLazy.isInitialized() && ((View) this.lottiViewLazy.getValue()).getVisibility() == 0) {
                ((LottieAnimationView) this.lottiViewLazy.getValue()).playAnimation();
            }
        }

        public final void setAction(mgn0 progressableAction, tls onClick) {
            this.currentAction = progressableAction;
            this.currentOnClick = onClick;
            applyAction(progressableAction, onClick);
        }

        public final void setAnimation(int animationRes) {
            i3y i3yVar = this.lottiViewLazy;
            if (animationRes == 0) {
                if (i3yVar.isInitialized()) {
                    ((LottieAnimationView) this.lottiViewLazy.getValue()).cancelAnimation();
                    ((View) this.lottiViewLazy.getValue()).setVisibility(8);
                    return;
                }
                return;
            }
            if (!i3yVar.isInitialized()) {
                addView((View) this.lottiViewLazy.getValue(), 0);
            }
            ((View) this.lottiViewLazy.getValue()).setVisibility(0);
            ((LottieAnimationView) this.lottiViewLazy.getValue()).setAnimation(animationRes);
            applyAnimationTint();
        }

        public final void setAnimationViewMargins(Integer start, Integer top, Integer end, Integer bottom) {
            if (this.lottiViewLazy.isInitialized()) {
                xw31.F((View) this.lottiViewLazy.getValue(), start, top, end, bottom);
            }
        }

        @Override // com.yandex.go.design.view.GoLinearLayout, android.view.View
        public void setBackgroundColor(int color) {
            setBackgroundDrawable(new RippleDrawable(gtq0.e(qje.t(xng0.controlPressed, getContext())), new ColorDrawable(color), null));
        }

        public final void setImage(int drawableRes, int tintColor) {
            this.imageColor = tintColor;
            applyAnimationTint();
            GoImageView goImageView = this.imageView;
            Drawable c0 = tje.c0(drawableRes, getContext());
            if (c0 != null) {
                c0.setTint(tintColor);
            } else {
                c0 = null;
            }
            goImageView.setImageDrawable(c0);
        }

        public final void setProgress(boolean enabled, int tintColor) {
            i3y i3yVar = this.progressBarLazy;
            if (!enabled) {
                if (i3yVar.isInitialized()) {
                    ((View) this.progressBarLazy.getValue()).setVisibility(8);
                }
            } else {
                if (!i3yVar.isInitialized()) {
                    addView((View) this.progressBarLazy.getValue());
                }
                if (this.progressBarLazy.isInitialized()) {
                    ((SpinnerProgressBar) this.progressBarLazy.getValue()).setTint(tintColor);
                    ((View) this.progressBarLazy.getValue()).setVisibility(0);
                }
            }
        }

        public final void setTitle(CharSequence text) {
            this.textView.setText(text);
        }

        public final void setTitleTextColor(int color) {
            this.textView.setTextColor(new cdc(color));
        }

        public final void setTitleTextSize(int dimenId) {
            this.textView.setTextSize(tje.s(dimenId, getContext()));
        }

        private final void setImage(NewTopActionButton newTopActionButton, ofn0 ofn0Var, int i) {
            newTopActionButton.imageColor = i;
            newTopActionButton.applyAnimationTint();
            if (ofn0Var instanceof mfn0) {
                newTopActionButton.setImage(((mfn0) ofn0Var).a, i);
            }
        }
    }

    public ScootersNewControlPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersNewControlPanelView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersNewControlPanelView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersNewControlPanelView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
