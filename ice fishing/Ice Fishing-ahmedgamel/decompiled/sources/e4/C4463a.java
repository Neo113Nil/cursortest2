package e4;

import g7.m;
import u.AbstractC5049e;
import u1.h;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4463a {

    /* renamed from: a, reason: collision with root package name */
    public final String f37195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37196b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37197c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37198d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37199e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37200f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37201g;

    public C4463a(String str, int i, String str2, String str3, long j6, long j9, String str4) {
        this.f37195a = str;
        this.f37196b = i;
        this.f37197c = str2;
        this.f37198d = str3;
        this.f37199e = j6;
        this.f37200f = j9;
        this.f37201g = str4;
    }

    public final m a() {
        m mVar = new m();
        mVar.f37664b = this.f37195a;
        mVar.f37665c = this.f37196b;
        mVar.f37666d = this.f37197c;
        mVar.f37667e = this.f37198d;
        mVar.f37668f = Long.valueOf(this.f37199e);
        mVar.f37669g = Long.valueOf(this.f37200f);
        mVar.f37670h = this.f37201g;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4463a)) {
            return false;
        }
        C4463a c4463a = (C4463a) obj;
        String str = this.f37195a;
        if (str == null) {
            if (c4463a.f37195a != null) {
                return false;
            }
        } else if (!str.equals(c4463a.f37195a)) {
            return false;
        }
        if (!AbstractC5049e.a(this.f37196b, c4463a.f37196b)) {
            return false;
        }
        String str2 = c4463a.f37197c;
        String str3 = this.f37197c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = c4463a.f37198d;
        String str5 = this.f37198d;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (this.f37199e != c4463a.f37199e || this.f37200f != c4463a.f37200f) {
            return false;
        }
        String str6 = c4463a.f37201g;
        String str7 = this.f37201g;
        return str7 == null ? str6 == null : str7.equals(str6);
    }

    public final int hashCode() {
        String str = this.f37195a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ AbstractC5049e.d(this.f37196b)) * 1000003;
        String str2 = this.f37197c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f37198d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.f37199e;
        int i = (hashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f37200f;
        int i6 = (i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f37201g;
        return (str4 != null ? str4.hashCode() : 0) ^ i6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f37195a);
        sb.append(", registrationStatus=");
        int i = this.f37196b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.f37197c);
        sb.append(", refreshToken=");
        sb.append(this.f37198d);
        sb.append(", expiresInSecs=");
        sb.append(this.f37199e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f37200f);
        sb.append(", fisError=");
        return h.g(sb, this.f37201g, "}");
    }
}
