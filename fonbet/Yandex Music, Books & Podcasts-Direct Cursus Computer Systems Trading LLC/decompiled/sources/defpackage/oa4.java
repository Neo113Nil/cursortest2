package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes3.dex */
public final class oa4 implements un {
    public final na4 a;
    public final na4 b;
    public final /* synthetic */ int c;

    public oa4(byte[] bArr, int i) {
        this.c = i;
        this.a = d(1, bArr);
        this.b = d(0, bArr);
    }

    public static byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // defpackage.un
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        na4 na4Var = this.a;
        if (length > 2147483631 - na4Var.f()) {
            b6e.m("plaintext too long");
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(na4Var.f() + bArr.length + 16);
        if (allocate.remaining() < na4Var.f() + bArr.length + 16) {
            xq0.x("Given ByteBuffer output is too small");
            return null;
        }
        int position = allocate.position();
        na4Var.e(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[na4Var.f()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.b.b(0, bArr3).get(bArr4);
        byte[] t = ixf.t(bArr4, c(allocate, bArr2));
        allocate.limit(allocate.limit() + 16);
        allocate.put(t);
        return allocate.array();
    }

    @Override // defpackage.un
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        na4 na4Var = this.a;
        if (remaining < na4Var.f() + 16) {
            b6e.m("ciphertext too short");
            return null;
        }
        int position = wrap.position();
        byte[] bArr3 = new byte[16];
        wrap.position(wrap.limit() - 16);
        wrap.get(bArr3);
        wrap.position(position);
        wrap.limit(wrap.limit() - 16);
        byte[] bArr4 = new byte[na4Var.f()];
        wrap.get(bArr4);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr5 = new byte[32];
            this.b.b(0, bArr4).get(bArr5);
            if (!h4a.r(ixf.t(bArr5, c(wrap, bArr2)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            wrap.position(position);
            return na4Var.d(wrap);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final na4 d(int i, byte[] bArr) {
        switch (this.c) {
            case 0:
                return new ma4(bArr, i);
            default:
                return new u6w(bArr, i);
        }
    }
}
