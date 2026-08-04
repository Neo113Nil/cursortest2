package com.gamericefishpro.space.m6;

import com.gamericefishpro.space.s5.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r {
    public static final b a = new b();

    @Override // com.gamericefishpro.space.s5.r
    public final void b(com.gamericefishpro.space.d6.b db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.b(db);
        db.e();
        try {
            db.h("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - l.a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db.B();
        } finally {
            db.d();
        }
    }
}
