package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.aur;
import defpackage.d4t;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t58;
import defpackage.x0q;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ k1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(k1 k1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = k1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new f1(this.l, continuation, 0);
            case 1:
                return new f1(this.l, continuation, 1);
            case 2:
                return new f1(this.l, continuation, 2);
            case 3:
                return new f1(this.l, continuation, 3);
            case 4:
                return new f1(this.l, continuation, 4);
            default:
                return new f1(this.l, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((f1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.d1 d1Var = this.l.r;
                    if (d1Var == null) {
                        Intrinsics.j("slothSession");
                        throw null;
                    }
                    CoroutineContext context = getContext();
                    this.k = 1;
                    if (d1Var.b(context, this) == nm6Var) {
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
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    k1 k1Var = this.l;
                    x0q x0qVar = k1Var.z;
                    com.yandex.passport.sloth.d1 d1Var2 = k1Var.r;
                    if (d1Var2 == null) {
                        Intrinsics.j("slothSession");
                        throw null;
                    }
                    com.yandex.passport.sloth.ui.t0 t0Var = new com.yandex.passport.sloth.ui.t0(d1Var2.j);
                    this.k = 1;
                    if (x0qVar.emit(t0Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k1 k1Var2 = this.l;
                com.yandex.passport.sloth.d1 d1Var3 = k1Var2.r;
                if (d1Var3 == null) {
                    Intrinsics.j("slothSession");
                    throw null;
                }
                x0q x0qVar2 = d1Var3.c.d;
                d4t d4tVar = new d4t(2, 9, null);
                x0q x0qVar3 = k1Var2.t;
                this.k = 1;
                x0qVar2.collect(new t58(12, x0qVar3, d4tVar), this);
                return nm6Var3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k1 k1Var3 = this.l;
                com.yandex.passport.sloth.d1 d1Var4 = k1Var3.r;
                if (d1Var4 == null) {
                    Intrinsics.j("slothSession");
                    throw null;
                }
                x0q x0qVar4 = d1Var4.c.e;
                d4t d4tVar2 = new d4t(2, 10, null);
                x0q x0qVar5 = k1Var3.v;
                this.k = 1;
                x0qVar4.collect(new t58(12, x0qVar5, d4tVar2), this);
                return nm6Var4;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k1 k1Var4 = this.l;
                com.yandex.passport.sloth.d1 d1Var5 = k1Var4.r;
                if (d1Var5 == null) {
                    Intrinsics.j("slothSession");
                    throw null;
                }
                x0q b = d1Var5.j.b();
                com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(11, k1Var4);
                this.k = 1;
                b.collect(aVar, this);
                return nm6Var5;
            default:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k1 k1Var5 = this.l;
                x0q x0qVar6 = k1Var5.n.a;
                d4t d4tVar3 = new d4t(2, 11, null);
                x0q x0qVar7 = k1Var5.x;
                this.k = 1;
                x0qVar6.collect(new t58(12, x0qVar7, d4tVar3), this);
                return nm6Var6;
        }
    }
}
