package com.onesignal.notifications.internal.data.impl;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oa.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final e9.a _time;

    public a(com.onesignal.core.internal.config.b bVar, e9.a aVar) {
        j.e(bVar, "_configModelStore");
        j.e(aVar, "_time");
        this._configModelStore = bVar;
        this._time = aVar;
    }

    @Override // oa.a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
