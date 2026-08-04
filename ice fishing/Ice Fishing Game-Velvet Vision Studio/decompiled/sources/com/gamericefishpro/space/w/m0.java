package com.gamericefishpro.space.w;

import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.onesignal.NotificationOpenedActivityHMS;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends com.gamericefishpro.space.vh.i implements Function1 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(s0 s0Var, Object obj, l1 l1Var, com.gamericefishpro.space.th.a aVar) {
        super(1, aVar);
        this.d = 1;
        this.i = s0Var;
        this.v = obj;
        this.w = l1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new m0((l1) this.w, (s0) this.i, this.v, aVar, 0);
            case 1:
                return new m0((s0) this.i, this.v, (l1) this.w, aVar);
            default:
                return new m0((com.gamericefishpro.space.ei.a0) this.w, (NotificationOpenedActivityHMS) this.i, (Intent) this.v, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
        }
        return ((m0) create(aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        float f;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l1 l1Var = (l1) this.w;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.g5.w wVar = new com.gamericefishpro.space.g5.w((s0) this.i, this.v, l1Var, (com.gamericefishpro.space.th.a) null);
                    this.e = 1;
                    if (com.gamericefishpro.space.pi.a0.h(wVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                l1Var.i();
                return Unit.a;
            case 1:
                l1 l1Var2 = (l1) this.w;
                s0 s0Var = (s0) this.i;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    s0Var.x();
                    com.gamericefishpro.space.t0.f1 f1Var = s0Var.e;
                    s0Var.E = Long.MIN_VALUE;
                    s0Var.B(0.0f);
                    Object value = s0Var.i.getValue();
                    Object obj2 = this.v;
                    if (obj2.equals(value)) {
                        f = -4.0f;
                    } else {
                        f = obj2.equals(f1Var.getValue()) ? -5.0f : -3.0f;
                    }
                    l1Var2.p(obj2);
                    l1Var2.n(0L);
                    f1Var.setValue(obj2);
                    s0Var.B(0.0f);
                    s0Var.o(obj2);
                    l1Var2.j(f);
                    if (f == -3.0f) {
                        this.e = 1;
                        if (s0.v(s0Var, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                l1Var2.i();
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.xf.b bVar = (com.gamericefishpro.space.xf.b) ((com.gamericefishpro.space.ei.a0) this.w).d;
                    NotificationOpenedActivityHMS notificationOpenedActivityHMS = (NotificationOpenedActivityHMS) this.i;
                    Intent intent = (Intent) this.v;
                    this.e = 1;
                    if (bVar.handleHMSNotificationOpenIntent(notificationOpenedActivityHMS, intent, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, com.gamericefishpro.space.th.a aVar, int i) {
        super(1, aVar);
        this.d = i;
        this.w = obj;
        this.i = obj2;
        this.v = obj3;
    }
}
