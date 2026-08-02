package com.yandex.passport.internal.report.diary;

import defpackage.cg6;
import defpackage.j9w;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.uob;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e0 {
    public final com.yandex.passport.common.coroutine.a a;
    public final com.yandex.passport.internal.database.diary.c b;
    public final n0 c;

    public e0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.database.diary.c cVar, n0 n0Var) {
        aVar.getClass();
        cVar.getClass();
        n0Var.getClass();
        this.a = aVar;
        this.b = cVar;
        this.c = n0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|12|(3:14|(1:16)|17)|18))|34|6|7|(0)(0)|11|12|(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.internal.database.diary.a aVar, cg6 cg6Var) {
        c0 c0Var;
        int i;
        Throwable a;
        if (cg6Var instanceof c0) {
            c0Var = (c0) cg6Var;
            int i2 = c0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = c0Var.j;
                nm6 nm6Var = nm6.a;
                i = c0Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    uob uobVar = ((com.yandex.passport.common.coroutine.b) this.a).f;
                    j9w j9wVar = new j9w(this, aVar, continuation, 25);
                    c0Var.l = 1;
                    if (x97.V(uobVar, j9wVar, c0Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a != null) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Internal error catching to calling DiaryRecordDao::insertMethod", a);
                    }
                    this.c.u(a, x0.INSERT_METHOD);
                }
                return obj2;
            }
        }
        c0Var = new c0(this, cg6Var);
        Object obj3 = c0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = c0Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a != null) {
        }
        return obj22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|12|(3:14|(1:16)|17)|18))|34|6|7|(0)(0)|11|12|(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.internal.database.diary.b bVar, cg6 cg6Var) {
        d0 d0Var;
        int i;
        Throwable a;
        if (cg6Var instanceof d0) {
            d0Var = (d0) cg6Var;
            int i2 = d0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = d0Var.j;
                nm6 nm6Var = nm6.a;
                i = d0Var.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    uob uobVar = ((com.yandex.passport.common.coroutine.b) this.a).f;
                    j9w j9wVar = new j9w(this, bVar, continuation, 26);
                    d0Var.l = 1;
                    if (x97.V(uobVar, j9wVar, d0Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj2);
                if (a != null) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Internal error catching to calling DiaryRecordDao::insertParameter", a);
                    }
                    this.c.u(a, x0.INSERT_PARAMETER);
                }
                return obj2;
            }
        }
        d0Var = new d0(this, cg6Var);
        Object obj3 = d0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = d0Var.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Object obj22 = Unit.a;
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj22);
        if (a != null) {
        }
        return obj22;
    }
}
