package R0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1705b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1706c;

    public a(String str, String str2) {
        this.f1704a = str;
        this.f1705b = null;
        this.f1706c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1704a.equals(aVar.f1704a)) {
            return this.f1706c.equals(aVar.f1706c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1706c.hashCode() + (this.f1704a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f1704a);
        sb.append(", function: ");
        return C1.a.k(sb, this.f1706c, " )");
    }

    public a(String str, String str2, String str3) {
        this.f1704a = str;
        this.f1705b = str2;
        this.f1706c = str3;
    }
}
