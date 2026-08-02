package com.yandex.passport.internal.ui.social.authenticators;

import com.yandex.passport.internal.usecase.ui.j;
import com.yandex.passport.internal.usecase.ui.l;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ c l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = cVar;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b(this.l, this.m, continuation, 0);
            case 1:
                return new b(this.l, this.m, continuation, 1);
            default:
                return new b(this.l, this.m, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                c cVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    l lVar = cVar.u;
                    j jVar = new j(com.yandex.plus.core.network.api.utils.a.L(cVar.k.d.a), this.m, cVar.l.d());
                    this.k = 1;
                    obj = lVar.g(jVar, this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Object obj2 = ((z7o) obj).a;
                if (!(obj2 instanceof t7o)) {
                    cVar.O((com.yandex.passport.internal.l) obj2);
                }
                Throwable a = z7o.a(obj2);
                if (a != null) {
                    cVar.M(a);
                }
                break;
            case 1:
                c cVar2 = this.l;
                com.yandex.passport.internal.properties.l lVar2 = cVar2.k;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.usecase.authorize.f fVar = cVar2.t;
                    com.yandex.passport.internal.entities.f fVar2 = new com.yandex.passport.internal.entities.f(Integer.MAX_VALUE, lVar2.d.a, this.m);
                    String str = cVar2.A;
                    com.yandex.passport.internal.analytics.a aVar = com.yandex.passport.internal.analytics.a.j;
                    com.yandex.passport.internal.usecase.authorize.d dVar = new com.yandex.passport.internal.usecase.authorize.d(fVar2, str, com.yandex.passport.internal.credentials.a.a, new com.yandex.passport.internal.analytics.a(aVar.a, aVar.b, lVar2.l));
                    this.k = 1;
                    obj = fVar.g(dVar, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Object obj3 = ((z7o) obj).a;
                Throwable a2 = z7o.a(obj3);
                if (a2 == null) {
                    cVar2.O((com.yandex.passport.internal.l) obj3);
                } else {
                    cVar2.M(a2);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                c cVar3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    l lVar3 = cVar3.u;
                    j jVar2 = new j(com.yandex.plus.core.network.api.utils.a.L(cVar3.k.d.a), this.m, cVar3.l.d());
                    this.k = 1;
                    obj = lVar3.g(jVar2, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Object obj4 = ((z7o) obj).a;
                if (!(obj4 instanceof t7o)) {
                    cVar3.O((com.yandex.passport.internal.l) obj4);
                }
                Throwable a3 = z7o.a(obj4);
                if (a3 != null) {
                    cVar3.M(a3);
                }
                break;
        }
        return Unit.a;
    }
}
