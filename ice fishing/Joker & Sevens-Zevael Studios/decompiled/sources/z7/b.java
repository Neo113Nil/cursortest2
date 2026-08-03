package z7;

import b0.q0;
import v.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f9164a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9166c;

    public b(int i10, long j3, String str) {
        this.f9164a = str;
        this.f9165b = j3;
        this.f9166c = i10;
    }

    public static q0 a() {
        q0 q0Var = new q0();
        q0Var.f875c = 0L;
        return q0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.f9166c;
        String str = bVar.f9164a;
        String str2 = this.f9164a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f9165b != bVar.f9165b) {
            return false;
        }
        int i11 = this.f9166c;
        return i11 == 0 ? i10 == 0 : f.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f9164a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j3 = this.f9165b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        int i11 = this.f9166c;
        return (i11 != 0 ? f.d(i11) : 0) ^ i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f9164a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f9165b);
        sb.append(", responseCode=");
        int i10 = this.f9166c;
        sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
