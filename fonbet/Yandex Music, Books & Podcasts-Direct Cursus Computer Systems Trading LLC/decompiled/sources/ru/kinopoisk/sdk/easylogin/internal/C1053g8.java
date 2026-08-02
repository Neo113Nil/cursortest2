package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$discoveryFlow$6", f = "SamsungCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.g8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1053g8 extends aur implements Function2<List<? extends InterfaceC1305z0.a>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ C0983b8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053g8(C0983b8 c0983b8, Continuation<? super C1053g8> continuation) {
        super(2, continuation);
        this.b = c0983b8;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1053g8 c1053g8 = new C1053g8(this.b, continuation);
        c1053g8.a = obj;
        return c1053g8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1053g8 c1053g8 = new C1053g8(this.b, (Continuation) obj2);
        c1053g8.a = (List) obj;
        return c1053g8.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        F0 f0;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List list = (List) this.a;
        f0 = this.b.b;
        f0.a("SamsungCastDeviceManager", "new discover results", "results = " + list);
        return Unit.a;
    }
}
