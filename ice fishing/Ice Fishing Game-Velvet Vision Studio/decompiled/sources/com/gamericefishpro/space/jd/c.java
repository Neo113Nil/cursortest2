package com.gamericefishpro.space.jd;

import com.gamericefishpro.space.hc.d;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final d services;

    public c(d services) {
        Intrinsics.checkNotNullParameter(services, "services");
        this.services = services;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStart$lambda$2(c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.services.getAllServices(b.class).iterator();
        while (it.hasNext()) {
            ((b) it.next()).start();
        }
    }

    public final void bootstrap() {
        Iterator it = this.services.getAllServices(a.class).iterator();
        while (it.hasNext()) {
            ((a) it.next()).bootstrap();
        }
    }

    public final void scheduleStart() {
        new Thread(new com.appsflyer.a(8, this)).start();
    }
}
