package com.plaid.internal;

import android.content.res.Resources;
import android.os.Build;

/* loaded from: classes5.dex */
public final class O4 implements H0 {
    public static final O4 a = new O4();
    public static final String b = Build.ID;
    public static final String c = Build.MANUFACTURER;
    public static final String d = Build.MODEL;
    public static final String e = Build.DEVICE;
    public static final String f = Build.TYPE;
    public static final String g = Build.VERSION.RELEASE;
    public static final String h = Build.VERSION.CODENAME;
    public static final int i = Build.VERSION.SDK_INT;
    public static final int j = Resources.getSystem().getDisplayMetrics().heightPixels;
    public static final int k = Resources.getSystem().getDisplayMetrics().widthPixels;

    @Override // com.plaid.internal.H0
    public final String a() {
        return c;
    }

    @Override // com.plaid.internal.H0
    public final String b() {
        return d;
    }

    @Override // com.plaid.internal.H0
    public final String c() {
        return h;
    }

    @Override // com.plaid.internal.H0
    public final String d() {
        return f;
    }

    @Override // com.plaid.internal.H0
    public final String e() {
        return g;
    }

    @Override // com.plaid.internal.H0
    public final int f() {
        return i;
    }

    @Override // com.plaid.internal.H0
    public final String g() {
        return e;
    }

    @Override // com.plaid.internal.H0
    public final String getId() {
        return b;
    }
}
