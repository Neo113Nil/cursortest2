package n1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f39636c = j.f39639a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f39637a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f39638b = false;

    public final synchronized void a(String str, long j6) {
        if (this.f39638b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f39637a.add(new h(str, j6, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j6;
        this.f39638b = true;
        ArrayList arrayList = this.f39637a;
        if (arrayList.size() == 0) {
            j6 = 0;
        } else {
            j6 = ((h) arrayList.get(arrayList.size() - 1)).f39635c - ((h) arrayList.get(0)).f39635c;
        }
        if (j6 <= 0) {
            return;
        }
        long j9 = ((h) this.f39637a.get(0)).f39635c;
        j.b("(%-4d ms) %s", Long.valueOf(j6), str);
        Iterator it = this.f39637a.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            long j10 = hVar.f39635c;
            j.b("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(hVar.f39634b), hVar.f39633a);
            j9 = j10;
        }
    }

    public final void finalize() {
        if (this.f39638b) {
            return;
        }
        b("Request on the loose");
        j.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
