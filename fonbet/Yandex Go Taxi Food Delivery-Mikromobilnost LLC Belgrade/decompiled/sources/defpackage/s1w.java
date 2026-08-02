package defpackage;

import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes11.dex */
public final class s1w {
    public static final TinkFipsUtil$AlgorithmFipsCompatibility d = TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public final erm a;
    public final erm b;
    public final /* synthetic */ int c;

    public s1w(byte[] bArr, int i) {
        this.c = i;
        if (!d.a()) {
            kbs.v("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.a = d(1, bArr);
        this.b = d(0, bArr);
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
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

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            kbs.v("ciphertext too short");
            return null;
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            this.b.a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(yz91.a(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            erm ermVar = this.a;
            ermVar.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            ermVar.d(bArr, allocate, byteBuffer);
            return allocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            ny61.g("Given ByteBuffer output is too small");
            return;
        }
        int position = byteBuffer.position();
        erm ermVar = this.a;
        ermVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            ny61.g("Given ByteBuffer output is too small");
            return;
        }
        ermVar.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer a = this.b.a(0, bArr);
        byte[] bArr4 = new byte[32];
        a.get(bArr4);
        byte[] a2 = yz91.a(bArr4, c(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(a2);
    }

    public final erm d(int i, byte[] bArr) {
        switch (this.c) {
            case 0:
                return new r1w(bArr, i, 0);
            default:
                return new r1w(bArr, i, 1);
        }
    }
}
