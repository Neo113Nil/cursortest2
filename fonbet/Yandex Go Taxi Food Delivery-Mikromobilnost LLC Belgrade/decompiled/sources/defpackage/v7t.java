package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* loaded from: classes.dex */
public final class v7t implements w4u0 {
    public final atx0 a;

    public v7t(atx0 atx0Var) {
        this.a = atx0Var;
    }

    @Override // defpackage.w4u0
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.w4u0
    public final boolean b(w0b0 w0b0Var) {
        if (w0b0Var.f() != PersistedInstallation$RegistrationStatus.UNREGISTERED && w0b0Var.f() != PersistedInstallation$RegistrationStatus.REGISTERED && w0b0Var.f() != PersistedInstallation$RegistrationStatus.REGISTER_ERROR) {
            return false;
        }
        this.a.c(w0b0Var.c());
        return true;
    }
}
