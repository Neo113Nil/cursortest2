package ba;

import c9.b;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements aa.a {
    private final b _prefs;

    public a(b bVar) {
        j.e(bVar, "_prefs");
        this._prefs = bVar;
    }

    @Override // aa.a
    public long getLastLocationTime() {
        Long l10 = this._prefs.getLong("OneSignal", "OS_LAST_LOCATION_TIME", -600000L);
        j.b(l10);
        return l10.longValue();
    }

    @Override // aa.a
    public void setLastLocationTime(long j3) {
        this._prefs.saveLong("OneSignal", "OS_LAST_LOCATION_TIME", Long.valueOf(j3));
    }
}
