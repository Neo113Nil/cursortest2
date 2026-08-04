package com.gamericefishpro.space.n9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 {
    public static final y3 d;
    public static final y3 e;
    public static final /* synthetic */ y3[] i;

    static {
        y3 y3Var = new y3("CONSENT", 0);
        d = y3Var;
        y3 y3Var2 = new y3("LEGITIMATE_INTEREST", 1);
        y3 y3Var3 = new y3("FLEXIBLE_CONSENT", 2);
        y3 y3Var4 = new y3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        e = y3Var4;
        i = new y3[]{y3Var, y3Var2, y3Var3, y3Var4};
    }

    public static y3[] values() {
        return (y3[]) i.clone();
    }
}
