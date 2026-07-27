package com.onesignal.inAppMessages.internal.prompt.impl;

import e5.n;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c implements S4.a {
    private final W4.a _locationManager;
    private final n _notificationsManager;

    public c(n _notificationsManager, W4.a _locationManager) {
        h.e(_notificationsManager, "_notificationsManager");
        h.e(_locationManager, "_locationManager");
        this._notificationsManager = _notificationsManager;
        this._locationManager = _locationManager;
    }

    @Override // S4.a
    public b createPrompt(String promptType) {
        h.e(promptType, "promptType");
        if (promptType.equals("push")) {
            return new d(this._notificationsManager);
        }
        if (promptType.equals("location")) {
            return new a(this._locationManager);
        }
        return null;
    }
}
