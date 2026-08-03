package a4;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.q;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import m0.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final boolean a(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 6;
    }

    public static int b(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static int c(int i10, int i11, long j3) {
        return (Long.hashCode(j3) + i10) * i11;
    }

    public static int d(int i10, int i11, boolean z10) {
        return (Boolean.hashCode(z10) + i10) * i11;
    }

    public static ac.d e(String str) {
        u1.a.c(str);
        return new ac.d();
    }

    public static String f(int i10, int i11, String str, String str2) {
        return str + i10 + str2 + i11;
    }

    public static String g(String str, int i10) {
        return str + i10;
    }

    public static String h(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb, float f10, char c3) {
        sb.append(f10);
        sb.append(c3);
        return sb.toString();
    }

    public static String l(StringBuilder sb, int i10, char c3) {
        sb.append(i10);
        sb.append(c3);
        return sb.toString();
    }

    public static HashMap m(Class cls, s7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map n(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void o(int i10, int i11, int i12, int i13, int i14) {
        v6.a.d(i10);
        v6.a.d(i11);
        v6.a.d(i12);
        v6.a.d(i13);
        v6.a.d(i14);
    }

    public static void p(int i10, r rVar, int i11, x1.h hVar) {
        rVar.i0(Integer.valueOf(i10));
        rVar.b(Integer.valueOf(i11), hVar);
    }

    public static void q(long j3, StringBuilder sb, String str) {
        sb.append((Object) q.i(j3));
        sb.append(str);
    }

    public static /* synthetic */ void r(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void t(String str, int i10) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = pc.j.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            pc.j.j(nullPointerException, pc.j.class.getName());
            throw nullPointerException;
        }
    }

    public static void u(n8.c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static /* synthetic */ String v(int i10) {
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "NOT_REQUIRED";
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String w(int i10) {
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "ENQUEUED";
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }
}
