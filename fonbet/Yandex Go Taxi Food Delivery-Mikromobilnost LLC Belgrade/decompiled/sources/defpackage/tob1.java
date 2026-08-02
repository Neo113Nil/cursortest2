package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes11.dex */
public abstract class tob1 {
    public static final void a(tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-635889843);
        int i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            cx20.a(c530.a, null, null, null, null, false, false, null, wwg.S(-344939393, true, new wg0(19, tlsVar), btsVar), btsVar, 100663302, 254);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sg0(i, 14, tlsVar);
        }
    }

    public static void b() {
        d6z.y("Not in application's main thread", d());
    }

    public static Object c(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        ny61.g(oyr.i(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static int e(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        i(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = e(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int G = vng.G(obj);
        int i2 = G & i;
        int h = h(i2, obj3);
        if (h != 0) {
            int i3 = ~i;
            int i4 = G & i3;
            int i5 = -1;
            while (true) {
                int i6 = h - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) != i4 || !Objects.equals(obj, objArr[i6]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    h = i8;
                }
            }
        }
        return -1;
    }

    public static void g(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            d6z.y("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static int h(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void i(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
