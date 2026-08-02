package defpackage;

/* loaded from: classes4.dex */
public final class r43 extends h77 {
    public final byte[] a;
    public int b;

    public r43(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.h77
    public final byte a() {
        try {
            byte[] bArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            w511.i(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }
}
