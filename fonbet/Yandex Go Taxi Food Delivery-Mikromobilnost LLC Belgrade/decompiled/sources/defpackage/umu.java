package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class umu {
    public final long a;
    public Long b;
    public final boolean c;
    public int d;
    public long e;
    public long f;
    public final tmu g;
    public long h;
    public final LinkedHashMap i;

    public umu(vmu vmuVar) {
        vmuVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a = elapsedRealtime;
        this.c = ((at2) vmuVar.b.get()).q0();
        this.g = new tmu(this, vmuVar);
        this.h = elapsedRealtime;
        this.i = new LinkedHashMap();
    }
}
