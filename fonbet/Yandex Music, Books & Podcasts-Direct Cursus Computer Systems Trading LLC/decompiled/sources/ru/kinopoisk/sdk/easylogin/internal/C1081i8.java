package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$discoveryFlow$8", f = "SamsungCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.i8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1081i8 extends aur implements pyc {
    public final /* synthetic */ C0983b8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1081i8(C0983b8 c0983b8, Continuation<? super C1081i8> continuation) {
        super(3, continuation);
        this.a = c0983b8;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C1081i8(this.a, (Continuation) obj3).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        F0 f0 = this.a.b;
        f0.getClass();
        f0.a(C1121l6.a.c.b, "SamsungCastDeviceManager", "discovery stopped", (Throwable) null, new Object[0]);
        return Unit.a;
    }
}
