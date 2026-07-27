package O;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: O.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342q {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2125a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2126b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2127c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2128d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2129e;

    public C0342q(ViewGroup viewGroup) {
        this.f2127c = viewGroup;
    }

    public final boolean a(float f3, float f9, boolean z3) {
        ViewParent e9;
        if (this.f2128d && (e9 = e(0)) != null) {
            try {
                return AbstractC0326c0.a(e9, this.f2127c, f3, f9, z3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f9) {
        ViewParent e9;
        if (this.f2128d && (e9 = e(0)) != null) {
            try {
                return AbstractC0326c0.b(e9, this.f2127c, f3, f9);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i, int i6, int i9, int[] iArr, int[] iArr2) {
        ViewParent e9;
        int i10;
        int i11;
        int[] iArr3;
        if (!this.f2128d || (e9 = e(i9)) == null) {
            return false;
        }
        if (i == 0 && i6 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f2127c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i10 = iArr2[0];
            i11 = iArr2[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr == null) {
            if (this.f2129e == null) {
                this.f2129e = new int[2];
            }
            iArr3 = this.f2129e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e9 instanceof r) {
            ((r) e9).f(viewGroup, i, i6, iArr3, i9);
        } else if (i9 == 0) {
            try {
                AbstractC0326c0.c(e9, viewGroup, i, i6, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i10;
            iArr2[1] = iArr2[1] - i11;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i6, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        ViewParent e9;
        int i12;
        int i13;
        int[] iArr3;
        if (this.f2128d && (e9 = e(i11)) != null) {
            if (i != 0 || i6 != 0 || i9 != 0 || i10 != 0) {
                ViewGroup viewGroup = this.f2127c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i12 = iArr[0];
                    i13 = iArr[1];
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2129e == null) {
                        this.f2129e = new int[2];
                    }
                    int[] iArr4 = this.f2129e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e9 instanceof InterfaceC0343s) {
                    ((InterfaceC0343s) e9).b(viewGroup, i, i6, i9, i10, i11, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i9;
                    iArr3[1] = iArr3[1] + i10;
                    if (e9 instanceof r) {
                        ((r) e9).c(viewGroup, i, i6, i9, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            AbstractC0326c0.d(e9, viewGroup, i, i6, i9, i10);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i12;
                    iArr[1] = iArr[1] - i13;
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

    public final ViewParent e(int i) {
        if (i == 0) {
            return this.f2125a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2126b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i6) {
        boolean f3;
        if (!f(i6)) {
            if (this.f2128d) {
                ViewGroup viewGroup = this.f2127c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof r;
                    if (z3) {
                        f3 = ((r) parent).d(view, viewGroup, i, i6);
                    } else {
                        if (i6 == 0) {
                            try {
                                f3 = AbstractC0326c0.f(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e9);
                            }
                        }
                        f3 = false;
                    }
                    if (f3) {
                        if (i6 == 0) {
                            this.f2125a = parent;
                        } else if (i6 == 1) {
                            this.f2126b = parent;
                        }
                        if (z3) {
                            ((r) parent).e(view, viewGroup, i, i6);
                        } else if (i6 == 0) {
                            try {
                                AbstractC0326c0.e(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i) {
        ViewParent e9 = e(i);
        if (e9 != null) {
            boolean z3 = e9 instanceof r;
            ViewGroup viewGroup = this.f2127c;
            if (z3) {
                ((r) e9).a(i, viewGroup);
            } else if (i == 0) {
                try {
                    AbstractC0326c0.g(e9, viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i == 0) {
                this.f2125a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2126b = null;
            }
        }
    }
}
