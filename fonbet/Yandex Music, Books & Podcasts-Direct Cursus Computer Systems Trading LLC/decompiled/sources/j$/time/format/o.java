package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class o extends i {
    public static final LocalDate h = LocalDate.i0(2000, 1, 1);
    public final j$.time.chrono.b g;

    @Override // j$.time.format.i
    public final boolean b(v vVar) {
        if (vVar.c) {
            return super.b(vVar);
        }
        return false;
    }

    public o(j$.time.temporal.o oVar, int i, int i2, j$.time.chrono.b bVar, int i3) {
        super(oVar, i, i2, e0.NOT_NEGATIVE, i3);
        this.g = bVar;
    }

    @Override // j$.time.format.i
    public final long a(x xVar, long j) {
        long abs = Math.abs(j);
        j$.time.chrono.b bVar = this.g;
        long e = bVar != null ? j$.time.chrono.m.t(xVar.a).K(bVar).e(this.a) : 0;
        long[] jArr = i.f;
        if (j >= e) {
            long j2 = jArr[this.b];
            if (j < e + j2) {
                return abs % j2;
            }
        }
        return abs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final int c(v vVar, long j, int i, int i2) {
        final o oVar;
        final v vVar2;
        final long j2;
        final int i3;
        final int i4;
        int i5;
        long j3;
        j$.time.chrono.b bVar = this.g;
        if (bVar != null) {
            j$.time.chrono.m mVar = vVar.c().c;
            if (mVar == null && (mVar = vVar.a.e) == null) {
                mVar = j$.time.chrono.t.c;
            }
            i5 = mVar.K(bVar).e(this.a);
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    o.this.c(vVar2, j2, i3, i4);
                }
            };
            if (vVar2.e == null) {
                vVar2.e = new ArrayList();
            }
            vVar2.e.add(consumer);
        } else {
            oVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = i;
            i4 = i2;
            i5 = 0;
        }
        int i6 = i4 - i3;
        int i7 = oVar.b;
        if (i6 != i7 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = i.f[i7];
            long j5 = i5;
            long j6 = j5 - (j5 % j4);
            long j7 = i5 > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j7 + j4 : j7;
        }
        return vVar2.f(oVar.a, j3, i3, i4);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        Object obj = this.g;
        return "ReducedValue(" + this.a + StringUtils.COMMA + this.b + StringUtils.COMMA + this.c + StringUtils.COMMA + (obj != null ? obj : 0) + ")";
    }
}
