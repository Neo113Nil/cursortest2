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
import com.icecatchbiger.hookfrostmaster.R;
import java.lang.reflect.Field;
import q.AbstractC0227a;

/* renamed from: h.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0150A extends ListView {

    /* renamed from: e, reason: collision with root package name */
    public final Rect f2061e;

    /* renamed from: f, reason: collision with root package name */
    public int f2062f;

    /* renamed from: g, reason: collision with root package name */
    public int f2063g;

    /* renamed from: h, reason: collision with root package name */
    public int f2064h;

    /* renamed from: i, reason: collision with root package name */
    public int f2065i;

    /* renamed from: j, reason: collision with root package name */
    public int f2066j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f2067k;

    /* renamed from: l, reason: collision with root package name */
    public C0181z f2068l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2069m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2070n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2071o;

    /* renamed from: p, reason: collision with root package name */
    public A.g f2072p;

    /* renamed from: q, reason: collision with root package name */
    public A.b f2073q;

    public AbstractC0150A(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f2061e = new Rect();
        this.f2062f = 0;
        this.f2063g = 0;
        this.f2064h = 0;
        this.f2065i = 0;
        this.f2070n = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f2067k = declaredField;
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
                        this.f2071o = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f2066j - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z2) {
                        A.g gVar = this.f2072p;
                        if (gVar != null) {
                            if (gVar.f27p) {
                                gVar.d();
                            }
                            gVar.f27p = false;
                        }
                    } else {
                        if (this.f2072p == null) {
                            this.f2072p = new A.g(this);
                        }
                        A.g gVar2 = this.f2072p;
                        boolean z4 = gVar2.f27p;
                        gVar2.f27p = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z2;
                }
                z2 = false;
                if (z2) {
                }
                this.f2071o = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f2066j - getFirstVisiblePosition());
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
                this.f2071o = true;
                drawableHotspotChanged(f2, f3);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f2066j;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f2066j = pointToPosition;
                childAt3.drawableHotspotChanged(f2 - childAt3.getLeft(), f3 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                Field field = this.f2067k;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f2061e;
                rect.set(left, top, right, bottom);
                rect.left -= this.f2062f;
                rect.top -= this.f2063g;
                rect.right += this.f2064h;
                rect.bottom += this.f2065i;
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
                    AbstractC0227a.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC0227a.e(selector2, f2, f3);
                }
                C0181z c0181z = this.f2068l;
                if (c0181z != null) {
                    c0181z.f2322f = false;
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
            this.f2071o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f2066j - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z2) {
            }
            return z2;
        }
        z2 = false;
        if (z2) {
        }
        this.f2071o = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f2066j - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f2061e;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f2073q != null) {
            return;
        }
        super.drawableStateChanged();
        C0181z c0181z = this.f2068l;
        if (c0181z != null) {
            c0181z.f2322f = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f2071o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f2070n || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f2070n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f2070n || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f2070n && this.f2069m) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f2073q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2073q == null) {
            A.b bVar = new A.b(4, this);
            this.f2073q = bVar;
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
                if (selector != null && this.f2071o && isPressed()) {
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
            this.f2066j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        A.b bVar = this.f2073q;
        if (bVar != null) {
            AbstractC0150A abstractC0150A = (AbstractC0150A) bVar.f10f;
            abstractC0150A.f2073q = null;
            abstractC0150A.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f2069m = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0181z c0181z = null;
        if (drawable != null) {
            C0181z c0181z2 = new C0181z();
            Drawable drawable2 = c0181z2.f2321e;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c0181z2.f2321e = drawable;
            drawable.setCallback(c0181z2);
            c0181z2.f2322f = true;
            c0181z = c0181z2;
        }
        this.f2068l = c0181z;
        super.setSelector(c0181z);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2062f = rect.left;
        this.f2063g = rect.top;
        this.f2064h = rect.right;
        this.f2065i = rect.bottom;
    }
}
