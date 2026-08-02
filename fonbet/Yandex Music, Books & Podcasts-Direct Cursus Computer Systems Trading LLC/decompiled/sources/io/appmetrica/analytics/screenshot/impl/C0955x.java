package io.appmetrica.analytics.screenshot.impl;

import defpackage.tah;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0955x implements U {
    public final ClientContext a;

    public C0955x(@NotNull ClientContext clientContext) {
        this.a = clientContext;
    }

    public final void a(@NotNull String str) {
        this.a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.INSTANCE.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(tah.b(new Pair("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
