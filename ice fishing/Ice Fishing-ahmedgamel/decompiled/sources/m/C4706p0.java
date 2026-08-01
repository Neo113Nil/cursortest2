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
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4706p0 extends ListView {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39199A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f39200B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39201C;

    /* renamed from: D, reason: collision with root package name */
    public U.g f39202D;

    /* renamed from: E, reason: collision with root package name */
    public G0.c f39203E;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f39204n;

    /* renamed from: u, reason: collision with root package name */
    public int f39205u;

    /* renamed from: v, reason: collision with root package name */
    public int f39206v;

    /* renamed from: w, reason: collision with root package name */
    public int f39207w;

    /* renamed from: x, reason: collision with root package name */
    public int f39208x;

    /* renamed from: y, reason: collision with root package name */
    public int f39209y;

    /* renamed from: z, reason: collision with root package name */
    public C4702n0 f39210z;

    public C4706p0(Context context, boolean z3) {
        super(context, null, C5275R.attr.dropDownListViewStyle);
        this.f39204n = new Rect();
        this.f39205u = 0;
        this.f39206v = 0;
        this.f39207w = 0;
        this.f39208x = 0;
        this.f39200B = z3;
        setCacheColorHint(0);
    }

    public final int a(int i, int i6) {
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
            if (i9 >= i6) {
                return i6;
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
        boolean z3;
        boolean z6;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z9 = false;
        if (actionMasked == 1) {
            z3 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z3 = true;
                    if (z3 || z9) {
                        this.f39201C = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f39209y - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        U.g gVar = this.f39202D;
                        if (gVar != null) {
                            if (gVar.f3118I) {
                                gVar.d();
                            }
                            gVar.f3118I = false;
                        }
                    } else {
                        if (this.f39202D == null) {
                            this.f39202D = new U.g(this);
                        }
                        U.g gVar2 = this.f39202D;
                        boolean z10 = gVar2.f3118I;
                        gVar2.f3118I = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f39201C = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f39209y - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z3) {
                }
                return z3;
            }
            z3 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x9 = (int) motionEvent.getX(findPointerIndex);
            int y7 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x9, y7);
            if (pointToPosition == -1) {
                z9 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f3 = x9;
                float f9 = y7;
                this.f39201C = true;
                int i6 = Build.VERSION.SDK_INT;
                AbstractC4696k0.a(this, f3, f9);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i9 = this.f39209y;
                if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f39209y = pointToPosition;
                AbstractC4696k0.a(childAt3, f3 - childAt3.getLeft(), f9 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z11 = (selector == null || pointToPosition == -1) ? false : true;
                if (z11) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f39204n;
                rect.set(left, top, right, bottom);
                rect.left -= this.f39205u;
                rect.top -= this.f39206v;
                rect.right += this.f39207w;
                rect.bottom += this.f39208x;
                if (i6 >= 33) {
                    z6 = AbstractC4700m0.a(this);
                } else {
                    Field field = AbstractC4704o0.f39195a;
                    if (field != null) {
                        try {
                            z6 = field.getBoolean(this);
                        } catch (IllegalAccessException e9) {
                            e9.printStackTrace();
                        }
                    }
                    z6 = false;
                }
                if (childAt3.isEnabled() != z6) {
                    boolean z12 = !z6;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC4700m0.b(this, z12);
                    } else {
                        Field field2 = AbstractC4704o0.f39195a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z12));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z11) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    H.a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    H.a.e(selector2, f3, f9);
                }
                C4702n0 c4702n0 = this.f39210z;
                if (c4702n0 != null) {
                    c4702n0.f39190u = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = true;
                z9 = false;
            }
            if (z3) {
            }
            this.f39201C = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f39209y - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f39201C = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f39209y - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f39204n;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f39203E != null) {
            return;
        }
        super.drawableStateChanged();
        C4702n0 c4702n0 = this.f39210z;
        if (c4702n0 != null) {
            c4702n0.f39190u = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f39201C && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f39200B || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f39200B || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f39200B || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f39200B && this.f39199A) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f39203E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f39203E == null) {
            G0.c cVar = new G0.c(27, this);
            this.f39203E = cVar;
            post(cVar);
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
                if (i < 30 || !AbstractC4698l0.f39182d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC4698l0.f39179a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC4698l0.f39180b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC4698l0.f39181c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f39201C && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39209y = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        G0.c cVar = this.f39203E;
        if (cVar != null) {
            C4706p0 c4706p0 = (C4706p0) cVar.f1031u;
            c4706p0.f39203E = null;
            c4706p0.removeCallbacks(cVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f39199A = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C4702n0 c4702n0 = null;
        if (drawable != null) {
            C4702n0 c4702n02 = new C4702n0();
            Drawable drawable2 = c4702n02.f39189n;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c4702n02.f39189n = drawable;
            drawable.setCallback(c4702n02);
            c4702n02.f39190u = true;
            c4702n0 = c4702n02;
        }
        this.f39210z = c4702n0;
        super.setSelector(c4702n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f39205u = rect.left;
        this.f39206v = rect.top;
        this.f39207w = rect.right;
        this.f39208x = rect.bottom;
    }
}
