package com.gamericefishpro.space.r5;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    public static final ThreadLocal w = new ThreadLocal();
    public static final com.gamericefishpro.space.fa.m y = new com.gamericefishpro.space.fa.m(4);
    public ArrayList d;
    public long e;
    public long i;
    public ArrayList v;

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.H && this.e == 0) {
            this.e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        com.gamericefishpro.space.d9.d dVar = recyclerView.r0;
        dVar.a = i;
        dVar.b = i2;
    }

    public final void b(long j) {
        k kVar;
        RecyclerView recyclerView;
        ArrayList arrayList = this.v;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView2.getWindowVisibility();
            com.gamericefishpro.space.d9.d dVar = recyclerView2.r0;
            if (windowVisibility == 0) {
                dVar.a(recyclerView2, false);
                i += dVar.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        while (true) {
            m0 m0Var = null;
            if (i3 >= size) {
                Collections.sort(arrayList, y);
                for (int i4 = 0; i4 < arrayList.size() && (recyclerView = (kVar = (k) arrayList.get(i4)).d) != null; i4++) {
                    long j2 = kVar.a ? Long.MAX_VALUE : j;
                    int i5 = kVar.e;
                    int i6 = recyclerView.v.i();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            com.gamericefishpro.space.bb.a aVar = recyclerView.d;
                            try {
                                recyclerView.w();
                                aVar.k(i5, j2);
                                if (!m0Var.e() || m0Var.f()) {
                                    aVar.b(null, false);
                                } else {
                                    aVar.i(null);
                                }
                                recyclerView.x(false);
                                break;
                            } catch (Throwable th) {
                                recyclerView.x(false);
                                throw th;
                            }
                        }
                        RecyclerView.s(recyclerView.v.h(i7));
                        m0Var.getClass();
                        if (i5 == 0 && !m0Var.f()) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    kVar.a = false;
                    kVar.b = 0;
                    kVar.c = 0;
                    kVar.d = null;
                    kVar.e = 0;
                }
                return;
            }
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                com.gamericefishpro.space.d9.d dVar2 = recyclerView3.r0;
                Math.abs(dVar2.a);
                Math.abs(dVar2.b);
                if (dVar2.c * 2 > 0) {
                    if (arrayList.size() <= 0) {
                        arrayList.add(new k());
                        throw null;
                    }
                    throw null;
                }
            }
            i3++;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.d;
        try {
            int i = com.gamericefishpro.space.y3.d.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.i);
                }
            }
            this.e = 0L;
        } finally {
            this.e = 0L;
            int i3 = com.gamericefishpro.space.y3.d.a;
            Trace.endSection();
        }
    }
}
