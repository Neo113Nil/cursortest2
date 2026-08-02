package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzclf {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Object obj;
        Class<?> cls;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
            } catch (Throwable th2) {
                obj = th2;
            }
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object invoke = cls2.getMethod("getLogger", String.class).invoke(null, zzclf.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(invoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
