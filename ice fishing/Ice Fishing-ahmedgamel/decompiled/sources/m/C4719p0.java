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
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: m.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4719p0 extends ListView {

    /* renamed from: A, reason: collision with root package name */
    public boolean f39268A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f39269B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f39270C;

    /* renamed from: D, reason: collision with root package name */
    public U.g f39271D;

    /* renamed from: E, reason: collision with root package name */
    public G0.c f39272E;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f39273n;

    /* renamed from: u, reason: collision with root package name */
    public int f39274u;

    /* renamed from: v, reason: collision with root package name */
    public int f39275v;

    /* renamed from: w, reason: collision with root package name */
    public int f39276w;

    /* renamed from: x, reason: collision with root package name */
    public int f39277x;

    /* renamed from: y, reason: collision with root package name */
    public int f39278y;

    /* renamed from: z, reason: collision with root package name */
    public C4715n0 f39279z;

    public C4719p0(Context context, boolean z6) {
        super(context, null, C5248R.attr.dropDownListViewStyle);
        this.f39273n = new Rect();
        this.f39274u = 0;
        this.f39275v = 0;
        this.f39276w = 0;
        this.f39277x = 0;
        this.f39269B = z6;
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
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return i4;
            }
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z6;
        boolean z9;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 1) {
            z6 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z6 = true;
                    if (z6 || z10) {
                        this.f39270C = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f39278y - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z6) {
                        U.g gVar = this.f39271D;
                        if (gVar != null) {
                            if (gVar.f3235I) {
                                gVar.d();
                            }
                            gVar.f3235I = false;
                        }
                    } else {
                        if (this.f39271D == null) {
                            this.f39271D = new U.g(this);
                        }
                        U.g gVar2 = this.f39271D;
                        boolean z11 = gVar2.f3235I;
                        gVar2.f3235I = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z6;
                }
                z6 = false;
                if (z6) {
                }
                this.f39270C = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f39278y - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z6) {
                }
                return z6;
            }
            z6 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x9 = (int) motionEvent.getX(findPointerIndex);
            int y7 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x9, y7);
            if (pointToPosition == -1) {
                z10 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f2 = x9;
                float f9 = y7;
                this.f39270C = true;
                int i4 = Build.VERSION.SDK_INT;
                AbstractC4709k0.a(this, f2, f9);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i6 = this.f39278y;
                if (i6 != -1 && (childAt = getChildAt(i6 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f39278y = pointToPosition;
                AbstractC4709k0.a(childAt3, f2 - childAt3.getLeft(), f9 - childAt3.getTop());
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
                Rect rect = this.f39273n;
                rect.set(left, top, right, bottom);
                rect.left -= this.f39274u;
                rect.top -= this.f39275v;
                rect.right += this.f39276w;
                rect.bottom += this.f39277x;
                if (i4 >= 33) {
                    z9 = AbstractC4713m0.a(this);
                } else {
                    Field field = AbstractC4717o0.f39264a;
                    if (field != null) {
                        try {
                            z9 = field.getBoolean(this);
                        } catch (IllegalAccessException e9) {
                            e9.printStackTrace();
                        }
                    }
                    z9 = false;
                }
                if (childAt3.isEnabled() != z9) {
                    boolean z13 = !z9;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC4713m0.b(this, z13);
                    } else {
                        Field field2 = AbstractC4717o0.f39264a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z13));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
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
                    H.a.e(selector2, f2, f9);
                }
                C4715n0 c4715n0 = this.f39279z;
                if (c4715n0 != null) {
                    c4715n0.f39259u = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z6 = true;
                z10 = false;
            }
            if (z6) {
            }
            this.f39270C = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f39278y - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z6) {
            }
            return z6;
        }
        z6 = false;
        if (z6) {
        }
        this.f39270C = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f39278y - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z6) {
        }
        return z6;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f39273n;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f39272E != null) {
            return;
        }
        super.drawableStateChanged();
        C4715n0 c4715n0 = this.f39279z;
        if (c4715n0 != null) {
            c4715n0.f39259u = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f39270C && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f39269B || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f39269B || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f39269B || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f39269B && this.f39268A) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f39272E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f39272E == null) {
            G0.c cVar = new G0.c(27, this);
            this.f39272E = cVar;
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
                if (i < 30 || !AbstractC4711l0.f39251d) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC4711l0.f39248a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC4711l0.f39249b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC4711l0.f39250c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f39270C && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f39278y = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        G0.c cVar = this.f39272E;
        if (cVar != null) {
            C4719p0 c4719p0 = (C4719p0) cVar.f1057u;
            c4719p0.f39272E = null;
            c4719p0.removeCallbacks(cVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f39268A = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C4715n0 c4715n0 = null;
        if (drawable != null) {
            C4715n0 c4715n02 = new C4715n0();
            Drawable drawable2 = c4715n02.f39258n;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c4715n02.f39258n = drawable;
            drawable.setCallback(c4715n02);
            c4715n02.f39259u = true;
            c4715n0 = c4715n02;
        }
        this.f39279z = c4715n0;
        super.setSelector(c4715n0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f39274u = rect.left;
        this.f39275v = rect.top;
        this.f39276w = rect.right;
        this.f39277x = rect.bottom;
    }
}
