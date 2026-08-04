package com.gamericefishpro.space.o7;

import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.u6.f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.di.c {
    public static final a d = new a();

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        com.gamericefishpro.space.f0.c item = (com.gamericefishpro.space.f0.c) obj;
        r rVar = (r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((iIntValue & 17) == 16 && rVar.E()) {
            rVar.V();
        } else {
            f.c(rVar, 0);
        }
        return Unit.a;
    }
}
