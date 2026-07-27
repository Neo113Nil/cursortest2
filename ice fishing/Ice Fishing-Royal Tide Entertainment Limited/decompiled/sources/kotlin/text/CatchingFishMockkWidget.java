package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishMockkWidget {
    public final ViewGroup CatchingFishCoroutine;
    public int[] CatchingFishDaggerWebsocket;
    public ViewParent CatchingFishParcelableFAB;
    public boolean CatchingFishReduxKtor;
    public ViewParent CatchingFishSnackbar;

    public CatchingFishMockkWidget(ViewGroup viewGroup) {
        this.CatchingFishCoroutine = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCoroutine(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent CatchingFishReduxKtor;
        int i6;
        int i7;
        int[] iArr3;
        ViewGroup viewGroup;
        if (this.CatchingFishReduxKtor && (CatchingFishReduxKtor = CatchingFishReduxKtor(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup2 = this.CatchingFishCoroutine;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.CatchingFishDaggerWebsocket == null) {
                        this.CatchingFishDaggerWebsocket = new int[2];
                    }
                    int[] iArr4 = this.CatchingFishDaggerWebsocket;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (CatchingFishReduxKtor instanceof CatchingFishOkHttpAnimation) {
                    CatchingFishOkHttpAnimation catchingFishOkHttpAnimation = (CatchingFishOkHttpAnimation) CatchingFishReduxKtor;
                    viewGroup = viewGroup2;
                    catchingFishOkHttpAnimation.CatchingFishWorkManager(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (!(CatchingFishReduxKtor instanceof CatchingFishViewGson)) {
                        if (i5 == 0) {
                            try {
                                CatchingFishReduxKtor.onNestedScroll(viewGroup2, i, i2, i3, i4);
                            } catch (AbstractMethodError unused) {
                                Objects.toString(CatchingFishReduxKtor);
                            }
                        }
                        if (iArr != null) {
                            viewGroup2.getLocationInWindow(iArr);
                            iArr[0] = iArr[0] - i6;
                            iArr[1] = iArr[1] - i7;
                        }
                        return true;
                    }
                    CatchingFishViewGson catchingFishViewGson = (CatchingFishViewGson) CatchingFishReduxKtor;
                    viewGroup = viewGroup2;
                    catchingFishViewGson.CatchingFishViewModelScope(viewGroup, i, i2, i3, i4, i5);
                }
                viewGroup2 = viewGroup;
                if (iArr != null) {
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

    public final boolean CatchingFishDaggerWebsocket(int i) {
        return CatchingFishReduxKtor(i) != null;
    }

    public final boolean CatchingFishParcelableFAB(float f, float f2) {
        ViewParent CatchingFishReduxKtor;
        if (this.CatchingFishReduxKtor && (CatchingFishReduxKtor = CatchingFishReduxKtor(0)) != null) {
            try {
                return CatchingFishReduxKtor.onNestedPreFling(this.CatchingFishCoroutine, f, f2);
            } catch (AbstractMethodError unused) {
                Objects.toString(CatchingFishReduxKtor);
            }
        }
        return false;
    }

    public final ViewParent CatchingFishReduxKtor(int i) {
        if (i == 0) {
            return this.CatchingFishParcelableFAB;
        }
        if (i != 1) {
            return null;
        }
        return this.CatchingFishSnackbar;
    }

    public final boolean CatchingFishSnackbar(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent CatchingFishReduxKtor;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.CatchingFishReduxKtor || (CatchingFishReduxKtor = CatchingFishReduxKtor(i3)) == null) {
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
        ViewGroup viewGroup = this.CatchingFishCoroutine;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.CatchingFishDaggerWebsocket == null) {
                this.CatchingFishDaggerWebsocket = new int[2];
            }
            iArr3 = this.CatchingFishDaggerWebsocket;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (CatchingFishReduxKtor instanceof CatchingFishViewGson) {
            ((CatchingFishViewGson) CatchingFishReduxKtor).CatchingFishCoroutine(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                CatchingFishReduxKtor.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(CatchingFishReduxKtor);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void CatchingFishViewModelScope(int i) {
        ViewParent CatchingFishReduxKtor = CatchingFishReduxKtor(i);
        if (CatchingFishReduxKtor != null) {
            boolean z = CatchingFishReduxKtor instanceof CatchingFishViewGson;
            ViewGroup viewGroup = this.CatchingFishCoroutine;
            if (z) {
                ((CatchingFishViewGson) CatchingFishReduxKtor).CatchingFishSnackbar(viewGroup, i);
            } else if (i == 0) {
                try {
                    CatchingFishReduxKtor.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(CatchingFishReduxKtor);
                }
            }
            if (i == 0) {
                this.CatchingFishParcelableFAB = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.CatchingFishSnackbar = null;
            }
        }
    }

    public final boolean CatchingFishWorkManager(int i, int i2) {
        boolean onStartNestedScroll;
        if (!CatchingFishDaggerWebsocket(i2)) {
            if (this.CatchingFishReduxKtor) {
                View view = this.CatchingFishCoroutine;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof CatchingFishViewGson;
                    if (z) {
                        onStartNestedScroll = ((CatchingFishViewGson) parent).CatchingFishViewModelFAB(view2, view, i, i2);
                    } else {
                        if (i2 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                            } catch (AbstractMethodError unused) {
                                Objects.toString(parent);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i2 == 0) {
                            this.CatchingFishParcelableFAB = parent;
                        } else if (i2 == 1) {
                            this.CatchingFishSnackbar = parent;
                        }
                        if (z) {
                            ((CatchingFishViewGson) parent).CatchingFishParcelableFAB(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
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
}
