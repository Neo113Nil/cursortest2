package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uxu0 extends sxu0 {
    public final String a;
    public final String b;
    public final txu0 c;
    public final String d;

    public uxu0(String str, String str2, txu0 txu0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = txu0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxu0)) {
            return false;
        }
        uxu0 uxu0Var = (uxu0) obj;
        return jl40.l(this.a, uxu0Var.a) && jl40.l(this.b, uxu0Var.b) && jl40.l(this.c, uxu0Var.c) && jl40.l(this.d, uxu0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        txu0 txu0Var = this.c;
        return this.d.hashCode() + ((b + (txu0Var == null ? 0 : txu0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PinIcon(imageUrl=", this.a, ", text=", this.b, ", collapsedIcon=");
        v.append(this.c);
        v.append(", backgroundColor=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
