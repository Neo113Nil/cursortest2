package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c6d extends qae {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public c6d(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c6d.class != obj.getClass()) {
            return false;
        }
        c6d c6dVar = (c6d) obj;
        return Objects.equals(this.b, c6dVar.b) && this.c.equals(c6dVar.c) && this.d.equals(c6dVar.d) && Arrays.equals(this.e, c6dVar.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + k5r.c(k5r.c((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.qae
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
