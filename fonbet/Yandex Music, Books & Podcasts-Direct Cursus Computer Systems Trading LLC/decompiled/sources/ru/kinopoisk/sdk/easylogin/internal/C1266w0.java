package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.CastConnectionStateProvider$getState$2", f = "CastConnectionStateProvider.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1266w0 extends aur implements Function2<C1198r0.a, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;

    public C1266w0(Continuation<? super C1266w0> continuation) {
        super(2, continuation);
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1266w0 c1266w0 = new C1266w0(continuation);
        c1266w0.a = obj;
        return c1266w0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1266w0 c1266w0 = new C1266w0((Continuation) obj2);
        c1266w0.a = (C1198r0.a) obj;
        return c1266w0.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        Timber.INSTANCE.tag("CastConnectionState").d("ConnectionState: %s", (C1198r0.a) this.a);
        return Unit.a;
    }
}
