package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public final class h extends i implements b6.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Z5.d model) {
        super(model);
        kotlin.jvm.internal.h.e(model, "model");
    }

    @Override // b6.d
    public String getNumber() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
