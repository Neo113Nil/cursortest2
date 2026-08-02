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

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$discoveryFlow$5", f = "SamsungCastDeviceManager.kt", l = {77}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.f8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1039f8 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    public C1039f8(Continuation<? super C1039f8> continuation) {
        super(2, continuation);
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1039f8 c1039f8 = new C1039f8(continuation);
        c1039f8.b = obj;
        return c1039f8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1039f8 c1039f8 = new C1039f8((Continuation) obj2);
        c1039f8.b = (rjc) obj;
        return c1039f8.invokeSuspend(Unit.a);
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
