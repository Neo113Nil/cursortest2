package com.google.android.gms.common.util;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.zzae;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class WorkSourceUtil {
    public static final Method zzb;
    public static final Method zzc;
    public static final Method zzd;
    public static final Method zzi;
    public static Boolean zzj;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        zzd = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e2) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        } catch (Exception unused7) {
            method4 = null;
        }
        zzi = method4;
        zzj = null;
    }

    public static void add(WorkSource workSource, int i, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isEmpty(WorkSource workSource) {
        int intValue;
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                zzae.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        Method method2 = zzd;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                zzae.checkNotNull(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
            return intValue != 0;
        }
        intValue = 0;
        if (intValue != 0) {
        }
    }
}
