package defpackage;

import com.yandex.messaging.base.flow.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class yde {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final n4u0 e;

    public yde(int i) {
        this(false, false, false, false, new a(Boolean.FALSE));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yde)) {
            return false;
        }
        yde ydeVar = (yde) obj;
        return this.a == ydeVar.a && this.b == ydeVar.b && this.c == ydeVar.c && this.d == ydeVar.d && jl40.l(this.e, ydeVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = qv10.u("ContactsSettingsUiState(deviceSyncSelected=", ", deviceSyncEnabled=", ", deleteContactsEnabled=", this.a, this.b);
        nnm.v(", deleteContactsProgress=", ", deleteContactsDialogShown=", u, this.c, this.d);
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public yde(boolean z, boolean z2, boolean z3, boolean z4, n4u0 n4u0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = n4u0Var;
    }

    public yde() {
        this(0);
    }
}
