package defpackage;

import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class vum {
    public static final float a;
    public static final ov6 b;

    static {
        float f = qum.a;
        a = 40;
        new ov6(0.2f, 0.0f, 0.8f, 1.0f);
        new ov6(0.4f, 0.0f, 1.0f, 1.0f);
        new ov6(0.0f, 0.0f, 0.65f, 1.0f);
        new ov6(0.1f, 0.0f, 0.45f, 1.0f);
        b = new ov6(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, yci yciVar, long j, float f2, long j2, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        float f3;
        yci yciVar3;
        float f4;
        xmn r;
        float f5;
        yci yciVar4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1746618448);
        if ((i & 6) == 0) {
            i3 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= oq5Var.e(j) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f2;
                i3 |= oq5Var.c(f3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= oq5Var.e(j2) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if ((196608 & i) == 0) {
                    i3 |= ((i2 & 32) == 0 && oq5Var.d(0)) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                boolean z = true;
                if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
                    oq5Var.U();
                    if ((i & 1) == 0 || oq5Var.y()) {
                        yci yciVar5 = i5 != 0 ? vci.a : yciVar2;
                        if (i4 != 0) {
                            f3 = qum.a;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        f5 = f3;
                        yciVar4 = yciVar5;
                    } else {
                        oq5Var.S();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        f5 = f3;
                        yciVar4 = yciVar2;
                    }
                    oq5Var.q();
                    float f6 = f >= 0.0f ? f : 0.0f;
                    if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                    amr amrVar = new amr(((jx7) oq5Var.j(es5.h)).n0(f5), 0.0f, 0, 0, 26);
                    yci m = d.m(dag.C(yciVar4, f6), a);
                    boolean c = oq5Var.c(f6) | ((i3 & 57344) == 16384) | oq5Var.h(amrVar);
                    if ((((i3 & 896) ^ 384) <= 256 || !oq5Var.e(j)) && (i3 & 384) != 256) {
                        z = false;
                    }
                    boolean z2 = c | z;
                    Object K = oq5Var.K();
                    if (z2 || K == gq5.a) {
                        rum rumVar = new rum(f6, j2, amrVar, j);
                        oq5Var.k0(rumVar);
                        K = rumVar;
                    }
                    ksw.j(0, oq5Var, m, (Function1) K);
                    yciVar3 = yciVar4;
                    f4 = f5;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    f4 = f3;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new sum(f, yciVar3, j, f4, j2, i, i2);
                    return;
                }
                return;
            }
            f3 = f2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            boolean z3 = true;
            if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        boolean z32 = true;
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(yci yciVar, long j, float f, long j2, int i, hq5 hq5Var, int i2, int i3) {
        int i4;
        float f2;
        int i5;
        long j3;
        int i6;
        float f3;
        xmn r;
        int i7;
        long j4;
        int i8;
        Object tumVar;
        long j5;
        float f4;
        Float valueOf = Float.valueOf(290.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1119119072);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.e(j) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= oq5Var.c(f2) ? 256 : 128;
            i5 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                i5 = i4 | 11264;
            }
            if (oq5Var.P(i5 & 1, (i5 & 9363) == 9362)) {
                oq5Var.S();
                j3 = j2;
                i6 = i;
                f3 = f2;
            } else {
                oq5Var.U();
                if ((i2 & 1) == 0 || oq5Var.y()) {
                    if (i9 != 0) {
                        f2 = qum.a;
                    }
                    i7 = i5 & (-57345);
                    j4 = d85.m;
                    i8 = 2;
                } else {
                    oq5Var.S();
                    i7 = i5 & (-57345);
                    j4 = j2;
                    i8 = i;
                }
                float f5 = f2;
                oq5Var.q();
                amr amrVar = new amr(((jx7) oq5Var.j(es5.h)).n0(f5), 0.0f, i8, 0, 26);
                xje D = fgq.D(null, oq5Var, 1);
                oct octVar = azt.b;
                xla xlaVar = nya.d;
                wje t = fgq.t(D, 0, 5, octVar, weo.C(weo.S(6660, 0, xlaVar, 2), null, 0L, 6), null, oq5Var, 33208, 16);
                oq5Var = oq5Var;
                wje s = fgq.s(D, 0.0f, 286.0f, weo.C(weo.S(1332, 0, xlaVar, 2), null, 0L, 6), null, oq5Var, 4536, 8);
                fcf fcfVar = new fcf();
                fcfVar.a = 1332;
                ecf a2 = fcfVar.a(valueOf2, 0);
                ov6 ov6Var = b;
                a2.b = ov6Var;
                fcfVar.a(valueOf, 666);
                wje s2 = fgq.s(D, 0.0f, 290.0f, weo.C(new gcf(fcfVar), null, 0L, 6), null, oq5Var, 4536, 8);
                fcf fcfVar2 = new fcf();
                fcfVar2.a = 1332;
                fcfVar2.a(valueOf2, 666).b = ov6Var;
                fcfVar2.a(valueOf, fcfVar2.a);
                wje s3 = fgq.s(D, 0.0f, 290.0f, weo.C(new gcf(fcfVar2), null, 0L, 6), null, oq5Var, 4536, 8);
                yci m = d.m(nfp.b(yciVar, true, hhm.v), a);
                boolean h = oq5Var.h(amrVar) | ((i7 & 7168) == 2048) | oq5Var.f(t) | oq5Var.f(s2) | oq5Var.f(s3) | oq5Var.f(s) | ((i7 & 896) == 256) | ((((i7 & 112) ^ 48) > 32 && oq5Var.e(j)) || (i7 & 48) == 32);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    j5 = j4;
                    f4 = f5;
                    tumVar = new tum(j5, amrVar, f4, j, t, s2, s3, s);
                    oq5Var.k0(tumVar);
                } else {
                    tumVar = K;
                    j5 = j4;
                    f4 = f5;
                }
                ksw.j(0, oq5Var, m, (Function1) tumVar);
                f3 = f4;
                j3 = j5;
                i6 = i8;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new uum(yciVar, j, f3, j3, i6, i2, i3);
                return;
            }
            return;
        }
        f2 = f;
        i5 = i4 | 3072;
        if ((i2 & 24576) == 0) {
        }
        if (oq5Var.P(i5 & 1, (i5 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(jpa jpaVar, float f, float f2, long j, amr amrVar) {
        float f3 = 2;
        float f4 = amrVar.a / f3;
        float d = nmq.d(jpaVar.e()) - (f3 * f4);
        jpaVar.V(j, f, f2, false, swf.i(f4, f4), a4g.i(d, d), (r26 & 64) != 0 ? 1.0f : 0.0f, (r26 & 128) != 0 ? dbc.a : amrVar);
    }
}
