package com.onesignal.inAppMessages;

import O4.j;
import P4.b;
import Y4.a;
import Z4.d;
import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import kotlin.jvm.internal.h;
import u4.InterfaceC5071a;
import v4.c;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class InAppMessagesModule implements InterfaceC5071a {
    @Override // u4.InterfaceC5071a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(a.class).provides(a.class);
        builder.register(S4.a.class).provides(S4.a.class);
        builder.register(V4.a.class).provides(U4.a.class);
        AbstractC5128c.i(builder, com.onesignal.inAppMessages.internal.repositories.impl.a.class, X4.a.class, com.onesignal.inAppMessages.internal.backend.impl.a.class, b.class);
        AbstractC5128c.i(builder, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, T4.b.class, d.class, d.class);
        AbstractC5128c.i(builder, e.class, Z4.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class);
        AbstractC5128c.i(builder, com.onesignal.inAppMessages.internal.display.impl.c.class, R4.a.class, com.onesignal.inAppMessages.internal.preview.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(W4.a.class);
        builder.register(k.class).provides(j.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
