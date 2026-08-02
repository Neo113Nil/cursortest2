package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzabq {
    public static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final zzabv zzb;

    static {
        zzabv zzabvVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzabvVar = new zzabv();
                break;
            }
            zzabvVar = null;
            try {
                zzabvVar = (zzabv) Class.forName(zza[i]).asSubclass(zzabv.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzabvVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzabvVar;
    }

    public static StackTraceElement[] zzb(int i) {
        if (i <= 0 && i != -1) {
            a$$ExternalSyntheticBUOutline0.m$3("invalid maximum depth: 0");
            return null;
        }
        zzb.getClass();
        if (!(i == -1 || i > 0)) {
            a$$ExternalSyntheticBUOutline0.m$3("maxDepth must be > 0 or -1");
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = zzxq.class.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 >= stackTrace.length) {
                i2 = -1;
                break;
            }
            if (stackTrace[i2].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - i2;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, i2, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
