package f8;

/* loaded from: classes2.dex */
public final class s extends C {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f37576n;

    /* renamed from: u, reason: collision with root package name */
    public final String f37577u;

    public s(String body, boolean z3) {
        kotlin.jvm.internal.h.e(body, "body");
        this.f37576n = z3;
        this.f37577u = body.toString();
    }

    @Override // f8.C
    public final String a() {
        return this.f37577u;
    }

    @Override // f8.C
    public final boolean c() {
        return this.f37576n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f37576n == sVar.f37576n && kotlin.jvm.internal.h.a(this.f37577u, sVar.f37577u);
    }

    public final int hashCode() {
        return this.f37577u.hashCode() + (Boolean.hashCode(this.f37576n) * 31);
    }

    @Override // f8.C
    public final String toString() {
        boolean z3 = this.f37576n;
        String str = this.f37577u;
        if (!z3) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        g8.s.a(sb, str);
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }
}
