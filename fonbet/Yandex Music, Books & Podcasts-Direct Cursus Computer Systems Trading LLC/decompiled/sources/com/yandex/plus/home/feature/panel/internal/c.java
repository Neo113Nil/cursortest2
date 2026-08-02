package com.yandex.plus.home.feature.panel.internal;

import com.yandex.passport.internal.entities.j;
import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ f l;
    public final /* synthetic */ d0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f fVar, d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fVar;
        this.m = d0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c(this.l, this.m, continuation, 0);
            default:
                return new c(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (f.a(this.l, this.m, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    f fVar = this.l;
                    com.yandex.plus.core.analytics.logging.d dVar = fVar.h;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    boolean b = dVar.b(aVar);
                    Continuation continuation = null;
                    d0 d0Var = this.m;
                    if (b) {
                        dVar.a(aVar, "PlusPanelViewManagerImpl", "onShortcutClick() action=" + d0Var, null);
                    }
                    j jVar = fVar.f;
                    this.k = 1;
                    com.yandex.plus.core.analytics.logging.d dVar2 = (com.yandex.plus.core.analytics.logging.d) jVar.e;
                    if (dVar2.b(aVar)) {
                        dVar2.a(aVar, "PanelRouterImpl", "routeByGeneralShortcutClick() action=" + d0Var, null);
                    }
                    ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) jVar.d)).getClass();
                    if (x97.V(com.yandex.plus.core.dispatcher.a.c, new q(d0Var, jVar, false, continuation, 13), this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
