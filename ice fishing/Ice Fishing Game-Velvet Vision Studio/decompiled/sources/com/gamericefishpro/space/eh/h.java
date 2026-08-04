package com.gamericefishpro.space.eh;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[com.gamericefishpro.space.bd.b.values().length];
        try {
            iArr[com.gamericefishpro.space.bd.b.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.gamericefishpro.space.bd.b.FAIL_CONFLICT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.gamericefishpro.space.bd.b.FAIL_NORETRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[com.gamericefishpro.space.yb.f.a.values().length];
        try {
            iArr2[com.gamericefishpro.space.yb.f.a.RETRYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.gamericefishpro.space.yb.f.a.UNAUTHORIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[com.gamericefishpro.space.jh.g.values().length];
        try {
            iArr3[com.gamericefishpro.space.jh.g.SMS.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[com.gamericefishpro.space.jh.g.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
