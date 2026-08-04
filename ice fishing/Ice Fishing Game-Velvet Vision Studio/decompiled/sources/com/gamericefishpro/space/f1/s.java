package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.k0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;

    public /* synthetic */ s(int i, int i2, Object obj) {
        this.d = i2;
        this.i = obj;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(((List) obj).addAll(this.e, (Collection) this.i));
            case 1:
                k0 k0Var = (k0) obj;
                com.gamericefishpro.space.f0.a aVar = ((com.gamericefishpro.space.g0.v) this.i).a;
                g gVarE = v.e();
                v.k(gVarE, v.h(gVarE), gVarE != null ? gVarE.e() : null);
                aVar.getClass();
                int i = k0Var.a;
                if (i == -1) {
                    i = 2;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    k0Var.a(this.e + i2);
                }
                return Unit.a;
            case 2:
                com.gamericefishpro.space.f5.d0 d0Var = (com.gamericefishpro.space.f5.d0) this.i;
                String reason = (String) obj;
                Intrinsics.checkNotNullParameter(reason, "reason");
                Intrinsics.checkNotNullParameter(reason, "reason");
                d0Var.b("defeat/" + this.e + "/" + reason, new com.gamericefishpro.space.j7.c(12));
                return Unit.a;
            default:
                com.gamericefishpro.space.n7.g gVar = (com.gamericefishpro.space.n7.g) obj;
                com.gamericefishpro.space.i7.c cVar = ((com.gamericefishpro.space.n7.q) this.i).g;
                com.gamericefishpro.space.i7.a[][] aVarArr = (com.gamericefishpro.space.i7.a[][]) cVar.d;
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (com.gamericefishpro.space.i7.a[] aVarArr2 : aVarArr) {
                    arrayList.add(com.gamericefishpro.space.ph.v.w(aVarArr2));
                }
                return com.gamericefishpro.space.n7.g.a(gVar, arrayList, cVar.a, 0, this.e, 0, 0, null, false, cVar.b, false, false, false, null, 0, 0, null, null, null, 261748);
        }
    }

    public /* synthetic */ s(int i, Collection collection) {
        this.d = 0;
        this.e = i;
        this.i = collection;
    }
}
