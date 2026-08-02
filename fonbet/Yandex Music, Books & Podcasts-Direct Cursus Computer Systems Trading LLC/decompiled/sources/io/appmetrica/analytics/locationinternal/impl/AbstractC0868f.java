package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0868f implements InterfaceC0923x, O {
    public volatile C0856c a;

    public final void a(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l) {
        b(cellInfo, c0888l);
        C0856c c0856c = this.a;
        if (c0856c == null || !c0856c.c.f) {
            return;
        }
        boolean isRegistered = cellInfo.isRegistered();
        if (!c0856c.c.g || isRegistered) {
            c(cellInfo, c0888l);
        }
    }

    public abstract void b(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l);

    public abstract void c(@NonNull CellInfo cellInfo, @NonNull C0888l c0888l);

    @Override // io.appmetrica.analytics.locationinternal.impl.O
    public final void a(@NonNull C0856c c0856c) {
        this.a = c0856c;
    }
}
