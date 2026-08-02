package ru.yandex.taxi.orderforanother.router;

import android.content.Context;
import defpackage.at20;
import defpackage.avj0;
import defpackage.aw70;
import defpackage.bgq0;
import defpackage.bu6;
import defpackage.d800;
import defpackage.fl10;
import defpackage.i130;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.mj31;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pav;
import defpackage.qd21;
import defpackage.qv70;
import defpackage.rz0;
import defpackage.sln;
import defpackage.sv70;
import defpackage.tfb0;
import defpackage.uv70;
import defpackage.wz41;
import defpackage.xvf0;
import defpackage.zuj0;
import defpackage.zv70;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.orderforanother.v1.ui.WhoRideSelectorModalView;

/* loaded from: classes6.dex */
public final class a implements aw70 {
    public final d800 a;
    public final zuj0 b;
    public final sv70 c;
    public final i130 d;
    public final uv70 e;
    public final ru.yandex.taxi.orderforanother.repository.a f;
    public final kr0 g;
    public final sln h;
    public final oep0 i;
    public final rz0 j;
    public final qv70 k;

    public a(d800 d800Var, zuj0 zuj0Var, sv70 sv70Var, i130 i130Var, uv70 uv70Var, ru.yandex.taxi.orderforanother.repository.a aVar, kr0 kr0Var, sln slnVar, oep0 oep0Var, rz0 rz0Var, qv70 qv70Var) {
        this.a = d800Var;
        this.b = zuj0Var;
        this.c = sv70Var;
        this.d = i130Var;
        this.e = uv70Var;
        this.f = aVar;
        this.g = kr0Var;
        this.h = slnVar;
        this.i = oep0Var;
        this.j = rz0Var;
        this.k = qv70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zv70 zv70Var, ContinuationImpl continuationImpl) {
        OrderForAnotherRouterImpl$showOrderForAnother$1 orderForAnotherRouterImpl$showOrderForAnother$1;
        Object obj;
        int i;
        if (continuationImpl instanceof OrderForAnotherRouterImpl$showOrderForAnother$1) {
            orderForAnotherRouterImpl$showOrderForAnother$1 = (OrderForAnotherRouterImpl$showOrderForAnother$1) continuationImpl;
            int i2 = orderForAnotherRouterImpl$showOrderForAnother$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderForAnotherRouterImpl$showOrderForAnother$1.label = i2 - Integer.MIN_VALUE;
                obj = orderForAnotherRouterImpl$showOrderForAnother$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderForAnotherRouterImpl$showOrderForAnother$1.label;
                ru.yandex.taxi.orderforanother.repository.a aVar = this.f;
                if (i != 0) {
                    b.b(obj);
                    orderForAnotherRouterImpl$showOrderForAnother$1.L$0 = zv70Var;
                    orderForAnotherRouterImpl$showOrderForAnother$1.label = 1;
                    obj = aVar.e(orderForAnotherRouterImpl$showOrderForAnother$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zv70Var = (zv70) orderForAnotherRouterImpl$showOrderForAnother$1.L$0;
                    b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                aVar.g = false;
                if (this.j.b.isEnabled()) {
                    oep0.b(this.i, (m950) this.h.get());
                } else {
                    at20 at20Var = new at20(this, zv70Var);
                    mj31 mj31Var = this.e.a.a;
                    this.d.a().k(new WhoRideSelectorModalView((Context) ((xvf0) mj31Var.b).get(), (pav) ((xvf0) mj31Var.c).get(), (wz41) ((qd21) mj31Var.w).get(), at20Var), 2.0f, true);
                }
                return Boolean.TRUE;
            }
        }
        orderForAnotherRouterImpl$showOrderForAnother$1 = new OrderForAnotherRouterImpl$showOrderForAnother$1(this, continuationImpl);
        obj = orderForAnotherRouterImpl$showOrderForAnother$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderForAnotherRouterImpl$showOrderForAnother$1.label;
        ru.yandex.taxi.orderforanother.repository.a aVar2 = this.f;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        this.a.a(new tfb0(((avj0) this.b).h(kyh0.order_for_other_toolbar), EmptyList.a, null, bgq0.f, false, null, null, 262096), new fl10(this), new bu6(2, runnable2, runnable), this.c);
    }
}
