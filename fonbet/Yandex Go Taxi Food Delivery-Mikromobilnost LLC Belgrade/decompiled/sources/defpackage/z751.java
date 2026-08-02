package defpackage;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes10.dex */
public final class z751 implements y751 {
    public final gwi b;

    public z751(int i) {
        this.b = Build.VERSION.SDK_INT >= 34 ? hwi.a : msb1.D;
        scc.c(1, 2, 4, 8, 16, 32, 64, 128);
    }

    public final w751 a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        return (i >= 34 ? hwi.b : i >= 30 ? ji6.b : zoy0.x).c(activity, this.b);
    }

    public z751() {
        this(0);
    }
}
