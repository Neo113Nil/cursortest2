package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class if4 {
    public static final float a = 12;
    public static final float b = 80;
    public static final float c = -8;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(bf4 bf4Var, um0 um0Var, d85 d85Var, yci yciVar, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        hvq hvqVar2;
        int i4;
        boolean h;
        Object K;
        int i5;
        String str;
        vci vciVar;
        long j;
        boolean z;
        ArrayList arrayList;
        boolean z2;
        um0 um0Var2;
        yci yciVar2;
        hvq hvqVar3;
        zsq zsqVar2;
        xmn r;
        zsq zsqVar3 = zsqVar;
        bf4Var.getClass();
        um0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-564150552);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(bf4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(d85Var) ? 256 : 128;
        }
        int i6 = i3 | 3072;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i6 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            hvqVar2 = hvqVar;
            i6 |= oq5Var.h(hvqVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i2 & 32;
            int i8 = 196608;
            if (i4 == 0) {
                if ((196608 & i) == 0) {
                    i8 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar3) : oq5Var.h(zsqVar3) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                if ((74899 & i6) == 74898 || !oq5Var.z()) {
                    if (i7 != 0) {
                        hvqVar2 = null;
                    }
                    if (i4 != 0) {
                        zsqVar3 = null;
                    }
                    vci vciVar2 = vci.a;
                    yci c2 = d.c(vciVar2, 1.0f);
                    h = ((458752 & i6) != 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar3))) | oq5Var.h(hvqVar2);
                    K = oq5Var.K();
                    if (!h || K == gq5.a) {
                        K = new ko1(hvqVar2, zsqVar3, 4);
                        oq5Var.k0(K);
                    }
                    yci b2 = a.b(c2, null, 0L, 0.0f, null, (Function2) K, 15);
                    ox0 ox0Var = bf4Var.e.a;
                    gz2 gz2Var = b2c.o;
                    ta5 a2 = sa5.a(ox0Var, gz2Var, oq5Var, 48);
                    i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    str = bf4Var.a;
                    if (str == null) {
                        oq5Var.Z(422768687);
                        oq5Var.p(false);
                        vciVar = vciVar2;
                        z = true;
                    } else {
                        oq5Var.Z(422768688);
                        float f = 16;
                        vciVar = vciVar2;
                        yci f2 = androidx.compose.foundation.layout.a.q(vciVar2, f, 0.0f, f, 24, 2).f(new HorizontalAlignElement(gz2Var));
                        ges j2 = nu0.j();
                        if (d85Var == null) {
                            oq5Var.Z(512896711);
                            j = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(512895595);
                            oq5Var.p(false);
                            j = d85Var.a;
                        }
                        z = true;
                        xcs.b(str, f2, j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j2, oq5Var, 0, 0, 65016);
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    }
                    arrayList = bf4Var.c;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!(((af4) it.next()).d == etq.b ? z : false)) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = z;
                    um0Var2 = um0Var;
                    bg3.a(null, null, false, ild.C(461127860, new pu(z2, bf4Var, um0Var2, d85Var), oq5Var), oq5Var, 3072, 7);
                    oq5Var.p(z);
                    yciVar2 = vciVar;
                    hvqVar3 = hvqVar2;
                    zsqVar2 = zsqVar3;
                } else {
                    oq5Var.S();
                    um0Var2 = um0Var;
                    yciVar2 = yciVar;
                    zsqVar2 = zsqVar3;
                    hvqVar3 = hvqVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new fd1(bf4Var, um0Var2, d85Var, yciVar2, hvqVar3, zsqVar2, i, i2, 5);
                    return;
                }
                return;
            }
            i6 |= i8;
            if ((74899 & i6) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            vci vciVar22 = vci.a;
            yci c22 = d.c(vciVar22, 1.0f);
            h = ((458752 & i6) != 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar3))) | oq5Var.h(hvqVar2);
            K = oq5Var.K();
            if (!h) {
            }
            K = new ko1(hvqVar2, zsqVar3, 4);
            oq5Var.k0(K);
            yci b22 = a.b(c22, null, 0L, 0.0f, null, (Function2) K, 15);
            ox0 ox0Var2 = bf4Var.e.a;
            gz2 gz2Var2 = b2c.o;
            ta5 a22 = sa5.a(ox0Var2, gz2Var2, oq5Var, 48);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a22, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            str = bf4Var.a;
            if (str == null) {
            }
            arrayList = bf4Var.c;
            if (!arrayList.isEmpty()) {
            }
            z2 = z;
            um0Var2 = um0Var;
            bg3.a(null, null, false, ild.C(461127860, new pu(z2, bf4Var, um0Var2, d85Var), oq5Var), oq5Var, 3072, 7);
            oq5Var.p(z);
            yciVar2 = vciVar;
            hvqVar3 = hvqVar2;
            zsqVar2 = zsqVar3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        hvqVar2 = hvqVar;
        i4 = i2 & 32;
        int i82 = 196608;
        if (i4 == 0) {
        }
        i6 |= i82;
        if ((74899 & i6) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        vci vciVar222 = vci.a;
        yci c222 = d.c(vciVar222, 1.0f);
        h = ((458752 & i6) != 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar3))) | oq5Var.h(hvqVar2);
        K = oq5Var.K();
        if (!h) {
        }
        K = new ko1(hvqVar2, zsqVar3, 4);
        oq5Var.k0(K);
        yci b222 = a.b(c222, null, 0L, 0.0f, null, (Function2) K, 15);
        ox0 ox0Var22 = bf4Var.e.a;
        gz2 gz2Var22 = b2c.o;
        ta5 a222 = sa5.a(ox0Var22, gz2Var22, oq5Var, 48);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, b222);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a222, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var22);
        g0g.U(oq5Var, H22, wp5.d);
        str = bf4Var.a;
        if (str == null) {
        }
        arrayList = bf4Var.c;
        if (!arrayList.isEmpty()) {
        }
        z2 = z;
        um0Var2 = um0Var;
        bg3.a(null, null, false, ild.C(461127860, new pu(z2, bf4Var, um0Var2, d85Var), oq5Var), oq5Var, 3072, 7);
        oq5Var.p(z);
        yciVar2 = vciVar;
        hvqVar3 = hvqVar2;
        zsqVar2 = zsqVar3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final yci b(float f, long j, boolean z) {
        tgo tgoVar = ugo.a;
        yci yciVar = vci.a;
        yci b2 = androidx.compose.ui.graphics.a.b(xp3.u(yciVar, tgoVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 65535);
        if (!z) {
            yciVar = androidx.compose.ui.draw.a.c(yciVar, new hf4(j, f));
        }
        return b2.f(yciVar);
    }
}
