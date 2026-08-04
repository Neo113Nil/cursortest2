package com.gamericefishpro.space.l4;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public static final g0 d = new g0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        File file = (File) obj;
        Intrinsics.checkNotNullParameter(file, "it");
        Intrinsics.checkNotNullParameter(file, "file");
        String filePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "file.canonicalFile.absolutePath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new t0(filePath);
    }
}
