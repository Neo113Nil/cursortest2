package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class zqf {
    public BigInteger a;
    public BigInteger b;
    public BigInteger c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zqf)) {
            return false;
        }
        zqf zqfVar = (zqf) obj;
        BigInteger bigInteger = this.c;
        BigInteger bigInteger2 = zqfVar.c;
        if (bigInteger != null) {
            if (!bigInteger.equals(bigInteger2)) {
                return false;
            }
        } else if (bigInteger2 != null) {
            return false;
        }
        return zqfVar.b.equals(this.b) && zqfVar.a.equals(this.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() ^ this.a.hashCode();
        BigInteger bigInteger = this.c;
        return (bigInteger != null ? bigInteger.hashCode() : 0) ^ hashCode;
    }
}
