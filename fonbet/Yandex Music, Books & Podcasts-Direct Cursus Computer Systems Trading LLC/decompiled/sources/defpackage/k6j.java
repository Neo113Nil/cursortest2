package defpackage;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class k6j {
    public final byte[] a;
    public final d4s b;
    public final String c;
    public final k9e d;
    public final a4s e;

    public k6j(byte[] bArr, d4s d4sVar, String str) {
        bArr.getClass();
        this.a = bArr;
        this.b = d4sVar;
        this.c = str;
        if (bArr.length == 0) {
            xq0.x("Param id cannot be empty");
            throw null;
        }
        byte b = bArr[0];
        byte b2 = (byte) ((b >>> 6) & 3);
        this.d = b2 == 1 ? k9e.b : b2 == 2 ? k9e.c : b2 == 3 ? k9e.d : k9e.a;
        this.e = (b & 32) != 0 ? a4s.b : a4s.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k6j)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((k6j) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 177;
    }

    public final String toString() {
        return "Tag[" + quj.L("%02x ", this.a) + "] Name=" + this.c + ", TagType=" + this.e + ", ValueType=" + this.b + ", Class=" + this.d;
    }

    public k6j(String str, d4s d4sVar, String str2) {
        this(quj.N(str), d4sVar, str2);
    }
}
