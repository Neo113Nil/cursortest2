package com.gamericefishpro.space.f5;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final e a;
    public static final d b;
    public static final e c;
    public static final d d;
    public static final e e;
    public static final d f;
    public static final e g;
    public static final d h;
    public static final e i;
    public static final d j;

    static {
        int i2 = 2;
        boolean z = false;
        a = new e(i2, z);
        boolean z2 = true;
        b = new d(i2, z2);
        int i3 = 3;
        c = new e(i3, z);
        d = new d(i3, z2);
        int i4 = 1;
        e = new e(i4, z);
        f = new d(i4, z2);
        int i5 = 0;
        g = new e(i5, z);
        h = new d(i5, z2);
        int i6 = 4;
        i = new e(i6, z2);
        j = new d(i6, z2);
    }

    public n0(boolean z) {
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return d(value);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return Intrinsics.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
