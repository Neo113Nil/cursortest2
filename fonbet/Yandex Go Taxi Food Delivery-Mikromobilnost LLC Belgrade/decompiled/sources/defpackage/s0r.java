package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public final class s0r {
    public final File a;
    public final List b;

    public s0r(File file, List list) {
        this.a = file;
        this.b = list;
    }

    public final File a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final int c() {
        return this.b.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0r)) {
            return false;
        }
        s0r s0rVar = (s0r) obj;
        return jl40.l(this.a, s0rVar.a) && this.b.equals(s0rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        return unr0.t(sb, this.b, ')');
    }
}
