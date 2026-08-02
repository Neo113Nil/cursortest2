package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material.MinimumInteractiveModifier;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class aae {
    public static final float a = 24;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Function0 function0, yci yciVar, boolean z, Function2 function2, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z2;
        int i5;
        yci yciVar3;
        boolean z3;
        xmn r;
        float f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-111063634);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= oq5Var.g(z2) ? 256 : 128;
                i5 = i3 | 3072;
                if ((i & 24576) == 0) {
                    i5 |= oq5Var.h(function2) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
                    yci yciVar4 = i6 != 0 ? vci.a : yciVar2;
                    boolean z4 = i4 != 0 ? true : z2;
                    agr agrVar = yre.a;
                    yci d = a.d(yciVar4.f(MinimumInteractiveModifier.a), null, eeo.a(a, 4, 0L, false), z4, null, new meo(0), function0, 8);
                    kfh d2 = ug3.d(b2c.f, false);
                    int i7 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, d);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    if (z4) {
                        oq5Var.Z(1885393015);
                        f = ((Number) oq5Var.j(mb6.a)).floatValue();
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1885393848);
                        long j = ((d85) oq5Var.j(sb6.a)).a;
                        if (((ma5) oq5Var.j(pa5.a)).g()) {
                            c3x.N(j);
                        } else {
                            c3x.N(j);
                        }
                        oq5Var.p(false);
                        f = 0.38f;
                    }
                    etn.l(mb6.a.a(Float.valueOf(f)), function2, oq5Var, ((i5 >> 9) & 112) | 8);
                    oq5Var.p(true);
                    yciVar3 = yciVar4;
                    z3 = z4;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    z3 = z2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new eh3(function0, yciVar3, z3, function2, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i3 | 3072;
            if ((i & 24576) == 0) {
            }
            if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i3 | 3072;
        if ((i & 24576) == 0) {
        }
        if (oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }
}
