package com.onesignal.notifications.internal.data.impl;

import com.onesignal.core.internal.config.c;
import kotlin.jvm.internal.h;
import u5.InterfaceC5072a;

/* loaded from: classes2.dex */
public final class a implements InterfaceC5072a {
    private final c _configModelStore;
    private final K4.a _time;

    public a(c _configModelStore, K4.a _time) {
        h.e(_configModelStore, "_configModelStore");
        h.e(_time, "_time");
        this._configModelStore = _configModelStore;
        this._time = _time;
    }

    @Override // u5.InterfaceC5072a
    public StringBuilder recentUninteractedWithNotificationsWhere() {
        long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (currentTimeMillis - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getRestoreTTLFilter()) {
            sb.append(" AND expire_time > " + currentTimeMillis);
        }
        return sb;
    }
}
