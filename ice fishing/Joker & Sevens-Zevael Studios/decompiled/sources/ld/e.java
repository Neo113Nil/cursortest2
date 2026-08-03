package ld;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4270a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4271b;

    public e(String str, boolean z10) {
        this.f4270a = str;
        this.f4271b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4270a.equals(eVar.f4270a) && this.f4271b == eVar.f4271b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4271b) + (this.f4270a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionInfo(installUuid=" + this.f4270a + ", isNewSession=" + this.f4271b + ")";
    }
}
