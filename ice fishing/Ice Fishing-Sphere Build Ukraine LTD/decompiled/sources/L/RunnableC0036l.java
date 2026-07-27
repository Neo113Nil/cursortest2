package L;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: L.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0036l implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f575i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static final C0033i f576j = new C0033i();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f577e;

    /* renamed from: f, reason: collision with root package name */
    public long f578f;

    /* renamed from: g, reason: collision with root package name */
    public long f579g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f580h;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1609q && this.f578f == 0) {
            this.f578f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0034j c0034j = recyclerView.f1588a0;
        c0034j.f567a = i2;
        c0034j.f568b = i3;
    }

    public final void b(long j2) {
        C0035k c0035k;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f577e;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0034j c0034j = recyclerView2.f1588a0;
                c0034j.f569c = 0;
                i2 += c0034j.f569c;
            }
        }
        ArrayList arrayList2 = this.f580h;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0034j c0034j2 = recyclerView3.f1588a0;
                Math.abs(c0034j2.f567a);
                Math.abs(c0034j2.f568b);
                if (c0034j2.f569c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0035k());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f576j);
        if (arrayList2.size() <= 0 || (recyclerView = (c0035k = (C0035k) arrayList2.get(0)).f573d) == null) {
            return;
        }
        int i5 = c0035k.f574e;
        if (recyclerView.f1598h.A() > 0) {
            RecyclerView.j(recyclerView.f1598h.z(0));
            throw null;
        }
        D d2 = recyclerView.f1592e;
        try {
            recyclerView.f1566A++;
            d2.a(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f1566A - 1;
            recyclerView.f1566A = i6;
            if (i6 < 1) {
                recyclerView.f1566A = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = s.b.f2956a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f577e;
            if (arrayList.isEmpty()) {
                this.f578f = 0L;
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
                this.f578f = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f579g);
                this.f578f = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f578f = 0L;
            int i4 = s.b.f2956a;
            Trace.endSection();
            throw th;
        }
    }
}
