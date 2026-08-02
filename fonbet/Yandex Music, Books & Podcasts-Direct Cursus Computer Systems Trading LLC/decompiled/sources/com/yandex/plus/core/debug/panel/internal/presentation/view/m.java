package com.yandex.plus.core.debug.panel.internal.presentation.view;

import defpackage.aur;
import defpackage.b6e;
import defpackage.mxt;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.s9f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = oVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                m mVar = new m(this.l, continuation, 0);
                mVar.k = obj;
                return mVar;
            default:
                m mVar2 = new m(this.l, continuation, 1);
                mVar2.k = obj;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((m) create((com.yandex.plus.core.debug.panel.internal.model.log.d) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((m) create((com.yandex.plus.core.debug.panel.internal.presentation.state.e) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        o oVar = this.l;
        switch (i) {
            case 0:
                com.yandex.plus.core.debug.panel.internal.model.log.d dVar = (com.yandex.plus.core.debug.panel.internal.model.log.d) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                s9f[] s9fVarArr = o.I;
                if (dVar instanceof com.yandex.plus.core.debug.panel.internal.model.log.c) {
                    oVar.s(((com.yandex.plus.core.debug.panel.internal.model.log.c) dVar).a, new g(oVar, 3), new i(oVar, 3));
                } else if (dVar instanceof com.yandex.plus.core.debug.panel.internal.model.log.b) {
                    oVar.s(((com.yandex.plus.core.debug.panel.internal.model.log.b) dVar).a, new g(oVar, 0), new i(oVar, 1));
                } else if (dVar != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            default:
                com.yandex.plus.core.debug.panel.internal.presentation.state.e eVar = (com.yandex.plus.core.debug.panel.internal.presentation.state.e) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                boolean z = eVar.c;
                s9f[] s9fVarArr2 = o.I;
                oVar.t(z);
                mxt mxtVar = oVar.H;
                mxtVar.d.b(eVar.a, new com.yandex.passport.internal.interaction.c(10, oVar, eVar));
                return Unit.a;
        }
    }
}
