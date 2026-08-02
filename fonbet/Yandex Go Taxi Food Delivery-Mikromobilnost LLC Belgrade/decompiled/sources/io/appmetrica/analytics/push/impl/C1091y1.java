package io.appmetrica.analytics.push.impl;

import android.app.NotificationChannelGroup;

/* renamed from: io.appmetrica.analytics.push.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1091y1 extends C1088x1 {
    public C1091y1(A1 a1) {
        super(a1);
    }

    @Override // io.appmetrica.analytics.push.impl.C1088x1
    public final boolean a(NotificationChannelGroup notificationChannelGroup) {
        return !notificationChannelGroup.isBlocked();
    }
}
