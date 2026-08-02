package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bp0 extends qae {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public bp0(String str, String str2, byte[] bArr, int i) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bp0.class != obj.getClass()) {
            return false;
        }
        bp0 bp0Var = (bp0) obj;
        return this.d == bp0Var.d && this.b.equals(bp0Var.b) && Objects.equals(this.c, bp0Var.c) && Arrays.equals(this.e, bp0Var.e);
    }

    public final int hashCode() {
        int c = k5r.c((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.n2i
    public final void populateMediaMetadata(eoh eohVar) {
        eohVar.a(this.d, this.e);
    }

    @Override // defpackage.qae
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
