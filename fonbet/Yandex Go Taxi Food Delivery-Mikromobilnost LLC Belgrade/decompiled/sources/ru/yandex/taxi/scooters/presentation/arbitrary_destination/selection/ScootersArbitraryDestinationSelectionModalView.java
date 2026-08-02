package ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.mapkit.geometry.Point;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.cma1;
import defpackage.g8n0;
import defpackage.gh00;
import defpackage.gzx;
import defpackage.hxj0;
import defpackage.k1b1;
import defpackage.kyh0;
import defpackage.kym0;
import defpackage.mqg0;
import defpackage.msg0;
import defpackage.ny61;
import defpackage.pfh0;
import defpackage.pym0;
import defpackage.qdb1;
import defpackage.qrh0;
import defpackage.tje;
import defpackage.tls;
import defpackage.vmz;
import defpackage.xw31;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.common_models.net.map_object.f0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.ScootersArbitraryDestinationSelectionModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001?Bi\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0001\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\"\u0010\u001dJ\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001eH\u0014¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000fH\u0015¢\u0006\u0004\b,\u0010\u001dJ\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020#H\u0014¢\u0006\u0004\b1\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0018\u00108\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u0010'¨\u0006@"}, d2 = {"Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/ScootersArbitraryDestinationSelectionModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lpym0;", "Landroid/content/Context;", "context", "La3v;", "focusCoordinator", "Lgzx;", "layersUserLocationOverlay", "Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/overlay/a;", "scootersArbitraryDestinationRouteOverlay", "Lg8n0;", "scootersCompassRotatableFloatButtonFactory", "Lkotlin/Function1;", "Lzzs;", "Lzy11;", "onStartRide", "onSuggestListener", "Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/d;", "scootersArbitraryDestinationSelectionPresenter", "<init>", "(Landroid/content/Context;La3v;Lgzx;Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/overlay/a;Lg8n0;Ltls;Ltls;Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/d;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lpym0;", "onAttachedToWindow", "()V", "", "contentTop", "onModalViewAppear", "(I)V", "onDetachedFromWindow", "", "isArrowsPermanentlyHidden", "()Z", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchOutside", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "settlingLayoutChanges", "La3v;", "Lgzx;", "Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/overlay/a;", "Lg8n0;", "Ltls;", "Lru/yandex/taxi/scooters/presentation/arbitrary_destination/selection/d;", "backPressedListener", "Ljava/lang/Runnable;", "", "buttonTitle", "Ljava/lang/String;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "kym0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersArbitraryDestinationSelectionModalView extends SlideableBindingModalView<pym0> {
    public static final int $stable = 8;
    private Runnable backPressedListener;
    private final String buttonTitle;
    private final a3v focusCoordinator;
    private final gzx layersUserLocationOverlay;
    private final tls onStartRide;
    private final tls onSuggestListener;
    private final ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a scootersArbitraryDestinationRouteOverlay;
    private final d scootersArbitraryDestinationSelectionPresenter;
    private final g8n0 scootersCompassRotatableFloatButtonFactory;

    public ScootersArbitraryDestinationSelectionModalView(Context context, a3v a3vVar, gzx gzxVar, ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a aVar, g8n0 g8n0Var, tls tlsVar, tls tlsVar2, d dVar) {
        super(context);
        this.focusCoordinator = a3vVar;
        this.layersUserLocationOverlay = gzxVar;
        this.scootersArbitraryDestinationRouteOverlay = aVar;
        this.scootersCompassRotatableFloatButtonFactory = g8n0Var;
        this.onStartRide = tlsVar;
        this.onSuggestListener = tlsVar2;
        this.scootersArbitraryDestinationSelectionPresenter = dVar;
        this.buttonTitle = getContext().getString(kyh0.scooters_start_ride);
        getBottomSheetBehavior().a0 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView) {
        Runnable runnable = scootersArbitraryDestinationSelectionModalView.backPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView) {
        scootersArbitraryDestinationSelectionModalView.onSuggestListener.invoke(((gh00) scootersArbitraryDestinationSelectionModalView.scootersArbitraryDestinationSelectionPresenter.y).e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView) {
        scootersArbitraryDestinationSelectionModalView.onStartRide.invoke(((gh00) scootersArbitraryDestinationSelectionModalView.scootersArbitraryDestinationSelectionPresenter.y).e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onLocationClick(d dVar) {
        tje.N(dVar.Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$onLocationClick$1(null, dVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public pym0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qrh0.scooters_arbitrary_destination_selection_view, parent, false);
        int i = pfh0.address;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, inflate);
        if (listItemComponent != null) {
            i = pfh0.start_btn;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = pfh0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = pfh0.suggest_shimmer;
                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, inflate);
                    if (shimmeringBar != null) {
                        i = pfh0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new pym0((GoConstraintLayout) inflate, listItemComponent, buttonComponent, robotoTextView, shimmeringBar, robotoTextView2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(24, getContext());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        qdb1.b(this, new Runnable(this) { // from class: jym0
            public final /* synthetic */ ScootersArbitraryDestinationSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.b;
                switch (i2) {
                    case 0:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$0(scootersArbitraryDestinationSelectionModalView);
                        break;
                    case 1:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$1(scootersArbitraryDestinationSelectionModalView);
                        break;
                    default:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$2(scootersArbitraryDestinationSelectionModalView);
                        break;
                }
            }
        });
        k1b1.b(this, this.scootersCompassRotatableFloatButtonFactory.a(), new hxj0(28, this.scootersArbitraryDestinationSelectionPresenter));
        this.scootersArbitraryDestinationRouteOverlay.attach();
        d dVar = this.scootersArbitraryDestinationSelectionPresenter;
        dVar.Bg(new kym0(this));
        dVar.A.a(dVar.K, dVar.L);
        ((ru.yandex.taxi.map_common.b) dVar.D).a(f0.class, dVar.M);
        tje.N(dVar.Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$listenCamera$1(null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$listenSessionState$$inlined$collectIn$1(com.yandex.go.coroutines.b.c(dVar.F.a(), new ScootersArbitraryDestinationSelectionPresenter$listenSessionState$1(null, dVar)), null, dVar), 3);
        zzs zzsVar = dVar.I;
        ah00 ah00Var = dVar.y;
        if (zzsVar != null) {
            Point point = new Point(zzsVar.a, zzsVar.b);
            gh00 gh00Var = (gh00) ah00Var;
            gh00Var.getClass();
            gh00Var.q(new vmz(7, gh00Var, point));
        } else {
            ((gh00) ah00Var).J(17.0f);
        }
        if (zzsVar == null) {
            zzsVar = ((gh00) ah00Var).e.b();
        }
        dVar.Lg(zzsVar);
        tje.N(dVar.Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$listenRoutePrice$1(null, dVar), 3);
        final int i2 = 1;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: jym0
            public final /* synthetic */ ScootersArbitraryDestinationSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$0(scootersArbitraryDestinationSelectionModalView);
                        break;
                    case 1:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$1(scootersArbitraryDestinationSelectionModalView);
                        break;
                    default:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$2(scootersArbitraryDestinationSelectionModalView);
                        break;
                }
            }
        });
        final int i3 = 2;
        getBinding().c.setDebounceClickListener(new Runnable(this) { // from class: jym0
            public final /* synthetic */ ScootersArbitraryDestinationSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i3;
                ScootersArbitraryDestinationSelectionModalView scootersArbitraryDestinationSelectionModalView = this.b;
                switch (i22) {
                    case 0:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$0(scootersArbitraryDestinationSelectionModalView);
                        break;
                    case 1:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$1(scootersArbitraryDestinationSelectionModalView);
                        break;
                    default:
                        ScootersArbitraryDestinationSelectionModalView.onAttachedToWindow$lambda$2(scootersArbitraryDestinationSelectionModalView);
                        break;
                }
            }
        });
        this.focusCoordinator.q3(ScootersArbitraryDestinationSelectionModalView.class, 0, tje.r(msg0.scooters_top_notification_focus_rect_margin, getContext()), 0, tje.u(280, getContext()));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.focusCoordinator.Lc(ScootersArbitraryDestinationSelectionModalView.class, null);
        ru.yandex.taxi.scooters.presentation.arbitrary_destination.selection.overlay.a aVar = this.scootersArbitraryDestinationRouteOverlay;
        aVar.w.Cg();
        ((gh00) ((ah00) aVar.b)).u(aVar.x);
        aVar.Hg();
        this.scootersArbitraryDestinationSelectionPresenter.Cg();
        this.layersUserLocationOverlay.detach();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.layersUserLocationOverlay.attach();
        d dVar = this.scootersArbitraryDestinationSelectionPresenter;
        tje.N(dVar.Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$listenUserGeo$$inlined$collectLatestIn$1(new n(((ru.yandex.taxi.preorder.source.userposition.e) dVar.C).n(), new ScootersArbitraryDestinationSelectionPresenter$listenUserGeo$1(null, dVar)), null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new ScootersArbitraryDestinationSelectionPresenter$listenUserGeo$$inlined$collectLatestIn$2(dVar.z.a(), null, dVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.backPressedListener = onBackPressedListener;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
