package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class s4u {
    public static final byte[] e = {0, 0, 1};
    public int a;
    public int b;
    public boolean c;
    public Serializable d;

    public Size a(icv icvVar) {
        int n = icvVar.n(0);
        Size size = (Size) icvVar.g(icv.r2, null);
        int i = this.b;
        int i2 = this.a;
        if (size != null) {
            int c = xdb1.c(xdb1.g(n), i2, 1 == i);
            if (c == 90 || c == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    public void b(int i, int i2, byte[] bArr) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.d;
            int length = bArr2.length;
            int i4 = this.a + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.d, this.a, i3);
            this.a += i3;
        }
    }
}
