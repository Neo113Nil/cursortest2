package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import com.bugsnag.android.Client;
import com.squareup.cash.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class DropDownListView extends ListView {
    public boolean mDrawsInPressedState;
    public final boolean mHijackFocus;
    public boolean mListSelectionHidden;
    public int mMotionPosition;
    public Client.AnonymousClass7 mResolveHoverRunnable;
    public ListViewAutoScrollHelper mScrollHelper;
    public int mSelectionBottomPadding;
    public int mSelectionLeftPadding;
    public int mSelectionRightPadding;
    public int mSelectionTopPadding;
    public GateKeeperDrawable mSelector;
    public final Rect mSelectorRect;

    public abstract class Api21Impl {
        public static void drawableHotspotChanged(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    public abstract class Api30Impl {
        public static final boolean sHasMethods;
        public static final Method sPositionSelector;
        public static final Method sSetNextSelectedPositionInt;
        public static final Method sSetSelectedPositionInt;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                sPositionSelector = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                sSetSelectedPositionInt = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                sSetNextSelectedPositionInt = declaredMethod3;
                declaredMethod3.setAccessible(true);
                sHasMethods = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    public abstract class Api33Impl {
        public static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void setSelectedChildViewEnabled(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    public final class GateKeeperDrawable extends DrawableWrapperCompat {
        public boolean mEnabled;

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.mEnabled) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.mEnabled) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.mEnabled) {
                return this.mDrawable.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.mEnabled) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public abstract class PreApi33Impl {
        public static final Field sIsChildViewEnabled;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            sIsChildViewEnabled = field;
        }
    }

    public DropDownListView(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.mSelectorRect;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        GateKeeperDrawable gateKeeperDrawable = this.mSelector;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.mEnabled = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.mDrawsInPressedState && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    public final int measureHeightOfChildrenCompat(int i, int i2) {
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

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0148 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onForwardedEvent(MotionEvent motionEvent, int i) {
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
                        this.mDrawsInPressedState = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    ListViewAutoScrollHelper listViewAutoScrollHelper = this.mScrollHelper;
                    if (!z) {
                        if (listViewAutoScrollHelper == null) {
                            this.mScrollHelper = new ListViewAutoScrollHelper(this);
                        }
                        ListViewAutoScrollHelper listViewAutoScrollHelper2 = this.mScrollHelper;
                        boolean z4 = listViewAutoScrollHelper2.mEnabled;
                        listViewAutoScrollHelper2.mEnabled = true;
                        listViewAutoScrollHelper2.onTouch(this, motionEvent);
                    } else if (listViewAutoScrollHelper != null) {
                        if (listViewAutoScrollHelper.mEnabled) {
                            listViewAutoScrollHelper.requestStop();
                        }
                        listViewAutoScrollHelper.mEnabled = false;
                    }
                    return z;
                }
                z = false;
                z3 = false;
                if (z) {
                }
                this.mDrawsInPressedState = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                ListViewAutoScrollHelper listViewAutoScrollHelper3 = this.mScrollHelper;
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
                this.mDrawsInPressedState = true;
                Api21Impl.drawableHotspotChanged(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.mMotionPosition;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.mMotionPosition = pointToPosition;
                Api21Impl.drawableHotspotChanged(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || pointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.mSelectorRect;
                rect.set(left, top, right, bottom);
                rect.left -= this.mSelectionLeftPadding;
                rect.top -= this.mSelectionTopPadding;
                rect.right += this.mSelectionRightPadding;
                rect.bottom += this.mSelectionBottomPadding;
                if (Build.VERSION.SDK_INT >= 33) {
                    z2 = Api33Impl.isSelectedChildViewEnabled(this);
                } else {
                    Field field = PreApi33Impl.sIsChildViewEnabled;
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
                    boolean z6 = !z2;
                    if (Build.VERSION.SDK_INT >= 33) {
                        Api33Impl.setSelectedChildViewEnabled(this, z6);
                    } else {
                        Field field2 = PreApi33Impl.sIsChildViewEnabled;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                GateKeeperDrawable gateKeeperDrawable = this.mSelector;
                if (gateKeeperDrawable != null) {
                    gateKeeperDrawable.mEnabled = false;
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
            this.mDrawsInPressedState = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            ListViewAutoScrollHelper listViewAutoScrollHelper32 = this.mScrollHelper;
            if (!z) {
            }
            return z;
        }
        z = false;
        z3 = false;
        if (z) {
        }
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        ListViewAutoScrollHelper listViewAutoScrollHelper322 = this.mScrollHelper;
        if (!z) {
        }
        return z;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            Client.AnonymousClass7 anonymousClass7 = new Client.AnonymousClass7(this, 2);
            this.mResolveHoverRunnable = anonymousClass7;
            post(anonymousClass7);
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
                if (Build.VERSION.SDK_INT < 30 || !Api30Impl.sHasMethods) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        Api30Impl.sPositionSelector.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        Api30Impl.sSetSelectedPositionInt.invoke(this, Integer.valueOf(pointToPosition));
                        Api30Impl.sSetNextSelectedPositionInt.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.mDrawsInPressedState && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        Client.AnonymousClass7 anonymousClass7 = this.mResolveHoverRunnable;
        if (anonymousClass7 != null) {
            DropDownListView dropDownListView = (DropDownListView) anonymousClass7.this$0;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.removeCallbacks(anonymousClass7);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable;
        if (drawable != null) {
            gateKeeperDrawable = new GateKeeperDrawable(drawable);
            gateKeeperDrawable.mEnabled = true;
        } else {
            gateKeeperDrawable = null;
        }
        this.mSelector = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }
}
