package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFABMVI {
    public final double CatchingFishCoroutine;
    public final double CatchingFishDaggerWebsocket;
    public final double CatchingFishParcelableFAB;
    public final double CatchingFishReduxKtor;
    public final double CatchingFishSnackbar;
    public final double CatchingFishViewModelScope;
    public final double CatchingFishWorkManager;

    public /* synthetic */ CatchingFishFABMVI(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFABMVI)) {
            return false;
        }
        CatchingFishFABMVI catchingFishFABMVI = (CatchingFishFABMVI) obj;
        return Double.compare(this.CatchingFishParcelableFAB, catchingFishFABMVI.CatchingFishParcelableFAB) == 0 && Double.compare(this.CatchingFishSnackbar, catchingFishFABMVI.CatchingFishSnackbar) == 0 && Double.compare(this.CatchingFishCoroutine, catchingFishFABMVI.CatchingFishCoroutine) == 0 && Double.compare(this.CatchingFishReduxKtor, catchingFishFABMVI.CatchingFishReduxKtor) == 0 && Double.compare(this.CatchingFishDaggerWebsocket, catchingFishFABMVI.CatchingFishDaggerWebsocket) == 0 && Double.compare(this.CatchingFishWorkManager, catchingFishFABMVI.CatchingFishWorkManager) == 0 && Double.compare(this.CatchingFishViewModelScope, catchingFishFABMVI.CatchingFishViewModelScope) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.CatchingFishViewModelScope) + ((Double.hashCode(this.CatchingFishWorkManager) + ((Double.hashCode(this.CatchingFishDaggerWebsocket) + ((Double.hashCode(this.CatchingFishReduxKtor) + ((Double.hashCode(this.CatchingFishCoroutine) + ((Double.hashCode(this.CatchingFishSnackbar) + (Double.hashCode(this.CatchingFishParcelableFAB) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.CatchingFishParcelableFAB + ", a=" + this.CatchingFishSnackbar + ", b=" + this.CatchingFishCoroutine + ", c=" + this.CatchingFishReduxKtor + ", d=" + this.CatchingFishDaggerWebsocket + ", e=" + this.CatchingFishWorkManager + ", f=" + this.CatchingFishViewModelScope + ')';
    }

    public CatchingFishFABMVI(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.CatchingFishParcelableFAB = d;
        this.CatchingFishSnackbar = d2;
        this.CatchingFishCoroutine = d3;
        this.CatchingFishReduxKtor = d4;
        this.CatchingFishDaggerWebsocket = d5;
        this.CatchingFishWorkManager = d6;
        this.CatchingFishViewModelScope = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
