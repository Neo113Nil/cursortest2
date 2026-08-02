package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.internal.config.n;
import com.yandex.passport.internal.entities.a0;
import com.yandex.passport.internal.entities.x;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.report.fd;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.k1;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import defpackage.cg6;
import defpackage.dkn;
import defpackage.fkn;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t7o;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ydr;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {
    public final com.yandex.passport.common.coroutine.a a;
    public final com.yandex.passport.common.coroutine.e b;
    public final i c;
    public final com.yandex.passport.internal.common.k d;
    public final n e;
    public final com.yandex.passport.internal.flags.i f;
    public final com.yandex.passport.internal.account.b g;
    public final com.yandex.passport.internal.sloth.e h;
    public final y i;
    public final k1 j;
    public final xdr k;
    public final fkn l;
    public final x0q m;
    public final dkn n;
    public volatile boolean o;
    public volatile com.yandex.passport.internal.sloth.b p;
    public final qqi q;
    public final qqi r;

    public e(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.coroutine.e eVar, i iVar, com.yandex.passport.internal.common.k kVar, n nVar, com.yandex.passport.internal.flags.i iVar2, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.sloth.e eVar2, y yVar, k1 k1Var) {
        aVar.getClass();
        eVar.getClass();
        iVar.getClass();
        kVar.getClass();
        nVar.getClass();
        iVar2.getClass();
        bVar.getClass();
        eVar2.getClass();
        yVar.getClass();
        k1Var.getClass();
        this.a = aVar;
        this.b = eVar;
        this.c = iVar;
        this.d = kVar;
        this.e = nVar;
        this.f = iVar2;
        this.g = bVar;
        this.h = eVar2;
        this.i = yVar;
        this.j = k1Var;
        xdr a = ydr.a(x.a);
        this.k = a;
        this.l = new fkn(a);
        x0q b = y0q.b(0, 0, null, 7);
        this.m = b;
        this.n = new dkn(b);
        this.q = rqi.a();
        this.r = rqi.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (r11.d("data_changed", r0) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        if (r2.a(r0) != r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
    
        if (r12 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.passport.internal.sloth.b bVar;
        qqi qqiVar;
        boolean z;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.n = i2 - Integer.MIN_VALUE;
                Object obj = cVar.l;
                Object obj2 = nm6.a;
                i = cVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "publishActualStatusIfConnectionChanged", 8);
                    }
                    com.yandex.passport.internal.sloth.e eVar2 = eVar.h;
                    cVar.n = 1;
                    obj = eVar2.a();
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qqiVar = cVar.k;
                    bVar = cVar.j;
                    qgg.h0(obj);
                    try {
                        com.yandex.passport.internal.sloth.b bVar2 = eVar.p;
                        eVar.p = bVar;
                        int i3 = bVar.a;
                        com.yandex.passport.internal.sloth.c[] cVarArr = com.yandex.passport.internal.sloth.c.a;
                        if (i3 != 2) {
                            if (Intrinsics.d(bVar2, bVar)) {
                                z = false;
                                if (z) {
                                    k1 k1Var = eVar.j;
                                    String bVar3 = bVar.toString();
                                    k1Var.getClass();
                                    k1Var.q(jd.d, new com.yandex.passport.internal.report.c("network_state", bVar3));
                                    return Unit.a;
                                }
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "start publishActualStatus", 8);
                                }
                                cVar.j = null;
                                cVar.k = null;
                                cVar.n = 3;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } finally {
                        qqiVar.b(null);
                    }
                }
                bVar = (com.yandex.passport.internal.sloth.b) obj;
                qqiVar = eVar.r;
                cVar.j = bVar;
                cVar.k = qqiVar;
                cVar.n = 2;
            }
        }
        cVar = new c(eVar, cg6Var);
        Object obj3 = cVar.l;
        Object obj22 = nm6.a;
        i = cVar.n;
        if (i != 0) {
        }
        bVar = (com.yandex.passport.internal.sloth.b) obj3;
        qqiVar = eVar.r;
        cVar.j = bVar;
        cVar.k = qqiVar;
        cVar.n = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(6:11|12|13|(2:15|(1:17))|18|19)(2:22|23))(1:24))(1:32)|25|(2:27|28)(1:29)))|36|6|7|(0)(0)|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r8 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
    
        if (r8 == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        r8 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050 A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #0 {all -> 0x002d, blocks: (B:11:0x0029, B:12:0x0062, B:29:0x0050), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, cg6 cg6Var) {
        d dVar;
        Object obj;
        int i;
        com.yandex.passport.internal.common.k kVar = eVar.d;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dVar.l = 1;
                    obj = kVar.a(dVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object t7oVar = (Boolean) obj;
                        t7oVar.getClass();
                        r7o r7oVar = z7o.b;
                        Throwable a = z7o.a(t7oVar);
                        if (a != null) {
                            com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Failed to register vpn network callback", a);
                            }
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                r7o r7oVar2 = z7o.b;
                h0 h0Var = new h0(17, eVar);
                dVar.l = 2;
                obj = kVar.b(h0Var, dVar);
            }
        }
        dVar = new d(eVar, cg6Var);
        obj = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final Object c(cg6 cg6Var) {
        Object V = x97.V(((com.yandex.passport.common.coroutine.b) this.a).c, new we(this, (Continuation) null, 14), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|(1:(3:(1:(5:11|12|13|14|15)(2:21|22))(12:23|24|25|26|27|(1:29)|30|(1:32)|33|(1:35)|36|(3:38|39|40)(3:41|(3:44|14|15)|43))|19|20)(1:48))(3:56|(1:58)|43)|49|50|(2:52|43)(9:53|27|(0)|30|(0)|33|(0)|36|(0)(0))))|59|6|(0)(0)|49|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9 A[Catch: all -> 0x00ac, TryCatch #1 {all -> 0x00ac, blocks: (B:27:0x009c, B:30:0x00a5, B:32:0x00a9, B:33:0x00af, B:35:0x00b7, B:36:0x00ca, B:38:0x00f2, B:41:0x00fa, B:50:0x007e), top: B:49:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7 A[Catch: all -> 0x00ac, TryCatch #1 {all -> 0x00ac, blocks: (B:27:0x009c, B:30:0x00a5, B:32:0x00a9, B:33:0x00af, B:35:0x00b7, B:36:0x00ca, B:38:0x00f2, B:41:0x00fa, B:50:0x007e), top: B:49:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #1 {all -> 0x00ac, blocks: (B:27:0x009c, B:30:0x00a5, B:32:0x00a9, B:33:0x00af, B:35:0x00b7, B:36:0x00ca, B:38:0x00f2, B:41:0x00fa, B:50:0x007e), top: B:49:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa A[Catch: all -> 0x00ac, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ac, blocks: (B:27:0x009c, B:30:0x00a5, B:32:0x00a9, B:33:0x00af, B:35:0x00b7, B:36:0x00ca, B:38:0x00f2, B:41:0x00fa, B:50:0x007e), top: B:49:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r12v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r12v5, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Continuation continuation) {
        b bVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        String str2;
        int i2;
        oqi oqiVar;
        Object g;
        int i3;
        int i4;
        Object obj;
        a0 a0Var;
        a0 a0Var2;
        xdr xdrVar = this.k;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i5 = bVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.q = i5 - Integer.MIN_VALUE;
                Object obj2 = bVar.o;
                nm6Var = nm6.a;
                i = bVar.q;
                if (i != 0) {
                    qgg.h0(obj2);
                    bVar.j = str;
                    qqiVar = this.q;
                    bVar.k = qqiVar;
                    bVar.m = 0;
                    bVar.q = 1;
                    if (qqiVar.a(bVar) != nm6Var) {
                        str2 = str;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        int i6 = bVar.n;
                        int i7 = bVar.m;
                        ?? r12 = bVar.k;
                        try {
                            qgg.h0(obj2);
                            i4 = i6;
                            qqiVar = r12;
                            i3 = i7;
                            obj = ((z7o) obj2).a;
                            if (obj instanceof t7o) {
                                obj = null;
                            }
                            a0Var = (a0) obj;
                            if (a0Var == null) {
                                a0Var = x.a;
                            }
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getAntirobotAnswerUseCase: " + a0Var, 8);
                            }
                            k1 k1Var = this.j;
                            String obj3 = a0Var.toString();
                            k1Var.getClass();
                            obj3.getClass();
                            k1Var.q(fd.d, new com.yandex.passport.internal.report.c("vpn_status", obj3));
                            if (!Intrinsics.d(xdrVar.getValue(), a0Var)) {
                                Object value = xdrVar.getValue();
                                qqiVar.b(null);
                                return value;
                            }
                            bVar.j = null;
                            bVar.k = qqiVar;
                            bVar.l = a0Var;
                            bVar.m = i3;
                            bVar.n = i4;
                            bVar.q = 3;
                            xdrVar.getClass();
                            xdrVar.m(null, a0Var);
                            if (Unit.a != nm6Var) {
                                a0Var2 = a0Var;
                                oqiVar = qqiVar;
                                oqiVar.b(null);
                                return a0Var2;
                            }
                            return nm6Var;
                        } catch (Throwable th) {
                            th = th;
                            oqiVar = r12;
                        }
                    } else {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a0Var2 = bVar.l;
                        oqiVar = bVar.k;
                        try {
                            qgg.h0(obj2);
                            oqiVar.b(null);
                            return a0Var2;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    oqiVar.b(null);
                    throw th;
                }
                int i8 = bVar.m;
                ?? r122 = bVar.k;
                str2 = bVar.j;
                qgg.h0(obj2);
                i2 = i8;
                qqiVar = r122;
                i iVar = this.c;
                com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                f fVar = new f(str2);
                bVar.j = null;
                bVar.k = qqiVar;
                bVar.m = i2;
                bVar.n = 0;
                bVar.q = 2;
                g = iVar.g(fVar, bVar);
                if (g != nm6Var) {
                    return nm6Var;
                }
                i3 = i2;
                obj2 = g;
                i4 = 0;
                obj = ((z7o) obj2).a;
                if (obj instanceof t7o) {
                }
                a0Var = (a0) obj;
                if (a0Var == null) {
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                k1 k1Var2 = this.j;
                String obj32 = a0Var.toString();
                k1Var2.getClass();
                obj32.getClass();
                k1Var2.q(fd.d, new com.yandex.passport.internal.report.c("vpn_status", obj32));
                if (!Intrinsics.d(xdrVar.getValue(), a0Var)) {
                }
            }
        }
        bVar = new b(this, continuation);
        Object obj22 = bVar.o;
        nm6Var = nm6.a;
        i = bVar.q;
        if (i != 0) {
        }
        i iVar2 = this.c;
        com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
        f fVar2 = new f(str2);
        bVar.j = null;
        bVar.k = qqiVar;
        bVar.m = i2;
        bVar.n = 0;
        bVar.q = 2;
        g = iVar2.g(fVar2, bVar);
        if (g != nm6Var) {
        }
    }
}
