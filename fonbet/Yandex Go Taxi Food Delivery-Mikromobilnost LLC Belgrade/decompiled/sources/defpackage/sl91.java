package defpackage;

import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class sl91 {
    public static final void a(String str, String str2, Long l, float f, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1460686328);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.k(l) ? 256 : 128) | (btsVar.b(f) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 o = an91.o(ljs0.c, 0.0f, cjb1.d(77.0f, 94.0f, f), 0.0f, cjb1.d(0.0f, 94.0f, f), 5);
            sic a = qic.a(new i43(16.0f, true, new quz(11)), x4c.H, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            h740.b(str, str2, f, false, btsVar, (i2 & HProv.PP_DELETE_SAVED_PASSWD) | ((i2 >> 3) & 896), 8);
            b(l, f, btsVar, (i2 >> 6) & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zvc(f, i, 1, str, str2, l);
        }
    }

    public static final void b(Long l, float f, fid fidVar, int i) {
        int i2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(196156823);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(l) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.b(f) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            long n = tje.n(appColor$Palette, btsVar);
            long n2 = tje.n(AppColor$Palette.Background, btsVar);
            long b = ldc.b(tje.n(AppColor$Palette.TextMinor, btsVar), 0.5f, 0.0f, 0.0f, 0.0f, 14);
            long b2 = ldc.b(tje.n(appColor$Palette, btsVar), 0.5f, 0.0f, 0.0f, 0.0f, 14);
            long b3 = ldc.b(n2, 0.5f, 0.0f, 0.0f, 0.0f, 14);
            long L = rzo.L(n, f, b);
            int i4 = up2.c;
            long L2 = rzo.L(n, f, b2);
            long L3 = rzo.L(n2, f, b3);
            float d = cjb1.d(38.0f, 30.0f, f);
            float d2 = cjb1.d(53.0f, 42.0f, f);
            float d3 = cjb1.d(10.0f, 8.0f, f);
            ety0 a = ety0.a(xya1.b(btsVar).i, 0L, uh6.E(32), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
            int i5 = i2;
            ety0 a2 = ety0.a(a, 0L, uh6.I(a.a.b, f, xya1.b(btsVar).i.a.b), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
            ety0 ety0Var = xya1.d(btsVar).h.a;
            ety0 a3 = ety0.a(ety0Var, 0L, uh6.I(ety0Var.a.b, f, xya1.d(btsVar).i.a.a.b), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
            if (f >= 1.0f || l == null || l.longValue() <= 0) {
                btsVar.e0(-1740973657);
                c530 c530Var = c530.a;
                f530 c = ljs0.c(c530Var, 1.0f);
                z910 d4 = pi6.d(x4c.y, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d5 = b.d(btsVar, c);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar, wlsVar, d4);
                wls wlsVar2 = d.e;
                qje.W(btsVar, wlsVar2, o);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar3 = d.g;
                qje.W(btsVar, wlsVar3, valueOf);
                tls tlsVar = d.h;
                qje.M(btsVar, tlsVar);
                wls wlsVar4 = d.d;
                qje.W(btsVar, wlsVar4, d5);
                lhl0 a4 = khl0.a(lr20.e, x4c.E, btsVar, 54);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d6 = b.d(btsVar, c530Var);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a4);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                qje.W(btsVar, wlsVar4, d6);
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.g(0, ohb1.c(awh0.mt_sdk_format_hours, 0, btsVar), new up2(L), new up2(L2), a2, new up2(L3), false, d, d2, d3, a3, btsVar, 6, 64);
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.h(new up2(L), btsVar, 0, 0);
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.g(0, ohb1.e(btsVar, cyh0.mt_sdk_format_min), new up2(L), new up2(L2), a2, new up2(L3), false, d, d2, d3, a3, btsVar, 6, 64);
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.h(new up2(L), btsVar, 0, 0);
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.g(0, ohb1.e(btsVar, cyh0.mt_sdk_format_sec), new up2(L), new up2(L2), a2, new up2(L3), false, d, d2, d3, a3, btsVar, 6, 64);
                i3 = 0;
                tse0.t(btsVar, true, true, false);
            } else {
                btsVar.e0(-1741096634);
                com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item.b.d(i5 & 14, l.longValue(), btsVar, null);
                i3 = 0;
                btsVar.t(false);
            }
        } else {
            i3 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i740(l, f, i, i3);
        }
    }

    public static au2 c(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((in41) it.next()).getClass());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((in41) it2.next()).getClass();
            ycc.r(EmptySet.a, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Class cls = (Class) next;
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (cls.isAssignableFrom((Class) it4.next())) {
                        break;
                    }
                }
            }
            arrayList3.add(next);
        }
        if (!arrayList3.isEmpty()) {
            ny61.g(g8e.q("Required contracts ", " are not found", arrayList3));
            return null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof xm41) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            ycc.r(((xm41) it5.next()).h(), arrayList5);
        }
        if (arrayList5.size() != a.N0(arrayList5).size()) {
            ny61.g("Multiple contracts cannot control one WebView container");
            return null;
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            it6.next();
        }
        if (arrayList6.size() <= 1) {
            return new au2(list);
        }
        ny61.g("Multiple contracts cannot control WebView insets");
        return null;
    }

    public static void d(tt5 tt5Var, final io.flutter.plugins.webviewflutter.b bVar) {
        xv10 xv10Var;
        rs10 ld2Var = (bVar == null || (xv10Var = bVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", ld2Var, obj);
        if (bVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i2 = i;
                    int i3 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i2) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i3, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", ld2Var, obj);
        if (bVar != null) {
            final int i2 = 2;
            m2vVar2.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i2;
                    int i3 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i3, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", ld2Var, obj);
        if (bVar != null) {
            final int i3 = 6;
            m2vVar3.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i3;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", ld2Var, obj);
        if (bVar != null) {
            final int i4 = 7;
            m2vVar4.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i4;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", ld2Var, obj);
        if (bVar != null) {
            final int i5 = 8;
            m2vVar5.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i5;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", ld2Var, obj);
        if (bVar != null) {
            final int i6 = 9;
            m2vVar6.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i6;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", ld2Var, obj);
        if (bVar != null) {
            final int i7 = 10;
            m2vVar7.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i7;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar7.G(null);
        }
        m2v m2vVar8 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", ld2Var, obj);
        if (bVar != null) {
            final int i8 = 12;
            m2vVar8.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i8;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar8.G(null);
        }
        m2v m2vVar9 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", ld2Var, obj);
        if (bVar != null) {
            final int i9 = 13;
            m2vVar9.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i9;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar9.G(null);
        }
        m2v m2vVar10 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", ld2Var, obj);
        if (bVar != null) {
            final int i10 = 14;
            m2vVar10.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i10;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar10.G(null);
        }
        m2v m2vVar11 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", ld2Var, obj);
        if (bVar != null) {
            final int i11 = 11;
            m2vVar11.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i11;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar11.G(null);
        }
        m2v m2vVar12 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", ld2Var, obj);
        if (bVar != null) {
            final int i12 = 15;
            m2vVar12.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i12;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar12.G(null);
        }
        m2v m2vVar13 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", ld2Var, obj);
        if (bVar != null) {
            final int i13 = 16;
            m2vVar13.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i13;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar13.G(null);
        }
        m2v m2vVar14 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", ld2Var, obj);
        if (bVar != null) {
            final int i14 = 17;
            m2vVar14.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i14;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar14.G(null);
        }
        m2v m2vVar15 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", ld2Var, obj);
        if (bVar != null) {
            final int i15 = 18;
            m2vVar15.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i15;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar15.G(null);
        }
        m2v m2vVar16 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", ld2Var, obj);
        if (bVar != null) {
            final int i16 = 19;
            m2vVar16.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i16;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar16.G(null);
        }
        m2v m2vVar17 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", ld2Var, obj);
        if (bVar != null) {
            final int i17 = 20;
            m2vVar17.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i17;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar17.G(null);
        }
        m2v m2vVar18 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", ld2Var, obj);
        if (bVar != null) {
            final int i18 = 21;
            m2vVar18.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i18;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar18.G(null);
        }
        m2v m2vVar19 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", ld2Var, obj);
        if (bVar != null) {
            final int i19 = 22;
            m2vVar19.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i19;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar19.G(null);
        }
        m2v m2vVar20 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", ld2Var, obj);
        if (bVar != null) {
            final int i20 = 1;
            m2vVar20.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i20;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar20.G(null);
        }
        m2v m2vVar21 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", ld2Var, obj);
        if (bVar != null) {
            final int i21 = 3;
            m2vVar21.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i22 = i21;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar21.G(null);
        }
        m2v m2vVar22 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", ld2Var, obj);
        if (bVar != null) {
            final int i22 = 4;
            m2vVar22.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i222 = i22;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i222) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        } else {
            m2vVar22.G(null);
        }
        m2v m2vVar23 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", ld2Var, obj);
        if (bVar == null) {
            m2vVar23.G(null);
        } else {
            final int i23 = 5;
            m2vVar23.G(new ee5() { // from class: gtb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    List g18;
                    List g19;
                    List g20;
                    List g21;
                    List g22;
                    int i222 = i23;
                    int i32 = 2;
                    io.flutter.plugins.webviewflutter.b bVar2 = bVar;
                    switch (i222) {
                        case 0:
                            try {
                                ((w4u) bVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), bVar2.a());
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list = (List) obj2;
                            WebView webView = (WebView) list.get(0);
                            DownloadListener downloadListener = (DownloadListener) list.get(1);
                            try {
                                bVar2.getClass();
                                webView.setDownloadListener(downloadListener);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list2 = (List) obj2;
                            WebView webView2 = (WebView) list2.get(0);
                            try {
                                ((w4u) bVar2.a.b).j(((Long) list2.get(1)).longValue(), webView2.getSettings());
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list3 = (List) obj2;
                            WebView webView3 = (WebView) list3.get(0);
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(1);
                            try {
                                bVar2.getClass();
                                webView3.setWebChromeClient(webChromeClientProxyApi$WebChromeClientImpl);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebView webView4 = (WebView) list4.get(0);
                            long longValue = ((Long) list4.get(1)).longValue();
                            try {
                                bVar2.getClass();
                                webView4.setBackgroundColor((int) longValue);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            WebView webView5 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView5.destroy();
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list5 = (List) obj2;
                            WebView webView6 = (WebView) list5.get(0);
                            String str = (String) list5.get(1);
                            String str2 = (String) list5.get(2);
                            String str3 = (String) list5.get(3);
                            try {
                                bVar2.getClass();
                                webView6.loadData(str, str2, str3);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list6 = (List) obj2;
                            WebView webView7 = (WebView) list6.get(0);
                            String str4 = (String) list6.get(1);
                            String str5 = (String) list6.get(2);
                            String str6 = (String) list6.get(3);
                            String str7 = (String) list6.get(4);
                            String str8 = (String) list6.get(5);
                            try {
                                bVar2.getClass();
                                webView7.loadDataWithBaseURL(str4, str5, str6, str7, str8);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list7 = (List) obj2;
                            WebView webView8 = (WebView) list7.get(0);
                            String str9 = (String) list7.get(1);
                            Map<String, String> map = (Map) list7.get(2);
                            try {
                                bVar2.getClass();
                                webView8.loadUrl(str9, map);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list8 = (List) obj2;
                            WebView webView9 = (WebView) list8.get(0);
                            String str10 = (String) list8.get(1);
                            byte[] bArr = (byte[]) list8.get(2);
                            try {
                                bVar2.getClass();
                                webView9.postUrl(str10, bArr);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            WebView webView10 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g11 = Collections.singletonList(webView10.getUrl());
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            WebView webView11 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView11.goForward();
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            WebView webView12 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g13 = Collections.singletonList(Boolean.valueOf(webView12.canGoBack()));
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebView webView13 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g14 = Collections.singletonList(Boolean.valueOf(webView13.canGoForward()));
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            WebView webView14 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView14.goBack();
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            WebView webView15 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                webView15.reload();
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        case 16:
                            List list9 = (List) obj2;
                            WebView webView16 = (WebView) list9.get(0);
                            boolean booleanValue = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                bVar2.getClass();
                                webView16.clearCache(booleanValue);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                        case 17:
                            List list10 = (List) obj2;
                            WebView webView17 = (WebView) list10.get(0);
                            String str11 = (String) list10.get(1);
                            wrb0 wrb0Var = new wrb0(ce5Var, 10);
                            bVar2.getClass();
                            webView17.evaluateJavascript(str11, new jne(i32, wrb0Var));
                            break;
                        case 18:
                            WebView webView18 = (WebView) ((List) obj2).get(0);
                            try {
                                bVar2.getClass();
                                g18 = Collections.singletonList(webView18.getTitle());
                            } catch (Throwable th18) {
                                if (th18 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError18 = th18;
                                    g18 = scc.g(androidWebKitError18.getCode(), androidWebKitError18.getMessage(), androidWebKitError18.getDetails());
                                } else {
                                    g18 = scc.g(th18.getClass().getSimpleName(), th18.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            ce5Var.a(g18);
                            break;
                        case 19:
                            boolean booleanValue2 = ((Boolean) ((List) obj2).get(0)).booleanValue();
                            try {
                                bVar2.getClass();
                                WebView.setWebContentsDebuggingEnabled(booleanValue2);
                                g19 = Collections.singletonList(null);
                            } catch (Throwable th19) {
                                if (th19 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError19 = th19;
                                    g19 = scc.g(androidWebKitError19.getCode(), androidWebKitError19.getMessage(), androidWebKitError19.getDetails());
                                } else {
                                    g19 = scc.g(th19.getClass().getSimpleName(), th19.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th19), th19.getCause()));
                                }
                            }
                            ce5Var.a(g19);
                            break;
                        case 20:
                            List list11 = (List) obj2;
                            WebView webView19 = (WebView) list11.get(0);
                            WebViewClient webViewClient = (WebViewClient) list11.get(1);
                            try {
                                bVar2.getClass();
                                webView19.setWebViewClient(webViewClient);
                                g20 = Collections.singletonList(null);
                            } catch (Throwable th20) {
                                if (th20 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError20 = th20;
                                    g20 = scc.g(androidWebKitError20.getCode(), androidWebKitError20.getMessage(), androidWebKitError20.getDetails());
                                } else {
                                    g20 = scc.g(th20.getClass().getSimpleName(), th20.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th20), th20.getCause()));
                                }
                            }
                            ce5Var.a(g20);
                            break;
                        case 21:
                            List list12 = (List) obj2;
                            WebView webView20 = (WebView) list12.get(0);
                            b7x b7xVar = (b7x) list12.get(1);
                            try {
                                bVar2.getClass();
                                webView20.addJavascriptInterface(b7xVar, b7xVar.a);
                                g21 = Collections.singletonList(null);
                            } catch (Throwable th21) {
                                if (th21 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError21 = th21;
                                    g21 = scc.g(androidWebKitError21.getCode(), androidWebKitError21.getMessage(), androidWebKitError21.getDetails());
                                } else {
                                    g21 = scc.g(th21.getClass().getSimpleName(), th21.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th21), th21.getCause()));
                                }
                            }
                            ce5Var.a(g21);
                            break;
                        default:
                            List list13 = (List) obj2;
                            WebView webView21 = (WebView) list13.get(0);
                            String str12 = (String) list13.get(1);
                            try {
                                bVar2.getClass();
                                webView21.removeJavascriptInterface(str12);
                                g22 = Collections.singletonList(null);
                            } catch (Throwable th22) {
                                if (th22 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError22 = th22;
                                    g22 = scc.g(androidWebKitError22.getCode(), androidWebKitError22.getMessage(), androidWebKitError22.getDetails());
                                } else {
                                    g22 = scc.g(th22.getClass().getSimpleName(), th22.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th22), th22.getCause()));
                                }
                            }
                            ce5Var.a(g22);
                            break;
                    }
                }
            });
        }
    }
}
