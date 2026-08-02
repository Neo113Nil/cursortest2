package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class smj {
    public final String a;
    public final gnj b;
    public final cnj c;

    public smj(String str, gnj gnjVar, cnj cnjVar) {
        this.a = str;
        this.b = gnjVar;
        this.c = cnjVar;
    }

    public static smj a(smj smjVar, gnj gnjVar) {
        String str = smjVar.a;
        cnj cnjVar = smjVar.c;
        smjVar.getClass();
        return new smj(str, gnjVar, cnjVar);
    }

    public final String b() {
        return this.a;
    }

    public final gnj c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smj)) {
            return false;
        }
        smj smjVar = (smj) obj;
        return jl40.l(this.a, smjVar.a) && jl40.l(this.b, smjVar.b) && jl40.l(this.c, smjVar.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Directive(name=" + dnj.a(this.a) + ", payload=" + this.b + ", metadata=" + this.c + Extension.C_BRAKE;
    }

    public /* synthetic */ smj(String str, gnj gnjVar) {
        this(str, gnjVar, new cnj());
    }
}
