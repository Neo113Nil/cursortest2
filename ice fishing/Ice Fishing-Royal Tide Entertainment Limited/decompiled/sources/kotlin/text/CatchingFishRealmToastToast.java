package kotlin.text;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class CatchingFishRealmToastToast implements Comparator {
    public final boolean CatchingFishCoroutine;
    public final CatchingFishGradleMVVM CatchingFishReduxKtor;
    public final Rect CatchingFishParcelableFAB = new Rect();
    public final Rect CatchingFishSnackbar = new Rect();

    public CatchingFishRealmToastToast(boolean z, CatchingFishGradleMVVM catchingFishGradleMVVM) {
        this.CatchingFishCoroutine = z;
        this.CatchingFishReduxKtor = catchingFishGradleMVVM;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.CatchingFishReduxKtor.getClass();
        Rect rect = this.CatchingFishParcelableFAB;
        ((CatchingFishViewJUnitJUnit) obj).CatchingFishWorkManager(rect);
        Rect rect2 = this.CatchingFishSnackbar;
        ((CatchingFishViewJUnitJUnit) obj2).CatchingFishWorkManager(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.CatchingFishCoroutine;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
