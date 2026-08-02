package ru.kinopoisk.sdk.easylogin.internal;

import com.yandex.alicekit.core.slideup.SlidingBehavior;
import defpackage.aur;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.CastConnectionStateProvider$getState$1$4", f = "CastConnectionStateProvider.kt", l = {SlidingBehavior.WIDE_EXPANDED_PERCENTAGE}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1253v0 extends aur implements pyc {
    public int a;
    public /* synthetic */ rjc b;
    public /* synthetic */ Throwable c;

    public C1253v0(Continuation<? super C1253v0> continuation) {
        super(3, continuation);
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1253v0 c1253v0 = new C1253v0((Continuation) obj3);
        c1253v0.b = (rjc) obj;
        c1253v0.c = (Throwable) obj2;
        return c1253v0.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.b;
            Timber.INSTANCE.tag("CastConnectionState").w(this.c, "Failed to get network state", new Object[0]);
            C1198r0.a aVar = C1198r0.a.NotAvailable;
            this.b = null;
            this.a = 1;
            if (rjcVar.emit(aVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
