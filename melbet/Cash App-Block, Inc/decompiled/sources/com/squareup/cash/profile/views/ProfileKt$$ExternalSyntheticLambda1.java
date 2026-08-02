package com.squareup.cash.profile.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewModel;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoInfoItem;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoItemArticle;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewModel;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewModel;
import com.squareup.cash.payments.viewmodels.WarningDialogViewModel;
import com.squareup.cash.payments.views.GetPaidPayerOverlayKt;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.payments.views.composer.Subject;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.phoneplans.applets.views.PhonePlansAppletTile$$ExternalSyntheticLambda7;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolListNuxAssets;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewModel;
import com.squareup.cash.pools.views.Placement;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.pools.views.PoolGoalMetKt;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.PoolsListViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.animation.AvatarLayoutAnimationStateHolder;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda1(PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel, Function1 function1) {
        this.$r8$classId = 24;
        this.f$0 = prepurchaseCashCardPlanningViewModel;
        this.f$1 = function1;
    }

    private final Object invoke$com$squareup$cash$payments$views$nearby$NearbyPermissionsPromptSheetViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        NearbyPermissionsPromptSheetViewModel.Ready ready = (NearbyPermissionsPromptSheetViewModel.Ready) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(23071234, new PoolListSectionKt$$ExternalSyntheticLambda2(ready, 12), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$phoneplans$PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        PhonePlansEsimCheckViewModel phonePlansEsimCheckViewModel = (PhonePlansEsimCheckViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        int i = 1;
        int i2 = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            PhonePlansEsimCheckViewModel.Cta cta = phonePlansEsimCheckViewModel.secondaryCta;
            Object obj4 = Composer.Companion.Empty;
            if (cta == null) {
                gapComposer.startReplaceGroup(605899781);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(605899782);
                boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(cta);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == obj4) {
                    rememberedValue = new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda7(function1, cta, 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1931871697, new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda8(cta, i2), gapComposer), gapComposer, 1572864, 62);
                gapComposer.end(false);
            }
            PhonePlansEsimCheckViewModel.Cta cta2 = phonePlansEsimCheckViewModel.primaryCta;
            if (cta2 == null) {
                gapComposer.startReplaceGroup(606085378);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(606085379);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(cta2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == obj4) {
                    rememberedValue2 = new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda7(function1, cta2, 2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1520361594, new PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda8(cta2, i), gapComposer), gapComposer, 1573248, 58);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$phoneplans$WirelessProviderListViewKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        WirelessProviderListViewModel.Content content = (WirelessProviderListViewModel.Content) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean z = content.isButtonEnabled;
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PdfPreviewView$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, null, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-1948616701, new PoolListSectionKt$$ExternalSyntheticLambda2(content, 13), gapComposer), gapComposer, 1573248, 42);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolContributeComposerKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier padding = SpacerKt.padding(OffsetKt.consumeWindowInsets(Modifier.Companion.$$INSTANCE, Arrangement$End$1.current(gapComposer).statusBars), paddingValues);
            if (poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.AmountAtmPicker) {
                gapComposer.startReplaceGroup(-183133254);
                PoolToastKt.PoolContributeAmountAtm((PoolContributeWithNoteViewModel.AmountAtmPicker) poolContributeWithNoteViewModel, function1, padding, gapComposer, 0);
                gapComposer.end(false);
            } else if (poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.AmountCustomPicker) {
                gapComposer.startReplaceGroup(-183129123);
                PoolToastKt.PoolContributeAmountCustom((PoolContributeWithNoteViewModel.AmountCustomPicker) poolContributeWithNoteViewModel, function1, padding, gapComposer, 0);
                gapComposer.end(false);
            } else if (poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.InputNote) {
                gapComposer.startReplaceGroup(-183125195);
                PoolToastKt.PoolContributeNote((PoolContributeWithNoteViewModel.InputNote) poolContributeWithNoteViewModel, function1, padding, gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(poolContributeWithNoteViewModel instanceof PoolContributeWithNoteViewModel.Review)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -183135704, false);
                }
                gapComposer.startReplaceGroup(-183121609);
                PoolToastKt.PoolContributeReview((PoolContributeWithNoteViewModel.Review) poolContributeWithNoteViewModel, function1, padding, gapComposer, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolGoalMetKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        int i;
        List list = (List) this.f$0;
        GoalMetTimeline goalMetTimeline = (GoalMetTimeline) this.f$1;
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        boxWithConstraintsScopeImpl.getClass();
        long j = boxWithConstraintsScopeImpl.constraints;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            int min = Math.min(Constraints.m1025getMaxWidthimpl(j), Constraints.m1024getMaxHeightimpl(j));
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = list.size() == 1 ? PoolGoalMetKt.layout1 : list.size() <= 4 ? PoolGoalMetKt.layout4 : list.size() <= 7 ? PoolGoalMetKt.layout7 : list.size() <= 9 ? PoolGoalMetKt.layout9 : list.size() <= 10 ? PoolGoalMetKt.layout10 : PoolGoalMetKt.layoutMore;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            List list2 = (List) rememberedValue;
            int i2 = 0;
            for (Object obj4 : CollectionsKt.take(list, list2.size())) {
                int i3 = i2 + 1;
                Continuation continuation = null;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                AvatarEntry avatarEntry = (AvatarEntry) obj4;
                Placement placement = (Placement) list2.get(i2);
                float mo232toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo232toDpu2uoSUM(min * placement.scale);
                float f = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new AvatarLayoutAnimationStateHolder(f, i2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AvatarLayoutAnimationStateHolder avatarLayoutAnimationStateHolder = (AvatarLayoutAnimationStateHolder) rememberedValue2;
                Unit unit = Unit.INSTANCE;
                boolean changed = gapComposer.changed(goalMetTimeline) | gapComposer.changed(avatarLayoutAnimationStateHolder);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new RingtoneView.AnonymousClass1(goalMetTimeline, avatarLayoutAnimationStateHolder, continuation, 5);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, mo232toDpu2uoSUM);
                boolean changed2 = gapComposer.changed(avatarLayoutAnimationStateHolder) | gapComposer.changed(placement) | gapComposer.changed(min);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue4 == neverEqualPolicy) {
                    i = 0;
                    rememberedValue4 = new PoolGoalMetKt$$ExternalSyntheticLambda6(avatarLayoutAnimationStateHolder, placement, min, 0);
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    i = 0;
                }
                VisibleKt.ScalableAvatar(avatarEntry, ZIndexModifierKt.zIndex(ColorKt.graphicsLayer(m285size3ABfNKs, (Function1) rememberedValue4), list2.size() - i2), gapComposer, i);
                i2 = i3;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolListSectionKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f$0;
        PoolListNuxAssets poolListNuxAssets = (PoolListNuxAssets) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            if (list.isEmpty()) {
                gapComposer.startReplaceGroup(190330073);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(190273374);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            PoolToastKt.NuxInfo(null, poolListNuxAssets, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$pools$views$PoolMoreOptionsBottomSheetViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel = (PoolMoreOptionsBottomSheetViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            PoolToastKt.PoolMoreOptionsBottomSheet(function1, SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues), poolMoreOptionsBottomSheetViewModel.canManagePool, poolMoreOptionsBottomSheetViewModel.hasLeavePoolOption, poolMoreOptionsBottomSheetViewModel.poolHasBalance, poolMoreOptionsBottomSheetViewModel.isPoolClosed, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchaseCashCardLoadablesKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        ButtonProminence buttonProminence = (ButtonProminence) this.f$0;
        PrepurchaseCashCardPlanningViewModel.LoadableButton loadableButton = (PrepurchaseCashCardPlanningViewModel.LoadableButton) obj;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        loadableButton.getClass();
        boolean z = loadableButton instanceof PrepurchaseCashCardPlanningViewModel.LoadableButton.Loaded;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-633127375);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(loadableButton);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(10, function1, loadableButton);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1439802421, new PoolListSectionKt$$ExternalSyntheticLambda2(loadableButton, 18), gapComposer), gapComposer, 1572864, 56);
            gapComposer.end(false);
        } else if (loadableButton instanceof PrepurchaseCashCardPlanningViewModel.LoadableButton.Loading) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-632845337);
            VisibleKt.ShimmerBox(companion, false, null, Expect_jvmKt.rememberComposableLambda(324515168, new PoolListSectionKt$$ExternalSyntheticLambda2(buttonProminence, 19), gapComposer2), gapComposer2, 3072, 6);
            gapComposer2.end(false);
        } else {
            if (!(loadableButton instanceof PrepurchaseCashCardPlanningViewModel.LoadableButton.Waiting)) {
                throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 810859373, false);
            }
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(-632218982);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PoolsListViewKt$$ExternalSyntheticLambda6(26);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth2, true, (Function1) rememberedValue2);
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new DateScrubber$$ExternalSyntheticLambda0(13);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, semantics, buttonProminence, false, false, null, LocaleToggleKt.f577lambda$1412688339, gapComposer3, 1572870, 56);
            gapComposer3.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchaseCashCardPlanningSheetViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        PrepurchaseCashCardPlanningViewModel prepurchaseCashCardPlanningViewModel = (PrepurchaseCashCardPlanningViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier consumeWindowInsets = OffsetKt.consumeWindowInsets(SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues), paddingValues);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, consumeWindowInsets);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.LocaleToggle localeToggle = prepurchaseCashCardPlanningViewModel.getLocaleToggle();
            if (localeToggle == null) {
                gapComposer.startReplaceGroup(-2108580101);
            } else {
                gapComposer.startReplaceGroup(-2108580100);
                LocaleToggleKt.LocaleToggle(localeToggle, function1, null, gapComposer, 0);
            }
            gapComposer.end(false);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda6(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(prepurchaseCashCardPlanningViewModel, null, (Function1) rememberedValue, null, "Prepurchase Card sheet transition", null, Expect_jvmKt.rememberComposableLambda(-295944532, new HeroCardViewKt$$ExternalSyntheticLambda1(16, function1), gapComposer), gapComposer, 1597824, 42);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchasePlanningSheetSelectPaymentKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet prepurchaseCardPaymentPlanOptionsSheet = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(prepurchaseCardPaymentPlanOptionsSheet);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(13, function1, prepurchaseCardPaymentPlanOptionsSheet);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-458637628, new PoolListSectionKt$$ExternalSyntheticLambda2(prepurchaseCardPaymentPlanOptionsSheet, 21), gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$devicemanager$views$DeviceManagerListViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        DeviceViewModel deviceViewModel = (DeviceViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            DeviceManagerListViewKt.DeviceItemView(null, deviceViewModel, function1, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$devicemanager$views$DeviceManagerListViewKt$$ExternalSyntheticLambda12(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$1;
        DeviceManagerListViewModel.DeviceAction deviceAction = (DeviceManagerListViewModel.DeviceAction) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(deviceAction);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(14, function1, deviceAction);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue, m300paddingVpY3zN4$default, null, true, false, null, Expect_jvmKt.rememberComposableLambda(743709402, new PoolListSectionKt$$ExternalSyntheticLambda2(deviceAction, 24), gapComposer), gapComposer, 1575936, 52);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$profile$devicemanager$views$DeviceRemovalFailedViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        DeviceRemovalFailedViewModel deviceRemovalFailedViewModel = (DeviceRemovalFailedViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier padding = SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            DeviceManagerListViewKt.DeviceRemovalFailedHalfSheetContent(deviceRemovalFailedViewModel, function1, ImageKt.m177backgroundbw27NRU(padding, colors.semantic.background.f1047app, ColorKt.RectangleShape), gapComposer, 0, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        boolean z2;
        AvatarImage.Remote.Image image;
        Color m;
        long j;
        int i2 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        final int i4 = 0;
        switch (i2) {
            case 0:
                ProfileViewModel.Loaded.ProfileHeader.FavoriteAction favoriteAction = (ProfileViewModel.Loaded.ProfileHeader.FavoriteAction) obj4;
                Function1 function1 = (Function1) obj5;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    CrossfadeKt.Crossfade(favoriteAction.addOrRemoveAsFavoriteButtonViewModel.favoriteState, (Modifier) null, (FiniteAnimationSpec) null, "Favorite Action", Expect_jvmKt.rememberComposableLambda(-766648604, new SheetKt$$ExternalSyntheticLambda5(4, titleBarActionScope, function1, favoriteAction), gapComposer), gapComposer, 27648, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function1 function12 = (Function1) obj5;
                PaychecksHomeViewModel.Content.Button button = (PaychecksHomeViewModel.Content.Button) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean changed = gapComposer2.changed(function12) | gapComposer2.changedInstance(button);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        i = 1;
                        rememberedValue = new ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda15(function12, button, 1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    } else {
                        i = 1;
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-449212257, new ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda16(button, i), gapComposer2), gapComposer2, 1573248, 58);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                PaychecksHomeViewModel paychecksHomeViewModel = (PaychecksHomeViewModel) obj4;
                Function1 function13 = (Function1) obj5;
                ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                scrollingScaffoldContentScope.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(scrollingScaffoldContentScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    int i5 = 5;
                    Strings.LoadableFullScreenContent(paychecksHomeViewModel, paychecksHomeViewModel instanceof PaychecksHomeViewModel.Loading, null, new OffersHomeQueries$$ExternalSyntheticLambda1(false, i5), null, Expect_jvmKt.rememberComposableLambda(838352939, new PoolDetailsViewKt$$ExternalSyntheticLambda41(i5, function13, scrollingScaffoldContentScope), gapComposer3), gapComposer3, 196608, 20);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function0 function0 = (Function0) obj4;
                PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent pendingDirectDepositSheetContent = (PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent) obj5;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    coil3.size.SizeKt.ButtonCta(function0, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, false, null, Expect_jvmKt.rememberComposableLambda(-691273576, new P2PListViewKt$$ExternalSyntheticLambda12(pendingDirectDepositSheetContent, 27), gapComposer4), gapComposer4, 1573296, 56);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                DistributionWheelViewModel distributionWheelViewModel = (DistributionWheelViewModel) obj4;
                Function1 function14 = (Function1) obj5;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    ReceiptWheelContentKt.DistributionWheelInnerContent(distributionWheelViewModel.content, function14, gapComposer5, MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ConfirmDuplicateDialogViewModel confirmDuplicateDialogViewModel = (ConfirmDuplicateDialogViewModel) obj4;
                Function1 function15 = (Function1) obj5;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    String str = confirmDuplicateDialogViewModel.primaryButtonText;
                    if (str == null) {
                        gapComposer6.startReplaceGroup(554172645);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(554172646);
                        boolean changed2 = gapComposer6.changed(function15);
                        Object rememberedValue2 = gapComposer6.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new HomeViewKt$$ExternalSyntheticLambda8(13, function15);
                            gapComposer6.updateRememberedValue(rememberedValue2);
                        }
                        modalButtonScope.PrimaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(-718004758, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 27), gapComposer6), gapComposer6, ((intValue6 << 12) & 57344) | 3072, 6);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                Function1 function16 = (Function1) obj5;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((PaddingValues) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                boolean shouldExecute = gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16);
                Applier applier = gapComposer7.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getColors(gapComposer7).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    Strings.getSizes(gapComposer7).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 16.0f, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer7, 48);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer7.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer7, valueOf, composeUiNode$Companion$SetModifier$14);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer7, materializeModifier, composeUiNode$Companion$SetModifier$15);
                    Character ch = confirmRecipientDialogViewModel.monogram;
                    AvatarViewModel avatarViewModel = confirmRecipientDialogViewModel.avatarViewModel;
                    if (ch == null || avatarViewModel == null) {
                        gapComposer7.startReplaceGroup(88739901);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 12.0f, 1), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer7).semantic.background.prominent, rectangleShapeKt$RectangleShape$1), 64.0f);
                        z = false;
                        ImageKt.Image(Countries.painterResource(R.drawable.avatar_generic, 0, gapComposer7), null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer7, Painter.$stable | 48, 120);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(88011897);
                        Image image2 = GrpcStatus.Companion.getImage(avatarViewModel);
                        if (image2 == null) {
                            gapComposer7.startReplaceGroup(88072160);
                            z2 = false;
                            gapComposer7.end(false);
                            image = null;
                        } else {
                            gapComposer7.startReplaceGroup(88072161);
                            AvatarImage.Remote.Image image3 = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image2, gapComposer7), false, null, 0L, new PaycheckCircles$$ExternalSyntheticLambda3(25), 62);
                            z2 = false;
                            gapComposer7.end(false);
                            image = image3;
                        }
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, 12.0f, 1);
                        AvatarSize avatarSize = AvatarSize.Size64;
                        String valueOf2 = String.valueOf(confirmRecipientDialogViewModel.monogram);
                        ColorModel colorModel = avatarViewModel.accentColor;
                        if (colorModel == null) {
                            gapComposer7.startReplaceGroup(88522435);
                            gapComposer7.end(z2);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer7, -412786434, colorModel, gapComposer7, z2);
                        }
                        if (m == null) {
                            gapComposer7.startReplaceGroup(-412784164);
                            j = Strings.getColors(gapComposer7).semantic.background.standard;
                            gapComposer7.end(z2);
                        } else {
                            gapComposer7.startReplaceGroup(-412787512);
                            gapComposer7.end(z2);
                            j = m.value;
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf2, j, (String) null, m300paddingVpY3zN4$default, (AvatarImage) image, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer7, 27654, 0, 1984);
                        gapComposer7.end(false);
                        z = false;
                    }
                    String str2 = confirmRecipientDialogViewModel.titleText;
                    if (str2 == null) {
                        gapComposer7.startReplaceGroup(89142466);
                        gapComposer7.end(z);
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    } else {
                        gapComposer7.startReplaceGroup(89142467);
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3832, 0L, (Composer) gapComposer7, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7), Strings.getTypography(gapComposer7).sectionTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer7.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3834, 0L, (Composer) gapComposer7, (Modifier) null, Strings.getTypography(gapComposer7).bodyMedium, (TextLineBalancing) null, confirmRecipientDialogViewModel.messageText, (Map) null, (Function1) null, false);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer7, 6);
                    int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer7, m302paddingqDBjuR0$default);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer7, composeUiNode$Companion$SetModifier$1, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer7, materializeModifier2, composeUiNode$Companion$SetModifier$15);
                    String str3 = confirmRecipientDialogViewModel.primaryButtonText;
                    if (str3 == null) {
                        gapComposer7.startReplaceGroup(265753283);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(265753284);
                        ButtonProminence buttonProminence2 = ButtonProminence.SUBTLE;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                        boolean changed3 = gapComposer7.changed(function16);
                        Object rememberedValue3 = gapComposer7.rememberedValue();
                        if (changed3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new HomeViewKt$$ExternalSyntheticLambda8(15, function16);
                            gapComposer7.updateRememberedValue(rememberedValue3);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue3, fillMaxWidth, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(337353951, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str3, 28), gapComposer7), gapComposer7, 1573296, 56);
                        gapComposer7.end(false);
                    }
                    if (confirmRecipientDialogViewModel.canViewProfile) {
                        gapComposer7.startReplaceGroup(266054480);
                        ButtonProminence buttonProminence3 = ButtonProminence.SUBTLE;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                        boolean changed4 = gapComposer7.changed(function16);
                        Object rememberedValue4 = gapComposer7.rememberedValue();
                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new HomeViewKt$$ExternalSyntheticLambda8(16, function16);
                            gapComposer7.updateRememberedValue(rememberedValue4);
                        }
                        coil3.size.SizeKt.Button((Function0) rememberedValue4, fillMaxWidth2, buttonProminence3, false, false, null, QuickPayViewKt.lambda$1323147378, gapComposer7, 1573296, 56);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(266414328);
                        gapComposer7.end(false);
                    }
                    ButtonProminence buttonProminence4 = ButtonProminence.SUBTLE;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    boolean changed5 = gapComposer7.changed(function16);
                    Object rememberedValue5 = gapComposer7.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new HomeViewKt$$ExternalSyntheticLambda8(17, function16);
                        gapComposer7.updateRememberedValue(rememberedValue5);
                    }
                    coil3.size.SizeKt.Button((Function0) rememberedValue5, fillMaxWidth3, buttonProminence4, false, false, null, QuickPayViewKt.f549lambda$1683823081, gapComposer7, 1573296, 56);
                    gapComposer7.end(true);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Function1 function17 = (Function1) obj5;
                NoteRequiredViewModel noteRequiredViewModel = (NoteRequiredViewModel) obj4;
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean changed6 = gapComposer8.changed(function17);
                    Object rememberedValue6 = gapComposer8.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new HomeViewKt$$ExternalSyntheticLambda8(26, function17);
                        gapComposer8.updateRememberedValue(rememberedValue6);
                    }
                    modalButtonScope2.PrimaryModalButton((Function0) rememberedValue6, null, false, Expect_jvmKt.rememberComposableLambda(1155722647, new PoolListSectionKt$$ExternalSyntheticLambda2(noteRequiredViewModel, 2), gapComposer8), gapComposer8, ((intValue8 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Function1 function18 = (Function1) obj5;
                RecipientSelectionWarningViewModel recipientSelectionWarningViewModel = (RecipientSelectionWarningViewModel) obj4;
                ModalButtonScope modalButtonScope3 = (ModalButtonScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                modalButtonScope3.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(modalButtonScope3) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    boolean changed7 = gapComposer9.changed(function18);
                    Object rememberedValue7 = gapComposer9.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new WarningDialogViewKt$$ExternalSyntheticLambda5(18, function18);
                        gapComposer9.updateRememberedValue(rememberedValue7);
                    }
                    modalButtonScope3.PrimaryModalButton((Function0) rememberedValue7, null, false, Expect_jvmKt.rememberComposableLambda(-516930020, new PoolListSectionKt$$ExternalSyntheticLambda2(recipientSelectionWarningViewModel, 5), gapComposer9), gapComposer9, ((intValue9 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function19 = (Function1) obj5;
                WarningDialogViewModel warningDialogViewModel = (WarningDialogViewModel) obj4;
                ModalButtonScope modalButtonScope4 = (ModalButtonScope) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                modalButtonScope4.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(modalButtonScope4) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    boolean changed8 = gapComposer10.changed(function19);
                    Object rememberedValue8 = gapComposer10.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new WarningDialogViewKt$$ExternalSyntheticLambda5(0, function19);
                        gapComposer10.updateRememberedValue(rememberedValue8);
                    }
                    modalButtonScope4.PrimaryModalButton((Function0) rememberedValue8, null, false, Expect_jvmKt.rememberComposableLambda(-1018236144, new WarningDialogViewKt$$ExternalSyntheticLambda2(warningDialogViewModel, 2), gapComposer10), gapComposer10, ((intValue10 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Subject subject = (Subject) obj4;
                Function0 function02 = (Function0) obj5;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                GapComposer gapComposer11 = (GapComposer) ((Composer) obj2);
                boolean changed9 = gapComposer11.changed(subject);
                Applier applier2 = gapComposer11.applier;
                boolean changed10 = changed9 | gapComposer11.changed(function02);
                Object rememberedValue9 = gapComposer11.rememberedValue();
                if (changed10 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new OpenSourceKt$$ExternalSyntheticLambda11(4, subject, function02);
                    gapComposer11.updateRememberedValue(rememberedValue9);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue9);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer11, 48);
                int hashCode3 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer11.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer11, clearAndSetSemantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                if (applier2 == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer11.startReusableNode();
                if (gapComposer11.inserting) {
                    gapComposer11.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer11.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer11, rowMeasurePolicy, composeUiNode$Companion$SetModifier$16);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer11, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$17);
                Integer valueOf3 = Integer.valueOf(hashCode3);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer11, valueOf3, composeUiNode$Companion$SetModifier$18);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$13);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer11, materializeModifier3, composeUiNode$Companion$SetModifier$19);
                ((DefaultSizes) gapComposer11.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
                Object rememberedValue10 = gapComposer11.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = Recorder$$ExternalSyntheticOutline2.m(gapComposer11);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(layoutWeightElement, (MutableInteractionSourceImpl) rememberedValue10, null, false, null, null, function02, 28);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer11, 48);
                int hashCode4 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer11.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer11, m182clickableO2vRcR0$default);
                gapComposer11.startReusableNode();
                if (gapComposer11.inserting) {
                    gapComposer11.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer11.useNode();
                }
                Updater.m576setimpl(gapComposer11, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
                Updater.m576setimpl(gapComposer11, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$17);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer11, composeUiNode$Companion$SetModifier$18, gapComposer11, ownerSnapshotObserver$onCommitAffectingLayout$13);
                Updater.m576setimpl(gapComposer11, materializeModifier4, composeUiNode$Companion$SetModifier$19);
                ComposableLambdaImpl composableLambdaImpl = subject.avatar;
                gapComposer11.startReplaceGroup(1121078488);
                composableLambdaImpl.invoke((Object) gapComposer11, (Object) 0);
                gapComposer11.end(false);
                String str4 = subject.name;
                if (str4 == null) {
                    str4 = "";
                }
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3998, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                gapComposer11.end(true);
                gapComposer11.startReplaceGroup(847260380);
                gapComposer11.end(false);
                gapComposer11.end(true);
                return Unit.INSTANCE;
            case 11:
                NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                Function0 function03 = (Function0) obj5;
                Composer composer11 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                NearbyPayRequestViewModel.Ready ready = nearbyPayRequestViewModel instanceof NearbyPayRequestViewModel.Ready ? (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel : null;
                if (ready == null) {
                    return Unit.INSTANCE;
                }
                GetPaidPayerOverlayKt.GetPaidPayerOverlay(ready.payers, ready.paidStatusLabel, ready.showViewAllPayers, function03, null, composer11, 0);
                return Unit.INSTANCE;
            case 12:
                NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                Function1 function110 = (Function1) obj5;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 360.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer12.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    Modifier clipToBounds = ClipKt.clipToBounds(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode5 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer12, clipToBounds);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                    BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    AsyncImageKt.m1438AsyncImage10Xjiaw(ThemablesKt.urlForTheme(nearbyPaymentsInfoViewModel.heroImage, gapComposer12), null, SizeKt.m290width3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(boxScopeInstance.align(companion, biasAlignment), RecyclerView.DECELERATION_RATE, 53.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 284.0f), biasAlignment, ContentScale.Companion.FillWidth, null, gapComposer12, 1769520, 1944);
                    Modifier align = boxScopeInstance.align(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 212.0f), Alignment.Companion.BottomCenter);
                    Color color = new Color(Color.Transparent);
                    Colors colors2 = (Colors) gapComposer12.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    BoxKt.Box(ImageKt.background$default(align, Lock.m133verticalGradient8A3gB4$default(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{color, new Color(colors2.semantic.background.f1047app)})), null, 6), gapComposer12, 0);
                    gapComposer12.end(true);
                    Countries.PageHeader(nearbyPaymentsInfoViewModel.title, (Modifier) null, (Function2) null, nearbyPaymentsInfoViewModel.body, gapComposer12, 0, 6);
                    gapComposer12.startReplaceGroup(-506220590);
                    for (final NearbyPaymentsInfoInfoItem nearbyPaymentsInfoInfoItem : nearbyPaymentsInfoViewModel.infoItems) {
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1353909588, new Function2() { // from class: com.squareup.cash.payments.views.nearby.NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Icons icons;
                                int i6 = i4;
                                NearbyPaymentsInfoInfoItem nearbyPaymentsInfoInfoItem2 = nearbyPaymentsInfoInfoItem;
                                switch (i6) {
                                    case 0:
                                        Composer composer13 = (Composer) obj6;
                                        int intValue12 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            int ordinal = nearbyPaymentsInfoInfoItem2.icon.ordinal();
                                            if (ordinal == 0) {
                                                icons = Icons.Fast24;
                                            } else if (ordinal == 1) {
                                                icons = Icons.ContactAdd24;
                                            } else if (ordinal != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                icons = Icons.SecurityLockOutline24;
                                            }
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer13, 48, 12);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer14 = (Composer) obj6;
                                        int intValue13 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer14;
                                        if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoInfoItem2.label, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer15 = (Composer) obj6;
                                        int intValue14 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer15 = (GapComposer) composer15;
                                        if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoInfoItem2.body, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer15.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer12);
                        final int i6 = 1;
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2139990347, new Function2() { // from class: com.squareup.cash.payments.views.nearby.NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Icons icons;
                                int i62 = i6;
                                NearbyPaymentsInfoInfoItem nearbyPaymentsInfoInfoItem2 = nearbyPaymentsInfoInfoItem;
                                switch (i62) {
                                    case 0:
                                        Composer composer13 = (Composer) obj6;
                                        int intValue12 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            int ordinal = nearbyPaymentsInfoInfoItem2.icon.ordinal();
                                            if (ordinal == 0) {
                                                icons = Icons.Fast24;
                                            } else if (ordinal == 1) {
                                                icons = Icons.ContactAdd24;
                                            } else if (ordinal != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                icons = Icons.SecurityLockOutline24;
                                            }
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer13, 48, 12);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer14 = (Composer) obj6;
                                        int intValue13 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer14;
                                        if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoInfoItem2.label, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer15 = (Composer) obj6;
                                        int intValue14 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer15 = (GapComposer) composer15;
                                        if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoInfoItem2.body, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer15.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer12);
                        final int i7 = 2;
                        CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, null, false, false, Expect_jvmKt.rememberComposableLambda(1628553477, new Function2() { // from class: com.squareup.cash.payments.views.nearby.NearbyPaymentsInfoViewKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Icons icons;
                                int i62 = i7;
                                NearbyPaymentsInfoInfoItem nearbyPaymentsInfoInfoItem2 = nearbyPaymentsInfoInfoItem;
                                switch (i62) {
                                    case 0:
                                        Composer composer13 = (Composer) obj6;
                                        int intValue12 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer13 = (GapComposer) composer13;
                                        if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                                            int ordinal = nearbyPaymentsInfoInfoItem2.icon.ordinal();
                                            if (ordinal == 0) {
                                                icons = Icons.Fast24;
                                            } else if (ordinal == 1) {
                                                icons = Icons.ContactAdd24;
                                            } else if (ordinal != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                break;
                                            } else {
                                                icons = Icons.SecurityLockOutline24;
                                            }
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer13, 48, 12);
                                        } else {
                                            gapComposer13.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer14 = (Composer) obj6;
                                        int intValue13 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer14 = (GapComposer) composer14;
                                        if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoInfoItem2.label, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer14.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer15 = (Composer) obj6;
                                        int intValue14 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer15 = (GapComposer) composer15;
                                        if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoInfoItem2.body, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer15.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer12), null, null, 0L, gapComposer12, 12582966, 3964);
                    }
                    gapComposer12.end(false);
                    for (NearbyPaymentsInfoItemArticle nearbyPaymentsInfoItemArticle : nearbyPaymentsInfoViewModel.articles) {
                        CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                        ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-236425641, new PdfPreviewViewKt$$ExternalSyntheticLambda2(nearbyPaymentsInfoItemArticle, 7), gapComposer12);
                        boolean changed11 = gapComposer12.changed(function110) | gapComposer12.changedInstance(nearbyPaymentsInfoItemArticle);
                        Object rememberedValue11 = gapComposer12.rememberedValue();
                        if (changed11 || rememberedValue11 == neverEqualPolicy) {
                            rememberedValue11 = new ProfileKt$$ExternalSyntheticLambda11(4, function110, nearbyPaymentsInfoItemArticle);
                            gapComposer12.updateRememberedValue(rememberedValue11);
                        }
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda3, null, (Function0) rememberedValue11, false, false, null, null, 0L, push, null, gapComposer12, 805306374, 1530);
                    }
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                Function1 function111 = (Function1) obj5;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer13).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(1 & intValue12, (intValue12 & 19) != 18)) {
                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetContent(nearbyPeopleOverflowSheetViewModel, function111, SpacerKt.padding(companion, paddingValues), gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                Function1 function112 = (Function1) obj5;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer14).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (!gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    gapComposer14.skipToGroupEnd();
                } else if (Intrinsics.areEqual(nearbyPermissionsPromptSheetViewModel, NearbyPermissionsPromptSheetViewModel.Loading.INSTANCE)) {
                    gapComposer14.startReplaceGroup(-229188904);
                    Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), paddingValues2);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer14, 0);
                    int hashCode6 = Long.hashCode(gapComposer14.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer14.currentCompositionLocalScope();
                    Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer14, padding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$15 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer14.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer14.startReusableNode();
                    if (gapComposer14.inserting) {
                        gapComposer14.createNode(layoutNode$Companion$Constructor$15);
                    } else {
                        gapComposer14.useNode();
                    }
                    Updater.m576setimpl(gapComposer14, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer14, currentCompositionLocalScope6, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer14, Integer.valueOf(hashCode6), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer14, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer14, materializeModifier6, ComposeUiNode.Companion.SetModifier);
                    gapComposer14.end(true);
                    gapComposer14.end(false);
                } else {
                    if (!(nearbyPermissionsPromptSheetViewModel instanceof NearbyPermissionsPromptSheetViewModel.Ready)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer14, 546794112, false);
                    }
                    gapComposer14.startReplaceGroup(-229030990);
                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetContent((NearbyPermissionsPromptSheetViewModel.Ready) nearbyPermissionsPromptSheetViewModel, function112, SpacerKt.padding(companion, paddingValues2), gapComposer14, 0);
                    gapComposer14.end(false);
                }
                return Unit.INSTANCE;
            case 15:
                return invoke$com$squareup$cash$payments$views$nearby$NearbyPermissionsPromptSheetViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 16:
                return invoke$com$squareup$cash$phoneplans$PhonePlansEsimCheckViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 17:
                return invoke$com$squareup$cash$phoneplans$WirelessProviderListViewKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 18:
                PhonePlansAppletTileModel.Uninstalled uninstalled = (PhonePlansAppletTileModel.Uninstalled) obj4;
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj5;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(1 & intValue14, (intValue14 & 17) != 16)) {
                    String str5 = uninstalled.title;
                    String str6 = uninstalled.subtitle;
                    boolean changedInstance = gapComposer15.changedInstance(taxesAppletTile);
                    Object rememberedValue12 = gapComposer15.rememberedValue();
                    if (changedInstance || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new PhonePlansAppletTile$$ExternalSyntheticLambda7(taxesAppletTile, 0);
                        gapComposer15.updateRememberedValue(rememberedValue12);
                    }
                    SharedUIKt.AppletTileRowUninstalledContent(2131233233, 0, gapComposer15, str5, str6, (Function0) rememberedValue12);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                return invoke$com$squareup$cash$pools$views$PoolContributeComposerKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$pools$views$PoolGoalMetKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 21:
                return invoke$com$squareup$cash$pools$views$PoolListSectionKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 22:
                return invoke$com$squareup$cash$pools$views$PoolMoreOptionsBottomSheetViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchaseCashCardLoadablesKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchaseCashCardPlanningSheetViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$prepurchasecashcard$views$PrepurchasePlanningSheetSelectPaymentKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$profile$devicemanager$views$DeviceManagerListViewKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$profile$devicemanager$views$DeviceManagerListViewKt$$ExternalSyntheticLambda12(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$profile$devicemanager$views$DeviceRemovalFailedViewKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            default:
                Function1 function113 = (Function1) obj5;
                AccountSwitchInfoDialogViewModel accountSwitchInfoDialogViewModel = (AccountSwitchInfoDialogViewModel) obj4;
                ModalButtonScope modalButtonScope5 = (ModalButtonScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                modalButtonScope5.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer16).changed(modalButtonScope5) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    boolean changed12 = gapComposer16.changed(function113);
                    Object rememberedValue13 = gapComposer16.rememberedValue();
                    if (changed12 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new ErrorViewKt$$ExternalSyntheticLambda4(24, function113);
                        gapComposer16.updateRememberedValue(rememberedValue13);
                    }
                    modalButtonScope5.PrimaryModalButton((Function0) rememberedValue13, null, false, Expect_jvmKt.rememberComposableLambda(55689833, new AccountSwitchInfoDialogViewKt$$ExternalSyntheticLambda0(accountSwitchInfoDialogViewModel, i3), gapComposer16), gapComposer16, ((intValue15 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda1(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = obj;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda1(ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel, Function1 function1) {
        this.$r8$classId = 6;
        this.f$0 = confirmRecipientDialogViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda1(Function1 function1, ButtonProminence buttonProminence) {
        this.$r8$classId = 23;
        this.f$1 = function1;
        this.f$0 = buttonProminence;
    }
}
