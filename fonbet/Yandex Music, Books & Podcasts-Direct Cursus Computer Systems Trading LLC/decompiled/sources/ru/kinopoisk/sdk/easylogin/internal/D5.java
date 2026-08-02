package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$8", f = "LgCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class D5 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public final /* synthetic */ C1271w5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5(C1271w5 c1271w5, Continuation<? super D5> continuation) {
        super(2, continuation);
        this.a = c1271w5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new D5(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new D5(this.a, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.a.b.a(C1121l6.a.c.b, "LgCastDeviceManager", "discovery started", (Throwable) null, new Object[0]);
        return Unit.a;
    }
}
