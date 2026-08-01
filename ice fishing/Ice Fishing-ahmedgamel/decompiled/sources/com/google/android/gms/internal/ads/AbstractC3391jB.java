package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.jB, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3391jB {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f31212a;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[Catch: IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0088, IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0088, IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0088, TryCatch #0 {IllegalAccessException | UnsupportedOperationException | InvocationTargetException -> 0x0088, blocks: (B:18:0x0057, B:24:0x0078, B:24:0x0078, B:24:0x0078, B:28:0x0067, B:28:0x0067, B:28:0x0067, B:30:0x0085, B:30:0x0085, B:30:0x0085, B:31:0x0087, B:31:0x0087, B:31:0x0087), top: B:17:0x0057 }] */
    static {
        boolean equals;
        Object obj;
        boolean equals2;
        Error error;
        Method method = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            if (equals) {
                throw th;
            }
            obj = null;
        }
        f31212a = obj;
        if (obj != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } finally {
                if (equals2) {
                }
            }
        }
        if (obj == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } finally {
                if (th.getClass().getName().equals("java.lang.ThreadDeath")) {
                    Error error2 = th;
                }
                if (method != null) {
                }
            }
            if (method != null) {
                return;
            }
            method.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
