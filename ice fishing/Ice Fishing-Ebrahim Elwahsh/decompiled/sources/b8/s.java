package b8;

/* loaded from: classes2.dex */
public final class s extends C {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f5620n;

    /* renamed from: u, reason: collision with root package name */
    public final String f5621u;

    public s(String body, boolean z8) {
        kotlin.jvm.internal.h.e(body, "body");
        this.f5620n = z8;
        this.f5621u = body.toString();
    }

    @Override // b8.C
    public final String a() {
        return this.f5621u;
    }

    @Override // b8.C
    public final boolean c() {
        return this.f5620n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f5620n == sVar.f5620n && kotlin.jvm.internal.h.a(this.f5621u, sVar.f5621u);
    }

    public final int hashCode() {
        return this.f5621u.hashCode() + (Boolean.hashCode(this.f5620n) * 31);
    }

    @Override // b8.C
    public final String toString() {
        boolean z8 = this.f5620n;
        String str = this.f5621u;
        if (!z8) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        c8.t.a(sb, str);
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }
}
