package defpackage;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public final class wbs0 implements blq0 {
    public final nc51 a;

    public wbs0(jc51 jc51Var, BigInteger bigInteger, byte[] bArr) {
        this(new nc51(jc51Var, bigInteger, bArr));
    }

    @Override // defpackage.blq0
    public final boolean Q0(Object obj) {
        return obj instanceof acs0 ? ((acs0) obj).getSID().equals(this) : this.a.Q0(obj);
    }

    public final Object clone() {
        return new wbs0(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wbs0) {
            return this.a.equals(((wbs0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wbs0(nc51 nc51Var) {
        this.a = nc51Var;
    }
}
