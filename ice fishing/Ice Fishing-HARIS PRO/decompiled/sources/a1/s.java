package a1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f1739a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1740b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1741c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1742d;

    public s(int i, String str, String str2, int i2) {
        this.f1739a = i;
        this.f1740b = str;
        this.f1741c = str2;
        this.f1742d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1739a == sVar.f1739a && this.f1740b.equals(sVar.f1740b) && this.f1741c.equals(sVar.f1741c) && this.f1742d == sVar.f1742d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1742d) + D1.h.b(this.f1741c, D1.h.b(this.f1740b, Integer.hashCode(this.f1739a) * 31, 31), 31);
    }

    public final String toString() {
        return "ToolItem(id=" + this.f1739a + ", title=" + this.f1740b + ", icon=" + this.f1741c + ", navigationId=" + this.f1742d + ")";
    }
}
