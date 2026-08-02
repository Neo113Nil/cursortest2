package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.d;

/* loaded from: classes.dex */
public abstract class yv4 {
    public int a;
    public Object b;

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static d f(byte[] bArr, int i, int i2, boolean z) {
        d dVar = new d(bArr, i, i2, z);
        try {
            dVar.h(i2);
            return dVar;
        } catch (InvalidProtocolBufferException e) {
            yci0.r(e);
            return null;
        }
    }

    public abstract long A();

    public abstract boolean B(int i);

    public void C() {
        int y;
        do {
            y = y();
            if (y == 0) {
                return;
            }
            int i = this.a;
            if (i >= 100) {
                throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (B(y));
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public abstract void g(int i);

    public abstract int h(int i);

    public abstract boolean i();

    public abstract ByteString j();

    public abstract com.google.crypto.tink.shaded.protobuf.ByteString k();

    public abstract double l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract float p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract String w();

    public abstract String x();

    public abstract int y();

    public abstract int z();
}
