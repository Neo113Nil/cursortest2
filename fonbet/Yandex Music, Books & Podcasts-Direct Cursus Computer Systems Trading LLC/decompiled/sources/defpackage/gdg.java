package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.slides.ui.music.logic.impl.selection.model.CardSelectionStorage$ArtistSelection;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class gdg {
    public static final float A(hq5 hq5Var) {
        return !((ma5) ((oq5) hq5Var).j(pa5.a)).g() ? 10 : 6;
    }

    public static final long B(hq5 hq5Var) {
        return c3x.f(!((ma5) ((oq5) hq5Var).j(pa5.a)).g() ? 603979775 : 546608276);
    }

    public static final Pair C(ybu ybuVar) {
        ArrayList arrayList;
        ybuVar.getClass();
        List list = ybuVar.a;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((y1u) it.next()).a);
            }
        } else {
            arrayList = null;
        }
        return new Pair(arrayList, null);
    }

    public static final ArrayList D(ybu ybuVar) {
        ybuVar.getClass();
        List list = ybuVar.a;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new s7u((y1u) it.next(), ""));
        }
        return arrayList;
    }

    public static final mwk E(n7q n7qVar) {
        n7qVar.getClass();
        return (mwk) wdg.A(n7qVar, mvt.i);
    }

    public static final swa F(hq5 hq5Var) {
        return ((xwa) ((oq5) hq5Var).j(ywa.a)).a;
    }

    public static final String G(Collection collection) {
        return hlr.c(CollectionsKt.X(collection, StringUtils.COMMA, null, null, null, 62), "    ").concat(hlr.c(" }", "    "));
    }

    public static final String H(Collection collection) {
        return hlr.c(CollectionsKt.X(collection, StringUtils.COMMA, null, null, null, 62), "    ").concat(hlr.c("},", "    "));
    }

    public static HashMap I(int i) {
        return new HashMap(q(i));
    }

    public static final void J(ExoPlayer exoPlayer, f8l f8lVar) {
        exoPlayer.getClass();
        f8lVar.getClass();
        exoPlayer.x0(f8lVar);
        exoPlayer.n(null);
    }

    public static final Resources K(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.j(AndroidCompositionLocals_androidKt.a);
        return ((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)).getResources();
    }

    public static final yci L(yci yciVar, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? yciVar : a.b(yciVar, f, f2, 0.0f, 0.0f, 0.0f, null, false, 131068);
    }

    public static d70 M(mqs mqsVar, int i) {
        mqsVar.getClass();
        return new d70(mqsVar.d().e(), c70.g, mqsVar.c, i, "");
    }

    public static final yci N(yci yciVar, long j, float f) {
        return androidx.compose.ui.draw.a.c(yciVar, new hf4(f, j));
    }

    public static final void O(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        if (j < 0) {
            xq0.x("Failed requirement.");
            return;
        }
        if (j < Math.pow(256.0d, i)) {
            while (i > 0) {
                int i2 = (i - 1) * 8;
                byteArrayOutputStream.write((byte) (((255 << i2) & j) >> i2));
                i--;
            }
            return;
        }
        throw new IllegalArgumentException(("Value " + j + " cannot be stored in " + i + " bytes").toString());
    }

    public static final void P(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, int i) {
        bArr.getClass();
        if (bArr.length > i) {
            xq0.x("Failed requirement.");
            return;
        }
        O(byteArrayOutputStream, bArr.length, (int) (Math.ceil(Math.log(i) / k86.b) / 8));
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static void Q(int i, int i2) {
        String n0;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                n0 = hdg.n0("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    xq0.x(k5r.i(i2, "negative size: "));
                    return;
                }
                n0 = hdg.n0("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(n0);
        }
    }

    public static void R(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? S(i, i3, "start index") : (i2 < 0 || i2 > i3) ? S(i2, i3, "end index") : hdg.n0("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String S(int i, int i2, String str) {
        if (i < 0) {
            return hdg.n0("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return hdg.n0("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        xq0.x(k5r.i(i2, "negative size: "));
        return null;
    }

    public static final void a(boolean z, Function0 function0, hq5 hq5Var, int i) {
        sdr sdrVar;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(222958790);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(2145970709);
                sdrVar = pm0.f(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(2146015752);
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = tlm.h(1.0f, oq5Var);
                }
                sdrVar = (poi) K;
                oq5Var.p(false);
            }
            oq5Var.Z(-484913793);
            yci yciVar = vci.a;
            yci d = d.d(yciVar, 1.0f);
            if (z) {
                yciVar = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i);
            }
            yci f = d.f(yciVar);
            oq5Var.p(false);
            boolean f2 = oq5Var.f(sdrVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new f6u(sdrVar, 9);
                oq5Var.k0(K2);
            }
            function02 = function0;
            lsq.i(ild.f, ild.g, ild.h, function02, wyf.s(f, (Function0) K2), null, null, oq5Var, ((i2 << 6) & 7168) | 438, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j93(i, function02, z);
        }
    }

    public static final void b(final boolean z, boolean z2, hq5 hq5Var, final int i) {
        int i2;
        final boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2084613742);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z2) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ges c = nu0.c();
            float f = uuv.d;
            vci vciVar = vci.a;
            int i3 = ((i2 >> 3) & 14) | 48;
            z3 = z2;
            ivf.l(z3, d.r(vciVar, f), c, oq5Var, i3, 0);
            float f2 = uuv.g / 2;
            u1g.l(oq5Var, d.e(vciVar, f2));
            if (z) {
                oq5Var.Z(1796345325);
                ges j = nu0.j();
                float f3 = uuv.f;
                ivf.l(z3, d.r(vciVar, f3), j, oq5Var, i3, 0);
                ges j2 = nu0.j();
                float f4 = uuv.e;
                ivf.l(z3, d.r(vciVar, f4), j2, oq5Var, i3, 0);
                ivf.l(z3, d.r(vciVar, f3), nu0.j(), oq5Var, i3, 0);
                ivf.l(z3, d.r(vciVar, f4), nu0.j(), oq5Var, i3, 0);
                ivf.l(z3, d.r(vciVar, f), nu0.j(), oq5Var, i3, 0);
                eta.p(vciVar, f2, oq5Var, false);
            } else {
                oq5Var.Z(1787874420);
                oq5Var.p(false);
            }
        } else {
            z3 = z2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: bvv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    gdg.b(z, z3, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(String str, yci yciVar, boolean z, Function2 function2, hq5 hq5Var, int i) {
        Function2 function22;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1352527296);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function22 = function2;
        } else {
            wn5 wn5Var = ild.i;
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            w1g.j(str, null, null, null, null, null, null, 0.0f, null, 0, ild.C(-1331845670, new vru(0), oq5Var), oq5Var, (i2 & 14) | 48, 1020);
            if (z) {
                oq5Var.Z(-806149764);
                u1g.l(oq5Var, androidx.compose.foundation.a.b(d.c(vci.a, 1.0f), ((dq0) oq5Var.j(eq0.a)).c.d, vnj.i));
            } else {
                oq5Var.Z(-816402456);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            function22 = wn5Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(str, yciVar, z, function22, i, 28);
        }
    }

    public static final void d(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        Function0 function02;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2072684722);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            yciVar2 = yciVar;
            a0g.p(function02, yciVar2, false, false, 0L, null, lxe.c, oq5Var, (i2 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i2 & 112), 60);
        } else {
            function02 = function0;
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function02, yciVar2, i, 11);
        }
    }

    public static final void e(final jfs jfsVar, final long j, final boolean z, final boolean z2, final yci yciVar, hq5 hq5Var, final int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(286650284);
        int i2 = i | (oq5Var.h(jfsVar) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.g(z2) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci d = d.d(yciVar, 1.0f);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i4 = (i2 << 3) & 896;
            xcs.b(jfsVar.a, null, j, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, i4, 0, 65530);
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, 10));
            u9b u9bVar = jfsVar.e;
            if (!z) {
                u9bVar = null;
            }
            if (u9bVar == null) {
                oq5Var.Z(50248934);
                oq5Var.p(false);
            } else {
                oq5Var.Z(50248935);
                f(u9bVar, vciVar, oq5Var, 48);
                eta.p(vciVar, 6, oq5Var, false);
            }
            if (z2) {
                oq5Var.Z(50475886);
                bg3.a(null, null, false, ild.C(1846159571, new tik(27, jfsVar), oq5Var), oq5Var, 3072, 7);
                eta.p(vciVar, 8, oq5Var, false);
            } else {
                oq5Var.Z(42512544);
                oq5Var.p(false);
            }
            String str = jfsVar.b;
            ges e = nu0.e();
            long j2 = nu0.e().b.c;
            v7g.p(j2);
            xcs.b(str, null, j, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 2, 0, null, ges.b(e, 0L, 0L, null, null, 0L, 0, v7g.D(kes.c(j2) * 0.85f, 1095216660480L & j2), null, new h6g(17, e6g.c), 0, 0, 15597567), oq5Var, i4, 3120, 54778);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(j, z, z2, yciVar, i) { // from class: lfs
                public final /* synthetic */ long b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ yci e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(9);
                    gdg.e(jfs.this, this.b, this.c, this.d, this.e, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(u9b u9bVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-277151451);
        if ((((oq5Var.h(u9bVar) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f = 52;
            float f2 = 2;
            yci a = androidx.compose.foundation.a.a(xp3.u(d.m(yciVar, (f2 * f2) + f), o5g.G(oq5Var)), y9w.T(u75.h(new d85(((dq0) oq5Var.j(eq0.a)).b.d), new d85(d85.b)), 0.0f, 0.0f, 14));
            kfh d = ug3.d(b2c.f, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.y(u9bVar.e(wct.s(), WebPath$Storage.AVATARS), qo6.a, xp3.u(d.m(vci.a, f), o5g.G(oq5Var)), false, false, null, null, null, oq5Var, 48, 248);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(u9bVar, yciVar, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(String str, yci yciVar, long j, Function0 function0, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        long j2;
        int i3;
        int i4;
        Function0 function02;
        int i5;
        int i6;
        Function0 function03;
        int i7;
        yci yciVar3;
        oq5 oq5Var;
        yci yciVar4;
        long j3;
        Function0 function04;
        xmn r;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1434885787);
        int i8 = i | (oq5Var2.f(str) ? 4 : 2);
        int i9 = i2 & 2;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i8 |= oq5Var2.f(yciVar2) ? 32 : 16;
            if ((i2 & 4) != 0) {
                j2 = j;
                if (oq5Var2.e(j2)) {
                    i3 = 256;
                    int i10 = i8 | i3;
                    i4 = i2 & 8;
                    if (i4 != 0) {
                        i5 = i10 | 3072;
                        function02 = function0;
                    } else {
                        function02 = function0;
                        i5 = i10 | (oq5Var2.h(function02) ? 2048 : 1024);
                    }
                    if ((i5 & 1171) == 1170 || !oq5Var2.z()) {
                        oq5Var2.U();
                        i6 = i & 1;
                        yci yciVar5 = vci.a;
                        if (i6 != 0 || oq5Var2.y()) {
                            if (i9 != 0) {
                                yciVar2 = yciVar5;
                            }
                            if ((i2 & 4) != 0) {
                                j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                                i5 &= -897;
                            }
                            if (i4 != 0) {
                                function03 = null;
                                i7 = i5;
                                yciVar3 = yciVar2;
                                long j4 = j2;
                                oq5Var2.q();
                                yme ymeVar = new yme(new psk(4, v7g.z(20), v7g.z(16)), ild.C(2092024812, new fdg(j4, 0), oq5Var2));
                                kn0 kn0Var = new kn0();
                                u2x.s(kn0Var, "listenersCount");
                                kn0Var.d(str);
                                mn0 h = kn0Var.h();
                                Map b = tah.b(new Pair("listenersCount", ymeVar));
                                h6g h6gVar = nu0.a;
                                h6g h6gVar2 = h6g.c;
                                ges i11 = nu0.i();
                                if (function03 != null) {
                                    yciVar5 = androidx.compose.foundation.a.e(yciVar5, false, null, null, function03, 7);
                                }
                                oq5Var = oq5Var2;
                                xcs.c(h, yciVar3.f(yciVar5), j4, 0L, null, 0L, null, 0L, 2, false, 1, 0, b, null, i11, oq5Var, i7 & 896, 3120, 88056);
                                yciVar4 = yciVar3;
                                j3 = j4;
                                function04 = function03;
                            }
                        } else {
                            oq5Var2.S();
                            if ((i2 & 4) != 0) {
                                i5 &= -897;
                            }
                        }
                        i7 = i5;
                        yciVar3 = yciVar2;
                        function03 = function02;
                        long j42 = j2;
                        oq5Var2.q();
                        yme ymeVar2 = new yme(new psk(4, v7g.z(20), v7g.z(16)), ild.C(2092024812, new fdg(j42, 0), oq5Var2));
                        kn0 kn0Var2 = new kn0();
                        u2x.s(kn0Var2, "listenersCount");
                        kn0Var2.d(str);
                        mn0 h2 = kn0Var2.h();
                        Map b2 = tah.b(new Pair("listenersCount", ymeVar2));
                        h6g h6gVar3 = nu0.a;
                        h6g h6gVar22 = h6g.c;
                        ges i112 = nu0.i();
                        if (function03 != null) {
                        }
                        oq5Var = oq5Var2;
                        xcs.c(h2, yciVar3.f(yciVar5), j42, 0L, null, 0L, null, 0L, 2, false, 1, 0, b2, null, i112, oq5Var, i7 & 896, 3120, 88056);
                        yciVar4 = yciVar3;
                        j3 = j42;
                        function04 = function03;
                    } else {
                        oq5Var2.S();
                        oq5Var = oq5Var2;
                        yciVar4 = yciVar2;
                        j3 = j2;
                        function04 = function02;
                    }
                    r = oq5Var.r();
                    if (r != null) {
                        r.d = new e16(str, yciVar4, j3, function04, i, i2);
                        return;
                    }
                    return;
                }
            } else {
                j2 = j;
            }
            i3 = 128;
            int i102 = i8 | i3;
            i4 = i2 & 8;
            if (i4 != 0) {
            }
            if ((i5 & 1171) == 1170) {
            }
            oq5Var2.U();
            i6 = i & 1;
            yci yciVar52 = vci.a;
            if (i6 != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            i7 = i5;
            yciVar3 = yciVar2;
            function03 = function02;
            long j422 = j2;
            oq5Var2.q();
            yme ymeVar22 = new yme(new psk(4, v7g.z(20), v7g.z(16)), ild.C(2092024812, new fdg(j422, 0), oq5Var2));
            kn0 kn0Var22 = new kn0();
            u2x.s(kn0Var22, "listenersCount");
            kn0Var22.d(str);
            mn0 h22 = kn0Var22.h();
            Map b22 = tah.b(new Pair("listenersCount", ymeVar22));
            h6g h6gVar32 = nu0.a;
            h6g h6gVar222 = h6g.c;
            ges i1122 = nu0.i();
            if (function03 != null) {
            }
            oq5Var = oq5Var2;
            xcs.c(h22, yciVar3.f(yciVar52), j422, 0L, null, 0L, null, 0L, 2, false, 1, 0, b22, null, i1122, oq5Var, i7 & 896, 3120, 88056);
            yciVar4 = yciVar3;
            j3 = j422;
            function04 = function03;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((i2 & 4) != 0) {
        }
        i3 = 128;
        int i1022 = i8 | i3;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        if ((i5 & 1171) == 1170) {
        }
        oq5Var2.U();
        i6 = i & 1;
        yci yciVar522 = vci.a;
        if (i6 != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        i7 = i5;
        yciVar3 = yciVar2;
        function03 = function02;
        long j4222 = j2;
        oq5Var2.q();
        yme ymeVar222 = new yme(new psk(4, v7g.z(20), v7g.z(16)), ild.C(2092024812, new fdg(j4222, 0), oq5Var2));
        kn0 kn0Var222 = new kn0();
        u2x.s(kn0Var222, "listenersCount");
        kn0Var222.d(str);
        mn0 h222 = kn0Var222.h();
        Map b222 = tah.b(new Pair("listenersCount", ymeVar222));
        h6g h6gVar322 = nu0.a;
        h6g h6gVar2222 = h6g.c;
        ges i11222 = nu0.i();
        if (function03 != null) {
        }
        oq5Var = oq5Var2;
        xcs.c(h222, yciVar3.f(yciVar522), j4222, 0L, null, 0L, null, 0L, 2, false, 1, 0, b222, null, i11222, oq5Var, i7 & 896, 3120, 88056);
        yciVar4 = yciVar3;
        j3 = j4222;
        function04 = function03;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void h(int i, hq5 hq5Var, yci yciVar, boolean z) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1228169624);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            ges i3 = nu0.i();
            yciVar2 = vci.a;
            ivf.l(z, androidx.compose.foundation.layout.a.q(d.r(yciVar2, 64), 0.0f, 0.0f, 0.0f, 4, 7), i3, oq5Var, i2 & 14, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar2, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        yci yciVar2;
        int i4;
        int i5;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-795255144);
        if ((i & 6) == 0) {
            i3 = i | (oq5Var.g(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            if ((i3 & 19) == 18 || !oq5Var.z()) {
                vci vciVar = vci.a;
                yci yciVar4 = i6 == 0 ? vciVar : yciVar2;
                float f = 12;
                yci q = androidx.compose.foundation.layout.a.q(xp3.u(androidx.compose.foundation.layout.a.d(d.d(yciVar4, 1.0f), 1.0f), o5g.C(oq5Var)), 0.0f, f, 0.0f, 0.0f, 13);
                ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, q);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                kb5 kb5Var = wp5.f;
                g0g.U(oq5Var, a, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                int i7 = i3 & 14;
                ivf.k(i7, 0, oq5Var, xp3.u(androidx.compose.foundation.layout.a.d(new LayoutWeightElement(true, 1.0f), 1.0f), o5g.F(oq5Var)), z);
                u1g.l(oq5Var, d.e(vciVar, f));
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                yci e = d.e(vciVar, w1g.p(nu0.j(), 0, oq5Var, 0, 2) * 2);
                kfh d = ug3.d(b2c.b, false);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, e);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                ivf.l(z, d.r(xp3.u(vciVar, o5g.C(oq5Var)), 92), nu0.j(), oq5Var, i7, 0);
                oq5Var.p(true);
                oq5Var.p(true);
                yciVar3 = yciVar4;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new n10(z, yciVar3, i, i2, 4);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 19) == 18) {
        }
        vci vciVar2 = vci.a;
        if (i6 == 0) {
        }
        float f2 = 12;
        yci q2 = androidx.compose.foundation.layout.a.q(xp3.u(androidx.compose.foundation.layout.a.d(d.d(yciVar4, 1.0f), 1.0f), o5g.C(oq5Var)), 0.0f, f2, 0.0f, 0.0f, 13);
        ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
        i4 = oq5Var.P;
        androidx.compose.runtime.internal.a l3 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, q2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var5 = wp5.f;
        g0g.U(oq5Var, a2, kb5Var5);
        kb5 kb5Var22 = wp5.e;
        g0g.U(oq5Var, l3, kb5Var22);
        kb5 kb5Var32 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i4, oq5Var, i4, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        if (1.0f <= 0.0d) {
        }
        int i72 = i3 & 14;
        ivf.k(i72, 0, oq5Var, xp3.u(androidx.compose.foundation.layout.a.d(new LayoutWeightElement(true, 1.0f), 1.0f), o5g.F(oq5Var)), z);
        u1g.l(oq5Var, d.e(vciVar2, f2));
        h6g h6gVar3 = nu0.a;
        h6g h6gVar22 = h6g.c;
        yci e2 = d.e(vciVar2, w1g.p(nu0.j(), 0, oq5Var, 0, 2) * 2);
        kfh d2 = ug3.d(b2c.b, false);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, e2);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d2, kb5Var5);
        g0g.U(oq5Var, l22, kb5Var22);
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var32);
        g0g.U(oq5Var, H22, kb5Var42);
        ivf.l(z, d.r(xp3.u(vciVar2, o5g.C(oq5Var)), 92), nu0.j(), oq5Var, i72, 0);
        oq5Var.p(true);
        oq5Var.p(true);
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void j(lvi lviVar, fvf fvfVar, o0k o0kVar, boolean z, Function0 function0, dvi dviVar, hq5 hq5Var, int i) {
        int i2;
        fvf fvfVar2;
        fvfVar.getClass();
        o0kVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(157844126);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(lviVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fvfVar2 = fvfVar;
            i2 |= oq5Var.f(fvfVar2) ? 32 : 16;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i2 |= (262144 & i) == 0 ? oq5Var.f(dviVar) : oq5Var.h(dviVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 >> 9;
            bfg.f(z, function0, o0kVar, null, false, ild.C(-227084770, new av5(fvfVar2, o0kVar, lviVar, dviVar, 18), oq5Var), oq5Var, (i4 & 112) | (i4 & 14) | 196608 | (i3 & 896), 24);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(i, 14, lviVar, fvfVar, o0kVar, function0, dviVar, z);
        }
    }

    public static final void k(mam mamVar, hq5 hq5Var, int i) {
        mam mamVar2;
        fvf fvfVar;
        ram ramVar;
        mamVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1153045208);
        int i2 = (oq5Var.h(mamVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            ram ramVar2 = (ram) gld.M(mamVar.i, oq5Var).getValue();
            ogp.g.e(false, ramVar2 instanceof pam, null, oq5Var, 4096, 5);
            boolean h = oq5Var.h(mamVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                fvfVar = a;
                ramVar = ramVar2;
                ayl aylVar = new ayl(0, mamVar, mam.class, "onBackClick", "onBackClick()V", 0, 17);
                oq5Var.k0(aylVar);
                K = aylVar;
            } else {
                ramVar = ramVar2;
                fvfVar = a;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var.h(mamVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                ayl aylVar2 = new ayl(0, mamVar, mam.class, "onSearchClick", "onSearchClick()V", 0, 18);
                mamVar2 = mamVar;
                oq5Var.k0(aylVar2);
                K2 = aylVar2;
            } else {
                mamVar2 = mamVar;
            }
            u7g.i(R.string.my_music_podcasts, fvfVar, (Function0) h9fVar, null, (Function0) ((h9f) K2), ild.C(1237222220, new vtb(16, ramVar, fvfVar, mamVar2), oq5Var), oq5Var, 199680);
        } else {
            mamVar2 = mamVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(mamVar2, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    public static final void l(com.yandex.music.payment.screen.promocode.viewmodel.a aVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        int i2;
        boolean z;
        iz2 iz2Var;
        kjn kjnVar;
        String str;
        long j;
        vci vciVar;
        b bVar;
        boolean z2;
        boolean z3;
        b bVar2;
        kjn kjnVar2;
        int i3;
        boolean z4;
        oq5 oq5Var2;
        ?? r15;
        boolean z5;
        String str2;
        b bVar3;
        yci yciVar2;
        vci vciVar2;
        boolean z6;
        boolean z7;
        b bVar4;
        int i4;
        int i5;
        com.yandex.music.payment.screen.promocode.viewmodel.a aVar2 = aVar;
        iz2 iz2Var2 = b2c.d;
        iz2 iz2Var3 = b2c.b;
        aVar2.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-819943992);
        int i6 = i | (oq5Var3.h(aVar2) ? 4 : 2);
        if (oq5Var3.P(i6 & 1, (i6 & 19) != 18)) {
            Object K = oq5Var3.K();
            kjn kjnVar3 = gq5.a;
            if (K == kjnVar3) {
                h0m h0mVar = new h0m(aVar2.p, 11);
                oq5Var3.k0(h0mVar);
                K = h0mVar;
            }
            bxm bxmVar = (bxm) gld.N((pjc) K, ywm.a, oq5Var3, 48).getValue();
            if (bxmVar instanceof ywm) {
                oq5Var3.Z(-1987153044);
                oq5Var3.p(false);
                oq5Var = oq5Var3;
            } else {
                boolean z8 = bxmVar instanceof zwm;
                vci vciVar3 = vci.a;
                b bVar5 = b.a;
                if (z8) {
                    oq5Var3.Z(-1987151623);
                    yci b = androidx.compose.foundation.a.b(yciVar, kg5.r(R.color.bg_secondary_night, oq5Var3), vnj.i);
                    kfh d = ug3.d(iz2Var3, false);
                    int i7 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l = oq5Var3.l();
                    yci H = vnj.H(oq5Var3, b);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, d, wp5.f);
                    g0g.U(oq5Var3, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var3, i7, kb5Var);
                    }
                    g0g.U(oq5Var3, H, wp5.d);
                    pd.g(0, 0, oq5Var3, bVar5.a(vciVar3, b2c.f));
                    boolean h = oq5Var3.h(aVar2);
                    Object K2 = oq5Var3.K();
                    if (h || K2 == kjnVar3) {
                        bVar4 = bVar5;
                        i4 = 16;
                        i5 = 64;
                        ebm ebmVar = new ebm(0, aVar2, com.yandex.music.payment.screen.promocode.viewmodel.a.class, "onCloseTap", "onCloseTap()V", 0, 20);
                        oq5Var3.k0(ebmVar);
                        K2 = ebmVar;
                    } else {
                        bVar4 = bVar5;
                        i4 = 16;
                        i5 = 64;
                    }
                    d((Function0) ((h9f) K2), androidx.compose.foundation.layout.a.q(gut.z(gut.a0(gut.p1(bVar4.a(vciVar3, iz2Var2)))), 0.0f, i5, i4, 0.0f, 9), oq5Var3, 0);
                    oq5Var3.p(true);
                    oq5Var3.p(false);
                    aVar2 = aVar;
                    oq5Var = oq5Var3;
                } else {
                    if (!(bxmVar instanceof axm)) {
                        throw vz1.i(oq5Var3, -1987152578, false);
                    }
                    oq5Var3.Z(-1987131256);
                    yci z9 = gut.z(gut.a0(gut.p1(yciVar)));
                    kfh d2 = ug3.d(iz2Var3, false);
                    int i8 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                    yci H2 = vnj.H(oq5Var3, z9);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar2);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, d2, wp5.f);
                    g0g.U(oq5Var3, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var3, i8, kb5Var2);
                    }
                    g0g.U(oq5Var3, H2, wp5.d);
                    if (((Boolean) oq5Var3.j((agr) ajg.d.c)).booleanValue()) {
                        oq5Var3.Z(-1934964698);
                        String str3 = ((axm) bxmVar).a;
                        long r = kg5.r(R.color.bg_secondary_night, oq5Var3);
                        yci b2 = bVar5.b(vciVar3);
                        Object K3 = oq5Var3.K();
                        if (K3 == kjnVar3) {
                            bVar3 = bVar5;
                            yciVar2 = b2;
                            vciVar2 = vciVar3;
                            str2 = str3;
                            z6 = true;
                            z7 = false;
                            aVar2 = aVar;
                            cev cevVar = new cev("bridge", "\njavascript:(function() {\n    function receiveMessage(event) { bridge.onPostMessage(event.data); }\n    window.addEventListener(\"message\", receiveMessage, false);\n})()\n", new r3f(new bml(1, aVar2, com.yandex.music.payment.screen.promocode.viewmodel.a.class, "onPostMessage", "onPostMessage(Ljava/lang/String;)V", 0, 14)));
                            oq5Var3.k0(cevVar);
                            K3 = cevVar;
                        } else {
                            str2 = str3;
                            bVar3 = bVar5;
                            yciVar2 = b2;
                            vciVar2 = vciVar3;
                            z6 = true;
                            z7 = false;
                            aVar2 = aVar;
                        }
                        cev cevVar2 = (cev) K3;
                        boolean f = oq5Var3.f(aVar2);
                        Object K4 = oq5Var3.K();
                        if (f || K4 == kjnVar3) {
                            K4 = new pwm(aVar2);
                            oq5Var3.k0(K4);
                        }
                        pwm pwmVar = (pwm) K4;
                        Object K5 = oq5Var3.K();
                        if (K5 == kjnVar3) {
                            K5 = new xfv(127);
                            oq5Var3.k0(K5);
                        }
                        xfv xfvVar = (xfv) K5;
                        boolean z10 = z6;
                        cgv a0 = wyf.a0(oq5Var3);
                        boolean f2 = oq5Var3.f(str2);
                        Object K6 = oq5Var3.K();
                        if (f2 || K6 == kjnVar3) {
                            K6 = szf.g0(new xcv(str2, (String) null, 6));
                            oq5Var3.k0(K6);
                        }
                        xcv xcvVar = (xcv) ((aqi) K6).getValue();
                        kjnVar2 = kjnVar3;
                        boolean z11 = z7;
                        ixf.n(xcvVar, yciVar2, pwmVar, r, xfvVar, a0, null, cevVar2, null, false, oq5Var3, 100663296, 0, 0);
                        oq5 oq5Var4 = oq5Var3;
                        oq5Var4.p(z11);
                        bVar2 = bVar3;
                        i3 = 16;
                        z3 = z10;
                        iz2Var = iz2Var2;
                        vciVar = vciVar2;
                        z4 = z11;
                        oq5Var2 = oq5Var4;
                    } else {
                        aVar2 = aVar;
                        oq5Var3.Z(-1933671626);
                        String str4 = ((axm) bxmVar).a;
                        long r2 = kg5.r(R.color.bg_secondary_night, oq5Var3);
                        Object K7 = oq5Var3.K();
                        if (K7 == kjnVar3) {
                            i2 = 16;
                            z = true;
                            kjnVar = kjnVar3;
                            iz2Var = iz2Var2;
                            vciVar = vciVar3;
                            str = str4;
                            j = r2;
                            z2 = false;
                            bVar = bVar5;
                            yfv yfvVar = new yfv(new r3f(new bml(1, aVar2, com.yandex.music.payment.screen.promocode.viewmodel.a.class, "onPostMessage", "onPostMessage(Ljava/lang/String;)V", 0, 15)), "bridge", "\njavascript:(function() {\n    function receiveMessage(event) { bridge.onPostMessage(event.data); }\n    window.addEventListener(\"message\", receiveMessage, false);\n})()\n", false);
                            oq5Var3.k0(yfvVar);
                            K7 = yfvVar;
                        } else {
                            i2 = 16;
                            z = true;
                            iz2Var = iz2Var2;
                            kjnVar = kjnVar3;
                            str = str4;
                            j = r2;
                            vciVar = vciVar3;
                            bVar = bVar5;
                            z2 = false;
                        }
                        z3 = z;
                        bVar2 = bVar;
                        kjnVar2 = kjnVar;
                        i3 = i2;
                        z4 = z2;
                        wxf.g(str, j, new qec(28, aVar2), (yfv) K7, bVar.b(vciVar), false, oq5Var3, 4096, 32);
                        oq5 oq5Var5 = oq5Var3;
                        oq5Var5.p(z4);
                        oq5Var2 = oq5Var5;
                    }
                    boolean h2 = oq5Var2.h(aVar2);
                    Object K8 = oq5Var2.K();
                    if (h2 || K8 == kjnVar2) {
                        r15 = z4;
                        z5 = z3;
                        ebm ebmVar2 = new ebm(0, aVar2, com.yandex.music.payment.screen.promocode.viewmodel.a.class, "onCloseTap", "onCloseTap()V", 0, 21);
                        oq5Var2.k0(ebmVar2);
                        K8 = ebmVar2;
                    } else {
                        r15 = z4;
                        z5 = z3;
                    }
                    d((Function0) ((h9f) K8), androidx.compose.foundation.layout.a.q(bVar2.a(vciVar, iz2Var), 0.0f, 64, i3, 0.0f, 9), oq5Var2, r15);
                    oq5Var2.p(z5);
                    oq5Var2.p(r15);
                    oq5Var = oq5Var2;
                }
            }
        } else {
            oq5Var3.S();
            oq5Var = oq5Var3;
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            r3.d = new wcj(aVar2, yciVar, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(kfs kfsVar, um0 um0Var, d85 d85Var, yci yciVar, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        oq5 oq5Var;
        yci yciVar2;
        hvq hvqVar2;
        zsq zsqVar2;
        xmn r;
        zsq zsqVar3 = zsqVar;
        um0Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(232044010);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(kfsVar) : oq5Var2.h(kfsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.f(d85Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            i4 |= oq5Var2.h(hvqVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i2 & 32;
        int i7 = 196608;
        if (i6 == 0) {
            if ((196608 & i) == 0) {
                i7 = (262144 & i) == 0 ? oq5Var2.f(zsqVar3) : oq5Var2.h(zsqVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((i4 & 74899) == 74898 || !oq5Var2.z()) {
                hvq hvqVar3 = i5 == 0 ? null : hvqVar;
                if (i6 != 0) {
                    zsqVar3 = null;
                }
                zsq zsqVar4 = zsqVar3;
                oq5Var = oq5Var2;
                jf0.a(new qzm[0], null, true, ild.C(-2104740750, new pli(d85Var, hvqVar3, zsqVar4, um0Var, kfsVar), oq5Var2), oq5Var, 3072, 2);
                yciVar2 = vci.a;
                hvqVar2 = hvqVar3;
                zsqVar2 = zsqVar4;
            } else {
                oq5Var2.S();
                hvqVar2 = hvqVar;
                oq5Var = oq5Var2;
                zsqVar2 = zsqVar3;
                yciVar2 = yciVar;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new fd1(kfsVar, um0Var, d85Var, yciVar2, hvqVar2, zsqVar2, i, i2, 17);
                return;
            }
            return;
        }
        i4 |= i7;
        if ((i4 & 74899) == 74898) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        zsq zsqVar42 = zsqVar3;
        oq5Var = oq5Var2;
        jf0.a(new qzm[0], null, true, ild.C(-2104740750, new pli(d85Var, hvqVar3, zsqVar42, um0Var, kfsVar), oq5Var2), oq5Var, 3072, 2);
        yciVar2 = vci.a;
        hvqVar2 = hvqVar3;
        zsqVar2 = zsqVar42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void n(sru sruVar, nru nruVar, fvf fvfVar, o0k o0kVar, yci yciVar, hq5 hq5Var, int i) {
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1049990384);
        int i2 = i | (oq5Var.f(sruVar) ? 4 : 2) | (oq5Var.h(nruVar) ? 32 : 16) | (oq5Var.f(fvfVar) ? 256 : 128) | (oq5Var.f(o0kVar) ? 2048 : 1024);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lx0 lx0Var = new lx0(4);
            gz2 gz2Var = b2c.o;
            boolean h = ((i2 & 14) == 4) | oq5Var.h(nruVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new wes(21, sruVar, nruVar);
                oq5Var.k0(K);
            }
            int i3 = i2 >> 3;
            weo.g(yciVar, fvfVar, o0kVar, lx0Var, gz2Var, null, false, (Function1) K, oq5Var, (i3 & 112) | 196614 | (i3 & 896), 200);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(sruVar, nruVar, fvfVar, o0kVar, yciVar, i);
        }
    }

    public static final void o(eav eavVar, Function0 function0, Function0 function02, sdr sdrVar, r4v r4vVar, hq5 hq5Var, int i) {
        sdr sdrVar2;
        kb5 kb5Var;
        kb5 kb5Var2;
        gz2 gz2Var;
        long j;
        int i2;
        oq5 oq5Var;
        yci yciVar;
        function0.getClass();
        function02.getClass();
        sdrVar.getClass();
        r4vVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-44497049);
        int i3 = (i & 6) == 0 ? ((i & 8) == 0 ? oq5Var2.f(eavVar) : oq5Var2.h(eavVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            sdrVar2 = sdrVar;
            i3 |= oq5Var2.f(sdrVar2) ? 2048 : 1024;
        } else {
            sdrVar2 = sdrVar;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.h(r4vVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            q6v q6vVar = eavVar.b;
            m6v m6vVar = q6vVar.a;
            m6v m6vVar2 = q6vVar.a;
            g7v g7vVar = (g7v) sdrVar2.getValue();
            lx0 lx0Var = qx0.e;
            gz2 gz2Var2 = b2c.o;
            ta5 a = sa5.a(lx0Var, gz2Var2, oq5Var2, 54);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            int i5 = i3;
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var3 = wp5.f;
            g0g.U(oq5Var2, a, kb5Var3);
            kb5 kb5Var4 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var4);
            kb5 kb5Var5 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var5);
            }
            kb5 kb5Var6 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var6);
            long j2 = ((d85) function02.invoke()).a;
            long j3 = ((d85) function0.invoke()).a;
            boolean f = oq5Var2.f(m6vVar) | oq5Var2.f(g7vVar);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = szf.g0(z7v.f);
                oq5Var2.k0(K);
            }
            aqi aqiVar = (aqi) K;
            if (((z7v) aqiVar.getValue()).c) {
                oq5Var2.Z(-1636679224);
                int i6 = g7vVar.b;
                gz2Var = gz2Var2;
                float f2 = g7vVar.a - 4;
                float f3 = 0;
                if (f2 >= f3) {
                    f3 = f2;
                }
                j = j3;
                ids O = o5g.O(0, 1, oq5Var2);
                String str = eavVar.c;
                ges i7 = nu0.i();
                long z = v7g.z(15);
                long z2 = v7g.z(15);
                v7g.p(z2);
                kb5Var = kb5Var3;
                kb5Var2 = kb5Var6;
                aqiVar.setValue(c9g.r(eavVar.c, ids.a(O, str, ges.b(i7, 0L, z, null, null, 0L, 0, v7g.D((float) (kes.c(z2) * 1.2d), z2 & 1095216660480L), null, null, 0, 0, 16646141), 2, false, i6 + 1, ia6.b(ff7.K(f3, oq5Var2), 10000, 5), 968), i6));
                i2 = 0;
                oq5Var2.p(false);
            } else {
                kb5Var = kb5Var3;
                kb5Var2 = kb5Var6;
                gz2Var = gz2Var2;
                j = j3;
                i2 = 0;
                oq5Var2.Z(-1639852911);
                oq5Var2.p(false);
            }
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K2;
            iz2 iz2Var = b2c.f;
            meo meoVar = new meo(i2);
            boolean h = oq5Var2.h(r4vVar) | ((i5 & 14) == 4 || ((i5 & 8) != 0 && oq5Var2.h(eavVar)));
            Object K3 = oq5Var2.K();
            if (h || K3 == obj) {
                K3 = new xes(28, r4vVar, eavVar);
                oq5Var2.k0(K3);
            }
            yci d = androidx.compose.foundation.a.d(vciVar, uoiVar, null, false, null, meoVar, (Function0) K3, 12);
            vci vciVar2 = vciVar;
            boolean h2 = oq5Var2.h(r4vVar);
            Object K4 = oq5Var2.K();
            if (h2 || K4 == obj) {
                K4 = new m4v(r4vVar, 1);
                oq5Var2.k0(K4);
            }
            yci b = com.yandex.music.core.ui.compose.a.b(d, null, 0L, 0.0f, null, (Function2) K4, 9);
            boolean h3 = oq5Var2.h(r4vVar) | oq5Var2.h(m6vVar2);
            Object K5 = oq5Var2.K();
            if (h3 || K5 == obj) {
                K5 = new u0v(6, r4vVar, m6vVar2);
                oq5Var2.k0(K5);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(b, null, 0L, 0.0f, null, (Function2) K5, 15);
            kfh d2 = ug3.d(iz2Var, false);
            int i8 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, b2);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var7 = kb5Var;
            g0g.U(oq5Var2, d2, kb5Var7);
            g0g.U(oq5Var2, l2, kb5Var4);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var2, i8, kb5Var5);
            }
            kb5 kb5Var8 = kb5Var2;
            g0g.U(oq5Var2, H2, kb5Var8);
            boolean f4 = oq5Var2.f(aqiVar);
            Object K6 = oq5Var2.K();
            if (f4 || K6 == obj) {
                K6 = new x80(aqiVar, 27);
                oq5Var2.k0(K6);
            }
            yci b3 = nfp.b(vciVar2, true, (Function1) K6);
            ta5 a2 = sa5.a(lx0Var, gz2Var, oq5Var2, 54);
            int i9 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H3 = vnj.H(oq5Var2, b3);
            oq5Var2.d0();
            aqi aqiVar2 = aqiVar;
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, kb5Var7);
            g0g.U(oq5Var2, l3, kb5Var4);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var2, i9, kb5Var5);
            }
            g0g.U(oq5Var2, H3, kb5Var8);
            oq5Var2.Z(749859990);
            int i10 = 0;
            for (Object obj2 : ((z7v) aqiVar2.getValue()).a) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    u75.n();
                    throw null;
                }
                String str2 = (String) obj2;
                z7v z7vVar = (z7v) aqiVar2.getValue();
                boolean z3 = z7vVar.b && i10 == u75.g(z7vVar.a);
                String n = z3 ? ouj.n(new Regex("[\\s\\p{P}]+$").replace(str2, ""), "…") : str2;
                ges i12 = nu0.i();
                long z4 = v7g.z(15);
                long z5 = v7g.z(15);
                v7g.p(z5);
                ges b4 = ges.b(i12, 0L, z4, null, null, 0L, 0, v7g.D((float) (kes.c(z5) * 1.2d), z5 & 1095216660480L), null, null, 0, 0, 16646141);
                oq5Var2.Z(749879604);
                yci o = androidx.compose.foundation.layout.a.o(vciVar2, 2, 0.0f, 2);
                if (z3) {
                    Object K7 = oq5Var2.K();
                    if (K7 == obj) {
                        K7 = new t0v(16);
                        oq5Var2.k0(K7);
                    }
                    yci a3 = a.a(vciVar2, (Function1) K7);
                    boolean f5 = oq5Var2.f(str2);
                    Object K8 = oq5Var2.K();
                    if (f5 || K8 == obj) {
                        K8 = new srp(str2, 20);
                        oq5Var2.k0(K8);
                    }
                    yciVar = androidx.compose.ui.draw.a.c(a3, (Function1) K8);
                } else {
                    yciVar = vciVar2;
                }
                yci f6 = o.f(yciVar);
                oq5Var2.p(false);
                m6v m6vVar3 = m6vVar2;
                long j4 = j2;
                oq5 oq5Var3 = oq5Var2;
                lsq.k(n, m6vVar, b4, j4, f6, i10, 0L, 0, uoiVar, oq5Var3, 100663296, 192);
                i10 = i11;
                vciVar2 = vciVar2;
                aqiVar2 = aqiVar2;
                oq5Var2 = oq5Var3;
                j2 = j4;
                m6vVar2 = m6vVar3;
            }
            oq5Var = oq5Var2;
            m6v m6vVar4 = m6vVar2;
            aqi aqiVar3 = aqiVar2;
            vci vciVar3 = vciVar2;
            f1d.u(oq5Var, false, true, true);
            n6v n6vVar = m6vVar4.e;
            if (n6vVar == null || !((z7v) aqiVar3.getValue()).d) {
                oq5Var.Z(-1639852911);
            } else {
                oq5Var.Z(-1633242099);
                Object K9 = oq5Var.K();
                if (K9 == obj) {
                    K9 = vz1.h(oq5Var);
                }
                uoi uoiVar2 = (uoi) K9;
                int i13 = ((z7v) aqiVar3.getValue()).e;
                String str3 = n6vVar.a;
                ges i14 = nu0.i();
                long z6 = v7g.z(15);
                long z7 = v7g.z(15);
                v7g.p(z7);
                ges b5 = ges.b(i14, 0L, z6, null, null, 0L, 0, v7g.D((float) (kes.c(z7) * 1.2d), z7 & 1095216660480L), null, null, 0, 0, 16646141);
                boolean h4 = oq5Var.h(r4vVar) | oq5Var.h(m6vVar4) | oq5Var.h(n6vVar);
                Object K10 = oq5Var.K();
                if (h4 || K10 == obj) {
                    K10 = new ftr(13, r4vVar, m6vVar4, n6vVar);
                    oq5Var.k0(K10);
                }
                yci n2 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.d(vciVar3, uoiVar2, null, false, null, null, (Function0) K10, 28), 16, 8);
                boolean h5 = oq5Var.h(r4vVar) | oq5Var.h(n6vVar);
                Object K11 = oq5Var.K();
                if (h5 || K11 == obj) {
                    K11 = new u0v(7, r4vVar, n6vVar);
                    oq5Var.k0(K11);
                }
                lsq.k(str3, m6vVar, b5, j, com.yandex.music.core.ui.compose.a.b(n2, null, 0L, 0.0f, null, (Function2) K11, 15), i13, 0L, 2, uoiVar2, oq5Var, 113246208, 64);
                oq5Var = oq5Var;
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 29, eavVar, function0, function02, sdrVar, r4vVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(cvv cvvVar, yci yciVar, boolean z, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        boolean z2;
        int i4;
        oq5 oq5Var;
        yci yciVar3;
        boolean z3;
        xmn r;
        int i5;
        yci yciVar4;
        kjn kjnVar;
        boolean z4;
        boolean z5;
        yci yciVar5;
        boolean z6;
        cvvVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-125781263);
        int i6 = (oq5Var2.h(cvvVar) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i6 |= oq5Var2.g(z2) ? 256 : 128;
                i4 = i6;
                int i8 = 1;
                if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
                    vci vciVar = vci.a;
                    if (i7 != 0) {
                        yciVar2 = vciVar;
                    }
                    if (i3 != 0) {
                        z2 = true;
                    }
                    boolean h = oq5Var2.h(cvvVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar2 = gq5.a;
                    if (h || K == kjnVar2) {
                        i5 = i4;
                        yciVar4 = yciVar2;
                        kjnVar = kjnVar2;
                        z4 = z2;
                        vtu vtuVar = new vtu(0, cvvVar, cvv.class, "onStart", "onStart()V", 0, 14);
                        oq5Var2.k0(vtuVar);
                        K = vtuVar;
                    } else {
                        kjnVar = kjnVar2;
                        z4 = z2;
                        i5 = i4;
                        yciVar4 = yciVar2;
                    }
                    Function0 function0 = (Function0) ((h9f) K);
                    boolean h2 = oq5Var2.h(cvvVar);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        vtu vtuVar2 = new vtu(0, cvvVar, cvv.class, "onStop", "onStop()V", 0, 15);
                        oq5Var2.k0(vtuVar2);
                        K2 = vtuVar2;
                    }
                    wyf.c(function0, null, null, (Function0) ((h9f) K2), null, oq5Var2, 0, 45);
                    oq5Var = oq5Var2;
                    yci d = d.d(yciVar4, 1.0f);
                    kfh d2 = ug3.d(b2c.f, false);
                    int i9 = oq5Var.P;
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
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, d2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var, i9, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    gz2 gz2Var = b2c.o;
                    yci m = androidx.compose.foundation.layout.a.m(d.t(vciVar, 0.0f, 360, 1), 16);
                    ynn i10 = irv.i(oq5Var);
                    boolean h3 = oq5Var.h(cvvVar);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        K3 = new f5r(26, cvvVar);
                        oq5Var.k0(K3);
                    }
                    yci b = com.yandex.music.core.ui.compose.a.b(m, i10, 0L, 0.0f, null, (Function2) K3, 14);
                    yci yciVar6 = yciVar4;
                    ta5 a = sa5.a(qx0.c, gz2Var, oq5Var, 48);
                    int i11 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, b);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                        ouj.x(i11, oq5Var, i11, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    kvv kvvVar = (kvv) gld.O(cvvVar.b.u(), oq5Var).getValue();
                    if (kvvVar instanceof ivv) {
                        oq5Var.Z(-1806888399);
                        z5 = z4;
                        pm0.a(null, ild.C(761188348, new oc1((ivv) kvvVar, z5, cvvVar, 25), oq5Var), oq5Var, 48, 1);
                        oq5Var.p(false);
                        z6 = true;
                        yciVar5 = yciVar6;
                    } else {
                        z5 = z4;
                        int i12 = 0;
                        if (kvvVar instanceof jvv) {
                            oq5Var.Z(-1805912488);
                            jvv jvvVar = (jvv) kvvVar;
                            kjn kjnVar3 = kjnVar;
                            yciVar5 = yciVar6;
                            xee.c(jvvVar.c, uuv.a, uuv.c, null, uuv.b, gar.b, ild.C(-1439248367, new dii(i8), oq5Var), oq5Var, 1794480, 8);
                            float f = uuv.g;
                            u1g.l(oq5Var, d.e(vciVar, f));
                            String str = jvvVar.a;
                            ges c = nu0.c();
                            agr agrVar = eq0.a;
                            xv7.j(str, androidx.compose.ui.platform.a.a(vciVar, "wizard_entry_block_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 2, false, 1, 0, null, c, oq5Var, 48, 3120, 55032);
                            oq5 oq5Var3 = oq5Var;
                            float f2 = f / 2;
                            u1g.l(oq5Var3, d.e(vciVar, f2));
                            String str2 = jvvVar.b;
                            if (!z5 || str2 == null) {
                                oq5Var3.Z(-1810484523);
                                oq5Var3.p(false);
                            } else {
                                oq5Var3.Z(-1804371385);
                                xv7.j(str2, androidx.compose.ui.platform.a.a(vciVar, "wizard_entry_block_description"), ((dq0) oq5Var3.j(agrVar)).b.a, 0L, 0L, 3, 0L, 2, false, 5, 0, null, nu0.j(), oq5Var3, 48, 3120, 55032);
                                oq5Var3 = oq5Var3;
                                eta.p(vciVar, f2, oq5Var3, false);
                            }
                            String o = vz1.o(vciVar, f2, oq5Var3, R.string.alert_wizard_button_text, oq5Var3);
                            boolean h4 = oq5Var3.h(cvvVar);
                            Object K4 = oq5Var3.K();
                            if (h4 || K4 == kjnVar3) {
                                K4 = new avv(cvvVar, i12);
                                oq5Var3.k0(K4);
                            }
                            oq5Var = oq5Var3;
                            z6 = true;
                            hdg.t(o, (Function0) K4, androidx.compose.ui.platform.a.a(vciVar, "wizard_entry_block_button"), null, oq5Var, 384, 8);
                            oq5Var.p(false);
                        } else {
                            kjn kjnVar4 = kjnVar;
                            yciVar5 = yciVar6;
                            int i13 = 2;
                            if (!(kvvVar instanceof hvv)) {
                                throw vz1.i(oq5Var, -473929427, false);
                            }
                            oq5Var.Z(-1803282045);
                            xee.c(((hvv) kvvVar).a, uuv.a, uuv.c, null, uuv.b, gar.b, ild.C(-1439248367, new dii(i13), oq5Var), oq5Var, 1794480, 8);
                            float f3 = uuv.g;
                            u1g.l(oq5Var, d.e(vciVar, f3));
                            b(z5, false, oq5Var, 48 | ((i5 >> 6) & 14));
                            u1g.l(oq5Var, d.e(vciVar, f3 / 2));
                            String M = rvf.M(R.string.alert_wizard_button_text, oq5Var);
                            boolean h5 = oq5Var.h(cvvVar);
                            Object K5 = oq5Var.K();
                            if (h5 || K5 == kjnVar4) {
                                K5 = new avv(cvvVar, i8);
                                oq5Var.k0(K5);
                            }
                            Function0 function02 = (Function0) K5;
                            z6 = true;
                            oq5Var = oq5Var;
                            hdg.t(M, function02, null, null, oq5Var, 0, 12);
                            oq5Var.p(false);
                        }
                    }
                    oq5Var.p(z6);
                    oq5Var.p(z6);
                    z3 = z5;
                    yciVar3 = yciVar5;
                } else {
                    oq5Var = oq5Var2;
                    oq5Var.S();
                    yciVar3 = yciVar2;
                    z3 = z2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new qu(cvvVar, yciVar3, z3, i, i2, 10);
                    return;
                }
                return;
            }
            z2 = z;
            i4 = i6;
            int i82 = 1;
            if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        z2 = z;
        i4 = i6;
        int i822 = 1;
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static int q(int i) {
        if (i < 3) {
            hld.w(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void r(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                jj4.j(k5r.i(i2, "at index "));
                return;
            }
        }
    }

    public static lr7 s(long j, long j2, long j3, hq5 hq5Var, int i, int i2) {
        long d = (i2 & 1) != 0 ? ((ma5) ((oq5) hq5Var).j(pa5.a)).d() : j;
        agr agrVar = pa5.a;
        oq5 oq5Var = (oq5) hq5Var;
        long c = ((ma5) oq5Var.j(agrVar)).c();
        long j4 = ((d85) oq5Var.j(sb6.a)).a;
        if (((ma5) oq5Var.j(agrVar)).g()) {
            c3x.N(j4);
        } else {
            c3x.N(j4);
        }
        long D = c3x.D(d85.b(c, 0.38f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var.j(agrVar)).f());
        long a = ((ma5) ((oq5) hq5Var).j(agrVar)).a();
        long a2 = ((ma5) ((oq5) hq5Var).j(agrVar)).a();
        long d2 = (i2 & 16) != 0 ? ((ma5) ((oq5) hq5Var).j(agrVar)).d() : j2;
        long b = (i2 & 32) != 0 ? d85.b(d2, 0.24f, 0.0f, 0.0f, 0.0f, 14) : j3;
        long b2 = d85.b(((ma5) ((oq5) hq5Var).j(agrVar)).c(), 0.32f, 0.0f, 0.0f, 0.0f, 14);
        long b3 = d85.b(b2, 0.12f, 0.0f, 0.0f, 0.0f, 14);
        long b4 = d85.b(pa5.b(d2, hq5Var), 0.54f, 0.0f, 0.0f, 0.0f, 14);
        return new lr7(d, D, a, a2, d2, b, b2, b3, b4, d85.b(d2, 0.54f, 0.0f, 0.0f, 0.0f, 14), d85.b(b4, 0.12f, 0.0f, 0.0f, 0.0f, 14), d85.b(b3, 0.12f, 0.0f, 0.0f, 0.0f, 14));
    }

    public static final boolean t(String str, String str2) {
        str.getClass();
        if (Intrinsics.d(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return Intrinsics.d(StringsKt.t0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean u(h4q h4qVar, h4q h4qVar2) {
        h4qVar.getClass();
        h4qVar2.getClass();
        return Math.abs(h4qVar.a - h4qVar2.a) <= 1.0E-4f;
    }

    public static boolean v(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final String w(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? hlr.c(CollectionsKt.X(collection, ",\n", StringUtil.LF, StringUtil.LF, null, 56), "    ").concat("},") : " }";
    }

    public static final tx3 x(ux3 ux3Var) {
        ux3Var.getClass();
        if (!(ux3Var instanceof CardSelectionStorage$ArtistSelection)) {
            b6e.s();
            return null;
        }
        CardSelectionStorage$ArtistSelection cardSelectionStorage$ArtistSelection = (CardSelectionStorage$ArtistSelection) ux3Var;
        String cover = cardSelectionStorage$ArtistSelection.getCover();
        if (cover == null) {
            return null;
        }
        return new tx3((cardSelectionStorage$ArtistSelection.getCoverMask() == null || cardSelectionStorage$ArtistSelection.getCoverBackground() == null) ? new mn6(cover) : new nn6(cover, cardSelectionStorage$ArtistSelection.getCoverMask(), cardSelectionStorage$ArtistSelection.getCoverBackground()), cardSelectionStorage$ArtistSelection.getDescription());
    }

    public static int y(String str) {
        if (Intrinsics.d(str, PListParser.TAG_STRING)) {
            return 1;
        }
        if (Intrinsics.d(str, PListParser.TAG_INTEGER)) {
            return 2;
        }
        if (Intrinsics.d(str, "boolean")) {
            return 3;
        }
        if (Intrinsics.d(str, "number")) {
            return 4;
        }
        if (Intrinsics.d(str, "color")) {
            return 5;
        }
        if (Intrinsics.d(str, "url")) {
            return 6;
        }
        if (Intrinsics.d(str, PListParser.TAG_ARRAY)) {
            return 7;
        }
        return Intrinsics.d(str, PListParser.TAG_DICT) ? 8 : 0;
    }

    public static final View z(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        l1j.k(viewGroup.getChildCount(), k5r.q(i, "Index: ", ", Size: "));
        return null;
    }
}
