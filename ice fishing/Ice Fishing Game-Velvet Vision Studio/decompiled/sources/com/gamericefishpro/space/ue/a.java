package com.gamericefishpro.space.ue;

import com.gamericefishpro.space.gd.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.te.a {
    private final b _prefs;

    public a(b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // com.gamericefishpro.space.te.a
    public long getLastLocationTime() {
        Long l = this._prefs.getLong("OneSignal", "OS_LAST_LOCATION_TIME", -600000L);
        Intrinsics.b(l);
        return l.longValue();
    }

    @Override // com.gamericefishpro.space.te.a
    public void setLastLocationTime(long j) {
        this._prefs.saveLong("OneSignal", "OS_LAST_LOCATION_TIME", Long.valueOf(j));
    }
}
