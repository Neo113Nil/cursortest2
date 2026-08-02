package O;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: O.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347q {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2213a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2214b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2215c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2216d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2217e;

    public C0347q(ViewGroup viewGroup) {
        this.f2215c = viewGroup;
    }

    public final boolean a(float f2, float f9, boolean z6) {
        ViewParent e9;
        if (this.f2216d && (e9 = e(0)) != null) {
            try {
                return AbstractC0331c0.a(e9, this.f2215c, f2, f9, z6);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    public final boolean b(float f2, float f9) {
        ViewParent e9;
        if (this.f2216d && (e9 = e(0)) != null) {
            try {
                return AbstractC0331c0.b(e9, this.f2215c, f2, f9);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    public final boolean c(int i, int i4, int i6, int[] iArr, int[] iArr2) {
        ViewParent e9;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f2216d || (e9 = e(i6)) == null) {
            return false;
        }
        if (i == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f2215c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            if (this.f2217e == null) {
                this.f2217e = new int[2];
            }
            iArr3 = this.f2217e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e9 instanceof r) {
            ((r) e9).f(viewGroup, i, i4, iArr3, i6);
        } else if (i6 == 0) {
            try {
                AbstractC0331c0.c(e9, viewGroup, i, i4, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i, int i4, int i6, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent e9;
        int i11;
        int i12;
        int[] iArr3;
        if (this.f2216d && (e9 = e(i10)) != null) {
            if (i != 0 || i4 != 0 || i6 != 0 || i9 != 0) {
                ViewGroup viewGroup = this.f2215c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i11 = iArr[0];
                    i12 = iArr[1];
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2217e == null) {
                        this.f2217e = new int[2];
                    }
                    int[] iArr4 = this.f2217e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e9 instanceof InterfaceC0348s) {
                    ((InterfaceC0348s) e9).b(viewGroup, i, i4, i6, i9, i10, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i9;
                    if (e9 instanceof r) {
                        ((r) e9).c(viewGroup, i, i4, i6, i9, i10);
                    } else if (i10 == 0) {
                        try {
                            AbstractC0331c0.d(e9, viewGroup, i, i4, i6, i9);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onNestedScroll", e10);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i11;
                    iArr[1] = iArr[1] - i12;
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
            return this.f2213a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2214b;
    }

    public final boolean f(int i) {
        return e(i) != null;
    }

    public final boolean g(int i, int i4) {
        boolean f2;
        if (!f(i4)) {
            if (this.f2216d) {
                ViewGroup viewGroup = this.f2215c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z6 = parent instanceof r;
                    if (z6) {
                        f2 = ((r) parent).d(view, viewGroup, i, i4);
                    } else {
                        if (i4 == 0) {
                            try {
                                f2 = AbstractC0331c0.f(parent, view, viewGroup, i);
                            } catch (AbstractMethodError e9) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e9);
                            }
                        }
                        f2 = false;
                    }
                    if (f2) {
                        if (i4 == 0) {
                            this.f2213a = parent;
                        } else if (i4 == 1) {
                            this.f2214b = parent;
                        }
                        if (z6) {
                            ((r) parent).e(view, viewGroup, i, i4);
                        } else if (i4 == 0) {
                            try {
                                AbstractC0331c0.e(parent, view, viewGroup, i);
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
            boolean z6 = e9 instanceof r;
            ViewGroup viewGroup = this.f2215c;
            if (z6) {
                ((r) e9).a(i, viewGroup);
            } else if (i == 0) {
                try {
                    AbstractC0331c0.g(e9, viewGroup);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + e9 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i == 0) {
                this.f2213a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f2214b = null;
            }
        }
    }
}
