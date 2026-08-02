package com.squareup.cash.payments.views.nearby;

import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewModel;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import string.ReplaceModeKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class NearbyPaymentKeypadViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ NearbyPaymentKeypadViewModel f$1;
    public final /* synthetic */ AvatarImage.Remote.Image f$2;
    public final /* synthetic */ RealImageLoader f$3;

    public /* synthetic */ NearbyPaymentKeypadViewKt$$ExternalSyntheticLambda2(Function1 function1, NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel, AvatarImage.Remote.Image image, RealImageLoader realImageLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = nearbyPaymentKeypadViewModel;
        this.f$2 = image;
        this.f$3 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1277570305, new NearbyPaymentKeypadViewKt$$ExternalSyntheticLambda2(this.f$0, this.f$1, this.f$2, this.f$3, 1), gapComposer), gapComposer, 3072, 7);
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
                    long j = Strings.getColors(gapComposer2).semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = this.f$1;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1712419473, new PdfPreviewViewKt$$ExternalSyntheticLambda0(8, nearbyPaymentKeypadViewModel, this.f$2), gapComposer2);
                    Function1 function1 = this.f$0;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(11, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1710219220, new PdfPreviewViewKt$$ExternalSyntheticLambda4(6, function1), gapComposer2), gapComposer2, 1572918, 44);
                    AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(nearbyPaymentKeypadViewModel.currencyCode, null, false, 0, 14);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj3) {
                        rememberedValue2 = nearbyPaymentKeypadViewModel.initialAmount;
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AmountKeypadState rememberAmountKeypadState = Debug.rememberAmountKeypadState(moneyConfig, (String) rememberedValue2, gapComposer2, 24632, 12);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == obj3) {
                        rememberedValue3 = new ProfileKt$$ExternalSyntheticLambda3(2, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    ReplaceModeKt.m4397AmountKeypadVjY4oTo(rememberAmountKeypadState, (Function1) rememberedValue3, new LayoutWeightElement(1.0f, true), Strings.getColors(gapComposer2).semantic.text.prominent, Strings.getColors(gapComposer2).semantic.text.standard, NearbyPayRequestViewKt.lambda$1516075516, NearbyPayRequestViewKt.f559lambda$1922241637, 0, 0L, gapComposer2, 14155776, 800);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Strings.getSizes(gapComposer2).getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 48);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                    String str = nearbyPaymentKeypadViewModel.instrumentLabel;
                    String str2 = nearbyPaymentKeypadViewModel.instrumentSubLabel;
                    InstrumentAvatarViewModel instrumentAvatarViewModel = nearbyPaymentKeypadViewModel.instrumentAvatarViewModel;
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue4 == obj3) {
                        rememberedValue4 = new ActionMenuKt$$ExternalSyntheticLambda0(12, function1);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    NearbyPayRequestViewKt.InstrumentInformation((Function0) rememberedValue4, str, str2, instrumentAvatarViewModel, this.f$3, weight, gapComposer2, 0);
                    Modifier weight2 = rowScopeInstance.weight(1.0f, companion, true);
                    boolean z = nearbyPaymentKeypadViewModel.isPayEnabled;
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed4 = gapComposer2.changed(function1);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue5 == obj3) {
                        rememberedValue5 = new ActionMenuKt$$ExternalSyntheticLambda0(8, function1);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, weight2, buttonProminence, false, z, null, NearbyPayRequestViewKt.f560lambda$769038046, gapComposer2, 1573248, 40);
                    gapComposer2.end(true);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
