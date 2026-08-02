package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class rgt0 {
    public final tj60 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final m8t0 c = new m8t0(9, this);

    public rgt0(tj60 tj60Var) {
        this.a = tj60Var;
    }

    public final void a() {
        this.b.removeCallbacks(this.c);
        this.a.b();
    }
}
