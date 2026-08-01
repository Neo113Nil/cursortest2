package com.onesignal.core;

import D4.e;
import I7.l;
import O4.j;
import a5.InterfaceC0437a;
import com.onesignal.core.internal.http.impl.d;
import com.onesignal.core.internal.permissions.g;
import i5.n;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u4.InterfaceC5079a;
import v4.b;
import v4.c;
import x4.f;
import z4.InterfaceC5260a;

/* loaded from: classes2.dex */
public final class CoreModule implements InterfaceC5079a {

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // I7.l
        public final com.onesignal.core.internal.application.impl.a invoke(b it) {
            h.e(it, "it");
            com.onesignal.core.internal.application.impl.a instanceOrNull = com.onesignal.core.internal.application.impl.a.Companion.getInstanceOrNull();
            return instanceOrNull == null ? new com.onesignal.core.internal.application.impl.a() : instanceOrNull;
        }
    }

    @Override // u4.InterfaceC5079a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(com.onesignal.core.internal.preferences.impl.a.class).provides(J4.b.class).provides(com.onesignal.core.internal.startup.b.class);
        u1.h.j(builder, com.onesignal.core.internal.http.impl.c.class, d.class, com.onesignal.core.internal.http.impl.a.class, E4.c.class);
        builder.register((l) a.INSTANCE).provides(f.class);
        builder.register(com.onesignal.core.internal.device.impl.a.class).provides(C4.c.class);
        u1.h.j(builder, L4.a.class, K4.a.class, B4.b.class, A4.d.class);
        u1.h.j(builder, com.onesignal.core.internal.device.impl.b.class, C4.d.class, com.onesignal.core.internal.config.c.class, com.onesignal.core.internal.config.c.class);
        u1.h.j(builder, D4.c.class, e.class, com.onesignal.core.internal.backend.impl.c.class, y4.c.class);
        u1.h.j(builder, com.onesignal.core.internal.backend.impl.a.class, y4.b.class, com.onesignal.core.internal.config.impl.a.class, com.onesignal.core.internal.startup.b.class);
        u1.h.j(builder, com.onesignal.core.internal.config.impl.b.class, com.onesignal.core.internal.startup.b.class, com.onesignal.user.internal.jwt.c.class, com.onesignal.user.internal.jwt.c.class);
        builder.register(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.config.impl.c.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.operations.impl.a.class).provides(com.onesignal.core.internal.operations.impl.a.class);
        builder.register(com.onesignal.core.internal.operations.impl.b.class).provides(H4.f.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.permissions.impl.a.class).provides(com.onesignal.core.internal.permissions.impl.a.class).provides(g.class);
        builder.register(G4.a.class).provides(F4.a.class);
        builder.register(com.onesignal.core.internal.background.impl.a.class).provides(InterfaceC5260a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.core.internal.purchases.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.debug.internal.crash.b.class).provides(com.onesignal.core.internal.startup.b.class);
        u1.h.j(builder, com.onesignal.notifications.internal.b.class, n.class, com.onesignal.inAppMessages.internal.l.class, j.class);
        builder.register(com.onesignal.location.internal.b.class).provides(InterfaceC0437a.class);
    }
}
