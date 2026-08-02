package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.card.onboarding.TagOrderConfirmationViewModel;
import com.squareup.cash.cashapppay.views.GrantSheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardOnboardingUiFactory$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ TagOrderConfirmationViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CardOnboardingUiFactory$$ExternalSyntheticLambda3(TagOrderConfirmationViewModel tagOrderConfirmationViewModel, Function1 function1) {
        this.f$0 = tagOrderConfirmationViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        float f;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        TagOrderConfirmationViewModel tagOrderConfirmationViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    CanvasKt.TagOrderConfirmationView(tagOrderConfirmationViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    ChromeConfigKt.ChromeConfig(ChromeSystemIconColor.ALWAYS_LIGHT, (Boolean) null, gapComposer2, 6, 14);
                    long j2 = Strings.getColors(gapComposer2).semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j2, rectangleShapeKt$RectangleShape$1, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m);
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
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new GrantSheetKt$$ExternalSyntheticLambda4(4, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    TagOrderConfirmationViewModel.Style style = tagOrderConfirmationViewModel.style;
                    int ordinal = style.ordinal();
                    if (ordinal == 0) {
                        gapComposer2.startReplaceGroup(890733935);
                        j = Strings.getColors(gapComposer2).semantic.text.brand;
                        gapComposer2.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 890731503, false);
                        }
                        gapComposer2.startReplaceGroup(890736050);
                        j = Strings.getColors(gapComposer2).semantic.text.standard;
                        gapComposer2.end(false);
                    }
                    int ordinal2 = style.ordinal();
                    if (ordinal2 == 0) {
                        f = 1.0f;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        f = 0.5f;
                    }
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer2).headlineSmall, (TextLineBalancing) null, tagOrderConfirmationViewModel.title, (Map) null, (Function1) null, false);
                    Strings.getSizes(gapComposer2).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer2).headlineSmall, (TextLineBalancing) null, tagOrderConfirmationViewModel.subtitle, (Map) null, (Function1) null, false);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    BiasAlignment biasAlignment = Alignment.Companion.BottomCenter;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, layoutWeightElement);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    TagFormFactor tagFormFactor = tagOrderConfirmationViewModel.tagFormFactor;
                    if (tagFormFactor == null) {
                        gapComposer2.startReplaceGroup(-141958488);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-141958487);
                        CanvasKt.TagOrderConfirmationEffect(0, gapComposer2, AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), f), tagFormFactor, style == TagOrderConfirmationViewModel.Style.SUCCESS);
                        gapComposer2.end(false);
                    }
                    Modifier align = BoxScopeInstance.INSTANCE.align(companion, biasAlignment);
                    Strings.getSizes(gapComposer2).getClass();
                    DimensionKt.ButtonCtaGroup(SpacerKt.m300paddingVpY3zN4$default(align, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, null, null, Expect_jvmKt.rememberComposableLambda(-1141045966, new CheckDepositAmountKt$$ExternalSyntheticLambda6(12, (Object) tagOrderConfirmationViewModel, function1), gapComposer2), gapComposer2, 24576, 14);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                CanvasKt.TagOrderConfirmationView(tagOrderConfirmationViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardOnboardingUiFactory$$ExternalSyntheticLambda3(TagOrderConfirmationViewModel tagOrderConfirmationViewModel, Function1 function1, int i) {
        this.f$0 = tagOrderConfirmationViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ CardOnboardingUiFactory$$ExternalSyntheticLambda3(Function1 function1, TagOrderConfirmationViewModel tagOrderConfirmationViewModel) {
        this.f$1 = function1;
        this.f$0 = tagOrderConfirmationViewModel;
    }
}
