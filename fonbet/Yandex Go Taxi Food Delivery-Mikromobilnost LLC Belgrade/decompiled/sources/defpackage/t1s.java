package defpackage;

import android.os.SystemClock;

/* loaded from: classes15.dex */
public final class t1s {
    public long a;
    public boolean b;
    public final Object c;

    public t1s(u1s u1sVar) {
        this.c = u1sVar;
        this.b = true;
        this.a = System.currentTimeMillis();
    }

    public t1s(gj10 gj10Var) {
        this.c = gj10Var;
        this.a = SystemClock.elapsedRealtime();
    }
}
