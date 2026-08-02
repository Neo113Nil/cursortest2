package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.text.c;

/* loaded from: classes5.dex */
public final class fwt implements Comparable, Serializable {
    public static final fwt c = new fwt(0, 0);
    public final long a;
    public final long b;

    public fwt(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        hwt hwtVar = new hwt();
        hwtVar.a = this.a;
        hwtVar.b = this.b;
        return hwtVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fwt fwtVar = (fwt) obj;
        fwtVar.getClass();
        long j = fwtVar.a;
        long j2 = this.a;
        if (j2 != j) {
            met metVar = net.b;
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        met metVar2 = net.b;
        return Long.compare(this.b ^ Long.MIN_VALUE, fwtVar.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwt)) {
            return false;
        }
        fwt fwtVar = (fwt) obj;
        return this.a == fwtVar.a && this.b == fwtVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        ixf.w(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        ixf.w(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        ixf.w(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        ixf.w(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        ixf.w(this.b, bArr, 24, 2, 8);
        return c.m(bArr);
    }
}
