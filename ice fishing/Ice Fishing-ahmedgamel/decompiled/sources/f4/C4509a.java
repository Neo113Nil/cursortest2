package f4;

import u.AbstractC5049e;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4509a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37494a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37495b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37496c;

    /* renamed from: d, reason: collision with root package name */
    public final b f37497d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37498e;

    public C4509a(String str, String str2, String str3, b bVar, int i) {
        this.f37494a = str;
        this.f37495b = str2;
        this.f37496c = str3;
        this.f37497d = bVar;
        this.f37498e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4509a)) {
            return false;
        }
        C4509a c4509a = (C4509a) obj;
        String str = this.f37494a;
        if (str == null) {
            if (c4509a.f37494a != null) {
                return false;
            }
        } else if (!str.equals(c4509a.f37494a)) {
            return false;
        }
        String str2 = this.f37495b;
        if (str2 == null) {
            if (c4509a.f37495b != null) {
                return false;
            }
        } else if (!str2.equals(c4509a.f37495b)) {
            return false;
        }
        String str3 = this.f37496c;
        if (str3 == null) {
            if (c4509a.f37496c != null) {
                return false;
            }
        } else if (!str3.equals(c4509a.f37496c)) {
            return false;
        }
        b bVar = this.f37497d;
        if (bVar == null) {
            if (c4509a.f37497d != null) {
                return false;
            }
        } else if (!bVar.equals(c4509a.f37497d)) {
            return false;
        }
        int i = this.f37498e;
        return i == 0 ? c4509a.f37498e == 0 : AbstractC5049e.a(i, c4509a.f37498e);
    }

    public final int hashCode() {
        String str = this.f37494a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f37495b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37496c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f37497d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i = this.f37498e;
        return (i != 0 ? AbstractC5049e.d(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f37494a);
        sb.append(", fid=");
        sb.append(this.f37495b);
        sb.append(", refreshToken=");
        sb.append(this.f37496c);
        sb.append(", authToken=");
        sb.append(this.f37497d);
        sb.append(", responseCode=");
        int i = this.f37498e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
