package com.gamericefishpro.space.db;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.u5.k;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int d = 1;
    public /* synthetic */ Object e;
    public final /* synthetic */ Function1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.gamericefishpro.space.th.a aVar, Function1 function1) {
        super(2, aVar);
        this.i = function1;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b bVar = new b(this.i, aVar);
                bVar.e = obj;
                return bVar;
            default:
                b bVar2 = new b(aVar, this.i);
                bVar2.e = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b) create((com.gamericefishpro.space.p4.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((b) create((k) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        Function1 function1 = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                function1.invoke((com.gamericefishpro.space.p4.b) this.e);
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                k kVar = (k) this.e;
                Intrinsics.c(kVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return function1.invoke(kVar.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 function1, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = function1;
    }
}
