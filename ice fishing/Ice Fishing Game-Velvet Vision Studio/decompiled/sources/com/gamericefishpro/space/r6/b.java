package com.gamericefishpro.space.r6;

import com.gamericefishpro.space.f5.y;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.s6.e;
import com.gamericefishpro.space.u6.p;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final y a;
    public final ArrayList b;
    public final ArrayList c;
    public Object d;
    public com.gamericefishpro.space.a8.c e;

    public b(y tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.a = tracker;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.b.clear();
        this.c.clear();
        ArrayList arrayList = this.b;
        for (Object obj : workSpecs) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.b;
        ArrayList arrayList3 = this.c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList2.get(i);
            i++;
            arrayList3.add(((p) obj2).a);
        }
        if (this.b.isEmpty()) {
            this.a.d(this);
        } else {
            y yVar = this.a;
            yVar.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            synchronized (yVar.c) {
                try {
                    if (((LinkedHashSet) yVar.d).add(this)) {
                        if (((LinkedHashSet) yVar.d).size() == 1) {
                            yVar.e = yVar.b();
                            q qVarC = q.c();
                            int i2 = e.a;
                            Objects.toString(yVar.e);
                            qVarC.getClass();
                            yVar.f();
                        }
                        Object obj3 = yVar.e;
                        this.d = obj3;
                        d(this.e, obj3);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.e, this.d);
    }

    public final void d(com.gamericefishpro.space.a8.c cVar, Object obj) {
        if (this.b.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.b;
            Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
            synchronized (cVar.v) {
                com.gamericefishpro.space.q6.b bVar = (com.gamericefishpro.space.q6.b) cVar.e;
                if (bVar != null) {
                    bVar.c(workSpecs);
                    Unit unit = Unit.a;
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.b;
        Intrinsics.checkNotNullParameter(workSpecs2, "workSpecs");
        synchronized (cVar.v) {
            try {
                ArrayList arrayList = new ArrayList();
                int size = workSpecs2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = workSpecs2.get(i2);
                    i2++;
                    if (cVar.d(((p) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    q qVarC = q.c();
                    int i3 = com.gamericefishpro.space.q6.c.a;
                    Objects.toString((p) obj3);
                    qVarC.getClass();
                }
                com.gamericefishpro.space.q6.b bVar2 = (com.gamericefishpro.space.q6.b) cVar.e;
                if (bVar2 != null) {
                    bVar2.d(arrayList);
                    Unit unit2 = Unit.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
