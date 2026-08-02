package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class dxr implements num, hbv, bmw, pun, a0x {
    public Object a;
    public Object b;

    public dxr(Handler handler, ccu ccuVar) {
        if (ccuVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = ccuVar;
    }

    public static String j(dxr dxrVar) {
        Collection<String> collection = (Collection) dxrVar.b;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) dxrVar.a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                xq0.x("Invalid application ID: ".concat(str));
                return null;
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                xq0.x("Must specify at least one namespace");
                return null;
            }
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z = true;
            for (String str2 : collection) {
                d94.b(str2);
                if (!z) {
                    sb.append(StringUtils.COMMA);
                }
                if (!d94.a.matcher(str2).matches()) {
                    StringBuilder sb2 = new StringBuilder(str2.length());
                    for (int i = 0; i < str2.length(); i++) {
                        char charAt = str2.charAt(i);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb2.append(charAt);
                        }
                    }
                    str2 = sb2.toString();
                }
                sb.append(str2);
                z = false;
            }
        }
        if (str == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    @Override // defpackage.num
    public void A(vk2 vk2Var) {
        nsh.D((nsh) this.b, new n6p(this, vk2Var, null, 11));
    }

    public void a(ig7 ig7Var) {
        synchronized (ig7Var) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new acu(this, ig7Var, 1));
        }
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        h4x h4xVar = (h4x) this.a;
        String str = (String) this.b;
        jox joxVar = (jox) obj;
        i8s i8sVar = (i8s) obj2;
        y1g.I("Not connected to device", h4xVar.F == 3);
        y0x y0xVar = (y0x) joxVar.s();
        Parcel M0 = y0xVar.M0();
        M0.writeString(str);
        y0xVar.P0(M0, 5);
        synchronized (h4xVar.s) {
            try {
                if (h4xVar.p != null) {
                    i8sVar.a(n7w.K(new Status(2001, null, null, null)));
                } else {
                    h4xVar.p = i8sVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a0x
    public void b(Bitmap bitmap) {
        rjp rjpVar = (rjp) this.a;
        rjpVar.b = bitmap;
        ehx ehxVar = (ehx) this.b;
        ehxVar.l = rjpVar;
        ehxVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(List list, cg6 cg6Var) {
        buv buvVar;
        int i;
        if (cg6Var instanceof buv) {
            buvVar = (buv) cg6Var;
            int i2 = buvVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                buvVar.m = i2 - Integer.MIN_VALUE;
                Object obj = buvVar.k;
                nm6 nm6Var = nm6.a;
                i = buvVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) this.b).g();
                    buvVar.j = list;
                    buvVar.m = 1;
                    obj = zsd.g0(g, buvVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        List list2 = buvVar.j;
                        qgg.h0(obj);
                        return CollectionsKt.o0((List) obj, new t1n(17));
                    }
                    list = buvVar.j;
                    qgg.h0(obj);
                }
                String str = ((xxq) obj).a;
                str.getClass();
                buvVar.j = null;
                buvVar.m = 2;
                obj = ((p51) this.a).f(str, list, buvVar);
            }
        }
        buvVar = new buv(this, cg6Var);
        Object obj2 = buvVar.k;
        nm6 nm6Var2 = nm6.a;
        i = buvVar.m;
        if (i != 0) {
        }
        String str2 = ((xxq) obj2).a;
        str2.getClass();
        buvVar.j = null;
        buvVar.m = 2;
        obj2 = ((p51) this.a).f(str2, list, buvVar);
    }

    public void d(kxi kxiVar, u5l u5lVar) {
        ((itu) this.b).invoke();
        g0l.s((g0l) this.a, new s9p(t75.c(r9p.a)), kxiVar, u5lVar, new qfn("radio-mobile-wave_screen-clean-default"), null, null, null, null, 496);
    }

    public void e(s9p s9pVar, kxi kxiVar, u5l u5lVar, pfn pfnVar) {
        pfnVar.getClass();
        ((itu) this.b).invoke();
        g0l.s((g0l) this.a, s9pVar, kxiVar, u5lVar, pfnVar, null, null, null, null, 496);
    }

    @Override // defpackage.num
    public void f() {
        nsh.D((nsh) this.b, new cxr(this, null, 0));
    }

    public void g(Object obj) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new bcu(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    @Override // defpackage.hbv
    public void h(Bundle bundle, c3c c3cVar) {
        ((pev) this.b).C((atg) this.a, bundle, c3cVar);
    }

    public void i(tcu tcuVar) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new xlr(15, this, tcuVar));
        }
    }

    @Override // defpackage.num
    public void k() {
        nsh.D((nsh) this.b, new cxr(this, null, 1));
    }

    @Override // defpackage.bmw
    public void onError(Throwable th) {
        th.getClass();
        wnd wndVar = (wnd) this.a;
        wndVar.getClass();
        new lum(wndVar.b).Q(th);
        ((bmw) this.b).onError(th);
    }

    public /* synthetic */ dxr(Object obj, Object obj2, boolean z) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ dxr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
