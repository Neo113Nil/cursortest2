package z7;

import v.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9161c;

    /* renamed from: d, reason: collision with root package name */
    public final b f9162d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9163e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f9159a = str;
        this.f9160b = str2;
        this.f9161c = str3;
        this.f9162d = bVar;
        this.f9163e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f9163e;
        b bVar = aVar.f9162d;
        String str = aVar.f9161c;
        String str2 = aVar.f9160b;
        String str3 = aVar.f9159a;
        String str4 = this.f9159a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f9160b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f9161c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f9162d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.f9163e;
        return i11 == 0 ? i10 == 0 : f.a(i11, i10);
    }

    public final int hashCode() {
        String str = this.f9159a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f9160b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9161c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f9162d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f9163e;
        return (i10 != 0 ? f.d(i10) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f9159a);
        sb.append(", fid=");
        sb.append(this.f9160b);
        sb.append(", refreshToken=");
        sb.append(this.f9161c);
        sb.append(", authToken=");
        sb.append(this.f9162d);
        sb.append(", responseCode=");
        int i10 = this.f9163e;
        sb.append(i10 != 1 ? i10 != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
