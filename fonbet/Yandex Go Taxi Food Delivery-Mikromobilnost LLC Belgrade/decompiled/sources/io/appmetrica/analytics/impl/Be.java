package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* loaded from: classes4.dex */
public final class Be {
    public static final SparseArray c;
    public final String a;
    public final String b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new Be("jvm", "binder"));
        sparseArray.put(5890, new Be("jvm", "file"));
        sparseArray.put(5889, new Be("jvm", "file"));
        sparseArray.put(5897, new Be("jni_native", "file"));
        sparseArray.put(5898, new Be("jni_native", "file"));
    }

    public Be(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
