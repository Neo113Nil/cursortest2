package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e0 extends ListView {

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4281g;

    /* renamed from: h, reason: collision with root package name */
    public int f4282h;

    /* renamed from: i, reason: collision with root package name */
    public int f4283i;

    /* renamed from: j, reason: collision with root package name */
    public int f4284j;

    /* renamed from: k, reason: collision with root package name */
    public int f4285k;

    /* renamed from: l, reason: collision with root package name */
    public int f4286l;

    /* renamed from: m, reason: collision with root package name */
    public final Field f4287m;

    /* renamed from: n, reason: collision with root package name */
    public d0 f4288n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4289o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4290p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4291q;

    /* renamed from: r, reason: collision with root package name */
    public l3.e f4292r;

    /* renamed from: s, reason: collision with root package name */
    public b4.g f4293s;

    public e0(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4281g = new Rect();
        this.f4282h = 0;
        this.f4283i = 0;
        this.f4284j = 0;
        this.f4285k = 0;
        this.f4290p = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f4287m = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i12 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i10, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i10) {
        boolean z10;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    if (z10 || z11) {
                        this.f4291q = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f4286l - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z10) {
                        l3.e eVar = this.f4292r;
                        if (eVar != null) {
                            if (eVar.f4148v) {
                                eVar.d();
                            }
                            eVar.f4148v = false;
                        }
                    } else {
                        if (this.f4292r == null) {
                            this.f4292r = new l3.e(this);
                        }
                        l3.e eVar2 = this.f4292r;
                        boolean z12 = eVar2.f4148v;
                        eVar2.f4148v = true;
                        eVar2.onTouch(this, motionEvent);
                    }
                    return z10;
                }
                z10 = false;
                if (z10) {
                }
                this.f4291q = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f4286l - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z10) {
                }
                return z10;
            }
            z10 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex >= 0) {
            int x10 = (int) motionEvent.getX(findPointerIndex);
            int y10 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x10, y10);
            if (pointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f10 = x10;
                float f11 = y10;
                this.f4291q = true;
                drawableHotspotChanged(f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f4286l;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f4286l = pointToPosition;
                childAt3.drawableHotspotChanged(f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || pointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                Field field = this.f4287m;
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f4281g;
                rect.set(left, top, right, bottom);
                rect.left -= this.f4282h;
                rect.top -= this.f4283i;
                rect.right += this.f4284j;
                rect.bottom += this.f4285k;
                try {
                    boolean z14 = field.getBoolean(this);
                    if (childAt3.isEnabled() != z14) {
                        field.set(this, Boolean.valueOf(!z14));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
                if (z13) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                d0 d0Var = this.f4288n;
                if (d0Var != null) {
                    d0Var.f4280h = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z10 = true;
                z11 = false;
            }
            if (z10) {
            }
            this.f4291q = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f4286l - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z10) {
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        this.f4291q = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f4286l - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z10) {
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4281g;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4293s != null) {
            return;
        }
        super.drawableStateChanged();
        d0 d0Var = this.f4288n;
        if (d0Var != null) {
            d0Var.f4280h = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4291q && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4290p || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4290p || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4290p || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4290p && this.f4289o) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4293s = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4293s == null) {
            b4.g gVar = new b4.g(5, this);
            this.f4293s = gVar;
            post(gVar);
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
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4291q && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4286l = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b4.g gVar = this.f4293s;
        if (gVar != null) {
            e0 e0Var = (e0) gVar.f965h;
            e0Var.f4293s = null;
            e0Var.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f4289o = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d0 d0Var = null;
        if (drawable != null) {
            d0 d0Var2 = new d0();
            Drawable drawable2 = d0Var2.f4279g;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            d0Var2.f4279g = drawable;
            drawable.setCallback(d0Var2);
            d0Var2.f4280h = true;
            d0Var = d0Var2;
        }
        this.f4288n = d0Var;
        super.setSelector(d0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4282h = rect.left;
        this.f4283i = rect.top;
        this.f4284j = rect.right;
        this.f4285k = rect.bottom;
    }
}
