package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class jkl implements lci, bya {
    public static final String c(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr4 = cvt.a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr5 = cvt.a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i7, i9, charset);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, String str2, float[] fArr) {
        boolean contains;
        boolean contains2;
        HashSet hashSet = ofu.e;
        AtomicBoolean atomicBoolean = oqr.a;
        if (!bp6.a.contains(oqr.class)) {
            try {
                str.getClass();
                contains = oqr.b.contains(str);
            } catch (Throwable th) {
                bp6.a(oqr.class, th);
            }
            if (!contains) {
                pt0 pt0Var = new pt0(j3c.b(), (String) null);
                if (bp6.a.contains(pt0Var)) {
                    return;
                }
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("_is_suggested_event", "1");
                    bundle.putString("_button_text", str2);
                    pt0Var.w(bundle, str);
                    return;
                } catch (Throwable th2) {
                    bp6.a(pt0Var, th2);
                    return;
                }
            }
            if (!bp6.a.contains(oqr.class)) {
                try {
                    str.getClass();
                    contains2 = oqr.c.contains(str);
                } catch (Throwable th3) {
                    bp6.a(oqr.class, th3);
                }
                if (contains2) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                try {
                    bundle2.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float f : fArr) {
                        sb.append(f);
                        sb.append(StringUtils.COMMA);
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle2.putString("metadata", jSONObject.toString());
                    String str3 = ood.j;
                    ood S = h1b.S(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{j3c.c()}, 1)), null, null);
                    S.d = bundle2;
                    S.c();
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            contains2 = false;
            if (contains2) {
            }
        }
        contains = false;
        if (!contains) {
        }
    }

    public static final boolean e(String str, String str2) {
        HashSet hashSet = ofu.e;
        LinkedHashMap linkedHashMap = qlm.a;
        String str3 = null;
        if (!bp6.a.contains(qlm.class)) {
            try {
                LinkedHashMap linkedHashMap2 = qlm.a;
                if (linkedHashMap2.containsKey(str)) {
                    str3 = (String) linkedHashMap2.get(str);
                }
            } catch (Throwable th) {
                bp6.a(qlm.class, th);
            }
        }
        boolean z = false;
        if (str3 == null) {
            return false;
        }
        if (!str3.equals("other")) {
            try {
                j3c.d().execute(new e8h(str3, str2, z, 27));
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(View view, View view2, String str) {
        HashSet hashSet;
        Field field;
        Field field2;
        Object obj;
        view.getClass();
        str.getClass();
        int hashCode = view.hashCode();
        HashSet hashSet2 = ofu.e;
        HashSet hashSet3 = null;
        if (!bp6.a.contains(ofu.class)) {
            try {
                hashSet = ofu.e;
            } catch (Throwable th) {
                bp6.a(ofu.class, th);
            }
            if (hashSet.contains(Integer.valueOf(hashCode))) {
                ofu ofuVar = new ofu(view, view2, str);
                if (!bp6.a.contains(qeu.class)) {
                    try {
                        try {
                            field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                            try {
                                field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                field2 = null;
                                if (field != null) {
                                }
                                view.setOnClickListener(ofuVar);
                                if (!bp6.a.contains(ofu.class)) {
                                }
                                hashSet3.add(Integer.valueOf(hashCode));
                                return;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                            field = null;
                        }
                        if (field != null || field2 == null) {
                            view.setOnClickListener(ofuVar);
                        } else {
                            field.setAccessible(true);
                            field2.setAccessible(true);
                            try {
                                field.setAccessible(true);
                                obj = field.get(view);
                            } catch (IllegalAccessException unused3) {
                                obj = null;
                            }
                            if (obj == null) {
                                view.setOnClickListener(ofuVar);
                            } else {
                                field2.set(obj, ofuVar);
                            }
                        }
                    } catch (Exception unused4) {
                    } catch (Throwable th2) {
                        bp6.a(qeu.class, th2);
                    }
                }
                if (!bp6.a.contains(ofu.class)) {
                    try {
                        hashSet3 = ofu.e;
                    } catch (Throwable th3) {
                        bp6.a(ofu.class, th3);
                    }
                }
                hashSet3.add(Integer.valueOf(hashCode));
                return;
            }
            return;
        }
        hashSet = null;
        if (hashSet.contains(Integer.valueOf(hashCode))) {
        }
    }

    public static z3s g(String str) {
        Object obj;
        rdb rdbVar = z3s.f;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((z3s) obj).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        return (z3s) obj;
    }

    public static int h(Number number, boolean z) {
        return (z || Intrinsics.e(number.intValue(), 180) >= 0) ? R.layout.plus_sdk_daily_widget_available_layout_normal : R.layout.plus_sdk_daily_widget_available_layout_small;
    }

    public static kft i(p6a p6aVar) {
        if (p6aVar != null) {
            return new kft(p6aVar.a);
        }
        if (p6aVar == null) {
            return new kft("yandexmusic://home");
        }
        b6e.s();
        return null;
    }

    public static rft j(x6a x6aVar, Context context, Number number, boolean z) {
        Drawable drawable;
        x6aVar.getClass();
        number.getClass();
        Resources resources = context.getResources();
        resources.getClass();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        displayMetrics.getClass();
        int intValue = Float.valueOf(TypedValue.applyDimension(1, number.floatValue(), displayMetrics)).intValue();
        if (Build.VERSION.SDK_INT >= 31) {
            drawable = new ColorDrawable(context.getColor(R.color.plus_sdk_daily_widget_background));
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            configuration.getClass();
            drawable = context.getDrawable((configuration.uiMode & 48) == 32 ? R.drawable.plus_sdk_daily_widget_gradient_background_dark : R.drawable.plus_sdk_daily_widget_gradient_background_light);
            drawable.getClass();
        }
        Drawable drawable2 = drawable;
        int k = k(context);
        Bitmap N = vq2.N(new hl4(k, k, k, k, drawable2), intValue, intValue, 4);
        if (x6aVar instanceof q6a) {
            q6a q6aVar = (q6a) x6aVar;
            Resources resources2 = context.getResources();
            resources2.getClass();
            DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
            displayMetrics2.getClass();
            int intValue2 = Float.valueOf(TypedValue.applyDimension(1, number.floatValue(), displayMetrics2)).intValue();
            Drawable drawable3 = context.getDrawable(2131232532);
            drawable3.getClass();
            Bitmap N2 = vq2.N(drawable3, intValue2, intValue2, 4);
            Drawable drawable4 = context.getDrawable(2131232531);
            drawable4.getClass();
            return new lft(h(number, z), N, q6aVar.b, i(q6aVar.c), q6aVar.d, N2, vq2.N(bg3.X(drawable4, k(context), 0, 11), intValue2, intValue2, 4));
        }
        if (x6aVar instanceof s6a) {
            s6a s6aVar = (s6a) x6aVar;
            Resources resources3 = context.getResources();
            resources3.getClass();
            DisplayMetrics displayMetrics3 = resources3.getDisplayMetrics();
            displayMetrics3.getClass();
            int intValue3 = Float.valueOf(TypedValue.applyDimension(1, number.floatValue(), displayMetrics3)).intValue();
            Drawable drawable5 = context.getDrawable(2131232533);
            drawable5.getClass();
            return new mft(h(number, z), N, s6aVar.b, i(s6aVar.c), s6aVar.d, vq2.N(drawable5, intValue3, intValue3, 4));
        }
        if (x6aVar instanceof t6a) {
            t6a t6aVar = (t6a) x6aVar;
            Resources resources4 = context.getResources();
            resources4.getClass();
            DisplayMetrics displayMetrics4 = resources4.getDisplayMetrics();
            displayMetrics4.getClass();
            int intValue4 = Float.valueOf(TypedValue.applyDimension(1, number.floatValue(), displayMetrics4)).intValue();
            Drawable drawable6 = context.getDrawable(2131232536);
            drawable6.getClass();
            return new nft(h(number, z), N, t6aVar.b, i(t6aVar.c), t6aVar.d, vq2.N(drawable6, intValue4, intValue4, 4));
        }
        if (x6aVar instanceof u6a) {
            u6a u6aVar = (u6a) x6aVar;
            Resources resources5 = context.getResources();
            resources5.getClass();
            DisplayMetrics displayMetrics5 = resources5.getDisplayMetrics();
            displayMetrics5.getClass();
            int intValue5 = Float.valueOf(TypedValue.applyDimension(1, number.floatValue(), displayMetrics5)).intValue();
            Drawable drawable7 = context.getDrawable(2131232539);
            drawable7.getClass();
            Bitmap N3 = vq2.N(bg3.X(drawable7, 0, k(context), 7), intValue5, intValue5, 4);
            Drawable drawable8 = context.getDrawable(2131232540);
            drawable8.getClass();
            return new pft(h(number, z), N, u6aVar.b, i(u6aVar.c), u6aVar.d, N3, vq2.N(bg3.X(drawable8, k(context), 0, 11), intValue5, intValue5, 4));
        }
        if (x6aVar.equals(v6a.a)) {
            int i = (z || Intrinsics.e(number.intValue(), 180) >= 0) ? R.layout.plus_sdk_daily_widget_not_available_layout_normal : R.layout.plus_sdk_daily_widget_not_available_layout_small;
            String J = etn.J(context, R.string.Home_NativeWidget_Daily_LoginRequired_Title);
            J.getClass();
            kft kftVar = new kft("yandexmusic://home");
            tpi tpiVar = vso.b;
            tpiVar.getClass();
            return new qft(i, N, J, kftVar, tpiVar);
        }
        if (x6aVar.equals(w6a.a)) {
            int i2 = (z || Intrinsics.e(number.intValue(), 180) >= 0) ? R.layout.plus_sdk_daily_widget_not_available_layout_normal : R.layout.plus_sdk_daily_widget_not_available_layout_small;
            String J2 = etn.J(context, R.string.Home_NativeWidget_Daily_SubscriptionRequired_Title);
            J2.getClass();
            kft kftVar2 = new kft("yandexmusic://plus-home-sdk/home");
            tpi tpiVar2 = vso.b;
            tpiVar2.getClass();
            return new oft(i2, N, J2, kftVar2, tpiVar2);
        }
        if (!x6aVar.equals(r6a.a)) {
            b6e.s();
            return null;
        }
        Resources resources6 = context.getResources();
        resources6.getClass();
        DisplayMetrics displayMetrics6 = resources6.getDisplayMetrics();
        displayMetrics6.getClass();
        int intValue6 = Float.valueOf(TypedValue.applyDimension(1, number.floatValue(), displayMetrics6)).intValue();
        Drawable drawable9 = context.getDrawable(2131232532);
        drawable9.getClass();
        Bitmap N4 = vq2.N(drawable9, intValue6, intValue6, 4);
        Drawable drawable10 = context.getDrawable(2131232531);
        drawable10.getClass();
        Bitmap N5 = vq2.N(bg3.X(drawable10, k(context), 0, 11), intValue6, intValue6, 4);
        int h = h(number, z);
        String J3 = etn.J(context, R.string.Home_NativeWidget_Daily_DefaultFallback_Title);
        J3.getClass();
        kft kftVar3 = new kft("yandexmusic://plus-home-sdk/smart-webview?showNavBar=false&url=https%3A%2F%2Fsp.yandex.ru%2Fdaily%3Futm_source%3Dmusic%26utm_medium%3Dmusic_widget_android%26utm_campaign%3Ddaily&showNavBar=false&showDash=true&plus-smart-broadcast-id=activity");
        tpi tpiVar3 = vso.b;
        tpiVar3.getClass();
        return new lft(h, N, J3, kftVar3, tpiVar3, N4, N5);
    }

    public static int k(Context context) {
        Integer num = 20;
        if (Build.VERSION.SDK_INT < 31) {
            Resources resources = context.getResources();
            resources.getClass();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            displayMetrics.getClass();
            return Float.valueOf(TypedValue.applyDimension(1, num.floatValue(), displayMetrics)).intValue();
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(android.R.dimen.system_app_widget_background_radius);
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        if (dimensionPixelSize <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        Resources resources2 = context.getResources();
        resources2.getClass();
        DisplayMetrics displayMetrics2 = resources2.getDisplayMetrics();
        displayMetrics2.getClass();
        return Float.valueOf(TypedValue.applyDimension(1, num.floatValue(), displayMetrics2)).intValue();
    }

    public static JSONObject l(vxp vxpVar) {
        Uri uri = vxpVar.c;
        if (!gvt.E(uri)) {
            throw new c3c("Only web images may be used in OG objects shared via the web dialog");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri.toString());
            return jSONObject;
        } catch (JSONException e) {
            throw new c3c("Unable to attach images", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x017a, code lost:
    
        if (r3 != false) goto L101;
     */
    @Override // defpackage.bya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a(Context context, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e;
        int readInt;
        Cursor cursor;
        try {
            synchronized (cya.class) {
                Boolean bool = cya.c;
                boolean z2 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                cya.d(classLoader);
                            } catch (aya unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!cya.e(context)) {
                                return 0;
                            }
                            if (!cya.e) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int c = cya.c(context, z, true);
                                        String str = cya.d;
                                        if (str != null && !str.isEmpty()) {
                                            ClassLoader l0 = y2x.l0();
                                            if (l0 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    zxa.b();
                                                    String str2 = cya.d;
                                                    y1g.G(str2);
                                                    l0 = zxa.a(ClassLoader.getSystemClassLoader(), str2);
                                                } else {
                                                    String str3 = cya.d;
                                                    y1g.G(str3);
                                                    l0 = new h5x(str3, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            cya.d(l0);
                                            declaredField.set(null, l0);
                                            cya.c = bool2;
                                            return c;
                                        }
                                        return c;
                                    } catch (aya unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        cya.c = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return cya.c(context, z, false);
                    } catch (aya e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                rjx f = cya.f(context);
                try {
                    if (f == null) {
                        return 0;
                    }
                    try {
                        Parcel L0 = f.L0(f.M0(), 6);
                        int readInt2 = L0.readInt();
                        L0.recycle();
                        if (readInt2 < 3) {
                            if (readInt2 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                zhj zhjVar = new zhj(context);
                                Parcel M0 = f.M0();
                                z4x.c(M0, zhjVar);
                                M0.writeString("com.google.android.gms.cast.framework.dynamite");
                                M0.writeInt(z ? 1 : 0);
                                Parcel L02 = f.L0(M0, 5);
                                readInt = L02.readInt();
                                L02.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                zhj zhjVar2 = new zhj(context);
                                Parcel M02 = f.M0();
                                z4x.c(M02, zhjVar2);
                                M02.writeString("com.google.android.gms.cast.framework.dynamite");
                                M02.writeInt(z ? 1 : 0);
                                Parcel L03 = f.L0(M02, 3);
                                readInt = L03.readInt();
                                L03.recycle();
                            }
                            return readInt;
                        }
                        ThreadLocal threadLocal = cya.h;
                        ghx ghxVar = (ghx) threadLocal.get();
                        if (ghxVar != null && (cursor = ghxVar.a) != null) {
                            return cursor.getInt(0);
                        }
                        Cursor cursor3 = (Cursor) zhj.T0(f.V0(new zhj(context), z, ((Long) cya.i.get()).longValue()));
                        if (cursor3 != null) {
                            try {
                                if (cursor3.moveToFirst()) {
                                    int i = cursor3.getInt(0);
                                    if (i > 0) {
                                        ghx ghxVar2 = (ghx) threadLocal.get();
                                        if (ghxVar2 == null || ghxVar2.a != null) {
                                            z2 = false;
                                        } else {
                                            ghxVar2.a = cursor3;
                                        }
                                    }
                                    cursor2 = cursor3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    return i;
                                }
                            } catch (RemoteException e4) {
                                e = e4;
                                cursor2 = cursor3;
                                Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                if (cursor2 == null) {
                                    return 0;
                                }
                                cursor2.close();
                                return 0;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor3;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        }
                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                        if (cursor3 == null) {
                            return 0;
                        }
                        cursor3.close();
                        return 0;
                    } catch (RemoteException e5) {
                        e = e5;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            try {
                y1g.G(context);
            } catch (Exception e6) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
            }
            throw th4;
        }
    }

    @Override // defpackage.bya
    public int b(Context context) {
        return cya.a(context, "com.google.android.gms.cast.framework.dynamite");
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new nkr(kkpVar.n(Uri.class, ParcelFileDescriptor.class), 0);
    }
}
