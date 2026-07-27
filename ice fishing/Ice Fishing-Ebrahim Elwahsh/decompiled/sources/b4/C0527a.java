package b4;

import u.AbstractC5088e;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0527a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5539b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5540c;

    /* renamed from: d, reason: collision with root package name */
    public final b f5541d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5542e;

    public C0527a(String str, String str2, String str3, b bVar, int i) {
        this.f5538a = str;
        this.f5539b = str2;
        this.f5540c = str3;
        this.f5541d = bVar;
        this.f5542e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0527a)) {
            return false;
        }
        C0527a c0527a = (C0527a) obj;
        String str = this.f5538a;
        if (str == null) {
            if (c0527a.f5538a != null) {
                return false;
            }
        } else if (!str.equals(c0527a.f5538a)) {
            return false;
        }
        String str2 = this.f5539b;
        if (str2 == null) {
            if (c0527a.f5539b != null) {
                return false;
            }
        } else if (!str2.equals(c0527a.f5539b)) {
            return false;
        }
        String str3 = this.f5540c;
        if (str3 == null) {
            if (c0527a.f5540c != null) {
                return false;
            }
        } else if (!str3.equals(c0527a.f5540c)) {
            return false;
        }
        b bVar = this.f5541d;
        if (bVar == null) {
            if (c0527a.f5541d != null) {
                return false;
            }
        } else if (!bVar.equals(c0527a.f5541d)) {
            return false;
        }
        int i = this.f5542e;
        return i == 0 ? c0527a.f5542e == 0 : AbstractC5088e.a(i, c0527a.f5542e);
    }

    public final int hashCode() {
        String str = this.f5538a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f5539b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5540c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f5541d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i = this.f5542e;
        return (i != 0 ? AbstractC5088e.d(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f5538a);
        sb.append(", fid=");
        sb.append(this.f5539b);
        sb.append(", refreshToken=");
        sb.append(this.f5540c);
        sb.append(", authToken=");
        sb.append(this.f5541d);
        sb.append(", responseCode=");
        int i = this.f5542e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
