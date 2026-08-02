package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.music.shared.utils.file.SharedFileProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;

/* loaded from: classes3.dex */
public abstract class wdp implements eg7, tq5 {
    public static final wn5 a = new wn5(new bo5(15), -498068422, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wu1 f;
    public static final wu1 g;
    public static final wu1 h;
    public static final jzk i;
    public static final jzk j;

    static {
        new wn5(new bo5(16), -1462681990, false);
        b = new wn5(new jo5(16), -1695032132, false);
        c = new wn5(new ro5(14), -971166084, false);
        new wn5(new ro5(15), 1846361504, false);
        d = new wn5(new dp5(25), 1401425740, false);
        e = new wn5(new dp5(26), -216900851, false);
        f = new wu1("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");
        g = new wu1("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");
        h = new wu1("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");
        int i2 = 3;
        i = new jzk(i2);
        j = new jzk(i2);
    }

    public static final void I(iwm iwmVar, jwm jwmVar, pu0 pu0Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        iwmVar.getClass();
        pu0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-406458642);
        if (((i2 | (oq5Var.h(iwmVar) ? 4 : 2) | (oq5Var.d(jwmVar.ordinal()) ? 32 : 16) | (oq5Var.f(pu0Var) ? 256 : 128) | 3072) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            sw swVar = (sw) szf.Q(iwmVar.j, oq5Var).getValue();
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            bg3.a(d.d(vciVar, 1.0f), null, false, ild.C(448161186, new up(swVar, jwmVar, iwmVar, pu0Var), oq5Var), oq5Var, 3078, 6);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 6, iwmVar, jwmVar, pu0Var, yciVar2);
        }
    }

    public static vm0 J(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new vm0(azt.a, Float.valueOf(f2), new ym0(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void K(final va3 va3Var, final Function0 function0, final yci yciVar, hq5 hq5Var, final int i2) {
        int i3;
        va3Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1750849366);
        int i4 = (oq5Var.f(va3Var) ? 4 : 2) | i2 | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = szf.U(new or(7, function0));
                oq5Var.k0(K);
            }
            if (!((Boolean) ((sdr) K).getValue()).booleanValue()) {
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i5 = 0;
                    r.d = new Function2(va3Var, function0, yciVar, i2, i5) { // from class: o83
                        public final /* synthetic */ int a;
                        public final /* synthetic */ va3 b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ yci d;

                        {
                            this.a = i5;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    wdp.K(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    wdp.K(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i3 = i2;
            p9b.a(ild.C(556091165, new m32(7, va3Var, function0), oq5Var), wyf.s(yciVar, function0), false, oq5Var, 6, 4);
        } else {
            i3 = i2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i6 = 1;
            final int i7 = i3;
            r2.d = new Function2(va3Var, function0, yciVar, i7, i6) { // from class: o83
                public final /* synthetic */ int a;
                public final /* synthetic */ va3 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ yci d;

                {
                    this.a = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i62) {
                        case 0:
                            wdp.K(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                        default:
                            wdp.K(this.b, this.c, this.d, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void L(se4 se4Var, w3g w3gVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        w3gVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1678397262);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(se4Var) : oq5Var.h(se4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(w3gVar) : oq5Var.h(w3gVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3 | 196608;
        if (oq5Var.P(i4 & 1, (74899 & i4) != 74898)) {
            int i5 = i4 >> 3;
            u1g.c(function0, se4Var.a, w3gVar, yciVar, false, null, ild.C(-1326098355, new u2(19, se4Var), oq5Var), function02, oq5Var, ((i4 >> 6) & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | ((i4 << 3) & 896) | (i5 & 7168) | (i5 & 57344) | ((i4 << 12) & 29360128), 32);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i2, 5, se4Var, w3gVar, function0, function02, yciVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6.K(), java.lang.Integer.valueOf(r7)) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void M(v25 v25Var, tmb tmbVar, int i2, hq5 hq5Var, int i3) {
        v25 v25Var2;
        oq5 oq5Var;
        tmb tmbVar2;
        fvf fvfVar;
        boolean z;
        boolean z2;
        z25 z25Var;
        v25Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1896367567);
        int i4 = i3 | (oq5Var2.h(v25Var) ? 4 : 2) | (oq5Var2.h(tmbVar) ? 32 : 16) | (oq5Var2.d(i2) ? 256 : 128);
        if (oq5Var2.P(i4 & 1, (i4 & 147) != 146)) {
            z25 z25Var2 = (z25) szf.Q(v25Var.e, oq5Var2).getValue();
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = gld.R(g.a, oq5Var2);
                oq5Var2.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            fvf a2 = hvf.a(0, 0, oq5Var2, 0, 3);
            fvf a3 = hvf.a(0, 0, oq5Var2, 0, 3);
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = k5r.h(i2, oq5Var2);
            }
            u6k u6kVar = (u6k) K2;
            List h2 = u75.h(a2, a3);
            u6kVar.getClass();
            h2.getClass();
            boolean f2 = oq5Var2.f(h2);
            Object K3 = oq5Var2.K();
            if (f2 || K3 == obj) {
                K3 = new u2s(u6kVar, h2);
                oq5Var2.k0(K3);
            }
            ek B = yd5.B((u2s) K3, oq5Var2);
            wxi L = zc4.L(B, false, oq5Var2, 2);
            vci vciVar = vci.a;
            yci a4 = androidx.compose.ui.input.nestedscroll.a.a(vciVar, L, null);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a5 = sa5.a(kx0Var, gz2Var, oq5Var2, 0);
            int i5 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a5, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O) {
                fvfVar = a2;
            } else {
                fvfVar = a2;
            }
            ouj.x(i5, oq5Var2, i5, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            yd5.b(B, rvf.M(R.string.playlists, oq5Var2), mp0.a(oq5Var2), null, ild.C(81104462, new u2(26, v25Var), oq5Var2), ild.C(-1884439275, new kv4(3, v25Var), oq5Var2), 0L, oq5Var2, 221184, 72);
            oq5Var = oq5Var2;
            ogp.g.e(z25Var2 instanceof x25, z25Var2 instanceof w25, null, oq5Var, 4096, 4);
            if (z25Var2 instanceof y25) {
                oq5Var.Z(878598469);
                boolean f3 = oq5Var.f(z25Var2);
                Object K4 = oq5Var.K();
                if (f3 || K4 == obj) {
                    K4 = new r25(0, (y25) z25Var2);
                    oq5Var.k0(K4);
                }
                fp7 b2 = r3k.b(i2, (Function0) K4, oq5Var, (i4 >> 6) & 14, 2);
                boolean f4 = oq5Var.f(b2);
                Object K5 = oq5Var.K();
                if (f4 || K5 == obj) {
                    K5 = new s25(b2, 0);
                    oq5Var.k0(K5);
                }
                eno s0 = szf.s0((Function0) K5);
                boolean h3 = oq5Var.h(v25Var) | oq5Var.f(z25Var2);
                Object K6 = oq5Var.K();
                if (h3 || K6 == obj) {
                    K6 = new tl0(8, u6kVar, v25Var, (y25) z25Var2);
                    oq5Var.k0(K6);
                }
                ox6.B(s0, mm6Var, (rjc) K6);
                yci a6 = androidx.compose.ui.platform.a.a(vciVar, "playlist_list_content");
                ta5 a7 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
                int i6 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, a6);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a7, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                yci d2 = d.d(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 12, 1), 1.0f);
                lx0 lx0Var = qx0.e;
                boolean f5 = oq5Var.f(z25Var2) | oq5Var.f(b2) | oq5Var.h(mm6Var);
                Object K7 = oq5Var.K();
                if (f5 || K7 == obj) {
                    K7 = new g3(17, (y25) z25Var2, b2, mm6Var);
                    oq5Var.k0(K7);
                }
                weo.i(d2, null, null, false, lx0Var, null, null, false, null, (Function1) K7, oq5Var, 24582, 494);
                oq5Var = oq5Var;
                boolean booleanValue = ((Boolean) szf.Q(v25Var.f, oq5Var).getValue()).booleanValue();
                boolean h4 = oq5Var.h(v25Var);
                Object K8 = oq5Var.K();
                if (h4 || K8 == obj) {
                    z = true;
                    z2 = false;
                    z25Var = z25Var2;
                    ub4 ub4Var = new ub4(0, v25Var, v25.class, "onRefresh", "onRefresh()V", 0, 28);
                    oq5Var.k0(ub4Var);
                    K8 = ub4Var;
                } else {
                    z = true;
                    z2 = false;
                    z25Var = z25Var2;
                }
                pr prVar = new pr(b2, (y25) z25Var, fvfVar, a3, v25Var, tmbVar, 6);
                v25Var2 = v25Var;
                bfg.f(booleanValue, (Function0) ((h9f) K8), null, null, false, ild.C(1598695117, prVar, oq5Var), oq5Var, 196608, 28);
                oq5Var.p(z);
                oq5Var.p(z2);
            } else {
                v25Var2 = v25Var;
                z = true;
                if (Intrinsics.d(z25Var2, w25.a)) {
                    oq5Var.Z(881369466);
                    weo.c(null, oq5Var, 0);
                    oq5Var.p(false);
                } else {
                    if (!Intrinsics.d(z25Var2, x25.a)) {
                        throw vz1.i(oq5Var, -1080038369, false);
                    }
                    oq5Var.Z(881535409);
                    yci a8 = androidx.compose.ui.platform.a.a(bfg.Q(d.c(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, zs4.e(oq5Var), 7), 1.0f), bfg.C(oq5Var), false, 14), "playlist_list_content_offline_empty_screen");
                    kfh d3 = ug3.d(b2c.c, false);
                    int i7 = oq5Var.P;
                    a l3 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, a8);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, kb5Var);
                    g0g.U(oq5Var, l3, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var4);
                    boolean h5 = oq5Var.h(v25Var2);
                    Object K9 = oq5Var.K();
                    if (h5 || K9 == obj) {
                        K9 = new v5(26, v25Var2);
                        oq5Var.k0(K9);
                    }
                    tmbVar2 = tmbVar;
                    rvf.j((Function1) K9, tmbVar2, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 124, 0.0f, 0.0f, 13), 0, false, null, oq5Var, 448 | (i4 & 112), 56);
                    oq5Var.p(true);
                    oq5Var.p(false);
                    oq5Var.p(z);
                }
            }
            tmbVar2 = tmbVar;
            oq5Var.p(z);
        } else {
            v25Var2 = v25Var;
            oq5Var = oq5Var2;
            tmbVar2 = tmbVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(v25Var2, tmbVar2, i2, i3);
        }
    }

    public static final void N(nf6 nf6Var, Function0 function0, yci yciVar, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(645832757);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(nf6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            mf6 mf6Var = (mf6) nf6Var.a.getValue();
            if (!(mf6Var instanceof lf6)) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new ig0(nf6Var, function0, function1, i2);
                    return;
                }
                return;
            }
            boolean f2 = oq5Var.f(mf6Var);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new hf6(xv.Q(((lf6) mf6Var).a));
                oq5Var.k0(K);
            }
            pf6.d((hf6) K, function0, function1, oq5Var, i4 & 8176);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        yci yciVar2 = yciVar;
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new un5(nf6Var, function0, yciVar2, function1, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void O(nf6 nf6Var, Function0 function0, Function1 function1, yci yciVar, boolean z, Function0 function02, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function0 function03;
        Function1 function12;
        boolean z2;
        int i5;
        Function0 function04;
        yci yciVar2;
        boolean z3;
        xmn r;
        yci yciVar3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1969259374);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(nf6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            function03 = function0;
            i4 |= oq5Var.h(function03) ? 32 : 16;
        } else {
            function03 = function0;
        }
        if ((i2 & 384) == 0) {
            function12 = function1;
            i4 |= oq5Var.h(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        int i6 = i4 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i6 = i4 | 27648;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i6 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i5 = i3 & 32;
            if (i5 == 0) {
                i6 |= 196608;
            } else if ((196608 & i2) == 0) {
                function04 = function02;
                i6 |= oq5Var.h(function04) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((1572864 & i2) == 0) {
                    i6 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
                }
                if (oq5Var.P(i6 & 1, (599187 & i6) != 599186)) {
                    boolean z4 = i7 != 0 ? true : z2;
                    if (i5 != 0) {
                        function04 = bs5.x;
                    }
                    yciVar2 = vci.a;
                    if (z4) {
                        oq5Var.Z(1021907653);
                        boolean z5 = ((458752 & i6) == 131072) | ((i6 & 14) == 4);
                        Object K = oq5Var.K();
                        if (z5 || K == gq5.a) {
                            K = new sv4(4, function04, nf6Var);
                            oq5Var.k0(K);
                        }
                        yciVar3 = eur.a(yciVar2, ofc.d, new ff6(0, (Function1) K));
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1022064513);
                        oq5Var.p(false);
                        yciVar3 = yciVar2;
                    }
                    kfh d2 = ug3.d(b2c.b, true);
                    int i8 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, yciVar3);
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
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var, i8, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    wn5Var.invoke(oq5Var, Integer.valueOf((i6 >> 18) & 14));
                    N(nf6Var, function03, null, function12, oq5Var, (i6 & 126) | ((i6 << 3) & 7168));
                    oq5Var.p(true);
                    z3 = z4;
                } else {
                    oq5Var.S();
                    yciVar2 = yciVar;
                    z3 = z2;
                }
                Function0 function05 = function04;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new cf6(nf6Var, function0, function1, yciVar2, z3, function05, wn5Var, i2, i3);
                    return;
                }
                return;
            }
            function04 = function02;
            if ((1572864 & i2) == 0) {
            }
            if (oq5Var.P(i6 & 1, (599187 & i6) != 599186)) {
            }
            Function0 function052 = function04;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        function04 = function02;
        if ((1572864 & i2) == 0) {
        }
        if (oq5Var.P(i6 & 1, (599187 & i6) != 599186)) {
        }
        Function0 function0522 = function04;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final so7 P(Function1 function1) {
        jb7 smlVar;
        jb7 smlVar2;
        function1.getClass();
        oo7 oo7Var = new oo7();
        function1.invoke(oo7Var);
        OkHttpClient okHttpClient = new OkHttpClient();
        tyi tyiVar = new tyi(okHttpClient, new sld(oo7Var.f));
        pt0 pt0Var = (pt0) tyiVar.h;
        hl7 hl7Var = oo7Var.c;
        if (hl7Var != null) {
            smlVar = new gl7(hl7Var, pt0Var, new no7(okHttpClient, 1));
        } else {
            ib7 ib7Var = oo7Var.a;
            if (ib7Var == null) {
                ib7Var = new yk7(okHttpClient);
            }
            pt0Var.getClass();
            smlVar = new sml(ib7Var, pt0Var);
        }
        jb7 jb7Var = smlVar;
        hl7 hl7Var2 = oo7Var.d;
        if (hl7Var2 != null) {
            smlVar2 = new gl7(hl7Var2, pt0Var, new no7(okHttpClient, 0));
        } else {
            ib7 ib7Var2 = oo7Var.b;
            if (ib7Var2 == null) {
                ib7Var2 = new yk7(okHttpClient);
            }
            pt0Var.getClass();
            smlVar2 = new sml(ib7Var2, pt0Var);
        }
        jb7 jb7Var2 = smlVar2;
        h1b h1bVar = new h1b();
        ngl nglVar = oo7Var.e;
        if (nglVar == null) {
            nglVar = new ksa();
        }
        return new so7(jb7Var, jb7Var2, h1bVar, nglVar, new xvh(new sdg().a(), new veg()), tyiVar);
    }

    public static final void Q(hda hdaVar, hq5 hq5Var, int i2) {
        hdaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(802739683);
        int i3 = (oq5Var.h(hdaVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            mda mdaVar = (mda) szf.Q(hdaVar.e, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(hdaVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                dda ddaVar = new dda(0, hdaVar, hda.class, "onBackClicked", "onBackClicked()V", 0, 0);
                oq5Var.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(hdaVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, hdaVar, hda.class, "onSearchClicked", "onSearchClicked()V", 0, 1);
                oq5Var.k0(ddaVar2);
                K2 = ddaVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(hdaVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                dda ddaVar3 = new dda(0, hdaVar, hda.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 2);
                oq5Var.k0(ddaVar3);
                K3 = ddaVar3;
            }
            kg5.g(R.string.downloaded_albums, a2, function0, function02, (Function0) ((h9f) K3), ild.C(786709014, new xk(23, mdaVar, hdaVar, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(hdaVar, i2, 25);
        }
    }

    public static final void R(Function0 function0, hq5 hq5Var, int i2, int i3) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1775295958);
        int i4 = (oq5Var.d(i2) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.h(function0) ? 32 : 16;
        }
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            float f2 = 18;
            float f3 = 24;
            yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), f2, f3, f2, 0.0f, 8), "open_favourites_empty_view");
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.r(a0g.E(i2, i4 & 14, oq5Var), null, d.m(vciVar, 140), null, null, 0.0f, null, oq5Var, 432, 120);
            String M = rvf.M(R.string.empty_favourites_title, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar)).b.a;
            yci l2 = androidx.compose.foundation.layout.a.l(vciVar, t9b.a(15, 0.0f));
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new rua(22);
                oq5Var.k0(K);
            }
            xcs.b(M, nfp.b(l2, false, (Function1) K), j2, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c2, oq5Var, 0, 0, 65016);
            xcs.b(rvf.M(R.string.empty_favourites_subtitle, oq5Var), androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 0.0f, f3, 7), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
            hdg.n(((i4 >> 3) & 14) | 432, 0, ltg.i, oq5Var, d.t(androidx.compose.ui.platform.a.a(vciVar, "vibe_collection_tracks_play"), 220, 0.0f, 2), function0);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cv5(function0, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void S(final wn5 wn5Var, yci yciVar, hab habVar, o0k o0kVar, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function0 function0, boolean z, final float f2, float f3, float f4, hq5 hq5Var, final int i2, final int i3, final int i4) {
        int i5;
        yci yciVar2;
        int i6;
        hab habVar2;
        int i7;
        o0k o0kVar2;
        int i8;
        int i9;
        Function2 function26;
        int i10;
        Function2 function27;
        int i11;
        int i12;
        Function2 function28;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        yci yciVar3;
        o0k o0kVar3;
        Function0 function02;
        final Function0 function03;
        float f5;
        final float f6;
        final Function2 function29;
        final Function2 function210;
        final Function2 function211;
        final hab habVar3;
        final boolean z2;
        o0k o0kVar4;
        float f7;
        boolean z3;
        boolean e2;
        Object K;
        final float f8;
        final Function2 function212;
        final o0k o0kVar5;
        final o0k o0kVar6;
        final float f9;
        final Function2 function213;
        final Function2 function214;
        final boolean z4;
        final Function2 function215;
        final Function2 function216;
        final hab habVar4;
        final Function0 function04;
        final float f10;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-250916050);
        if ((i2 & 6) == 0) {
            i5 = (oq5Var.h(wn5Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i25 = i4 & 2;
        if (i25 != 0) {
            i6 = i5 | 48;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i6 = i5 | (oq5Var.f(yciVar2) ? 32 : 16);
        }
        int i26 = i4 & 4;
        if (i26 != 0) {
            i7 = i6 | 384;
            habVar2 = habVar;
        } else {
            habVar2 = habVar;
            i7 = i6 | (oq5Var.f(habVar2) ? 256 : 128);
        }
        if ((i4 & 8) == 0) {
            o0kVar2 = o0kVar;
            if (oq5Var.f(o0kVar2)) {
                i8 = 2048;
                int i27 = i7 | i8;
                i9 = i4 & 16;
                int i28 = RemoteCameraConfig.Notification.ID;
                if (i9 == 0) {
                    i27 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    function26 = function2;
                    i27 |= oq5Var.h(function26) ? 16384 : 8192;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                        i11 = i27 | 196608;
                        function27 = function22;
                    } else {
                        function27 = function22;
                        i11 = i27 | (oq5Var.h(function27) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
                    }
                    i12 = i4 & 64;
                    if (i12 != 0) {
                        i11 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                        function28 = function23;
                    } else {
                        function28 = function23;
                        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                            i11 |= oq5Var.h(function28) ? 1048576 : 524288;
                        }
                    }
                    i13 = i4 & 128;
                    if (i13 != 0) {
                        i11 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i11 |= oq5Var.h(function24) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    }
                    i14 = i4 & 256;
                    if (i14 != 0) {
                        i11 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i11 |= oq5Var.h(function25) ? 67108864 : 33554432;
                    }
                    i15 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                    if (i15 != 0) {
                        i16 = i11 | 805306368;
                    } else {
                        i16 = i11 | (oq5Var.h(function0) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
                    }
                    i17 = i4 & 1024;
                    if (i17 != 0) {
                        i19 = i3 | 6;
                        i18 = i17;
                    } else if ((i3 & 6) == 0) {
                        i18 = i17;
                        i19 = i3 | (oq5Var.g(z) ? 4 : 2);
                    } else {
                        i18 = i17;
                        i19 = i3;
                    }
                    int i29 = i19 | 48;
                    if ((i3 & 384) == 0) {
                        i29 |= oq5Var.c(f2) ? 256 : 128;
                    }
                    int i30 = i29;
                    i20 = i4 & RemoteCameraConfig.Notification.ID;
                    if (i20 != 0) {
                        i21 = i30 | 3072;
                    } else if ((i3 & 3072) == 0) {
                        i21 = i30 | (oq5Var.c(f3) ? 2048 : 1024);
                    } else {
                        i21 = i30;
                    }
                    i22 = i4 & 16384;
                    if (i22 != 0) {
                        i23 = i21 | 24576;
                    } else {
                        int i31 = i21;
                        if (oq5Var.c(f4)) {
                            i28 = 16384;
                        }
                        i23 = i31 | i28;
                    }
                    if ((i16 & 306783379) != 306783378 && (i23 & 9363) == 9362 && oq5Var.z()) {
                        oq5Var.S();
                        function216 = function25;
                        function04 = function0;
                        function213 = function27;
                        yciVar3 = yciVar2;
                        function211 = function28;
                        habVar4 = habVar2;
                        o0kVar6 = o0kVar2;
                        function214 = function26;
                        function215 = function24;
                        z4 = z;
                        f9 = f3;
                        f10 = f4;
                    } else {
                        oq5Var.U();
                        i24 = i2 & 1;
                        Object obj = gq5.a;
                        if (i24 != 0 || oq5Var.y()) {
                            yciVar3 = i25 != 0 ? vci.a : yciVar2;
                            if (i26 != 0) {
                                habVar2 = null;
                            }
                            if ((i4 & 8) != 0) {
                                WeakHashMap weakHashMap = rqv.w;
                                o0kVar3 = p6g.n(z7l.h(oq5Var).f, oq5Var);
                                i16 &= -7169;
                            } else {
                                o0kVar3 = o0kVar2;
                            }
                            if (i9 != 0) {
                                function26 = null;
                            }
                            if (i10 != 0) {
                                function27 = null;
                            }
                            if (i12 != 0) {
                                function28 = null;
                            }
                            Function2 function217 = i13 != 0 ? null : function24;
                            Function2 function218 = i14 == 0 ? function25 : null;
                            if (i15 != 0) {
                                Object K2 = oq5Var.K();
                                if (K2 == obj) {
                                    K2 = new htb(29);
                                    oq5Var.k0(K2);
                                }
                                function02 = (Function0) K2;
                            } else {
                                function02 = function0;
                            }
                            boolean z5 = i18 != 0 ? false : z;
                            Function0 function05 = function02;
                            float f11 = i20 != 0 ? 24 : f3;
                            if (i22 != 0) {
                                function03 = function05;
                                f5 = f11;
                                f6 = 0;
                            } else {
                                function03 = function05;
                                f5 = f11;
                                f6 = f4;
                            }
                            function29 = function218;
                            function210 = function217;
                            function211 = function28;
                            habVar3 = habVar2;
                            z2 = z5;
                        } else {
                            oq5Var.S();
                            if ((i4 & 8) != 0) {
                                i16 &= -7169;
                            }
                            function210 = function24;
                            function29 = function25;
                            function03 = function0;
                            z2 = z;
                            f5 = f3;
                            f6 = f4;
                            yciVar3 = yciVar2;
                            function211 = function28;
                            habVar3 = habVar2;
                            o0kVar3 = o0kVar2;
                        }
                        final Function2 function219 = function26;
                        oq5Var.q();
                        final Configuration configuration = (Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a);
                        final float d2 = irv.d(oq5Var);
                        final float e3 = irv.e(oq5Var) + zs4.e(oq5Var) + 56;
                        long j2 = nu0.e().b.c;
                        v7g.p(j2);
                        o0k o0kVar7 = o0kVar3;
                        final long D = v7g.D(kes.c(j2) * 2, j2 & 1095216660480L);
                        boolean h2 = oq5Var.h(configuration) | oq5Var.c(d2) | oq5Var.c(e3);
                        if (((i16 & 7168) ^ 3072) > 2048) {
                            o0kVar4 = o0kVar7;
                            if (oq5Var.f(o0kVar4)) {
                                f7 = f5;
                                z3 = true;
                                e2 = ((i23 & 57344) == 16384) | z3 | h2 | ((i23 & 896) == 256) | oq5Var.e(D) | ((i23 & 7168) == 2048) | ((3670016 & i16) == 1048576) | ((i16 & 896) == 256) | ((i16 & 14) == 4) | ((458752 & i16) == 131072) | ((i16 & 57344) == 16384) | ((i23 & 14) == 4) | ((29360128 & i16) == 8388608) | ((234881024 & i16) == 67108864) | ((1879048192 & i16) == 536870912);
                                K = oq5Var.K();
                                if (!e2 || K == obj) {
                                    f8 = f7;
                                    function212 = function27;
                                    o0kVar5 = o0kVar4;
                                    K = new Function2() { // from class: ovd
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            ksk kskVar;
                                            int i32;
                                            float f12;
                                            int i33;
                                            ksk M;
                                            float f13;
                                            float f14;
                                            ksk kskVar2;
                                            int L;
                                            ksk kskVar3;
                                            ksk kskVar4;
                                            ffh ffhVar;
                                            Function2 function220;
                                            boolean z6;
                                            boolean z7;
                                            ffh ffhVar2;
                                            Function2 function221;
                                            x6k x6kVar;
                                            final dnr dnrVar = (dnr) obj2;
                                            ga6 ga6Var = (ga6) obj3;
                                            dnrVar.getClass();
                                            boolean J = asq.J(configuration);
                                            float f15 = J ? 0.8f : 1.25f;
                                            final int i34 = ga6.i(ga6Var.a);
                                            if (i34 == Integer.MAX_VALUE) {
                                                xq0.x("Failed requirement.");
                                                return null;
                                            }
                                            int L2 = dnrVar.L(d2 - e3);
                                            float d3 = o0kVar5.d();
                                            int b2 = eeh.b((i34 / f15) + dnrVar.L(d3));
                                            if (b2 <= L2) {
                                                L2 = b2;
                                            }
                                            float p = dnrVar.p(v7g.z(16)) + f2;
                                            float f16 = 52;
                                            float f17 = f16 + d3;
                                            float f18 = 16;
                                            final float f19 = 8;
                                            float p2 = dnrVar.p(D);
                                            float f20 = 2;
                                            long i35 = ia6.i(ia6.b(i34, 0, 13), -dnrVar.L(f8 * f20), 0);
                                            Function2 function222 = function211;
                                            ksk M2 = function222 != null ? ((ffh) CollectionsKt.k0(dnrVar.i(pxq.e, function222))).M(i35) : null;
                                            float c0 = M2 != null ? dnrVar.c0(M2.b) : 12;
                                            float c02 = ((dnrVar.c0(L2) - p) - f17) - f18;
                                            float f21 = c02 - ((p2 + f19) + c0);
                                            float c03 = dnrVar.c0(i34) - (f16 * f20);
                                            float f22 = 96;
                                            boolean z8 = (Float.compare(c03, f22) >= 0) && ((Float.compare(f21, f22) >= 0) || J);
                                            hab habVar5 = habVar3;
                                            if (habVar5 == null || (x6kVar = habVar5.b) == null) {
                                                kskVar = M2;
                                            } else {
                                                kskVar = M2;
                                                x6kVar.setValue(Boolean.valueOf(z8));
                                            }
                                            ffh ffhVar3 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.c, new wn5(new wl3(wn5Var, z8, 1), -830237976, true)));
                                            if (z8) {
                                                i32 = 0;
                                                f12 = 0;
                                                M = ffhVar3.M(ga6.b(i35, 0, 0, 0, 0, 15));
                                                i33 = 13;
                                            } else {
                                                i32 = 0;
                                                f12 = 4;
                                                i33 = 13;
                                                M = ffhVar3.M(ia6.i(ia6.b(i34, 0, 13), dnrVar.L(-200), 0));
                                            }
                                            long b3 = ia6.b(i34, i32, i33);
                                            Function2 function223 = function212;
                                            if (function223 != null) {
                                                f13 = f12;
                                                f14 = f17;
                                                kskVar2 = ((ffh) CollectionsKt.k0(dnrVar.i(pxq.d, new wn5(new im0(function223, 9), 552205411, true)))).M(b3);
                                            } else {
                                                f13 = f12;
                                                f14 = f17;
                                                kskVar2 = null;
                                            }
                                            final ksk kskVar5 = z8 ? kskVar2 : null;
                                            float c04 = dnrVar.c0(M.b) + f19 + f13 + c0;
                                            float f23 = ((cma) yhn.a(new cma(c02 - c04), new cma(f22))).a;
                                            float f24 = f23 > c03 ? c03 : f23;
                                            float f25 = 320;
                                            if (f24 > f25) {
                                                f24 = f25;
                                            }
                                            if (z8) {
                                                L = dnrVar.L(f24 + f14 + f18);
                                            } else {
                                                int Y = M.Y(j40.b);
                                                if (Y == Integer.MIN_VALUE) {
                                                    Y = M.b;
                                                }
                                                L = dnrVar.L((d3 + f18) + 24) - Y;
                                            }
                                            final int i36 = L;
                                            final int L3 = dnrVar.L(p) + dnrVar.L(c04) + i36;
                                            final boolean z9 = z2;
                                            if (!z8 || (function221 = function219) == null) {
                                                kskVar3 = null;
                                            } else {
                                                ffh ffhVar4 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.a, function221));
                                                if (z9) {
                                                    if (!((i34 >= 0) & (L3 >= 0))) {
                                                        ume.a("width and height must be >= 0");
                                                    }
                                                    kskVar3 = ffhVar4.M(ia6.h(i34, i34, L3, L3));
                                                } else {
                                                    int L4 = dnrVar.L(f24);
                                                    int L5 = dnrVar.L(f24);
                                                    if (!((L4 >= 0) & (L5 >= 0))) {
                                                        ume.a("width and height must be >= 0");
                                                    }
                                                    kskVar3 = ffhVar4.M(ia6.h(L4, L4, L5, L5));
                                                }
                                            }
                                            if (z8 && (function220 = function210) != null) {
                                                List i37 = dnrVar.i(pxq.b, function220);
                                                int size = i37.size();
                                                if (size != 0) {
                                                    z7 = true;
                                                    if (size != 1) {
                                                        xq0.x("List has more than one element.");
                                                        return null;
                                                    }
                                                    z6 = false;
                                                    ffhVar2 = (ffh) i37.get(0);
                                                } else {
                                                    z6 = false;
                                                    z7 = true;
                                                    ffhVar2 = null;
                                                }
                                                if (ffhVar2 != null) {
                                                    boolean z10 = i34 >= 0 ? z7 : z6;
                                                    if (L3 < 0) {
                                                        z7 = z6;
                                                    }
                                                    if (!(z10 & z7)) {
                                                        ume.a("width and height must be >= 0");
                                                    }
                                                    kskVar4 = ffhVar2.M(ia6.h(i34, i34, L3, L3));
                                                    Function2 function224 = function29;
                                                    ksk M3 = (function224 != null || (ffhVar = (ffh) CollectionsKt.k0(dnrVar.i(pxq.f, function224))) == null) ? null : ffhVar.M(ia6.b(i34, dnrVar.L(p), 5));
                                                    final ksk kskVar6 = M;
                                                    final ksk kskVar7 = kskVar3;
                                                    final ksk kskVar8 = kskVar4;
                                                    final Function0 function06 = function03;
                                                    final float f26 = f6;
                                                    final float f27 = f14;
                                                    final ksk kskVar9 = M3;
                                                    final float f28 = f13;
                                                    final ksk kskVar10 = kskVar;
                                                    return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj4) {
                                                            gz2 gz2Var = b2c.o;
                                                            jsk jskVar = (jsk) obj4;
                                                            jskVar.getClass();
                                                            int intValue = ((Number) Function0.this.invoke()).intValue();
                                                            ksk kskVar11 = kskVar7;
                                                            int i38 = i34;
                                                            dnr dnrVar2 = dnrVar;
                                                            if (kskVar11 != null) {
                                                                jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f27)) + intValue, 0.0f);
                                                            }
                                                            ksk kskVar12 = kskVar8;
                                                            if (kskVar12 != null) {
                                                                jskVar.d(kskVar12, 0, 0, 0.0f);
                                                            }
                                                            ksk kskVar13 = kskVar5;
                                                            int i39 = i36;
                                                            if (kskVar13 != null) {
                                                                jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                                            }
                                                            ksk kskVar14 = kskVar6;
                                                            jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f26) + i39, 0.0f);
                                                            ksk kskVar15 = kskVar10;
                                                            if (kskVar15 != null) {
                                                                jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f28) + i39 + kskVar14.b, 0.0f);
                                                            }
                                                            ksk kskVar16 = kskVar9;
                                                            if (kskVar16 != null) {
                                                                jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                                            }
                                                            return Unit.a;
                                                        }
                                                    });
                                                }
                                            }
                                            kskVar4 = null;
                                            Function2 function2242 = function29;
                                            if (function2242 != null) {
                                            }
                                            final ksk kskVar62 = M;
                                            final ksk kskVar72 = kskVar3;
                                            final ksk kskVar82 = kskVar4;
                                            final Function0 function062 = function03;
                                            final float f262 = f6;
                                            final float f272 = f14;
                                            final ksk kskVar92 = M3;
                                            final float f282 = f13;
                                            final ksk kskVar102 = kskVar;
                                            return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj4) {
                                                    gz2 gz2Var = b2c.o;
                                                    jsk jskVar = (jsk) obj4;
                                                    jskVar.getClass();
                                                    int intValue = ((Number) Function0.this.invoke()).intValue();
                                                    ksk kskVar11 = kskVar72;
                                                    int i38 = i34;
                                                    dnr dnrVar2 = dnrVar;
                                                    if (kskVar11 != null) {
                                                        jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f272)) + intValue, 0.0f);
                                                    }
                                                    ksk kskVar12 = kskVar82;
                                                    if (kskVar12 != null) {
                                                        jskVar.d(kskVar12, 0, 0, 0.0f);
                                                    }
                                                    ksk kskVar13 = kskVar5;
                                                    int i39 = i36;
                                                    if (kskVar13 != null) {
                                                        jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                                    }
                                                    ksk kskVar14 = kskVar62;
                                                    jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f262) + i39, 0.0f);
                                                    ksk kskVar15 = kskVar102;
                                                    if (kskVar15 != null) {
                                                        jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f282) + i39 + kskVar14.b, 0.0f);
                                                    }
                                                    ksk kskVar16 = kskVar92;
                                                    if (kskVar16 != null) {
                                                        jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                                    }
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                    };
                                    oq5Var.k0(K);
                                } else {
                                    f8 = f7;
                                    function212 = function27;
                                    o0kVar5 = o0kVar4;
                                }
                                u2x.p(yciVar3, (Function2) K, oq5Var, (i16 >> 3) & 14, 0);
                                o0kVar6 = o0kVar5;
                                f9 = f8;
                                function213 = function212;
                                function214 = function219;
                                z4 = z2;
                                function215 = function210;
                                function216 = function29;
                                habVar4 = habVar3;
                                function04 = function03;
                                f10 = f6;
                            }
                        } else {
                            o0kVar4 = o0kVar7;
                        }
                        f7 = f5;
                        if ((i16 & 3072) != 2048) {
                            z3 = false;
                            e2 = ((i23 & 57344) == 16384) | z3 | h2 | ((i23 & 896) == 256) | oq5Var.e(D) | ((i23 & 7168) == 2048) | ((3670016 & i16) == 1048576) | ((i16 & 896) == 256) | ((i16 & 14) == 4) | ((458752 & i16) == 131072) | ((i16 & 57344) == 16384) | ((i23 & 14) == 4) | ((29360128 & i16) == 8388608) | ((234881024 & i16) == 67108864) | ((1879048192 & i16) == 536870912);
                            K = oq5Var.K();
                            if (e2) {
                            }
                            f8 = f7;
                            function212 = function27;
                            o0kVar5 = o0kVar4;
                            K = new Function2() { // from class: ovd
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    ksk kskVar;
                                    int i32;
                                    float f12;
                                    int i33;
                                    ksk M;
                                    float f13;
                                    float f14;
                                    ksk kskVar2;
                                    int L;
                                    ksk kskVar3;
                                    ksk kskVar4;
                                    ffh ffhVar;
                                    Function2 function220;
                                    boolean z6;
                                    boolean z7;
                                    ffh ffhVar2;
                                    Function2 function221;
                                    x6k x6kVar;
                                    final dnr dnrVar = (dnr) obj2;
                                    ga6 ga6Var = (ga6) obj3;
                                    dnrVar.getClass();
                                    boolean J = asq.J(configuration);
                                    float f15 = J ? 0.8f : 1.25f;
                                    final int i34 = ga6.i(ga6Var.a);
                                    if (i34 == Integer.MAX_VALUE) {
                                        xq0.x("Failed requirement.");
                                        return null;
                                    }
                                    int L2 = dnrVar.L(d2 - e3);
                                    float d3 = o0kVar5.d();
                                    int b2 = eeh.b((i34 / f15) + dnrVar.L(d3));
                                    if (b2 <= L2) {
                                        L2 = b2;
                                    }
                                    float p = dnrVar.p(v7g.z(16)) + f2;
                                    float f16 = 52;
                                    float f17 = f16 + d3;
                                    float f18 = 16;
                                    final float f19 = 8;
                                    float p2 = dnrVar.p(D);
                                    float f20 = 2;
                                    long i35 = ia6.i(ia6.b(i34, 0, 13), -dnrVar.L(f8 * f20), 0);
                                    Function2 function222 = function211;
                                    ksk M2 = function222 != null ? ((ffh) CollectionsKt.k0(dnrVar.i(pxq.e, function222))).M(i35) : null;
                                    float c0 = M2 != null ? dnrVar.c0(M2.b) : 12;
                                    float c02 = ((dnrVar.c0(L2) - p) - f17) - f18;
                                    float f21 = c02 - ((p2 + f19) + c0);
                                    float c03 = dnrVar.c0(i34) - (f16 * f20);
                                    float f22 = 96;
                                    boolean z8 = (Float.compare(c03, f22) >= 0) && ((Float.compare(f21, f22) >= 0) || J);
                                    hab habVar5 = habVar3;
                                    if (habVar5 == null || (x6kVar = habVar5.b) == null) {
                                        kskVar = M2;
                                    } else {
                                        kskVar = M2;
                                        x6kVar.setValue(Boolean.valueOf(z8));
                                    }
                                    ffh ffhVar3 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.c, new wn5(new wl3(wn5Var, z8, 1), -830237976, true)));
                                    if (z8) {
                                        i32 = 0;
                                        f12 = 0;
                                        M = ffhVar3.M(ga6.b(i35, 0, 0, 0, 0, 15));
                                        i33 = 13;
                                    } else {
                                        i32 = 0;
                                        f12 = 4;
                                        i33 = 13;
                                        M = ffhVar3.M(ia6.i(ia6.b(i34, 0, 13), dnrVar.L(-200), 0));
                                    }
                                    long b3 = ia6.b(i34, i32, i33);
                                    Function2 function223 = function212;
                                    if (function223 != null) {
                                        f13 = f12;
                                        f14 = f17;
                                        kskVar2 = ((ffh) CollectionsKt.k0(dnrVar.i(pxq.d, new wn5(new im0(function223, 9), 552205411, true)))).M(b3);
                                    } else {
                                        f13 = f12;
                                        f14 = f17;
                                        kskVar2 = null;
                                    }
                                    final ksk kskVar5 = z8 ? kskVar2 : null;
                                    float c04 = dnrVar.c0(M.b) + f19 + f13 + c0;
                                    float f23 = ((cma) yhn.a(new cma(c02 - c04), new cma(f22))).a;
                                    float f24 = f23 > c03 ? c03 : f23;
                                    float f25 = 320;
                                    if (f24 > f25) {
                                        f24 = f25;
                                    }
                                    if (z8) {
                                        L = dnrVar.L(f24 + f14 + f18);
                                    } else {
                                        int Y = M.Y(j40.b);
                                        if (Y == Integer.MIN_VALUE) {
                                            Y = M.b;
                                        }
                                        L = dnrVar.L((d3 + f18) + 24) - Y;
                                    }
                                    final int i36 = L;
                                    final int L3 = dnrVar.L(p) + dnrVar.L(c04) + i36;
                                    final boolean z9 = z2;
                                    if (!z8 || (function221 = function219) == null) {
                                        kskVar3 = null;
                                    } else {
                                        ffh ffhVar4 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.a, function221));
                                        if (z9) {
                                            if (!((i34 >= 0) & (L3 >= 0))) {
                                                ume.a("width and height must be >= 0");
                                            }
                                            kskVar3 = ffhVar4.M(ia6.h(i34, i34, L3, L3));
                                        } else {
                                            int L4 = dnrVar.L(f24);
                                            int L5 = dnrVar.L(f24);
                                            if (!((L4 >= 0) & (L5 >= 0))) {
                                                ume.a("width and height must be >= 0");
                                            }
                                            kskVar3 = ffhVar4.M(ia6.h(L4, L4, L5, L5));
                                        }
                                    }
                                    if (z8 && (function220 = function210) != null) {
                                        List i37 = dnrVar.i(pxq.b, function220);
                                        int size = i37.size();
                                        if (size != 0) {
                                            z7 = true;
                                            if (size != 1) {
                                                xq0.x("List has more than one element.");
                                                return null;
                                            }
                                            z6 = false;
                                            ffhVar2 = (ffh) i37.get(0);
                                        } else {
                                            z6 = false;
                                            z7 = true;
                                            ffhVar2 = null;
                                        }
                                        if (ffhVar2 != null) {
                                            boolean z10 = i34 >= 0 ? z7 : z6;
                                            if (L3 < 0) {
                                                z7 = z6;
                                            }
                                            if (!(z10 & z7)) {
                                                ume.a("width and height must be >= 0");
                                            }
                                            kskVar4 = ffhVar2.M(ia6.h(i34, i34, L3, L3));
                                            Function2 function2242 = function29;
                                            ksk M3 = (function2242 != null || (ffhVar = (ffh) CollectionsKt.k0(dnrVar.i(pxq.f, function2242))) == null) ? null : ffhVar.M(ia6.b(i34, dnrVar.L(p), 5));
                                            final ksk kskVar62 = M;
                                            final ksk kskVar72 = kskVar3;
                                            final ksk kskVar82 = kskVar4;
                                            final Function0 function062 = function03;
                                            final float f262 = f6;
                                            final float f272 = f14;
                                            final ksk kskVar92 = M3;
                                            final float f282 = f13;
                                            final ksk kskVar102 = kskVar;
                                            return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj4) {
                                                    gz2 gz2Var = b2c.o;
                                                    jsk jskVar = (jsk) obj4;
                                                    jskVar.getClass();
                                                    int intValue = ((Number) Function0.this.invoke()).intValue();
                                                    ksk kskVar11 = kskVar72;
                                                    int i38 = i34;
                                                    dnr dnrVar2 = dnrVar;
                                                    if (kskVar11 != null) {
                                                        jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f272)) + intValue, 0.0f);
                                                    }
                                                    ksk kskVar12 = kskVar82;
                                                    if (kskVar12 != null) {
                                                        jskVar.d(kskVar12, 0, 0, 0.0f);
                                                    }
                                                    ksk kskVar13 = kskVar5;
                                                    int i39 = i36;
                                                    if (kskVar13 != null) {
                                                        jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                                    }
                                                    ksk kskVar14 = kskVar62;
                                                    jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f262) + i39, 0.0f);
                                                    ksk kskVar15 = kskVar102;
                                                    if (kskVar15 != null) {
                                                        jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f282) + i39 + kskVar14.b, 0.0f);
                                                    }
                                                    ksk kskVar16 = kskVar92;
                                                    if (kskVar16 != null) {
                                                        jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                                    }
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                    }
                                    kskVar4 = null;
                                    Function2 function22422 = function29;
                                    if (function22422 != null) {
                                    }
                                    final ksk kskVar622 = M;
                                    final ksk kskVar722 = kskVar3;
                                    final ksk kskVar822 = kskVar4;
                                    final Function0 function0622 = function03;
                                    final float f2622 = f6;
                                    final float f2722 = f14;
                                    final ksk kskVar922 = M3;
                                    final float f2822 = f13;
                                    final ksk kskVar1022 = kskVar;
                                    return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            gz2 gz2Var = b2c.o;
                                            jsk jskVar = (jsk) obj4;
                                            jskVar.getClass();
                                            int intValue = ((Number) Function0.this.invoke()).intValue();
                                            ksk kskVar11 = kskVar722;
                                            int i38 = i34;
                                            dnr dnrVar2 = dnrVar;
                                            if (kskVar11 != null) {
                                                jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f2722)) + intValue, 0.0f);
                                            }
                                            ksk kskVar12 = kskVar822;
                                            if (kskVar12 != null) {
                                                jskVar.d(kskVar12, 0, 0, 0.0f);
                                            }
                                            ksk kskVar13 = kskVar5;
                                            int i39 = i36;
                                            if (kskVar13 != null) {
                                                jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                            }
                                            ksk kskVar14 = kskVar622;
                                            jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f2622) + i39, 0.0f);
                                            ksk kskVar15 = kskVar1022;
                                            if (kskVar15 != null) {
                                                jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f2822) + i39 + kskVar14.b, 0.0f);
                                            }
                                            ksk kskVar16 = kskVar922;
                                            if (kskVar16 != null) {
                                                jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                            }
                                            return Unit.a;
                                        }
                                    });
                                }
                            };
                            oq5Var.k0(K);
                            u2x.p(yciVar3, (Function2) K, oq5Var, (i16 >> 3) & 14, 0);
                            o0kVar6 = o0kVar5;
                            f9 = f8;
                            function213 = function212;
                            function214 = function219;
                            z4 = z2;
                            function215 = function210;
                            function216 = function29;
                            habVar4 = habVar3;
                            function04 = function03;
                            f10 = f6;
                        }
                        z3 = true;
                        e2 = ((i23 & 57344) == 16384) | z3 | h2 | ((i23 & 896) == 256) | oq5Var.e(D) | ((i23 & 7168) == 2048) | ((3670016 & i16) == 1048576) | ((i16 & 896) == 256) | ((i16 & 14) == 4) | ((458752 & i16) == 131072) | ((i16 & 57344) == 16384) | ((i23 & 14) == 4) | ((29360128 & i16) == 8388608) | ((234881024 & i16) == 67108864) | ((1879048192 & i16) == 536870912);
                        K = oq5Var.K();
                        if (e2) {
                        }
                        f8 = f7;
                        function212 = function27;
                        o0kVar5 = o0kVar4;
                        K = new Function2() { // from class: ovd
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ksk kskVar;
                                int i32;
                                float f12;
                                int i33;
                                ksk M;
                                float f13;
                                float f14;
                                ksk kskVar2;
                                int L;
                                ksk kskVar3;
                                ksk kskVar4;
                                ffh ffhVar;
                                Function2 function220;
                                boolean z6;
                                boolean z7;
                                ffh ffhVar2;
                                Function2 function221;
                                x6k x6kVar;
                                final dnr dnrVar = (dnr) obj2;
                                ga6 ga6Var = (ga6) obj3;
                                dnrVar.getClass();
                                boolean J = asq.J(configuration);
                                float f15 = J ? 0.8f : 1.25f;
                                final int i34 = ga6.i(ga6Var.a);
                                if (i34 == Integer.MAX_VALUE) {
                                    xq0.x("Failed requirement.");
                                    return null;
                                }
                                int L2 = dnrVar.L(d2 - e3);
                                float d3 = o0kVar5.d();
                                int b2 = eeh.b((i34 / f15) + dnrVar.L(d3));
                                if (b2 <= L2) {
                                    L2 = b2;
                                }
                                float p = dnrVar.p(v7g.z(16)) + f2;
                                float f16 = 52;
                                float f17 = f16 + d3;
                                float f18 = 16;
                                final float f19 = 8;
                                float p2 = dnrVar.p(D);
                                float f20 = 2;
                                long i35 = ia6.i(ia6.b(i34, 0, 13), -dnrVar.L(f8 * f20), 0);
                                Function2 function222 = function211;
                                ksk M2 = function222 != null ? ((ffh) CollectionsKt.k0(dnrVar.i(pxq.e, function222))).M(i35) : null;
                                float c0 = M2 != null ? dnrVar.c0(M2.b) : 12;
                                float c02 = ((dnrVar.c0(L2) - p) - f17) - f18;
                                float f21 = c02 - ((p2 + f19) + c0);
                                float c03 = dnrVar.c0(i34) - (f16 * f20);
                                float f22 = 96;
                                boolean z8 = (Float.compare(c03, f22) >= 0) && ((Float.compare(f21, f22) >= 0) || J);
                                hab habVar5 = habVar3;
                                if (habVar5 == null || (x6kVar = habVar5.b) == null) {
                                    kskVar = M2;
                                } else {
                                    kskVar = M2;
                                    x6kVar.setValue(Boolean.valueOf(z8));
                                }
                                ffh ffhVar3 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.c, new wn5(new wl3(wn5Var, z8, 1), -830237976, true)));
                                if (z8) {
                                    i32 = 0;
                                    f12 = 0;
                                    M = ffhVar3.M(ga6.b(i35, 0, 0, 0, 0, 15));
                                    i33 = 13;
                                } else {
                                    i32 = 0;
                                    f12 = 4;
                                    i33 = 13;
                                    M = ffhVar3.M(ia6.i(ia6.b(i34, 0, 13), dnrVar.L(-200), 0));
                                }
                                long b3 = ia6.b(i34, i32, i33);
                                Function2 function223 = function212;
                                if (function223 != null) {
                                    f13 = f12;
                                    f14 = f17;
                                    kskVar2 = ((ffh) CollectionsKt.k0(dnrVar.i(pxq.d, new wn5(new im0(function223, 9), 552205411, true)))).M(b3);
                                } else {
                                    f13 = f12;
                                    f14 = f17;
                                    kskVar2 = null;
                                }
                                final ksk kskVar5 = z8 ? kskVar2 : null;
                                float c04 = dnrVar.c0(M.b) + f19 + f13 + c0;
                                float f23 = ((cma) yhn.a(new cma(c02 - c04), new cma(f22))).a;
                                float f24 = f23 > c03 ? c03 : f23;
                                float f25 = 320;
                                if (f24 > f25) {
                                    f24 = f25;
                                }
                                if (z8) {
                                    L = dnrVar.L(f24 + f14 + f18);
                                } else {
                                    int Y = M.Y(j40.b);
                                    if (Y == Integer.MIN_VALUE) {
                                        Y = M.b;
                                    }
                                    L = dnrVar.L((d3 + f18) + 24) - Y;
                                }
                                final int i36 = L;
                                final int L3 = dnrVar.L(p) + dnrVar.L(c04) + i36;
                                final boolean z9 = z2;
                                if (!z8 || (function221 = function219) == null) {
                                    kskVar3 = null;
                                } else {
                                    ffh ffhVar4 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.a, function221));
                                    if (z9) {
                                        if (!((i34 >= 0) & (L3 >= 0))) {
                                            ume.a("width and height must be >= 0");
                                        }
                                        kskVar3 = ffhVar4.M(ia6.h(i34, i34, L3, L3));
                                    } else {
                                        int L4 = dnrVar.L(f24);
                                        int L5 = dnrVar.L(f24);
                                        if (!((L4 >= 0) & (L5 >= 0))) {
                                            ume.a("width and height must be >= 0");
                                        }
                                        kskVar3 = ffhVar4.M(ia6.h(L4, L4, L5, L5));
                                    }
                                }
                                if (z8 && (function220 = function210) != null) {
                                    List i37 = dnrVar.i(pxq.b, function220);
                                    int size = i37.size();
                                    if (size != 0) {
                                        z7 = true;
                                        if (size != 1) {
                                            xq0.x("List has more than one element.");
                                            return null;
                                        }
                                        z6 = false;
                                        ffhVar2 = (ffh) i37.get(0);
                                    } else {
                                        z6 = false;
                                        z7 = true;
                                        ffhVar2 = null;
                                    }
                                    if (ffhVar2 != null) {
                                        boolean z10 = i34 >= 0 ? z7 : z6;
                                        if (L3 < 0) {
                                            z7 = z6;
                                        }
                                        if (!(z10 & z7)) {
                                            ume.a("width and height must be >= 0");
                                        }
                                        kskVar4 = ffhVar2.M(ia6.h(i34, i34, L3, L3));
                                        Function2 function22422 = function29;
                                        ksk M3 = (function22422 != null || (ffhVar = (ffh) CollectionsKt.k0(dnrVar.i(pxq.f, function22422))) == null) ? null : ffhVar.M(ia6.b(i34, dnrVar.L(p), 5));
                                        final ksk kskVar622 = M;
                                        final ksk kskVar722 = kskVar3;
                                        final ksk kskVar822 = kskVar4;
                                        final Function0 function0622 = function03;
                                        final float f2622 = f6;
                                        final float f2722 = f14;
                                        final ksk kskVar922 = M3;
                                        final float f2822 = f13;
                                        final ksk kskVar1022 = kskVar;
                                        return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                gz2 gz2Var = b2c.o;
                                                jsk jskVar = (jsk) obj4;
                                                jskVar.getClass();
                                                int intValue = ((Number) Function0.this.invoke()).intValue();
                                                ksk kskVar11 = kskVar722;
                                                int i38 = i34;
                                                dnr dnrVar2 = dnrVar;
                                                if (kskVar11 != null) {
                                                    jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f2722)) + intValue, 0.0f);
                                                }
                                                ksk kskVar12 = kskVar822;
                                                if (kskVar12 != null) {
                                                    jskVar.d(kskVar12, 0, 0, 0.0f);
                                                }
                                                ksk kskVar13 = kskVar5;
                                                int i39 = i36;
                                                if (kskVar13 != null) {
                                                    jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                                }
                                                ksk kskVar14 = kskVar622;
                                                jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f2622) + i39, 0.0f);
                                                ksk kskVar15 = kskVar1022;
                                                if (kskVar15 != null) {
                                                    jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f2822) + i39 + kskVar14.b, 0.0f);
                                                }
                                                ksk kskVar16 = kskVar922;
                                                if (kskVar16 != null) {
                                                    jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                                }
                                                return Unit.a;
                                            }
                                        });
                                    }
                                }
                                kskVar4 = null;
                                Function2 function224222 = function29;
                                if (function224222 != null) {
                                }
                                final ksk kskVar6222 = M;
                                final ksk kskVar7222 = kskVar3;
                                final ksk kskVar8222 = kskVar4;
                                final Function0 function06222 = function03;
                                final float f26222 = f6;
                                final float f27222 = f14;
                                final ksk kskVar9222 = M3;
                                final float f28222 = f13;
                                final ksk kskVar10222 = kskVar;
                                return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        gz2 gz2Var = b2c.o;
                                        jsk jskVar = (jsk) obj4;
                                        jskVar.getClass();
                                        int intValue = ((Number) Function0.this.invoke()).intValue();
                                        ksk kskVar11 = kskVar7222;
                                        int i38 = i34;
                                        dnr dnrVar2 = dnrVar;
                                        if (kskVar11 != null) {
                                            jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f27222)) + intValue, 0.0f);
                                        }
                                        ksk kskVar12 = kskVar8222;
                                        if (kskVar12 != null) {
                                            jskVar.d(kskVar12, 0, 0, 0.0f);
                                        }
                                        ksk kskVar13 = kskVar5;
                                        int i39 = i36;
                                        if (kskVar13 != null) {
                                            jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                        }
                                        ksk kskVar14 = kskVar6222;
                                        jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f26222) + i39, 0.0f);
                                        ksk kskVar15 = kskVar10222;
                                        if (kskVar15 != null) {
                                            jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f28222) + i39 + kskVar14.b, 0.0f);
                                        }
                                        ksk kskVar16 = kskVar9222;
                                        if (kskVar16 != null) {
                                            jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                        };
                        oq5Var.k0(K);
                        u2x.p(yciVar3, (Function2) K, oq5Var, (i16 >> 3) & 14, 0);
                        o0kVar6 = o0kVar5;
                        f9 = f8;
                        function213 = function212;
                        function214 = function219;
                        z4 = z2;
                        function215 = function210;
                        function216 = function29;
                        habVar4 = habVar3;
                        function04 = function03;
                        f10 = f6;
                    }
                    r = oq5Var.r();
                    if (r != null) {
                        final yci yciVar4 = yciVar3;
                        final Function2 function220 = function211;
                        r.d = new Function2() { // from class: pvd
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                ((Integer) obj3).getClass();
                                int R = rvf.R(i2 | 1);
                                int R2 = rvf.R(i3);
                                wdp.S(wn5.this, yciVar4, habVar4, o0kVar6, function214, function213, function220, function215, function216, function04, z4, f2, f9, f10, (hq5) obj2, R, R2, i4);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                function26 = function2;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                }
                i13 = i4 & 128;
                if (i13 != 0) {
                }
                i14 = i4 & 256;
                if (i14 != 0) {
                }
                i15 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i15 != 0) {
                }
                i17 = i4 & 1024;
                if (i17 != 0) {
                }
                int i292 = i19 | 48;
                if ((i3 & 384) == 0) {
                }
                int i302 = i292;
                i20 = i4 & RemoteCameraConfig.Notification.ID;
                if (i20 != 0) {
                }
                i22 = i4 & 16384;
                if (i22 != 0) {
                }
                if ((i16 & 306783379) != 306783378) {
                }
                oq5Var.U();
                i24 = i2 & 1;
                Object obj2 = gq5.a;
                if (i24 != 0) {
                }
                if (i25 != 0) {
                }
                if (i26 != 0) {
                }
                if ((i4 & 8) != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                if (i13 != 0) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i18 != 0) {
                }
                Function0 function052 = function02;
                float f112 = i20 != 0 ? 24 : f3;
                if (i22 != 0) {
                }
                function29 = function218;
                function210 = function217;
                function211 = function28;
                habVar3 = habVar2;
                z2 = z5;
                final Function2 function2192 = function26;
                oq5Var.q();
                final Configuration configuration2 = (Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a);
                final float d22 = irv.d(oq5Var);
                final float e32 = irv.e(oq5Var) + zs4.e(oq5Var) + 56;
                long j22 = nu0.e().b.c;
                v7g.p(j22);
                o0k o0kVar72 = o0kVar3;
                final long D2 = v7g.D(kes.c(j22) * 2, j22 & 1095216660480L);
                boolean h22 = oq5Var.h(configuration2) | oq5Var.c(d22) | oq5Var.c(e32);
                if (((i16 & 7168) ^ 3072) > 2048) {
                }
                f7 = f5;
                if ((i16 & 3072) != 2048) {
                }
                z3 = true;
                e2 = ((i23 & 57344) == 16384) | z3 | h22 | ((i23 & 896) == 256) | oq5Var.e(D2) | ((i23 & 7168) == 2048) | ((3670016 & i16) == 1048576) | ((i16 & 896) == 256) | ((i16 & 14) == 4) | ((458752 & i16) == 131072) | ((i16 & 57344) == 16384) | ((i23 & 14) == 4) | ((29360128 & i16) == 8388608) | ((234881024 & i16) == 67108864) | ((1879048192 & i16) == 536870912);
                K = oq5Var.K();
                if (e2) {
                }
                f8 = f7;
                function212 = function27;
                o0kVar5 = o0kVar4;
                K = new Function2() { // from class: ovd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj22, Object obj3) {
                        ksk kskVar;
                        int i32;
                        float f12;
                        int i33;
                        ksk M;
                        float f13;
                        float f14;
                        ksk kskVar2;
                        int L;
                        ksk kskVar3;
                        ksk kskVar4;
                        ffh ffhVar;
                        Function2 function2202;
                        boolean z6;
                        boolean z7;
                        ffh ffhVar2;
                        Function2 function221;
                        x6k x6kVar;
                        final dnr dnrVar = (dnr) obj22;
                        ga6 ga6Var = (ga6) obj3;
                        dnrVar.getClass();
                        boolean J = asq.J(configuration2);
                        float f15 = J ? 0.8f : 1.25f;
                        final int i34 = ga6.i(ga6Var.a);
                        if (i34 == Integer.MAX_VALUE) {
                            xq0.x("Failed requirement.");
                            return null;
                        }
                        int L2 = dnrVar.L(d22 - e32);
                        float d3 = o0kVar5.d();
                        int b2 = eeh.b((i34 / f15) + dnrVar.L(d3));
                        if (b2 <= L2) {
                            L2 = b2;
                        }
                        float p = dnrVar.p(v7g.z(16)) + f2;
                        float f16 = 52;
                        float f17 = f16 + d3;
                        float f18 = 16;
                        final float f19 = 8;
                        float p2 = dnrVar.p(D2);
                        float f20 = 2;
                        long i35 = ia6.i(ia6.b(i34, 0, 13), -dnrVar.L(f8 * f20), 0);
                        Function2 function222 = function211;
                        ksk M2 = function222 != null ? ((ffh) CollectionsKt.k0(dnrVar.i(pxq.e, function222))).M(i35) : null;
                        float c0 = M2 != null ? dnrVar.c0(M2.b) : 12;
                        float c02 = ((dnrVar.c0(L2) - p) - f17) - f18;
                        float f21 = c02 - ((p2 + f19) + c0);
                        float c03 = dnrVar.c0(i34) - (f16 * f20);
                        float f22 = 96;
                        boolean z8 = (Float.compare(c03, f22) >= 0) && ((Float.compare(f21, f22) >= 0) || J);
                        hab habVar5 = habVar3;
                        if (habVar5 == null || (x6kVar = habVar5.b) == null) {
                            kskVar = M2;
                        } else {
                            kskVar = M2;
                            x6kVar.setValue(Boolean.valueOf(z8));
                        }
                        ffh ffhVar3 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.c, new wn5(new wl3(wn5Var, z8, 1), -830237976, true)));
                        if (z8) {
                            i32 = 0;
                            f12 = 0;
                            M = ffhVar3.M(ga6.b(i35, 0, 0, 0, 0, 15));
                            i33 = 13;
                        } else {
                            i32 = 0;
                            f12 = 4;
                            i33 = 13;
                            M = ffhVar3.M(ia6.i(ia6.b(i34, 0, 13), dnrVar.L(-200), 0));
                        }
                        long b3 = ia6.b(i34, i32, i33);
                        Function2 function223 = function212;
                        if (function223 != null) {
                            f13 = f12;
                            f14 = f17;
                            kskVar2 = ((ffh) CollectionsKt.k0(dnrVar.i(pxq.d, new wn5(new im0(function223, 9), 552205411, true)))).M(b3);
                        } else {
                            f13 = f12;
                            f14 = f17;
                            kskVar2 = null;
                        }
                        final ksk kskVar5 = z8 ? kskVar2 : null;
                        float c04 = dnrVar.c0(M.b) + f19 + f13 + c0;
                        float f23 = ((cma) yhn.a(new cma(c02 - c04), new cma(f22))).a;
                        float f24 = f23 > c03 ? c03 : f23;
                        float f25 = 320;
                        if (f24 > f25) {
                            f24 = f25;
                        }
                        if (z8) {
                            L = dnrVar.L(f24 + f14 + f18);
                        } else {
                            int Y = M.Y(j40.b);
                            if (Y == Integer.MIN_VALUE) {
                                Y = M.b;
                            }
                            L = dnrVar.L((d3 + f18) + 24) - Y;
                        }
                        final int i36 = L;
                        final int L3 = dnrVar.L(p) + dnrVar.L(c04) + i36;
                        final boolean z9 = z2;
                        if (!z8 || (function221 = function2192) == null) {
                            kskVar3 = null;
                        } else {
                            ffh ffhVar4 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.a, function221));
                            if (z9) {
                                if (!((i34 >= 0) & (L3 >= 0))) {
                                    ume.a("width and height must be >= 0");
                                }
                                kskVar3 = ffhVar4.M(ia6.h(i34, i34, L3, L3));
                            } else {
                                int L4 = dnrVar.L(f24);
                                int L5 = dnrVar.L(f24);
                                if (!((L4 >= 0) & (L5 >= 0))) {
                                    ume.a("width and height must be >= 0");
                                }
                                kskVar3 = ffhVar4.M(ia6.h(L4, L4, L5, L5));
                            }
                        }
                        if (z8 && (function2202 = function210) != null) {
                            List i37 = dnrVar.i(pxq.b, function2202);
                            int size = i37.size();
                            if (size != 0) {
                                z7 = true;
                                if (size != 1) {
                                    xq0.x("List has more than one element.");
                                    return null;
                                }
                                z6 = false;
                                ffhVar2 = (ffh) i37.get(0);
                            } else {
                                z6 = false;
                                z7 = true;
                                ffhVar2 = null;
                            }
                            if (ffhVar2 != null) {
                                boolean z10 = i34 >= 0 ? z7 : z6;
                                if (L3 < 0) {
                                    z7 = z6;
                                }
                                if (!(z10 & z7)) {
                                    ume.a("width and height must be >= 0");
                                }
                                kskVar4 = ffhVar2.M(ia6.h(i34, i34, L3, L3));
                                Function2 function224222 = function29;
                                ksk M3 = (function224222 != null || (ffhVar = (ffh) CollectionsKt.k0(dnrVar.i(pxq.f, function224222))) == null) ? null : ffhVar.M(ia6.b(i34, dnrVar.L(p), 5));
                                final ksk kskVar6222 = M;
                                final ksk kskVar7222 = kskVar3;
                                final ksk kskVar8222 = kskVar4;
                                final Function0 function06222 = function03;
                                final float f26222 = f6;
                                final float f27222 = f14;
                                final ksk kskVar9222 = M3;
                                final float f28222 = f13;
                                final ksk kskVar10222 = kskVar;
                                return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        gz2 gz2Var = b2c.o;
                                        jsk jskVar = (jsk) obj4;
                                        jskVar.getClass();
                                        int intValue = ((Number) Function0.this.invoke()).intValue();
                                        ksk kskVar11 = kskVar7222;
                                        int i38 = i34;
                                        dnr dnrVar2 = dnrVar;
                                        if (kskVar11 != null) {
                                            jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f27222)) + intValue, 0.0f);
                                        }
                                        ksk kskVar12 = kskVar8222;
                                        if (kskVar12 != null) {
                                            jskVar.d(kskVar12, 0, 0, 0.0f);
                                        }
                                        ksk kskVar13 = kskVar5;
                                        int i39 = i36;
                                        if (kskVar13 != null) {
                                            jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                        }
                                        ksk kskVar14 = kskVar6222;
                                        jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f26222) + i39, 0.0f);
                                        ksk kskVar15 = kskVar10222;
                                        if (kskVar15 != null) {
                                            jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f28222) + i39 + kskVar14.b, 0.0f);
                                        }
                                        ksk kskVar16 = kskVar9222;
                                        if (kskVar16 != null) {
                                            jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                        }
                        kskVar4 = null;
                        Function2 function2242222 = function29;
                        if (function2242222 != null) {
                        }
                        final ksk kskVar62222 = M;
                        final ksk kskVar72222 = kskVar3;
                        final ksk kskVar82222 = kskVar4;
                        final Function0 function062222 = function03;
                        final float f262222 = f6;
                        final float f272222 = f14;
                        final ksk kskVar92222 = M3;
                        final float f282222 = f13;
                        final ksk kskVar102222 = kskVar;
                        return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                gz2 gz2Var = b2c.o;
                                jsk jskVar = (jsk) obj4;
                                jskVar.getClass();
                                int intValue = ((Number) Function0.this.invoke()).intValue();
                                ksk kskVar11 = kskVar72222;
                                int i38 = i34;
                                dnr dnrVar2 = dnrVar;
                                if (kskVar11 != null) {
                                    jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f272222)) + intValue, 0.0f);
                                }
                                ksk kskVar12 = kskVar82222;
                                if (kskVar12 != null) {
                                    jskVar.d(kskVar12, 0, 0, 0.0f);
                                }
                                ksk kskVar13 = kskVar5;
                                int i39 = i36;
                                if (kskVar13 != null) {
                                    jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                }
                                ksk kskVar14 = kskVar62222;
                                jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f262222) + i39, 0.0f);
                                ksk kskVar15 = kskVar102222;
                                if (kskVar15 != null) {
                                    jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f282222) + i39 + kskVar14.b, 0.0f);
                                }
                                ksk kskVar16 = kskVar92222;
                                if (kskVar16 != null) {
                                    jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                }
                                return Unit.a;
                            }
                        });
                    }
                };
                oq5Var.k0(K);
                u2x.p(yciVar3, (Function2) K, oq5Var, (i16 >> 3) & 14, 0);
                o0kVar6 = o0kVar5;
                f9 = f8;
                function213 = function212;
                function214 = function2192;
                z4 = z2;
                function215 = function210;
                function216 = function29;
                habVar4 = habVar3;
                function04 = function03;
                f10 = f6;
                r = oq5Var.r();
                if (r != null) {
                }
            }
        } else {
            o0kVar2 = o0kVar;
        }
        i8 = 1024;
        int i272 = i7 | i8;
        i9 = i4 & 16;
        int i282 = RemoteCameraConfig.Notification.ID;
        if (i9 == 0) {
        }
        function26 = function2;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i12 = i4 & 64;
        if (i12 != 0) {
        }
        i13 = i4 & 128;
        if (i13 != 0) {
        }
        i14 = i4 & 256;
        if (i14 != 0) {
        }
        i15 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i15 != 0) {
        }
        i17 = i4 & 1024;
        if (i17 != 0) {
        }
        int i2922 = i19 | 48;
        if ((i3 & 384) == 0) {
        }
        int i3022 = i2922;
        i20 = i4 & RemoteCameraConfig.Notification.ID;
        if (i20 != 0) {
        }
        i22 = i4 & 16384;
        if (i22 != 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        oq5Var.U();
        i24 = i2 & 1;
        Object obj22 = gq5.a;
        if (i24 != 0) {
        }
        if (i25 != 0) {
        }
        if (i26 != 0) {
        }
        if ((i4 & 8) != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i18 != 0) {
        }
        Function0 function0522 = function02;
        float f1122 = i20 != 0 ? 24 : f3;
        if (i22 != 0) {
        }
        function29 = function218;
        function210 = function217;
        function211 = function28;
        habVar3 = habVar2;
        z2 = z5;
        final Function2 function21922 = function26;
        oq5Var.q();
        final Configuration configuration22 = (Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a);
        final float d222 = irv.d(oq5Var);
        final float e322 = irv.e(oq5Var) + zs4.e(oq5Var) + 56;
        long j222 = nu0.e().b.c;
        v7g.p(j222);
        o0k o0kVar722 = o0kVar3;
        final long D22 = v7g.D(kes.c(j222) * 2, j222 & 1095216660480L);
        boolean h222 = oq5Var.h(configuration22) | oq5Var.c(d222) | oq5Var.c(e322);
        if (((i16 & 7168) ^ 3072) > 2048) {
        }
        f7 = f5;
        if ((i16 & 3072) != 2048) {
        }
        z3 = true;
        e2 = ((i23 & 57344) == 16384) | z3 | h222 | ((i23 & 896) == 256) | oq5Var.e(D22) | ((i23 & 7168) == 2048) | ((3670016 & i16) == 1048576) | ((i16 & 896) == 256) | ((i16 & 14) == 4) | ((458752 & i16) == 131072) | ((i16 & 57344) == 16384) | ((i23 & 14) == 4) | ((29360128 & i16) == 8388608) | ((234881024 & i16) == 67108864) | ((1879048192 & i16) == 536870912);
        K = oq5Var.K();
        if (e2) {
        }
        f8 = f7;
        function212 = function27;
        o0kVar5 = o0kVar4;
        K = new Function2() { // from class: ovd
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj222, Object obj3) {
                ksk kskVar;
                int i32;
                float f12;
                int i33;
                ksk M;
                float f13;
                float f14;
                ksk kskVar2;
                int L;
                ksk kskVar3;
                ksk kskVar4;
                ffh ffhVar;
                Function2 function2202;
                boolean z6;
                boolean z7;
                ffh ffhVar2;
                Function2 function221;
                x6k x6kVar;
                final dnr dnrVar = (dnr) obj222;
                ga6 ga6Var = (ga6) obj3;
                dnrVar.getClass();
                boolean J = asq.J(configuration22);
                float f15 = J ? 0.8f : 1.25f;
                final int i34 = ga6.i(ga6Var.a);
                if (i34 == Integer.MAX_VALUE) {
                    xq0.x("Failed requirement.");
                    return null;
                }
                int L2 = dnrVar.L(d222 - e322);
                float d3 = o0kVar5.d();
                int b2 = eeh.b((i34 / f15) + dnrVar.L(d3));
                if (b2 <= L2) {
                    L2 = b2;
                }
                float p = dnrVar.p(v7g.z(16)) + f2;
                float f16 = 52;
                float f17 = f16 + d3;
                float f18 = 16;
                final float f19 = 8;
                float p2 = dnrVar.p(D22);
                float f20 = 2;
                long i35 = ia6.i(ia6.b(i34, 0, 13), -dnrVar.L(f8 * f20), 0);
                Function2 function222 = function211;
                ksk M2 = function222 != null ? ((ffh) CollectionsKt.k0(dnrVar.i(pxq.e, function222))).M(i35) : null;
                float c0 = M2 != null ? dnrVar.c0(M2.b) : 12;
                float c02 = ((dnrVar.c0(L2) - p) - f17) - f18;
                float f21 = c02 - ((p2 + f19) + c0);
                float c03 = dnrVar.c0(i34) - (f16 * f20);
                float f22 = 96;
                boolean z8 = (Float.compare(c03, f22) >= 0) && ((Float.compare(f21, f22) >= 0) || J);
                hab habVar5 = habVar3;
                if (habVar5 == null || (x6kVar = habVar5.b) == null) {
                    kskVar = M2;
                } else {
                    kskVar = M2;
                    x6kVar.setValue(Boolean.valueOf(z8));
                }
                ffh ffhVar3 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.c, new wn5(new wl3(wn5Var, z8, 1), -830237976, true)));
                if (z8) {
                    i32 = 0;
                    f12 = 0;
                    M = ffhVar3.M(ga6.b(i35, 0, 0, 0, 0, 15));
                    i33 = 13;
                } else {
                    i32 = 0;
                    f12 = 4;
                    i33 = 13;
                    M = ffhVar3.M(ia6.i(ia6.b(i34, 0, 13), dnrVar.L(-200), 0));
                }
                long b3 = ia6.b(i34, i32, i33);
                Function2 function223 = function212;
                if (function223 != null) {
                    f13 = f12;
                    f14 = f17;
                    kskVar2 = ((ffh) CollectionsKt.k0(dnrVar.i(pxq.d, new wn5(new im0(function223, 9), 552205411, true)))).M(b3);
                } else {
                    f13 = f12;
                    f14 = f17;
                    kskVar2 = null;
                }
                final ksk kskVar5 = z8 ? kskVar2 : null;
                float c04 = dnrVar.c0(M.b) + f19 + f13 + c0;
                float f23 = ((cma) yhn.a(new cma(c02 - c04), new cma(f22))).a;
                float f24 = f23 > c03 ? c03 : f23;
                float f25 = 320;
                if (f24 > f25) {
                    f24 = f25;
                }
                if (z8) {
                    L = dnrVar.L(f24 + f14 + f18);
                } else {
                    int Y = M.Y(j40.b);
                    if (Y == Integer.MIN_VALUE) {
                        Y = M.b;
                    }
                    L = dnrVar.L((d3 + f18) + 24) - Y;
                }
                final int i36 = L;
                final int L3 = dnrVar.L(p) + dnrVar.L(c04) + i36;
                final boolean z9 = z2;
                if (!z8 || (function221 = function21922) == null) {
                    kskVar3 = null;
                } else {
                    ffh ffhVar4 = (ffh) CollectionsKt.k0(dnrVar.i(pxq.a, function221));
                    if (z9) {
                        if (!((i34 >= 0) & (L3 >= 0))) {
                            ume.a("width and height must be >= 0");
                        }
                        kskVar3 = ffhVar4.M(ia6.h(i34, i34, L3, L3));
                    } else {
                        int L4 = dnrVar.L(f24);
                        int L5 = dnrVar.L(f24);
                        if (!((L4 >= 0) & (L5 >= 0))) {
                            ume.a("width and height must be >= 0");
                        }
                        kskVar3 = ffhVar4.M(ia6.h(L4, L4, L5, L5));
                    }
                }
                if (z8 && (function2202 = function210) != null) {
                    List i37 = dnrVar.i(pxq.b, function2202);
                    int size = i37.size();
                    if (size != 0) {
                        z7 = true;
                        if (size != 1) {
                            xq0.x("List has more than one element.");
                            return null;
                        }
                        z6 = false;
                        ffhVar2 = (ffh) i37.get(0);
                    } else {
                        z6 = false;
                        z7 = true;
                        ffhVar2 = null;
                    }
                    if (ffhVar2 != null) {
                        boolean z10 = i34 >= 0 ? z7 : z6;
                        if (L3 < 0) {
                            z7 = z6;
                        }
                        if (!(z10 & z7)) {
                            ume.a("width and height must be >= 0");
                        }
                        kskVar4 = ffhVar2.M(ia6.h(i34, i34, L3, L3));
                        Function2 function2242222 = function29;
                        ksk M3 = (function2242222 != null || (ffhVar = (ffh) CollectionsKt.k0(dnrVar.i(pxq.f, function2242222))) == null) ? null : ffhVar.M(ia6.b(i34, dnrVar.L(p), 5));
                        final ksk kskVar62222 = M;
                        final ksk kskVar72222 = kskVar3;
                        final ksk kskVar82222 = kskVar4;
                        final Function0 function062222 = function03;
                        final float f262222 = f6;
                        final float f272222 = f14;
                        final ksk kskVar92222 = M3;
                        final float f282222 = f13;
                        final ksk kskVar102222 = kskVar;
                        return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                gz2 gz2Var = b2c.o;
                                jsk jskVar = (jsk) obj4;
                                jskVar.getClass();
                                int intValue = ((Number) Function0.this.invoke()).intValue();
                                ksk kskVar11 = kskVar72222;
                                int i38 = i34;
                                dnr dnrVar2 = dnrVar;
                                if (kskVar11 != null) {
                                    jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f272222)) + intValue, 0.0f);
                                }
                                ksk kskVar12 = kskVar82222;
                                if (kskVar12 != null) {
                                    jskVar.d(kskVar12, 0, 0, 0.0f);
                                }
                                ksk kskVar13 = kskVar5;
                                int i39 = i36;
                                if (kskVar13 != null) {
                                    jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                                }
                                ksk kskVar14 = kskVar62222;
                                jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f262222) + i39, 0.0f);
                                ksk kskVar15 = kskVar102222;
                                if (kskVar15 != null) {
                                    jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f282222) + i39 + kskVar14.b, 0.0f);
                                }
                                ksk kskVar16 = kskVar92222;
                                if (kskVar16 != null) {
                                    jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                                }
                                return Unit.a;
                            }
                        });
                    }
                }
                kskVar4 = null;
                Function2 function22422222 = function29;
                if (function22422222 != null) {
                }
                final ksk kskVar622222 = M;
                final ksk kskVar722222 = kskVar3;
                final ksk kskVar822222 = kskVar4;
                final Function0 function0622222 = function03;
                final float f2622222 = f6;
                final float f2722222 = f14;
                final ksk kskVar922222 = M3;
                final float f2822222 = f13;
                final ksk kskVar1022222 = kskVar;
                return mfh.m0(dnrVar, i34, L3, new Function1() { // from class: qvd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        gz2 gz2Var = b2c.o;
                        jsk jskVar = (jsk) obj4;
                        jskVar.getClass();
                        int intValue = ((Number) Function0.this.invoke()).intValue();
                        ksk kskVar11 = kskVar722222;
                        int i38 = i34;
                        dnr dnrVar2 = dnrVar;
                        if (kskVar11 != null) {
                            jskVar.d(kskVar11, gz2Var.a(kskVar11.a, i38, dnrVar2.getLayoutDirection()), (z9 ? 0 : dnrVar2.L(f2722222)) + intValue, 0.0f);
                        }
                        ksk kskVar12 = kskVar822222;
                        if (kskVar12 != null) {
                            jskVar.d(kskVar12, 0, 0, 0.0f);
                        }
                        ksk kskVar13 = kskVar5;
                        int i39 = i36;
                        if (kskVar13 != null) {
                            jskVar.d(kskVar13, gz2Var.a(kskVar13.a, i38, dnrVar2.getLayoutDirection()), (i39 - kskVar13.b) - dnrVar2.L(8), 0.0f);
                        }
                        ksk kskVar14 = kskVar622222;
                        jskVar.d(kskVar14, gz2Var.a(kskVar14.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f2622222) + i39, 0.0f);
                        ksk kskVar15 = kskVar1022222;
                        if (kskVar15 != null) {
                            jskVar.d(kskVar15, gz2Var.a(kskVar15.a, i38, dnrVar2.getLayoutDirection()), dnrVar2.L(f19 + f2822222) + i39 + kskVar14.b, 0.0f);
                        }
                        ksk kskVar16 = kskVar922222;
                        if (kskVar16 != null) {
                            jskVar.d(kskVar16, gz2Var.a(kskVar16.a, i38, dnrVar2.getLayoutDirection()), L3 - dnrVar2.L(108), 0.0f);
                        }
                        return Unit.a;
                    }
                });
            }
        };
        oq5Var.k0(K);
        u2x.p(yciVar3, (Function2) K, oq5Var, (i16 >> 3) & 14, 0);
        o0kVar6 = o0kVar5;
        f9 = f8;
        function213 = function212;
        function214 = function21922;
        z4 = z2;
        function215 = function210;
        function216 = function29;
        habVar4 = habVar3;
        function04 = function03;
        f10 = f6;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void T(iic iicVar, yci yciVar, tsf tsfVar, o0k o0kVar, ox0 ox0Var, mx0 mx0Var, jic jicVar, boolean z, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        jic jicVar2;
        int i4;
        jic jicVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1485410512);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(iicVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(tsfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 2048 : 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= oq5Var2.f(ox0Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i5 |= oq5Var2.f(mx0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i5 |= oq5Var2.g(z) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= oq5Var2.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if (oq5Var2.P(i5 & 1, (306783379 & i5) != 306783378)) {
            oq5Var2.U();
            if ((i2 & 1) == 0 || oq5Var2.y()) {
                uf7 a2 = m8r.a(oq5Var2);
                boolean f2 = oq5Var2.f(a2);
                Object K = oq5Var2.K();
                if (f2 || K == gq5.a) {
                    K = new om7(a2);
                    oq5Var2.k0(K);
                }
                i4 = i5 & (-29360129);
                jicVar3 = (om7) K;
            } else {
                oq5Var2.S();
                i4 = i5 & (-29360129);
                jicVar3 = jicVar;
            }
            oq5Var2.q();
            oq5Var = oq5Var2;
            U(iicVar, yciVar, tsfVar, o0kVar, ox0Var, mx0Var, jicVar3, z, lzj.a(oq5Var2), function1, oq5Var, i4 & 268435454, (i4 >> 27) & 14, 0);
            jicVar2 = jicVar3;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            jicVar2 = jicVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zrf(iicVar, yciVar, tsfVar, o0kVar, ox0Var, mx0Var, jicVar2, z, function1, i2);
        }
    }

    public static final void U(lpd lpdVar, yci yciVar, tsf tsfVar, o0k o0kVar, ox0 ox0Var, mx0 mx0Var, jic jicVar, boolean z, qg0 qg0Var, Function1 function1, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        yci yciVar2;
        o0k o0kVar2;
        ox0 ox0Var2;
        jic jicVar2;
        boolean z2;
        qg0 qg0Var2;
        int i6;
        qg0 qg0Var3;
        boolean z3;
        jic jicVar3;
        qg0 a2;
        boolean z4;
        Object K;
        int i7;
        int i8;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2072102870);
        if ((i2 & 6) == 0) {
            i5 = (oq5Var.f(lpdVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 32 : 16;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 384) == 0) {
            i5 |= oq5Var.f(tsfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            o0kVar2 = o0kVar;
            i5 |= oq5Var.f(o0kVar2) ? 2048 : 1024;
        } else {
            o0kVar2 = o0kVar;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i5 |= oq5Var.g(false) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 196608) == 0) {
            ox0Var2 = ox0Var;
            i5 |= oq5Var.f(ox0Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            ox0Var2 = ox0Var;
        }
        if ((1572864 & i2) == 0) {
            i5 |= oq5Var.f(mx0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            if ((i4 & 128) == 0) {
                jicVar2 = jicVar;
                if (oq5Var.f(jicVar2)) {
                    i8 = 8388608;
                    i5 |= i8;
                }
            } else {
                jicVar2 = jicVar;
            }
            i8 = RemoteCameraConfig.Camera.BITRATE;
            i5 |= i8;
        } else {
            jicVar2 = jicVar;
        }
        int i9 = i4 & 256;
        if (i9 != 0) {
            i5 |= 100663296;
            z2 = z;
        } else {
            z2 = z;
            if ((i2 & 100663296) == 0) {
                i5 |= oq5Var.g(z2) ? 67108864 : 33554432;
            }
        }
        if ((i2 & 805306368) == 0) {
            if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                qg0Var2 = qg0Var;
                if (oq5Var.f(qg0Var2)) {
                    i7 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                    i5 |= i7;
                }
            } else {
                qg0Var2 = qg0Var;
            }
            i7 = 268435456;
            i5 |= i7;
        } else {
            qg0Var2 = qg0Var;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (oq5Var.h(function1) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if (oq5Var.P(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            oq5Var.U();
            int i10 = i2 & 1;
            Object obj = gq5.a;
            if (i10 == 0 || oq5Var.y()) {
                if ((i4 & 128) != 0) {
                    uf7 a3 = m8r.a(oq5Var);
                    boolean f2 = oq5Var.f(a3);
                    int i11 = i5;
                    Object K2 = oq5Var.K();
                    if (f2 || K2 == obj) {
                        K2 = new om7(a3);
                        oq5Var.k0(K2);
                    }
                    om7 om7Var = (om7) K2;
                    i5 = i11 & (-29360129);
                    jicVar2 = om7Var;
                }
                if (i9 != 0) {
                    z2 = true;
                }
                if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                    i5 &= -1879048193;
                    a2 = lzj.a(oq5Var);
                    boolean z5 = z2;
                    oq5Var.q();
                    int i12 = (i5 & 14) | ((i5 >> 15) & 112);
                    z4 = ((((i12 & 14) ^ 6) <= 4 && oq5Var.f(lpdVar)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) <= 32 && oq5Var.f(mx0Var)) || (i12 & 48) == 32);
                    K = oq5Var.K();
                    if (!z4 || K == obj) {
                        K = new jqd(new s30(29, lpdVar, mx0Var));
                        oq5Var.k0(K);
                    }
                    int i13 = i5 >> 3;
                    jic jicVar4 = jicVar2;
                    bkp.V(yciVar2, tsfVar, (jqd) K, o0kVar2, jicVar4, z5, a2, ox0Var2, mx0Var, function1, oq5Var, (i13 & 234881024) | (i13 & 14) | 196608 | (i13 & 112) | (i5 & 7168) | (57344 & i5) | (3670016 & i13) | (29360128 & i13) | ((i5 << 12) & 1879048192), ((i5 >> 18) & 14) | ((i6 << 3) & 112));
                    qg0Var3 = a2;
                    z3 = z5;
                    jicVar3 = jicVar4;
                }
            } else {
                oq5Var.S();
                if ((i4 & 128) != 0) {
                    i5 &= -29360129;
                }
                if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                    i5 &= -1879048193;
                }
            }
            a2 = qg0Var2;
            boolean z52 = z2;
            oq5Var.q();
            int i122 = (i5 & 14) | ((i5 >> 15) & 112);
            z4 = ((((i122 & 14) ^ 6) <= 4 && oq5Var.f(lpdVar)) || (i122 & 6) == 4) | ((((i122 & 112) ^ 48) <= 32 && oq5Var.f(mx0Var)) || (i122 & 48) == 32);
            K = oq5Var.K();
            if (!z4) {
            }
            K = new jqd(new s30(29, lpdVar, mx0Var));
            oq5Var.k0(K);
            int i132 = i5 >> 3;
            jic jicVar42 = jicVar2;
            bkp.V(yciVar2, tsfVar, (jqd) K, o0kVar2, jicVar42, z52, a2, ox0Var2, mx0Var, function1, oq5Var, (i132 & 234881024) | (i132 & 14) | 196608 | (i132 & 112) | (i5 & 7168) | (57344 & i5) | (3670016 & i132) | (29360128 & i132) | ((i5 << 12) & 1879048192), ((i5 >> 18) & 14) | ((i6 << 3) & 112));
            qg0Var3 = a2;
            z3 = z52;
            jicVar3 = jicVar42;
        } else {
            oq5Var.S();
            qg0Var3 = qg0Var2;
            z3 = z2;
            jicVar3 = jicVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yrf(lpdVar, yciVar, tsfVar, o0kVar, ox0Var, mx0Var, jicVar3, z3, qg0Var3, function1, i2, i3, i4);
        }
    }

    public static final ArrayList V(int i2, int i3, int i4) {
        int i5 = i2 - ((i3 - 1) * i4);
        int i6 = i5 / i3;
        int i7 = i5 % i3;
        ArrayList arrayList = new ArrayList(i3);
        int i8 = 0;
        while (i8 < i3) {
            arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
            i8++;
        }
        return arrayList;
    }

    public static final String W(Object obj, String str) {
        return k5r.l("AudioEffects:", System.identityHashCode(obj), str, StringUtils.PROCESS_POSTFIX_DELIMITER);
    }

    public static final void X(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static zvd Y(zvd zvdVar, zvd zvdVar2) {
        pv9 pv9Var = new pv9(9);
        int size = zvdVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String g2 = zvdVar.g(i2);
            String q = zvdVar.q(i2);
            if ((!"Warning".equalsIgnoreCase(g2) || !c.v(q, "1", false)) && ("Content-Length".equalsIgnoreCase(g2) || "Content-Encoding".equalsIgnoreCase(g2) || HttpMessage.CONTENT_TYPE_HEADER.equalsIgnoreCase(g2) || !m0(g2) || zvdVar2.a(g2) == null)) {
                pv9Var.n(g2, q);
            }
        }
        int size2 = zvdVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            String g3 = zvdVar2.g(i3);
            if (!"Content-Length".equalsIgnoreCase(g3) && !"Content-Encoding".equalsIgnoreCase(g3) && !HttpMessage.CONTENT_TYPE_HEADER.equalsIgnoreCase(g3) && m0(g3)) {
                pv9Var.n(g3, zvdVar2.q(i3));
            }
        }
        return pv9Var.r();
    }

    public static vm0 Z(vm0 vm0Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) vm0Var.b.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((ym0) vm0Var.c).a;
        }
        return new vm0(vm0Var.a, Float.valueOf(f2), new ym0(f3), vm0Var.d, vm0Var.e, vm0Var.f);
    }

    public static final Bitmap a0(Bitmap bitmap, int i2) {
        int height;
        int i3;
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (bitmap.getWidth() > bitmap.getHeight()) {
            i3 = (bitmap.getWidth() - bitmap.getHeight()) / 2;
            height = 0;
        } else {
            height = (bitmap.getHeight() - bitmap.getWidth()) / 2;
            i3 = 0;
        }
        Matrix matrix = new Matrix();
        int min2 = Math.min(min, 2000);
        if (min != min2) {
            float f2 = min2;
            float f3 = f2 / min;
            float f4 = f2 / 2.0f;
            matrix.setScale(f3, f3, f4, f4);
        }
        matrix.postRotate(i2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i3, height, min, min, matrix, true);
        createBitmap.getClass();
        return createBitmap;
    }

    public static final File b0(Context context, int i2, eo6 eo6Var, Function0 function0) {
        try {
            int i3 = SharedFileProvider.g;
            File F = c9g.F(context, null);
            if (F == null) {
                throw new IOException("Can't create temporary file");
            }
            try {
                InputStream inputStream = (InputStream) function0.invoke();
                if (inputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(F);
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                            if (decodeStream == null) {
                                throw new IOException("Can't decode bitmap");
                            }
                            a0(decodeStream, i2).compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                            fileOutputStream.close();
                            inputStream.close();
                        } finally {
                        }
                    } finally {
                    }
                }
                if (eo6Var != null) {
                    try {
                        eo6Var.invoke();
                    } catch (IOException unused) {
                    }
                }
                return F;
            } catch (IOException e2) {
                F.delete();
                throw e2;
            }
        } catch (Throwable th) {
            if (eo6Var != null) {
                try {
                    eo6Var.invoke();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static final File c0(Context context, Uri uri) {
        uri.getClass();
        int i2 = 0;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    int k0 = k0(new ExifInterface(openInputStream));
                    openInputStream.close();
                    i2 = k0;
                } finally {
                }
            }
        } catch (IllegalArgumentException e2) {
            Assertions.throwOrSkip("CoverProcessingUtils", new FailedAssertionException("Can't read file data", e2));
        } catch (SecurityException e3) {
            Assertions.throwOrSkip("CoverProcessingUtils", new FailedAssertionException("No read permission", e3));
        }
        return b0(context, i2, null, new aw5(9, context, uri));
    }

    public static final Double e0(wx9 wx9Var, xzb xzbVar) {
        if (wx9Var instanceof sx9) {
            return Double.valueOf(((Number) ((sx9) wx9Var).b.a.a(xzbVar)).longValue());
        }
        if (wx9Var instanceof tx9) {
            return (Double) ((tx9) wx9Var).b.a.a(xzbVar);
        }
        return null;
    }

    public static final void f0(x3f x3fVar, que queVar, t9f t9fVar, Object obj) {
        t9fVar.getClass();
        new xjr(new bz2((Object) queVar, 7, false), x3fVar, j6w.c, new b5f[j6w.h.f()]).v(t9fVar, obj);
    }

    public static hs5 g0(String str) {
        List split$default;
        Object obj;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
        if (split$default.size() == 2 && !StringsKt.U((CharSequence) split$default.get(0)) && !StringsKt.U((CharSequence) split$default.get(1))) {
            aaw aawVar = gs5.b;
            String str2 = (String) split$default.get(0);
            aawVar.getClass();
            str2.getClass();
            Iterator it = gs5.i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((gs5) obj).a.equals(str2)) {
                    break;
                }
            }
            gs5 gs5Var = (gs5) obj;
            if (gs5Var != null) {
                return new hs5(gs5Var, (String) split$default.get(1));
            }
        }
        return null;
    }

    public static final gs4 i0(dzf dzfVar) {
        nyf lifecycle = dzfVar.getLifecycle();
        jfu viewModelStore = ((kfu) dzfVar).getViewModelStore();
        uoo savedStateRegistry = ((woo) dzfVar).getSavedStateRegistry();
        fnb g2 = ((lnb) dzfVar).g();
        kxi d2 = ((lxi) dzfVar).d();
        lifecycle.getClass();
        viewModelStore.getClass();
        savedStateRegistry.getClass();
        g2.getClass();
        d2.getClass();
        gs4 gs4Var = new gs4();
        gs4Var.a = lifecycle;
        gs4Var.b = viewModelStore;
        gs4Var.c = g2;
        gs4Var.d = d2;
        viewModelStore.getClass();
        gs4Var.e = new xiu(viewModelStore);
        return gs4Var;
    }

    public static final int k0(ExifInterface exifInterface) {
        int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
        if (attributeInt != 1) {
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt == 8) {
                return 270;
            }
        }
        return 0;
    }

    public static Intent l0(Context context, ixc ixcVar, boolean z) {
        Intent putExtra = new Intent(context, (Class<?>) FullInfoActivity.class).putExtra("extra.info", ixcVar).putExtra("extra.has_shared_element_transition", z);
        putExtra.getClass();
        return putExtra;
    }

    public static boolean m0(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final void n0(gc8 gc8Var, Throwable th) {
        gc8Var.getViewComponent$div_release().i().a(gc8Var.getDivData(), gc8Var.getDataTag()).e(th);
    }

    public static final egc o0(egc egcVar, mwk mwkVar) {
        egcVar.getClass();
        mwkVar.getClass();
        int size = egcVar.getElements().size();
        return q0(egcVar, t75.c(mwkVar), size, size);
    }

    public static final bg5 p0(t71 t71Var, mqs mqsVar, int i2, ArrayList arrayList, kf1 kf1Var, oq5 oq5Var) {
        t71Var.getClass();
        mqsVar.getClass();
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        Object K = oq5Var.K();
        if (K == gq5.a) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        return t71Var.g(mqsVar, i2, arrayList, kf1Var, context, (mm6) K);
    }

    public static final egc q0(egc egcVar, List list, int i2, int i3) {
        egcVar.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return egcVar;
        }
        int i4 = 0;
        if (!(egcVar instanceof xeq)) {
            if (!(egcVar instanceof km7)) {
                if (!egcVar.equals(y4b.a)) {
                    b6e.s();
                    return null;
                }
                if (i2 == 0) {
                    return new km7(list);
                }
                rj7.g(dfi.c(i2, "originalPosition = ", " is not equals to 0 while queue is emptyCan't add elements to not existing positions."));
                return null;
            }
            List list2 = ((km7) egcVar).a;
            int size = list2.size();
            if (i2 < 0 || i2 > size) {
                rj7.g(dfi.f("originalPosition = ", i2, list2.size(), " is out of fixed queue bounds (size = ", "). Can't add elements to not existing positions."));
                return null;
            }
            int size2 = list.size() + list2.size();
            int size3 = list.size();
            ArrayList arrayList = new ArrayList(size2);
            while (i4 < size2) {
                arrayList.add((mwk) (i4 < i2 ? list2.get(i4) : i4 < i2 + size3 ? list.get(i4 - i2) : list2.get(i4 - list.size())));
                i4++;
            }
            return new km7(arrayList);
        }
        xeq xeqVar = (xeq) egcVar;
        List list3 = xeqVar.b;
        List list4 = xeqVar.a;
        int size4 = list4.size();
        if (i2 >= 0 && i2 <= size4) {
            int size5 = list4.size();
            if (i3 >= 0 && i3 <= size5) {
                int size6 = list.size();
                int size7 = list4.size() + size6;
                ArrayList arrayList2 = new ArrayList(size7);
                int i5 = 0;
                while (i5 < size7) {
                    arrayList2.add((mwk) (i5 < i2 ? list4.get(i5) : i5 < i2 + size6 ? list.get(i5 - i2) : list4.get(i5 - list.size())));
                    i5++;
                }
                int[] iArr = new int[size7];
                for (int i6 = 0; i6 < i3; i6++) {
                    iArr[i6] = ((Number) list3.get(i6)).intValue() < i2 ? ((Number) list3.get(i6)).intValue() : ((Number) list3.get(i6)).intValue() + size6;
                }
                while (i4 < size6) {
                    iArr[i3 + i4] = i2 + i4;
                    i4++;
                }
                int i7 = size7 - size6;
                while (i3 < i7) {
                    iArr[i3 + size6] = ((Number) list3.get(i3)).intValue() < i2 ? ((Number) list3.get(i3)).intValue() : ((Number) list3.get(i3)).intValue() + size6;
                    i3++;
                }
                return new xeq(arrayList2, new tz0(1, iArr));
            }
        }
        rj7.g(f1d.i(dfi.l("originalPosition = ", i2, i3, " or queuePosition = ", " or both are out of fixed queue bounds (size = "), list4.size(), "). Can't add elements to not existing positions."));
        return null;
    }

    @Override // defpackage.eg7
    public String A() {
        d0();
        throw null;
    }

    @Override // defpackage.eg7
    public int B(mhp mhpVar) {
        mhpVar.getClass();
        d0();
        throw null;
    }

    @Override // defpackage.eg7
    public boolean C() {
        return true;
    }

    @Override // defpackage.tq5
    public boolean D(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return t();
    }

    @Override // defpackage.eg7
    public abstract byte E();

    @Override // defpackage.tq5
    public double F(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return r();
    }

    @Override // defpackage.tq5
    public char G(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return u();
    }

    @Override // defpackage.tq5
    public short H(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return o();
    }

    @Override // defpackage.tq5
    public void b(mhp mhpVar) {
        mhpVar.getClass();
    }

    @Override // defpackage.eg7
    public tq5 c(mhp mhpVar) {
        mhpVar.getClass();
        return this;
    }

    public void d0() {
        throw new zhp(ern.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.eg7
    public Object e(t9f t9fVar) {
        t9fVar.getClass();
        return t9fVar.deserialize(this);
    }

    @Override // defpackage.tq5
    public String g(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return A();
    }

    @Override // defpackage.eg7
    public abstract int h();

    public abstract int h0();

    @Override // defpackage.eg7
    public Void i() {
        return null;
    }

    @Override // defpackage.eg7
    public eg7 j(mhp mhpVar) {
        mhpVar.getClass();
        return this;
    }

    public abstract weo j0();

    @Override // defpackage.tq5
    public int k(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return h();
    }

    @Override // defpackage.eg7
    public abstract long l();

    @Override // defpackage.tq5
    public boolean m() {
        return false;
    }

    @Override // defpackage.tq5
    public Object n(mhp mhpVar, int i2, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        return (t9fVar.getDescriptor().c() || C()) ? e(t9fVar) : i();
    }

    @Override // defpackage.eg7
    public abstract short o();

    @Override // defpackage.eg7
    public float p() {
        d0();
        throw null;
    }

    @Override // defpackage.tq5
    public long q(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return l();
    }

    @Override // defpackage.eg7
    public double r() {
        d0();
        throw null;
    }

    @Override // defpackage.tq5
    public int s(mhp mhpVar) {
        mhpVar.getClass();
        return -1;
    }

    @Override // defpackage.eg7
    public boolean t() {
        d0();
        throw null;
    }

    @Override // defpackage.eg7
    public char u() {
        d0();
        throw null;
    }

    @Override // defpackage.tq5
    public float v(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return p();
    }

    @Override // defpackage.tq5
    public eg7 x(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return j(mhpVar.h(i2));
    }

    @Override // defpackage.tq5
    public byte y(mhp mhpVar, int i2) {
        mhpVar.getClass();
        return E();
    }

    @Override // defpackage.tq5
    public Object z(mhp mhpVar, int i2, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        return e(t9fVar);
    }
}
