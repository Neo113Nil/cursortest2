package com.onesignal.session;

import com.onesignal.session.internal.outcomes.impl.b;
import com.onesignal.session.internal.outcomes.impl.d;
import com.onesignal.session.internal.outcomes.impl.g;
import com.onesignal.session.internal.outcomes.impl.i;
import com.onesignal.session.internal.outcomes.impl.l;
import m8.a;
import n8.c;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class SessionModule implements a {
    @Override // m8.a
    public void register(c cVar) {
        j.e(cVar, "builder");
        cVar.register(com.onesignal.session.internal.outcomes.impl.j.class).provides(com.onesignal.session.internal.outcomes.impl.c.class);
        cVar.register(l.class).provides(d.class);
        cVar.register(g.class).provides(b.class);
        cVar.register(i.class).provides(cb.b.class).provides(d9.b.class);
        cVar.register(bb.g.class).provides(ab.a.class);
        cVar.register(eb.d.class).provides(eb.d.class);
        cVar.register(com.onesignal.session.internal.session.impl.b.class).provides(eb.b.class).provides(d9.b.class).provides(s8.b.class).provides(d9.a.class);
        cVar.register(com.onesignal.session.internal.session.impl.a.class).provides(d9.b.class);
        cVar.register(com.onesignal.session.internal.a.class).provides(za.a.class);
    }
}
