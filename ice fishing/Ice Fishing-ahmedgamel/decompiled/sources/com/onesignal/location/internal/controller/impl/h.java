package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import f5.InterfaceC4510a;
import f5.InterfaceC4511b;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class h implements InterfaceC4510a {
    @Override // f5.InterfaceC4510a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // f5.InterfaceC4510a
    public Location getLastLocation() {
        return null;
    }

    @Override // f5.InterfaceC4510a
    public Object start(InterfaceC5267d interfaceC5267d) {
        return Boolean.FALSE;
    }

    @Override // f5.InterfaceC4510a
    public Object stop(InterfaceC5267d interfaceC5267d) {
        return v.f41353a;
    }

    @Override // f5.InterfaceC4510a, com.onesignal.common.events.d
    public void subscribe(InterfaceC4511b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
    }

    @Override // f5.InterfaceC4510a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC4511b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
    }
}
