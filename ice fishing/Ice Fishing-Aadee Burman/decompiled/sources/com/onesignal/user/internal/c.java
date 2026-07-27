package com.onesignal.user.internal;

import b6.InterfaceC0519a;

/* loaded from: classes2.dex */
public final class c extends i implements InterfaceC0519a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Z5.d model) {
        super(model);
        kotlin.jvm.internal.h.e(model, "model");
    }

    @Override // b6.InterfaceC0519a
    public String getEmail() {
        String address = getModel().getAddress();
        return com.onesignal.common.j.INSTANCE.isHashed(address) ? "" : address;
    }
}
