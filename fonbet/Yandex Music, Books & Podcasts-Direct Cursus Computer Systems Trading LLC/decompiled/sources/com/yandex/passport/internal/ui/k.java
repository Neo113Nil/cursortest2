package com.yandex.passport.internal.ui;

import android.content.Intent;
import defpackage.aur;
import defpackage.b6;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nyf;
import defpackage.o8g;
import defpackage.qgg;
import defpackage.xq0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class k extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ com.yandex.passport.internal.ui.challenge.e l;
    public final /* synthetic */ b6 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.yandex.passport.internal.ui.challenge.e eVar, b6 b6Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = eVar;
        this.m = b6Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k(this.l, this.m, continuation, 0);
            default:
                return new k(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((k) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        b6 b6Var = this.m;
        com.yandex.passport.internal.ui.challenge.e eVar = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        this.k = 1;
                        obj = eVar.q(b6Var, this);
                        if (obj == nm6Var) {
                            break;
                        }
                    } else if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        qgg.h0(obj);
                    }
                    com.yandex.passport.internal.ui.challenge.e.j(eVar, obj);
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "activity cancelled", e);
                        }
                    } else {
                        com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "activity error", e);
                        }
                        int i3 = com.yandex.passport.internal.ui.challenge.e.d;
                        Intent intent = new Intent();
                        intent.putExtra(Constants.KEY_EXCEPTION, e);
                        eVar.setResult(13, intent);
                        eVar.finish();
                    }
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    nyf lifecycle = eVar.getLifecycle();
                    lyf lyfVar = lyf.d;
                    k kVar = new k(eVar, b6Var, continuation, 0);
                    this.k = 1;
                    if (o8g.J(lifecycle, lyfVar, kVar, this) == nm6Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
