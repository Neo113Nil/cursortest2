package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.StandaloneCoroutine;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes.dex */
public final class CombinedClickableNode extends AbstractClickableNode {
    public final MutableLongObjectMap doubleKeyClickStates;
    public PointerInputChange downEvent;
    public long firstTapUpTime;
    public boolean hapticFeedbackEnabled;
    public boolean ignoreNextUp;
    public IndirectPointerInputChange indirectDownEvent;
    public long indirectFirstTapUpTime;
    public boolean indirectIgnoreNextUp;
    public boolean indirectIsSecondTap;
    public StandaloneCoroutine indirectLongPressJob;
    public boolean indirectLongPressTriggered;
    public StandaloneCoroutine indirectTapJob;
    public boolean isSecondTap;
    public final MutableLongObjectMap longKeyPressJobs;
    public StandaloneCoroutine longPressJob;
    public boolean longPressTriggered;
    public Function0 onLongClick;
    public String onLongClickLabel;
    public StandaloneCoroutine tapJob;

    /* loaded from: classes3.dex */
    public abstract class DoubleKeyClickState {
        public abstract boolean getDoubleTapMinTimeMillisElapsed();

        public abstract Job getJob();
    }

    public CombinedClickableNode(IndicationNodeFactory indicationNodeFactory, MutableInteractionSourceImpl mutableInteractionSourceImpl, Role role, String str, String str2, Function0 function0, Function0 function02, boolean z, boolean z2) {
        super(mutableInteractionSourceImpl, indicationNodeFactory, z, z2, str2, role, function0);
        this.onLongClickLabel = str;
        this.onLongClick = function02;
        this.hapticFeedbackEnabled = true;
        MutableLongObjectMap mutableLongObjectMap = LongObjectMapKt.EmptyLongObjectMap;
        this.longKeyPressJobs = new MutableLongObjectMap();
        this.doubleKeyClickStates = new MutableLongObjectMap();
        this.firstTapUpTime = -1L;
        this.indirectFirstTapUpTime = -1L;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            String str = this.onLongClickLabel;
            ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1 = new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 2);
            KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
            semanticsPropertyReceiver.set(SemanticsActions.OnLongClick, new AccessibilityAction(str, imageLoader$Builder$$ExternalSyntheticLambda1));
        }
    }

    public final void cancelInput$1(boolean z) {
        if (z) {
            this.indirectDownEvent = null;
            StandaloneCoroutine standaloneCoroutine = this.indirectLongPressJob;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            this.indirectLongPressJob = null;
            StandaloneCoroutine standaloneCoroutine2 = this.indirectTapJob;
            if (standaloneCoroutine2 != null) {
                standaloneCoroutine2.cancel(null);
            }
            this.indirectTapJob = null;
            this.indirectIsSecondTap = false;
            this.indirectLongPressTriggered = false;
            this.indirectFirstTapUpTime = -1L;
            this.indirectIgnoreNextUp = false;
        } else {
            this.downEvent = null;
            StandaloneCoroutine standaloneCoroutine3 = this.longPressJob;
            if (standaloneCoroutine3 != null) {
                standaloneCoroutine3.cancel(null);
            }
            this.longPressJob = null;
            StandaloneCoroutine standaloneCoroutine4 = this.tapJob;
            if (standaloneCoroutine4 != null) {
                standaloneCoroutine4.cancel(null);
            }
            this.tapJob = null;
            this.isSecondTap = false;
            this.longPressTriggered = false;
            this.firstTapUpTime = -1L;
            this.ignoreNextUp = false;
        }
        handlePressInteractionCancel(z);
    }

    public final void handleUpEvent(long j, IndirectPointerInputChange indirectPointerInputChange) {
        if (this.enabled && !this.indirectIgnoreNextUp) {
            m158handlePressInteractionRelease3MmeM6k(indirectPointerInputChange.m770getPositionF1C5BW0(), true);
            this.indirectFirstTapUpTime = j;
            if (!this.indirectLongPressTriggered && !this.indirectIsSecondTap) {
                this.onClick.invoke();
            }
        }
        this.indirectDownEvent = null;
        this.indirectIgnoreNextUp = false;
        this.indirectIsSecondTap = false;
        StandaloneCoroutine standaloneCoroutine = this.indirectLongPressJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.indirectLongPressJob = null;
        this.indirectLongPressTriggered = false;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onCancelIndirectPointerInput() {
        cancelInput$1(true);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void onCancelKeyInput() {
        resetKeyPressState();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        super.onCancelPointerInput();
        cancelInput$1(false);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo159onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        boolean z;
        long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
        if (this.onLongClick != null) {
            MutableLongObjectMap mutableLongObjectMap = this.longKeyPressJobs;
            if (mutableLongObjectMap.get(m782getKeyZmokQxo) == null) {
                mutableLongObjectMap.set(JobKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null, 2), 3), m782getKeyZmokQxo);
                z = true;
                return z;
            }
        }
        z = false;
        return z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final void mo160onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
        MutableLongObjectMap mutableLongObjectMap = this.longKeyPressJobs;
        boolean z = false;
        if (mutableLongObjectMap.get(m782getKeyZmokQxo) != null) {
            Job job = (Job) mutableLongObjectMap.get(m782getKeyZmokQxo);
            if (job != null) {
                if (job.isActive()) {
                    job.cancel(null);
                } else {
                    z = true;
                }
            }
            mutableLongObjectMap.remove(m782getKeyZmokQxo);
        }
        if (z) {
            return;
        }
        this.onClick.invoke();
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public final void onIndirectPointerEvent(HuffmanTreeGroup huffmanTreeGroup, PointerEventPass pointerEventPass) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && this.gestureNode == null) {
            GestureNode gestureNode = CanvasKt.gestureNode(this);
            delegate(gestureNode);
            this.gestureNode = gestureNode;
        }
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.indirectDownEvent == null || this.indirectLongPressTriggered) {
                return;
            }
            List changes = huffmanTreeGroup.getChanges();
            int size = changes.size();
            while (i < size) {
                IndirectPointerInputChange indirectPointerInputChange = (IndirectPointerInputChange) ((ArrayList) changes).get(i);
                if (indirectPointerInputChange.isConsumed() && indirectPointerInputChange != this.indirectDownEvent) {
                    cancelInput$1(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List changes2 = huffmanTreeGroup.getChanges();
            int size2 = changes2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (Draggable2DKt.changedToDownIgnoreConsumed((IndirectPointerInputChange) ((ArrayList) changes2).get(i2))) {
                    IndirectPointerInputChange indirectPointerInputChange2 = (IndirectPointerInputChange) ((ArrayList) huffmanTreeGroup.getChanges()).get(0);
                    indirectPointerInputChange2.consume();
                    this.indirectDownEvent = indirectPointerInputChange2;
                    if (this.enabled) {
                        StandaloneCoroutine standaloneCoroutine = this.indirectTapJob;
                        if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                            ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).getClass();
                            if (indirectPointerInputChange2.getUptimeMillis() - this.indirectFirstTapUpTime < 40) {
                                this.indirectIgnoreNextUp = true;
                                return;
                            }
                            this.indirectIsSecondTap = true;
                            StandaloneCoroutine standaloneCoroutine2 = this.indirectTapJob;
                            if (standaloneCoroutine2 != null) {
                                standaloneCoroutine2.cancel(null);
                            }
                            this.indirectTapJob = null;
                        }
                        this.indirectLongPressTriggered = false;
                        handlePressInteractionStart(indirectPointerInputChange2);
                        if (this.onLongClick != null) {
                            this.indirectLongPressJob = JobKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null, 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.indirectLongPressTriggered) {
            List changes3 = huffmanTreeGroup.getChanges();
            int size3 = changes3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                IndirectPointerInputChange indirectPointerInputChange3 = (IndirectPointerInputChange) ((ArrayList) changes3).get(i3);
                if (!indirectPointerInputChange3.getPreviousPressed() || indirectPointerInputChange3.getPressed()) {
                    List changes4 = huffmanTreeGroup.getChanges();
                    int size4 = changes4.size();
                    while (i < size4) {
                        ((IndirectPointerInputChange) ((ArrayList) changes4).get(i)).consume();
                        i++;
                    }
                    return;
                }
            }
            IndirectPointerInputChange indirectPointerInputChange4 = (IndirectPointerInputChange) ((ArrayList) huffmanTreeGroup.getChanges()).get(0);
            indirectPointerInputChange4.consume();
            long uptimeMillis = indirectPointerInputChange4.getUptimeMillis();
            IndirectPointerInputChange indirectPointerInputChange5 = this.indirectDownEvent;
            indirectPointerInputChange5.getClass();
            handleUpEvent(uptimeMillis, indirectPointerInputChange5);
            return;
        }
        List changes5 = huffmanTreeGroup.getChanges();
        int size5 = changes5.size();
        for (int i4 = 0; i4 < size5; i4++) {
            IndirectPointerInputChange indirectPointerInputChange6 = (IndirectPointerInputChange) ((ArrayList) changes5).get(i4);
            if (indirectPointerInputChange6.isConsumed() || !indirectPointerInputChange6.getPreviousPressed() || indirectPointerInputChange6.getPressed()) {
                float touchSlop = ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).getTouchSlop();
                List changes6 = huffmanTreeGroup.getChanges();
                int size6 = changes6.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    IndirectPointerInputChange indirectPointerInputChange7 = (IndirectPointerInputChange) ((ArrayList) changes6).get(i5);
                    long m770getPositionF1C5BW0 = indirectPointerInputChange7.m770getPositionF1C5BW0();
                    IndirectPointerInputChange indirectPointerInputChange8 = this.indirectDownEvent;
                    indirectPointerInputChange8.getClass();
                    boolean z = Math.abs(Offset.m623getDistanceimpl(Offset.m625minusMKHz9U(m770getPositionF1C5BW0, indirectPointerInputChange8.m770getPositionF1C5BW0()))) > touchSlop;
                    if (indirectPointerInputChange7.isConsumed() || z) {
                        cancelInput$1(true);
                        return;
                    }
                }
                return;
            }
        }
        IndirectPointerInputChange indirectPointerInputChange9 = (IndirectPointerInputChange) ((ArrayList) huffmanTreeGroup.getChanges()).get(0);
        indirectPointerInputChange9.consume();
        long uptimeMillis2 = indirectPointerInputChange9.getUptimeMillis();
        IndirectPointerInputChange indirectPointerInputChange10 = this.indirectDownEvent;
        indirectPointerInputChange10.getClass();
        handleUpEvent(uptimeMillis2, indirectPointerInputChange10);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo162onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        boolean isChangedToDown;
        super.mo162onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.downEvent == null || this.longPressTriggered) {
                return;
            }
            List list = pointerEvent.changes;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
                if (pointerInputChange.isConsumed() && pointerInputChange != this.downEvent) {
                    cancelInput$1(false);
                    return;
                }
            }
            return;
        }
        if (this.downEvent == null) {
            isChangedToDown = TapGestureDetectorKt.isChangedToDown(pointerEvent, true, false);
            if (isChangedToDown) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) pointerEvent.changes.get(0);
                pointerInputChange2.consume();
                this.downEvent = pointerInputChange2;
                if (this.enabled) {
                    StandaloneCoroutine standaloneCoroutine = this.tapJob;
                    if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                        ((ViewConfiguration) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalViewConfiguration)).getClass();
                        if (pointerInputChange2.getUptimeMillis() - this.firstTapUpTime < 40) {
                            this.ignoreNextUp = true;
                            return;
                        }
                        this.isSecondTap = true;
                        StandaloneCoroutine standaloneCoroutine2 = this.tapJob;
                        if (standaloneCoroutine2 != null) {
                            standaloneCoroutine2.cancel(null);
                        }
                        this.tapJob = null;
                    }
                    this.longPressTriggered = false;
                    handlePressInteractionStart(pointerInputChange2);
                    if (this.onLongClick != null) {
                        this.longPressJob = JobKt.launch$default(getCoroutineScope(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null, 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean isDeepPress = Draggable2DKt.isDeepPress(pointerEvent);
        List list2 = pointerEvent.changes;
        if (isDeepPress && !this.longPressTriggered && this.enabled && this.onLongClick != null) {
            StandaloneCoroutine standaloneCoroutine3 = this.longPressJob;
            if (standaloneCoroutine3 != null) {
                standaloneCoroutine3.cancel(null);
            }
            this.longPressJob = null;
            Function0 function0 = this.onLongClick;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.hapticFeedbackEnabled) {
                ((PlatformHapticFeedback) DepthSortedSetKt.currentValueOf(this, CompositionLocalsKt.LocalHapticFeedback)).m769performHapticFeedbackCdsT49E(0);
            }
            this.longPressTriggered = true;
        }
        if (this.longPressTriggered) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((PointerInputChange) list2.get(i3)).consume();
                    }
                    return;
                }
            }
            PointerInputChange pointerInputChange3 = (PointerInputChange) list2.get(0);
            pointerInputChange3.consume();
            long uptimeMillis = pointerInputChange3.getUptimeMillis();
            PointerInputChange pointerInputChange4 = this.downEvent;
            pointerInputChange4.getClass();
            handleUpEvent(uptimeMillis, pointerInputChange4);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!PointerEventKt.changedToUp((PointerInputChange) list2.get(i4))) {
                long m157getExtendedTouchPaddinghWWAJMo = m157getExtendedTouchPaddinghWWAJMo(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    PointerInputChange pointerInputChange5 = (PointerInputChange) list2.get(i5);
                    if (pointerInputChange5.isConsumed() || PointerEventKt.m807isOutOfBoundsjwHxaWs(pointerInputChange5, j, m157getExtendedTouchPaddinghWWAJMo)) {
                        cancelInput$1(false);
                        return;
                    }
                }
                return;
            }
        }
        PointerInputChange pointerInputChange6 = (PointerInputChange) list2.get(0);
        pointerInputChange6.consume();
        long uptimeMillis2 = pointerInputChange6.getUptimeMillis();
        PointerInputChange pointerInputChange7 = this.downEvent;
        pointerInputChange7.getClass();
        handleUpEvent(uptimeMillis2, pointerInputChange7);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    public final void resetKeyPressState() {
        char c;
        long j;
        long j2;
        char c2;
        MutableLongObjectMap mutableLongObjectMap = this.longKeyPressJobs;
        Object[] objArr = mutableLongObjectMap.values;
        long[] jArr = mutableLongObjectMap.metadata;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((Job) objArr[(i << 3) + i3]).cancel(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        mutableLongObjectMap.clear();
        MutableLongObjectMap mutableLongObjectMap2 = this.doubleKeyClickStates;
        Object[] objArr2 = mutableLongObjectMap2.values;
        long[] jArr2 = mutableLongObjectMap2.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((JobSupport) ((DoubleKeyClickState) objArr2[(i4 << 3) + i6]).getJob()).cancel(null);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        mutableLongObjectMap2.clear();
    }

    public final void handleUpEvent(long j, PointerInputChange pointerInputChange) {
        if (this.enabled && !this.ignoreNextUp) {
            m158handlePressInteractionRelease3MmeM6k(pointerInputChange.m816getPositionF1C5BW0(), false);
            this.firstTapUpTime = j;
            if (!this.longPressTriggered && !this.isSecondTap) {
                this.onClick.invoke();
            }
        }
        this.downEvent = null;
        this.ignoreNextUp = false;
        this.isSecondTap = false;
        StandaloneCoroutine standaloneCoroutine = this.longPressJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.longPressJob = null;
        this.longPressTriggered = false;
    }
}
