package com.yandex.passport.internal.ui.util;

import android.app.Activity;
import defpackage.aur;
import defpackage.bqi;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xdr;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new i(this.l, continuation, 0);
            default:
                return new i(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    j jVar = this.l;
                    bqi bqiVar = (bqi) jVar.c.getValue();
                    Activity a = jVar.a();
                    this.k = 1;
                    ((xdr) bqiVar).l(a);
                    if (Unit.a == nm6Var) {
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
                    j jVar2 = this.l;
                    bqi bqiVar2 = (bqi) jVar2.c.getValue();
                    Activity a2 = jVar2.a();
                    this.k = 1;
                    ((xdr) bqiVar2).l(a2);
                    if (Unit.a == nm6Var2) {
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
