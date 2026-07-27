package com.onesignal.session;

import G5.a;
import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.i;
import com.onesignal.session.internal.outcomes.impl.j;
import com.onesignal.session.internal.outcomes.impl.l;
import kotlin.jvm.internal.h;
import q4.InterfaceC4928a;
import r4.c;
import v4.InterfaceC5127b;

/* loaded from: classes2.dex */
public final class SessionModule implements InterfaceC4928a {
    @Override // q4.InterfaceC4928a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(i.class).provides(I5.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(H5.g.class).provides(a.class);
        builder.register(K5.d.class).provides(K5.d.class);
        builder.register(com.onesignal.session.internal.session.impl.b.class).provides(K5.b.class).provides(com.onesignal.core.internal.startup.b.class).provides(InterfaceC5127b.class).provides(com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.session.internal.session.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.session.internal.a.class).provides(F5.a.class);
    }
}
