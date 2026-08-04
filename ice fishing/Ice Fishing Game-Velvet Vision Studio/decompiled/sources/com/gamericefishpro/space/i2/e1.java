package com.gamericefishpro.space.i2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ com.gamericefishpro.space.u6.s e;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z, com.gamericefishpro.space.u6.s sVar, String str) {
        super(0);
        this.d = z;
        this.e = sVar;
        this.i = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.d) {
            com.gamericefishpro.space.u6.s sVar = this.e;
            String key = this.i;
            Intrinsics.checkNotNullParameter(key, "key");
            com.gamericefishpro.space.b6.b bVar = (com.gamericefishpro.space.b6.b) sVar.e;
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (bVar.c) {
            }
        }
        return Unit.a;
    }
}
