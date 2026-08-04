package com.gamericefishpro.space.i5;

import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.ph.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ w d;
    public final /* synthetic */ w e;
    public final /* synthetic */ g i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ r w;

    public /* synthetic */ d(w wVar, w wVar2, g gVar, boolean z, r rVar) {
        this.d = wVar;
        this.e = wVar2;
        this.i = gVar;
        this.v = z;
        this.w = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k entry = (k) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.d.d = true;
        this.e.d = true;
        this.i.p(entry, this.v, this.w);
        return Unit.a;
    }
}
