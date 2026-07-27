package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public final class c extends i implements X5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(V5.d model) {
        super(model);
        kotlin.jvm.internal.h.e(model, "model");
    }

    @Override // X5.a
    public String getEmail() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
