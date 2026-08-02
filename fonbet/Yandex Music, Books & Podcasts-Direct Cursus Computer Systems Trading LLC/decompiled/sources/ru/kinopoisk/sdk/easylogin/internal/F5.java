package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.b6e;
import defpackage.c5b;
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
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$special$$inlined$flatMapLatest$1", f = "LgCastDeviceManager.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class F5 extends aur implements pyc {
    public int a;
    public /* synthetic */ rjc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C1271w5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F5(Continuation continuation, C1271w5 c1271w5) {
        super(3, continuation);
        this.d = c1271w5;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        F5 f5 = new F5((Continuation) obj3, this.d);
        f5.b = (rjc) obj;
        f5.c = obj2;
        return f5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc K;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = this.b;
            C1198r0.a aVar = (C1198r0.a) this.c;
            Timber.INSTANCE.d("LgCastDeviceManager", "get discovered items [connectionState=%s]", aVar);
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                K = zsd.K(new H5(this.d.a, null));
            } else if (ordinal == 1) {
                K = new fs(15, CollectionsKt.w0(this.d.e));
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                K = new fs(15, c5b.a);
            }
            this.a = 1;
            if (zsd.e0(rjcVar, K, this) == nm6Var) {
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
