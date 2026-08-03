package com.onesignal.notifications;

import ca.n;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.registration.impl.d;
import com.onesignal.notifications.internal.registration.impl.g;
import com.onesignal.notifications.internal.registration.impl.h;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import oc.c;
import pc.j;
import pc.k;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class NotificationsModule implements m8.a {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements c {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // oc.c
        public final da.a invoke(n8.b bVar) {
            j.e(bVar, "it");
            return ea.a.Companion.canTrack() ? new ea.a((f) bVar.getService(f.class), (com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (e9.a) bVar.getService(e9.a.class)) : new ea.b();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements c {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // oc.c
        public final Object invoke(n8.b bVar) {
            j.e(bVar, "it");
            v8.c cVar = (v8.c) bVar.getService(v8.c.class);
            return cVar.isFireOSDeviceType() ? new d((f) bVar.getService(f.class)) : cVar.isAndroidDeviceType() ? cVar.getHasFCMLibrary() ? new com.onesignal.notifications.internal.registration.impl.f((com.onesignal.core.internal.config.b) bVar.getService(com.onesignal.core.internal.config.b.class), (f) bVar.getService(f.class), (com.onesignal.notifications.internal.registration.impl.a) bVar.getService(com.onesignal.notifications.internal.registration.impl.a.class), cVar) : new h() : new g(cVar, (f) bVar.getService(f.class));
        }
    }

    @Override // m8.a
    public void register(n8.c cVar) {
        j.e(cVar, "builder");
        cVar.register(com.onesignal.notifications.internal.backend.impl.a.class).provides(fa.a.class);
        cVar.register(NotificationRestoreWorkManager.class).provides(xa.c.class);
        cVar.register(com.onesignal.notifications.internal.data.impl.a.class).provides(oa.a.class);
        a4.d.u(cVar, com.onesignal.notifications.internal.badges.impl.a.class, ga.a.class, com.onesignal.notifications.internal.data.impl.b.class, oa.d.class);
        a4.d.u(cVar, NotificationGenerationWorkManager.class, qa.b.class, ka.a.class, ja.b.class);
        a4.d.u(cVar, ma.a.class, la.a.class, com.onesignal.notifications.internal.limiting.impl.a.class, sa.b.class);
        a4.d.u(cVar, com.onesignal.notifications.internal.display.impl.c.class, pa.b.class, com.onesignal.notifications.internal.display.impl.d.class, pa.c.class);
        a4.d.u(cVar, com.onesignal.notifications.internal.display.impl.b.class, pa.a.class, com.onesignal.notifications.internal.generation.impl.a.class, qa.a.class);
        a4.d.u(cVar, com.onesignal.notifications.internal.restoration.impl.a.class, xa.b.class, com.onesignal.notifications.internal.summary.impl.a.class, ya.a.class);
        a4.d.u(cVar, com.onesignal.notifications.internal.open.impl.b.class, ta.a.class, com.onesignal.notifications.internal.open.impl.c.class, ta.b.class);
        cVar.register(com.onesignal.notifications.internal.permissions.impl.b.class).provides(ua.b.class);
        cVar.register(com.onesignal.notifications.internal.lifecycle.impl.a.class).provides(ra.b.class).provides(com.onesignal.notifications.internal.a.class);
        cVar.register((c) a.INSTANCE).provides(da.a.class);
        cVar.register((c) b.INSTANCE).provides(wa.b.class).provides(com.onesignal.notifications.internal.registration.impl.c.class);
        cVar.register(com.onesignal.notifications.internal.registration.impl.a.class).provides(com.onesignal.notifications.internal.registration.impl.a.class);
        cVar.register(com.onesignal.notifications.internal.pushtoken.c.class).provides(com.onesignal.notifications.internal.pushtoken.a.class);
        a4.d.u(cVar, ReceiveReceiptWorkManager.class, va.b.class, com.onesignal.notifications.internal.receivereceipt.impl.a.class, va.a.class);
        a4.d.u(cVar, DeviceRegistrationListener.class, d9.b.class, com.onesignal.notifications.internal.h.class, n.class);
    }
}
