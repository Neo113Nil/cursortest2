package com.gamericefishpro.space.nd;

import com.gamericefishpro.space.md.b;
import com.gamericefishpro.space.md.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.md.a {
    public a() {
        setLogLevel(c.WARN);
        setAlertLevel(c.NONE);
    }

    @Override // com.gamericefishpro.space.md.a
    public void addLogListener(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.INSTANCE.addListener(listener);
    }

    @Override // com.gamericefishpro.space.md.a
    public c getAlertLevel() {
        return com.gamericefishpro.space.od.b.getVisualLogLevel();
    }

    @Override // com.gamericefishpro.space.md.a
    public c getLogLevel() {
        return com.gamericefishpro.space.od.b.getLogLevel();
    }

    @Override // com.gamericefishpro.space.md.a
    public void removeLogListener(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.od.b.INSTANCE.removeListener(listener);
    }

    @Override // com.gamericefishpro.space.md.a
    public void setAlertLevel(c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        com.gamericefishpro.space.od.b.setVisualLogLevel(value);
    }

    @Override // com.gamericefishpro.space.md.a
    public void setLogLevel(c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        com.gamericefishpro.space.od.b.setLogLevel(value);
    }
}
