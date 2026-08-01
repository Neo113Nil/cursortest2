package a1;

import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f1729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1731c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1732d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1733f;

    public q(int i, String str, String str2, String str3, List list, String str4) {
        this.f1729a = i;
        this.f1730b = str;
        this.f1731c = str2;
        this.f1732d = str3;
        this.e = list;
        this.f1733f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f1729a == qVar.f1729a && this.f1730b.equals(qVar.f1730b) && this.f1731c.equals(qVar.f1731c) && this.f1732d.equals(qVar.f1732d) && this.e.equals(qVar.e) && this.f1733f.equals(qVar.f1733f);
    }

    public final int hashCode() {
        return this.f1733f.hashCode() + ((this.e.hashCode() + D1.h.b(this.f1732d, D1.h.b(this.f1731c, D1.h.b(this.f1730b, Integer.hashCode(this.f1729a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Service(id=");
        sb.append(this.f1729a);
        sb.append(", title=");
        sb.append(this.f1730b);
        sb.append(", shortDescription=");
        sb.append(this.f1731c);
        sb.append(", fullDescription=");
        sb.append(this.f1732d);
        sb.append(", stages=");
        sb.append(this.e);
        sb.append(", expectedResult=");
        return D1.h.h(sb, this.f1733f, ")");
    }
}
