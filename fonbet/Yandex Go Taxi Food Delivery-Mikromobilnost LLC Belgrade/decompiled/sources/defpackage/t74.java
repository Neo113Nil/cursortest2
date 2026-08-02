package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import defpackage.w0b0;

/* loaded from: classes.dex */
public final class t74 extends w0b0.a {
    public String a;
    public PersistedInstallation$RegistrationStatus b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final u74 a() {
        if (this.h == 3 && this.b != null) {
            return new u74(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final t74 b(long j) {
        this.e = j;
        this.h = (byte) (this.h | 1);
        return this;
    }

    public final t74 c(PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus) {
        if (persistedInstallation$RegistrationStatus != null) {
            this.b = persistedInstallation$RegistrationStatus;
            return this;
        }
        ny61.t("Null registrationStatus");
        return null;
    }

    public final t74 d(long j) {
        this.f = j;
        this.h = (byte) (this.h | 2);
        return this;
    }
}
