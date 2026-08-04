package com.gamericefishpro.space.db;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f1.u;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.g5.p;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.vh.i;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.gamericefishpro.space.p4.d dVar, Long l, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 0;
        this.i = dVar;
        this.v = l;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                c cVar = new c((com.gamericefishpro.space.p4.d) this.i, (Long) this.v, aVar);
                cVar.e = obj;
                return cVar;
            case 1:
                return new c((v0) this.e, (p) this.i, (u) this.v, aVar, 1);
            default:
                return new c((Function0) this.e, (Function1) this.i, (v0) this.v, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((c) create((com.gamericefishpro.space.p4.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((c) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((c) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.v;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                ((com.gamericefishpro.space.p4.b) this.e).e((com.gamericefishpro.space.p4.d) obj2, (Long) obj3);
                break;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                p pVar = (p) obj2;
                u uVar = (u) obj3;
                for (k kVar : (Set) ((v0) this.e).getValue()) {
                    if (!((List) pVar.b().e.d.getValue()).contains(kVar) && !uVar.contains(kVar)) {
                        pVar.b().c(kVar);
                    }
                }
                break;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                v0 v0Var = (v0) obj3;
                int i2 = com.gamericefishpro.space.t7.b.d;
                if (!((com.gamericefishpro.space.t7.c) v0Var.getValue()).a) {
                    if (((com.gamericefishpro.space.t7.c) v0Var.getValue()).c) {
                        ((Function0) this.e).invoke();
                    } else {
                        com.gamericefishpro.space.h7.a aVar4 = ((com.gamericefishpro.space.t7.c) v0Var.getValue()).b;
                        ((Function1) obj2).invoke(aVar4 != null ? "iceId=" + ((Object) URLEncoder.encode(aVar4.a, "UTF-8")) + "&fishSource=" + ((Object) URLEncoder.encode(aVar4.b, "UTF-8")) + "&fishData=" + ((Object) URLEncoder.encode(aVar4.c, "UTF-8")) + "&fishId=" + ((Object) URLEncoder.encode(aVar4.d, "UTF-8")) + "&IceFishingApp=" + ((Object) URLEncoder.encode(aVar4.e, "UTF-8")) : "");
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }
}
