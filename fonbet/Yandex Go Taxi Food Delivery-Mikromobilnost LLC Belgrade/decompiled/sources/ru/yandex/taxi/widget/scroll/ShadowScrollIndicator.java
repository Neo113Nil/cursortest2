package ru.yandex.taxi.widget.scroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c4i0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.nn50;
import defpackage.pn50;
import defpackage.tgr0;
import defpackage.vgr0;
import defpackage.vng;
import defpackage.x95;
import defpackage.xby;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.scroll.ShadowScrollIndicator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 72\u00020\u0001:\u00018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105¨\u00069"}, d2 = {"Lru/yandex/taxi/widget/scroll/ShadowScrollIndicator;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "getParentView", "()Landroid/view/View;", "visibility", "Lzy11;", "processScrollViewVisibilityChanged", "(I)V", "handleScrollViewVisibility", "checkScrollPosition", "()V", "height", "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "scrollView", "initIndicator", "(ILru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;)V", "attachListeners", "detachListeners", "getScrollView", "()Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "onAttachedToWindow", "onDetachedFromWindow", "setScrollView", "(Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;)V", "", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "scrollViewId", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "scrollDirection", "isVisibleScrollView", "Z", "isShown", "isInitialized", "Lnn50;", "scrollChangeListener", "Lnn50;", "Lpn50;", "visibilityListener", "Lpn50;", "Landroid/view/View$OnLayoutChangeListener;", "onContentLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChangeListener", "Companion", "vgr0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ShadowScrollIndicator extends AppCompatImageView {
    public static final vgr0 Companion = new vgr0();
    private static final int DIRECTION_DOWN = 1;
    private boolean isInitialized;
    private boolean isShown;
    private boolean isVisibleScrollView;
    private final View.OnLayoutChangeListener onContentLayoutChangeListener;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final nn50 scrollChangeListener;
    private final int scrollDirection;
    private NestedScrollViewAdvanced scrollView;
    private final int scrollViewId;
    private final pn50 visibilityListener;

    public ShadowScrollIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollChangeListener = new x95(9, this);
        this.visibilityListener = new tgr0(this);
        final int i2 = 0;
        this.onContentLayoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: ugr0
            public final /* synthetic */ ShadowScrollIndicator b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                switch (i2) {
                    case 0:
                        this.b.checkScrollPosition();
                        break;
                    default:
                        ShadowScrollIndicator.onLayoutChangeListener$lambda$0(this.b, view, i3, i4, i5, i6, i7, i8, i9, i10);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.onLayoutChangeListener = new View.OnLayoutChangeListener(this) { // from class: ugr0
            public final /* synthetic */ ShadowScrollIndicator b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i32, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                switch (i3) {
                    case 0:
                        this.b.checkScrollPosition();
                        break;
                    default:
                        ShadowScrollIndicator.onLayoutChangeListener$lambda$0(this.b, view, i32, i4, i5, i6, i7, i8, i9, i10);
                        break;
                }
            }
        };
        setAdjustViewBounds(true);
        setScaleType(ImageView.ScaleType.FIT_XY);
        setImageDrawable(vng.t(dzg0.shadow_bottom, context));
        setAlpha(0.0f);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.ShadowScrollIndicator, i, 0);
        try {
            this.scrollViewId = obtainStyledAttributes.getResourceId(c4i0.ShadowScrollIndicator_scroll_view_id, -1);
            int i4 = obtainStyledAttributes.getInt(c4i0.ShadowScrollIndicator_scroll_view_position, 1);
            this.scrollDirection = i4;
            if (i4 != 1) {
                setRotation(180.0f);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void attachListeners() {
        NestedScrollViewAdvanced nestedScrollViewAdvanced = this.scrollView;
        if (nestedScrollViewAdvanced == null) {
            return;
        }
        this.isInitialized = true;
        nestedScrollViewAdvanced.addScrollChangeListener(this.scrollChangeListener);
        nestedScrollViewAdvanced.addVisibilityChangeListener(this.visibilityListener);
        if (nestedScrollViewAdvanced.getChildCount() > 0) {
            nestedScrollViewAdvanced.getChildAt(0).addOnLayoutChangeListener(this.onContentLayoutChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkScrollPosition() {
        NestedScrollViewAdvanced scrollView = getScrollView();
        if (scrollView == null) {
            return;
        }
        if (!scrollView.canScrollVertically(this.scrollDirection) || !this.isVisibleScrollView) {
            if (this.isShown) {
                cma1.b(0.0f, this);
                this.isShown = false;
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            requestLayout();
        }
        if (this.isShown) {
            return;
        }
        cma1.b(1.0f, this);
        this.isShown = true;
    }

    private final void detachListeners() {
        this.isInitialized = false;
        NestedScrollViewAdvanced nestedScrollViewAdvanced = this.scrollView;
        if (nestedScrollViewAdvanced == null) {
            return;
        }
        nestedScrollViewAdvanced.removeScrollChangeListener(this.scrollChangeListener);
        nestedScrollViewAdvanced.removeVisibilityChangeListener(this.visibilityListener);
        if (nestedScrollViewAdvanced.getChildCount() > 0) {
            nestedScrollViewAdvanced.getChildAt(0).removeOnLayoutChangeListener(this.onContentLayoutChangeListener);
        }
    }

    private final View getParentView() {
        return (View) getParent();
    }

    private final NestedScrollViewAdvanced getScrollView() {
        NestedScrollViewAdvanced nestedScrollViewAdvanced = this.scrollView;
        if (nestedScrollViewAdvanced != null) {
            return nestedScrollViewAdvanced;
        }
        View findViewById = getParentView().findViewById(this.scrollViewId);
        if (findViewById == null) {
            return null;
        }
        if (findViewById instanceof NestedScrollViewAdvanced) {
            return (NestedScrollViewAdvanced) findViewById;
        }
        xby.d.x(new IllegalStateException(), "connect indicator to NestedScrollViewAdvanced only");
        return null;
    }

    private final void handleScrollViewVisibility(int visibility) {
        this.isVisibleScrollView = visibility == 0;
    }

    private final void initIndicator(int height, NestedScrollViewAdvanced scrollView) {
        if (this.isInitialized) {
            checkScrollPosition();
            return;
        }
        if (height <= 0 || scrollView == null) {
            setVisibility(8);
            detachListeners();
            this.scrollView = null;
        } else {
            if (!scrollView.canScrollVertically(1)) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            if (scrollView == this.scrollView && scrollView.hasScrollChangeListener(this.scrollChangeListener)) {
                return;
            }
            handleScrollViewVisibility(scrollView.getVisibility());
            this.scrollView = scrollView;
            attachListeners();
            checkScrollPosition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLayoutChangeListener$lambda$0(ShadowScrollIndicator shadowScrollIndicator, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (shadowScrollIndicator.isEnabled()) {
            shadowScrollIndicator.initIndicator(i4 - i2, shadowScrollIndicator.getScrollView());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processScrollViewVisibilityChanged(int visibility) {
        handleScrollViewVisibility(visibility);
        checkScrollPosition();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getParentView().addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        detachListeners();
        this.scrollView = null;
        getParentView().removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (!isEnabled()) {
            detachListeners();
            this.scrollView = null;
            setVisibility(8);
        } else {
            if (!isAttachedToWindow() || getHeight() <= 0) {
                return;
            }
            initIndicator(getHeight(), getScrollView());
        }
    }

    public final void setScrollView(NestedScrollViewAdvanced scrollView) {
        if (this.scrollView == scrollView) {
            return;
        }
        detachListeners();
        this.scrollView = scrollView;
        if (!isAttachedToWindow() || getHeight() <= 0) {
            return;
        }
        initIndicator(getHeight(), scrollView);
    }

    public ShadowScrollIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ShadowScrollIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ShadowScrollIndicator(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
