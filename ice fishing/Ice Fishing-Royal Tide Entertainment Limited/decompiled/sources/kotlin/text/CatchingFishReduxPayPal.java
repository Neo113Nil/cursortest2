package kotlin.text;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class CatchingFishReduxPayPal {
    public static final CatchingFishReduxPayPal CatchingFishDaggerWebsocket = new CatchingFishReduxPayPal(0, 0, 0, 0);
    public final int CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    public CatchingFishReduxPayPal(int i, int i2, int i3, int i4) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = i3;
        this.CatchingFishReduxKtor = i4;
    }

    public static CatchingFishReduxPayPal CatchingFishCoroutine(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return CatchingFishSnackbar(i, i2, i3, i4);
    }

    public static CatchingFishReduxPayPal CatchingFishParcelableFAB(CatchingFishReduxPayPal catchingFishReduxPayPal, CatchingFishReduxPayPal catchingFishReduxPayPal2) {
        return CatchingFishSnackbar(Math.max(catchingFishReduxPayPal.CatchingFishParcelableFAB, catchingFishReduxPayPal2.CatchingFishParcelableFAB), Math.max(catchingFishReduxPayPal.CatchingFishSnackbar, catchingFishReduxPayPal2.CatchingFishSnackbar), Math.max(catchingFishReduxPayPal.CatchingFishCoroutine, catchingFishReduxPayPal2.CatchingFishCoroutine), Math.max(catchingFishReduxPayPal.CatchingFishReduxKtor, catchingFishReduxPayPal2.CatchingFishReduxKtor));
    }

    public static CatchingFishReduxPayPal CatchingFishSnackbar(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? CatchingFishDaggerWebsocket : new CatchingFishReduxPayPal(i, i2, i3, i4);
    }

    public final Insets CatchingFishReduxKtor() {
        return CatchingFishJUnitFlux.CatchingFishLayout(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar, this.CatchingFishCoroutine, this.CatchingFishReduxKtor);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishReduxPayPal.class != obj.getClass()) {
            return false;
        }
        CatchingFishReduxPayPal catchingFishReduxPayPal = (CatchingFishReduxPayPal) obj;
        return this.CatchingFishReduxKtor == catchingFishReduxPayPal.CatchingFishReduxKtor && this.CatchingFishParcelableFAB == catchingFishReduxPayPal.CatchingFishParcelableFAB && this.CatchingFishCoroutine == catchingFishReduxPayPal.CatchingFishCoroutine && this.CatchingFishSnackbar == catchingFishReduxPayPal.CatchingFishSnackbar;
    }

    public final int hashCode() {
        return (((((this.CatchingFishParcelableFAB * 31) + this.CatchingFishSnackbar) * 31) + this.CatchingFishCoroutine) * 31) + this.CatchingFishReduxKtor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", top=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", right=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", bottom=");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishReduxKtor, '}');
    }
}
