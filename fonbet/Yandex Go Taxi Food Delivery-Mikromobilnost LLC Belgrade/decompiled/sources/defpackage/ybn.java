package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ybn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ybn(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybn)) {
            return false;
        }
        ybn ybnVar = (ybn) obj;
        return this.a.equals(ybnVar.a) && this.b.equals(ybnVar.b) && jl40.l(this.c, ybnVar.c) && this.d.equals(ybnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("EatsChatConfig(title=", this.a, ", phoneNumber=", this.b, ", serviceName="), this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }
}
