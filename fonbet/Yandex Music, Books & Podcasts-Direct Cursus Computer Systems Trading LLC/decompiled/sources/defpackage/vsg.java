package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class vsg {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final wt0 f;
    public final LinkedHashMap g;

    public vsg(String str, String str2, String str3, List list, String str4, wt0 wt0Var, LinkedHashMap linkedHashMap) {
        list.getClass();
        str4.getClass();
        wt0Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = wt0Var;
        this.g = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsg)) {
            return false;
        }
        vsg vsgVar = (vsg) obj;
        return this.a.equals(vsgVar.a) && this.b.equals(vsgVar.b) && this.c.equals(vsgVar.c) && Intrinsics.d(this.d, vsgVar.d) && Intrinsics.d(this.e, vsgVar.e) && Intrinsics.d(this.f, vsgVar.f) && this.g.equals(vsgVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + k5r.c(k5r.d(k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        return "LoggingInfoHolder(sessionId=" + this.a + ", vpuid=" + this.b + ", service=" + this.c + ", testIds=" + this.d + ", from=" + this.e + ", appInfo=" + this.f + ", deviceInfo=" + this.g + ')';
    }
}
