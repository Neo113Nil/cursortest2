package defpackage;

import android.graphics.Color;
import android.os.Build;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.media3.common.a;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class smw0 {
    public static /* synthetic */ void A(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    public static /* synthetic */ boolean B(AtomicReference atomicReference, vwx0 vwx0Var, vwx0 vwx0Var2) {
        while (!atomicReference.compareAndSet(vwx0Var, vwx0Var2)) {
            if (atomicReference.get() != vwx0Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, z951 z951Var, xsx0 xsx0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(z951Var, xsx0Var, null)) {
            if (atomicReferenceFieldUpdater.get(z951Var) != xsx0Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int a() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 36) {
            return i2 * AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
        }
        i = Build.VERSION.SDK_INT_FULL;
        return i;
    }

    public static int b(int i, int i2, CharSequence charSequence) {
        return (charSequence.hashCode() + i) * i2;
    }

    public static int c(int i, int i2, Object obj) {
        return (obj.hashCode() + i) * i2;
    }

    public static int d(kdc kdcVar, int i, int i2) {
        return (kdcVar.hashCode() + i) * i2;
    }

    public static int e(k911 k911Var, int i, int i2) {
        return (k911Var.hashCode() + i) * i2;
    }

    public static int f(BigDecimal bigDecimal, int i, int i2) {
        return (bigDecimal.hashCode() + i) * i2;
    }

    public static long g(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static oz40 h(long j) {
        return f.j(new ldc(j));
    }

    public static String i(String str, s5x0 s5x0Var, String str2, s5x0 s5x0Var2) {
        return str + s5x0Var + str2 + s5x0Var2;
    }

    public static String j(String str, String str2, String str3, Throwable th) {
        return str + th + str2 + str3;
    }

    public static String k(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(StringBuilder sb, Themes themes, String str) {
        sb.append(themes);
        sb.append(str);
        return sb.toString();
    }

    public static String m(StringBuilder sb, ArrayList arrayList, char c) {
        sb.append(arrayList);
        sb.append(c);
        return sb.toString();
    }

    public static String n(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    public static HashMap o(b611 b611Var) {
        b611Var.getClass();
        return new HashMap();
    }

    public static LinkedHashSet p(LinkedHashMap linkedHashMap, String str, p5x0 p5x0Var) {
        linkedHashMap.put(str, p5x0Var);
        return new LinkedHashSet();
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r(int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0 || i > i3 - i2) {
            StringBuilder s = b64.s(i, i, "Range [", Extension.FIX_SPACE, " + ");
            s.append(i2);
            s.append(") out of bounds for length ");
            s.append(i3);
            throw new IndexOutOfBoundsException(s.toString());
        }
    }

    public static void s(int i, int i2, int i3, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void t(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void u(f7s f7sVar, g001 g001Var) {
        g001Var.d(new a(f7sVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(kvj0 kvj0Var) {
        boolean isTerminated;
        if (kvj0Var instanceof AutoCloseable) {
            kvj0Var.close();
            return;
        }
        if (!(kvj0Var instanceof ExecutorService)) {
            w511.q();
            return;
        }
        ExecutorService executorService = (ExecutorService) kvj0Var;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void w(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, ymw0 ymw0Var, SurfaceConfig$ConfigType surfaceConfig$ConfigType2, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2) {
        ymw0Var.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize));
        ymw0Var.a(anw0.a(surfaceConfig$ConfigType2, surfaceConfig$ConfigSize2));
    }

    public static void x(String str, ArrayList arrayList, List list) {
        arrayList.add(str + list);
    }

    public static void y(String str, ArrayList arrayList, boolean z) {
        arrayList.add(str + z);
    }

    public static void z(StringBuilder sb, ColorModel colorModel, String str, ColorModel colorModel2, String str2) {
        sb.append(colorModel);
        sb.append(str);
        sb.append(colorModel2);
        sb.append(str2);
    }
}
