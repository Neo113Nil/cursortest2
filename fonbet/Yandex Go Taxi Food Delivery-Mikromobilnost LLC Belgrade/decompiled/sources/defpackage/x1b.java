package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x1b extends s120 {
    public final g720 a;
    public final String b;
    public final String c = "Messaging.Arguments.Key.ChatCreateInfo";

    public x1b(g720 g720Var, String str) {
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
        if (!(obj instanceof x1b)) {
            return false;
        }
        x1b x1bVar = (x1b) obj;
        return jl40.l(this.a, x1bVar.a) && jl40.l(this.b, x1bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatCreateInfoArguments(source=" + this.a + ", chatType=" + this.b + Extension.C_BRAKE;
    }
}
