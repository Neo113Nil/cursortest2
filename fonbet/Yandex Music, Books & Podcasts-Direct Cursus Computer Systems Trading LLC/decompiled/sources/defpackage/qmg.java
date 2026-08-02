package defpackage;

import io.appmetrica.analytics.AppMetrica;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qmg implements jmg {
    public final q8n b;
    public final oq7 c;
    public final umg d;
    public rar e;
    public final String f;
    public omg g;
    public omg h;
    public omg i;
    public omg j;
    public String k;
    public String l;
    public sqw m;
    public sqw n;
    public sqw o;
    public final Object p;

    public qmg(q8n q8nVar, oq7 oq7Var, umg umgVar) {
        q8nVar.getClass();
        oq7Var.getClass();
        umgVar.getClass();
        this.b = q8nVar;
        this.c = oq7Var;
        this.d = umgVar;
        this.f = eta.e();
        lmg lmgVar = lmg.a;
        this.g = lmgVar;
        this.h = lmgVar;
        this.i = lmgVar;
        this.j = lmgVar;
        this.k = "unknown";
        this.l = "unknown";
        this.p = new Object();
        if (umgVar.c()) {
            ox6.B(new ifd(oq7Var.a.c, 23), cmd.a, new otd(22, this));
        }
    }

    public static String a(sqw sqwVar) {
        if (!(sqwVar instanceof pqw)) {
            if (sqwVar instanceof rqw) {
                return "Raw";
            }
            b6e.s();
            return null;
        }
        f5q k = ((pqw) sqwVar).b.k();
        if (k instanceof abq) {
            return "wave";
        }
        if (k instanceof xaq) {
            return "common";
        }
        if (k instanceof baq) {
            return "generative";
        }
        if (k instanceof taq) {
            return "video_wave";
        }
        if ((k instanceof o9q) || (k instanceof p9q) || (k instanceof q9q) || (k instanceof r9q)) {
            return "common";
        }
        if (k instanceof oaq) {
            return "unknown";
        }
        b6e.s();
        return null;
    }

    public final void b(t1f t1fVar) {
        t1fVar.getClass();
        if (this.i instanceof mmg) {
            if (!this.d.a()) {
                Long l = (Long) t1fVar.c;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = (Long) t1fVar.b;
                    if (l2 != null) {
                        long longValue2 = longValue - l2.longValue();
                        xmg xmgVar = (xmg) t1fVar.d;
                        if (xmgVar == null) {
                            return;
                        }
                        img imgVar = xmgVar.a;
                        String str = xmgVar.c;
                        this.i = new kmg(longValue2, imgVar, str);
                        if (!this.d.b()) {
                            k(longValue2, imgVar, str);
                            if ((this.g instanceof mmg) && (this.i instanceof kmg) && (this.h instanceof kmg)) {
                                this.g = new kmg(longValue2, imgVar, str);
                                q();
                                return;
                            }
                            return;
                        }
                        if (this.g instanceof mmg) {
                            k(longValue2, imgVar, str);
                            if ((this.i instanceof kmg) && (this.h instanceof kmg)) {
                                this.g = new kmg(longValue2, imgVar, str);
                                q();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            synchronized (this.p) {
                try {
                    if (this.i instanceof mmg) {
                        Long l3 = (Long) t1fVar.c;
                        if (l3 == null) {
                            return;
                        }
                        long longValue3 = l3.longValue();
                        Long l4 = (Long) t1fVar.b;
                        if (l4 == null) {
                            return;
                        }
                        long longValue4 = longValue3 - l4.longValue();
                        xmg xmgVar2 = (xmg) t1fVar.d;
                        if (xmgVar2 == null) {
                            return;
                        }
                        img imgVar2 = xmgVar2.a;
                        String str2 = xmgVar2.c;
                        this.i = new kmg(longValue4, imgVar2, str2);
                        if (!this.d.b()) {
                            k(longValue4, imgVar2, str2);
                            if ((this.g instanceof mmg) && (this.i instanceof kmg) && (this.h instanceof kmg)) {
                                this.g = new kmg(longValue4, imgVar2, str2);
                                q();
                            }
                        } else if (this.g instanceof mmg) {
                            k(longValue4, imgVar2, str2);
                            if ((this.i instanceof kmg) && (this.h instanceof kmg)) {
                                this.g = new kmg(longValue4, imgVar2, str2);
                                q();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(t1f t1fVar) {
        if (this.i instanceof lmg) {
            if (!this.d.a()) {
                long currentTimeMillis = System.currentTimeMillis();
                Long l = (Long) t1fVar.b;
                this.i = new mmg(l != null ? l.longValue() : currentTimeMillis);
                if (this.g instanceof lmg) {
                    this.g = new mmg(currentTimeMillis);
                    p();
                    return;
                }
                return;
            }
            synchronized (this.p) {
                try {
                    if (this.i instanceof lmg) {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Long l2 = (Long) t1fVar.b;
                        this.i = new mmg(l2 != null ? l2.longValue() : currentTimeMillis2);
                        if (this.g instanceof lmg) {
                            this.g = new mmg(currentTimeMillis2);
                            p();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d(t1f t1fVar) {
        if (this.i instanceof mmg) {
            if (!this.d.a()) {
                Long l = (Long) t1fVar.c;
                if (l != null) {
                    long longValue = l.longValue();
                    Long l2 = (Long) t1fVar.b;
                    if (l2 != null) {
                        long longValue2 = longValue - l2.longValue();
                        this.i = new nmg("storage", longValue2);
                        if (this.d.c()) {
                            this.h = imp.g;
                        }
                        omg omgVar = this.g;
                        if (omgVar instanceof mmg) {
                            v();
                            this.g = new nmg("storage", System.currentTimeMillis() - ((mmg) omgVar).a);
                            l(longValue2);
                            r();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            synchronized (this.p) {
                try {
                    if (this.i instanceof mmg) {
                        Long l3 = (Long) t1fVar.c;
                        if (l3 == null) {
                            return;
                        }
                        long longValue3 = l3.longValue();
                        Long l4 = (Long) t1fVar.b;
                        if (l4 == null) {
                            return;
                        }
                        long longValue4 = longValue3 - l4.longValue();
                        this.i = new nmg("storage", longValue4);
                        if (this.d.c()) {
                            this.h = imp.g;
                        }
                        omg omgVar2 = this.g;
                        if (omgVar2 instanceof mmg) {
                            v();
                            this.g = new nmg("storage", System.currentTimeMillis() - ((mmg) omgVar2).a);
                            l(longValue4);
                            r();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(img imgVar, String str) {
        omg omgVar = this.j;
        if (omgVar instanceof mmg) {
            if (!this.d.a()) {
                this.j = new kmg(System.currentTimeMillis() - ((mmg) omgVar).a, imgVar, str);
                m();
                this.j = lmg.a;
                return;
            }
            synchronized (this.p) {
                omg omgVar2 = this.j;
                if (omgVar2 instanceof mmg) {
                    this.j = new kmg(System.currentTimeMillis() - ((mmg) omgVar2).a, imgVar, str);
                    m();
                    this.j = lmg.a;
                }
            }
        }
    }

    public final void f() {
        if (this.j instanceof lmg) {
            if (!this.d.a()) {
                this.j = new mmg(System.currentTimeMillis());
                n();
                return;
            }
            synchronized (this.p) {
                if (this.j instanceof lmg) {
                    this.j = new mmg(System.currentTimeMillis());
                    n();
                }
            }
        }
    }

    public final void g() {
        omg omgVar = this.j;
        if (omgVar instanceof mmg) {
            if (!this.d.a()) {
                this.j = new nmg("storage", System.currentTimeMillis() - ((mmg) omgVar).a);
                o();
                this.j = lmg.a;
                return;
            }
            synchronized (this.p) {
                omg omgVar2 = this.j;
                if (omgVar2 instanceof mmg) {
                    this.j = new nmg("storage", System.currentTimeMillis() - ((mmg) omgVar2).a);
                    o();
                    this.j = lmg.a;
                }
            }
        }
    }

    public final void h(img imgVar, String str) {
        omg omgVar = this.h;
        if (omgVar instanceof mmg) {
            if (!this.d.a()) {
                long currentTimeMillis = System.currentTimeMillis() - ((mmg) omgVar).a;
                this.h = new kmg(currentTimeMillis, imgVar, str);
                if (!this.d.b()) {
                    s();
                    if ((this.g instanceof mmg) && (this.i instanceof kmg) && (this.h instanceof kmg)) {
                        this.g = new kmg(currentTimeMillis, imgVar, str);
                        q();
                        return;
                    }
                    return;
                }
                if (this.g instanceof mmg) {
                    s();
                    if ((this.i instanceof kmg) && (this.h instanceof kmg)) {
                        this.g = new kmg(currentTimeMillis, imgVar, str);
                        q();
                        return;
                    }
                    return;
                }
                return;
            }
            synchronized (this.p) {
                try {
                    omg omgVar2 = this.h;
                    if (omgVar2 instanceof mmg) {
                        long currentTimeMillis2 = System.currentTimeMillis() - ((mmg) omgVar2).a;
                        this.h = new kmg(currentTimeMillis2, imgVar, str);
                        if (!this.d.b()) {
                            s();
                            if ((this.g instanceof mmg) && (this.i instanceof kmg) && (this.h instanceof kmg)) {
                                this.g = new kmg(currentTimeMillis2, imgVar, str);
                                q();
                            }
                        } else if (this.g instanceof mmg) {
                            s();
                            if ((this.i instanceof kmg) && (this.h instanceof kmg)) {
                                this.g = new kmg(currentTimeMillis2, imgVar, str);
                                q();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i() {
        if (this.h instanceof lmg) {
            if (!this.d.a()) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = new mmg(currentTimeMillis);
                if (this.g instanceof lmg) {
                    this.g = new mmg(currentTimeMillis);
                    p();
                    return;
                }
                return;
            }
            synchronized (this.p) {
                if (this.h instanceof lmg) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.h = new mmg(currentTimeMillis2);
                    if (this.g instanceof lmg) {
                        this.g = new mmg(currentTimeMillis2);
                        p();
                    }
                }
            }
        }
    }

    public final void j() {
        omg omgVar = this.h;
        if (omgVar instanceof mmg) {
            if (!this.d.a()) {
                long currentTimeMillis = System.currentTimeMillis() - ((mmg) omgVar).a;
                this.h = new nmg("ynison", currentTimeMillis);
                if (this.d.c()) {
                    this.i = imp.g;
                }
                if (!this.d.b()) {
                    t();
                    if (this.g instanceof mmg) {
                        v();
                        this.g = new nmg("ynison", currentTimeMillis);
                        r();
                        return;
                    }
                    return;
                }
                omg omgVar2 = this.g;
                if (omgVar2 instanceof mmg) {
                    v();
                    this.g = new nmg("ynison", System.currentTimeMillis() - ((mmg) omgVar2).a);
                    t();
                    r();
                    return;
                }
                return;
            }
            synchronized (this.p) {
                try {
                    omg omgVar3 = this.h;
                    if (omgVar3 instanceof mmg) {
                        long currentTimeMillis2 = System.currentTimeMillis() - ((mmg) omgVar3).a;
                        this.h = new nmg("ynison", currentTimeMillis2);
                        if (this.d.c()) {
                            this.i = imp.g;
                        }
                        if (this.d.b()) {
                            omg omgVar4 = this.g;
                            if (omgVar4 instanceof mmg) {
                                v();
                                this.g = new nmg("ynison", System.currentTimeMillis() - ((mmg) omgVar4).a);
                                t();
                                r();
                            }
                        } else {
                            t();
                            if (this.g instanceof mmg) {
                                v();
                                this.g = new nmg("ynison", currentTimeMillis2);
                                r();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void k(long j, img imgVar, String str) {
        String str2 = imgVar.a;
        img imgVar2 = img.CANCEL;
        String str3 = this.f;
        hmg hmgVar = jmg.a;
        if (imgVar == imgVar2) {
            hmgVar.getClass();
            u("RESTORE_CANCEL", uah.e(new Pair("uuid", str3), new Pair("reason", this.k), new Pair("time", Long.valueOf(j)), new Pair("source", "storage"), new Pair("errorType", str2), new Pair("errorDescription", str)));
        } else {
            hmgVar.getClass();
            u("RESTORE_STORAGE_ERROR", uah.e(new Pair("uuid", str3), new Pair("reason", this.k), new Pair("time", Long.valueOf(j)), new Pair("errorType", str2), new Pair("errorDescription", str)));
        }
    }

    public final void l(long j) {
        jmg.a.getClass();
        Pair pair = new Pair("uuid", this.f);
        Pair pair2 = new Pair("reason", this.k);
        Pair pair3 = new Pair("time", Long.valueOf(j));
        sqw sqwVar = this.m;
        u("RESTORE_STORAGE_SUCCESS", uah.e(pair, pair2, pair3, new Pair("queueType", (sqwVar == null && (sqwVar = this.n) == null) ? "unknown" : a(sqwVar)), new Pair("source", "storage")));
    }

    public final void m() {
        jmg.a.getClass();
        Pair pair = new Pair("uuid", this.f);
        Pair pair2 = new Pair("reason", this.l);
        omg omgVar = this.j;
        kmg kmgVar = omgVar instanceof kmg ? (kmg) omgVar : null;
        Pair pair3 = new Pair("time", kmgVar != null ? Long.valueOf(kmgVar.b) : null);
        omg omgVar2 = this.j;
        boolean z = omgVar2 instanceof kmg;
        kmg kmgVar2 = z ? (kmg) omgVar2 : null;
        Pair pair4 = new Pair("errorType", kmgVar2 != null ? kmgVar2.a.a : null);
        kmg kmgVar3 = z ? (kmg) omgVar2 : null;
        u("RESTORE_SAVE_ERROR", uah.e(pair, pair2, pair3, pair4, new Pair("errorDescription", kmgVar3 != null ? kmgVar3.c : null)));
    }

    public final void n() {
        jmg.a.getClass();
        u("RESTORE_SAVE_START", uah.e(new Pair("uuid", this.f), new Pair("reason", this.l)));
    }

    public final void o() {
        jmg.a.getClass();
        Pair pair = new Pair("uuid", this.f);
        Pair pair2 = new Pair("reason", this.l);
        omg omgVar = this.j;
        nmg nmgVar = omgVar instanceof nmg ? (nmg) omgVar : null;
        Pair pair3 = new Pair("time", nmgVar != null ? Long.valueOf(nmgVar.b) : null);
        sqw sqwVar = this.o;
        u("RESTORE_SAVE_SUCCESS", uah.e(pair, pair2, pair3, new Pair("queueType", sqwVar != null ? a(sqwVar) : null)));
    }

    public final void p() {
        jmg.a.getClass();
        u("RESTORE_START", uah.e(new Pair("uuid", this.f), new Pair("reason", this.k)));
    }

    public final void q() {
        omg omgVar = this.g;
        kmg kmgVar = omgVar instanceof kmg ? (kmg) omgVar : null;
        img imgVar = kmgVar != null ? kmgVar.a : null;
        String str = "storage";
        if (!(this.i instanceof kmg) && (this.h instanceof kmg)) {
            str = "ynison";
        }
        if (imgVar == img.CANCEL) {
            return;
        }
        img imgVar2 = img.NO_STATE;
        String str2 = this.f;
        hmg hmgVar = jmg.a;
        if (imgVar == imgVar2) {
            hmgVar.getClass();
            u("RESTORE_READY_SUCCESS", uah.e(new Pair("uuid", str2), new Pair("reason", this.k), new Pair("time", Long.valueOf(kmgVar.b)), new Pair("source", str), new Pair("errorType", imgVar.a), new Pair("errorDescription", kmgVar.c), new Pair("queueType", "absent")));
            return;
        }
        hmgVar.getClass();
        Pair pair = new Pair("uuid", str2);
        Pair pair2 = new Pair("reason", this.k);
        if (kmgVar == null) {
            kmgVar = null;
        }
        Pair pair3 = new Pair("time", kmgVar != null ? Long.valueOf(kmgVar.b) : null);
        omg omgVar2 = this.i;
        boolean z = omgVar2 instanceof kmg;
        kmg kmgVar2 = z ? (kmg) omgVar2 : null;
        Pair pair4 = new Pair("storageErrorType", kmgVar2 != null ? kmgVar2.a.a : null);
        omg omgVar3 = this.h;
        boolean z2 = omgVar3 instanceof kmg;
        kmg kmgVar3 = z2 ? (kmg) omgVar3 : null;
        Pair pair5 = new Pair("ynisonErrorType", kmgVar3 != null ? kmgVar3.a.a : null);
        kmg kmgVar4 = z2 ? (kmg) omgVar3 : null;
        Pair pair6 = new Pair("ynisonErrorDescription", kmgVar4 != null ? kmgVar4.c : null);
        kmg kmgVar5 = z ? (kmg) omgVar2 : null;
        u("RESTORE_READY_ERROR", uah.e(pair, pair2, pair3, pair4, pair5, pair6, new Pair("storageErrorDescription", kmgVar5 != null ? kmgVar5.c : null)));
    }

    public final void r() {
        jmg.a.getClass();
        Pair pair = new Pair("uuid", this.f);
        Pair pair2 = new Pair("reason", this.k);
        omg omgVar = this.g;
        nmg nmgVar = omgVar instanceof nmg ? (nmg) omgVar : null;
        Pair pair3 = new Pair("time", nmgVar != null ? Long.valueOf(nmgVar.b) : null);
        omg omgVar2 = this.g;
        nmg nmgVar2 = omgVar2 instanceof nmg ? (nmg) omgVar2 : null;
        Pair pair4 = new Pair("source", nmgVar2 != null ? nmgVar2.a : null);
        sqw sqwVar = this.m;
        u("RESTORE_READY_SUCCESS", uah.e(pair, pair2, pair3, pair4, new Pair("queueType", (sqwVar == null && (sqwVar = this.n) == null) ? "unknown" : a(sqwVar))));
    }

    public final void s() {
        String str = this.f;
        hmg hmgVar = jmg.a;
        omg omgVar = this.h;
        kmg kmgVar = omgVar instanceof kmg ? (kmg) omgVar : null;
        img imgVar = kmgVar != null ? kmgVar.a : null;
        if (imgVar == img.CANCEL) {
            hmgVar.getClass();
            u("RESTORE_CANCEL", uah.e(new Pair("uuid", str), new Pair("reason", this.k), new Pair("time", Long.valueOf(kmgVar.b)), new Pair("source", "ynison"), new Pair("errorType", imgVar.a), new Pair("errorDescription", kmgVar.c)));
            return;
        }
        if (imgVar == img.NO_STATE) {
            this.d.a.a().getClass();
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((egp) ((byb) qdcVar.C(I)).b(egp.class)).h()) {
                hmgVar.getClass();
                u("RESTORE_YNISON_SUCCESS", uah.e(new Pair("uuid", str), new Pair("reason", this.k), new Pair("time", Long.valueOf(kmgVar.b)), new Pair("source", "ynison"), new Pair("errorType", imgVar.a), new Pair("errorDescription", kmgVar.c), new Pair("queueType", "absent")));
                return;
            }
        }
        hmgVar.getClass();
        u("RESTORE_YNISON_ERROR", uah.e(new Pair("uuid", str), new Pair("reason", this.k), new Pair("time", kmgVar != null ? Long.valueOf(kmgVar.b) : null), new Pair("errorType", kmgVar != null ? kmgVar.a.a : null), new Pair("errorDescription", kmgVar != null ? kmgVar.c : null)));
    }

    public final void t() {
        jmg.a.getClass();
        Pair pair = new Pair("uuid", this.f);
        Pair pair2 = new Pair("reason", this.k);
        omg omgVar = this.h;
        nmg nmgVar = omgVar instanceof nmg ? (nmg) omgVar : null;
        Pair pair3 = new Pair("time", nmgVar != null ? Long.valueOf(nmgVar.b) : null);
        sqw sqwVar = this.n;
        u("RESTORE_YNISON_SUCCESS", uah.e(pair, pair2, pair3, new Pair("queueType", (sqwVar == null && (sqwVar = this.m) == null) ? "unknown" : a(sqwVar))));
    }

    public final void u(String str, Map map) {
        jmg.a.getClass();
        if (!hmg.b.contains(str)) {
            ssg.a(4, "LocalQueueAnalytics", "skip sending event ".concat(str), null);
            return;
        }
        List r = wah.r(map);
        ssg.a(4, "LocalQueueAnalytics", hrg.r("sendEvent ", str, "  = ", r != null ? CollectionsKt.X(r, null, null, null, h01.n, 31) : null), null);
        q8n q8nVar = this.b;
        q8nVar.getClass();
        ((n80) q8nVar.a.g.getValue()).getClass();
        AppMetrica.reportEvent(str, (Map<String, Object>) map);
    }

    public final void v() {
        omg omgVar = this.g;
        if (!(omgVar instanceof mmg)) {
            return;
        }
        Continuation continuation = null;
        if (!this.d.a()) {
            mmg mmgVar = (mmg) omgVar;
            rar rarVar = this.e;
            if (rarVar != null) {
                rarVar.g(null);
            }
            this.e = x97.y(cmd.a, dm6.b, null, new mj0(this, mmgVar.a, continuation, 4), 2);
            return;
        }
        synchronized (this.p) {
            try {
                omg omgVar2 = this.g;
                if (omgVar2 instanceof mmg) {
                    mmg mmgVar2 = (mmg) omgVar2;
                    rar rarVar2 = this.e;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                    long j = mmgVar2.a;
                    try {
                        this.e = x97.y(cmd.a, dm6.b, null, new mj0(this, j, continuation, 4), 2);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
