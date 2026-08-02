package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ub5 {
    public static final ub5 j = new ub5(false, false, false, false, false, false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public ub5(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub5)) {
            return false;
        }
        ub5 ub5Var = (ub5) obj;
        return this.a == ub5Var.a && this.b == ub5Var.b && this.c == ub5Var.c && this.d == ub5Var.d && this.e == ub5Var.e && this.f == ub5Var.f && this.g == ub5Var.g && this.h == ub5Var.h && this.i == ub5Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder u = qv10.u("MessageUiConfig(isThreadHeader=", ", showThreadOverlay=", ", canWriteToChat=", this.a, this.b);
        nnm.v(", canCreatePersonalMeetingsWithUser=", ", canSelectMessages=", u, this.c, this.d);
        nnm.v(", showMessageStatusData=", ", showAuthors=", u, this.e, this.f);
        nnm.v(", showAiBotInteractions=", ", hasBotCommandHighlights=", u, this.g, this.h);
        return x4e.i(u, this.i, Extension.C_BRAKE);
    }
}
