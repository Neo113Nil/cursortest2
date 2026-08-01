package t8;

import D.y;
import L3.F;
import O.X;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.manager.p;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.Sx;
import com.google.android.gms.internal.ads.Tx;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.r;
import u2.z;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40934a;

    public /* synthetic */ g(int i) {
        this.f40934a = i;
    }

    public static long A(Parcel parcel, int i) {
        K(parcel, i, 8);
        return parcel.readLong();
    }

    public static int B(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void C(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        H.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static int D(Context context, int i, int i6) {
        TypedValue p9 = F.p(context, i);
        return (p9 == null || p9.type != 16) ? i6 : p9.data;
    }

    public static TimeInterpolator E(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!q(valueOf, "cubic-bezier") && !q(valueOf, com.anythink.expressad.a.f17603K)) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (q(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return Q.a.b(o(split, 0), o(split, 1), o(split, 2), o(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!q(valueOf, com.anythink.expressad.a.f17603K)) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            G.i.b(S0.f.f(substring), path);
            return Q.a.c(path);
        } catch (RuntimeException e9) {
            throw new RuntimeException("Error in parsing ".concat(substring), e9);
        }
    }

    public static void F(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = X.f2054a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z6 = hasOnClickListeners || z3;
        checkableImageButton.setFocusable(z6);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z6 ? 1 : 2);
    }

    public static void G(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + B(parcel, i));
    }

    public static int H(Parcel parcel) {
        int readInt = parcel.readInt();
        int B9 = B(parcel, readInt);
        char c9 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c9 != 20293) {
            throw new B0.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = B9 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new B0.c(y.r(new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length()), "Size read is invalid start=", dataPosition, " end=", i), parcel);
    }

    public static Intent I(String str, String str2, HashMap hashMap) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static void J(Context context) {
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            Sx f3 = Sx.f(context);
            Tx f9 = Tx.f(context);
            Ux e9 = Ux.e(context);
            f3.getClass();
            synchronized (Sx.class) {
                f3.c(false);
            }
            synchronized (Sx.class) {
                f3.c(true);
            }
            f9.g();
            e9.q();
        } catch (IOException e10) {
            C4835j.f39733C.f39743h.d("clearStorageOnIdlessMode", e10);
        }
    }

    public static void K(Parcel parcel, int i, int i6) {
        int B9 = B(parcel, i);
        if (B9 == i6) {
            return;
        }
        String hexString = Integer.toHexString(B9);
        int length = String.valueOf(i6).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(B9).length() + 4 + 1);
        u1.h.h(sb, "Expected size ", i6, " got ", B9);
        throw new B0.c(y.s(sb, " (0x", hexString, ")"), parcel);
    }

    public static Intent L(String str, String str2, String str3, HashMap hashMap) {
        Intent intent = new Intent("android.intent.action.VIEW", N(str, str2, hashMap));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle M(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e9) {
                int i = z.f41322b;
                v2.i.b("JSON parsing error", e9);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i6);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i9 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i9 != 0) {
                    List q8 = p.d(new PA('/')).q(optString2);
                    if (q8.size() > 2 || q8.isEmpty()) {
                        obj = null;
                    } else {
                        if (q8.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) q8.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) q8.get(0), 0);
                            str2 = (String) q8.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i10 = i9 - 1;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static Uri N(String str, String str2, HashMap hashMap) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            if (!str3.equals("id") && !str3.equals("referrer")) {
                appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
            }
        }
        return appendQueryParameter.build();
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                H.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                H.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                H.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static Bundle f(Parcel parcel, int i) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + B9);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + B9);
        return createByteArray;
    }

    public static Parcelable h(Parcel parcel, int i, Parcelable.Creator creator) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + B9);
        return parcelable;
    }

    public static String i(Parcel parcel, int i) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + B9);
        return readString;
    }

    public static String[] j(Parcel parcel, int i) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + B9);
        return createStringArray;
    }

    public static ArrayList k(Parcel parcel, int i) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + B9);
        return createStringArrayList;
    }

    public static Object[] l(Parcel parcel, int i, Parcelable.Creator creator) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + B9);
        return createTypedArray;
    }

    public static int m(String str, int i, int i6, boolean z3) {
        while (i < i6) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z3)) {
                return i;
            }
            i++;
        }
        return i6;
    }

    public static void n(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new B0.c(y.m(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static float o(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final int p(int i, int i6, int i9) {
        if (i9 > 0) {
            if (i < i6) {
                int i10 = i6 % i9;
                if (i10 < 0) {
                    i10 += i9;
                }
                int i11 = i % i9;
                if (i11 < 0) {
                    i11 += i9;
                }
                int i12 = (i10 - i11) % i9;
                if (i12 < 0) {
                    i12 += i9;
                }
                return i6 - i12;
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i6) {
                int i13 = -i9;
                int i14 = i % i13;
                if (i14 < 0) {
                    i14 += i13;
                }
                int i15 = i6 % i13;
                if (i15 < 0) {
                    i15 += i13;
                }
                int i16 = (i14 - i15) % i13;
                if (i16 < 0) {
                    i16 += i13;
                }
                return i16 + i6;
            }
        }
        return i6;
    }

    public static boolean q(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static void r(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static long u(int i, String str) {
        int m4 = m(str, 0, i, false);
        Matcher matcher = i8.j.f38135n.matcher(str);
        int i6 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (m4 < i) {
            int m9 = m(str, m4 + 1, i, true);
            matcher.region(m4, m9);
            if (i9 == -1 && matcher.usePattern(i8.j.f38135n).matches()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.h.d(group, "group(...)");
                i9 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                kotlin.jvm.internal.h.d(group2, "group(...)");
                i12 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                kotlin.jvm.internal.h.d(group3, "group(...)");
                i13 = Integer.parseInt(group3);
            } else if (i10 == -1 && matcher.usePattern(i8.j.f38134m).matches()) {
                String group4 = matcher.group(1);
                kotlin.jvm.internal.h.d(group4, "group(...)");
                i10 = Integer.parseInt(group4);
            } else {
                if (i11 == -1) {
                    Pattern pattern = i8.j.f38133l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        kotlin.jvm.internal.h.d(group5, "group(...)");
                        Locale US = Locale.US;
                        kotlin.jvm.internal.h.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.h.d(pattern2, "pattern(...)");
                        i11 = Q7.j.a0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i6 == -1 && matcher.usePattern(i8.j.f38132k).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.h.d(group6, "group(...)");
                    i6 = Integer.parseInt(group6);
                }
            }
            m4 = m(str, m9 + 1, i, false);
        }
        if (70 <= i6 && i6 < 100) {
            i6 += 1900;
        }
        if (i6 >= 0 && i6 < 70) {
            i6 += 2000;
        }
        if (i6 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i10 || i10 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i9 < 0 || i9 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(j8.d.f38483a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i6);
        gregorianCalendar.set(2, i11 - 1);
        gregorianCalendar.set(5, i10);
        gregorianCalendar.set(11, i9);
        gregorianCalendar.set(12, i12);
        gregorianCalendar.set(13, i13);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static boolean x(Parcel parcel, int i) {
        K(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder y(Parcel parcel, int i) {
        int B9 = B(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (B9 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + B9);
        return readStrongBinder;
    }

    public static int z(Parcel parcel, int i) {
        K(parcel, i, 4);
        return parcel.readInt();
    }

    public abstract boolean b(U0.i iVar, U0.d dVar, U0.d dVar2);

    public abstract boolean c(U0.i iVar, Object obj, Object obj2);

    public abstract boolean d(U0.i iVar, U0.h hVar, U0.h hVar2);

    public int hashCode() {
        switch (this.f40934a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract void s(Throwable th);

    public abstract void t(S0.i iVar);

    public String toString() {
        switch (this.f40934a) {
            case 7:
                String b9 = s.a(getClass()).b();
                kotlin.jvm.internal.h.b(b9);
                return b9;
            default:
                return super.toString();
        }
    }

    public abstract void v(U0.h hVar, U0.h hVar2);

    public abstract void w(U0.h hVar, Thread thread);
}
