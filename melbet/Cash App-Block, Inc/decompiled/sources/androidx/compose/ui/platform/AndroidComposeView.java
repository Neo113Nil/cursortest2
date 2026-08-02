package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder;
import androidx.collection.IntObjectMapKt;
import androidx.collection.LongSparseArray;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.ManagedRetainedValuesStore;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.retain.impl.PreconditionsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex$Session;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.AutofillApi26Helper;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draw.PainterNode$measure$1;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusPropertiesImpl;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.HitPathTracker;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.InsetsListener;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.RootForTest$UncaughtExceptionHandler;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView.RootModifierNode;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.NullableInputConnectionWrapperApi25;
import androidx.compose.ui.text.input.NullableInputConnectionWrapperApi34;
import androidx.compose.ui.text.input.RecordingInputConnection;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.core.view.DisplayCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.datastore.core.SimpleActor;
import androidx.emoji2.text.EmojiCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$NewInstanceFactory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.work.impl.StartStopTokensImpl;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.ImageLoader$Builder;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import coil3.util.AndroidSystemCallbacks;
import com.bugsnag.android.Client;
import com.datadog.android.Datadog$getInstance$1$1;
import com.google.android.gms.common.api.internal.zacn;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaet;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.contour.ContourLayout$geometry$1;
import com.squareup.contour.ContourLayout$matchParentX$1;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import curtains.WindowsKt$onNextDraw$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.JobKt;
import okio.FileMetadata;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import papa.Handlers$$ExternalSyntheticLambda2;
import papa.SafeTrace;
import papa.internal.Perfs$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, FocusListener {
    public static Method addChangeCallbackMethod;
    public static final MutableObjectList composeViews = new MutableObjectList();
    public static Method dispatchOnScrollChangedMethod;
    public static Method getBooleanMethod;
    public static Perfs$$ExternalSyntheticLambda0 systemPropertiesChangedRunnable;
    public static Class systemPropertiesClass;
    public AndroidViewsHandler _androidViewsHandler;
    public final SimpleActor _autofill;
    public final AndroidAutofillManager _autofillManager;
    public final ParcelableSnapshotMutableState _composeViewContext$delegate;
    public final InputModeManagerImpl _inputModeManager;
    public TextInputServiceAndroid _legacyTextInputServiceAndroid;
    public View _rootView;
    public DelegatingSoftwareKeyboardController _softwareKeyboardController;
    public TextInputService _textInputService;
    public final ParcelableSnapshotMutableState _viewTreeOwners$delegate;
    public final LazyWindowInfo _windowInfo;
    public final AndroidAccessibilityManager accessibilityManager;
    public final StartStopTokensImpl autofillTree;
    public final MemoryCacheService canvasHolder;
    public final AndroidClipboard clipboard;
    public final AndroidClipboardManager clipboardManager;
    public final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    public boolean composeViewContextIncrementedDuringInit;
    public final ParcelableSnapshotMutableState configuration$delegate;
    public AndroidContentCaptureManager contentCaptureManager;
    public CoroutineContext coroutineContext;
    public float currentFrameRate;
    public float currentFrameRateCategory;
    public final ParcelableSnapshotMutableState density$delegate;
    public final DerivedSnapshotState derivedIsAttached$delegate;
    public final MutableObjectList dirtyLayers;
    public final AndroidDragAndDropManager dragAndDropManager;
    public final MutableObjectList endApplyChangesListeners;
    public final FocusOwnerImpl focusOwner;
    public final MutableState fontFamilyResolver$delegate;
    public final AndroidFontResourceLoader fontLoader;
    public boolean forceUseMatrixCache;
    public LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler;
    public final View frameRateCategoryView;
    public long globalPosition;
    public final AndroidGraphicsContext graphicsContext;
    public final PlatformHapticFeedback hapticFeedBack;
    public boolean hoverExitReceived;
    public final zacn indirectPointerNavigationGestureDetector;
    public final InsetsListener insetsListener;
    public final ParcelableSnapshotMutableState isAttached$delegate;
    public boolean isDrawingContent;
    public boolean isPendingInteropViewLayoutChangeDispatch;
    public boolean keyboardModifiersRequireUpdate;
    public long lastDownPointerPosition;
    public long lastMatrixRecalculationAnimationTime;
    public final WorkLauncherImpl layerCache;
    public final ParcelableSnapshotMutableState layoutDirection$delegate;
    public final MutableIntObjectMap layoutNodes;
    public LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry lifecycleRetainedValuesStoreOwnerEntry;
    public final DerivedSnapshotState localeList$delegate;
    public final CalculateMatrixToWindowApi29 matrixToWindow;
    public final FileMetadata measureAndLayoutDelegate;
    public final MotionEventAdapter motionEventAdapter;
    public boolean observationClearRequested;
    public Constraints onMeasureConstraints;
    public Function1 onReadyForComposition;
    public final ArrayDeque outOfFrameQueue;
    public final AndroidComposeView$$ExternalSyntheticLambda0 outOfFrameRunnable;
    public final AndroidComposeView$pointerIconService$1 pointerIconService;
    public final AndroidSystemCallbacks pointerInputEventProcessor;
    public MutableObjectList postponedDirtyLayers;
    public MotionEvent previousMotionEvent;
    public IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride;
    public final RectManager rectManager;
    public long relayoutTime;
    public final AndroidComposeView$localeList$2 resendMotionEventOnLayout;
    public final Client.AnonymousClass3 resendMotionEventRunnable;
    public RetainedValuesStore retainedValuesStore;
    public final LayoutNode root;
    public final ScrollCapture scrollCapture;
    public final SimpleActor semanticsOwner;
    public final AndroidComposeView$$ExternalSyntheticLambda0 sendHoverExitEvent;
    public final LayoutNodeDrawScope sharedDrawScope;
    public boolean showLayoutBounds;
    public final ImageLoader$Builder snapshotObserver;
    public final boolean superclassInitComplete;
    public final AtomicReference textInputSessionMutex;
    public final AndroidTextToolbar textToolbar;
    public final float[] tmpMatrix;
    public final int[] tmpPositionArray;
    public final AndroidViewConfiguration viewConfiguration;
    public final float[] viewToWindowMatrix;
    public boolean wasMeasuredWithMultipleConstraints;
    public long windowPosition;
    public final float[] windowToViewMatrix;

    public final class RootModifierNode extends Modifier.Node implements BringIntoViewModifierNode, SemanticsModifierNode, KeyInputModifierNode, LayoutModifierNode, TraversableNode {
        public final WindowsKt$onNextDraw$1 rulerLambda = new WindowsKt$onNextDraw$1(this, 7);

        public RootModifierNode() {
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }

        @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
        public final Object bringIntoView(NodeCoordinator nodeCoordinator, Datadog$getInstance$1$1 datadog$getInstance$1$1, ContinuationImpl continuationImpl) {
            long mo841localToRootMKHz9U = nodeCoordinator.mo841localToRootMKHz9U(0L);
            Rect rect = (Rect) datadog$getInstance$1$1.invoke();
            Rect m637translatek4lQ0M = rect != null ? rect.m637translatek4lQ0M(mo841localToRootMKHz9U) : null;
            if (m637translatek4lQ0M != null) {
                AndroidComposeView.this.requestRectangleOnScreen(new android.graphics.Rect((int) m637translatek4lQ0M.left, (int) m637translatek4lQ0M.top, (int) m637translatek4lQ0M.right, (int) m637translatek4lQ0M.bottom), false);
            }
            return Unit.INSTANCE;
        }

        @Override // androidx.compose.ui.node.TraversableNode
        public final Object getTraverseKey() {
            return "androidx.compose.ui.layout.WindowInsetsRulers";
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
            int i = mo833measureBRTryo0.width;
            int i2 = mo833measureBRTryo0.height;
            PainterNode$measure$1 painterNode$measure$1 = new PainterNode$measure$1(mo833measureBRTryo0, 2);
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return measureScope.layout(i, i2, emptyMap, this.rulerLambda, painterNode$measure$1);
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onKeyEvent-ZmokQxo */
        public final boolean mo161onKeyEventZmokQxo(KeyEvent keyEvent) {
            FocusDirection focusDirection;
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            FocusOwnerImpl focusOwnerImpl = androidComposeView.focusOwner;
            int[] iArr = FocusInteropUtils_androidKt.tempCoordinates;
            long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
            int i = Key.$r8$clinit;
            if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m784getNavigatePreviousEK5gGoQ())) {
                focusDirection = new FocusDirection(2);
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m783getNavigateNextEK5gGoQ())) {
                focusDirection = new FocusDirection(1);
            } else if (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m789getTabEK5gGoQ())) {
                focusDirection = new FocusDirection(KeyEventType.m793isShiftPressedZmokQxo(keyEvent) ? 2 : 1);
            } else {
                focusDirection = Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m778getDirectionRightEK5gGoQ()) ? new FocusDirection(4) : Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m777getDirectionLeftEK5gGoQ()) ? new FocusDirection(3) : (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m779getDirectionUpEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m787getPageUpEK5gGoQ())) ? new FocusDirection(5) : (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m776getDirectionDownEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m786getPageDownEK5gGoQ())) ? new FocusDirection(6) : (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m775getDirectionCenterEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m780getEnterEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m785getNumPadEnterEK5gGoQ())) ? new FocusDirection(7) : (Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m773getBackEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m781getEscapeEK5gGoQ())) ? new FocusDirection(8) : null;
            }
            if (focusDirection == null) {
                return false;
            }
            int i2 = focusDirection.value;
            if (!KeyEventType.m772equalsimpl0(KeyEventType.m790getTypeZmokQxo(keyEvent), 2)) {
                return false;
            }
            FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
            if (activeFocusTargetNode == null || !activeFocusTargetNode.isInteropViewHost || !androidComposeView.m918moveFocusInChildren3ESFkO8(i2)) {
                Boolean m596focusSearchULY8qGw = focusOwnerImpl.m596focusSearchULY8qGw(i2, androidComposeView.getEmbeddedViewFocusRect(), new BoundsAnimation$animate$1(focusDirection, 13));
                if (!(m596focusSearchULY8qGw != null ? m596focusSearchULY8qGw.booleanValue() : true)) {
                    if (!FocusOwnerImplKt.m601is1dFocusSearch3ESFkO8(i2)) {
                        return false;
                    }
                    Integer m593toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m593toAndroidFocusDirection3ESFkO8(i2);
                    int intValue = m593toAndroidFocusDirection3ESFkO8 != null ? m593toAndroidFocusDirection3ESFkO8.intValue() : 2;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = androidComposeView.getRootView();
                    rootView.getClass();
                    View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, androidComposeView, intValue);
                    if (findNextFocus == null || findNextFocus.equals(androidComposeView)) {
                        return focusOwnerImpl.m598resetFocus3ESFkO8(i2);
                    }
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onPreKeyEvent-ZmokQxo */
        public final boolean mo163onPreKeyEventZmokQxo(KeyEvent keyEvent) {
            return false;
        }
    }

    public AndroidComposeView(Context context, ComposeViewContext composeViewContext) {
        super(context);
        this._composeViewContext$delegate = Updater.mutableStateOf$default(composeViewContext);
        this.lastDownPointerPosition = 9205357640488583168L;
        int i = 1;
        this.superclassInitComplete = true;
        this.sharedDrawScope = composeViewContext.sharedDrawScope;
        this.retainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        this.outOfFrameQueue = new ArrayDeque();
        int i2 = 0;
        this.outOfFrameRunnable = new AndroidComposeView$$ExternalSyntheticLambda0(this, i2);
        this.density$delegate = new ParcelableSnapshotMutableState(Strings.Density(context), NeverEqualPolicy.INSTANCE$1);
        FocusOwnerImpl focusOwnerImpl = new FocusOwnerImpl(this, this);
        this.focusOwner = focusOwnerImpl;
        this.coroutineContext = composeViewContext.compositionContext.getEffectCoroutineContext();
        AndroidDragAndDropManager androidDragAndDropManager = new AndroidDragAndDropManager();
        this.dragAndDropManager = androidDragAndDropManager;
        this._windowInfo = new LazyWindowInfo();
        this.isAttached$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.derivedIsAttached$delegate = Updater.derivedStateOf(new AndroidComposeView$localeList$2(this, i));
        this.canvasHolder = composeViewContext.canvasHolder;
        AndroidViewConfiguration androidViewConfiguration = composeViewContext.viewConfiguration;
        this.viewConfiguration = androidViewConfiguration;
        this.insetsListener = new InsetsListener();
        LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(androidViewConfiguration);
        layoutNode.setModifier(new ModifierNodeElement() { // from class: androidx.compose.ui.platform.AndroidComposeView$root$1$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final Modifier.Node create() {
                return AndroidComposeView.this.new RootModifierNode();
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return AndroidComposeView.this.hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("rootModifier");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
            }
        }.then(focusOwnerImpl.modifier).then(androidDragAndDropManager.modifier));
        this.root = layoutNode;
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
        MutableIntObjectMap mutableIntObjectMap2 = new MutableIntObjectMap();
        this.layoutNodes = mutableIntObjectMap2;
        RectManager rectManager = new RectManager(this);
        this.rectManager = rectManager;
        SimpleActor simpleActor = new SimpleActor(layoutNode, new EmptySemanticsModifier(), mutableIntObjectMap2);
        this.semanticsOwner = simpleActor;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new RoomDatabase$closeBarrier$1(0, this, TestTagKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 3));
        this.accessibilityManager = composeViewContext.accessibilityManager;
        this.graphicsContext = new AndroidGraphicsContext(this);
        StartStopTokensImpl startStopTokensImpl = new StartStopTokensImpl(1);
        this.autofillTree = startStopTokensImpl;
        this.dirtyLayers = new MutableObjectList();
        this.motionEventAdapter = new MotionEventAdapter();
        AndroidSystemCallbacks androidSystemCallbacks = new AndroidSystemCallbacks();
        androidSystemCallbacks.imageLoader = layoutNode;
        androidSystemCallbacks.activityCallbacks = new HitPathTracker((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator);
        androidSystemCallbacks.componentCallbacks = new MemoryCacheService(10);
        androidSystemCallbacks.application = new HitTestResult();
        this.pointerInputEventProcessor = androidSystemCallbacks;
        this.configuration$delegate = Updater.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()));
        this.localeList$delegate = Updater.derivedStateOf(new AndroidComposeView$localeList$2(this, i2));
        this._autofill = new SimpleActor(this, startStopTokensImpl);
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw Boxes$$ExternalSyntheticOutline1.m1150m("Autofill service could not be located.");
        }
        this._autofillManager = new AndroidAutofillManager(new MemoryCacheService(autofillManager, 8), simpleActor, this, rectManager, context.getPackageName());
        this.clipboardManager = composeViewContext.clipboardManager;
        this.clipboard = composeViewContext.clipboard;
        this.snapshotObserver = new ImageLoader$Builder(new AndroidComposeView$snapshotObserver$1(this, i2));
        this.measureAndLayoutDelegate = new FileMetadata(layoutNode);
        this.globalPosition = 9223372034707292159L;
        this.tmpPositionArray = new int[]{0, 0};
        this.tmpMatrix = Matrix.m699constructorimpl$default();
        this.viewToWindowMatrix = Matrix.m699constructorimpl$default();
        this.windowToViewMatrix = Matrix.m699constructorimpl$default();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = 9187343241974906880L;
        this._viewTreeOwners$delegate = Updater.mutableStateOf$default(null);
        Updater.derivedStateOf(new AndroidComposeView$localeList$2(this, 3));
        this.textInputSessionMutex = new AtomicReference(null);
        this.fontLoader = composeViewContext.fontLoader;
        this.fontFamilyResolver$delegate = composeViewContext.fontFamilyResolver;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = FocusInteropUtils_androidKt.tempCoordinates;
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
        this.layoutDirection$delegate = Updater.mutableStateOf$default(layoutDirection2 == null ? LayoutDirection.Ltr : layoutDirection2);
        this.hapticFeedBack = composeViewContext.hapticFeedback;
        int i3 = 2;
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? 1 : 2);
        AndroidTextToolbar androidTextToolbar = new AndroidTextToolbar();
        new ContourLayout$geometry$1(androidTextToolbar, 7);
        TextToolbarStatus[] textToolbarStatusArr = TextToolbarStatus.$VALUES;
        this.textToolbar = androidTextToolbar;
        this.layerCache = new WorkLauncherImpl(13);
        this.endApplyChangesListeners = new MutableObjectList();
        this.resendMotionEventRunnable = new Client.AnonymousClass3(this, i3);
        this.sendHoverExitEvent = new AndroidComposeView$$ExternalSyntheticLambda0(this, i);
        AndroidComposeView$snapshotObserver$1 androidComposeView$snapshotObserver$1 = new AndroidComposeView$snapshotObserver$1(this, i);
        final zacn zacnVar = new zacn();
        zacnVar.zaa$1 = androidComposeView$snapshotObserver$1;
        zacnVar.zac = 0;
        zacnVar.zaa = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                zacn zacnVar2 = zacn.this;
                AndroidComposeView$snapshotObserver$1 androidComposeView$snapshotObserver$12 = (AndroidComposeView$snapshotObserver$1) zacnVar2.zaa$1;
                if (!zacnVar2.zab) {
                    int i4 = zacnVar2.zac;
                    if (i4 == 1) {
                        if (Math.abs(f) > Math.abs(f2)) {
                            androidComposeView$snapshotObserver$12.this$0.focusOwner.m597moveFocusaToIllA(f > RecyclerView.DECELERATION_RATE ? 1 : 2, false);
                            return true;
                        }
                    } else if (i4 == 2 && Math.abs(f2) > Math.abs(f)) {
                        androidComposeView$snapshotObserver$12.this$0.focusOwner.m597moveFocusaToIllA(f2 > RecyclerView.DECELERATION_RATE ? 1 : 2, false);
                    }
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }
        });
        this.indirectPointerNavigationGestureDetector = zacnVar;
        this.resendMotionEventOnLayout = new AndroidComposeView$localeList$2(this, i3);
        this.matrixToWindow = new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(androidDragAndDropManager);
        layoutNode.attach$ui(this);
        AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        if (isArrEnabled$ui()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.frameRateCategoryView = view;
            addView(view, -1);
        }
        this.scrollCapture = Build.VERSION.SDK_INT >= 31 ? new ScrollCapture() : null;
        this.pointerIconService = new AndroidComposeView$pointerIconService$1(this);
    }

    public static final void access$addExtraDataToAccessibilityNodeInfoHelper(AndroidComposeView androidComposeView, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int orDefault;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.composeAccessibilityDelegate;
        if (Intrinsics.areEqual(str, androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalBeforeVal)) {
            int orDefault2 = androidComposeViewAccessibilityDelegateCompat.idToBeforeMap.getOrDefault(i);
            if (orDefault2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(str, androidComposeViewAccessibilityDelegateCompat.ExtraDataTestTraversalAfterVal) || (orDefault = androidComposeViewAccessibilityDelegateCompat.idToAfterMap.getOrDefault(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, orDefault);
    }

    public static void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    public static long m913convertMeasureSpecI7RO_PI(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            ULong.Companion companion = ULong.Companion;
            return size;
        }
        if (mode == 0) {
            ULong.Companion companion2 = ULong.Companion;
            return 2147483647L;
        }
        if (mode != 1073741824) {
            Path$$ExternalSyntheticBUOutline0.m();
            return 0L;
        }
        long j = size;
        ULong.Companion companion3 = ULong.Companion;
        return j | (j << 32);
    }

    public static void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui();
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayers((LayoutNode) objArr[i2]);
        }
    }

    public static boolean isArrEnabled$ui() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        FocusOwnerImpl focusOwnerImpl = this.focusOwner;
        FocusTargetNode focusTargetNode = focusOwnerImpl.rootFocusNode;
        if (!focusTargetNode.isAttached()) {
            return;
        }
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(0, new Modifier.Node[16]);
        Modifier.Node child$ui = focusTargetNode.getNode().getChild$ui();
        if (child$ui == null) {
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, focusTargetNode.getNode());
        } else {
            mutableVector.add(child$ui);
        }
        while (true) {
            int i3 = mutableVector.size;
            if (i3 == 0) {
                return;
            }
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(i3 - 1);
            if ((node.getAggregateChildKindSet$ui() & 1024) != 0) {
                for (Modifier.Node node2 = node; node2 != null && node2.isAttached(); node2 = node2.getChild$ui()) {
                    if ((node2.getKindSet$ui() & 1024) != 0) {
                        Modifier.Node node3 = node2;
                        MutableVector mutableVector2 = null;
                        while (node3 != null) {
                            if (node3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node3;
                                if (focusTargetNode2.isAttached() && focusTargetNode2.fetchFocusProperties$ui().canFocus) {
                                    super.addFocusables(arrayList, i, i2);
                                    FocusTargetNode focusTargetNode3 = focusOwnerImpl.rootFocusNode;
                                    if (focusTargetNode3.isAttached()) {
                                        if (!focusTargetNode3.getNode().isAttached()) {
                                            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
                                        }
                                        MutableVector mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                        Modifier.Node child$ui2 = focusTargetNode3.getNode().getChild$ui();
                                        if (child$ui2 == null) {
                                            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector3, focusTargetNode3.getNode());
                                        } else {
                                            mutableVector3.add(child$ui2);
                                        }
                                        while (true) {
                                            int i4 = mutableVector3.size;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            Modifier.Node node4 = (Modifier.Node) mutableVector3.removeAt(i4 - 1);
                                            if ((node4.getAggregateChildKindSet$ui() & 1024) != 0) {
                                                for (Modifier.Node node5 = node4; node5 != null && node5.isAttached(); node5 = node5.getChild$ui()) {
                                                    if ((node5.getKindSet$ui() & 1024) != 0) {
                                                        Modifier.Node node6 = node5;
                                                        MutableVector mutableVector4 = null;
                                                        while (node6 != null) {
                                                            if (node6 instanceof FocusTargetNode) {
                                                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) node6;
                                                                if (focusTargetNode4.isAttached()) {
                                                                    FocusPropertiesImpl fetchFocusProperties$ui = focusTargetNode4.fetchFocusProperties$ui();
                                                                    if (focusTargetNode4.isAttached() && !focusTargetNode4.isInteropViewHost && fetchFocusProperties$ui.canFocus) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((node6.getKindSet$ui() & 1024) != 0 && (node6 instanceof DelegatingNode)) {
                                                                int i5 = 0;
                                                                for (Modifier.Node node7 = ((DelegatingNode) node6).delegate; node7 != null; node7 = node7.getChild$ui()) {
                                                                    if ((node7.getKindSet$ui() & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            node6 = node7;
                                                                        } else {
                                                                            if (mutableVector4 == null) {
                                                                                mutableVector4 = new MutableVector(0, new Modifier.Node[16]);
                                                                            }
                                                                            if (node6 != null) {
                                                                                mutableVector4.add(node6);
                                                                                node6 = null;
                                                                            }
                                                                            mutableVector4.add(node7);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            node6 = DepthSortedSetKt.access$pop(mutableVector4);
                                                        }
                                                    }
                                                }
                                            }
                                            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector3, node4);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((node3.getKindSet$ui() & 1024) != 0 && (node3 instanceof DelegatingNode)) {
                                int i6 = 0;
                                for (Modifier.Node node8 = ((DelegatingNode) node3).delegate; node8 != null; node8 = node8.getChild$ui()) {
                                    if ((node8.getKindSet$ui() & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            node3 = node8;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node3 != null) {
                                                mutableVector2.add(node3);
                                                node3 = null;
                                            }
                                            mutableVector2.add(node8);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            node3 = DepthSortedSetKt.access$pop(mutableVector2);
                        }
                    }
                }
            }
            DepthSortedSetKt.access$addLayoutNodeChildren(mutableVector, node);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        SemanticsConfiguration semanticsConfiguration;
        Function1 function1;
        Function1 function12;
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                LayoutNode layoutNode = (LayoutNode) ((MutableIntObjectMap) androidAutofillManager.semanticsOwner.messageQueue).get(keyAt);
                if (layoutNode != null && (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) != null) {
                    MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
                    Object obj = mutableScatterMap.get(SemanticsActions.OnAutofillText);
                    if (obj == null) {
                        obj = null;
                    }
                    AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
                    if (accessibilityAction != null && (function12 = (Function1) accessibilityAction.action) != null) {
                    }
                    Object obj2 = mutableScatterMap.get(SemanticsActions.OnFillData);
                    AccessibilityAction accessibilityAction2 = (AccessibilityAction) (obj2 != null ? obj2 : null);
                    if (accessibilityAction2 != null && (function1 = (Function1) accessibilityAction2.action) != null) {
                    }
                }
            }
        }
        SimpleActor simpleActor = this._autofill;
        if (simpleActor != null) {
            AndroidAutofill_androidKt.performAutofill(simpleActor, sparseArray);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.composeAccessibilityDelegate.m923canScroll0AR0LA0$ui(this.lastDownPointerPosition, i, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.composeAccessibilityDelegate.m923canScroll0AR0LA0$ui(this.lastDownPointerPosition, i, true);
    }

    public final OwnedLayer createLayer(Function2 function2, NodeCoordinator$invalidateParentLayer$1 nodeCoordinator$invalidateParentLayer$1, GraphicsLayer graphicsLayer) {
        MutableVector mutableVector;
        Reference poll;
        Object obj;
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, function2, nodeCoordinator$invalidateParentLayer$1);
        }
        do {
            WorkLauncherImpl workLauncherImpl = this.layerCache;
            ReferenceQueue referenceQueue = (ReferenceQueue) workLauncherImpl.workTaskExecutor;
            mutableVector = (MutableVector) workLauncherImpl.processor;
            poll = referenceQueue.poll();
            if (poll != null) {
                mutableVector.remove(poll);
            }
        } while (poll != null);
        while (true) {
            int i = mutableVector.size;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) mutableVector.removeAt(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        OwnedLayer ownedLayer = (OwnedLayer) obj;
        if (ownedLayer == null) {
            return new GraphicsLayerOwnerLayer(this.graphicsContext.createGraphicsLayer(), this.graphicsContext, this, function2, nodeCoordinator$invalidateParentLayer$1);
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = (GraphicsLayerOwnerLayer) ownedLayer;
        GraphicsContext graphicsContext = graphicsLayerOwnerLayer.context;
        if (graphicsContext == null) {
            throw Boxes$$ExternalSyntheticOutline1.m1150m("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!graphicsLayerOwnerLayer.graphicsLayer.isReleased) {
            InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        graphicsLayerOwnerLayer.graphicsLayer = graphicsContext.createGraphicsLayer();
        graphicsLayerOwnerLayer.isDestroyed = false;
        graphicsLayerOwnerLayer.drawBlock = function2;
        graphicsLayerOwnerLayer.invalidateParentLayer = nodeCoordinator$invalidateParentLayer$1;
        graphicsLayerOwnerLayer.isMatrixDirty = false;
        graphicsLayerOwnerLayer.isInverseMatrixDirty = false;
        graphicsLayerOwnerLayer.isIdentity = true;
        Matrix.m702resetimpl(graphicsLayerOwnerLayer.matrixCache);
        float[] fArr = graphicsLayerOwnerLayer.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m702resetimpl(fArr);
        }
        graphicsLayerOwnerLayer.transformOrigin = TransformOrigin.Center;
        graphicsLayerOwnerLayer.drawnWithEnabledZ = false;
        graphicsLayerOwnerLayer.size = 9223372034707292159L;
        graphicsLayerOwnerLayer.outline = null;
        graphicsLayerOwnerLayer.mutatedFields = 0;
        return ownedLayer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        MutableObjectList mutableObjectList = this.dirtyLayers;
        boolean isAttachedToWindow = isAttachedToWindow();
        LayoutNode layoutNode = this.root;
        if (!isAttachedToWindow) {
            invalidateLayers(layoutNode);
        }
        measureAndLayout(true);
        SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime();
        this.isDrawingContent = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            MemoryCacheService memoryCacheService = this.canvasHolder;
            AndroidCanvas androidCanvas = (AndroidCanvas) memoryCacheService.imageLoader;
            Canvas canvas2 = androidCanvas.internalCanvas;
            androidCanvas.internalCanvas = canvas;
            layoutNode.draw$ui(androidCanvas, null);
            ((AndroidCanvas) memoryCacheService.imageLoader).internalCanvas = canvas2;
            if (mutableObjectList.isNotEmpty()) {
                int i = mutableObjectList._size;
                for (int i2 = 0; i2 < i; i2++) {
                    ((GraphicsLayerOwnerLayer) ((OwnedLayer) mutableObjectList.get(i2))).updateDisplayList();
                }
            }
            int i3 = ViewLayer.$r8$clinit;
            mutableObjectList.clear();
            this.isDrawingContent = false;
            Trace.endSection();
            MutableObjectList mutableObjectList2 = this.postponedDirtyLayers;
            if (mutableObjectList2 != null) {
                mutableObjectList.addAll(mutableObjectList2);
                mutableObjectList2.clear();
            }
            if (isArrEnabled$ui()) {
                Api35Impl.setRequestedFrameRate(this, this.currentFrameRate);
                View view = this.frameRateCategoryView;
                if (view != null) {
                    Api35Impl.setRequestedFrameRate(view, this.currentFrameRateCategory);
                    if (!Float.isNaN(this.currentFrameRateCategory)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.currentFrameRate = Float.NaN;
                this.currentFrameRateCategory = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:584:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x03c9  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        int pointerCount;
        int i;
        String str;
        HuffmanTreeGroup huffmanTreeGroup;
        String str2;
        long j;
        boolean z2;
        ArrayList arrayList;
        SparseLongArray sparseLongArray;
        int i2;
        IndirectPointerInputModifierNode indirectPointerInputModifierNode;
        NodeChain nodeChain;
        boolean z3;
        DelegatingNode delegatingNode;
        NodeChain nodeChain2;
        IndirectPointerInputModifierNode indirectPointerInputModifierNode2;
        boolean z4;
        int size;
        int size2;
        NodeChain nodeChain3;
        boolean z5;
        DelegatingNode delegatingNode2;
        NodeChain nodeChain4;
        boolean z6;
        RootModifierNode rootModifierNode;
        int size3;
        NodeChain nodeChain5;
        boolean z7;
        Modifier.Node node;
        NodeChain nodeChain6;
        if (this.hoverExitReceived) {
            AndroidComposeView$$ExternalSyntheticLambda0 androidComposeView$$ExternalSyntheticLambda0 = this.sendHoverExitEvent;
            removeCallbacks(androidComposeView$$ExternalSyntheticLambda0);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                androidComposeView$$ExternalSyntheticLambda0.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        FocusOwnerImpl focusOwnerImpl = this.focusOwner;
        String str3 = "visitAncestors called on an unattached node";
        if (actionMasked == 8) {
            int i3 = 4;
            if (!motionEvent.isFromSource(4194304)) {
                return (m914handleMotionEvent8iAsVTc(motionEvent) & 4) != 0;
            }
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration);
            getContext();
            ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration);
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            ViewRegistryKt$buildView$1$2$1$1 viewRegistryKt$buildView$1$2$1$1 = new ViewRegistryKt$buildView$1$2$1$1(i3, this, motionEvent);
            if (focusOwnerImpl.focusInvalidationManager.isInvalidationScheduled) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusOwnerImpl.rootFocusNode);
            if (findActiveFocusNode != null) {
                if (!findActiveFocusNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node2 = findActiveFocusNode.getNode();
                LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(findActiveFocusNode);
                loop0: while (true) {
                    if (requireLayoutNode == null) {
                        node = null;
                        break;
                    }
                    if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & 16384) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet$ui() & 16384) != 0) {
                                node = node2;
                                MutableVector mutableVector = null;
                                while (node != null) {
                                    if (node instanceof RootModifierNode) {
                                        break loop0;
                                    }
                                    if ((node.getKindSet$ui() & 16384) != 0 && (node instanceof DelegatingNode)) {
                                        int i4 = 0;
                                        for (Modifier.Node node3 = ((DelegatingNode) node).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                            if ((node3.getKindSet$ui() & 16384) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    node = node3;
                                                } else {
                                                    if (mutableVector == null) {
                                                        mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node != null) {
                                                        mutableVector.add(node);
                                                        node = null;
                                                    }
                                                    mutableVector.add(node3);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    node = DepthSortedSetKt.access$pop(mutableVector);
                                }
                            }
                            node2 = node2.getParent$ui();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui();
                    node2 = (requireLayoutNode == null || (nodeChain6 = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain6.tail;
                }
                rootModifierNode = (RootModifierNode) node;
            } else {
                rootModifierNode = null;
            }
            if (rootModifierNode != null) {
                if (!rootModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent$ui = rootModifierNode.getNode().getParent$ui();
                LayoutNode requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(rootModifierNode);
                ArrayList arrayList2 = null;
                while (requireLayoutNode2 != null) {
                    if ((((Modifier.Node) requireLayoutNode2.nodes.head).getAggregateChildKindSet$ui() & 16384) != 0) {
                        while (parent$ui != null) {
                            if ((parent$ui.getKindSet$ui() & 16384) != 0) {
                                Modifier.Node node4 = parent$ui;
                                MutableVector mutableVector2 = null;
                                while (node4 != null) {
                                    if (node4 instanceof RootModifierNode) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(node4);
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (z7 && (node4.getKindSet$ui() & 16384) != 0 && (node4 instanceof DelegatingNode)) {
                                        int i5 = 0;
                                        for (Modifier.Node node5 = ((DelegatingNode) node4).delegate; node5 != null; node5 = node5.getChild$ui()) {
                                            if ((node5.getKindSet$ui() & 16384) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    node4 = node5;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector2.add(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector2.add(node5);
                                                }
                                            }
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    node4 = DepthSortedSetKt.access$pop(mutableVector2);
                                }
                            }
                            parent$ui = parent$ui.getParent$ui();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                    parent$ui = (requireLayoutNode2 == null || (nodeChain5 = requireLayoutNode2.nodes) == null) ? null : (TailModifierNode) nodeChain5.tail;
                }
                if (arrayList2 != null && arrayList2.size() - 1 >= 0) {
                    while (true) {
                        int i6 = size3 - 1;
                        ((RootModifierNode) arrayList2.get(size3)).getClass();
                        if (i6 < 0) {
                            break;
                        }
                        size3 = i6;
                    }
                }
                Modifier.Node node6 = rootModifierNode.getNode();
                MutableVector mutableVector3 = null;
                while (node6 != null) {
                    if (!(node6 instanceof RootModifierNode) && (node6.getKindSet$ui() & 16384) != 0 && (node6 instanceof DelegatingNode)) {
                        int i7 = 0;
                        for (Modifier.Node node7 = ((DelegatingNode) node6).delegate; node7 != null; node7 = node7.getChild$ui()) {
                            if ((node7.getKindSet$ui() & 16384) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    node6 = node7;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(0, new Modifier.Node[16]);
                                    }
                                    if (node6 != null) {
                                        mutableVector3.add(node6);
                                        node6 = null;
                                    }
                                    mutableVector3.add(node7);
                                }
                            }
                        }
                        if (i7 == 1) {
                        }
                    }
                    node6 = DepthSortedSetKt.access$pop(mutableVector3);
                }
                if (!((Boolean) viewRegistryKt$buildView$1$2$1$1.invoke()).booleanValue()) {
                    Modifier.Node node8 = rootModifierNode.getNode();
                    MutableVector mutableVector4 = null;
                    while (node8 != null) {
                        if (!(node8 instanceof RootModifierNode) && (node8.getKindSet$ui() & 16384) != 0 && (node8 instanceof DelegatingNode)) {
                            int i8 = 0;
                            for (Modifier.Node node9 = ((DelegatingNode) node8).delegate; node9 != null; node9 = node9.getChild$ui()) {
                                if ((node9.getKindSet$ui() & 16384) != 0) {
                                    i8++;
                                    if (i8 == 1) {
                                        node8 = node9;
                                    } else {
                                        if (mutableVector4 == null) {
                                            mutableVector4 = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (node8 != null) {
                                            mutableVector4.add(node8);
                                            node8 = null;
                                        }
                                        mutableVector4.add(node9);
                                    }
                                }
                            }
                            if (i8 == 1) {
                            }
                        }
                        node8 = DepthSortedSetKt.access$pop(mutableVector4);
                    }
                    if (arrayList2 != null) {
                        int size4 = arrayList2.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            ((RootModifierNode) arrayList2.get(i9)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(PKIFailureInfo.badSenderNonce)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis = this.primaryDirectionalMotionAxisOverride;
        MotionEventAdapter motionEventAdapter = this.motionEventAdapter;
        LongSparseArray longSparseArray = motionEventAdapter.previousIndirectPointerEventData;
        SparseLongArray sparseLongArray2 = motionEventAdapter.motionEventToComposePointerIdMap;
        int actionMasked2 = motionEvent.getActionMasked();
        motionEventAdapter.clearOnDeviceChange(motionEvent);
        if (actionMasked2 == 3) {
            sparseLongArray2.clear();
            motionEventAdapter.activeHoverIds.clear();
            str = "visitAncestors called on an unattached node";
            huffmanTreeGroup = null;
        } else {
            motionEventAdapter.addFreshIds(motionEvent);
            int actionIndex = actionMasked2 != 1 ? actionMasked2 != 6 ? -1 : motionEvent.getActionIndex() : 0;
            if (actionMasked2 != 0 && actionMasked2 != 2) {
                if (actionMasked2 != 5) {
                    z = false;
                    pointerCount = motionEvent.getPointerCount();
                    ArrayList arrayList3 = new ArrayList(pointerCount);
                    i = 0;
                    while (i < pointerCount) {
                        int pointerId = motionEvent.getPointerId(i);
                        int indexOfKey = sparseLongArray2.indexOfKey(pointerId);
                        if (indexOfKey >= 0) {
                            str2 = str3;
                            j = sparseLongArray2.valueAt(indexOfKey);
                            z2 = z;
                            arrayList = arrayList3;
                        } else {
                            str2 = str3;
                            j = motionEventAdapter.nextId;
                            z2 = z;
                            arrayList = arrayList3;
                            motionEventAdapter.nextId = j + 1;
                            sparseLongArray2.put(pointerId, j);
                        }
                        MotionEventAdapter motionEventAdapter2 = motionEventAdapter;
                        long floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getX(i)) << 32) | (Float.floatToRawIntBits(motionEvent.getY(i)) & BodyPartID.bodyIdMax);
                        boolean z8 = i != actionIndex;
                        MotionEventAdapter.IndirectPointerEventData indirectPointerEventData = (MotionEventAdapter.IndirectPointerEventData) longSparseArray.get(j);
                        if (i == actionIndex) {
                            longSparseArray.remove(j);
                            sparseLongArray = sparseLongArray2;
                            i2 = pointerCount;
                        } else {
                            sparseLongArray = sparseLongArray2;
                            i2 = pointerCount;
                            if (z2) {
                                longSparseArray.put(MotionEventAdapter.IndirectPointerEventData.m800boximpl(MotionEventAdapter.IndirectPointerEventData.m801constructorimpl(motionEvent.getEventTime(), floatToRawIntBits)), j);
                            }
                        }
                        long eventTime = motionEvent.getEventTime();
                        float pressure = motionEvent.getPressure(i);
                        long m804getUptimeimpl = indirectPointerEventData != null ? MotionEventAdapter.IndirectPointerEventData.m804getUptimeimpl(indirectPointerEventData.m805unboximpl()) : motionEvent.getEventTime();
                        long m803getPositionF1C5BW0 = indirectPointerEventData != null ? MotionEventAdapter.IndirectPointerEventData.m803getPositionF1C5BW0(indirectPointerEventData.m805unboximpl()) : floatToRawIntBits;
                        boolean m802getDownimpl = indirectPointerEventData != null ? MotionEventAdapter.IndirectPointerEventData.m802getDownimpl(indirectPointerEventData.m805unboximpl()) : false;
                        ArrayList arrayList4 = arrayList;
                        arrayList4.add(new IndirectPointerInputChange(j, eventTime, floatToRawIntBits, z8, pressure, m804getUptimeimpl, m803getPositionF1C5BW0, m802getDownimpl));
                        i++;
                        arrayList3 = arrayList4;
                        sparseLongArray2 = sparseLongArray;
                        str3 = str2;
                        motionEventAdapter = motionEventAdapter2;
                        pointerCount = i2;
                        z = z2;
                    }
                    str = str3;
                    ArrayList arrayList5 = arrayList3;
                    motionEventAdapter.removeStaleIds(motionEvent);
                    huffmanTreeGroup = new HuffmanTreeGroup(arrayList5, indirectPointerEventPrimaryDirectionalMotionAxis == null ? indirectPointerEventPrimaryDirectionalMotionAxis.value : zzaet.indirectPrimaryDirectionalScrollAxis(motionEvent), motionEvent);
                }
            }
            z = true;
            pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList32 = new ArrayList(pointerCount);
            i = 0;
            while (i < pointerCount) {
            }
            str = str3;
            ArrayList arrayList52 = arrayList32;
            motionEventAdapter.removeStaleIds(motionEvent);
            huffmanTreeGroup = new HuffmanTreeGroup(arrayList52, indirectPointerEventPrimaryDirectionalMotionAxis == null ? indirectPointerEventPrimaryDirectionalMotionAxis.value : zzaet.indirectPrimaryDirectionalScrollAxis(motionEvent), motionEvent);
        }
        zacn zacnVar = this.indirectPointerNavigationGestureDetector;
        if (huffmanTreeGroup == null) {
            FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
            if (activeFocusTargetNode != null) {
                if (!activeFocusTargetNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException(str);
                }
                Modifier.Node node10 = activeFocusTargetNode.getNode();
                LayoutNode requireLayoutNode3 = DepthSortedSetKt.requireLayoutNode(activeFocusTargetNode);
                loop26: while (true) {
                    if (requireLayoutNode3 == null) {
                        delegatingNode = 0;
                        break;
                    }
                    if ((((Modifier.Node) requireLayoutNode3.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                        while (node10 != null) {
                            if ((node10.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                delegatingNode = node10;
                                ?? r4 = 0;
                                while (delegatingNode != 0) {
                                    if (delegatingNode instanceof IndirectPointerInputModifierNode) {
                                        break loop26;
                                    }
                                    if ((delegatingNode.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                        Modifier.Node node11 = delegatingNode.delegate;
                                        int i10 = 0;
                                        delegatingNode = delegatingNode;
                                        r4 = r4;
                                        while (node11 != null) {
                                            if ((node11.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                                i10++;
                                                r4 = r4;
                                                if (i10 == 1) {
                                                    delegatingNode = node11;
                                                } else {
                                                    if (r4 == 0) {
                                                        r4 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (delegatingNode != 0) {
                                                        r4.add(delegatingNode);
                                                        delegatingNode = 0;
                                                    }
                                                    r4.add(node11);
                                                }
                                            }
                                            node11 = node11.getChild$ui();
                                            delegatingNode = delegatingNode;
                                            r4 = r4;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    delegatingNode = DepthSortedSetKt.access$pop(r4);
                                }
                            }
                            node10 = node10.getParent$ui();
                        }
                    }
                    requireLayoutNode3 = requireLayoutNode3.getParent$ui();
                    node10 = (requireLayoutNode3 == null || (nodeChain2 = requireLayoutNode3.nodes) == null) ? null : (TailModifierNode) nodeChain2.tail;
                }
                indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) delegatingNode;
            } else {
                indirectPointerInputModifierNode = null;
            }
            if (indirectPointerInputModifierNode != null) {
                Modifier.Node node12 = (Modifier.Node) indirectPointerInputModifierNode;
                if (!node12.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException(str);
                }
                Modifier.Node parent$ui2 = node12.getNode().getParent$ui();
                LayoutNode requireLayoutNode4 = DepthSortedSetKt.requireLayoutNode(indirectPointerInputModifierNode);
                ArrayList arrayList6 = null;
                while (requireLayoutNode4 != null) {
                    if ((((Modifier.Node) requireLayoutNode4.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                        while (parent$ui2 != null) {
                            if ((parent$ui2.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                Modifier.Node node13 = parent$ui2;
                                MutableVector mutableVector5 = null;
                                while (node13 != null) {
                                    if (node13 instanceof IndirectPointerInputModifierNode) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(node13);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3 && (node13.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0 && (node13 instanceof DelegatingNode)) {
                                        int i11 = 0;
                                        for (Modifier.Node node14 = ((DelegatingNode) node13).delegate; node14 != null; node14 = node14.getChild$ui()) {
                                            if ((node14.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    node13 = node14;
                                                } else {
                                                    if (mutableVector5 == null) {
                                                        mutableVector5 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node13 != null) {
                                                        mutableVector5.add(node13);
                                                        node13 = null;
                                                    }
                                                    mutableVector5.add(node14);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    node13 = DepthSortedSetKt.access$pop(mutableVector5);
                                }
                            }
                            parent$ui2 = parent$ui2.getParent$ui();
                        }
                    }
                    requireLayoutNode4 = requireLayoutNode4.getParent$ui();
                    parent$ui2 = (requireLayoutNode4 == null || (nodeChain = requireLayoutNode4.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
                }
                indirectPointerInputModifierNode.onCancelIndirectPointerInput();
                if (arrayList6 != null) {
                    int size5 = arrayList6.size();
                    for (int i12 = 0; i12 < size5; i12++) {
                        ((IndirectPointerInputModifierNode) arrayList6.get(i12)).onCancelIndirectPointerInput();
                    }
                }
            }
            zacnVar.zac = 0;
            zacnVar.zab = true;
            return true;
        }
        if (focusOwnerImpl.focusInvalidationManager.isInvalidationScheduled) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            FocusTargetNode activeFocusTargetNode2 = focusOwnerImpl.getActiveFocusTargetNode();
            if (activeFocusTargetNode2 != null) {
                if (!activeFocusTargetNode2.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException(str);
                }
                Modifier.Node node15 = activeFocusTargetNode2.getNode();
                LayoutNode requireLayoutNode5 = DepthSortedSetKt.requireLayoutNode(activeFocusTargetNode2);
                loop14: while (true) {
                    if (requireLayoutNode5 == null) {
                        delegatingNode2 = 0;
                        break;
                    }
                    if ((((Modifier.Node) requireLayoutNode5.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                        while (node15 != null) {
                            if ((node15.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                delegatingNode2 = node15;
                                ?? r5 = 0;
                                while (delegatingNode2 != 0) {
                                    if (delegatingNode2 instanceof IndirectPointerInputModifierNode) {
                                        break loop14;
                                    }
                                    if ((delegatingNode2.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0 && (delegatingNode2 instanceof DelegatingNode)) {
                                        Modifier.Node node16 = delegatingNode2.delegate;
                                        int i13 = 0;
                                        delegatingNode2 = delegatingNode2;
                                        r5 = r5;
                                        while (node16 != null) {
                                            if ((node16.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                                i13++;
                                                r5 = r5;
                                                if (i13 == 1) {
                                                    delegatingNode2 = node16;
                                                } else {
                                                    if (r5 == 0) {
                                                        r5 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (delegatingNode2 != 0) {
                                                        r5.add(delegatingNode2);
                                                        delegatingNode2 = 0;
                                                    }
                                                    r5.add(node16);
                                                }
                                            }
                                            node16 = node16.getChild$ui();
                                            delegatingNode2 = delegatingNode2;
                                            r5 = r5;
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    delegatingNode2 = DepthSortedSetKt.access$pop(r5);
                                }
                            }
                            node15 = node15.getParent$ui();
                        }
                    }
                    requireLayoutNode5 = requireLayoutNode5.getParent$ui();
                    node15 = (requireLayoutNode5 == null || (nodeChain4 = requireLayoutNode5.nodes) == null) ? null : (TailModifierNode) nodeChain4.tail;
                }
                indirectPointerInputModifierNode2 = (IndirectPointerInputModifierNode) delegatingNode2;
            } else {
                indirectPointerInputModifierNode2 = null;
            }
            if (indirectPointerInputModifierNode2 != null) {
                Modifier.Node node17 = (Modifier.Node) indirectPointerInputModifierNode2;
                if (!node17.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException(str);
                }
                Modifier.Node parent$ui3 = node17.getNode().getParent$ui();
                LayoutNode requireLayoutNode6 = DepthSortedSetKt.requireLayoutNode(indirectPointerInputModifierNode2);
                ArrayList arrayList7 = null;
                while (requireLayoutNode6 != null) {
                    if ((((Modifier.Node) requireLayoutNode6.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                        while (parent$ui3 != null) {
                            if ((parent$ui3.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                Modifier.Node node18 = parent$ui3;
                                MutableVector mutableVector6 = null;
                                while (node18 != null) {
                                    if (node18 instanceof IndirectPointerInputModifierNode) {
                                        if (arrayList7 == null) {
                                            arrayList7 = new ArrayList();
                                        }
                                        arrayList7.add(node18);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (node18.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0 && (node18 instanceof DelegatingNode)) {
                                        int i14 = 0;
                                        for (Modifier.Node node19 = ((DelegatingNode) node18).delegate; node19 != null; node19 = node19.getChild$ui()) {
                                            if ((node19.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    node18 = node19;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        mutableVector6 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node18 != null) {
                                                        mutableVector6.add(node18);
                                                        node18 = null;
                                                    }
                                                    mutableVector6.add(node19);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    node18 = DepthSortedSetKt.access$pop(mutableVector6);
                                }
                            }
                            parent$ui3 = parent$ui3.getParent$ui();
                        }
                    }
                    requireLayoutNode6 = requireLayoutNode6.getParent$ui();
                    parent$ui3 = (requireLayoutNode6 == null || (nodeChain3 = requireLayoutNode6.nodes) == null) ? null : (TailModifierNode) nodeChain3.tail;
                }
                if (arrayList7 != null && arrayList7.size() - 1 >= 0) {
                    while (true) {
                        int i15 = size2 - 1;
                        ((IndirectPointerInputModifierNode) arrayList7.get(size2)).onIndirectPointerEvent(huffmanTreeGroup, PointerEventPass.Initial);
                        if (i15 < 0) {
                            break;
                        }
                        size2 = i15;
                    }
                }
                indirectPointerInputModifierNode2.onIndirectPointerEvent(huffmanTreeGroup, PointerEventPass.Initial);
                indirectPointerInputModifierNode2.onIndirectPointerEvent(huffmanTreeGroup, PointerEventPass.Main);
                if (arrayList7 != null) {
                    int size6 = arrayList7.size();
                    for (int i16 = 0; i16 < size6; i16++) {
                        ((IndirectPointerInputModifierNode) arrayList7.get(i16)).onIndirectPointerEvent(huffmanTreeGroup, PointerEventPass.Main);
                    }
                }
                if (arrayList7 != null && arrayList7.size() - 1 >= 0) {
                    while (true) {
                        int i17 = size - 1;
                        ((IndirectPointerInputModifierNode) arrayList7.get(size)).onIndirectPointerEvent(huffmanTreeGroup, PointerEventPass.Final);
                        if (i17 < 0) {
                            break;
                        }
                        size = i17;
                    }
                }
                indirectPointerInputModifierNode2.onIndirectPointerEvent(huffmanTreeGroup, PointerEventPass.Final);
            }
            List changes = huffmanTreeGroup.getChanges();
            int size7 = changes.size();
            for (int i18 = 0; i18 < size7; i18++) {
                if (((IndirectPointerInputChange) ((ArrayList) changes).get(i18)).isConsumed()) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        zacnVar.getClass();
        MotionEvent nativeEvent = zzaet.getNativeEvent(huffmanTreeGroup);
        int action = nativeEvent.getAction();
        if (action != 0) {
            z6 = true;
            if ((action == 1 || action == 2) && z4) {
                zacnVar.zac = 0;
                zacnVar.zab = true;
            }
        } else {
            z6 = true;
            zacnVar.zac = huffmanTreeGroup.m4367getPrimaryDirectionalMotionAxisnZO2Niw();
            zacnVar.zab = false;
        }
        ((GestureDetector) zacnVar.zaa).onTouchEvent(nativeEvent);
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        if (isPositionChanged(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.hoverExitReceived;
        AndroidComposeView$$ExternalSyntheticLambda0 androidComposeView$$ExternalSyntheticLambda0 = this.sendHoverExitEvent;
        if (z) {
            removeCallbacks(androidComposeView$$ExternalSyntheticLambda0);
            androidComposeView$$ExternalSyntheticLambda0.run();
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
            AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.view;
            AccessibilityManager accessibilityManager = androidComposeViewAccessibilityDelegateCompat.accessibilityManager;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    androidComposeView.measureAndLayout(true);
                    HitTestResult hitTestResult = new HitTestResult();
                    LayoutNode layoutNode = androidComposeView.root;
                    long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & BodyPartID.bodyIdMax);
                    NodeChain nodeChain = layoutNode.nodes;
                    NodeCoordinator nodeCoordinator = (NodeCoordinator) nodeChain.outerCoordinator;
                    ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.graphicsLayerScope;
                    ((NodeCoordinator) nodeChain.outerCoordinator).m898hitTestqzLsGqo(NodeCoordinator.SemanticsSource, nodeCoordinator.m893fromParentPosition8S9VItk(floatToRawIntBits, true), hitTestResult, 1, true);
                    MutableObjectList mutableObjectList = hitTestResult.values;
                    for (int i2 = mutableObjectList._size - 1; -1 < i2; i2--) {
                        Object obj = mutableObjectList.get(i2);
                        obj.getClass();
                        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode((Modifier.Node) obj);
                        if (((AndroidViewHolder) androidComposeView.getAndroidViewsHandler$ui().layoutNodeToHolder.get(requireLayoutNode)) != null) {
                            break;
                        }
                        if (requireLayoutNode.nodes.m889hasH91voCI$ui(8)) {
                            int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.semanticsId);
                            SemanticsNode SemanticsNode = androidx.tracing.Trace.SemanticsNode(requireLayoutNode, false);
                            if (SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !SemanticsOwnerKt.isAccessibilityIgnoredLink(SemanticsNode)) {
                                i = semanticsNodeIdToAccessibilityVirtualNodeId;
                                break;
                            }
                        }
                    }
                    i = PKIFailureInfo.systemUnavail;
                    androidComposeView.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = androidComposeViewAccessibilityDelegateCompat.hoveredVirtualViewId;
                    if (i3 != i) {
                        androidComposeViewAccessibilityDelegateCompat.hoveredVirtualViewId = i;
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i, 128, null, 12);
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = androidComposeViewAccessibilityDelegateCompat.hoveredVirtualViewId;
                    if (i4 == Integer.MIN_VALUE) {
                        androidComposeView.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        androidComposeViewAccessibilityDelegateCompat.hoveredVirtualViewId = PKIFailureInfo.systemUnavail;
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, PKIFailureInfo.systemUnavail, 128, null, 12);
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.previousMotionEvent;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                        this.hoverExitReceived = true;
                        postDelayed(androidComposeView$$ExternalSyntheticLambda0, 8L);
                        return false;
                    }
                }
                if ((m914handleMotionEvent8iAsVTc(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        boolean isFocused = isFocused();
        FocusOwnerImpl focusOwnerImpl = this.focusOwner;
        if (!isFocused) {
            return focusOwnerImpl.m595dispatchKeyEventYhN2O0w(keyEvent, new ViewRegistryKt$buildView$1$2$1$1(3, this, keyEvent));
        }
        LazyWindowInfo lazyWindowInfo = get_composeViewContext().windowInfo;
        int metaState = keyEvent.getMetaState();
        lazyWindowInfo.getClass();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = WindowInfoImpl.GlobalKeyboardModifiers;
        parcelableSnapshotMutableState = WindowInfoImpl.GlobalKeyboardModifiers;
        parcelableSnapshotMutableState.setValue(new PointerKeyboardModifiers(metaState));
        return focusOwnerImpl.m595dispatchKeyEventYhN2O0w(keyEvent, FocusOwner$dispatchKeyEvent$1.INSTANCE) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        NodeChain nodeChain;
        if (isFocused()) {
            FocusOwnerImpl focusOwnerImpl = this.focusOwner;
            if (focusOwnerImpl.focusInvalidationManager.isInvalidationScheduled) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusOwnerImpl.rootFocusNode);
                if (findActiveFocusNode != null) {
                    if (!findActiveFocusNode.getNode().isAttached()) {
                        InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                    }
                    Modifier.Node node = findActiveFocusNode.getNode();
                    LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(findActiveFocusNode);
                    while (requireLayoutNode != null) {
                        if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.unsupportedVersion) != 0) {
                            while (node != null) {
                                if ((node.getKindSet$ui() & PKIFailureInfo.unsupportedVersion) != 0) {
                                    Modifier.Node node2 = node;
                                    MutableVector mutableVector = null;
                                    while (node2 != null) {
                                        if ((node2.getKindSet$ui() & PKIFailureInfo.unsupportedVersion) != 0 && (node2 instanceof DelegatingNode)) {
                                            int i = 0;
                                            for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                                if ((node3.getKindSet$ui() & PKIFailureInfo.unsupportedVersion) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        node2 = node3;
                                                    } else {
                                                        if (mutableVector == null) {
                                                            mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                                        }
                                                        if (node2 != null) {
                                                            mutableVector.add(node2);
                                                            node2 = null;
                                                        }
                                                        mutableVector.add(node3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        node2 = DepthSortedSetKt.access$pop(mutableVector);
                                    }
                                }
                                node = node.getParent$ui();
                            }
                        }
                        requireLayoutNode = requireLayoutNode.getParent$ui();
                        node = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object m924boximpl;
        FocusOwnerImpl focusOwnerImpl;
        FocusTargetNode activeFocusTargetNode;
        if (this.hoverExitReceived) {
            AndroidComposeView$$ExternalSyntheticLambda0 androidComposeView$$ExternalSyntheticLambda0 = this.sendHoverExitEvent;
            removeCallbacks(androidComposeView$$ExternalSyntheticLambda0);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.hoverExitReceived = false;
            } else {
                androidComposeView$$ExternalSyntheticLambda0.run();
            }
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || isPositionChanged(motionEvent))) {
            int m914handleMotionEvent8iAsVTc = m914handleMotionEvent8iAsVTc(motionEvent);
            if ((m914handleMotionEvent8iAsVTc & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (m924boximpl = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    m924boximpl = AutoClearFocusBehavior.m924boximpl(1);
                }
                if (m924boximpl.equals(AutoClearFocusBehavior.m924boximpl(1)) && (activeFocusTargetNode = (focusOwnerImpl = this.focusOwner).getActiveFocusTargetNode()) != null) {
                    NodeCoordinator requireLayoutCoordinates = DepthSortedSetKt.requireLayoutCoordinates(activeFocusTargetNode);
                    if (!ValueInsets.findRootCoordinates(requireLayoutCoordinates).localBoundingBoxOf(requireLayoutCoordinates, true).m629containsk4lQ0M((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & BodyPartID.bodyIdMax))) {
                        focusOwnerImpl.clearFocus(false);
                    }
                }
            }
            if ((m914handleMotionEvent8iAsVTc & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        Rect calculateFocusRectRelativeTo;
        if (view == null || this.measureAndLayoutDelegate.isRegularFile) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (findNextFocus == null || !TestTagKt.access$containsDescendant(this, findNextFocus)) {
            findNextFocus = null;
        }
        FocusOwnerImpl focusOwnerImpl = this.focusOwner;
        if (view == this) {
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusOwnerImpl.rootFocusNode);
            calculateFocusRectRelativeTo = findActiveFocusNode != null ? FocusTraversalKt.focusRect(findActiveFocusNode) : null;
            if (calculateFocusRectRelativeTo == null) {
                calculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(view, this);
            }
        } else {
            calculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(view, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int i2 = focusDirection != null ? focusDirection.value : 6;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (focusOwnerImpl.m596focusSearchULY8qGw(i2, calculateFocusRectRelativeTo, new AndroidComposeView$focusSearch$searchResult$1(0, ref$ObjectRef)) == null) {
            return view;
        }
        if (ref$ObjectRef.element == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || FocusOwnerImplKt.m601is1dFocusSearch3ESFkO8(i2) || FocusTraversalKt.m613isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) ref$ObjectRef.element), FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findNextFocus, this), calculateFocusRectRelativeTo, i2)) {
            return this;
        }
        return findNextFocus;
    }

    public final void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        androidViewsHandler2.getClass();
        return androidViewsHandler2;
    }

    public final Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    public final Rect getEmbeddedViewFocusRect() {
        if (isFocused()) {
            FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.focusOwner.rootFocusNode);
            if (findActiveFocusNode != null) {
                return FocusTraversalKt.focusRect(findActiveFocusNode);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findFocus, this);
        }
        return null;
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.left);
            rect.top = Math.round(embeddedViewFocusRect.top);
            rect.right = Math.round(embeddedViewFocusRect.right);
            rect.bottom = Math.round(embeddedViewFocusRect.bottom);
            return;
        }
        if (Intrinsics.areEqual(this.focusOwner.m596focusSearchULY8qGw(6, null, AndroidComposeView$getFocusedRect$1.INSTANCE), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
        }
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    public final boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.isShowingLayoutBounds(this) : this.showLayoutBounds;
    }

    public final TextInputService getTextInputService() {
        TextInputService textInputService = this._textInputService;
        if (textInputService == null) {
            TextInputServiceAndroid textInputServiceAndroid = this._legacyTextInputServiceAndroid;
            if (textInputServiceAndroid == null) {
                textInputServiceAndroid = new TextInputServiceAndroid(this, this);
                this._legacyTextInputServiceAndroid = textInputServiceAndroid;
            }
            textInputService = new TextInputService(textInputServiceAndroid);
            this._textInputService = textInputService;
        }
        return textInputService;
    }

    public final ComposeViewContext get_composeViewContext() {
        return (ComposeViewContext) this._composeViewContext$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m914handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        boolean z;
        int actionMasked;
        MotionEvent motionEvent2;
        AndroidComposeView androidComposeView;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        boolean z2;
        HitPathTracker hitPathTracker;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent4 = this.previousMotionEvent;
                boolean z3 = motionEvent4 != null && motionEvent4.getToolType(0) == 3;
                AndroidSystemCallbacks androidSystemCallbacks = this.pointerInputEventProcessor;
                if (motionEvent4 != null) {
                    try {
                        if (motionEvent4.getSource() == motionEvent.getSource() && motionEvent4.getToolType(0) == motionEvent.getToolType(0)) {
                            z = false;
                            if (z) {
                                if (motionEvent4.getButtonState() != 0 || (actionMasked = motionEvent4.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent4;
                                    if (!androidSystemCallbacks.shutdown) {
                                        ((LongSparseArray) ((MemoryCacheService) androidSystemCallbacks.componentCallbacks).imageLoader).clear();
                                        ((HitPathTracker) androidSystemCallbacks.activityCallbacks).processCancel();
                                    }
                                } else if (motionEvent4.getActionMasked() != 10 && z3) {
                                    sendSimulatedEvent(motionEvent4, 10, motionEvent4.getEventTime(), true);
                                    motionEvent2 = motionEvent4;
                                }
                                boolean z4 = motionEvent.getToolType(0) != 3;
                                if (z3 && z4 && actionMasked2 != 3 && actionMasked2 != 9 && isInBounds(motionEvent)) {
                                    androidComposeView = this;
                                    androidComposeView.sendSimulatedEvent(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    androidComposeView = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = androidComposeView.previousMotionEvent;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    MotionEvent motionEvent5 = androidComposeView.previousMotionEvent;
                                    pointerId = motionEvent5 == null ? motionEvent5.getPointerId(0) : -1;
                                    action = motionEvent.getAction();
                                    MotionEventAdapter motionEventAdapter = androidComposeView.motionEventAdapter;
                                    if (action == 9 || motionEvent.getHistorySize() != 0) {
                                        if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                            MotionEvent motionEvent6 = androidComposeView.previousMotionEvent;
                                            float x = motionEvent6 == null ? motionEvent6.getX() : Float.NaN;
                                            MotionEvent motionEvent7 = androidComposeView.previousMotionEvent;
                                            z2 = x == motionEvent.getX() || (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) != motionEvent.getY();
                                            MotionEvent motionEvent8 = androidComposeView.previousMotionEvent;
                                            boolean z5 = (motionEvent8 == null ? motionEvent8.getEventTime() : -1L) == motionEvent.getEventTime();
                                            if (!z2 || z5) {
                                                if (pointerId >= 0) {
                                                    motionEventAdapter.activeHoverIds.delete(pointerId);
                                                    motionEventAdapter.motionEventToComposePointerIdMap.delete(pointerId);
                                                }
                                                hitPathTracker = (HitPathTracker) androidSystemCallbacks.activityCallbacks;
                                                if (hitPathTracker.clearNodeCacheAfterDispatchedEvent) {
                                                    hitPathTracker.root.children.clear();
                                                } else {
                                                    hitPathTracker.clearNodeCacheAfterDispatchedEvent = true;
                                                }
                                            }
                                        }
                                    } else if (pointerId >= 0) {
                                        motionEventAdapter.activeHoverIds.delete(pointerId);
                                        motionEventAdapter.motionEventToComposePointerIdMap.delete(pointerId);
                                    }
                                }
                                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                                int m921sendMotionEvent8iAsVTc = m921sendMotionEvent8iAsVTc(motionEvent);
                                Trace.endSection();
                                androidComposeView.forceUseMatrixCache = false;
                                return m921sendMotionEvent8iAsVTc;
                            }
                        }
                        z = true;
                        if (z) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent4;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z3) {
                }
                androidComposeView = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = androidComposeView.previousMotionEvent;
                if (motionEvent3 != null) {
                    MotionEvent motionEvent52 = androidComposeView.previousMotionEvent;
                    if (motionEvent52 == null) {
                    }
                    action = motionEvent.getAction();
                    MotionEventAdapter motionEventAdapter2 = androidComposeView.motionEventAdapter;
                    if (action == 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        MotionEvent motionEvent62 = androidComposeView.previousMotionEvent;
                        if (motionEvent62 == null) {
                        }
                        MotionEvent motionEvent72 = androidComposeView.previousMotionEvent;
                        if (motionEvent72 != null) {
                        }
                        if (x == motionEvent.getX()) {
                        }
                        MotionEvent motionEvent82 = androidComposeView.previousMotionEvent;
                        if ((motionEvent82 == null ? motionEvent82.getEventTime() : -1L) == motionEvent.getEventTime()) {
                        }
                        if (!z2) {
                        }
                        if (pointerId >= 0) {
                        }
                        hitPathTracker = (HitPathTracker) androidSystemCallbacks.activityCallbacks;
                        if (hitPathTracker.clearNodeCacheAfterDispatchedEvent) {
                        }
                    }
                }
                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int m921sendMotionEvent8iAsVTc2 = m921sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                androidComposeView.forceUseMatrixCache = false;
                return m921sendMotionEvent8iAsVTc2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.forceUseMatrixCache = false;
            throw th3;
        }
    }

    public final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestRemeasure(layoutNode, false);
        MutableVector mutableVector = layoutNode.get_children$ui();
        Object[] objArr = mutableVector.content;
        int i = mutableVector.size;
        for (int i2 = 0; i2 < i; i2++) {
            invalidateLayoutNodeMeasurement((LayoutNode) objArr[i2]);
        }
    }

    public final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return RecyclerView.DECELERATION_RATE <= x && x <= ((float) getWidth()) && RecyclerView.DECELERATION_RATE <= y && y <= ((float) getHeight());
    }

    public final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* renamed from: localToScreen-58bKbWc, reason: not valid java name */
    public final void m915localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m704timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition & BodyPartID.bodyIdMax));
        float[] fArr2 = this.tmpMatrix;
        Matrix.m702resetimpl(fArr2);
        Matrix.m705translateimpl(fArr2, intBitsToFloat, intBitsToFloat2);
        float m941dotp89u6pk = TestTagKt.m941dotp89u6pk(0, 0, fArr2, fArr);
        float m941dotp89u6pk2 = TestTagKt.m941dotp89u6pk(0, 1, fArr2, fArr);
        float m941dotp89u6pk3 = TestTagKt.m941dotp89u6pk(0, 2, fArr2, fArr);
        float m941dotp89u6pk4 = TestTagKt.m941dotp89u6pk(0, 3, fArr2, fArr);
        float m941dotp89u6pk5 = TestTagKt.m941dotp89u6pk(1, 0, fArr2, fArr);
        float m941dotp89u6pk6 = TestTagKt.m941dotp89u6pk(1, 1, fArr2, fArr);
        float m941dotp89u6pk7 = TestTagKt.m941dotp89u6pk(1, 2, fArr2, fArr);
        float m941dotp89u6pk8 = TestTagKt.m941dotp89u6pk(1, 3, fArr2, fArr);
        float m941dotp89u6pk9 = TestTagKt.m941dotp89u6pk(2, 0, fArr2, fArr);
        float m941dotp89u6pk10 = TestTagKt.m941dotp89u6pk(2, 1, fArr2, fArr);
        float m941dotp89u6pk11 = TestTagKt.m941dotp89u6pk(2, 2, fArr2, fArr);
        float m941dotp89u6pk12 = TestTagKt.m941dotp89u6pk(2, 3, fArr2, fArr);
        float m941dotp89u6pk13 = TestTagKt.m941dotp89u6pk(3, 0, fArr2, fArr);
        float m941dotp89u6pk14 = TestTagKt.m941dotp89u6pk(3, 1, fArr2, fArr);
        float m941dotp89u6pk15 = TestTagKt.m941dotp89u6pk(3, 2, fArr2, fArr);
        float m941dotp89u6pk16 = TestTagKt.m941dotp89u6pk(3, 3, fArr2, fArr);
        fArr[0] = m941dotp89u6pk;
        fArr[1] = m941dotp89u6pk2;
        fArr[2] = m941dotp89u6pk3;
        fArr[3] = m941dotp89u6pk4;
        fArr[4] = m941dotp89u6pk5;
        fArr[5] = m941dotp89u6pk6;
        fArr[6] = m941dotp89u6pk7;
        fArr[7] = m941dotp89u6pk8;
        fArr[8] = m941dotp89u6pk9;
        fArr[9] = m941dotp89u6pk10;
        fArr[10] = m941dotp89u6pk11;
        fArr[11] = m941dotp89u6pk12;
        fArr[12] = m941dotp89u6pk13;
        fArr[13] = m941dotp89u6pk14;
        fArr[14] = m941dotp89u6pk15;
        fArr[15] = m941dotp89u6pk16;
    }

    /* renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    public final long m916localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long m700mapMKHz9U = Matrix.m700mapMKHz9U(j, this.viewToWindowMatrix);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.windowPosition >> 32)) + Float.intBitsToFloat((int) (m700mapMKHz9U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.windowPosition & BodyPartID.bodyIdMax)) + Float.intBitsToFloat((int) (m700mapMKHz9U & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    public final void measureAndLayout(boolean z) {
        AndroidComposeView$localeList$2 androidComposeView$localeList$2;
        FileMetadata fileMetadata = this.measureAndLayoutDelegate;
        if (((GrpcMethod) fileMetadata.size).isNotEmpty() || ((MutableVector) ((WorkLauncherImpl) fileMetadata.createdAtMillis).processor).size != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    androidComposeView$localeList$2 = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                androidComposeView$localeList$2 = null;
            }
            if (fileMetadata.measureAndLayout(androidComposeView$localeList$2)) {
                requestLayout();
            }
            fileMetadata.dispatchOnPositionedCallbacks(false);
            this.rectManager.dispatchCallbacks();
            if (this.isPendingInteropViewLayoutChangeDispatch) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.isPendingInteropViewLayoutChangeDispatch = false;
            }
        }
    }

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    public final void m917measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        FileMetadata fileMetadata = this.measureAndLayoutDelegate;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            fileMetadata.m4344measureAndLayout0kLqBqw(layoutNode, j);
            if (!((GrpcMethod) fileMetadata.size).isNotEmpty()) {
                fileMetadata.dispatchOnPositionedCallbacks(false);
                this.rectManager.dispatchCallbacks();
                if (this.isPendingInteropViewLayoutChangeDispatch) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.isPendingInteropViewLayoutChangeDispatch = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: moveFocusInChildren-3ESFkO8, reason: not valid java name */
    public final boolean m918moveFocusInChildren3ESFkO8(int i) {
        if (i != 7 && i != 8) {
            Integer m593toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m593toAndroidFocusDirection3ESFkO8(i);
            if (m593toAndroidFocusDirection3ESFkO8 == null) {
                throw Boxes$$ExternalSyntheticOutline1.m1150m("Invalid focus direction");
            }
            int intValue = m593toAndroidFocusDirection3ESFkO8.intValue();
            FocusTargetNode activeFocusTargetNode = this.focusOwner.getActiveFocusTargetNode();
            if (activeFocusTargetNode == null) {
                a$$ExternalSyntheticBUOutline0.m$1("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer m593toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m593toAndroidFocusDirection3ESFkO8(i);
            if (m593toAndroidFocusDirection3ESFkO82 == null) {
                throw Boxes$$ExternalSyntheticOutline1.m1150m("Invalid focus direction");
            }
            int intValue2 = m593toAndroidFocusDirection3ESFkO82.intValue();
            ViewFactoryHolder viewFactoryHolder = DepthSortedSetKt.requireLayoutNode(activeFocusTargetNode).interopViewFactoryHolder;
            View view = viewFactoryHolder != null ? viewFactoryHolder.view : null;
            View findFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
            if (findNextFocus == null || view == null || !TestTagKt.access$containsDescendant(view, findNextFocus)) {
                findNextFocus = null;
            }
            if (findNextFocus != null) {
                return FocusInteropUtils_androidKt.requestInteropFocus(findNextFocus, Integer.valueOf(intValue), null);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        RetainedValuesStore retainedValuesStore;
        Object obj;
        super.onAttachedToWindow();
        this.isAttached$delegate.setValue(Boolean.TRUE);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(TestTagKt.getIsShowingLayoutBounds());
        }
        this.insetsListener.onViewAttachedToWindow(this);
        int i = 0;
        if (systemPropertiesChangedRunnable == null) {
            Perfs$$ExternalSyntheticLambda0 perfs$$ExternalSyntheticLambda0 = new Perfs$$ExternalSyntheticLambda0(r3);
            systemPropertiesChangedRunnable = perfs$$ExternalSyntheticLambda0;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (systemPropertiesClass == null) {
                    systemPropertiesClass = Class.forName("android.os.SystemProperties");
                }
                if (addChangeCallbackMethod == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = systemPropertiesClass;
                    addChangeCallbackMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                }
                Method method = addChangeCallbackMethod;
                if (method != null) {
                    method.invoke(null, perfs$$ExternalSyntheticLambda0);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        MutableObjectList mutableObjectList = composeViews;
        synchronized (mutableObjectList) {
            mutableObjectList.add(this);
        }
        if (!this.composeViewContextIncrementedDuringInit) {
            get_composeViewContext().incrementViewCount$ui();
        }
        this.composeViewContextIncrementedDuringInit = false;
        invalidateLayoutNodeMeasurement(this.root);
        invalidateLayers(this.root);
        ((SnapshotStateObserver) this.snapshotObserver.application).start();
        SimpleActor simpleActor = this._autofill;
        if (simpleActor != null) {
            AutofillCallback autofillCallback = AutofillCallback.INSTANCE;
            autofillCallback.getClass();
            ((AutofillManager) simpleActor.messageQueue).registerCallback(autofillCallback);
        }
        LifecycleOwner lifecycleOwner = get_composeViewContext().lifecycleOwner;
        ViewModelStoreOwner viewModelStoreOwner = get_composeViewContext().viewModelStoreOwner;
        LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
        if (lifecycleOwner == null || viewModelStoreOwner == null || frameEndScheduler == null) {
            retainedValuesStore = null;
        } else {
            ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
            ViewModelProvider$NewInstanceFactory viewModelProvider$NewInstanceFactory = new ViewModelProvider$NewInstanceFactory();
            CreationExtras.Empty empty = CreationExtras.Empty.INSTANCE;
            viewModelStore.getClass();
            empty.getClass();
            SimpleActor simpleActor2 = new SimpleActor(viewModelStore, viewModelProvider$NewInstanceFactory, empty);
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LifecycleRetainedValuesStoreOwner.class);
            String canonicalName = SizeKt.getCanonicalName(orCreateKotlinClass);
            if (canonicalName == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
                return;
            }
            LifecycleRetainedValuesStoreOwner lifecycleRetainedValuesStoreOwner = (LifecycleRetainedValuesStoreOwner) simpleActor2.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), orCreateKotlinClass);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            MutableIntObjectMap mutableIntObjectMap = lifecycleRetainedValuesStoreOwner.scopes;
            Object obj2 = mutableIntObjectMap.get(id);
            if (obj2 == null) {
                obj2 = new MutableObjectList(1);
                mutableIntObjectMap.set(id, obj2);
            }
            MutableObjectList mutableObjectList2 = (MutableObjectList) obj2;
            Object[] objArr = mutableObjectList2.content;
            int i2 = mutableObjectList2._size;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry) obj).isInUse) {
                    break;
                } else {
                    i++;
                }
            }
            LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = (LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry) obj;
            if (retainedValuesStoreEntry == null) {
                retainedValuesStoreEntry = new LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry();
                mutableObjectList2.add(retainedValuesStoreEntry);
            }
            retainedValuesStoreEntry.isInUse = true;
            this.lifecycleRetainedValuesStoreOwnerEntry = retainedValuesStoreEntry;
            retainedValuesStore = retainedValuesStoreEntry.retainedValuesStore;
        }
        if (retainedValuesStore == null) {
            retainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        }
        this.retainedValuesStore = retainedValuesStore;
        Function1 function1 = this.onReadyForComposition;
        if (function1 != null) {
            function1.invoke(get_composeViewContext());
            this.onReadyForComposition = null;
        }
        Lifecycle lifecycle = get_composeViewContext().lifecycleOwner.getLifecycle();
        lifecycle.addObserver(this);
        lifecycle.addObserver(this.contentCaptureManager);
        this._inputModeManager.inputMode$delegate.setValue(new InputMode(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            this.focusOwner.listeners.add(androidAutofillManager);
            ((MutableObjectList) this.semanticsOwner.remainingMessages).add(androidAutofillManager);
        }
        this.focusOwner.listeners.add(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        SessionMutex$Session sessionMutex$Session = (SessionMutex$Session) this.textInputSessionMutex.get();
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) (sessionMutex$Session != null ? sessionMutex$Session.value : null);
        if (androidPlatformTextInputSession != null) {
            SessionMutex$Session sessionMutex$Session2 = (SessionMutex$Session) androidPlatformTextInputSession.methodSessionMutex.get();
            InputMethodSession inputMethodSession = (InputMethodSession) (sessionMutex$Session2 != null ? sessionMutex$Session2.value : null);
            return inputMethodSession != null && (inputMethodSession.disposed ^ true);
        }
        TextInputServiceAndroid textInputServiceAndroid = this._legacyTextInputServiceAndroid;
        if (textInputServiceAndroid == null) {
            textInputServiceAndroid = new TextInputServiceAndroid(this, this);
            this._legacyTextInputServiceAndroid = textInputServiceAndroid;
        }
        return textInputServiceAndroid.editorHasFocus;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateConfiguration(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        SessionMutex$Session sessionMutex$Session = (SessionMutex$Session) this.textInputSessionMutex.get();
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) (sessionMutex$Session != null ? sessionMutex$Session.value : null);
        if (androidPlatformTextInputSession == null) {
            TextInputServiceAndroid textInputServiceAndroid = this._legacyTextInputServiceAndroid;
            if (textInputServiceAndroid == null) {
                textInputServiceAndroid = new TextInputServiceAndroid(this, this);
                this._legacyTextInputServiceAndroid = textInputServiceAndroid;
            }
            if (textInputServiceAndroid.editorHasFocus) {
                ImeOptions imeOptions = textInputServiceAndroid.imeOptions;
                TextFieldValue textFieldValue = textInputServiceAndroid.state;
                int i4 = imeOptions.imeAction;
                boolean z = imeOptions.singleLine;
                if (i4 != 1) {
                    if (i4 == 0) {
                        i = 1;
                    } else if (i4 == 2) {
                        i = 2;
                    } else if (i4 == 6) {
                        i = 5;
                    } else if (i4 == 5) {
                        i = 7;
                    } else if (i4 == 3) {
                        i = 3;
                    } else if (i4 == 4) {
                        i = 4;
                    } else {
                        if (i4 != 7) {
                            a$$ExternalSyntheticBUOutline0.m$1("invalid ImeAction");
                            return null;
                        }
                        i = 6;
                    }
                    editorInfo.imeOptions = i;
                    i2 = imeOptions.keyboardType;
                    if (i2 == 1) {
                    }
                    if (!z) {
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                    }
                    long j = textFieldValue.selection;
                    int i5 = TextRange.$r8$clinit;
                    editorInfo.initialSelStart = (int) (j >> 32);
                    editorInfo.initialSelEnd = (int) (j & BodyPartID.bodyIdMax);
                    SizeKt.setInitialSurroundingText(editorInfo, textFieldValue.annotatedString.text);
                    editorInfo.imeOptions |= 33554432;
                    if (EmojiCompat.isConfigured()) {
                    }
                    RecordingInputConnection recordingInputConnection = new RecordingInputConnection(textInputServiceAndroid.state, new Toolbar.AnonymousClass1(textInputServiceAndroid), textInputServiceAndroid.imeOptions.autoCorrect);
                    textInputServiceAndroid.ics.add(new WeakReference(recordingInputConnection));
                    return recordingInputConnection;
                }
                if (!z) {
                    i = 0;
                    editorInfo.imeOptions = i;
                    i2 = imeOptions.keyboardType;
                    if (i2 == 1) {
                        editorInfo.inputType = 1;
                    } else if (i2 == 2) {
                        editorInfo.inputType = 1;
                        editorInfo.imeOptions = Integer.MIN_VALUE | i;
                    } else if (i2 == 3) {
                        editorInfo.inputType = 2;
                    } else if (i2 == 4) {
                        editorInfo.inputType = 3;
                    } else if (i2 == 5) {
                        editorInfo.inputType = 17;
                    } else if (i2 == 6) {
                        editorInfo.inputType = 33;
                    } else if (i2 == 7) {
                        editorInfo.inputType = EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
                    } else if (i2 == 8) {
                        editorInfo.inputType = 18;
                    } else {
                        if (i2 != 9) {
                            a$$ExternalSyntheticBUOutline0.m$1("Invalid Keyboard Type");
                            return null;
                        }
                        editorInfo.inputType = 8194;
                    }
                    if (!z) {
                        int i6 = editorInfo.inputType;
                        if ((i6 & 1) == 1) {
                            editorInfo.inputType = i6 | PKIFailureInfo.unsupportedVersion;
                            if (i4 == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                    }
                    i3 = editorInfo.inputType;
                    if ((i3 & 1) == 1) {
                        int i7 = imeOptions.capitalization;
                        if (i7 == 1) {
                            editorInfo.inputType = i3 | 4096;
                        } else if (i7 == 2) {
                            editorInfo.inputType = i3 | PKIFailureInfo.certRevoked;
                        } else if (i7 == 3) {
                            editorInfo.inputType = i3 | 16384;
                        }
                        if (imeOptions.autoCorrect) {
                            editorInfo.inputType |= 32768;
                        }
                    }
                    long j2 = textFieldValue.selection;
                    int i52 = TextRange.$r8$clinit;
                    editorInfo.initialSelStart = (int) (j2 >> 32);
                    editorInfo.initialSelEnd = (int) (j2 & BodyPartID.bodyIdMax);
                    SizeKt.setInitialSurroundingText(editorInfo, textFieldValue.annotatedString.text);
                    editorInfo.imeOptions |= 33554432;
                    if (EmojiCompat.isConfigured()) {
                        EmojiCompat.get().updateEditorInfo(editorInfo);
                    }
                    RecordingInputConnection recordingInputConnection2 = new RecordingInputConnection(textInputServiceAndroid.state, new Toolbar.AnonymousClass1(textInputServiceAndroid), textInputServiceAndroid.imeOptions.autoCorrect);
                    textInputServiceAndroid.ics.add(new WeakReference(recordingInputConnection2));
                    return recordingInputConnection2;
                }
                i = 6;
                editorInfo.imeOptions = i;
                i2 = imeOptions.keyboardType;
                if (i2 == 1) {
                }
                if (!z) {
                }
                i3 = editorInfo.inputType;
                if ((i3 & 1) == 1) {
                }
                long j22 = textFieldValue.selection;
                int i522 = TextRange.$r8$clinit;
                editorInfo.initialSelStart = (int) (j22 >> 32);
                editorInfo.initialSelEnd = (int) (j22 & BodyPartID.bodyIdMax);
                SizeKt.setInitialSurroundingText(editorInfo, textFieldValue.annotatedString.text);
                editorInfo.imeOptions |= 33554432;
                if (EmojiCompat.isConfigured()) {
                }
                RecordingInputConnection recordingInputConnection22 = new RecordingInputConnection(textInputServiceAndroid.state, new Toolbar.AnonymousClass1(textInputServiceAndroid), textInputServiceAndroid.imeOptions.autoCorrect);
                textInputServiceAndroid.ics.add(new WeakReference(recordingInputConnection22));
                return recordingInputConnection22;
            }
        } else {
            SessionMutex$Session sessionMutex$Session2 = (SessionMutex$Session) androidPlatformTextInputSession.methodSessionMutex.get();
            InputMethodSession inputMethodSession = (InputMethodSession) (sessionMutex$Session2 != null ? sessionMutex$Session2.value : null);
            if (inputMethodSession != null) {
                synchronized (inputMethodSession.lock) {
                    if (inputMethodSession.disposed) {
                        return null;
                    }
                    InputConnection createInputConnection = inputMethodSession.request.createInputConnection(editorInfo);
                    WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1 = new WindowsKt$onNextDraw$1(inputMethodSession, 11);
                    InputConnection nullableInputConnectionWrapperApi34 = Build.VERSION.SDK_INT >= 34 ? new NullableInputConnectionWrapperApi34(createInputConnection, windowsKt$onNextDraw$1) : new NullableInputConnectionWrapperApi25(createInputConnection, windowsKt$onNextDraw$1);
                    inputMethodSession.connections.add(new androidx.compose.ui.node.WeakReference(nullableInputConnectionWrapperApi34));
                    return nullableInputConnectionWrapperApi34;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.getClass();
        DisplayCompat.onCreateVirtualViewTranslationRequests(androidContentCaptureManager, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttached$delegate.setValue(Boolean.FALSE);
        this.insetsListener.onViewDetachedFromWindow(this);
        View view = this.frameRateCategoryView;
        if (isArrEnabled$ui() && view != null) {
            removeView(view);
        }
        MutableObjectList mutableObjectList = composeViews;
        synchronized (mutableObjectList) {
            mutableObjectList.remove(this);
        }
        get_composeViewContext().decrementViewCount$ui();
        SnapshotStateObserver snapshotStateObserver = (SnapshotStateObserver) this.snapshotObserver.application;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
        Lifecycle lifecycle = get_composeViewContext().lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        SimpleActor simpleActor = this._autofill;
        if (simpleActor != null) {
            AutofillCallback autofillCallback = AutofillCallback.INSTANCE;
            autofillCallback.getClass();
            ((AutofillManager) simpleActor.messageQueue).unregisterCallback(autofillCallback);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.isInUse = false;
        }
        this.lifecycleRetainedValuesStoreOwnerEntry = null;
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            ((MutableObjectList) this.semanticsOwner.remainingMessages).remove(androidAutofillManager);
            this.focusOwner.listeners.remove(androidAutofillManager);
        }
        RectManager rectManager = this.rectManager;
        rectManager.isScreenOrWindowDirty = rectManager.throttledCallbacks.m954updateOffsetsLDcG7Xg(0L, 0L, null, 0, 0);
        this.rectManager.dispatchCallbacks();
        RectManager rectManager2 = this.rectManager;
        Handlers$$ExternalSyntheticLambda2 handlers$$ExternalSyntheticLambda2 = rectManager2.dispatchToken;
        if (handlers$$ExternalSyntheticLambda2 != null) {
            rectManager2.executeDelayed.removeCallbacks(handlers$$ExternalSyntheticLambda2);
            rectManager2.dispatchToken = null;
        }
        this.focusOwner.listeners.remove(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void onEndApplyChanges() {
        MutableObjectList mutableObjectList;
        Object[] objArr;
        if (this.observationClearRequested) {
            SnapshotStateObserver snapshotStateObserver = (SnapshotStateObserver) this.snapshotObserver.application;
            synchronized (snapshotStateObserver.observedScopeMapsLock) {
                try {
                    MutableVector mutableVector = snapshotStateObserver.observedScopeMaps;
                    int i = mutableVector.size;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = mutableVector.content;
                        if (i2 >= i) {
                            break;
                        }
                        SnapshotStateObserver.ObservedScopeMap observedScopeMap = (SnapshotStateObserver.ObservedScopeMap) objArr[i2];
                        observedScopeMap.removeScopeIf();
                        if (!observedScopeMap.scopeToValues.isNotEmpty()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = mutableVector.content;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    mutableVector.size = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            MutableIntSet mutableIntSet = androidAutofillManager.currentlyDisplayedIDs;
            if (mutableIntSet._size == 0 && androidAutofillManager.pendingAutofillCommit) {
                ((AutofillManager) androidAutofillManager.platformAutofillManager.imageLoader).commit();
                androidAutofillManager.pendingAutofillCommit = false;
            }
            if (mutableIntSet._size != 0) {
                androidAutofillManager.pendingAutofillCommit = true;
            }
        }
        while (this.endApplyChangesListeners.isNotEmpty() && this.endApplyChangesListeners.get(0) != null) {
            int i5 = this.endApplyChangesListeners._size;
            int i6 = 0;
            while (true) {
                mutableObjectList = this.endApplyChangesListeners;
                if (i6 < i5) {
                    Function0 function0 = (Function0) mutableObjectList.get(i6);
                    this.endApplyChangesListeners.set(i6, null);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            mutableObjectList.removeRange(0, i5);
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public final void onFocusChanged(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        NodeChain nodeChain;
        boolean z;
        NodeChain nodeChain2;
        boolean z2;
        if (focusTargetNode != null) {
            FocusTargetNode focusTargetNode3 = focusTargetNode;
            if (!focusTargetNode3.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetNode3.getNode();
            LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(focusTargetNode);
            MutableScatterSet mutableScatterSet = null;
            ArrayList arrayList = null;
            while (requireLayoutNode != null) {
                if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                            Modifier.Node node2 = node;
                            MutableVector mutableVector = null;
                            while (node2 != null) {
                                if (node2 instanceof IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(node2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (node2.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0 && (node2 instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                        if ((node3.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                            i++;
                                            if (i == 1) {
                                                node2 = node3;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                                }
                                                if (node2 != null) {
                                                    mutableVector.add(node2);
                                                    node2 = null;
                                                }
                                                mutableVector.add(node3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                node2 = DepthSortedSetKt.access$pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui();
                node = (requireLayoutNode == null || (nodeChain2 = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain2.tail;
            }
            if (arrayList == null) {
                return;
            }
            if (focusTargetNode2 != null) {
                if (!focusTargetNode2.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node4 = focusTargetNode2.getNode();
                LayoutNode requireLayoutNode2 = DepthSortedSetKt.requireLayoutNode(focusTargetNode2);
                MutableScatterSet mutableScatterSet2 = null;
                while (requireLayoutNode2 != null) {
                    if ((((Modifier.Node) requireLayoutNode2.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                        while (node4 != null) {
                            if ((node4.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                Modifier.Node node5 = node4;
                                MutableVector mutableVector2 = null;
                                while (node5 != null) {
                                    if (node5 instanceof IndirectPointerInputModifierNode) {
                                        if (mutableScatterSet2 == null) {
                                            MutableScatterSet mutableScatterSet3 = ScatterSetKt.EmptyScatterSet;
                                            mutableScatterSet2 = new MutableScatterSet();
                                        }
                                        mutableScatterSet2.add(node5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (node5.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0 && (node5 instanceof DelegatingNode)) {
                                        int i2 = 0;
                                        for (Modifier.Node node6 = ((DelegatingNode) node5).delegate; node6 != null; node6 = node6.getChild$ui()) {
                                            if ((node6.getKindSet$ui() & PKIFailureInfo.badSenderNonce) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    node5 = node6;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(0, new Modifier.Node[16]);
                                                    }
                                                    if (node5 != null) {
                                                        mutableVector2.add(node5);
                                                        node5 = null;
                                                    }
                                                    mutableVector2.add(node6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    node5 = DepthSortedSetKt.access$pop(mutableVector2);
                                }
                            }
                            node4 = node4.getParent$ui();
                        }
                    }
                    requireLayoutNode2 = requireLayoutNode2.getParent$ui();
                    node4 = (requireLayoutNode2 == null || (nodeChain = requireLayoutNode2.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
                }
                mutableScatterSet = mutableScatterSet2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                IndirectPointerInputModifierNode indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) arrayList.get(i3);
                if (!(mutableScatterSet != null ? mutableScatterSet.contains(indirectPointerInputModifierNode) : false)) {
                    indirectPointerInputModifierNode.onCancelIndirectPointerInput();
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        updatePositionCacheAndDispatch();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        updateConfiguration(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
            this.onMeasureConstraints = null;
            updatePositionCacheAndDispatch();
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    public final void onLayoutChange(LayoutNode layoutNode) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        androidComposeViewAccessibilityDelegateCompat.currentSemanticsNodesInvalidated = true;
        if (androidComposeViewAccessibilityDelegateCompat.isEnabled$ui()) {
            androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.currentSemanticsNodesInvalidated = true;
        if (androidContentCaptureManager.isEnabled$ui()) {
            androidContentCaptureManager.boundsUpdateChannel.mo1159trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        throw r9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        FileMetadata fileMetadata = this.measureAndLayoutDelegate;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            boolean isAttachedToWindow = isAttachedToWindow();
            LayoutNode layoutNode = this.root;
            if (!isAttachedToWindow) {
                invalidateLayoutNodeMeasurement(layoutNode);
            }
            long m913convertMeasureSpecI7RO_PI = m913convertMeasureSpecI7RO_PI(i);
            ULong.Companion companion = ULong.Companion;
            int i3 = (int) (m913convertMeasureSpecI7RO_PI >>> 32);
            int i4 = (int) (m913convertMeasureSpecI7RO_PI & BodyPartID.bodyIdMax);
            long m913convertMeasureSpecI7RO_PI2 = m913convertMeasureSpecI7RO_PI(i2);
            long m1464fitPrioritizingHeightZbe2FdA = DimensionKt.m1464fitPrioritizingHeightZbe2FdA(i3, i4, (int) (m913convertMeasureSpecI7RO_PI2 >>> 32), (int) (m913convertMeasureSpecI7RO_PI2 & BodyPartID.bodyIdMax));
            Constraints constraints = this.onMeasureConstraints;
            if (constraints == null) {
                this.onMeasureConstraints = new Constraints(m1464fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else if (!Constraints.m1019equalsimpl0(constraints.value, m1464fitPrioritizingHeightZbe2FdA)) {
                this.wasMeasuredWithMultipleConstraints = true;
            }
            fileMetadata.m4345updateRootConstraintsBRTryo0(m1464fitPrioritizingHeightZbe2FdA);
            fileMetadata.measureOnly();
            setMeasuredDimension(layoutNode.getWidth(), layoutNode.getHeight());
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(layoutNode.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(layoutNode.getHeight(), 1073741824));
                Trace.endSection();
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            AndroidAutofillManager androidAutofillManager = this._autofillManager;
            if (androidAutofillManager != null) {
                LayoutNode layoutNode = (LayoutNode) androidAutofillManager.semanticsOwner.scope;
                AutofillId autofillId = androidAutofillManager.rootAutofillId;
                String str = androidAutofillManager.packageName;
                RectManager rectManager = androidAutofillManager.rectManager;
                zzadx.populate(viewStructure, layoutNode, autofillId, str, rectManager);
                Object[] objArr = ObjectListKt.EmptyArray;
                MutableObjectList mutableObjectList = new MutableObjectList(2);
                mutableObjectList.add(layoutNode);
                mutableObjectList.add(viewStructure);
                while (mutableObjectList.isNotEmpty()) {
                    Object removeAt = mutableObjectList.removeAt(mutableObjectList._size - 1);
                    removeAt.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) removeAt;
                    Object removeAt2 = mutableObjectList.removeAt(mutableObjectList._size - 1);
                    removeAt2.getClass();
                    List children$ui = ((LayoutNode) removeAt2).getChildren$ui();
                    int size = children$ui.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        LayoutNode layoutNode2 = (LayoutNode) ((MutableVector.MutableVectorList) children$ui).get(i2);
                        if (!layoutNode2.isDeactivated && layoutNode2.isAttached() && layoutNode2.isPlaced()) {
                            SemanticsConfiguration semanticsConfiguration = layoutNode2.getSemanticsConfiguration();
                            if (semanticsConfiguration != null) {
                                MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
                                if (mutableScatterMap.contains(SemanticsActions.OnAutofillText) || mutableScatterMap.contains(SemanticsActions.OnFillData) || mutableScatterMap.contains(SemanticsProperties.ContentType) || mutableScatterMap.contains(SemanticsProperties.ContentDataType)) {
                                    ViewStructure newChild = AutofillApi26Helper.newChild(viewStructure2, AutofillApi26Helper.addChildCount(viewStructure2));
                                    zzadx.populate(newChild, layoutNode2, autofillId, str, rectManager);
                                    mutableObjectList.add(layoutNode2);
                                    mutableObjectList.add(newChild);
                                }
                            }
                            mutableObjectList.add(layoutNode2);
                            mutableObjectList.add(viewStructure2);
                        }
                    }
                }
            }
            SimpleActor simpleActor = this._autofill;
            if (simpleActor != null) {
                AndroidAutofill_androidKt.populateViewStructure(simpleActor, viewStructure);
            }
        }
    }

    public final void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        FileMetadata fileMetadata = this.measureAndLayoutDelegate;
        if (!z) {
            if (fileMetadata.requestRemeasure(layoutNode, z2) && z3) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        GrpcMethod grpcMethod = (GrpcMethod) fileMetadata.size;
        LayoutNode layoutNode2 = layoutNode.lookaheadRoot;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        if (layoutNode2 == null) {
            InlineClassHelperKt.throwIllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = layoutNodeLayoutDelegate.layoutState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                if (!layoutNodeLayoutDelegate.lookaheadMeasurePending || z2) {
                    layoutNodeLayoutDelegate.lookaheadMeasurePending = true;
                    layoutNodeLayoutDelegate.measurePassDelegate.measurePending = true;
                    if (layoutNode.isDeactivated) {
                        return;
                    }
                    if ((Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) || FileMetadata.getCanAffectParentInLookahead(layoutNode)) && ((parent$ui = layoutNode.getParent$ui()) == null || !parent$ui.layoutDelegate.lookaheadMeasurePending)) {
                        grpcMethod.add(layoutNode, Invalidation.LookaheadMeasurement);
                    } else if ((layoutNode.isPlaced() || FileMetadata.getCanAffectPlacedParent(layoutNode)) && ((parent$ui2 = layoutNode.getParent$ui()) == null || !parent$ui2.getMeasurePending$ui())) {
                        grpcMethod.add(layoutNode, Invalidation.Measurement);
                    }
                    if (fileMetadata.isDirectory || !z3) {
                        return;
                    }
                    scheduleMeasureAndLayout(layoutNode);
                    return;
                }
                return;
            }
        }
        ((MutableVector) fileMetadata.lastAccessedAtMillis).add(new MeasureAndLayoutDelegate$PostponedRequest(layoutNode, true, z2));
    }

    public final void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.layoutDelegate;
        FileMetadata fileMetadata = this.measureAndLayoutDelegate;
        if (!z) {
            fileMetadata.getClass();
            int ordinal = layoutNodeLayoutDelegate.layoutState.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            LayoutNode parent$ui = layoutNode.getParent$ui();
            boolean z3 = parent$ui == null || parent$ui.isPlaced();
            if (!z2) {
                if (layoutNode.getMeasurePending$ui()) {
                    return;
                }
                if (layoutNode.getLayoutPending$ui() && layoutNode.isPlaced() == z3 && layoutNode.isPlaced() == layoutNodeLayoutDelegate.measurePassDelegate.isPlacedByParent) {
                    return;
                }
            }
            MeasurePassDelegate measurePassDelegate = layoutNodeLayoutDelegate.measurePassDelegate;
            measurePassDelegate.layoutPending = true;
            measurePassDelegate.layoutPendingForAlignment = true;
            if (!layoutNode.isDeactivated && measurePassDelegate.isPlacedByParent && z3) {
                if ((parent$ui == null || !parent$ui.getLayoutPending$ui()) && (parent$ui == null || !parent$ui.getMeasurePending$ui())) {
                    ((GrpcMethod) fileMetadata.size).add(layoutNode, Invalidation.Placement);
                }
                if (fileMetadata.isDirectory) {
                    return;
                }
                scheduleMeasureAndLayout(null);
                return;
            }
            return;
        }
        GrpcMethod grpcMethod = (GrpcMethod) fileMetadata.size;
        int ordinal2 = layoutNodeLayoutDelegate.layoutState.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
        }
        if ((layoutNodeLayoutDelegate.lookaheadMeasurePending || layoutNodeLayoutDelegate.lookaheadLayoutPending) && !z2) {
            return;
        }
        layoutNodeLayoutDelegate.lookaheadLayoutPending = true;
        layoutNodeLayoutDelegate.lookaheadLayoutPendingForAlignment = true;
        MeasurePassDelegate measurePassDelegate2 = layoutNodeLayoutDelegate.measurePassDelegate;
        measurePassDelegate2.layoutPending = true;
        measurePassDelegate2.layoutPendingForAlignment = true;
        if (layoutNode.isDeactivated) {
            return;
        }
        LayoutNode parent$ui2 = layoutNode.getParent$ui();
        if (Intrinsics.areEqual(layoutNode.isPlacedInLookahead(), Boolean.TRUE) && ((parent$ui2 == null || !parent$ui2.layoutDelegate.lookaheadMeasurePending) && (parent$ui2 == null || !parent$ui2.layoutDelegate.lookaheadLayoutPending))) {
            grpcMethod.add(layoutNode, Invalidation.LookaheadPlacement);
        } else if (layoutNode.isPlaced() && ((parent$ui2 == null || !parent$ui2.getLayoutPending$ui()) && (parent$ui2 == null || !parent$ui2.getMeasurePending$ui()))) {
            grpcMethod.add(layoutNode, Invalidation.Placement);
        }
        if (fileMetadata.isDirectory) {
            return;
        }
        scheduleMeasureAndLayout(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        androidx.compose.ui.input.pointer.PointerIcon pointerIcon;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (pointerIcon = this.pointerIconService.currentStylusHoverIcon) == null) ? super.onResolvePointerIcon(motionEvent, i) : AndroidComposeViewVerificationHelperMethodsN.toAndroidPointerIcon(getContext(), pointerIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        CancellationHandle cancellationHandle;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(TestTagKt.getIsShowingLayoutBounds());
        }
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
            frameEndScheduler.getClass();
            Extras.Key key = retainedValuesStoreEntry._retainedValuesStore;
            ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) key.f61default;
            if (!managedRetainedValuesStore.isEnabled || managedRetainedValuesStore.isContentComposed) {
                return;
            }
            try {
                cancellationHandle = ((Wrapper_androidKt$setContent$1) frameEndScheduler).$tmp0.scheduleFrameEndCallback(new KeyHandle$keyPair$2(retainedValuesStoreEntry, 3));
            } catch (CancellationException unused) {
                ManagedRetainedValuesStore managedRetainedValuesStore2 = (ManagedRetainedValuesStore) key.f61default;
                if (!managedRetainedValuesStore2.isDisposed) {
                    if (managedRetainedValuesStore2.isContentComposed) {
                        PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    managedRetainedValuesStore2.purgeUnusedExitedValues();
                    managedRetainedValuesStore2.isContentComposed = true;
                }
                cancellationHandle = null;
            }
            CancellationHandle cancellationHandle2 = retainedValuesStoreEntry.endRetainCancellationHandle;
            if (cancellationHandle2 != null) {
                cancellationHandle2.cancel();
            }
            retainedValuesStoreEntry.endRetainCancellationHandle = cancellationHandle;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            int[] iArr = FocusInteropUtils_androidKt.tempCoordinates;
            LayoutDirection layoutDirection = i != 0 ? i != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            this.layoutDirection$delegate.setValue(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, this.semanticsOwner, this.coroutineContext, consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        updatePositionCacheAndDispatch();
    }

    public final void onSemanticsChange() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        androidComposeViewAccessibilityDelegateCompat.currentSemanticsNodesInvalidated = true;
        Handler handler = androidComposeViewAccessibilityDelegateCompat.view.getHandler();
        if (androidComposeViewAccessibilityDelegateCompat.isEnabled$ui() && !androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges && handler != null) {
            androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = true;
            handler.post(androidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.currentSemanticsNodesInvalidated = true;
        Handler handler2 = androidContentCaptureManager.view.getHandler();
        if (!androidContentCaptureManager.isEnabled$ui() || androidContentCaptureManager.checkingForSemanticsChanges || handler2 == null) {
            return;
        }
        androidContentCaptureManager.checkingForSemanticsChanges = true;
        handler2.post(androidContentCaptureManager.contentCaptureChangeChecker);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            ManagedRetainedValuesStore managedRetainedValuesStore = (ManagedRetainedValuesStore) retainedValuesStoreEntry._retainedValuesStore.f61default;
            if (managedRetainedValuesStore.isEnabled && !managedRetainedValuesStore.isContentComposed) {
                CancellationHandle cancellationHandle = retainedValuesStoreEntry.endRetainCancellationHandle;
                if (cancellationHandle != null) {
                    cancellationHandle.cancel();
                }
                retainedValuesStoreEntry.endRetainCancellationHandle = null;
                return;
            }
            if (managedRetainedValuesStore.isDisposed) {
                return;
            }
            if (!managedRetainedValuesStore.isContentComposed) {
                PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!managedRetainedValuesStore.keptExitedValues.isEmpty()) {
                PreconditionsKt.throwIllegalStateException("Attempted to start retaining exited values with pending exited values");
            }
            managedRetainedValuesStore.isContentComposed = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this._inputModeManager.inputMode$delegate.setValue(new InputMode(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(android.util.LongSparseArray longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.getClass();
        DisplayCompat.onVirtualViewTranslationResponses(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean isShowingLayoutBounds;
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (isShowingLayoutBounds = TestTagKt.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateLayers(this.root);
    }

    public final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            CalculateMatrixToWindowApi29 calculateMatrixToWindowApi29 = this.matrixToWindow;
            float[] fArr = this.viewToWindowMatrix;
            calculateMatrixToWindowApi29.m925calculateMatrixToWindowEL8BTi8(this, fArr);
            TestTagKt.m942invertToJiSxe2E(fArr, this.windowToViewMatrix);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.tmpPositionArray;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.windowPosition = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & BodyPartID.bodyIdMax);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i);
        int i2 = focusDirection != null ? focusDirection.value : 7;
        Rect rect2 = rect != null ? new Rect(rect.left, rect.top, rect.right, rect.bottom) : null;
        ContourLayout$matchParentX$1 contourLayout$matchParentX$1 = new ContourLayout$matchParentX$1(i2, 4);
        FocusOwnerImpl focusOwnerImpl = this.focusOwner;
        Boolean m596focusSearchULY8qGw = focusOwnerImpl.m596focusSearchULY8qGw(i2, rect2, contourLayout$matchParentX$1);
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(m596focusSearchULY8qGw, bool) || Intrinsics.areEqual(focusOwnerImpl.m596focusSearchULY8qGw(i2, null, new ContourLayout$matchParentX$1(i2, 5)), bool)) {
            return true;
        }
        if (hasFocus() && FocusOwnerImplKt.m601is1dFocusSearch3ESFkO8(i2)) {
            return focusOwnerImpl.m598resetFocus3ESFkO8(i2);
        }
        return false;
    }

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    public final boolean m919requestOwnerFocus7o62pno() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, null);
    }

    public final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock) {
                if (!this.wasMeasuredWithMultipleConstraints) {
                    LayoutNode parent$ui = layoutNode.getParent$ui();
                    if (parent$ui == null) {
                        break;
                    }
                    long j = ((InnerNodeCoordinator) parent$ui.nodes.innerCoordinator).measurementConstraints;
                    if (Constraints.m1023getHasFixedWidthimpl(j) && Constraints.m1022getHasFixedHeightimpl(j)) {
                        break;
                    }
                }
                layoutNode = layoutNode.getParent$ui();
            }
            if (layoutNode == this.root) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    public final long m920screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (this.windowPosition & BodyPartID.bodyIdMax));
        return Matrix.m700mapMKHz9U((Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.windowToViewMatrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m921sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        Object obj;
        PointerInputEventData pointerInputEventData;
        int m1473processBIzXfog;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            LazyWindowInfo lazyWindowInfo = get_composeViewContext().windowInfo;
            int metaState = motionEvent.getMetaState();
            lazyWindowInfo.getClass();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = WindowInfoImpl.GlobalKeyboardModifiers;
            parcelableSnapshotMutableState = WindowInfoImpl.GlobalKeyboardModifiers;
            parcelableSnapshotMutableState.setValue(new PointerKeyboardModifiers(metaState));
        }
        MotionEventAdapter motionEventAdapter = this.motionEventAdapter;
        Recorder.AnonymousClass1 convertToPointerInputEvent$ui = motionEventAdapter.convertToPointerInputEvent$ui(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        AndroidSystemCallbacks androidSystemCallbacks = this.pointerInputEventProcessor;
        if (convertToPointerInputEvent$ui == null) {
            if (!androidSystemCallbacks.shutdown) {
                ((LongSparseArray) ((MemoryCacheService) androidSystemCallbacks.componentCallbacks).imageLoader).clear();
                ((HitPathTracker) androidSystemCallbacks.activityCallbacks).processCancel();
            }
            return PointerEventKt.ProcessResult(false, false, false);
        }
        List pointers = convertToPointerInputEvent$ui.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = pointers.get(size);
                if (((PointerInputEventData) obj).getDown() && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            pointerInputEventData = (PointerInputEventData) obj;
            if (pointerInputEventData != null) {
                this.lastDownPointerPosition = pointerInputEventData.m823getPositionF1C5BW0();
            }
            m1473processBIzXfog = androidSystemCallbacks.m1473processBIzXfog(convertToPointerInputEvent$ui, this, isInBounds(motionEvent));
            convertToPointerInputEvent$ui.setMotionEvent();
            if ((actionMasked == 0 && actionMasked != 5) || (m1473processBIzXfog & 1) != 0) {
                return m1473processBIzXfog;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            motionEventAdapter.activeHoverIds.delete(pointerId);
            motionEventAdapter.motionEventToComposePointerIdMap.delete(pointerId);
            return m1473processBIzXfog;
        }
        obj = null;
        pointerInputEventData = (PointerInputEventData) obj;
        if (pointerInputEventData != null) {
        }
        m1473processBIzXfog = androidSystemCallbacks.m1473processBIzXfog(convertToPointerInputEvent$ui, this, isInBounds(motionEvent));
        convertToPointerInputEvent$ui.setMotionEvent();
        if (actionMasked == 0) {
        }
        int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
        motionEventAdapter.activeHoverIds.delete(pointerId2);
        motionEventAdapter.motionEventToComposePointerIdMap.delete(pointerId2);
        return m1473processBIzXfog;
    }

    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long m916localToScreenMKHz9U = m916localToScreenMKHz9U((Float.floatToRawIntBits(pointerCoords.y) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (m916localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (m916localToScreenMKHz9U & BodyPartID.bodyIdMax));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        Recorder.AnonymousClass1 convertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(obtain, this);
        convertToPointerInputEvent$ui.getClass();
        this.pointerInputEventProcessor.m1473processBIzXfog(convertToPointerInputEvent$ui, this, true);
        obtain.recycle();
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.composeAccessibilityDelegate.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    public final void setComposeViewContext(ComposeViewContext composeViewContext) {
        if (this.coroutineContext != composeViewContext.compositionContext.getEffectCoroutineContext() && !((MutableVector.MutableVectorList) this.root.getChildren$ui()).isEmpty()) {
            InlineClassHelperKt.throwIllegalArgumentException("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
        Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            ComposeViewContext composeViewContext2 = get_composeViewContext();
            if (composeViewContext != composeViewContext2) {
                if (isAttachedToWindow()) {
                    composeViewContext2.decrementViewCount$ui();
                    composeViewContext.incrementViewCount$ui();
                }
                this._composeViewContext$delegate.setValue(composeViewContext);
                setCoroutineContext(composeViewContext.compositionContext.getEffectCoroutineContext());
            }
        } finally {
            zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration$delegate.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    public final void setFrameEndScheduler$ui(LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
        this.frameEndScheduler = frameEndScheduler;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnReadyForComposition(Function1<? super ComposeViewContext, Unit> function1) {
        ((Boolean) this.derivedIsAttached$delegate.getValue()).getClass();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            function1.invoke(get_composeViewContext());
        } else {
            this.onReadyForComposition = function1;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m922setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        this.primaryDirectionalMotionAxisOverride = indirectPointerEventPrimaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public void setUncaughtExceptionHandler(RootForTest$UncaughtExceptionHandler rootForTest$UncaughtExceptionHandler) {
        this.measureAndLayoutDelegate.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest$UncaughtExceptionHandler rootForTest$UncaughtExceptionHandler) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void textInputSession(Function2 function2, ContinuationImpl continuationImpl) {
        AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        int i;
        if (continuationImpl instanceof AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (AndroidComposeView$textInputSession$1) continuationImpl;
            int i2 = androidComposeView$textInputSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidComposeView$textInputSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidComposeView$textInputSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidComposeView$textInputSession$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidComposeView$snapshotObserver$1 androidComposeView$snapshotObserver$1 = new AndroidComposeView$snapshotObserver$1(this, 2);
                    androidComposeView$textInputSession$1.label = 1;
                    if (JobKt.coroutineScope(new FlowQuery$asFlow$1(androidComposeView$snapshotObserver$1, this.textInputSessionMutex, function2, (Continuation) null, 1), androidComposeView$textInputSession$1) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, continuationImpl);
        Object obj2 = androidComposeView$textInputSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidComposeView$textInputSession$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    public final void updateConfiguration(Configuration configuration) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        Configuration configuration2 = (Configuration) this.configuration$delegate.getValue();
        if (Intrinsics.areEqual(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            this.density$delegate.setValue(Strings.Density(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (parcelableSnapshotMutableState = this._windowInfo._containerSize) == null) {
            return;
        }
        parcelableSnapshotMutableState.setValue(zzagj.calculateWindowSize(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updatePositionCacheAndDispatch() {
        boolean z;
        View view;
        float[] fArr;
        int i;
        int[] iArr = this.tmpPositionArray;
        getLocationOnScreen(iArr);
        long j = this.globalPosition;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & BodyPartID.bodyIdMax);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = (BodyPartID.bodyIdMax & iArr[1]) | (i4 << 32);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                MutableVector mutableVector = this.root.get_children$ui();
                Object[] objArr = mutableVector.content;
                int i5 = mutableVector.size;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((LayoutNode) objArr[i6]).layoutDelegate.measurePassDelegate.requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
                }
                z = true;
                recalculateWindowPosition();
                view = this._rootView;
                if (view == null) {
                    view = getRootView();
                    this._rootView = view;
                }
                long j2 = this.globalPosition;
                long m1344roundk4lQ0M = PlatformKt.m1344roundk4lQ0M(this.windowPosition);
                int width = view.getWidth();
                int height = view.getHeight();
                RectManager rectManager = this.rectManager;
                rectManager.getClass();
                fArr = this.viewToWindowMatrix;
                if (fArr.length >= 16) {
                    i = 0;
                } else {
                    i = (((fArr[0] == 1.0f && fArr[1] == RecyclerView.DECELERATION_RATE && fArr[2] == RecyclerView.DECELERATION_RATE && fArr[4] == RecyclerView.DECELERATION_RATE && fArr[5] == 1.0f && fArr[6] == RecyclerView.DECELERATION_RATE && fArr[8] == RecyclerView.DECELERATION_RATE && fArr[9] == RecyclerView.DECELERATION_RATE && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == RecyclerView.DECELERATION_RATE && fArr[13] == RecyclerView.DECELERATION_RATE && fArr[14] == RecyclerView.DECELERATION_RATE && fArr[15] == 1.0f) ? 1 : 0);
                }
                ThrottledCallbacks throttledCallbacks = rectManager.throttledCallbacks;
                if ((i & 2) != 0) {
                    fArr = null;
                }
                rectManager.isScreenOrWindowDirty = !throttledCallbacks.m954updateOffsetsLDcG7Xg(j2, m1344roundk4lQ0M, fArr, width, height) || rectManager.isScreenOrWindowDirty;
                this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
                rectManager.dispatchCallbacks();
            }
        }
        z = false;
        recalculateWindowPosition();
        view = this._rootView;
        if (view == null) {
        }
        long j22 = this.globalPosition;
        long m1344roundk4lQ0M2 = PlatformKt.m1344roundk4lQ0M(this.windowPosition);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        RectManager rectManager2 = this.rectManager;
        rectManager2.getClass();
        fArr = this.viewToWindowMatrix;
        if (fArr.length >= 16) {
        }
        ThrottledCallbacks throttledCallbacks2 = rectManager2.throttledCallbacks;
        if ((i & 2) != 0) {
        }
        rectManager2.isScreenOrWindowDirty = !throttledCallbacks2.m954updateOffsetsLDcG7Xg(j22, m1344roundk4lQ0M2, fArr, width2, height2) || rectManager2.isScreenOrWindowDirty;
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        rectManager2.dispatchCallbacks();
    }

    public final void voteFrameRate(float f) {
        if (isArrEnabled$ui()) {
            if (f > RecyclerView.DECELERATION_RATE) {
                if (Float.isNaN(this.currentFrameRate) || f > this.currentFrameRate) {
                    this.currentFrameRate = f;
                    return;
                }
                return;
            }
            if (f < RecyclerView.DECELERATION_RATE) {
                if (Float.isNaN(this.currentFrameRateCategory) || f < this.currentFrameRateCategory) {
                    this.currentFrameRateCategory = f;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        CalculateMatrixToWindowApi29 calculateMatrixToWindowApi29 = this.matrixToWindow;
        float[] fArr = this.viewToWindowMatrix;
        calculateMatrixToWindowApi29.m925calculateMatrixToWindowEL8BTi8(this, fArr);
        TestTagKt.m942invertToJiSxe2E(fArr, this.windowToViewMatrix);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long m700mapMKHz9U = Matrix.m700mapMKHz9U((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & BodyPartID.bodyIdMax), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m700mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m700mapMKHz9U & BodyPartID.bodyIdMax));
        this.windowPosition = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & BodyPartID.bodyIdMax);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        FocusOwnerImpl focusOwnerImpl = this.focusOwner;
        FocusTraversalKt.clearFocus(focusOwnerImpl.rootFocusNode, true);
        if (focusOwnerImpl.getActiveFocusTargetNode() != null) {
            FocusTargetNode activeFocusTargetNode = focusOwnerImpl.getActiveFocusTargetNode();
            focusOwnerImpl.setActiveFocusTargetNode(null);
            if (activeFocusTargetNode != null) {
                activeFocusTargetNode.dispatchFocusCallbacks$ui(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        }
    }
}
