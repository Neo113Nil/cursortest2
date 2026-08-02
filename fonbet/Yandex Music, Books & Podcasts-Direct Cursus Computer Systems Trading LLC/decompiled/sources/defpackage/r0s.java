package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class r0s {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public r0s(String str, String str2, String str3, List list, List list2) {
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0s)) {
            return false;
        }
        return this.a.equals(((r0s) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        StringBuilder m = f1d.m("TabData(id=", this.a, ", title=", this.b, ", subtitle=");
        m.append(this.c);
        m.append(", covers=");
        m.append(this.d);
        m.append(", blocks=");
        return vz1.u(m, this.e, ")");
    }
}
