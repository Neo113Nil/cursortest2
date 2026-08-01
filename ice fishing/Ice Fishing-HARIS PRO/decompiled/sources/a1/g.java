package a1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f1690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1691b;

    public g(String str, int i) {
        this.f1690a = i;
        this.f1691b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f1690a == gVar.f1690a && this.f1691b.equals(gVar.f1691b);
    }

    public final int hashCode() {
        return this.f1691b.hashCode() + (Integer.hashCode(this.f1690a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiagnosticQuestion(id=");
        sb.append(this.f1690a);
        sb.append(", question=");
        return D1.h.h(sb, this.f1691b, ")");
    }
}
