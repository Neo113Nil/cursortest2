package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.StrictMode;
import android.text.Spanned;
import android.text.format.Formatter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.k0;
import com.yandex.music.core.ui.compose.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class qgg {
    public static final void A(final uyv uyvVar, final lyv lyvVar, yci yciVar, final rxv rxvVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        uyvVar.getClass();
        lyvVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1634980632);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(uyvVar) : oq5Var2.h(uyvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(lyvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(rxvVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            final aqi O = gld.O(uyvVar.h, oq5Var2);
            aqi O2 = gld.O(uyvVar.a, oq5Var2);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var = ((fs5) K).a;
            euv euvVar = (euv) oq5Var2.j(fuv.a);
            final long m = xv.m(euvVar.b, euvVar.a);
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var2.k0(K2);
            }
            final aqi aqiVar = (aqi) K2;
            int i3 = i2 >> 3;
            lyvVar.a(i3 & 14, oq5Var2);
            boolean e = oq5Var2.e(m);
            Object K3 = oq5Var2.K();
            if (e || K3 == kjnVar) {
                K3 = new mes(m, 1);
                oq5Var2.k0(K3);
            }
            Function0 function0 = (Function0) K3;
            yci c = d.c(yciVar, 1.0f);
            boolean z = true;
            boolean z2 = (((i2 & 7168) ^ 3072) > 2048 && oq5Var2.f(rxvVar)) || (i2 & 3072) == 2048;
            Object K4 = oq5Var2.K();
            if (z2 || K4 == kjnVar) {
                K4 = new kk6(rxvVar, 4);
                oq5Var2.k0(K4);
            }
            yci a = a.a(c, (Function1) K4);
            bzv bzvVar = (bzv) O2.getValue();
            int i4 = i3 & 896;
            boolean f = oq5Var2.f(bzvVar);
            if (((i4 ^ 384) <= 256 || !oq5Var2.f(rxvVar)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean h = f | z | oq5Var2.h(mm6Var);
            Object K5 = oq5Var2.K();
            if (h || K5 == kjnVar) {
                K5 = new zzq(21, bzvVar, rxvVar, mm6Var);
                oq5Var2.k0(K5);
            }
            yci b = nfp.b(a, false, (Function1) K5);
            Object K6 = oq5Var2.K();
            if (K6 == kjnVar) {
                K6 = new jwv(7);
                oq5Var2.k0(K6);
            }
            yd5.i(function0, b, rxvVar, (Function1) K6, ild.C(928704706, new pyc() { // from class: pyv
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    geh gehVar = (geh) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    gehVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(gehVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    Object K7 = oq5Var4.K();
                    aqi aqiVar2 = aqiVar;
                    Object obj4 = gq5.a;
                    if (K7 == obj4) {
                        K7 = new tiv(aqiVar2, 7);
                        oq5Var4.k0(K7);
                    }
                    Function0 function02 = (Function0) K7;
                    int i5 = intValue & 14;
                    int i6 = i5 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    uyv uyvVar2 = uyv.this;
                    sdr sdrVar = O;
                    lyv lyvVar2 = lyvVar;
                    rxv rxvVar2 = rxvVar;
                    long j = m;
                    qgg.B(gehVar, uyvVar2, sdrVar, lyvVar2, rxvVar2, j, function02, null, oq5Var4, i6, 128);
                    Object K8 = oq5Var4.K();
                    if (K8 == obj4) {
                        K8 = szf.U(new ftr(18, sdrVar, lyvVar2, gehVar));
                        oq5Var4.k0(K8);
                    }
                    geh gehVar2 = (geh) ((sdr) K8).getValue();
                    if (gehVar2 != null) {
                        oq5Var4.Z(-1136523028);
                        boolean f2 = (i5 == 4) | oq5Var4.f(gehVar2) | oq5Var4.e(j);
                        Object K9 = oq5Var4.K();
                        if (f2 || K9 == obj4) {
                            K9 = new ql3(gehVar2, gehVar, j);
                            oq5Var4.k0(K9);
                        }
                        yci i7 = androidx.compose.foundation.layout.a.i(vci.a, (Function1) K9);
                        Object K10 = oq5Var4.K();
                        if (K10 == obj4) {
                            K10 = new tiv(aqiVar2, 8);
                            oq5Var4.k0(K10);
                        }
                        qgg.B(gehVar2, uyvVar2, sdrVar, lyvVar2, rxvVar2, j, (Function0) K10, i7, oq5Var4, ScreenMirroringConfig.Video.BITRATE_1_5MB, 0);
                    } else {
                        oq5Var4.Z(-1141234656);
                    }
                    oq5Var4.p(false);
                    return Unit.a;
                }
            }, oq5Var2), oq5Var2, i4 | 27648);
            Object K7 = oq5Var2.K();
            if (K7 == kjnVar) {
                K7 = lyvVar.d;
                oq5Var2.k0(K7);
            }
            u2r u2rVar = (u2r) K7;
            Integer valueOf = Integer.valueOf(u2rVar.size());
            boolean h2 = oq5Var2.h(mm6Var);
            Object K8 = oq5Var2.K();
            if (h2 || K8 == kjnVar) {
                K8 = new n6p(u2rVar, mm6Var, null, 28);
                oq5Var2.k0(K8);
            }
            gld.w(oq5Var2, valueOf, (Function2) K8);
            Object K9 = oq5Var2.K();
            if (K9 == kjnVar) {
                K9 = szf.U(new tiv(O2, 9));
                oq5Var2.k0(K9);
            }
            final sdr sdrVar = (sdr) K9;
            oq5Var = oq5Var2;
            bg3.a(d.c(vci.a, 1.0f), b2c.c, false, ild.C(-1030050606, new pyc() { // from class: qyv
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    rxv rxvVar2 = rxv.this;
                    boolean f2 = oq5Var4.f(rxvVar2);
                    Object K10 = oq5Var4.K();
                    Object obj4 = gq5.a;
                    if (f2 || K10 == obj4) {
                        K10 = new keh(rxvVar2, 9);
                        oq5Var4.k0(K10);
                    }
                    yci s = wyf.s(vci.a, (Function0) K10);
                    Boolean valueOf2 = Boolean.valueOf(!((Boolean) sdrVar.getValue()).booleanValue() && ((Boolean) aqiVar.getValue()).booleanValue());
                    Object K11 = oq5Var4.K();
                    if (K11 == obj4) {
                        K11 = new dcb(25);
                        oq5Var4.k0(K11);
                    }
                    ot0.l(valueOf2, (Function1) K11, s, null, null, false, ild.C(-716753867, new qul(cVar, m), oq5Var4), oq5Var4, 1572912, 56);
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, 3126, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(uyvVar, lyvVar, false, yciVar, rxvVar, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void B(geh gehVar, uyv uyvVar, sdr sdrVar, lyv lyvVar, rxv rxvVar, long j, Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        Object K;
        kjn kjnVar;
        boolean z;
        Object K2;
        int i5;
        Object K3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1019192671);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(gehVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(uyvVar) : oq5Var.h(uyvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(sdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(lyvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(rxvVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.e(j) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var.h(function0) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            if ((4793491 & i3) == 4793490 || !oq5Var.z()) {
                if (i6 != 0) {
                    yciVar2 = vci.a;
                }
                int i7 = i3 >> 3;
                i4 = (i3 << 3) & 112;
                int i8 = (i7 & 14) | i4;
                uyvVar.getClass();
                gehVar.getClass();
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var = ((fs5) K).a;
                z = (((i8 & 112) ^ 48) <= 32 && oq5Var.f(gehVar)) || (i8 & 48) == 32;
                K2 = oq5Var.K();
                if (!z || K2 == kjnVar) {
                    fkn fknVar = uyvVar.h;
                    fkn fknVar2 = uyvVar.a;
                    xdr xdrVar = uyvVar.e;
                    xdr xdrVar2 = uyvVar.f;
                    jv jvVar = new jv(27, uyvVar, gehVar);
                    fknVar.getClass();
                    xdrVar.getClass();
                    xdrVar2.getClass();
                    i5 = i4;
                    K2 = new psv(lg3.u0(zsd.P(fknVar, fknVar2, xdrVar, xdrVar2, new ab5(jvVar, null, 0)), mm6Var, jvVar.invoke(fknVar.a.getValue(), fknVar2.a.getValue(), xdrVar.getValue(), xdrVar2.getValue())), new sml(uyvVar), new dxv(1, uyvVar), uyvVar.c, (ftv) uyvVar.d.invoke());
                    oq5Var.k0(K2);
                } else {
                    i5 = i4;
                }
                psv psvVar = (psv) K2;
                K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = szf.U(new hav(8, gehVar, sdrVar));
                    oq5Var.k0(K3);
                }
                f8g.g(j, gehVar, psvVar, lyvVar, rxvVar, function0, xp3.u(androidx.compose.foundation.layout.a.m(d.c(f8g.g0(yciVar2, ((Number) ((sdr) K3).getValue()).floatValue()), 1.0f), 6), ugo.a(((d3w) oq5Var.j(e3w.a)).f.b)), oq5Var, (i3 & 57344) | ((i3 >> 15) & 14) | i5 | (i3 & 7168) | (i7 & 458752));
            } else {
                oq5Var.S();
            }
            yci yciVar3 = yciVar2;
            r = oq5Var.r();
            if (r == null) {
                r.d = new fwl(gehVar, uyvVar, sdrVar, lyvVar, rxvVar, j, function0, yciVar3, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((4793491 & i3) == 4793490) {
        }
        if (i6 != 0) {
        }
        int i72 = i3 >> 3;
        i4 = (i3 << 3) & 112;
        int i82 = (i72 & 14) | i4;
        uyvVar.getClass();
        gehVar.getClass();
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        mm6 mm6Var2 = ((fs5) K).a;
        if (((i82 & 112) ^ 48) <= 32) {
        }
        K2 = oq5Var.K();
        if (z) {
        }
        fkn fknVar3 = uyvVar.h;
        fkn fknVar22 = uyvVar.a;
        xdr xdrVar3 = uyvVar.e;
        xdr xdrVar22 = uyvVar.f;
        jv jvVar2 = new jv(27, uyvVar, gehVar);
        fknVar3.getClass();
        xdrVar3.getClass();
        xdrVar22.getClass();
        i5 = i4;
        K2 = new psv(lg3.u0(zsd.P(fknVar3, fknVar22, xdrVar3, xdrVar22, new ab5(jvVar2, null, 0)), mm6Var2, jvVar2.invoke(fknVar3.a.getValue(), fknVar22.a.getValue(), xdrVar3.getValue(), xdrVar22.getValue())), new sml(uyvVar), new dxv(1, uyvVar), uyvVar.c, (ftv) uyvVar.d.invoke());
        oq5Var.k0(K2);
        psv psvVar2 = (psv) K2;
        K3 = oq5Var.K();
        if (K3 == kjnVar) {
        }
        f8g.g(j, gehVar, psvVar2, lyvVar, rxvVar, function0, xp3.u(androidx.compose.foundation.layout.a.m(d.c(f8g.g0(yciVar2, ((Number) ((sdr) K3).getValue()).floatValue()), 1.0f), 6), ugo.a(((d3w) oq5Var.j(e3w.a)).f.b)), oq5Var, (i3 & 57344) | ((i3 >> 15) & 14) | i5 | (i3 & 7168) | (i72 & 458752));
        yci yciVar32 = yciVar2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void C(List list, Object obj, c7t c7tVar, c7t c7tVar2, int i, int i2) {
        list.getClass();
        int[] iArr = c7tVar != null ? c7tVar.a : null;
        int[] iArr2 = c7tVar2 != null ? c7tVar2.a : null;
        if (iArr != null && iArr2 != null) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            LinkedHashSet linkedHashSet = new LinkedHashSet(tah.a(copyOf.length));
            xz0.T(copyOf, linkedHashSet);
            iArr = CollectionsKt.v0(CollectionsKt.n0(CollectionsKt.w0(linkedHashSet)));
        } else if (iArr == null && iArr2 != null) {
            iArr = iArr2;
        } else if (iArr == null || iArr2 != null) {
            xq0.x("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
            return;
        }
        if (obj == null) {
            return;
        }
        list.add(new c7t(iArr, t75.c(obj), i, t75.c(Integer.valueOf(i2))));
    }

    public static final tdk D(sdk sdkVar) {
        sdkVar.getClass();
        tdk tdkVar = sdkVar instanceof tdk ? (tdk) sdkVar : null;
        if (tdkVar != null) {
            return tdkVar;
        }
        wvs.p("Incorrect PaymentApi provided");
        return null;
    }

    public static int E(int i, int i2) {
        return aa5.l(i, (Color.alpha(i) * i2) / KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int F(kpn kpnVar, gc9 gc9Var, View view, View view2, yon yonVar, boolean z) {
        if (yonVar.Q() == 0 || kpnVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(yon.f0(view) - yon.f0(view2)) + 1;
        }
        return Math.min(gc9Var.o(), gc9Var.b(view2) - gc9Var.e(view));
    }

    public static int G(kpn kpnVar, gc9 gc9Var, View view, View view2, yon yonVar, boolean z, boolean z2) {
        if (yonVar.Q() == 0 || kpnVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (kpnVar.b() - Math.max(yon.f0(view), yon.f0(view2))) - 1) : Math.max(0, Math.min(yon.f0(view), yon.f0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(gc9Var.b(view2) - gc9Var.e(view)) / (Math.abs(yon.f0(view) - yon.f0(view2)) + 1))) + (gc9Var.n() - gc9Var.e(view)));
        }
        return max;
    }

    public static int H(kpn kpnVar, gc9 gc9Var, View view, View view2, yon yonVar, boolean z) {
        if (yonVar.Q() == 0 || kpnVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return kpnVar.b();
        }
        return (int) (((gc9Var.b(view2) - gc9Var.e(view)) / (Math.abs(yon.f0(view) - yon.f0(view2)) + 1)) * kpnVar.b());
    }

    public static final zso I(nw3 nw3Var) {
        nw3Var.getClass();
        int ordinal = nw3Var.ordinal();
        if (ordinal == 0) {
            return zso.CARD_BIND;
        }
        if (ordinal == 1) {
            return zso.NEW_CARD_PAY;
        }
        b6e.s();
        return null;
    }

    public static final t7o J(Throwable th) {
        th.getClass();
        return new t7o(th);
    }

    public static b38 K(List list, List list2) {
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            mqs mqsVar = (mqs) obj;
            String o = ouj.o(mqsVar.a, StringUtils.PROCESS_POSTFIX_DELIMITER, mqsVar.d.a);
            if (i > list2.size() - 1) {
                arrayList2.add(new pws(mqsVar, i));
                Object obj2 = linkedHashMap.get(o);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(o, obj2);
                }
                ((Collection) obj2).add(Integer.valueOf(i));
                linkedHashSet.add(o);
            } else {
                mqs mqsVar2 = (mqs) list2.get(i);
                String o2 = ouj.o(mqsVar2.a, StringUtils.PROCESS_POSTFIX_DELIMITER, mqsVar2.d.a);
                if (!o.equals(o2)) {
                    Object obj3 = linkedHashMap.get(o);
                    if (obj3 == null) {
                        obj3 = new LinkedHashSet();
                        linkedHashMap.put(o, obj3);
                    }
                    ((Collection) obj3).add(Integer.valueOf(i));
                    Object obj4 = linkedHashMap2.get(o2);
                    if (obj4 == null) {
                        obj4 = new LinkedHashSet();
                        linkedHashMap2.put(o2, obj4);
                    }
                    ((Collection) obj4).add(Integer.valueOf(i));
                    linkedHashSet.add(o);
                    linkedHashSet.add(o2);
                }
            }
            i = i2;
        }
        for (String str : linkedHashSet) {
            Set set = (Set) linkedHashMap.get(str);
            if (set != null) {
                Set set2 = (Set) linkedHashMap2.get(str);
                int i3 = 0;
                for (Object obj5 : set) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    int intValue = ((Number) obj5).intValue();
                    if (set2 == null || i3 > set2.size() - 1) {
                        arrayList.add(new ec4(intValue, null, null, (mqs) list.get(intValue)));
                    } else {
                        int intValue2 = ((Number) CollectionsKt.N(set2, i3)).intValue();
                        arrayList.add(new ec4(intValue, Integer.valueOf(intValue2), (mqs) list.get(intValue2), (mqs) list2.get(intValue2)));
                    }
                    i3 = i4;
                }
            }
        }
        return new b38(arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.c() == 1) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int L(int i, String str) {
        r3b r3bVar;
        String str2;
        int i2;
        Integer num = null;
        if (r3b.d()) {
            r3bVar = r3b.a();
        }
        r3bVar = null;
        if (r3bVar != null) {
            if (!(r3bVar.c() == 1)) {
                xq0.q("Not initialized yet");
                return 0;
            }
            o5g.w(str, "charSequence cannot be null");
            vx6 vx6Var = (vx6) r3bVar.e.a;
            vx6Var.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    kdt[] kdtVarArr = (kdt[]) spanned.getSpans(i, i + 1, kdt.class);
                    if (kdtVarArr.length > 0) {
                        i2 = spanned.getSpanEnd(kdtVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((c4b) vx6Var.J(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new c4b(i))).c;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.c() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int M(int i, String str) {
        r3b r3bVar;
        Integer num = null;
        if (r3b.d()) {
            r3bVar = r3b.a();
        }
        r3bVar = null;
        if (r3bVar != null) {
            int b = r3bVar.b(Math.max(0, i - 1), str);
            Integer valueOf = Integer.valueOf(b);
            if (b != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static int N(int i, View view) {
        Context context = view.getContext();
        TypedValue E = ngg.E(view.getContext(), view.getClass().getCanonicalName(), i);
        int i2 = E.resourceId;
        return i2 != 0 ? context.getColor(i2) : E.data;
    }

    public static int O(Context context, int i, int i2) {
        Integer num;
        TypedValue C = ngg.C(context, i);
        if (C != null) {
            int i3 = C.resourceId;
            num = Integer.valueOf(i3 != 0 ? context.getColor(i3) : C.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static final s9p P(hbq hbqVar) {
        hbqVar.getClass();
        if (hbqVar instanceof ebq) {
            return ((ebq) hbqVar).a;
        }
        if (hbqVar instanceof fbq) {
            return ((fbq) hbqVar).a;
        }
        if (hbqVar instanceof dbq) {
            return o8g.E(StringsKt.e0(((dbq) hbqVar).a, new char[]{','}, 6));
        }
        if (hbqVar instanceof cbq) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final String Q(hbq hbqVar) {
        hbqVar.getClass();
        if (!(hbqVar instanceof gbq)) {
            if (hbqVar instanceof dbq) {
                return ((dbq) hbqVar).b;
            }
            if (hbqVar instanceof cbq) {
                return null;
            }
            b6e.s();
            return null;
        }
        gbq gbqVar = (gbq) hbqVar;
        if (gbqVar instanceof ebq) {
            return ((ebq) gbqVar).b;
        }
        if (gbqVar instanceof fbq) {
            return ((fbq) gbqVar).b;
        }
        b6e.s();
        return null;
    }

    public static final m6s R(Intent intent) {
        intent.getClass();
        return (m6s) intent.getParcelableExtra("deeplink_target_data");
    }

    public static final Integer S(bfk bfkVar) {
        bfkVar.getClass();
        yek yekVar = bfkVar.f;
        if ((yekVar == null ? -1 : tht.a[yekVar.ordinal()]) == 1) {
            return Integer.valueOf(R.string.paymentsdk_error_sbp_token_binding_duplicate_hint);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00b0 -> B:10:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(c7t c7tVar, cle cleVar, cg6 cg6Var) {
        wgp wgpVar;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        wgp wgpVar2;
        pyc pycVar;
        c7t c7tVar2;
        int size;
        int i2;
        if (cg6Var instanceof wgp) {
            wgpVar = (wgp) cg6Var;
            int i3 = wgpVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wgpVar.r = i3 - Integer.MIN_VALUE;
                Object obj = wgpVar.q;
                nm6 nm6Var = nm6.a;
                i = wgpVar.r;
                if (i != 0) {
                    h0(obj);
                    List list = c7tVar.b;
                    if (list.isEmpty()) {
                        return c7tVar;
                    }
                    int size2 = list.size() + 4;
                    ArrayList arrayList3 = new ArrayList(size2);
                    ArrayList arrayList4 = new ArrayList(size2);
                    arrayList3.add(CollectionsKt.Q(list));
                    List list2 = c7tVar.d;
                    arrayList4.add(new Integer(list2 != null ? ((Number) CollectionsKt.Q(list2)).intValue() : 0));
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    wgpVar2 = wgpVar;
                    pycVar = cleVar;
                    c7tVar2 = c7tVar;
                    size = list.size();
                    i2 = 1;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    size = wgpVar.p;
                    int i4 = wgpVar.o;
                    Object obj2 = wgpVar.n;
                    ArrayList arrayList5 = wgpVar.m;
                    arrayList = wgpVar.l;
                    pyc pycVar2 = wgpVar.k;
                    c7t c7tVar3 = wgpVar.j;
                    h0(obj);
                    ArrayList arrayList6 = arrayList5;
                    wgp wgpVar3 = wgpVar;
                    pycVar = pycVar2;
                    ArrayList arrayList7 = arrayList;
                    ArrayList arrayList8 = arrayList6;
                    if (obj != null) {
                        arrayList7.add(obj);
                        arrayList8.add(new Integer(i4));
                    }
                    arrayList7.add(obj2);
                    arrayList8.add(new Integer(i4));
                    i2 = i4 + 1;
                    wgpVar2 = wgpVar3;
                    arrayList2 = arrayList8;
                    arrayList = arrayList7;
                    c7tVar2 = c7tVar3;
                    if (i2 < size) {
                        Object obj3 = c7tVar2.b.get(i2);
                        Object obj4 = c7tVar2.b.get(i2 - 1);
                        wgpVar2.j = c7tVar2;
                        wgpVar2.k = pycVar;
                        wgpVar2.l = arrayList;
                        wgpVar2.m = arrayList2;
                        wgpVar2.n = obj3;
                        wgpVar2.o = i2;
                        wgpVar2.p = size;
                        wgpVar2.r = 1;
                        Object invoke = pycVar.invoke(obj4, obj3, wgpVar2);
                        if (invoke == nm6Var) {
                            return nm6Var;
                        }
                        c7tVar3 = c7tVar2;
                        i4 = i2;
                        obj = invoke;
                        arrayList6 = arrayList2;
                        wgpVar3 = wgpVar2;
                        obj2 = obj3;
                        ArrayList arrayList72 = arrayList;
                        ArrayList arrayList82 = arrayList6;
                        if (obj != null) {
                        }
                        arrayList72.add(obj2);
                        arrayList82.add(new Integer(i4));
                        i2 = i4 + 1;
                        wgpVar2 = wgpVar3;
                        arrayList2 = arrayList82;
                        arrayList = arrayList72;
                        c7tVar2 = c7tVar3;
                        if (i2 < size) {
                            return arrayList.size() == c7tVar2.b.size() ? c7tVar2 : new c7t(c7tVar2.a, arrayList, c7tVar2.c, arrayList2);
                        }
                    }
                }
            }
        }
        wgpVar = new wgp(cg6Var);
        Object obj5 = wgpVar.q;
        nm6 nm6Var2 = nm6.a;
        i = wgpVar.r;
        if (i != 0) {
        }
    }

    public static boolean U(int i) {
        return i != 0 && aa5.f(i) > 0.5d;
    }

    public static final boolean V(oyu oyuVar) {
        oyuVar.getClass();
        if (oyuVar instanceof kyu) {
            return false;
        }
        if (!(oyuVar instanceof nyu)) {
            b6e.s();
            return false;
        }
        nyu nyuVar = (nyu) oyuVar;
        if ((nyuVar instanceof hyu) || (nyuVar instanceof jyu)) {
            return false;
        }
        if (nyuVar instanceof iyu) {
            return ((iyu) oyuVar).c;
        }
        b6e.s();
        return false;
    }

    public static int W(int i, float f, int i2) {
        return aa5.i(aa5.l(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static Object X(Function1 function1, Function1 function12, Function2 function2, aur aurVar) {
        msa msaVar = nsa.b;
        Object Q = gld.Q(new pgg(yd5.N(1000L, ssa.MILLISECONDS), function2, function12, function1, null), aurVar);
        return Q == nm6.a ? Q : Unit.a;
    }

    public static final int Y(bfk bfkVar, int i) {
        bfkVar.getClass();
        yek yekVar = bfkVar.f;
        if (yekVar == null) {
            switch (bfkVar.a.ordinal()) {
                case 5:
                    return R.string.paymentsdk_error_too_many_cards;
                case 7:
                    return R.string.paymentsdk_error_fail_3ds;
                case 8:
                    return R.string.paymentsdk_error_expired_card;
                case 9:
                    return R.string.paymentsdk_error_invalid_processing_request;
                case 10:
                    return R.string.paymentsdk_error_limit_exceeded;
                case 11:
                    return R.string.paymentsdk_error_not_enough_funds;
                case 12:
                    return R.string.paymentsdk_error_payment_authorization_reject;
                case 13:
                    return R.string.paymentsdk_error_payment_cancelled;
                case 14:
                    return R.string.paymentsdk_error_technical_error;
                case 15:
                    return R.string.paymentsdk_error_payment_timeout;
                case 16:
                    return R.string.paymentsdk_error_promocode_already_used;
                case 17:
                    return R.string.paymentsdk_error_restricted_card;
                case 18:
                    return R.string.paymentsdk_error_transaction_not_permitted;
                case 19:
                    return R.string.paymentsdk_error_user_cancelled;
                case 20:
                    return R.string.paymentsdk_error_credit_rejected;
                case 22:
                    return R.string.paymentsdk_sbp_banks_not_found;
                case 23:
                    return R.string.paymentsdk_method_not_available;
                case 24:
                    return R.string.paymentsdk_sbp_bank_app_failed_open;
                case 25:
                    return R.string.paymentsdk_sbp_failed_load_bank_list;
            }
        }
        if ((yekVar == null ? -1 : tht.a[yekVar.ordinal()]) == 1) {
            return R.string.paymentsdk_error_sbp_token_binding_duplicate;
        }
        return i;
    }

    public static final boolean Z(hbq hbqVar, s9p s9pVar, String str, boolean z) {
        hbqVar.getClass();
        s9p P = P(hbqVar);
        g9p a = P != null ? P.a() : null;
        String Q = Q(hbqVar);
        return (a == null || s9pVar == null || a.equals(s9pVar.a())) && (Q == null || str == null || Q.equals(str)) && ((hbqVar instanceof cbq) == z);
    }

    public static final void a(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(131299445);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            yciVar2 = yciVar;
            j66.o(ild.C(10486467, new xu0(15, z), oq5Var), (uoi) K, yciVar2, null, null, ild.C(-1442619579, new xu0(16, z), oq5Var), oq5Var, ((i2 << 3) & 896) | 199734, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar2, i, 12);
        }
    }

    public static final String a0(String str) {
        if (str == null || StringsKt.U(str)) {
            return null;
        }
        return str;
    }

    public static final void b(boolean z, zpd zpdVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        zpdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(592695555);
        if ((i & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(zpdVar.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            switch (zpdVar.ordinal()) {
                case 0:
                    oq5Var.Z(-1650215817);
                    a(((i3 >> 3) & 112) | (i3 & 14), oq5Var, yciVar, z);
                    oq5Var.p(false);
                    break;
                case 1:
                    oq5Var.Z(-1650210766);
                    gdg.i(((i3 >> 3) & 112) | (i3 & 14), 0, oq5Var, yciVar, z);
                    oq5Var.p(false);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    oq5Var.Z(-1650196604);
                    m(z, zpdVar, yciVar, oq5Var, i3 & 1022);
                    oq5Var.p(false);
                    break;
                case 11:
                case 12:
                    oq5Var.Z(383752894);
                    oq5Var.p(false);
                    break;
                default:
                    throw vz1.i(oq5Var, -1650217033, false);
            }
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(z, zpdVar, yciVar2, i, i2);
        }
    }

    public static final TypedValue b0(int i, Resources.Theme theme) {
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final void c(l8i l8iVar, s7i s7iVar, hq5 hq5Var, int i) {
        l8i l8iVar2;
        l8iVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1568731476);
        int i2 = (oq5Var.f(l8iVar) ? 4 : 2) | i | (oq5Var.f(s7iVar) ? 32 : 16);
        if (!oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            l8iVar2 = l8iVar;
            oq5Var.S();
        } else if (s7iVar instanceof r7i) {
            oq5Var.Z(540415965);
            r7i r7iVar = (r7i) s7iVar;
            l8iVar2 = l8iVar;
            e(l8iVar2, r7iVar.a, r7iVar.b, null, oq5Var, i2 & 14);
            oq5Var.p(false);
        } else {
            l8iVar2 = l8iVar;
            if (!(s7iVar instanceof q7i)) {
                throw vz1.i(oq5Var, 17431214, false);
            }
            oq5Var.Z(540634608);
            q7i q7iVar = (q7i) s7iVar;
            d(q7iVar.a, q7iVar.b, null, oq5Var, 0);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(l8iVar2, s7iVar, i, 7);
        }
    }

    public static final int c0(int i, Resources.Theme theme) {
        theme.getClass();
        TypedValue b0 = b0(i, theme);
        if (b0 != null) {
            return b0.data;
        }
        wvs.p("Theme does not contains all required colors");
        return 0;
    }

    public static final void d(ArrayList arrayList, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1641338011);
        int i2 = i | (oq5Var.f(arrayList) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            q0k a = androidx.compose.foundation.layout.a.a(16, 0.0f, 2);
            nx0 g = qx0.g(8);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new p1i(10);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            yci a2 = nfp.a(vciVar, (Function1) K);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new bw5(arrayList, z, 1);
                oq5Var.k0(K2);
            }
            weo.i(a2, null, a, false, g, null, null, false, null, (Function1) K2, oq5Var, 24960, 490);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x7i(arrayList, z, yciVar2, i, 1);
        }
    }

    public static final void d0(View view) {
        view.requestFocus();
        view.post(new hd3(view, 3));
    }

    public static final void e(l8i l8iVar, List list, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        l8iVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1536266452);
        int i2 = i | (oq5Var.f(l8iVar) ? 4 : 2) | (oq5Var.f(list) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            ynn i3 = irv.i(oq5Var);
            vci vciVar = vci.a;
            yci a = androidx.compose.ui.platform.a.a(vciVar, "mixes_block_ui");
            q0k a2 = androidx.compose.foundation.layout.a.a(16, 0.0f, 2);
            x2i x2iVar = qx0.a;
            nx0 g = qx0.g(z ? 8 : 4);
            boolean f = ((i2 & 112) == 32) | oq5Var.f(i3) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new p3e(6, list, i3, l8iVar);
                oq5Var.k0(K);
            }
            weo.i(a, null, a2, false, g, null, null, false, null, (Function1) K, oq5Var, 384, 490);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43((Object) l8iVar, (Object) list, z, yciVar2, i, 11);
        }
    }

    public static final yci e0(yci yciVar, zyj zyjVar, Function0 function0, q5t q5tVar, Function0 function02, c0g c0gVar, Function0 function03) {
        yciVar.getClass();
        function0.getClass();
        q5tVar.getClass();
        c0gVar.getClass();
        return vnj.r(yciVar, "com.yandex.music.design.components.track.common.slotTrackCustomActions", new Object[]{zyjVar, function0, q5tVar, function02, c0gVar, function03}, new kt4(zyjVar, function0, q5tVar, function02, c0gVar, function03));
    }

    public static final void f(n53 n53Var, eqp eqpVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        kjn kjnVar;
        long j;
        String str;
        boolean z;
        eqp eqpVar2;
        int i2;
        int i3;
        String m;
        int i4;
        eqpVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1707127569);
        int i5 = i | (oq5Var2.f(n53Var) ? 4 : 2) | (oq5Var2.f(eqpVar) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128);
        if (oq5Var2.P(i5 & 1, (i5 & 147) != 146)) {
            yci a = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13), "offline_block");
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            a0g.v(0, oq5Var2, null, rvf.M(R.string.settings_offline_and_download_title, oq5Var2));
            fk0 N = u1g.N(eqpVar, lsp.c, oq5Var2, ((i5 >> 3) & 14) | 48);
            String M = rvf.M(R.string.settings_offline_mode, oq5Var2);
            String M2 = rvf.M(R.string.settings_offline_mode_description, oq5Var2);
            boolean z2 = n53Var.a;
            long j2 = n53Var.b;
            int i7 = i5 & 112;
            boolean z3 = i7 == 32;
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z3 || K == kjnVar2) {
                kjnVar = kjnVar2;
                j = j2;
                str = M;
                z = false;
                kef kefVar = new kef(1, eqpVar, eqp.class, "onOfflineModeSwitcherClick", "onOfflineModeSwitcherClick(Z)V", 0, 21);
                eqpVar2 = eqpVar;
                oq5Var2.k0(kefVar);
                K = kefVar;
            } else {
                j = j2;
                kjnVar = kjnVar2;
                str = M;
                eqpVar2 = eqpVar;
                z = false;
            }
            Function1 function1 = (Function1) ((h9f) K);
            boolean h = oq5Var2.h(N);
            Object K2 = oq5Var2.K();
            if (h || K2 == kjnVar) {
                K2 = new kw4(N, 5);
                oq5Var2.k0(K2);
            }
            vci vciVar = vci.a;
            a0g.s(str, M2, z2, function1, b.c(androidx.compose.ui.platform.a.a(wyf.t(vciVar, (Function0) K2), "settings_offline_mode_switcher"), "offline_mode_state", Boolean.valueOf(n53Var.a)), oq5Var2, 0);
            boolean z4 = eqpVar2.e;
            if (z4) {
                i2 = 1265454781;
                i3 = R.string.auto_downloading_title;
            } else {
                if (z4) {
                    throw vz1.i(oq5Var2, 1265452800, z);
                }
                i2 = 1265457343;
                i3 = R.string.auto_download_like_title;
            }
            String n = vz1.n(oq5Var2, i2, i3, oq5Var2, z);
            boolean z5 = i7 != 32 ? z : true;
            Object K3 = oq5Var2.K();
            if (z5 || K3 == kjnVar) {
                K3 = new m9j(0, eqpVar, eqp.class, "onAutoDownloadLikeClick", "onAutoDownloadLikeClick()V", 0, 18);
                oq5Var2.k0(K3);
            }
            a0g.b(n, null, (Function0) ((h9f) K3), androidx.compose.ui.platform.a.a(vciVar, "settings_auto_cache_button"), null, oq5Var2, 3120, 16);
            oq5Var2.Z(1265466318);
            long j3 = j;
            if (j3 == 0) {
                m = vz1.n(oq5Var2, 1733488940, R.string.clear_memory, oq5Var2, z);
            } else {
                oq5Var2.Z(1733574469);
                m = k5r.m(rvf.M(R.string.clear_memory, oq5Var2), " (", Formatter.formatFileSize((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b), j3), ")");
                oq5Var2.p(z);
            }
            String str2 = m;
            oq5Var2.p(z);
            boolean z6 = i7 != 32 ? z : true;
            Object K4 = oq5Var2.K();
            if (z6 || K4 == kjnVar) {
                K4 = new m9j(0, eqpVar, eqp.class, "onClearMemoryClick", "onClearMemoryClick()V", 0, 19);
                oq5Var2.k0(K4);
            }
            a0g.b(str2, null, (Function0) ((h9f) K4), androidx.compose.ui.platform.a.a(vciVar, "clear_button"), null, oq5Var2, 3120, 16);
            if (n53Var.c) {
                oq5Var2.Z(575362601);
                int ordinal = n53Var.d.ordinal();
                if (ordinal == 0) {
                    i4 = R.string.settings_storage_external;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return;
                    }
                    i4 = R.string.settings_storage_sd_card;
                }
                String M3 = rvf.M(i4, oq5Var2);
                String M4 = rvf.M(R.string.settings_storage_title, oq5Var2);
                boolean z7 = i7 != 32 ? z : true;
                Object K5 = oq5Var2.K();
                if (z7 || K5 == kjnVar) {
                    K5 = new m9j(0, eqpVar, eqp.class, "onChangeStorageRootClick", "onChangeStorageRootClick()V", 0, 20);
                    oq5Var2.k0(K5);
                }
                oq5Var = oq5Var2;
                a0g.b(M4, M3, (Function0) ((h9f) K5), null, null, oq5Var, 24576, 8);
            } else {
                oq5Var = oq5Var2;
                oq5Var.Z(571528955);
            }
            oq5Var.p(z);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(n53Var, eqpVar, yciVar, i, 13);
        }
    }

    public static void f0(Activity activity) {
        View E;
        int hashCode = activity.hashCode();
        HashMap a = lfu.a();
        Integer valueOf = Integer.valueOf(hashCode);
        Object obj = a.get(valueOf);
        if (obj == null) {
            obj = new lfu(activity);
            a.put(valueOf, obj);
        }
        lfu lfuVar = (lfu) obj;
        Set set = bp6.a;
        if (set.contains(lfu.class)) {
            return;
        }
        try {
            if (set.contains(lfuVar)) {
                return;
            }
            try {
                if (lfuVar.c.getAndSet(true) || (E = ot0.E((Activity) lfuVar.a.get())) == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = E.getViewTreeObserver();
                viewTreeObserver.getClass();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(lfuVar);
                    lfuVar.b();
                }
            } catch (Throwable th) {
                bp6.a(lfuVar, th);
            }
        } catch (Throwable th2) {
            bp6.a(lfu.class, th2);
        }
    }

    public static final void g(m53 m53Var, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1647167168);
        int i2 = (oq5Var.f(m53Var) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            pm0.a(lm0.k, ild.C(2120306697, new xkj(yciVar, m53Var), oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xkj(m53Var, yciVar, i);
        }
    }

    public static void g0(Activity activity) {
        View E;
        int hashCode = activity.hashCode();
        lfu lfuVar = (lfu) lfu.a().get(Integer.valueOf(hashCode));
        if (lfuVar != null) {
            lfu.a().remove(Integer.valueOf(hashCode));
            Set set = bp6.a;
            if (set.contains(lfu.class)) {
                return;
            }
            try {
                if (!set.contains(lfuVar)) {
                    try {
                        if (lfuVar.c.getAndSet(false) && (E = ot0.E((Activity) lfuVar.a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = E.getViewTreeObserver();
                            viewTreeObserver.getClass();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(lfuVar);
                            }
                        }
                    } catch (Throwable th) {
                        bp6.a(lfuVar, th);
                    }
                }
            } catch (Throwable th2) {
                bp6.a(lfu.class, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(dh3 dh3Var, zyj zyjVar, Function0 function0, long j, hq5 hq5Var, int i) {
        int i2;
        zyj zyjVar2;
        yci f;
        xmn r;
        dh3Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1596223812);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(dh3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(zyjVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.e(j) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !oq5Var.z()) {
            int ordinal = zyjVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    oq5Var.Z(774612336);
                    zyjVar2 = zyjVar;
                    aae.a(function0, null, zyjVar2 == zyj.c, ild.C(62312479, new bu0(j, 9), oq5Var), oq5Var, ((i2 >> 6) & 14) | 24576, 10);
                    oq5Var.p(false);
                } else {
                    int i3 = 3;
                    if (ordinal != 3) {
                        throw vz1.i(oq5Var, -667752753, false);
                    }
                    oq5Var.Z(775226198);
                    w4k E = a0g.E(R.drawable.ic_burger, 0, oq5Var);
                    long j2 = ((dq0) oq5Var.j(eq0.a)).a.c;
                    yci a = dh3Var.a(d.m(vci.a, 24), b2c.f);
                    Unit unit = Unit.a;
                    boolean z = (i2 & 896) == 256;
                    Object K = oq5Var.K();
                    if (z || K == gq5.a) {
                        K = new af(function0, null, i3);
                        oq5Var.k0(K);
                    }
                    f = a.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K), 6));
                    gae.b(E, null, androidx.compose.ui.platform.a.a(f, "track_move"), j2, oq5Var, 48, 0);
                    oq5Var.p(false);
                }
            } else {
                zyjVar2 = zyjVar;
                oq5Var.Z(-667752160);
                oq5Var.p(false);
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new mv0(dh3Var, zyjVar2, function0, j, i, 2);
                return;
            }
            return;
        }
        oq5Var.S();
        zyjVar2 = zyjVar;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void h0(Object obj) {
        if (obj instanceof t7o) {
            throw ((t7o) obj).a;
        }
    }

    public static final void i(int i, int i2, hq5 hq5Var, yci yciVar) {
        w4k E;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1530606078);
        int i3 = (oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            agr agrVar = eq0.a;
            yci d = androidx.compose.foundation.layout.a.d(androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i), 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(1070847548);
                oq5Var.p(false);
                E = new w85(d85.k);
            } else {
                oq5Var.Z(1070848509);
                E = a0g.E(i, i3 & 14, oq5Var);
                oq5Var.p(false);
            }
            gae.b(E, null, d.m(androidx.compose.foundation.layout.b.a.a(vci.a, b2c.f), 32), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 48, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(i, yciVar, i2, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uow i0(f fVar, izs izsVar, gxc gxcVar, int i) {
        String str;
        tow towVar;
        int ordinal;
        pow powVar;
        sow sowVar;
        if ((i & 8) != 0) {
            gxcVar = null;
        }
        fVar.getClass();
        izsVar.getClass();
        String w = fVar.w();
        if (w == null) {
            w = "";
        }
        String str2 = w;
        String a0 = a0(fVar.r());
        if (a0 == null) {
            a0 = "unknown";
        }
        String str3 = a0;
        dlr p = fVar.p();
        if (p == null || (str = p.g()) == null || StringsKt.N(str, ':')) {
            str = null;
        }
        String a02 = a0(str);
        String a03 = a0(fVar.q().g());
        String a04 = a0(fVar.s().g());
        if (a04 != null) {
            String a05 = a0(fVar.v().g());
            if (a05 == null) {
                a05 = weo.t();
            }
            gxcVar = new gxc(a04, a05);
        }
        int ordinal2 = fVar.u().ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                towVar = tow.a;
            } else if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    towVar = tow.b;
                } else if (ordinal2 == 4) {
                    towVar = tow.c;
                } else if (ordinal2 != 5) {
                    b6e.s();
                    return null;
                }
            }
            ordinal = towVar.ordinal();
            if (ordinal != 0) {
                if (fVar.B()) {
                    k0 x = fVar.x();
                    x.getClass();
                    int j = x.j();
                    dlr h = x.k() ? x.h() : null;
                    powVar = new pow(izsVar, j, h != null ? h.g() : null);
                } else {
                    powVar = null;
                }
                String a06 = a0(fVar.t());
                if (a06 == null) {
                    return j0(fVar, str3, str2, a02, a03);
                }
                String str4 = gxcVar != null ? gxcVar.a : null;
                String str5 = gxcVar != null ? gxcVar.b : null;
                if (StringsKt.U(a06)) {
                    su4.s(2, null, "broken connect catalog track converter", null);
                }
                return new uow(a06, tow.a, str3, str2, a02, a03, powVar, str4, str5);
            }
            if (ordinal == 1) {
                String a07 = a0(fVar.t());
                if (a07 == null) {
                    return j0(fVar, str3, str2, a02, a03);
                }
                return new uow(a07, tow.b, str3, str2, null, a03, null, gxcVar != null ? gxcVar.a : null, gxcVar != null ? gxcVar.b : null);
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return j0(fVar, str3, str2, a02, a03);
                }
                b6e.s();
                return null;
            }
            if (fVar.C()) {
                switch (ouj.D(fVar.y().h())) {
                    case 0:
                    case 7:
                        sowVar = sow.g;
                        break;
                    case 1:
                        sowVar = sow.a;
                        break;
                    case 2:
                        sowVar = sow.b;
                        break;
                    case 3:
                        sowVar = sow.c;
                        break;
                    case 4:
                        sowVar = sow.d;
                        break;
                    case 5:
                        sowVar = sow.e;
                        break;
                    case 6:
                        sowVar = sow.f;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
            } else {
                sowVar = null;
            }
            String a08 = a0(fVar.t());
            if (a08 == null) {
                return j0(fVar, str3, str2, a02, a03);
            }
            String str6 = gxcVar != null ? gxcVar.a : null;
            String str7 = gxcVar != null ? gxcVar.b : null;
            if (StringsKt.U(a08)) {
                su4.s(2, null, "broken connect catalog video clip converter", null);
            }
            return new uow(a08, tow.c, str3, str2, a02, a03, sowVar != null ? new qow(sowVar) : null, str6, str7);
        }
        towVar = tow.d;
        ordinal = towVar.ordinal();
        if (ordinal != 0) {
        }
    }

    public static final void j(float f, final boolean z, yci yciVar, hq5 hq5Var, final int i) {
        int i2;
        final yci yciVar2;
        Object ql3Var;
        int i3;
        final float f2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-651075615);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            f2 = f;
            yciVar2 = yciVar;
        } else {
            long j = ((tln) oq5Var.j(jft.a)).d;
            sdr b = pk0.b(f, weo.Q(0.75f, 200.0f, null, 4), "radius", null, oq5Var, (i4 & 14) | 3120, 20);
            float f3 = z ? 0.05f : 1.0f;
            sdr b2 = pk0.b(f3, weo.S(f3 < 0.5f ? 1200 : 100, 0, nya.a, 2), "alpha", null, oq5Var, 3072, 20);
            yciVar2 = vci.a;
            yci c = d.c(yciVar2, 1.0f);
            boolean f4 = oq5Var.f(b) | oq5Var.e(j) | oq5Var.f(b2);
            Object K = oq5Var.K();
            if (f4 || K == gq5.a) {
                i3 = 0;
                f2 = f;
                ql3Var = new ql3(3, j, b, b2);
                oq5Var.k0(ql3Var);
            } else {
                f2 = f;
                ql3Var = K;
                i3 = 0;
            }
            ksw.j(i3, oq5Var, c, (Function1) ql3Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: sln
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    qgg.j(f2, z, yciVar2, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final uow j0(f fVar, String str, String str2, String str3, String str4) {
        String t = fVar.t();
        if (fVar.u() == lwk.LOCAL_TRACK) {
            t = null;
        }
        ssg.a(6, "YnisonRemotePlayable", hrg.s("unknown playable of Playable(id=", t, ", title=", str2, ")"), null);
        String str5 = t;
        return new uow(str5 == null ? "unknown-".concat(str2) : str5, tow.d, str, str2, str3, str4, null, null, null);
    }

    public static a1k k(List list, int i, int i2, ofg ofgVar, ofg ofgVar2) {
        list.getClass();
        ofgVar.getClass();
        return new a1k(pfg.a, list, i, i2, ofgVar, ofgVar2);
    }

    public static final f k0(uow uowVar) {
        lwk lwkVar;
        uowVar.getClass();
        String str = uowVar.a;
        String str2 = uowVar.e;
        int ordinal = uowVar.b.ordinal();
        if (ordinal == 0) {
            lwkVar = lwk.TRACK;
        } else if (ordinal == 1) {
            lwkVar = lwk.INFINITE;
        } else if (ordinal == 2) {
            lwkVar = lwk.VIDEO_CLIP;
        } else {
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
            lwkVar = lwk.UNSPECIFIED;
        }
        String str3 = uowVar.c;
        String str4 = uowVar.h;
        if (str4 == null) {
            str4 = avf.H();
        }
        String str5 = uowVar.i;
        if (str5 == null) {
            str5 = weo.t();
        }
        String str6 = uowVar.d;
        String str7 = uowVar.f;
        row rowVar = uowVar.g;
        return bzf.J(str, lwkVar, str4, str5, str3, str6, str2, str7, rowVar != null ? ngg.P(rowVar) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final zyj zyjVar, final rba rbaVar, final lzs lzsVar, final boolean z, final boolean z2, final Function0 function0, final Function0 function02, final Function0 function03, final wn5 wn5Var, final wn5 wn5Var2, yci yciVar, nxq nxqVar, c0g c0gVar, q5t q5tVar, Function0 function04, Function0 function05, long j, long j2, o0k o0kVar, pyc pycVar, boolean z3, hq5 hq5Var, final int i, final int i2, final int i3, final int i4) {
        int i5;
        boolean z4;
        int i6;
        yci yciVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        c0g c0gVar2;
        final q5t q5tVar2;
        Function0 function06;
        Function0 function07;
        final long j3;
        long j4;
        int i16;
        o0k o0kVar2;
        o0k o0kVar3;
        pyc pycVar2;
        o0k o0kVar4;
        boolean z5;
        pyc pycVar3;
        nxq nxqVar2;
        boolean z6;
        Object K;
        oq5 oq5Var;
        final nxq nxqVar3;
        final o0k o0kVar5;
        final long j5;
        final c0g c0gVar3;
        final yci yciVar3;
        final boolean z7;
        final Function0 function08;
        final Function0 function09;
        final long j6;
        final pyc pycVar4;
        xmn r;
        rbaVar.getClass();
        lzsVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1474641976);
        if ((i & 6) == 0) {
            i5 = (oq5Var2.d(zyjVar.ordinal()) ? 4 : 2) | i;
        } else {
            i5 = i;
        }
        if ((i & 48) == 0) {
            i5 |= oq5Var2.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= oq5Var2.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z;
            i5 |= oq5Var2.g(z4) ? 2048 : 1024;
        } else {
            z4 = z;
        }
        int i17 = i & 24576;
        int i18 = RemoteCameraConfig.Notification.ID;
        if (i17 == 0) {
            i5 |= oq5Var2.g(z2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i6 = 196608;
            i5 |= oq5Var2.h(function0) ? 131072 : 65536;
        } else {
            i6 = 196608;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        int i19 = i & 12582912;
        int i20 = RemoteCameraConfig.Camera.BITRATE;
        if (i19 == 0) {
            i5 |= oq5Var2.h(function03) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= oq5Var2.h(wn5Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= oq5Var2.h(wn5Var2) ? 536870912 : 268435456;
        }
        int i21 = i4 & 1024;
        if (i21 != 0) {
            yciVar2 = yciVar;
            i7 = i2 | 6;
        } else {
            yciVar2 = yciVar;
            if ((i2 & 6) == 0) {
                i7 = i2 | (oq5Var2.f(yciVar2) ? 4 : 2);
            } else {
                i7 = i2;
            }
        }
        int i22 = i4 & 2048;
        if (i22 != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            i7 |= oq5Var2.d(nxqVar == null ? -1 : nxqVar.ordinal()) ? 32 : 16;
        }
        int i23 = i7;
        int i24 = i4 & 4096;
        if (i24 != 0) {
            i23 |= 384;
            i8 = i24;
        } else {
            i8 = i24;
            if ((i2 & 384) == 0) {
                i23 |= oq5Var2.d(c0gVar == null ? -1 : c0gVar.ordinal()) ? 256 : 128;
            }
        }
        int i25 = i4 & RemoteCameraConfig.Notification.ID;
        if (i25 != 0) {
            i23 |= 3072;
            i9 = i25;
        } else {
            i9 = i25;
            if ((i2 & 3072) == 0) {
                i23 |= oq5Var2.d(q5tVar != null ? q5tVar.ordinal() : -1) ? 2048 : 1024;
            }
        }
        int i26 = i4 & 16384;
        if (i26 != 0) {
            i23 |= 24576;
            i10 = i26;
        } else {
            i10 = i26;
            if ((i2 & 24576) == 0) {
                if (oq5Var2.h(function04)) {
                    i18 = 16384;
                }
                i23 |= i18;
                i11 = i4 & SQLiteDatabase.OPEN_NOMUTEX;
                if (i11 == 0) {
                    i23 |= i6;
                } else if ((i2 & i6) == 0) {
                    i23 |= oq5Var2.h(function05) ? 131072 : 65536;
                }
                if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                    i23 |= ((i4 & SQLiteDatabase.OPEN_FULLMUTEX) == 0 && oq5Var2.e(j)) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    if ((i4 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0 && oq5Var2.e(j2)) {
                        i20 = 8388608;
                    }
                    i23 |= i20;
                }
                i12 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
                if (i12 == 0) {
                    i23 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i23 |= oq5Var2.f(o0kVar) ? 67108864 : 33554432;
                }
                i13 = i4 & 524288;
                if (i13 == 0) {
                    i23 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i23 |= oq5Var2.h(pycVar) ? 536870912 : 268435456;
                }
                i14 = i4 & 1048576;
                if (i14 == 0) {
                    i15 = 6;
                } else if ((i3 & 6) == 0) {
                    i15 = i3 | (oq5Var2.g(z3) ? 4 : 2);
                } else {
                    i15 = i3;
                }
                if ((i5 & 306783379) != 306783378 && (i23 & 306783379) == 306783378 && (i15 & 3) == 2 && oq5Var2.z()) {
                    oq5Var2.S();
                    nxqVar3 = nxqVar;
                    c0gVar3 = c0gVar;
                    q5tVar2 = q5tVar;
                    function08 = function05;
                    j6 = j;
                    j5 = j2;
                    o0kVar5 = o0kVar;
                    pycVar4 = pycVar;
                    z7 = z3;
                    oq5Var = oq5Var2;
                    yciVar3 = yciVar2;
                    function09 = function04;
                } else {
                    oq5Var2.U();
                    if ((i & 1) != 0 || oq5Var2.y()) {
                        if (i21 != 0) {
                            yciVar2 = vci.a;
                        }
                        nxq nxqVar4 = i22 == 0 ? nxq.d : nxqVar;
                        c0gVar2 = i8 == 0 ? c0g.a : c0gVar;
                        q5tVar2 = i9 == 0 ? q5t.a : q5tVar;
                        function06 = i10 == 0 ? null : function04;
                        function07 = i11 == 0 ? function05 : null;
                        j3 = (i4 & SQLiteDatabase.OPEN_FULLMUTEX) == 0 ? ((dq0) oq5Var2.j(eq0.a)).a.c : j;
                        j4 = (i4 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0 ? ((dq0) oq5Var2.j(eq0.a)).a.c : j2;
                        nxq nxqVar5 = nxqVar4;
                        if (i12 == 0) {
                            i16 = i5;
                            float f = 0;
                            o0kVar2 = new q0k(f, f, f, f);
                        } else {
                            i16 = i5;
                            o0kVar2 = o0kVar;
                        }
                        if (i13 == 0) {
                            o0kVar3 = o0kVar2;
                            pycVar2 = ild.C(963774189, new pyc() { // from class: kxq
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    dh3 dh3Var = (dh3) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    dh3Var.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((oq5) hq5Var2).f(dh3Var) ? 4 : 2;
                                    }
                                    if ((intValue & 19) == 18) {
                                        oq5 oq5Var3 = (oq5) hq5Var2;
                                        if (oq5Var3.z()) {
                                            oq5Var3.S();
                                            return Unit.a;
                                        }
                                    }
                                    qgg.h(dh3Var, zyj.this, function03, j3, hq5Var2, intValue & 14);
                                    return Unit.a;
                                }
                            }, oq5Var2);
                        } else {
                            o0kVar3 = o0kVar2;
                            pycVar2 = pycVar;
                        }
                        o0kVar4 = o0kVar3;
                        if (i14 == 0) {
                            pycVar3 = pycVar2;
                            z5 = true;
                        } else {
                            z5 = z3;
                            pycVar3 = pycVar2;
                        }
                        nxqVar2 = nxqVar5;
                    } else {
                        oq5Var2.S();
                        nxqVar2 = nxqVar;
                        c0gVar2 = c0gVar;
                        q5tVar2 = q5tVar;
                        function06 = function04;
                        function07 = function05;
                        j3 = j;
                        j4 = j2;
                        pycVar3 = pycVar;
                        z5 = z3;
                        i16 = i5;
                        o0kVar4 = o0kVar;
                    }
                    oq5Var2.q();
                    final nxq nxqVar6 = nxqVar2;
                    long j7 = j3;
                    boolean z8 = lzsVar == lzs.a;
                    yci e0 = e0(d.d(d.g(yciVar2, mu0.c, 0.0f, 2), 1.0f), zyjVar, function03, q5tVar2, function07, c0gVar2, function06);
                    z6 = (i16 & 57344) != 16384;
                    K = oq5Var2.K();
                    if (!z6 || K == gq5.a) {
                        K = new i32(10, z2);
                        oq5Var2.k0(K);
                    }
                    final o0k o0kVar6 = o0kVar4;
                    final long j8 = j4;
                    final boolean z9 = z4;
                    final c0g c0gVar4 = c0gVar2;
                    final q5t q5tVar3 = q5tVar2;
                    final Function0 function010 = function07;
                    final pyc pycVar5 = pycVar3;
                    final Function0 function011 = function06;
                    int i27 = i16 >> 6;
                    boolean z10 = z5;
                    tyf.j(z8, z, function0, nfp.b(e0, false, (Function1) K), function02, z10, ild.C(-2092834461, new Function2() { // from class: lxq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.foundation.layout.b bVar;
                            kb5 kb5Var;
                            kjn kjnVar;
                            iz2 iz2Var;
                            kb5 kb5Var2;
                            kb5 kb5Var3;
                            kb5 kb5Var4;
                            float f2;
                            boolean z11;
                            int i28;
                            c0g c0gVar5;
                            c0g c0gVar6;
                            grb grbVar;
                            rba rbaVar2;
                            kjn kjnVar2;
                            boolean z12;
                            boolean z13;
                            boolean z14;
                            c0g c0gVar7;
                            boolean z15;
                            hq5 hq5Var2 = (hq5) obj;
                            if ((((Integer) obj2).intValue() & 3) == 2) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            iz2 iz2Var2 = b2c.b;
                            kfh d = ug3.d(iz2Var2, false);
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            int i29 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l = oq5Var4.l();
                            vci vciVar = vci.a;
                            yci H = vnj.H(hq5Var2, vciVar);
                            xp5.T.getClass();
                            grb grbVar2 = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar2);
                            } else {
                                oq5Var4.n0();
                            }
                            kb5 kb5Var5 = wp5.f;
                            g0g.U(hq5Var2, d, kb5Var5);
                            kb5 kb5Var6 = wp5.e;
                            g0g.U(hq5Var2, l, kb5Var6);
                            kb5 kb5Var7 = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i29))) {
                                ouj.x(i29, oq5Var4, i29, kb5Var7);
                            }
                            kb5 kb5Var8 = wp5.d;
                            g0g.U(hq5Var2, H, kb5Var8);
                            iz2 iz2Var3 = b2c.f;
                            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
                            yci c = b.c(bVar2.a(vciVar, iz2Var3), "track_selected", Boolean.valueOf(z9));
                            nho a = lho.a(qx0.a, b2c.l, hq5Var2, 48);
                            int i30 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                            yci H2 = vnj.H(hq5Var2, c);
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar2);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, a, kb5Var5);
                            g0g.U(hq5Var2, l2, kb5Var6);
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i30))) {
                                ouj.x(i30, oq5Var4, i30, kb5Var7);
                            }
                            g0g.U(hq5Var2, H2, kb5Var8);
                            kfh d2 = ug3.d(b2c.e, false);
                            int i31 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                            yci H3 = vnj.H(hq5Var2, vciVar);
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar2);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, d2, kb5Var5);
                            g0g.U(hq5Var2, l3, kb5Var6);
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i31))) {
                                ouj.x(i31, oq5Var4, i31, kb5Var7);
                            }
                            g0g.U(hq5Var2, H3, kb5Var8);
                            wn5Var.invoke(hq5Var2, 0);
                            oq5Var4.p(true);
                            u1g.l(hq5Var2, d.r(vciVar, nxqVar6.a));
                            if (1.0f <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            yci o = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(true, 1.0f), 0.0f, mu0.b, 1);
                            kfh d3 = ug3.d(iz2Var2, false);
                            int i32 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l4 = oq5Var4.l();
                            yci H4 = vnj.H(hq5Var2, o);
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar2);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, d3, kb5Var5);
                            g0g.U(hq5Var2, l4, kb5Var6);
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i32))) {
                                ouj.x(i32, oq5Var4, i32, kb5Var7);
                            }
                            g0g.U(hq5Var2, H4, kb5Var8);
                            wn5Var2.invoke(hq5Var2, 0);
                            oq5Var4.p(true);
                            float f3 = 8;
                            u1g.l(hq5Var2, d.r(vciVar, f3));
                            yci a2 = androidx.compose.ui.platform.a.a(d.m(vciVar, 16), "download_icon");
                            rba rbaVar3 = rbaVar;
                            weo.d(rbaVar3, b.c(a2, "download_status", rbaVar3), hq5Var2, 0);
                            c0g c0gVar8 = c0g.a;
                            c0g c0gVar9 = c0gVar4;
                            kjn kjnVar3 = gq5.a;
                            if (c0gVar9 != c0gVar8) {
                                oq5Var4.Z(-768950814);
                                yci l5 = androidx.compose.foundation.layout.a.l(d.m(vciVar, 40), o0kVar6);
                                Object K2 = oq5Var4.K();
                                if (K2 == kjnVar3) {
                                    c0gVar7 = c0gVar8;
                                    K2 = new xnq(20);
                                    oq5Var4.k0(K2);
                                } else {
                                    c0gVar7 = c0gVar8;
                                }
                                yci a3 = nfp.a(l5, (Function1) K2);
                                kfh d4 = ug3.d(iz2Var2, false);
                                int i33 = oq5Var4.P;
                                androidx.compose.runtime.internal.a l6 = oq5Var4.l();
                                yci H5 = vnj.H(hq5Var2, a3);
                                oq5Var4.d0();
                                iz2Var = iz2Var2;
                                if (oq5Var4.O) {
                                    oq5Var4.k(grbVar2);
                                } else {
                                    oq5Var4.n0();
                                }
                                g0g.U(hq5Var2, d4, kb5Var5);
                                g0g.U(hq5Var2, l6, kb5Var6);
                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i33))) {
                                    ouj.x(i33, oq5Var4, i33, kb5Var7);
                                }
                                g0g.U(hq5Var2, H5, kb5Var8);
                                Function0 function012 = function011;
                                if (function012 == null) {
                                    oq5Var4.Z(-799792505);
                                    Object K3 = oq5Var4.K();
                                    if (K3 == kjnVar3) {
                                        K3 = new nrq(7);
                                        oq5Var4.k0(K3);
                                    }
                                    function012 = (Function0) K3;
                                    z15 = false;
                                } else {
                                    z15 = false;
                                    oq5Var4.Z(1359673098);
                                }
                                oq5Var4.p(z15);
                                bVar = bVar2;
                                kjnVar = kjnVar3;
                                kb5Var2 = kb5Var5;
                                kb5Var3 = kb5Var6;
                                f2 = f3;
                                c0gVar5 = c0gVar7;
                                c0gVar6 = c0gVar9;
                                grbVar = grbVar2;
                                kb5Var4 = kb5Var7;
                                rbaVar2 = rbaVar3;
                                kb5Var = kb5Var8;
                                i28 = -775123255;
                                aae.a(function012, null, false, ild.C(-1832115620, new cu0(c0gVar9, j8, 4), hq5Var2), hq5Var2, 24576, 14);
                                oq5Var4.p(true);
                                z11 = false;
                            } else {
                                bVar = bVar2;
                                kb5Var = kb5Var8;
                                kjnVar = kjnVar3;
                                iz2Var = iz2Var2;
                                kb5Var2 = kb5Var5;
                                kb5Var3 = kb5Var6;
                                kb5Var4 = kb5Var7;
                                f2 = f3;
                                z11 = false;
                                i28 = -775123255;
                                c0gVar5 = c0gVar8;
                                c0gVar6 = c0gVar9;
                                grbVar = grbVar2;
                                rbaVar2 = rbaVar3;
                                oq5Var4.Z(-775123255);
                            }
                            oq5Var4.p(z11);
                            if (q5tVar3 != q5t.a) {
                                oq5Var4.Z(-767898860);
                                if (rbaVar2 == rba.a || c0gVar6 != c0gVar5) {
                                    z13 = false;
                                    oq5Var4.Z(i28);
                                } else {
                                    oq5Var4.Z(-767808867);
                                    u1g.l(hq5Var2, d.r(vciVar, f2));
                                    z13 = false;
                                }
                                oq5Var4.p(z13);
                                Function0 function013 = function010;
                                if (function013 == null) {
                                    oq5Var4.Z(-767651449);
                                    Object K4 = oq5Var4.K();
                                    kjnVar2 = kjnVar;
                                    if (K4 == kjnVar2) {
                                        K4 = new nrq(8);
                                        oq5Var4.k0(K4);
                                    }
                                    function013 = (Function0) K4;
                                    z14 = false;
                                } else {
                                    kjnVar2 = kjnVar;
                                    z14 = false;
                                    oq5Var4.Z(1083615149);
                                }
                                oq5Var4.p(z14);
                                agr agrVar = yre.a;
                                Object K5 = oq5Var4.K();
                                if (K5 == kjnVar2) {
                                    K5 = new xnq(21);
                                    oq5Var4.k0(K5);
                                }
                                aae.a(function013, androidx.compose.foundation.layout.a.q(nfp.a(MinimumInteractiveModifier.a, (Function1) K5), 0.0f, 0.0f, 4, 0.0f, 11), false, i4w.c, hq5Var2, 24576, 12);
                                z12 = false;
                            } else {
                                kjnVar2 = kjnVar;
                                z12 = false;
                                oq5Var4.Z(i28);
                            }
                            oq5Var4.p(z12);
                            kb5 kb5Var9 = kb5Var3;
                            grb grbVar3 = grbVar;
                            kb5 kb5Var10 = kb5Var2;
                            kb5 kb5Var11 = kb5Var4;
                            yci m = d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f2, 0.0f, 11), 40);
                            Object K6 = oq5Var4.K();
                            if (K6 == kjnVar2) {
                                K6 = new xnq(22);
                                oq5Var4.k0(K6);
                            }
                            yci a4 = nfp.a(m, (Function1) K6);
                            kfh d5 = ug3.d(iz2Var, false);
                            int i34 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l7 = oq5Var4.l();
                            yci H6 = vnj.H(hq5Var2, a4);
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar3);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, d5, kb5Var10);
                            g0g.U(hq5Var2, l7, kb5Var9);
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i34))) {
                                ouj.x(i34, oq5Var4, i34, kb5Var11);
                            }
                            g0g.U(hq5Var2, H6, kb5Var);
                            pycVar5.invoke(bVar, hq5Var2, 6);
                            f1d.u(oq5Var4, true, true, true);
                            return Unit.a;
                        }
                    }, oq5Var2), oq5Var2, ((i16 >> 9) & 896) | (i27 & 112) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i27 & 57344) | ((i15 << 15) & 458752), 0);
                    oq5Var = oq5Var2;
                    nxqVar3 = nxqVar6;
                    o0kVar5 = o0kVar4;
                    j5 = j4;
                    c0gVar3 = c0gVar2;
                    yciVar3 = yciVar2;
                    z7 = z10;
                    function08 = function07;
                    function09 = function06;
                    j6 = j7;
                    pycVar4 = pycVar5;
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new Function2() { // from class: mxq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int R = rvf.R(i | 1);
                            int R2 = rvf.R(i2);
                            int R3 = rvf.R(i3);
                            qgg.l(zyj.this, rbaVar, lzsVar, z, z2, function0, function02, function03, wn5Var, wn5Var2, yciVar3, nxqVar3, c0gVar3, q5tVar2, function09, function08, j6, j5, o0kVar5, pycVar4, z7, (hq5) obj, R, R2, R3, i4);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
        }
        i11 = i4 & SQLiteDatabase.OPEN_NOMUTEX;
        if (i11 == 0) {
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i12 == 0) {
        }
        i13 = i4 & 524288;
        if (i13 == 0) {
        }
        i14 = i4 & 1048576;
        if (i14 == 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i21 != 0) {
        }
        if (i22 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if ((i4 & SQLiteDatabase.OPEN_FULLMUTEX) == 0) {
        }
        if ((i4 & SQLiteDatabase.OPEN_SHAREDCACHE) == 0) {
        }
        nxq nxqVar52 = nxqVar4;
        if (i12 == 0) {
        }
        if (i13 == 0) {
        }
        o0kVar4 = o0kVar3;
        if (i14 == 0) {
        }
        nxqVar2 = nxqVar52;
        oq5Var2.q();
        final nxq nxqVar62 = nxqVar2;
        long j72 = j3;
        boolean z82 = lzsVar == lzs.a;
        yci e02 = e0(d.d(d.g(yciVar2, mu0.c, 0.0f, 2), 1.0f), zyjVar, function03, q5tVar2, function07, c0gVar2, function06);
        if ((i16 & 57344) != 16384) {
        }
        K = oq5Var2.K();
        if (!z6) {
        }
        K = new i32(10, z2);
        oq5Var2.k0(K);
        final o0k o0kVar62 = o0kVar4;
        final long j82 = j4;
        final boolean z92 = z4;
        final c0g c0gVar42 = c0gVar2;
        final q5t q5tVar32 = q5tVar2;
        final Function0 function0102 = function07;
        final pyc pycVar52 = pycVar3;
        final Function0 function0112 = function06;
        int i272 = i16 >> 6;
        boolean z102 = z5;
        tyf.j(z82, z, function0, nfp.b(e02, false, (Function1) K), function02, z102, ild.C(-2092834461, new Function2() { // from class: lxq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.foundation.layout.b bVar;
                kb5 kb5Var;
                kjn kjnVar;
                iz2 iz2Var;
                kb5 kb5Var2;
                kb5 kb5Var3;
                kb5 kb5Var4;
                float f2;
                boolean z11;
                int i28;
                c0g c0gVar5;
                c0g c0gVar6;
                grb grbVar;
                rba rbaVar2;
                kjn kjnVar2;
                boolean z12;
                boolean z13;
                boolean z14;
                c0g c0gVar7;
                boolean z15;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                iz2 iz2Var2 = b2c.b;
                kfh d = ug3.d(iz2Var2, false);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i29 = oq5Var4.P;
                androidx.compose.runtime.internal.a l = oq5Var4.l();
                vci vciVar = vci.a;
                yci H = vnj.H(hq5Var2, vciVar);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(hq5Var2, d, kb5Var5);
                kb5 kb5Var6 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var6);
                kb5 kb5Var7 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i29))) {
                    ouj.x(i29, oq5Var4, i29, kb5Var7);
                }
                kb5 kb5Var8 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var8);
                iz2 iz2Var3 = b2c.f;
                androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.a;
                yci c = b.c(bVar2.a(vciVar, iz2Var3), "track_selected", Boolean.valueOf(z92));
                nho a = lho.a(qx0.a, b2c.l, hq5Var2, 48);
                int i30 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var2, c);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a, kb5Var5);
                g0g.U(hq5Var2, l2, kb5Var6);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i30))) {
                    ouj.x(i30, oq5Var4, i30, kb5Var7);
                }
                g0g.U(hq5Var2, H2, kb5Var8);
                kfh d2 = ug3.d(b2c.e, false);
                int i31 = oq5Var4.P;
                androidx.compose.runtime.internal.a l3 = oq5Var4.l();
                yci H3 = vnj.H(hq5Var2, vciVar);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, d2, kb5Var5);
                g0g.U(hq5Var2, l3, kb5Var6);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i31))) {
                    ouj.x(i31, oq5Var4, i31, kb5Var7);
                }
                g0g.U(hq5Var2, H3, kb5Var8);
                wn5Var.invoke(hq5Var2, 0);
                oq5Var4.p(true);
                u1g.l(hq5Var2, d.r(vciVar, nxqVar62.a));
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci o = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(true, 1.0f), 0.0f, mu0.b, 1);
                kfh d3 = ug3.d(iz2Var2, false);
                int i32 = oq5Var4.P;
                androidx.compose.runtime.internal.a l4 = oq5Var4.l();
                yci H4 = vnj.H(hq5Var2, o);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, d3, kb5Var5);
                g0g.U(hq5Var2, l4, kb5Var6);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i32))) {
                    ouj.x(i32, oq5Var4, i32, kb5Var7);
                }
                g0g.U(hq5Var2, H4, kb5Var8);
                wn5Var2.invoke(hq5Var2, 0);
                oq5Var4.p(true);
                float f3 = 8;
                u1g.l(hq5Var2, d.r(vciVar, f3));
                yci a2 = androidx.compose.ui.platform.a.a(d.m(vciVar, 16), "download_icon");
                rba rbaVar3 = rbaVar;
                weo.d(rbaVar3, b.c(a2, "download_status", rbaVar3), hq5Var2, 0);
                c0g c0gVar8 = c0g.a;
                c0g c0gVar9 = c0gVar42;
                kjn kjnVar3 = gq5.a;
                if (c0gVar9 != c0gVar8) {
                    oq5Var4.Z(-768950814);
                    yci l5 = androidx.compose.foundation.layout.a.l(d.m(vciVar, 40), o0kVar62);
                    Object K2 = oq5Var4.K();
                    if (K2 == kjnVar3) {
                        c0gVar7 = c0gVar8;
                        K2 = new xnq(20);
                        oq5Var4.k0(K2);
                    } else {
                        c0gVar7 = c0gVar8;
                    }
                    yci a3 = nfp.a(l5, (Function1) K2);
                    kfh d4 = ug3.d(iz2Var2, false);
                    int i33 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l6 = oq5Var4.l();
                    yci H5 = vnj.H(hq5Var2, a3);
                    oq5Var4.d0();
                    iz2Var = iz2Var2;
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar2);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(hq5Var2, d4, kb5Var5);
                    g0g.U(hq5Var2, l6, kb5Var6);
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i33))) {
                        ouj.x(i33, oq5Var4, i33, kb5Var7);
                    }
                    g0g.U(hq5Var2, H5, kb5Var8);
                    Function0 function012 = function0112;
                    if (function012 == null) {
                        oq5Var4.Z(-799792505);
                        Object K3 = oq5Var4.K();
                        if (K3 == kjnVar3) {
                            K3 = new nrq(7);
                            oq5Var4.k0(K3);
                        }
                        function012 = (Function0) K3;
                        z15 = false;
                    } else {
                        z15 = false;
                        oq5Var4.Z(1359673098);
                    }
                    oq5Var4.p(z15);
                    bVar = bVar2;
                    kjnVar = kjnVar3;
                    kb5Var2 = kb5Var5;
                    kb5Var3 = kb5Var6;
                    f2 = f3;
                    c0gVar5 = c0gVar7;
                    c0gVar6 = c0gVar9;
                    grbVar = grbVar2;
                    kb5Var4 = kb5Var7;
                    rbaVar2 = rbaVar3;
                    kb5Var = kb5Var8;
                    i28 = -775123255;
                    aae.a(function012, null, false, ild.C(-1832115620, new cu0(c0gVar9, j82, 4), hq5Var2), hq5Var2, 24576, 14);
                    oq5Var4.p(true);
                    z11 = false;
                } else {
                    bVar = bVar2;
                    kb5Var = kb5Var8;
                    kjnVar = kjnVar3;
                    iz2Var = iz2Var2;
                    kb5Var2 = kb5Var5;
                    kb5Var3 = kb5Var6;
                    kb5Var4 = kb5Var7;
                    f2 = f3;
                    z11 = false;
                    i28 = -775123255;
                    c0gVar5 = c0gVar8;
                    c0gVar6 = c0gVar9;
                    grbVar = grbVar2;
                    rbaVar2 = rbaVar3;
                    oq5Var4.Z(-775123255);
                }
                oq5Var4.p(z11);
                if (q5tVar32 != q5t.a) {
                    oq5Var4.Z(-767898860);
                    if (rbaVar2 == rba.a || c0gVar6 != c0gVar5) {
                        z13 = false;
                        oq5Var4.Z(i28);
                    } else {
                        oq5Var4.Z(-767808867);
                        u1g.l(hq5Var2, d.r(vciVar, f2));
                        z13 = false;
                    }
                    oq5Var4.p(z13);
                    Function0 function013 = function0102;
                    if (function013 == null) {
                        oq5Var4.Z(-767651449);
                        Object K4 = oq5Var4.K();
                        kjnVar2 = kjnVar;
                        if (K4 == kjnVar2) {
                            K4 = new nrq(8);
                            oq5Var4.k0(K4);
                        }
                        function013 = (Function0) K4;
                        z14 = false;
                    } else {
                        kjnVar2 = kjnVar;
                        z14 = false;
                        oq5Var4.Z(1083615149);
                    }
                    oq5Var4.p(z14);
                    agr agrVar = yre.a;
                    Object K5 = oq5Var4.K();
                    if (K5 == kjnVar2) {
                        K5 = new xnq(21);
                        oq5Var4.k0(K5);
                    }
                    aae.a(function013, androidx.compose.foundation.layout.a.q(nfp.a(MinimumInteractiveModifier.a, (Function1) K5), 0.0f, 0.0f, 4, 0.0f, 11), false, i4w.c, hq5Var2, 24576, 12);
                    z12 = false;
                } else {
                    kjnVar2 = kjnVar;
                    z12 = false;
                    oq5Var4.Z(i28);
                }
                oq5Var4.p(z12);
                kb5 kb5Var9 = kb5Var3;
                grb grbVar3 = grbVar;
                kb5 kb5Var10 = kb5Var2;
                kb5 kb5Var11 = kb5Var4;
                yci m = d.m(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f2, 0.0f, 11), 40);
                Object K6 = oq5Var4.K();
                if (K6 == kjnVar2) {
                    K6 = new xnq(22);
                    oq5Var4.k0(K6);
                }
                yci a4 = nfp.a(m, (Function1) K6);
                kfh d5 = ug3.d(iz2Var, false);
                int i34 = oq5Var4.P;
                androidx.compose.runtime.internal.a l7 = oq5Var4.l();
                yci H6 = vnj.H(hq5Var2, a4);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar3);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, d5, kb5Var10);
                g0g.U(hq5Var2, l7, kb5Var9);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i34))) {
                    ouj.x(i34, oq5Var4, i34, kb5Var11);
                }
                g0g.U(hq5Var2, H6, kb5Var);
                pycVar52.invoke(bVar, hq5Var2, 6);
                f1d.u(oq5Var4, true, true, true);
                return Unit.a;
            }
        }, oq5Var2), oq5Var2, ((i16 >> 9) & 896) | (i272 & 112) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i272 & 57344) | ((i15 << 15) & 458752), 0);
        oq5Var = oq5Var2;
        nxqVar3 = nxqVar62;
        o0kVar5 = o0kVar4;
        j5 = j4;
        c0gVar3 = c0gVar2;
        yciVar3 = yciVar2;
        z7 = z102;
        function08 = function07;
        function09 = function06;
        j6 = j72;
        pycVar4 = pycVar52;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l0(View view, Function1 function1) {
        view.getClass();
        view.getViewTreeObserver().addOnGlobalLayoutListener(new tvt(view, function1));
    }

    public static final void m(boolean z, zpd zpdVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        zpdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2027558784);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(zpdVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            yciVar2 = yciVar;
            j66.o(ild.C(-1709372174, new xu0(14, z), oq5Var), (uoi) K, yciVar2, null, null, ild.C(-256928848, new y04(zpdVar, z), oq5Var), oq5Var, (i2 & 896) | 199734, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(z, zpdVar, yciVar2, i);
        }
    }

    public static Object m0(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static final void n(ahs ahsVar, float f, float f2, pyc pycVar, pyc pycVar2, hq5 hq5Var, int i) {
        int i2;
        float f3;
        pyc pycVar3;
        float f4 = f;
        pyc pycVar4 = pycVar;
        pycVar4.getClass();
        pycVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(778566787);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ahsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f3 = f2;
            i2 |= oq5Var.c(f3) ? 256 : 128;
        } else {
            f3 = f2;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(pycVar4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            pycVar3 = pycVar2;
            i2 |= oq5Var.h(pycVar3) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            pycVar3 = pycVar2;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ahsVar instanceof ygs;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(878381490);
                swf.o(androidx.compose.ui.platform.a.a(vciVar, "shimmer"), oq5Var, 6);
                oq5Var.p(false);
            } else {
                if (!(ahsVar instanceof zgs)) {
                    throw vz1.i(oq5Var, 878380928, false);
                }
                oq5Var.Z(1460160490);
                zgs zgsVar = (zgs) ahsVar;
                List list = zgsVar.d;
                int size = list.size();
                if (size == 0) {
                    oq5Var.Z(1460186406);
                    i(zgsVar.b, 0, oq5Var, xp3.u(d.m(androidx.compose.ui.platform.a.a(vciVar, "placeholder"), f4), ugo.a(4)));
                    oq5Var.p(false);
                } else if (size != 1) {
                    oq5Var.Z(878403387);
                    p((ugs) CollectionsKt.Q(list), f4, f3, pycVar3, pycVar4, oq5Var, ((i2 << 3) & 57344) | (i2 & 1008) | ((i2 >> 3) & 7168));
                    f4 = f4;
                    pycVar4 = pycVar4;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(878397227);
                    o((ugs) CollectionsKt.Q(list), f4, pycVar4, oq5Var, ((i2 >> 3) & 896) | (i2 & 112));
                    oq5Var.p(false);
                }
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rgs(ahsVar, f4, f2, pycVar4, pycVar2, i, 0);
        }
    }

    public static final void o(ugs ugsVar, float f, pyc pycVar, hq5 hq5Var, int i) {
        int i2;
        ugsVar.getClass();
        pycVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(68495491);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ugsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(pycVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            yci m = d.m(b.c(androidx.compose.ui.platform.a.a(vci.a, "covers_single"), "cover_data", ugsVar), f);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
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
            pycVar.invoke(ugsVar, oq5Var, Integer.valueOf(((i2 >> 3) & 112) | (i2 & 14)));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fh6(ugsVar, f, pycVar, i);
        }
    }

    public static final void p(ugs ugsVar, float f, float f2, pyc pycVar, pyc pycVar2, hq5 hq5Var, int i) {
        int i2;
        pyc pycVar3;
        pyc pycVar4 = pycVar2;
        ugsVar.getClass();
        pycVar.getClass();
        pycVar4.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1688126183);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ugsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.c(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(pycVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(pycVar4) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            iz2 iz2Var = b2c.b;
            vci vciVar = vci.a;
            yci c = b.c(androidx.compose.ui.platform.a.a(d.m(vciVar, f), "covers_multiple"), "cover_data", ugsVar);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float f3 = f - f2;
            int i4 = i2;
            yci k = androidx.compose.foundation.layout.a.k(d.m(vciVar, f2), f3, 0.0f, 2);
            kfh d2 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, k);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            int i6 = i4 & 14;
            pycVar.invoke(ugsVar, oq5Var, Integer.valueOf(((i4 >> 6) & 112) | i6));
            oq5Var.p(true);
            yci k2 = androidx.compose.foundation.layout.a.k(d.m(vciVar, f2), 0.0f, f3, 1);
            kfh d3 = ug3.d(iz2Var, false);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, k2);
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
            Integer valueOf = Integer.valueOf(((i4 >> 9) & 112) | i6);
            pyc pycVar5 = pycVar2;
            pycVar5.invoke(ugsVar, oq5Var, valueOf);
            oq5Var.p(true);
            oq5Var.p(true);
            pycVar3 = pycVar5;
        } else {
            oq5Var.S();
            pycVar3 = pycVar4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rgs(ugsVar, f, f2, pycVar, pycVar3, i, 1);
        }
    }

    public static final void q(String str, String str2, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        str.getClass();
        str2.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1492471645);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            float f = 9;
            vci vciVar = vci.a;
            yci p = androidx.compose.foundation.layout.a.p(vciVar, 16, f, 4, f);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            ges j = nu0.j();
            agr agrVar = eq0.a;
            yciVar2 = vciVar;
            xcs.b(str, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var, i3 & 14, 3120, 55290);
            xcs.b(str2, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, (i3 >> 3) & 14, 3120, 55290);
            oq5Var = oq5Var;
            oq5Var.p(true);
            aae.a(function0, null, false, vq2.n, oq5Var, ((i3 >> 6) & 14) | 24576, 14);
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 13, str, str2, function0, yciVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final String str, final boolean z, final jzb jzbVar, ges gesVar, final boolean z2, int i, hq5 hq5Var, int i2, int i3) {
        int i4;
        ges gesVar2;
        int i5;
        ges gesVar3;
        final ges gesVar4;
        final int i6;
        int i7;
        int i8;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-24844575);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                gesVar2 = gesVar;
                if (oq5Var.f(gesVar2)) {
                    i8 = 2048;
                    i4 |= i8;
                }
            } else {
                gesVar2 = gesVar;
            }
            i8 = 1024;
            i4 |= i8;
        } else {
            gesVar2 = gesVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            i5 = i;
            i4 |= oq5Var.d(i5) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if ((i4 & 74899) == 74898 || !oq5Var.z()) {
                oq5Var.U();
                if ((i2 & 1) != 0 || oq5Var.y()) {
                    if ((i3 & 8) == 0) {
                        h6g h6gVar = nu0.a;
                        h6g h6gVar2 = h6g.c;
                        gesVar3 = nu0.j();
                    } else {
                        gesVar3 = gesVar2;
                    }
                    if (i9 == 0) {
                        gesVar4 = gesVar3;
                        i6 = 1;
                        oq5Var.q();
                        bg3.a(null, null, false, ild.C(1078555831, new pyc() { // from class: ixq
                            @Override // defpackage.pyc
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                long j;
                                xme xmeVar;
                                c cVar = (c) obj;
                                hq5 hq5Var2 = (hq5) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                cVar.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                }
                                if ((intValue & 19) == 18) {
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.z()) {
                                        oq5Var2.S();
                                        return Unit.a;
                                    }
                                }
                                boolean z3 = z2;
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (z3) {
                                    oq5Var3.Z(1405037246);
                                    j = ((dq0) oq5Var3.j(eq0.a)).b.a;
                                } else {
                                    oq5Var3.Z(1405038304);
                                    j = ((dq0) oq5Var3.j(eq0.a)).b.b;
                                }
                                oq5Var3.p(false);
                                long j2 = j;
                                if (z) {
                                    oq5 oq5Var4 = (oq5) hq5Var2;
                                    oq5Var4.Z(606571847);
                                    du0 du0Var = du0.c;
                                    agr agrVar = es5.h;
                                    jx7 jx7Var = (jx7) oq5Var4.j(agrVar);
                                    long D = v7g.D(jx7Var.p(du0Var.a) / jx7Var.i0(), 4294967296L);
                                    jx7 jx7Var2 = (jx7) oq5Var4.j(agrVar);
                                    xme xmeVar2 = new xme("videoshot", D, v7g.D(jx7Var2.p(du0Var.b) / jx7Var2.i0(), 4294967296L), ild.C(-1533730706, new bu0(j2, 0), oq5Var4));
                                    oq5Var4.p(false);
                                    xmeVar = xmeVar2;
                                } else {
                                    oq5 oq5Var5 = (oq5) hq5Var2;
                                    oq5Var5.Z(606644015);
                                    oq5Var5.p(false);
                                    xmeVar = null;
                                }
                                xme E = ox6.E(jzbVar, j2, hq5Var2, 2);
                                String str2 = str;
                                mn0 mn0Var = new mn0(6, str2, (ArrayList) null);
                                LinkedHashMap l = bow.l(xmeVar, E);
                                pn0 k = (xmeVar == null && E == null) ? null : bow.k(cVar, new xme[]{xmeVar, E});
                                yci a = androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "track_title");
                                oq5 oq5Var6 = (oq5) hq5Var2;
                                boolean f = oq5Var6.f(str2);
                                Object K = oq5Var6.K();
                                if (f || K == gq5.a) {
                                    K = new srp(str2, 5);
                                    oq5Var6.k0(K);
                                }
                                xv7.i(mn0Var, b.c(nfp.b(a, false, (Function1) K), "enabled", Boolean.valueOf(z3)), j2, 0L, 0L, 0, 0L, 2, false, i6, 0, l, null, gesVar4, k, null, oq5Var6, 0, 134217776, 612344);
                                return Unit.a;
                            }
                        }, oq5Var), oq5Var, 3072, 7);
                        i7 = i6;
                    } else {
                        gesVar4 = gesVar3;
                    }
                } else {
                    oq5Var.S();
                    gesVar4 = gesVar2;
                }
                i6 = i5;
                oq5Var.q();
                bg3.a(null, null, false, ild.C(1078555831, new pyc() { // from class: ixq
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        long j;
                        xme xmeVar;
                        c cVar = (c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.z()) {
                                oq5Var2.S();
                                return Unit.a;
                            }
                        }
                        boolean z3 = z2;
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (z3) {
                            oq5Var3.Z(1405037246);
                            j = ((dq0) oq5Var3.j(eq0.a)).b.a;
                        } else {
                            oq5Var3.Z(1405038304);
                            j = ((dq0) oq5Var3.j(eq0.a)).b.b;
                        }
                        oq5Var3.p(false);
                        long j2 = j;
                        if (z) {
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            oq5Var4.Z(606571847);
                            du0 du0Var = du0.c;
                            agr agrVar = es5.h;
                            jx7 jx7Var = (jx7) oq5Var4.j(agrVar);
                            long D = v7g.D(jx7Var.p(du0Var.a) / jx7Var.i0(), 4294967296L);
                            jx7 jx7Var2 = (jx7) oq5Var4.j(agrVar);
                            xme xmeVar2 = new xme("videoshot", D, v7g.D(jx7Var2.p(du0Var.b) / jx7Var2.i0(), 4294967296L), ild.C(-1533730706, new bu0(j2, 0), oq5Var4));
                            oq5Var4.p(false);
                            xmeVar = xmeVar2;
                        } else {
                            oq5 oq5Var5 = (oq5) hq5Var2;
                            oq5Var5.Z(606644015);
                            oq5Var5.p(false);
                            xmeVar = null;
                        }
                        xme E = ox6.E(jzbVar, j2, hq5Var2, 2);
                        String str2 = str;
                        mn0 mn0Var = new mn0(6, str2, (ArrayList) null);
                        LinkedHashMap l = bow.l(xmeVar, E);
                        pn0 k = (xmeVar == null && E == null) ? null : bow.k(cVar, new xme[]{xmeVar, E});
                        yci a = androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "track_title");
                        oq5 oq5Var6 = (oq5) hq5Var2;
                        boolean f = oq5Var6.f(str2);
                        Object K = oq5Var6.K();
                        if (f || K == gq5.a) {
                            K = new srp(str2, 5);
                            oq5Var6.k0(K);
                        }
                        xv7.i(mn0Var, b.c(nfp.b(a, false, (Function1) K), "enabled", Boolean.valueOf(z3)), j2, 0L, 0L, 0, 0L, 2, false, i6, 0, l, null, gesVar4, k, null, oq5Var6, 0, 134217776, 612344);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 3072, 7);
                i7 = i6;
            } else {
                oq5Var.S();
                gesVar4 = gesVar2;
                i7 = i5;
            }
            xmn r = oq5Var.r();
            if (r != null) {
                r.d = new jxq(str, z, jzbVar, gesVar4, z2, i7, i2, i3);
                return;
            }
            return;
        }
        i5 = i;
        if ((i4 & 74899) == 74898) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if (i9 == 0) {
        }
    }

    public static final void s(nav navVar, owu owuVar, yci yciVar, float f, hq5 hq5Var, int i) {
        int i2;
        owu owuVar2;
        yci yciVar2;
        float f2;
        d85 d85Var;
        navVar.getClass();
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(752995718);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(navVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            owuVar2 = owuVar;
            i2 |= oq5Var.h(owuVar2) ? 32 : 16;
        } else {
            owuVar2 = owuVar;
        }
        if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        int i3 = i2 | 3072;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            float f3 = 500;
            String str = navVar.a;
            m1u m1uVar = navVar.d;
            a4g.o(new lnu(str, navVar.b, (m1uVar == null || (d85Var = m1uVar.a) == null) ? d85.n : d85Var.a, new amu(navVar.c, null, null), null, null, m1uVar != null ? m1uVar.b : null, null, 176), owuVar2, yciVar2, f3, oq5Var, i3 & 8176, 0);
            f2 = f3;
        } else {
            oq5Var.S();
            f2 = f;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new og6(navVar, owuVar, yciVar, f2, i);
        }
    }

    public static final void t(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1127235120);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            y(i2 & 126, oq5Var, null, str, z);
            u1g.l(oq5Var, d.e(vci.a, 16));
            w(z, null, 0, false, oq5Var, (i2 >> 3) & 14, 14);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gb1(str, z, yciVar, i, 3);
        }
    }

    public static final void u(tgt tgtVar, jav javVar, oav oavVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        jav javVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1776576803);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(tgtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(javVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(oavVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean h = oq5Var2.h(javVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                lgq lgqVar = new lgq(1, javVar, jav.class, "onEntitySelect", "onEntitySelect(Lcom/yandex/music/shared/skeleton/blocks/ui/logic/api/waves/WavesBlockUiEntity;)V", 0, 29);
                javVar2 = javVar;
                oq5Var2.k0(lgqVar);
                K = lgqVar;
            } else {
                javVar2 = javVar;
            }
            Function1 function1 = (Function1) ((h9f) K);
            oav oavVar2 = tgtVar.c;
            vci vciVar = vci.a;
            z(tgtVar, function1, oavVar2, androidx.compose.ui.platform.a.a(vciVar, "waves_block_tabs"), oq5Var2, (i3 & 14) | 3072);
            u1g.l(oq5Var2, d.e(vciVar, 16));
            tt0.g(oavVar, null, null, "wavesContentCrossfade", ild.C(2002584912, new wav(javVar2, 1), oq5Var2), oq5Var2, ((i3 >> 6) & 14) | 27648, 6);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            javVar2 = javVar;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 17, tgtVar, javVar2, oavVar, yciVar);
        }
    }

    public static final void v(jav javVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        javVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(315795727);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(javVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            d8t e = i8t.e(gld.M(javVar.getState(), oq5Var).getValue(), "editorialWavesCrossfade", oq5Var, 48, 0);
            act S = weo.S(0, 0, null, 7);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new t0v(18);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            tt0.f(e, vciVar, S, (Function1) K, ild.C(-1926315110, new wav(javVar, 0), oq5Var), oq5Var, (i3 & 112) | 28032, 0);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(javVar, yciVar, i, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(boolean z, yci yciVar, int i, boolean z2, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        int i5;
        boolean z3;
        oq5 oq5Var;
        int i6;
        yci yciVar3;
        boolean z4;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1257857747);
        int i7 = (i2 & 6) == 0 ? (oq5Var2.g(z) ? 4 : 2) | i2 : i2;
        int i8 = i3 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i7 |= oq5Var2.f(yciVar2) ? 32 : 16;
            i4 = i3 & 4;
            if (i4 == 0) {
                i7 |= 384;
            } else if ((i2 & 384) == 0) {
                i7 |= oq5Var2.d(i) ? 256 : 128;
                i5 = i3 & 8;
                if (i5 != 0) {
                    i7 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    z3 = z2;
                    i7 |= oq5Var2.g(z3) ? 2048 : 1024;
                    if (oq5Var2.P(i7 & 1, (i7 & 1171) == 1170)) {
                        oq5Var = oq5Var2;
                        oq5Var.S();
                        i6 = i;
                        yciVar3 = yciVar2;
                        z4 = z3;
                    } else {
                        yci yciVar4 = i8 != 0 ? vci.a : yciVar2;
                        i6 = i4 != 0 ? 3 : i;
                        boolean z5 = i5 != 0 ? true : z3;
                        ArrayList arrayList = new ArrayList(i6);
                        for (int i9 = 0; i9 < i6; i9++) {
                            arrayList.add(Integer.valueOf(i9));
                        }
                        oq5Var = oq5Var2;
                        hld.l(arrayList, yciVar4, null, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, z5, false, false, ild.C(2089356390, new jn1(5, z), oq5Var2), oq5Var, (i7 & 112) | ((i7 << 18) & 1879048192), 432, 1532);
                        yciVar3 = yciVar4;
                        z4 = z5;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new vlu(z, yciVar3, i6, z4, i2, i3, 1);
                        return;
                    }
                    return;
                }
                z3 = z2;
                if (oq5Var2.P(i7 & 1, (i7 & 1171) == 1170)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            i5 = i3 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            if (oq5Var2.P(i7 & 1, (i7 & 1171) == 1170)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i3 & 4;
        if (i4 == 0) {
        }
        i5 = i3 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        if (oq5Var2.P(i7 & 1, (i7 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void x(oav oavVar, jav javVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-556842701);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(oavVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(javVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            ynn i3 = irv.i(oq5Var2);
            List list = oavVar.c;
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new q0v(3, oavVar);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            hld.l(list, yciVar2, (Function1) K, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, false, false, false, ild.C(843565230, new jv(24, javVar, i3), oq5Var2), oq5Var, (i2 >> 3) & 112, 384, 4088);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vav(oavVar, javVar, yciVar, i, 0);
        }
    }

    public static final void y(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        String str2;
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-949648871);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (oq5Var2.f(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(3);
            for (int i4 = 0; i4 < 3; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new t0v(17);
                oq5Var2.k0(K);
            }
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            ngg.h(str2, arrayList, 0, (Function1) K, ild.C(-2059029725, new jn1(6, z), oq5Var2), vciVar, 0L, 0L, false, null, 0.0f, 40, null, oq5Var, (i3 & 14) | 100691328 | ((i3 << 9) & 458752), 384, 11968);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ihe(str, z, yciVar2, i, 3);
        }
    }

    public static final void z(tgt tgtVar, Function1 function1, oav oavVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1879776674);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(tgtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(oavVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            String str = tgtVar.a;
            List list = tgtVar.b;
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new k32(8, function1);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            ngg.h(str, list, oavVar, (Function1) K, men.g, yciVar, 0L, 0L, false, null, 0.0f, 40, null, oq5Var, (i2 & 896) | 24576 | ((i2 << 6) & 458752), 384, 12224);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 16, tgtVar, function1, oavVar, yciVar);
        }
    }
}
