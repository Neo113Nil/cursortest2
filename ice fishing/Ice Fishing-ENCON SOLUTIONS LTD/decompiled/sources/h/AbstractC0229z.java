package h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.watchfacestudio.spraktum.R;
import java.lang.reflect.Field;
import s.AbstractC1044a;

/* renamed from: h.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0229z extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3372a;

    /* renamed from: b, reason: collision with root package name */
    public int f3373b;

    /* renamed from: c, reason: collision with root package name */
    public int f3374c;

    /* renamed from: d, reason: collision with root package name */
    public int f3375d;

    /* renamed from: e, reason: collision with root package name */
    public int f3376e;

    /* renamed from: f, reason: collision with root package name */
    public int f3377f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f3378g;

    /* renamed from: h, reason: collision with root package name */
    public C0228y f3379h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3380i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3381j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3382k;

    /* renamed from: l, reason: collision with root package name */
    public C.g f3383l;

    /* renamed from: m, reason: collision with root package name */
    public C.b f3384m;

    public AbstractC0229z(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f3372a = new Rect();
        this.f3373b = 0;
        this.f3374c = 0;
        this.f3375d = 0;
        this.f3376e = 0;
        this.f3381j = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f3378g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i2, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i3) {
                return i3;
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i2, MotionEvent motionEvent) {
        int i3;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            i3 = i2;
            z2 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z2 = true;
                    if (z2 || z3) {
                        this.f3382k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f3377f - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        C.g gVar = this.f3383l;
                        if (gVar != null) {
                            if (gVar.f121p) {
                                gVar.d();
                            }
                            gVar.f121p = false;
                        }
                    } else {
                        if (this.f3383l == null) {
                            this.f3383l = new C.g(this);
                        }
                        C.g gVar2 = this.f3383l;
                        boolean z4 = gVar2.f121p;
                        gVar2.f121p = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f3382k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f3377f - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z2) {
                }
                return z2;
            }
            i3 = i2;
            z2 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y2 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y2);
            if (pointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x2;
                float f3 = y2;
                this.f3382k = true;
                drawableHotspotChanged(f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f3377f;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f3377f = pointToPosition;
                childAt3.drawableHotspotChanged(f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                Field field = this.f3378g;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3372a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f3373b;
                rect.top -= this.f3374c;
                rect.right += this.f3375d;
                rect.bottom += this.f3376e;
                try {
                    boolean z6 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z6) {
                        field.set(this, Boolean.valueOf(!z6));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
                if (z5) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC1044a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC1044a.e(selector2, f2, f3);
                }
                C0228y c0228y = this.f3379h;
                if (c0228y != null) {
                    c0228y.f3371b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z2 = true;
                z3 = false;
            }
            if (z2) {
            }
            this.f3382k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f3377f - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f3382k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f3377f - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3372a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3384m != null) {
            return;
        }
        super.drawableStateChanged();
        C0228y c0228y = this.f3379h;
        if (c0228y != null) {
            c0228y.f3371b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3382k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3381j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3381j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3381j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3381j && this.f3380i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3384m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3384m == null) {
            C.b bVar = new C.b(7, this);
            this.f3384m = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3382k && isPressed()) {
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
            this.f3377f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C.b bVar = this.f3384m;
        if (bVar != null) {
            AbstractC0229z abstractC0229z = (AbstractC0229z) bVar.f103b;
            abstractC0229z.f3384m = null;
            abstractC0229z.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f3380i = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0228y c0228y = null;
        if (drawable != null) {
            C0228y c0228y2 = new C0228y();
            Drawable drawable2 = c0228y2.f3370a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0228y2.f3370a = drawable;
            drawable.setCallback(c0228y2);
            c0228y2.f3371b = true;
            c0228y = c0228y2;
        }
        this.f3379h = c0228y;
        super.setSelector(c0228y);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f3373b = rect.left;
        this.f3374c = rect.top;
        this.f3375d = rect.right;
        this.f3376e = rect.bottom;
    }
}
