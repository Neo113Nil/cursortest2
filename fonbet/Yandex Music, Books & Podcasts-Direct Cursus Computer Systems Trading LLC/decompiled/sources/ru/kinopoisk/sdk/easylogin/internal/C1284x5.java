package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$1", f = "LgCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.x5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1284x5 extends aur implements Function2<C1198r0.a, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1271w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1284x5(C1271w5 c1271w5, Continuation<? super C1284x5> continuation) {
        super(2, continuation);
        this.b = c1271w5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1284x5 c1284x5 = new C1284x5(this.b, continuation);
        c1284x5.a = obj;
        return c1284x5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1284x5 c1284x5 = new C1284x5(this.b, (Continuation) obj2);
        c1284x5.a = (C1198r0.a) obj;
        return c1284x5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        F0 f0;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        C1198r0.a aVar = (C1198r0.a) this.a;
        f0 = this.b.b;
        f0.a("LgCastDeviceManager", "change connection state", "state = " + aVar);
        return Unit.a;
    }
}
