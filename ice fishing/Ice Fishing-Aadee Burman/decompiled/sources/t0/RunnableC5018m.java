package t0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C2780Sl;
import com.google.android.gms.internal.ads.C3675oP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5018m implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f40724x = new ThreadLocal();

    /* renamed from: y, reason: collision with root package name */
    public static final B.i f40725y = new B.i(4);

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f40726n;

    /* renamed from: u, reason: collision with root package name */
    public long f40727u;

    /* renamed from: v, reason: collision with root package name */
    public long f40728v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f40729w;

    public static AbstractC5003S c(RecyclerView recyclerView, int i, long j6) {
        int n9 = recyclerView.f5270x.n();
        for (int i6 = 0; i6 < n9; i6++) {
            AbstractC5003S I8 = RecyclerView.I(recyclerView.f5270x.m(i6));
            if (I8.f40592c == i && !I8.f()) {
                return null;
            }
        }
        C3675oP c3675oP = recyclerView.f5264u;
        try {
            recyclerView.P();
            AbstractC5003S i9 = c3675oP.i(i, j6);
            if (i9 != null) {
                if (!i9.e() || i9.f()) {
                    c3675oP.a(i9, false);
                } else {
                    c3675oP.f(i9.f40590a);
                }
            }
            recyclerView.Q(false);
            return i9;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i6) {
        if (recyclerView.f5226I && this.f40727u == 0) {
            this.f40727u = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C2780Sl c2780Sl = recyclerView.f5225H0;
        c2780Sl.f27544a = i;
        c2780Sl.f27545b = i6;
    }

    public final void b(long j6) {
        C5017l c5017l;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C5017l c5017l2;
        ArrayList arrayList = this.f40726n;
        int size = arrayList.size();
        int i = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i6);
            if (recyclerView3.getWindowVisibility() == 0) {
                C2780Sl c2780Sl = recyclerView3.f5225H0;
                c2780Sl.b(recyclerView3, false);
                i += c2780Sl.f27547d;
            }
        }
        ArrayList arrayList2 = this.f40729w;
        arrayList2.ensureCapacity(i);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i10);
            if (recyclerView4.getWindowVisibility() == 0) {
                C2780Sl c2780Sl2 = recyclerView4.f5225H0;
                int abs = Math.abs(c2780Sl2.f27545b) + Math.abs(c2780Sl2.f27544a);
                for (int i11 = 0; i11 < c2780Sl2.f27547d * 2; i11 += 2) {
                    if (i9 >= arrayList2.size()) {
                        c5017l2 = new C5017l();
                        arrayList2.add(c5017l2);
                    } else {
                        c5017l2 = (C5017l) arrayList2.get(i9);
                    }
                    int[] iArr = c2780Sl2.f27546c;
                    int i12 = iArr[i11 + 1];
                    c5017l2.f40719a = i12 <= abs;
                    c5017l2.f40720b = abs;
                    c5017l2.f40721c = i12;
                    c5017l2.f40722d = recyclerView4;
                    c5017l2.f40723e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(arrayList2, f40725y);
        for (int i13 = 0; i13 < arrayList2.size() && (recyclerView = (c5017l = (C5017l) arrayList2.get(i13)).f40722d) != null; i13++) {
            AbstractC5003S c9 = c(recyclerView, c5017l.f40723e, c5017l.f40719a ? Long.MAX_VALUE : j6);
            if (c9 != null && c9.f40591b != null && c9.e() && !c9.f() && (recyclerView2 = (RecyclerView) c9.f40591b.get()) != null) {
                if (recyclerView2.f5243R && recyclerView2.f5270x.n() != 0) {
                    AbstractC5031z abstractC5031z = recyclerView2.f5260q0;
                    if (abstractC5031z != null) {
                        abstractC5031z.e();
                    }
                    AbstractC4990E abstractC4990E = recyclerView2.f5218E;
                    C3675oP c3675oP = recyclerView2.f5264u;
                    if (abstractC4990E != null) {
                        abstractC4990E.g0(c3675oP);
                        recyclerView2.f5218E.h0(c3675oP);
                    }
                    ((ArrayList) c3675oP.f32899c).clear();
                    c3675oP.d();
                }
                C2780Sl c2780Sl3 = recyclerView2.f5225H0;
                c2780Sl3.b(recyclerView2, true);
                if (c2780Sl3.f27547d != 0) {
                    try {
                        int i14 = K.n.f1485a;
                        Trace.beginSection("RV Nested Prefetch");
                        C5000O c5000o = recyclerView2.f5227I0;
                        AbstractC5027v abstractC5027v = recyclerView2.f5216D;
                        c5000o.f40572d = 1;
                        c5000o.f40573e = abstractC5027v.a();
                        c5000o.f40575g = false;
                        c5000o.f40576h = false;
                        c5000o.i = false;
                        for (int i15 = 0; i15 < c2780Sl3.f27547d * 2; i15 += 2) {
                            c(recyclerView2, c2780Sl3.f27546c[i15], j6);
                        }
                        Trace.endSection();
                        c5017l.f40719a = false;
                        c5017l.f40720b = 0;
                        c5017l.f40721c = 0;
                        c5017l.f40722d = null;
                        c5017l.f40723e = 0;
                    } catch (Throwable th) {
                        int i16 = K.n.f1485a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c5017l.f40719a = false;
            c5017l.f40720b = 0;
            c5017l.f40721c = 0;
            c5017l.f40722d = null;
            c5017l.f40723e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = K.n.f1485a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f40726n;
            if (arrayList.isEmpty()) {
                this.f40727u = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j6 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i6);
                if (recyclerView.getWindowVisibility() == 0) {
                    j6 = Math.max(recyclerView.getDrawingTime(), j6);
                }
            }
            if (j6 == 0) {
                this.f40727u = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j6) + this.f40728v);
                this.f40727u = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f40727u = 0L;
            int i9 = K.n.f1485a;
            Trace.endSection();
            throw th;
        }
    }
}
