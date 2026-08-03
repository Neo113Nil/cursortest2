package r1;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public long f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f5939b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f5940c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5941d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f5942e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f5943f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x4.e a(MotionEvent motionEvent, y1.r rVar) {
        long j3;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        long j6;
        long j10;
        long s10;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long F;
        int toolType;
        int i12;
        int historySize;
        int i13;
        char c3;
        long j11;
        char c7;
        int i14;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f5939b;
        SparseBooleanArray sparseBooleanArray = this.f5940c;
        int i15 = 3;
        if (actionMasked != 3) {
            int i16 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f5942e || source != this.f5943f) {
                        this.f5942e = toolType2;
                        this.f5943f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j3 = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j12 = this.f5938a;
                        this.f5938a = j12 + 1;
                        sparseLongArray.put(pointerId, j12);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j13 = this.f5938a;
                            j3 = 1;
                            this.f5938a = j13 + 1;
                            sparseLongArray.put(pointerId2, j13);
                        }
                    }
                    j3 = 1;
                }
                boolean z12 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z13 = actionMasked == 8;
                if (z12) {
                    i10 = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i10 = 1;
                }
                int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f5941d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i17 = 0;
                while (i17 < pointerCount) {
                    boolean z14 = (z12 || i17 == actionIndex2 || (z13 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i17);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z11 = z12;
                        z10 = z13;
                        j6 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z10 = z13;
                        long j14 = this.f5938a;
                        z11 = z12;
                        this.f5938a = j14 + j3;
                        sparseLongArray.put(pointerId3, j14);
                        j6 = j14;
                    }
                    float pressure = motionEvent.getPressure(i17);
                    char c10 = ' ';
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i17)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i17)) << 32);
                    long a6 = e1.b.a(i15, floatToRawIntBits2);
                    if (i17 == 0) {
                        floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        F = rVar.F(floatToRawIntBits);
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        rawX = motionEvent.getRawX(i17);
                        rawY = motionEvent.getRawY(i17);
                        floatToRawIntBits = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                        F = rVar.F(floatToRawIntBits);
                    } else {
                        j10 = floatToRawIntBits2;
                        s10 = rVar.s(floatToRawIntBits2);
                        toolType = motionEvent.getToolType(i17);
                        if (toolType != 0) {
                            if (toolType == 1) {
                                i12 = 1;
                            } else if (toolType == 2) {
                                i12 = i15;
                            } else if (toolType == i15) {
                                i12 = 2;
                            } else if (toolType == i16) {
                                i12 = i16;
                            }
                            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i13 = 0;
                            while (i13 < historySize) {
                                float historicalX = motionEvent.getHistoricalX(i17, i13);
                                float historicalY = motionEvent.getHistoricalY(i17, i13);
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    c7 = c10;
                                    i14 = pointerCount;
                                } else {
                                    long floatToRawIntBits3 = Float.floatToRawIntBits(historicalX);
                                    int floatToRawIntBits4 = Float.floatToRawIntBits(historicalY);
                                    c7 = c10;
                                    i14 = pointerCount;
                                    long j15 = (floatToRawIntBits3 << c7) | (floatToRawIntBits4 & 4294967295L);
                                    arrayList2.add(new b(motionEvent.getHistoricalEventTime(i13), j15, j15));
                                }
                                i13++;
                                c10 = c7;
                                pointerCount = i14;
                            }
                            char c11 = c10;
                            int i18 = pointerCount;
                            if (motionEvent.getActionMasked() == 8) {
                                c3 = '\t';
                                j11 = (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c11);
                            } else {
                                c3 = '\t';
                                j11 = 0;
                            }
                            arrayList.add(new p(j6, motionEvent.getEventTime(), s10, j10, z14, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i17), false), arrayList2, j11, a6));
                            i17++;
                            z13 = z10;
                            z12 = z11;
                            pointerCount = i18;
                            i15 = 3;
                            i16 = 4;
                        }
                        i12 = 0;
                        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i13 = 0;
                        while (i13 < historySize) {
                        }
                        char c112 = c10;
                        int i182 = pointerCount;
                        if (motionEvent.getActionMasked() == 8) {
                        }
                        arrayList.add(new p(j6, motionEvent.getEventTime(), s10, j10, z14, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i17), false), arrayList22, j11, a6));
                        i17++;
                        z13 = z10;
                        z12 = z11;
                        pointerCount = i182;
                        i15 = 3;
                        i16 = 4;
                    }
                    s10 = floatToRawIntBits;
                    j10 = F;
                    toolType = motionEvent.getToolType(i17);
                    if (toolType != 0) {
                    }
                    i12 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i13 = 0;
                    while (i13 < historySize) {
                    }
                    char c1122 = c10;
                    int i1822 = pointerCount;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new p(j6, motionEvent.getEventTime(), s10, j10, z14, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i17), false), arrayList222, j11, a6));
                    i17++;
                    z13 = z10;
                    z12 = z11;
                    pointerCount = i1822;
                    i15 = 3;
                    i16 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i11 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i11 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int keyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i19 = i11;
                        while (true) {
                            if (i19 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i19) == keyAt) {
                                break;
                            }
                            i19++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new x4.e(arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
