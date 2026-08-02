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

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$discoveryFlow$7", f = "SamsungCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.h8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1067h8 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public final /* synthetic */ C0983b8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1067h8(C0983b8 c0983b8, Continuation<? super C1067h8> continuation) {
        super(2, continuation);
        this.a = c0983b8;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1067h8(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1067h8(this.a, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        F0 f0 = this.a.b;
        f0.getClass();
        f0.a(C1121l6.a.c.b, "SamsungCastDeviceManager", "discovery started", (Throwable) null, new Object[0]);
        return Unit.a;
    }
}
