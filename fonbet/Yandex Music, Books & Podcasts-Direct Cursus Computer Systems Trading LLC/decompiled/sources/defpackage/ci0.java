package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class ci0 implements bgm, uo6 {
    public long a;

    public ci0(ujl ujlVar) {
        this.a = SystemClock.elapsedRealtime();
    }

    @Override // defpackage.uo6
    public long a() {
        return this.a;
    }

    @Override // defpackage.bgm
    public long b(int i) {
        return up6.z(Integer.valueOf(i)) * this.a;
    }

    public void c(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.a;
        long j2 = currentTimeMillis - j;
        this.a = j + j2;
        Timber.d("%d[ms] %s", Long.valueOf(j2), str);
    }

    @Override // defpackage.uo6
    public bs1 d() {
        return xr1.a;
    }

    public Object e(aur aurVar) {
        Object p = y2x.p(this.a, aurVar);
        return p == nm6.a ? p : Unit.a;
    }

    public /* synthetic */ ci0(long j) {
        this.a = j;
    }
}
