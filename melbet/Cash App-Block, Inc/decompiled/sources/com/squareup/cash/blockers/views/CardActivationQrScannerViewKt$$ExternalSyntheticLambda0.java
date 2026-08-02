package com.squareup.cash.blockers.views;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.scannerview.ScannerView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class CardActivationQrScannerViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Density f$2;
    public final /* synthetic */ CardActivationQrViewModel f$3;
    public final /* synthetic */ ParcelableSnapshotMutableIntState f$4;
    public final /* synthetic */ MutableState f$5;
    public final /* synthetic */ MutableState f$6;

    public /* synthetic */ CardActivationQrScannerViewKt$$ExternalSyntheticLambda0(Function1 function1, Density density, CardActivationQrViewModel cardActivationQrViewModel, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$2 = density;
        this.f$3 = cardActivationQrViewModel;
        this.f$4 = parcelableSnapshotMutableIntState;
        this.f$5 = mutableState;
        this.f$6 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ScannerView scannerView;
        Density density;
        Function1 function1;
        MutableState mutableState;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Modifier modifier;
        float f;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(514366313, new CardActivationQrScannerViewKt$$ExternalSyntheticLambda0(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, 1), gapComposer), gapComposer, 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f);
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ScannerView(context, null, 0, 6, null);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ScannerView scannerView2 = (ScannerView) rememberedValue;
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean changedInstance = gapComposer2.changedInstance(scannerView2);
                    Function1 function12 = this.f$1;
                    boolean changed = changedInstance | gapComposer2.changed(function12);
                    Density density2 = this.f$2;
                    boolean changed2 = changed | gapComposer2.changed(density2);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.f$4;
                    MutableState mutableState2 = this.f$5;
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new OverlayKt$$ExternalSyntheticLambda3(scannerView2, density2, function12, parcelableSnapshotMutableIntState, mutableState2, 11);
                        scannerView = scannerView2;
                        density = density2;
                        function1 = function12;
                        mutableState = mutableState2;
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    } else {
                        density = density2;
                        function1 = function12;
                        mutableState = mutableState2;
                        scannerView = scannerView2;
                    }
                    Function1 function13 = (Function1) rememberedValue2;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                        rememberedValue3 = new LabelValueView$$ExternalSyntheticLambda0(10);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    } else {
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$13;
                    }
                    Function1 function14 = (Function1) rememberedValue3;
                    CardActivationQrViewModel cardActivationQrViewModel = this.f$3;
                    boolean changedInstance2 = gapComposer2.changedInstance(cardActivationQrViewModel);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    MutableState mutableState3 = this.f$6;
                    if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                        modifier = fillMaxSize2;
                        rememberedValue4 = new BadgeQueries$$ExternalSyntheticLambda0(24, cardActivationQrViewModel, mutableState3);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    } else {
                        modifier = fillMaxSize2;
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
                    AndroidView_androidKt.AndroidView(function13, modifier, null, function14, (Function1) rememberedValue4, gapComposer2, 3120, 4);
                    GapComposer gapComposer3 = gapComposer2;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier align = boxScopeInstance.align(companion, biasAlignment);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed3 = gapComposer3.changed(function1);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState3, 7);
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, align, (DynamicColorConfiguration) null, (Function0) rememberedValue5, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1214717252, new BorrowHomeKt$$ExternalSyntheticLambda0(16, scannerView, mutableState), gapComposer3), gapComposer3, 1572918, 40);
                    if (parcelableSnapshotMutableIntState.getIntValue() > 0) {
                        gapComposer3.startReplaceGroup(1945395378);
                        Modifier align2 = boxScopeInstance.align(companion, Alignment.Companion.TopCenter);
                        float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(parcelableSnapshotMutableIntState.getIntValue());
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        f = 16.0f;
                        Room.m1165Text25TpFw(3, 0, 0, 3, 196608, 0, 2776, 0L, (Composer) gapComposer3, OffsetKt.m273offsetVpY3zN4$default(align2, RecyclerView.DECELERATION_RATE, mo233toDpu2uoSUM + 16.0f, 1), ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).helpText, new TextLineBalancing(1), cardActivationQrViewModel.instruction, (Map) null, (Function1) null, false);
                        gapComposer3 = gapComposer3;
                        gapComposer3.end(false);
                    } else {
                        f = 16.0f;
                        gapComposer3.startReplaceGroup(1945879071);
                        gapComposer3.end(false);
                    }
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxWidth(boxScopeInstance.align(companion, Alignment.Companion.BottomCenter), 1.0f));
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(navigationBarsPadding, f, f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m299paddingVpY3zN4);
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$14, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed4 = gapComposer3.changed(function1);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CashtagViewKt$$ExternalSyntheticLambda6(3, function1);
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1702776536, new SsnViewKt$$ExternalSyntheticLambda2(cardActivationQrViewModel, 13), gapComposer3), gapComposer3, 1573296, 56);
                    gapComposer3.end(true);
                    gapComposer3.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
