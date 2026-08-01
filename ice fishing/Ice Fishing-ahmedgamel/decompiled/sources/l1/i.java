package l1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f38898c = j.f38901a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38899a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f38900b = false;

    public final synchronized void a(String str, long j6) {
        if (this.f38900b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f38899a.add(new h(str, j6, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j6;
        this.f38900b = true;
        ArrayList arrayList = this.f38899a;
        if (arrayList.size() == 0) {
            j6 = 0;
        } else {
            j6 = ((h) arrayList.get(arrayList.size() - 1)).f38897c - ((h) arrayList.get(0)).f38897c;
        }
        if (j6 <= 0) {
            return;
        }
        long j9 = ((h) this.f38899a.get(0)).f38897c;
        j.b("(%-4d ms) %s", Long.valueOf(j6), str);
        Iterator it = this.f38899a.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            long j10 = hVar.f38897c;
            j.b("(+%-4d) [%2d] %s", Long.valueOf(j10 - j9), Long.valueOf(hVar.f38896b), hVar.f38895a);
            j9 = j10;
        }
    }

    public final void finalize() {
        if (this.f38900b) {
            return;
        }
        b("Request on the loose");
        j.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
