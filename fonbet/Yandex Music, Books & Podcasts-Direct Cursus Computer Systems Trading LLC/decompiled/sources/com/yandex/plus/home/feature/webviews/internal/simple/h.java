package com.yandex.plus.home.feature.webviews.internal.simple;

import defpackage.aur;
import defpackage.ci0;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ j l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = jVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h(this.l, continuation, 0);
            case 1:
                return new h(this.l, continuation, 1);
            default:
                return new h(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                j jVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    String uri = jVar.g.a.toString();
                    uri.getClass();
                    this.k = 1;
                    if (j.h0(jVar, uri, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                jVar.r.f(jVar.h);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                j jVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ci0 ci0Var = jVar2.i;
                    this.k = 1;
                    if (ci0Var.e(this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                jVar2.j0();
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    j jVar3 = this.l;
                    String uri2 = jVar3.g.a.toString();
                    uri2.getClass();
                    this.k = 1;
                    if (j.h0(jVar3, uri2, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
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
