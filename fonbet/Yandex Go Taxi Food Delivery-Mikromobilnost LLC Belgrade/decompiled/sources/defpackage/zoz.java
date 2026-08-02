package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zoz extends yoz {
    public final opz a;

    public zoz(opz opzVar) {
        this.a = opzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoz) && jl40.l(this.a, ((zoz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LootBoxActivationSuccessEntity(content=" + this.a + Extension.C_BRAKE;
    }
}
