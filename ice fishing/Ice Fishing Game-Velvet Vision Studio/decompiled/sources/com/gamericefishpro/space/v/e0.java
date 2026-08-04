package com.gamericefishpro.space.v;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z, Function0 function0) {
        super(1);
        this.d = z;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((com.gamericefishpro.space.o1.h0) obj).f(!this.d && ((Boolean) this.e.invoke()).booleanValue());
        return Unit.a;
    }
}
