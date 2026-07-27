package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4754p0 extends ListView {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39470A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f39471B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39472C;

    /* renamed from: D, reason: collision with root package name */
    public U.g f39473D;

    /* renamed from: E, reason: collision with root package name */
    public F3.C f39474E;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f39475n;

    /* renamed from: u, reason: collision with root package name */
    public int f39476u;

    /* renamed from: v, reason: collision with root package name */
    public int f39477v;

    /* renamed from: w, reason: collision with root package name */
    public int f39478w;

    /* renamed from: x, reason: collision with root package name */
    public int f39479x;

    /* renamed from: y, reason: collision with root package name */
    public int f39480y;

    /* renamed from: z, reason: collision with root package name */
    public C4750n0 f39481z;

    public C4754p0(Context context, boolean z8) {
        super(context, null, C5284R.attr.dropDownListViewStyle);
        this.f39475n = new Rect();
        this.f39476u = 0;
        this.f39477v = 0;
        this.f39478w = 0;
        this.f39479x = 0;
        this.f39471B = z8;
        setCacheColorHint(0);
    }

    public final int a(int i, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i4) {
                return i4;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z8;
        boolean z9;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 1) {
            z8 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z8 = true;
                    if (z8 || z10) {
                        this.f39472C = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f39480y - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z8) {
                        U.g gVar = this.f39473D;
                        if (gVar != null) {
                            if (gVar.f3197I) {
                                gVar.d();
                            }
                            gVar.f3197I = false;
                        }
                    } else {
                        if (this.f39473D == null) {
                            this.f39473D = new U.g(this);
                        }
                        U.g gVar2 = this.f39473D;
                        boolean z11 = gVar2.f3197I;
                        gVar2.f3197I = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z8;
                }
                z8 = false;
                if (z8) {
                }
                this.f39472C = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f39480y - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z8) {
                }
                return z8;
            }
            z8 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x3 = (int) motionEvent.getX(findPointerIndex);
            int y6 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x3, y6);
            if (pointToPosition == -1) {
                z10 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f6 = x3;
                float f9 = y6;
                this.f39472C = true;
                int i4 = Build.VERSION.SDK_INT;
                AbstractC4744k0.a(this, f6, f9);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i9 = this.f39480y;
                if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f39480y = pointToPosition;
                AbstractC4744k0.a(childAt3, f6 - childAt3.getLeft(), f9 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z12 = (selector == null || pointToPosition == -1) ? false : true;
                if (z12) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f39475n;
                rect.set(left, top, right, bottom);
                rect.left -= this.f39476u;
                rect.top -= this.f39477v;
                rect.right += this.f39478w;
                rect.bottom += this.f39479x;
                if (i4 >= 33) {
                    z9 = AbstractC4748m0.a(this);
                } else {
                    Field field = AbstractC4752o0.f39466a;
                    if (field != null) {
                        try {
                            z9 = field.getBoolean(this);
                        } catch (IllegalAccessException e6) {
                            e6.printStackTrace();
                        }
                    }
                    z9 = false;
                }
                if (childAt3.isEnabled() != z9) {
                    boolean z13 = !z9;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC4748m0.b(this, z13);
                    } else {
                        Field field2 = AbstractC4752o0.f39466a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z12) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    H.a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    H.a.e(selector2, f6, f9);
                }
                C4750n0 c4750n0 = this.f39481z;
                if (c4750n0 != null) {
                    c4750n0.f39461u = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z8 = true;
                z10 = false;
            }
            if (z8) {
            }
            this.f39472C = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f39480y - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z8) {
            }
            return z8;
        }
        z8 = false;
        if (z8) {
        }
        this.f39472C = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f39480y - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z8) {
        }
        return z8;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f39475n;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f39474E != null) {
            return;
        }
        super.drawableStateChanged();
        C4750n0 c4750n0 = this.f39481z;
        if (c4750n0 != null) {
            c4750n0.f39461u = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f39472C && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f39471B || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f39471B || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f39471B || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f39471B && this.f39470A) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f39474E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f39474E == null) {
            F3.C c4 = new F3.C(24, this);
            this.f39474E = c4;
            post(c4);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC4746l0.f39453d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC4746l0.f39450a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC4746l0.f39451b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC4746l0.f39452c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f39472C && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39480y = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        F3.C c4 = this.f39474E;
        if (c4 != null) {
            C4754p0 c4754p0 = (C4754p0) c4.f1010u;
            c4754p0.f39474E = null;
            c4754p0.removeCallbacks(c4);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z8) {
        this.f39470A = z8;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C4750n0 c4750n0 = null;
        if (drawable != null) {
            C4750n0 c4750n02 = new C4750n0();
            Drawable drawable2 = c4750n02.f39460n;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c4750n02.f39460n = drawable;
            drawable.setCallback(c4750n02);
            c4750n02.f39461u = true;
            c4750n0 = c4750n02;
        }
        this.f39481z = c4750n0;
        super.setSelector(c4750n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f39476u = rect.left;
        this.f39477v = rect.top;
        this.f39478w = rect.right;
        this.f39479x = rect.bottom;
    }
}
