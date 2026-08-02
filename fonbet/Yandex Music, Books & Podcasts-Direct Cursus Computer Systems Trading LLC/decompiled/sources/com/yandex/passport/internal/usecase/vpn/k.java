package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.internal.flags.o;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class k {
    public final e a;
    public final com.yandex.passport.internal.common.k b;
    public final com.yandex.passport.internal.flags.i c;

    public k(e eVar, com.yandex.passport.internal.common.k kVar, com.yandex.passport.internal.flags.i iVar) {
        eVar.getClass();
        kVar.getClass();
        iVar.getClass();
        this.a = eVar;
        this.b = kVar;
        this.c = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r7.a.c(r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        if (r7.b.c(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, cg6 cg6Var) {
        j jVar;
        int i;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jVar.j;
                nm6 nm6Var = nm6.a;
                i = jVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "App in background", 8);
                        }
                        if (((Boolean) this.c.b(o.D0)).booleanValue()) {
                            jVar.l = 2;
                        }
                    } else {
                        jVar.l = 1;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "App in foreground", 8);
                }
                return Unit.a;
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }
}
