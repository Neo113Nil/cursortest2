package nd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Long f5099a;

    public l(Long l10) {
        this.f5099a = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && pc.j.a(this.f5099a, ((l) obj).f5099a);
    }

    public final int hashCode() {
        Long l10 = this.f5099a;
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public final String toString() {
        return "GetBestScore(score=" + this.f5099a + ")";
    }
}
