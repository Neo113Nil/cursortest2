package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0461me {
    public static final SparseArray c;
    public final String a;
    public final String b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C0461me("jvm", "binder"));
        sparseArray.put(5890, new C0461me("jvm", "file"));
        sparseArray.put(5889, new C0461me("jvm", "file"));
        sparseArray.put(5897, new C0461me("jni_native", "file"));
        sparseArray.put(5898, new C0461me("jni_native", "file"));
    }

    public C0461me(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
