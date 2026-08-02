package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.animation.core.RepeatMode;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class zer implements uv60, f531, dx81 {
    public long a;
    public long b;
    public Object c;
    public Object w;

    public zer(long j) {
        if (((j191) this.c) != null) {
            ny61.k();
            throw null;
        }
        this.a = j;
        this.b = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    @Override // defpackage.dx81
    public a871 a() {
        long j = this.a;
        if (j != -1) {
            return new w471((cfr) this.c, j, 0);
        }
        ny61.k();
        return null;
    }

    @Override // defpackage.f531
    public boolean b() {
        return true;
    }

    @Override // defpackage.dx81
    public long c(w971 w971Var) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // defpackage.uv60
    public f7q0 d() {
        d6z.x(this.a != -1);
        return new qb4((cfr) this.c, this.a, 1);
    }

    @Override // defpackage.f531
    public long e(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    }

    @Override // defpackage.uv60
    public void g(long j) {
        long[] jArr = ((bfr) this.w).a;
        this.b = jArr[tw21.e(jArr, j, true)];
    }

    public long h(long j) {
        long j2 = this.b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.a;
        long j5 = j3 / j4;
        return (((RepeatMode) this.w) == RepeatMode.Restart || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // defpackage.uv60
    public long j(c5p c5pVar) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // defpackage.f531
    public sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ((h531) this.c).k(h(j), sj2Var, sj2Var2, l(j, sj2Var, sj2Var3, sj2Var2));
    }

    public sj2 l(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.a;
        return j3 > j4 ? ((h531) this.c).k(j4 - j2, sj2Var, sj2Var3, sj2Var2) : sj2Var2;
    }

    @Override // defpackage.f531
    public sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return ((h531) this.c).n(h(j), sj2Var, sj2Var2, l(j, sj2Var, sj2Var3, sj2Var2));
    }

    public zer(long j, int i) {
        d6z.x(((zt1) this.c) == null);
        this.a = j;
        this.b = j + i;
    }

    @Override // defpackage.dx81
    public void a(long j) {
        long[] jArr = ((bfr) this.w).a;
        this.b = jArr[rf71.t(jArr, j, true)];
    }
}
