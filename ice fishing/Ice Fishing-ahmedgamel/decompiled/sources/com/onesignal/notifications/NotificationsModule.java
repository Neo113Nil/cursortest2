package com.onesignal.notifications;

import I7.l;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.d;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import i5.n;
import j5.InterfaceC4621a;
import k5.C4645a;
import k5.C4646b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import l5.InterfaceC4677a;
import m5.InterfaceC4747a;
import q5.C4876a;
import r5.InterfaceC4909a;
import s5.C4975a;
import u4.InterfaceC5071a;
import u5.InterfaceC5072a;
import v5.InterfaceC5105a;
import v5.InterfaceC5106b;
import v5.InterfaceC5107c;
import w.AbstractC5128c;
import w5.InterfaceC5151a;
import w5.InterfaceC5152b;
import x4.f;
import z5.InterfaceC5235a;
import z5.InterfaceC5236b;

/* loaded from: classes2.dex */
public final class NotificationsModule implements InterfaceC5071a {

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // I7.l
        public final InterfaceC4621a invoke(v4.b it) {
            h.e(it, "it");
            return C4645a.Companion.canTrack() ? new C4645a((f) it.getService(f.class), (c) it.getService(c.class), (K4.a) it.getService(K4.a.class)) : new C4646b();
        }
    }

    public static final class b extends i implements l {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // I7.l
        public final Object invoke(v4.b it) {
            h.e(it, "it");
            C4.c cVar = (C4.c) it.getService(C4.c.class);
            return cVar.isFireOSDeviceType() ? new d((f) it.getService(f.class)) : cVar.isAndroidDeviceType() ? cVar.getHasFCMLibrary() ? new com.onesignal.notifications.internal.registration.impl.f((c) it.getService(c.class), (f) it.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) it.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new com.onesignal.notifications.internal.registration.impl.h() : new g(cVar, (f) it.getService(f.class));
        }
    }

    @Override // u4.InterfaceC5071a
    public void register(v4.c builder) {
        h.e(builder, "builder");
        builder.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(InterfaceC4677a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(D5.c.class);
        builder.register(com.onesignal.notifications.internal.data.impl.a.class).provides(InterfaceC5072a.class);
        AbstractC5128c.i(builder, com.onesignal.notifications.internal.badges.impl.a.class, InterfaceC4747a.class, com.onesignal.notifications.internal.data.impl.b.class, u5.d.class);
        AbstractC5128c.i(builder, NotificationGenerationWorkManager.class, InterfaceC5152b.class, C4876a.class, p5.b.class);
        AbstractC5128c.i(builder, C4975a.class, InterfaceC4909a.class, com.onesignal.notifications.internal.limiting.impl.a.class, y5.b.class);
        AbstractC5128c.i(builder, com.onesignal.notifications.internal.display.impl.c.class, InterfaceC5106b.class, com.onesignal.notifications.internal.display.impl.d.class, InterfaceC5107c.class);
        AbstractC5128c.i(builder, com.onesignal.notifications.internal.display.impl.b.class, InterfaceC5105a.class, com.onesignal.notifications.internal.generation.impl.a.class, InterfaceC5151a.class);
        AbstractC5128c.i(builder, com.onesignal.notifications.internal.restoration.impl.a.class, D5.b.class, com.onesignal.notifications.internal.summary.impl.a.class, E5.a.class);
        AbstractC5128c.i(builder, com.onesignal.notifications.internal.open.impl.b.class, InterfaceC5235a.class, com.onesignal.notifications.internal.open.impl.c.class, InterfaceC5236b.class);
        builder.register(com.onesignal.notifications.internal.permissions.impl.b.class).provides(A5.b.class);
        builder.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(x5.b.class).provides(com.onesignal.notifications.internal.a.class);
        builder.register((l) a.INSTANCE).provides(InterfaceC4621a.class);
        builder.register((l) b.INSTANCE).provides(C5.b.class).provides(com.onesignal.notifications.internal.registration.impl.c.class);
        builder.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        builder.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        AbstractC5128c.i(builder, ReceiveReceiptWorkManager.class, B5.b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, B5.a.class);
        AbstractC5128c.i(builder, DeviceRegistrationListener.class, com.onesignal.core.internal.startup.b.class, com.onesignal.notifications.internal.h.class, n.class);
    }
}
