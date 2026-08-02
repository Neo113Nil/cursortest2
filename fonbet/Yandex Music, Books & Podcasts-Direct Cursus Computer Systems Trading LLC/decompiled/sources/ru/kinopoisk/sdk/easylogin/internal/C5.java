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

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$7", f = "LgCastDeviceManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class C5 extends aur implements Function2<List<? extends InterfaceC1305z0.a>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ C1271w5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5(C1271w5 c1271w5, Continuation<? super C5> continuation) {
        super(2, continuation);
        this.b = c1271w5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C5 c5 = new C5(this.b, continuation);
        c5.a = obj;
        return c5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C5 c5 = new C5(this.b, (Continuation) obj2);
        c5.a = (List) obj;
        return c5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        F0 f0;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        List list = (List) this.a;
        f0 = this.b.b;
        f0.a("LgCastDeviceManager", "new discover results", "results = " + list);
        return Unit.a;
    }
}
