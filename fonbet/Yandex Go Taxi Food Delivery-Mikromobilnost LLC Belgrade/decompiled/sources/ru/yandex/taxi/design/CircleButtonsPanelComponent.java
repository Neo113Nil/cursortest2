package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.amb1;
import defpackage.aub;
import defpackage.bub;
import defpackage.c4i0;
import defpackage.cub;
import defpackage.iim;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.stb;
import defpackage.tje;
import defpackage.vtb;
import defpackage.xw31;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\tH\u0000¢\u0006\u0004\b$\u0010 J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001cH\u0000¢\u0006\u0004\b&\u0010#J\u0017\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0014¢\u0006\u0004\b)\u0010\fR\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00102\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00106\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00101¨\u0006;"}, d2 = {"Lru/yandex/taxi/design/CircleButtonsPanelComponent;", "Landroid/view/ViewGroup;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "buttonsCount", "getMinButtonsMargin", "(I)I", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onDetachedFromWindow", "()V", "Landroid/view/View;", "child", "index", "addView", "(Landroid/view/View;I)V", "view", "removeView", "(Landroid/view/View;)V", "addViewInternal$design_components", "addViewInternal", "removeViewInternal$design_components", "removeViewInternal", "offset", "getWidthToFitMultiorderCard", "defaultCircleSize", CA20Status.STATUS_USER_I, "Lvtb;", "transitions", "Lvtb;", "fixedWidth", "getMaxMeasuredWidth", "()I", "maxMeasuredWidth", "getMaxMeasuredHeight", "maxMeasuredHeight", "getActualChildCount", "actualChildCount", "getChildWidthSum", "childWidthSum", "Companion", "cub", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class CircleButtonsPanelComponent extends ViewGroup implements nwy0 {
    public static final cub Companion = new cub();
    public static final int MAX_BUTTONS_COUNT = 4;
    private final int defaultCircleSize;
    private int fixedWidth;
    private final vtb transitions;

    public CircleButtonsPanelComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.defaultCircleSize = tje.r(mrg0.circle_buttons_circle_size, getContext());
        this.transitions = new vtb(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.setAnimateParentHierarchy(false);
        setLayoutTransition(layoutTransition);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.CircleButtonsPanelComponent, 0, 0);
        try {
            if (obtainStyledAttributes.getBoolean(c4i0.CircleButtonsPanelComponent_fit_multiorder_card, true)) {
                this.fixedWidth = getWidthToFitMultiorderCard(obtainStyledAttributes.getDimensionPixelOffset(c4i0.CircleButtonsPanelComponent_fit_horizontal_offset, (tje.r(mrg0.order_screens_multi_order_card_side_offset, getContext()) * 2) + tje.r(mrg0.order_screens_card_shadow_padding, getContext())));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _get_actualChildCount_$lambda$0(View view, Integer num) {
        return Integer.valueOf((num != null ? num.intValue() : 0) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _get_childWidthSum_$lambda$0(View view, Integer num) {
        return Integer.valueOf(view.getMeasuredWidth() + (num != null ? num.intValue() : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_childWidthSum_$lambda$1(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _get_maxMeasuredHeight_$lambda$0(View view, Integer num) {
        return Integer.valueOf(Math.max(num != null ? num.intValue() : 0, view.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer _get_maxMeasuredWidth_$lambda$0(View view, Integer num) {
        return Integer.valueOf(Math.max(num != null ? num.intValue() : 0, view.getMeasuredWidth()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int getActualChildCount() {
        Integer num = (Integer) xw31.p(this, 0, new aub(0), new bub((boolean) (null == true ? 1 : 0)), false);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getChildWidthSum() {
        Integer num = (Integer) xw31.p(this, 0, new aub(3), new bub(0), false);
        return getPaddingRight() + getPaddingLeft() + (num != null ? num.intValue() : 0);
    }

    private final int getMaxMeasuredHeight() {
        Integer num = (Integer) xw31.p(this, 0, new aub(1), new bub(false), false);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getMaxMeasuredWidth() {
        Integer num = (Integer) xw31.p(this, 0, new aub(2), new bub(false), false);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getMinButtonsMargin(int buttonsCount) {
        if (buttonsCount == 2) {
            return tje.r(mrg0.circle_buttons_2_button_margin, getContext());
        }
        if (buttonsCount == 3) {
            return tje.r(mrg0.circle_buttons_3_button_margin, getContext());
        }
        if (buttonsCount != 4) {
            return 0;
        }
        return tje.r(mrg0.circle_buttons_4_button_margin, getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer onLayout$lambda$0(int i, CircleButtonsPanelComponent circleButtonsPanelComponent, View view, Integer num) {
        int intValue = num != null ? num.intValue() : 0;
        int measuredWidth = ((i - view.getMeasuredWidth()) / 2) + intValue;
        int measuredWidth2 = view.getMeasuredWidth() + measuredWidth;
        int paddingTop = circleButtonsPanelComponent.getPaddingTop();
        view.layout(measuredWidth, paddingTop, measuredWidth2, view.getMeasuredHeight() + paddingTop);
        return xw31.n(circleButtonsPanelComponent.getContext()) ? Integer.valueOf(intValue - i) : Integer.valueOf(intValue + i);
    }

    private static final void onMeasure$lambda$0(int i, int i2, int i3, int i4, View view) {
        if (i == 0) {
            view.measure(i2, i3);
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i4 / 4, 1073741824), i3);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        vtb vtbVar = this.transitions;
        CircleButtonsPanelComponent circleButtonsPanelComponent = vtbVar.a;
        if ((index == 0 || index == circleButtonsPanelComponent.getChildCount()) && child.getVisibility() == 0) {
            vtbVar.c(new stb(vtbVar, child, index, 0));
            return;
        }
        int childCount = circleButtonsPanelComponent.getChildCount();
        if (index > childCount) {
            index = childCount;
        }
        circleButtonsPanelComponent.addViewInternal$design_components(child, index);
    }

    public final void addViewInternal$design_components(View child, int index) {
        super.addView(child, index);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public int getWidthToFitMultiorderCard(int offset) {
        Context context = getContext();
        Rect rect = xw31.a;
        return context.getResources().getDisplayMetrics().widthPixels - offset;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vtb vtbVar = this.transitions;
        ConcurrentHashMap concurrentHashMap = vtbVar.b;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            View view = (View) entry.getKey();
            Animator animator = (Animator) entry.getValue();
            vtbVar.a.endViewTransition(view);
            animator.cancel();
        }
        concurrentHashMap.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int actualChildCount = getActualChildCount();
        if (actualChildCount == 0) {
            return;
        }
        int i = r - l;
        int maxMeasuredWidth = getMaxMeasuredWidth();
        int minButtonsMargin = getMinButtonsMargin(actualChildCount) + this.defaultCircleSize;
        if (maxMeasuredWidth < minButtonsMargin) {
            maxMeasuredWidth = i - (minButtonsMargin * actualChildCount) > 0 ? minButtonsMargin : i / actualChildCount;
        }
        xw31.p(this, Integer.valueOf(xw31.n(getContext()) ? ((i - ((i - (actualChildCount * maxMeasuredWidth)) / 2)) - getPaddingStart()) - maxMeasuredWidth : ((i - (actualChildCount * maxMeasuredWidth)) / 2) + getPaddingLeft()), new iim(maxMeasuredWidth, this, 2), new bub(4), true);
        vtb vtbVar = this.transitions;
        amb1 amb1Var = vtbVar.d;
        if (amb1Var != null) {
            vtbVar.a(amb1Var);
            vtbVar.d = null;
        }
        amb1 amb1Var2 = vtbVar.e;
        if (amb1Var2 != null) {
            vtbVar.a(amb1Var2);
            vtbVar.e = null;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode;
        if (getChildCount() == 0) {
            super.setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int i = this.fixedWidth;
        if (i > 0) {
            mode = 1073741824;
        } else {
            i = View.MeasureSpec.getSize(widthMeasureSpec);
            mode = View.MeasureSpec.getMode(widthMeasureSpec);
        }
        Rect rect = xw31.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                onMeasure$lambda$0(mode, widthMeasureSpec, heightMeasureSpec, i, childAt);
            }
        }
        if (mode != 1073741824) {
            i = getChildWidthSum();
        }
        if (mode2 != 1073741824) {
            size = getPaddingBottom() + getPaddingTop() + getMaxMeasuredHeight();
        }
        setMeasuredDimension(i, size);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        vtb vtbVar = this.transitions;
        CircleButtonsPanelComponent circleButtonsPanelComponent = vtbVar.a;
        if (view == null) {
            return;
        }
        int indexOfChild = circleButtonsPanelComponent.indexOfChild(view);
        int i = 1;
        if (indexOfChild == 0 || indexOfChild == circleButtonsPanelComponent.getChildCount() - 1) {
            vtbVar.c(new stb(vtbVar, view, indexOfChild, i));
        } else {
            circleButtonsPanelComponent.removeViewInternal$design_components(view);
        }
    }

    public final void removeViewInternal$design_components(View view) {
        super.removeView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircleButtonsPanelComponent(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CircleButtonsPanelComponent(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
