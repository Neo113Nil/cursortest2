package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mae implements n2i {
    public final byte[] a;
    public final String b;
    public final String c;

    public mae(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mae.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((mae) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // defpackage.n2i
    public final void populateMediaMetadata(eoh eohVar) {
        String str = this.b;
        if (str != null) {
            eohVar.a = str;
        }
    }

    public final String toString() {
        return f1d.i(f1d.m("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
