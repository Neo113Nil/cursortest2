package w2;

import O.InterfaceC0354y;
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
import com.google.android.gms.internal.ads.AbstractC2860We;
import com.google.android.gms.internal.ads.AbstractC3093dB;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.AbstractC4117wD;
import com.google.android.gms.internal.ads.C2683Ln;
import com.google.android.gms.internal.ads.C2779Rh;
import com.google.android.gms.internal.ads.C3230fo;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3696oN;
import com.google.android.gms.internal.ads.C3980tl;
import com.google.android.gms.internal.ads.C3991tw;
import com.google.android.gms.internal.ads.C4077va;
import com.google.android.gms.internal.ads.C4131wa;
import com.google.android.gms.internal.ads.InterfaceC3146eB;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.RunnableC3134e;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
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
import p.AbstractC4820f;
import r2.C4906k;
import s2.C4949p;
import w.AbstractC5128c;
import x2.C5189a;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: l, reason: collision with root package name */
    public static final HandlerC5139A f41627l = new HandlerC5139A(Looper.getMainLooper(), 1);

    /* renamed from: g, reason: collision with root package name */
    public String f41634g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f41635h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f41628a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f41629b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f41630c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f41631d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f41632e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f41633f = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41636j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f41637k = Executors.newSingleThreadExecutor();

    public static final String A(Context context, String str) {
        Context context2;
        if (str == null) {
            C4906k.f40186C.f40196h.d("AdUtil.getUserAgent", new Exception("null afmaVersion"));
            if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33040h)).booleanValue()) {
                return N();
            }
            str = C5189a.a().f41845n;
        }
        String str2 = null;
        try {
            if (F2.b.f976v == null) {
                F2.b.f976v = new F2.b(4);
            }
            F2.b bVar = F2.b.f976v;
            if (TextUtils.isEmpty(bVar.f978u)) {
                AtomicBoolean atomicBoolean = O2.h.f2271a;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                bVar.f978u = (String) A8.b.y(context, new E2.w(16, context2, context));
            }
            str2 = bVar.f978u;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = N();
        }
        String p9 = D.x.p(new StringBuilder(String.valueOf(str2).length() + 10 + String.valueOf(str).length()), str2, " (Mobile; ", str);
        try {
            if (X2.b.a(context).h()) {
                StringBuilder sb = new StringBuilder(p9.length() + 4);
                sb.append(p9);
                sb.append(";aia");
                p9 = sb.toString();
            }
        } catch (Exception e9) {
            C4906k.f40186C.f40196h.d("AdUtil.getUserAgent", e9);
        }
        return p9.concat(")");
    }

    public static ArrayList H() {
        C3324ha c3324ha = AbstractC3592ma.f32971a;
        ArrayList B3 = s2.r.f40506e.f40507a.B();
        ArrayList arrayList = new ArrayList();
        Iterator it = B3.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            com.bumptech.glide.manager.o d9 = com.bumptech.glide.manager.o.d(new PA(','));
            str.getClass();
            Iterator j6 = ((InterfaceC3146eB) d9.f24256w).j(d9, str);
            while (true) {
                AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
                if (abstractC3093dB.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) abstractC3093dB.next()));
                    } catch (NumberFormatException unused) {
                        z.k("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public static C3980tl I(Context context) {
        LocaleList systemLocales;
        LocaleList systemLocales2;
        if (Build.VERSION.SDK_INT < 33) {
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            return new C3980tl(locale.getLanguage(), locale.getCountry());
        }
        C3980tl c3980tl = new C3980tl(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        try {
            LocaleManager d9 = P.d.d(context.getSystemService(P.d.l()));
            if (d9 != null) {
                systemLocales = d9.getSystemLocales();
                if (!systemLocales.isEmpty()) {
                    systemLocales2 = d9.getSystemLocales();
                    Locale locale2 = systemLocales2.get(0);
                    return new C3980tl(locale2.getLanguage(), locale2.getCountry());
                }
            }
            return c3980tl;
        } catch (Throwable th) {
            C4906k.f40186C.f40196h.d("AdUtil.getSystemDefaultLocale", th);
            return c3980tl;
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
        return str2.startsWith(str) ? str2 : D.x.p(new StringBuilder(String.valueOf(str).length() + 1 + str2.length()), str, " ", str2);
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
            C4906k.f40186C.f40196h.d("AdUtil.getMapOfFileNamesToKeysFromJsonString", e9);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long Q(View view) {
        float f2 = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f2 = Math.min(f2, view2.getAlpha());
            view = view2.getParent();
        } while (f2 > 0.0f);
        return Math.round((f2 >= 0.0f ? f2 : 0.0f) * 100.0f);
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
            if (parent instanceof InterfaceC0354y) {
                return 4;
            }
            C3324ha c3324ha = AbstractC3592ma.d9;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                String str = (String) rVar.f40509c.a(AbstractC3592ma.e9);
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
                int i = z.f41712b;
                x2.i.c("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof t ? (t) queryLocalInterface : new s(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 1);
        } catch (Exception e9) {
            C4906k.f40186C.f40196h.d("Failed to instantiate WorkManagerUtil", e9);
            return null;
        }
    }

    public static final boolean c(Context context, String str) {
        int i = AbstractC2860We.f29161a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return X2.b.a(context).f60u.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        try {
            if (V2.b.f3401h == null) {
                V2.b.f3401h = Boolean.valueOf(V2.b.g() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return V2.b.f3401h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean e(String str) {
        if (x2.f.c()) {
            C3324ha c3324ha = AbstractC3592ma.f33008d6;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                String str2 = (String) rVar.f40509c.a(AbstractC3592ma.f33027f6);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33018e6);
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
            int i = z.f41712b;
            x2.i.d("Error loading class.", th);
            C4906k.f40186C.f40196h.d("AdUtil.isLiteSdk", th);
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
        int i4;
        int i6;
        int i9;
        String str2;
        String str3;
        String str4;
        St J;
        Ut z02;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof C2683Ln) {
                view2 = ((C2683Ln) view2).getChildAt(0);
            }
            if (view2 instanceof NativeAdView) {
                str = "NATIVE";
                i4 = 1;
            } else {
                str = "UNKNOWN";
                i4 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i9 = rect.width();
                i6 = rect.height();
            } else {
                i6 = 0;
                i9 = 0;
            }
            D d9 = C4906k.f40186C.f40191c;
            long Q8 = Q(view2);
            view2.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            String str5 = "none";
            if (!(view2 instanceof InterfaceC4084vh) || (z02 = ((InterfaceC4084vh) view2).z0()) == null) {
                str2 = str;
                str3 = "none";
            } else {
                str3 = z02.f28801b;
                int hashCode = view2.hashCode();
                str2 = str;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(hashCode).length());
                sb.append(str3);
                sb.append(":");
                sb.append(hashCode);
                view2.setContentDescription(sb.toString());
            }
            if (!(view2 instanceof InterfaceC4084vh) || (J = ((InterfaceC4084vh) view2).J()) == null) {
                str4 = str2;
            } else {
                str4 = St.a(J.f28391b);
                i4 = J.f28397e;
                str5 = J.f28364E;
            }
            Locale locale = Locale.US;
            String str6 = "<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str5 + ", gwsQueryId=" + str3 + ", format=" + str4 + ", impType=" + i4 + ", class=" + view2.getClass().getName() + ", x=" + i10 + ", y=" + i11 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i9 + ", vHeight=" + i6 + ", alpha=" + Q8 + ", state=" + Integer.toString(i, 2) + ">";
            int i12 = z.f41712b;
            x2.i.e(str6);
        } catch (Exception e9) {
            int i13 = z.f41712b;
            x2.i.d("Failure getting view location.", e9);
        }
    }

    public static final AlertDialog.Builder k(Context context) {
        O2.i iVar = C4906k.f40186C.f40194f;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final void l(Context context, St st, C3230fo c3230fo) {
        S0.e a9 = c3230fo.a();
        a9.M(NativeAdvancedJsUtils.f18693p, "can_show");
        C4906k c4906k = C4906k.f40186C;
        D d9 = c4906k.f40191c;
        a9.M("foreground", true != g(context) ? "1" : "0");
        a9.M("fg_al", true == c4906k.f40195g.p() ? "1" : "0");
        if (st != null) {
            List list = st.f28425t;
            if (!list.isEmpty()) {
                a9.M("ancn", (String) list.get(0));
            }
            a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, St.a(st.f28391b));
        }
        a9.N();
    }

    public static final boolean m(St st) {
        return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.df)).booleanValue() && st != null && st.f28397e == 4;
    }

    public static final int n(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e9) {
            String concat = "Could not parse value:".concat(e9.toString());
            int i = z.f41712b;
            x2.i.f(concat);
            return 0;
        }
    }

    public static final HashMap o(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33185x)).booleanValue()) {
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
        C4949p c4949p = C4949p.f40498g;
        return new int[]{c4949p.f40499a.h(activity, iArr[0]), c4949p.f40499a.h(activity, iArr[1])};
    }

    public static final boolean r(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z6 = C4906k.f40186C.f40191c.f41632e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || K(view);
        long Q8 = Q(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z6)) {
            C3324ha c3324ha = AbstractC3592ma.f32913T1;
            s2.r rVar = s2.r.f40506e;
            if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                C3324ha c3324ha2 = AbstractC3592ma.Xb;
                if (!((Boolean) rVar.f40509c.a(c3324ha2)).booleanValue() || Q8 >= ((Integer) r6.a(AbstractC3592ma.Zb)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void s(Context context, Intent intent) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.uc)).booleanValue()) {
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
            int i = z.f41712b;
            x2.i.g("", e9);
            C4906k.f40186C.f40196h.d("AdUtil.startActivityWithUnknownContext", e9);
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
            int i = z.f41712b;
            x2.i.a(sb2);
        } catch (ActivityNotFoundException e9) {
            int i4 = z.f41712b;
            x2.i.d("No browser is found.", e9);
        }
    }

    public static int u(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        String d9 = AbstractC5128c.d(i, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.", new StringBuilder(String.valueOf(i).length() + 86));
        int i4 = z.f41712b;
        x2.i.f(d9);
        return 60000;
    }

    public static final void v(Context context, Intent intent, C3230fo c3230fo, String str) {
        C3324ha c3324ha = AbstractC3592ma.Ie;
        s2.r rVar = s2.r.f40506e;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar.f40509c;
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue() || !(context instanceof C2779Rh)) {
            s(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.Ke))) {
                s(context, intent);
                return;
            }
            ((C2779Rh) context).a(intent);
            if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.Je)).booleanValue() || c3230fo == null) {
                return;
            }
            S0.e a9 = c3230fo.a();
            a9.M(NativeAdvancedJsUtils.f18693p, "hila");
            if (str == null) {
                str = "";
            }
            a9.M("gqi", str);
            a9.P();
        } catch (ActivityNotFoundException e9) {
            e = e9;
            int i = z.f41712b;
            x2.i.d("Error occurred while starting activity for result", e);
            C4906k.f40186C.f40196h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (SecurityException e10) {
            e = e10;
            int i4 = z.f41712b;
            x2.i.d("Error occurred while starting activity for result", e);
            C4906k.f40186C.f40196h.d("AdUtil.startActivityForResult", e);
            s(context, intent);
        } catch (Exception e11) {
            int i6 = z.f41712b;
            x2.i.d("Error occurred while starting activity for result", e11);
            C4906k.f40186C.f40196h.d("AdUtil.startActivityForResult", e11);
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
            return X2.b.a(context).f(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e9) {
            z.l("Error getting metadata", e9);
            return null;
        }
    }

    public static final void z(com.bumptech.glide.manager.n nVar, Bundle bundle) {
        if (bundle.isEmpty()) {
            return;
        }
        int i = bundle.getInt("h", -1);
        Intent intent = (Intent) nVar.f24249u;
        if (i >= 0) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
        }
        int i4 = bundle.getInt("cbp", -1);
        if (i4 < 0 || i4 > 2) {
            return;
        }
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException("Invalid value for the position argument");
        }
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i4);
    }

    public final void B(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int u6 = u(i);
        String d9 = AbstractC5128c.d(u6, "HTTP timeout: ", " milliseconds.", new StringBuilder(String.valueOf(u6).length() + 28));
        int i4 = z.f41712b;
        x2.i.e(d9);
        httpURLConnection.setConnectTimeout(u6);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(u6);
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
        AbstractC3592ma.a(context);
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new Q0.d(this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new Q0.d(this), intentFilter, 4);
        }
        this.i = true;
    }

    public final void D(Context context) {
        if (this.f41636j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        AbstractC3592ma.a(context);
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new C3991tw(1), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new C3991tw(1), intentFilter, 4);
        }
        this.f41636j = true;
    }

    public final String E(Context context, String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Gc)).booleanValue()) {
            if (this.f41635h != null) {
                return this.f41635h;
            }
            String A9 = A(context, str);
            if (str != null) {
                this.f41635h = A9;
            }
            return A9;
        }
        synchronized (this.f41633f) {
            try {
                String str2 = this.f41634g;
                if (str2 != null) {
                    return str2;
                }
                String A10 = A(context, str);
                if (str != null) {
                    this.f41634g = A10;
                }
                return A10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean F(String str) {
        return w(str, this.f41628a, (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32850M0));
    }

    public final boolean G(String str) {
        return w(str, this.f41629b, (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32859N0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (x2.d.s() != false) goto L29;
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
        C3324ha c3324ha = AbstractC3592ma.f33210z5;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (booleanValue) {
            C4077va c4077va = C4906k.f40186C.f40201n;
            if (c4077va.f35465w == null) {
                AbstractC3436jg.f32055a.execute(new RunnableC3134e(13, c4077va));
            }
            com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n(c4077va.f35465w);
            z(nVar, bundle);
            LP b9 = nVar.b();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32864N5)).booleanValue()) {
                x2.d dVar = C4949p.f40498g.f40499a;
            }
            ((Intent) b9.f26916u).setPackage(AbstractC4117wD.a(context));
            b9.i(context, uri);
            return 5;
        }
        if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33191x5)).booleanValue()) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(uri);
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return 9;
        }
        C4131wa c4131wa = new C4131wa();
        l4.q qVar = new l4.q();
        qVar.f38945n = c4131wa;
        qVar.f38946u = bundle;
        qVar.f38947v = context;
        qVar.f38948w = uri;
        Objects.requireNonNull(this);
        c4131wa.f35618d = qVar;
        Activity activity = (Activity) context;
        if (c4131wa.f35616b == null && (a9 = AbstractC4117wD.a(activity)) != null) {
            C3696oN c3696oN = new C3696oN(c4131wa);
            c4131wa.f35617c = c3696oN;
            AbstractC4820f.a(activity, a9, c3696oN);
        }
        return 5;
    }
}
