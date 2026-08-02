package com.onesignal.location;

import C4.c;
import I7.l;
import a5.InterfaceC0441a;
import b5.C0526a;
import c5.InterfaceC0554a;
import com.onesignal.location.internal.controller.impl.d;
import com.onesignal.location.internal.controller.impl.g;
import d5.C4463a;
import f5.InterfaceC4520a;
import g5.InterfaceC4534a;
import h5.C4578a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u4.InterfaceC5071a;
import v4.b;
import w.AbstractC5128c;
import x4.f;
import z4.InterfaceC5234b;

/* loaded from: classes2.dex */
public final class LocationModule implements InterfaceC5071a {

    public static final class a extends i implements l {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // I7.l
        public final InterfaceC4520a invoke(b it) {
            h.e(it, "it");
            c cVar = (c) it.getService(c.class);
            return (cVar.isAndroidDeviceType() && e5.b.INSTANCE.hasGMSLocationLibrary()) ? new com.onesignal.location.internal.controller.impl.b((f) it.getService(f.class), (g) it.getService(g.class)) : (cVar.isHuaweiDeviceType() && e5.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) it.getService(f.class)) : new com.onesignal.location.internal.controller.impl.h();
        }
    }

    @Override // u4.InterfaceC5071a
    public void register(v4.c builder) {
        h.e(builder, "builder");
        builder.register(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.location.internal.permissions.b.class).provides(com.onesignal.core.internal.startup.b.class);
        builder.register(com.onesignal.location.internal.controller.impl.a.class).provides(g.class);
        builder.register((l) a.INSTANCE).provides(InterfaceC4520a.class);
        builder.register(C4578a.class).provides(InterfaceC4534a.class);
        AbstractC5128c.i(builder, C4463a.class, InterfaceC0554a.class, C0526a.class, InterfaceC5234b.class);
        builder.register(com.onesignal.location.internal.a.class).provides(InterfaceC0441a.class).provides(com.onesignal.core.internal.startup.b.class);
    }
}
