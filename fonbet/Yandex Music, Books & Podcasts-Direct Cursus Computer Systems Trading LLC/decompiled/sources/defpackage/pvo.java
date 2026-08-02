package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class pvo {
    public static final float a = 80;

    public static final void a(String str, Function0 function0, hq5 hq5Var, int i) {
        yci c;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1503654767);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            c2.getClass();
            if (function0 != null && (c = a.c(c2, new ex(17, function0))) != null) {
                c2 = c;
            }
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (str != null) {
                oq5Var.Z(1716929522);
                ocg.e(str, gtq.d, d.c(vciVar, 1.0f), null, oq5Var, (i2 & 14) | 432, 8);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1717130092);
                ug3.a(androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) oq5Var.j(eq0.a)).c.a, vnj.i), oq5Var, 0);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hv(i, 2, str, function0);
        }
    }

    public static final void b(String str, d85 d85Var, float f, hq5 hq5Var, int i) {
        Unit unit;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1293868756);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(d85Var) ? 32 : 16) | (oq5Var.c(f) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = f * 0.052f;
            vci vciVar = vci.a;
            float f3 = a;
            if (str == null) {
                oq5Var.Z(1687536556);
                oq5Var.p(false);
                unit = null;
            } else {
                oq5Var.Z(1687536557);
                ocg.e(str, jtq.d, d.e(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f2, 0.0f, 0.0f, 13), f3), d85Var, oq5Var, ((i2 << 6) & 7168) | 48, 0);
                oq5Var.p(false);
                unit = Unit.a;
            }
            if (unit == null) {
                oq5Var.Z(1687797701);
                u1g.l(oq5Var, d.e(vciVar, f3 + f2));
                oq5Var.p(false);
            } else {
                oq5Var.Z(2132646451);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new eh6(str, d85Var, f, i, 4);
        }
    }

    public static final void c(final hvq hvqVar, final vvo vvoVar, final int i, final d85 d85Var, final String str, final String str2, final zd3 zd3Var, final wn5 wn5Var, final wn5 wn5Var2, hq5 hq5Var, final int i2) {
        int i3;
        final d85 d85Var2;
        String str3;
        String str4;
        wn5 wn5Var3;
        vvo vvoVar2;
        hvqVar.getClass();
        vvoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2074117462);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(hvqVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(vvoVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            d85Var2 = d85Var;
            i3 |= oq5Var.f(d85Var2) ? 2048 : 1024;
        } else {
            d85Var2 = d85Var;
        }
        if ((i2 & 24576) == 0) {
            str3 = str;
            i3 |= oq5Var.f(str3) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            str3 = str;
        }
        if ((196608 & i2) == 0) {
            str4 = str2;
            i3 |= oq5Var.f(str4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            str4 = str2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (i2 & 2097152) == 0 ? oq5Var.f(zd3Var) : oq5Var.h(zd3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            wn5Var3 = wn5Var2;
            i3 |= oq5Var.h(wn5Var3) ? 67108864 : 33554432;
        } else {
            wn5Var3 = wn5Var2;
        }
        int i4 = i3;
        if ((38347923 & i4) == 38347922 && oq5Var.z()) {
            oq5Var.S();
            vvoVar2 = vvoVar;
        } else {
            suq p = hvqVar.p();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            kd6 kd6Var = (kd6) CollectionsKt.S((List) szf.Q(p.e(), oq5Var).getValue(), i);
            if (kd6Var == null) {
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i5 = 0;
                    final String str5 = str3;
                    final String str6 = str4;
                    final wn5 wn5Var4 = wn5Var3;
                    r.d = new Function2() { // from class: nvo
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    pvo.c(hvqVar, vvoVar, i, d85Var2, str5, str6, zd3Var, wn5Var, wn5Var4, (hq5) obj, rvf.R(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    pvo.c(hvqVar, vvoVar, i, d85Var2, str5, str6, zd3Var, wn5Var, wn5Var4, (hq5) obj, rvf.R(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (kd6Var.b && (zd3Var instanceof wd3)) {
                oq5Var.Z(-1660482274);
                wn5 C = ild.C(31603916, new ovo(str, d85Var, str2, wn5Var, wn5Var2), oq5Var);
                yvo[] yvoVarArr = yvo.a;
                boolean z = true;
                boolean h = oq5Var.h(mm6Var) | oq5Var.h(p) | ((i4 & 896) == 256) | oq5Var.h(hvqVar);
                if ((3670016 & i4) != 1048576 && ((i4 & 2097152) == 0 || !oq5Var.h(zd3Var))) {
                    z = false;
                }
                boolean z2 = h | z;
                Object K2 = oq5Var.K();
                if (z2 || K2 == kjnVar) {
                    vvoVar2 = vvoVar;
                    i6i i6iVar = new i6i(mm6Var, p, i, hvqVar, zd3Var);
                    oq5Var.k0(i6iVar);
                    K2 = i6iVar;
                } else {
                    vvoVar2 = vvoVar;
                }
                vvoVar2.a(C, (Function1) K2, oq5Var, ((i4 << 6) & 7168) | 54);
            } else {
                vvoVar2 = vvoVar;
                oq5Var.Z(-1662969652);
            }
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i6 = 1;
            final vvo vvoVar3 = vvoVar2;
            r2.d = new Function2() { // from class: nvo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            pvo.c(hvqVar, vvoVar3, i, d85Var, str, str2, zd3Var, wn5Var, wn5Var2, (hq5) obj, rvf.R(i2 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            pvo.c(hvqVar, vvoVar3, i, d85Var, str, str2, zd3Var, wn5Var, wn5Var2, (hq5) obj, rvf.R(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(String str, d85 d85Var, String str2, wn5 wn5Var, wn5 wn5Var2, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(969867662);
        if (((i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(d85Var) ? 32 : 16) | (oq5Var.f(str2) ? 256 : 128) | (oq5Var.h(wn5Var) ? 2048 : 1024) | (oq5Var.h(wn5Var2) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608) & 74899) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            jf0.a(new qzm[0], null, true, ild.C(147662854, new ovo(wn5Var, str, d85Var, str2, wn5Var2, 1), oq5Var), oq5Var, 3072, 2);
            yciVar2 = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(str, d85Var, str2, wn5Var, wn5Var2, yciVar2, i, 16);
        }
    }
}
