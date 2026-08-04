package com.gamericefishpro.space.d7;

import com.gamericefishpro.space.s5.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final t a;
    public final b b;

    public f(t __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.a = __db;
        this.b = new b(1);
    }

    public final Object a(final String str, final long j, com.gamericefishpro.space.vh.c cVar) {
        Object objH = com.gamericefishpro.space.hj.c.H(this.a, cVar, new Function1() { // from class: com.gamericefishpro.space.d7.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                long j2 = j;
                String str2 = str;
                com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                com.gamericefishpro.space.c6.c cVarO = _connection.O("UPDATE ice_achievements SET isUnlocked = 1, unlockedAt = ? WHERE id = ?");
                try {
                    cVarO.a(1, j2);
                    cVarO.u(2, str2);
                    cVarO.H();
                    return Unit.a;
                } finally {
                    cVarO.close();
                }
            }
        }, false, true);
        return objH == com.gamericefishpro.space.uh.a.d ? objH : Unit.a;
    }
}
