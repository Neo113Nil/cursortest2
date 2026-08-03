package f8;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2335b;

    public a(String str, String str2) {
        this.f2334a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f2335b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2334a.equals(aVar.f2334a) && this.f2335b.equals(aVar.f2335b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2334a.hashCode() ^ 1000003) * 1000003) ^ this.f2335b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.f2334a + ", version=" + this.f2335b + "}";
    }
}
