package io.appmetrica.analytics.screenshot.impl;

import h1.C0234d;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957x implements U {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f7683a;

    public C0957x(ClientContext clientContext) {
        this.f7683a = clientContext;
    }

    public final void a(String str) {
        this.f7683a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(i1.v.H(new C0234d("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
