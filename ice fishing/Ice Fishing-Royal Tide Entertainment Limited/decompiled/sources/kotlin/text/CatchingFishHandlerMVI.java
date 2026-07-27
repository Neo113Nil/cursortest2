package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHandlerMVI {
    public boolean CatchingFishCoroutine;
    public double CatchingFishDaggerWebsocket;
    public final CatchingFishReduxToolbar CatchingFishFragmentHandler;
    public double CatchingFishLayout;
    public double CatchingFishParcelableFAB;
    public double CatchingFishReduxKtor;
    public double CatchingFishSnackbar;
    public double CatchingFishViewModelFAB;
    public double CatchingFishViewModelScope;
    public double CatchingFishWorkManager;

    public CatchingFishHandlerMVI() {
        this.CatchingFishParcelableFAB = Math.sqrt(1500.0d);
        this.CatchingFishSnackbar = 0.5d;
        this.CatchingFishCoroutine = false;
        this.CatchingFishLayout = Double.MAX_VALUE;
        this.CatchingFishFragmentHandler = new CatchingFishReduxToolbar();
    }

    public final CatchingFishReduxToolbar CatchingFishParcelableFAB(double d, double d2, long j) {
        double sin;
        double cos;
        if (!this.CatchingFishCoroutine) {
            if (this.CatchingFishLayout == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.CatchingFishSnackbar;
            if (d3 > 1.0d) {
                double d4 = this.CatchingFishParcelableFAB;
                this.CatchingFishWorkManager = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.CatchingFishSnackbar;
                double d6 = this.CatchingFishParcelableFAB;
                this.CatchingFishViewModelScope = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.CatchingFishViewModelFAB = Math.sqrt(1.0d - (d3 * d3)) * this.CatchingFishParcelableFAB;
            }
            this.CatchingFishCoroutine = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.CatchingFishLayout;
        double d9 = this.CatchingFishSnackbar;
        if (d9 > 1.0d) {
            double d10 = this.CatchingFishViewModelScope;
            double d11 = ((d10 * d8) - d2) / (d10 - this.CatchingFishWorkManager);
            double d12 = d8 - d11;
            sin = (Math.pow(2.718281828459045d, this.CatchingFishWorkManager * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.CatchingFishViewModelScope;
            double pow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.CatchingFishWorkManager;
            cos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + pow;
        } else if (d9 == 1.0d) {
            double d15 = this.CatchingFishParcelableFAB;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double pow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double pow3 = Math.pow(2.718281828459045d, (-this.CatchingFishParcelableFAB) * d7) * d17;
            double d18 = -this.CatchingFishParcelableFAB;
            cos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (pow3 * d18);
            sin = pow2;
        } else {
            double d19 = 1.0d / this.CatchingFishViewModelFAB;
            double d20 = this.CatchingFishParcelableFAB;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            sin = ((Math.sin(this.CatchingFishViewModelFAB * d7) * d21) + (Math.cos(this.CatchingFishViewModelFAB * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.CatchingFishParcelableFAB;
            double d23 = this.CatchingFishSnackbar;
            double d24 = (-d22) * sin * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.CatchingFishViewModelFAB;
            double sin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.CatchingFishViewModelFAB;
            cos = (((Math.cos(d26 * d7) * d21 * d26) + sin2) * pow4) + d24;
        }
        float f = (float) (sin + this.CatchingFishLayout);
        CatchingFishReduxToolbar catchingFishReduxToolbar = this.CatchingFishFragmentHandler;
        catchingFishReduxToolbar.CatchingFishParcelableFAB = f;
        catchingFishReduxToolbar.CatchingFishSnackbar = (float) cos;
        return catchingFishReduxToolbar;
    }

    public CatchingFishHandlerMVI(float f) {
        this.CatchingFishParcelableFAB = Math.sqrt(1500.0d);
        this.CatchingFishSnackbar = 0.5d;
        this.CatchingFishCoroutine = false;
        this.CatchingFishFragmentHandler = new CatchingFishReduxToolbar();
        this.CatchingFishLayout = f;
    }
}
