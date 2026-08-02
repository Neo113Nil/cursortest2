package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class MagnifierNode extends Modifier.Node implements GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public DerivedSnapshotState anchorPositionInRootState;
    public Density density;
    public BufferedChannel drawSignalChannel;
    public Toolbar.AnonymousClass1 magnifier;
    public Function1 onSizeChanged;
    public FocusableNode.TraverseKey platformMagnifierFactory;
    public IntSize previousSize;
    public Function1 sourceCenter;
    public View view;
    public float zoom = Float.NaN;
    public boolean useTextDefault = true;
    public long size = 9205357640488583168L;
    public float cornerRadius = Float.NaN;
    public float elevation = Float.NaN;
    public boolean clippingEnabled = true;
    public final ParcelableSnapshotMutableState layoutCoordinates$delegate = new ParcelableSnapshotMutableState(null, NeverEqualPolicy.INSTANCE);
    public long sourceCenterInRoot = 9205357640488583168L;

    public MagnifierNode(Function1 function1, Function1 function12, FocusableNode.TraverseKey traverseKey) {
        this.sourceCenter = function1;
        this.onSizeChanged = function12;
        this.platformMagnifierFactory = traverseKey;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.MagnifierPositionInRoot, new MagnifierNode$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        layoutNodeDrawScope.drawContent();
        BufferedChannel bufferedChannel = this.drawSignalChannel;
        if (bufferedChannel != null) {
            bufferedChannel.mo1159trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m188getAnchorPositionInRootF1C5BW0() {
        if (this.anchorPositionInRootState == null) {
            this.anchorPositionInRootState = Updater.derivedStateOf(new Threads$$ExternalSyntheticLambda1(this, 15));
        }
        DerivedSnapshotState derivedSnapshotState = this.anchorPositionInRootState;
        if (derivedSnapshotState != null) {
            return ((Offset) derivedSnapshotState.getValue()).packedValue;
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        this.drawSignalChannel = PapaEvent.Channel$default(0, null, null, 7);
        JobKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new CashApp$onCreate$4$1$1(this, null, 2), 1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        Toolbar.AnonymousClass1 anonymousClass1 = this.magnifier;
        if (anonymousClass1 != null) {
            anonymousClass1.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(NodeCoordinator nodeCoordinator) {
        this.layoutCoordinates$delegate.setValue(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        DepthSortedSetKt.observeReads(this, new MagnifierNode$$ExternalSyntheticLambda0(this, 0));
    }

    public final void recreateMagnifier() {
        Toolbar.AnonymousClass1 anonymousClass1;
        Toolbar.AnonymousClass1 anonymousClass12 = this.magnifier;
        if (anonymousClass12 != null) {
            anonymousClass12.dismiss();
        }
        View view = this.view;
        if (view == null) {
            view = DepthSortedSetKt.requireView(this);
        }
        this.view = view;
        Density density = this.density;
        if (density == null) {
            density = DepthSortedSetKt.requireLayoutNode(this).density;
        }
        this.density = density;
        FocusableNode.TraverseKey traverseKey = this.platformMagnifierFactory;
        boolean z = this.useTextDefault;
        long j = this.size;
        float f = this.cornerRadius;
        float f2 = this.elevation;
        boolean z2 = this.clippingEnabled;
        float f3 = this.zoom;
        traverseKey.getClass();
        if (z) {
            anonymousClass1 = new Toolbar.AnonymousClass1(new Magnifier(view));
        } else {
            long mo237toSizeXkaWNTQ = density.mo237toSizeXkaWNTQ(j);
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(f);
            float mo236toPx0680j_42 = density.mo236toPx0680j_4(f2);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (mo237toSizeXkaWNTQ != 9205357640488583168L) {
                builder.setSize(MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (mo237toSizeXkaWNTQ >> 32))), MathKt__MathJVMKt.roundToInt(Float.intBitsToFloat((int) (mo237toSizeXkaWNTQ & BodyPartID.bodyIdMax))));
            }
            if (!Float.isNaN(mo236toPx0680j_4)) {
                builder.setCornerRadius(mo236toPx0680j_4);
            }
            if (!Float.isNaN(mo236toPx0680j_42)) {
                builder.setElevation(mo236toPx0680j_42);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            anonymousClass1 = new Toolbar.AnonymousClass1(builder.build());
        }
        this.magnifier = anonymousClass1;
        updateSizeIfNecessary();
    }

    public final void updateMagnifier() {
        Density density = this.density;
        if (density == null) {
            density = DepthSortedSetKt.requireLayoutNode(this).density;
            this.density = density;
        }
        long j = ((Offset) this.sourceCenter.invoke(density)).packedValue;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & m188getAnchorPositionInRootF1C5BW0()) == 9205357640488583168L) {
            this.sourceCenterInRoot = 9205357640488583168L;
            Toolbar.AnonymousClass1 anonymousClass1 = this.magnifier;
            if (anonymousClass1 != null) {
                anonymousClass1.dismiss();
                return;
            }
            return;
        }
        this.sourceCenterInRoot = Offset.m626plusMKHz9U(m188getAnchorPositionInRootF1C5BW0(), j);
        if (this.magnifier == null) {
            recreateMagnifier();
        }
        Toolbar.AnonymousClass1 anonymousClass12 = this.magnifier;
        if (anonymousClass12 != null) {
            anonymousClass12.m10updateWko1d7g(this.zoom, this.sourceCenterInRoot, 9205357640488583168L);
        }
        updateSizeIfNecessary();
    }

    public final void updateSizeIfNecessary() {
        Density density;
        Toolbar.AnonymousClass1 anonymousClass1 = this.magnifier;
        if (anonymousClass1 == null || (density = this.density) == null) {
            return;
        }
        if (IntSize.m1054equalsimpl(this.previousSize, anonymousClass1.m7getSizeYbymL2g())) {
            return;
        }
        Function1 function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(new DpSize(density.mo234toDpSizekrfVVM(Countries.m3991toSizeozmzZPI(anonymousClass1.m7getSizeYbymL2g()))));
        }
        this.previousSize = new IntSize(anonymousClass1.m7getSizeYbymL2g());
    }
}
