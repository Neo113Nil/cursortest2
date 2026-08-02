package androidx.navigation.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.common.FileTypes;
import androidx.navigation.NavHostController;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewModel;
import com.squareup.cash.card.onboarding.PdpPanelState;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt$$ExternalSyntheticLambda2;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.AngleAndQuadrant;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.Quadrant;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class NavHostKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ NavHostKt$$ExternalSyntheticLambda2(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i) {
        this.f$0 = navHostController;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$3 = alignment;
        this.f$5 = function1;
        this.f$6 = function12;
        this.f$7 = function13;
        this.f$8 = function14;
        this.f$10 = function15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue;
        int i = this.$r8$classId;
        Object obj3 = this.f$10;
        Object obj4 = this.f$8;
        Object obj5 = this.f$7;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$6;
        Object obj10 = this.f$5;
        Object obj11 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                NavHostKt.NavHost((NavHostController) obj11, (String) obj8, (Modifier) obj7, (Alignment) obj6, (Function1) obj10, (Function1) obj9, (Function1) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                CardDesignLibraryState cardDesignLibraryState = (CardDesignLibraryState) obj11;
                PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj8;
                PdpPanelState pdpPanelState = (PdpPanelState) obj7;
                Function1 function1 = (Function1) obj10;
                EnterTransitionImpl enterTransitionImpl = (EnterTransitionImpl) obj6;
                MutableState mutableState = (MutableState) obj9;
                List list = (List) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                MutableState mutableState3 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    OffsetKt.BoxWithConstraints(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f), null, false, Expect_jvmKt.rememberComposableLambda(-315521348, new TortoiseCardEffectKt$$ExternalSyntheticLambda2(cardDesignLibraryState, paymentDeviceCustomizationViewModel, pdpPanelState, function1, enterTransitionImpl, mutableState, list, mutableState2, mutableState3), gapComposer), gapComposer, 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj8;
                PointerInputScope pointerInputScope = (PointerInputScope) obj7;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj6;
                MutableState mutableState4 = (MutableState) obj10;
                State state = (State) obj9;
                State state2 = (State) obj5;
                Function2 function2 = (Function2) obj4;
                Function2 function22 = (Function2) obj3;
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                pointerInputChange.getClass();
                pointerInputChange.consume();
                if (!((Ref$BooleanRef) obj11).element || ref$ObjectRef.element == null) {
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = ((DistributionWheelViewModel) mutableState4.getValue()).allocations;
                intValue = ((Number) state.getValue()).intValue();
                DistributionWheelViewModel.Allocation.Treatment treatment = ((DistributionWheelViewModel.Allocation) arrayList.get(intValue)).getTreatment();
                DistributionWheelViewModel.Allocation.Treatment.InteractableSelected interactableSelected = treatment instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected ? (DistributionWheelViewModel.Allocation.Treatment.InteractableSelected) treatment : null;
                if (interactableSelected == null) {
                    return Unit.INSTANCE;
                }
                float f = interactableSelected.maxAllocation;
                AngleAndQuadrant m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k = HelpSheetViewKt.m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k((int) (((SuspendingPointerInputModifierNodeImpl) pointerInputScope).boundsSize >> 32), pointerInputChange.position);
                Quadrant quadrant = m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k.quadrant;
                float floatValue = ((Number) state2.getValue()).floatValue();
                Quadrant quadrant2 = (Quadrant) ref$ObjectRef.element;
                Quadrant quadrant3 = Quadrant.TOP_LEFT;
                if (quadrant2 == quadrant3 && quadrant == Quadrant.TOP_RIGHT) {
                    m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k = new AngleAndQuadrant(floatValue + f, quadrant2);
                } else if (quadrant2 == Quadrant.TOP_RIGHT && quadrant == quadrant3) {
                    m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k = new AngleAndQuadrant(floatValue + RecyclerView.DECELERATION_RATE, quadrant2);
                }
                float f2 = m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k.angle;
                Quadrant quadrant4 = m3698access$getAngleAndQuadrantOfClosestPointOnCircumference3MmeM6k.quadrant;
                float min = Math.min(Math.max(RecyclerView.DECELERATION_RATE, f2 - ((Number) state2.getValue()).floatValue()), f);
                Float valueOf = Float.valueOf(min);
                if (ref$ObjectRef2.element == null) {
                    function2.invoke(Integer.valueOf(((Number) state.getValue()).intValue()), Float.valueOf(min));
                } else {
                    function22.invoke(Integer.valueOf(((Number) state.getValue()).intValue()), Float.valueOf(min));
                }
                ref$ObjectRef2.element = valueOf;
                ref$ObjectRef.element = quadrant4;
                return Unit.INSTANCE;
            default:
                ChatContentViewModel.MessageViewModel messageViewModel = (ChatContentViewModel.MessageViewModel) obj11;
                Function1 function12 = (Function1) obj10;
                Function1 function13 = (Function1) obj9;
                BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel = (BodyViewModel$ActivityBodyViewModel) obj8;
                SupportActivityItemLoader supportActivityItemLoader = (SupportActivityItemLoader) obj7;
                RealImageLoader realImageLoader = (RealImageLoader) obj6;
                Function1 function14 = (Function1) obj5;
                MutableState mutableState5 = (MutableState) obj4;
                MutableState mutableState6 = (MutableState) obj3;
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.End;
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 54);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, false);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new OverlayKt$$ExternalSyntheticLambda1(21, mutableState5);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    MessageFileKt.MessageBodyActivity(bodyViewModel$ActivityBodyViewModel, supportActivityItemLoader, realImageLoader, function14, null, (Function0) rememberedValue, gapComposer2, 196608);
                    gapComposer2.end(true);
                    FileTypes fileTypes = messageViewModel.status;
                    boolean z = fileTypes instanceof ChatContentViewModel$MessageViewModel$Status$Failed;
                    if (z) {
                        gapComposer2.startReplaceGroup(1641112255);
                        String statusText = MessageFileKt.toStatusText(fileTypes, gapComposer2);
                        String str = messageViewModel.idempotenceToken;
                        boolean booleanValue = ((Boolean) mutableState6.getValue()).booleanValue();
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda10(12, mutableState6);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        MessageFileKt.MessageFailedRetryUI(str, booleanValue, (Function1) rememberedValue2, function12, function13, statusText, false, gapComposer2, MLKEMEngine.KyberPolyBytes, 64);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1641518758);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    String statusText2 = MessageFileKt.toStatusText(fileTypes, gapComposer2);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 6);
                    int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    MessageFileKt.MessageStatus(statusText2, messageViewModel.status, messageViewModel.timestamp, ((Boolean) mutableState5.getValue()).booleanValue(), z ? SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 44.0f, RecyclerView.DECELERATION_RATE, 11) : SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), gapComposer2, 0, 0);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NavHostKt$$ExternalSyntheticLambda2(CardDesignLibraryState cardDesignLibraryState, PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel, PdpPanelState pdpPanelState, Function1 function1, EnterTransitionImpl enterTransitionImpl, MutableState mutableState, List list, MutableState mutableState2, MutableState mutableState3) {
        this.f$0 = cardDesignLibraryState;
        this.f$1 = paymentDeviceCustomizationViewModel;
        this.f$2 = pdpPanelState;
        this.f$5 = function1;
        this.f$3 = enterTransitionImpl;
        this.f$6 = mutableState;
        this.f$7 = list;
        this.f$8 = mutableState2;
        this.f$10 = mutableState3;
    }

    public /* synthetic */ NavHostKt$$ExternalSyntheticLambda2(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Function1 function12, BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader, Function1 function13, MutableState mutableState, MutableState mutableState2) {
        this.f$0 = messageViewModel;
        this.f$5 = function1;
        this.f$6 = function12;
        this.f$1 = bodyViewModel$ActivityBodyViewModel;
        this.f$2 = supportActivityItemLoader;
        this.f$3 = realImageLoader;
        this.f$7 = function13;
        this.f$8 = mutableState;
        this.f$10 = mutableState2;
    }

    public /* synthetic */ NavHostKt$$ExternalSyntheticLambda2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, PointerInputScope pointerInputScope, Ref$ObjectRef ref$ObjectRef2, MutableState mutableState, State state, State state2, Function2 function2, Function2 function22) {
        this.f$0 = ref$BooleanRef;
        this.f$1 = ref$ObjectRef;
        this.f$2 = pointerInputScope;
        this.f$3 = ref$ObjectRef2;
        this.f$5 = mutableState;
        this.f$6 = state;
        this.f$7 = state2;
        this.f$8 = function2;
        this.f$10 = function22;
    }
}
