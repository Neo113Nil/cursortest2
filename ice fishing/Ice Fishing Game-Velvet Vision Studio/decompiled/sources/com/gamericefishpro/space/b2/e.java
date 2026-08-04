package com.gamericefishpro.space.b2;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public final com.gamericefishpro.space.t.q e = new com.gamericefishpro.space.t.q((Object) null);
    public int f = -1;
    public int g = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f && source == this.g) {
            return;
        }
        this.f = toolType;
        this.g = source;
        this.c.clear();
        this.b.clear();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae  */
    public final com.gamericefishpro.space.u6.c c(MotionEvent motionEvent, com.gamericefishpro.space.i2.t tVar) {
        int actionIndex;
        long jValueAt;
        long j;
        long jT;
        long jFloatToRawIntBits;
        long jH;
        int toolType;
        int i;
        int historySize;
        int i2;
        char c;
        long jFloatToRawIntBits2;
        float historicalX;
        int i3;
        char c2;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        SparseBooleanArray sparseBooleanArray = this.c;
        int i4 = 3;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = true;
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        ArrayList arrayList = this.d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        while (i5 < pointerCount) {
            boolean z4 = (z2 || i5 == actionIndex || (z3 && motionEvent.getButtonState() == 0)) ? false : z;
            int pointerId = motionEvent.getPointerId(i5);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j2 = this.a;
                this.a = j2 + 1;
                sparseLongArray.put(pointerId, j2);
                jValueAt = j2;
            }
            float pressure = motionEvent.getPressure(i5);
            char c3 = ' ';
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getY(i5))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i5))) << 32);
            long jA = com.gamericefishpro.space.n1.b.a(i4, jFloatToRawIntBits3);
            if (i5 == 0) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                jH = tVar.H(jFloatToRawIntBits);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i5))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i5))) << 32);
                    jH = tVar.H(jFloatToRawIntBits);
                } else {
                    j = jFloatToRawIntBits3;
                    jT = tVar.t(jFloatToRawIntBits3);
                }
                toolType = motionEvent.getToolType(i5);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i = 1;
                    } else if (toolType != 2) {
                        i = i4;
                    } else if (toolType != i4) {
                        i = 2;
                    } else if (toolType != 4) {
                        i = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i2 = 0;
                    while (i2 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i5, i2);
                        float historicalY = motionEvent.getHistoricalY(i5, i2);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                            i3 = i2;
                            c2 = c3;
                        } else {
                            long jFloatToRawIntBits4 = Float.floatToRawIntBits(historicalX);
                            int iFloatToRawIntBits = Float.floatToRawIntBits(historicalY);
                            c2 = c3;
                            long j3 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits) & 4294967295L);
                            i3 = i2;
                            arrayList2.add(new a(motionEvent.getHistoricalEventTime(i3), j3, j3));
                        }
                        i2 = i3 + 1;
                        c3 = c2;
                    }
                    c = c3;
                    if (motionEvent.getActionMasked() == 8) {
                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits2 = 0;
                    }
                    arrayList.add(new o(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList2, jFloatToRawIntBits2, jA));
                    i5++;
                    z2 = z2;
                    z3 = z3;
                    i4 = 3;
                    z = true;
                }
                i = 0;
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i2 = 0;
                while (i2 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i5, i2);
                    float historicalY2 = motionEvent.getHistoricalY(i5, i2);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040) {
                        i3 = i2;
                        c2 = c3;
                    } else {
                        i3 = i2;
                        c2 = c3;
                    }
                    i2 = i3 + 1;
                    c3 = c2;
                }
                c = c3;
                if (motionEvent.getActionMasked() == 8) {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L);
                } else {
                    jFloatToRawIntBits2 = 0;
                }
                arrayList.add(new o(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList3, jFloatToRawIntBits2, jA));
                i5++;
                z2 = z2;
                z3 = z3;
                i4 = 3;
                z = true;
            }
            jT = jFloatToRawIntBits;
            j = jH;
            toolType = motionEvent.getToolType(i5);
            if (toolType == 0) {
                if (toolType != 1) {
                    i = 1;
                } else if (toolType != 2) {
                    i = i4;
                } else if (toolType != i4) {
                    i = 2;
                } else if (toolType != 4) {
                    i = 4;
                }
                ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i2 = 0;
                while (i2 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i5, i2);
                    float historicalY3 = motionEvent.getHistoricalY(i5, i2);
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040) {
                        i3 = i2;
                        c2 = c3;
                    } else {
                        i3 = i2;
                        c2 = c3;
                    }
                    i2 = i3 + 1;
                    c3 = c2;
                }
                c = c3;
                if (motionEvent.getActionMasked() == 8) {
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L);
                } else {
                    jFloatToRawIntBits2 = 0;
                }
                arrayList.add(new o(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList4, jFloatToRawIntBits2, jA));
                i5++;
                z2 = z2;
                z3 = z3;
                i4 = 3;
                z = true;
            }
            i = 0;
            ArrayList arrayList5 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i2 = 0;
            while (i2 < historySize) {
                historicalX = motionEvent.getHistoricalX(i5, i2);
                float historicalY4 = motionEvent.getHistoricalY(i5, i2);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040) {
                    i3 = i2;
                    c2 = c3;
                } else {
                    i3 = i2;
                    c2 = c3;
                }
                i2 = i3 + 1;
                c3 = c2;
            }
            c = c3;
            if (motionEvent.getActionMasked() == 8) {
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L);
            } else {
                jFloatToRawIntBits2 = 0;
            }
            arrayList.add(new o(jValueAt, motionEvent.getEventTime(), jT, j, z4, pressure, i, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList5, jFloatToRawIntBits2, jA));
            i5++;
            z2 = z2;
            z3 = z3;
            i4 = 3;
            z = true;
        }
        d(motionEvent);
        motionEvent.getEventTime();
        return new com.gamericefishpro.space.u6.c(arrayList, motionEvent);
    }

    public final void d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.c;
        SparseLongArray sparseLongArray = this.b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == iKeyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
