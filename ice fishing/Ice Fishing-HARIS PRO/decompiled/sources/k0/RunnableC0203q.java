package k0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: k0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0203q implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final B.j f3581f = new B.j(2);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f3582a;

    /* renamed from: b, reason: collision with root package name */
    public long f3583b;

    /* renamed from: c, reason: collision with root package name */
    public long f3584c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3585d;

    public static b0 c(RecyclerView recyclerView, int i, long j) {
        int h2 = recyclerView.f2148f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 L2 = RecyclerView.L(recyclerView.f2148f.g(i2));
            if (L2.f3451c == i && !L2.h()) {
                return null;
            }
        }
        Q q2 = recyclerView.f2143c;
        try {
            recyclerView.S();
            b0 k2 = q2.k(i, j);
            if (k2 != null) {
                if (!k2.g() || k2.h()) {
                    q2.a(k2, false);
                } else {
                    q2.h(k2.f3449a);
                }
            }
            recyclerView.T(false);
            return k2;
        } catch (Throwable th) {
            recyclerView.T(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f2172s) {
            if (RecyclerView.z0 && !this.f3582a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f3583b == 0) {
                this.f3583b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0201o c0201o = recyclerView.f2149f0;
        c0201o.f3573a = i;
        c0201o.f3574b = i2;
    }

    public final void b(long j) {
        C0202p c0202p;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0202p c0202p2;
        ArrayList arrayList = this.f3582a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0201o c0201o = recyclerView3.f2149f0;
                c0201o.b(recyclerView3, false);
                i += c0201o.f3576d;
            }
        }
        ArrayList arrayList2 = this.f3585d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0201o c0201o2 = recyclerView4.f2149f0;
                int abs = Math.abs(c0201o2.f3574b) + Math.abs(c0201o2.f3573a);
                for (int i5 = 0; i5 < c0201o2.f3576d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0202p2 = new C0202p();
                        arrayList2.add(c0202p2);
                    } else {
                        c0202p2 = (C0202p) arrayList2.get(i3);
                    }
                    int[] iArr = c0201o2.f3575c;
                    int i6 = iArr[i5 + 1];
                    c0202p2.f3577a = i6 <= abs;
                    c0202p2.f3578b = abs;
                    c0202p2.f3579c = i6;
                    c0202p2.f3580d = recyclerView4;
                    c0202p2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f3581f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0202p = (C0202p) arrayList2.get(i7)).f3580d) != null; i7++) {
            b0 c2 = c(recyclerView, c0202p.e, c0202p.f3577a ? Long.MAX_VALUE : j);
            if (c2 != null && c2.f3450b != null && c2.g() && !c2.h() && (recyclerView2 = (RecyclerView) c2.f3450b.get()) != null) {
                if (recyclerView2.f2119C && recyclerView2.f2148f.h() != 0) {
                    G g2 = recyclerView2.f2127L;
                    if (g2 != null) {
                        g2.e();
                    }
                    K k2 = recyclerView2.f2162n;
                    Q q2 = recyclerView2.f2143c;
                    if (k2 != null) {
                        k2.k0(q2);
                        recyclerView2.f2162n.l0(q2);
                    }
                    q2.f3407a.clear();
                    q2.f();
                }
                C0201o c0201o3 = recyclerView2.f2149f0;
                c0201o3.b(recyclerView2, true);
                if (c0201o3.f3576d != 0) {
                    try {
                        int i8 = K.i.f387a;
                        Trace.beginSection("RV Nested Prefetch");
                        X x2 = recyclerView2.f2151g0;
                        C c3 = recyclerView2.f2160m;
                        x2.f3425d = 1;
                        x2.e = c3.a();
                        x2.f3427g = false;
                        x2.f3428h = false;
                        x2.i = false;
                        for (int i9 = 0; i9 < c0201o3.f3576d * 2; i9 += 2) {
                            c(recyclerView2, c0201o3.f3575c[i9], j);
                        }
                        Trace.endSection();
                        c0202p.f3577a = false;
                        c0202p.f3578b = 0;
                        c0202p.f3579c = 0;
                        c0202p.f3580d = null;
                        c0202p.e = 0;
                    } catch (Throwable th) {
                        int i10 = K.i.f387a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0202p.f3577a = false;
            c0202p.f3578b = 0;
            c0202p.f3579c = 0;
            c0202p.f3580d = null;
            c0202p.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = K.i.f387a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f3582a;
            if (arrayList.isEmpty()) {
                this.f3583b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f3583b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.f3584c);
                this.f3583b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f3583b = 0L;
            int i3 = K.i.f387a;
            Trace.endSection();
            throw th;
        }
    }
}
