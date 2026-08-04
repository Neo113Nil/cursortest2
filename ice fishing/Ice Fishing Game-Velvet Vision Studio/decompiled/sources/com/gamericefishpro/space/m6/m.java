package com.gamericefishpro.space.m6;

import com.gamericefishpro.space.l6.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final String a;
    public static final String[] b;

    static {
        String strD = q.d("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"WrkDbPathHelper\")");
        a = strD;
        b = new String[]{"-journal", "-shm", "-wal"};
    }
}
