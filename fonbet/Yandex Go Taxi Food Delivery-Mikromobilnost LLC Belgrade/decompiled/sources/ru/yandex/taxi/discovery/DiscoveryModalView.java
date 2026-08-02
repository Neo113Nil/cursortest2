package ru.yandex.taxi.discovery;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ah00;
import defpackage.cma1;
import defpackage.gah;
import defpackage.isj;
import defpackage.k7x0;
import defpackage.mo21;
import defpackage.mqg0;
import defpackage.mwj;
import defpackage.ndh0;
import defpackage.odh0;
import defpackage.pav;
import defpackage.rp31;
import defpackage.rwj;
import defpackage.sw80;
import defpackage.tph0;
import defpackage.tvj;
import defpackage.wwj;
import defpackage.xwj;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001VBI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0015H\u0016¢\u0006\u0004\b,\u0010\u0017J!\u00100\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001eH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0015H\u0016¢\u0006\u0004\b7\u0010\u0017J\u000f\u00108\u001a\u00020\u0015H\u0016¢\u0006\u0004\b8\u0010\u0017J\u000f\u00109\u001a\u00020\u0015H\u0016¢\u0006\u0004\b9\u0010\u0017J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u00020!H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010AR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bS\u0010#¨\u0006W"}, d2 = {"Lru/yandex/taxi/discovery/DiscoveryModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lrwj;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lah00;", "mapController", "Lk7x0;", "tagUrlFormatter", "Lmwj;", "discoveryParams", "Lru/yandex/taxi/discovery/a;", "discoveryPresenter", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lwwj;", "driveUserLocationOverlay", "<init>", "(Landroid/content/Context;Lpav;Lah00;Lk7x0;Lmwj;Lru/yandex/taxi/discovery/a;Lru/yandex/taxi/layers/presentation/optimalview/c;Lwwj;)V", "Lzy11;", "onStartMoveAction", "()V", "onStopMoveAction", "showDefaultTitle", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Lmo21;", "userLocation", "updateUserLocation", "(Lmo21;)V", "", "azimuth", "updateAzimuth", "(F)V", "showError", "", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "screenName", "()Ljava/lang/String;", "canHandleScreenTracking", "()Z", "showFirstUsageHint", "hideFirstUsageHint", "collapseForZoom", "count", "updateBadgeCount", "(I)V", "Lpav;", "Lk7x0;", "Lmwj;", "Lru/yandex/taxi/discovery/a;", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Lwwj;", "Lru/yandex/taxi/widget/RobotoTextView;", "hintView", "Lru/yandex/taxi/widget/RobotoTextView;", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "titleView", "Lru/yandex/taxi/widget/ShimmeringRobotoTextView;", "subtitleView", "Landroidx/appcompat/widget/AppCompatImageView;", "logoImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lisj;", "discoveryCameraMoveHandler", "Lisj;", "Lgah;", "defaultDiscoveryViewConfig", "Lgah;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "Companion", "tvj", "discovery"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DiscoveryModalView extends SlideableModalView implements rwj {
    public static final tvj Companion = new tvj();
    private static final int SHIMMER_DURATION_MS = 600;
    private final gah defaultDiscoveryViewConfig;
    private final isj discoveryCameraMoveHandler;
    private final mwj discoveryParams;
    private final a discoveryPresenter;
    private final wwj driveUserLocationOverlay;
    private final RobotoTextView hintView;
    private final pav imageLoader;
    private final AppCompatImageView logoImageView;
    private final ru.yandex.taxi.layers.presentation.optimalview.c mapObservationPresenter;
    private final RobotoTextView subtitleView;
    private final k7x0 tagUrlFormatter;
    private final ShimmeringRobotoTextView titleView;

    public DiscoveryModalView(Context context, pav pavVar, ah00 ah00Var, k7x0 k7x0Var, mwj mwjVar, a aVar, ru.yandex.taxi.layers.presentation.optimalview.c cVar, wwj wwjVar) {
        super(context);
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.discoveryParams = mwjVar;
        this.discoveryPresenter = aVar;
        this.mapObservationPresenter = cVar;
        this.driveUserLocationOverlay = wwjVar;
        int i = ndh0.hint;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.hintView = (RobotoTextView) ((View) rp31.d(this, i));
        this.titleView = (ShimmeringRobotoTextView) ((View) rp31.d(this, odh0.title));
        this.subtitleView = (RobotoTextView) ((View) rp31.d(this, odh0.subtitle));
        this.logoImageView = (AppCompatImageView) ((View) rp31.d(this, odh0.logo_image));
        this.discoveryCameraMoveHandler = new isj(ah00Var);
        sw80 sw80Var = mwjVar.d;
        throw new ClassCastException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartMoveAction() {
        this.titleView.startAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStopMoveAction() {
        this.titleView.stopAnimation();
    }

    private final void showDefaultTitle() {
        throw null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // defpackage.mq00
    public void collapseForZoom() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tph0.discovery_view;
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
        cma1.L(this.hintView);
    }

    @Override // defpackage.mq00
    public void hideMessage() {
        showDefaultTitle();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mapObservationPresenter.Cg();
        this.discoveryPresenter.Cg();
        ((xwj) this.driveUserLocationOverlay).a.detach();
        this.discoveryCameraMoveHandler.a();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return this.discoveryParams.b;
    }

    public void showError() {
        onStopMoveAction();
        TransitionManager.a(new AutoTransition(), (ViewGroup) getContent());
        throw null;
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
        if (this.hintView.getText().length() > 0) {
            cma1.J(this.hintView);
        }
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
        onStopMoveAction();
        this.titleView.setVisibility(4);
        TransitionManager.a(new AutoTransition(), (ViewGroup) getContent());
        this.titleView.setVisibility(0);
        ShimmeringRobotoTextView shimmeringRobotoTextView = this.titleView;
        if (title.length() == 0) {
            throw null;
        }
        shimmeringRobotoTextView.setText(title);
        this.subtitleView.setText(subtitle);
        this.subtitleView.setVisibility(subtitle == null ? 8 : 0);
    }

    @Override // defpackage.rwj
    public void updateAzimuth(float azimuth) {
        ((xwj) this.driveUserLocationOverlay).a.updateAzimuth(azimuth);
    }

    @Override // defpackage.rwj
    public void updateBadgeCount(int count) {
    }

    @Override // defpackage.rwj
    public void updateUserLocation(mo21 userLocation) {
        ((xwj) this.driveUserLocationOverlay).a(userLocation);
    }
}
