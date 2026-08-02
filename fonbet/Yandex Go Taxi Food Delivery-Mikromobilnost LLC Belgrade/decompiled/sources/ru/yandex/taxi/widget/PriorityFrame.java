package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import defpackage.c4i0;
import defpackage.cma1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lru/yandex/taxi/widget/PriorityFrame;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "updateState", "()Z", "index", "getPriority", "(I)I", "isHidden", "(I)Z", "Lru/yandex/taxi/widget/PriorityFrame$LayoutParams;", "getChildLayoutParams", "(I)Lru/yandex/taxi/widget/PriorityFrame$LayoutParams;", "Lzy11;", "requestLayout", "()V", "Landroid/view/ViewGroup$LayoutParams;", "p", "checkLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Z", "lp", "generateLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "Companion", "LayoutParams", "ru/yandex/taxi/widget/g", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PriorityFrame extends FrameLayout {
    public static final g Companion = new g();

    public /* synthetic */ PriorityFrame(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final LayoutParams getChildLayoutParams(int index) {
        ViewGroup.LayoutParams layoutParams = getChildAt(index).getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            return (LayoutParams) layoutParams;
        }
        return null;
    }

    private final int getPriority(int index) {
        LayoutParams childLayoutParams = getChildLayoutParams(index);
        if (childLayoutParams == null) {
            return Integer.MIN_VALUE;
        }
        return childLayoutParams.getPriority();
    }

    public static final boolean hide(View view) {
        Companion.getClass();
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof PriorityFrame)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        ((LayoutParams) layoutParams).setHidden(true);
        return ((PriorityFrame) parent).updateState();
    }

    private final boolean isHidden(int index) {
        LayoutParams childLayoutParams = getChildLayoutParams(index);
        if (childLayoutParams == null) {
            return true;
        }
        return childLayoutParams.getHidden();
    }

    public static final boolean remove(View view) {
        Companion.getClass();
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof PriorityFrame)) {
            return false;
        }
        PriorityFrame priorityFrame = (PriorityFrame) parent;
        if (priorityFrame.indexOfChild(view) == -1) {
            return false;
        }
        priorityFrame.removeView(view);
        return true;
    }

    public static final boolean restore(View view) {
        Companion.getClass();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof PriorityFrame) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).setHidden(false);
                    return ((PriorityFrame) parent).updateState();
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateState() {
        int i = 0;
        if (getChildCount() == 0) {
            return false;
        }
        int priority = getPriority(0);
        int childCount = getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            if (isHidden(i2)) {
                cma1.L(getChildAt(i2));
            } else {
                int priority2 = getPriority(i2);
                if (priority2 > priority) {
                    cma1.L(getChildAt(i2 - 1));
                    i = i2;
                    priority = priority2;
                } else {
                    cma1.L(getChildAt(i2));
                }
            }
        }
        if (isHidden(i)) {
            cma1.L(getChildAt(i));
            return true;
        }
        cma1.J(getChildAt(i));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return lp instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) lp) : new LayoutParams(lp);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        updateState();
    }

    public PriorityFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PriorityFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PriorityFrame(Context context) {
        this(context, null, 0, 6, null);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/widget/PriorityFrame$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", "gravity", "(III)V", "source", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/ViewGroup$MarginLayoutParams;", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "priority", "getPriority", "()I", "setPriority", "(I)V", "hidden", "", "getHidden", "()Z", "setHidden", "(Z)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LayoutParams extends FrameLayout.LayoutParams {
        private boolean hidden;
        private int priority;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.PriorityFrame_Layout);
            this.priority = obtainStyledAttributes.getInt(c4i0.PriorityFrame_Layout_layout_priority, 0);
            obtainStyledAttributes.recycle();
        }

        public final boolean getHidden() {
            return this.hidden;
        }

        public final int getPriority() {
            return this.priority;
        }

        public final void setHidden(boolean z) {
            this.hidden = z;
        }

        public final void setPriority(int i) {
            this.priority = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }
}
