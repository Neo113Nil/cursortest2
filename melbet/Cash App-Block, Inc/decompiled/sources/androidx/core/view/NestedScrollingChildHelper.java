package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class NestedScrollingChildHelper {
    public boolean mIsNestedScrollingEnabled;
    public ViewParent mNestedScrollingParentNonTouch;
    public ViewParent mNestedScrollingParentTouch;
    public int[] mTempNestedScrollConsumed;
    public final View mView;

    public NestedScrollingChildHelper(View view) {
        this.mView = view;
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent nestedScrollingParentForType;
        if (this.mIsNestedScrollingEnabled && (nestedScrollingParentForType = getNestedScrollingParentForType(0)) != null) {
            try {
                return nestedScrollingParentForType.onNestedFling(this.mView, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + nestedScrollingParentForType + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent nestedScrollingParentForType;
        if (this.mIsNestedScrollingEnabled && (nestedScrollingParentForType = getNestedScrollingParentForType(0)) != null) {
            try {
                return nestedScrollingParentForType.onNestedPreFling(this.mView, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + nestedScrollingParentForType + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final boolean dispatchNestedPreScroll(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        ViewParent nestedScrollingParentForType;
        int i4;
        int i5;
        if (!this.mIsNestedScrollingEnabled || (nestedScrollingParentForType = getNestedScrollingParentForType(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.mView;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.mTempNestedScrollConsumed == null) {
                this.mTempNestedScrollConsumed = new int[2];
            }
            iArr = this.mTempNestedScrollConsumed;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z = nestedScrollingParentForType instanceof NestedScrollingParent2;
        View view2 = this.mView;
        if (z) {
            ((NestedScrollingParent2) nestedScrollingParentForType).onNestedPreScroll(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                nestedScrollingParentForType.onNestedPreScroll(view2, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + nestedScrollingParentForType + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean dispatchNestedScrollInternal(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2, int i5) {
        ViewParent nestedScrollingParentForType;
        int i6;
        int i7;
        int[] iArr3;
        if (this.mIsNestedScrollingEnabled && (nestedScrollingParentForType = getNestedScrollingParentForType(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                View view = this.mView;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.mTempNestedScrollConsumed == null) {
                        this.mTempNestedScrollConsumed = new int[2];
                    }
                    int[] iArr4 = this.mTempNestedScrollConsumed;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z = nestedScrollingParentForType instanceof NestedScrollingParent3;
                View view2 = this.mView;
                if (z) {
                    ((NestedScrollingParent3) nestedScrollingParentForType).onNestedScroll(view2, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (nestedScrollingParentForType instanceof NestedScrollingParent2) {
                        ((NestedScrollingParent2) nestedScrollingParentForType).onNestedScroll(view2, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            nestedScrollingParentForType.onNestedScroll(view2, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + nestedScrollingParentForType + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent getNestedScrollingParentForType(int i) {
        if (i == 0) {
            return this.mNestedScrollingParentTouch;
        }
        if (i != 1) {
            return null;
        }
        return this.mNestedScrollingParentNonTouch;
    }

    public final boolean hasNestedScrollingParent(int i) {
        return getNestedScrollingParentForType(i) != null;
    }

    public final void setNestedScrollingEnabled(boolean z) {
        if (this.mIsNestedScrollingEnabled) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            this.mView.stopNestedScroll();
        }
        this.mIsNestedScrollingEnabled = z;
    }

    public final boolean startNestedScroll(int i, int i2) {
        boolean onStartNestedScroll;
        if (!hasNestedScrollingParent(i2)) {
            if (this.mIsNestedScrollingEnabled) {
                View view = this.mView;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof NestedScrollingParent2;
                    if (z) {
                        onStartNestedScroll = ((NestedScrollingParent2) parent).onStartNestedScroll(view2, view, i, i2);
                    } else {
                        if (i2 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i2 == 0) {
                            this.mNestedScrollingParentTouch = parent;
                        } else if (i2 == 1) {
                            this.mNestedScrollingParentNonTouch = parent;
                        }
                        if (z) {
                            ((NestedScrollingParent2) parent).onNestedScrollAccepted(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void stopNestedScroll(int i) {
        ViewParent nestedScrollingParentForType = getNestedScrollingParentForType(i);
        if (nestedScrollingParentForType != null) {
            boolean z = nestedScrollingParentForType instanceof NestedScrollingParent2;
            View view = this.mView;
            if (z) {
                ((NestedScrollingParent2) nestedScrollingParentForType).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    nestedScrollingParentForType.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + nestedScrollingParentForType + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.mNestedScrollingParentTouch = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.mNestedScrollingParentNonTouch = null;
            }
        }
    }
}
