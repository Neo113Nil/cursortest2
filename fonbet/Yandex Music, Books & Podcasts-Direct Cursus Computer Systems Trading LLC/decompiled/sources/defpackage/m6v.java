package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m6v {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final List d;
    public final n6v e;
    public final g6v f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public m6v(String str, String str2, ArrayList arrayList, List list, n6v n6vVar, g6v g6vVar, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = list;
        this.e = n6vVar;
        this.f = g6vVar;
        this.g = list2;
        this.h = arrayList.contains("CONCERT");
        this.i = arrayList.contains("DONATION");
        this.j = arrayList.contains("FACT");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6v)) {
            return false;
        }
        m6v m6vVar = (m6v) obj;
        return this.a.equals(m6vVar.a) && this.b.equals(m6vVar.b) && this.c.equals(m6vVar.c) && Intrinsics.d(this.d, m6vVar.d) && Intrinsics.d(this.e, m6vVar.e) && this.f.equals(m6vVar.f) && Intrinsics.d(this.g, m6vVar.g);
    }

    public final int hashCode() {
        int d = k5r.d(dfi.b(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        n6v n6vVar = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((d + (n6vVar == null ? 0 : n6vVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveWordsCard(id=", this.a, ", text=", this.b, ", tags=");
        m.append(this.c);
        m.append(", sources=");
        m.append(this.d);
        m.append(", action=");
        m.append(this.e);
        m.append(", analyticPayload=");
        m.append(this.f);
        m.append(", bigCardIds=");
        return vz1.u(m, this.g, ")");
    }
}
