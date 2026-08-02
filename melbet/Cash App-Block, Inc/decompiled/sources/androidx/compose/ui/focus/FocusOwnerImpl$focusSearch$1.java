package androidx.compose.ui.focus;

import androidx.compose.animation.SharedTransitionScopeImpl;
import androidx.compose.animation.SharedTransitionScopeRootModifierNode;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class FocusOwnerImpl$focusSearch$1 extends Lambda implements Function1 {
    public final /* synthetic */ Object $onFound;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $source;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusOwnerImpl$focusSearch$1(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.$r8$classId = i;
        this.$source = obj;
        this.this$0 = obj2;
        this.$onFound = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        Object[] objArr = 0;
        Object obj2 = this.$onFound;
        Object obj3 = this.this$0;
        Object obj4 = this.$source;
        switch (i) {
            case 0:
                FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
                if (!Intrinsics.areEqual(focusTargetNode, (FocusTargetNode) obj4)) {
                    if (Intrinsics.areEqual(focusTargetNode, ((FocusOwnerImpl) obj3).rootFocusNode)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Focus search landed at the root.");
                        break;
                    } else {
                        z = ((Boolean) ((Function1) obj2).invoke(focusTargetNode)).booleanValue();
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                State state = (State) obj3;
                State state2 = (State) obj4;
                reusableGraphicsLayerScope.setAlpha(state2 != null ? ((Number) state2.getValue()).floatValue() : 1.0f);
                reusableGraphicsLayerScope.setScaleX(state != null ? ((Number) state.getValue()).floatValue() : 1.0f);
                reusableGraphicsLayerScope.setScaleY(state != null ? ((Number) state.getValue()).floatValue() : 1.0f);
                State state3 = (State) obj2;
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(state3 != null ? ((TransformOrigin) state3.getValue()).packedValue : TransformOrigin.Center);
                break;
            case 3:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                LayoutCoordinates coordinates = placementScope.getCoordinates();
                if (coordinates != null) {
                    boolean isLookingAhead = ((MeasureScope) obj4).isLookingAhead();
                    SharedTransitionScopeImpl sharedTransitionScopeImpl = ((SharedTransitionScopeRootModifierNode) obj3).sharedScope;
                    if (isLookingAhead) {
                        sharedTransitionScopeImpl._nullableLookaheadRoot = coordinates;
                    } else {
                        sharedTransitionScopeImpl.nullableRoot = coordinates;
                    }
                }
                placementScope.place((Placeable) obj2, 0, 0, RecyclerView.DECELERATION_RATE);
                break;
            default:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) obj4;
                LayoutNode layoutNode = (LayoutNode) obj3;
                ViewFactoryHolder viewFactoryHolder2 = (ViewFactoryHolder) obj2;
                Canvas canvas = ((DrawScope) obj).getDrawContext().getCanvas();
                if (viewFactoryHolder.view.getVisibility() != 8) {
                    viewFactoryHolder.isDrawing = true;
                    Owner owner = layoutNode.owner;
                    AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                    if (androidComposeView != null) {
                        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
                        androidComposeView.getAndroidViewsHandler$ui();
                        viewFactoryHolder2.draw(nativeCanvas);
                    }
                    viewFactoryHolder.isDrawing = false;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
