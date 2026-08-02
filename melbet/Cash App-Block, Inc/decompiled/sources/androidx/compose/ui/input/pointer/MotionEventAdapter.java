package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.camera.video.Recorder;
import androidx.collection.LongSparseArray;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes.dex */
public final class MotionEventAdapter {
    public Offset inferredCursorRawOffset;
    public boolean isInFakeFingerGesture;
    public boolean isReinterpretingFakeFingerGesture;
    public long nextId;
    public final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    public final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    public final ArrayList pointers = new ArrayList();
    public final LongSparseArray previousIndirectPointerEventData = new LongSparseArray((Object) null);
    public int previousToolType = -1;
    public int previousSource = -1;

    /* loaded from: classes3.dex */
    public final class IndirectPointerEventData {
        public final long packedValue;

        public /* synthetic */ IndirectPointerEventData(long j) {
            this.packedValue = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IndirectPointerEventData m800boximpl(long j) {
            return new IndirectPointerEventData(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m801constructorimpl(long j, long j2) {
            short intBitsToFloat = (short) Float.intBitsToFloat((int) (j2 >> 32));
            return ((j & 2147483647L) << 1) | 1 | (((((short) Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax))) & HPKE.aead_EXPORT_ONLY) | (intBitsToFloat << 16)) << 32);
        }

        /* renamed from: getDown-impl, reason: not valid java name */
        public static final boolean m802getDownimpl(long j) {
            return (j & 1) != 0;
        }

        /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public static final long m803getPositionF1C5BW0(long j) {
            int i = (int) (j >>> 32);
            return (Float.floatToRawIntBits((short) (i & 65535)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits((short) (i >>> 16)) << 32);
        }

        /* renamed from: getUptime-impl, reason: not valid java name */
        public static final long m804getUptimeimpl(long j) {
            return (j >> 1) & 2147483647L;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof IndirectPointerEventData) {
                return this.packedValue == ((IndirectPointerEventData) obj).packedValue;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.packedValue);
        }

        public final String toString() {
            return "IndirectPointerEventData(packedValue=" + this.packedValue + ')';
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m805unboximpl() {
            return this.packedValue;
        }
    }

    public final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    public final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    public final Recorder.AnonymousClass1 convertToPointerInputEvent$ui(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.activeHoverIds;
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            sparseBooleanArray.clear();
            this.isInFakeFingerGesture = false;
            this.isReinterpretingFakeFingerGesture = false;
            this.inferredCursorRawOffset = null;
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z2 = actionMasked == 8;
        if (z) {
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        ArrayList arrayList = this.pointers;
        arrayList.clear();
        if (motionEvent.getActionMasked() == 0) {
            boolean z3 = Build.VERSION.SDK_INT >= 34 && (motionEvent.getClassification() == 3 || motionEvent.getClassification() == 5);
            boolean z4 = motionEvent.getButtonState() == 0 && (motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584));
            if (z3 || z4) {
                this.isInFakeFingerGesture = true;
            }
        }
        if (Build.VERSION.SDK_INT < 34 || motionEvent.getClassification() != 3) {
            this.isReinterpretingFakeFingerGesture = false;
            int pointerCount = motionEvent.getPointerCount();
            int i2 = 0;
            while (i2 < pointerCount) {
                arrayList.add(m799createPointerInputEventDataInuC1xA(androidComposeView, motionEvent, null, i2, (z || i2 == i || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
                i2++;
            }
        } else {
            this.isReinterpretingFakeFingerGesture = true;
            if (motionEvent.getActionMasked() == 0) {
                float rawX = motionEvent.getRawX(0);
                this.inferredCursorRawOffset = new Offset((Float.floatToRawIntBits(motionEvent.getRawY(0)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(rawX) << 32));
            }
            arrayList.add(m799createPointerInputEventDataInuC1xA(androidComposeView, motionEvent, this.inferredCursorRawOffset, 0, false));
        }
        if (motionEvent.getActionMasked() == 1) {
            this.isInFakeFingerGesture = false;
            this.isReinterpretingFakeFingerGesture = false;
            this.inferredCursorRawOffset = null;
        }
        removeStaleIds(motionEvent);
        motionEvent.getEventTime();
        return new Recorder.AnonymousClass1(19, arrayList, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r1 != 4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0151 A[EDGE_INSN: B:40:0x0151->B:41:0x0151 BREAK  A[LOOP:0: B:20:0x00c3->B:36:0x0149], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* renamed from: createPointerInputEventData-InuC1xA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointerInputEventData m799createPointerInputEventDataInuC1xA(AndroidComposeView androidComposeView, MotionEvent motionEvent, Offset offset, int i, boolean z) {
        long j;
        long m811toRawOffsetdBAh8RU;
        long m920screenToLocalMKHz9U;
        int i2;
        int historySize;
        int i3;
        char c;
        float f;
        int pointerId = motionEvent.getPointerId(i);
        SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
        int indexOfKey = sparseLongArray.indexOfKey(pointerId);
        if (indexOfKey >= 0) {
            j = sparseLongArray.valueAt(indexOfKey);
        } else {
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray.put(pointerId, j2);
            j = j2;
        }
        float pressure = motionEvent.getPressure(i);
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        long floatToRawIntBits = Float.floatToRawIntBits(x);
        long floatToRawIntBits2 = Float.floatToRawIntBits(y);
        char c2 = ' ';
        long j3 = BodyPartID.bodyIdMax;
        long j4 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & BodyPartID.bodyIdMax);
        if (i == 0) {
            m811toRawOffsetdBAh8RU = offset != null ? offset.packedValue : (Float.floatToRawIntBits(motionEvent.getRawX()) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY()) & BodyPartID.bodyIdMax);
            m920screenToLocalMKHz9U = androidComposeView.m920screenToLocalMKHz9U(m811toRawOffsetdBAh8RU);
        } else {
            m811toRawOffsetdBAh8RU = offset != null ? offset.packedValue : PointerEventKt.m811toRawOffsetdBAh8RU(motionEvent, i);
            m920screenToLocalMKHz9U = androidComposeView.m920screenToLocalMKHz9U(m811toRawOffsetdBAh8RU);
        }
        long j5 = m811toRawOffsetdBAh8RU;
        long j6 = m920screenToLocalMKHz9U;
        int toolType = motionEvent.getToolType(i);
        if (toolType != 0) {
            int i4 = 2;
            if (toolType == 1) {
                if ((!motionEvent.isFromSource(8194) && !motionEvent.isFromSource(1048584)) || (this.isInFakeFingerGesture && !this.isReinterpretingFakeFingerGesture)) {
                    i2 = 1;
                }
                i2 = i4;
            } else if (toolType != 2) {
                if (toolType != 3) {
                    i4 = 4;
                }
                i2 = i4;
            } else {
                i2 = 3;
            }
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i3 = 0;
            while (true) {
                c = c2;
                if (i3 < historySize) {
                    break;
                }
                float historicalX = motionEvent.getHistoricalX(i, i3);
                float historicalY = motionEvent.getHistoricalY(i, i3);
                long j7 = j3;
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long floatToRawIntBits3 = (Float.floatToRawIntBits(historicalX) << c) | (Float.floatToRawIntBits(historicalY) & j7);
                    long historicalEventTime = motionEvent.getHistoricalEventTime(i3);
                    float historicalAxisValue = motionEvent.getHistoricalAxisValue(52, i, i3);
                    Float valueOf = historicalAxisValue > RecyclerView.DECELERATION_RATE ? Float.valueOf(historicalAxisValue) : null;
                    arrayList.add(new HistoricalChange(historicalEventTime, floatToRawIntBits3, valueOf != null ? valueOf.floatValue() : 1.0f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, i, i3)) << c) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, i, i3)) & j7) : 0L, floatToRawIntBits3));
                }
                i3++;
                c2 = c;
                j3 = j7;
            }
            long j8 = j3;
            long floatToRawIntBits4 = motionEvent.getActionMasked() != 8 ? (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + RecyclerView.DECELERATION_RATE) & j8) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c) : 0L;
            if (motionEvent.getClassification() == 5) {
                float axisValue = motionEvent.getAxisValue(52, i);
                Float valueOf2 = axisValue > RecyclerView.DECELERATION_RATE ? Float.valueOf(axisValue) : null;
                if (valueOf2 != null) {
                    f = valueOf2.floatValue();
                }
            }
            return new PointerInputEventData(j, motionEvent.getEventTime(), j5, j6, z, pressure, i2, this.activeHoverIds.get(motionEvent.getPointerId(i), false), arrayList, floatToRawIntBits4, f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << c) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j8) : 0L, j4);
        }
        i2 = 0;
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        i3 = 0;
        while (true) {
            c = c2;
            if (i3 < historySize) {
            }
            i3++;
            c2 = c;
            j3 = j7;
        }
        long j82 = j3;
        if (motionEvent.getActionMasked() != 8) {
        }
        if (motionEvent.getClassification() == 5) {
        }
        return new PointerInputEventData(j, motionEvent.getEventTime(), j5, j6, z, pressure, i2, this.activeHoverIds.get(motionEvent.getPointerId(i), false), arrayList2, floatToRawIntBits4, f, motionEvent.getClassification() == 3 ? (Float.floatToRawIntBits(motionEvent.getAxisValue(50, i)) << c) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, i)) & j82) : 0L, j4);
    }

    public final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.activeHoverIds;
        SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
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
}
