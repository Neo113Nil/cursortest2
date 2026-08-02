package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;

@we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$discoveryFlow$1", f = "KinopoiskCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1120l5 extends aur implements Function2<C1198r0.a, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1106k5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1120l5(C1106k5 c1106k5, Continuation<? super C1120l5> continuation) {
        super(2, continuation);
        this.b = c1106k5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1120l5 c1120l5 = new C1120l5(this.b, continuation);
        c1120l5.a = obj;
        return c1120l5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1120l5 c1120l5 = new C1120l5(this.b, (Continuation) obj2);
        c1120l5.a = (C1198r0.a) obj;
        return c1120l5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        F0 f0;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        C1198r0.a aVar = (C1198r0.a) this.a;
        f0 = this.b.b;
        f0.a("KinopoiskCastDeviceManager", "change connection state", "state = " + aVar);
        return Unit.a;
    }
}
