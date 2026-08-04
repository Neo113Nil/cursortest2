package com.gamericefishpro.space.ai;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final File a;

    public g(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.a = root;
    }

    public abstract File a();
}
