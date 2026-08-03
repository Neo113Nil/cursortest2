package com.onesignal.inAppMessages.internal.prompt.impl;

import ca.n;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements q9.a {
    private final u9.a _locationManager;
    private final n _notificationsManager;

    public c(n nVar, u9.a aVar) {
        j.e(nVar, "_notificationsManager");
        j.e(aVar, "_locationManager");
        this._notificationsManager = nVar;
        this._locationManager = aVar;
    }

    @Override // q9.a
    public b createPrompt(String str) {
        j.e(str, "promptType");
        if (str.equals("push")) {
            return new d(this._notificationsManager);
        }
        if (str.equals("location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
