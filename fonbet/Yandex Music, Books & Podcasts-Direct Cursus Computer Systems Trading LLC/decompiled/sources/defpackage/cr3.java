package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.io.Serializable;
import java.util.ArrayList;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class cr3 {
    public long a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Serializable f;

    public cr3() {
        this.d = new SparseLongArray();
        this.e = new SparseBooleanArray();
        this.f = new ArrayList();
        this.b = -1;
        this.c = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aqd a(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2;
        float f;
        long j3;
        long t;
        long H;
        int toolType;
        int i3;
        int historySize;
        int i4;
        long j4;
        ArrayList arrayList = (ArrayList) this.f;
        SparseLongArray sparseLongArray = (SparseLongArray) this.d;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.e;
        int actionMasked = motionEvent.getActionMasked();
        int i5 = 3;
        if (actionMasked != 3) {
            int i6 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.b || source != this.c) {
                        this.b = toolType2;
                        this.c = source;
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
                        long j5 = this.a;
                        this.a = j5 + 1;
                        sparseLongArray.put(pointerId, j5);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j6 = this.a;
                            j = 1;
                            this.a = j6 + 1;
                            sparseLongArray.put(pointerId2, j6);
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
                        long j7 = this.a;
                        z2 = z3;
                        this.a = j7 + j;
                        sparseLongArray.put(pointerId3, j7);
                        j2 = j7;
                    }
                    float pressure = motionEvent.getPressure(i7);
                    char c = ' ';
                    long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getY(i7)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i7)) << 32);
                    long a = enj.a(0.0f, 0.0f, i5, floatToRawIntBits);
                    if (i7 == 0) {
                        f = 0.0f;
                        t = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        H = androidComposeView.H(t);
                    } else {
                        f = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            t = mi.P(motionEvent, i7);
                            H = androidComposeView.H(t);
                        } else {
                            j3 = floatToRawIntBits;
                            t = androidComposeView.t(floatToRawIntBits);
                            toolType = motionEvent.getToolType(i7);
                            if (toolType != 0) {
                                if (toolType == 1) {
                                    i3 = 1;
                                } else if (toolType == 2) {
                                    i3 = i5;
                                } else if (toolType == i5) {
                                    i3 = 2;
                                } else if (toolType == i6) {
                                    i3 = i6;
                                }
                                ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                                historySize = motionEvent.getHistorySize();
                                i4 = 0;
                                while (i4 < historySize) {
                                    float historicalX = motionEvent.getHistoricalX(i7, i4);
                                    float historicalY = motionEvent.getHistoricalY(i7, i4);
                                    char c2 = c;
                                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                        j4 = t;
                                    } else {
                                        j4 = t;
                                        long floatToRawIntBits2 = (Float.floatToRawIntBits(historicalX) << c2) | (Float.floatToRawIntBits(historicalY) & 4294967295L);
                                        arrayList2.add(new zyd(motionEvent.getHistoricalEventTime(i4), floatToRawIntBits2, floatToRawIntBits2));
                                    }
                                    i4++;
                                    c = c2;
                                    t = j4;
                                }
                                arrayList.add(new nfm(j2, motionEvent.getEventTime(), t, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList2, motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f) & 4294967295L) : 0L, a));
                                i7++;
                                z4 = z;
                                z3 = z2;
                                i5 = 3;
                                i6 = 4;
                            }
                            i3 = 0;
                            ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i4 = 0;
                            while (i4 < historySize) {
                            }
                            arrayList.add(new nfm(j2, motionEvent.getEventTime(), t, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList22, motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f) & 4294967295L) : 0L, a));
                            i7++;
                            z4 = z;
                            z3 = z2;
                            i5 = 3;
                            i6 = 4;
                        }
                    }
                    j3 = H;
                    toolType = motionEvent.getToolType(i7);
                    if (toolType != 0) {
                    }
                    i3 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i4 = 0;
                    while (i4 < historySize) {
                    }
                    arrayList.add(new nfm(j2, motionEvent.getEventTime(), t, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i7), false), arrayList222, motionEvent.getActionMasked() == 8 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c) | (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f) & 4294967295L) : 0L, a));
                    i7++;
                    z4 = z;
                    z3 = z2;
                    i5 = 3;
                    i6 = 4;
                }
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
                        int i8 = i2;
                        while (true) {
                            if (i8 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i8) == keyAt) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new aqd(18, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }

    public String b(long j) {
        cr3 cr3Var = (cr3) this.e;
        if (cr3Var != null && j >= cr3Var.a) {
            return cr3Var.b(j);
        }
        if (((String) this.f) == null) {
            this.f = ((DateTimeZone) this.d).h(this.a);
        }
        return (String) this.f;
    }

    public int c(long j) {
        cr3 cr3Var = (cr3) this.e;
        if (cr3Var != null && j >= cr3Var.a) {
            return cr3Var.c(j);
        }
        if (this.b == Integer.MIN_VALUE) {
            this.b = ((DateTimeZone) this.d).j(this.a);
        }
        return this.b;
    }

    public int d(long j) {
        cr3 cr3Var = (cr3) this.e;
        if (cr3Var != null && j >= cr3Var.a) {
            return cr3Var.d(j);
        }
        if (this.c == Integer.MIN_VALUE) {
            this.c = ((DateTimeZone) this.d).o(this.a);
        }
        return this.c;
    }

    public cr3(DateTimeZone dateTimeZone, long j) {
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.a = j;
        this.d = dateTimeZone;
    }
}
