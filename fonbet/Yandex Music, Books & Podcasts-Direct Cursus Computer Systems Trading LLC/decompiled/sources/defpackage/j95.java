package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.pulse.metrics.o;

/* loaded from: classes.dex */
public abstract class j95 {
    public static final agr a = new agr(e1.A0);
    public static final agr b = new agr(e1.B0);

    public static final long a(long j, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1680936624);
        i95 i95Var = (i95) oq5Var.j(a);
        long j2 = i95Var.a;
        long j3 = i95Var.q;
        if (d85.c(j, j2)) {
            j3 = i95Var.b;
        } else if (d85.c(j, i95Var.f)) {
            j3 = i95Var.g;
        } else if (d85.c(j, i95Var.j)) {
            j3 = i95Var.k;
        } else if (d85.c(j, i95Var.n)) {
            j3 = i95Var.o;
        } else if (d85.c(j, i95Var.w)) {
            j3 = i95Var.x;
        } else if (d85.c(j, i95Var.c)) {
            j3 = i95Var.d;
        } else if (d85.c(j, i95Var.h)) {
            j3 = i95Var.i;
        } else if (d85.c(j, i95Var.l)) {
            j3 = i95Var.m;
        } else if (d85.c(j, i95Var.y)) {
            j3 = i95Var.z;
        } else if (d85.c(j, i95Var.u)) {
            j3 = i95Var.v;
        } else if (!d85.c(j, i95Var.p)) {
            if (d85.c(j, i95Var.r)) {
                j3 = i95Var.s;
            } else if (!d85.c(j, i95Var.D) && !d85.c(j, i95Var.F) && !d85.c(j, i95Var.G) && !d85.c(j, i95Var.H) && !d85.c(j, i95Var.I) && !d85.c(j, i95Var.J)) {
                j3 = d85.n;
            }
        }
        if (j3 == 16) {
            j3 = ((d85) oq5Var.j(rb6.a)).a;
        }
        oq5Var.p(false);
        return j3;
    }

    public static final long b(i95 i95Var, int i) {
        switch (ouj.D(i)) {
            case 0:
                return i95Var.n;
            case 1:
                return i95Var.w;
            case 2:
                return i95Var.y;
            case 3:
                return i95Var.v;
            case 4:
                return i95Var.e;
            case 5:
                return i95Var.u;
            case 6:
                return i95Var.o;
            case 7:
                return i95Var.x;
            case 8:
                return i95Var.z;
            case 9:
                return i95Var.b;
            case 10:
                return i95Var.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
            case 32:
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
            default:
                return d85.n;
            case 13:
                return i95Var.g;
            case 14:
                return i95Var.i;
            case 17:
                return i95Var.q;
            case 18:
                return i95Var.s;
            case 19:
                return i95Var.k;
            case 20:
                return i95Var.m;
            case 23:
                return i95Var.A;
            case 24:
                return i95Var.B;
            case 25:
                return i95Var.a;
            case 26:
                return i95Var.c;
            case 29:
                return i95Var.C;
            case 30:
                return i95Var.f;
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                return i95Var.h;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                return i95Var.p;
            case 35:
                return i95Var.D;
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                return i95Var.F;
            case 37:
                return i95Var.G;
            case 38:
                return i95Var.H;
            case 39:
                return i95Var.I;
            case 40:
                return i95Var.J;
            case 41:
                return i95Var.E;
            case 42:
                return i95Var.t;
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                return i95Var.r;
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                return i95Var.j;
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                return i95Var.l;
        }
    }

    public static i95 c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, int i, int i2) {
        long j36 = (i & 1) != 0 ? t85.t : j;
        return new i95(j36, (i & 2) != 0 ? t85.j : j2, (i & 4) != 0 ? t85.u : j3, (i & 8) != 0 ? t85.k : j4, (i & 16) != 0 ? t85.e : j5, (i & 32) != 0 ? t85.w : j6, (i & 64) != 0 ? t85.l : j7, (i & 128) != 0 ? t85.x : j8, (i & 256) != 0 ? t85.m : j9, (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? t85.H : j10, (i & 1024) != 0 ? t85.p : j11, (i & 2048) != 0 ? t85.I : j12, (i & 4096) != 0 ? t85.q : j13, (i & RemoteCameraConfig.Notification.ID) != 0 ? t85.a : j14, (i & 16384) != 0 ? t85.g : j15, (32768 & i) != 0 ? t85.y : j16, (65536 & i) != 0 ? t85.n : j17, (131072 & i) != 0 ? t85.G : j18, (262144 & i) != 0 ? t85.o : j19, j36, (1048576 & i) != 0 ? t85.f : j20, (2097152 & i) != 0 ? t85.d : j21, (4194304 & i) != 0 ? t85.b : j22, (8388608 & i) != 0 ? t85.h : j23, (16777216 & i) != 0 ? t85.c : j24, (33554432 & i) != 0 ? t85.i : j25, (67108864 & i) != 0 ? t85.r : j26, (134217728 & i) != 0 ? t85.s : j27, (268435456 & i) != 0 ? t85.v : j28, (536870912 & i) != 0 ? t85.z : j29, (i2 & 8) != 0 ? t85.F : j35, (1073741824 & i) != 0 ? t85.A : j30, (i & Integer.MIN_VALUE) != 0 ? t85.B : j31, (i2 & 1) != 0 ? t85.C : j32, (i2 & 2) != 0 ? t85.D : j33, (i2 & 4) != 0 ? t85.E : j34);
    }
}
