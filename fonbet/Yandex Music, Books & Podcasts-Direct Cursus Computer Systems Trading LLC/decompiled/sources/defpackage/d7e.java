package defpackage;

import android.accounts.Account;
import com.connectsdk.service.command.ServiceCommand;
import com.yandex.passport.api.o;
import com.yandex.passport.common.account.a;
import com.yandex.passport.common.core.g;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.data.exceptions.k;
import com.yandex.passport.internal.analytics.n;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.core.accounts.t;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.usecase.w;
import com.yandex.passport.internal.usecase.x;
import com.yandex.passport.internal.usecase.z;
import com.yandex.plus.bdui.plus.content.controller.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class d7e extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7e(t tVar, l lVar, String str, n nVar, long j, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.m = tVar;
        this.n = lVar;
        this.o = str;
        this.p = nVar;
        this.l = j;
        this.q = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                d7e d7eVar = new d7e((yk3) this.n, (anx) this.o, (kkp) this.p, (fx6) this.q, continuation);
                d7eVar.m = obj;
                return d7eVar;
            case 1:
                return new d7e((vek) this.m, (xgr) this.n, this.l, (fzc) this.o, (String) this.p, (List) this.q, continuation, 1);
            case 2:
                return new d7e((xol) this.m, (vgl) this.n, this.l, (pq4) this.o, (wol) this.p, (xnf) this.q, continuation, 2);
            case 3:
                return new d7e((t) this.m, (l) this.n, (String) this.o, (n) this.p, this.l, (String) this.q, continuation);
            default:
                d7e d7eVar2 = new d7e((Collection) this.n, continuation, (Set) this.o, (f) this.p, this.l, this.q);
                d7eVar2.m = obj;
                return d7eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((d7e) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0543, code lost:
    
        if (r0 == r5) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0570, code lost:
    
        if (r13.emit(r0, r25) == r5) goto L165;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fx6 fx6Var;
        IOException iOException;
        l3o l3oVar;
        long j;
        Object q;
        rjc rjcVar;
        long j2;
        nm6 nm6Var;
        Object s;
        Object putIfAbsent;
        String str;
        Object g;
        a aVar;
        int i = this.j;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                fx6 fx6Var2 = (fx6) obj2;
                kkp kkpVar = (kkp) obj3;
                nuj nujVar = (nuj) kkpVar.b;
                yk3 yk3Var = (yk3) obj5;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                int i3 = 0;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.m;
                    int i4 = awt.a;
                    fx6Var = fx6Var2;
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList h0 = CollectionsKt.h0((ArrayList) yk3Var.d, (b7e) yk3Var.e);
                    anx anxVar = (anx) obj4;
                    this.m = rjcVar2;
                    this.l = currentTimeMillis;
                    this.k = 1;
                    if (h0.size() <= 0) {
                        xq0.q("Check failed.");
                        return null;
                    }
                    bnd bndVar = (bnd) ((b7e) h0.get(0)).a.c;
                    zt3 zt3Var = new zt3(1, qxe.b(this));
                    zt3Var.s();
                    b0o b0oVar = new b0o();
                    b0oVar.g((String) anxVar.b);
                    b0oVar.c = ywf.J((ArrayList) anxVar.c).m();
                    if (anxVar.a == 1) {
                        b0oVar.e(ServiceCommand.TYPE_GET, null);
                    } else {
                        z5e z5eVar = (z5e) anxVar.d;
                        if (z5eVar == null) {
                            xq0.q("HTTP POST requires a request body");
                            return null;
                        }
                        b0oVar.e(ServiceCommand.TYPE_POST, new dn7(i3, z5eVar));
                    }
                    es3 b = ((ds3) bndVar.b).b(b0oVar.b());
                    zt3Var.u(new az6(8, b));
                    try {
                        l3oVar = b.execute();
                        iOException = null;
                    } catch (IOException e) {
                        iOException = e;
                        l3oVar = null;
                    }
                    if (iOException != null) {
                        r7o r7oVar = z7o.b;
                        if (iOException == null) {
                            iOException = null;
                        }
                        zt3Var.resumeWith(new t7o(new hp0("Failed to execute GraphQL http network request", iOException)));
                        j = currentTimeMillis;
                    } else {
                        r7o r7oVar2 = z7o.b;
                        l3oVar.getClass();
                        int i5 = l3oVar.d;
                        ArrayList arrayList = new ArrayList();
                        o3o o3oVar = l3oVar.g;
                        o3oVar.getClass();
                        ij3 z = o3oVar.z();
                        z.getClass();
                        zvd zvdVar = l3oVar.f;
                        IntRange m = yhn.m(0, zvdVar.size());
                        ArrayList arrayList2 = new ArrayList(v75.o(m, 10));
                        ype it = m.iterator();
                        while (it.c) {
                            int nextInt = it.nextInt();
                            arrayList2.add(new t6e(zvdVar.g(nextInt), zvdVar.q(nextInt)));
                            currentTimeMillis = currentTimeMillis;
                        }
                        j = currentTimeMillis;
                        arrayList.addAll(arrayList2);
                        h7e h7eVar = new h7e(i5, arrayList, z);
                        qgg.h0(h7eVar);
                        r7o r7oVar3 = z7o.b;
                        zt3Var.resumeWith(h7eVar);
                    }
                    q = zt3Var.q();
                    nm6 nm6Var3 = nm6.a;
                    if (q == nm6Var2) {
                        nm6Var = nm6Var2;
                        return nm6Var;
                    }
                    rjcVar = rjcVar2;
                    j2 = j;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2 || i2 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = this.l;
                    rjc rjcVar3 = (rjc) this.m;
                    qgg.h0(obj);
                    rjcVar = rjcVar3;
                    fx6Var = fx6Var2;
                    q = obj;
                }
                h7e h7eVar2 = (h7e) q;
                int i6 = h7eVar2.a;
                int i7 = h7eVar2.a;
                ArrayList arrayList3 = h7eVar2.b;
                ij3 ij3Var = h7eVar2.c;
                if (200 > i6 || i6 >= 300) {
                    ij3 ij3Var2 = null;
                    if (yk3Var.a) {
                        ij3Var2 = ij3Var;
                    } else {
                        ij3Var.close();
                    }
                    throw new fp0(i7, arrayList3, ij3Var2, hrg.o("Http request failed with status code `", i7, '`'));
                }
                String m0 = vq1.m0(arrayList3);
                if (m0 != null && c.v(m0, "multipart/", true)) {
                    xqn xqnVar = new xqn();
                    xqn xqnVar2 = new xqn();
                    Continuation continuation = null;
                    int i8 = 3;
                    clc clcVar = new clc(new qm(new alc(new eno(new rlg(xqnVar2, h7eVar2, continuation, 9)), new ow1(xqnVar2, continuation, i8)), nujVar, fx6Var, xqnVar, 2), new f7e(i8, 0, continuation));
                    this.m = null;
                    this.k = 2;
                    zsd.f0(rjcVar);
                    nm6Var = nm6Var2;
                    Object collect = clcVar.collect(new pm(rjcVar, yk3Var, kkpVar, h7eVar2, j2), this);
                    nm6 nm6Var4 = nm6.a;
                    if (collect != nm6Var4) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var4) {
                        collect = Unit.a;
                        break;
                    }
                } else {
                    nm6Var = nm6Var2;
                    try {
                        jp0 a = v5g.K(nujVar, new jj3(ij3Var), fx6Var).a();
                        a.a = true;
                        kp0 i9 = yk3.i(yk3Var, a.c(), (UUID) kkpVar.c, h7eVar2);
                        this.m = null;
                        this.k = 3;
                        break;
                    } catch (Exception e2) {
                        if (e2 instanceof ep0) {
                            throw ((ep0) e2);
                        }
                        throw new ip0("Failed to parse GraphQL http network response", e2);
                    }
                }
                break;
            case 1:
                nm6 nm6Var5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    vek vekVar = (vek) this.m;
                    wb7 wb7Var = vekVar.c;
                    uek uekVar = new uek(vekVar, (xgr) obj5, this.l, (fzc) obj4, (String) obj3, (List) obj2, null);
                    this.k = 1;
                    if (lmm.a(wb7Var, uekVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                vgl vglVar = (vgl) obj5;
                String str2 = vglVar.b;
                xol xolVar = (xol) this.m;
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ConcurrentHashMap concurrentHashMap = xolVar.l;
                    Object obj6 = concurrentHashMap.get(str2);
                    if (obj6 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str2, (obj6 = hld.j()))) != null) {
                        obj6 = putIfAbsent;
                    }
                    this.k = 1;
                    s = ((gm5) obj6).s(this);
                    if (s == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s = obj;
                }
                fwk fwkVar = (fwk) s;
                vol volVar = (vol) xolVar.m.getAndSet(null);
                if (Intrinsics.d(volVar != null ? volVar.a : null, str2)) {
                    xol.a(xolVar, vglVar, volVar.b, fwkVar);
                }
                long j3 = this.l;
                pq4 pq4Var = (pq4) obj4;
                if (pq4Var != null) {
                    str = pq4Var.a.a;
                } else {
                    x2i x2iVar = oq4.b;
                    str = "unknown";
                }
                ih0 ih0Var = new ih0(j3, fwkVar, str, pq4Var != null ? pq4Var.b : -1, ((wol) obj3).b, (xnf) obj2);
                nnd nndVar = xolVar.a.a;
                String str3 = vglVar.c;
                String S = asq.S(vglVar.d);
                String uuid = xolVar.j.toString();
                uuid.getClass();
                nndVar.getClass();
                str3.getClass();
                qdc qdcVar = (qdc) nndVar.b;
                mib mibVar = (mib) ((jyr) qdcVar.b).getValue();
                p3i p3iVar = new p3i(450);
                p3iVar.e("allowPreheatWithoutCrossfade", ((Boolean) ((sgl) qdcVar.c).a.a).booleanValue());
                new izn(str3, S, uuid, ih0Var).d(p3iVar);
                LinkedHashMap a2 = p3iVar.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(a2.size()));
                for (Map.Entry entry : a2.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((t3i) entry.getValue()).getValue());
                }
                mibVar.b("TRACK_IS_PLAYING2", linkedHashMap);
                return Unit.a;
            case 3:
                t tVar = (t) this.m;
                l lVar = (l) obj5;
                nm6 nm6Var7 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(b.b, null, "refreshModernAccount : refreshing " + lVar, 8);
                    }
                    z zVar = tVar.c;
                    x xVar = new x(lVar.d, lVar.b.a, lVar.h(), (String) obj4, lVar.e.b);
                    this.k = 1;
                    g = zVar.g(xVar, this);
                    if (g == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = obj;
                }
                Object obj7 = ((z7o) g).a;
                n nVar = (n) obj3;
                long j4 = this.l;
                String str4 = (String) obj2;
                Throwable a3 = z7o.a(obj7);
                if (a3 == null) {
                    w wVar = (w) obj7;
                    g gVar = wVar.a;
                    o oVar = wVar.b;
                    a aVar2 = wVar.e;
                    l e3 = l.e(lVar, null, null, gVar, null, 47);
                    tVar.getClass();
                    i iVar = tVar.b;
                    com.yandex.passport.internal.stash.a aVar3 = e3.f;
                    com.yandex.passport.internal.stash.b bVar = com.yandex.passport.internal.stash.b.UPGRADE_STATUS;
                    l e4 = l.e(e3, null, null, null, aVar3.b(bVar, String.valueOf(oVar != null ? Integer.valueOf(oVar.ordinal()) : null), true), 31);
                    if (aVar2 != null) {
                        aVar = aVar2;
                        e4 = l.e(e4, null, aVar, null, null, 55);
                    } else {
                        aVar = aVar2;
                    }
                    l lVar2 = e4;
                    if (aVar != null) {
                        iVar.h(lVar2, nVar, true);
                    } else {
                        iVar.l(lVar2, nVar);
                    }
                    if (oVar != null) {
                        i.j(iVar, lVar2, new Pair[]{new Pair(bVar, String.valueOf(oVar.ordinal()))});
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(b.b, null, "refreshModernAccountIfNecessary: refreshed " + lVar2, 8);
                    }
                    tVar.d.D(lVar2.j, wVar.c);
                    return lVar2;
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, "getAllUserInfo onFailure:" + a3, 8);
                }
                if (!(a3 instanceof k)) {
                    return lVar;
                }
                com.yandex.passport.data.mapper.a aVar4 = tVar.f;
                String c = com.yandex.passport.data.mapper.a.c(j4, str4);
                i iVar2 = tVar.b;
                iVar2.f(com.yandex.passport.internal.b.a(iVar2.l.a(lVar), null, c, null, null, 495));
                com.yandex.passport.internal.core.accounts.k kVar = iVar2.a;
                Account account = lVar.g;
                account.getClass();
                kVar.e();
                kVar.a.setUserData(account, "user_info_meta", c);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, "updateUserInfoMeta: account=" + account + " userInfoMeta=" + c, 8);
                }
                iVar2.b.a(true);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(b.b, null, "refreshModernAccountIfNecessary: touched " + lVar, 8);
                }
                return l.e(lVar, null, null, g.a(lVar.e, null, str4, j4, -7), null, 47);
            default:
                mm6 mm6Var = (mm6) this.m;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Collection collection = (Collection) obj5;
                ArrayList arrayList4 = new ArrayList(v75.o(collection, 10));
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(x97.p(mm6Var, null, null, new hkc(it2.next(), (Continuation) null, (Set) obj4, (f) obj3, this.l, this.q), 3));
                }
                this.m = null;
                this.k = 1;
                Object v = ox6.v(arrayList4, this);
                return v == nm6Var8 ? nm6Var8 : v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7e(yk3 yk3Var, anx anxVar, kkp kkpVar, fx6 fx6Var, Continuation continuation) {
        super(2, continuation);
        this.j = 0;
        this.n = yk3Var;
        this.o = anxVar;
        this.p = kkpVar;
        this.q = fx6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7e(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = j;
        this.o = obj3;
        this.p = obj4;
        this.q = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7e(Collection collection, Continuation continuation, Set set, f fVar, long j, Object obj) {
        super(2, continuation);
        this.j = 4;
        this.n = collection;
        this.o = set;
        this.p = fVar;
        this.l = j;
        this.q = obj;
    }
}
