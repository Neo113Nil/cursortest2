package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.util.LongSparseArray;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class vc2 {
    public static final Matrix e = new Matrix();
    public final f a;
    public final at20 b;
    public final boolean c;
    public final HashMap d = new HashMap();

    public vc2(f fVar, boolean z) {
        this.a = fVar;
        if (at20.c == null) {
            at20.c = new at20();
        }
        this.b = at20.c;
        this.c = z;
    }

    public static int b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != 1) {
            if (i == 5) {
                return 4;
            }
            if (i != 6) {
                if (i == 2) {
                    return 5;
                }
                if (i != 7) {
                    if (i == 3) {
                        return 0;
                    }
                    if (i != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    public final void a(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i4;
        int i5;
        long j;
        int i6;
        int i7;
        long j2;
        int i8;
        long j3;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        InputDevice.MotionRange motionRange;
        if (i2 == -1) {
            return;
        }
        int i9 = 3;
        int pointerId = (motionEvent.getPointerId(i) << 3) | (motionEvent.getToolType(i) & 7);
        int toolType = motionEvent.getToolType(i);
        if (toolType == 1) {
            i9 = 0;
        } else if (toolType == 2) {
            i9 = 2;
        } else if (toolType == 3) {
            i9 = 1;
        } else if (toolType != 4) {
            i9 = 5;
        }
        float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
        matrix.mapPoints(fArr);
        HashMap hashMap = this.d;
        if (i9 == 1) {
            i4 = 0;
            i5 = 1;
            j = motionEvent.getButtonState() & 31;
            if (j == 0 && motionEvent.getSource() == 8194 && i2 == 4) {
                hashMap.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            i4 = 0;
            i5 = 1;
            j = i9 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i6 = i2 == 4 ? 7 : i2 == 5 ? 8 : (i2 == 6 || i2 == 0) ? 9 : -1;
            if (i6 == -1) {
                return;
            }
        } else {
            i6 = -1;
        }
        if (this.c) {
            at20 at20Var = this.b;
            at20Var.getClass();
            i7 = i9;
            j2 = na30.b.incrementAndGet();
            ((LongSparseArray) at20Var.a).put(j2, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) at20Var.b).add(Long.valueOf(j2));
        } else {
            i7 = i9;
            j2 = 0;
        }
        int i10 = motionEvent.getActionMasked() == 8 ? i5 : i4;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(j2);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(i6);
            byteBuffer.putLong(4L);
            i8 = i7;
        } else {
            byteBuffer.putLong(i2);
            i8 = i7;
            byteBuffer.putLong(i8);
        }
        byteBuffer.putLong(i10);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            j3 = j;
            byteBuffer.putDouble(fArr2[i4]);
            byteBuffer.putDouble(fArr2[i5]);
        } else {
            j3 = j;
            byteBuffer.putDouble(fArr[i4]);
            byteBuffer.putDouble(fArr[i5]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j3);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d = 1.0d;
            d2 = 0.0d;
        } else {
            d2 = motionRange.getMin();
            d = motionRange.getMax();
        }
        byteBuffer.putDouble(d2);
        byteBuffer.putDouble(d);
        if (i8 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i));
            d3 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d3 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i));
        byteBuffer.putDouble(motionEvent.getToolMajor(i));
        byteBuffer.putDouble(motionEvent.getToolMinor(i));
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i));
        if (i8 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i));
        } else {
            byteBuffer.putDouble(d3);
        }
        byteBuffer.putLong(i3);
        if (i10 == i5) {
            if (context != null) {
                d5 = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                d6 = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
            } else {
                d5 = 48.0d;
                d6 = 48.0d;
            }
            byteBuffer.putDouble(d5 * (-motionEvent.getAxisValue(10, i)));
            byteBuffer.putDouble(d6 * (-motionEvent.getAxisValue(9, i)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[i4] - fArr3[i4]);
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
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r6 != 4) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int b = b(motionEvent.getActionMasked());
        char c = 5;
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType != 1) {
            char c2 = 2;
            if (toolType != 2) {
                c2 = 3;
                if (toolType == 3) {
                    c = 1;
                }
            }
            c = c2;
        } else {
            c = 0;
        }
        int i = (z2 && c == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect, null);
        } else if (z2) {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != motionEvent.getActionIndex() && motionEvent.getToolType(i2) == 1) {
                    a(motionEvent, i2, 5, 1, matrix, allocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, allocateDirect, null);
            if (i != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        } else {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                a(motionEvent, i3, b, 0, matrix, allocateDirect, null);
            }
        }
        if (allocateDirect.position() % 288 == 0) {
            this.a.a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
        } else {
            ny61.f("Packet position is not on field boundary");
        }
    }
}
