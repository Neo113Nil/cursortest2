package com.gamericefishpro.space.wa;

import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.pi.a0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.bb.e {
    public static final c e = new c(0);
    public static final c i = new c(1);
    public static final c v = new c(2);
    public static final c w = new c(3);
    public static final c y = new c(4);
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.bb.e
    public Object a(com.gamericefishpro.space.b1.d dVar) {
        switch (this.d) {
            case 1:
                Object objF = dVar.f(new v(com.gamericefishpro.space.ab.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objF, "get(...)");
                return a0.k((Executor) objF);
            case 2:
                Object objF2 = dVar.f(new v(com.gamericefishpro.space.ab.c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objF2, "get(...)");
                return a0.k((Executor) objF2);
            case 3:
                Object objF3 = dVar.f(new v(com.gamericefishpro.space.ab.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objF3, "get(...)");
                return a0.k((Executor) objF3);
            default:
                Object objF4 = dVar.f(new v(com.gamericefishpro.space.ab.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(objF4, "get(...)");
                return a0.k((Executor) objF4);
        }
    }
}
