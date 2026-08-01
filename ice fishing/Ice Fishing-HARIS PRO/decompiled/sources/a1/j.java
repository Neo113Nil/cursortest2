package a1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f1700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1701b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1702c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1703d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1704f;

    public j(int i, String str, String str2, String str3, String str4, String str5) {
        this.f1700a = i;
        this.f1701b = str;
        this.f1702c = str2;
        this.f1703d = str3;
        this.e = str4;
        this.f1704f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1700a == jVar.f1700a && this.f1701b.equals(jVar.f1701b) && this.f1702c.equals(jVar.f1702c) && this.f1703d.equals(jVar.f1703d) && this.e.equals(jVar.e) && this.f1704f.equals(jVar.f1704f);
    }

    public final int hashCode() {
        return this.f1704f.hashCode() + D1.h.b(this.e, D1.h.b(this.f1703d, D1.h.b(this.f1702c, D1.h.b(this.f1701b, Integer.hashCode(this.f1700a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HrMetric(id=");
        sb.append(this.f1700a);
        sb.append(", title=");
        sb.append(this.f1701b);
        sb.append(", formula=");
        sb.append(this.f1702c);
        sb.append(", description=");
        sb.append(this.f1703d);
        sb.append(", benchmark=");
        sb.append(this.e);
        sb.append(", tips=");
        return D1.h.h(sb, this.f1704f, ")");
    }
}
