package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class gow {
    public final String a;
    public final fow b;
    public final String c;
    public final String d;
    public final String e;
    public final wqw f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final List l;

    public gow(String str, fow fowVar, String str2, String str3, String str4, wqw wqwVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        list.getClass();
        this.a = str;
        this.b = fowVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = wqwVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gow)) {
            return false;
        }
        gow gowVar = (gow) obj;
        return this.a.equals(gowVar.a) && this.b == gowVar.b && this.c.equals(gowVar.c) && this.d.equals(gowVar.d) && this.e.equals(gowVar.e) && this.f.equals(gowVar.f) && this.g == gowVar.g && this.h == gowVar.h && this.i == gowVar.i && this.j == gowVar.j && this.k == gowVar.k && Intrinsics.d(this.l, gowVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + k5r.e(k5r.e(k5r.e(k5r.e(k5r.e((this.f.hashCode() + k5r.c(k5r.c(k5r.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        return this.b + "(name=" + this.c + ", id=" + this.a + ")";
    }
}
