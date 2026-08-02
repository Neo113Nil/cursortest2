package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class rde extends s120 {
    public final g720 a;
    public final String b = "Messaging.Arguments.Key.ContactsSettings";

    public rde(g720 g720Var) {
        this.a = g720Var;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.b;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rde) && jl40.l(this.a, ((rde) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsSettingsArguments(source=" + this.a + Extension.C_BRAKE;
    }
}
