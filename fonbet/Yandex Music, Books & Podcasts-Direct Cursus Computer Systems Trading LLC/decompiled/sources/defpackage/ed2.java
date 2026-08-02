package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ed2 extends lxb {
    public final byte[] a;
    public final byte[] b;

    public ed2(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lxb) {
            lxb lxbVar = (lxb) obj;
            boolean z = lxbVar instanceof ed2;
            ed2 ed2Var = (ed2) lxbVar;
            if (Arrays.equals(this.a, z ? ed2Var.a : ed2Var.a)) {
                ed2 ed2Var2 = (ed2) lxbVar;
                if (Arrays.equals(this.b, z ? ed2Var2.b : ed2Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
