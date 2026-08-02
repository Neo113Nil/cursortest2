package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.api.r0;
import com.yandex.passport.data.network.q0;
import com.yandex.passport.data.network.t0;
import com.yandex.passport.data.network.u0;
import com.yandex.passport.data.network.y0;
import com.yandex.passport.internal.config.o;
import com.yandex.passport.internal.entities.a0;
import com.yandex.passport.internal.entities.z;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.properties.l0;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.provider.communication.p;
import com.yandex.passport.internal.usecase.o0;
import com.yandex.passport.internal.usecase.s0;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wis;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class i extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.autologin.k b;
    public final com.yandex.passport.internal.account.a c;
    public final com.yandex.passport.internal.core.accounts.e d;
    public final x e;
    public final y f;
    public final s0 g;
    public final y0 h;
    public final com.yandex.passport.internal.network.mappers.b i;
    public final com.yandex.passport.internal.common.f j;
    public final com.yandex.passport.common.common.a k;
    public final o l;
    public final p m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.autologin.k kVar, com.yandex.passport.internal.account.a aVar2, com.yandex.passport.internal.core.accounts.e eVar, x xVar, y yVar, s0 s0Var, y0 y0Var, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.common.f fVar, com.yandex.passport.common.common.a aVar3, o oVar, p pVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        kVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        xVar.getClass();
        yVar.getClass();
        s0Var.getClass();
        y0Var.getClass();
        bVar.getClass();
        fVar.getClass();
        aVar3.getClass();
        oVar.getClass();
        pVar.getClass();
        this.b = kVar;
        this.c = aVar2;
        this.d = eVar;
        this.e = xVar;
        this.f = yVar;
        this.g = s0Var;
        this.h = y0Var;
        this.i = bVar;
        this.j = fVar;
        this.k = aVar3;
        this.l = oVar;
        this.m = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (r14 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(com.yandex.passport.common.core.b bVar, cg6 cg6Var) {
        g gVar;
        int i;
        l a;
        com.yandex.passport.internal.credentials.f b;
        boolean z;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a = this.c.a();
                    if (a == null) {
                        com.yandex.passport.internal.autologin.e eVar = new com.yandex.passport.internal.autologin.e(com.yandex.passport.api.x.a, this.d.a().g(), bVar, null, 16);
                        gVar.l = 1;
                        obj = this.b.g(eVar, gVar);
                    }
                    b = this.e.b(a.b.a);
                    if (b == null) {
                        return null;
                    }
                    o0 o0Var = new o0(a, b, false);
                    gVar.l = 2;
                    obj = this.g.g(o0Var, gVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object obj2 = ((z7o) obj).a;
                        return (com.yandex.passport.internal.entities.e) (obj2 instanceof t7o ? null : obj2);
                    }
                    qgg.h0(obj);
                }
                Object obj3 = ((z7o) obj).a;
                z = obj3 instanceof t7o;
                Object obj4 = obj3;
                if (z) {
                    obj4 = null;
                }
                a = (l) obj4;
                if (a == null) {
                    return null;
                }
                b = this.e.b(a.b.a);
                if (b == null) {
                }
            }
        }
        gVar = new g(this, cg6Var);
        Object obj5 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        Object obj32 = ((z7o) obj5).a;
        z = obj32 instanceof t7o;
        Object obj42 = obj32;
        if (z) {
        }
        a = (l) obj42;
        if (a == null) {
        }
        b = this.e.b(a.b.a);
        if (b == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|126|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0055, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0056, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x004d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x004e, code lost:
    
        r33 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02cd, code lost:
    
        if (r10.b(r33, r4) == r5) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0222 A[Catch: CancellationException -> 0x0052, all -> 0x01b8, wis -> 0x01bb, TryCatch #2 {CancellationException -> 0x0052, blocks: (B:16:0x0046, B:18:0x0280, B:29:0x0064, B:31:0x021a, B:33:0x0222, B:35:0x022a, B:37:0x023b, B:39:0x0241, B:40:0x0259, B:41:0x025e, B:42:0x025f, B:45:0x0264, B:48:0x026a, B:53:0x0077, B:54:0x00dd, B:56:0x00f3, B:57:0x0110, B:94:0x0124, B:97:0x0129, B:60:0x0148, B:61:0x015b, B:63:0x0161, B:65:0x017e, B:66:0x0195, B:68:0x019b, B:71:0x01aa, B:82:0x01c4, B:83:0x01cb, B:105:0x0081, B:106:0x00c2, B:111:0x008b, B:112:0x00ac, B:116:0x0092), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3 A[Catch: all -> 0x004d, CancellationException -> 0x0052, wis -> 0x0055, TryCatch #2 {CancellationException -> 0x0052, blocks: (B:16:0x0046, B:18:0x0280, B:29:0x0064, B:31:0x021a, B:33:0x0222, B:35:0x022a, B:37:0x023b, B:39:0x0241, B:40:0x0259, B:41:0x025e, B:42:0x025f, B:45:0x0264, B:48:0x026a, B:53:0x0077, B:54:0x00dd, B:56:0x00f3, B:57:0x0110, B:94:0x0124, B:97:0x0129, B:60:0x0148, B:61:0x015b, B:63:0x0161, B:65:0x017e, B:66:0x0195, B:68:0x019b, B:71:0x01aa, B:82:0x01c4, B:83:0x01cb, B:105:0x0081, B:106:0x00c2, B:111:0x008b, B:112:0x00ac, B:116:0x0092), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161 A[Catch: CancellationException -> 0x0052, all -> 0x0133, wis -> 0x0138, LOOP:0: B:61:0x015b->B:63:0x0161, LOOP_END, TryCatch #2 {CancellationException -> 0x0052, blocks: (B:16:0x0046, B:18:0x0280, B:29:0x0064, B:31:0x021a, B:33:0x0222, B:35:0x022a, B:37:0x023b, B:39:0x0241, B:40:0x0259, B:41:0x025e, B:42:0x025f, B:45:0x0264, B:48:0x026a, B:53:0x0077, B:54:0x00dd, B:56:0x00f3, B:57:0x0110, B:94:0x0124, B:97:0x0129, B:60:0x0148, B:61:0x015b, B:63:0x0161, B:65:0x017e, B:66:0x0195, B:68:0x019b, B:71:0x01aa, B:82:0x01c4, B:83:0x01cb, B:105:0x0081, B:106:0x00c2, B:111:0x008b, B:112:0x00ac, B:116:0x0092), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b A[Catch: CancellationException -> 0x0052, all -> 0x0133, wis -> 0x0138, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0052, blocks: (B:16:0x0046, B:18:0x0280, B:29:0x0064, B:31:0x021a, B:33:0x0222, B:35:0x022a, B:37:0x023b, B:39:0x0241, B:40:0x0259, B:41:0x025e, B:42:0x025f, B:45:0x0264, B:48:0x026a, B:53:0x0077, B:54:0x00dd, B:56:0x00f3, B:57:0x0110, B:94:0x0124, B:97:0x0129, B:60:0x0148, B:61:0x015b, B:63:0x0161, B:65:0x017e, B:66:0x0195, B:68:0x019b, B:71:0x01aa, B:82:0x01c4, B:83:0x01cb, B:105:0x0081, B:106:0x00c2, B:111:0x008b, B:112:0x00ac, B:116:0x0092), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c4 A[Catch: CancellationException -> 0x0052, all -> 0x01b8, wis -> 0x01bb, TryCatch #2 {CancellationException -> 0x0052, blocks: (B:16:0x0046, B:18:0x0280, B:29:0x0064, B:31:0x021a, B:33:0x0222, B:35:0x022a, B:37:0x023b, B:39:0x0241, B:40:0x0259, B:41:0x025e, B:42:0x025f, B:45:0x0264, B:48:0x026a, B:53:0x0077, B:54:0x00dd, B:56:0x00f3, B:57:0x0110, B:94:0x0124, B:97:0x0129, B:60:0x0148, B:61:0x015b, B:63:0x0161, B:65:0x017e, B:66:0x0195, B:68:0x019b, B:71:0x01aa, B:82:0x01c4, B:83:0x01cb, B:105:0x0081, B:106:0x00c2, B:111:0x008b, B:112:0x00ac, B:116:0x0092), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.yandex.passport.internal.entities.a0, com.yandex.passport.internal.usecase.vpn.f] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(f fVar, cg6 cg6Var) {
        h hVar;
        int i;
        com.yandex.passport.internal.entities.x xVar;
        t7o t7oVar;
        Object obj;
        Throwable a;
        ?? r12;
        f fVar2;
        int i2;
        int i3;
        com.yandex.passport.internal.entities.e eVar;
        int i4;
        f fVar3;
        com.yandex.passport.internal.common.g gVar;
        com.yandex.passport.common.common.a aVar;
        com.yandex.passport.internal.common.f fVar4;
        com.yandex.passport.internal.entities.x xVar2;
        o oVar;
        t0 t0Var;
        Iterator it;
        int i5;
        f fVar5;
        int i6;
        Object obj2;
        a0 a0Var;
        Object yVar;
        com.yandex.passport.common.common.a aVar2 = this.k;
        try {
            if (cg6Var instanceof h) {
                hVar = (h) cg6Var;
                int i7 = hVar.q;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    hVar.q = i7 - Integer.MIN_VALUE;
                    Object obj3 = hVar.o;
                    nm6 nm6Var = nm6.a;
                    i = hVar.q;
                    com.yandex.passport.internal.entities.x xVar3 = com.yandex.passport.internal.entities.x.a;
                    o oVar2 = this.l;
                    p pVar = this.m;
                    com.yandex.passport.internal.common.f fVar6 = this.j;
                    switch (i) {
                        case 0:
                            qgg.h0(obj3);
                            r7o r7oVar = z7o.b;
                            z zVar = z.a;
                            hVar.j = fVar;
                            hVar.m = 0;
                            hVar.n = 0;
                            hVar.q = 1;
                            if (pVar.b(zVar, hVar) == nm6Var) {
                                return nm6Var;
                            }
                            fVar2 = fVar;
                            i2 = 0;
                            i3 = 0;
                            fVar2.getClass();
                            com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
                            hVar.j = fVar2;
                            hVar.m = i3;
                            hVar.n = i2;
                            hVar.q = 2;
                            obj3 = u(bVar, hVar);
                            if (obj3 == nm6Var) {
                                return nm6Var;
                            }
                            eVar = (com.yandex.passport.internal.entities.e) obj3;
                            hVar.j = fVar2;
                            hVar.k = eVar;
                            hVar.m = i3;
                            hVar.n = i2;
                            hVar.q = 3;
                            obj3 = fVar6.a();
                            if (obj3 == nm6Var) {
                                return nm6Var;
                            }
                            f fVar7 = fVar2;
                            i4 = i3;
                            fVar3 = fVar7;
                            gVar = (com.yandex.passport.internal.common.g) obj3;
                            l0 l0Var = (l0) this.f.f.a.getValue();
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                aVar = aVar2;
                                fVar4 = fVar6;
                            } else {
                                aVar = aVar2;
                                fVar4 = fVar6;
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "vpnBlockerProperties: " + l0Var, 8);
                            }
                            y0 y0Var = this.h;
                            com.yandex.passport.internal.network.mappers.b bVar2 = this.i;
                            fVar3.getClass();
                            com.yandex.passport.common.core.b bVar3 = com.yandex.passport.common.core.b.c;
                            bVar2.getClass();
                            com.yandex.passport.data.models.g a2 = com.yandex.passport.internal.network.mappers.b.a(bVar3);
                            String str = fVar3.a;
                            if (gVar == null) {
                                try {
                                    xVar2 = xVar3;
                                    oVar = oVar2;
                                    try {
                                        t0Var = new t0(gVar.a, gVar.b);
                                    } catch (wis e) {
                                        e = e;
                                        xVar = xVar2;
                                        r7o r7oVar2 = z7o.b;
                                        t7oVar = new t7o(e);
                                        obj = t7oVar;
                                        a = z7o.a(obj);
                                        if (a != null) {
                                        }
                                        return new z7o(obj);
                                    } catch (Throwable th) {
                                        th = th;
                                        xVar = xVar2;
                                        r7o r7oVar3 = z7o.b;
                                        t7oVar = new t7o(th);
                                        obj = t7oVar;
                                        a = z7o.a(obj);
                                        if (a != null) {
                                        }
                                        return new z7o(obj);
                                    }
                                } catch (wis e2) {
                                    e = e2;
                                    xVar2 = xVar3;
                                    xVar = xVar2;
                                    r7o r7oVar22 = z7o.b;
                                    t7oVar = new t7o(e);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    return new z7o(obj);
                                } catch (Throwable th2) {
                                    th = th2;
                                    xVar2 = xVar3;
                                    xVar = xVar2;
                                    r7o r7oVar32 = z7o.b;
                                    t7oVar = new t7o(th);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    return new z7o(obj);
                                }
                            } else {
                                xVar2 = xVar3;
                                oVar = oVar2;
                                t0Var = null;
                            }
                            List<r0> list = l0Var.a;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            for (r0 r0Var : list) {
                                arrayList.add(new t0(r0Var.a, r0Var.b));
                                y0Var = y0Var;
                                str = str;
                            }
                            y0 y0Var2 = y0Var;
                            String str2 = str;
                            List list2 = l0Var.b;
                            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                            it = list2.iterator();
                            while (it.hasNext()) {
                                r0 r0Var2 = (r0) it.next();
                                Iterator it2 = it;
                                ArrayList arrayList3 = arrayList;
                                xVar = xVar2;
                                try {
                                    arrayList2.add(new t0(r0Var2.a, r0Var2.b));
                                    it = it2;
                                    arrayList = arrayList3;
                                    xVar2 = xVar;
                                } catch (wis e3) {
                                    e = e3;
                                    r7o r7oVar222 = z7o.b;
                                    t7oVar = new t7o(e);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    return new z7o(obj);
                                } catch (Throwable th3) {
                                    th = th3;
                                    r7o r7oVar322 = z7o.b;
                                    t7oVar = new t7o(th);
                                    obj = t7oVar;
                                    a = z7o.a(obj);
                                    if (a != null) {
                                    }
                                    return new z7o(obj);
                                }
                            }
                            ArrayList arrayList4 = arrayList;
                            xVar = xVar2;
                            String str3 = eVar == null ? eVar.a : null;
                            String a3 = ((com.yandex.passport.internal.common.d) aVar).a();
                            String b = ((com.yandex.passport.internal.common.d) aVar).b();
                            Pair pair = new Pair(fVar4.b(), fVar4.c());
                            String d = fVar4.d();
                            com.yandex.passport.common.core.a aVar3 = com.yandex.passport.common.core.b.b;
                            u0 u0Var = new u0(a2, str2, t0Var, arrayList4, arrayList2, str3, a3, b, pair, d, oVar.a(), l0Var.c);
                            hVar.j = fVar3;
                            hVar.k = null;
                            hVar.m = i4;
                            hVar.n = i2;
                            hVar.q = 4;
                            obj3 = y0Var2.g(u0Var, hVar);
                            if (obj3 != nm6Var) {
                                return nm6Var;
                            }
                            i5 = i2;
                            fVar5 = fVar3;
                            i6 = i4;
                            obj2 = ((z7o) obj3).a;
                            if (!(obj2 instanceof t7o)) {
                                r7o r7oVar4 = z7o.b;
                                com.yandex.passport.data.network.s0 s0Var = (com.yandex.passport.data.network.s0) obj2;
                                if (s0Var instanceof q0) {
                                    fVar5.getClass();
                                    com.yandex.passport.common.core.a aVar4 = com.yandex.passport.common.core.b.b;
                                    oVar.b(((q0) s0Var).a);
                                    yVar = xVar;
                                } else {
                                    o oVar3 = oVar;
                                    if (!(s0Var instanceof com.yandex.passport.data.network.r0)) {
                                        throw new x7j();
                                    }
                                    fVar5.getClass();
                                    com.yandex.passport.common.core.a aVar5 = com.yandex.passport.common.core.b.b;
                                    oVar3.b(((com.yandex.passport.data.network.r0) s0Var).b);
                                    yVar = new com.yandex.passport.internal.entities.y(((com.yandex.passport.data.network.r0) s0Var).a);
                                }
                                obj2 = yVar;
                            }
                            if (obj2 instanceof t7o) {
                                obj2 = null;
                            }
                            a0Var = (a0) obj2;
                            if (a0Var == null) {
                                a0Var = xVar;
                            }
                            hVar.j = null;
                            hVar.k = null;
                            hVar.l = a0Var;
                            hVar.m = i6;
                            hVar.n = i5;
                            hVar.q = 5;
                            if (pVar.b(a0Var, hVar) != nm6Var) {
                                return nm6Var;
                            }
                            obj = a0Var;
                            r7o r7oVar5 = z7o.b;
                            a = z7o.a(obj);
                            if (a != null) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    r12 = 0;
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onFailure: " + a, 8);
                                } else {
                                    r12 = 0;
                                }
                                hVar.j = r12;
                                hVar.k = obj;
                                hVar.l = r12;
                                hVar.m = 0;
                                hVar.q = 6;
                                break;
                            }
                            return new z7o(obj);
                        case 1:
                            i2 = hVar.n;
                            i3 = hVar.m;
                            fVar2 = hVar.j;
                            qgg.h0(obj3);
                            fVar2.getClass();
                            com.yandex.passport.common.core.b bVar4 = com.yandex.passport.common.core.b.c;
                            hVar.j = fVar2;
                            hVar.m = i3;
                            hVar.n = i2;
                            hVar.q = 2;
                            obj3 = u(bVar4, hVar);
                            if (obj3 == nm6Var) {
                            }
                            eVar = (com.yandex.passport.internal.entities.e) obj3;
                            hVar.j = fVar2;
                            hVar.k = eVar;
                            hVar.m = i3;
                            hVar.n = i2;
                            hVar.q = 3;
                            obj3 = fVar6.a();
                            if (obj3 == nm6Var) {
                            }
                            break;
                        case 2:
                            i2 = hVar.n;
                            i3 = hVar.m;
                            fVar2 = hVar.j;
                            qgg.h0(obj3);
                            eVar = (com.yandex.passport.internal.entities.e) obj3;
                            hVar.j = fVar2;
                            hVar.k = eVar;
                            hVar.m = i3;
                            hVar.n = i2;
                            hVar.q = 3;
                            obj3 = fVar6.a();
                            if (obj3 == nm6Var) {
                            }
                            break;
                        case 3:
                            i2 = hVar.n;
                            i4 = hVar.m;
                            eVar = (com.yandex.passport.internal.entities.e) hVar.k;
                            fVar3 = hVar.j;
                            qgg.h0(obj3);
                            gVar = (com.yandex.passport.internal.common.g) obj3;
                            l0 l0Var2 = (l0) this.f.f.a.getValue();
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            }
                            y0 y0Var3 = this.h;
                            com.yandex.passport.internal.network.mappers.b bVar22 = this.i;
                            fVar3.getClass();
                            com.yandex.passport.common.core.b bVar32 = com.yandex.passport.common.core.b.c;
                            bVar22.getClass();
                            com.yandex.passport.data.models.g a22 = com.yandex.passport.internal.network.mappers.b.a(bVar32);
                            String str4 = fVar3.a;
                            if (gVar == null) {
                            }
                            List<r0> list3 = l0Var2.a;
                            ArrayList arrayList5 = new ArrayList(v75.o(list3, 10));
                            while (r0.hasNext()) {
                            }
                            y0 y0Var22 = y0Var3;
                            String str22 = str4;
                            List list22 = l0Var2.b;
                            ArrayList arrayList22 = new ArrayList(v75.o(list22, 10));
                            it = list22.iterator();
                            while (it.hasNext()) {
                            }
                            ArrayList arrayList42 = arrayList5;
                            xVar = xVar2;
                            if (eVar == null) {
                            }
                            String a32 = ((com.yandex.passport.internal.common.d) aVar).a();
                            String b2 = ((com.yandex.passport.internal.common.d) aVar).b();
                            Pair pair2 = new Pair(fVar4.b(), fVar4.c());
                            String d2 = fVar4.d();
                            com.yandex.passport.common.core.a aVar32 = com.yandex.passport.common.core.b.b;
                            u0 u0Var2 = new u0(a22, str22, t0Var, arrayList42, arrayList22, str3, a32, b2, pair2, d2, oVar.a(), l0Var2.c);
                            hVar.j = fVar3;
                            hVar.k = null;
                            hVar.m = i4;
                            hVar.n = i2;
                            hVar.q = 4;
                            obj3 = y0Var22.g(u0Var2, hVar);
                            if (obj3 != nm6Var) {
                            }
                            break;
                        case 4:
                            i5 = hVar.n;
                            i6 = hVar.m;
                            fVar5 = hVar.j;
                            qgg.h0(obj3);
                            xVar = xVar3;
                            oVar = oVar2;
                            obj2 = ((z7o) obj3).a;
                            if (!(obj2 instanceof t7o)) {
                            }
                            if (obj2 instanceof t7o) {
                            }
                            a0Var = (a0) obj2;
                            if (a0Var == null) {
                            }
                            hVar.j = null;
                            hVar.k = null;
                            hVar.l = a0Var;
                            hVar.m = i6;
                            hVar.n = i5;
                            hVar.q = 5;
                            if (pVar.b(a0Var, hVar) != nm6Var) {
                            }
                            break;
                        case 5:
                            obj = hVar.l;
                            qgg.h0(obj3);
                            xVar = xVar3;
                            r7o r7oVar52 = z7o.b;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return new z7o(obj);
                        case 6:
                            obj = hVar.k;
                            qgg.h0(obj3);
                            return new z7o(obj);
                        default:
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        hVar = new h(this, cg6Var);
        Object obj32 = hVar.o;
        nm6 nm6Var2 = nm6.a;
        i = hVar.q;
        com.yandex.passport.internal.entities.x xVar32 = com.yandex.passport.internal.entities.x.a;
        o oVar22 = this.l;
        p pVar2 = this.m;
        com.yandex.passport.internal.common.f fVar62 = this.j;
    }
}
