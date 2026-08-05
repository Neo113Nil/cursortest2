package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class cw {
    public final ViewGroup MdtA4re8;
    public ViewParent NCTxEWno;
    public int[] VgvYg0wo;
    public ViewParent qoPGr6Ce;
    public boolean wxUZMvaN;

    public cw(ViewGroup viewGroup) {
        this.MdtA4re8 = viewGroup;
    }

    public final boolean MdtA4re8(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent VgvYg0wo;
        int i4;
        int i5;
        if (!this.wxUZMvaN || (VgvYg0wo = VgvYg0wo(i3)) == null) {
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
        ViewGroup viewGroup = this.MdtA4re8;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null && (iArr = this.VgvYg0wo) == null) {
            iArr = new int[2];
            this.VgvYg0wo = iArr;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (VgvYg0wo instanceof dw) {
            ((dw) VgvYg0wo).wxUZMvaN(i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                VgvYg0wo.onNestedPreScroll(viewGroup, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + VgvYg0wo + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public final boolean NCTxEWno(float f, float f2) {
        ViewParent VgvYg0wo;
        if (this.wxUZMvaN && (VgvYg0wo = VgvYg0wo(0)) != null) {
            try {
                return VgvYg0wo.onNestedPreFling(this.MdtA4re8, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + VgvYg0wo + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    public final boolean P7K7Inc8(int i) {
        return VgvYg0wo(i) != null;
    }

    public final void Qr9iLBAD(int i) {
        ViewParent VgvYg0wo = VgvYg0wo(i);
        if (VgvYg0wo != null) {
            boolean z = VgvYg0wo instanceof dw;
            ViewGroup viewGroup = this.MdtA4re8;
            if (z) {
                ((dw) VgvYg0wo).MdtA4re8(viewGroup, i);
            } else if (i == 0) {
                try {
                    VgvYg0wo.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + VgvYg0wo + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.qoPGr6Ce = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.NCTxEWno = null;
            }
        }
    }

    public final ViewParent VgvYg0wo(int i) {
        if (i == 0) {
            return this.qoPGr6Ce;
        }
        if (i != 1) {
            return null;
        }
        return this.NCTxEWno;
    }

    public final boolean b2ZJblxo(int i, int i2) {
        boolean onStartNestedScroll;
        if (!P7K7Inc8(i2)) {
            if (this.wxUZMvaN) {
                View view = this.MdtA4re8;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof dw;
                    if (z) {
                        onStartNestedScroll = ((dw) parent).P7K7Inc8(view2, view, i, i2);
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
                            this.qoPGr6Ce = parent;
                        } else if (i2 == 1) {
                            this.NCTxEWno = parent;
                        }
                        if (z) {
                            ((dw) parent).qoPGr6Ce(view2, view, i, i2);
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

    public final boolean qoPGr6Ce(float f, float f2, boolean z) {
        ViewParent VgvYg0wo;
        if (this.wxUZMvaN && (VgvYg0wo = VgvYg0wo(0)) != null) {
            try {
                return VgvYg0wo.onNestedFling(this.MdtA4re8, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + VgvYg0wo + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    public final boolean wxUZMvaN(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent VgvYg0wo;
        int i6;
        int i7;
        int[] iArr3;
        if (this.wxUZMvaN && (VgvYg0wo = VgvYg0wo(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.MdtA4re8;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.VgvYg0wo;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.VgvYg0wo = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (VgvYg0wo instanceof ew) {
                    ((ew) VgvYg0wo).VgvYg0wo(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (VgvYg0wo instanceof dw) {
                        ((dw) VgvYg0wo).NCTxEWno(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            VgvYg0wo.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + VgvYg0wo + " does not implement interface method onNestedScroll", e);
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
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }
}
