package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* loaded from: classes.dex */
public final class u74 extends w0b0 {
    public final String b;
    public final PersistedInstallation$RegistrationStatus c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public u74(String str, PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = persistedInstallation$RegistrationStatus;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // defpackage.w0b0
    public final String a() {
        return this.d;
    }

    @Override // defpackage.w0b0
    public final long b() {
        return this.f;
    }

    @Override // defpackage.w0b0
    public final String c() {
        return this.b;
    }

    @Override // defpackage.w0b0
    public final String d() {
        return this.h;
    }

    @Override // defpackage.w0b0
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0b0)) {
            return false;
        }
        w0b0 w0b0Var = (w0b0) obj;
        String str = this.b;
        if (str == null) {
            if (w0b0Var.c() != null) {
                return false;
            }
        } else if (!str.equals(w0b0Var.c())) {
            return false;
        }
        if (!this.c.equals(w0b0Var.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (w0b0Var.a() != null) {
                return false;
            }
        } else if (!str2.equals(w0b0Var.a())) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null) {
            if (w0b0Var.e() != null) {
                return false;
            }
        } else if (!str3.equals(w0b0Var.e())) {
            return false;
        }
        if (this.f != w0b0Var.b() || this.g != w0b0Var.g()) {
            return false;
        }
        String str4 = this.h;
        return str4 == null ? w0b0Var.d() == null : str4.equals(w0b0Var.d());
    }

    @Override // defpackage.w0b0
    public final PersistedInstallation$RegistrationStatus f() {
        return this.c;
    }

    @Override // defpackage.w0b0
    public final long g() {
        return this.g;
    }

    @Override // defpackage.w0b0
    public final t74 h() {
        t74 t74Var = new t74();
        t74Var.a = this.b;
        t74Var.b = this.c;
        t74Var.c = this.d;
        t74Var.d = this.e;
        t74Var.e = this.f;
        t74Var.f = this.g;
        t74Var.g = this.h;
        t74Var.h = (byte) 3;
        return t74Var;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return oyr.t(sb, this.h, "}");
    }
}
