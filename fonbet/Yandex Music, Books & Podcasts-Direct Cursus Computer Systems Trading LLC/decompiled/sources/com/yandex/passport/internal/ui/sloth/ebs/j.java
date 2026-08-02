package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.aqi;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ aqi m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Function2 function2, int i, aqi aqiVar, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.k = function2;
        this.l = i;
        this.m = aqiVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j(this.k, this.l, this.m, continuation, 0);
            default:
                return new j(this.k, this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        aqi aqiVar = this.m;
        int i2 = this.l;
        Function2 function2 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                function2.invoke(new Integer(i2), ((s0) aqiVar.getValue()).d);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                function2.invoke(new Integer(i2), ((com.yandex.passport.internal.ui.sloth.webauthn.s) aqiVar.getValue()).b);
                break;
        }
        return Unit.a;
    }
}
