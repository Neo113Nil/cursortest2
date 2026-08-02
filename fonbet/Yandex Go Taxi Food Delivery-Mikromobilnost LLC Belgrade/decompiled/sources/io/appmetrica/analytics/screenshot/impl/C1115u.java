package io.appmetrica.analytics.screenshot.impl;

import defpackage.gw00;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1115u implements C {
    public final ClientContext a;

    public C1115u(ClientContext clientContext) {
        this.a = clientContext;
    }

    public final void a(String str) {
        this.a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(gw00.e(new Pair("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
