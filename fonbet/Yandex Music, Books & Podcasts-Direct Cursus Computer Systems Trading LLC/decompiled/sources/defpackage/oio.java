package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Locale;

/* loaded from: classes.dex */
public final class oio implements nio, uzt, OnCompleteListener {
    public int a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public oio(int i, tzt tztVar, jyn jynVar, long j) {
        this.a = i;
        this.d = tztVar;
        this.e = jynVar;
        if (i < 1) {
            xq0.x("Iterations count can't be less than 1");
            throw null;
        }
        this.b = (tztVar.u() + tztVar.o()) * 1000000;
        this.c = j * 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q66 h(axw axwVar, a aVar, int i) {
        gfx gfxVar = aVar.A;
        q66 q66Var = gfxVar == null ? null : gfxVar.d;
        if (q66Var != null && q66Var.b) {
            int[] iArr = q66Var.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = q66Var.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] == i) {
                            break;
                        }
                        i2++;
                    }
                }
                if (axwVar.r >= q66Var.e) {
                    return q66Var;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (axwVar.r >= q66Var.e) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.rzt
    public cn0 A(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((tzt) this.d).A(f(j), cn0Var, cn0Var2, g(j, cn0Var, cn0Var3, cn0Var2));
    }

    @Override // defpackage.nio
    public void b(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.nio
    public void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 1);
        this.e = M;
        M.d(((mio) this.d).c);
    }

    @Override // defpackage.nio
    public void d(long j) {
        this.b = j;
    }

    @Override // defpackage.nio
    public void e(d7k d7kVar, long j, int i, boolean z) {
        int a;
        ((azs) this.e).getClass();
        int i2 = this.a;
        if (i2 != -1 && i != (a = kio.a(i2))) {
            int i3 = dvt.a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", dfi.f("Received RTP packet with unexpected sequence number. Expected: ", a, i, "; received: ", "."));
        }
        long l0 = o2g.l0(this.c, j, ((mio) this.d).b, this.b);
        int a2 = d7kVar.a();
        ((azs) this.e).b(d7kVar, a2, 0);
        ((azs) this.e).a(l0, 1, a2, 0, null);
        this.a = i;
    }

    public long f(long j) {
        long j2 = this.b;
        long j3 = this.c;
        if (j + j3 <= 0) {
            return 0L;
        }
        long j4 = j + j3;
        long min = Math.min(j4 / j2, this.a - 1);
        return (((jyn) this.e) == jyn.a || min % ((long) 2) == 0) ? j4 - (min * j2) : ((min + 1) * j2) - j4;
    }

    public cn0 g(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        long j2 = this.c;
        long j3 = j + j2;
        long j4 = this.b;
        return j3 > j4 ? x(j4 - j2, cn0Var, cn0Var2, cn0Var3) : cn0Var2;
    }

    @Override // defpackage.rzt
    public long m(cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return (this.a * this.b) - this.c;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        long j3 = this.b;
        umd umdVar = (umd) this.d;
        if (umdVar.b()) {
            ffo ffoVar = (ffo) efo.g().b;
            if (ffoVar == null || ffoVar.b) {
                axw axwVar = (axw) umdVar.j.get((wo0) this.e);
                if (axwVar != null) {
                    fo0 fo0Var = axwVar.h;
                    if (fo0Var instanceof a) {
                        a aVar = (a) fo0Var;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = aVar.v;
                        if (ffoVar != null) {
                            z &= ffoVar.c;
                            i = ffoVar.d;
                            int i8 = ffoVar.e;
                            int i9 = ffoVar.a;
                            if (aVar.A == null || aVar.c()) {
                                i2 = i9;
                                i3 = i8;
                            } else {
                                q66 h = h(axwVar, aVar, this.a);
                                if (h == null) {
                                    return;
                                }
                                boolean z2 = h.c && j3 > 0;
                                i2 = i9;
                                i3 = h.e;
                                z = z2;
                            }
                        } else {
                            i = ScreenMirroringConfig.Test.pcVideoUdpPort;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i10 = i;
                        int i11 = -1;
                        if (task.l()) {
                            i5 = 0;
                        } else if (task.j()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception g = task.g();
                            if (g instanceof qo0) {
                                Status status = ((qo0) g).a;
                                i4 = status.a;
                                h66 h66Var = status.d;
                                if (h66Var != null) {
                                    i5 = i4;
                                    i6 = h66Var.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.c;
                            long currentTimeMillis = System.currentTimeMillis();
                            i11 = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = currentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        oxw oxwVar = new oxw(new o3i(this.a, i5, i6, j, j2, null, null, i7, i11), i2, i10, i3);
                        fsn fsnVar = umdVar.n;
                        fsnVar.sendMessage(fsnVar.obtainMessage(18, oxwVar));
                    }
                }
            }
        }
    }

    @Override // defpackage.rzt
    public cn0 x(long j, cn0 cn0Var, cn0 cn0Var2, cn0 cn0Var3) {
        return ((tzt) this.d).x(f(j), cn0Var, cn0Var2, g(j, cn0Var, cn0Var3, cn0Var2));
    }

    public oio(mio mioVar) {
        this.d = mioVar;
        this.b = -9223372036854775807L;
        this.c = 0L;
        this.a = -1;
    }

    public oio(umd umdVar, int i, wo0 wo0Var, long j, long j2) {
        this.d = umdVar;
        this.a = i;
        this.e = wo0Var;
        this.b = j;
        this.c = j2;
    }
}
