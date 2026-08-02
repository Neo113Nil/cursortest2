package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class tsm extends qae {
    public final String b;
    public final byte[] c;

    public tsm(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tsm.class != obj.getClass()) {
            return false;
        }
        tsm tsmVar = (tsm) obj;
        return this.b.equals(tsmVar.b) && Arrays.equals(this.c, tsmVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + k5r.c(527, 31, this.b);
    }

    @Override // defpackage.qae
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
