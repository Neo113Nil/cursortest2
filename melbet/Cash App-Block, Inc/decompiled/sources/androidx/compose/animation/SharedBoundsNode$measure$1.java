package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Placeable;
import androidx.emoji2.text.MetadataRepo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class SharedBoundsNode$measure$1 extends Lambda implements Function1 {
    public final /* synthetic */ Placeable $placeable;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ SharedBoundsNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$measure$1(Placeable placeable, SharedBoundsNode sharedBoundsNode) {
        super(1);
        this.$placeable = placeable;
        this.this$0 = sharedBoundsNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates coordinates;
        long mo840localPositionOfS_NoaFU;
        long j;
        int i = this.$r8$classId;
        SharedBoundsNode sharedBoundsNode = this.this$0;
        Placeable placeable = this.$placeable;
        int i2 = 0;
        switch (i) {
            case 0:
                Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                placementScope.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                SharedElement sharedElement = sharedBoundsNode.sharedElementEntry.getSharedElement();
                SharedElementEntry sharedElementEntry = sharedBoundsNode.sharedElementEntry;
                SharedTransitionStateMachine sharedTransitionStateMachine = sharedElement.stateMachine;
                sharedTransitionStateMachine.processPendingRequest();
                if (!Intrinsics.areEqual(sharedTransitionStateMachine.getState(), NoMatchFound.INSTANCE) && sharedElementEntry.isEnabled()) {
                    SharedTransitionStateMachine.State state = sharedTransitionStateMachine.getState();
                    if (sharedElementEntry.getBoundsAnimation().getTarget() && state.getActiveMatchFound() && (coordinates = placementScope.getCoordinates()) != null) {
                        long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(coordinates.mo838getSizeYbymL2g());
                        SharedTransitionScopeImpl sharedTransitionScopeImpl = sharedElementEntry.getSharedElement().scope;
                        LayoutCoordinates layoutCoordinates = sharedElementEntry.getSharedElement().scope._nullableLookaheadRoot;
                        if (layoutCoordinates == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                            break;
                        } else {
                            long mo152localLookaheadPositionOfauaQtc = sharedTransitionScopeImpl.$$delegate_0.mo152localLookaheadPositionOfauaQtc(layoutCoordinates, coordinates);
                            SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedElementEntry.getSharedElement().scope;
                            LayoutCoordinates layoutCoordinates2 = sharedElementEntry.getSharedElement().scope._nullableLookaheadRoot;
                            if (layoutCoordinates2 == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                                break;
                            } else {
                                mo840localPositionOfS_NoaFU = layoutCoordinates2.mo840localPositionOfS_NoaFU(coordinates, 0L, (r4 & 4) != 0);
                                SharedTransitionStateMachine.State state2 = sharedTransitionStateMachine.getState();
                                SharedElement sharedElement2 = sharedTransitionStateMachine.sharedElement;
                                SharedBoundsNode sharedBoundsNode2 = sharedTransitionStateMachine.targetBoundsProvider;
                                sharedBoundsNode2.getClass();
                                sharedTransitionStateMachine.state$delegate.setValue(state2.mo136configureActiveMatch38uP1EE(sharedElement2, sharedBoundsNode2, m3991toSizeozmzZPI, mo152localLookaheadPositionOfauaQtc, mo840localPositionOfS_NoaFU));
                            }
                        }
                    }
                }
                break;
            default:
                Placeable.PlacementScope placementScope2 = (Placeable.PlacementScope) obj;
                sharedBoundsNode.isPlaced = true;
                sharedBoundsNode.boundsBeforeDetached = null;
                SharedTransitionStateMachine.State state3 = sharedBoundsNode.sharedElementEntry.getSharedElement().stateMachine.getState();
                if (!sharedBoundsNode.sharedElementEntry.isEnabled()) {
                    placementScope2.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                } else if (state3.getMatchIsOrHasBeenConfigured()) {
                    MetadataRepo targetData = state3.getTargetData();
                    if (targetData == null) {
                        Path$$ExternalSyntheticBUOutline0.m$3(state3, "Match State is configured, but target data is null. State = ");
                        break;
                    } else {
                        Rect currentBounds = state3.getCurrentBounds();
                        if (currentBounds == null) {
                            Path$$ExternalSyntheticBUOutline0.m$3(state3, "Match State is configured, but current bounds is null. State = ");
                            break;
                        } else {
                            long j2 = 0;
                            if (sharedBoundsNode.sharedElementEntry.getSharedElement().scope.isTransitionActive()) {
                                LayoutCoordinates coordinates2 = placementScope2.getCoordinates();
                                if (coordinates2 != null) {
                                    boolean activeMatchFound = sharedBoundsNode.sharedElementEntry.getSharedElement().stateMachine.getState().getActiveMatchFound();
                                    LayoutCoordinates layoutCoordinates3 = sharedBoundsNode.sharedElementEntry.getSharedElement().scope.nullableRoot;
                                    if (layoutCoordinates3 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                                        break;
                                    } else {
                                        long mo839localPositionOfR5De75A = layoutCoordinates3.mo839localPositionOfR5De75A(coordinates2, 0L);
                                        CrossfadeKt.getTargetBounds(targetData);
                                        SharedElementEntry sharedElementEntry2 = sharedBoundsNode.sharedElementEntry;
                                        if (activeMatchFound) {
                                            sharedElementEntry2.getBoundsAnimation().animate(currentBounds, CrossfadeKt.getTargetBounds(targetData), null);
                                        } else {
                                            sharedElementEntry2.getBoundsAnimation().animate(currentBounds, CrossfadeKt.getTargetBounds(targetData), new SharedBoundsNode$$ExternalSyntheticLambda0(i2));
                                        }
                                        Rect value = sharedBoundsNode.sharedElementEntry.getBoundsAnimation().getValue();
                                        Offset offset = value != null ? new Offset(Offset.m626plusMKHz9U(Offset.m625minusMKHz9U(value.m636getTopLeftF1C5BW0(), ((Offset) ((ParcelableSnapshotMutableState) targetData.mEmojiCharArray).getValue()).packedValue), ((Offset) ((ParcelableSnapshotMutableState) targetData.mTypeface).getValue()).packedValue)) : null;
                                        if (sharedBoundsNode.sharedElementEntry.getBoundsAnimation().getTarget() || !activeMatchFound) {
                                            long j3 = offset != null ? offset.packedValue : mo839localPositionOfR5De75A;
                                            sharedBoundsNode.sharedElementEntry.getSharedElement().stateMachine.getState().updateBounds(offset == null ? DBUtil.m1180Recttz77jQw(mo839localPositionOfR5De75A, Countries.m3991toSizeozmzZPI(coordinates2.mo838getSizeYbymL2g())) : DBUtil.m1180Recttz77jQw(offset.packedValue, value.m634getSizeNHjbRc()));
                                            j = j3;
                                        } else {
                                            j = offset != null ? offset.packedValue : currentBounds.m636getTopLeftF1C5BW0();
                                        }
                                        long m625minusMKHz9U = Offset.m625minusMKHz9U(j, mo839localPositionOfR5De75A);
                                        placementScope2.place(placeable, Math.round(Float.intBitsToFloat((int) (m625minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (m625minusMKHz9U & BodyPartID.bodyIdMax))), RecyclerView.DECELERATION_RATE);
                                    }
                                } else {
                                    placementScope2.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                                }
                            } else if (sharedBoundsNode.sharedElementEntry.getBoundsAnimation().getTarget()) {
                                placementScope2.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                            } else {
                                LayoutCoordinates coordinates3 = placementScope2.getCoordinates();
                                if (coordinates3 != null) {
                                    LayoutCoordinates layoutCoordinates4 = sharedBoundsNode.sharedElementEntry.getSharedElement().scope.nullableRoot;
                                    if (layoutCoordinates4 == null) {
                                        a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                                        break;
                                    } else {
                                        j2 = PlatformKt.m1344roundk4lQ0M(Offset.m625minusMKHz9U(currentBounds.m636getTopLeftF1C5BW0(), layoutCoordinates4.mo839localPositionOfR5De75A(coordinates3, 0L)));
                                    }
                                }
                                placementScope2.place(placeable, (int) (j2 >> 32), (int) (j2 & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE);
                            }
                        }
                    }
                } else {
                    placementScope2.place(placeable, 0, 0, RecyclerView.DECELERATION_RATE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedBoundsNode$measure$1(SharedBoundsNode sharedBoundsNode, Placeable placeable) {
        super(1);
        this.this$0 = sharedBoundsNode;
        this.$placeable = placeable;
    }
}
