package com.onesignal.debug.internal.crash;

import F5.k;
import I0.j;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class e {
    public static final I5.a createAnrDetector(F5.f platformProvider, F5.c logger, long j6, long j9) {
        h.e(platformProvider, "platformProvider");
        h.e(logger, "logger");
        return new d(new k(platformProvider, new j(6, platformProvider), new n4.c(7, platformProvider)), logger, j6, j9);
    }

    public static /* synthetic */ I5.a createAnrDetector$default(F5.f fVar, F5.c cVar, long j6, long j9, int i, Object obj) {
        if ((i & 4) != 0) {
            j6 = com.anythink.basead.exoplayer.f.f7973a;
        }
        long j10 = j6;
        if ((i & 8) != 0) {
            j9 = com.anythink.basead.exoplayer.i.a.f8669f;
        }
        return createAnrDetector(fVar, cVar, j10, j9);
    }
}
