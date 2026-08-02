package ru.yandex.taxi.order.recenter;

import android.content.Context;
import android.view.View;
import com.yandex.go.taxi.order.recenter.c;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.k760;
import defpackage.l1t;
import defpackage.m1t;
import defpackage.zgv;
import kotlin.Metadata;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.ui.recenter.RecenterButton;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010 \u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/yandex/taxi/order/recenter/NextRecenterButtonView;", "Lru/yandex/taxi/ui/recenter/RecenterButton;", "Lk760;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/order/recenter/c;", "presenter", "Ll1t;", "geoSharingRouter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/order/recenter/c;Ll1t;)V", "", "translateFloatButton", "()F", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/map/overlay/RecenterType;", "recenterType", "setNextRecenterType", "(Lru/yandex/taxi/map/overlay/RecenterType;)V", "", "imageResId", "setImageResId", "(I)V", "", "isVisible", "setButtonVisibility", "(Z)V", "Lcom/yandex/go/taxi/order/recenter/c;", "Ll1t;", "nextRecenterType", "Lru/yandex/taxi/map/overlay/RecenterType;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NextRecenterButtonView extends RecenterButton implements k760 {
    public static final int $stable = 8;
    private final l1t geoSharingRouter;
    private RecenterType nextRecenterType;
    private final c presenter;

    public NextRecenterButtonView(Context context, c cVar, l1t l1tVar) {
        super(context, null, 0, 0, 14, null);
        this.presenter = cVar;
        this.geoSharingRouter = l1tVar;
        this.nextRecenterType = RecenterType.ALL_ROUTE;
        setImportantForAccessibility(2);
        setIcon(f1h0.ic_all_route);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(NextRecenterButtonView nextRecenterButtonView, View view) {
        ((m1t) nextRecenterButtonView.geoSharingRouter).a().setNextRecenterType(nextRecenterButtonView.nextRecenterType);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Kg(this);
        setOnClickListener(new zgv(21, this));
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        setOnClickListener(null);
    }

    @Override // defpackage.k760
    public void setButtonVisibility(boolean isVisible) {
        if (isVisible) {
            cma1.J(this);
        } else {
            cma1.L(this);
        }
    }

    @Override // defpackage.k760
    public void setImageResId(int imageResId) {
        setIcon(imageResId);
    }

    @Override // defpackage.k760
    public void setNextRecenterType(RecenterType recenterType) {
        this.nextRecenterType = recenterType;
    }

    @Override // ru.yandex.taxi.design.FloatButtonIconComponent
    public float translateFloatButton() {
        return 0.0f;
    }
}
