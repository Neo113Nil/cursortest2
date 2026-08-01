package O;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: O.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f820a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f821b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f822c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f823d;
    public int[] e;

    public C0035k(ViewGroup viewGroup) {
        this.f822c = viewGroup;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent e;
        if (!this.f823d || (e = e(0)) == null) {
            return false;
        }
        try {
            return e.onNestedFling(this.f822c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent e;
        if (!this.f823d || (e = e(0)) == null) {
            return false;
        }
        try {
            return e.onNestedPreFling(this.f822c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f823d || (e = e(i3)) == null) {
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
        ViewGroup viewGroup = this.f822c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e instanceof InterfaceC0036l) {
            ((InterfaceC0036l) e).f(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                e.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent e;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f823d || (e = e(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f822c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e instanceof InterfaceC0037m) {
            ((InterfaceC0037m) e).b(viewGroup, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (e instanceof InterfaceC0036l) {
                ((InterfaceC0036l) e).c(viewGroup, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    e.onNestedScroll(viewGroup, i, i2, i3, i4);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f820a;
        }
        if (i != 1) {
            return null;
        }
        return this.f821b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i2) {
        boolean onStartNestedScroll;
        if (f(i2)) {
            return true;
        }
        if (this.f823d) {
            View view = this.f822c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0036l;
                if (z2) {
                    onStartNestedScroll = ((InterfaceC0036l) parent).g(view2, view, i, i2);
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
                        this.f820a = parent;
                    } else if (i2 == 1) {
                        this.f821b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0036l) parent).a(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void h(int i) {
        ViewParent e = e(i);
        if (e != null) {
            boolean z2 = e instanceof InterfaceC0036l;
            ViewGroup viewGroup = this.f822c;
            if (z2) {
                ((InterfaceC0036l) e).e(viewGroup, i);
            } else if (i == 0) {
                try {
                    e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.f820a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f821b = null;
            }
        }
    }
}
