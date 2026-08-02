package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public abstract class u631 {
    public static final Map a = Collections.synchronizedMap(new WeakHashMap());

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map = a;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new v631());
            }
            v631 v631Var = (v631) map.get(velocityTracker);
            long[] jArr = v631Var.b;
            long eventTime = motionEvent.getEventTime();
            if (v631Var.d != 0 && eventTime - jArr[v631Var.e] > 40) {
                v631Var.d = 0;
                v631Var.c = 0.0f;
            }
            int i = (v631Var.e + 1) % 20;
            v631Var.e = i;
            int i2 = v631Var.d;
            if (i2 != 20) {
                v631Var.d = i2 + 1;
            }
            v631Var.a[i] = motionEvent.getAxisValue(26);
            jArr[v631Var.e] = eventTime;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(VelocityTracker velocityTracker) {
        long j;
        int i;
        float f;
        float f2;
        long[] jArr;
        float f3;
        float f4 = Float.MAX_VALUE;
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        v631 v631Var = (v631) a.get(velocityTracker);
        if (v631Var == null) {
            return;
        }
        float[] fArr = v631Var.a;
        long[] jArr2 = v631Var.b;
        int i2 = v631Var.d;
        float f5 = 0.0f;
        if (i2 >= 2) {
            int i3 = v631Var.e;
            int i4 = ((i3 + 20) - (i2 - 1)) % 20;
            long j2 = jArr2[i3];
            while (true) {
                j = jArr2[i4];
                long j3 = j2 - j;
                i = v631Var.d;
                if (j3 <= 100) {
                    break;
                }
                v631Var.d = i - 1;
                i4 = (i4 + 1) % 20;
            }
            if (i >= 2) {
                if (i != 2) {
                    int i5 = 0;
                    int i6 = 0;
                    float f6 = 0.0f;
                    while (true) {
                        if (i5 >= v631Var.d - 1) {
                            break;
                        }
                        int i7 = i5 + i4;
                        long j4 = jArr2[i7 % 20];
                        int i8 = (i7 + 1) % 20;
                        if (jArr2[i8] == j4) {
                            f2 = f4;
                            jArr = jArr2;
                        } else {
                            i6++;
                            f2 = f4;
                            jArr = jArr2;
                            float sqrt = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                            float f7 = fArr[i8] / (jArr[i8] - j4);
                            f6 += Math.abs(f7) * (f7 - sqrt);
                            if (i6 == 1) {
                                f6 *= 0.5f;
                            }
                        }
                        i5++;
                        f4 = f2;
                        jArr2 = jArr;
                    }
                    f = f4;
                    f5 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                    f3 = f5 * 1000.0f;
                    v631Var.c = f3;
                    if (f3 >= (-Math.abs(f))) {
                        v631Var.c = -Math.abs(f);
                        return;
                    } else {
                        if (v631Var.c > Math.abs(f)) {
                            v631Var.c = Math.abs(f);
                            return;
                        }
                        return;
                    }
                }
                int i9 = (i4 + 1) % 20;
                if (j != jArr2[i9]) {
                    f5 = fArr[i9] / (r3 - j);
                }
            }
        }
        f = Float.MAX_VALUE;
        f3 = f5 * 1000.0f;
        v631Var.c = f3;
        if (f3 >= (-Math.abs(f))) {
        }
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return sg.b(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        v631 v631Var = (v631) a.get(velocityTracker);
        if (v631Var == null || i != 26) {
            return 0.0f;
        }
        return v631Var.c;
    }
}
