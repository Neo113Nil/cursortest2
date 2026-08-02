package h4;

import u.AbstractC5050e;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4575b {

    /* renamed from: a, reason: collision with root package name */
    public final String f38123a;

    /* renamed from: b, reason: collision with root package name */
    public final long f38124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38125c;

    public C4575b(int i, long j6, String str) {
        this.f38123a = str;
        this.f38124b = j6;
        this.f38125c = i;
    }

    public static F.d a() {
        F.d dVar = new F.d((byte) 0, 6);
        dVar.f919d = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4575b)) {
            return false;
        }
        C4575b c4575b = (C4575b) obj;
        String str = this.f38123a;
        if (str == null) {
            if (c4575b.f38123a != null) {
                return false;
            }
        } else if (!str.equals(c4575b.f38123a)) {
            return false;
        }
        if (this.f38124b != c4575b.f38124b) {
            return false;
        }
        int i = c4575b.f38125c;
        int i4 = this.f38125c;
        return i4 == 0 ? i == 0 : AbstractC5050e.a(i4, i);
    }

    public final int hashCode() {
        String str = this.f38123a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j6 = this.f38124b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        int i4 = this.f38125c;
        return (i4 != 0 ? AbstractC5050e.d(i4) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f38123a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f38124b);
        sb.append(", responseCode=");
        int i = this.f38125c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
