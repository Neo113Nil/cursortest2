package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public abstract class i implements X5.e {
    private final V5.d model;

    public i(V5.d model) {
        kotlin.jvm.internal.h.e(model, "model");
        this.model = model;
    }

    @Override // X5.e
    public String getId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final V5.d getModel() {
        return this.model;
    }
}
