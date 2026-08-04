package com.gamericefishpro.space.v7;

import android.content.Context;
import android.os.Build;
import com.gamericefishpro.space.e.q;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.z4.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ Context d;
    public final /* synthetic */ i e;
    public final /* synthetic */ q i;
    public final /* synthetic */ v0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, i iVar, q qVar, v0 v0Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = context;
        this.e = iVar;
        this.i = qVar;
        this.v = v0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        return new d(this.d, this.e, this.i, this.v, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        com.gamericefishpro.space.wa.b.P(obj);
        if (((g) this.v.getValue()).b && Build.VERSION.SDK_INT >= 33) {
            if (com.gamericefishpro.space.s3.a.a(this.d, "android.permission.POST_NOTIFICATIONS") == 0) {
                i iVar = this.e;
                a0.u(m0.h(iVar), null, new com.gamericefishpro.space.f7.i(iVar, true, null, 1), 3);
            } else {
                this.i.L("android.permission.POST_NOTIFICATIONS");
            }
        }
        return Unit.a;
    }
}
