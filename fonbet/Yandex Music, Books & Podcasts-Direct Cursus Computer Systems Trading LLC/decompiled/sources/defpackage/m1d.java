package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m1d implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final zda f = new zda(10);
    public long b;
    public long c;
    public final ArrayList a = new ArrayList();
    public final ArrayList d = new ArrayList();

    public static opn c(RecyclerView recyclerView, int i, long j) {
        int o = recyclerView.f.o();
        for (int i2 = 0; i2 < o; i2++) {
            opn b0 = RecyclerView.b0(recyclerView.f.n(i2));
            if (b0.c == i && !b0.i()) {
                return null;
            }
        }
        amh amhVar = recyclerView.c;
        if (j == Long.MAX_VALUE) {
            try {
                if (bqs.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.j0(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.i0();
        opn l = amhVar.l(i, j);
        if (l != null) {
            if (!l.h() || l.i()) {
                amhVar.a(l, false);
            } else {
                amhVar.i(l.a);
            }
        }
        recyclerView.j0(false);
        Trace.endSection();
        return l;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s) {
            if (RecyclerView.j1 && !this.a.contains(recyclerView)) {
                xq0.q("attempting to post unregistered view!");
                return;
            } else if (this.b == 0) {
                this.b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        ll4 ll4Var = recyclerView.M0;
        ll4Var.a = i;
        ll4Var.b = i2;
    }

    public final void b(long j) {
        l1d l1dVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        l1d l1dVar2;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView3.getWindowVisibility();
            ll4 ll4Var = recyclerView3.M0;
            if (windowVisibility == 0) {
                ll4Var.c(recyclerView3, false);
                i2 += ll4Var.d;
            }
        }
        ArrayList arrayList2 = this.d;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                ll4 ll4Var2 = recyclerView4.M0;
                int abs = Math.abs(ll4Var2.b) + Math.abs(ll4Var2.a);
                for (int i6 = i; i6 < ll4Var2.d * 2; i6 += 2) {
                    if (i5 >= arrayList2.size()) {
                        l1dVar2 = new l1d();
                        arrayList2.add(l1dVar2);
                    } else {
                        l1dVar2 = (l1d) arrayList2.get(i5);
                    }
                    int[] iArr = ll4Var2.c;
                    int i7 = iArr[i6 + 1];
                    l1dVar2.a = i7 <= abs;
                    l1dVar2.b = abs;
                    l1dVar2.c = i7;
                    l1dVar2.d = recyclerView4;
                    l1dVar2.e = iArr[i6];
                    i5++;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, f);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (l1dVar = (l1d) arrayList2.get(i8)).d) != null; i8++) {
            opn c = c(recyclerView, l1dVar.e, l1dVar.a ? Long.MAX_VALUE : j);
            if (c != null && c.b != null && c.h() && !c.i() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.D && recyclerView2.f.o() != 0) {
                    amh amhVar = recyclerView2.c;
                    von vonVar = recyclerView2.v0;
                    if (vonVar != null) {
                        vonVar.e();
                    }
                    yon yonVar = recyclerView2.n;
                    if (yonVar != null) {
                        yonVar.M0(amhVar);
                        recyclerView2.n.N0(amhVar);
                    }
                    ((ArrayList) amhVar.d).clear();
                    amhVar.g();
                }
                ll4 ll4Var3 = recyclerView2.M0;
                ll4Var3.c(recyclerView2, true);
                if (ll4Var3.d != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        kpn kpnVar = recyclerView2.N0;
                        qon qonVar = recyclerView2.m;
                        kpnVar.d = 1;
                        kpnVar.e = qonVar.c();
                        kpnVar.g = false;
                        kpnVar.h = false;
                        kpnVar.i = false;
                        for (int i9 = 0; i9 < ll4Var3.d * 2; i9 += 2) {
                            c(recyclerView2, ll4Var3.c[i9], j);
                        }
                        Trace.endSection();
                        l1dVar.a = false;
                        l1dVar.b = 0;
                        l1dVar.c = 0;
                        l1dVar.d = null;
                        l1dVar.e = 0;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            l1dVar.a = false;
            l1dVar.b = 0;
            l1dVar.c = 0;
            l1dVar.d = null;
            l1dVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.c);
                }
            }
        } finally {
            this.b = 0L;
            Trace.endSection();
        }
    }
}
