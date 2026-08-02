package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class s5v implements s820 {
    public final byte[] a;
    public final String b;
    public final String c;

    public s5v(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s5v.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((s5v) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.s820
    public final void populateMediaMetadata(qe10 qe10Var) {
        String str = this.b;
        if (str != null) {
            qe10Var.a = str;
        }
    }

    public final String toString() {
        return oyr.m(this.a.length, "\"", b64.v("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
