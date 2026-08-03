package q4;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import dd.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o4.d;
import o4.o;
import p4.c;
import p4.g;
import p4.n;
import x4.j;
import x4.l;
import x4.p;
import y4.k;
import y4.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements g, t4.b, c {

    /* renamed from: p, reason: collision with root package name */
    public static final String f5807p = o.f("GreedyScheduler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f5808g;

    /* renamed from: h, reason: collision with root package name */
    public final n f5809h;

    /* renamed from: i, reason: collision with root package name */
    public final a5.c f5810i;

    /* renamed from: k, reason: collision with root package name */
    public final a f5812k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5813l;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f5816o;

    /* renamed from: j, reason: collision with root package name */
    public final HashSet f5811j = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final l f5815n = new l(7);

    /* renamed from: m, reason: collision with root package name */
    public final Object f5814m = new Object();

    public b(Context context, o4.b bVar, x4.n nVar, n nVar2) {
        this.f5808g = context;
        this.f5809h = nVar2;
        this.f5810i = new a5.c(nVar, this);
        this.f5812k = new a(this, bVar.f5189e);
    }

    @Override // p4.g
    public final void a(p... pVarArr) {
        if (this.f5816o == null) {
            this.f5816o = Boolean.valueOf(k.a(this.f5808g, this.f5809h.f5494b));
        }
        if (!this.f5816o.booleanValue()) {
            o.d().e(f5807p, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f5813l) {
            this.f5809h.f5498f.a(this);
            this.f5813l = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.f5815n.d(ud.g.h(pVar))) {
                long a6 = pVar.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f8323b == 1) {
                    if (currentTimeMillis < a6) {
                        a aVar = this.f5812k;
                        if (aVar != null) {
                            m7.g gVar = aVar.f5805b;
                            HashMap hashMap = aVar.f5806c;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f8322a);
                            if (runnable != null) {
                                ((Handler) gVar.f4957h).removeCallbacks(runnable);
                            }
                            i iVar = new i(20, aVar, pVar);
                            hashMap.put(pVar.f8322a, iVar);
                            ((Handler) gVar.f4957h).postDelayed(iVar, pVar.a() - System.currentTimeMillis());
                        }
                    } else if (pVar.b()) {
                        d dVar = pVar.f8331j;
                        if (dVar.f5198c) {
                            o.d().a(f5807p, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (dVar.f5203h.isEmpty()) {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f8322a);
                        } else {
                            o.d().a(f5807p, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f5815n.d(ud.g.h(pVar))) {
                        o.d().a(f5807p, "Starting work for " + pVar.f8322a);
                        n nVar = this.f5809h;
                        l lVar = this.f5815n;
                        lVar.getClass();
                        nVar.e(lVar.o(ud.g.h(pVar)), null);
                    }
                }
            }
        }
        synchronized (this.f5814m) {
            try {
                if (!hashSet.isEmpty()) {
                    o.d().a(f5807p, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.f5811j.addAll(hashSet);
                    this.f5810i.G(this.f5811j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p4.c
    public final void b(j jVar, boolean z10) {
        this.f5815n.m(jVar);
        synchronized (this.f5814m) {
            try {
                Iterator it = this.f5811j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (ud.g.h(pVar).equals(jVar)) {
                        o.d().a(f5807p, "Stopping tracking for " + jVar);
                        this.f5811j.remove(pVar);
                        this.f5810i.G(this.f5811j);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p4.g
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f5816o;
        n nVar = this.f5809h;
        if (bool == null) {
            this.f5816o = Boolean.valueOf(k.a(this.f5808g, nVar.f5494b));
        }
        boolean booleanValue = this.f5816o.booleanValue();
        String str2 = f5807p;
        if (!booleanValue) {
            o.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f5813l) {
            nVar.f5498f.a(this);
            this.f5813l = true;
        }
        o.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f5812k;
        if (aVar != null && (runnable = (Runnable) aVar.f5806c.remove(str)) != null) {
            ((Handler) aVar.f5805b.f4957h).removeCallbacks(runnable);
        }
        Iterator it = this.f5815n.l(str).iterator();
        while (it.hasNext()) {
            nVar.f5496d.a(new m(nVar, (p4.i) it.next(), false));
        }
    }

    @Override // t4.b
    public final void d(ArrayList arrayList) {
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j h10 = ud.g.h((p) obj);
            o.d().a(f5807p, "Constraints not met: Cancelling work ID " + h10);
            p4.i m10 = this.f5815n.m(h10);
            if (m10 != null) {
                n nVar = this.f5809h;
                nVar.f5496d.a(new m(nVar, m10, false));
            }
        }
    }

    @Override // t4.b
    public final void e(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j h10 = ud.g.h((p) obj);
            l lVar = this.f5815n;
            if (!lVar.d(h10)) {
                o.d().a(f5807p, "Constraints met: Scheduling work ID " + h10);
                this.f5809h.e(lVar.o(h10), null);
            }
        }
    }

    @Override // p4.g
    public final boolean f() {
        return false;
    }
}
