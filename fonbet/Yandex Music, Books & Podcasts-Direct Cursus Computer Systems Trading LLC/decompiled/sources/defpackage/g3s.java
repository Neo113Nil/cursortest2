package defpackage;

/* loaded from: classes4.dex */
public final class g3s {
    public final k6j a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public g3s(k6j k6jVar, int i, byte[] bArr, byte[] bArr2) {
        this.a = k6jVar;
        this.b = i;
        this.c = bArr;
        this.d = bArr2;
        if (i == bArr2.length) {
            return;
        }
        xq0.x("Failed requirement.");
        throw null;
    }

    public final String toString() {
        String L = quj.L("%02x", this.c);
        String L2 = quj.L("%02x", this.d);
        StringBuilder sb = new StringBuilder("tag ");
        sb.append(this.a);
        sb.append(", length : ");
        sb.append(this.b);
        sb.append(", rawEncodedLengthBytes : ");
        return vz1.s(sb, L, " valueBytes : ", L2);
    }
}
