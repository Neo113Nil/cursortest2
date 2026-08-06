package P;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: P.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0062k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1348e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final C0059h f1349f = new C0059h();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1350a;

    /* renamed from: b, reason: collision with root package name */
    public long f1351b;

    /* renamed from: c, reason: collision with root package name */
    public long f1352c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1353d;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f2570m && this.f1351b == 0) {
            this.f1351b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0060i c0060i = recyclerView.f2552b0;
        c0060i.f1340a = i2;
        c0060i.f1341b = i3;
    }

    public final void b(long j2) {
        C0061j c0061j;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f1350a;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0060i c0060i = recyclerView2.f2552b0;
                c0060i.f1342c = 0;
                i2 += c0060i.f1342c;
            }
        }
        ArrayList arrayList2 = this.f1353d;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0060i c0060i2 = recyclerView3.f2552b0;
                Math.abs(c0060i2.f1340a);
                Math.abs(c0060i2.f1341b);
                if (c0060i2.f1342c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0061j());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f1349f);
        if (arrayList2.size() <= 0 || (recyclerView = (c0061j = (C0061j) arrayList2.get(0)).f1346d) == null) {
            return;
        }
        int i5 = c0061j.f1347e;
        if (recyclerView.f2555d.D() > 0) {
            RecyclerView.j(recyclerView.f2555d.C(0));
            throw null;
        }
        C c2 = recyclerView.f2549a;
        try {
            recyclerView.f2579w++;
            c2.a(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f2579w - 1;
            recyclerView.f2579w = i6;
            if (i6 < 1) {
                recyclerView.f2579w = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = u.d.f8475a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f1350a;
            if (arrayList.isEmpty()) {
                this.f1351b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f1351b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1352c);
                this.f1351b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f1351b = 0L;
            int i4 = u.d.f8475a;
            Trace.endSection();
            throw th;
        }
    }
}
