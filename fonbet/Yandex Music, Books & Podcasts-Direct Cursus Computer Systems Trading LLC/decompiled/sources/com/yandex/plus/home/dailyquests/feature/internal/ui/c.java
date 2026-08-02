package com.yandex.plus.home.dailyquests.feature.internal.ui;

import com.yandex.plus.home.dailyquests.repository.api.dailyquests.l;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rar;
import defpackage.rjf;
import defpackage.saf;
import defpackage.tf6;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ rjf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(rjf rjfVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = rjfVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new c(this.l, continuation, 0);
            case 1:
                return new c(this.l, continuation, 1);
            case 2:
                return new c(this.l, continuation, 2);
            default:
                return new c(this.l, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((c) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        rar y;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                rjf rjfVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.dailyquests.feature.internal.domain.b bVar = (com.yandex.plus.home.dailyquests.feature.internal.domain.b) rjfVar.d;
                    this.k = 1;
                    obj = bVar.b(false, this);
                    if (obj == nm6Var) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.k = 2;
                if (rjf.b(rjfVar, (l) obj, this) == nm6Var) {
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    rjf rjfVar2 = this.l;
                    if (x97.V((kotlinx.coroutines.a) rjfVar2.l, new c(rjfVar2, null, 3), this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                rjf rjfVar3 = this.l;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.dailyquests.feature.internal.domain.b bVar2 = (com.yandex.plus.home.dailyquests.feature.internal.domain.b) rjfVar3.d;
                    this.k = 1;
                    obj = bVar2.b(true, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.k = 2;
                if (rjf.b(rjfVar3, (l) obj, this) == nm6Var3) {
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                rjf rjfVar4 = this.l;
                if (i4 == 0) {
                    qgg.h0(obj);
                    rar rarVar = (rar) rjfVar4.b;
                    if (rarVar != null) {
                        this.k = 1;
                        if (saf.C(rarVar, this) == nm6Var4) {
                        }
                    }
                } else if (i4 == 1) {
                    qgg.h0(obj);
                } else if (i4 == 2) {
                    qgg.h0(obj);
                    y = x97.y((tf6) rjfVar4.n, null, null, new c(rjfVar4, null, 2), 3);
                    rjfVar4.o = y;
                    this.k = 3;
                    if (y.j0(this) == nm6Var4) {
                    }
                } else if (i4 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                rar rarVar2 = (rar) rjfVar4.o;
                if (rarVar2 != null) {
                    this.k = 2;
                    if (saf.C(rarVar2, this) == nm6Var4) {
                    }
                }
                y = x97.y((tf6) rjfVar4.n, null, null, new c(rjfVar4, null, 2), 3);
                rjfVar4.o = y;
                this.k = 3;
                if (y.j0(this) == nm6Var4) {
                }
                break;
        }
        return Unit.a;
    }
}
