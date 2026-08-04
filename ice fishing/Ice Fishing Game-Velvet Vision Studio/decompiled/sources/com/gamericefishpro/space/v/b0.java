package com.gamericefishpro.space.v;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public static final b0 e;
    public static final b0 i;
    public static final b0 v;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new b0(i2, 0);
        i = new b0(i2, 1);
        v = new b0(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j = ((com.gamericefishpro.space.o1.n0) obj).a;
                return new com.gamericefishpro.space.w.l(com.gamericefishpro.space.o1.n0.b(j), com.gamericefishpro.space.o1.n0.c(j));
            case 1:
                com.gamericefishpro.space.w.l lVar = (com.gamericefishpro.space.w.l) obj;
                float f = lVar.a;
                float f2 = lVar.b;
                return new com.gamericefishpro.space.o1.n0((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            default:
                return com.gamericefishpro.space.w.c.n(0.0f, 0.0f, null, 7);
        }
    }
}
