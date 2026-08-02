package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tga implements vga {
    public final cy9 a;

    public tga(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tga) && jl40.l(this.a, ((tga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Error(errorDetails=", this.a, Extension.C_BRAKE);
    }
}
