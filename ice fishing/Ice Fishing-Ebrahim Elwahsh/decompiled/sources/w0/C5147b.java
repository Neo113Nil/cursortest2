package w0;

import java.util.List;
import kotlin.jvm.internal.h;
import t0.AbstractC5051n;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5147b {

    /* renamed from: a, reason: collision with root package name */
    public final String f41567a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41568b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41569c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41570d;

    /* renamed from: e, reason: collision with root package name */
    public final List f41571e;

    public C5147b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        h.e(columnNames, "columnNames");
        h.e(referenceColumnNames, "referenceColumnNames");
        this.f41567a = str;
        this.f41568b = str2;
        this.f41569c = str3;
        this.f41570d = columnNames;
        this.f41571e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5147b)) {
            return false;
        }
        C5147b c5147b = (C5147b) obj;
        if (h.a(this.f41567a, c5147b.f41567a) && h.a(this.f41568b, c5147b.f41568b) && h.a(this.f41569c, c5147b.f41569c) && h.a(this.f41570d, c5147b.f41570d)) {
            return h.a(this.f41571e, c5147b.f41571e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41571e.hashCode() + ((this.f41570d.hashCode() + AbstractC5051n.k(AbstractC5051n.k(this.f41567a.hashCode() * 31, 31, this.f41568b), 31, this.f41569c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f41567a + "', onDelete='" + this.f41568b + " +', onUpdate='" + this.f41569c + "', columnNames=" + this.f41570d + ", referenceColumnNames=" + this.f41571e + '}';
    }
}
