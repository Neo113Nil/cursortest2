package com.gamericefishpro.space.fc;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void replace$default(f fVar, i iVar, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replace");
        }
        if ((i & 2) != 0) {
            str = "NORMAL";
        }
        fVar.replace(iVar, str);
    }
}
