package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class win extends xin {
    public final byte[] a;
    public final byte[] b;

    public win(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!win.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        win winVar = (win) obj;
        return Arrays.equals(this.a, winVar.a) && Arrays.equals(this.b, winVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Success(logList=" + Arrays.toString(this.a) + ", signature=" + Arrays.toString(this.b) + ')';
    }
}
