package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class zs71 {
    public static final boolean c = ew71.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a() {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new yp71(SystemClock.elapsedRealtime()));
    }

    public final synchronized void b() {
        long j;
        this.b = true;
        if (this.a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((yp71) this.a.get(0)).a;
            ArrayList arrayList = this.a;
            j = ((yp71) arrayList.get(arrayList.size() - 1)).a - j2;
        }
        if (j <= 0) {
            return;
        }
        long j3 = ((yp71) this.a.get(0)).a;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            long j4 = ((yp71) it.next()).a;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b();
    }
}
