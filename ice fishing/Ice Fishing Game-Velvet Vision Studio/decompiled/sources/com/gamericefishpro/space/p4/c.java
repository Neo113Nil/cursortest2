package com.gamericefishpro.space.p4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.vh.i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        switch (i) {
            case 1:
                this.v = (i) function2;
                super(2, aVar);
                break;
            default:
                this.v = (i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = new c(this.v, aVar, 0);
                cVar.i = obj;
                return cVar;
            default:
                c cVar2 = new c(this.v, aVar, 1);
                cVar2.i = obj;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((c) create(bVar, aVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    b bVar = (b) this.i;
                    this.e = 1;
                    obj = this.v.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                b bVar2 = (b) obj;
                Intrinsics.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.b.e).set(true);
                return bVar2;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.i;
                    com.gamericefishpro.space.wa.b.P(obj);
                    return bVar3;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                b bVar4 = new b(m0.i(((b) this.i).a()), false);
                this.i = bVar4;
                this.e = 1;
                return this.v.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
