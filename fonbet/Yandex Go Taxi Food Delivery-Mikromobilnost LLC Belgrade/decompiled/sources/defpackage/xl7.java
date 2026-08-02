package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xl7 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public xl7(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl7)) {
            return false;
        }
        xl7 xl7Var = (xl7) obj;
        return this.a == xl7Var.a && this.b == xl7Var.b && this.c == xl7Var.c && this.d == xl7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", showSelfInGallery=", Extension.C_BRAKE, qv10.u("CallsSettingsUiState(alwaysJoinWithMicDisabled=", ", alwaysJoinWithCameraDisabled=", ", hideParticipantsVideo=", this.a, this.b), this.c, this.d);
    }

    public xl7() {
        this(false, false, false, false);
    }
}
