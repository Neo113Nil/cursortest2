package com.gamericefishpro.space.uc;

import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.pg.o;
import com.gamericefishpro.space.tc.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    private final f _application;
    private final Object lock;
    private c osDatabase;

    public b(f _application) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        this._application = _application;
        this.lock = new Object();
    }

    @Override // com.gamericefishpro.space.tc.d
    public com.gamericefishpro.space.tc.c getOs() {
        if (this.osDatabase == null) {
            synchronized (this.lock) {
                try {
                    if (this.osDatabase == null) {
                        this.osDatabase = new c(new o(), this._application.getAppContext(), 0, 4, null);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c cVar = this.osDatabase;
        Intrinsics.b(cVar);
        return cVar;
    }
}
