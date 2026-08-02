package g4;

import com.google.android.gms.internal.ads.Wv;
import g7.m;
import u.AbstractC5050e;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4532a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37673c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37674d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37675e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37676f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37677g;

    public C4532a(String str, int i, String str2, String str3, long j6, long j9, String str4) {
        this.f37671a = str;
        this.f37672b = i;
        this.f37673c = str2;
        this.f37674d = str3;
        this.f37675e = j6;
        this.f37676f = j9;
        this.f37677g = str4;
    }

    public final m a() {
        m mVar = new m();
        mVar.f37689b = this.f37671a;
        mVar.f37690c = this.f37672b;
        mVar.f37691d = this.f37673c;
        mVar.f37692e = this.f37674d;
        mVar.f37693f = Long.valueOf(this.f37675e);
        mVar.f37694g = Long.valueOf(this.f37676f);
        mVar.f37695h = this.f37677g;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4532a)) {
            return false;
        }
        C4532a c4532a = (C4532a) obj;
        String str = this.f37671a;
        if (str == null) {
            if (c4532a.f37671a != null) {
                return false;
            }
        } else if (!str.equals(c4532a.f37671a)) {
            return false;
        }
        if (!AbstractC5050e.a(this.f37672b, c4532a.f37672b)) {
            return false;
        }
        String str2 = c4532a.f37673c;
        String str3 = this.f37673c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = c4532a.f37674d;
        String str5 = this.f37674d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f37675e != c4532a.f37675e || this.f37676f != c4532a.f37676f) {
            return false;
        }
        String str6 = c4532a.f37677g;
        String str7 = this.f37677g;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f37671a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC5050e.d(this.f37672b)) * 1000003;
        String str2 = this.f37673c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37674d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.f37675e;
        int i = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f37676f;
        int i4 = (i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f37677g;
        return (str4 != null ? str4.hashCode() : 0) ^ i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f37671a);
        sb.append(", registrationStatus=");
        int i = this.f37672b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f37673c);
        sb.append(", refreshToken=");
        sb.append(this.f37674d);
        sb.append(", expiresInSecs=");
        sb.append(this.f37675e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f37676f);
        sb.append(", fisError=");
        return Wv.i(sb, this.f37677g, "}");
    }
}
