package L;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: L.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0061l implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f653j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final C0058i f654k = new C0058i();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f655f;

    /* renamed from: g, reason: collision with root package name */
    public long f656g;

    /* renamed from: h, reason: collision with root package name */
    public long f657h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f658i;

    public final void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.r && this.f656g == 0) {
            this.f656g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0059j c0059j = recyclerView.f1581b0;
        c0059j.f645a = i2;
        c0059j.f646b = i3;
    }

    public final void b(long j2) {
        C0060k c0060k;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f655f;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0059j c0059j = recyclerView2.f1581b0;
                c0059j.f647c = 0;
                i2 += c0059j.f647c;
            }
        }
        ArrayList arrayList2 = this.f658i;
        arrayList2.ensureCapacity(i2);
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0059j c0059j2 = recyclerView3.f1581b0;
                Math.abs(c0059j2.f645a);
                Math.abs(c0059j2.f646b);
                if (c0059j2.f647c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0060k());
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f654k);
        if (arrayList2.size() <= 0 || (recyclerView = (c0060k = (C0060k) arrayList2.get(0)).f651d) == null) {
            return;
        }
        int i5 = c0060k.f652e;
        if (recyclerView.f1591i.A() > 0) {
            RecyclerView.j(recyclerView.f1591i.z(0));
            throw null;
        }
        D d2 = recyclerView.f1585f;
        try {
            recyclerView.f1559B++;
            d2.a(i5);
            throw null;
        } catch (Throwable th) {
            int i6 = recyclerView.f1559B - 1;
            recyclerView.f1559B = i6;
            if (i6 < 1) {
                recyclerView.f1559B = 0;
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = s.b.f2951a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f655f;
            if (arrayList.isEmpty()) {
                this.f656g = 0L;
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
                this.f656g = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f657h);
                this.f656g = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f656g = 0L;
            int i4 = s.b.f2951a;
            Trace.endSection();
            throw th;
        }
    }
}
