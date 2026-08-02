package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.c5b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$6", f = "LgCastDeviceManager.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class B5 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    public B5(Continuation<? super B5> continuation) {
        super(2, continuation);
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        B5 b5 = new B5(continuation);
        b5.b = obj;
        return b5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        B5 b5 = new B5((Continuation) obj2);
        b5.b = (rjc) obj;
        return b5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.b;
            c5b c5bVar = c5b.a;
            this.a = 1;
            if (rjcVar.emit(c5bVar, this) == nm6Var) {
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
    }
}
