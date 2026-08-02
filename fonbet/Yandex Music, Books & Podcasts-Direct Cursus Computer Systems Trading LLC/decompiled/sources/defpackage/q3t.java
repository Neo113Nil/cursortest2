package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class q3t {
    public final j3t a;
    public final yfx b;
    public final xkh c;
    public final uhr d;
    public final niq e;
    public final kvs f;
    public final fys g;
    public final a h;
    public final oxa i;
    public final f6b j;
    public final f6b k;
    public final f6b l;
    public final vsb m;
    public final r5q n;

    public q3t(j3t j3tVar, yfx yfxVar, xkh xkhVar, uhr uhrVar, niq niqVar, kvs kvsVar, fys fysVar, a aVar, oxa oxaVar, f6b f6bVar, f6b f6bVar2, f6b f6bVar3, vsb vsbVar, r5q r5qVar, tcl tclVar) {
        niqVar.getClass();
        kvsVar.getClass();
        fysVar.getClass();
        aVar.getClass();
        oxaVar.getClass();
        vsbVar.getClass();
        tclVar.getClass();
        this.a = j3tVar;
        this.b = yfxVar;
        this.c = xkhVar;
        this.d = uhrVar;
        this.e = niqVar;
        this.f = kvsVar;
        this.g = fysVar;
        this.h = aVar;
        this.i = oxaVar;
        this.j = f6bVar;
        this.k = f6bVar2;
        this.l = f6bVar3;
        this.m = vsbVar;
        this.n = r5qVar;
    }

    public final Collection a(int i) {
        ssg.a(3, "TracksCacheRepositoryImpl", dfi.c(i, "deleteExcessTempTracks(", ")"), null);
        kvs kvsVar = this.f;
        ReentrantLock reentrantLock = kvsVar.a;
        reentrantLock.lock();
        try {
            Set A0 = CollectionsKt.A0(kvsVar.b.keySet());
            reentrantLock.unlock();
            String a = this.n.a();
            a.getClass();
            ssg.a(4, "TracksCacheDatabaseImpl", "getTemp for user ".concat(a), null);
            i3t a2 = this.a.a.a(a);
            css cssVar = css.f;
            a2.getClass();
            cssVar.getClass();
            ArrayList c = o3t.c((List) up6.F(a2.a, true, false, new gb2(cssVar, 3)));
            ArrayList arrayList = new ArrayList();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!A0.contains(((iss) next).a)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() != c.size()) {
                it0 it0Var = (it0) this.i.b;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                it0Var.a("SP_Trying_Remove_Downloading_Track", e5bVar);
            }
            List o0 = CollectionsKt.o0(c, new t1n(11));
            ArrayList arrayList2 = new ArrayList(v75.o(o0, 10));
            Iterator it2 = o0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((iss) it2.next()).a);
            }
            return b(CollectionsKt.L(CollectionsKt.w0(CollectionsKt.z0(arrayList2)), i));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final Collection b(Collection collection) {
        String a = this.n.a();
        a.getClass();
        ssg.a(3, "TracksCacheRepositoryImpl", "deleteTracksImpl() - " + collection, null);
        if (collection.isEmpty()) {
            return c5b.a;
        }
        ArrayList H = CollectionsKt.H(collection, 999);
        ArrayList arrayList = new ArrayList();
        Iterator it = H.iterator();
        while (it.hasNext()) {
            ArrayList a2 = this.a.a(a, (List) it.next());
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((Boolean) ((iss) next).f.b.getValue()).booleanValue()) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((iss) it3.next()).a.a);
            }
            this.b.m(arrayList3);
            z75.t(arrayList, a2);
        }
        if (!arrayList.isEmpty()) {
            this.c.execute(new xlr(7, arrayList, this));
        }
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((iss) it4.next()).a);
        }
        return CollectionsKt.w0(CollectionsKt.z0(arrayList4));
    }

    public final r3t c() {
        ArrayList arrayList;
        List a = this.d.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        String a2 = this.n.a();
        a2.getClass();
        ArrayList c = this.a.c(a2);
        ArrayList arrayList6 = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (a.contains(((iss) next).c)) {
                arrayList6.add(next);
            }
        }
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            iss issVar = (iss) it2.next();
            int ordinal = issVar.f.ordinal();
            if (ordinal == 0) {
                arrayList = arrayList2;
            } else if (ordinal == 1) {
                arrayList = arrayList4;
            } else if (ordinal == 2) {
                arrayList = arrayList5;
            } else {
                if (ordinal != 3 && ordinal != 4) {
                    b6e.s();
                    return null;
                }
                arrayList = arrayList3;
            }
            arrayList.add(issVar);
        }
        arrayList3.addAll(arrayList4);
        arrayList3.addAll(arrayList5);
        ArrayList arrayList7 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList7.add(((iss) it3.next()).a);
        }
        List<iss> o0 = CollectionsKt.o0(arrayList3, new t1n(12));
        ArrayList arrayList8 = new ArrayList(v75.o(o0, 10));
        for (iss issVar2 : o0) {
            arrayList8.add(new nq3(issVar2.a, issVar2.g, issVar2.f, issVar2.b, issVar2.c));
        }
        List o02 = CollectionsKt.o0(arrayList2, new t1n(13));
        ArrayList arrayList9 = new ArrayList(v75.o(o02, 10));
        Iterator it4 = o02.iterator();
        while (it4.hasNext()) {
            arrayList9.add(((iss) it4.next()).a);
        }
        Set A0 = CollectionsKt.A0(arrayList7);
        Set A02 = CollectionsKt.A0(arrayList9);
        ArrayList arrayList10 = new ArrayList(v75.o(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList10.add(((iss) it5.next()).a);
        }
        Set A03 = CollectionsKt.A0(arrayList10);
        ArrayList arrayList11 = new ArrayList(v75.o(arrayList5, 10));
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            arrayList11.add(((iss) it6.next()).a);
        }
        return new r3t(A0, arrayList8, A02, A03, CollectionsKt.A0(arrayList11));
    }

    public final long d(css... cssVarArr) {
        List a = this.d.a();
        String a2 = this.n.a();
        a2.getClass();
        ArrayList c = this.a.c(a2);
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            iss issVar = (iss) next;
            if (a.contains(issVar.c) && xz0.u(cssVarArr, issVar.f)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += hag.m(this.m, (iss) it2.next());
        }
        return j;
    }

    public final iss e(zvs zvsVar) {
        Object next;
        String a = this.n.a();
        a.getClass();
        ArrayList d = this.a.d(zvsVar, a);
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (((iss) next2).f.b()) {
                arrayList.add(next2);
            }
        }
        Iterator it2 = arrayList.iterator();
        Object obj = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long j = ((iss) next).g;
                do {
                    Object next3 = it2.next();
                    long j2 = ((iss) next3).g;
                    if (j < j2) {
                        next = next3;
                        j = j2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        iss issVar = (iss) next;
        if (issVar != null) {
            return issVar;
        }
        Iterator it3 = d.iterator();
        if (it3.hasNext()) {
            obj = it3.next();
            if (it3.hasNext()) {
                long j3 = ((iss) obj).g;
                do {
                    Object next4 = it3.next();
                    long j4 = ((iss) next4).g;
                    if (j3 < j4) {
                        obj = next4;
                        j3 = j4;
                    }
                } while (it3.hasNext());
            }
        }
        return (iss) obj;
    }

    public final long f(zvs zvsVar) {
        List a = this.d.a();
        String a2 = this.n.a();
        a2.getClass();
        ArrayList d = this.a.d(zvsVar, a2);
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (a.contains(((iss) next).c)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += hag.m(this.m, (iss) it2.next());
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(iss issVar) {
        p9 dtsVar;
        p9 p9Var;
        File e;
        liq liqVar;
        ika ovmVar;
        gnh gnhVar;
        gnh gnhVar2;
        zvs zvsVar = issVar.a;
        String str = issVar.e;
        o5n o5nVar = issVar.b;
        thr thrVar = issVar.c;
        int ordinal = issVar.d.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            dtsVar = new dts(str);
        } else {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                p9Var = leu.L(str);
                ets etsVar = ets.d;
                zvsVar.getClass();
                o5nVar.getClass();
                thrVar.getClass();
                etsVar.getClass();
                niq niqVar = this.e;
                niqVar.getClass();
                uhr uhrVar = niqVar.b;
                String b = uhrVar.b();
                e = uhrVar.e(thrVar, b);
                if (e != null) {
                    liqVar = null;
                } else {
                    liqVar = (liq) niqVar.c.get(e);
                    if (liqVar == null) {
                        liqVar = niqVar.a(e, thrVar, b);
                    }
                }
                if (liqVar != null) {
                    ovmVar = null;
                } else {
                    ip3 ip3Var = new ip3();
                    ip3Var.a = liqVar;
                    int ordinal2 = ((bb6) p9Var.a).ordinal();
                    vp3 vp3Var = vp3.R;
                    if (ordinal2 != 0) {
                        if (ordinal2 == 1) {
                            vp3Var = b3i.f;
                        } else if (ordinal2 != 2) {
                            b6e.s();
                            return;
                        }
                    }
                    ip3Var.d = vp3Var;
                    if (p9Var instanceof dts) {
                        xmh xmhVar = new xmh();
                        bnh bnhVar = new bnh();
                        List list = Collections.EMPTY_LIST;
                        qsn qsnVar = qsn.e;
                        dnh dnhVar = new dnh();
                        jnh jnhVar = jnh.d;
                        Uri fromParts = Uri.fromParts("dummy", "downloader", null);
                        String str2 = ((dts) p9Var).b;
                        if (((Uri) bnhVar.e) != null && ((UUID) bnhVar.d) == null) {
                            z = false;
                        }
                        vq1.A(z);
                        if (fromParts != null) {
                            gnhVar2 = new gnh(fromParts, null, ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null, null, list, str2, qsnVar, -9223372036854775807L);
                        } else {
                            gnhVar2 = null;
                        }
                        ovmVar = new ovm(new onh("", new anh(xmhVar), gnhVar2, new fnh(dnhVar), hoh.K, jnhVar), ip3Var);
                    } else if (p9Var instanceof cts) {
                        wmh wmhVar = new wmh();
                        wmhVar.e = ((cts) p9Var).b;
                        wmhVar.b(dqb.a);
                        ovmVar = new mzd(wmhVar.a(), ip3Var);
                    } else {
                        if (!(p9Var instanceof bts)) {
                            b6e.s();
                            return;
                        }
                        xmh xmhVar2 = new xmh();
                        bnh bnhVar2 = new bnh();
                        List list2 = Collections.EMPTY_LIST;
                        qsn qsnVar2 = qsn.e;
                        dnh dnhVar2 = new dnh();
                        jnh jnhVar2 = jnh.d;
                        Uri uri = ((bts) p9Var).b;
                        if (((Uri) bnhVar2.e) != null && ((UUID) bnhVar2.d) == null) {
                            z = false;
                        }
                        vq1.A(z);
                        if (uri != null) {
                            gnhVar = new gnh(uri, null, ((UUID) bnhVar2.d) != null ? new cnh(bnhVar2) : null, null, list2, null, qsnVar2, -9223372036854775807L);
                        } else {
                            gnhVar = null;
                        }
                        ovmVar = new ovm(new onh("", new anh(xmhVar2), gnhVar, new fnh(dnhVar2), hoh.K, jnhVar2), ip3Var);
                    }
                }
                if (ovmVar == null) {
                    try {
                        ovmVar.remove();
                        return;
                    } catch (IllegalStateException e2) {
                        ssg.a(7, "TracksCacheRepositoryImpl", "launchRemoveTrackFiles illegal state error", e2);
                        return;
                    }
                }
                ssg.a(7, "TracksCacheRepositoryImpl", "launchRemoveTrackFiles - storage was not available for " + issVar.a + ", " + thrVar, null);
                return;
            }
            Uri N = ldg.N(str);
            N.getClass();
            dtsVar = new cts(N);
        }
        p9Var = dtsVar;
        ets etsVar2 = ets.d;
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        etsVar2.getClass();
        niq niqVar2 = this.e;
        niqVar2.getClass();
        uhr uhrVar2 = niqVar2.b;
        String b2 = uhrVar2.b();
        e = uhrVar2.e(thrVar, b2);
        if (e != null) {
        }
        if (liqVar != null) {
        }
        if (ovmVar == null) {
        }
    }

    public final void h(String str, boolean z, bzf bzfVar) {
        Long valueOf;
        yfx yfxVar = this.b;
        w62 w62Var = (w62) yfxVar.b;
        frt frtVar = (frt) yfxVar.c;
        if (!z) {
            str.getClass();
            xdr xdrVar = saa.a;
            String str2 = frtVar.c().a;
            str2.getClass();
            ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "delete by id " + str + " for user " + str2, null);
            w62Var.b(str2, t75.c(str));
            return;
        }
        if (bzfVar instanceof pjs) {
            valueOf = null;
        } else {
            if (!(bzfVar instanceof qjs)) {
                b6e.s();
                return;
            }
            valueOf = Long.valueOf(((qjs) bzfVar).b);
        }
        if (valueOf == null) {
            dfi.r("timestamp for auto Cache must be not null", "TracksCacheRepositoryImpl");
            return;
        }
        x62 x62Var = new x62(valueOf.longValue());
        y62 y62Var = new y62(str, x62Var);
        xdr xdrVar2 = saa.a;
        String str3 = frtVar.c().a;
        str3.getClass();
        ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "insert " + y62Var + " id  for user " + str3, null);
        hb2 a = w62Var.a(str3);
        ib2 ib2Var = new ib2(str, x62Var);
        a.getClass();
        up6.F(a.a, false, true, new kc(28, a, ib2Var));
    }
}
