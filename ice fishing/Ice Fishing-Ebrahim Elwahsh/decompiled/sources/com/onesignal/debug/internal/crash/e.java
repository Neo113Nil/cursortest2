package com.onesignal.debug.internal.crash;

import B5.k;
import g1.C4523c;
import g1.C4524d;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public abstract class e {
    public static final E5.a createAnrDetector(B5.f platformProvider, B5.c logger, long j9, long j10) {
        h.e(platformProvider, "platformProvider");
        h.e(logger, "logger");
        return new d(new k(platformProvider, new C4524d(4, platformProvider), new C4523c(3, platformProvider)), logger, j9, j10);
    }

    public static /* synthetic */ E5.a createAnrDetector$default(B5.f fVar, B5.c cVar, long j9, long j10, int i, Object obj) {
        if ((i & 4) != 0) {
            j9 = com.anythink.basead.exoplayer.f.f7344a;
        }
        long j11 = j9;
        if ((i & 8) != 0) {
            j10 = com.anythink.basead.exoplayer.i.a.f8040f;
        }
        return createAnrDetector(fVar, cVar, j11, j10);
    }
}
