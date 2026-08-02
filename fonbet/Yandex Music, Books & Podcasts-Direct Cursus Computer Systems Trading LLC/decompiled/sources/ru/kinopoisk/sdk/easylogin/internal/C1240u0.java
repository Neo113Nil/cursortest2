package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.clc;
import defpackage.fs;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import ru.kinopoisk.sdk.easylogin.internal.S;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.CastConnectionStateProvider$getState$$inlined$flatMapLatest$1", f = "CastConnectionStateProvider.kt", l = {189}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1240u0 extends aur implements pyc {
    public int a;
    public /* synthetic */ rjc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1198r0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240u0(Continuation continuation, C1198r0 c1198r0) {
        super(3, continuation);
        this.d = c1198r0;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1240u0 c1240u0 = new C1240u0((Continuation) obj3, this.d);
        c1240u0.b = (rjc) obj;
        c1240u0.c = obj2;
        return c1240u0.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.b;
            S s = (S) this.c;
            Timber.INSTANCE.tag("CastConnectionState").d("AuthTokenState: %s", s);
            pjc clcVar = s instanceof S.a ? new clc(zsd.M0(this.d.b.a(), new C1279x0(null)), new C1253v0(null)) : new fs(15, C1198r0.a.NotAvailable);
            this.a = 1;
            if (zsd.e0(rjcVar, clcVar, this) == nm6Var) {
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
