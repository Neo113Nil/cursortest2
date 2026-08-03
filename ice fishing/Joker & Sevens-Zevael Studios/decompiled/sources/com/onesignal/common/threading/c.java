package com.onesignal.common.threading;

import ad.i;
import ad.j;
import ad.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    private final i channel = a.a.a(-1, 6, null);

    public final Object waitForWake(fc.d dVar) {
        return this.channel.h(dVar);
    }

    public final void wake() {
        Object s10 = this.channel.s(null);
        if (s10 instanceof k) {
            j jVar = s10 instanceof j ? (j) s10 : null;
            throw new Exception("Waiter.wait failed", jVar != null ? jVar.f326a : null);
        }
    }
}
