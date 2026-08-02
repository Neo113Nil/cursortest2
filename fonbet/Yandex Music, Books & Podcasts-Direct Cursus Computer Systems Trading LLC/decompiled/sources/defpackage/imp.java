package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.o;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.f;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes.dex */
public class imp implements u6c, tev, omg, rek, p7q, v3q, xic, zr2, fn3, f, u97, inb, dfs, uo6, bvj {
    public static final imp b = new imp();
    public static final long[] a = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    public static final imp c = new imp();
    public static final imp d = new imp();
    public static final imp e = new imp();
    public static final String[] f = new String[0];
    public static final imp g = new imp();
    public static final imp h = new imp();
    public static final imp i = new imp();
    public static final imp j = new imp();
    public static final imp k = new imp();
    public static final imp l = new imp();
    public static final imp m = new imp();
    public static final imp n = new imp();

    public static ConcurrentHashMap C() {
        if (bp6.a.contains(see.class)) {
            return null;
        }
        try {
            return see.v;
        } catch (Throwable th) {
            bp6.a(see.class, th);
            return null;
        }
    }

    public static Intent G(Context context, rf3 rf3Var, Bundle bundle, b7h b7hVar) {
        context.getClass();
        b7hVar.getClass();
        Intent intent = new Intent(context, (Class<?>) MainScreenActivity.class);
        if (bundle != null) {
            intent.putExtra("extra.args", bundle);
        }
        if (rf3Var != null) {
            intent.putExtra("extra.tab", rf3Var);
        }
        if (!b7hVar.equals(y6h.a)) {
            intent.setAction("action.open.destination");
            intent.putExtra("extra.destination", b7hVar);
        }
        Intent addFlags = intent.addFlags(603979776);
        addFlags.getClass();
        return addFlags;
    }

    public static /* synthetic */ Intent J(Context context, rf3 rf3Var, Bundle bundle, b7h b7hVar, int i2) {
        if ((i2 & 2) != 0) {
            rf3Var = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        if ((i2 & 8) != 0) {
            b7hVar = y6h.a;
        }
        return G(context, rf3Var, bundle, b7hVar);
    }

    public static AtomicBoolean M() {
        if (bp6.a.contains(see.class)) {
            return null;
        }
        try {
            return see.u;
        } catch (Throwable th) {
            bp6.a(see.class, th);
            return null;
        }
    }

    public static final void N(Context context, String str, String str2) {
        Set set = bp6.a;
        if (set.contains(imp.class)) {
            return;
        }
        try {
            context.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", b.k(context));
            bundle.putString("fb_mobile_app_cert_hash", ghh.w(context));
            pt0 pt0Var = new pt0(str, str2);
            HashSet hashSet = j3c.a;
            if (gtt.c()) {
                pt0Var.w(bundle, "fb_mobile_activate_app");
            }
            if (y9w.t() == 2 || set.contains(pt0Var)) {
                return;
            }
            try {
                lt0.d(1);
            } catch (Throwable th) {
                bp6.a(pt0Var, th);
            }
        } catch (Throwable th2) {
            bp6.a(imp.class, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0026, B:11:0x002e, B:13:0x0034, B:16:0x003b, B:19:0x004a, B:20:0x004e, B:36:0x007c, B:37:0x007f, B:39:0x0099, B:40:0x00a0, B:42:0x00ad, B:43:0x00b1, B:45:0x00d0, B:53:0x00e7, B:48:0x00d9, B:25:0x0069, B:27:0x006f), top: B:4:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0026, B:11:0x002e, B:13:0x0034, B:16:0x003b, B:19:0x004a, B:20:0x004e, B:36:0x007c, B:37:0x007f, B:39:0x0099, B:40:0x00a0, B:42:0x00ad, B:43:0x00b1, B:45:0x00d0, B:53:0x00e7, B:48:0x00d9, B:25:0x0069, B:27:0x006f), top: B:4:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0012, B:7:0x001a, B:10:0x0026, B:11:0x002e, B:13:0x0034, B:16:0x003b, B:19:0x004a, B:20:0x004e, B:36:0x007c, B:37:0x007f, B:39:0x0099, B:40:0x00a0, B:42:0x00ad, B:43:0x00b1, B:45:0x00d0, B:53:0x00e7, B:48:0x00d9, B:25:0x0069, B:27:0x006f), top: B:4:0x0012, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void S(String str, sj sjVar, String str2) {
        long j2;
        Long l2;
        Set set = bp6.a;
        if (set.contains(imp.class) || sjVar == null) {
            return;
        }
        try {
            Long l3 = (Long) sjVar.b;
            long longValue = l3 != null ? l3.longValue() : 0L;
            imp impVar = b;
            if (longValue < 0) {
                impVar.R();
                longValue = 0;
            }
            Long l4 = (Long) sjVar.d;
            if (l4 != null && (l2 = (Long) sjVar.e) != null) {
                j2 = l2.longValue() - l4.longValue();
                if (j2 < 0) {
                    impVar.R();
                    j2 = 0;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", sjVar.a);
                Locale locale = Locale.ROOT;
                int i2 = 0;
                if (!set.contains(imp.class)) {
                    int i3 = 0;
                    while (true) {
                        try {
                            long[] jArr = a;
                            if (i3 >= 19 || jArr[i3] >= longValue) {
                                break;
                            } else {
                                i3++;
                            }
                        } catch (Throwable th) {
                            bp6.a(imp.class, th);
                        }
                    }
                    i2 = i3;
                }
                bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                c7f c7fVar = (c7f) sjVar.c;
                bundle.putString("fb_mobile_launch_source", c7fVar == null ? c7fVar.toString() : "Unclassified");
                Long l5 = (Long) sjVar.e;
                bundle.putLong("_logTime", (l5 != null ? l5.longValue() : 0L) / 1000);
                pt0 pt0Var = new pt0(str, str2);
                double d2 = j2 / 1000;
                HashSet hashSet = j3c.a;
                if (gtt.c() || bp6.a.contains(pt0Var)) {
                }
                try {
                    pt0Var.y("fb_mobile_deactivate_app", Double.valueOf(d2), bundle, false, oh.b());
                    return;
                } catch (Throwable th2) {
                    bp6.a(pt0Var, th2);
                    return;
                }
            }
            j2 = 0;
            if (j2 < 0) {
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("fb_mobile_app_interruptions", sjVar.a);
            Locale locale2 = Locale.ROOT;
            int i22 = 0;
            if (!set.contains(imp.class)) {
            }
            bundle2.putString("fb_mobile_time_between_sessions", String.format(locale2, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i22)}, 1)));
            c7f c7fVar2 = (c7f) sjVar.c;
            bundle2.putString("fb_mobile_launch_source", c7fVar2 == null ? c7fVar2.toString() : "Unclassified");
            Long l52 = (Long) sjVar.e;
            bundle2.putLong("_logTime", (l52 != null ? l52.longValue() : 0L) / 1000);
            pt0 pt0Var2 = new pt0(str, str2);
            double d22 = j2 / 1000;
            HashSet hashSet2 = j3c.a;
            if (gtt.c()) {
            }
        } catch (Throwable th3) {
            bp6.a(imp.class, th3);
        }
    }

    public static Intent T(Context context, Bundle bundle, int i2) {
        lhs lhsVar = MainScreenActivity.Q0;
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return G(context, rf3.i, bundle, y6h.a);
    }

    public static s0m U(vbc vbcVar) {
        vbcVar.getClass();
        if (vbcVar instanceof obc) {
            return s0m.a;
        }
        if (vbcVar instanceof sbc) {
            return s0m.b;
        }
        if (vbcVar instanceof mbc) {
            return s0m.c;
        }
        if (vbcVar instanceof nbc) {
            return s0m.e;
        }
        if (vbcVar instanceof kbc) {
            return s0m.d;
        }
        su4.s(2, null, "PlaylistSortType cannot be returned", null);
        return s0m.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(Context context) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        wee weeVar;
        wee weeVar2;
        Class cls;
        wee weeVar3;
        Object obj;
        Object G;
        Object G2;
        wee weeVar4 = wee.g;
        if (!bp6.a.contains(wee.class)) {
            try {
                atomicBoolean = wee.h;
            } catch (Throwable th) {
                bp6.a(wee.class, th);
            }
            if (atomicBoolean.get()) {
                Class C = xee.C("com.android.billingclient.api.SkuDetailsParams");
                Class C2 = xee.C("com.android.billingclient.api.SkuDetailsParams$Builder");
                if (C != null && C2 != null) {
                    Method E = xee.E(C, "newBuilder", new Class[0]);
                    Method E2 = xee.E(C2, "setType", String.class);
                    Method E3 = xee.E(C2, "setSkusList", List.class);
                    Method E4 = xee.E(C2, "build", new Class[0]);
                    if (E != null && E2 != null && E3 != null && E4 != null) {
                        wee weeVar5 = new wee(C, C2, E, E2, E3, E4);
                        if (!bp6.a.contains(wee.class)) {
                            try {
                                wee.g = weeVar5;
                            } catch (Throwable th2) {
                                bp6.a(wee.class, th2);
                            }
                        }
                    }
                }
                if (!bp6.a.contains(wee.class)) {
                    try {
                        atomicBoolean2 = wee.h;
                    } catch (Throwable th3) {
                        bp6.a(wee.class, th3);
                    }
                    atomicBoolean2.set(true);
                    if (!bp6.a.contains(wee.class)) {
                        try {
                            weeVar = wee.g;
                        } catch (Throwable th4) {
                            bp6.a(wee.class, th4);
                        }
                    }
                    weeVar = null;
                }
                atomicBoolean2 = null;
                atomicBoolean2.set(true);
                if (!bp6.a.contains(wee.class)) {
                }
                weeVar = null;
            } else {
                if (!bp6.a.contains(wee.class)) {
                    try {
                        weeVar = wee.g;
                    } catch (Throwable th5) {
                        bp6.a(wee.class, th5);
                    }
                }
                weeVar = null;
            }
            weeVar2 = weeVar;
            if (weeVar2 == null) {
                Class C3 = xee.C("com.android.billingclient.api.BillingClient");
                Class C4 = xee.C("com.android.billingclient.api.Purchase");
                Class C5 = xee.C("com.android.billingclient.api.Purchase$PurchasesResult");
                Class C6 = xee.C("com.android.billingclient.api.SkuDetails");
                Class C7 = xee.C("com.android.billingclient.api.PurchaseHistoryRecord");
                Class C8 = xee.C("com.android.billingclient.api.SkuDetailsResponseListener");
                Class C9 = xee.C("com.android.billingclient.api.PurchaseHistoryResponseListener");
                if (C3 == null || C5 == null || C4 == null || C6 == null || C8 == null || C7 == null || C9 == null) {
                    return;
                }
                Method E5 = xee.E(C3, "queryPurchases", String.class);
                Method E6 = xee.E(C5, "getPurchasesList", new Class[0]);
                Method E7 = xee.E(C4, "getOriginalJson", new Class[0]);
                Method E8 = xee.E(C6, "getOriginalJson", new Class[0]);
                Method E9 = xee.E(C7, "getOriginalJson", new Class[0]);
                if (!bp6.a.contains(weeVar2)) {
                    try {
                        cls = weeVar2.a;
                    } catch (Throwable th6) {
                        bp6.a(weeVar2, th6);
                    }
                    Method E10 = xee.E(C3, "querySkuDetailsAsync", cls, C8);
                    Method E11 = xee.E(C3, "queryPurchaseHistoryAsync", String.class, C9);
                    if (E5 != null || E6 == null || E7 == null || E8 == null || E9 == null || E10 == null || E11 == null) {
                        return;
                    }
                    Class C10 = xee.C("com.android.billingclient.api.BillingClient$Builder");
                    Class C11 = xee.C("com.android.billingclient.api.PurchasesUpdatedListener");
                    if (C10 != null && C11 != null) {
                        Method E12 = xee.E(C3, "newBuilder", Context.class);
                        Method E13 = xee.E(C10, "enablePendingPurchases", new Class[0]);
                        Method E14 = xee.E(C10, "setListener", C11);
                        Method E15 = xee.E(C10, "build", new Class[0]);
                        if (E12 != null && E13 != null && E14 != null && E15 != null && (G = xee.G(C3, null, E12, context)) != null) {
                            weeVar3 = weeVar2;
                            Object newProxyInstance = Proxy.newProxyInstance(C11.getClassLoader(), new Class[]{C11}, new ree(1));
                            newProxyInstance.getClass();
                            Object G3 = xee.G(C10, G, E14, newProxyInstance);
                            if (G3 != null && (G2 = xee.G(C10, G3, E13, new Object[0])) != null) {
                                obj = xee.G(C10, G2, E15, new Object[0]);
                                if (obj != null) {
                                    see seeVar = new see(context, obj, C3, C5, C4, C6, C7, C8, C9, E5, E6, E7, E8, E9, E10, E11, weeVar3);
                                    if (!bp6.a.contains(see.class)) {
                                        try {
                                            see.t = seeVar;
                                        } catch (Throwable th7) {
                                            bp6.a(see.class, th7);
                                        }
                                    }
                                    see a2 = see.a();
                                    if (a2 == null) {
                                        jj4.j("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
                                        return;
                                    } else {
                                        if (bp6.a.contains(see.class)) {
                                            return;
                                        }
                                        try {
                                            a2.e();
                                            return;
                                        } catch (Throwable th8) {
                                            bp6.a(see.class, th8);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            obj = null;
                            if (obj != null) {
                            }
                        }
                    }
                    weeVar3 = weeVar2;
                    obj = null;
                    if (obj != null) {
                    }
                }
                cls = null;
                Method E102 = xee.E(C3, "querySkuDetailsAsync", cls, C8);
                Method E112 = xee.E(C3, "queryPurchaseHistoryAsync", String.class, C9);
                if (E5 != null) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        atomicBoolean = null;
        if (atomicBoolean.get()) {
        }
        weeVar2 = weeVar;
        if (weeVar2 == null) {
        }
    }

    public static int w(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        e7o.e();
                        return 0;
                }
        }
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.inb
    public fnb B(gnb gnbVar, Intent intent, Bundle bundle, gfo gfoVar) {
        return new tiq(avf.H());
    }

    @Override // defpackage.xic
    public float D() {
        return 0.0f;
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        boolean z;
        e5qVar.getClass();
        int ordinal = hdg.W(e5qVar).ordinal();
        if (ordinal != 0) {
            z = true;
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xic
    public long F(float f2) {
        return 0L;
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.xic
    public float I(float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (!z || bp6.a.contains(tt0.class)) {
            return;
        }
        try {
            q8c.d.add(new st0());
            q8c.c();
        } catch (Throwable th) {
            bp6.a(tt0.class, th);
        }
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        z3qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        f5qVar.getClass();
        boolean z = true;
        if (!(f5qVar instanceof s9q)) {
            if (f5qVar instanceof bbq) {
                int ordinal = avf.J((bbq) f5qVar).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                }
            } else if (!(f5qVar instanceof taq) && !(f5qVar instanceof baq) && !(f5qVar instanceof oaq)) {
                b6e.s();
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        om3Var.n();
    }

    public void R() {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            HashMap hashMap = lsg.d;
            b3i.Q(tsg.b, "imp", "Clock skew detected");
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // defpackage.uo6
    public long a() {
        throw new uej("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.fn3
    public byte[] b(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    @Override // defpackage.zr2
    public boolean c(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.tev
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.uo6
    public bs1 d() {
        throw new uej("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.zr2
    public acf e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.zr2
    public boolean g(float f2) {
        return false;
    }

    @Override // defpackage.tev
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.tev
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.zr2
    public float h() {
        return 0.0f;
    }

    @Override // defpackage.tev
    public String[] i() {
        return f;
    }

    @Override // defpackage.zr2
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.zr2
    public float j() {
        return 1.0f;
    }

    public String k(Context context) {
        if (!bp6.a.contains(this)) {
            try {
                context.getClass();
                try {
                    PackageManager packageManager = context.getPackageManager();
                    String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    String string = sharedPreferences.getString(str, null);
                    if (string != null && string.length() == 32) {
                        return string;
                    }
                    String U = zsd.U(context);
                    if (U == null) {
                        U = zsd.T(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
                    }
                    sharedPreferences.edit().putString(str, U).apply();
                    return U;
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.xic
    public float l(float f2, long j2) {
        return 0.0f;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return 0;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return Integer.valueOf(szuVar.i());
    }

    @Override // defpackage.xic
    public float o(float f2, float f3, long j2) {
        return 0.0f;
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return 0;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return Integer.valueOf(bzf.E(maqVar).indexOf(maqVar.b()));
    }

    @Override // defpackage.inb
    public fnb s(o oVar, Bundle bundle, gfo gfoVar) {
        return new tiq(avf.H());
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return Integer.valueOf(t1qVar.e.indexOf(t1qVar.c));
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Integer.valueOf(u7uVar.i);
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.dfs
    public int x() {
        return R.style.PaymentsdkYaTheme_TransportCards_Dark;
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.bvj
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
