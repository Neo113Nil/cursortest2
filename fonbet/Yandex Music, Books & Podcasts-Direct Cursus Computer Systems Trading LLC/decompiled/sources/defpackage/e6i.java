package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e6i implements yit {
    public final String a;
    public final String b;
    public final String c;
    public final u9b d;

    public e6i(String str, String str2, String str3, u9b u9bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6i)) {
            return false;
        }
        e6i e6iVar = (e6i) obj;
        return this.a.equals(e6iVar.a) && this.b.equals(e6iVar.b) && this.c.equals(e6iVar.c) && Intrinsics.d(this.d, e6iVar.d);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        u9b u9bVar = this.d;
        return c + (u9bVar == null ? 0 : u9bVar.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("MixUniversalEntity(id=", this.a, ", title=", this.b, ", deeplink=");
        m.append(this.c);
        m.append(", cover=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
