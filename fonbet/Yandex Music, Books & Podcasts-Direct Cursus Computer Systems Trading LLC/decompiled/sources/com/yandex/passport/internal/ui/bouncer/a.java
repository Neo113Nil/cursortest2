package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.aur;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nyf;
import defpackage.o8g;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ BouncerActivity l;
    public final /* synthetic */ d m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(BouncerActivity bouncerActivity, d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = bouncerActivity;
        this.m = dVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.l, this.m, continuation, 0);
            default:
                return new a(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    PassportProcessGlobalComponent passportProcessGlobalComponent = this.l.a;
                    if (passportProcessGlobalComponent == null) {
                        Intrinsics.j("globalComponent");
                        throw null;
                    }
                    com.yandex.passport.internal.config.l updateConfigUseCase = passportProcessGlobalComponent.getUpdateConfigUseCase();
                    com.yandex.passport.common.core.b L = com.yandex.plus.core.network.api.utils.a.L(this.m.c.d.a);
                    this.k = 1;
                    if (updateConfigUseCase.g(L, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    BouncerActivity bouncerActivity = this.l;
                    nyf lifecycle = bouncerActivity.getLifecycle();
                    lyf lyfVar = lyf.c;
                    a aVar = new a(bouncerActivity, this.m, null, 0);
                    this.k = 1;
                    if (o8g.J(lifecycle, lyfVar, aVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
