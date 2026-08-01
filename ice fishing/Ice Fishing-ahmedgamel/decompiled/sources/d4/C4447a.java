package d4;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4447a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37046a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37047b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37048c;

    public C4447a(String str, long j6, long j9) {
        this.f37046a = str;
        this.f37047b = j6;
        this.f37048c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4447a) {
            C4447a c4447a = (C4447a) obj;
            if (this.f37046a.equals(c4447a.f37046a) && this.f37047b == c4447a.f37047b && this.f37048c == c4447a.f37048c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f37046a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f37047b;
        long j9 = this.f37048c;
        return ((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f37046a + ", tokenExpirationTimestamp=" + this.f37047b + ", tokenCreationTimestamp=" + this.f37048c + "}";
    }
}
