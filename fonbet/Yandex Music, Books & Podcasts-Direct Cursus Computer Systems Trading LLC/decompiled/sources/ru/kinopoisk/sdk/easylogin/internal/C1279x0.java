package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.ca8;
import defpackage.ctm;
import defpackage.dq7;
import defpackage.fs;
import defpackage.j5h;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.ss3;
import defpackage.we7;
import defpackage.xq0;
import defpackage.zsd;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import ru.kinopoisk.sdk.easylogin.internal.M6;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.CastConnectionStateProvider$getState$lambda$2$$inlined$flatMapLatest$1", f = "CastConnectionStateProvider.kt", l = {189}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1279x0 extends aur implements pyc {
    public int a;
    public /* synthetic */ rjc b;
    public /* synthetic */ Object c;

    public C1279x0(Continuation continuation) {
        super(3, continuation);
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1279x0 c1279x0 = new C1279x0((Continuation) obj3);
        c1279x0.b = (rjc) obj;
        c1279x0.c = obj2;
        return c1279x0.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc fsVar;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.b;
            M6 m6 = (M6) this.c;
            Timber.INSTANCE.tag("CastConnectionState").d("NetworkState: %s", m6);
            m6.getClass();
            if ((m6 instanceof M6.a) && ((M6.a) m6).a.contains(N6.Wifi)) {
                C1198r0.b bVar = C1198r0.c;
                ctm ctmVar = ctm.i;
                bVar.getClass();
                ss3 I = zsd.I(new C1212s0(ctmVar, null));
                dq7 dq7Var = ca8.a;
                fsVar = new C1226t0(zsd.k0(I, j5h.a.g));
            } else {
                fsVar = new fs(15, C1198r0.a.NotAvailable);
            }
            this.a = 1;
            if (zsd.e0(rjcVar, fsVar, this) == nm6Var) {
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
