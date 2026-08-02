package ru.yandex.taxi.widget.scroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import defpackage.c4i0;
import defpackage.d240;
import defpackage.e32;
import defpackage.f32;
import defpackage.hay;
import defpackage.lls;
import defpackage.nhp0;
import defpackage.nn50;
import defpackage.ohp0;
import defpackage.on50;
import defpackage.pn50;
import defpackage.sls;
import defpackage.tgr0;
import defpackage.u94;
import defpackage.xw31;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.analytics.ScrollDirection;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\b\u0016\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u00020IB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b-\u0010,J\u0015\u0010.\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\r2\u0006\u0010*\u001a\u000200¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\r2\u0006\u0010*\u001a\u000200¢\u0006\u0004\b3\u00102J\u0017\u00105\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\r2\u0006\u0010>\u001a\u00020\u001f¢\u0006\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020)0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u0002000A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010FR\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010G¨\u0006J"}, d2 = {"Lru/yandex/taxi/widget/scroll/NestedScrollViewAdvanced;", "Landroidx/core/widget/NestedScrollView;", "Lu94;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "attributes", "Lzy11;", "applyAttributes", "(Landroid/content/res/TypedArray;)V", "heightMeasureSpec", "maxHeight", "resolveHeightMeasureSpec", "(II)I", "widthMeasureSpec", "onMeasure", "(II)V", "l", "t", "oldl", "oldt", "onScrollChanged", "(IIII)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "child", "Ljava/lang/Runnable;", "action", "Llls;", "createFullyVisibleViewChecker", "(Landroid/view/View;Ljava/lang/Runnable;)Llls;", "Lnn50;", "listener", "addScrollChangeListener", "(Lnn50;)V", "removeScrollChangeListener", "hasScrollChangeListener", "(Lnn50;)Z", "Lpn50;", "addVisibilityChangeListener", "(Lpn50;)V", "removeVisibilityChangeListener", "visibility", "setVisibility", "(I)V", "", "calcVisibilityPercent", "()F", "", "scrollAnalyticsName", "setScrollAnalyticsName", "(Ljava/lang/String;)V", "fixChildRequestIntercept", "setFixChildRequestIntercept", "(Z)V", "", "scrollListeners", "Ljava/util/List;", "visibilityListeners", CA20Status.STATUS_USER_I, "Ljava/lang/String;", "Z", "Companion", "on50", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class NestedScrollViewAdvanced extends NestedScrollView implements u94 {
    private static final on50 Companion = new on50();
    private static final int DEFAULT_MAX_HEIGHT = Integer.MAX_VALUE;
    private boolean fixChildRequestIntercept;
    private int maxHeight;
    private String scrollAnalyticsName;
    private final List<nn50> scrollListeners;
    private final List<pn50> visibilityListeners;

    public NestedScrollViewAdvanced(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scrollListeners = new CopyOnWriteArrayList();
        this.visibilityListeners = new CopyOnWriteArrayList();
        this.maxHeight = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.NestedScrollViewAdvanced, i, 0);
        try {
            applyAttributes(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void applyAttributes(TypedArray attributes) {
        this.maxHeight = attributes.getDimensionPixelSize(c4i0.NestedScrollViewAdvanced_android_maxHeight, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onScrollChanged$lambda$0(NestedScrollViewAdvanced nestedScrollViewAdvanced) {
        String str = nestedScrollViewAdvanced.scrollAnalyticsName;
        return str == null ? "" : str;
    }

    private final int resolveHeightMeasureSpec(int heightMeasureSpec, int maxHeight) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == 1073741824) {
            return heightMeasureSpec;
        }
        if (mode == Integer.MIN_VALUE) {
            maxHeight = Math.min(View.MeasureSpec.getSize(heightMeasureSpec), maxHeight);
        }
        return View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
    }

    public final void addScrollChangeListener(nn50 listener) {
        this.scrollListeners.add(listener);
    }

    public final void addVisibilityChangeListener(pn50 listener) {
        this.visibilityListeners.add(listener);
    }

    public final float calcVisibilityPercent() {
        int height;
        if (getChildCount() > 0 && (height = getChildAt(0).getHeight()) != 0) {
            return getHeight() / height;
        }
        return 0.0f;
    }

    public final lls createFullyVisibleViewChecker(View child, Runnable action) {
        return new lls(this, child, action);
    }

    public final boolean hasScrollChangeListener(nn50 listener) {
        return this.scrollListeners.contains(listener);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.fixChildRequestIntercept && ev.getAction() == 0 && hasNestedScrollingParent()) {
            stopNestedScroll();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.maxHeight;
        if (i != Integer.MAX_VALUE) {
            heightMeasureSpec = resolveHeightMeasureSpec(heightMeasureSpec, i);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        Iterator<nn50> it = this.scrollListeners.iterator();
        while (it.hasNext()) {
            it.next().a(this, l, t, oldl, oldt);
        }
        reportScrolled(t, oldt, new d240(21, this));
    }

    public final void removeScrollChangeListener(nn50 listener) {
        this.scrollListeners.remove(listener);
    }

    public final void removeVisibilityChangeListener(pn50 listener) {
        this.visibilityListeners.remove(listener);
    }

    public void reportScrolled(int i, int i2, sls slsVar) {
        f32 f32Var;
        ScrollDirection scrollDirection = i > i2 ? ScrollDirection.DOWN : ScrollDirection.UP;
        nhp0 nhp0Var = u94.W0;
        if (nhp0Var.a == scrollDirection || (f32Var = (f32) xw31.f(this)) == null) {
            return;
        }
        ohp0 scrollDirectionListener = f32Var.getScrollDirectionListener();
        e32 analyticsContext = f32Var.getAnalyticsContext();
        scrollDirectionListener.e(analyticsContext, f32Var.getEventAnalyticsParams(new hay(11)), (String) slsVar.invoke(), scrollDirection);
        nhp0Var.a = scrollDirection;
    }

    public final void setFixChildRequestIntercept(boolean fixChildRequestIntercept) {
        this.fixChildRequestIntercept = fixChildRequestIntercept;
    }

    public final void setScrollAnalyticsName(String scrollAnalyticsName) {
        this.scrollAnalyticsName = scrollAnalyticsName;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        boolean z = visibility != getVisibility();
        super.setVisibility(visibility);
        if (z) {
            Iterator<pn50> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                ((tgr0) it.next()).a.processScrollViewVisibilityChanged(visibility);
            }
        }
    }

    public NestedScrollViewAdvanced(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NestedScrollViewAdvanced(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NestedScrollViewAdvanced(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
