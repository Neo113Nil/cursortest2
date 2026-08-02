package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zut0 implements cvt0 {
    public final rr51 a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public zut0(rr51 rr51Var, ListBuilder listBuilder, boolean z, boolean z2) {
        this.a = rr51Var;
        this.b = listBuilder;
        this.c = z;
        this.d = z2;
    }

    public final rr51 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zut0)) {
            return false;
        }
        zut0 zut0Var = (zut0) obj;
        return this.a.equals(zut0Var.a) && jl40.l(this.b, zut0Var.b) && this.c == zut0Var.c && this.d == zut0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(divKitData=");
        sb.append(this.a);
        sb.append(", localVariables=");
        sb.append(this.b);
        sb.append(", isHeaderClickable=");
        return smw0.k(", shouldResetDivkitVariablesOnNewData=", Extension.C_BRAKE, sb, this.c, this.d);
    }
}
