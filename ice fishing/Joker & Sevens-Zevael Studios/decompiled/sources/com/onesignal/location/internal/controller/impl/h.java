package com.onesignal.location.internal.controller.impl;

import ac.o;
import android.location.Location;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements z9.a {
    @Override // z9.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return false;
    }

    @Override // z9.a
    public Location getLastLocation() {
        return null;
    }

    @Override // z9.a
    public Object start(fc.d dVar) {
        return Boolean.FALSE;
    }

    @Override // z9.a
    public Object stop(fc.d dVar) {
        return o.f277a;
    }

    @Override // z9.a, com.onesignal.common.events.d
    public void subscribe(z9.b bVar) {
        j.e(bVar, "handler");
    }

    @Override // z9.a, com.onesignal.common.events.d
    public void unsubscribe(z9.b bVar) {
        j.e(bVar, "handler");
    }
}
