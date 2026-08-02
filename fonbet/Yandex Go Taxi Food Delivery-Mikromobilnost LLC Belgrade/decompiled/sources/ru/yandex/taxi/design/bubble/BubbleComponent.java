package ru.yandex.taxi.design.bubble;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cma1;
import defpackage.g7h;
import defpackage.kdc;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.qm6;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ7\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010-J#\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b*\u00100J+\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010,\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b*\u00101R*\u00104\u001a\u0002022\u0006\u00103\u001a\u0002028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010?\u001a\u0004\u0018\u00010:2\b\u00103\u001a\u0004\u0018\u00010:8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/yandex/taxi/design/bubble/BubbleComponent;", "Landroid/view/ViewGroup;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "checkElementsCount", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "withAnim", "show", "(Z)V", "hide", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lqm6;", "value", "decorator", "Lqm6;", "getDecorator", "()Lqm6;", "setDecorator", "(Lqm6;)V", "Lkdc;", "getBubbleColor", "()Lkdc;", "setBubbleColor", "(Lkdc;)V", "bubbleColor", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class BubbleComponent extends ViewGroup implements nwy0 {
    private qm6 decorator;

    public BubbleComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g7h g7hVar = new g7h(context);
        g7hVar.z = this;
        this.decorator = g7hVar;
        applyAttrs(context, attributeSet);
    }

    private final void applyAttrs(Context context, AttributeSet attrs) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, c4i0.BubbleComponent, 0, 0);
        try {
            if (obtainStyledAttributes.getBoolean(c4i0.BubbleComponent_use_bg_main, false)) {
                setBubbleColor(new bdc(xng0.bgMain));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void checkElementsCount() {
        if (getChildCount() <= 0) {
            return;
        }
        ny61.r("BubbleComponent can host only one direct child");
    }

    public static /* synthetic */ void hide$default(BubbleComponent bubbleComponent, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: hide");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        bubbleComponent.hide(z);
    }

    public static /* synthetic */ void show$default(BubbleComponent bubbleComponent, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: show");
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        bubbleComponent.show(z);
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        checkElementsCount();
        super.addView(child);
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean allowTraverse() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.decorator.applyTheme();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.decorator.a(canvas, getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        super.dispatchDraw(canvas);
    }

    public final kdc getBubbleColor() {
        return this.decorator.e();
    }

    public final qm6 getDecorator() {
        return this.decorator;
    }

    public void hide(boolean withAnim) {
        if (withAnim) {
            cma1.L(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
        Rect c = this.decorator.c();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft() + c.left;
            int paddingTop = getPaddingTop() + c.top;
            childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Rect c = this.decorator.c();
        int i = c.left + c.right;
        int i2 = c.top + c.bottom;
        if (getChildCount() <= 0) {
            setMeasuredDimension(i + paddingRight, i2 + paddingBottom);
            return;
        }
        View childAt = getChildAt(0);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - i) - paddingRight, mode);
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec((size2 - i2) - paddingBottom, mode2);
        }
        childAt.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(childAt.getMeasuredWidth() + paddingRight + i, childAt.getMeasuredHeight() + paddingBottom + i2);
    }

    public final void setBubbleColor(kdc kdcVar) {
        this.decorator.b(kdcVar);
    }

    public final void setDecorator(qm6 qm6Var) {
        this.decorator.detach();
        this.decorator = qm6Var;
        qm6Var.d(this);
    }

    public void show(boolean withAnim) {
        if (withAnim) {
            cma1.J(this);
        } else {
            setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        checkElementsCount();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        checkElementsCount();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        checkElementsCount();
        super.addView(child, index, params);
    }

    public BubbleComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BubbleComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BubbleComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
