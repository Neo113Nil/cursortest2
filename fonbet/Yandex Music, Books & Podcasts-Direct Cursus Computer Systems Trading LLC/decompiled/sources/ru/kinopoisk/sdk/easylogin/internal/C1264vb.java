package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.we7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvDiscoveryViewModel$listenStateForAnalytics$3", f = "TvDiscoveryViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.vb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1264vb extends aur implements pyc {
    public /* synthetic */ Throwable a;

    public C1264vb(Continuation<? super C1264vb> continuation) {
        super(3, continuation);
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1264vb c1264vb = new C1264vb((Continuation) obj3);
        c1264vb.a = (Throwable) obj2;
        return c1264vb.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        Timber.INSTANCE.e(this.a, "Failed to listen state for analytics", new Object[0]);
        return Unit.a;
    }
}
