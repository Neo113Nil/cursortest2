package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home;

import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.api.h0;
import com.yandex.plus.pay.adapter.api.j;
import com.yandex.plus.pay.adapter.internal.c1;
import com.yandex.plus.pay.api.analytics.tarifficator.e;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.g;
import defpackage.aur;
import defpackage.e5b;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ c l;
    public final /* synthetic */ j m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = cVar;
        this.m = jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new a(this.l, this.m, continuation, 0);
            default:
                return new a(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((a) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.l.b;
                    this.k = 1;
                    g0 g0Var = (g0) bVar.a;
                    h0 h0Var = (h0) bVar.b;
                    c1 c1Var = (c1) g0Var;
                    c1Var.getClass();
                    PlusPayCompositeOffers.Offer a = c1.a(this.m);
                    e g = ((g) ((com.yandex.plus.pay.a) c1Var.a.getValue())).g();
                    String str = h0Var.b;
                    String str2 = h0Var.c;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    g.c(a, 0, str2, "purchase_button", str, e5bVar);
                    if (Unit.a == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.plus.acquisition.sdk.common.api.di.b bVar2 = this.l.b;
                    this.k = 1;
                    if (bVar2.d(this.m) == nm6Var2) {
                    }
                } else if (i2 != 1) {
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
