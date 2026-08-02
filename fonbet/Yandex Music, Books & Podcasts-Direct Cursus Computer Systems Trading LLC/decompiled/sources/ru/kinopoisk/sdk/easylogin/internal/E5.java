package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$9", f = "LgCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class E5 extends aur implements pyc {
    public final /* synthetic */ C1271w5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E5(C1271w5 c1271w5, Continuation<? super E5> continuation) {
        super(3, continuation);
        this.a = c1271w5;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new E5(this.a, (Continuation) obj3).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.a.b.a(C1121l6.a.c.b, "LgCastDeviceManager", "discovery stopped", (Throwable) null, new Object[0]);
        return Unit.a;
    }
}
