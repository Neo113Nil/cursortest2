package com.yandex.passport.internal.report.diary;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class t0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ w0 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ com.yandex.passport.internal.database.diary.f o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(w0 w0Var, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = w0Var;
        this.m = j;
        this.n = j2;
        this.o = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new t0(this.l, this.m, this.n, this.o, continuation, 0);
            default:
                return new t0(this.l, this.m, this.n, this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((t0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                    Object u = w0.u(this.l, this.m, this.n, this.o, this);
                    return u == nm6Var ? nm6Var : u;
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
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object v = w0.v(this.l, this.m, this.n, this.o, this);
                    return v == nm6Var2 ? nm6Var2 : v;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                } else {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    obj = null;
                }
                return obj;
        }
    }
}
