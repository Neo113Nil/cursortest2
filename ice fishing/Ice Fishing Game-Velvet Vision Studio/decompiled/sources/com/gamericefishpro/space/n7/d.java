package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.z4.m0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    public /* synthetic */ d(q qVar, int i) {
        this.d = i;
        this.e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.i7.d type = (com.gamericefishpro.space.i7.d) obj;
                Intrinsics.checkNotNullParameter(type, "it");
                Intrinsics.checkNotNullParameter(type, "type");
                q qVar = this.e;
                g gVar = (g) qVar.c.d.getValue();
                Integer num = (Integer) gVar.p.get(type);
                if ((num != null ? num.intValue() : 0) > 0) {
                    if (gVar.q == type) {
                        type = null;
                    }
                    qVar.e(new com.gamericefishpro.space.a7.c(17, type));
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.i7.d type2 = (com.gamericefishpro.space.i7.d) obj;
                Intrinsics.checkNotNullParameter(type2, "it");
                Intrinsics.checkNotNullParameter(type2, "type");
                q qVar2 = this.e;
                g gVar2 = (g) qVar2.c.d.getValue();
                if (gVar2.o >= type2.i) {
                    com.gamericefishpro.space.pi.a0.u(m0.h(qVar2), null, new com.gamericefishpro.space.db.d(qVar2, type2, gVar2, null, 8), 3);
                }
                return Unit.a;
            default:
                g gVar3 = (g) obj;
                q qVar3 = this.e;
                com.gamericefishpro.space.i7.a[][] aVarArr = (com.gamericefishpro.space.i7.a[][]) qVar3.g.d;
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (com.gamericefishpro.space.i7.a[] aVarArr2 : aVarArr) {
                    arrayList.add(com.gamericefishpro.space.ph.v.w(aVarArr2));
                }
                int i = qVar3.h;
                int i2 = qVar3.i;
                int i3 = qVar3.j;
                return g.a(gVar3, arrayList, 0, i2, i, i3, i3, null, false, 0, false, false, false, null, 0, 0, null, null, null, 262082);
        }
    }
}
