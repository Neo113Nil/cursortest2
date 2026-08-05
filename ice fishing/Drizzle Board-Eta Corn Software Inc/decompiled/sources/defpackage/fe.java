package defpackage;

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
import com.kolosta.rejin.jilosa.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class fe extends ListView {
    public int MdtA4re8;
    public final Rect NCTxEWno;
    public i1 OnDfzHZD;
    public int P7K7Inc8;
    public de Qr9iLBAD;
    public int VgvYg0wo;
    public int b2ZJblxo;
    public final boolean eVhOlqcC;
    public boolean jb9XjC4I;
    public boolean k3x7lurq;
    public yp ow5vqvCr;
    public int wxUZMvaN;

    public fe(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.NCTxEWno = new Rect();
        this.MdtA4re8 = 0;
        this.wxUZMvaN = 0;
        this.VgvYg0wo = 0;
        this.P7K7Inc8 = 0;
        this.eVhOlqcC = z;
        setCacheColorHint(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean NCTxEWno(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = true;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z3 = false;
                    if (z || z3) {
                        this.k3x7lurq = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.b2ZJblxo - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    yp ypVar = this.ow5vqvCr;
                    if (!z) {
                        if (ypVar == null) {
                            ypVar = new yp(this);
                            this.ow5vqvCr = ypVar;
                        }
                        ypVar.sjUBp5pO = true;
                        ypVar.onTouch(this, motionEvent);
                    } else if (ypVar != null) {
                        if (ypVar.sjUBp5pO) {
                            ypVar.wxUZMvaN();
                        }
                        ypVar.sjUBp5pO = false;
                    }
                    return z;
                }
                z = false;
                z3 = false;
                if (z) {
                }
                this.k3x7lurq = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.b2ZJblxo - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                yp ypVar2 = this.ow5vqvCr;
                if (!z) {
                }
                return z;
            }
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.k3x7lurq = true;
                ae.qoPGr6Ce(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.b2ZJblxo;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.b2ZJblxo = pointToPosition;
                ae.qoPGr6Ce(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z4 = (selector == null || pointToPosition == -1) ? false : true;
                if (z4) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.NCTxEWno;
                rect.set(left, top, right, bottom);
                rect.left -= this.MdtA4re8;
                rect.top -= this.wxUZMvaN;
                rect.right += this.VgvYg0wo;
                rect.bottom += this.P7K7Inc8;
                if (Build.VERSION.SDK_INT >= 33) {
                    z2 = ce.qoPGr6Ce(this);
                } else {
                    Field field = ee.qoPGr6Ce;
                    if (field != null) {
                        try {
                            z2 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z2 = false;
                }
                if (childAt3.isEnabled() != z2) {
                    boolean z5 = !z2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        ce.NCTxEWno(this, z5);
                    } else {
                        Field field2 = ee.qoPGr6Ce;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z5));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z4) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                de deVar = this.Qr9iLBAD;
                if (deVar != null) {
                    deVar.MdtA4re8 = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = false;
                z = true;
            }
            if (z) {
            }
            this.k3x7lurq = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.b2ZJblxo - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            yp ypVar22 = this.ow5vqvCr;
            if (!z) {
            }
            return z;
        }
        z = false;
        z3 = false;
        if (z) {
        }
        this.k3x7lurq = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.b2ZJblxo - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        yp ypVar222 = this.ow5vqvCr;
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.NCTxEWno;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.OnDfzHZD != null) {
            return;
        }
        super.drawableStateChanged();
        de deVar = this.Qr9iLBAD;
        if (deVar != null) {
            deVar.MdtA4re8 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.k3x7lurq && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.eVhOlqcC || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.eVhOlqcC || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.eVhOlqcC || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.eVhOlqcC && this.jb9XjC4I) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.OnDfzHZD = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.OnDfzHZD == null) {
            i1 i1Var = new i1(4, this);
            this.OnDfzHZD = i1Var;
            post(i1Var);
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
                if (i < 30 || !be.wxUZMvaN) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        be.qoPGr6Ce.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        be.NCTxEWno.invoke(this, Integer.valueOf(pointToPosition));
                        be.MdtA4re8.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.k3x7lurq && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.b2ZJblxo = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        i1 i1Var = this.OnDfzHZD;
        if (i1Var != null) {
            fe feVar = (fe) i1Var.MdtA4re8;
            feVar.OnDfzHZD = null;
            feVar.removeCallbacks(i1Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final int qoPGr6Ce(int i, int i2) {
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

    public void setListSelectionHidden(boolean z) {
        this.jb9XjC4I = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        de deVar = null;
        if (drawable != null) {
            de deVar2 = new de();
            Drawable drawable2 = deVar2.NCTxEWno;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            deVar2.NCTxEWno = drawable;
            drawable.setCallback(deVar2);
            deVar2.MdtA4re8 = true;
            deVar = deVar2;
        }
        this.Qr9iLBAD = deVar;
        super.setSelector(deVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.MdtA4re8 = rect.left;
        this.wxUZMvaN = rect.top;
        this.VgvYg0wo = rect.right;
        this.P7K7Inc8 = rect.bottom;
    }
}
