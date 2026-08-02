package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class v381 {
    public static final byte[] e = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public byte[] d = new byte[128];

    public final void a(int i, int i2, byte[] bArr) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i4 = this.b + i3;
            if (length < i4) {
                this.d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.d, this.b, i3);
            this.b += i3;
        }
    }
}
