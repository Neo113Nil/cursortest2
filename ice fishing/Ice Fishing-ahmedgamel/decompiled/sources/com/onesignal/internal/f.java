package com.onesignal.internal;

import com.onesignal.internal.e;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public final e evaluate(d dVar, d dVar2) {
        M4.c cVar;
        h.e(dVar2, "new");
        boolean z6 = false;
        if (dVar != null && dVar.isEnabled()) {
            z6 = true;
        }
        boolean isEnabled = dVar2.isEnabled();
        if (!z6 && isEnabled) {
            M4.c logLevel = dVar2.getLogLevel();
            if (logLevel == null) {
                logLevel = M4.c.ERROR;
            }
            return new e.b(logLevel);
        }
        if (z6 && !isEnabled) {
            return e.a.INSTANCE;
        }
        if (z6 && isEnabled) {
            if ((dVar != null ? dVar.getLogLevel() : null) != dVar2.getLogLevel()) {
                if (dVar == null || (cVar = dVar.getLogLevel()) == null) {
                    cVar = M4.c.ERROR;
                }
                M4.c logLevel2 = dVar2.getLogLevel();
                if (logLevel2 == null) {
                    logLevel2 = M4.c.ERROR;
                }
                return new e.d(cVar, logLevel2);
            }
        }
        return e.c.INSTANCE;
    }
}
