package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.paychecks.backend.api.mapper.PaycheckAllocationDistributionMappersKt;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.persona.views.PersonaDidvViewKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaycheckCircles$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PaycheckCircles$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.startReplaceGroup(-1221774282);
                    PaycheckCircles.INSTANCE.UnknownCircle(390, 2, gapComposer, Modifier.Companion.$$INSTANCE, false);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = (PaycheckAllocationDistribution.DestinationAndShare) obj;
                PaycheckAllocationDistribution.DestinationAndShare destinationAndShare2 = (PaycheckAllocationDistribution.DestinationAndShare) obj2;
                long j = destinationAndShare.shareInBasisPoints;
                long j2 = destinationAndShare2.shareInBasisPoints;
                return Integer.valueOf(j == j2 ? Intrinsics.compare(PaycheckAllocationDistributionMappersKt.defaultSortOrder(destinationAndShare.destination), PaycheckAllocationDistributionMappersKt.defaultSortOrder(destinationAndShare2.destination)) : Intrinsics.compare(j, j2));
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj).intValue();
                ((Float) obj2).floatValue();
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj).intValue();
                ((Float) obj2).floatValue();
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj).intValue();
                ((Float) obj2).floatValue();
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj).intValue();
                ((Float) obj2).floatValue();
                return Unit.INSTANCE;
            case 9:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 200.0f);
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.background.standard, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer5.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DistributionWheelViewModel.Content.EditSingleDistributionScreen editSingleDistributionScreen = new DistributionWheelViewModel.Content.EditSingleDistributionScreen("14%", "$211.30", (4 & 4) != 0, (4 & 8) == 0 ? new DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Image(new Image("fake:///BlueBottle.png", "fake:///BlueBottle.png", 4)) : null);
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda4(20);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    ReceiptWheelContentKt.EditSingleDistributionWheelContent(editSingleDistributionScreen, (Function1) rememberedValue, gapComposer5, 48);
                    gapComposer5.end(true);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6);
                    Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors2.semantic.icon.warning, (String) null, (Modifier) null, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer6, 199734, 0, 2000);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors3 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, m177backgroundbw27NRU2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer7, null);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors4 = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors4.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer8, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer8, null);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer9, SizeKt.m285size3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11);
                    Painter painterResource = Countries.painterResource(R.drawable.receipt_button_heart, 0, gapComposer10);
                    Colors colors5 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    long j3 = colors5.semantic.icon.standard;
                    ImageKt.Image(painterResource, null, m302paddingqDBjuR0$default, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j3, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j3), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer10, Painter.$stable | 432, 56);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer11, SizeKt.m285size3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                QuickPayViewKt.QuickPayExitRouterView((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    AvatarImage.LocalIcon localIcon2 = new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6);
                    Colors colors6 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize2, "", colors6.semantic.icon.warning, (String) null, (Modifier) null, (AvatarImage) localIcon2, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer12, 199734, 0, 2000);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.PersonalizedPayments16, (String) null, (Modifier) null, 0L, gapComposer13, 54, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.payment_personalize_text), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.payment_schedule_unsupported_body), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                CoreFlowRealSheetState coreFlowRealSheetState = (CoreFlowRealSheetState) obj2;
                ((SaveableHolder) obj).getClass();
                coreFlowRealSheetState.getClass();
                return (CoreFlowSheetPosition) coreFlowRealSheetState.draggableState.currentValue$delegate.getValue();
            case 21:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.nearby_pay_request_pay), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.nearby_pay_request_get_paid), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Image image = new Image("fake:///bg.png", "fake:///bg.png", 4);
                    Color color = new Color(new Color.ModeVariant("#1A6B3C", null, null, null, null, 30, null), new Color.ModeVariant("#1A6B3C", null, null, null, null, 30, null), 4);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    Object rememberedValue2 = gapComposer17.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MainPaymentViewKt$$ExternalSyntheticLambda0(27);
                        gapComposer17.updateRememberedValue(rememberedValue2);
                    }
                    AlphaKt.ExpressivePreview(image, color, emptyList, "$50.00", (Function0) rememberedValue2, null, null, null, gapComposer17, 28032, 224);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    PersonaDidvViewKt.PersonaDidvLoading(gapComposer18, 0);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                PersonaDidvViewKt.PersonaDidvLoading((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 26:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer19, null);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                MobilePlanHome mobilePlanHome = (MobilePlanHome) obj2;
                ((SaveableHolder) obj).getClass();
                if (mobilePlanHome != null) {
                    return mobilePlanHome.encode();
                }
                return null;
            case 28:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size64;
                    Colors colors7 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    TextViewKt.Avatar(avatarSize3, new AvatarEntry("", colors7.semantic.icon.danger, null, new AvatarImage.LocalIcon(Icons.Failed32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer20, 6, 28);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    AvatarSize avatarSize4 = AvatarSize.Size64;
                    Colors colors8 = (Colors) gapComposer21.consume(ArcadeThemeKt.LocalColors);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer21, -1762997026, gapComposer21, false);
                    } else {
                        gapComposer21.startReplaceGroup(-1762997739);
                        gapComposer21.end(false);
                    }
                    TextViewKt.Avatar(avatarSize4, new AvatarEntry("", colors8.semantic.icon.standard, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer21, 6, 28);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PaycheckCircles$$ExternalSyntheticLambda4(int i, int i2) {
        this.$r8$classId = i2;
    }
}
