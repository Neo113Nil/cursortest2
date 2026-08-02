package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ndn {
    public static final float a;
    public static final float b = 80;
    public static final float c;
    public static final float d;

    static {
        float f = 12;
        a = f;
        c = f;
        d = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ldn ldnVar, um0 um0Var, d85 d85Var, yci yciVar, Function0 function0, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        hvq hvqVar2;
        int i4;
        Object K;
        Object obj;
        boolean h;
        Object K2;
        int i5;
        String str;
        vci vciVar;
        long j;
        boolean z;
        oq5 oq5Var;
        oq5 oq5Var2;
        zsq zsqVar2;
        Function0 function02;
        hvq hvqVar3;
        yci yciVar2;
        xmn r;
        zsq zsqVar3 = zsqVar;
        um0Var.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1433155358);
        if ((i & 6) == 0) {
            i3 = (oq5Var3.f(ldnVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var3.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var3.f(d85Var) ? 256 : 128;
        }
        int i6 = i3 | 27648;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i6 = 224256 | i3;
        } else if ((196608 & i) == 0) {
            hvqVar2 = hvqVar;
            i6 |= oq5Var3.h(hvqVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            int i8 = ScreenMirroringConfig.Video.BITRATE_1_5MB;
            if (i4 == 0) {
                if ((1572864 & i) == 0) {
                    i8 = (i & 2097152) == 0 ? oq5Var3.f(zsqVar3) : oq5Var3.h(zsqVar3) ? 1048576 : 524288;
                }
                if ((599187 & i6) == 599186 || !oq5Var3.z()) {
                    K = oq5Var3.K();
                    obj = gq5.a;
                    if (K == obj) {
                        K = new p1n(10);
                        oq5Var3.k0(K);
                    }
                    Function0 function03 = (Function0) K;
                    if (i7 != 0) {
                        hvqVar2 = null;
                    }
                    if (i4 != 0) {
                        zsqVar3 = null;
                    }
                    vci vciVar2 = vci.a;
                    yci o = a.o(d.c(vciVar2, 1.0f), 16, 0.0f, 2);
                    h = oq5Var3.h(hvqVar2) | ((3670016 & i6) != 1048576 || ((i6 & 2097152) != 0 && oq5Var3.h(zsqVar3)));
                    K2 = oq5Var3.K();
                    if (!h || K2 == obj) {
                        K2 = new ko1(hvqVar2, zsqVar3, 8);
                        oq5Var3.k0(K2);
                    }
                    yci b2 = com.yandex.music.core.ui.compose.a.b(o, null, 0L, 0.0f, null, (Function2) K2, 15);
                    gz2 gz2Var = b2c.o;
                    ta5 a2 = sa5.a(ldnVar.c.a, gz2Var, oq5Var3, 48);
                    i5 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(oq5Var3, b2);
                    xp5.T.getClass();
                    Function0 function04 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(function04);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, a2, wp5.f);
                    g0g.U(oq5Var3, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var3, i5, kb5Var);
                    }
                    g0g.U(oq5Var3, H, wp5.d);
                    str = ldnVar.a;
                    if (str == null) {
                        oq5Var3.Z(1205478953);
                        oq5Var3.p(false);
                        oq5Var = oq5Var3;
                        z = true;
                        vciVar = vciVar2;
                    } else {
                        oq5Var3.Z(1205478954);
                        vciVar = vciVar2;
                        yci f = a.q(vciVar2, 0.0f, 0.0f, 0.0f, 24, 7).f(new HorizontalAlignElement(gz2Var));
                        ges j2 = nu0.j();
                        if (d85Var == null) {
                            oq5Var3.Z(685613505);
                            j = ((dq0) oq5Var3.j(eq0.a)).b.a;
                            oq5Var3.p(false);
                        } else {
                            oq5Var3.Z(685612389);
                            oq5Var3.p(false);
                            j = d85Var.a;
                        }
                        z = true;
                        xcs.b(str, f, j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, j2, oq5Var3, 0, 0, 65016);
                        oq5Var = oq5Var3;
                        oq5Var.p(false);
                    }
                    zsq zsqVar4 = zsqVar3;
                    oq5 oq5Var4 = oq5Var;
                    bg3.a(null, null, false, ild.C(-838680146, new mdn(ldnVar, um0Var, function03, d85Var, 0), oq5Var), oq5Var4, 3072, 7);
                    oq5Var4.p(z);
                    oq5Var2 = oq5Var4;
                    zsqVar2 = zsqVar4;
                    function02 = function03;
                    hvqVar3 = hvqVar2;
                    yciVar2 = vciVar;
                } else {
                    oq5Var3.S();
                    function02 = function0;
                    zsqVar2 = zsqVar3;
                    hvqVar3 = hvqVar2;
                    oq5Var2 = oq5Var3;
                    yciVar2 = yciVar;
                }
                r = oq5Var2.r();
                if (r != null) {
                    r.d = new ou(ldnVar, um0Var, d85Var, yciVar2, function02, hvqVar3, zsqVar2, i, i2);
                    return;
                }
                return;
            }
            i6 |= i8;
            if ((599187 & i6) == 599186) {
            }
            K = oq5Var3.K();
            obj = gq5.a;
            if (K == obj) {
            }
            Function0 function032 = (Function0) K;
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            vci vciVar22 = vci.a;
            yci o2 = a.o(d.c(vciVar22, 1.0f), 16, 0.0f, 2);
            h = oq5Var3.h(hvqVar2) | ((3670016 & i6) != 1048576 || ((i6 & 2097152) != 0 && oq5Var3.h(zsqVar3)));
            K2 = oq5Var3.K();
            if (!h) {
            }
            K2 = new ko1(hvqVar2, zsqVar3, 8);
            oq5Var3.k0(K2);
            yci b22 = com.yandex.music.core.ui.compose.a.b(o2, null, 0L, 0.0f, null, (Function2) K2, 15);
            gz2 gz2Var2 = b2c.o;
            ta5 a22 = sa5.a(ldnVar.c.a, gz2Var2, oq5Var3, 48);
            i5 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, b22);
            xp5.T.getClass();
            Function0 function042 = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
            }
            g0g.U(oq5Var3, a22, wp5.f);
            g0g.U(oq5Var3, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var3.O) {
            }
            ouj.x(i5, oq5Var3, i5, kb5Var2);
            g0g.U(oq5Var3, H2, wp5.d);
            str = ldnVar.a;
            if (str == null) {
            }
            zsq zsqVar42 = zsqVar3;
            oq5 oq5Var42 = oq5Var;
            bg3.a(null, null, false, ild.C(-838680146, new mdn(ldnVar, um0Var, function032, d85Var, 0), oq5Var), oq5Var42, 3072, 7);
            oq5Var42.p(z);
            oq5Var2 = oq5Var42;
            zsqVar2 = zsqVar42;
            function02 = function032;
            hvqVar3 = hvqVar2;
            yciVar2 = vciVar;
            r = oq5Var2.r();
            if (r != null) {
            }
        }
        hvqVar2 = hvqVar;
        i4 = i2 & 64;
        int i82 = ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if (i4 == 0) {
        }
        i6 |= i82;
        if ((599187 & i6) == 599186) {
        }
        K = oq5Var3.K();
        obj = gq5.a;
        if (K == obj) {
        }
        Function0 function0322 = (Function0) K;
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        vci vciVar222 = vci.a;
        yci o22 = a.o(d.c(vciVar222, 1.0f), 16, 0.0f, 2);
        h = oq5Var3.h(hvqVar2) | ((3670016 & i6) != 1048576 || ((i6 & 2097152) != 0 && oq5Var3.h(zsqVar3)));
        K2 = oq5Var3.K();
        if (!h) {
        }
        K2 = new ko1(hvqVar2, zsqVar3, 8);
        oq5Var3.k0(K2);
        yci b222 = com.yandex.music.core.ui.compose.a.b(o22, null, 0L, 0.0f, null, (Function2) K2, 15);
        gz2 gz2Var22 = b2c.o;
        ta5 a222 = sa5.a(ldnVar.c.a, gz2Var22, oq5Var3, 48);
        i5 = oq5Var3.P;
        androidx.compose.runtime.internal.a l22 = oq5Var3.l();
        yci H22 = vnj.H(oq5Var3, b222);
        xp5.T.getClass();
        Function0 function0422 = wp5.b;
        oq5Var3.d0();
        if (oq5Var3.O) {
        }
        g0g.U(oq5Var3, a222, wp5.f);
        g0g.U(oq5Var3, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var3.O) {
        }
        ouj.x(i5, oq5Var3, i5, kb5Var22);
        g0g.U(oq5Var3, H22, wp5.d);
        str = ldnVar.a;
        if (str == null) {
        }
        zsq zsqVar422 = zsqVar3;
        oq5 oq5Var422 = oq5Var;
        bg3.a(null, null, false, ild.C(-838680146, new mdn(ldnVar, um0Var, function0322, d85Var, 0), oq5Var), oq5Var422, 3072, 7);
        oq5Var422.p(z);
        oq5Var2 = oq5Var422;
        zsqVar2 = zsqVar422;
        function02 = function0322;
        hvqVar3 = hvqVar2;
        yciVar2 = vciVar;
        r = oq5Var2.r();
        if (r != null) {
        }
    }
}
