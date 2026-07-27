package com.onesignal.debug.internal.logging.otel.android;

import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class a implements B5.c {
    @Override // B5.c
    public void debug(String message) {
        h.e(message, "message");
        com.onesignal.debug.internal.logging.b.debug$default(message, null, 2, null);
    }

    @Override // B5.c
    public void error(String message) {
        h.e(message, "message");
        com.onesignal.debug.internal.logging.b.error$default(message, null, 2, null);
    }

    @Override // B5.c
    public void info(String message) {
        h.e(message, "message");
        com.onesignal.debug.internal.logging.b.info$default(message, null, 2, null);
    }

    @Override // B5.c
    public void warn(String message) {
        h.e(message, "message");
        com.onesignal.debug.internal.logging.b.warn$default(message, null, 2, null);
    }
}
