package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public abstract class na4 implements mie {
    public static final int[] c = j(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    public final int[] a;
    public final int b;

    public na4(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = j(bArr);
        this.b = i;
    }

    public static void h(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    public static void i(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            h(0, 4, 8, 12, iArr);
            h(1, 5, 9, 13, iArr);
            h(2, 6, 10, 14, iArr);
            h(3, 7, 11, 15, iArr);
            h(0, 5, 10, 15, iArr);
            h(1, 6, 11, 12, iArr);
            h(2, 7, 8, 13, iArr);
            h(3, 4, 9, 14, iArr);
        }
    }

    public static int[] j(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // defpackage.mie
    public final byte[] a(byte[] bArr) {
        return d(ByteBuffer.wrap(bArr));
    }

    public final ByteBuffer b(int i, byte[] bArr) {
        int[] c2 = c(j(bArr), i);
        int[] iArr = (int[]) c2.clone();
        i(iArr);
        for (int i2 = 0; i2 < c2.length; i2++) {
            c2[i2] = c2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c2, 0, 16);
        return order;
    }

    public abstract int[] c(int[] iArr, int i);

    public final byte[] d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < f()) {
            b6e.m("ciphertext too short");
            return null;
        }
        byte[] bArr = new byte[f()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        g(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - f() < bArr.length) {
            xq0.x("Given ByteBuffer output is too small");
            return;
        }
        byte[] a = qhn.a(f());
        byteBuffer.put(a);
        g(a, byteBuffer, ByteBuffer.wrap(bArr));
    }

    @Override // defpackage.mie
    public final byte[] encrypt(byte[] bArr) {
        if (bArr.length > Integer.MAX_VALUE - f()) {
            b6e.m("plaintext too long");
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(f() + bArr.length);
        e(allocate, bArr);
        return allocate.array();
    }

    public abstract int f();

    public final void g(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer b = b(this.b + i3, bArr);
            if (i3 == i) {
                h4a.Z(byteBuffer, byteBuffer2, b, remaining % 64);
            } else {
                h4a.Z(byteBuffer, byteBuffer2, b, 64);
            }
        }
    }
}
