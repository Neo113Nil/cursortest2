package com.onesignal.session;

import K5.a;
import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.i;
import com.onesignal.session.internal.outcomes.impl.j;
import com.onesignal.session.internal.outcomes.impl.l;
import kotlin.jvm.internal.h;
import u4.InterfaceC5071a;
import v4.c;
import z4.InterfaceC5234b;

/* loaded from: classes2.dex */
public final class SessionModule implements InterfaceC5071a {
    @Override // u4.InterfaceC5071a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(i.class).provides(M5.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(L5.g.class).provides(a.class);
        builder.register(O5.d.class).provides(O5.d.class);
        builder.register(com.onesignal.session.internal.session.impl.b.class).provides(O5.b.class).provides(com.onesignal.core.internal.startup.b.class).provides(InterfaceC5234b.class).provides(com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.session.internal.session.impl.a.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.session.internal.a.class).provides(J5.a.class);
    }
}
