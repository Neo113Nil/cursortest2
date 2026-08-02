package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.google.android.gms.internal.measurement.zzabh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import curtains.WindowsKt$onNextDraw$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticLambda2;
import retrofit2.KotlinExtensions$await$2$1;

/* loaded from: classes.dex */
public abstract class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope, OnApplyWindowInsetsListener {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Function1 bringIntoViewRequester;
    public Density density;
    public final SimpleActor dispatcher;
    public boolean hasUpdateBlock;
    public WindowInsetsCompat insets;
    public boolean isDrawing;
    public int lastHeightMeasureSpec;
    public int lastWidthMeasureSpec;
    public final LayoutNode layoutNode;
    public LifecycleOwner lifecycleOwner;
    public final int[] location;
    public Modifier modifier;
    public final NestedScrollingParentHelper nestedScrollingParentHelper;
    public Function1 onDensityChanged;
    public Function1 onModifierChanged;
    public Function1 onRequestDisallowInterceptTouchEvent;
    public final Owner owner;
    public final int[] position;
    public Function0 release;
    public Function0 reset;
    public final AndroidViewHolder$runUpdate$1 runInvalidate;
    public final AndroidViewHolder$runUpdate$1 runUpdate;
    public SavedStateRegistryOwner savedStateRegistryOwner;
    public long size;
    public Function0 update;
    public final View view;

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i, SimpleActor simpleActor, View view, Owner owner) {
        super(context);
        this.dispatcher = simpleActor;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            MutableScatterMap mutableScatterMap = WindowRecomposer_androidKt.animationScale;
            setTag(R.id.androidx_compose_ui_view_composition_context, compositionContext);
        }
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        final ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) this;
        ViewCompat.setWindowInsetsAnimationCallback(this, new zzabh() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.2
            {
                super(1);
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
                return ViewFactoryHolder.this.insetToLayoutPosition(windowInsetsCompat);
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
                InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) ViewFactoryHolder.this.layoutNode.nodes.innerCoordinator;
                if (innerNodeCoordinator.isAttached()) {
                    long m1344roundk4lQ0M = PlatformKt.m1344roundk4lQ0M(innerNodeCoordinator.mo841localToRootMKHz9U(0L));
                    int i3 = (int) (m1344roundk4lQ0M >> 32);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    int i4 = (int) (m1344roundk4lQ0M & BodyPartID.bodyIdMax);
                    if (i4 < 0) {
                        i4 = 0;
                    }
                    long mo838getSizeYbymL2g = ValueInsets.findRootCoordinates(innerNodeCoordinator).mo838getSizeYbymL2g();
                    int i5 = (int) (mo838getSizeYbymL2g >> 32);
                    int i6 = (int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax);
                    long j = innerNodeCoordinator.measuredSize;
                    long m1344roundk4lQ0M2 = PlatformKt.m1344roundk4lQ0M(innerNodeCoordinator.mo841localToRootMKHz9U((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax)));
                    int i7 = i5 - ((int) (m1344roundk4lQ0M2 >> 32));
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    int i8 = i6 - ((int) (m1344roundk4lQ0M2 & BodyPartID.bodyIdMax));
                    int i9 = i8 >= 0 ? i8 : 0;
                    if (i3 != 0 || i4 != 0 || i7 != 0 || i9 != 0) {
                        return new WorkLauncherImpl(16, AndroidViewHolder.inset((Insets) workLauncherImpl.processor, i3, i4, i7, i9), AndroidViewHolder.inset((Insets) workLauncherImpl.workTaskExecutor, i3, i4, i7, i9));
                    }
                }
                return workLauncherImpl;
            }
        });
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, this);
        this.update = AndroidViewHolder$reset$1.INSTANCE$2;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$reset$1.INSTANCE$1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        this.modifier = companion;
        this.density = SizeKt.Density$default();
        int i3 = 2;
        this.position = new int[2];
        this.size = 0L;
        this.runUpdate = new AndroidViewHolder$runUpdate$1(viewFactoryHolder, i2);
        int i4 = 1;
        this.runInvalidate = new AndroidViewHolder$runUpdate$1(viewFactoryHolder, i4);
        this.location = new int[2];
        this.lastWidthMeasureSpec = PKIFailureInfo.systemUnavail;
        this.lastHeightMeasureSpec = PKIFailureInfo.systemUnavail;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper();
        final LayoutNode layoutNode = new LayoutNode(3);
        layoutNode.interopViewFactoryHolder = viewFactoryHolder;
        Modifier semantics = SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidView_androidKt.NoOpScrollConnection, simpleActor), true, AndroidView_androidKt$NoOpUpdate$1.INSTANCE$2);
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.onTouchEvent = new AndroidViewHolder$layoutNode$1$4(viewFactoryHolder, i4);
        KotlinExtensions$await$2$1 kotlinExtensions$await$2$1 = new KotlinExtensions$await$2$1();
        KotlinExtensions$await$2$1 kotlinExtensions$await$2$12 = pointerInteropFilter.requestDisallowInterceptTouchEvent;
        if (kotlinExtensions$await$2$12 != null) {
            kotlinExtensions$await$2$12.$this_await = null;
        }
        pointerInteropFilter.requestDisallowInterceptTouchEvent = kotlinExtensions$await$2$1;
        kotlinExtensions$await$2$1.$this_await = pointerInteropFilter;
        setOnRequestDisallowInterceptTouchEvent$ui(kotlinExtensions$await$2$1);
        Modifier then = ValueInsets.onGloballyPositioned(ClipKt.drawBehind(semantics.then(pointerInteropFilter), new FocusOwnerImpl$focusSearch$1(4, viewFactoryHolder, layoutNode, viewFactoryHolder)), new AndroidViewHolder$layoutNode$1$3(viewFactoryHolder, layoutNode, i3)).then(new BringIntoViewElement(new AndroidViewHolder$layoutNode$1$4(viewFactoryHolder, i3)));
        layoutNode.setModifier(this.modifier.then(then));
        this.onModifierChanged = new SimpleActor.AnonymousClass1(8, layoutNode, then);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new WindowsKt$onNextDraw$1(layoutNode, 12);
        layoutNode.onAttach = new AndroidViewHolder$layoutNode$1$3(viewFactoryHolder, layoutNode, i2);
        layoutNode.onDetach = new AndroidViewHolder$layoutNode$1$4(viewFactoryHolder, i2);
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                ViewFactoryHolder viewFactoryHolder2 = ViewFactoryHolder.this;
                viewFactoryHolder2.measure(AndroidViewHolder.access$obtainMeasureSpec(viewFactoryHolder2, 0, i5, viewFactoryHolder2.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return viewFactoryHolder2.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewFactoryHolder viewFactoryHolder2 = ViewFactoryHolder.this;
                viewFactoryHolder2.measure(makeMeasureSpec, AndroidViewHolder.access$obtainMeasureSpec(viewFactoryHolder2, 0, i5, viewFactoryHolder2.getLayoutParams().height));
                return viewFactoryHolder2.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
                ViewFactoryHolder viewFactoryHolder2 = ViewFactoryHolder.this;
                if (viewFactoryHolder2.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m1027getMinWidthimpl(j), Constraints.m1026getMinHeightimpl(j), AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE);
                }
                if (Constraints.m1027getMinWidthimpl(j) != 0) {
                    viewFactoryHolder2.getChildAt(0).setMinimumWidth(Constraints.m1027getMinWidthimpl(j));
                }
                if (Constraints.m1026getMinHeightimpl(j) != 0) {
                    viewFactoryHolder2.getChildAt(0).setMinimumHeight(Constraints.m1026getMinHeightimpl(j));
                }
                viewFactoryHolder2.measure(AndroidViewHolder.access$obtainMeasureSpec(viewFactoryHolder2, Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j), viewFactoryHolder2.getLayoutParams().width), AndroidViewHolder.access$obtainMeasureSpec(viewFactoryHolder2, Constraints.m1026getMinHeightimpl(j), Constraints.m1024getMaxHeightimpl(j), viewFactoryHolder2.getLayoutParams().height));
                return MeasureScope.layout$default(measureScope, viewFactoryHolder2.getMeasuredWidth(), viewFactoryHolder2.getMeasuredHeight(), new AndroidViewHolder$layoutNode$1$3(viewFactoryHolder2, layoutNode, 1));
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                ViewFactoryHolder viewFactoryHolder2 = ViewFactoryHolder.this;
                viewFactoryHolder2.measure(AndroidViewHolder.access$obtainMeasureSpec(viewFactoryHolder2, 0, i5, viewFactoryHolder2.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return viewFactoryHolder2.getMeasuredHeight();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i5) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ViewFactoryHolder viewFactoryHolder2 = ViewFactoryHolder.this;
                viewFactoryHolder2.measure(makeMeasureSpec, AndroidViewHolder.access$obtainMeasureSpec(viewFactoryHolder2, 0, i5, viewFactoryHolder2.getLayoutParams().height));
                return viewFactoryHolder2.getMeasuredWidth();
            }
        });
        this.layoutNode = layoutNode;
    }

    public static final int access$obtainMeasureSpec(ViewFactoryHolder viewFactoryHolder, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(RangesKt___RangesKt.coerceIn(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, PKIFailureInfo.systemUnavail);
    }

    public static Insets inset(Insets insets, int i, int i2, int i3, int i4) {
        int i5 = insets.left - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = insets.top - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = insets.right - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = insets.bottom - i4;
        return Insets.of(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.location;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final WindowInsetsCompat insetToLayoutPosition(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        Insets insets = impl.getInsets(-1);
        Insets insets2 = Insets.NONE;
        if (!insets.equals(insets2) || !impl.getInsetsIgnoringVisibility(-9).equals(insets2) || impl.getDisplayCutout() != null) {
            InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) this.layoutNode.nodes.innerCoordinator;
            if (innerNodeCoordinator.isAttached()) {
                long m1344roundk4lQ0M = PlatformKt.m1344roundk4lQ0M(innerNodeCoordinator.mo841localToRootMKHz9U(0L));
                int i = (int) (m1344roundk4lQ0M >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (m1344roundk4lQ0M & BodyPartID.bodyIdMax);
                if (i2 < 0) {
                    i2 = 0;
                }
                long mo838getSizeYbymL2g = ValueInsets.findRootCoordinates(innerNodeCoordinator).mo838getSizeYbymL2g();
                int i3 = (int) (mo838getSizeYbymL2g >> 32);
                int i4 = (int) (mo838getSizeYbymL2g & BodyPartID.bodyIdMax);
                long j = innerNodeCoordinator.measuredSize;
                long m1344roundk4lQ0M2 = PlatformKt.m1344roundk4lQ0M(innerNodeCoordinator.mo841localToRootMKHz9U((Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax)));
                int i5 = i3 - ((int) (m1344roundk4lQ0M2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (BodyPartID.bodyIdMax & m1344roundk4lQ0M2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return windowInsetsCompat.mImpl.inset(i, i2, i5, i7);
                }
            }
        }
        return windowInsetsCompat;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui();
            return null;
        }
        this.view.postOnAnimation(new Handlers$$ExternalSyntheticLambda2(3, this.runInvalidate));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public final boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.insets = new WindowInsetsCompat(windowInsetsCompat);
        return insetToLayoutPosition(windowInsetsCompat);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui();
        } else {
            this.view.postOnAnimation(new Handlers$$ExternalSyntheticLambda2(3, this.runInvalidate));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        ((SnapshotStateObserver) ((AndroidComposeView) this.owner).snapshotObserver.application).clear(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.view.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.view;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i;
        this.lastHeightMeasureSpec = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        JobKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new InteractiveCardView$flingTo$1(z, this, VelocityKt.Velocity(f * (-1.0f), f2 * (-1.0f)), (Continuation) null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        JobKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new FlashControl$applyScreenFlash$3(this, VelocityKt.Velocity(f * (-1.0f), f2 * (-1.0f)), (Continuation) null, 5), 3);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (this.view.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & BodyPartID.bodyIdMax);
            int i4 = i3 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = (NestedScrollNode) this.dispatcher.consumeMessage;
            NestedScrollNode parentNestedScrollNode$ui = nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
            long mo326onPreScrollOzD1aCk = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.mo326onPreScrollOzD1aCk(i4, floatToRawIntBits) : 0L;
            iArr[0] = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (mo326onPreScrollOzD1aCk >> 32)));
            iArr[1] = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (mo326onPreScrollOzD1aCk & BodyPartID.bodyIdMax)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.view.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & BodyPartID.bodyIdMax);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & BodyPartID.bodyIdMax);
            int i6 = i5 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = (NestedScrollNode) this.dispatcher.consumeMessage;
            NestedScrollNode parentNestedScrollNode$ui = nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
            long mo242onPostScrollDzOQY0M = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.mo242onPostScrollDzOQY0M(i6, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (mo242onPostScrollDzOQY0M >> 32)));
            iArr[1] = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (mo242onPostScrollDzOQY0M & BodyPartID.bodyIdMax)));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.nestedScrollingParentHelper;
        if (i2 == 1) {
            nestedScrollingParentHelper.mNestedScrollAxesNonTouch = i;
        } else {
            nestedScrollingParentHelper.mNestedScrollAxesTouch = i;
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public final void onReuse() {
        View view = this.view;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.nestedScrollingParentHelper;
        if (i == 1) {
            nestedScrollingParentHelper.mNestedScrollAxesNonTouch = 0;
        } else {
            nestedScrollingParentHelper.mNestedScrollAxesTouch = 0;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Function1 function1 = this.bringIntoViewRequester;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rect != null ? new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1 function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1 function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.view.isNestedScrollingEnabled()) {
            long floatToRawIntBits = (Float.floatToRawIntBits(i * (-1.0f)) << 32) | (Float.floatToRawIntBits(i2 * (-1.0f)) & BodyPartID.bodyIdMax);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * (-1.0f)) << 32) | (Float.floatToRawIntBits(i4 * (-1.0f)) & BodyPartID.bodyIdMax);
            int i6 = i5 == 0 ? 1 : 2;
            NestedScrollNode nestedScrollNode = (NestedScrollNode) this.dispatcher.consumeMessage;
            NestedScrollNode parentNestedScrollNode$ui = nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
            if (parentNestedScrollNode$ui != null) {
                parentNestedScrollNode$ui.mo242onPostScrollDzOQY0M(i6, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }
}
