package t0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C2817Tl;
import com.google.android.gms.internal.ads.C3698oP;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5017m implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final ThreadLocal f40777x = new ThreadLocal();

    /* renamed from: y, reason: collision with root package name */
    public static final A3.o f40778y = new A3.o(5);

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f40779n;

    /* renamed from: u, reason: collision with root package name */
    public long f40780u;

    /* renamed from: v, reason: collision with root package name */
    public long f40781v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f40782w;

    public static AbstractC5000P c(RecyclerView recyclerView, int i, long j6) {
        int n9 = recyclerView.f5236x.n();
        for (int i4 = 0; i4 < n9; i4++) {
            AbstractC5000P I8 = RecyclerView.I(recyclerView.f5236x.m(i4));
            if (I8.f40645c == i && !I8.f()) {
                return null;
            }
        }
        C3698oP c3698oP = recyclerView.f5230u;
        try {
            recyclerView.P();
            AbstractC5000P i6 = c3698oP.i(i, j6);
            if (i6 != null) {
                if (!i6.e() || i6.f()) {
                    c3698oP.a(i6, false);
                } else {
                    c3698oP.f(i6.f40643a);
                }
            }
            recyclerView.Q(false);
            return i6;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i4) {
        if (recyclerView.f5193I && this.f40780u == 0) {
            this.f40780u = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C2817Tl c2817Tl = recyclerView.C0;
        c2817Tl.f28573a = i;
        c2817Tl.f28574b = i4;
    }

    public final void b(long j6) {
        C5016l c5016l;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C5016l c5016l2;
        ArrayList arrayList = this.f40779n;
        int size = arrayList.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C2817Tl c2817Tl = recyclerView3.C0;
                c2817Tl.b(recyclerView3, false);
                i += c2817Tl.f28576d;
            }
        }
        ArrayList arrayList2 = this.f40782w;
        arrayList2.ensureCapacity(i);
        int i6 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i9);
            if (recyclerView4.getWindowVisibility() == 0) {
                C2817Tl c2817Tl2 = recyclerView4.C0;
                int abs = Math.abs(c2817Tl2.f28574b) + Math.abs(c2817Tl2.f28573a);
                for (int i10 = 0; i10 < c2817Tl2.f28576d * 2; i10 += 2) {
                    if (i6 >= arrayList2.size()) {
                        c5016l2 = new C5016l();
                        arrayList2.add(c5016l2);
                    } else {
                        c5016l2 = (C5016l) arrayList2.get(i6);
                    }
                    int[] iArr = c2817Tl2.f28575c;
                    int i11 = iArr[i10 + 1];
                    c5016l2.f40772a = i11 <= abs;
                    c5016l2.f40773b = abs;
                    c5016l2.f40774c = i11;
                    c5016l2.f40775d = recyclerView4;
                    c5016l2.f40776e = iArr[i10];
                    i6++;
                }
            }
        }
        Collections.sort(arrayList2, f40778y);
        for (int i12 = 0; i12 < arrayList2.size() && (recyclerView = (c5016l = (C5016l) arrayList2.get(i12)).f40775d) != null; i12++) {
            AbstractC5000P c9 = c(recyclerView, c5016l.f40776e, c5016l.f40772a ? Long.MAX_VALUE : j6);
            if (c9 != null && c9.f40644b != null && c9.e() && !c9.f() && (recyclerView2 = (RecyclerView) c9.f40644b.get()) != null) {
                if (recyclerView2.f5210R && recyclerView2.f5236x.n() != 0) {
                    AbstractC5030z abstractC5030z = recyclerView2.f5221l0;
                    if (abstractC5030z != null) {
                        abstractC5030z.e();
                    }
                    AbstractC4987C abstractC4987C = recyclerView2.f5185E;
                    C3698oP c3698oP = recyclerView2.f5230u;
                    if (abstractC4987C != null) {
                        abstractC4987C.g0(c3698oP);
                        recyclerView2.f5185E.h0(c3698oP);
                    }
                    ((ArrayList) c3698oP.f33686c).clear();
                    c3698oP.d();
                }
                C2817Tl c2817Tl3 = recyclerView2.C0;
                c2817Tl3.b(recyclerView2, true);
                if (c2817Tl3.f28576d != 0) {
                    try {
                        int i13 = K.n.f1594a;
                        Trace.beginSection("RV Nested Prefetch");
                        C4997M c4997m = recyclerView2.f5184D0;
                        AbstractC5026v abstractC5026v = recyclerView2.f5183D;
                        c4997m.f40625d = 1;
                        c4997m.f40626e = abstractC5026v.a();
                        c4997m.f40628g = false;
                        c4997m.f40629h = false;
                        c4997m.i = false;
                        for (int i14 = 0; i14 < c2817Tl3.f28576d * 2; i14 += 2) {
                            c(recyclerView2, c2817Tl3.f28575c[i14], j6);
                        }
                        Trace.endSection();
                        c5016l.f40772a = false;
                        c5016l.f40773b = 0;
                        c5016l.f40774c = 0;
                        c5016l.f40775d = null;
                        c5016l.f40776e = 0;
                    } catch (Throwable th) {
                        int i15 = K.n.f1594a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c5016l.f40772a = false;
            c5016l.f40773b = 0;
            c5016l.f40774c = 0;
            c5016l.f40775d = null;
            c5016l.f40776e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = K.n.f1594a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f40779n;
            if (arrayList.isEmpty()) {
                this.f40780u = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j6 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j6 = Math.max(recyclerView.getDrawingTime(), j6);
                }
            }
            if (j6 == 0) {
                this.f40780u = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j6) + this.f40781v);
                this.f40780u = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f40780u = 0L;
            int i6 = K.n.f1594a;
            Trace.endSection();
            throw th;
        }
    }
}
