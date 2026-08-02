package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jfs {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final u9b e;

    public jfs(String str, String str2, String str3, List list, u9b u9bVar) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = u9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfs)) {
            return false;
        }
        jfs jfsVar = (jfs) obj;
        return this.a.equals(jfsVar.a) && this.b.equals(jfsVar.b) && this.c.equals(jfsVar.c) && Intrinsics.d(this.d, jfsVar.d) && this.e.equals(jfsVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.d(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Item(label=", this.a, ", description=", this.b, ", trackTitle=");
        m.append(this.c);
        m.append(", trackArtists=");
        m.append(this.d);
        m.append(", trackCover=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
