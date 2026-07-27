package kotlin.text;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishDatabindingFAB {
    public long CatchingFishParcelableFAB;
    public final SparseLongArray CatchingFishSnackbar = new SparseLongArray();
    public final SparseBooleanArray CatchingFishCoroutine = new SparseBooleanArray();
    public final ArrayList CatchingFishReduxKtor = new ArrayList();
    public int CatchingFishDaggerWebsocket = -1;
    public int CatchingFishWorkManager = -1;

    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB(MotionEvent motionEvent, CatchingFishGradleCameraX catchingFishGradleCameraX) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2;
        long CatchingFish;
        float rawX;
        float rawY;
        int i3;
        int historySize;
        int i4;
        int i5;
        long j3;
        int i6;
        CatchingFishGradleCameraX catchingFishGradleCameraX2 = catchingFishGradleCameraX;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.CatchingFishSnackbar;
        SparseBooleanArray sparseBooleanArray = this.CatchingFishCoroutine;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.CatchingFishDaggerWebsocket || source != this.CatchingFishWorkManager) {
                this.CatchingFishDaggerWebsocket = toolType;
                this.CatchingFishWorkManager = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            j = 1;
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j4 = this.CatchingFishParcelableFAB;
                this.CatchingFishParcelableFAB = j4 + 1;
                sparseLongArray.put(pointerId, j4);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else {
            if (actionMasked2 == 9) {
                int pointerId2 = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                    long j5 = this.CatchingFishParcelableFAB;
                    j = 1;
                    this.CatchingFishParcelableFAB = j5 + 1;
                    sparseLongArray.put(pointerId2, j5);
                }
            }
            j = 1;
        }
        boolean z3 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z4 = actionMasked == 8;
        if (z3) {
            i = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i = 1;
        }
        int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.CatchingFishReduxKtor;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i7 = 0;
        while (i7 < pointerCount) {
            boolean z5 = (z3 || i7 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i7);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z2 = z3;
                z = z4;
                j2 = sparseLongArray.valueAt(indexOfKey);
            } else {
                z = z4;
                long j6 = this.CatchingFishParcelableFAB;
                z2 = z3;
                this.CatchingFishParcelableFAB = j6 + j;
                sparseLongArray.put(pointerId3, j6);
                j2 = j6;
            }
            float pressure = motionEvent.getPressure(i7);
            long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getY(i7)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i7)) << 32);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            int i8 = pointerCount;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            int floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat2);
            ArrayList arrayList2 = arrayList;
            long j7 = (floatToRawIntBits2 << 32) | (floatToRawIntBits3 & 4294967295L);
            if (i7 == 0) {
                CatchingFish = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                floatToRawIntBits = catchingFishGradleCameraX2.CatchingFishFragmentFactory(CatchingFish);
            } else if (Build.VERSION.SDK_INT >= 29) {
                rawX = motionEvent.getRawX(i7);
                rawY = motionEvent.getRawY(i7);
                CatchingFish = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                floatToRawIntBits = catchingFishGradleCameraX2.CatchingFishFragmentFactory(CatchingFish);
            } else {
                CatchingFish = catchingFishGradleCameraX2.CatchingFish(floatToRawIntBits);
            }
            long j8 = floatToRawIntBits;
            int toolType2 = motionEvent.getToolType(i7);
            if (toolType2 != 0) {
                if (toolType2 == 1) {
                    i3 = 1;
                } else if (toolType2 == 2) {
                    i3 = 3;
                } else if (toolType2 == 3) {
                    i3 = 2;
                } else if (toolType2 == 4) {
                    i3 = 4;
                }
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i4 = 0;
                while (i4 < historySize) {
                    float historicalX = motionEvent.getHistoricalX(i7, i4);
                    float historicalY = motionEvent.getHistoricalY(i7, i4);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                        i6 = actionIndex2;
                    } else {
                        i6 = actionIndex2;
                        long floatToRawIntBits4 = (Float.floatToRawIntBits(historicalX) << 32) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                        arrayList3.add(new CatchingFishDaggerGradle(motionEvent.getHistoricalEventTime(i4), floatToRawIntBits4, floatToRawIntBits4));
                    }
                    i4++;
                    actionIndex2 = i6;
                }
                int i9 = actionIndex2;
                if (motionEvent.getActionMasked() != 8) {
                    float axisValue = motionEvent.getAxisValue(10);
                    float f = (-motionEvent.getAxisValue(9)) + 0.0f;
                    long floatToRawIntBits5 = Float.floatToRawIntBits(axisValue);
                    int floatToRawIntBits6 = Float.floatToRawIntBits(f);
                    i5 = i8;
                    j3 = (floatToRawIntBits5 << 32) | (floatToRawIntBits6 & 4294967295L);
                } else {
                    i5 = i8;
                    j3 = 0;
                }
                arrayList2.add(new CatchingFishDaggerSnackbar(j2, motionEvent.getEventTime(), CatchingFish, j8, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList3, j3, j7));
                i7++;
                catchingFishGradleCameraX2 = catchingFishGradleCameraX;
                actionIndex2 = i9;
                pointerCount = i5;
                z4 = z;
                z3 = z2;
                arrayList = arrayList2;
            }
            i3 = 0;
            ArrayList arrayList32 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i4 = 0;
            while (i4 < historySize) {
            }
            int i92 = actionIndex2;
            if (motionEvent.getActionMasked() != 8) {
            }
            arrayList2.add(new CatchingFishDaggerSnackbar(j2, motionEvent.getEventTime(), CatchingFish, j8, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList32, j3, j7));
            i7++;
            catchingFishGradleCameraX2 = catchingFishGradleCameraX;
            actionIndex2 = i92;
            pointerCount = i5;
            z4 = z;
            z3 = z2;
            arrayList = arrayList2;
        }
        ArrayList arrayList4 = arrayList;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i2 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i2 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i10 = i2;
                while (true) {
                    if (i10 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i10) == keyAt) {
                        break;
                    }
                    i10++;
                }
            }
        }
        motionEvent.getEventTime();
        return new CatchingFishViewModelIntent(8, arrayList4, motionEvent);
    }
}
