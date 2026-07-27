package u2;

import O.InterfaceC0349y;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.LocaleManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.LocaleList;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.AbsListView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.AbstractC2837We;
import com.google.android.gms.internal.ads.AbstractC3070dB;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.AbstractC4094wD;
import com.google.android.gms.internal.ads.C2646Kn;
import com.google.android.gms.internal.ads.C2759Rh;
import com.google.android.gms.internal.ads.C3153eo;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3673oN;
import com.google.android.gms.internal.ads.C3968tw;
import com.google.android.gms.internal.ads.C4054va;
import com.google.android.gms.internal.ads.C4108wa;
import com.google.android.gms.internal.ads.InterfaceC3123eB;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.RunnableC3111e;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Ut;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4816f;
import p2.C4835j;
import q2.C4900p;
import v2.C5110a;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: l, reason: collision with root package name */
    public static final HandlerC5068A f41234l = new HandlerC5068A(Looper.getMainLooper(), 3);

    /* renamed from: g, reason: collision with root package name */
    public String f41241g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f41242h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f41235a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f41236b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f41237c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f41238d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f41239e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f41240f = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41243j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f41244k = Executors.newSingleThreadExecutor();

    public static final String A(Context context, String str) {
        Context context2;
        if (str == null) {
            C4835j.f39730C.f39740h.d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32259h)).booleanValue()) {
                return N();
            }
            str = C5110a.a().f41388n;
        }
        String str2 = null;
        try {
            if (D2.b.f632v == null) {
                D2.b.f632v = new D2.b(4);
            }
            D2.b bVar = D2.b.f632v;
            if (TextUtils.isEmpty(bVar.f634u)) {
                int i = M2.h.f1847c;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                bVar.f634u = (String) O3.b.G(context, new C2.x(16, context2, context));
            }
            str2 = bVar.f634u;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = N();
        }
        String s9 = D.y.s(new StringBuilder(String.valueOf(str2).length() + 10 + String.valueOf(str).length()), str2, " (Mobile; ", str);
        try {
            if (V2.c.a(context).d()) {
                StringBuilder sb = new StringBuilder(s9.length() + 4);
                sb.append(s9);
                sb.append(";aia");
                s9 = sb.toString();
            }
        } catch (Exception e9) {
            C4835j.f39730C.f39740h.d("AdUtil.getUserAgent", e9);
        }
        return s9.concat(")");
    }

    public static ArrayList H() {
        C3301ha c3301ha = AbstractC3569ma.f32192a;
        ArrayList C8 = q2.r.f40204e.f40205a.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = C8.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.bumptech.glide.manager.p d2 = com.bumptech.glide.manager.p.d(new PA(','));
            str.getClass();
            Iterator j6 = ((InterfaceC3123eB) d2.f23471w).j(d2, str);
            while (true) {
                AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
                if (abstractC3070dB.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) abstractC3070dB.next()));
                    } catch (NumberFormatException unused) {
                        z.k("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static k8.b I(Context context) {
        LocaleList systemLocales;
        LocaleList systemLocales2;
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new k8.b(locale.getLanguage(), locale.getCountry());
        }
        k8.b bVar = new k8.b(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager d2 = P.d.d(context.getSystemService(P.d.l()));
            if (d2 != null) {
                systemLocales = d2.getSystemLocales();
                if (!systemLocales.isEmpty()) {
                    systemLocales2 = d2.getSystemLocales();
                    Locale locale2 = systemLocales2.get(0);
                    return new k8.b(locale2.getLanguage(), locale2.getCountry());
                }
            }
            return bVar;
        } catch (Throwable th) {
            C4835j.f39730C.f39740h.d("AdUtil.getSystemDefaultLocale", th);
            return bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean K(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final void L(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String M(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return x(y(context));
    }

    public static final String N() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String O() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : D.y.s(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
    }

    public static final HashMap P(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e9) {
            C4835j.f39730C.f39740h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e9);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long Q(View view) {
        float f3 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f3 = Math.min(f3, view2.getAlpha());
            view = view2.getParent();
        } while (f3 > 0.0f);
        return Math.round((f3 >= 0.0f ? f3 : 0.0f) * 100.0f);
    }

    public static final int a(View view) {
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                return 0;
            }
            if (parent instanceof ScrollView) {
                return 1;
            }
            if (parent instanceof AbsListView) {
                return 2;
            }
            if (parent instanceof HorizontalScrollView) {
                return 3;
            }
            if (parent instanceof InterfaceC0349y) {
                return 4;
            }
            C3301ha c3301ha = AbstractC3569ma.d9;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                String str = (String) rVar.f40207c.a(AbstractC3569ma.e9);
                if (TextUtils.isEmpty(str)) {
                    continue;
                } else {
                    for (String str2 : str.split(",")) {
                        if (parent.getClass().getName().toLowerCase(Locale.ROOT).contains(str2)) {
                            return 5;
                        }
                    }
                }
            }
            parent = parent.getParent();
        }
    }

    public static final t b(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                int i = z.f41319b;
                v2.i.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof t ? (t) queryLocalInterface : new s(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 2);
        } catch (Exception e9) {
            C4835j.f39730C.f39740h.d("Failed to instantiate WorkManagerUtil", e9);
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        int i = AbstractC2837We.f28362a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return V2.c.a(context).f3273u.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        try {
            if (T2.b.f3085h == null) {
                T2.b.f3085h = Boolean.valueOf(T2.b.g() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return T2.b.f3085h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean e(String str) {
        if (v2.f.c()) {
            C3301ha c3301ha = AbstractC3569ma.f32228d6;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                String str2 = (String) rVar.f40207c.a(AbstractC3569ma.f32247f6);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32238e6);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean f(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            int i = z.f41319b;
            v2.i.d("Error loading class.", th);
            C4835j.f39730C.f39740h.d("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean g(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        try {
            Bundle y7 = y(context);
            String string = y7.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(x(y7))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean i(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void j(int i, View view) {
        String str;
        int i6;
        int i9;
        int i10;
        String str2;
        String str3;
        String str4;
        St K7;
        Ut A02;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof C2646Kn) {
                view2 = ((C2646Kn) view2).getChildAt(0);
            }
            if (view2 instanceof NativeAdView) {
                str = "NATIVE";
                i6 = 1;
            } else {
                str = "UNKNOWN";
                i6 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i10 = rect.width();
                i9 = rect.height();
            } else {
                i9 = 0;
                i10 = 0;
            }
            D d2 = C4835j.f39730C.f39735c;
            long Q8 = Q(view2);
            view2.getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            String str5 = "none";
            if (!(view2 instanceof InterfaceC4061vh) || (A02 = ((InterfaceC4061vh) view2).A0()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = A02.f28004b;
                int hashCode = view2.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof InterfaceC4061vh) || (K7 = ((InterfaceC4061vh) view2).K()) == null) {
                str4 = str2;
            } else {
                str4 = St.a(K7.f27608b);
                i6 = K7.f27614e;
                str5 = K7.f27581E;
            }
            Locale locale = Locale.US;
            String str6 = "<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str3 + ", format=" + str4 + ", impType=" + i6 + ", class=" + view2.getClass().getName() + ", x=" + i11 + ", y=" + i12 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i10 + ", vHeight=" + i9 + ", alpha=" + Q8 + ", state=" + Integer.toString(i, 2) + ">";
            int i13 = z.f41319b;
            v2.i.e(str6);
        } catch (Exception e9) {
            int i14 = z.f41319b;
            v2.i.d("Failure getting view location.", e9);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        a4.e eVar = C4835j.f39730C.f39738f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, St st, C3153eo c3153eo) {
        S0.e a9 = c3153eo.a();
        a9.v(NativeAdvancedJsUtils.f17906p, "can_show");
        C4835j c4835j = C4835j.f39730C;
        D d2 = c4835j.f39735c;
        a9.v("foreground", true != g(context) ? "1" : "0");
        a9.v("fg_al", true == c4835j.f39739g.p() ? "1" : "0");
        if (st != null) {
            List list = st.f27642t;
            if (!list.isEmpty()) {
                a9.v("ancn", (String) list.get(0));
            }
            a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, St.a(st.f27608b));
        }
        a9.y();
    }

    public static final boolean m(St st) {
        return ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.df)).booleanValue() && st != null && st.f27614e == 4;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e9) {
            String concat = "Could not parse value:".concat(e9.toString());
            int i = z.f41319b;
            v2.i.f(concat);
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32406x)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] p(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] q(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        C4900p c4900p = C4900p.f40196g;
        return new int[]{c4900p.f40197a.h(activity, iArr[0]), c4900p.f40197a.h(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z3 = C4835j.f39730C.f39735c.f41239e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view);
        long Q8 = Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z3)) {
            C3301ha c3301ha = AbstractC3569ma.f32134T1;
            q2.r rVar = q2.r.f40204e;
            if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                C3301ha c3301ha2 = AbstractC3569ma.Xb;
                if (!((Boolean) rVar.f40207c.a(c3301ha2)).booleanValue() || Q8 >= ((Integer) r6.a(AbstractC3569ma.Zb)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.uc)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e9) {
            int i = z.f41319b;
            v2.i.g("", e9);
            C4835j.f39730C.f39740h.d("AdUtil.startActivityWithUnknownContext", e9);
        }
    }

    public static final void t(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            L(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            String sb2 = sb.toString();
            int i = z.f41319b;
            v2.i.a(sb2);
        } catch (ActivityNotFoundException e9) {
            int i6 = z.f41319b;
            v2.i.d("No browser is found.", e9);
        }
    }

    public static int u(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String d2 = u1.h.d(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.", new StringBuilder(String.valueOf(i).length() + 86));
        int i6 = z.f41319b;
        v2.i.f(d2);
        return 60000;
    }

    public static final void v(Context context, Intent intent, C3153eo c3153eo, String str) {
        C3301ha c3301ha = AbstractC3569ma.Ie;
        q2.r rVar = q2.r.f40204e;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2 = rVar.f40207c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue() || !(context instanceof C2759Rh)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.Ke))) {
                s(context, intent);
                return;
            }
            ((C2759Rh) context).a(intent);
            if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka2.a(AbstractC3569ma.Je)).booleanValue() || c3153eo == null) {
                return;
            }
            S0.e a9 = c3153eo.a();
            a9.v(NativeAdvancedJsUtils.f17906p, "hila");
            if (str == null) {
                str = "";
            }
            a9.v("gqi", str);
            a9.B();
        } catch (ActivityNotFoundException e9) {
            e = e9;
            int i = z.f41319b;
            v2.i.d("Error occurred while starting activity for result", e);
            C4835j.f39730C.f39740h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (SecurityException e10) {
            e = e10;
            int i6 = z.f41319b;
            v2.i.d("Error occurred while starting activity for result", e);
            C4835j.f39730C.f39740h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (Exception e11) {
            int i9 = z.f41319b;
            v2.i.d("Error occurred while starting activity for result", e11);
            C4835j.f39730C.f39740h.d("AdUtil.startActivityForResult", e11);
            s(context, intent);
        }
    }

    public static boolean w(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static String x(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static Bundle y(Context context) {
        try {
            return V2.c.a(context).b(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e9) {
            z.l("Error getting metadata", e9);
            return null;
        }
    }

    public static final void z(com.bumptech.glide.manager.o oVar, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        Intent intent = (Intent) oVar.f23464u;
        if (i >= 0) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i6 = bundle.getInt("cbp", -1);
        if (i6 < 0 || i6 > 2) {
            return;
        }
        if (i6 < 0 || i6 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i6);
    }

    public final void B(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int u3 = u(i);
        String d2 = u1.h.d(u3, "HTTP timeout: ", " milliseconds.", new StringBuilder(String.valueOf(u3).length() + 28));
        int i6 = z.f41319b;
        v2.i.e(d2);
        httpURLConnection.setConnectTimeout(u3);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(u3);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", E(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final void C(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        AbstractC3569ma.a(context);
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new Q0.d(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new Q0.d(this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void D(Context context) {
        if (this.f41243j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC3569ma.a(context);
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C3968tw(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C3968tw(1), intentFilter, 4);
        }
        this.f41243j = true;
    }

    public final String E(Context context, String str) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Gc)).booleanValue()) {
            if (this.f41242h != null) {
                return this.f41242h;
            }
            String A9 = A(context, str);
            if (str != null) {
                this.f41242h = A9;
            }
            return A9;
        }
        synchronized (this.f41240f) {
            try {
                String str2 = this.f41241g;
                if (str2 != null) {
                    return str2;
                }
                String A10 = A(context, str);
                if (str != null) {
                    this.f41241g = A10;
                }
                return A10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F(String str) {
        return w(str, this.f41235a, (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32071M0));
    }

    public final boolean G(String str) {
        return w(str, this.f41236b, (String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32080N0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (v2.d.s() != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J(Context context, Uri uri, Bundle bundle) {
        String a9;
        if (context == null) {
            z.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        C3301ha c3301ha = AbstractC3569ma.f32430z5;
        q2.r rVar = q2.r.f40204e;
        boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (booleanValue) {
            C4054va c4054va = C4835j.f39730C.f39745n;
            if (c4054va.f34708w == null) {
                AbstractC3413jg.f31268a.execute(new RunnableC3111e(13, c4054va));
            }
            com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(c4054va.f34708w);
            z(oVar, bundle);
            m8.i b9 = oVar.b();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32085N5)).booleanValue()) {
                v2.d dVar = C4900p.f40196g.f40197a;
            }
            ((Intent) b9.f39362n).setPackage(AbstractC4094wD.a(context));
            b9.f(context, uri);
            return 5;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32412x5)).booleanValue()) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(uri);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return 9;
        }
        C4108wa c4108wa = new C4108wa();
        j4.q qVar = new j4.q();
        qVar.f38433n = c4108wa;
        qVar.f38434u = bundle;
        qVar.f38435v = context;
        qVar.f38436w = uri;
        Objects.requireNonNull(this);
        c4108wa.f34841d = qVar;
        Activity activity = (Activity) context;
        if (c4108wa.f34839b == null && (a9 = AbstractC4094wD.a(activity)) != null) {
            C3673oN c3673oN = new C3673oN(c4108wa);
            c4108wa.f34840c = c3673oN;
            AbstractC4816f.a(activity, a9, c3673oN);
        }
        return 5;
    }
}
