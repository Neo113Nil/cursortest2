package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wy60 implements yy60 {
    public final vy60 a;

    public wy60(vy60 vy60Var) {
        this.a = vy60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy60) && this.a.equals(((wy60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BestEstimatedAccuracy(accuracyEstimation=" + this.a + Extension.C_BRAKE;
    }
}
