package e2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1944a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.c f1945b;

    public a(String str, ac.c cVar) {
        this.f1944a = str;
        this.f1945b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return pc.j.a(this.f1944a, aVar.f1944a) && pc.j.a(this.f1945b, aVar.f1945b);
    }

    public final int hashCode() {
        String str = this.f1944a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ac.c cVar = this.f1945b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f1944a + ", action=" + this.f1945b + ')';
    }
}
