package com.onesignal.user;

import Z5.e;
import com.onesignal.common.consistency.impl.a;
import com.onesignal.user.internal.k;
import com.onesignal.user.internal.operations.impl.executors.d;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.i;
import com.onesignal.user.internal.operations.impl.executors.l;
import com.onesignal.user.internal.operations.impl.executors.n;
import com.onesignal.user.internal.operations.impl.executors.p;
import com.onesignal.user.internal.properties.b;
import kotlin.jvm.internal.h;
import u4.InterfaceC5079a;
import v4.c;

/* loaded from: classes2.dex */
public final class UserModule implements InterfaceC5079a {
    @Override // u4.InterfaceC5079a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(a.class).provides(s4.c.class);
        builder.register(b.class).provides(b.class);
        builder.register(W5.b.class).provides(com.onesignal.core.internal.startup.a.class);
        u1.h.j(builder, U5.b.class, U5.b.class, W5.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.a.class).provides(Q5.b.class);
        builder.register(d.class).provides(d.class).provides(H4.d.class);
        builder.register(e.class).provides(e.class);
        u1.h.j(builder, W5.c.class, com.onesignal.core.internal.startup.a.class, com.onesignal.user.internal.backend.impl.c.class, Q5.c.class);
        builder.register(n.class).provides(n.class).provides(H4.d.class);
        builder.register(com.onesignal.user.internal.subscriptions.impl.b.class).provides(Z5.b.class);
        builder.register(S5.a.class).provides(R5.a.class);
        builder.register(com.onesignal.user.internal.backend.impl.d.class).provides(Q5.d.class);
        builder.register(p.class).provides(p.class).provides(H4.d.class);
        builder.register(i.class).provides(H4.d.class);
        u1.h.j(builder, g.class, H4.d.class, l.class, H4.d.class);
        builder.register(k.class).provides(P5.a.class).provides(k.class);
        builder.register(com.onesignal.user.internal.customEvents.impl.b.class).provides(T5.b.class);
        builder.register(com.onesignal.user.internal.operations.impl.executors.a.class).provides(H4.d.class);
        u1.h.j(builder, com.onesignal.user.internal.customEvents.impl.a.class, T5.a.class, Y5.a.class, com.onesignal.core.internal.startup.b.class);
        u1.h.j(builder, com.onesignal.user.internal.migrations.d.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.migrations.c.class, com.onesignal.core.internal.startup.b.class);
        builder.register(X5.a.class).provides(X5.a.class);
    }
}
