package com.onesignal.location;

import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import com.onesignal.location.internal.controller.impl.h;
import n8.b;
import oc.c;
import pc.j;
import pc.k;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class LocationModule implements m8.a {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements c {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // oc.c
        public final z9.a invoke(b bVar) {
            j.e(bVar, "it");
            v8.c cVar = (v8.c) bVar.getService(v8.c.class);
            return (cVar.isAndroidDeviceType() && y9.b.INSTANCE.hasGMSLocationLibrary()) ? new com.onesignal.location.internal.controller.impl.b((f) bVar.getService(f.class), (g) bVar.getService(g.class)) : (cVar.isHuaweiDeviceType() && y9.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) bVar.getService(f.class)) : new h();
        }
    }

    @Override // m8.a
    public void register(n8.c cVar) {
        j.e(cVar, "builder");
        cVar.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(d9.b.class);
        cVar.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        cVar.register((c) a.INSTANCE).provides(z9.a.class);
        cVar.register(ba.a.class).provides(aa.a.class);
        a4.d.u(cVar, x9.a.class, w9.a.class, v9.a.class, s8.b.class);
        cVar.register(com.onesignal.location.internal.a.class).provides(u9.a.class).provides(d9.b.class);
    }
}
