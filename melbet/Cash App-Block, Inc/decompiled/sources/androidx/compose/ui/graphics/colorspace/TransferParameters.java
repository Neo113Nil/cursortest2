package androidx.compose.ui.graphics.colorspace;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class TransferParameters {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double gamma;

    public TransferParameters(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.gamma = d;
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
        this.e = d6;
        this.f = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            a$$ExternalSyntheticBUOutline0.m$3("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Parameter d must be in the range [0..1], was ", d5);
            throw null;
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            a$$ExternalSyntheticBUOutline0.m$3("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            a$$ExternalSyntheticBUOutline0.m$3("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            a$$ExternalSyntheticBUOutline0.m$3("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            a$$ExternalSyntheticBUOutline0.m$3("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            a$$ExternalSyntheticBUOutline0.m$3("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.a, transferParameters.a) == 0 && Double.compare(this.b, transferParameters.b) == 0 && Double.compare(this.c, transferParameters.c) == 0 && Double.compare(this.d, transferParameters.d) == 0 && Double.compare(this.e, transferParameters.e) == 0 && Double.compare(this.f, transferParameters.f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f) + Fragment$5$$ExternalSyntheticOutline0.m(this.e, Fragment$5$$ExternalSyntheticOutline0.m(this.d, Fragment$5$$ExternalSyntheticOutline0.m(this.c, Fragment$5$$ExternalSyntheticOutline0.m(this.b, Fragment$5$$ExternalSyntheticOutline0.m(this.a, Double.hashCode(this.gamma) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ')';
    }

    public /* synthetic */ TransferParameters(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
