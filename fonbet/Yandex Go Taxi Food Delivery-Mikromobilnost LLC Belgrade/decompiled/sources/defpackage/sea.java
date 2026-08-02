package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sea {
    public final CharSequence a;
    public final mea b;

    public sea(CharSequence charSequence, mea meaVar) {
        this.a = charSequence;
        this.b = meaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sea)) {
            return false;
        }
        sea seaVar = (sea) obj;
        return jl40.l(this.a, seaVar.a) && this.b.equals(seaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(text=" + ((Object) this.a) + ", action=" + this.b + Extension.C_BRAKE;
    }
}
