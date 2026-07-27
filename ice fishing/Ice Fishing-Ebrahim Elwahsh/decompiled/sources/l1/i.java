package l1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f39040c = j.f39043a;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f39041a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f39042b = false;

    public final synchronized void a(String str, long j9) {
        if (this.f39042b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f39041a.add(new h(str, j9, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j9;
        this.f39042b = true;
        ArrayList arrayList = this.f39041a;
        if (arrayList.size() == 0) {
            j9 = 0;
        } else {
            j9 = ((h) arrayList.get(arrayList.size() - 1)).f39039c - ((h) arrayList.get(0)).f39039c;
        }
        if (j9 <= 0) {
            return;
        }
        long j10 = ((h) this.f39041a.get(0)).f39039c;
        j.b("(%-4d ms) %s", Long.valueOf(j9), str);
        Iterator it = this.f39041a.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            long j11 = hVar.f39039c;
            j.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(hVar.f39038b), hVar.f39037a);
            j10 = j11;
        }
    }

    public final void finalize() {
        if (this.f39042b) {
            return;
        }
        b("Request on the loose");
        j.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
