package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdServiceInfo;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.pairing.nsd.NsdServiceResolver$resolve$3", f = "NsdServiceResolver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class X6 extends aur implements Function2<NsdServiceInfo, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;

    public X6(Continuation<? super X6> continuation) {
        super(2, continuation);
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        X6 x6 = new X6(continuation);
        x6.a = obj;
        return x6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        X6 x6 = new X6((Continuation) obj2);
        x6.a = (NsdServiceInfo) obj;
        return x6.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        Timber.INSTANCE.tag("NsdServiceResolver").d("resolved: %s", (NsdServiceInfo) this.a);
        return Unit.a;
    }
}
