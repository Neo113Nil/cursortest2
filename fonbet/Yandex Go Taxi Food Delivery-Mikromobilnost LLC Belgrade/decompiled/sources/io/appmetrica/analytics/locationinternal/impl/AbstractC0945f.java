package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0945f implements InterfaceC0998x, O {
    public volatile C0933c a;

    public final void a(CellInfo cellInfo, C0963l c0963l) {
        b(cellInfo, c0963l);
        C0933c c0933c = this.a;
        if (c0933c == null || !c0933c.c.f) {
            return;
        }
        boolean isRegistered = cellInfo.isRegistered();
        if (!c0933c.c.g || isRegistered) {
            c(cellInfo, c0963l);
        }
    }

    public abstract void b(CellInfo cellInfo, C0963l c0963l);

    public abstract void c(CellInfo cellInfo, C0963l c0963l);

    @Override // io.appmetrica.analytics.locationinternal.impl.O
    public final void a(C0933c c0933c) {
        this.a = c0933c;
    }
}
