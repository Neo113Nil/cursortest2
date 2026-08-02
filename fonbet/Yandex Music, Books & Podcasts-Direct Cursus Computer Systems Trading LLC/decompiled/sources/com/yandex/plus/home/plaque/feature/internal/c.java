package com.yandex.plus.home.plaque.feature.internal;

import com.yandex.passport.internal.entities.j;
import com.yandex.passport.internal.flags.experiments.p;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.ux2;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c(this.l, continuation, 0);
            default:
                return new c(this.l, continuation, 1);
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
                    e eVar = this.l;
                    p pVar = eVar.j;
                    Map map = ((com.yandex.plus.home.plaque.feature.api.context.b) ((xdr) eVar.c.d).getValue()).b;
                    this.k = 1;
                    Object d = ((com.yandex.plus.home.plaque.repository.api.a) pVar.b).d(map, this);
                    if (d != nm6Var) {
                        d = Unit.a;
                    }
                    if (d == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                Object obj2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    p pVar2 = this.l.j;
                    this.k = 1;
                    j jVar = (j) pVar2.c;
                    xdr xdrVar = (xdr) jVar.c;
                    Boolean bool = Boolean.TRUE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    jVar.R();
                    Object V = x97.V((kotlinx.coroutines.a) pVar2.d, new ux2(pVar2, null, 3), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
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
