package com.yandex.passport.internal.autologin.ui;

import com.yandex.passport.api.z1;
import com.yandex.passport.internal.impl.x;
import defpackage.aur;
import defpackage.bw1;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ z7o l;
    public final /* synthetic */ bw1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(z7o z7oVar, bw1 bw1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z7oVar;
        this.m = bw1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p(this.l, this.m, continuation, 0);
            default:
                return new p(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object t7oVar2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                bw1 bw1Var = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    Object obj2 = this.l.a;
                    Throwable a = z7o.a(obj2);
                    if (a == null) {
                        x xVar = (x) bw1Var.f;
                        z1 z1Var = ((com.yandex.passport.internal.entities.m) obj2).a;
                        this.k = 1;
                        t7oVar = xVar.m(z1Var, this);
                        if (t7oVar == nm6Var) {
                        }
                    } else {
                        t7oVar = new t7o(a);
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    t7oVar = ((z7o) obj).a;
                }
                bw1.c(bw1Var, t7oVar);
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                bw1 bw1Var2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    Object obj3 = this.l.a;
                    Throwable a2 = z7o.a(obj3);
                    if (a2 == null) {
                        x xVar2 = (x) bw1Var2.f;
                        this.k = 1;
                        t7oVar2 = xVar2.m((z1) obj3, this);
                        if (t7oVar2 == nm6Var2) {
                        }
                    } else {
                        t7oVar2 = new t7o(a2);
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    t7oVar2 = ((z7o) obj).a;
                }
                bw1.c(bw1Var2, t7oVar2);
                break;
        }
        return Unit.a;
    }
}
