package y;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074g {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f8583a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f8584b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f8585c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8586d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8587e;

    public C1074g(ViewGroup viewGroup) {
        this.f8585c = viewGroup;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent e2;
        if (!this.f8586d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return C.a(e2, this.f8585c, f2, f3, z2);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedFling", e3);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent e2;
        if (!this.f8586d || (e2 = e(0)) == null) {
            return false;
        }
        try {
            return C.b(e2, this.f8585c, f2, f3);
        } catch (AbstractMethodError e3) {
            Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreFling", e3);
            return false;
        }
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent e2;
        int i5;
        int i6;
        if (!this.f8586d || (e2 = e(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f8585c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f8587e == null) {
                this.f8587e = new int[2];
            }
            iArr = this.f8587e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (e2 instanceof InterfaceC1075h) {
            ((InterfaceC1075h) e2).d(i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                C.c(e2, viewGroup, i2, i3, iArr);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent e2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f8586d || (e2 = e(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        ViewGroup viewGroup = this.f8585c;
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f8587e == null) {
                this.f8587e = new int[2];
            }
            int[] iArr4 = this.f8587e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (e2 instanceof InterfaceC1076i) {
            ((InterfaceC1076i) e2).e(viewGroup, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (e2 instanceof InterfaceC1075h) {
                ((InterfaceC1075h) e2).b(viewGroup, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    C.d(e2, viewGroup, i2, i3, i4, i5);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onNestedScroll", e3);
                }
            }
        }
        if (iArr != null) {
            viewGroup.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent e(int i2) {
        if (i2 == 0) {
            return this.f8583a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f8584b;
    }

    public final boolean f(int i2) {
        return e(i2) != null;
    }

    public final boolean g(int i2, int i3) {
        boolean f2;
        if (f(i3)) {
            return true;
        }
        if (this.f8586d) {
            ViewGroup viewGroup = this.f8585c;
            View view = viewGroup;
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC1075h;
                if (z2) {
                    f2 = ((InterfaceC1075h) parent).f(view, viewGroup, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            f2 = C.f(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    f2 = false;
                }
                if (f2) {
                    if (i3 == 0) {
                        this.f8583a = parent;
                    } else if (i3 == 1) {
                        this.f8584b = parent;
                    }
                    if (z2) {
                        ((InterfaceC1075h) parent).a(view, viewGroup, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            C.e(parent, view, viewGroup, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i2) {
        ViewParent e2 = e(i2);
        if (e2 != null) {
            boolean z2 = e2 instanceof InterfaceC1075h;
            ViewGroup viewGroup = this.f8585c;
            if (z2) {
                ((InterfaceC1075h) e2).c(viewGroup, i2);
            } else if (i2 == 0) {
                try {
                    C.g(e2, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + e2 + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i2 == 0) {
                this.f8583a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f8584b = null;
            }
        }
    }
}
