package c0;

import L.Q;
import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100b {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f1681f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f1682a;

    /* renamed from: b, reason: collision with root package name */
    public final Q f1683b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1684c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1685d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f1686e;

    public C0100b(io.flutter.embedding.engine.renderer.h hVar, boolean z2) {
        this.f1682a = hVar;
        if (Q.f516h == null) {
            Q.f516h = new Q(8);
        }
        this.f1683b = Q.f516h;
        this.f1684c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        return i2 == 8 ? 3 : -1;
    }

    public final void a(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i5;
        long j2;
        int i6;
        int i7;
        long j3;
        double d2;
        double d3;
        MotionEvent motionEvent2;
        int i8;
        double d4;
        double d5;
        double d6;
        C0100b c0100b;
        float c2;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i3 == -1) {
            return;
        }
        int i9 = 3;
        int pointerId = (motionEvent.getPointerId(i2) << 3) | (motionEvent.getToolType(i2) & 7);
        int toolType = motionEvent.getToolType(i2);
        if (toolType == 1) {
            i9 = 0;
        } else if (toolType == 2) {
            i9 = 2;
        } else if (toolType == 3) {
            i9 = 1;
        } else if (toolType != 4) {
            i9 = 5;
        }
        float[] fArr = {motionEvent.getX(i2), motionEvent.getY(i2)};
        matrix.mapPoints(fArr);
        HashMap hashMap = this.f1685d;
        if (i9 == 1) {
            j2 = motionEvent.getButtonState() & 31;
            if (j2 == 0 && motionEvent.getSource() == 8194) {
                i5 = 4;
                if (i3 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr);
                }
            } else {
                i5 = 4;
            }
        } else {
            i5 = 4;
            j2 = i9 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i6 = i3 == i5 ? 7 : i3 == 5 ? 8 : (i3 == 6 || i3 == 0) ? 9 : -1;
            if (i6 == -1) {
                return;
            }
        } else {
            i6 = -1;
        }
        if (this.f1684c) {
            Q q2 = this.f1683b;
            q2.getClass();
            i7 = pointerId;
            j3 = H.f1670b.incrementAndGet();
            ((LongSparseArray) q2.f519f).put(j3, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) q2.f520g).add(Long.valueOf(j3));
        } else {
            i7 = pointerId;
            j3 = 0;
        }
        int i10 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j3);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i6);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(i3);
            byteBuffer.putLong(i9);
        }
        byteBuffer.putLong(i10);
        int i11 = i7;
        byteBuffer.putLong(i11);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(Integer.valueOf(i11));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j2);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i2));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d2 = 0.0d;
            d3 = 1.0d;
        } else {
            d2 = motionRange.getMin();
            d3 = motionRange.getMax();
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d3);
        if (i9 == 2) {
            motionEvent2 = motionEvent;
            i8 = i2;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, i8));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            i8 = i2;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i2));
        byteBuffer.putDouble(motionEvent.getToolMajor(i2));
        byteBuffer.putDouble(motionEvent.getToolMinor(i2));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, i8));
        if (i9 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, i8));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(i4);
        if (i10 == 1) {
            if (context != null) {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c2 = scaledHorizontalScrollFactor;
                    c0100b = this;
                } else {
                    c0100b = this;
                    c2 = c0100b.c(context);
                }
                d5 = c2;
                d6 = i12 >= 26 ? ViewConfiguration.get(context).getScaledVerticalScrollFactor() : c0100b.c(context);
            } else {
                d5 = 48.0d;
                d6 = 48.0d;
            }
            byteBuffer.putDouble(d5 * (-motionEvent2.getAxisValue(10, i8)));
            byteBuffer.putDouble(d6 * (-motionEvent2.getAxisValue(9, i8)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(i11));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d4 = 0.0d;
        } else {
            d4 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d4);
        byteBuffer.putLong(0L);
        if (containsKey && i6 == 9) {
            hashMap.remove(Integer.valueOf(i11));
        }
    }

    public final int c(Context context) {
        if (this.f1686e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f1686e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1686e;
    }
}
