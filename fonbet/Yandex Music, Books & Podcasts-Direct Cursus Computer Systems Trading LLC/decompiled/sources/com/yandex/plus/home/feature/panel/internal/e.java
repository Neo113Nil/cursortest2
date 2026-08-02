package com.yandex.plus.home.feature.panel.internal;

import com.yandex.plus.home.graphql.panel.g;
import defpackage.aur;
import defpackage.bqi;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.saf;
import defpackage.ub7;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.ydr;
import defpackage.zsd;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
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
            case 1:
                return new e(this.l, continuation, 1);
            default:
                return new e(this.l, continuation, 2);
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
                    f fVar = this.l;
                    pjc c = fVar.c.c();
                    d dVar = new d(fVar, 0);
                    this.k = 1;
                    if (c.collect(dVar, this) == nm6Var) {
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
                    f fVar2 = this.l;
                    pjc d = fVar2.d.d();
                    d dVar2 = new d(fVar2, 1);
                    this.k = 1;
                    if (d.collect(dVar2, this) == nm6Var2) {
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
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    f fVar3 = this.l;
                    g gVar = fVar3.b;
                    String str = fVar3.e;
                    LinkedHashMap linkedHashMap = gVar.k;
                    LinkedHashMap linkedHashMap2 = gVar.j;
                    xqn xqnVar = new xqn();
                    xqn xqnVar2 = new xqn();
                    ReentrantLock reentrantLock = gVar.l;
                    reentrantLock.lock();
                    try {
                        Object obj2 = (bqi) linkedHashMap2.get(str);
                        Continuation continuation = null;
                        if (obj2 == null) {
                            obj2 = ydr.a(null);
                            linkedHashMap2.put(str, obj2);
                        }
                        xqnVar.a = obj2;
                        Object obj3 = (r2f) linkedHashMap.get(str);
                        if (obj3 == null) {
                            obj3 = saf.p();
                            linkedHashMap.put(str, obj3);
                        }
                        xqnVar2.a = obj3;
                        reentrantLock.unlock();
                        ub7 ub7Var = new ub7(12, zsd.b0(new com.yandex.plus.home.graphql.panel.f((pjc) xqnVar.a, xqnVar, gVar, xqnVar2, str)), new com.yandex.plus.experiments.impl.cache.b(gVar, str, continuation, 9));
                        ((com.yandex.plus.core.dispatcher.a) gVar.f).getClass();
                        pjc k0 = zsd.k0(ub7Var, com.yandex.plus.core.dispatcher.a.e);
                        com.yandex.plus.bdui.ui.b bVar = new com.yandex.plus.bdui.ui.b(fVar3, continuation, 14);
                        this.k = 1;
                        if (zsd.O(k0, bVar, this) == nm6Var3) {
                            return nm6Var3;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
