package com.gamericefishpro.space.l6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x d;
    public static final x e;
    public static final /* synthetic */ x[] i;

    static {
        x xVar = new x("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        d = xVar;
        x xVar2 = new x("DROP_WORK_REQUEST", 1);
        e = xVar2;
        i = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) i.clone();
    }
}
