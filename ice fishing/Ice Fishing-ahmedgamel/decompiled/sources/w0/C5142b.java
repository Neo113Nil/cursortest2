package w0;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5142b {

    /* renamed from: a, reason: collision with root package name */
    public final String f41632a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41633b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41634c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41635d;

    /* renamed from: e, reason: collision with root package name */
    public final List f41636e;

    public C5142b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        h.e(columnNames, "columnNames");
        h.e(referenceColumnNames, "referenceColumnNames");
        this.f41632a = str;
        this.f41633b = str2;
        this.f41634c = str3;
        this.f41635d = columnNames;
        this.f41636e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5142b)) {
            return false;
        }
        C5142b c5142b = (C5142b) obj;
        if (h.a(this.f41632a, c5142b.f41632a) && h.a(this.f41633b, c5142b.f41633b) && h.a(this.f41634c, c5142b.f41634c) && h.a(this.f41635d, c5142b.f41635d)) {
            return h.a(this.f41636e, c5142b.f41636e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41636e.hashCode() + ((this.f41635d.hashCode() + u1.h.k(u1.h.k(this.f41632a.hashCode() * 31, 31, this.f41633b), 31, this.f41634c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f41632a + "', onDelete='" + this.f41633b + " +', onUpdate='" + this.f41634c + "', columnNames=" + this.f41635d + ", referenceColumnNames=" + this.f41636e + '}';
    }
}
