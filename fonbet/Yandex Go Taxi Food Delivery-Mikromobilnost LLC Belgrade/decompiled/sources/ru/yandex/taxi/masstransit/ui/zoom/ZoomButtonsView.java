package ru.yandex.taxi.masstransit.ui.zoom;

import android.content.Context;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.passport.internal.ui.sloth.e;
import defpackage.dzg0;
import defpackage.kyh0;
import defpackage.se61;
import defpackage.tje;
import defpackage.xw31;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewBottomRounded$1;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/masstransit/ui/zoom/ZoomButtonsView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Lse61;", "presenter", "<init>", "(Landroid/content/Context;Lse61;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljava/lang/Runnable;", "runnable", "setOnZoomListener", "(Ljava/lang/Runnable;)V", "Lse61;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZoomButtonsView extends GoLinearLayout {
    public static final int $stable = 8;
    private final se61 presenter;

    public ZoomButtonsView(Context context, se61 se61Var) {
        super(context, null, 0, 0, 14, null);
        setOrientation(1);
        ZoomButtonView zoomButtonView = new ZoomButtonView(context, new ZoomButtonsView$zoomIn$1(0, null, se61.class, "zoomInClicked", "zoomInClicked()V", 0), new ZoomButtonsView$zoomIn$2(0, null, se61.class, "zoomInHeld", "zoomInHeld()V", 0));
        zoomButtonView.setImageResource(dzg0.ic_plus);
        zoomButtonView.setContentDescription(context.getString(kyh0.mt_zoom_in_map_content_description));
        zoomButtonView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(100, zoomButtonView.getContext())));
        zoomButtonView.setClipToOutline(true);
        e.c(zoomButtonView);
        int v = tje.v(zoomButtonView.getContext(), 0.5f);
        xw31.E(zoomButtonView, null, null, null, Integer.valueOf(v < 1 ? 1 : v));
        ZoomButtonView zoomButtonView2 = new ZoomButtonView(context, new ZoomButtonsView$zoomOut$1(0, null, se61.class, "zoomOutClicked", "zoomOutClicked()V", 0), new ZoomButtonsView$zoomOut$2(0, null, se61.class, "zoomOutHeld", "zoomOutHeld()V", 0));
        zoomButtonView2.setImageResource(dzg0.ic_minus);
        zoomButtonView2.setContentDescription(context.getString(kyh0.mt_zoom_out_map_content_description));
        zoomButtonView2.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewBottomRounded$1(tje.u(100, zoomButtonView2.getContext())));
        zoomButtonView2.setClipToOutline(true);
        e.c(zoomButtonView2);
        addView(zoomButtonView);
        addView(zoomButtonView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public final void setOnZoomListener(Runnable runnable) {
        throw null;
    }
}
