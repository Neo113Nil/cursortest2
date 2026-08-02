package defpackage;

import android.os.SystemClock;
import java.util.List;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.player.provider.model.SurfaceSize;
import timber.log.Timber;

/* loaded from: classes6.dex */
public class rtr extends si7 implements su3 {
    public final arr w;
    public int x;
    public final ujl y;
    public Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtr(arr arrVar, xvs xvsVar, int[] iArr, yk2 yk2Var, long j, long j2, long j3, List list, arr arrVar2) {
        super(arrVar2, xvsVar, iArr, yk2Var, j, j2, j3, list);
        arrVar.getClass();
        xvsVar.getClass();
        iArr.getClass();
        yk2Var.getClass();
        list.getClass();
        this.w = arrVar;
        this.x = -1;
        this.y = new ujl();
    }

    public final boolean A(dsc dscVar) {
        SurfaceSize surfaceSize = (SurfaceSize) this.w.get();
        int i = dscVar.v;
        int i2 = dscVar.u;
        if (i <= surfaceSize.getHeight() && i2 <= surfaceSize.getWidth()) {
            return true;
        }
        Timber.INSTANCE.d("Can not select format " + i2 + 'x' + dscVar.v + " surface " + surfaceSize.getWidth() + 'x' + surfaceSize.getHeight(), new Object[0]);
        return false;
    }

    @Override // defpackage.su3
    public final Size c() {
        dsc[] dscVarArr;
        this.y.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        int i2 = 0;
        while (true) {
            dscVarArr = this.d;
            if (i >= this.b) {
                i = i2;
                break;
            }
            if (elapsedRealtime == Long.MIN_VALUE || !a(i, elapsedRealtime)) {
                dsc dscVar = dscVarArr[i];
                dscVar.getClass();
                if (w(dscVar, dscVar.j, Long.MAX_VALUE)) {
                    break;
                }
                i2 = i;
            }
            i++;
        }
        dsc dscVar2 = dscVarArr[i];
        return v3g.o(dscVar2.u, dscVar2.v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        if (r19 >= r16.i) goto L48;
     */
    @Override // defpackage.a8w, defpackage.zsb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(long j, long j2, long j3, List list, eih[] eihVarArr) {
        list.getClass();
        if (this.z != null) {
            return;
        }
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long z = z(eihVarArr, list);
        Timber.d("getTimeToFirstByteEstimateUs: %s", Long.valueOf(this.g.b()));
        int i = this.s;
        dsc[] dscVarArr = this.d;
        if (i == 0) {
            this.s = 1;
            arr arrVar = this.v;
            if (arrVar == null || arrVar.get() == null) {
                this.r = x(elapsedRealtime, z);
            } else {
                int i2 = ((lcr) arrVar.get()).a;
                int i3 = this.b;
                int i4 = i3 - 1;
                int i5 = Integer.MIN_VALUE;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = dscVarArr[i6].v;
                    if (i5 <= i7 && i2 >= i7) {
                        i5 = i7;
                        i4 = i6;
                    }
                }
                this.r = i4;
            }
        } else {
            int i8 = this.r;
            int o = list.isEmpty() ? -1 : o(((dih) ild.x(list)).d);
            if (o != -1) {
                i = ((dih) ild.x(list)).e;
                i8 = o;
            }
            int x = x(elapsedRealtime, z);
            if (!a(i8, elapsedRealtime)) {
                dsc dscVar = dscVarArr[i8];
                dsc dscVar2 = dscVarArr[x];
                long j4 = this.h;
                if (j3 != -9223372036854775807L) {
                    j4 = Math.min((long) ((z != -9223372036854775807L ? j3 - z : j3) * this.n), j4);
                }
                dscVar2.getClass();
                int i9 = dscVar2.j;
                dscVar.getClass();
                int i10 = dscVar.j;
                if (i9 <= i10 || j2 >= j4) {
                    if (!A(dscVar)) {
                        Timber.INSTANCE.d("current format can not be select by surface size restriction. DowngradePossible!", new Object[0]);
                    } else if (i9 < i10) {
                    }
                }
                x = i8;
            }
            if (x != i8) {
                i = 3;
            }
            this.s = i;
            this.r = x;
        }
        dsc dscVar3 = dscVarArr[this.r];
        dscVar3.getClass();
        if (this.s == 1 && !A(dscVar3)) {
            int x2 = x(SystemClock.elapsedRealtime(), z(eihVarArr, list));
            this.r = x2;
            dscVar3 = dscVarArr[x2];
            dscVar3.getClass();
        }
        int i11 = dscVar3.j;
        if (i11 < this.x) {
            this.y.getClass();
            SystemClock.elapsedRealtime();
        }
        this.x = i11;
    }

    @Override // defpackage.a8w
    public final boolean w(dsc dscVar, int i, long j) {
        if (A(dscVar)) {
            return super.w(dscVar, i, j);
        }
        return false;
    }
}
