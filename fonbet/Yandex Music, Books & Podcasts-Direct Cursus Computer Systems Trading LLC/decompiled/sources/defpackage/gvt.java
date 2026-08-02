package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public abstract class gvt {
    public static int a = 0;
    public static long b = -1;
    public static long c = -1;
    public static long d = -1;
    public static String e = "";
    public static String f = "";
    public static String g = "NoCarrier";

    public static final boolean A(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str == null) {
            return false;
        }
        str.getClass();
        return new Regex(".+_cheets|cheets_.+").e(str);
    }

    public static final boolean B() {
        if (!bp6.a.contains(gvt.class)) {
            try {
                JSONObject q = q();
                if (q != null) {
                    try {
                        JSONArray jSONArray = q.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArray.getString(i);
                            string.getClass();
                            String lowerCase = string.toLowerCase();
                            lowerCase.getClass();
                            if (lowerCase.equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                bp6.a(gvt.class, th);
                return false;
            }
        }
        return false;
    }

    public static boolean C(Context context) {
        Method t = t("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (t != null) {
            Object y = y(null, t, context);
            if ((y instanceof Integer) && y.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean E(Uri uri) {
        if (uri != null) {
            return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final ArrayList F(JSONArray jSONArray) {
        jSONArray.getClass();
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static final HashMap G(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String H(Map map) {
        map.getClass();
        String str = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        str.getClass();
        return str;
    }

    public static final boolean I(Context context) {
        AutofillManager d2;
        context.getClass();
        context.getClass();
        return Build.VERSION.SDK_INT >= 26 && (d2 = td0.d(context.getSystemService(td0.e()))) != null && d2.isAutofillSupported() && d2.isEnabled();
    }

    public static final Bundle J(String str) {
        List split$default;
        List split$default2;
        Bundle bundle = new Bundle();
        if (!D(str)) {
            if (str == null) {
                xq0.q("Required value was null.");
                return null;
            }
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null);
            Object[] array = split$default.toArray(new String[0]);
            if (array == null) {
                jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                return null;
            }
            for (String str2 : (String[]) array) {
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = split$default2.toArray(new String[0]);
                if (array2 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                    return null;
                }
                String[] strArr = (String[]) array2;
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    HashSet hashSet = j3c.a;
                }
            }
        }
        return bundle;
    }

    public static final void K(qd0 qd0Var, SparseArray sparseArray) {
        if (qd0Var.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue f2 = wb8.f(sparseArray.get(keyAt));
            if (f2.isText()) {
                me2 me2Var = qd0Var.b;
                f2.getTextValue().toString();
                if (me2Var.a.get(Integer.valueOf(keyAt)) != null) {
                    l1j.f();
                    return;
                }
            } else {
                if (f2.isDate()) {
                    throw new uej("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (f2.isList()) {
                    throw new uej("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (f2.isToggle()) {
                    throw new uej("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L(Bundle bundle, JSONArray jSONArray) {
        bundle.getClass();
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    public static final void M(String str, String str2, Bundle bundle) {
        if (D(str2)) {
            return;
        }
        bundle.putString(str, str2);
    }

    public static final String N(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            String sb2 = sb.toString();
                            d(bufferedInputStream);
                            d(inputStreamReader);
                            return sb2;
                        }
                        sb.append(cArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    d(bufferedInputStream);
                    d(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
        }
    }

    public static final HashMap O(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    public static void P(MenuItem menuItem, char c2, int i) {
        menuItem.setAlphabeticShortcut(c2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Q(Context context, JSONObject jSONObject) {
        String str;
        Locale locale;
        int i;
        int i2;
        Display display;
        PackageInfo packageInfo;
        context.getClass();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i3 = 0;
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                displayName.getClass();
                e = displayName;
                String id = timeZone.getID();
                id.getClass();
                f = id;
            } catch (AssertionError | Exception unused) {
            }
            if (Intrinsics.d(g, "NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    if (systemService == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    networkOperatorName.getClass();
                    g = networkOperatorName;
                } catch (Exception unused2) {
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    File externalStorageDirectory = Environment.getExternalStorageDirectory();
                    externalStorageDirectory.getClass();
                    StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                    c = statFs.getBlockCount() * statFs.getBlockSize();
                }
                c = Math.round(c / 1.073741824E9d);
            } catch (Exception unused3) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
                    externalStorageDirectory2.getClass();
                    StatFs statFs2 = new StatFs(externalStorageDirectory2.getPath());
                    d = statFs2.getAvailableBlocks() * statFs2.getBlockSize();
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused4) {
            }
        }
        String packageName = context.getPackageName();
        int i4 = -1;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused5) {
            str = "";
        }
        if (packageInfo != null) {
            i4 = packageInfo.versionCode;
            str = packageInfo.versionName;
            jSONArray.put(packageName);
            jSONArray.put(i4);
            jSONArray.put(str);
            jSONArray.put(Build.VERSION.RELEASE);
            jSONArray.put(Build.MODEL);
            try {
                Resources resources = context.getResources();
                resources.getClass();
                locale = resources.getConfiguration().locale;
            } catch (Exception unused6) {
                locale = Locale.getDefault();
            }
            StringBuilder sb = new StringBuilder();
            locale.getClass();
            sb.append(locale.getLanguage());
            sb.append("_");
            sb.append(locale.getCountry());
            jSONArray.put(sb.toString());
            jSONArray.put(e);
            jSONArray.put(g);
            double d2 = 0.0d;
            try {
                Object systemService2 = context.getSystemService("display");
                if (!(systemService2 instanceof DisplayManager)) {
                    systemService2 = null;
                }
                DisplayManager displayManager = (DisplayManager) systemService2;
                display = displayManager != null ? displayManager.getDisplay(0) : null;
            } catch (Exception unused7) {
            }
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i5 = displayMetrics.widthPixels;
                try {
                    i3 = displayMetrics.heightPixels;
                    d2 = displayMetrics.density;
                } catch (Exception unused8) {
                }
                i = i3;
                i3 = i5;
                jSONArray.put(i3);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d2));
                i2 = a;
                if (i2 <= 0) {
                    try {
                        File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(ngb.f);
                        if (listFiles != null) {
                            a = listFiles.length;
                        }
                    } catch (Exception unused9) {
                    }
                    if (a <= 0) {
                        a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
                    }
                    i2 = a;
                }
                jSONArray.put(i2);
                jSONArray.put(c);
                jSONArray.put(d);
                jSONArray.put(f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
            i = 0;
            jSONArray.put(i3);
            jSONArray.put(i);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            i2 = a;
            if (i2 <= 0) {
            }
            jSONArray.put(i2);
            jSONArray.put(c);
            jSONArray.put(d);
            jSONArray.put(f);
            jSONObject.put("extinfo", jSONArray.toString());
        }
    }

    public static void R(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void S(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }

    public static void T(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void U(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static final void V(StaticLayout.Builder builder, int i) {
        builder.setJustificationMode(i);
    }

    public static void W(MenuItem menuItem, char c2, int i) {
        menuItem.setNumericShortcut(c2, i);
    }

    public static void X(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static final String Y(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.getClass();
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void Z(Parcel parcel, HashMap hashMap) {
        parcel.getClass();
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        build.getClass();
        return build;
    }

    public static void b(Context context, String str) {
        List split$default;
        List split$default2;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie != null) {
            split$default = StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null);
            Object[] array = split$default.toArray(new String[0]);
            if (array == null) {
                jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                return;
            }
            for (String str2 : (String[]) array) {
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, null);
                Object[] array2 = split$default2.toArray(new String[0]);
                if (array2 == null) {
                    jj4.j("null cannot be cast to non-null type kotlin.Array<T>");
                    return;
                }
                String[] strArr = (String[]) array2;
                if (strArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    String str3 = strArr[0];
                    int length = str3.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.e(str3.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    sb.append(str3.subSequence(i, length + 1).toString());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    cookieManager.setCookie(str, sb.toString());
                }
            }
            cookieManager.removeExpiredCookie();
        }
    }

    public static final void c(Context context) {
        context.getClass();
        b(context, "facebook.com");
        b(context, ".facebook.com");
        b(context, "https://facebook.com");
        b(context, "https://.facebook.com");
    }

    public static final void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String e(String str) {
        return D(str) ? "" : str;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        if (names != null) {
            int length = names.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = names.getString(i);
                    string.getClass();
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = g((JSONObject) obj);
                    }
                    obj.getClass();
                    hashMap.put(string, obj);
                } catch (JSONException unused) {
                }
            }
        }
        return hashMap;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                next.getClass();
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    public static final int i(InputStream inputStream, FilterOutputStream filterOutputStream) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[RemoteCameraConfig.Notification.ID];
            int i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                filterOutputStream.write(bArr, 0, read);
                i += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static boolean k(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void l(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i = configuration.colorMode;
        int i7 = i & 3;
        i2 = configuration2.colorMode;
        int i8 = i2 & 3;
        if (i7 != i8) {
            i6 = configuration3.colorMode;
            configuration3.colorMode = i6 | i8;
        }
        i3 = configuration.colorMode;
        int i9 = i3 & 12;
        i4 = configuration2.colorMode;
        int i10 = i4 & 12;
        if (i9 != i10) {
            i5 = configuration3.colorMode;
            configuration3.colorMode = i5 | i10;
        }
    }

    public static final String m(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String n(Context context) {
        context.getClass();
        try {
            HashSet hashSet = j3c.a;
            wxf.J();
            String str = j3c.d;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date o(Bundle bundle, String str, Date date) {
        long parseLong;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + date.getTime());
    }

    public static float[] p(ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return colorMatrix.getArray();
    }

    public static final JSONObject q() {
        if (bp6.a.contains(gvt.class)) {
            return null;
        }
        try {
            String string = j3c.b().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            bp6.a(gvt.class, th);
            return null;
        }
    }

    public static final void r(evt evtVar, String str) {
        String str2;
        str.getClass();
        JSONObject jSONObject = (JSONObject) utm.a.get(str);
        if (jSONObject != null) {
            evtVar.b(jSONObject);
            return;
        }
        fvt fvtVar = new fvt(evtVar, str);
        Bundle bundle = new Bundle();
        Date date = ja.l;
        ja N = n7w.N();
        if (N == null || (str2 = N.k) == null) {
            str2 = "facebook";
        }
        bundle.putString("fields", str2.equals("instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", str);
        ood oodVar = new ood(null, "me", bundle, z6e.a, null, 0);
        HashSet hashSet = j3c.a;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        oodVar.f = fvtVar;
        oodVar.d();
    }

    public static final Method s(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method t(String str, String str2, Class... clsArr) {
        try {
            return s(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static float u(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float v(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static final Object w(JSONObject jSONObject, String str, String str2) {
        jSONObject.getClass();
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new c3c("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt(str2, opt);
        return jSONObject2;
    }

    public static final gqt x(JSONObject jSONObject) {
        String optString;
        jSONObject.getClass();
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (optString2 != null && !optString2.equals("installed") && (optString = optJSONObject.optString("status")) != null) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        gqt gqtVar = new gqt();
        gqtVar.a = arrayList;
        gqtVar.b = arrayList2;
        gqtVar.c = arrayList3;
        return gqtVar;
    }

    public static final Object y(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean z() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{j3c.c()}, 1))));
            Context b2 = j3c.b();
            PackageManager packageManager = b2.getPackageManager();
            String packageName = b2.getPackageName();
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX).iterator();
            while (it.hasNext()) {
                if (Intrinsics.d(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
