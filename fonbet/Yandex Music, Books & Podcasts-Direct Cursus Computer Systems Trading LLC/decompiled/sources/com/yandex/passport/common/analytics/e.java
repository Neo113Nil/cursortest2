package com.yandex.passport.common.analytics;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.qxe;
import defpackage.u75;
import defpackage.xq0;
import defpackage.zt3;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ f l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new e(this.l, continuation, 0);
            default:
                return new e(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((e) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object s = this.l.c.s(this);
                    return s == nm6Var ? nm6Var : s;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                this.k = 1;
                zt3 zt3Var = new zt3(1, qxe.b(this));
                zt3Var.s();
                AppMetricaYandex.requestStartupParams(this.l.a, new c(zt3Var), (List<String>) u75.h("appmetrica_device_id", "appmetrica_uuid"));
                Object q = zt3Var.q();
                return q == nm6Var2 ? nm6Var2 : q;
        }
    }
}
