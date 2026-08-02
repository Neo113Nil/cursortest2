package f8;

/* loaded from: classes2.dex */
public final class s extends C {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f37538n;

    /* renamed from: u, reason: collision with root package name */
    public final String f37539u;

    public s(String body, boolean z6) {
        kotlin.jvm.internal.h.e(body, "body");
        this.f37538n = z6;
        this.f37539u = body.toString();
    }

    @Override // f8.C
    public final String a() {
        return this.f37539u;
    }

    @Override // f8.C
    public final boolean c() {
        return this.f37538n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f37538n == sVar.f37538n && kotlin.jvm.internal.h.a(this.f37539u, sVar.f37539u);
    }

    public final int hashCode() {
        return this.f37539u.hashCode() + (Boolean.hashCode(this.f37538n) * 31);
    }

    @Override // f8.C
    public final String toString() {
        boolean z6 = this.f37538n;
        String str = this.f37539u;
        if (!z6) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        g8.s.a(sb, str);
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }
}
