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

@we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$discoveryFlow$8", f = "KinopoiskCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1190q5 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public final /* synthetic */ C1106k5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190q5(C1106k5 c1106k5, Continuation<? super C1190q5> continuation) {
        super(2, continuation);
        this.a = c1106k5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1190q5(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1190q5(this.a, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        F0 f0 = this.a.b;
        f0.getClass();
        f0.a(C1121l6.a.c.b, "KinopoiskCastDeviceManager", "discovery started", (Throwable) null, new Object[0]);
        return Unit.a;
    }
}
