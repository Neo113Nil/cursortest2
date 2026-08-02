package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class jzd extends au2 {
    public int g;

    @Override // defpackage.zsb
    public final int b() {
        return this.g;
    }

    @Override // defpackage.zsb
    public final Object j() {
        return null;
    }

    @Override // defpackage.zsb
    public final void m(long j, long j2, long j3, List list, eih[] eihVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, elapsedRealtime)) {
                    this.g = i;
                    return;
                }
            }
            e7o.n();
        }
    }

    @Override // defpackage.zsb
    public final int t() {
        return 0;
    }
}
