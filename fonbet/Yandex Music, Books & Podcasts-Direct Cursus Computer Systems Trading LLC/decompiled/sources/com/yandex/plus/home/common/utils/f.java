package com.yandex.plus.home.common.utils;

import defpackage.aub;
import defpackage.aur;
import defpackage.gm5;
import defpackage.h3f;
import defpackage.hj4;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.o6c;
import defpackage.qa8;
import defpackage.qgg;
import defpackage.xq0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class f implements mu7 {
    public final /* synthetic */ gm5 a;
    public final /* synthetic */ gm5 b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ aur d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(gm5 gm5Var, AtomicBoolean atomicBoolean, Function1 function1) {
        this.b = gm5Var;
        this.c = atomicBoolean;
        this.d = (aur) function1;
        this.a = gm5Var;
    }

    @Override // defpackage.r2f
    public final CancellationException D() {
        return this.a.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v4, types: [aur, kotlin.jvm.functions.Function1] */
    @Override // defpackage.mu7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(Continuation continuation) {
        e eVar;
        nm6 nm6Var;
        int i;
        gm5 gm5Var;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                Object obj = eVar.k;
                nm6Var = nm6.a;
                i = eVar.m;
                gm5 gm5Var2 = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!this.c.getAndSet(true)) {
                        eVar.j = gm5Var2;
                        eVar.m = 1;
                        obj = this.d.invoke(eVar);
                        if (obj != nm6Var) {
                            gm5Var = gm5Var2;
                        }
                    }
                    eVar.j = null;
                    eVar.m = 2;
                    Object s = gm5Var2.s(eVar);
                    return s == nm6Var ? nm6Var : s;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gm5Var = eVar.j;
                qgg.h0(obj);
                gm5Var.U(obj);
                eVar.j = null;
                eVar.m = 2;
                Object s2 = gm5Var2.s(eVar);
                if (s2 == nm6Var) {
                }
            }
        }
        eVar = new e(this, continuation);
        Object obj2 = eVar.k;
        nm6Var = nm6.a;
        i = eVar.m;
        gm5 gm5Var22 = this.b;
        if (i != 0) {
        }
        gm5Var.U(obj2);
        eVar.j = null;
        eVar.m = 2;
        Object s22 = gm5Var22.s(eVar);
        if (s22 == nm6Var) {
        }
    }

    @Override // defpackage.r2f
    public final qa8 R(Function1 function1) {
        return this.a.R(function1);
    }

    @Override // defpackage.r2f
    public final boolean X() {
        return this.a.X();
    }

    @Override // defpackage.r2f
    public final qa8 Y(boolean z, boolean z2, aub aubVar) {
        return this.a.Y(z, z2, aubVar);
    }

    @Override // defpackage.r2f
    public final Sequence a() {
        return this.a.a();
    }

    @Override // defpackage.r2f
    public final boolean b() {
        return this.a.b();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this.a);
    }

    @Override // defpackage.r2f
    public final void g(CancellationException cancellationException) {
        this.a.g(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        fVar.getClass();
        return kotlin.coroutines.e.a(this.a, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return o6c.l;
    }

    @Override // defpackage.r2f
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.r2f
    public final Object j0(Continuation continuation) {
        return this.a.j0(continuation);
    }

    @Override // defpackage.r2f
    public final hj4 l0(h3f h3fVar) {
        return this.a.l0(h3fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        fVar.getClass();
        return kotlin.coroutines.e.b(this.a, fVar);
    }

    @Override // defpackage.mu7
    public final Object o() {
        return this.a.C();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return kotlin.coroutines.e.c(this.a, coroutineContext);
    }

    @Override // defpackage.r2f
    public final boolean start() {
        return this.a.start();
    }

    @Override // defpackage.mu7
    public final Throwable z() {
        return this.a.z();
    }
}
