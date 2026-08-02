package defpackage;

import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class tj91 {
    public static final y60 a = new y60(17);

    public static final void a(float f, int i, int i2, long j, fid fidVar, f530 f530Var) {
        f530 f530Var2;
        int i3;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.b(f) ? 32 : 16;
        }
        long j2 = j;
        int i5 = i3 | (((i2 & 4) == 0 && btsVar.d(j2)) ? 256 : 128);
        int i6 = 0;
        boolean z = true;
        if (btsVar.V(i5 & 1, (i5 & 147) != 146)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = i4 != 0 ? c530.a : f530Var2;
                if ((i2 & 4) != 0) {
                    int i7 = tql.a;
                    j2 = dgc.d(grl.a, btsVar);
                    i5 &= -897;
                }
            } else {
                btsVar.Y();
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                }
                f530Var3 = f530Var2;
            }
            btsVar.u();
            f530 e = ljs0.e(ljs0.c(f530Var3, 1.0f), f);
            boolean z2 = (i5 & 112) == 32;
            if ((((i5 & 896) ^ 384) <= 256 || !btsVar.d(j2)) && (i5 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new yql(f, j2, i6);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, e);
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        long j3 = j2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zql(f530Var3, f, j3, i, i2);
        }
    }

    public static final boolean b(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static void c(tt5 tt5Var, final kne kneVar) {
        xv10 xv10Var;
        rs10 ld2Var = (kneVar == null || (xv10Var = kneVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", ld2Var, obj);
        if (kneVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: fsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    kne kneVar2 = kneVar;
                    int i3 = 0;
                    switch (i2) {
                        case 0:
                            try {
                                ((w4u) kneVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), CookieManager.getInstance());
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
                            CookieManager cookieManager = (CookieManager) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                kneVar2.getClass();
                                cookieManager.setCookie(str, str2);
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
                            CookieManager cookieManager2 = (CookieManager) ((List) obj2).get(0);
                            wrb0 wrb0Var = new wrb0(ce5Var, 6);
                            kneVar2.getClass();
                            cookieManager2.removeAllCookies(new jne(i3, wrb0Var));
                            break;
                        default:
                            List list2 = (List) obj2;
                            CookieManager cookieManager3 = (CookieManager) list2.get(0);
                            WebView webView = (WebView) list2.get(1);
                            boolean booleanValue = ((Boolean) list2.get(2)).booleanValue();
                            try {
                                kneVar2.getClass();
                                cookieManager3.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", ld2Var, obj);
        if (kneVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: fsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    kne kneVar2 = kneVar;
                    int i3 = 0;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) kneVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), CookieManager.getInstance());
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
                            CookieManager cookieManager = (CookieManager) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                kneVar2.getClass();
                                cookieManager.setCookie(str, str2);
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
                            CookieManager cookieManager2 = (CookieManager) ((List) obj2).get(0);
                            wrb0 wrb0Var = new wrb0(ce5Var, 6);
                            kneVar2.getClass();
                            cookieManager2.removeAllCookies(new jne(i3, wrb0Var));
                            break;
                        default:
                            List list2 = (List) obj2;
                            CookieManager cookieManager3 = (CookieManager) list2.get(0);
                            WebView webView = (WebView) list2.get(1);
                            boolean booleanValue = ((Boolean) list2.get(2)).booleanValue();
                            try {
                                kneVar2.getClass();
                                cookieManager3.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", ld2Var, obj);
        if (kneVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: fsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    kne kneVar2 = kneVar;
                    int i32 = 0;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) kneVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), CookieManager.getInstance());
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
                            CookieManager cookieManager = (CookieManager) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                kneVar2.getClass();
                                cookieManager.setCookie(str, str2);
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
                            CookieManager cookieManager2 = (CookieManager) ((List) obj2).get(0);
                            wrb0 wrb0Var = new wrb0(ce5Var, 6);
                            kneVar2.getClass();
                            cookieManager2.removeAllCookies(new jne(i32, wrb0Var));
                            break;
                        default:
                            List list2 = (List) obj2;
                            CookieManager cookieManager3 = (CookieManager) list2.get(0);
                            WebView webView = (WebView) list2.get(1);
                            boolean booleanValue = ((Boolean) list2.get(2)).booleanValue();
                            try {
                                kneVar2.getClass();
                                cookieManager3.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", ld2Var, obj);
        if (kneVar == null) {
            m2vVar4.G(null);
        } else {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: fsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i4;
                    kne kneVar2 = kneVar;
                    int i32 = 0;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) kneVar2.a.b).j(((Long) ((List) obj2).get(0)).longValue(), CookieManager.getInstance());
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
                            CookieManager cookieManager = (CookieManager) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                kneVar2.getClass();
                                cookieManager.setCookie(str, str2);
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
                            CookieManager cookieManager2 = (CookieManager) ((List) obj2).get(0);
                            wrb0 wrb0Var = new wrb0(ce5Var, 6);
                            kneVar2.getClass();
                            cookieManager2.removeAllCookies(new jne(i32, wrb0Var));
                            break;
                        default:
                            List list2 = (List) obj2;
                            CookieManager cookieManager3 = (CookieManager) list2.get(0);
                            WebView webView = (WebView) list2.get(1);
                            boolean booleanValue = ((Boolean) list2.get(2)).booleanValue();
                            try {
                                kneVar2.getClass();
                                cookieManager3.setAcceptThirdPartyCookies(webView, booleanValue);
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
                    }
                }
            });
        }
    }
}
