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

@we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$discoveryFlow$7", f = "KinopoiskCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1176p5 extends aur implements Function2<List<? extends InterfaceC1305z0.a>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1106k5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176p5(C1106k5 c1106k5, Continuation<? super C1176p5> continuation) {
        super(2, continuation);
        this.b = c1106k5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1176p5 c1176p5 = new C1176p5(this.b, continuation);
        c1176p5.a = obj;
        return c1176p5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1176p5 c1176p5 = new C1176p5(this.b, (Continuation) obj2);
        c1176p5.a = (List) obj;
        return c1176p5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        F0 f0;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List list = (List) this.a;
        f0 = this.b.b;
        f0.a("KinopoiskCastDeviceManager", "new discover results", "results = " + list);
        return Unit.a;
    }
}
