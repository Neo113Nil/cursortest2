package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.Wv;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f36273a;

    public static C4367m a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new C4367m(str2, str3);
    }

    public static void b(int i, int i4) {
        String c9;
        if (i < 0 || i >= i4) {
            if (i < 0) {
                c9 = AbstractC4414y.c("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(Wv.f(i4, "negative size: "));
                }
                c9 = AbstractC4414y.c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(c9);
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void d(int i, int i4) {
        if (i < 0 || i > i4) {
            throw new IndexOutOfBoundsException(g(i, i4, "index"));
        }
    }

    public static void e(Context context, HashSet hashSet) {
        HashMap hashMap;
        C4418z c4418z = new C4418z(context);
        Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = c4418z.f36570c;
            if (!hasNext) {
                break;
            }
            String str = (String) it.next();
            C4367m a9 = a(context, str);
            if (a9 == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                String str2 = (String) a9.f36485n;
                if (!hashMap.containsKey(str2)) {
                    hashMap.put(str2, c4418z.f36569b.getSharedPreferences(str2, 0).edit());
                }
                ((SharedPreferences.Editor) hashMap.get(str2)).remove((String) a9.f36486u);
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
    }

    public static void f(int i, int i4, int i6) {
        if (i < 0 || i4 < i || i4 > i6) {
            throw new IndexOutOfBoundsException((i < 0 || i > i6) ? g(i, i6, "start index") : (i4 < 0 || i4 > i6) ? g(i4, i6, "end index") : AbstractC4414y.c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i)));
        }
    }

    public static String g(int i, int i4, String str) {
        if (i < 0) {
            return AbstractC4414y.c("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i4 >= 0) {
            return AbstractC4414y.c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(Wv.f(i4, "negative size: "));
    }
}
