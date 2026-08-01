package a1;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083a {

    /* renamed from: a, reason: collision with root package name */
    public final int f1668a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1669b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1670c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1671d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1672f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1673g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1674h;
    public final String i;

    public C0083a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f1668a = i;
        this.f1669b = str;
        this.f1670c = str2;
        this.f1671d = str3;
        this.e = str4;
        this.f1672f = str5;
        this.f1673g = str6;
        this.f1674h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0083a)) {
            return false;
        }
        C0083a c0083a = (C0083a) obj;
        return this.f1668a == c0083a.f1668a && this.f1669b.equals(c0083a.f1669b) && this.f1670c.equals(c0083a.f1670c) && this.f1671d.equals(c0083a.f1671d) && this.e.equals(c0083a.e) && this.f1672f.equals(c0083a.f1672f) && this.f1673g.equals(c0083a.f1673g) && this.f1674h.equals(c0083a.f1674h) && this.i.equals(c0083a.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + D1.h.b(this.f1674h, D1.h.b(this.f1673g, D1.h.b(this.f1672f, D1.h.b(this.e, D1.h.b(this.f1671d, D1.h.b(this.f1670c, D1.h.b(this.f1669b, Integer.hashCode(this.f1668a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Article(id=");
        sb.append(this.f1668a);
        sb.append(", icon=");
        sb.append(this.f1669b);
        sb.append(", title=");
        sb.append(this.f1670c);
        sb.append(", shortDescription=");
        sb.append(this.f1671d);
        sb.append(", whatIsIt=");
        sb.append(this.e);
        sb.append(", whyNeeded=");
        sb.append(this.f1672f);
        sb.append(", typicalMistakes=");
        sb.append(this.f1673g);
        sb.append(", recommendations=");
        sb.append(this.f1674h);
        sb.append(", summary=");
        return D1.h.h(sb, this.i, ")");
    }
}
