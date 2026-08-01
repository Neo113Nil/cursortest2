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
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0276r0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f4006a;

    /* renamed from: b, reason: collision with root package name */
    public int f4007b;

    /* renamed from: c, reason: collision with root package name */
    public int f4008c;

    /* renamed from: d, reason: collision with root package name */
    public int f4009d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f4010f;

    /* renamed from: g, reason: collision with root package name */
    public C0273p0 f4011g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4012h;
    public final boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public R.d f4013k;

    /* renamed from: l, reason: collision with root package name */
    public B0.j f4014l;

    public C0276r0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4006a = new Rect();
        this.f4007b = 0;
        this.f4008c = 0;
        this.f4009d = 0;
        this.e = 0;
        this.i = z2;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z2;
        boolean z3;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z4 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z4) {
                        this.j = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f4010f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        R.d dVar = this.f4013k;
                        if (dVar != null) {
                            if (dVar.f1001p) {
                                dVar.d();
                            }
                            dVar.f1001p = false;
                        }
                    } else {
                        if (this.f4013k == null) {
                            this.f4013k = new R.d(this);
                        }
                        R.d dVar2 = this.f4013k;
                        boolean z5 = dVar2.f1001p;
                        dVar2.f1001p = true;
                        dVar2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f4010f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z2) {
                }
                return z2;
            }
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z4 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.j = true;
                int i2 = Build.VERSION.SDK_INT;
                AbstractC0267m0.a(this, f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f4010f;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f4010f = pointToPosition;
                AbstractC0267m0.a(childAt3, f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z6 = (selector == null || pointToPosition == -1) ? false : true;
                if (z6) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f4006a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f4007b;
                rect.top -= this.f4008c;
                rect.right += this.f4009d;
                rect.bottom += this.e;
                if (i2 >= 33) {
                    z3 = AbstractC0271o0.a(this);
                } else {
                    Field field = AbstractC0275q0.f4001a;
                    if (field != null) {
                        try {
                            z3 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z3 = false;
                }
                if (childAt3.isEnabled() != z3) {
                    boolean z7 = !z3;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC0271o0.b(this, z7);
                    } else {
                        Field field2 = AbstractC0275q0.f4001a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z7));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z6) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f2, f3);
                }
                C0273p0 c0273p0 = this.f4011g;
                if (c0273p0 != null) {
                    c0273p0.f3997b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z4 = false;
            }
            if (z2) {
            }
            this.j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f4010f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.j = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f4010f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4006a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4014l != null) {
            return;
        }
        super.drawableStateChanged();
        C0273p0 c0273p0 = this.f4011g;
        if (c0273p0 != null) {
            c0273p0.f3997b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.i && this.f4012h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4014l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4014l == null) {
            B0.j jVar = new B0.j(12, this);
            this.f4014l = jVar;
            post(jVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !AbstractC0269n0.f3991d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0269n0.f3988a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0269n0.f3989b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0269n0.f3990c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.j && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4010f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        B0.j jVar = this.f4014l;
        if (jVar != null) {
            C0276r0 c0276r0 = (C0276r0) jVar.f53b;
            c0276r0.f4014l = null;
            c0276r0.removeCallbacks(jVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f4012h = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0273p0 c0273p0 = null;
        if (drawable != null) {
            C0273p0 c0273p02 = new C0273p0();
            Drawable drawable2 = c0273p02.f3996a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0273p02.f3996a = drawable;
            drawable.setCallback(c0273p02);
            c0273p02.f3997b = true;
            c0273p0 = c0273p02;
        }
        this.f4011g = c0273p0;
        super.setSelector(c0273p0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4007b = rect.left;
        this.f4008c = rect.top;
        this.f4009d = rect.right;
        this.e = rect.bottom;
    }
}
