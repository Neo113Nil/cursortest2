package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcdy implements zzcan {
    public static final Logger zza = Logger.getLogger(zzcdy.class.getName());
    public static final Constructor zzb;
    public static final Method zzc;
    public static final RuntimeException zzd;
    public static final Object[] zzf;
    public final Object zze;

    static {
        Throwable th;
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        try {
            cls.getMethod("sum", null);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            method = method2;
            zza.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            method2 = method;
            constructor = null;
            if (th == null) {
            }
            zzb = null;
            zzc = null;
            zzd = new RuntimeException(th);
            zzf = new Object[]{1L};
        }
        if (th == null || constructor == null) {
            zzb = null;
            zzc = null;
            zzd = new RuntimeException(th);
        } else {
            zzb = constructor;
            zzc = method2;
            zzd = null;
        }
        zzf = new Object[]{1L};
    }

    public zzcdy() {
        RuntimeException runtimeException = zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.zze = zzb.newInstance(null);
        } catch (IllegalAccessException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
            throw null;
        } catch (InstantiationException e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            throw null;
        } catch (InvocationTargetException e3) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            throw null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcan
    public final void zza() {
        try {
            zzc.invoke(this.zze, zzf);
        } catch (IllegalAccessException e) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e);
        } catch (InvocationTargetException e2) {
            a$$ExternalSyntheticBUOutline0.m((Throwable) e2);
        }
    }
}
