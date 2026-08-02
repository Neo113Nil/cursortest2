package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* loaded from: classes.dex */
public final class z3t implements w4u0 {
    public final bx21 a;
    public final atx0 b;

    public z3t(bx21 bx21Var, atx0 atx0Var) {
        this.a = bx21Var;
        this.b = atx0Var;
    }

    @Override // defpackage.w4u0
    public final boolean a(Exception exc) {
        this.b.b(exc);
        return true;
    }

    @Override // defpackage.w4u0
    public final boolean b(w0b0 w0b0Var) {
        if (w0b0Var.f() == PersistedInstallation$RegistrationStatus.REGISTERED && !this.a.a(w0b0Var)) {
            a74 a74Var = new a74();
            String a = w0b0Var.a();
            if (a != null) {
                a74Var.a = a;
                a74Var.b = Long.valueOf(w0b0Var.b());
                a74Var.c = Long.valueOf(w0b0Var.g());
                String str = a74Var.a == null ? " token" : "";
                if (a74Var.b == null) {
                    str = str.concat(" tokenExpirationTimestamp");
                }
                if (a74Var.c == null) {
                    str = str.concat(" tokenCreationTimestamp");
                }
                if (str.isEmpty()) {
                    this.b.a(new b74(a74Var.a, a74Var.b.longValue(), a74Var.c.longValue()));
                    return true;
                }
                ny61.r("Missing required properties:".concat(str));
                return false;
            }
            ny61.t("Null token");
        }
        return false;
    }
}
