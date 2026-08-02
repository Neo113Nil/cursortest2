package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a3u implements b3u {
    public final String a;
    public final String b;
    public final jzb c;
    public final long d;
    public final List e;
    public final List f;
    public final mqs g;

    public a3u(String str, String str2, jzb jzbVar, long j, List list, List list2, mqs mqsVar) {
        str.getClass();
        str2.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = jzbVar;
        this.d = j;
        this.e = list;
        this.f = list2;
        this.g = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3u)) {
            return false;
        }
        a3u a3uVar = (a3u) obj;
        return Intrinsics.d(this.a, a3uVar.a) && Intrinsics.d(this.b, a3uVar.b) && this.c == a3uVar.c && this.d == a3uVar.d && Intrinsics.d(this.e, a3uVar.e) && Intrinsics.d(this.f, a3uVar.f) && Intrinsics.d(this.g, a3uVar.g);
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        jzb jzbVar = this.c;
        int c2 = tlm.c(this.d, (c + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31, 31);
        List list = this.e;
        int d = k5r.d((c2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f);
        mqs mqsVar = this.g;
        return d + (mqsVar != null ? mqsVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Success(coverUrl=", this.a, ", title=", this.b, ", explicitType=");
        m.append(this.c);
        m.append(", duration=");
        m.append(this.d);
        m.append(", artists=");
        m.append(this.e);
        m.append(", disclaimers=");
        m.append(this.f);
        m.append(", track=");
        m.append(this.g);
        m.append(")");
        return m.toString();
    }
}
