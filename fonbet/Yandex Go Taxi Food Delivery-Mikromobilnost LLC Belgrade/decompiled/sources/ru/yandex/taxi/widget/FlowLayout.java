package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import defpackage.g4i0;
import defpackage.rqr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000 @2\u00020\u0001:\u0002ABB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0010H\u0004¢\u0006\u0004\b\u001b\u0010\u0012J\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0014J\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0014J\u0015\u0010$\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u0017J\u001f\u0010'\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0014¢\u0006\u0004\b'\u0010(J7\u0010.\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0014¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000100H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u0002042\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u0002042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u00109R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010:R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010:R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010;R*\u0010=\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00108\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b=\u0010;\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010\u001e¨\u0006C"}, d2 = {"Lru/yandex/taxi/widget/FlowLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "from", "to", "emptySpace", "Lzy11;", "alignChildren", "(III)V", "", "isLayoutRTL", "()Z", "getLineSpacing", "()I", "lineSpacing", "setLineSpacing", "(I)V", "getItemSpacing", "itemSpacing", "setItemSpacing", "isSingleLine", "singleLine", "setSingleLine", "(Z)V", "getGravity", "gravity", "setGravity", "getMaxColumns", "maxColumns", "setMaxColumns", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "sizeChanged", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "p", "checkLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Z", "Lru/yandex/taxi/widget/FlowLayout$LayoutParams;", "generateDefaultLayoutParams", "()Lru/yandex/taxi/widget/FlowLayout$LayoutParams;", "generateLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Lru/yandex/taxi/widget/FlowLayout$LayoutParams;", "(Landroid/util/AttributeSet;)Lru/yandex/taxi/widget/FlowLayout$LayoutParams;", CA20Status.STATUS_USER_I, "Z", "value", "fixedColumns", "getFixedColumns", "setFixedColumns", "Companion", "LayoutParams", "rqr", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FlowLayout extends ViewGroup {
    public static final int $stable = 8;
    public static final rqr Companion = new rqr();
    private boolean fixedColumns;
    private int gravity;
    private int itemSpacing;
    private int lineSpacing;
    private int maxColumns;
    private boolean singleLine;

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g4i0.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(g4i0.FlowLayout_lineSpacing, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(g4i0.FlowLayout_itemSpacing, 0);
        this.singleLine = obtainStyledAttributes.getBoolean(g4i0.FlowLayout_android_singleLine, false);
        setFixedColumns(obtainStyledAttributes.getBoolean(g4i0.FlowLayout_fixedColumns, false));
        this.maxColumns = obtainStyledAttributes.getInt(g4i0.FlowLayout_maxColumns, 0);
        this.gravity = Gravity.getAbsoluteGravity(obtainStyledAttributes.getInt(g4i0.FlowLayout_android_gravity, 0), getLayoutDirection());
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[LOOP:0: B:9:0x0032->B:17:0x0059, LOOP_START, PHI: r7 r9
      0x0032: PHI (r7v1 'from' int) = (r7v0 'from' int), (r7v2 'from' int) binds: [B:8:0x0030, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r9v4 'emptySpace' int) = (r9v3 'emptySpace' int), (r9v5 'emptySpace' int) binds: [B:8:0x0030, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void alignChildren(int from, int to, int emptySpace) {
        int i;
        int i2;
        int i3 = this.gravity & 7;
        if (i3 == 1) {
            emptySpace /= 2;
        } else if (i3 != 5) {
            if (i3 != 7) {
                emptySpace = 0;
            } else {
                if (from <= to) {
                    int i4 = from;
                    i2 = 0;
                    while (true) {
                        if (getChildAt(i4).getVisibility() != 8) {
                            i2++;
                        }
                        if (i4 == to) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else {
                    i2 = 0;
                }
                emptySpace /= i2 + 1;
            }
            i = emptySpace;
            if (from <= to) {
                return;
            }
            while (true) {
                if (getChildAt(from).getVisibility() != 8) {
                    ((LayoutParams) getChildAt(from).getLayoutParams()).getRect().offset(isLayoutRTL() ? -emptySpace : emptySpace, 0);
                    emptySpace += i;
                }
                if (from == to) {
                    return;
                } else {
                    from++;
                }
            }
        }
        i = 0;
        if (from <= to) {
        }
    }

    public static final int getMeasuredDimension(int i, int i2, int i3) {
        Companion.getClass();
        return rqr.a(i, i2, i3);
    }

    private final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && (p instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public final boolean getFixedColumns() {
        return this.fixedColumns;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getItemSpacing() {
        return this.itemSpacing;
    }

    public final int getLineSpacing() {
        return this.lineSpacing;
    }

    public final int getMaxColumns() {
        return this.maxColumns;
    }

    /* renamed from: isSingleLine, reason: from getter */
    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean sizeChanged, int left, int top, int right, int bottom) {
        int i;
        int i2;
        int i3;
        int i4;
        if (getChildCount() == 0) {
            return;
        }
        int paddingRight = isLayoutRTL() ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = isLayoutRTL() ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (right - left) - paddingLeft;
        int i6 = i5 - paddingRight;
        int childCount = getChildCount();
        int i7 = paddingRight;
        int i8 = paddingTop;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int marginStart = layoutParams.getMarginStart();
                int marginEnd = layoutParams.getMarginEnd();
                int measuredWidth = childAt.getMeasuredWidth() + i7 + marginStart;
                i = paddingRight;
                if (!this.singleLine && (measuredWidth > i5 || ((i4 = this.maxColumns) > 0 && i11 % i4 == 0 && i9 != 0))) {
                    if (!this.fixedColumns) {
                        alignChildren(i10, i9 - 1, (i6 - i7) + this.itemSpacing + i);
                    }
                    paddingTop = i8 + this.lineSpacing;
                    i7 = i;
                    i10 = i9;
                }
                i11++;
                int i12 = i7 + marginStart;
                int measuredWidth2 = childAt.getMeasuredWidth() + i12;
                i2 = i6;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                i8 = Math.max(i8, measuredHeight);
                if (isLayoutRTL()) {
                    layoutParams.getRect().set(i5 - measuredWidth2, paddingTop, (i5 - i7) - marginStart, measuredHeight);
                } else {
                    layoutParams.getRect().set(i12, paddingTop, measuredWidth2, measuredHeight);
                }
                if (!this.fixedColumns || (i3 = this.maxColumns) <= 0) {
                    i7 += childAt.getMeasuredWidth() + marginStart + marginEnd + this.itemSpacing;
                } else {
                    int i13 = (i2 - ((i3 - 1) * this.itemSpacing)) / i3;
                    alignChildren(i9, i9, i13 - childAt.getMeasuredWidth());
                    i7 += i13 + this.itemSpacing;
                }
            } else {
                i = paddingRight;
                i2 = i6;
            }
            i9++;
            i6 = i2;
            paddingRight = i;
        }
        int i14 = paddingRight;
        int i15 = i6;
        if (!this.fixedColumns) {
            alignChildren(i10, getChildCount() - 1, (i15 - i7) + this.itemSpacing + i14);
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                Rect rect = ((LayoutParams) childAt2.getLayoutParams()).getRect();
                childAt2.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int i7 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        if (!this.fixedColumns || this.maxColumns <= 0 || mode == 0) {
            i = widthMeasureSpec;
        } else {
            int paddingRight = getPaddingRight() + getPaddingLeft() + (((i7 - getPaddingLeft()) - getPaddingRight()) / this.maxColumns);
            int i8 = this.itemSpacing;
            int i9 = this.maxColumns;
            i = View.MeasureSpec.makeMeasureSpec(paddingRight - (((i9 - 1) * i8) / i9), 1073741824);
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = i7 - getPaddingRight();
        int childCount = getChildCount();
        int i10 = paddingTop;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            int i14 = paddingLeft;
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, heightMeasureSpec);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                i3 = i;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i15 = i4;
                if ((childAt.getMeasuredWidth() + i14 + i4 > paddingRight2 || ((i6 = this.maxColumns) > 0 && i13 % i6 == 0 && i11 != 0)) && !getSingleLine()) {
                    int paddingLeft2 = getPaddingLeft();
                    i10 = this.lineSpacing + paddingTop;
                    i14 = paddingLeft2;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i14 + i15;
                i2 = paddingRight2;
                int max = Math.max(paddingTop, childAt.getMeasuredHeight() + i10);
                if (measuredWidth > i12) {
                    i12 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i15 + i5 + this.itemSpacing + i14;
                if (i11 == getChildCount() - 1) {
                    i12 += i5;
                }
                i13++;
                i14 = measuredWidth2;
                paddingTop = max;
            } else {
                i2 = paddingRight2;
                i3 = i;
            }
            i11++;
            paddingLeft = i14;
            i = i3;
            paddingRight2 = i2;
        }
        int paddingRight3 = getPaddingRight() + i12;
        int paddingBottom = getPaddingBottom() + paddingTop;
        Companion.getClass();
        setMeasuredDimension(rqr.a(size, mode, paddingRight3), rqr.a(size2, mode2, paddingBottom));
    }

    public final void setFixedColumns(boolean z) {
        this.fixedColumns = z;
        if (isAttachedToWindow()) {
            requestLayout();
        }
    }

    public final void setGravity(int gravity) {
        this.gravity = gravity;
        requestLayout();
    }

    public final void setItemSpacing(int itemSpacing) {
        this.itemSpacing = itemSpacing;
        requestLayout();
    }

    public final void setLineSpacing(int lineSpacing) {
        this.lineSpacing = lineSpacing;
        requestLayout();
    }

    public final void setMaxColumns(int maxColumns) {
        this.maxColumns = maxColumns;
        requestLayout();
    }

    public final void setSingleLine(boolean singleLine) {
        this.singleLine = singleLine;
        requestLayout();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/widget/FlowLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "source", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "width", "", "height", "(II)V", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "taxi_design", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int $stable = 8;
        private final Rect rect;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rect = new Rect();
        }

        public final Rect getRect() {
            return this.rect;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rect = new Rect();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.rect = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rect = new Rect();
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public FlowLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ FlowLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
