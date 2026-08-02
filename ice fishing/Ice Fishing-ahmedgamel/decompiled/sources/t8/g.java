package t8;

import E2.M;
import E2.x;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.AbstractC3093dB;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C2964aq;
import com.google.android.gms.internal.ads.C3075cu;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.InterfaceC3146eB;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C4853a;
import r2.C4906k;
import s2.C4949p;
import s2.O;
import s2.c1;
import s2.r;
import s7.AbstractC4977a;
import u1.InterfaceC5065d;
import w2.D;
import w2.z;

/* loaded from: classes2.dex */
public abstract class g {
    public static JSONObject A(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e9) {
            e = e9;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i = point2.x;
                C4949p c4949p = C4949p.f40498g;
                jSONObject3.put("x", c4949p.f40499a.h(context, i));
                jSONObject3.put("y", c4949p.f40499a.h(context, point2.y));
                jSONObject3.put("start_x", c4949p.f40499a.h(context, point.x));
                jSONObject3.put("start_y", c4949p.f40499a.h(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e10) {
                int i4 = z.f41712b;
                x2.i.d("Error occurred while putting signals into JSON object.", e10);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            jSONObject2 = jSONObject;
            int i6 = z.f41712b;
            x2.i.d("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int B(C3075cu c3075cu) {
        if (c3075cu.f30407s) {
            return 2;
        }
        c1 c1Var = c3075cu.f30393d;
        O o4 = c1Var.f40406L;
        String str = c1Var.f40411Q;
        if (o4 == null && str == null) {
            return 1;
        }
        if (o4 == null || str == null) {
            return o4 != null ? 3 : 4;
        }
        return 5;
    }

    public static boolean C(Context context, St st) {
        AbstractC3093dB abstractC3093dB;
        if (!st.f28377N) {
            return false;
        }
        C3324ha c3324ha = AbstractC3592ma.h9;
        r rVar = r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (booleanValue) {
            return ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.k9)).booleanValue();
        }
        String str = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.i9);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        com.bumptech.glide.manager.o d9 = com.bumptech.glide.manager.o.d(new PA(';'));
        Iterator j6 = ((InterfaceC3146eB) d9.f24256w).j(d9, str);
        do {
            abstractC3093dB = (AbstractC3093dB) j6;
            if (!abstractC3093dB.hasNext()) {
                return false;
            }
        } while (!((String) abstractC3093dB.next()).equals(packageName));
        return true;
    }

    public static JSONObject D(Context context) {
        JSONObject jSONObject = new JSONObject();
        D d9 = C4906k.f40186C.f40191c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i = displayMetrics.widthPixels;
            C4949p c4949p = C4949p.f40498g;
            jSONObject.put("width", c4949p.f40499a.h(context, i));
            jSONObject.put("height", c4949p.f40499a.h(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams E() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) r.f40506e.f40509c.a(AbstractC3592ma.j9)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject F(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i = rect.right - rect.left;
        C4949p c4949p = C4949p.f40498g;
        jSONObject.put("width", c4949p.f40499a.h(context, i));
        int i4 = rect.bottom - rect.top;
        x2.d dVar = c4949p.f40499a;
        jSONObject.put("height", dVar.h(context, i4));
        jSONObject.put("x", dVar.h(context, rect.left));
        jSONObject.put("y", dVar.h(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int G(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b9 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b9)));
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q f(Context context) {
        ProviderInfo providerInfo;
        M m9;
        ApplicationInfo applicationInfo;
        O2.i cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(12) : new O2.i(12);
        PackageManager packageManager = context.getPackageManager();
        A8.b.e(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j6 = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j6) {
                    arrayList.add(signature.toByteArray());
                }
                m9 = new M(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e9) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e9);
            }
            if (m9 != null) {
                return null;
            }
            return new q(new p(context, m9));
        }
        m9 = null;
        if (m9 != null) {
        }
    }

    public static C4853a g(Map attributes) {
        kotlin.jvm.internal.h.e(attributes, "attributes");
        C4853a c4853a = C4853a.f39847c;
        c4853a.getClass();
        K1.c cVar = new K1.c(1);
        cVar.d(c4853a.f39849b);
        String str = c4853a.f39848a;
        if (str == null) {
            str = null;
        }
        k6.e eVar = AbstractC4977a.f40545a;
        if (eVar != null && !eVar.f38613b.isEmpty()) {
            cVar.c(eVar, "OneSignalDeviceSDK");
        }
        for (Map.Entry entry : attributes.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null && str3 != null) {
                cVar.b(str2, str3);
            }
        }
        return C4853a.a(cVar.a(), str);
    }

    public static int h(String str, int i, int i4, boolean z6) {
        while (i < i4) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z6)) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static int i(ArrayList arrayList, InputStream inputStream, C2964aq c2964aq) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new D1.z(inputStream, c2964aq);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int b9 = ((InterfaceC5065d) arrayList.get(i)).b(inputStream, c2964aq);
                    if (b9 != -1) {
                        return b9;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static String j(byte[] bArr) {
        int a9;
        N6.c cVar = new N6.c(bArr, 0);
        boolean z6 = false;
        while (!z6) {
            int i = cVar.f2047c;
            int i4 = cVar.f2046b;
            if (i == i4) {
                cVar.f2048d = 0;
                a9 = 0;
            } else {
                a9 = cVar.a();
                cVar.f2048d = a9;
                if ((a9 >>> 3) == 0) {
                    throw new IOException("Invalid tag: " + cVar.f2048d);
                }
            }
            if (a9 != 0) {
                byte[] bArr2 = cVar.f2045a;
                if (a9 == 18) {
                    int a10 = cVar.a();
                    if (a10 > 0) {
                        int i6 = cVar.f2047c;
                        if (a10 <= i4 - i6) {
                            String str = new String(bArr2, i6, a10, StandardCharsets.UTF_8);
                            cVar.f2047c += a10;
                            return str;
                        }
                    }
                    if (a10 == 0) {
                        return "";
                    }
                    if (a10 <= 0) {
                        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                int i9 = a9 & 7;
                if (i9 == 0) {
                    if (i4 - cVar.f2047c >= 10) {
                        for (int i10 = 0; i10 < 10; i10++) {
                            int i11 = cVar.f2047c;
                            cVar.f2047c = i11 + 1;
                            if (bArr2[i11] >= 0) {
                                break;
                            }
                        }
                        throw new IOException("CodedInputStream encountered a malformed varint.");
                    }
                    for (int i12 = 0; i12 < 10; i12++) {
                        int i13 = cVar.f2047c;
                        if (i13 == i4) {
                            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        cVar.f2047c = i13 + 1;
                        if (bArr2[i13] >= 0) {
                            break;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
                if (i9 == 1) {
                    cVar.b(8);
                } else if (i9 == 2) {
                    cVar.b(cVar.a());
                } else {
                    if (i9 != 5) {
                        throw new IOException(Wv.f(a9, "Invalid wire type: "));
                    }
                    cVar.b(4);
                }
            } else {
                z6 = true;
            }
        }
        return "";
    }

    public static ImageHeaderParser$ImageType k(ArrayList arrayList, InputStream inputStream, C2964aq c2964aq) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new D1.z(inputStream, c2964aq);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType c9 = ((InterfaceC5065d) arrayList.get(i)).c(inputStream);
                inputStream.reset();
                if (c9 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c9;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType l(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType a9 = ((InterfaceC5065d) arrayList.get(i)).a(byteBuffer);
                AtomicReference atomicReference = P1.b.f2352a;
                if (a9 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a9;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = P1.b.f2352a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static void m(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static long n(int i, String str) {
        int h3 = h(str, 0, i, false);
        Matcher matcher = i8.j.f38254n.matcher(str);
        int i4 = -1;
        int i6 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (h3 < i) {
            int h9 = h(str, h3 + 1, i, true);
            matcher.region(h3, h9);
            if (i6 == -1 && matcher.usePattern(i8.j.f38254n).matches()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.h.d(group, "group(...)");
                i6 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                kotlin.jvm.internal.h.d(group2, "group(...)");
                i11 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                kotlin.jvm.internal.h.d(group3, "group(...)");
                i12 = Integer.parseInt(group3);
            } else if (i9 == -1 && matcher.usePattern(i8.j.f38253m).matches()) {
                String group4 = matcher.group(1);
                kotlin.jvm.internal.h.d(group4, "group(...)");
                i9 = Integer.parseInt(group4);
            } else {
                if (i10 == -1) {
                    Pattern pattern = i8.j.f38252l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        kotlin.jvm.internal.h.d(group5, "group(...)");
                        Locale US = Locale.US;
                        kotlin.jvm.internal.h.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.h.d(pattern2, "pattern(...)");
                        i10 = Q7.j.q0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i4 == -1 && matcher.usePattern(i8.j.f38251k).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.h.d(group6, "group(...)");
                    i4 = Integer.parseInt(group6);
                }
            }
            h3 = h(str, h9 + 1, i, false);
        }
        if (70 <= i4 && i4 < 100) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 < 70) {
            i4 += 2000;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i9 || i9 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(j8.d.f38495a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i4);
        gregorianCalendar.set(2, i10 - 1);
        gregorianCalendar.set(5, i9);
        gregorianCalendar.set(11, i6);
        gregorianCalendar.set(12, i11);
        gregorianCalendar.set(13, i12);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static boolean r(int i) {
        C3324ha c3324ha = AbstractC3592ma.f33116p4;
        r rVar = r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            return ((Boolean) rVar.f40509c.a(AbstractC3592ma.f33126q4)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String s(String str) {
        char c9;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|4|5|(5:8|9|10|11|6)|66|67|68|69|(1:71)(1:74)|72|14|(7:58|59|17|18|19|20|(10:22|(8:26|27|(2:29|(1:31)(1:49))(1:50)|32|33|(3:42|43|(1:45))|35|(2:37|38))|51|27|(0)(0)|32|33|(0)|35|(0))(10:52|(8:54|27|(0)(0)|32|33|(0)|35|(0))|51|27|(0)(0)|32|33|(0)|35|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r3 = w2.z.f41712b;
        x2.i.d("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153 A[Catch: JSONException -> 0x014c, TRY_LEAVE, TryCatch #6 {JSONException -> 0x014c, blocks: (B:19:0x011b, B:31:0x0148, B:49:0x014e, B:50:0x0153), top: B:18:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject t(Context context, View view) {
        int i;
        ViewParent parent;
        String str;
        int hashCode;
        int i4;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            int i6 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i = i6;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i]);
                        parent2 = parent2.getParent();
                        i6 = i;
                    } catch (Exception unused) {
                        int i9 = z.f41712b;
                        x2.i.f("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                        }
                        str = "";
                        hashCode = str.hashCode();
                        if (hashCode == -2066603854) {
                        }
                    }
                }
                i = i6;
                JSONObject jSONObject3 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C4949p c4949p = C4949p.f40498g;
                x2.d dVar = c4949p.f40499a;
                x2.d dVar2 = c4949p.f40499a;
                jSONObject3.put("width", dVar.h(context, measuredWidth));
                jSONObject3.put("height", dVar2.h(context, view.getMeasuredHeight()));
                jSONObject3.put("x", dVar2.h(context, iArr[0]));
                jSONObject3.put("y", dVar2.h(context, iArr[i]));
                jSONObject3.put("maximum_visible_width", dVar2.h(context, iArr2[0]));
                jSONObject3.put("maximum_visible_height", dVar2.h(context, iArr2[i]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = F(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", dVar2.h(context, iArr[0]));
                    jSONObject4.put("y", dVar2.h(context, iArr[i]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused2) {
                i = i6;
            }
            parent = view.getParent();
            if (parent != null) {
                try {
                    str = (String) parent.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent, new Object[0]);
                } catch (IllegalAccessException e9) {
                    e = e9;
                    int i10 = z.f41712b;
                    x2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (NoSuchMethodException unused3) {
                } catch (SecurityException e10) {
                    e = e10;
                    int i102 = z.f41712b;
                    x2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                } catch (InvocationTargetException e11) {
                    e = e11;
                    int i1022 = z.f41712b;
                    x2.i.d("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode == -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode == -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        i4 = i;
                        if (i4 != 0) {
                            jSONObject2.put("native_template_type", i);
                        } else if (i4 != i) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.c9)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", G(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", G(r0.height) - 1);
                                }
                            } catch (Exception unused4) {
                                z.k("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.g9)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (JSONException e12) {
                                int i11 = z.f41712b;
                                x2.i.d("Could not log container view alpha signal to JSON", e12);
                            }
                        }
                    }
                    i4 = -1;
                    if (i4 != 0) {
                    }
                    if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.c9)).booleanValue()) {
                    }
                    if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.g9)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        i4 = 0;
                        if (i4 != 0) {
                        }
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.c9)).booleanValue()) {
                        }
                        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.g9)).booleanValue()) {
                        }
                    }
                    i4 = -1;
                    if (i4 != 0) {
                    }
                    if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.c9)).booleanValue()) {
                    }
                    if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.g9)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode == -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static String u(c1 c1Var) {
        Bundle bundle;
        return (c1Var == null || (bundle = c1Var.f40419v) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static JSONObject v(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                C3324ha c3324ha = AbstractC3592ma.Y8;
                r rVar = r.f40506e;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar.f40509c;
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue()) {
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.Z8)).booleanValue()) {
                        D d9 = C4906k.f40186C.f40191c;
                        jSONObject.put("contained_in_scroll_view", D.a(view) != 0);
                    }
                    if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.a9)).booleanValue()) {
                        D d10 = C4906k.f40186C.f40191c;
                        jSONObject.put("scroll_view_type", D.a(view));
                        return jSONObject;
                    }
                } else {
                    D d11 = C4906k.f40186C.f40191c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int w(Bundle bundle) {
        char c9;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (!TextUtils.isEmpty(string)) {
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        c9 = '\b';
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    return 1;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                    return 6;
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case '\b':
                    return 10;
            }
        }
        return 2;
    }

    public static JSONObject x(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                D d9 = C4906k.f40186C.f40191c;
                jSONObject.put("can_show_on_lock_screen", D.K(view));
                boolean z6 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z6 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z6);
                return jSONObject;
            } catch (JSONException unused) {
                int i = z.f41712b;
                x2.i.f("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject y(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        int[] iArr;
        JSONObject jSONObject;
        ViewGroup.LayoutParams layoutParams;
        String str2 = "ad_view";
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            C4949p c4949p = C4949p.f40498g;
                            x2.d dVar = c4949p.f40499a;
                            x2.d dVar2 = c4949p.f40499a;
                            jSONObject4.put("width", dVar.h(context, measuredWidth));
                            jSONObject4.put("height", dVar2.h(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", dVar2.h(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", dVar2.h(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", str2);
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = F(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", dVar2.h(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", dVar2.h(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", str2);
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                C3324ha c3324ha = AbstractC3592ma.b9;
                                r rVar = r.f40506e;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2 = rVar.f40509c;
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.c9)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject3.put("view_width_layout_type", G(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", G(layoutParams.height) - 1);
                                }
                                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka2.a(AbstractC3592ma.f9)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                str = str2;
                                try {
                                    jSONObject3.put("font_size", textView.getTextSize());
                                    jSONObject3.put(com.anythink.basead.exoplayer.k.o.f9232c, textView.getText());
                                } catch (JSONException unused) {
                                    int i4 = z.f41712b;
                                    x2.i.f("Unable to get asset views information");
                                    it = it2;
                                    str2 = str;
                                    iArr2 = iArr;
                                    i = 2;
                                }
                            } else {
                                str = str2;
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.g9)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused2) {
                            str = str2;
                        }
                    } catch (JSONException unused3) {
                        str = str2;
                        iArr = iArr2;
                    }
                    it = it2;
                    str2 = str;
                    iArr2 = iArr;
                    i = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static void z(C3391io c3391io, String str, Pair... pairArr) {
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32893Q7)).booleanValue()) {
            AbstractC3436jg.f32055a.execute(new x(2, c3391io, str, pairArr));
        }
    }

    public abstract boolean b(U0.i iVar, U0.d dVar, U0.d dVar2);

    public abstract boolean c(U0.i iVar, Object obj, Object obj2);

    public abstract boolean d(U0.i iVar, U0.h hVar, U0.h hVar2);

    public abstract void o(U0.h hVar, U0.h hVar2);

    public abstract void p(U0.h hVar, Thread thread);

    public abstract void q();
}
