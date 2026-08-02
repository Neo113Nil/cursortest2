package kotlin.random;

import defpackage.c9;
import defpackage.gga1;
import defpackage.jwc0;
import defpackage.ovc0;
import defpackage.t3x;
import defpackage.w9p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes9.dex */
public abstract class Random {
    public static final Default a = new Default();
    public static final c9 b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u000fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Default extends Random implements Serializable {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Serialized implements Serializable {
            public static final Serialized a = new Serialized();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return Random.a;
            }
        }

        private final void readObject(ObjectInputStream input) {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return Serialized.a;
        }

        @Override // kotlin.random.Random
        public final int a(int i) {
            return Random.b.a(i);
        }

        @Override // kotlin.random.Random
        public final int b() {
            return Random.b.b();
        }

        @Override // kotlin.random.Random
        public final int c(int i) {
            return Random.b.c(i);
        }

        @Override // kotlin.random.Random
        public final int f(int i, int i2) {
            return Random.b.f(i, i2);
        }

        @Override // kotlin.random.Random
        public final long g() {
            return Random.b.g();
        }

        @Override // kotlin.random.Random
        public final long h(long j) {
            throw null;
        }

        @Override // kotlin.random.Random
        public final long i(long j, long j2) {
            return Random.b.i(j, j2);
        }

        public final byte[] j(int i) {
            c9 c9Var = Random.b;
            c9Var.getClass();
            byte[] bArr = new byte[i];
            c9Var.j().nextBytes(bArr);
            return bArr;
        }
    }

    static {
        ovc0.a.getClass();
        Integer num = t3x.a;
        b = (num == null || num.intValue() >= 34) ? new jwc0() : new w9p();
    }

    public abstract int a(int i);

    public int b() {
        return a(32);
    }

    public int c(int i) {
        return f(0, i);
    }

    public int f(int i, int i2) {
        int b2;
        int i3;
        int i4;
        gga1.a(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = a(gga1.h(i5));
            } else {
                do {
                    b2 = b() >>> 1;
                    i3 = b2 % i5;
                } while ((i5 - 1) + (b2 - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int b3 = b();
            if (i <= b3 && b3 < i2) {
                return b3;
            }
        }
    }

    public long g() {
        return (b() << 32) + b();
    }

    public long h(long j) {
        return i(0L, j);
    }

    public long i(long j, long j2) {
        long g;
        long j3;
        long j4;
        int b2;
        gga1.b(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    b2 = a(gga1.h(i));
                } else if (i2 == 1) {
                    b2 = b();
                } else {
                    j4 = (a(gga1.h(i2)) << 32) + (b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                }
                j4 = b2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
            } else {
                do {
                    g = g() >>> 1;
                    j3 = g % j5;
                } while ((j5 - 1) + (g - j3) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long g2 = g();
            if (j <= g2 && g2 < j2) {
                return g2;
            }
        }
    }
}
