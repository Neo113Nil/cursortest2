package f4;

import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37499a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37501c;

    public b(int i, long j6, String str) {
        this.f37499a = str;
        this.f37500b = j6;
        this.f37501c = i;
    }

    public static F.d a() {
        F.d dVar = new F.d((byte) 0, 4);
        dVar.f856d = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f37499a;
        if (str == null) {
            if (bVar.f37499a != null) {
                return false;
            }
        } else if (!str.equals(bVar.f37499a)) {
            return false;
        }
        if (this.f37500b != bVar.f37500b) {
            return false;
        }
        int i = bVar.f37501c;
        int i6 = this.f37501c;
        return i6 == 0 ? i == 0 : AbstractC5049e.a(i6, i);
    }

    public final int hashCode() {
        String str = this.f37499a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j6 = this.f37500b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        int i6 = this.f37501c;
        return (i6 != 0 ? AbstractC5049e.d(i6) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f37499a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f37500b);
        sb.append(", responseCode=");
        int i = this.f37501c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
