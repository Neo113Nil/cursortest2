package w0;

import java.util.List;
import kotlin.jvm.internal.h;
import w.AbstractC5128c;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5132b {

    /* renamed from: a, reason: collision with root package name */
    public final String f41411a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41412b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41413c;

    /* renamed from: d, reason: collision with root package name */
    public final List f41414d;

    /* renamed from: e, reason: collision with root package name */
    public final List f41415e;

    public C5132b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        h.e(columnNames, "columnNames");
        h.e(referenceColumnNames, "referenceColumnNames");
        this.f41411a = str;
        this.f41412b = str2;
        this.f41413c = str3;
        this.f41414d = columnNames;
        this.f41415e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5132b)) {
            return false;
        }
        C5132b c5132b = (C5132b) obj;
        if (h.a(this.f41411a, c5132b.f41411a) && h.a(this.f41412b, c5132b.f41412b) && h.a(this.f41413c, c5132b.f41413c) && h.a(this.f41414d, c5132b.f41414d)) {
            return h.a(this.f41415e, c5132b.f41415e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41415e.hashCode() + ((this.f41414d.hashCode() + AbstractC5128c.a(AbstractC5128c.a(this.f41411a.hashCode() * 31, 31, this.f41412b), 31, this.f41413c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f41411a + "', onDelete='" + this.f41412b + " +', onUpdate='" + this.f41413c + "', columnNames=" + this.f41414d + ", referenceColumnNames=" + this.f41415e + '}';
    }
}
