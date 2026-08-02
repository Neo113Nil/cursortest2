package com.yandex.metrica.push.utils;

import android.content.Context;
import defpackage.etn;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class i {
    private static final List<String> a = Arrays.asList("passive", "gps");

    public static boolean a(Context context, String str) {
        return (str == null || !a.contains(str)) ? b(context) || a(context) : b(context);
    }

    public static boolean b(Context context) {
        return etn.z(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static boolean a(Context context) {
        return etn.z(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
