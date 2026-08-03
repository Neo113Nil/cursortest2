package com.onesignal.user.internal;

import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class d implements qb.e {
    private final ob.d model;

    public d(ob.d dVar) {
        j.e(dVar, "model");
        this.model = dVar;
    }

    @Override // qb.e
    public String getId() {
        return com.onesignal.common.e.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final ob.d getModel() {
        return this.model;
    }
}
