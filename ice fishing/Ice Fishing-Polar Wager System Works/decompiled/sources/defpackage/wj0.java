package defpackage;

/* loaded from: classes.dex */
public final class wj0 {
    public boolean EXtogiMhuM;
    public long IHQe1A4L2xu;
    public defpackage.gq0 SH1y5HwkJhh;
    public boolean riuEU0zW4;
    public final android.util.SparseLongArray oh6vYeIP = new android.util.SparseLongArray();
    public final android.util.SparseBooleanArray r1MBDhnF = new android.util.SparseBooleanArray();
    public final java.util.ArrayList F7NU4MC0GW = new java.util.ArrayList();
    public final defpackage.vf0 adDC3e2L = new defpackage.vf0();
    public int xiZrDbcSW0 = -1;
    public int AARZUJiTa = -1;

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
    public final defpackage.uv0 F7NU4MC0GW(defpackage.v0 v0Var, android.view.MotionEvent motionEvent, defpackage.gq0 gq0Var, int i, boolean z) {
        long j;
        long j2;
        long fnWB2E7cs;
        long j3;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long frpfPPIgqM9O;
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
        java.lang.Float valueOf;
        int i5;
        int classification3;
        boolean z3;
        boolean z4;
        int pointerId = motionEvent.getPointerId(i);
        android.util.SparseLongArray sparseLongArray = this.oh6vYeIP;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j6 = this.IHQe1A4L2xu;
            this.IHQe1A4L2xu = 1 + j6;
            sparseLongArray.put(pointerId, j6);
            j = j6;
        }
        float pressure = motionEvent.getPressure(i);
        long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(motionEvent.getY(i)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(motionEvent.getX(i)) << 32);
        if (i == 0) {
            if (gq0Var != null) {
                fnWB2E7cs = gq0Var.IHQe1A4L2xu;
                z4 = 32;
                j2 = 4294967295L;
            } else {
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                long floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(rawX2);
                int floatToRawIntBits4 = java.lang.Float.floatToRawIntBits(rawY2);
                z4 = 32;
                j2 = 4294967295L;
                fnWB2E7cs = (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L);
            }
            frpfPPIgqM9O = v0Var.frpfPPIgqM9O(fnWB2E7cs);
            z3 = z4;
        } else {
            boolean z5 = 32;
            j2 = 4294967295L;
            if (android.os.Build.VERSION.SDK_INT < 29) {
                fnWB2E7cs = v0Var.fnWB2E7cs(floatToRawIntBits2);
                j3 = floatToRawIntBits2;
                z2 = z5;
                toolType = motionEvent.getToolType(i);
                if (toolType != 0) {
                    int i6 = 2;
                    if (toolType == 1) {
                        if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.EXtogiMhuM && !this.riuEU0zW4)) {
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
                    java.util.ArrayList arrayList = new java.util.ArrayList(motionEvent.getHistorySize());
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
                        if ((java.lang.Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                            i5 = historySize;
                        } else {
                            long floatToRawIntBits5 = java.lang.Float.floatToRawIntBits(historicalX);
                            int floatToRawIntBits6 = java.lang.Float.floatToRawIntBits(historicalY);
                            i5 = historySize;
                            long j7 = (floatToRawIntBits5 << (z6 ? 1L : 0L)) | (floatToRawIntBits6 & j2);
                            long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                            float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                            valueOf = historicalAxisValue > 0.0f ? java.lang.Float.valueOf(historicalAxisValue) : null;
                            float floatValue = valueOf != null ? valueOf.floatValue() : 1.0f;
                            if (android.os.Build.VERSION.SDK_INT >= 29) {
                                classification3 = motionEvent.getClassification();
                                if (classification3 == 3) {
                                    j4 = (java.lang.Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << (z6 ? 1L : 0L)) | (java.lang.Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j2);
                                }
                            }
                            arrayList.add(new defpackage.z30(historicalEventTime, j7, floatValue, j4, j7));
                        }
                        i3++;
                        historySize = i5;
                    }
                    long floatToRawIntBits7 = motionEvent.getActionMasked() == 8 ? (java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << (z6 ? 1L : 0L)) | (java.lang.Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j2) : 0L;
                    i4 = android.os.Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        classification2 = motionEvent.getClassification();
                        if (classification2 == 5) {
                            float axisValue = motionEvent.getAxisValue(52, i);
                            valueOf = axisValue > 0.0f ? java.lang.Float.valueOf(axisValue) : null;
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
                            j4 = (java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << (z6 ? 1L : 0L)) | (java.lang.Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j2);
                            return new defpackage.uv0(j, motionEvent.getEventTime(), fnWB2E7cs, j3, z, pressure, i2, this.r1MBDhnF.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits7, f2, j4, j5);
                        }
                    }
                    j5 = floatToRawIntBits2;
                    return new defpackage.uv0(j, motionEvent.getEventTime(), fnWB2E7cs, j3, z, pressure, i2, this.r1MBDhnF.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits7, f2, j4, j5);
                }
                i2 = 0;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(motionEvent.getHistorySize());
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
                i4 = android.os.Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                }
                float f22 = f;
                if (i4 >= 29) {
                }
                j5 = floatToRawIntBits2;
                return new defpackage.uv0(j, motionEvent.getEventTime(), fnWB2E7cs, j3, z, pressure, i2, this.r1MBDhnF.get(motionEvent.getPointerId(i), false), arrayList2, floatToRawIntBits7, f22, j4, j5);
            }
            if (gq0Var != null) {
                floatToRawIntBits = gq0Var.IHQe1A4L2xu;
            } else {
                rawX = motionEvent.getRawX(i);
                rawY = motionEvent.getRawY(i);
                floatToRawIntBits = (java.lang.Float.floatToRawIntBits(rawX) << 32) | (java.lang.Float.floatToRawIntBits(rawY) & 4294967295L);
            }
            fnWB2E7cs = floatToRawIntBits;
            frpfPPIgqM9O = v0Var.frpfPPIgqM9O(fnWB2E7cs);
            z3 = z5;
        }
        j3 = frpfPPIgqM9O;
        z2 = z3;
        toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
        }
        i2 = 0;
        java.util.ArrayList arrayList22 = new java.util.ArrayList(motionEvent.getHistorySize());
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
        i4 = android.os.Build.VERSION.SDK_INT;
        if (i4 >= 29) {
        }
        float f222 = f;
        if (i4 >= 29) {
        }
        j5 = floatToRawIntBits2;
        return new defpackage.uv0(j, motionEvent.getEventTime(), fnWB2E7cs, j3, z, pressure, i2, this.r1MBDhnF.get(motionEvent.getPointerId(i), false), arrayList22, floatToRawIntBits7, f222, j4, j5);
    }

    public final void IHQe1A4L2xu(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        android.util.SparseLongArray sparseLongArray = this.oh6vYeIP;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.IHQe1A4L2xu;
                this.IHQe1A4L2xu = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.IHQe1A4L2xu;
            this.IHQe1A4L2xu = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.r1MBDhnF.put(pointerId2, true);
            }
        }
    }

    public final void adDC3e2L(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        android.util.SparseBooleanArray sparseBooleanArray = this.r1MBDhnF;
        android.util.SparseLongArray sparseLongArray = this.oh6vYeIP;
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

    public final void oh6vYeIP(android.view.MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.xiZrDbcSW0 && source == this.AARZUJiTa) {
            return;
        }
        this.xiZrDbcSW0 = toolType;
        this.AARZUJiTa = source;
        this.r1MBDhnF.clear();
        this.oh6vYeIP.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r0 == 5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.F7NU4MC0GW r1MBDhnF(android.view.MotionEvent motionEvent, defpackage.v0 v0Var) {
        int i;
        int classification;
        float rawX;
        float rawY;
        boolean z;
        int classification2;
        int classification3;
        int actionMasked = motionEvent.getActionMasked();
        android.util.SparseBooleanArray sparseBooleanArray = this.r1MBDhnF;
        if (actionMasked == 3 || actionMasked == 4) {
            this.oh6vYeIP.clear();
            sparseBooleanArray.clear();
            this.EXtogiMhuM = false;
            this.riuEU0zW4 = false;
            this.SH1y5HwkJhh = null;
            return null;
        }
        oh6vYeIP(motionEvent);
        IHQe1A4L2xu(motionEvent);
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
        java.util.ArrayList arrayList = this.F7NU4MC0GW;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                classification2 = motionEvent.getClassification();
                if (classification2 != 3) {
                    classification3 = motionEvent.getClassification();
                }
                z = true;
                boolean z4 = motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
                if (!z || z4) {
                    this.EXtogiMhuM = true;
                }
            }
            z = false;
            if (motionEvent.getButtonState() != 0) {
            }
            if (!z) {
            }
            this.EXtogiMhuM = true;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            classification = motionEvent.getClassification();
            if (classification == 3) {
                this.riuEU0zW4 = true;
                if (motionEvent.getActionMasked() == 0) {
                    rawX = motionEvent.getRawX(0);
                    rawY = motionEvent.getRawY(0);
                    this.SH1y5HwkJhh = new defpackage.gq0((java.lang.Float.floatToRawIntBits(rawY) & 4294967295L) | (java.lang.Float.floatToRawIntBits(rawX) << 32));
                }
                arrayList.add(F7NU4MC0GW(v0Var, motionEvent, this.SH1y5HwkJhh, 0, false));
                if (motionEvent.getActionMasked() == 1) {
                    this.EXtogiMhuM = false;
                    this.riuEU0zW4 = false;
                    this.SH1y5HwkJhh = null;
                }
                adDC3e2L(motionEvent);
                motionEvent.getEventTime();
                return new defpackage.F7NU4MC0GW(20, arrayList, motionEvent);
            }
        }
        this.riuEU0zW4 = false;
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            arrayList.add(F7NU4MC0GW(v0Var, motionEvent, null, i2, (z2 || i2 == i || (z3 && motionEvent.getButtonState() == 0)) ? false : true));
            i2++;
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        adDC3e2L(motionEvent);
        motionEvent.getEventTime();
        return new defpackage.F7NU4MC0GW(20, arrayList, motionEvent);
    }
}
