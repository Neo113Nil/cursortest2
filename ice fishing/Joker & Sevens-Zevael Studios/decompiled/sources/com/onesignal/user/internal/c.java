package com.onesignal.user.internal;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends d implements qb.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ob.d dVar) {
        super(dVar);
        j.e(dVar, "model");
    }

    @Override // qb.d
    public String getNumber() {
        return getModel().getAddress();
    }
}
