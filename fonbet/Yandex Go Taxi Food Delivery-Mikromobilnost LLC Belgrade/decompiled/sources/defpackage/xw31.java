package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import ru.yandex.taxi.widget.Views$doOnLayoutChange$listener$1;

/* loaded from: classes10.dex */
public abstract class xw31 {
    public static final Rect a = new Rect();

    static {
        new Size(0, 0);
    }

    public static final void A(int i, View view) {
        E(view, Integer.valueOf(i), null, Integer.valueOf(i), null);
    }

    public static final void B(int i, View view) {
        I(view, Integer.valueOf(i), null, Integer.valueOf(i), null);
    }

    public static final void C(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof GridLayout.LayoutParams) {
            ((GridLayout.LayoutParams) layoutParams).setGravity(i);
        } else {
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                ny61.g("parent ViewGroup doesn't support layout_gravity");
                return;
            }
            ((CoordinatorLayout.LayoutParams) layoutParams).gravity = i;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void D(int i, View view) {
        E(view, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
    }

    public static final void E(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams g = g(view);
        g.setMargins(num != null ? num.intValue() : g.leftMargin, num2 != null ? num2.intValue() : g.topMargin, num3 != null ? num3.intValue() : g.rightMargin, num4 != null ? num4.intValue() : g.bottomMargin);
        view.requestLayout();
    }

    public static final void F(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.MarginLayoutParams g = g(view);
        if (num != null) {
            g.setMarginStart(num.intValue());
        }
        if (num3 != null) {
            g.setMarginEnd(num3.intValue());
        }
        if (num2 != null) {
            g.topMargin = num2.intValue();
        }
        if (num4 != null) {
            g.bottomMargin = num4.intValue();
        }
        view.requestLayout();
    }

    public static final void G(int i, View view) {
        I(view, Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i));
    }

    public static final void H(View view, Rect rect) {
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void I(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        view.setPadding(num != null ? num.intValue() : view.getPaddingLeft(), num2 != null ? num2.intValue() : view.getPaddingTop(), num3 != null ? num3.intValue() : view.getPaddingRight(), num4 != null ? num4.intValue() : view.getPaddingBottom());
    }

    public static final void J(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        view.setPaddingRelative(num != null ? num.intValue() : view.getPaddingStart(), num2 != null ? num2.intValue() : view.getPaddingTop(), num3 != null ? num3.intValue() : view.getPaddingEnd(), num4 != null ? num4.intValue() : view.getPaddingBottom());
    }

    public static final void K(int i, View view) {
        F(view, Integer.valueOf(i), null, null, null);
    }

    public static final void L(int i, View view) {
        E(view, null, Integer.valueOf(i), null, null);
    }

    public static final void M(int i, View view) {
        I(view, null, Integer.valueOf(i), null, null);
    }

    public static final void N(int i, View view) {
        I(view, null, Integer.valueOf(i), null, Integer.valueOf(i));
    }

    public static final void a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            return;
        }
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        } else {
            xby.d.x(new UnsupportedOperationException("no detach from root view supported"), String.format("Failed to detach %s from %s", Arrays.copyOf(new Object[]{view, parent}, 2)));
        }
    }

    public static final int b(int i, Context context) {
        return context.getResources().getDimensionPixelSize(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnLayoutChangeListener, ru.yandex.taxi.widget.Views$doOnLayoutChange$listener$1] */
    public static final Views$doOnLayoutChange$listener$1 c(View view, final Runnable runnable) {
        ?? r0 = new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.widget.Views$doOnLayoutChange$listener$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View v1, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                v1.removeOnLayoutChangeListener(this);
                runnable.run();
            }
        };
        view.addOnLayoutChangeListener(r0);
        return r0;
    }

    public static final ViewGroup d(ViewGroup viewGroup, Predicate predicate) {
        if (viewGroup != null) {
            return e(viewGroup, predicate);
        }
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            return e((ViewGroup) parent, predicate);
        }
        return null;
    }

    public static ViewGroup e(ViewGroup viewGroup, Predicate predicate) {
        if (predicate.test(viewGroup)) {
            return viewGroup;
        }
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            return e((ViewGroup) parent, predicate);
        }
        return null;
    }

    public static final ViewParent f(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (f32.class.isAssignableFrom(parent.getClass())) {
                return parent;
            }
        }
        return null;
    }

    public static ViewGroup.MarginLayoutParams g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        ny61.g("parent ViewGroup doesn't support margins");
        return null;
    }

    public static final Rect h(View view) {
        return new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final boolean i(View view) {
        Rect rect = a;
        return view.getGlobalVisibleRect(rect) && rect.width() == view.getWidth() && rect.height() == view.getHeight();
    }

    public static final boolean j(View view) {
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean k(Context context) {
        return !n(context);
    }

    public static final boolean l(int i, int i2, int i3, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        return i >= i4 - i3 && i <= (i4 + view.getWidth()) + i3 && i2 >= i5 - i3 && i2 <= (i5 + view.getHeight()) + i3;
    }

    public static final boolean m(View view, MotionEvent motionEvent) {
        return l((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), 0, view);
    }

    public static final boolean n(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final boolean o(View view, View view2, MotionEvent motionEvent) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect);
        view.getGlobalVisibleRect(rect2);
        return rect.contains(((int) motionEvent.getX()) + rect2.left, ((int) motionEvent.getY()) + rect2.top);
    }

    public static final Object p(ViewGroup viewGroup, Integer num, BiFunction biFunction, Predicate predicate, boolean z) {
        if (!z || !n(viewGroup.getContext())) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            Object obj = num;
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (predicate.test(childAt)) {
                    obj = biFunction.apply(childAt, obj);
                }
                i++;
                obj = obj;
            }
            return obj;
        }
        int childCount2 = viewGroup.getChildCount();
        Object obj2 = num;
        while (true) {
            childCount2--;
            if (-1 >= childCount2) {
                return obj2;
            }
            View childAt2 = viewGroup.getChildAt(childCount2);
            if (predicate.test(childAt2)) {
                obj2 = biFunction.apply(childAt2, obj2);
            }
            obj2 = obj2;
        }
    }

    public static final void q(ViewGroup viewGroup, Consumer consumer) {
        if (viewGroup.getChildCount() == 0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            consumer.accept(viewGroup.getChildAt(i));
        }
    }

    public static final void r(View view) {
        view.measure(0, 0);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static final Bitmap s(View view) {
        r(view);
        return t(view);
    }

    public static final Bitmap t(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static final int u() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int v() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static final void w(View view) {
        view.setFocusable(true);
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(32768);
    }

    public static final void x(int i, View view) {
        E(view, null, null, null, Integer.valueOf(i));
    }

    public static final void y(int i, View view) {
        I(view, null, null, null, Integer.valueOf(i));
    }

    public static final void z(int i, View view) {
        F(view, null, null, Integer.valueOf(i), null);
    }
}
