package com.gamericefishpro.space.s7;

import com.gamericefishpro.space.oh.t;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.d {
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;
    public /* synthetic */ boolean i;

    @Override // com.gamericefishpro.space.di.d
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        f fVar = new f(4, (com.gamericefishpro.space.th.a) obj4);
        fVar.d = zBooleanValue;
        fVar.e = zBooleanValue2;
        fVar.i = zBooleanValue3;
        return fVar.invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        return new t(Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.i));
    }
}
