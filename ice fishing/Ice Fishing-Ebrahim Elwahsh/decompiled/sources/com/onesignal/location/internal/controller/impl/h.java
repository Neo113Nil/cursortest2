package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import b5.InterfaceC0528a;
import b5.InterfaceC0529b;
import q7.v;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class h implements InterfaceC0528a {
    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // b5.InterfaceC0528a
    public Location getLastLocation() {
        return null;
    }

    @Override // b5.InterfaceC0528a
    public Object start(InterfaceC5133d interfaceC5133d) {
        return Boolean.FALSE;
    }

    @Override // b5.InterfaceC0528a
    public Object stop(InterfaceC5133d interfaceC5133d) {
        return v.f40183a;
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public void subscribe(InterfaceC0529b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
    }

    @Override // b5.InterfaceC0528a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0529b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
    }
}
