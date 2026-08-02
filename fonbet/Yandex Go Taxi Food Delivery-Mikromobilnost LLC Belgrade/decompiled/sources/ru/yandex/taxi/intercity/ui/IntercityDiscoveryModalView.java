package ru.yandex.taxi.intercity.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.aqh0;
import defpackage.ce0;
import defpackage.d230;
import defpackage.dhv;
import defpackage.e230;
import defpackage.gzr0;
import defpackage.mmw;
import defpackage.mo21;
import defpackage.mqg0;
import defpackage.nmw;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.rwj;
import defpackage.tje;
import defpackage.wwj;
import defpackage.xw31;
import defpackage.xwj;
import kotlin.Metadata;
import ru.yandex.taxi.discovery.a;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B=\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\"\u0010\u001dJ\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010\u001dJ!\u00103\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u0010\u001dJ\u000f\u00106\u001a\u00020\u001bH\u0016¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00107\u001a\u00020\u001bH\u0016¢\u0006\u0004\b7\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u001a\u0010\r\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\r\u0010;\u0012\u0004\b<\u0010\u001dR\u0014\u0010>\u001a\u00020\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b=\u0010!¨\u0006?"}, d2 = {"Lru/yandex/taxi/intercity/ui/IntercityDiscoveryModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lnmw;", "Lrwj;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lwwj;", "discoveryUserLocationOverlay", "", "screenName", "Lgzr0;", "shortcutGridView", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/discovery/a;Lru/yandex/taxi/layers/presentation/optimalview/c;Lwwj;Ljava/lang/String;Lgzr0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lnmw;", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "animateDismissBackground", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lmo21;", "userLocation", "updateUserLocation", "(Lmo21;)V", "", "azimuth", "updateAzimuth", "(F)V", "showError", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "showFirstUsageHint", "hideFirstUsageHint", "Lru/yandex/taxi/discovery/a;", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Lwwj;", "Ljava/lang/String;", "getScreenName$annotations", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercityDiscoveryModalView extends SlideableBindingModalView<nmw> implements rwj {
    private final a discoveryPresenter;
    private final wwj discoveryUserLocationOverlay;
    private final c mapObservationPresenter;
    private final String screenName;

    public IntercityDiscoveryModalView(Context context, a aVar, c cVar, wwj wwjVar, String str, gzr0 gzr0Var) {
        super(context);
        this.discoveryPresenter = aVar;
        this.mapObservationPresenter = cVar;
        this.discoveryUserLocationOverlay = wwjVar;
        this.screenName = str;
        setDismissOnTouchOutside(false);
        setEnableBackgroundOnAppearing(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        getBinding().a.addView(gzr0Var.getView(), new FrameLayout.LayoutParams(-1, -2));
        refreshNestedScrollView(gzr0Var.getView());
        cVar.E = Mode.INTERCITY;
        cVar.D = true;
        cVar.Ng(str);
        qdb1.b(this, new dhv(8, this));
        qdb1.d(this, new mmw(aVar, 0));
    }

    private static /* synthetic */ void getScreenName$annotations() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismissBackground() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public nmw bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(aqh0.intercity_discovery_modal_view, parent, false);
        if (inflate != null) {
            return new nmw((FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.mq00
    public /* bridge */ void collapseForZoom() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.u(32, getContext());
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void hideMessage() {
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new d230(0);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.attach();
        }
        this.discoveryPresenter.Mg(this);
        this.mapObservationPresenter.Lg(this);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.discoveryPresenter.Cg();
        this.mapObservationPresenter.Cg();
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.detach();
        }
        post(new ce0(this, 15));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public void showError() {
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
    }

    @Override // defpackage.rwj
    public void updateAzimuth(float azimuth) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a.updateAzimuth(azimuth);
        }
    }

    @Override // defpackage.rwj
    public /* bridge */ void updateBadgeCount(int i) {
    }

    @Override // defpackage.rwj
    public void updateUserLocation(mo21 userLocation) {
        wwj wwjVar = this.discoveryUserLocationOverlay;
        if (wwjVar != null) {
            ((xwj) wwjVar).a(userLocation);
        }
    }
}
