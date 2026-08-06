package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class te0 {
    public long GWasM1elztuh;
    public uk0 JFJ3QoxA;
    public boolean encWxUiV2;
    public boolean mOu10nynGul;
    public final SparseLongArray Yi7zF1RB1 = new SparseLongArray();
    public final SparseBooleanArray X1lG3V04pd = new SparseBooleanArray();
    public final ArrayList xqGvceK5x = new ArrayList();
    public final qb0 OOA6hdeuvCS = new qb0();
    public int EljAMC1QTz = -1;
    public int AvO7iQsrTN = -1;

    public final void GWasM1elztuh(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.Yi7zF1RB1;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.GWasM1elztuh;
                this.GWasM1elztuh = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.GWasM1elztuh;
            this.GWasM1elztuh = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.X1lG3V04pd.put(pointerId2, true);
            }
        }
    }

    public final void OOA6hdeuvCS(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.X1lG3V04pd;
        SparseLongArray sparseLongArray = this.Yi7zF1RB1;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i = 0;
                while (true) {
                    if (i >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i) == keyAt) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r0 == 5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d X1lG3V04pd(MotionEvent motionEvent, c cVar) {
        int i;
        int classification;
        float rawX;
        float rawY;
        boolean z;
        int classification2;
        int classification3;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.X1lG3V04pd;
        if (actionMasked == 3 || actionMasked == 4) {
            this.Yi7zF1RB1.clear();
            sparseBooleanArray.clear();
            this.encWxUiV2 = false;
            this.mOu10nynGul = false;
            this.JFJ3QoxA = null;
            return null;
        }
        Yi7zF1RB1(motionEvent);
        GWasM1elztuh(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.xqGvceK5x;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            if (Build.VERSION.SDK_INT >= 34) {
                classification2 = motionEvent.getClassification();
                if (classification2 != 3) {
                    classification3 = motionEvent.getClassification();
                }
                z = true;
                boolean z4 = motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
                if (!z || z4) {
                    this.encWxUiV2 = true;
                }
            }
            z = false;
            if (motionEvent.getButtonState() != 0) {
            }
            if (!z) {
            }
            this.encWxUiV2 = true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            classification = motionEvent.getClassification();
            if (classification == 3) {
                this.mOu10nynGul = true;
                if (motionEvent.getActionMasked() == 0) {
                    rawX = motionEvent.getRawX(0);
                    rawY = motionEvent.getRawY(0);
                    this.JFJ3QoxA = new uk0((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
                }
                arrayList.add(xqGvceK5x(cVar, motionEvent, this.JFJ3QoxA, 0, false));
                if (motionEvent.getActionMasked() == 1) {
                    this.encWxUiV2 = false;
                    this.mOu10nynGul = false;
                    this.JFJ3QoxA = null;
                }
                OOA6hdeuvCS(motionEvent);
                motionEvent.getEventTime();
                return new d(15, arrayList, motionEvent);
            }
        }
        this.mOu10nynGul = false;
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            arrayList.add(xqGvceK5x(cVar, motionEvent, null, i2, (z2 || i2 == i || (z3 && motionEvent.getButtonState() == 0)) ? false : true));
            i2++;
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        OOA6hdeuvCS(motionEvent);
        motionEvent.getEventTime();
        return new d(15, arrayList, motionEvent);
    }

    public final void Yi7zF1RB1(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.EljAMC1QTz && source == this.AvO7iQsrTN) {
            return;
        }
        this.EljAMC1QTz = toolType;
        this.AvO7iQsrTN = source;
        this.X1lG3V04pd.clear();
        this.Yi7zF1RB1.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r1 != 4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0182 A[EDGE_INSN: B:41:0x0182->B:42:0x0182 BREAK  A[LOOP:0: B:20:0x00ea->B:38:0x0179], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mq0 xqGvceK5x(c cVar, MotionEvent motionEvent, uk0 uk0Var, int i, boolean z) {
        long j;
        long j2;
        long jivtDDk9H;
        long j3;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long AEn1Rrio;
        boolean z2;
        int toolType;
        int i2;
        int historySize;
        int i3;
        long j4;
        float f;
        int i4;
        long j5;
        int classification;
        int classification2;
        Float valueOf;
        int i5;
        int classification3;
        boolean z3;
        boolean z4;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.Yi7zF1RB1;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j6 = this.GWasM1elztuh;
            this.GWasM1elztuh = 1 + j6;
            sparseLongArray.put(pointerId, j6);
            j = j6;
        }
        float pressure = motionEvent.getPressure(i);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i)) << 32);
        if (i == 0) {
            if (uk0Var != null) {
                jivtDDk9H = uk0Var.GWasM1elztuh;
                z4 = 32;
                j2 = 4294967295L;
            } else {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                long floatToRawIntBits3 = Float.floatToRawIntBits(rawX2);
                int floatToRawIntBits4 = Float.floatToRawIntBits(rawY2);
                z4 = 32;
                j2 = 4294967295L;
                jivtDDk9H = (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L);
            }
            AEn1Rrio = cVar.AEn1Rrio(jivtDDk9H);
            z3 = z4;
        } else {
            boolean z5 = 32;
            j2 = 4294967295L;
            if (Build.VERSION.SDK_INT < 29) {
                jivtDDk9H = cVar.jivtDDk9H(floatToRawIntBits2);
                j3 = floatToRawIntBits2;
                z2 = z5;
                toolType = motionEvent.getToolType(i);
                if (toolType != 0) {
                    int i6 = 2;
                    if (toolType == 1) {
                        if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.encWxUiV2 && !this.mOu10nynGul)) {
                            i2 = 1;
                        }
                        i2 = i6;
                    } else if (toolType != 2) {
                        if (toolType != 3) {
                            i6 = 4;
                        }
                        i2 = i6;
                    } else {
                        i2 = 3;
                    }
                    ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    boolean z6 = z2;
                    i3 = 0;
                    while (true) {
                        j4 = 0;
                        if (i3 >= historySize) {
                            break;
                        }
                        float historicalX = motionEvent.getHistoricalX(i, i3);
                        float historicalY = motionEvent.getHistoricalY(i, i3);
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                            i5 = historySize;
                        } else {
                            long floatToRawIntBits5 = Float.floatToRawIntBits(historicalX);
                            int floatToRawIntBits6 = Float.floatToRawIntBits(historicalY);
                            i5 = historySize;
                            long j7 = (floatToRawIntBits5 << (z6 ? 1L : 0L)) | (floatToRawIntBits6 & j2);
                            long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                            float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                            valueOf = historicalAxisValue > 0.0f ? Float.valueOf(historicalAxisValue) : null;
                            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
                            if (Build.VERSION.SDK_INT >= 29) {
                                classification3 = motionEvent.getClassification();
                                if (classification3 == 3) {
                                    j4 = (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j2);
                                }
                            }
                            arrayList.add(new jz(historicalEventTime, j7, floatValue, j4, j7));
                        }
                        i3++;
                        historySize = i5;
                    }
                    long floatToRawIntBits7 = motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j2) : 0L;
                    i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        classification2 = motionEvent.getClassification();
                        if (classification2 == 5) {
                            float axisValue = motionEvent.getAxisValue(52, i);
                            valueOf = axisValue > 0.0f ? Float.valueOf(axisValue) : null;
                            if (valueOf != null) {
                                f = valueOf.floatValue();
                            }
                        }
                    }
                    float f2 = f;
                    if (i4 >= 29) {
                        classification = motionEvent.getClassification();
                        if (classification == 3) {
                            j5 = floatToRawIntBits2;
                            j4 = (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << (z6 ? 1L : 0L)) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j2);
                            return new mq0(j, motionEvent.getEventTime(), jivtDDk9H, j3, z, pressure, i2, this.X1lG3V04pd.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits7, f2, j4, j5);
                        }
                    }
                    j5 = floatToRawIntBits2;
                    return new mq0(j, motionEvent.getEventTime(), jivtDDk9H, j3, z, pressure, i2, this.X1lG3V04pd.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits7, f2, j4, j5);
                }
                i2 = 0;
                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                boolean z62 = z2;
                i3 = 0;
                while (true) {
                    j4 = 0;
                    if (i3 >= historySize) {
                    }
                    i3++;
                    historySize = i5;
                }
                if (motionEvent.getActionMasked() == 8) {
                }
                i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                float f22 = f;
                if (i4 >= 29) {
                }
                j5 = floatToRawIntBits2;
                return new mq0(j, motionEvent.getEventTime(), jivtDDk9H, j3, z, pressure, i2, this.X1lG3V04pd.get(motionEvent.getPointerId(i), false), arrayList2, floatToRawIntBits7, f22, j4, j5);
            }
            if (uk0Var != null) {
                floatToRawIntBits = uk0Var.GWasM1elztuh;
            } else {
                rawX = motionEvent.getRawX(i);
                rawY = motionEvent.getRawY(i);
                floatToRawIntBits = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
            }
            jivtDDk9H = floatToRawIntBits;
            AEn1Rrio = cVar.AEn1Rrio(jivtDDk9H);
            z3 = z5;
        }
        j3 = AEn1Rrio;
        z2 = z3;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
        }
        i2 = 0;
        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        boolean z622 = z2;
        i3 = 0;
        while (true) {
            j4 = 0;
            if (i3 >= historySize) {
            }
            i3++;
            historySize = i5;
        }
        if (motionEvent.getActionMasked() == 8) {
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        float f222 = f;
        if (i4 >= 29) {
        }
        j5 = floatToRawIntBits2;
        return new mq0(j, motionEvent.getEventTime(), jivtDDk9H, j3, z, pressure, i2, this.X1lG3V04pd.get(motionEvent.getPointerId(i), false), arrayList22, floatToRawIntBits7, f222, j4, j5);
    }
}
