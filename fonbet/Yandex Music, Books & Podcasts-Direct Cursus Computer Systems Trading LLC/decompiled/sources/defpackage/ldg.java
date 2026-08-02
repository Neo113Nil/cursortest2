package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.track.TrackFadeDto;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class ldg {
    public static final int A(phn phnVar, IntRange intRange) {
        phnVar.getClass();
        intRange.getClass();
        if (intRange.isEmpty()) {
            kac.j(intRange, "Cannot get random in empty range: ");
            return 0;
        }
        int i = intRange.b;
        int i2 = intRange.a;
        return i < Integer.MAX_VALUE ? phnVar.e(i2, i + 1) : i2 > Integer.MIN_VALUE ? phnVar.e(i2 - 1, i) + 1 : phnVar.c();
    }

    public static final void B(View view, Function1 function1) {
        view.getClass();
        view.setOnClickListener(new fq2(view, function1));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0031. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List C(a7f a7fVar) {
        String str;
        if (a7fVar.peek() == 10) {
            a7fVar.u0();
            return c5b.a;
        }
        ArrayList n = tlm.n(a7fVar);
        while (a7fVar.hasNext()) {
            a7fVar.j();
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Map map = null;
            LinkedHashMap linkedHashMap = null;
            while (true) {
                str = "";
                while (a7fVar.hasNext()) {
                    String L = a7fVar.L();
                    switch (L.hashCode()) {
                        case -1809421292:
                            if (L.equals("extensions")) {
                                Object d0 = saf.d0(a7fVar);
                                map = d0 instanceof Map ? (Map) d0 : null;
                            } else {
                                if (linkedHashMap == null) {
                                    linkedHashMap = new LinkedHashMap();
                                }
                                linkedHashMap.put(L, saf.d0(a7fVar));
                            }
                        case -1197189282:
                            if (!L.equals("locations")) {
                                if (linkedHashMap == null) {
                                }
                                linkedHashMap.put(L, saf.d0(a7fVar));
                            } else if (a7fVar.peek() == 10) {
                                a7fVar.u0();
                                arrayList = null;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                a7fVar.m();
                                while (a7fVar.hasNext()) {
                                    a7fVar.j();
                                    int i = -1;
                                    int i2 = -1;
                                    while (a7fVar.hasNext()) {
                                        String L2 = a7fVar.L();
                                        if (Intrinsics.d(L2, "line")) {
                                            i = a7fVar.nextInt();
                                        } else if (Intrinsics.d(L2, "column")) {
                                            i2 = a7fVar.nextInt();
                                        } else {
                                            a7fVar.w();
                                        }
                                    }
                                    a7fVar.p();
                                    arrayList3.add(new c9n(i, i2, 3));
                                }
                                a7fVar.l();
                                arrayList = arrayList3;
                            }
                            break;
                        case 3433509:
                            if (!L.equals("path")) {
                                if (linkedHashMap == null) {
                                }
                                linkedHashMap.put(L, saf.d0(a7fVar));
                            } else if (a7fVar.peek() == 10) {
                                a7fVar.u0();
                                arrayList2 = null;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                a7fVar.m();
                                while (a7fVar.hasNext()) {
                                    int D = ouj.D(a7fVar.peek());
                                    if (D == 6 || D == 7) {
                                        arrayList4.add(Integer.valueOf(a7fVar.nextInt()));
                                    } else {
                                        String f0 = a7fVar.f0();
                                        f0.getClass();
                                        arrayList4.add(f0);
                                    }
                                }
                                a7fVar.l();
                                arrayList2 = arrayList4;
                            }
                            break;
                        case 954925063:
                            if (L.equals(Constants.KEY_MESSAGE)) {
                                String f02 = a7fVar.f0();
                                if (f02 == null) {
                                    break;
                                }
                                str = f02;
                            } else {
                                if (linkedHashMap == null) {
                                }
                                linkedHashMap.put(L, saf.d0(a7fVar));
                            }
                            break;
                        default:
                            if (linkedHashMap == null) {
                            }
                            linkedHashMap.put(L, saf.d0(a7fVar));
                            break;
                    }
                    while (a7fVar.hasNext()) {
                    }
                }
            }
            a7fVar.p();
            n.add(new web(str, arrayList, arrayList2, map, linkedHashMap));
        }
        a7fVar.l();
        return n;
    }

    public static final boolean D(tpi tpiVar, Object obj, Object obj2) {
        Object g = tpiVar.g(obj);
        if (g == null) {
            return false;
        }
        if (!(g instanceof upi)) {
            if (!g.equals(obj2)) {
                return false;
            }
            tpiVar.k(obj);
            return true;
        }
        upi upiVar = (upi) g;
        boolean m = upiVar.m(obj2);
        if (m && upiVar.h()) {
            tpiVar.k(obj);
        }
        return m;
    }

    public static final void E(tpi tpiVar, Object obj) {
        boolean z;
        long[] jArr = tpiVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = tpiVar.b[i4];
                        Object obj3 = tpiVar.c[i4];
                        if (obj3 instanceof upi) {
                            upi upiVar = (upi) obj3;
                            upiVar.m(obj);
                            z = upiVar.h();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            tpiVar.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final j48 F(j48 j48Var, j48 j48Var2) {
        int ordinal = j48Var2.ordinal();
        if (ordinal == 0) {
            return j48.a;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return j48.c;
            }
            b6e.s();
            return null;
        }
        int ordinal2 = j48Var.ordinal();
        if (ordinal2 == 0) {
            return j48.a;
        }
        if (ordinal2 == 1) {
            return j48.b;
        }
        if (ordinal2 == 2) {
            return j48.c;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(vzo vzoVar, yrj yrjVar, xdh xdhVar, boolean z, cg6 cg6Var) {
        f6i f6iVar;
        int i;
        xdh xdhVar2;
        k8q k8qVar;
        if (cg6Var instanceof f6i) {
            f6iVar = (f6i) cg6Var;
            int i2 = f6iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f6iVar.l = i2 - Integer.MIN_VALUE;
                f6i f6iVar2 = f6iVar;
                Object obj = f6iVar2.k;
                nm6 nm6Var = nm6.a;
                i = f6iVar2.l;
                u0s u0sVar = null;
                if (i != 0) {
                    qgg.h0(obj);
                    grh grhVar = (grh) xdhVar.b;
                    Pair c = grhVar.c();
                    n1p n1pVar = (n1p) c.a;
                    int intValue = ((Number) c.b).intValue();
                    tao taoVar = (tao) grhVar.d;
                    nmb nmbVar = (nmb) taoVar.d;
                    String str = (String) taoVar.b;
                    long b = ((zzp) taoVar.e).b();
                    mkb k = tao.k((c0p) taoVar.c);
                    String G = ((fnb) taoVar.a).G();
                    amb t = tao.t(tao.d(n1pVar));
                    nmbVar.getClass();
                    str.getClass();
                    G.getClass();
                    LinkedHashMap r = su4.r("search_session_id", str);
                    r.put("event_timestamp", String.valueOf(b));
                    r.put("page_id", k.a);
                    r.put("hash", G);
                    eta.m(intValue, "filter_type", t.a, "filter_pos", r);
                    dfi.p(2, "page_type", "landing", "_meta", r);
                    nmbVar.C("Search.SearchResultPage.Requested", r);
                    String str2 = yrjVar.a;
                    c0p c0pVar = yrjVar.b;
                    String str3 = yrjVar.c;
                    n1p n1pVar2 = yrjVar.d;
                    i8q i8qVar = new i8q(str2, false, c0pVar, str3, n1pVar2 != null ? n1pVar2.a : null);
                    f6iVar2.j = xdhVar;
                    f6iVar2.l = 1;
                    obj = vzo.c(vzoVar, i8qVar, 0, z, f6iVar2, 20);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    xdhVar2 = xdhVar;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdhVar2 = f6iVar2.j;
                    qgg.h0(obj);
                }
                k8qVar = (k8q) obj;
                if (k8qVar != null) {
                    String str4 = k8qVar.c;
                    xdhVar2.getClass();
                    jtc jtcVar = (jtc) xdhVar2.c;
                    grh grhVar2 = (grh) xdhVar2.b;
                    grhVar2.a = false;
                    grhVar2.b = false;
                    grhVar2.i = str4;
                    ((quk) grhVar2.g).getClass();
                    ((LinkedHashMap) grhVar2.f).clear();
                    jtcVar.b = str4;
                    if (k8qVar.h) {
                        sfm sfmVar = (sfm) jtcVar.a;
                        nmb nmbVar2 = (nmb) sfmVar.b;
                        String G2 = ((fnb) sfmVar.a).G();
                        wjb wjbVar = wjb.SearchScreen;
                        qkb qkbVar = qkb.Carousel;
                        nmb.m(nmbVar2, G2, wjbVar, null, null, null, null, null, "top", 1, true, "search_best_results", "SEARCH_BEST_RESULTS", 0, 0, 1, "search_request:".concat(str4), null, null, 0, 471164);
                    }
                }
                if (k8qVar != null) {
                    return null;
                }
                asj P = yd5.P(k8qVar);
                ArrayList arrayList = P.f;
                IntRange f = u75.f(arrayList);
                ArrayList arrayList2 = new ArrayList();
                ype it = f.iterator();
                while (it.c) {
                    Object next = it.next();
                    if (arrayList.get(((Number) next).intValue()) instanceof d4p) {
                        arrayList2.add(next);
                    }
                }
                grh grhVar3 = (grh) xdhVar2.b;
                Pair c2 = grhVar3.c();
                n1p n1pVar3 = (n1p) c2.a;
                int intValue2 = ((Number) c2.b).intValue();
                if (n1pVar3 != null) {
                    u0sVar = new u0s(n1pVar3.a, intValue2 + 1, intValue2 == 0);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    int intValue3 = ((Number) it2.next()).intValue();
                    jab jabVar = new jab(qkb.Q2vWave, 1, intValue3 + 1, 1);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) grhVar3.f;
                    Integer valueOf = Integer.valueOf(intValue3);
                    rmb a = ((tmb) grhVar3.e).a(jabVar, u0sVar);
                    a.g(1, "search_request:" + ((String) grhVar3.i));
                    linkedHashMap.put(valueOf, a);
                }
                return P;
            }
        }
        f6iVar = new f6i(cg6Var);
        f6i f6iVar22 = f6iVar;
        Object obj2 = f6iVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = f6iVar22.l;
        u0s u0sVar2 = null;
        if (i != 0) {
        }
        k8qVar = (k8q) obj2;
        if (k8qVar != null) {
        }
        if (k8qVar != null) {
        }
    }

    public static final void H(int i, View view) {
        view.getClass();
        Resources resources = view.getResources();
        ThreadLocal threadLocal = e3o.a;
        view.setBackgroundColor(resources.getColor(i, null));
    }

    public static final void I(int i, View view) {
        view.getClass();
        view.setBackgroundResource(i);
    }

    public static final void J(TextView textView, int i) {
        textView.getClass();
        textView.setTypeface(e3o.a(textView.getContext(), i));
    }

    public static final void K(TextView textView, int i) {
        textView.getClass();
        textView.setTextColor(textView.getContext().getResources().getColor(i, null));
    }

    public static final void L(TextView textView, int i) {
        textView.getClass();
        textView.setText(i);
    }

    public static final qvs M(TrackFadeDto trackFadeDto) {
        if (trackFadeDto.getInStart() == null) {
            return null;
        }
        double d = 1000;
        long doubleValue = (long) (trackFadeDto.getInStart().doubleValue() * d);
        if (trackFadeDto.getInStop() == null) {
            return null;
        }
        long doubleValue2 = (long) (trackFadeDto.getInStop().doubleValue() * d);
        if (trackFadeDto.getOutStart() == null) {
            return null;
        }
        long doubleValue3 = (long) (trackFadeDto.getOutStart().doubleValue() * d);
        if (trackFadeDto.getOutStop() == null) {
            return null;
        }
        return new qvs(doubleValue, doubleValue2, doubleValue3, (long) (trackFadeDto.getOutStop().doubleValue() * d));
    }

    public static final Uri N(String str) {
        str.getClass();
        return Uri.parse(str);
    }

    public static AbstractList O(myc mycVar, List list) {
        return list != null ? new jdg(mycVar, list) : new kdg(mycVar, list);
    }

    public static final aqi P(aqi aqiVar, fvf fvfVar, hq5 hq5Var) {
        aqiVar.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = szf.g0(Boolean.FALSE);
            oq5Var.k0(K);
        }
        aqi aqiVar2 = (aqi) K;
        Unit unit = Unit.a;
        boolean f = oq5Var.f(aqiVar) | oq5Var.f(fvfVar);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            fpq fpqVar = new fpq(aqiVar, fvfVar, aqiVar2, null, 14);
            oq5Var.k0(fpqVar);
            K2 = fpqVar;
        }
        gld.w(oq5Var, unit, (Function2) K2);
        return aqiVar2;
    }

    public static void Q(Object obj, Object obj2) {
        if (obj == null) {
            jj4.j("null key in entry: null=".concat(String.valueOf(obj2)));
        } else {
            if (obj2 != null) {
                return;
            }
            jj4.j(hrg.q("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void a(dsl dslVar, bci bciVar, yrl yrlVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-714023928);
        int i2 = i | (oq5Var.f(dslVar) ? 4 : 2) | (oq5Var.h(bciVar) ? 32 : 16) | (oq5Var.h(yrlVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean z = dslVar instanceof csl;
            boolean h = ((i2 & 14) == 4) | oq5Var.h(yrlVar) | oq5Var.h(mm6Var);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new p3e(15, dslVar, yrlVar, mm6Var);
                oq5Var.k0(K2);
            }
            vq1.g(yciVar, bciVar, z, (Function1) K2, oq5Var, (i2 & 112) | 70, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(dslVar, bciVar, yrlVar, yciVar, i, 29);
        }
    }

    public static final void b(jbm jbmVar, tmb tmbVar, hq5 hq5Var, int i) {
        ybm ybmVar;
        boolean z;
        boolean z2;
        jbm jbmVar2 = jbmVar;
        jbmVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1202693827);
        int i2 = (oq5Var.h(jbmVar2) ? 4 : 2) | i | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ybm ybmVar2 = (ybm) gld.M(jbmVar2.e, oq5Var).getValue();
            aqi O = gld.O(jbmVar2.g, oq5Var);
            aqi O2 = gld.O(jbmVar2.f, oq5Var);
            mud O3 = vnj.O(bcb.a(oq5Var), jbmVar2.j, oq5Var);
            boolean z3 = ybmVar2 instanceof ubm;
            ogp.g.e(ybmVar2 instanceof sbm, z3, null, oq5Var, 4096, 4);
            kjn kjnVar = gq5.a;
            if (z3) {
                oq5Var.Z(-833752953);
                float e = zs4.e(oq5Var);
                vci vciVar = vci.a;
                yci c = d.c(a.q(vciVar, 0.0f, 0.0f, 0.0f, e, 7), 1.0f);
                kfh d = ug3.d(b2c.b, false);
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
                g0g.U(oq5Var, d, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var, i3, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                boolean h = oq5Var.h(jbmVar2);
                Object K = oq5Var.K();
                if (h || K == kjnVar) {
                    z = true;
                    z2 = false;
                    ayl aylVar = new ayl(0, jbmVar2, jbm.class, "onBackClick", "onBackClick()V", 0, 22);
                    oq5Var.k0(aylVar);
                    K = aylVar;
                } else {
                    z = true;
                    z2 = false;
                }
                Function0 function0 = (Function0) ((h9f) K);
                boolean h2 = oq5Var.h(jbmVar2);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    ayl aylVar2 = new ayl(0, jbmVar2, jbm.class, "onSearchClick", "onSearchClick()V", 0, 23);
                    oq5Var.k0(aylVar2);
                    K2 = aylVar2;
                }
                Function0 function02 = (Function0) ((h9f) K2);
                boolean h3 = oq5Var.h(jbmVar2);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar) {
                    ayl aylVar3 = new ayl(0, jbmVar2, jbm.class, "onOverflowClick", "onOverflowClick()V", 0, 24);
                    oq5Var.k0(aylVar3);
                    K3 = aylVar3;
                }
                tt0.l("", O3, function0, function02, (Function0) ((h9f) K3), d.d(vciVar, 1.0f), oq5Var, 196614);
                oq5Var.p(z);
                oq5Var.p(z2);
                jbmVar2 = jbmVar;
            } else if (ybmVar2 instanceof wbm) {
                oq5Var.Z(-833040666);
                boolean booleanValue = ((Boolean) gld.M(jbmVar2.h, oq5Var).getValue()).booleanValue();
                boolean h4 = oq5Var.h(jbmVar2);
                Object K4 = oq5Var.K();
                if (h4 || K4 == kjnVar) {
                    ybmVar = ybmVar2;
                    ayl aylVar4 = new ayl(0, jbmVar2, jbm.class, "onRefresh", "onRefresh()V", 0, 25);
                    oq5Var.k0(aylVar4);
                    K4 = aylVar4;
                } else {
                    ybmVar = ybmVar2;
                }
                jbmVar2 = jbmVar;
                bcx.j(booleanValue, (Function0) ((h9f) K4), ild.C(-1567936561, new pli((wbm) ybmVar, jbmVar2, O3, O2, O, 10), oq5Var), oq5Var, 384);
                oq5Var.p(false);
            } else if (Intrinsics.d(ybmVar2, sbm.a)) {
                oq5Var.Z(-831218269);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-861382087, new dbm(jbmVar2, tmbVar), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!(ybmVar2 instanceof xbm)) {
                    throw vz1.i(oq5Var, -442535245, false);
                }
                oq5Var.Z(-830126542);
                q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(-1206297832, new wcj(20, (xbm) ybmVar2, jbmVar2), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dbm(jbmVar2, tmbVar, i);
        }
    }

    public static final void c(ixm ixmVar, yci yciVar, int i, int i2, hq5 hq5Var, int i3) {
        yci yciVar2;
        int i4;
        int i5;
        float f;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        grb grbVar;
        kwm kwmVar;
        kb5 kb5Var4;
        vci vciVar;
        ixm ixmVar2 = ixmVar;
        ixmVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1174372652);
        int i6 = i3 | (oq5Var.f(ixmVar2) ? 4 : 2) | 3504;
        if (oq5Var.P(i6 & 1, (i6 & 1171) != 1170)) {
            kwm kwmVar2 = ixmVar2.c;
            int i7 = i6 & 14;
            boolean z = i7 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                ebm ebmVar = new ebm(0, ixmVar, ixm.class, "promoLinkClicked", "promoLinkClicked()V", 0, 22);
                ixmVar2 = ixmVar;
                oq5Var.k0(ebmVar);
                K = ebmVar;
            }
            vci vciVar2 = vci.a;
            yci e = d.e(d.d(a.n(androidx.compose.foundation.a.e(vciVar2, false, null, null, (Function0) ((h9f) K), 7), 16, 10), 1.0f), 84);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new gkm(8);
                oq5Var.k0(K2);
            }
            yci b = nfp.b(e, false, (Function1) K2);
            ynn i8 = irv.i(oq5Var);
            boolean z2 = i7 == 4;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                K3 = new ucm(5, ixmVar2);
                oq5Var.k0(K3);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(b, i8, 0L, 0.0f, null, (Function2) K3, 14);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i9 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, a, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var, i9, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var, H, kb5Var8);
            String str = kwmVar2.c;
            if (str == null) {
                oq5Var.Z(1918885120);
                oq5Var.p(false);
                vciVar = vciVar2;
                f = 1.0f;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                kb5Var3 = kb5Var7;
                grbVar = grbVar2;
                kwmVar = kwmVar2;
                kb5Var4 = kb5Var5;
            } else {
                oq5Var.Z(1918885121);
                f = 1.0f;
                kb5Var = kb5Var6;
                kb5Var2 = kb5Var8;
                kb5Var3 = kb5Var7;
                grbVar = grbVar2;
                kwmVar = kwmVar2;
                kb5Var4 = kb5Var5;
                vciVar = vciVar2;
                p1g.a(str, null, d.m(a.m(vciVar2, 4), 64), null, null, null, hd6.a, 0.0f, null, 0, oq5Var, 1573296, 952);
                oq5Var.p(false);
            }
            if (f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci q = a.q(new LayoutWeightElement(true, f), 12, 0.0f, 0.0f, 0.0f, 14);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i10 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var4);
            g0g.U(oq5Var, l2, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var, i10, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var2);
            if (f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, f > Float.MAX_VALUE ? Float.MAX_VALUE : f);
            String str2 = kwmVar.a;
            ges j = nu0.j();
            agr agrVar = eq0.a;
            kwm kwmVar3 = kwmVar;
            xcs.b(str2, layoutWeightElement, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, j, oq5Var, 0, 3120, 55288);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(kwmVar3.b, a.q(new LayoutWeightElement(false, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), 0.0f, 4, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, nu0.i(), oq5Var, 0, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
            float f2 = 24;
            vci vciVar3 = vciVar;
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_24, 0, oq5Var), rvf.M(R.string.arrow_icon_go_description, oq5Var), wyf.R(d.m(a.q(vciVar3, f2, 0.0f, 0.0f, 0.0f, 14), f2)), ((dq0) oq5Var.j(agrVar)).a.c, oq5Var, 0, 0);
            oq5Var.p(true);
            i5 = 2;
            yciVar2 = vciVar3;
            i4 = 2;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            i4 = i;
            i5 = i2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uf4(ixmVar, yciVar2, i4, i5, i3);
        }
    }

    public static final void d(n9b n9bVar, o0m o0mVar, yrl yrlVar) {
        switch (o0mVar.ordinal()) {
            case 0:
                u7g.n(n9bVar, new msj(0, yrlVar, yrl.class, "onShareClick", "onShareClick()V", 0, 15));
                break;
            case 1:
                wxf.b(n9bVar, new msj(0, yrlVar, yrl.class, "onPlayNextClick", "onPlayNextClick()V", 0, 16));
                break;
            case 2:
                up6.a(n9bVar, new msj(0, yrlVar, yrl.class, "onAddToQueueClick", "onAddToQueueClick()V", 0, 17));
                break;
            case 3:
                vq1.f(n9bVar, new msj(0, yrlVar, yrl.class, "onDevicePickerClick", "onDevicePickerClick()V", 0, 18));
                break;
            case 4:
                msj msjVar = new msj(0, yrlVar, yrl.class, "onRenameClick", "onRenameClick()V", 0, 19);
                n9bVar.getClass();
                n9bVar.a.a(new wn5(new ucm(13, msjVar), -825510622, true));
                break;
            case 5:
                msj msjVar2 = new msj(0, yrlVar, yrl.class, "onEditClick", "onEditClick()V", 0, 20);
                n9bVar.getClass();
                n9bVar.a.a(new wn5(new nha(5, msjVar2), 944576994, true));
                break;
            case 6:
                msj msjVar3 = new msj(0, yrlVar, yrl.class, "onAddTracksClick", "onAddTracksClick()V", 0, 21);
                n9bVar.getClass();
                n9bVar.a.a(new wn5(new q2(2, msjVar3), 1246652186, true));
                break;
            case 7:
                msj msjVar4 = new msj(0, yrlVar, yrl.class, "onDeleteClick", "onDeleteClick()V", 0, 22);
                n9bVar.getClass();
                n9bVar.a.a(new wn5(new zk(13, msjVar4), -167115646, true));
                break;
            default:
                b6e.s();
                break;
        }
    }

    public static final void e(hvq hvqVar, yci yciVar, hq5 hq5Var, int i) {
        vci vciVar;
        hvq hvqVar2;
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-883061876);
        int i2 = (oq5Var.h(hvqVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            hvqVar2 = hvqVar;
        } else {
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
            jmj f = hvqVar.f(((i2 << 3) & 112) | 6, oq5Var);
            iz2 iz2Var = b2c.f;
            b bVar = b.a;
            vci vciVar2 = vci.a;
            ivf.g(f, bVar.a(vciVar2, iz2Var), false, null, oq5Var, 0, 12);
            boolean h = oq5Var.h(hvqVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                vciVar = vciVar2;
                vuq vuqVar = new vuq(0, hvqVar, hvq.class, "onBackClick", "onBackClick()V", 0, 0);
                hvqVar2 = hvqVar;
                oq5Var.k0(vuqVar);
                K = vuqVar;
            } else {
                hvqVar2 = hvqVar;
                vciVar = vciVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            WeakHashMap weakHashMap = rqv.w;
            gwq.b(function0, a.l(vciVar, p6g.n(z7l.h(oq5Var).f, oq5Var)), null, null, oq5Var, 0, 12);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(hvqVar2, yciVar, i, 27);
        }
    }

    public static final void f(owu owuVar, lnu lnuVar, klu kluVar, yci yciVar, hq5 hq5Var, int i) {
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1214205353);
        int i2 = (oq5Var.h(owuVar) ? 4 : 2) | i | (oq5Var.f(lnuVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(kluVar) ? 256 : 128;
        }
        int i3 = i2 | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) oq5Var.j((agr) spg.d.c)).booleanValue();
            ssg.a(3, null, "wave agent ui data " + kluVar, null);
            if (!booleanValue || kluVar == null) {
                oq5Var.Z(177659120);
                float f = 16;
                a4g.o(lnuVar, owuVar, d.x(d.d(a.q(yciVar, f, 0.0f, f, 0.0f, 10), 1.0f), b2c.f, 2), 0.0f, oq5Var, ((i3 >> 3) & 14) | ((i3 << 3) & 112), 8);
                oq5Var.p(false);
            } else {
                oq5Var.Z(177475786);
                int i4 = i3 & 14;
                int i5 = i3 >> 3;
                g(owuVar, kluVar, yciVar, oq5Var, (i5 & 896) | i4 | (i5 & 112));
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 22, owuVar, lnuVar, kluVar, yciVar);
        }
    }

    public static final void g(owu owuVar, klu kluVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        owuVar.getClass();
        kluVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-301878015);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(owuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(kluVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            aqi M = gld.M(owuVar.c(), oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            long f = c3x.f(kluVar.e);
            yci e = d.e(d.d(yciVar, 1.0f), 112);
            boolean h = oq5Var.h(owuVar) | oq5Var.f(M);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new zp(owuVar, M, i3);
                oq5Var.k0(K2);
            }
            yci d = androidx.compose.foundation.a.d(e, uoiVar, null, false, null, null, (Function0) K2, 28);
            Object K3 = oq5Var.K();
            if (K3 == obj) {
                K3 = new coi(7);
                oq5Var.k0(K3);
            }
            yci b = nfp.b(d, false, (Function1) K3);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            w4k E = a0g.E(R.drawable.path, 0, oq5Var);
            b bVar = b.a;
            vci vciVar = vci.a;
            irf.r(E, null, bVar.b(vciVar), null, hd6.g, 0.0f, new d43(f, 5), oq5Var, 24624, 40);
            hz2 hz2Var = b2c.l;
            float f2 = 16;
            yci o = a.o(d.d(vciVar, 1.0f), 0.0f, f2, 1);
            nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, o);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var = oq5Var;
            y1g.t(kluVar, (qmu) M.getValue(), d.m(vciVar, 80), uoiVar, null, oq5Var, ((i2 >> 3) & 14) | 28032, 0);
            u1g.l(oq5Var, d.r(vciVar, f2));
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            String str = kluVar.a;
            ges j = nu0.j();
            agr agrVar = eq0.a;
            xv7.j(str, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, j, oq5Var, 0, 3120, 55290);
            String str2 = kluVar.b;
            if (str2 == null) {
                oq5Var.Z(829733568);
                oq5Var.p(false);
            } else {
                oq5Var.Z(829733569);
                xv7.j(str2, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55290);
                eta.p(vciVar, 4, oq5Var, false);
            }
            f1d.u(oq5Var, true, true, true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(owuVar, kluVar, yciVar, i, 23);
        }
    }

    public static final void h(int i, int i2, Function0 function0, yci yciVar, hq5 hq5Var, int i3) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1685273119);
        int i4 = i3 | (oq5Var.d(i) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | 3072;
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci o = a.o(androidx.compose.foundation.a.e(d.d(d.g(vciVar, 48, 0.0f, 2), 1.0f), false, null, null, function0, 7), 16, 0.0f, 2);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new xlu(23);
                oq5Var.k0(K);
            }
            yci b = nfp.b(o, true, (Function1) K);
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            w4k E = a0g.E(i, i4 & 14, oq5Var);
            yci m = d.m(a.q(vciVar, 8, 0.0f, 0.0f, 0.0f, 14), 24);
            agr agrVar = eq0.a;
            gae.b(E, null, m, ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 432, 0);
            xcs.b(rvf.M(i2, oq5Var), a.q(d.d(vciVar, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qtb(i, i2, function0, yciVar2, i3);
        }
    }

    public static final void i(dwv dwvVar, sdr sdrVar, hq5 hq5Var, int i) {
        dwvVar.getClass();
        sdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-38276510);
        if ((((oq5Var.f(dwvVar) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ixf.p(gld.O(dwvVar.a, oq5Var).getValue(), d.e(vci.a, Math.max((10 * 2) + w1g.p(neg.t(oq5Var).a.b, 0, oq5Var, 0, 2), 40)), "genre button state transition animation", null, null, ild.C(-1931747172, new jv(25, dwvVar, sdrVar), oq5Var), oq5Var, 196992, 24);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(dwvVar, sdrVar, i, 12);
        }
    }

    public static final void j(hwv hwvVar, dwv dwvVar, sdr sdrVar, hq5 hq5Var, int i) {
        long j;
        yci b;
        jzk jzkVar = vnj.i;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1569364627);
        int i2 = i | (oq5Var.f(hwvVar) ? 4 : 2) | (oq5Var.f(dwvVar) ? 32 : 16) | (oq5Var.f(sdrVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean booleanValue = ((Boolean) gld.O(dwvVar.b, oq5Var).getValue()).booleanValue();
            vci vciVar = vci.a;
            if (booleanValue) {
                oq5Var.Z(-2072079078);
                j = kg5.r(R.color.text_primary_day, oq5Var);
                b = androidx.compose.foundation.a.b(xp3.u(vciVar, ugo.a), kg5.r(R.color.bg_primary_day, oq5Var), jzkVar);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-2071860342);
                agr agrVar = eq0.a;
                j = ((dq0) oq5Var.j(agrVar)).b.a;
                b = androidx.compose.foundation.a.b(androidx.compose.foundation.a.b(xp3.u(vciVar, ugo.a), ((dq0) oq5Var.j(agrVar)).c.b, jzkVar), ((dq0) oq5Var.j(agrVar)).d.e, jzkVar);
                oq5Var.p(false);
            }
            yci yciVar = b;
            boolean booleanValue2 = ((Boolean) sdrVar.getValue()).booleanValue();
            boolean z = (i2 & 112) == 32;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new jvu(27, dwvVar);
                oq5Var.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(yciVar, booleanValue2, null, null, (Function0) K, 6);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e);
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
            xcs.b(hwvVar.b, a.n(vciVar, 16, 10), j, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var).a.b, oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(hwvVar, dwvVar, sdrVar, i, 17);
        }
    }

    public static final Object k(l7q l7qVar, m7q m7qVar) {
        l7qVar.getClass();
        if (l7qVar instanceof t7u) {
            m7qVar.s((t7u) l7qVar);
            return null;
        }
        if (l7qVar instanceof lzu) {
            return m7qVar.C((lzu) l7qVar);
        }
        if (l7qVar instanceof hoc) {
            m7qVar.o((hoc) l7qVar);
            return null;
        }
        if (l7qVar instanceof v4d) {
            m7qVar.d((v4d) l7qVar);
            return null;
        }
        if (l7qVar instanceof pnw) {
            return m7qVar.w((pnw) l7qVar);
        }
        if (l7qVar instanceof xhd) {
            return m7qVar.r((xhd) l7qVar);
        }
        kac.j(l7qVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static final void l(tpi tpiVar, Object obj, Object obj2) {
        int f = tpiVar.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : tpiVar.c[f];
        if (obj3 != null) {
            if (obj3 instanceof upi) {
                ((upi) obj3).a(obj2);
            } else if (obj3 != obj2) {
                upi upiVar = new upi();
                upiVar.a(obj3);
                upiVar.a(obj2);
                obj2 = upiVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            tpiVar.c[f] = obj2;
            return;
        }
        int i = ~f;
        tpiVar.b[i] = obj;
        tpiVar.c[i] = obj2;
    }

    public static int m(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, androidx.core.app.g.b(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static tpi n() {
        long[] jArr = vso.a;
        return new tpi();
    }

    public static boolean o(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean p = p(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return p;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean p(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static hdg q(int i, String str, String str2) {
        String str3;
        int D = ouj.D(i);
        if (D == 0) {
            return new mir(str, str2);
        }
        if (D == 1) {
            try {
                return new lir(str, Long.parseLong(str2));
            } catch (NumberFormatException e) {
                throw new oir(null, e, 1);
            }
        }
        if (D == 2) {
            Boolean p0 = StringsKt.p0(str2);
            if (p0 == null) {
                try {
                    p0 = pd.a0(Integer.parseInt(str2));
                    if (p0 == null) {
                        throw new oir(hrg.q("Unable to convert ", str2, " to boolean"), null, 2);
                    }
                } catch (NumberFormatException e2) {
                    throw new oir(null, e2, 1);
                }
            }
            return new hir(str, p0.booleanValue());
        }
        if (D == 3) {
            try {
                return new kir(str, Double.parseDouble(str2));
            } catch (NumberFormatException e3) {
                throw new oir(null, e3, 1);
            }
        }
        if (D == 4) {
            return new iir(str, bow.v(str2));
        }
        if (D == 5) {
            try {
                try {
                    new URL(str2);
                    return new nir(str, str2);
                } catch (IllegalArgumentException e4) {
                    throw new oir(null, e4, 1);
                }
            } catch (MalformedURLException unused) {
                throw new IllegalArgumentException("Invalid url ".concat(str2));
            }
        }
        switch (i) {
            case 1:
                str3 = "STRING";
                break;
            case 2:
                str3 = "INTEGER";
                break;
            case 3:
                str3 = "BOOLEAN";
                break;
            case 4:
                str3 = "NUMBER";
                break;
            case 5:
                str3 = "COLOR";
                break;
            case 6:
                str3 = "URL";
                break;
            case 7:
                str3 = "ARRAY";
                break;
            case 8:
                str3 = "DICT";
                break;
            default:
                str3 = "null";
                break;
        }
        throw new oir("Cannot create stored value of type = '" + str3 + "'.", null, 2);
    }

    public static final long r() {
        return Thread.currentThread().getId();
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean t(hdg hdgVar, long j, gc8 gc8Var, ii8 ii8Var) {
        Object obj;
        char c;
        String str;
        pir m = gc8Var.getDiv2Component$div_release().m();
        dfb a = gc8Var.getViewComponent$div_release().i().a(gc8Var.getDivData(), gc8Var.getDivTag());
        if (ii8Var == null) {
            ii8Var = ii8.GLOBAL;
        }
        String str2 = gc8Var.getDivTag().a;
        m.getClass();
        String g = f1d.g("stored_value_", hdgVar.X());
        int ordinal = ii8Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                b6e.s();
                return false;
            }
            g = "card_" + str2 + '_' + g;
        }
        boolean z = hdgVar instanceof mir;
        if (z ? true : hdgVar instanceof lir ? true : hdgVar instanceof hir ? true : hdgVar instanceof gir ? true : hdgVar instanceof jir ? true : hdgVar instanceof kir) {
            obj = hdgVar.Y();
        } else {
            if (!(hdgVar instanceof nir ? true : hdgVar instanceof iir)) {
                b6e.s();
                return false;
            }
            obj = hdgVar.Y().toString();
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            c = 1;
        } else if (hdgVar instanceof lir) {
            c = 2;
        } else if (hdgVar instanceof hir) {
            c = 3;
        } else if (hdgVar instanceof kir) {
            c = 4;
        } else if (hdgVar instanceof iir) {
            c = 5;
        } else if (hdgVar instanceof nir) {
            c = 6;
        } else if (hdgVar instanceof gir) {
            c = 7;
        } else {
            if (!(hdgVar instanceof jir)) {
                b6e.s();
                return false;
            }
            c = '\b';
        }
        switch (c) {
            case 1:
                str = PListParser.TAG_STRING;
                break;
            case 2:
                str = PListParser.TAG_INTEGER;
                break;
            case 3:
                str = "boolean";
                break;
            case 4:
                str = "number";
                break;
            case 5:
                str = "color";
                break;
            case 6:
                str = "url";
                break;
            case 7:
                str = PListParser.TAG_ARRAY;
                break;
            case '\b':
                str = PListParser.TAG_DICT;
                break;
            default:
                throw null;
        }
        jSONObject.put("type", str);
        jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
        jSONObject.put("lifetime", j);
        jSONObject.put(Constants.KEY_VALUE, obj);
        List<pin> c2 = t75.c(new oin(g, jSONObject));
        rin rinVar = (rin) m.a.getValue();
        rinVar.getClass();
        for (pin pinVar : c2) {
            rinVar.b.put(pinVar.getId(), pinVar);
        }
        z6n z6nVar = (z6n) rinVar.a.d;
        z6nVar.getClass();
        gcp gcpVar = new gcp(7, z6nVar, c2);
        ArrayList arrayList = new ArrayList();
        gcpVar.invoke(arrayList);
        uiq uiqVar = (uiq) z6nVar.b;
        yhr[] yhrVarArr = (yhr[]) arrayList.toArray(new yhr[0]);
        ArrayList arrayList2 = uiqVar.A(1, (yhr[]) Arrays.copyOf(yhrVarArr, yhrVarArr.length)).a;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(rin.a(arrayList2));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            a.a((qin) it.next());
        }
        return arrayList3.isEmpty();
    }

    public static nav u(String str) {
        return new nav(str.concat(" Шикарная музыка, она точно не перенесется на следующую строку"), "Моя волна по жанру", "https://avatars.mds.yandex.net/get-music-misc/49997/img.65fad527d8740b7c6f4e6a85/m400x400", new m1u(new d85(d85.k), new d85(d85.g)), "genre:shikarni", t75.c("genre:shikarni"));
    }

    public static File v(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final i2o w(cds cdsVar, int i) {
        bds bdsVar = cdsVar.a;
        ogi ogiVar = cdsVar.b;
        if (bdsVar.a.b.length() != 0) {
            int e = ogiVar.e(i);
            if ((i != 0 && e == ogiVar.e(i - 1)) || (i != bdsVar.a.b.length() && e == ogiVar.e(i + 1))) {
                return cdsVar.a(i);
            }
        }
        return cdsVar.f(i);
    }

    public static final yci x(hq5 hq5Var, yci yciVar) {
        Object ibhVar;
        aqi aqiVar;
        yciVar.getClass();
        float f = 10;
        float f2 = 20;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = szf.g0(gbh.e);
            oq5Var.k0(K);
        }
        aqi aqiVar2 = (aqi) K;
        oq5Var.Z(-1751645394);
        gbh gbhVar = (gbh) aqiVar2.getValue();
        wje wjeVar = null;
        if (gbhVar.b != 0.0f && gbhVar.a > gbhVar.c) {
            oq5Var.Z(-84119186);
            wjeVar = fgq.s(fgq.D(null, oq5Var, 1), 0.0f, -gbhVar.b, weo.C(new act(gbhVar.d, 1000, nya.d), jyn.a, 0L, 4), null, oq5Var, 4152, 8);
            oq5Var.p(false);
        } else {
            oq5Var.Z(-83569401);
            oq5Var.p(false);
        }
        oq5Var.p(false);
        boolean f3 = oq5Var.f(wjeVar);
        Object K2 = oq5Var.K();
        if (f3 || K2 == kjnVar) {
            aqiVar = aqiVar2;
            ibhVar = new ibh(f, f2, aqiVar, wjeVar, 1);
            oq5Var.k0(ibhVar);
        } else {
            ibhVar = K2;
            aqiVar = aqiVar2;
        }
        vci vciVar = vci.a;
        yci b = androidx.compose.ui.layout.a.b(vciVar, (pyc) ibhVar);
        boolean f4 = oq5Var.f(wjeVar);
        Object K3 = oq5Var.K();
        if (f4 || K3 == kjnVar) {
            K3 = new jbh(wjeVar, aqiVar, 0);
            oq5Var.k0(K3);
        }
        yci b2 = androidx.compose.ui.draw.a.b(vciVar, (Function1) K3);
        yci v = xp3.v(yciVar);
        Object K4 = oq5Var.K();
        if (K4 == kjnVar) {
            K4 = new s2h(12);
            oq5Var.k0(K4);
        }
        return androidx.compose.ui.graphics.a.a(v, (Function1) K4).f(b2).f(b);
    }

    public static MappedByteBuffer y(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList z(Object... objArr) {
        int length = objArr.length;
        hld.w(length, "arraySize");
        ArrayList arrayList = new ArrayList(zc4.W(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
