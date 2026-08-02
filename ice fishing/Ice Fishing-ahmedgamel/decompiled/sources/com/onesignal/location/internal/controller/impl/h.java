package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import f5.InterfaceC4520a;
import f5.InterfaceC4521b;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class h implements InterfaceC4520a {
    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // f5.InterfaceC4520a
    public Location getLastLocation() {
        return null;
    }

    @Override // f5.InterfaceC4520a
    public Object start(InterfaceC5240d interfaceC5240d) {
        return Boolean.FALSE;
    }

    @Override // f5.InterfaceC4520a
    public Object stop(InterfaceC5240d interfaceC5240d) {
        return v.f41073a;
    }

    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public void subscribe(InterfaceC4521b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
    }

    @Override // f5.InterfaceC4520a, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC4521b handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
    }
}
