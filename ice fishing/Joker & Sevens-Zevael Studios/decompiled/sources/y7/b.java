package y7;

import v.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f8803a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8804b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8805c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8806d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8807e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8808f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8809g;

    public b(String str, int i10, String str2, String str3, long j3, long j6, String str4) {
        this.f8803a = str;
        this.f8804b = i10;
        this.f8805c = str2;
        this.f8806d = str3;
        this.f8807e = j3;
        this.f8808f = j6;
        this.f8809g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f8796a = this.f8803a;
        aVar.f8797b = this.f8804b;
        aVar.f8798c = this.f8805c;
        aVar.f8799d = this.f8806d;
        aVar.f8800e = Long.valueOf(this.f8807e);
        aVar.f8801f = Long.valueOf(this.f8808f);
        aVar.f8802g = this.f8809g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f8809g;
        String str2 = bVar.f8806d;
        String str3 = bVar.f8805c;
        String str4 = bVar.f8803a;
        String str5 = this.f8803a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!f.a(this.f8804b, bVar.f8804b)) {
            return false;
        }
        String str6 = this.f8805c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f8806d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.f8807e != bVar.f8807e || this.f8808f != bVar.f8808f) {
            return false;
        }
        String str8 = this.f8809g;
        return str8 == null ? str == null : str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f8803a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ f.d(this.f8804b)) * 1000003;
        String str2 = this.f8805c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8806d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j3 = this.f8807e;
        int i10 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j6 = this.f8808f;
        int i11 = (i10 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.f8809g;
        return (str4 != null ? str4.hashCode() : 0) ^ i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f8803a);
        sb.append(", registrationStatus=");
        int i10 = this.f8804b;
        sb.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f8805c);
        sb.append(", refreshToken=");
        sb.append(this.f8806d);
        sb.append(", expiresInSecs=");
        sb.append(this.f8807e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f8808f);
        sb.append(", fisError=");
        sb.append(this.f8809g);
        sb.append("}");
        return sb.toString();
    }
}
