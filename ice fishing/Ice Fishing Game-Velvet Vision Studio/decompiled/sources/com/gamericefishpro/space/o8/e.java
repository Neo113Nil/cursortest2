package com.gamericefishpro.space.o8;

import android.content.Context;
import android.os.SystemClock;
import com.gamericefishpro.space.n9.r0;
import com.gamericefishpro.space.r9.i;
import com.gamericefishpro.space.v8.k;
import com.gamericefishpro.space.v8.n;
import com.gamericefishpro.space.v8.o;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static volatile e c;
    public static final Object d = new Object();
    public final com.gamericefishpro.space.x8.b a;
    public final AtomicLong b = new AtomicLong(-1);

    public e(Context context) {
        this.a = new com.gamericefishpro.space.x8.b(context, com.gamericefishpro.space.x8.b.i, new o("ads_identifier:api"), com.gamericefishpro.space.t8.e.b);
    }

    public final synchronized void a(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = this.b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new StringBuilder(String.valueOf(atomicLong.get()).length() + 14);
        if (atomicLong.get() == -1 || jElapsedRealtime - atomicLong.get() > 1800000) {
            com.gamericefishpro.space.x8.b bVar = this.a;
            if (bVar != null) {
                com.gamericefishpro.space.r9.o oVarB = bVar.b(new n(0, Arrays.asList(new k(35401, i, 0, j, j2, null, null, 0, i2))));
                r0 r0Var = new r0(this, jElapsedRealtime, 2);
                oVarB.getClass();
                oVarB.c(i.a, r0Var);
            }
        }
    }
}
