package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public abstract class i implements b6.e {
    private final Z5.d model;

    public i(Z5.d model) {
        kotlin.jvm.internal.h.e(model, "model");
        this.model = model;
    }

    @Override // b6.e
    public String getId() {
        return com.onesignal.common.d.INSTANCE.isLocalId(this.model.getId()) ? "" : this.model.getId();
    }

    public final Z5.d getModel() {
        return this.model;
    }
}
