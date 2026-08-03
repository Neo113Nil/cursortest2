package g9;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {
    private final String entry;
    private final c level;

    public d(c cVar, String str) {
        j.e(cVar, "level");
        j.e(str, "entry");
        this.level = cVar;
        this.entry = str;
    }

    public static /* synthetic */ d copy$default(d dVar, c cVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = dVar.level;
        }
        if ((i10 & 2) != 0) {
            str = dVar.entry;
        }
        return dVar.copy(cVar, str);
    }

    public final c component1() {
        return this.level;
    }

    public final String component2() {
        return this.entry;
    }

    public final d copy(c cVar, String str) {
        j.e(cVar, "level");
        j.e(str, "entry");
        return new d(cVar, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.level == dVar.level && j.a(this.entry, dVar.entry);
    }

    public final String getEntry() {
        return this.entry;
    }

    public final c getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.entry.hashCode() + (this.level.hashCode() * 31);
    }

    public String toString() {
        return "OneSignalLogEvent(level=" + this.level + ", entry=" + this.entry + ')';
    }
}
