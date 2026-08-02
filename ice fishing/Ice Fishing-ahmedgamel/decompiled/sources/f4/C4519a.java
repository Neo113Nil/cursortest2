package f4;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4519a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37448a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37449b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37450c;

    public C4519a(String str, long j6, long j9) {
        this.f37448a = str;
        this.f37449b = j6;
        this.f37450c = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4519a) {
            C4519a c4519a = (C4519a) obj;
            if (this.f37448a.equals(c4519a.f37448a) && this.f37449b == c4519a.f37449b && this.f37450c == c4519a.f37450c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f37448a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f37449b;
        long j9 = this.f37450c;
        return ((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f37448a + ", tokenExpirationTimestamp=" + this.f37449b + ", tokenCreationTimestamp=" + this.f37450c + "}";
    }
}
