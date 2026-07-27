package c8;

import com.google.android.gms.internal.ads.AbstractC4109wF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import r7.C4977h;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public int f5765a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5766b;

    public c(byte[] bArr, int i) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f5766b = AbstractC4109wF.c(bArr);
        this.f5765a = i;
    }

    public abstract int[] a(int[] iArr, int i);

    public abstract int b();

    public ByteBuffer c(int i, byte[] bArr) {
        int[] a9 = a(AbstractC4109wF.c(bArr), i);
        int[] iArr = (int[]) a9.clone();
        AbstractC4109wF.a(iArr);
        for (int i4 = 0; i4 < 16; i4++) {
            a9[i4] = a9[i4] + iArr[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a9, 0, 16);
        return order;
    }

    public c() {
        this.f5766b = new C4977h();
    }
}
