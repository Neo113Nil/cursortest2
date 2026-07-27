package kotlin.text;

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
import com.catchingfish.fishcatcherpro.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class CatchingFishCameraXOkHttp extends ListView {
    public CatchingFishGsonRealm CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public int CatchingFishDaggerWebsocket;
    public final boolean CatchingFishEspressoTesting;
    public CatchingFishBundleRedux CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final Rect CatchingFishReduxKtor;
    public CatchingFishLifecycleIntent CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishCameraXOkHttp(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.CatchingFishReduxKtor = new Rect();
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishWorkManager = 0;
        this.CatchingFishViewModelScope = 0;
        this.CatchingFishViewModelFAB = 0;
        this.CatchingFishEspressoTesting = z;
        setCacheColorHint(0);
    }

    public final int CatchingFishParcelableFAB(int i, int i2) {
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishSnackbar(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    if (z || z3) {
                        this.CatchingFishOkHttp = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.CatchingFishLayout - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z) {
                        CatchingFishLifecycleIntent catchingFishLifecycleIntent = this.CatchingFishUnitTesting;
                        if (catchingFishLifecycleIntent != null) {
                            if (catchingFishLifecycleIntent.CatchingFish) {
                                catchingFishLifecycleIntent.CatchingFishReduxKtor();
                            }
                            catchingFishLifecycleIntent.CatchingFish = false;
                        }
                    } else {
                        if (this.CatchingFishUnitTesting == null) {
                            this.CatchingFishUnitTesting = new CatchingFishLifecycleIntent(this);
                        }
                        CatchingFishLifecycleIntent catchingFishLifecycleIntent2 = this.CatchingFishUnitTesting;
                        boolean z4 = catchingFishLifecycleIntent2.CatchingFish;
                        catchingFishLifecycleIntent2.CatchingFish = true;
                        catchingFishLifecycleIntent2.onTouch(this, motionEvent);
                    }
                    return z;
                }
                z = false;
                if (z) {
                }
                this.CatchingFishOkHttp = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.CatchingFishLayout - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z) {
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
            if (pointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.CatchingFishOkHttp = true;
                int i2 = Build.VERSION.SDK_INT;
                CatchingFishCardViewGson.CatchingFishParcelableFAB(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.CatchingFishLayout;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.CatchingFishLayout = pointToPosition;
                CatchingFishCardViewGson.CatchingFishParcelableFAB(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
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
                Rect rect = this.CatchingFishReduxKtor;
                rect.set(left, top, right, bottom);
                rect.left -= this.CatchingFishDaggerWebsocket;
                rect.top -= this.CatchingFishWorkManager;
                rect.right += this.CatchingFishViewModelScope;
                rect.bottom += this.CatchingFishViewModelFAB;
                if (i2 >= 33) {
                    z2 = CatchingFishPayPalAnimation.CatchingFishParcelableFAB(this);
                } else {
                    Field field = CatchingFishExoPlayerToast.CatchingFishParcelableFAB;
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
                        CatchingFishPayPalAnimation.CatchingFishSnackbar(this, z6);
                    } else {
                        Field field2 = CatchingFishExoPlayerToast.CatchingFishParcelableFAB;
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
                CatchingFishBundleRedux catchingFishBundleRedux = this.CatchingFishFragmentHandler;
                if (catchingFishBundleRedux != null) {
                    catchingFishBundleRedux.CatchingFishDaggerWebsocket = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z3 = false;
            }
            if (z) {
            }
            this.CatchingFishOkHttp = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.CatchingFishLayout - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z) {
            }
            return z;
        }
        z = false;
        if (z) {
        }
        this.CatchingFishOkHttp = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.CatchingFishLayout - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.CatchingFishReduxKtor;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.CatchingFishAnimationMockk != null) {
            return;
        }
        super.drawableStateChanged();
        CatchingFishBundleRedux catchingFishBundleRedux = this.CatchingFishFragmentHandler;
        if (catchingFishBundleRedux != null) {
            catchingFishBundleRedux.CatchingFishDaggerWebsocket = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.CatchingFishOkHttp && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.CatchingFishEspressoTesting || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.CatchingFishEspressoTesting || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.CatchingFishEspressoTesting || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.CatchingFishEspressoTesting && this.CatchingFishCloudMessaging) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.CatchingFishAnimationMockk = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.CatchingFishAnimationMockk == null) {
            CatchingFishGsonRealm catchingFishGsonRealm = new CatchingFishGsonRealm(7, this);
            this.CatchingFishAnimationMockk = catchingFishGsonRealm;
            post(catchingFishGsonRealm);
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
                if (i < 30 || !CatchingFishMVPHandler.CatchingFishReduxKtor) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        CatchingFishMVPHandler.CatchingFishParcelableFAB.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        CatchingFishMVPHandler.CatchingFishSnackbar.invoke(this, Integer.valueOf(pointToPosition));
                        CatchingFishMVPHandler.CatchingFishCoroutine.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.CatchingFishOkHttp && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.CatchingFishLayout = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        CatchingFishGsonRealm catchingFishGsonRealm = this.CatchingFishAnimationMockk;
        if (catchingFishGsonRealm != null) {
            CatchingFishCameraXOkHttp catchingFishCameraXOkHttp = (CatchingFishCameraXOkHttp) catchingFishGsonRealm.CatchingFishDaggerWebsocket;
            catchingFishCameraXOkHttp.CatchingFishAnimationMockk = null;
            catchingFishCameraXOkHttp.removeCallbacks(catchingFishGsonRealm);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.CatchingFishCloudMessaging = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        CatchingFishBundleRedux catchingFishBundleRedux;
        if (drawable != null) {
            catchingFishBundleRedux = new CatchingFishBundleRedux();
            Drawable drawable2 = catchingFishBundleRedux.CatchingFishReduxKtor;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            catchingFishBundleRedux.CatchingFishReduxKtor = drawable;
            if (drawable != null) {
                drawable.setCallback(catchingFishBundleRedux);
            }
            catchingFishBundleRedux.CatchingFishDaggerWebsocket = true;
        } else {
            catchingFishBundleRedux = null;
        }
        this.CatchingFishFragmentHandler = catchingFishBundleRedux;
        super.setSelector(catchingFishBundleRedux);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.CatchingFishDaggerWebsocket = rect.left;
        this.CatchingFishWorkManager = rect.top;
        this.CatchingFishViewModelScope = rect.right;
        this.CatchingFishViewModelFAB = rect.bottom;
    }
}
