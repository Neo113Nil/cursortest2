package com.onesignal.core;

import a4.d;
import c9.b;
import ca.n;
import com.onesignal.inAppMessages.internal.l;
import m8.a;
import n8.c;
import pc.j;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class CoreModule implements a {
    @Override // m8.a
    public void register(c cVar) {
        j.e(cVar, "builder");
        cVar.register(com.onesignal.core.internal.preferences.impl.a.class).provides(b.class).provides(d9.b.class);
        d.u(cVar, com.onesignal.core.internal.http.impl.b.class, com.onesignal.core.internal.http.impl.c.class, com.onesignal.core.internal.http.impl.a.class, w8.c.class);
        d.u(cVar, com.onesignal.core.internal.application.impl.a.class, f.class, com.onesignal.core.internal.device.impl.a.class, v8.c.class);
        d.u(cVar, f9.a.class, e9.a.class, u8.b.class, t8.d.class);
        d.u(cVar, com.onesignal.core.internal.device.impl.b.class, v8.d.class, com.onesignal.core.internal.config.b.class, com.onesignal.core.internal.config.b.class);
        d.u(cVar, com.onesignal.core.internal.backend.impl.a.class, r8.b.class, com.onesignal.core.internal.config.impl.a.class, d9.b.class);
        cVar.register(com.onesignal.core.internal.operations.impl.a.class).provides(com.onesignal.core.internal.operations.impl.a.class);
        cVar.register(com.onesignal.core.internal.operations.impl.b.class).provides(z8.f.class).provides(d9.b.class);
        cVar.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(b9.f.class);
        cVar.register(y8.a.class).provides(x8.a.class);
        cVar.register(com.onesignal.core.internal.background.impl.a.class).provides(s8.a.class).provides(d9.b.class);
        cVar.register(com.onesignal.core.internal.purchases.impl.a.class).provides(d9.b.class);
        cVar.register(com.onesignal.notifications.internal.b.class).provides(n.class);
        d.u(cVar, l.class, i9.j.class, com.onesignal.location.internal.b.class, u9.a.class);
    }
}
