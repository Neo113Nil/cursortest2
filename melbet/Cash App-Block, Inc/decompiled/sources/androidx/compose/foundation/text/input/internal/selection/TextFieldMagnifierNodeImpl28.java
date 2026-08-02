package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.MagnifierNode;
import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import app.cash.molecule.GatedFrameClock;
import coil3.size.DimensionKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextFieldMagnifierNodeImpl28 extends DelegatingNode implements CompositionLocalConsumerModifierNode, DrawModifierNode, SemanticsModifierNode, Modifier.Element {
    public final Animatable animatable;
    public StandaloneCoroutine animationJob;
    public final MagnifierNode magnifierNode;
    public final ParcelableSnapshotMutableState magnifierSize$delegate;
    public TextFieldSelectionState textFieldSelectionState;
    public TransformedTextFieldState textFieldState;
    public TextLayoutState textLayoutState;
    public boolean visible;

    public TextFieldMagnifierNodeImpl28(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z) {
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.textLayoutState = textLayoutState;
        this.visible = z;
        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(new IntSize(0L));
        this.magnifierSize$delegate = mutableStateOf$default;
        this.animatable = new Animatable(new Offset(DimensionKt.m1463calculateSelectionMagnifierCenterAndroidhUlJWOE(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, ((IntSize) mutableStateOf$default.getValue()).packedValue)), SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter, new Offset(SelectionMagnifierKt.OffsetDisplacementThreshold), 8);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$$ExternalSyntheticLambda0
            public final /* synthetic */ TextFieldMagnifierNodeImpl28 f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.f$0;
                switch (i2) {
                    case 0:
                        return (Offset) textFieldMagnifierNodeImpl28.animatable.getValue();
                    default:
                        DpSize dpSize = (DpSize) obj;
                        Density density = (Density) DepthSortedSetKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.LocalDensity);
                        textFieldMagnifierNodeImpl28.magnifierSize$delegate.setValue(new IntSize((density.mo230roundToPx0680j_4(DpSize.m1044getWidthD9Ej5fM(dpSize.packedValue)) << 32) | (density.mo230roundToPx0680j_4(DpSize.m1043getHeightD9Ej5fM(dpSize.packedValue)) & BodyPartID.bodyIdMax)));
                        return Unit.INSTANCE;
                }
            }
        };
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$$ExternalSyntheticLambda0
            public final /* synthetic */ TextFieldMagnifierNodeImpl28 f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl28 = this.f$0;
                switch (i22) {
                    case 0:
                        return (Offset) textFieldMagnifierNodeImpl28.animatable.getValue();
                    default:
                        DpSize dpSize = (DpSize) obj;
                        Density density = (Density) DepthSortedSetKt.currentValueOf(textFieldMagnifierNodeImpl28, CompositionLocalsKt.LocalDensity);
                        textFieldMagnifierNodeImpl28.magnifierSize$delegate.setValue(new IntSize((density.mo230roundToPx0680j_4(DpSize.m1044getWidthD9Ej5fM(dpSize.packedValue)) << 32) | (density.mo230roundToPx0680j_4(DpSize.m1043getHeightD9Ej5fM(dpSize.packedValue)) & BodyPartID.bodyIdMax)));
                        return Unit.INSTANCE;
                }
            }
        };
        SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.MagnifierPositionInRoot;
        MagnifierNode magnifierNode = new MagnifierNode(function1, function12, FocusableNode.TraverseKey.INSTANCE);
        delegate(magnifierNode);
        this.magnifierNode = magnifierNode;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.magnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.drawContent();
        this.magnifierNode.draw(layoutNodeDrawScope);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        restartAnimationJob();
    }

    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.magnifierNode.onGloballyPositioned(nodeCoordinator);
    }

    public final void restartAnimationJob() {
        StandaloneCoroutine standaloneCoroutine = this.animationJob;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(null);
        }
        this.animationJob = null;
        SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.MagnifierPositionInRoot;
        this.animationJob = JobKt.launch$default(getCoroutineScope(), null, null, new GatedFrameClock.AnonymousClass1(this, (Continuation) null, 6), 3);
    }
}
