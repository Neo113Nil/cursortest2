package h4;

import u.AbstractC5050e;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4574a {

    /* renamed from: a, reason: collision with root package name */
    public final String f38118a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38120c;

    /* renamed from: d, reason: collision with root package name */
    public final C4575b f38121d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38122e;

    public C4574a(String str, String str2, String str3, C4575b c4575b, int i) {
        this.f38118a = str;
        this.f38119b = str2;
        this.f38120c = str3;
        this.f38121d = c4575b;
        this.f38122e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4574a)) {
            return false;
        }
        C4574a c4574a = (C4574a) obj;
        String str = this.f38118a;
        if (str == null) {
            if (c4574a.f38118a != null) {
                return false;
            }
        } else if (!str.equals(c4574a.f38118a)) {
            return false;
        }
        String str2 = this.f38119b;
        if (str2 == null) {
            if (c4574a.f38119b != null) {
                return false;
            }
        } else if (!str2.equals(c4574a.f38119b)) {
            return false;
        }
        String str3 = this.f38120c;
        if (str3 == null) {
            if (c4574a.f38120c != null) {
                return false;
            }
        } else if (!str3.equals(c4574a.f38120c)) {
            return false;
        }
        C4575b c4575b = this.f38121d;
        if (c4575b == null) {
            if (c4574a.f38121d != null) {
                return false;
            }
        } else if (!c4575b.equals(c4574a.f38121d)) {
            return false;
        }
        int i = this.f38122e;
        return i == 0 ? c4574a.f38122e == 0 : AbstractC5050e.a(i, c4574a.f38122e);
    }

    public final int hashCode() {
        String str = this.f38118a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f38119b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f38120c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C4575b c4575b = this.f38121d;
        int hashCode4 = (hashCode3 ^ (c4575b == null ? 0 : c4575b.hashCode())) * 1000003;
        int i = this.f38122e;
        return (i != 0 ? AbstractC5050e.d(i) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f38118a);
        sb.append(", fid=");
        sb.append(this.f38119b);
        sb.append(", refreshToken=");
        sb.append(this.f38120c);
        sb.append(", authToken=");
        sb.append(this.f38121d);
        sb.append(", responseCode=");
        int i = this.f38122e;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
