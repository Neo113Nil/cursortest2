package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.video.m3.data.StalledReason;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;
import ru.yandex.video.m3.player.impl.tracking.event.LoggingStalledReason;
import ru.yandex.video.m3.preload_manager.DownloadResult;
import ru.yandex.video.m3.preload_manager.QualityInfo;

/* loaded from: classes.dex */
public abstract class men {
    public static final wn5 a = new wn5(new bo5(7), 1697587466, false);
    public static final wn5 b = new wn5(new bo5(8), 1583976971, false);
    public static final wn5 c = new wn5(new jo5(9), -1003053460, false);
    public static final wn5 d = new wn5(new jo5(10), -354460690, false);
    public static final wn5 e = new wn5(new io5(17), -1371209165, false);
    public static final wn5 f = new wn5(new ro5(12), -1686278441, false);
    public static final wn5 g;
    public static final wn5 h;
    public static final int[] i;
    public static final e7o j;

    static {
        new wn5(new ro5(13), -1597130023, false);
        g = new wn5(new rz3(22), 1165239851, false);
        h = new wn5(new dp5(22), 459900345, false);
        new wn5(new dp5(23), -903508702, false);
        i = new int[2];
        j = new e7o(9);
    }

    public static final float A(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        q9s q9sVar = eds.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? pie.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static Intent B(Context context, v35 v35Var) {
        context.getClass();
        v35Var.getClass();
        Intent putExtra = new Intent(context, (Class<?>) CollectionMainActivity.class).putExtra("extra.item", v35Var);
        putExtra.getClass();
        return putExtra;
    }

    public static final DefaultEventData E(DefaultEventData defaultEventData) {
        return defaultEventData == null ? new DefaultEventData(null, 1, null) : defaultEventData;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cp3 F(zvd zvdVar) {
        int i2;
        int i3;
        int i4;
        String str;
        zvd zvdVar2 = zvdVar;
        zvdVar2.getClass();
        int size = zvdVar2.size();
        boolean z = true;
        boolean z2 = true;
        int i5 = 0;
        String str2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i5 < size) {
            String g2 = zvdVar2.g(i5);
            String q = zvdVar2.q(i5);
            if (c.o(g2, "Cache-Control", z)) {
                if (str2 == null) {
                    str2 = q;
                    i2 = 0;
                    while (i2 < q.length()) {
                        int length = q.length();
                        boolean z11 = z;
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = q.length();
                                break;
                            }
                            i3 = size;
                            if (StringsKt.N("=,;", q.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = StringsKt.t0(q.substring(i2, i10)).toString();
                        if (i10 == q.length() || q.charAt(i10) == ',' || q.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = cvt.a;
                            int length2 = q.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = q.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = q.length();
                                    break;
                                }
                            }
                            if (i11 >= q.length() || q.charAt(i11) != '\"') {
                                int length3 = q.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = q.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (StringsKt.N(",;", q.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = StringsKt.t0(q.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int S = StringsKt.S(q, '\"', i15, 4);
                                str = q.substring(i15, S);
                                i4 = S + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z = z11;
                            z3 = z;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z = z11;
                            z4 = z;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = cvt.y(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = cvt.y(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z5 = z;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z6 = z;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z7 = z;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = cvt.y(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = cvt.y(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z8 = z;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z9 = z;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z10 = z;
                            }
                            i2 = i4;
                            z = z11;
                        }
                        size = i3;
                    }
                    i5++;
                    zvdVar2 = zvdVar;
                    z = z;
                    size = size;
                }
            } else if (!c.o(g2, "Pragma", z)) {
                i5++;
                zvdVar2 = zvdVar;
                z = z;
                size = size;
            }
            z2 = false;
            i2 = 0;
            while (i2 < q.length()) {
            }
            i5++;
            zvdVar2 = zvdVar;
            z = z;
            size = size;
        }
        return new cp3(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str2);
    }

    public static final b80 G(nrf nrfVar) {
        nrfVar.getClass();
        return new b80(f1d.g("BLOCK/", nrfVar.b));
    }

    public static final LoggingStalledReason H(StalledReason stalledReason) {
        stalledReason.getClass();
        switch (bib.a[stalledReason.ordinal()]) {
            case 1:
                return LoggingStalledReason.INIT;
            case 2:
                return LoggingStalledReason.SEEK;
            case 3:
                return LoggingStalledReason.VIDEO_TRACK_CHANGE;
            case 4:
                return LoggingStalledReason.SET_SOURCE;
            case 5:
                return LoggingStalledReason.RECOVER;
            case 6:
                return LoggingStalledReason.LIVE_EDGE;
            case 7:
                return LoggingStalledReason.OTHER;
            case 8:
                return LoggingStalledReason.AD_START;
            case 9:
                return LoggingStalledReason.AD_END;
            default:
                b6e.s();
                return null;
        }
    }

    public static final String I(CoverPath coverPath) {
        String str = "";
        if (coverPath == null) {
            return "";
        }
        String uri = coverPath.getUri();
        if (uri == null) {
            uri = "null";
        }
        el6 copyrightInfo = coverPath.getCopyrightInfo();
        if (copyrightInfo != null) {
            String str2 = copyrightInfo.a;
            if (str2 == null) {
                str2 = "null";
            }
            String str3 = copyrightInfo.b;
            str = ouj.o(str2, "<ci>", str3 != null ? str3 : "null");
        }
        return ouj.o(uri, "<info>", str);
    }

    public static final void a(b4 b4Var, hq5 hq5Var, int i2) {
        int i3;
        b4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2014128954);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(b4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            l4 l4Var = (l4) gld.O(b4Var.c, oq5Var).getValue();
            if (Intrinsics.d(l4Var, j4.a)) {
                oq5Var.Z(-2072204506);
                oq5Var.p(false);
            } else {
                if (!(l4Var instanceof k4)) {
                    throw vz1.i(oq5Var, -1452320416, false);
                }
                oq5Var.Z(-2072143839);
                b((k4) l4Var, b4Var, null, oq5Var, (i3 << 3) & 112);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(b4Var, i2, 0);
        }
    }

    public static final void b(k4 k4Var, b4 b4Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        kjn kjnVar;
        vci vciVar;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(521561408);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? oq5Var.f(k4Var) : oq5Var.h(k4Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(b4Var) ? 32 : 16;
        }
        if (((i3 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ynn i4 = irv.i(oq5Var);
            a63 a63Var = k4Var.d;
            boolean h2 = oq5Var.h(b4Var);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h2 || K == kjnVar2) {
                K = new u2(2, b4Var);
                oq5Var.k0(K);
            }
            vci vciVar2 = vci.a;
            yci c2 = a.c(vciVar2, i4, a63Var, (pyc) K, 14);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String str = k4Var.a;
            if (str != null) {
                oq5Var.Z(-1118461292);
                z = false;
                kjnVar = kjnVar2;
                vciVar = vciVar2;
                irf.h(str, null, null, null, null, false, null, false, null, oq5Var, 0, 510);
            } else {
                z = false;
                kjnVar = kjnVar2;
                vciVar = vciVar2;
                oq5Var.Z(-1120610708);
            }
            oq5Var.p(z);
            String str2 = k4Var.b;
            ges j2 = nu0.j();
            boolean h3 = oq5Var.h(b4Var);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                c3 c3Var = new c3(0, b4Var, b4.class, "onExpandClick", "onExpandClick()V", 0, 4);
                oq5Var.k0(c3Var);
                K2 = c3Var;
            }
            vci vciVar3 = vciVar;
            pd.n(str2, 3, j2, (Function0) ((h9f) K2), androidx.compose.foundation.layout.a.o(vciVar3, v0k.b, 0.0f, 2), null, oq5Var, 24624, 96);
            oq5Var.p(true);
            yciVar2 = vciVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(k4Var, b4Var, yciVar2, i2, 1);
        }
    }

    public static final void c(boolean z, Function0 function0, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, hq5 hq5Var, int i2) {
        yci yciVar2;
        vpb vpbVar2;
        String str2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1952481825);
        int i3 = i2 | (oq5Var.g(z) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i3 | 221568;
        if ((599187 & i4) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            vpbVar2 = vpbVar;
            str2 = str;
        } else {
            vpb a2 = androidx.compose.animation.c.f(null, 3).a(androidx.compose.animation.c.g(null, 15));
            int i5 = i4 & 14;
            d8t e2 = i8t.e(Boolean.valueOf(z), "AnimatedVisibility", oq5Var, i5 | 48, 0);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new dcb(25);
                oq5Var.k0(K);
            }
            etn.d(e2, (Function1) K, e9bVar, a2, wn5Var, oq5Var, 224688);
            Object c2 = e2.c();
            boolean f2 = oq5Var.f(e2) | (i5 == 4) | ((i4 & 112) == 32);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new qk(e2, z, function0, (Continuation) null);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, c2, (Function2) K2);
            yciVar2 = vci.a;
            vpbVar2 = a2;
            str2 = "AnimatedVisibility";
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ql0(z, function0, yciVar2, e9bVar, vpbVar2, str2, wn5Var, i2);
        }
    }

    public static final void d(qxp qxpVar, l81 l81Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        qxpVar.getClass();
        l81Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-458141932);
        if (((i2 | (oq5Var.f(qxpVar) ? 4 : 2) | (oq5Var.h(l81Var) ? 32 : 16) | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            d91 d91Var = (d91) gld.O(l81Var.a.o, oq5Var).getValue();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zs0(15);
                oq5Var.k0(K);
            }
            wn5 C = ild.C(-2032986076, new ar(6, qxpVar, l81Var), oq5Var);
            vci vciVar = vci.a;
            ot0.l(d91Var, (Function1) K, vciVar, null, null, false, C, oq5Var, 1573296, 56);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(qxpVar, l81Var, yciVar2, i2, 17);
        }
    }

    public static final void e(qxp qxpVar, c91 c91Var, l81 l81Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1998344579);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(qxpVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(c91Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(l81Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean h2 = oq5Var.h(l81Var) | ((i3 & 112) == 32);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new x61(l81Var, c91Var, 1);
                oq5Var.k0(K);
            }
            o(((i3 >> 9) & 14) | 384, 0, ild.C(-671005089, new xk(6, qxpVar, c91Var, l81Var), oq5Var), oq5Var, yciVar, (Function0) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(qxpVar, c91Var, false, l81Var, yciVar, i2, 7);
        }
    }

    public static final void f(b91 b91Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(818579713);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(b91Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C = ild.C(-523386781, new u2(9, b91Var), oq5Var);
            vci vciVar = vci.a;
            o(((i4 >> 3) & 14) | 384, 2, C, oq5Var, vciVar, null);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(b91Var, yciVar, i2, 5);
        }
    }

    public static zi3 g(int i2, int i3, oi3 oi3Var) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            oi3Var = oi3.a;
        }
        if (i2 == -2) {
            if (oi3Var != oi3.a) {
                return new y46(1, oi3Var);
            }
            lc4.S.getClass();
            return new zi3(hc4.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? oi3Var == oi3.a ? new zi3(i2) : new y46(i2, oi3Var) : new zi3(Integer.MAX_VALUE) : oi3Var == oi3.a ? new zi3(0) : new y46(1, oi3Var);
        }
        if (oi3Var == oi3.a) {
            return new y46(1, oi3.b);
        }
        xq0.x("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void h(int i2, int i3, int i4, hq5 hq5Var, yci yciVar) {
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1339628753);
        int i6 = (oq5Var.d(i2) ? 4 : 2) | i3;
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 = i6 | 48;
        } else {
            i5 = i6 | (oq5Var.f(yciVar) ? 32 : 16);
        }
        if ((i5 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i7 != 0) {
                yciVar = vci.a;
            }
            j(yciVar, ild.C(-27600218, new mz3(i2, 3), oq5Var), oq5Var, ((i5 >> 3) & 14) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl4(i2, yciVar, i3, i4);
        }
    }

    public static final void i(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-170094701);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            j(vciVar, ild.C(-1268331234, new sm(18, z), oq5Var), oq5Var, ((i4 >> 3) & 14) | 48);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i2, 10);
        }
    }

    public static final void j(yci yciVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(845500469);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci n = androidx.compose.foundation.layout.a.n(yciVar, 16, 4);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, n);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xcs.a(nu0.j(), ild.C(995618220, new y61(wn5Var, 8), oq5Var), oq5Var, 48);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ce3(yciVar, wn5Var, i2, 1);
        }
    }

    public static final void k(th7 th7Var, hq5 hq5Var, int i2) {
        th7 th7Var2;
        oq5 oq5Var;
        th7 th7Var3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-650689570);
        int i3 = (oq5Var2.h(th7Var) ? 4 : 2) | i2;
        if (oq5Var2.P(i3 & 1, (i3 & 3) != 2)) {
            ci7 ci7Var = (ci7) szf.Q(th7Var.c, oq5Var2).getValue();
            if (Intrinsics.d(ci7Var, ai7.a)) {
                oq5Var2.Z(1752555540);
                p(0, oq5Var2);
                oq5Var2.p(false);
            } else if (ci7Var instanceof bi7) {
                oq5Var2.Z(1752558178);
                oq5Var2.p(false);
                bve bveVar = ((bi7) ci7Var).a;
                di7 di7Var = th7Var.b;
                x97.y(ot0.F(di7Var), null, null, new j57(new mg1(bveVar), di7Var, bveVar, (Continuation) null, 4), 3);
            } else {
                boolean d2 = Intrinsics.d(ci7Var, zh7.b);
                kjn kjnVar = gq5.a;
                if (d2) {
                    oq5Var2.Z(-1505172221);
                    boolean h2 = oq5Var2.h(th7Var);
                    Object K = oq5Var2.K();
                    if (h2 || K == kjnVar) {
                        ej6 ej6Var = new ej6(0, th7Var, th7.class, "onBackClicked", "onBackClicked()V", 0, 16);
                        oq5Var2.k0(ej6Var);
                        K = ej6Var;
                    }
                    h9f h9fVar = (h9f) K;
                    boolean h3 = oq5Var2.h(th7Var);
                    Object K2 = oq5Var2.K();
                    if (h3 || K2 == kjnVar) {
                        ej6 ej6Var2 = new ej6(0, th7Var, th7.class, "onRefresh", "onRefresh()V", 0, 17);
                        th7Var2 = th7Var;
                        oq5Var2.k0(ej6Var2);
                        K2 = ej6Var2;
                    } else {
                        th7Var2 = th7Var;
                    }
                    oq5Var = oq5Var2;
                    qwp.q((Function0) ((h9f) K2), (Function0) h9fVar, null, oq5Var, 0, 4);
                    oq5Var2.p(false);
                } else {
                    if (!Intrinsics.d(ci7Var, zh7.a)) {
                        throw vz1.i(oq5Var2, 1752552140, false);
                    }
                    oq5Var2.Z(-1504990685);
                    boolean h4 = oq5Var2.h(th7Var);
                    Object K3 = oq5Var2.K();
                    if (h4 || K3 == kjnVar) {
                        th7Var3 = th7Var;
                        ej6 ej6Var3 = new ej6(0, th7Var3, th7.class, "onBackClicked", "onBackClicked()V", 0, 18);
                        oq5Var2.k0(ej6Var3);
                        K3 = ej6Var3;
                    } else {
                        th7Var3 = th7Var;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    boolean h5 = oq5Var2.h(th7Var3);
                    Object K4 = oq5Var2.K();
                    if (h5 || K4 == kjnVar) {
                        ej6 ej6Var4 = new ej6(0, th7Var3, th7.class, "onRefresh", "onRefresh()V", 0, 19);
                        th7Var2 = th7Var3;
                        oq5Var2.k0(ej6Var4);
                        K4 = ej6Var4;
                    } else {
                        th7Var2 = th7Var3;
                    }
                    oq5Var = oq5Var2;
                    qwp.q((Function0) ((h9f) K4), (Function0) h9fVar2, null, oq5Var, 0, 4);
                    oq5Var.p(false);
                }
            }
            th7Var2 = th7Var;
            oq5Var = oq5Var2;
        } else {
            th7Var2 = th7Var;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh7(th7Var2, i2);
        }
    }

    public static DownloadResult l(String str, String str2, long j2, QualityInfo qualityInfo, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        qualityInfo.getClass();
        return new DownloadResult(str, str2, j2, qualityInfo, z, z2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(String str, dib dibVar, qo6 qo6Var, boolean z, Function0 function0, yci yciVar, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        boolean h2;
        Object K;
        kjn kjnVar;
        Object K2;
        Object K3;
        oq5 oq5Var;
        xmn r;
        str.getClass();
        dibVar.getClass();
        qo6Var.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-330385761);
        int i4 = (oq5Var2.f(str) ? 4 : 2) | i2 | (oq5Var2.h(dibVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.d(qo6Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        int i5 = i4 | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID);
        int i6 = i3 & 32;
        if (i6 != 0) {
            i5 |= 196608;
        } else if ((196608 & i2) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var2.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((i5 & 74899) == 74898 || !oq5Var2.z()) {
                vci vciVar = vci.a;
                if (i6 != 0) {
                    yciVar2 = vciVar;
                }
                hs1 J = up6.J(oq5Var2);
                h2 = oq5Var2.h(dibVar) | oq5Var2.f(J);
                K = oq5Var2.K();
                kjnVar = gq5.a;
                if (!h2 || K == kjnVar) {
                    K = new ev5(dibVar, J, null, 2);
                    oq5Var2.k0(K);
                }
                gld.w(oq5Var2, dibVar, (Function2) K);
                K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = vz1.h(oq5Var2);
                }
                yci d2 = androidx.compose.foundation.a.d(vciVar, (uoi) K2, null, z, null, null, function0, 24);
                pce pceVar = new pce((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b));
                pceVar.c = str;
                up6.K(pceVar, J);
                rce a2 = pceVar.a();
                iz2 iz2Var = b2c.c;
                yci a3 = androidx.compose.ui.platform.a.a(d.c(yciVar2, 1.0f).f(vciVar), "cover");
                K3 = oq5Var2.K();
                if (K3 == kjnVar) {
                    K3 = new g4d(28);
                    oq5Var2.k0(K3);
                }
                oq5Var = oq5Var2;
                w1g.j(a2, null, nfp.a(a3, (Function1) K3), null, null, iz2Var, hd6.a, 0.0f, null, 0, ild.C(-1272725633, new gab(3, qo6Var, d2), oq5Var2), oq5Var, 1769520, 920);
            } else {
                oq5Var2.S();
                oq5Var = oq5Var2;
            }
            yci yciVar3 = yciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new tp(str, dibVar, qo6Var, z, function0, yciVar3, i2, i3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i5 & 74899) == 74898) {
        }
        vci vciVar2 = vci.a;
        if (i6 != 0) {
        }
        hs1 J2 = up6.J(oq5Var2);
        h2 = oq5Var2.h(dibVar) | oq5Var2.f(J2);
        K = oq5Var2.K();
        kjnVar = gq5.a;
        if (!h2) {
        }
        K = new ev5(dibVar, J2, null, 2);
        oq5Var2.k0(K);
        gld.w(oq5Var2, dibVar, (Function2) K);
        K2 = oq5Var2.K();
        if (K2 == kjnVar) {
        }
        yci d22 = androidx.compose.foundation.a.d(vciVar2, (uoi) K2, null, z, null, null, function0, 24);
        pce pceVar2 = new pce((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b));
        pceVar2.c = str;
        up6.K(pceVar2, J2);
        rce a22 = pceVar2.a();
        iz2 iz2Var2 = b2c.c;
        yci a32 = androidx.compose.ui.platform.a.a(d.c(yciVar2, 1.0f).f(vciVar2), "cover");
        K3 = oq5Var2.K();
        if (K3 == kjnVar) {
        }
        oq5Var = oq5Var2;
        w1g.j(a22, null, nfp.a(a32, (Function1) K3), null, null, iz2Var2, hd6.a, 0.0f, null, 0, ild.C(-1272725633, new gab(3, qo6Var, d22), oq5Var2), oq5Var, 1769520, 920);
        yci yciVar32 = yciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void n(final gvd gvdVar, final qo6 qo6Var, final yci yciVar, hq5 hq5Var, final int i2) {
        oq5 oq5Var;
        jzk jzkVar;
        bs1 bs1Var;
        kb5 kb5Var;
        vci vciVar;
        xr1 xr1Var;
        kb5 kb5Var2;
        int i3;
        kb5 kb5Var3;
        boolean z;
        boolean z2;
        grb grbVar;
        boolean z3;
        boolean z4;
        xmn r;
        Function2 function2;
        jzk jzkVar2 = vnj.i;
        gvdVar.getClass();
        qo6Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-992790875);
        int i4 = i2 | (oq5Var2.f(gvdVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.d(qo6Var.ordinal()) ? 32 : 16;
        }
        int i5 = i4 | (oq5Var2.f(yciVar) ? 256 : 128);
        if ((i5 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                oq5Var2.Z(-1087985902);
                swf.d(qo6Var, gce.b, xp3.u(yciVar, ugo.a(8)), null, 0L, 0L, false, oq5Var2, ((i5 >> 3) & 14) | 48, 120);
                oq5Var2.p(false);
                r = oq5Var2.r();
                if (r != null) {
                    final int i6 = 0;
                    function2 = new Function2() { // from class: evd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    men.n(gvdVar, qo6Var, yciVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                                default:
                                    men.n(gvdVar, qo6Var, yciVar, hq5Var2, rvf.R(i2 | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r.d = function2;
                }
                return;
            }
            oq5Var = oq5Var2;
            oq5Var.Z(-1090896771);
            oq5Var.p(false);
            bs1 d2 = gvdVar.d();
            bs1 c2 = gvdVar.c();
            yci a2 = androidx.compose.ui.platform.a.a(yciVar, "cover");
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new g4d(29);
                oq5Var.k0(K);
            }
            yci D = ksw.D(nfp.b(a2, false, (Function1) K), rvf.M(R.string.cover_description, oq5Var), null);
            kfh d3 = ug3.d(b2c.f, true);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, D);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var4 = wp5.f;
            g0g.U(oq5Var, d3, kb5Var4);
            kb5 kb5Var5 = wp5.e;
            g0g.U(oq5Var, l, kb5Var5);
            kb5 kb5Var6 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var6);
            }
            kb5 kb5Var7 = wp5.d;
            g0g.U(oq5Var, H, kb5Var7);
            boolean z5 = d2 instanceof as1;
            xr1 xr1Var2 = xr1.a;
            bs1 zr1Var = (z5 && (Intrinsics.d(c2, xr1Var2) || (c2 instanceof zr1))) ? new zr1(null) : d2;
            if (c2 instanceof as1) {
                if (Intrinsics.d(d2, xr1Var2) || (d2 instanceof zr1)) {
                    c2 = new zr1(null);
                } else if (d2 instanceof yr1) {
                    c2 = xr1Var2;
                }
            }
            boolean z6 = c2 instanceof as1;
            vci vciVar2 = vci.a;
            if (z6) {
                oq5Var.Z(158405287);
                w4k w4kVar = ((as1) c2).a;
                final float f2 = 64;
                bs1Var = zr1Var;
                yci s = s(androidx.compose.foundation.layout.a.k(androidx.compose.ui.layout.a.b(vciVar2, new pyc() { // from class: fvd
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        mfh mfhVar = (mfh) obj;
                        ffh ffhVar = (ffh) obj2;
                        ga6 ga6Var = (ga6) obj3;
                        mfhVar.getClass();
                        ffhVar.getClass();
                        int L = mfhVar.L(f2);
                        int k = ga6.k(ga6Var.a) + L;
                        long j2 = ga6Var.a;
                        int i8 = ga6.i(j2);
                        if (i8 != Integer.MAX_VALUE) {
                            i8 += L;
                        }
                        int j3 = ga6.j(j2) + L;
                        int h2 = ga6.h(j2);
                        if (h2 != Integer.MAX_VALUE) {
                            h2 += L;
                        }
                        ksk M = ffhVar.M(ga6.a(k, i8, j3, h2));
                        return mfh.m0(mfhVar, M.a, M.b, new zj(M, 2));
                    }
                }), 0.0f, 12, 1), 22, jzkVar2);
                jzkVar = jzkVar2;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var7;
                z2 = true;
                i3 = i5;
                kb5Var = kb5Var5;
                vciVar = vciVar2;
                xr1Var = xr1Var2;
                grbVar = grbVar2;
                irf.r(w4kVar, null, s, null, null, 0.0f, null, oq5Var, 48, 120);
                oq5Var = oq5Var;
                z = false;
            } else {
                jzkVar = jzkVar2;
                bs1Var = zr1Var;
                kb5Var = kb5Var5;
                vciVar = vciVar2;
                xr1Var = xr1Var2;
                kb5Var2 = kb5Var6;
                i3 = i5;
                kb5Var3 = kb5Var7;
                z = false;
                z2 = true;
                grbVar = grbVar2;
                oq5Var.Z(153769795);
            }
            oq5Var.p(z);
            yci u = xp3.u(vciVar, ugo.a(8));
            kfh d4 = ug3.d(b2c.b, z2);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, u);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d4, kb5Var4);
            g0g.U(oq5Var, l2, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var2);
            }
            g0g.U(oq5Var, H2, kb5Var3);
            bs1 bs1Var2 = bs1Var;
            if (bs1Var2 instanceof as1) {
                oq5Var.Z(-839341902);
                oq5 oq5Var3 = oq5Var;
                irf.r(((as1) bs1Var2).a, null, null, null, null, 0.0f, null, oq5Var3, 48, 124);
                oq5Var = oq5Var3;
                oq5Var.p(false);
            } else if (Intrinsics.d(bs1Var2, xr1Var) || (bs1Var2 instanceof zr1)) {
                oq5Var.Z(-839053602);
                if (qo6Var != qo6.d) {
                    oq5Var.Z(-838999383);
                    z3 = false;
                    ug3.a(androidx.compose.foundation.a.b(xv.z(vciVar, d85.d(((dq0) oq5Var.j(eq0.a)).c.c)), d85.f, jzkVar), oq5Var, 0);
                } else {
                    z3 = false;
                    oq5Var.Z(-844473239);
                }
                oq5Var.p(z3);
                oq5Var.p(z3);
            } else {
                if (!(bs1Var2 instanceof yr1)) {
                    throw vz1.i(oq5Var, 1358396474, false);
                }
                oq5Var.Z(-838657143);
                if (qo6Var == qo6.d) {
                    oq5Var.Z(-838508250);
                    gae.b(a0g.E(R.drawable.ic_artist_24, 0, oq5Var), null, androidx.compose.foundation.layout.a.m(d.c(vciVar, 1.0f), 25), ((dq0) oq5Var.j(eq0.a)).c.c, oq5Var, 432, 0);
                    z4 = false;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-838102243);
                    swf.d(qo6Var, gce.b, null, null, 0L, 0L, false, oq5Var, ((i3 >> 3) & 14) | 48, 124);
                    z4 = false;
                    oq5Var.p(false);
                }
                oq5Var.p(z4);
            }
            oq5Var.p(z2);
            oq5Var.p(z2);
        }
        r = oq5Var.r();
        if (r != null) {
            final int i9 = 1;
            function2 = new Function2() { // from class: evd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i9;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            men.n(gvdVar, qo6Var, yciVar, hq5Var2, rvf.R(i2 | 1));
                            break;
                        default:
                            men.n(gvdVar, qo6Var, yciVar, hq5Var2, rvf.R(i2 | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
            r.d = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(int i2, int i3, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i4;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1624727497);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function02 = function0;
            i4 |= oq5Var.h(function02) ? 32 : 16;
            if ((i2 & 384) == 0) {
                i4 |= oq5Var.h(wn5Var) ? 256 : 128;
            }
            if ((i4 & 147) == 146 || !oq5Var.z()) {
                function03 = i5 == 0 ? null : function02;
                if (function03 != null) {
                    oq5Var.Z(-2024379209);
                    Object K = oq5Var.K();
                    if (K == gq5.a) {
                        K = new zb0(25);
                        oq5Var.k0(K);
                    }
                    oq5Var.p(false);
                    function04 = (Function0) K;
                } else {
                    oq5Var.Z(-2004965546);
                    oq5Var.p(false);
                    function04 = function03;
                }
                ltg.i(yciVar, false, d85.m, function04, null, ild.C(1641535823, new y61(wn5Var, 0), oq5Var), oq5Var, (i4 & 14) | 196992, 18);
            } else {
                oq5Var.S();
                function03 = function02;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new z61(yciVar, function03, wn5Var, i2, i3);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i2 & 384) == 0) {
        }
        if ((i4 & 147) == 146) {
        }
        if (i5 == 0) {
        }
        if (function03 != null) {
        }
        ltg.i(yciVar, false, d85.m, function04, null, ild.C(1641535823, new y61(wn5Var, 0), oq5Var), oq5Var, (i4 & 14) | 196992, 18);
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void p(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-837773356);
        if (oq5Var.P(i2 & 1, i2 != 0)) {
            vum.b(d.x(d.c(vci.a, 1.0f), b2c.f, 2), ((dq0) oq5Var.j(eq0.a)).a.a, 0.0f, 0L, 0, oq5Var, 6, 28);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fp5(i2, 19);
        }
    }

    public static final boolean q(AtomicInteger atomicInteger, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i3 == 0) {
            return true;
        }
        if (i3 < -65535 || i3 > 65535 || i2 > 65535) {
            return false;
        }
        do {
            i4 = atomicInteger.get();
            if (i4 == -1) {
                return false;
            }
            if (i4 == 0) {
                i5 = i2;
            } else {
                if ((i4 & 65535) != i2) {
                    return false;
                }
                i5 = i4;
            }
            int i7 = ((i5 >>> 16) & 65535) + i3;
            if (i7 < 0 || i7 > 65535 || (i6 = (i7 << 16) | i2) == -1) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i4, i6));
        return true;
    }

    public static final String r(oq oqVar, o8q o8qVar) {
        oqVar.getClass();
        o8qVar.getClass();
        switch (mw.a[oqVar.d().ordinal()]) {
            case 1:
                int i2 = oqVar.l;
                Integer valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                int intValue = valueOf != null ? valueOf.intValue() : oqVar.F.size();
                if (intValue != 0) {
                    return o8qVar.a.b(R.plurals.plural_n_podcast_tracks, intValue, Arrays.copyOf(new Object[]{Integer.valueOf(intValue)}, 1));
                }
                return "";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return xp3.L(oqVar.n, c5b.a);
            default:
                b6e.s();
                return null;
        }
    }

    public static final yci s(yci yciVar, float f2, jzk jzkVar) {
        boolean z;
        int i2;
        if (jzkVar != null) {
            i2 = 0;
            z = true;
        } else {
            z = false;
            i2 = 3;
        }
        float f3 = 0;
        return ((Float.compare(f2, f3) <= 0 || Float.compare(f2, f3) <= 0) && !z) ? yciVar : androidx.compose.ui.graphics.a.a(yciVar, new d83(f2, f2, i2, jzkVar, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object t(yr5 yr5Var, ozm ozmVar) {
        if (!((xci) yr5Var).a.n) {
            sme.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) bcx.F(yr5Var).B;
        aVar.getClass();
        return weo.L(aVar, ozmVar);
    }

    public static JSONArray u(JSONArray jSONArray, int i2) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            Object opt = jSONArray.opt(i3);
            if (opt instanceof JSONObject) {
                if (i2 != 0) {
                    opt = v((JSONObject) opt, i2 - 1);
                    jSONArray2.put(opt);
                }
                opt = "...";
                jSONArray2.put(opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i2 != 0) {
                        opt = u((JSONArray) opt, i2 - 1);
                    }
                    opt = "...";
                }
                jSONArray2.put(opt);
            }
        }
        return jSONArray2;
    }

    public static JSONObject v(JSONObject jSONObject, int i2) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                if (i2 != 0) {
                    opt = v((JSONObject) opt, i2 - 1);
                    jSONObject2.put(next, opt);
                }
                opt = "...";
                jSONObject2.put(next, opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i2 != 0) {
                        opt = u((JSONArray) opt, i2 - 1);
                    }
                    opt = "...";
                }
                jSONObject2.put(next, opt);
            }
        }
        return jSONObject2;
    }

    public static final o w(y yVar, xlu xluVar) {
        for (o oVar : yVar.c.f()) {
            if (oVar != null && oVar.isAdded()) {
                if (((Boolean) xluVar.invoke(oVar)).booleanValue()) {
                    return oVar;
                }
                y childFragmentManager = oVar.getChildFragmentManager();
                childFragmentManager.getClass();
                o w = w(childFragmentManager, xluVar);
                if (w != null) {
                    return w;
                }
            }
        }
        return null;
    }

    public static final CoverPath x(String str, WebPath$Storage webPath$Storage) {
        webPath$Storage.getClass();
        if (str == null || str.length() == 0) {
            CoverPath none = CoverPath.none();
            none.getClass();
            return none;
        }
        List g2 = new Regex("<info>").g(0, str);
        el6 el6Var = null;
        if (g2.isEmpty()) {
            su4.s(2, null, "condition not met", null);
        }
        if (Intrinsics.d(g2.get(0), "null")) {
            CoverPath none2 = CoverPath.none();
            none2.getClass();
            return none2;
        }
        String str2 = (String) g2.get(0);
        str2.getClass();
        CoverPath B = etn.B(str2, webPath$Storage);
        if (g2.size() == 2) {
            String str3 = (String) g2.get(1);
            str3.getClass();
            if (str3.length() != 0) {
                List g3 = new Regex("<ci>").g(0, str3);
                if (g3.size() != 2) {
                    su4.s(2, null, "condition not met", null);
                }
                el6Var = new el6("null".equals(g3.get(0)) ? null : (String) g3.get(0), "null".equals(g3.get(1)) ? null : (String) g3.get(1));
            }
            B.setCopyrightInfo(el6Var);
        }
        return B;
    }

    public static ii8 y(String str) {
        if (Intrinsics.d(str, "global")) {
            return ii8.GLOBAL;
        }
        if (Intrinsics.d(str, "card")) {
            return ii8.CARD;
        }
        return null;
    }

    public static final float z(Layout layout, int i2, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        q9s q9sVar = eds.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : pie.a[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public abstract void C(Throwable th);

    public abstract void D(xdh xdhVar);
}
