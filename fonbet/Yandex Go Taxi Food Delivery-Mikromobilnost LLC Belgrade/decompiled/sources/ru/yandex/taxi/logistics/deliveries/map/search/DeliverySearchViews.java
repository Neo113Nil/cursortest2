package ru.yandex.taxi.logistics.deliveries.map.search;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.jl40;
import defpackage.oqg0;
import defpackage.roi;
import defpackage.soi;
import defpackage.toi;
import defpackage.uoi;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/yandex/taxi/logistics/deliveries/map/search/DeliverySearchViews;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "renderTwoCirclesSearch", "()V", "renderEmptyPulsar", "", "isVisible", "setVisibility", "(Z)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "applyThemeForChildrenByDefault", "()Z", "Landroid/graphics/PointF;", "anchor", "setPulsingCirclesViewAnchor", "(Landroid/graphics/PointF;)V", "Lroi;", ClidProvider.STATE, "render", "(Lroi;)V", "Landroid/view/View;", "pin", "setPin", "(Landroid/view/View;)V", "Landroid/widget/FrameLayout$LayoutParams;", "circlesLayoutParams", "Landroid/widget/FrameLayout$LayoutParams;", "Lru/yandex/taxi/logistics/deliveries/map/search/TwoPulsingCirclesView;", "twoPulsingCirclesView", "Lru/yandex/taxi/logistics/deliveries/map/search/TwoPulsingCirclesView;", "Lru/yandex/taxi/logistics/deliveries/map/search/DeliveryPinLocationView;", "pinLocationView", "Lru/yandex/taxi/logistics/deliveries/map/search/DeliveryPinLocationView;", "backgroundView", "Landroid/view/View;", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliverySearchViews extends GoFrameLayout {
    private final View backgroundView;
    private final FrameLayout.LayoutParams circlesLayoutParams;
    private final DeliveryPinLocationView pinLocationView;
    private final TwoPulsingCirclesView twoPulsingCirclesView;

    public DeliverySearchViews(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        this.circlesLayoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.twoPulsingCirclesView = new TwoPulsingCirclesView(context);
        this.pinLocationView = new DeliveryPinLocationView(context);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackground(new ColorDrawable(getContext().getColor(oqg0.animation_circles_background)));
        view.setAlpha(0.6f);
        this.backgroundView = view;
        setImportantForAccessibility(4);
        setVisibility(8);
    }

    private final void renderEmptyPulsar() {
        removeView(this.backgroundView);
        removeView(this.twoPulsingCirclesView);
        removeView(this.pinLocationView);
        setVisibility(false);
    }

    private final void renderTwoCirclesSearch() {
        if (this.twoPulsingCirclesView.getParent() != null) {
            return;
        }
        addView(this.backgroundView, this.circlesLayoutParams);
        addView(this.twoPulsingCirclesView, this.circlesLayoutParams);
        addView(this.pinLocationView, new FrameLayout.LayoutParams(-2, -2, 17));
        setVisibility(true);
    }

    private final void setVisibility(boolean isVisible) {
        setVisibility(isVisible ? 0 : 8);
        this.backgroundView.setVisibility(isVisible ? 0 : 8);
        this.twoPulsingCirclesView.setVisibility(isVisible ? 0 : 8);
        this.pinLocationView.setVisibility(isVisible ? 0 : 8);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        return true;
    }

    public final void render(roi state) {
        uoi uoiVar = state.a;
        if (jl40.l(uoiVar, toi.a)) {
            renderTwoCirclesSearch();
        } else if (jl40.l(uoiVar, soi.a)) {
            renderEmptyPulsar();
        } else {
            w511.b();
        }
    }

    public final void setPin(View pin) {
        this.pinLocationView.setPin(pin);
    }

    public final void setPulsingCirclesViewAnchor(PointF anchor) {
        this.twoPulsingCirclesView.setAnchorPoint(anchor);
        this.pinLocationView.setAnchorPoint(anchor);
    }

    public DeliverySearchViews(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DeliverySearchViews(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DeliverySearchViews(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
