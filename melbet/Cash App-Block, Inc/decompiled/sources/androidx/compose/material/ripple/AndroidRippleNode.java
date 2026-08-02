package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableObjectList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.molecule.GatedFrameClock;
import coil3.Extras;
import coil3.util.AndroidSystemCallbacks;
import com.plaid.internal.EnumC0170g;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.JobKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class AndroidRippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public final boolean bounded;
    public final ColorProducer color;
    public boolean hasValidSize;
    public final MutableInteractionSourceImpl interactionSource;
    public final float radius;
    public final Function0 rippleAlpha;
    public RippleContainer rippleContainer;
    public RippleHostView rippleHostView;
    public AndroidSystemCallbacks stateLayer;
    public float targetRadius;
    public long rippleSize = 0;
    public final MutableObjectList pendingInteractions = new MutableObjectList();

    public AndroidRippleNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, float f, ColorProducer colorProducer, Function0 function0) {
        this.interactionSource = mutableInteractionSourceImpl;
        this.bounded = z;
        this.radius = f;
        this.color = colorProducer;
        this.rippleAlpha = function0;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        layoutNodeDrawScope.drawContent();
        AndroidSystemCallbacks androidSystemCallbacks = this.stateLayer;
        if (androidSystemCallbacks != null) {
            float f = this.targetRadius;
            long mo501invoke0d7_KjU = this.color.mo501invoke0d7_KjU();
            float floatValue = ((Number) ((Animatable) androidSystemCallbacks.activityCallbacks).getValue()).floatValue();
            if (floatValue > RecyclerView.DECELERATION_RATE) {
                long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(floatValue, mo501invoke0d7_KjU, 14);
                if (androidSystemCallbacks.shutdown) {
                    float m643getWidthimpl = Size.m643getWidthimpl(canvasDrawScope.mo753getSizeNHjbRc());
                    float m640getHeightimpl = Size.m640getHeightimpl(canvasDrawScope.mo753getSizeNHjbRc());
                    GrpcMethod grpcMethod = canvasDrawScope.drawContext;
                    long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                    grpcMethod.getCanvas().save();
                    try {
                        ((Extras.Key) grpcMethod.path).m1435clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, m643getWidthimpl, m640getHeightimpl, 1);
                        DrawScope.m738drawCircleVaOC9Bg$default(layoutNodeDrawScope, m675copywmQWz5c$default, f, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    } finally {
                        Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    }
                } else {
                    DrawScope.m738drawCircleVaOC9Bg$default(layoutNodeDrawScope, m675copywmQWz5c$default, f, 0L, null, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                }
            }
        }
        Canvas canvas = canvasDrawScope.drawContext.getCanvas();
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.m514setRipplePropertiesbiQXAtU(this.rippleSize, MathKt__MathJVMKt.roundToInt(this.targetRadius), this.color.mo501invoke0d7_KjU(), ((RippleAlpha) this.rippleAlpha.invoke()).pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void handlePressInteraction(PressInteraction pressInteraction) {
        RippleHostView rippleHostView;
        if (!(pressInteraction instanceof PressInteraction.Press)) {
            if (pressInteraction instanceof PressInteraction.Release) {
                RippleHostView rippleHostView2 = this.rippleHostView;
                if (rippleHostView2 != null) {
                    rippleHostView2.removeRipple();
                    return;
                }
                return;
            }
            if (!(pressInteraction instanceof PressInteraction.Cancel) || (rippleHostView = this.rippleHostView) == null) {
                return;
            }
            rippleHostView.removeRipple();
            return;
        }
        PressInteraction.Press press = (PressInteraction.Press) pressInteraction;
        long j = this.rippleSize;
        float f = this.targetRadius;
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer == null) {
            Object obj = (View) DepthSortedSetKt.currentValueOf(this, AndroidCompositionLocals_androidKt.LocalView);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", obj));
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    RippleContainer rippleContainer2 = new RippleContainer(viewGroup.getContext());
                    viewGroup.addView(rippleContainer2);
                    rippleContainer = rippleContainer2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof RippleContainer) {
                        rippleContainer = (RippleContainer) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.rippleContainer = rippleContainer;
        }
        RippleHostView rippleHostView3 = rippleContainer.getRippleHostView(this);
        rippleHostView3.m513addRippleKOepWvA(press, this.bounded, j, MathKt__MathJVMKt.roundToInt(f), this.color.mo501invoke0d7_KjU(), ((RippleAlpha) this.rippleAlpha.invoke()).pressedAlpha, new Worker$$ExternalSyntheticLambda0(this, 5));
        this.rippleHostView = rippleHostView3;
        DepthSortedSetKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        JobKt.launch$default(getCoroutineScope(), null, null, new GatedFrameClock.AnonymousClass1(this, (Continuation) null, 7), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final void mo197onRemeasuredozmzZPI(long j) {
        float mo236toPx0680j_4;
        this.hasValidSize = true;
        Density density = DepthSortedSetKt.requireLayoutNode(this).density;
        this.rippleSize = Countries.m3991toSizeozmzZPI(j);
        float f = this.radius;
        if (Float.isNaN(f)) {
            long j2 = this.rippleSize;
            mo236toPx0680j_4 = Offset.m623getDistanceimpl(Trace.Offset(Size.m643getWidthimpl(j2), Size.m640getHeightimpl(j2))) / 2.0f;
            if (this.bounded) {
                mo236toPx0680j_4 += density.mo236toPx0680j_4(10.0f);
            }
        } else {
            mo236toPx0680j_4 = density.mo236toPx0680j_4(f);
        }
        this.targetRadius = mo236toPx0680j_4;
        MutableObjectList mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            handlePressInteraction((PressInteraction) objArr[i2]);
        }
        mutableObjectList.clear();
    }
}
