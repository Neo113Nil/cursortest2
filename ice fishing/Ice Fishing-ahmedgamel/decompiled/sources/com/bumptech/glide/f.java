package com.bumptech.glide;

import H6.b;
import H6.j;
import O.X;
import T3.r;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.anythink.core.common.n.b.A;
import com.bumptech.glide.f;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.stream.Collectors;
import l.C4659e;
import m4.C4746d;
import m4.EnumC4744b;
import t.AbstractC4984g;
import t.C4980c;
import t.C4983f;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static Field f24169a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f24170b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f24171c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f24172d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f24173e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f24174f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f24175g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f24176h;

    public static f6.g a(H6.b bVar) {
        String str = bVar.f1254v;
        if (str != null) {
            return new f6.f(2, str);
        }
        Long l9 = bVar.f1256x;
        if (l9 != null) {
            return new f6.k(l9.longValue());
        }
        Double d9 = bVar.f1257y;
        if (d9 != null) {
            return new f6.j(d9.doubleValue());
        }
        Boolean bool = bVar.f1255w;
        if (bool != null) {
            return new f6.h(bool.booleanValue());
        }
        y8.h hVar = bVar.f1253B;
        if (hVar != null) {
            byte[] k9 = hVar.k();
            return new f6.i(Arrays.copyOf(k9, k9.length));
        }
        H6.l lVar = bVar.f1252A;
        if (lVar == null) {
            H6.d dVar = bVar.f1258z;
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized AnyValue type");
            }
            final int i = 1;
            return new f6.f(1, Collections.unmodifiableList((List) dVar.f1260v.stream().map(new Function() { // from class: x6.a
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    switch (i) {
                        case 0:
                            return f.a(((j) obj).f1273w);
                        default:
                            return f.a((b) obj);
                    }
                }
            }).collect(Collectors.toList())));
        }
        final int i4 = 0;
        Map map = (Map) lVar.f1275v.stream().collect(Collectors.toMap(new K6.b(29), new Function() { // from class: x6.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        return f.a(((j) obj).f1273w);
                    default:
                        return f.a((b) obj);
                }
            }
        }));
        Objects.requireNonNull(map, "value must not be null");
        f6.d[] dVarArr = (f6.d[]) map.entrySet().stream().map(new K6.b(19)).toArray(new f6.e());
        Objects.requireNonNull(dVarArr, "value must not be null");
        ArrayList arrayList = new ArrayList(dVarArr.length);
        arrayList.addAll(Arrays.asList(dVarArr));
        return new f6.f(0, Collections.unmodifiableList(arrayList));
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static ImageView.ScaleType f(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean g(String current, String str) {
        kotlin.jvm.internal.h.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i4 = 0;
            int i6 = 0;
            while (true) {
                if (i < current.length()) {
                    char charAt = current.charAt(i);
                    int i9 = i6 + 1;
                    if (i6 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i4 - 1 == 0 && i6 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i4++;
                    }
                    i++;
                    i6 = i9;
                } else if (i4 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return kotlin.jvm.internal.h.a(Q7.j.G0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static boolean h() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Q3.g.c();
            Q3.g c9 = Q3.g.c();
            c9.a();
            Context context = c9.f2661a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void i(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (T3.h hVar : (Set) it2.next()) {
                        for (T3.j jVar : hVar.f3187a.f3171c) {
                            if (jVar.f3194c == 0) {
                                Set<T3.h> set = (Set) hashMap.get(new T3.i(jVar.f3192a, jVar.f3193b == 2));
                                if (set != null) {
                                    for (T3.h hVar2 : set) {
                                        hVar.f3188b.add(hVar2);
                                        hVar2.f3189c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    T3.h hVar3 = (T3.h) it4.next();
                    if (hVar3.f3189c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    T3.h hVar4 = (T3.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i++;
                    Iterator it5 = hVar4.f3188b.iterator();
                    while (it5.hasNext()) {
                        T3.h hVar5 = (T3.h) it5.next();
                        hVar5.f3189c.remove(hVar4);
                        if (hVar5.f3189c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    T3.h hVar6 = (T3.h) it6.next();
                    if (!hVar6.f3189c.isEmpty() && !hVar6.f3188b.isEmpty()) {
                        arrayList2.add(hVar6.f3187a);
                    }
                }
                throw new T3.k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            T3.b bVar = (T3.b) it.next();
            T3.h hVar7 = new T3.h(bVar);
            for (r rVar : bVar.f3170b) {
                boolean z6 = bVar.f3173e == 0;
                T3.i iVar = new T3.i(rVar, !z6);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(iVar);
                if (!set2.isEmpty() && z6) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + com.anythink.core.common.d.j.f13164z);
                }
                set2.add(hVar7);
            }
        }
    }

    public static ColorStateList j(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList c9;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c9 = E.e.c(context, resourceId)) == null) ? typedArray.getColorStateList(i) : c9;
    }

    public static ColorStateList k(Context context, l4.g gVar, int i) {
        int resourceId;
        ColorStateList c9;
        TypedArray typedArray = (TypedArray) gVar.f38917v;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c9 = E.e.c(context, resourceId)) == null) ? gVar.h(i) : c9;
    }

    public static Drawable l(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable h3;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (h3 = g.h(context, resourceId)) == null) ? typedArray.getDrawable(i) : h3;
    }

    public static boolean m(String str) {
        I0.b bVar = I0.m.f1293a;
        Set<I0.d> unmodifiableSet = Collections.unmodifiableSet(I0.c.f1278c);
        HashSet hashSet = new HashSet();
        for (I0.d dVar : unmodifiableSet) {
            if (((I0.c) dVar).f1279a.equals(str)) {
                hashSet.add(dVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            I0.c cVar = (I0.c) ((I0.d) it.next());
            if (cVar.a() || cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(Intent intent) {
        long parseLong;
        if (u(intent)) {
            p("_nr", intent.getExtras());
        }
        int i = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : h()) {
            Y1.e eVar = (Y1.e) FirebaseMessaging.f36958l.get();
            if (eVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            C4746d c4746d = null;
            r4 = null;
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    i = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        i = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i4 = i;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        Q3.g c9 = Q3.g.c();
                        try {
                            Object obj2 = f4.c.f37453m;
                            string = (String) d.d(((f4.c) c9.b(f4.d.class)).c());
                        } catch (InterruptedException e9) {
                            e = e9;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e10) {
                        e = e10;
                    }
                }
                String str2 = string;
                Q3.g c10 = Q3.g.c();
                c10.a();
                String packageName = c10.f2661a.getPackageName();
                EnumC4744b enumC4744b = C4659e.y(extras) ? EnumC4744b.DISPLAY_NOTIFICATION : EnumC4744b.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str3 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str = string3;
                }
                String str4 = str != null ? str : "";
                String string4 = extras.getString("collapse_key");
                String str5 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str6 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str7 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e11) {
                        Log.w("FirebaseMessaging", "error parsing project number", e11);
                    }
                    c4746d = new C4746d(parseLong > 0 ? parseLong : 0L, str3, str2, enumC4744b, packageName, str5, i4, str4, str6, str7);
                }
                Q3.g c11 = Q3.g.c();
                c11.a();
                Q3.i iVar = c11.f2663c;
                String str8 = iVar.f2678e;
                if (str8 != null) {
                    try {
                        parseLong = Long.parseLong(str8);
                    } catch (NumberFormatException e12) {
                        Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                    }
                    c4746d = new C4746d(parseLong > 0 ? parseLong : 0L, str3, str2, enumC4744b, packageName, str5, i4, str4, str6, str7);
                }
                c11.a();
                String str9 = iVar.f2675b;
                if (str9.startsWith("1:")) {
                    String[] split = str9.split(":");
                    if (split.length >= 2) {
                        String str10 = split[1];
                        if (!str10.isEmpty()) {
                            try {
                                parseLong = Long.parseLong(str10);
                            } catch (NumberFormatException e13) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e13);
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    try {
                        parseLong = Long.parseLong(str9);
                    } catch (NumberFormatException e14) {
                        Log.w("FirebaseMessaging", "error parsing app ID", e14);
                    }
                }
                c4746d = new C4746d(parseLong > 0 ? parseLong : 0L, str3, str2, enumC4744b, packageName, str5, i4, str4, str6, str7);
            }
            if (c4746d == null) {
                return;
            }
            try {
                Y1.b bVar = new Y1.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                Y1.c cVar = new Y1.c("proto");
                A a9 = new A(13);
                b2.m mVar = (b2.m) eVar;
                Set set = mVar.f5544a;
                if (!set.contains(cVar)) {
                    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
                }
                new b3.e(mVar.f5545b, cVar, a9, mVar.f5546c).G(new Y1.a(new m4.e(c4746d), bVar));
            } catch (RuntimeException e15) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
            }
        }
    }

    public static void p(String str, Bundle bundle) {
        try {
            Q3.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e9);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String str2 = C4659e.y(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (Q3.g.c().b(R3.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void s(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static void t(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = X.f2142a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z6 = onLongClickListener != null;
        boolean z9 = hasOnClickListeners || z6;
        checkableImageButton.setFocusable(z9);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z6);
        checkableImageButton.setImportantForAccessibility(z9 ? 1 : 2);
    }

    public static boolean u(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static int v(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w(long j6) {
        if (((-128) & j6) == 0) {
            return 1;
        }
        if (((-16384) & j6) == 0) {
            return 2;
        }
        if (((-2097152) & j6) == 0) {
            return 3;
        }
        if (((-268435456) & j6) == 0) {
            return 4;
        }
        if (((-34359738368L) & j6) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j6) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j6) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j6) == 0) {
            return 8;
        }
        return (j6 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public abstract boolean c(AbstractC4984g abstractC4984g, C4980c c4980c, C4980c c4980c2);

    public abstract boolean d(AbstractC4984g abstractC4984g, Object obj, Object obj2);

    public abstract boolean e(AbstractC4984g abstractC4984g, C4983f c4983f, C4983f c4983f2);

    public abstract void q(C4983f c4983f, C4983f c4983f2);

    public abstract void r(C4983f c4983f, Thread thread);
}
