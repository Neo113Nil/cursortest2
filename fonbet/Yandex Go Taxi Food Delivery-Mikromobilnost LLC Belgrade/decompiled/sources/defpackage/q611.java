package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q611 implements h711 {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final String d;
    public final k911 e;
    public final String f;

    public q611(CharSequence charSequence, String str, String str2, String str3, k911 k911Var, String str4) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = k911Var;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q611)) {
            return false;
        }
        q611 q611Var = (q611) obj;
        return jl40.l(this.a, q611Var.a) && jl40.l(this.b, q611Var.b) && jl40.l(this.c, q611Var.c) && this.d.equals(q611Var.d) && this.e.equals(q611Var.e) && this.f.equals(q611Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.f;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.f.hashCode() + smw0.e(this.e, unr0.b(unr0.b(unr0.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntermediateStopItem(index=");
        sb.append((Object) this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", time=");
        g8e.D(sb, this.c, ", contentDescription=", this.d, ", transportType=");
        sb.append(this.e);
        sb.append(", id=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
