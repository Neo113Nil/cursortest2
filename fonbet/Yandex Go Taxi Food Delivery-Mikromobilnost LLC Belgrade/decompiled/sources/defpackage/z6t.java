package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class z6t {
    public final CharSequence a;
    public final String b;
    public final int c;

    public z6t(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6t)) {
            return false;
        }
        z6t z6tVar = (z6t) obj;
        return jl40.l(this.a, z6tVar.a) && jl40.l(this.b, z6tVar.b) && this.c == z6tVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DndWarningViewData(displayName=");
        sb.append((Object) this.a);
        sb.append(", statusTitle=");
        sb.append(this.b);
        sb.append(", statusIcon=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
