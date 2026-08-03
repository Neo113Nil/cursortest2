package d4;

import java.util.List;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1662a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1663b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1664c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1665d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1666e;

    public b(String str, String str2, String str3, List list, List list2) {
        j.e(list, "columnNames");
        j.e(list2, "referenceColumnNames");
        this.f1662a = str;
        this.f1663b = str2;
        this.f1664c = str3;
        this.f1665d = list;
        this.f1666e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.f1662a, bVar.f1662a) && j.a(this.f1663b, bVar.f1663b) && j.a(this.f1664c, bVar.f1664c) && j.a(this.f1665d, bVar.f1665d)) {
            return j.a(this.f1666e, bVar.f1666e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1666e.hashCode() + ((this.f1665d.hashCode() + ((this.f1664c.hashCode() + ((this.f1663b.hashCode() + (this.f1662a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f1662a + "', onDelete='" + this.f1663b + " +', onUpdate='" + this.f1664c + "', columnNames=" + this.f1665d + ", referenceColumnNames=" + this.f1666e + '}';
    }
}
