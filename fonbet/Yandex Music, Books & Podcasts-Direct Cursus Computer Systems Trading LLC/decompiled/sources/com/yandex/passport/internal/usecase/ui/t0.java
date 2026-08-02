package com.yandex.passport.internal.usecase.ui;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class t0 extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.usecase.e0 b;
    public final com.yandex.passport.common.ui.lang.b c;
    public final com.yandex.passport.internal.core.tokens.b d;
    public final w0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.core.tokens.b bVar2, w0 w0Var) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        e0Var.getClass();
        bVar.getClass();
        bVar2.getClass();
        w0Var.getClass();
        this.b = e0Var;
        this.c = bVar;
        this.d = bVar2;
        this.e = w0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(7:11|12|13|14|(2:16|(1:18))|19|20)(2:23|24))(4:25|26|27|28))(4:40|(1:42)|43|(2:45|32)(1:46))|29|30))|51|6|7|(0)(0)|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ed, code lost:
    
        if (r0 != r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0036, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(u0 u0Var, Continuation continuation) {
        s0 s0Var;
        int i;
        Object t7oVar;
        Locale b;
        int i2;
        int i3;
        com.yandex.passport.common.core.f fVar;
        com.yandex.passport.internal.usecase.e0 e0Var;
        int i4;
        u0 u0Var2 = u0Var;
        try {
            if (continuation instanceof s0) {
                s0Var = (s0) continuation;
                int i5 = s0Var.s;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    s0Var.s = i5 - Integer.MIN_VALUE;
                    Object obj = s0Var.q;
                    nm6 nm6Var = nm6.a;
                    i = s0Var.s;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "selectedUid " + u0Var2.a + " environment " + u0Var2.a.a, 8);
                        }
                        r7o r7oVar = z7o.b;
                        com.yandex.passport.internal.usecase.e0 e0Var2 = this.b;
                        com.yandex.passport.common.core.f fVar2 = u0Var2.a;
                        b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                        w0 w0Var = this.e;
                        s0Var.j = u0Var2;
                        s0Var.k = b;
                        s0Var.l = fVar2;
                        s0Var.m = e0Var2;
                        i2 = 0;
                        s0Var.n = 0;
                        s0Var.o = 0;
                        s0Var.p = 0;
                        s0Var.s = 1;
                        obj = w0Var.g(u0Var2, s0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        i3 = 0;
                        fVar = fVar2;
                        e0Var = e0Var2;
                        i4 = 0;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            u0Var2 = s0Var.j;
                            qgg.h0(obj);
                            Object obj2 = ((z7o) obj).a;
                            qgg.h0(obj2);
                            t7oVar = new com.yandex.passport.common.url.b(((com.yandex.passport.common.url.b) obj2).a);
                            if (z7o.a(t7oVar) != null) {
                                com.yandex.passport.common.core.f fVar3 = u0Var2.a;
                                com.yandex.passport.internal.core.tokens.b bVar = this.d;
                                bVar.getClass();
                                fVar3.getClass();
                                com.yandex.passport.internal.l e = bVar.b.a().e(fVar3);
                                if (e != null) {
                                    bVar.c.a(e);
                                }
                            }
                            return new z7o(t7oVar);
                        }
                        int i6 = s0Var.p;
                        int i7 = s0Var.o;
                        int i8 = s0Var.n;
                        com.yandex.passport.internal.usecase.e0 e0Var3 = s0Var.m;
                        com.yandex.passport.common.core.f fVar4 = s0Var.l;
                        b = s0Var.k;
                        u0 u0Var3 = s0Var.j;
                        try {
                            qgg.h0(obj);
                            i2 = i6;
                            u0Var2 = u0Var3;
                            fVar = fVar4;
                            e0Var = e0Var3;
                            i4 = i8;
                            i3 = i7;
                        } catch (wis e2) {
                            e = e2;
                            u0Var2 = u0Var3;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            if (z7o.a(t7oVar) != null) {
                            }
                            return new z7o(t7oVar);
                        } catch (Throwable th) {
                            th = th;
                            u0Var2 = u0Var3;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            if (z7o.a(t7oVar) != null) {
                            }
                            return new z7o(t7oVar);
                        }
                    }
                    Locale locale = b;
                    Object obj3 = ((z7o) obj).a;
                    qgg.h0(obj3);
                    com.yandex.passport.internal.usecase.c0 c0Var = new com.yandex.passport.internal.usecase.c0(fVar, locale, ((com.yandex.passport.common.url.b) obj3).a, (String) null, (Map) null, (com.yandex.passport.common.core.c) null, 120);
                    s0Var.j = u0Var2;
                    s0Var.k = null;
                    s0Var.l = null;
                    s0Var.m = null;
                    s0Var.n = i4;
                    s0Var.o = i3;
                    s0Var.p = i2;
                    s0Var.s = 2;
                    obj = e0Var.g(c0Var, s0Var);
                }
            }
            if (i != 0) {
            }
            Locale locale2 = b;
            Object obj32 = ((z7o) obj).a;
            qgg.h0(obj32);
            com.yandex.passport.internal.usecase.c0 c0Var2 = new com.yandex.passport.internal.usecase.c0(fVar, locale2, ((com.yandex.passport.common.url.b) obj32).a, (String) null, (Map) null, (com.yandex.passport.common.core.c) null, 120);
            s0Var.j = u0Var2;
            s0Var.k = null;
            s0Var.l = null;
            s0Var.m = null;
            s0Var.n = i4;
            s0Var.o = i3;
            s0Var.p = i2;
            s0Var.s = 2;
            obj = e0Var.g(c0Var2, s0Var);
        } catch (CancellationException e3) {
            throw e3;
        }
        s0Var = new s0(this, (cg6) continuation);
        Object obj4 = s0Var.q;
        nm6 nm6Var2 = nm6.a;
        i = s0Var.s;
    }
}
