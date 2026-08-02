package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class s4f extends u4f {
    public final g720 a;
    public final String b;
    public final String c = "Messaging.Arguments.Key.FolderDialog.Create";

    public s4f(g720 g720Var, String str) {
        this.a = g720Var;
        this.b = str;
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4f)) {
            return false;
        }
        s4f s4fVar = (s4f) obj;
        return jl40.l(this.a, s4fVar.a) && jl40.l(this.b, s4fVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CreateFolder(source=" + this.a + ", predefinedChat=" + this.b + Extension.C_BRAKE;
    }
}
