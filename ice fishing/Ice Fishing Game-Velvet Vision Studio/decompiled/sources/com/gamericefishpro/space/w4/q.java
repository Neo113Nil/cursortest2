package com.gamericefishpro.space.w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q d;
    public static final q e;
    public static final q i;
    public static final /* synthetic */ q[] v;

    /* JADX INFO: Fake field, exist only in values array */
    q EF0;

    static {
        q qVar = new q("REMOVED", 0);
        q qVar2 = new q("VISIBLE", 1);
        d = qVar2;
        q qVar3 = new q("GONE", 2);
        e = qVar3;
        q qVar4 = new q("INVISIBLE", 3);
        i = qVar4;
        v = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) v.clone();
    }
}
