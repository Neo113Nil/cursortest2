package com.yandex.plus.home.feature.webviews.internal.treasury;

import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.b6;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.i1;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.eta;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.q5f;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.rar;
import defpackage.rqi;
import defpackage.x97;
import defpackage.xq0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class e {
    public final com.yandex.plus.core.location.a a;
    public final kotlinx.coroutines.a b;
    public com.yandex.plus.treasury.api.c c;
    public rar d;
    public final qqi e;
    public final ReentrantLock f;

    public e(com.yandex.plus.home.ybsdk.a aVar, com.yandex.plus.core.location.a aVar2, kotlinx.coroutines.a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = aVar2;
        this.b = aVar3;
        this.e = rqi.a();
        this.f = new ReentrantLock();
    }

    public static final Object a(e eVar, cg6 cg6Var) {
        eVar.a.getClass();
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        String q5fVar = new q5f(e5bVar).toString();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.g;
        String concat = "requestShortcut(): json=".concat(q5fVar);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, concat, null);
        throw null;
    }

    public final void b(mm6 mm6Var, Function1 function1) {
        mm6Var.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.g;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, "ensureSubscribeOnTreasuryInMessages()", null);
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            rar rarVar = this.d;
            if (rarVar == null || !rarVar.b()) {
                this.d = x97.y(mm6Var, null, null, new com.yandex.plus.bdui.ui.b(this, function1, (Continuation) null), 3);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r11 == r2) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:19:0x0081, B:21:0x0085, B:24:0x00a2), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002c, B:19:0x0081, B:21:0x0085, B:24:0x00a2), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(b6 b6Var, cg6 cg6Var) {
        c cVar;
        int i;
        String str;
        oqi oqiVar;
        int i2;
        com.yandex.plus.treasury.api.c cVar2;
        try {
            if (cg6Var instanceof c) {
                cVar = (c) cg6Var;
                int i3 = cVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    cVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = cVar.m;
                    nm6 nm6Var = nm6.a;
                    i = cVar.o;
                    int i4 = 0;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.g, "requestTreasuryState(outMessage=" + b6Var + ')', null);
                        String str2 = b6Var.a;
                        if (str2 == null) {
                            str2 = eta.e();
                        }
                        cVar.j = str2;
                        qqi qqiVar = this.e;
                        cVar.k = qqiVar;
                        cVar.l = 0;
                        cVar.o = 1;
                        if (qqiVar.a(cVar) != nm6Var) {
                            str = str2;
                            oqiVar = qqiVar;
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = cVar.k;
                        qgg.h0(obj);
                        oqiVar.b(null);
                        return obj;
                    }
                    int i5 = cVar.l;
                    oqi oqiVar2 = cVar.k;
                    str = cVar.j;
                    qgg.h0(obj);
                    i2 = i5;
                    oqiVar = oqiVar2;
                    cVar2 = this.c;
                    if (cVar2 == null) {
                        i1 l = a1.l(cVar2, str);
                        jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.g, "requestTreasuryState() get cached inMessage=" + l, null);
                        oqiVar.b(null);
                        return l;
                    }
                    kotlinx.coroutines.a aVar = this.b;
                    d dVar = new d(this, str, continuation, i4);
                    cVar.j = null;
                    cVar.k = oqiVar;
                    cVar.l = i2;
                    cVar.o = 2;
                    obj = x97.V(aVar, dVar, cVar);
                }
            }
            if (i != 0) {
            }
            cVar2 = this.c;
            if (cVar2 == null) {
            }
        } catch (Throwable th) {
            b6Var.b(null);
            throw th;
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.m;
        nm6 nm6Var2 = nm6.a;
        i = cVar.o;
        int i42 = 0;
        Continuation continuation2 = null;
    }
}
