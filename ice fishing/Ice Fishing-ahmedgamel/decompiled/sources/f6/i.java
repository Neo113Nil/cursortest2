package f6;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;

/* loaded from: classes2.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f37490a;

    public i(byte[] bArr) {
        this.f37490a = bArr;
    }

    @Override // f6.g
    public final String a() {
        Base64.Encoder encoder;
        String encodeToString;
        encoder = Base64.getEncoder();
        encodeToString = encoder.encodeToString(this.f37490a);
        return encodeToString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return Arrays.equals(this.f37490a, ((i) obj).f37490a);
        }
        return false;
    }

    @Override // f6.g
    public final int getType() {
        return 7;
    }

    @Override // f6.g
    public final Object getValue() {
        return ByteBuffer.wrap(this.f37490a).asReadOnlyBuffer();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37490a);
    }

    public final String toString() {
        return "ValueBytes{" + a() + "}";
    }
}
