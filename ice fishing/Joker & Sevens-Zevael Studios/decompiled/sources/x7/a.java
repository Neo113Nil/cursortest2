package x7;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8372a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8373b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8374c;

    public a(String str, long j3, long j6) {
        this.f8372a = str;
        this.f8373b = j3;
        this.f8374c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8372a.equals(aVar.f8372a) && this.f8373b == aVar.f8373b && this.f8374c == aVar.f8374c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f8372a.hashCode() ^ 1000003) * 1000003;
        long j3 = this.f8373b;
        long j6 = this.f8374c;
        return ((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f8372a + ", tokenExpirationTimestamp=" + this.f8373b + ", tokenCreationTimestamp=" + this.f8374c + "}";
    }
}
