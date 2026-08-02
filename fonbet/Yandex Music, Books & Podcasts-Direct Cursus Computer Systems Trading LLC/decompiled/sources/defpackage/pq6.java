package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class pq6 {
    public static final HashMap f;
    public static final String g;
    public final Context a;
    public final uae b;
    public final xs0 c;
    public final j6e d;
    public final hgp e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        su4.u(5, hashMap, "armeabi", 6, "armeabi-v7a");
        su4.u(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/19.4.4";
    }

    public pq6(Context context, uae uaeVar, xs0 xs0Var, j6e j6eVar, hgp hgpVar) {
        this.a = context;
        this.b = uaeVar;
        this.c = xs0Var;
        this.d = j6eVar;
        this.e = hgpVar;
    }

    public static jc2 c(x3n x3nVar, int i) {
        String str = (String) x3nVar.b;
        String str2 = (String) x3nVar.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) x3nVar.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        x3n x3nVar2 = (x3n) x3nVar.d;
        if (i >= 8) {
            x3n x3nVar3 = x3nVar2;
            while (x3nVar3 != null) {
                x3nVar3 = (x3n) x3nVar3.d;
                i2++;
            }
        }
        int i3 = i2;
        List d = d(stackTraceElementArr, 4);
        if (d == null) {
            jj4.j("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        jc2 jc2Var = null;
        if (x3nVar2 != null && i3 == 0) {
            jc2Var = c(x3nVar2, i + 1);
        }
        if (b == 1) {
            return new jc2(str, str2, d, jc2Var, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            mc2 mc2Var = new mc2();
            mc2Var.e = i;
            mc2Var.f = (byte) (mc2Var.f | 4);
            long j = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j = stackTraceElement.getLineNumber();
            }
            mc2Var.a = max;
            byte b = (byte) (mc2Var.f | 1);
            mc2Var.b = str;
            mc2Var.c = fileName;
            mc2Var.d = j;
            mc2Var.f = (byte) (b | 2);
            arrayList.add(mc2Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static kc2 e() {
        byte b = (byte) 1;
        if (b == 1) {
            return new kc2(0L, CommonUrlParts.Values.FALSE_INTEGER, CommonUrlParts.Values.FALSE_INTEGER);
        }
        StringBuilder sb = new StringBuilder();
        if (b == 0) {
            sb.append(" address");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        xs0 xs0Var = this.c;
        String str = xs0Var.e;
        if (str == null) {
            jj4.j("Null name");
            return null;
        }
        String str2 = xs0Var.b;
        if (b == 3) {
            return Collections.singletonList(new ic2(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        xq0.q(su4.n("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rc2 b(int i) {
        boolean z;
        Float f2;
        long j;
        Intent registerReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.a;
        boolean z2 = false;
        try {
            registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e) {
            e = e;
            z = false;
        }
        if (registerReceiver != null) {
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            z = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = registerReceiver.getIntExtra("level", -1);
                intExtra2 = registerReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e2) {
                e = e2;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                f2 = null;
                if (f2 != null) {
                }
                if (z) {
                }
                if (!kg5.A()) {
                }
                long o = kg5.o(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = o - memoryInfo.availMem;
                if (j <= 0) {
                }
                long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                qc2 qc2Var = new qc2();
                qc2Var.a = r6;
                qc2Var.b = r0;
                byte b = (byte) (qc2Var.g | 1);
                qc2Var.c = z2;
                qc2Var.d = i;
                qc2Var.e = j;
                qc2Var.f = (r7.getBlockCount() * blockSize) - (blockSize * r7.getAvailableBlocks());
                qc2Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return qc2Var.a();
            }
            if (intExtra != -1 && intExtra2 != -1) {
                f2 = Float.valueOf(intExtra / intExtra2);
                Double valueOf = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
                int i2 = (z || f2 == null) ? 1 : ((double) f2.floatValue()) < 0.99d ? 2 : 3;
                if (!kg5.A() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long o2 = kg5.o(context);
                ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
                j = o2 - memoryInfo2.availMem;
                if (j <= 0) {
                    j = 0;
                }
                long blockSize2 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
                qc2 qc2Var2 = new qc2();
                qc2Var2.a = valueOf;
                qc2Var2.b = i2;
                byte b2 = (byte) (qc2Var2.g | 1);
                qc2Var2.c = z2;
                qc2Var2.d = i;
                qc2Var2.e = j;
                qc2Var2.f = (r7.getBlockCount() * blockSize2) - (blockSize2 * r7.getAvailableBlocks());
                qc2Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
                return qc2Var2.a();
            }
        } else {
            z = false;
        }
        f2 = null;
        if (f2 != null) {
        }
        if (z) {
        }
        if (!kg5.A()) {
            z2 = true;
        }
        long o22 = kg5.o(context);
        ActivityManager.MemoryInfo memoryInfo22 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo22);
        j = o22 - memoryInfo22.availMem;
        if (j <= 0) {
        }
        long blockSize22 = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        qc2 qc2Var22 = new qc2();
        qc2Var22.a = valueOf;
        qc2Var22.b = i2;
        byte b22 = (byte) (qc2Var22.g | 1);
        qc2Var22.c = z2;
        qc2Var22.d = i;
        qc2Var22.e = j;
        qc2Var22.f = (r7.getBlockCount() * blockSize22) - (blockSize22 * r7.getAvailableBlocks());
        qc2Var22.g = (byte) (((byte) (((byte) (((byte) (b22 | 2)) | 4)) | 8)) | 16);
        return qc2Var22.a();
    }
}
