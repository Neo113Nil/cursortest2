package com.onesignal.inAppMessages;

import a4.d;
import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import j9.b;
import m8.a;
import n8.c;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class InAppMessagesModule implements a {
    @Override // m8.a
    public void register(c cVar) {
        j.e(cVar, "builder");
        cVar.register(s9.a.class).provides(s9.a.class);
        cVar.register(m9.a.class).provides(m9.a.class);
        cVar.register(p9.a.class).provides(o9.a.class);
        d.u(cVar, com.onesignal.inAppMessages.internal.repositories.impl.a.class, r9.a.class, com.onesignal.inAppMessages.internal.backend.impl.a.class, b.class);
        d.u(cVar, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, n9.b.class, t9.d.class, t9.d.class);
        d.u(cVar, e.class, t9.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class);
        d.u(cVar, com.onesignal.inAppMessages.internal.display.impl.c.class, l9.a.class, com.onesignal.inAppMessages.internal.preview.a.class, d9.a.class);
        cVar.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(q9.a.class);
        cVar.register(k.class).provides(i9.j.class).provides(d9.b.class);
    }
}
