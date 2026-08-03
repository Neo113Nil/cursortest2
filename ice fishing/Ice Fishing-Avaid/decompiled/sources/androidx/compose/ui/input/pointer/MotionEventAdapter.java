package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.collection.SieveCacheKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UShort;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MotionEventAdapter.android.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J#\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0014J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010-\u001a\u00020\u0017*\u00020 2\u0006\u0010*\u001a\u00020\u0014H\u0002J\u0017\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0002J7\u00104\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u0017H\u0002¢\u0006\u0002\b8R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "<init>", "()V", "nextId", "", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui$annotations", "getMotionEventToComposePointerIdMap$ui", "()Landroid/util/SparseLongArray;", "activeHoverIds", "Landroid/util/SparseBooleanArray;", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "previousIndirectPointerEventData", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/MotionEventAdapter$IndirectPointerEventData;", "previousToolType", "", "previousSource", "isInFakeFingerGesture", "", "isReinterpretingFakeFingerGesture", "inferredCursorRawOffset", "Landroidx/compose/ui/geometry/Offset;", "resetFakeFingerGesture", "", "convertToPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "motionEvent", "Landroid/view/MotionEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "convertToPointerInputEvent$ui", "convertToIndirectPointerEvent", "Landroidx/compose/ui/input/indirect/AndroidIndirectPointerEvent;", "primaryDirectionalMotionAxisOverride", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "convertToIndirectPointerEvent-k92h6UU$ui", "endStream", "pointerId", "addFreshIds", "removeStaleIds", "hasPointerId", "getComposePointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "motionEventPointerId", "getComposePointerId-_I2yYro", "(I)J", "clearOnDeviceChange", "createPointerInputEventData", "rawPositionOverride", "index", "pressed", "createPointerInputEventData-InuC1xA", "IndirectPointerEventData", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private Offset inferredCursorRawOffset;
    private boolean isInFakeFingerGesture;
    private boolean isReinterpretingFakeFingerGesture;
    private long nextId;
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();
    private final List<PointerInputEventData> pointers = new ArrayList();
    private final LongSparseArray<IndirectPointerEventData> previousIndirectPointerEventData = new LongSparseArray<>(0, 1, null);
    private int previousToolType = -1;
    private int previousSource = -1;

    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui$annotations() {
    }

    /* renamed from: getMotionEventToComposePointerIdMap$ui, reason: from getter */
    public final SparseLongArray getMotionEventToComposePointerIdMap() {
        return this.motionEventToComposePointerIdMap;
    }

    /* compiled from: MotionEventAdapter.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0083@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u001b\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\u0088\u0001\u0002¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter$IndirectPointerEventData;", "", "packedValue", "", "constructor-impl", "(J)J", "uptime", "position", "Landroidx/compose/ui/geometry/Offset;", "down", "", "(JJZ)J", "getPackedValue", "()J", "getDown-impl", "(J)Z", "getUptime-impl", "getPosition-F1C5BW0", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @JvmInline
    private static final class IndirectPointerEventData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long packedValue;

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IndirectPointerEventData m8061boximpl(long j) {
            return new IndirectPointerEventData(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m8062constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m8064equalsimpl(long j, Object obj) {
            return (obj instanceof IndirectPointerEventData) && j == ((IndirectPointerEventData) obj).m8071unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m8065equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* renamed from: getDown-impl, reason: not valid java name */
        public static final boolean m8066getDownimpl(long j) {
            return (j & 1) != 0;
        }

        /* renamed from: getUptime-impl, reason: not valid java name */
        public static final long m8068getUptimeimpl(long j) {
            return (j >> 1) & SieveCacheKt.NodeLinkMask;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m8069hashCodeimpl(long j) {
            return UByte$$ExternalSyntheticBackport0.m(j);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m8070toStringimpl(long j) {
            return "IndirectPointerEventData(packedValue=" + j + ')';
        }

        public boolean equals(Object obj) {
            return m8064equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m8069hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m8070toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m8071unboximpl() {
            return this.packedValue;
        }

        private /* synthetic */ IndirectPointerEventData(long j) {
            this.packedValue = j;
        }

        public final long getPackedValue() {
            return this.packedValue;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m8063constructorimpl(long j, long j2, boolean z) {
            return m8062constructorimpl(((j & SieveCacheKt.NodeLinkMask) << 1) | (z ? 1L : 0L) | (INSTANCE.packShorts((short) Float.intBitsToFloat((int) (j2 >> 32)), (short) Float.intBitsToFloat((int) (j2 & 4294967295L))) << 32));
        }

        /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public static final long m8067getPositionF1C5BW0(long j) {
            int i = (int) (j >>> 32);
            Companion companion = INSTANCE;
            float unpackShort1 = companion.unpackShort1(i);
            float unpackShort2 = companion.unpackShort2(i);
            return Offset.m6511constructorimpl((Float.floatToRawIntBits(unpackShort2) & 4294967295L) | (Float.floatToRawIntBits(unpackShort1) << 32));
        }

        /* compiled from: MotionEventAdapter.android.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter$IndirectPointerEventData$Companion;", "", "<init>", "()V", "packShorts", "", "val1", "", "val2", "unpackShort1", "value", "unpackShort2", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int packShorts(short val1, short val2) {
                return (val1 << 16) | (val2 & UShort.MAX_VALUE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort1(int value) {
                return (short) (value >>> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort2(int value) {
                return (short) (value & SupportMenu.USER_MASK);
            }

            private Companion() {
            }
        }
    }

    private final void resetFakeFingerGesture() {
        this.isInFakeFingerGesture = false;
        this.isReinterpretingFakeFingerGesture = false;
        this.inferredCursorRawOffset = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r6 == 5) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointerInputEvent convertToPointerInputEvent$ui(MotionEvent motionEvent, PositionCalculator positionCalculator) {
        int i;
        MotionEventAdapter motionEventAdapter;
        MotionEvent motionEvent2;
        int classification;
        float rawX;
        float rawY;
        boolean z;
        int classification2;
        int classification3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            resetFakeFingerGesture();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z2 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z2) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        this.pointers.clear();
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && motionEvent.getActionMasked() == 0) {
            if (Build.VERSION.SDK_INT >= 34) {
                classification2 = motionEvent.getClassification();
                if (classification2 != 3) {
                    classification3 = motionEvent.getClassification();
                }
                z = true;
                boolean z4 = motionEvent.getButtonState() != 0 && (motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHPAD));
                if (!z || z4) {
                    this.isInFakeFingerGesture = true;
                }
            }
            z = false;
            if (motionEvent.getButtonState() != 0) {
            }
            if (!z) {
            }
            this.isInFakeFingerGesture = true;
        }
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 34) {
            classification = motionEvent.getClassification();
            if (classification == 3) {
                this.isReinterpretingFakeFingerGesture = true;
                if (motionEvent.getActionMasked() == 0) {
                    rawX = motionEvent.getRawX(0);
                    rawY = motionEvent.getRawY(0);
                    this.inferredCursorRawOffset = Offset.m6508boximpl(Offset.m6511constructorimpl((Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32)));
                }
                motionEvent2 = motionEvent;
                motionEventAdapter = this;
                this.pointers.add(m8058createPointerInputEventDataInuC1xA(positionCalculator, motionEvent2, this.inferredCursorRawOffset, 0, false));
                if (motionEvent2.getActionMasked() == 1) {
                    resetFakeFingerGesture();
                }
                removeStaleIds(motionEvent2);
                return new PointerInputEvent(motionEvent2.getEventTime(), motionEventAdapter.pointers, motionEvent2);
            }
        }
        motionEventAdapter = this;
        MotionEvent motionEvent3 = motionEvent;
        PositionCalculator positionCalculator2 = positionCalculator;
        motionEventAdapter.isReinterpretingFakeFingerGesture = false;
        int pointerCount = motionEvent3.getPointerCount();
        int i2 = 0;
        while (i2 < pointerCount) {
            motionEventAdapter.pointers.add(motionEventAdapter.m8058createPointerInputEventDataInuC1xA(positionCalculator2, motionEvent3, null, i2, (z2 || i2 == i || (z3 && motionEvent3.getButtonState() == 0)) ? false : true));
            i2++;
            motionEvent3 = motionEvent3;
            positionCalculator2 = positionCalculator2;
        }
        motionEvent2 = motionEvent3;
        if (motionEvent2.getActionMasked() == 1) {
        }
        removeStaleIds(motionEvent2);
        return new PointerInputEvent(motionEvent2.getEventTime(), motionEventAdapter.pointers, motionEvent2);
    }

    /* renamed from: convertToIndirectPointerEvent-k92h6UU$ui$default, reason: not valid java name */
    public static /* synthetic */ AndroidIndirectPointerEvent m8057convertToIndirectPointerEventk92h6UU$ui$default(MotionEventAdapter motionEventAdapter, MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis, int i, Object obj) {
        if ((i & 2) != 0) {
            indirectPointerEventPrimaryDirectionalMotionAxis = null;
        }
        return motionEventAdapter.m8060convertToIndirectPointerEventk92h6UU$ui(motionEvent, indirectPointerEventPrimaryDirectionalMotionAxis);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* renamed from: convertToIndirectPointerEvent-k92h6UU$ui, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AndroidIndirectPointerEvent m8060convertToIndirectPointerEventk92h6UU$ui(MotionEvent motionEvent, IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride) {
        int i;
        int indirectPrimaryDirectionalScrollAxis;
        int i2;
        MotionEventAdapter motionEventAdapter = this;
        int actionMasked = motionEvent.getActionMasked();
        clearOnDeviceChange(motionEvent);
        if (actionMasked == 3) {
            motionEventAdapter.motionEventToComposePointerIdMap.clear();
            motionEventAdapter.activeHoverIds.clear();
            return null;
        }
        addFreshIds(motionEvent);
        if (actionMasked != 1) {
            i = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            i = 0;
        }
        boolean z = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
        int pointerCount = motionEvent.getPointerCount();
        ArrayList arrayList = new ArrayList(pointerCount);
        int i3 = 0;
        while (i3 < pointerCount) {
            long m8059getComposePointerId_I2yYro = motionEventAdapter.m8059getComposePointerId_I2yYro(motionEvent.getPointerId(i3));
            float x = motionEvent.getX(i3);
            long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(motionEvent.getY(i3)) & 4294967295L) | (Float.floatToRawIntBits(x) << 32));
            boolean z2 = i3 != i;
            IndirectPointerEventData indirectPointerEventData = motionEventAdapter.previousIndirectPointerEventData.get(m8059getComposePointerId_I2yYro);
            if (i3 == i) {
                motionEventAdapter.previousIndirectPointerEventData.remove(m8059getComposePointerId_I2yYro);
            } else if (z) {
                i2 = actionMasked;
                motionEventAdapter.previousIndirectPointerEventData.put(m8059getComposePointerId_I2yYro, IndirectPointerEventData.m8061boximpl(IndirectPointerEventData.m8063constructorimpl(motionEvent.getEventTime(), m6511constructorimpl, true)));
                arrayList.add(new IndirectPointerInputChange(m8059getComposePointerId_I2yYro, motionEvent.getEventTime(), m6511constructorimpl, z2, motionEvent.getPressure(i3), indirectPointerEventData == null ? IndirectPointerEventData.m8068getUptimeimpl(indirectPointerEventData.m8071unboximpl()) : motionEvent.getEventTime(), indirectPointerEventData == null ? IndirectPointerEventData.m8067getPositionF1C5BW0(indirectPointerEventData.m8071unboximpl()) : m6511constructorimpl, indirectPointerEventData == null ? IndirectPointerEventData.m8066getDownimpl(indirectPointerEventData.m8071unboximpl()) : false, null));
                i3++;
                motionEventAdapter = this;
                actionMasked = i2;
            }
            i2 = actionMasked;
            arrayList.add(new IndirectPointerInputChange(m8059getComposePointerId_I2yYro, motionEvent.getEventTime(), m6511constructorimpl, z2, motionEvent.getPressure(i3), indirectPointerEventData == null ? IndirectPointerEventData.m8068getUptimeimpl(indirectPointerEventData.m8071unboximpl()) : motionEvent.getEventTime(), indirectPointerEventData == null ? IndirectPointerEventData.m8067getPositionF1C5BW0(indirectPointerEventData.m8071unboximpl()) : m6511constructorimpl, indirectPointerEventData == null ? IndirectPointerEventData.m8066getDownimpl(indirectPointerEventData.m8071unboximpl()) : false, null));
            i3++;
            motionEventAdapter = this;
            actionMasked = i2;
        }
        int i4 = actionMasked;
        ArrayList arrayList2 = arrayList;
        removeStaleIds(motionEvent);
        if (primaryDirectionalMotionAxisOverride != null) {
            indirectPrimaryDirectionalScrollAxis = primaryDirectionalMotionAxisOverride.getValue();
        } else {
            indirectPrimaryDirectionalScrollAxis = AndroidIndirectPointerEvent_androidKt.indirectPrimaryDirectionalScrollAxis(motionEvent);
        }
        return new AndroidIndirectPointerEvent(arrayList2, AndroidIndirectPointerEvent_androidKt.convertActionToIndirectPointerEventType(i4), indirectPrimaryDirectionalScrollAxis, motionEvent, null);
    }

    public final void endStream(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j = this.nextId;
                this.nextId = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j2 = this.nextId;
            this.nextId = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(keyAt);
                }
            }
        }
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m8059getComposePointerId_I2yYro(int motionEventPointerId) {
        long j;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (indexOfKey >= 0) {
            j = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            j = this.nextId;
            this.nextId = 1 + j;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, j);
        }
        return PointerId.m8127constructorimpl(j);
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b2 A[EDGE_INSN: B:40:0x01b2->B:41:0x01b2 BREAK  A[LOOP:0: B:18:0x0104->B:36:0x01ac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [long] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* renamed from: createPointerInputEventData-InuC1xA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final PointerInputEventData m8058createPointerInputEventDataInuC1xA(PositionCalculator positionCalculator, MotionEvent motionEvent, Offset rawPositionOverride, int index, boolean pressed) {
        boolean z;
        long j;
        long mo8233localToScreenMKHz9U;
        long j2;
        long mo8234screenToLocalMKHz9U;
        int toolType;
        ?? r18;
        int m8232getUnknownT8wyACA;
        int historySize;
        int i;
        float f;
        long m6535getZeroF1C5BW0;
        long j3;
        long m6535getZeroF1C5BW02;
        int classification;
        int classification2;
        Float f2;
        long m6535getZeroF1C5BW03;
        int classification3;
        long m8059getComposePointerId_I2yYro = m8059getComposePointerId_I2yYro(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(motionEvent.getY(index)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(index)) << 32));
        if (index == 0) {
            if (rawPositionOverride != null) {
                z = 32;
                mo8233localToScreenMKHz9U = rawPositionOverride.m6529unboximpl();
                j = 4294967295L;
            } else {
                z = 32;
                j = 4294967295L;
                mo8233localToScreenMKHz9U = Offset.m6511constructorimpl((Float.floatToRawIntBits(motionEvent.getRawX()) << 32) | (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L));
            }
            mo8234screenToLocalMKHz9U = positionCalculator.mo8234screenToLocalMKHz9U(mo8233localToScreenMKHz9U);
        } else {
            z = 32;
            j = 4294967295L;
            if (Build.VERSION.SDK_INT >= 29) {
                mo8233localToScreenMKHz9U = rawPositionOverride != null ? rawPositionOverride.m6529unboximpl() : MotionEventHelper.INSTANCE.m8072toRawOffsetdBAh8RU(motionEvent, index);
                mo8234screenToLocalMKHz9U = positionCalculator.mo8234screenToLocalMKHz9U(mo8233localToScreenMKHz9U);
            } else {
                mo8233localToScreenMKHz9U = positionCalculator.mo8233localToScreenMKHz9U(m6511constructorimpl);
                j2 = m6511constructorimpl;
                long j4 = mo8233localToScreenMKHz9U;
                toolType = motionEvent.getToolType(index);
                if (toolType == 0) {
                    boolean z2 = z;
                    if (toolType != 1) {
                        if (toolType == 2) {
                            m8232getUnknownT8wyACA = PointerType.INSTANCE.m8230getStylusT8wyACA();
                            r18 = z2;
                        } else if (toolType == 3) {
                            m8232getUnknownT8wyACA = PointerType.INSTANCE.m8229getMouseT8wyACA();
                            r18 = z2;
                        } else if (toolType == 4) {
                            m8232getUnknownT8wyACA = PointerType.INSTANCE.m8228getEraserT8wyACA();
                            r18 = z2;
                        } else {
                            m8232getUnknownT8wyACA = PointerType.INSTANCE.m8232getUnknownT8wyACA();
                            r18 = z2;
                        }
                    } else if (ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
                        if ((motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHPAD)) && (!this.isInFakeFingerGesture || this.isReinterpretingFakeFingerGesture)) {
                            m8232getUnknownT8wyACA = PointerType.INSTANCE.m8229getMouseT8wyACA();
                            r18 = z2;
                        } else {
                            m8232getUnknownT8wyACA = PointerType.INSTANCE.m8231getTouchT8wyACA();
                            r18 = z2;
                        }
                    } else {
                        m8232getUnknownT8wyACA = PointerType.INSTANCE.m8231getTouchT8wyACA();
                        r18 = z2;
                    }
                } else {
                    r18 = z;
                    m8232getUnknownT8wyACA = PointerType.INSTANCE.m8232getUnknownT8wyACA();
                }
                ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                int i2 = m8232getUnknownT8wyACA;
                i = 0;
                while (true) {
                    if (i < historySize) {
                        break;
                    }
                    float historicalX = motionEvent.getHistoricalX(index, i);
                    float historicalY = motionEvent.getHistoricalY(index, i);
                    long j5 = m6511constructorimpl;
                    if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                        long m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(historicalX) << r18) | (Float.floatToRawIntBits(historicalY) & j));
                        long historicalEventTime = motionEvent.getHistoricalEventTime(i);
                        Float valueOf = Float.valueOf(motionEvent.getHistoricalAxisValue(52, index, i));
                        f2 = valueOf.floatValue() > 0.0f ? valueOf : null;
                        float floatValue = f2 != null ? f2.floatValue() : 1.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            classification3 = motionEvent.getClassification();
                            if (classification3 == 3) {
                                m6535getZeroF1C5BW03 = Offset.m6511constructorimpl((Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(50, index, i)) << r18) | (Float.floatToRawIntBits(motionEvent.getHistoricalAxisValue(51, index, i)) & j));
                                arrayList.add(new HistoricalChange(historicalEventTime, m6511constructorimpl2, floatValue, m6535getZeroF1C5BW03, m6511constructorimpl2, (DefaultConstructorMarker) null));
                            }
                        }
                        m6535getZeroF1C5BW03 = Offset.INSTANCE.m6535getZeroF1C5BW0();
                        arrayList.add(new HistoricalChange(historicalEventTime, m6511constructorimpl2, floatValue, m6535getZeroF1C5BW03, m6511constructorimpl2, (DefaultConstructorMarker) null));
                    }
                    i++;
                    m6511constructorimpl = j5;
                }
                long j6 = m6511constructorimpl;
                if (motionEvent.getActionMasked() == 8) {
                    m6535getZeroF1C5BW0 = Offset.INSTANCE.m6535getZeroF1C5BW0();
                } else {
                    m6535getZeroF1C5BW0 = Offset.m6511constructorimpl((Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & j) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << r18));
                }
                if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 29) {
                    classification2 = motionEvent.getClassification();
                    if (classification2 == 5) {
                        Float valueOf2 = Float.valueOf(motionEvent.getAxisValue(52, index));
                        f2 = valueOf2.floatValue() > 0.0f ? valueOf2 : null;
                        if (f2 != null) {
                            f = f2.floatValue();
                        }
                    }
                }
                if (ComposeUiFlags.isTrackpadGestureHandlingEnabled && Build.VERSION.SDK_INT >= 29) {
                    classification = motionEvent.getClassification();
                    if (classification == 3) {
                        j3 = m6535getZeroF1C5BW0;
                        m6535getZeroF1C5BW02 = Offset.m6511constructorimpl((Float.floatToRawIntBits(motionEvent.getAxisValue(50, index)) << r18) | (Float.floatToRawIntBits(motionEvent.getAxisValue(51, index)) & j));
                        return new PointerInputEventData(m8059getComposePointerId_I2yYro, motionEvent.getEventTime(), j4, j2, pressed, pressure, i2, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, j3, f, m6535getZeroF1C5BW02, j6, null);
                    }
                }
                j3 = m6535getZeroF1C5BW0;
                m6535getZeroF1C5BW02 = Offset.INSTANCE.m6535getZeroF1C5BW0();
                return new PointerInputEventData(m8059getComposePointerId_I2yYro, motionEvent.getEventTime(), j4, j2, pressed, pressure, i2, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, j3, f, m6535getZeroF1C5BW02, j6, null);
            }
        }
        j2 = mo8234screenToLocalMKHz9U;
        long j42 = mo8233localToScreenMKHz9U;
        toolType = motionEvent.getToolType(index);
        if (toolType == 0) {
        }
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        historySize = motionEvent.getHistorySize();
        int i22 = m8232getUnknownT8wyACA;
        i = 0;
        while (true) {
            if (i < historySize) {
            }
            i++;
            m6511constructorimpl = j5;
        }
        long j62 = m6511constructorimpl;
        if (motionEvent.getActionMasked() == 8) {
        }
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
            classification2 = motionEvent.getClassification();
            if (classification2 == 5) {
            }
        }
        if (ComposeUiFlags.isTrackpadGestureHandlingEnabled) {
            classification = motionEvent.getClassification();
            if (classification == 3) {
            }
        }
        j3 = m6535getZeroF1C5BW0;
        m6535getZeroF1C5BW02 = Offset.INSTANCE.m6535getZeroF1C5BW0();
        return new PointerInputEventData(m8059getComposePointerId_I2yYro, motionEvent.getEventTime(), j42, j2, pressed, pressure, i22, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList2, j3, f, m6535getZeroF1C5BW02, j62, null);
    }
}
