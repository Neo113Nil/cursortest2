package androidx.compose.ui.contentcapture;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.biometric.BiometricPrompt;
import androidx.camera.video.Recorder;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.glance.layout.SpacerKt$Spacer$3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.RoomDatabase$closeBarrier$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.datadog.android.trace.internal.data.CoreTraceWriter$write$1;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public boolean checkingForSemanticsChanges;
    public final AFLogger$$ExternalSyntheticLambda0 contentCaptureChangeChecker;
    public ContentCaptureSessionWrapper contentCaptureSession;
    public MutableIntObjectMap currentSemanticsNodes;
    public long currentSemanticsNodesSnapshotTimestampMillis;
    public final RoomDatabase$closeBarrier$1 onContentCaptureSession;
    public final MutableIntObjectMap previousSemanticsNodes;
    public SemanticsNodeCopy previousSemanticsRoot;
    public final AndroidComposeView view;
    public final ArrayList bufferedEvents = new ArrayList();
    public final long SendRecurringContentCaptureEventsIntervalMillis = 100;
    public TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    public boolean currentSemanticsNodesInvalidated = true;
    public final BufferedChannel boundsUpdateChannel = PapaEvent.Channel$default(1, null, null, 6);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TranslateStatus {
        public static final /* synthetic */ TranslateStatus[] $VALUES;
        public static final TranslateStatus SHOW_ORIGINAL;
        public static final TranslateStatus SHOW_TRANSLATED;

        static {
            TranslateStatus translateStatus = new TranslateStatus("SHOW_ORIGINAL", 0);
            SHOW_ORIGINAL = translateStatus;
            TranslateStatus translateStatus2 = new TranslateStatus("SHOW_TRANSLATED", 1);
            SHOW_TRANSLATED = translateStatus2;
            $VALUES = new TranslateStatus[]{translateStatus, translateStatus2};
        }

        public static TranslateStatus valueOf(String str) {
            return (TranslateStatus) Enum.valueOf(TranslateStatus.class, str);
        }

        public static TranslateStatus[] values() {
            return (TranslateStatus[]) $VALUES.clone();
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1) {
        this.view = androidComposeView;
        this.onContentCaptureSession = roomDatabase$closeBarrier$1;
        new Handler(Looper.getMainLooper());
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        mutableIntObjectMap.getClass();
        this.currentSemanticsNodes = mutableIntObjectMap;
        this.previousSemanticsNodes = new MutableIntObjectMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.semanticsOwner.getUnmergedRootSemanticsNode(), mutableIntObjectMap);
        this.contentCaptureChangeChecker = new AFLogger$$ExternalSyntheticLambda0(this, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r7.SendRecurringContentCaptureEventsIntervalMillis, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:11:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui(ContinuationImpl continuationImpl) {
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 androidContentCaptureManager$boundsUpdatesEventLoop$1;
        int i;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        if (continuationImpl instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) {
            androidContentCaptureManager$boundsUpdatesEventLoop$1 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) continuationImpl;
            int i2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = this.boundsUpdateChannel;
                    bufferedChannel.getClass();
                    bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                } else if (i == 1) {
                    bufferedChannelIterator = androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    bufferedChannelIterator.next();
                    if (isEnabled$ui()) {
                        notifyContentCaptureChanges();
                    }
                    Handler handler = this.view.getHandler();
                    if (!this.checkingForSemanticsChanges && handler != null) {
                        this.checkingForSemanticsChanges = true;
                        handler.post(this.contentCaptureChangeChecker);
                    }
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = bufferedChannelIterator;
                    androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 2;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bufferedChannelIterator = androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = bufferedChannelIterator;
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
                obj = bufferedChannelIterator.hasNext(androidContentCaptureManager$boundsUpdatesEventLoop$1);
            }
        }
        androidContentCaptureManager$boundsUpdatesEventLoop$1 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, continuationImpl);
        Object obj2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
        if (i != 0) {
        }
        androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = bufferedChannelIterator;
        androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
        obj2 = bufferedChannelIterator.hasNext(androidContentCaptureManager$boundsUpdatesEventLoop$1);
    }

    public final void checkForContentCapturePropertyChanges(MutableIntObjectMap mutableIntObjectMap) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long[] jArr3;
        SemanticsNodeCopy semanticsNodeCopy;
        int i3;
        long[] jArr4;
        SemanticsNodeCopy semanticsNodeCopy2;
        String str;
        long j3;
        String str2;
        int i4;
        MutableIntObjectMap mutableIntObjectMap2 = mutableIntObjectMap;
        int[] iArr3 = mutableIntObjectMap2.keys;
        long[] jArr5 = mutableIntObjectMap2.metadata;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j4 = jArr5[i5];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((j4 & 255) < 128) {
                        int i9 = iArr3[(i5 << 3) + i8];
                        c = c2;
                        SemanticsNodeCopy semanticsNodeCopy3 = (SemanticsNodeCopy) this.previousSemanticsNodes.get(i9);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) mutableIntObjectMap2.get(i9);
                        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode == null) {
                            throw Boxes$$ExternalSyntheticOutline1.m1150m("no value for specified key");
                        }
                        j2 = j5;
                        int i10 = semanticsNode.id;
                        MutableScatterMap mutableScatterMap = semanticsNode.unmergedConfig.props;
                        String str3 = "Invalid content capture ID";
                        if (semanticsNodeCopy3 == null) {
                            Object[] objArr = mutableScatterMap.keys;
                            long[] jArr6 = mutableScatterMap.metadata;
                            int i11 = i6;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j6 = jArr6[i12];
                                    j = j4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j6 & 255) < 128) {
                                                j3 = j6;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i12 << 3) + i14];
                                                SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.Text;
                                                if (Intrinsics.areEqual(semanticsPropertyKey, semanticsPropertyKey2)) {
                                                    Object obj = mutableScatterMap.get(semanticsPropertyKey2);
                                                    if (obj == null) {
                                                        obj = null;
                                                    }
                                                    List list = (List) obj;
                                                    String valueOf = String.valueOf(list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null);
                                                    ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
                                                    if (contentCaptureSessionWrapper != null) {
                                                        str2 = str3;
                                                        i4 = i8;
                                                        Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) contentCaptureSessionWrapper;
                                                        AutofillId newAutofillId = anonymousClass4.newAutofillId(i10);
                                                        if (newAutofillId == null) {
                                                            throw Boxes$$ExternalSyntheticOutline1.m1150m(str2);
                                                        }
                                                        anonymousClass4.notifyViewTextChanged(newAutofillId, valueOf);
                                                        j6 = j3 >> i11;
                                                        i14++;
                                                        i8 = i4;
                                                        str3 = str2;
                                                    }
                                                }
                                            } else {
                                                j3 = j6;
                                            }
                                            str2 = str3;
                                            i4 = i8;
                                            j6 = j3 >> i11;
                                            i14++;
                                            i8 = i4;
                                            str3 = str2;
                                        }
                                        str = str3;
                                        i = i8;
                                        if (i13 != i11) {
                                            break;
                                        }
                                    } else {
                                        str = str3;
                                        i = i8;
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                    j4 = j;
                                    i8 = i;
                                    str3 = str;
                                    i11 = 8;
                                }
                            } else {
                                j = j4;
                                i = i8;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j = j4;
                            i = i8;
                            Object[] objArr2 = mutableScatterMap.keys;
                            long[] jArr7 = mutableScatterMap.metadata;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j7 = jArr7[i15];
                                    Object[] objArr3 = objArr2;
                                    long[] jArr8 = jArr7;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j7 & 255) < 128) {
                                                SemanticsPropertyKey semanticsPropertyKey3 = (SemanticsPropertyKey) objArr3[(i15 << 3) + i17];
                                                i3 = i17;
                                                SemanticsPropertyKey semanticsPropertyKey4 = SemanticsProperties.Text;
                                                if (Intrinsics.areEqual(semanticsPropertyKey3, semanticsPropertyKey4)) {
                                                    Object obj2 = semanticsNodeCopy3.unmergedConfig.props.get(semanticsPropertyKey4);
                                                    if (obj2 == null) {
                                                        obj2 = null;
                                                    }
                                                    List list2 = (List) obj2;
                                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list2) : null;
                                                    Object obj3 = mutableScatterMap.get(semanticsPropertyKey4);
                                                    if (obj3 == null) {
                                                        obj3 = null;
                                                    }
                                                    List list3 = (List) obj3;
                                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list3) : null;
                                                    if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                                        String valueOf2 = String.valueOf(annotatedString2);
                                                        ContentCaptureSessionWrapper contentCaptureSessionWrapper2 = this.contentCaptureSession;
                                                        if (contentCaptureSessionWrapper2 != null) {
                                                            jArr4 = jArr8;
                                                            semanticsNodeCopy2 = semanticsNodeCopy3;
                                                            Recorder.AnonymousClass4 anonymousClass42 = (Recorder.AnonymousClass4) contentCaptureSessionWrapper2;
                                                            AutofillId newAutofillId2 = anonymousClass42.newAutofillId(i10);
                                                            if (newAutofillId2 == null) {
                                                                throw Boxes$$ExternalSyntheticOutline1.m1150m("Invalid content capture ID");
                                                            }
                                                            anonymousClass42.notifyViewTextChanged(newAutofillId2, valueOf2);
                                                            j7 >>= 8;
                                                            i17 = i3 + 1;
                                                            semanticsNodeCopy3 = semanticsNodeCopy2;
                                                            jArr8 = jArr4;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i3 = i17;
                                            }
                                            jArr4 = jArr8;
                                            semanticsNodeCopy2 = semanticsNodeCopy3;
                                            j7 >>= 8;
                                            i17 = i3 + 1;
                                            semanticsNodeCopy3 = semanticsNodeCopy2;
                                            jArr8 = jArr4;
                                        }
                                        jArr3 = jArr8;
                                        semanticsNodeCopy = semanticsNodeCopy3;
                                        if (i16 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr8;
                                        semanticsNodeCopy = semanticsNodeCopy3;
                                    }
                                    if (i15 == length3) {
                                        break;
                                    }
                                    i15++;
                                    objArr2 = objArr3;
                                    semanticsNodeCopy3 = semanticsNodeCopy;
                                    jArr7 = jArr3;
                                }
                            }
                        }
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i8;
                        i2 = i6;
                    }
                    j4 = j >> i2;
                    i8 = i + 1;
                    mutableIntObjectMap2 = mutableIntObjectMap;
                    i6 = i2;
                    c2 = c;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr5;
                if (i7 != i6) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            mutableIntObjectMap2 = mutableIntObjectMap;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    public final void fastForEachReplacedVisibleChildren(SemanticsNode semanticsNode, Function2 function2) {
        semanticsNode.getClass();
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
        int size = children$ui$default.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = children$ui$default.get(i2);
            if (getCurrentSemanticsNodes$ui().containsKey(((SemanticsNode) obj).id)) {
                function2.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final MutableIntObjectMap getCurrentSemanticsNodes$ui() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.semanticsOwner, AndroidContentCaptureManager$currentSemanticsNodes$1.INSTANCE);
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final boolean isEnabled$ui() {
        return this.contentCaptureSession != null;
    }

    public final void notifyContentCaptureChanges() {
        ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
        if (contentCaptureSessionWrapper == null) {
            return;
        }
        ArrayList arrayList = this.bufferedEvents;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) arrayList.get(i);
            int ordinal = contentCaptureEvent.getType().ordinal();
            if (ordinal == 0) {
                BiometricPrompt structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    ((Recorder.AnonymousClass4) contentCaptureSessionWrapper).notifyViewAppeared(structureCompat.toViewStructure());
                }
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) contentCaptureSessionWrapper;
                AutofillId newAutofillId = anonymousClass4.newAutofillId(contentCaptureEvent.getId());
                if (newAutofillId != null) {
                    anonymousClass4.notifyViewDisappeared(newAutofillId);
                }
            }
        }
        ((Recorder.AnonymousClass4) contentCaptureSessionWrapper).flush();
        arrayList.clear();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.contentCaptureSession = (ContentCaptureSessionWrapper) this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(-1, this.view.semanticsOwner.getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        updateBuffersOnDisappeared(this.view.semanticsOwner.getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.view.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void sendContentCaptureAppearEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        fastForEachReplacedVisibleChildren(semanticsNode, new CoreTraceWriter$write$1(1, semanticsNodeCopy, this));
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) children$ui$default.get(i);
            MutableIntObjectMap currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
            int i2 = semanticsNode2.id;
            if (currentSemanticsNodes$ui.containsKey(i2)) {
                MutableIntObjectMap mutableIntObjectMap = this.previousSemanticsNodes;
                if (mutableIntObjectMap.containsKey(i2)) {
                    Object obj = mutableIntObjectMap.get(i2);
                    if (obj == null) {
                        throw Boxes$$ExternalSyntheticOutline1.m1150m("node not present in pruned tree before this change");
                    }
                    sendContentCaptureAppearEvents(semanticsNode2, (SemanticsNodeCopy) obj);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateBuffersOnAppeared(int i, SemanticsNode semanticsNode) {
        Function1 function1;
        Rect rect;
        BiometricPrompt biometricPrompt;
        String m3425toLegacyClassNameV4PA4sw;
        Function1 function12;
        if (isEnabled$ui()) {
            MutableScatterMap mutableScatterMap = semanticsNode.unmergedConfig.props;
            Object obj = mutableScatterMap.get(SemanticsProperties.IsShowingTextSubstitution);
            if (obj == null) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.areEqual(bool, Boolean.TRUE)) {
                Object obj2 = mutableScatterMap.get(SemanticsActions.ShowTextSubstitution);
                if (obj2 == null) {
                    obj2 = null;
                }
                AccessibilityAction accessibilityAction = (AccessibilityAction) obj2;
                if (accessibilityAction != null && (function12 = (Function1) accessibilityAction.action) != null) {
                }
            } else if (this.translateStatus == TranslateStatus.SHOW_TRANSLATED && Intrinsics.areEqual(bool, Boolean.FALSE)) {
                Object obj3 = mutableScatterMap.get(SemanticsActions.ShowTextSubstitution);
                if (obj3 == null) {
                    obj3 = null;
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj3;
                if (accessibilityAction2 != null && (function1 = (Function1) accessibilityAction2.action) != null) {
                }
            }
            int i2 = semanticsNode.id;
            ContentCaptureSessionWrapper contentCaptureSessionWrapper = this.contentCaptureSession;
            if (contentCaptureSessionWrapper != null) {
                AutofillId autofillId = this.view.getAutofillId();
                SemanticsNode parent = semanticsNode.getParent();
                int i3 = semanticsNode.id;
                if (parent != null) {
                    autofillId = ((Recorder.AnonymousClass4) contentCaptureSessionWrapper).newAutofillId(parent.id);
                }
                BiometricPrompt newVirtualViewStructure = ((Recorder.AnonymousClass4) contentCaptureSessionWrapper).newVirtualViewStructure(autofillId, i3);
                SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.Password;
                MutableScatterMap mutableScatterMap2 = semanticsConfiguration.props;
                if (!mutableScatterMap2.containsKey(semanticsPropertyKey)) {
                    Bundle extras = newVirtualViewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                    }
                    Object obj4 = mutableScatterMap2.get(SemanticsProperties.TestTag);
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    String str = (String) obj4;
                    if (str != null) {
                        newVirtualViewStructure.setId(i3, str);
                    }
                    Object obj5 = mutableScatterMap2.get(SemanticsProperties.IsTraversalGroup);
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    if (((Boolean) obj5) != null) {
                        newVirtualViewStructure.setClassName("android.widget.ViewGroup");
                    }
                    Object obj6 = mutableScatterMap2.get(SemanticsProperties.Text);
                    if (obj6 == null) {
                        obj6 = null;
                    }
                    List list = (List) obj6;
                    if (list != null) {
                        newVirtualViewStructure.setClassName("android.widget.TextView");
                        newVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(62, "\n", list, null));
                    }
                    Object obj7 = mutableScatterMap2.get(SemanticsProperties.EditableText);
                    if (obj7 == null) {
                        obj7 = null;
                    }
                    AnnotatedString annotatedString = (AnnotatedString) obj7;
                    if (annotatedString != null) {
                        newVirtualViewStructure.setClassName("android.widget.EditText");
                        newVirtualViewStructure.setText(annotatedString);
                    }
                    Object obj8 = mutableScatterMap2.get(SemanticsProperties.ContentDescription);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    List list2 = (List) obj8;
                    if (list2 != null) {
                        newVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(62, "\n", list2, null));
                    }
                    Object obj9 = mutableScatterMap2.get(SemanticsProperties.Role);
                    if (obj9 == null) {
                        obj9 = null;
                    }
                    Role role = (Role) obj9;
                    if (role != null && (m3425toLegacyClassNameV4PA4sw = ArcadeThemeKt.m3425toLegacyClassNameV4PA4sw(role.value)) != null) {
                        newVirtualViewStructure.setClassName(m3425toLegacyClassNameV4PA4sw);
                    }
                    TextLayoutResult textLayoutResult = ArcadeThemeKt.getTextLayoutResult(semanticsConfiguration);
                    if (textLayoutResult != null) {
                        TextLayoutInput textLayoutInput = textLayoutResult.layoutInput;
                        TextStyle textStyle = textLayoutInput.style;
                        Density density = textLayoutInput.density;
                        newVirtualViewStructure.setTextStyle(density.getFontScale() * density.getDensity() * TextUnit.m1059getValueimpl(textStyle.spanStyle.fontSize));
                    }
                    NodeCoordinator findCoordinatorToGetBounds$ui = semanticsNode.findCoordinatorToGetBounds$ui();
                    if (findCoordinatorToGetBounds$ui != null) {
                        NodeCoordinator nodeCoordinator = findCoordinatorToGetBounds$ui.isAttached() ? findCoordinatorToGetBounds$ui : null;
                        if (nodeCoordinator != null) {
                            rect = semanticsNode.boundsInImportantForBoundsAncestor(nodeCoordinator);
                            float f = rect.left;
                            float f2 = rect.top;
                            newVirtualViewStructure.setDimens((int) f, (int) f2, (int) (rect.right - f), (int) (rect.bottom - f2));
                            biometricPrompt = newVirtualViewStructure;
                            if (biometricPrompt != null) {
                                this.bufferedEvents.add(new ContentCaptureEvent(i2, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, biometricPrompt));
                            }
                            fastForEachReplacedVisibleChildren(semanticsNode, new SpacerKt$Spacer$3(this, 2));
                        }
                    }
                    rect = Rect.Zero;
                    float f3 = rect.left;
                    float f22 = rect.top;
                    newVirtualViewStructure.setDimens((int) f3, (int) f22, (int) (rect.right - f3), (int) (rect.bottom - f22));
                    biometricPrompt = newVirtualViewStructure;
                    if (biometricPrompt != null) {
                    }
                    fastForEachReplacedVisibleChildren(semanticsNode, new SpacerKt$Spacer$3(this, 2));
                }
            }
            biometricPrompt = null;
            if (biometricPrompt != null) {
            }
            fastForEachReplacedVisibleChildren(semanticsNode, new SpacerKt$Spacer$3(this, 2));
        }
    }

    public final void updateBuffersOnDisappeared(SemanticsNode semanticsNode) {
        if (isEnabled$ui()) {
            this.bufferedEvents.add(new ContentCaptureEvent(semanticsNode.id, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
            List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, 4);
            int size = children$ui$default.size();
            for (int i = 0; i < size; i++) {
                updateBuffersOnDisappeared((SemanticsNode) children$ui$default.get(i));
            }
        }
    }

    public final void updateSemanticsCopy() {
        MutableIntObjectMap mutableIntObjectMap = this.previousSemanticsNodes;
        mutableIntObjectMap.clear();
        MutableIntObjectMap currentSemanticsNodes$ui = getCurrentSemanticsNodes$ui();
        int[] iArr = currentSemanticsNodes$ui.keys;
        Object[] objArr = currentSemanticsNodes$ui.values;
        long[] jArr = currentSemanticsNodes$ui.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            mutableIntObjectMap.set(iArr[i4], new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) objArr[i4]).getSemanticsNode(), getCurrentSemanticsNodes$ui()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.semanticsOwner.getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes$ui());
    }
}
