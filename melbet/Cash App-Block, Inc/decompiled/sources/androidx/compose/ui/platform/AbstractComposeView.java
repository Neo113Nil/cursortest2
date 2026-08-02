package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Latch;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.Owner;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.room.util.DBUtil;
import androidx.savedstate.SavedStateRegistryOwner;
import app.cash.molecule.GatedFrameClock;
import app.cash.sqldelight.coroutines.FlowQuery$asFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.AFLogger$$ExternalSyntheticLambda0;
import com.bugsnag.android.BugsnagExitInfoPlugin$configureEventSynthesizer$2;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import kotlinx.coroutines.internal.ContextScope;
import papa.internal.ViewTreeObserversKt$onViewTreeObserverReady$1;

/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public WeakReference cachedViewTreeCompositionContext;
    public ComposeViewContext composeViewContext;
    public WrappedComposition composition;
    public boolean creatingComposition;
    public Function0 disposeViewCompositionStrategy;
    public boolean isTransitionGroupSet;
    public CompositionContext parentContext;
    public IBinder previousAttachedWindowToken;

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        int i2 = 1;
        setImportantForAccessibility(1);
        AndroidGraphicsContext.AnonymousClass2 anonymousClass2 = new AndroidGraphicsContext.AnonymousClass2(this, i2);
        addOnAttachStateChangeListener(anonymousClass2);
        ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0 = new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0(this);
        Countries.getPoolingContainerListenerHolder(this).listeners.add(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0);
        this.disposeViewCompositionStrategy = new BugsnagExitInfoPlugin$configureEventSynthesizer$2(i2, this, anonymousClass2, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$$ExternalSyntheticLambda0);
    }

    public abstract void Content(Composer composer, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void attachedToWindow() {
        if (isAttachedToWindow()) {
            IBinder windowToken = getWindowToken();
            AndroidComposeView androidComposeView = null;
            if (this.previousAttachedWindowToken != windowToken) {
                this.previousAttachedWindowToken = windowToken;
                this.cachedViewTreeCompositionContext = null;
            }
            if (this.composeViewContext == null) {
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(updateAutoCreatedComposeViewContext(TestTagKt.findViewTreeComposeViewRoot(this), androidComposeView.get_composeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    public final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void createComposition() {
        ComposeViewContext composeViewContext;
        View view;
        if (this.parentContext == null && !isAttachedToWindow() && ((composeViewContext = this.composeViewContext) == null || (view = composeViewContext.view) == null || !view.isAttachedToWindow())) {
            a$$ExternalSyntheticBUOutline0.m$1("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            ensureCompositionCreated();
        }
    }

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null && androidComposeView.composeViewContextIncrementedDuringInit) {
            androidComposeView.get_composeViewContext().decrementViewCount$ui();
            androidComposeView.composeViewContextIncrementedDuringInit = false;
        }
        WrappedComposition wrappedComposition = this.composition;
        if (wrappedComposition != null) {
            wrappedComposition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ComposeViewContext composeViewContext = this.composeViewContext;
                    if (composeViewContext == null) {
                        composeViewContext = resolveComposeViewContext();
                    }
                    this.composition = Wrapper_androidKt.setContent(this, composeViewContext, new ComposableLambdaImpl(new ComposeView$Content$1(this), true, 1003123809));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MutableScatterMap mutableScatterMap = WindowRecomposer_androidKt.animationScale;
        Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(this);
        View view = this;
        while (parentOrViewTreeDisjointParent instanceof View) {
            View view2 = (View) parentOrViewTreeDisjointParent;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            parentOrViewTreeDisjointParent = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new AFLogger$$ExternalSyntheticLambda0(this, 4));
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ComposeViewContext resolveComposeViewContext() {
        ComposeViewContext composeViewContext;
        ComposeViewContext composeViewContext2;
        ViewModelStoreOwner viewModelStoreOwner;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.get_composeViewContext();
                View findViewTreeComposeViewRoot = TestTagKt.findViewTreeComposeViewRoot(this);
                composeViewContext2 = TestTagKt.getComposeViewContext(findViewTreeComposeViewRoot);
                if (composeViewContext2 == null) {
                    return updateAutoCreatedComposeViewContext(findViewTreeComposeViewRoot, composeViewContext2);
                }
                CompositionContext resolveParentCompositionContext = resolveParentCompositionContext();
                LifecycleOwner lifecycleOwner = DBUtil.get(findViewTreeComposeViewRoot);
                if (lifecycleOwner == null) {
                    lifecycleOwner = composeViewContext != null ? composeViewContext.lifecycleOwner : null;
                    if (lifecycleOwner == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                SavedStateRegistryOwner savedStateRegistryOwner = Countries.get(findViewTreeComposeViewRoot);
                if (savedStateRegistryOwner == null) {
                    savedStateRegistryOwner = composeViewContext != null ? composeViewContext.savedStateRegistryOwner : null;
                    if (savedStateRegistryOwner == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                SavedStateRegistryOwner savedStateRegistryOwner2 = savedStateRegistryOwner;
                ViewModelStoreOwner viewModelStoreOwner2 = Strings.get(findViewTreeComposeViewRoot);
                if (viewModelStoreOwner2 == null) {
                    viewModelStoreOwner = composeViewContext != null ? composeViewContext.viewModelStoreOwner : null;
                } else {
                    viewModelStoreOwner = viewModelStoreOwner2;
                }
                ComposeViewContext composeViewContext3 = new ComposeViewContext(TestTagKt.getComposeViewContext(TestTagKt.findViewTreeComposeViewRoot(findViewTreeComposeViewRoot)), findViewTreeComposeViewRoot, resolveParentCompositionContext, lifecycleOwner2, savedStateRegistryOwner2, viewModelStoreOwner);
                findViewTreeComposeViewRoot.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(composeViewContext3));
                return composeViewContext3;
            }
        }
        composeViewContext = null;
        View findViewTreeComposeViewRoot2 = TestTagKt.findViewTreeComposeViewRoot(this);
        composeViewContext2 = TestTagKt.getComposeViewContext(findViewTreeComposeViewRoot2);
        if (composeViewContext2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CompositionContext resolveParentCompositionContext() {
        Recomposer recomposer;
        CoroutineContext coroutineContext;
        final PausableMonotonicFrameClock pausableMonotonicFrameClock;
        CompositionContext compositionContext = this.parentContext;
        if (compositionContext == null) {
            compositionContext = WindowRecomposer_androidKt.getCompositionContext(this);
            if (compositionContext == null) {
                Object parent = getParent();
                while (compositionContext == null && (parent instanceof View)) {
                    View view = (View) parent;
                    compositionContext = WindowRecomposer_androidKt.getCompositionContext(view);
                    parent = BundleKt.getParentOrViewTreeDisjointParent(view);
                }
            }
            if (compositionContext != null) {
                CompositionContext compositionContext2 = (!(compositionContext instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContext)._state.getValue()).compareTo(Recomposer.State.ShuttingDown) > 0) ? compositionContext : null;
                if (compositionContext2 != null) {
                    this.cachedViewTreeCompositionContext = new WeakReference(compositionContext2);
                }
            } else {
                compositionContext = null;
            }
            if (compositionContext == null) {
                WeakReference weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (compositionContext = (CompositionContext) weakReference.get()) == null || ((compositionContext instanceof Recomposer) && ((Recomposer.State) ((Recomposer) compositionContext)._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0)) {
                    compositionContext = null;
                }
                if (compositionContext == null) {
                    if (!isAttachedToWindow()) {
                        InlineClassHelperKt.throwIllegalStateException("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(this);
                    View view2 = this;
                    while (parentOrViewTreeDisjointParent instanceof View) {
                        View view3 = (View) parentOrViewTreeDisjointParent;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parentOrViewTreeDisjointParent = view3.getParent();
                    }
                    CompositionContext compositionContext3 = WindowRecomposer_androidKt.getCompositionContext(view2);
                    if (compositionContext3 == null) {
                        ((WindowRecomposerFactory$Companion$$ExternalSyntheticLambda0) WindowRecomposerPolicy.factory.get()).getClass();
                        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                        ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
                        emptyCoroutineContext.getClass();
                        key.getClass();
                        Lazy lazy = AndroidUiDispatcher.Main$delegate;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) AndroidUiDispatcher.currentThread.get();
                            if (coroutineContext == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        CoroutineContext plus = coroutineContext.plus(emptyCoroutineContext);
                        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) plus.get(NeverEqualPolicy.$$INSTANCE);
                        if (monotonicFrameClock != null) {
                            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(monotonicFrameClock);
                            Latch latch = pausableMonotonicFrameClock2.latch;
                            synchronized (latch.lock) {
                                latch._isOpen = false;
                                pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
                            }
                        } else {
                            pausableMonotonicFrameClock = 0;
                        }
                        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        CoroutineContext coroutineContext2 = (MotionDurationScale) plus.get(Alignment.Companion.$$INSTANCE);
                        if (coroutineContext2 == null) {
                            coroutineContext2 = new MotionDurationScaleImpl(view2.getContext().getApplicationContext());
                            ref$ObjectRef.element = coroutineContext2;
                        }
                        if (pausableMonotonicFrameClock != 0) {
                            emptyCoroutineContext = pausableMonotonicFrameClock;
                        }
                        CoroutineContext plus2 = plus.plus(emptyCoroutineContext).plus(coroutineContext2);
                        final Recomposer recomposer2 = new Recomposer(plus2);
                        synchronized (recomposer2.stateLock) {
                            recomposer2.frameClockPaused = true;
                        }
                        final ContextScope CoroutineScope = JobKt.CoroutineScope(plus2);
                        LifecycleOwner lifecycleOwner = DBUtil.get(view2);
                        Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
                        if (lifecycle == null) {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("ViewTreeLifecycleOwner not found from " + view2);
                            OptionalProvider$$ExternalSyntheticLambda0.m$1();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new ViewTreeObserversKt$onViewTreeObserverReady$1(view2, recomposer2));
                        lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                            public abstract /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[Lifecycle.Event.values().length];
                                    try {
                                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    try {
                                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                                    } catch (NoSuchFieldError unused5) {
                                    }
                                    try {
                                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                                    } catch (NoSuchFieldError unused6) {
                                    }
                                    try {
                                        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                                    } catch (NoSuchFieldError unused7) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                                boolean z;
                                CancellableContinuation cancellableContinuation = null;
                                switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
                                    case 1:
                                        JobKt.launch$default(ContextScope.this, null, CoroutineStart.UNDISPATCHED, new FlowQuery$asFlow$1(ref$ObjectRef, recomposer2, lifecycleOwner2, this, null, 2), 1);
                                        return;
                                    case 2:
                                        PausableMonotonicFrameClock pausableMonotonicFrameClock3 = pausableMonotonicFrameClock;
                                        if (pausableMonotonicFrameClock3 != null) {
                                            Latch latch2 = pausableMonotonicFrameClock3.latch;
                                            synchronized (latch2.lock) {
                                                try {
                                                    synchronized (latch2.lock) {
                                                        z = latch2._isOpen;
                                                    }
                                                    if (!z) {
                                                        ArrayList arrayList = (ArrayList) latch2.awaiters;
                                                        latch2.awaiters = (ArrayList) latch2.spareList;
                                                        latch2.spareList = arrayList;
                                                        latch2._isOpen = true;
                                                        int size = arrayList.size();
                                                        for (int i = 0; i < size; i++) {
                                                            Continuation continuation = (Continuation) arrayList.get(i);
                                                            Result.Companion companion = Result.Companion;
                                                            continuation.resumeWith(Unit.INSTANCE);
                                                        }
                                                        arrayList.clear();
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        Recomposer recomposer3 = recomposer2;
                                        synchronized (recomposer3.stateLock) {
                                            if (recomposer3.frameClockPaused) {
                                                recomposer3.frameClockPaused = false;
                                                cancellableContinuation = recomposer3.deriveStateLocked();
                                            }
                                        }
                                        if (cancellableContinuation != null) {
                                            Result.Companion companion2 = Result.Companion;
                                            ((CancellableContinuationImpl) cancellableContinuation).resumeWith(Unit.INSTANCE);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        Recomposer recomposer4 = recomposer2;
                                        synchronized (recomposer4.stateLock) {
                                            recomposer4.frameClockPaused = true;
                                        }
                                        return;
                                    case 4:
                                        recomposer2.cancel();
                                        return;
                                    case 5:
                                    case 6:
                                    case 7:
                                        return;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                }
                            }
                        });
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, recomposer2);
                        GlobalScope globalScope = GlobalScope.INSTANCE;
                        Handler handler = view2.getHandler();
                        int i = HandlerDispatcherKt.$r8$clinit;
                        view2.addOnAttachStateChangeListener(new AndroidGraphicsContext.AnonymousClass2(JobKt.launch$default(globalScope, new HandlerContext(handler, "windowRecomposer cleanup", false).immediate, null, new GatedFrameClock.AnonymousClass1(recomposer2, view2, r1, 10), 2), 2));
                        recomposer = recomposer2;
                    } else {
                        if (!(compositionContext3 instanceof Recomposer)) {
                            a$$ExternalSyntheticBUOutline0.m$1("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        recomposer = (Recomposer) compositionContext3;
                    }
                    r1 = ((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) > 0 ? recomposer : null;
                    if (r1 != null) {
                        this.cachedViewTreeCompositionContext = new WeakReference(r1);
                    }
                    return recomposer;
                }
            }
        }
        return compositionContext;
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m912setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, AutoClearFocusBehavior.m924boximpl(i));
    }

    public final void setComposeViewContext$ui(ComposeViewContext composeViewContext) {
        if (this.composeViewContext != composeViewContext) {
            if (composeViewContext == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.coroutineContext != composeViewContext.compositionContext.getEffectCoroutineContext()) {
                        disposeComposition();
                    }
                    androidComposeView.setComposeViewContext(composeViewContext);
                }
            }
            this.composeViewContext = composeViewContext;
        }
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            WrappedComposition wrappedComposition = this.composition;
            if (wrappedComposition != null) {
                wrappedComposition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        Function0 function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final ComposeViewContext updateAutoCreatedComposeViewContext(View view, ComposeViewContext composeViewContext) {
        CompositionContext resolveParentCompositionContext = resolveParentCompositionContext();
        LifecycleOwner lifecycleOwner = DBUtil.get(view);
        ViewModelStoreOwner viewModelStoreOwner = Strings.get(view);
        SavedStateRegistryOwner savedStateRegistryOwner = Countries.get(view);
        CompositionContext compositionContext = composeViewContext.compositionContext;
        SavedStateRegistryOwner savedStateRegistryOwner2 = composeViewContext.savedStateRegistryOwner;
        LifecycleOwner lifecycleOwner2 = composeViewContext.lifecycleOwner;
        if (resolveParentCompositionContext == compositionContext && lifecycleOwner == lifecycleOwner2 && viewModelStoreOwner == composeViewContext.viewModelStoreOwner && savedStateRegistryOwner == savedStateRegistryOwner2) {
            return composeViewContext;
        }
        if (resolveParentCompositionContext.getEffectCoroutineContext() != composeViewContext.compositionContext.getEffectCoroutineContext()) {
            disposeComposition();
        }
        if (lifecycleOwner == null) {
            lifecycleOwner = lifecycleOwner2;
        }
        ComposeViewContext composeViewContext2 = new ComposeViewContext(composeViewContext, view, resolveParentCompositionContext, lifecycleOwner, savedStateRegistryOwner == null ? savedStateRegistryOwner2 : savedStateRegistryOwner, viewModelStoreOwner);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(composeViewContext2));
        return composeViewContext2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
