package com.gamericefishpro.space.n6;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.m.d;
import com.gamericefishpro.space.m6.c;
import com.gamericefishpro.space.m6.h;
import com.gamericefishpro.space.m6.j;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.u6.e;
import com.gamericefishpro.space.u6.i;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.v6.k;
import com.gamericefishpro.space.v6.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h, com.gamericefishpro.space.q6.b, c {
    public Boolean B;
    public final Context d;
    public final o e;
    public final com.gamericefishpro.space.a8.c i;
    public final a w;
    public boolean y;
    public final HashSet v = new HashSet();
    public final e A = new e(6);
    public final Object z = new Object();

    static {
        q.d("GreedyScheduler");
    }

    public b(Context context, com.gamericefishpro.space.l6.c cVar, i iVar, o oVar) {
        this.d = context;
        this.e = oVar;
        this.i = new com.gamericefishpro.space.a8.c(iVar, this);
        this.w = new a(this, cVar.e);
    }

    @Override // com.gamericefishpro.space.m6.h
    public final void a(p... pVarArr) {
        if (this.B == null) {
            this.B = Boolean.valueOf(k.a(this.d, this.e.b));
        }
        if (!this.B.booleanValue()) {
            q.c().getClass();
            return;
        }
        if (!this.y) {
            this.e.f.a(this);
            this.y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p spec : pVarArr) {
            if (!this.A.d(a4.y(spec))) {
                long jA = spec.a();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (spec.b == y.d) {
                    if (jCurrentTimeMillis < jA) {
                        a aVar = this.w;
                        if (aVar != null) {
                            d dVar = aVar.b;
                            HashMap map = aVar.c;
                            Runnable runnable = (Runnable) map.remove(spec.a);
                            if (runnable != null) {
                                ((Handler) dVar.e).removeCallbacks(runnable);
                            }
                            com.gamericefishpro.space.va.a aVar2 = new com.gamericefishpro.space.va.a(7, aVar, spec, false);
                            map.put(spec.a, aVar2);
                            ((Handler) dVar.e).postDelayed(aVar2, spec.a() - System.currentTimeMillis());
                        }
                    } else if (spec.b()) {
                        com.gamericefishpro.space.l6.e eVar = spec.j;
                        if (eVar.c) {
                            q qVarC = q.c();
                            spec.toString();
                            qVarC.getClass();
                        } else if (eVar.h.isEmpty()) {
                            hashSet.add(spec);
                            hashSet2.add(spec.a);
                        } else {
                            q qVarC2 = q.c();
                            spec.toString();
                            qVarC2.getClass();
                        }
                    } else if (!this.A.d(a4.y(spec))) {
                        q.c().getClass();
                        o oVar = this.e;
                        e eVar2 = this.A;
                        eVar2.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        oVar.e(eVar2.l(a4.y(spec)), null);
                    }
                }
            }
        }
        synchronized (this.z) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    q.c().getClass();
                    this.v.addAll(hashSet);
                    this.i.w(this.v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.m6.h
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.B;
        o oVar = this.e;
        if (bool == null) {
            this.B = Boolean.valueOf(k.a(this.d, oVar.b));
        }
        if (!this.B.booleanValue()) {
            q.c().getClass();
            return;
        }
        if (!this.y) {
            oVar.f.a(this);
            this.y = true;
        }
        q.c().getClass();
        a aVar = this.w;
        if (aVar != null && (runnable = (Runnable) aVar.c.remove(str)) != null) {
            ((Handler) aVar.b.e).removeCallbacks(runnable);
        }
        Iterator it = this.A.j(str).iterator();
        while (it.hasNext()) {
            oVar.d.a(new l(oVar, (j) it.next(), false));
        }
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            com.gamericefishpro.space.u6.j jVarY = a4.y((p) obj);
            q qVarC = q.c();
            jVarY.toString();
            qVarC.getClass();
            j jVarI = this.A.i(jVarY);
            if (jVarI != null) {
                o oVar = this.e;
                oVar.d.a(new l(oVar, jVarI, false));
            }
        }
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void d(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            com.gamericefishpro.space.u6.j jVarY = a4.y((p) obj);
            e eVar = this.A;
            if (!eVar.d(jVarY)) {
                q qVarC = q.c();
                jVarY.toString();
                qVarC.getClass();
                this.e.e(eVar.l(jVarY), null);
            }
        }
    }

    @Override // com.gamericefishpro.space.m6.h
    public final boolean e() {
        return false;
    }

    @Override // com.gamericefishpro.space.m6.c
    public final void f(com.gamericefishpro.space.u6.j jVar, boolean z) {
        this.A.i(jVar);
        synchronized (this.z) {
            try {
                for (p pVar : this.v) {
                    if (a4.y(pVar).equals(jVar)) {
                        q qVarC = q.c();
                        Objects.toString(jVar);
                        qVarC.getClass();
                        this.v.remove(pVar);
                        this.i.w(this.v);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
