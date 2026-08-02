package com.yandex.passport.internal.provider.communication;

import android.os.Bundle;
import android.os.Message;
import com.yandex.passport.api.v2;
import com.yandex.passport.internal.entities.a0;
import defpackage.cg6;
import defpackage.cxb;
import defpackage.j5;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.tyf;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z01;
import defpackage.z7o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class p {
    public final v a;
    public final q b;

    public p(v vVar, q qVar) {
        vVar.getClass();
        qVar.getClass();
        this.a = vVar;
        this.b = qVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:14|15))(2:16|17))(6:38|39|(3:50|(3:53|(3:55|56|(2:58|35)(1:59))(1:60)|51)|61)(1:43)|44|45|(1:49)(2:47|48))|18|(1:20)(10:21|(1:23)|24|(1:26)|27|(1:29)(1:37)|30|(1:32)|33|(1:35)(1:36))))|64|6|7|(0)(0)|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0027, B:17:0x0036, B:18:0x0095, B:21:0x009a, B:23:0x00a4, B:24:0x00ab, B:27:0x00b0, B:29:0x00b4, B:30:0x00b8, B:32:0x00c0, B:33:0x00d8, B:39:0x003d, B:41:0x0049, B:50:0x0054, B:51:0x0058, B:53:0x005e, B:56:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v2 v2Var, cg6 cg6Var) {
        n nVar;
        int i;
        int i2;
        Bundle bundle;
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i3 = nVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.m = i3 - Integer.MIN_VALUE;
                Object obj = nVar.k;
                nm6 nm6Var = nm6.a;
                i = nVar.m;
                int i4 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    List list = this.b.a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((v2) it.next()) == v2Var) {
                                v vVar = this.a;
                                Message obtain = Message.obtain(null, 100, cxb.K(new Pair("IPCCommand", new k(v2Var))));
                                obtain.getClass();
                                nVar.j = 0;
                                nVar.m = 1;
                                vVar.getClass();
                                obj = j5.u(vVar, obtain, nVar);
                                if (obj != nm6Var) {
                                    i2 = 0;
                                }
                            }
                        }
                    }
                    t7o t7oVar = null;
                    r7o r7oVar2 = z7o.b;
                    if (t7oVar != null) {
                        return null;
                    }
                    return t7oVar;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = nVar.j;
                qgg.h0(obj);
                bundle = (Bundle) obj;
                if (bundle != null) {
                    return null;
                }
                Object b = d.b(bundle);
                r7o r7oVar3 = z7o.b;
                if (!(b instanceof t7o)) {
                    Object obj2 = (i) b;
                    obj2.getClass();
                    b = (h) obj2;
                }
                if (b instanceof t7o) {
                    b = null;
                }
                h hVar = (h) b;
                String str = hVar != null ? hVar.a : null;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "start getPushToken token: " + str, 8);
                }
                msa msaVar = nsa.b;
                long M = yd5.M(5, ssa.SECONDS);
                z01 z01Var = new z01(str, continuation, i4);
                nVar.j = i2;
                nVar.m = 2;
                Object M2 = tyf.M(M, z01Var, nVar);
                return M2 == nm6Var ? nm6Var : M2;
            }
        }
        nVar = new n(this, cg6Var);
        Object obj3 = nVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nVar.m;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        bundle = (Bundle) obj3;
        if (bundle != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        r7 = defpackage.z7o.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a0 a0Var, cg6 cg6Var) {
        o oVar;
        int i;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i2 = oVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.l = i2 - Integer.MIN_VALUE;
                Object obj = oVar.j;
                nm6 nm6Var = nm6.a;
                i = oVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    v vVar = this.a;
                    Message obtain = Message.obtain(null, 100, cxb.K(new Pair("IPCCommand", new l(a0Var))));
                    obtain.getClass();
                    oVar.l = 1;
                    vVar.getClass();
                    obj = j5.u(vVar, obtain, oVar);
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
                r7o r7oVar2 = z7o.b;
                return Unit.a;
            }
        }
        oVar = new o(this, cg6Var);
        Object obj2 = oVar.j;
        nm6 nm6Var2 = nm6.a;
        i = oVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        return Unit.a;
    }
}
