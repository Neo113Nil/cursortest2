package w0;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5142b {

    /* renamed from: a, reason: collision with root package name */
    public final String f41629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41631c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41632d;

    /* renamed from: e, reason: collision with root package name */
    public final List f41633e;

    public C5142b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        h.e(columnNames, "columnNames");
        h.e(referenceColumnNames, "referenceColumnNames");
        this.f41629a = str;
        this.f41630b = str2;
        this.f41631c = str3;
        this.f41632d = columnNames;
        this.f41633e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5142b)) {
            return false;
        }
        C5142b c5142b = (C5142b) obj;
        if (h.a(this.f41629a, c5142b.f41629a) && h.a(this.f41630b, c5142b.f41630b) && h.a(this.f41631c, c5142b.f41631c) && h.a(this.f41632d, c5142b.f41632d)) {
            return h.a(this.f41633e, c5142b.f41633e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41633e.hashCode() + ((this.f41632d.hashCode() + u1.h.k(u1.h.k(this.f41629a.hashCode() * 31, 31, this.f41630b), 31, this.f41631c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f41629a + "', onDelete='" + this.f41630b + " +', onUpdate='" + this.f41631c + "', columnNames=" + this.f41632d + ", referenceColumnNames=" + this.f41633e + '}';
    }
}
