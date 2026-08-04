package com.gamericefishpro.space.of;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.nf.a {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.kd.a _time;

    public a(com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._configModelStore = _configModelStore;
        this._time = _time;
    }

    @Override // com.gamericefishpro.space.nf.a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
