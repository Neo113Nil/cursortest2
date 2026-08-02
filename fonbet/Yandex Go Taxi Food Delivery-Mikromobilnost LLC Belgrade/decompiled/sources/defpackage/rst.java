package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public class rst {
    public rn2 a;
    public Looper b;

    public final sst a() {
        if (this.a == null) {
            this.a = new rn2();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new sst(this.a, this.b);
    }
}
