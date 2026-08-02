package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes15.dex */
public final class yjt {
    public final w3c a = w3c.a;
    public final AtomicLongArray b = new AtomicLongArray(8);

    public yjt() {
        a(0);
    }

    public final void a(int i) {
        this.a.getClass();
        this.b.set(i, SystemClock.elapsedRealtime());
    }
}
