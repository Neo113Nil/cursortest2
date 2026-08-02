package com.yandex.passport.internal.ui.account_upgrade;

import defpackage.aur;
import defpackage.dkn;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nyf;
import defpackage.o8g;
import defpackage.qgg;
import defpackage.rj7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ AccountUpgraderActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(AccountUpgraderActivity accountUpgraderActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = accountUpgraderActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.l, continuation, 0);
            default:
                return new a(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
            default:
                return ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        AccountUpgraderActivity accountUpgraderActivity = this.l;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    int i4 = AccountUpgraderActivity.f;
                    dkn dknVar = ((j) accountUpgraderActivity.b.getValue()).m;
                    com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(i2, accountUpgraderActivity);
                    this.k = 1;
                    if (dknVar.a.collect(aVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    nyf lifecycle = accountUpgraderActivity.getLifecycle();
                    lyf lyfVar = lyf.c;
                    a aVar2 = new a(accountUpgraderActivity, continuation, 0);
                    this.k = 1;
                    if (o8g.J(lifecycle, lyfVar, aVar2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
