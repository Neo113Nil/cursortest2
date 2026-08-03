package t5;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f6526a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f6526a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f6526a.equals(((c) obj).f6526a);
    }

    public final int hashCode() {
        return this.f6526a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.f6526a + "\"}";
    }
}
