package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

@we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$discoveryFlow$9", f = "KinopoiskCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.r5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1203r5 extends aur implements pyc {
    public final /* synthetic */ C1106k5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1203r5(C1106k5 c1106k5, Continuation<? super C1203r5> continuation) {
        super(3, continuation);
        this.a = c1106k5;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C1203r5(this.a, (Continuation) obj3).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        F0 f0 = this.a.b;
        f0.getClass();
        f0.a(C1121l6.a.c.b, "KinopoiskCastDeviceManager", "discovery stopped", (Throwable) null, new Object[0]);
        return Unit.a;
    }
}
