package com.yandex.plus.home.api.prefetch;

import defpackage.aur;
import defpackage.kac;
import defpackage.nm6;
import defpackage.o3o;
import defpackage.qgg;
import defpackage.t7g;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class i extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ l l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(l lVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = lVar;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new i(this.l, this.m, continuation, 0);
            default:
                return new i(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    PrefetchApi prefetchApi = this.l.a;
                    this.k = 1;
                    obj = prefetchApi.b(this.m, this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                o3o o3oVar = (o3o) ((Response) obj).b;
                if (o3oVar != null) {
                    return t7g.E(o3oVar.b());
                }
                kac.f("Received unsuccessful response for prefetch.txt");
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object c = this.l.c(this.m, this);
                    return c == nm6Var2 ? nm6Var2 : c;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
