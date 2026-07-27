package Z6;

import java.time.Duration;
import k6.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4178c;

    /* renamed from: a, reason: collision with root package name */
    public final Duration f4179a;

    /* renamed from: b, reason: collision with root package name */
    public final Duration f4180b;

    static {
        Duration ofSeconds;
        Duration ofSeconds2;
        long nanos;
        long nanos2;
        byte b9 = (byte) 1;
        ofSeconds = Duration.ofSeconds(1L);
        if (ofSeconds == null) {
            throw new NullPointerException("Null initialBackoff");
        }
        ofSeconds2 = Duration.ofSeconds(5L);
        if (ofSeconds2 == null) {
            throw new NullPointerException("Null maxBackoff");
        }
        byte b10 = (byte) (b9 | 2);
        if (b10 == 3) {
            a aVar = new a(ofSeconds, ofSeconds2);
            nanos = ofSeconds.toNanos();
            d.a("initialBackoff must be greater than 0", nanos > 0);
            nanos2 = ofSeconds2.toNanos();
            d.a("maxBackoff must be greater than 0", nanos2 > 0);
            f4178c = aVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" maxAttempts");
        }
        if ((b10 & 2) == 0) {
            sb.append(" backoffMultiplier");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public a(Duration duration, Duration duration2) {
        this.f4179a = duration;
        this.f4180b = duration2;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        equals = this.f4179a.equals(aVar.f4179a);
        if (!equals) {
            return false;
        }
        equals2 = this.f4180b.equals(aVar.f4180b);
        return equals2 && Double.doubleToLongBits(1.5d) == Double.doubleToLongBits(1.5d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        hashCode = this.f4179a.hashCode();
        hashCode2 = this.f4180b.hashCode();
        return (((((hashCode ^ (-718379950)) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (Double.doubleToLongBits(1.5d) ^ (Double.doubleToLongBits(1.5d) >>> 32)))) * 1000003;
    }

    public final String toString() {
        return "RetryPolicy{maxAttempts=5, initialBackoff=" + this.f4179a + ", maxBackoff=" + this.f4180b + ", backoffMultiplier=1.5, retryExceptionPredicate=null}";
    }
}
