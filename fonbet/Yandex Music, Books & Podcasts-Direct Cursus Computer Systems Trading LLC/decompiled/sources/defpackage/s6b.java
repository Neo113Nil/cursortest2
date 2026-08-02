package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s6b implements un {
    public final mie a;
    public final q4h b;
    public final int c;

    public s6b(mie mieVar, q4h q4hVar, int i) {
        this.a = mieVar;
        this.b = q4hVar;
        this.c = i;
    }

    @Override // defpackage.un
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] encrypt = this.a.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return h4a.p(encrypt, this.b.b(h4a.p(bArr2, encrypt, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // defpackage.un
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            b6e.m("ciphertext too short");
            return null;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.a(copyOfRange2, h4a.p(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.a.a(copyOfRange);
    }
}
