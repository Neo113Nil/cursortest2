package com.gamericefishpro.space.v6;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final WorkDatabase a;

    public f(WorkDatabase workDatabase, int i) {
        switch (i) {
            case 1:
                this.a = workDatabase;
                break;
            default:
                Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
                this.a = workDatabase;
                break;
        }
    }
}
