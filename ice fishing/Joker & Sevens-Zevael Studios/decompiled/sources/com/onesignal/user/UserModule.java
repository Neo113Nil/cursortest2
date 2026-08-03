package com.onesignal.user;

import a4.d;
import com.onesignal.user.internal.f;
import com.onesignal.user.internal.operations.impl.executors.h;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.properties.b;
import m8.a;
import n8.c;
import ob.e;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class UserModule implements a {
    @Override // m8.a
    public void register(c cVar) {
        j.e(cVar, "builder");
        cVar.register(com.onesignal.common.consistency.impl.a.class).provides(k8.c.class);
        cVar.register(b.class).provides(b.class);
        cVar.register(lb.b.class).provides(d9.a.class);
        d.u(cVar, jb.b.class, jb.b.class, lb.a.class, d9.a.class);
        cVar.register(com.onesignal.user.internal.backend.impl.a.class).provides(gb.b.class);
        cVar.register(com.onesignal.user.internal.operations.impl.executors.a.class).provides(com.onesignal.user.internal.operations.impl.executors.a.class).provides(z8.d.class);
        cVar.register(e.class).provides(e.class);
        d.u(cVar, lb.c.class, d9.a.class, com.onesignal.user.internal.backend.impl.c.class, gb.c.class);
        cVar.register(com.onesignal.user.internal.operations.impl.executors.j.class).provides(com.onesignal.user.internal.operations.impl.executors.j.class).provides(z8.d.class);
        cVar.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(ob.b.class);
        cVar.register(ib.a.class).provides(hb.a.class);
        cVar.register(com.onesignal.user.internal.backend.impl.d.class).provides(gb.d.class);
        cVar.register(l.class).provides(l.class).provides(z8.d.class);
        cVar.register(com.onesignal.user.internal.operations.impl.executors.e.class).provides(z8.d.class);
        d.u(cVar, com.onesignal.user.internal.operations.impl.executors.c.class, z8.d.class, h.class, z8.d.class);
        d.u(cVar, f.class, fb.a.class, nb.a.class, d9.b.class);
        d.u(cVar, com.onesignal.user.internal.migrations.d.class, d9.b.class, com.onesignal.user.internal.migrations.c.class, d9.b.class);
        cVar.register(mb.a.class).provides(mb.a.class);
    }
}
