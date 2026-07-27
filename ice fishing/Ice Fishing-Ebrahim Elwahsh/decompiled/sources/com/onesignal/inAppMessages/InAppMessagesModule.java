package com.onesignal.inAppMessages;

import K4.j;
import L4.b;
import U4.a;
import V4.d;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.inAppMessages.internal.k;
import com.onesignal.inAppMessages.internal.triggers.impl.e;
import kotlin.jvm.internal.h;
import q4.InterfaceC4928a;
import r4.c;

/* loaded from: classes2.dex */
public final class InAppMessagesModule implements InterfaceC4928a {
    @Override // q4.InterfaceC4928a
    public void register(c builder) {
        h.e(builder, "builder");
        builder.register(a.class).provides(a.class);
        builder.register(O4.a.class).provides(O4.a.class);
        builder.register(R4.a.class).provides(Q4.a.class);
        CL.v(builder, com.onesignal.inAppMessages.internal.repositories.impl.a.class, T4.a.class, com.onesignal.inAppMessages.internal.backend.impl.a.class, b.class);
        CL.v(builder, com.onesignal.inAppMessages.internal.lifecycle.impl.a.class, P4.b.class, d.class, d.class);
        CL.v(builder, e.class, V4.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class, com.onesignal.inAppMessages.internal.triggers.impl.a.class);
        CL.v(builder, com.onesignal.inAppMessages.internal.display.impl.c.class, N4.a.class, com.onesignal.inAppMessages.internal.preview.a.class, com.onesignal.core.internal.startup.a.class);
        builder.register(com.onesignal.inAppMessages.internal.prompt.impl.c.class).provides(S4.a.class);
        builder.register(k.class).provides(j.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
