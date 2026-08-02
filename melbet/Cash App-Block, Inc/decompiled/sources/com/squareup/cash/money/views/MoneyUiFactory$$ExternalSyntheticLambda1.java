package com.squareup.cash.money.views;

import android.icu.text.MessageFormat;
import android.view.TextureView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.FilterChain;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.CardKt;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.e;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.cdf.instrument.InstrumentSelectTapOption;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.formview.components.ArcadeFormButtonView;
import com.squareup.cash.formview.components.FormCashAppTagElementKt;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.arcade.ArcadeFormCallToActionKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.components.arcade.ArcadeFormTimelineCardListElementKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt;
import com.squareup.cash.formview.components.arcade.FormTextInputTransformation;
import com.squareup.cash.formview.components.arcade.FormTextOutputTransformation;
import com.squareup.cash.formview.components.arcade.MultilineInputHelperTextType;
import com.squareup.cash.formview.components.arcade.NewlinesToSpacesTransformation;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter$models$1$1$1;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.families.ComposableSingletons$DependentAutoInvestViewKt;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestRecurringPurchaseViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.investingcrypto.components.ordertype.custom.order.CustomOrderPeriodSelectorKt;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.localization.views.Language;
import com.squareup.cash.localization.views.LanguageDisclosureViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.SquareLoyaltySheetView;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.moneybot.genie.DatePickerViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.SliderViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsQuestion;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.work.views.clockin.DeclareCashTipContentKt$$ExternalSyntheticLambda5;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.flow.Flow;
import net.idrnd.face.iad.capture.internal.m4;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;
import org.intellij.markdown.ast.ASTUtilKt;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieStateBinding;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyUiFactory$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(InstrumentSelectionViewModel instrumentSelectionViewModel, Function0 function0, Function1 function1, Function0 function02) {
        this.$r8$classId = 13;
        this.f$0 = instrumentSelectionViewModel;
        this.f$1 = function0;
        this.f$2 = function1;
        this.f$3 = function02;
    }

    private final Object invoke$com$squareup$cash$localization$views$LanguageDisclosureViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2) {
        BiasAlignment.Horizontal horizontal;
        MutableState mutableState;
        TextStyle textStyle;
        TextStyle textStyle2;
        Function1 function1 = (Function1) this.f$2;
        LanguageDisclosureViewModel.Content.Copy copy = (LanguageDisclosureViewModel.Content.Copy) this.f$0;
        LanguageDisclosureViewModel.Content content = (LanguageDisclosureViewModel.Content) this.f$1;
        MutableState mutableState2 = (MutableState) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier = gapComposer.applier;
        if (shouldExecute) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.systemBarsPadding(companion), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                horizontal = horizontal2;
                rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(9, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                horizontal = horizontal2;
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer), false, 14), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                mutableState = mutableState2;
                rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda2(6, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                mutableState = mutableState2;
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue2, 15);
            String str = content.englishCopy.localeLabel;
            int ordinal = ((Language) mutableState.getValue()).ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-1975802356);
                textStyle = Strings.getTypography(gapComposer).linkSmall;
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1975804446, false);
                }
                gapComposer.startReplaceGroup(-1975800372);
                textStyle = Strings.getTypography(gapComposer).bodySmall;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m183clickableoSLSa3U$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, " | ", (Map) null, (Function1) null, false);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda2(7, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue3, 15);
            String str2 = content.spanishCopy.localeLabel;
            int ordinal2 = ((Language) mutableState.getValue()).ordinal();
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(-1975788724);
                textStyle2 = Strings.getTypography(gapComposer).bodySmall;
                gapComposer.end(false);
            } else {
                if (ordinal2 != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1975790814, false);
                }
                gapComposer.startReplaceGroup(-1975786740);
                textStyle2 = Strings.getTypography(gapComposer).linkSmall;
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, m183clickableoSLSa3U$default2, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).headlineLarge, (TextLineBalancing) null, copy.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, copy.subtitle, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).labelXSmall, (TextLineBalancing) null, copy.termsHeader, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, copy.termsBody, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            DimensionKt.ButtonCtaGroup(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, null, Expect_jvmKt.rememberComposableLambda(-1961288406, new LanguageDisclosureViewKt$$ExternalSyntheticLambda9(copy, 0), gapComposer), Expect_jvmKt.rememberComposableLambda(-111360789, new PoolToastKt$$ExternalSyntheticLambda0(10, content, function1, copy), gapComposer), gapComposer, 27648, 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$genie$ButtonViewKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ComposePlatform.Button button = (ComposePlatform.Button) this.f$0;
        ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) this.f$1;
        GenieViewState genieViewState = (GenieViewState) this.f$2;
        TextStyle textStyle = (TextStyle) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            Expression expression = button.title;
            if (expression != null) {
                gapComposer.startReplaceGroup(-984943496);
                TextKt.m561TextNvy7gAk(EvalHelpersKt.evalString(expressionEvaluator, expression, genieViewState, ""), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, textStyle, gapComposer, 0, 0, 131070);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-984457633);
                Node node = button.label;
                if (node == null) {
                    gapComposer.startReplaceGroup(-984457634);
                } else {
                    gapComposer.startReplaceGroup(-984457633);
                    TextKt.ProvideTextStyle(textStyle, Expect_jvmKt.rememberComposableLambda(443299434, new CashMapViewKt$$ExternalSyntheticLambda5(node, 27), gapComposer), gapComposer, 48);
                }
                gapComposer.end(false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$genie$DatePickerViewKt$$ExternalSyntheticLambda7(Object obj, Object obj2) {
        DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) this.f$0;
        GenieStateBinding genieStateBinding = (GenieStateBinding) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        TextStyle textStyle = (TextStyle) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        int i = 0;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            boolean changed = gapComposer.changed(datePickerStateImpl) | gapComposer.changedInstance(genieStateBinding);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(27, datePickerStateImpl, genieStateBinding, mutableState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MenuKt.TextButton((Function0) rememberedValue, null, false, null, null, null, Expect_jvmKt.rememberComposableLambda(1221998947, new DatePickerViewKt$$ExternalSyntheticLambda11(textStyle, i), gapComposer), gapComposer, 805306368, 510);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$genie$SwitchViewKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Modifier modifier = (Modifier) this.f$0;
        String str = (String) this.f$1;
        ResolvedStyle resolvedStyle = (ResolvedStyle) this.f$2;
        GenieStateBinding genieStateBinding = (GenieStateBinding) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = resolvedStyle.textStyle;
            if (textStyle == null) {
                gapComposer.startReplaceGroup(2073667660);
                textStyle = (TextStyle) gapComposer.consume(TextKt.LocalTextStyle);
            } else {
                gapComposer.startReplaceGroup(2073666606);
            }
            gapComposer.end(false);
            TextKt.m561TextNvy7gAk(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, textStyle, gapComposer, 0, 0, 131070);
            boolean booleanValue = ((Boolean) genieStateBinding.getValue()).booleanValue();
            boolean changedInstance = gapComposer.changedInstance(genieStateBinding);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SliderViewKt$$ExternalSyntheticLambda0(genieStateBinding, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SwitchKt.Switch(booleanValue, (Function1) rememberedValue, null, null, false, null, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$views$plugins$TemplateCardKt$$ExternalSyntheticLambda15(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        TextCardKt.TokenizedDisplayText((ArrayList) this.f$0, (TemplateCardViewModel.EditState) this.f$1, (Function1) this.f$2, (Modifier) this.f$3, (Composer) obj, Updater.updateChangedFlags(3073));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d9, code lost:
    
        if (r6 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x08b2  */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v50, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v77, types: [com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen$InstrumentAction$ShowSheet] */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r47v2 */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r47v4, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r47v5 */
    /* JADX WARN: Type inference failed for: r48v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r51v0 */
    /* JADX WARN: Type inference failed for: r51v1, types: [androidx.compose.foundation.text.input.KeyboardActionHandler] */
    /* JADX WARN: Type inference failed for: r51v3 */
    /* JADX WARN: Type inference failed for: r6v76, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r6v96, types: [kotlin.coroutines.Continuation] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        MutableState mutableState;
        ArcadeFormTextInputGroupView.InputFieldModel inputFieldModel;
        FormBlocker.Element.TextInputElement.Security security;
        MutableState mutableState2;
        String str;
        List list;
        MultilineInputHelperTextType.Nothing nothing;
        Object obj4;
        MutableState mutableState3;
        int i;
        int i2;
        int i3;
        int i4;
        KeyboardActionHandler keyboardActionHandler;
        boolean changedInstance;
        Object rememberedValue;
        MutableState mutableState4;
        boolean z;
        ?? r13;
        String format2;
        boolean z2;
        boolean z3;
        Object obj5;
        boolean z4;
        Object obj6;
        Object obj7;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        boolean z5;
        ?? r47;
        Modifier modifier;
        Object obj8;
        Object obj9;
        ?? semantics;
        FormTextOutputTransformation formTextOutputTransformation;
        ?? r472;
        Object obj10;
        Unit unit;
        Object obj11;
        Object obj12;
        NeverEqualPolicy neverEqualPolicy;
        Object obj13;
        GapComposer gapComposer;
        int i5 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        int i6 = 9;
        Object obj14 = this.f$3;
        Object obj15 = this.f$2;
        Object obj16 = this.f$1;
        Object obj17 = this.f$0;
        switch (i5) {
            case 0:
                MoneyUiFactory moneyUiFactory = (MoneyUiFactory) obj17;
                MoneyTabModel moneyTabModel = (MoneyTabModel) obj16;
                Function1 function1 = (Function1) obj15;
                State state = (State) obj14;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    RealImageLoader realImageLoader = moneyUiFactory.imageLoader;
                    ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) moneyUiFactory.elementBoundsRegistry;
                    RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) moneyUiFactory.scrollPerformanceTrackerFactory;
                    boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) state.getValue()).enabled();
                    boolean changedInstance2 = gapComposer2.changedInstance(moneyUiFactory);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda5(moneyUiFactory, 4);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    MoneyTabUIKt.MoneyTabUI(moneyTabModel, function1, realImageLoader, realScrollPerformanceTrackerFactory, elementBoundsRegistry, (Function0) rememberedValue2, enabled, gapComposer2, 0, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj17;
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) obj16;
                DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj14;
                Function1 function12 = (Function1) obj15;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(-1447936810, new EarningsHomeKt$$ExternalSyntheticLambda2(realObservabilityManager, dependentDetailViewModel, function12), gapComposer3), gapComposer3, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.FavoritesBody((Modifier) obj17, (Function1) obj15, (Function0) obj16, (ArrayList) obj14, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ((ArcadeFormButtonView) obj17).ElementButton(Updater.updateChangedFlags(385), (Composer) obj, (ComposableLambdaImpl) obj14, (Modifier) obj15, (Function0) obj16);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                FormCashAppTagElementKt.FormCashAppTagElement((FormBlocker.Element.CashAppTagElement) obj17, (SyncValueReader) obj16, (Modifier) obj15, (WandPose) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ArcadeFormCallToActionKt.ArcadeFormCallToAction((FormBlocker.Element.CallToActionElement) obj17, (Function1) obj15, (RealImageLoader) obj16, (Modifier) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ArcadeFormTextInputGroupView arcadeFormTextInputGroupView = (ArcadeFormTextInputGroupView) obj17;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj16;
                List list2 = (List) obj15;
                FocusRequester focusRequester = (FocusRequester) obj14;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer4, 6);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer4.startReplaceGroup(-2021205570);
                    List list3 = arcadeFormTextInputGroupView.inputFields;
                    int size = list3.size();
                    int i7 = 0;
                    while (i7 < size) {
                        ArcadeFormTextInputGroupView.InputFieldModel inputFieldModel2 = (ArcadeFormTextInputGroupView.InputFieldModel) list3.get(i7);
                        gapComposer4.startReplaceGroup(-1206564983);
                        Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer4, 1);
                        gapComposer4.end(false);
                        Object rememberedValue3 = gapComposer4.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy2) {
                            obj3 = null;
                            RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1((Flow) arcadeFormTextInputGroupView.multilineValidationResults.get(i7), 25);
                            gapComposer4.updateRememberedValue(realGooglePayer$createWallet$$inlined$filter$1);
                            rememberedValue3 = realGooglePayer$createWallet$$inlined$filter$1;
                        } else {
                            obj3 = null;
                        }
                        MultilineInputHelperTextType.Nothing nothing2 = MultilineInputHelperTextType.Nothing.INSTANCE;
                        GapComposer gapComposer5 = gapComposer4;
                        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, nothing2, null, gapComposer5, 48, 2);
                        FormBlocker.Element.TextInputElement.Security security2 = inputFieldModel2.security;
                        String str2 = inputFieldModel2.labelText;
                        List list4 = list3;
                        List list5 = inputFieldModel2.validations;
                        int i8 = size;
                        boolean z6 = inputFieldModel2.isSingleLine;
                        boolean changed = gapComposer5.changed(security2 == null ? -1 : security2.ordinal());
                        Object rememberedValue4 = gapComposer5.rememberedValue();
                        Object obj18 = rememberedValue4;
                        if (changed || rememberedValue4 == neverEqualPolicy2) {
                            obj18 = Recorder$$ExternalSyntheticOutline1.m(security2 == FormBlocker.Element.TextInputElement.Security.SECURE, gapComposer5);
                        }
                        MutableState mutableState5 = (MutableState) obj18;
                        Object rememberedValue5 = gapComposer5.rememberedValue();
                        Object obj19 = rememberedValue5;
                        if (rememberedValue5 == neverEqualPolicy2) {
                            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(obj3);
                            gapComposer5.updateRememberedValue(mutableStateOf$default);
                            obj19 = mutableStateOf$default;
                        }
                        MutableState mutableState6 = (MutableState) obj19;
                        CharSequence charSequence = ((TextFieldState) list2.get(i7)).getValue$foundation().text;
                        boolean changedInstance3 = gapComposer5.changedInstance(list2) | gapComposer5.changed(i7) | gapComposer5.changed(inputFieldModel2);
                        List list6 = list2;
                        Object rememberedValue6 = gapComposer5.rememberedValue();
                        if (changedInstance3 || rememberedValue6 == neverEqualPolicy2) {
                            rememberedValue6 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(list6, i7, inputFieldModel2, mutableState6, null, 15);
                            mutableState = mutableState6;
                            gapComposer5.updateRememberedValue(rememberedValue6);
                        } else {
                            mutableState = mutableState6;
                        }
                        Updater.LaunchedEffect(gapComposer5, charSequence, (Function2) rememberedValue6);
                        if (z6) {
                            inputFieldModel = inputFieldModel2;
                            security = security2;
                            mutableState2 = mutableState5;
                            str = str2;
                            list = list6;
                            nothing = nothing2;
                            obj4 = obj3;
                            mutableState3 = collectAsState;
                            gapComposer5.startReplaceGroup(1252203529);
                            gapComposer5.end(false);
                        } else {
                            gapComposer5.startReplaceGroup(1251967123);
                            Unit unit2 = Unit.INSTANCE;
                            boolean changed2 = gapComposer5.changed(inputFieldModel2) | gapComposer5.changedInstance(arcadeFormTextInputGroupView) | gapComposer5.changed(i7);
                            Object rememberedValue7 = gapComposer5.rememberedValue();
                            if (changed2 || rememberedValue7 == neverEqualPolicy2) {
                                ?? r6 = obj3;
                                mutableState3 = collectAsState;
                                unit = unit2;
                                security = security2;
                                inputFieldModel = inputFieldModel2;
                                mutableState2 = mutableState5;
                                str = str2;
                                list = list6;
                                nothing = nothing2;
                                MoneyTabUIKt$MoneyTabLoaded$1$1 moneyTabUIKt$MoneyTabLoaded$1$1 = new MoneyTabUIKt$MoneyTabLoaded$1$1(inputFieldModel, arcadeFormTextInputGroupView, i7, (Continuation) r6, 8);
                                gapComposer5.updateRememberedValue(moneyTabUIKt$MoneyTabLoaded$1$1);
                                obj12 = moneyTabUIKt$MoneyTabLoaded$1$1;
                                obj11 = r6;
                            } else {
                                inputFieldModel = inputFieldModel2;
                                mutableState2 = mutableState5;
                                str = str2;
                                list = list6;
                                nothing = nothing2;
                                obj11 = obj3;
                                mutableState3 = collectAsState;
                                unit = unit2;
                                security = security2;
                                obj12 = rememberedValue7;
                            }
                            Updater.LaunchedEffect(gapComposer5, unit, (Function2) obj12);
                            gapComposer5.end(false);
                            obj4 = obj11;
                        }
                        Modifier then = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), rememberShaker).then(i7 == 0 ? FocusTraversalKt.focusRequester(companion, focusRequester) : companion);
                        FormBlocker.Element.TextInputElement.InputField.CapitalizationType capitalizationType = inputFieldModel.keyboardCapitalizationType;
                        int i9 = capitalizationType == null ? -1 : ArcadeFormTextInputGroupView.WhenMappings.$EnumSwitchMapping$4[capitalizationType.ordinal()];
                        if (i9 != -1) {
                            if (i9 == 1) {
                                i = 0;
                            } else if (i9 == 2) {
                                i = 2;
                            } else if (i9 != 3) {
                                if (i9 != 4) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                i = 1;
                            }
                            FormBlocker.Element.TextInputElement.KeyboardType keyboardType = inputFieldModel.keyboardType;
                            i2 = keyboardType != null ? -1 : ArcadeFormTextInputGroupView.WhenMappings.$EnumSwitchMapping$2[keyboardType.ordinal()];
                            Object obj20 = obj4;
                            if (i2 != -1 || i2 == 1) {
                                i3 = security != null ? -1 : ArcadeFormTextInputGroupView.WhenMappings.$EnumSwitchMapping$1[security.ordinal()];
                                if (i3 != -1) {
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                    }
                                    i4 = 7;
                                }
                                i4 = 1;
                            } else if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        i4 = i6;
                                    } else {
                                        if (i2 != 5) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        i4 = 6;
                                    }
                                }
                                i4 = 7;
                            } else {
                                i4 = 3;
                            }
                            KeyboardOptions keyboardOptions = new KeyboardOptions(i, (Boolean) null, i4, (!z6 || inputFieldModel.inputTransformations.contains(NewlinesToSpacesTransformation.INSTANCE)) ? i7 != list4.size() + (-1) ? 7 : 6 : 0, (Boolean) null, 114);
                            if (i7 != list4.size() - 1) {
                                gapComposer5.startReplaceGroup(1253168094);
                                MutableState collectAsState2 = Updater.collectAsState(arcadeFormTextInputGroupView.isRequirementFulfilled(), Boolean.FALSE, null, gapComposer5, 48, 2);
                                boolean changed3 = gapComposer5.changed(collectAsState2) | gapComposer5.changedInstance(arcadeFormTextInputGroupView) | gapComposer5.changed(delegatingSoftwareKeyboardController2);
                                Object rememberedValue8 = gapComposer5.rememberedValue();
                                Object obj21 = rememberedValue8;
                                if (changed3 || rememberedValue8 == neverEqualPolicy2) {
                                    TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3 tapToPayInitiatorNotesKt$$ExternalSyntheticLambda3 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda3(arcadeFormTextInputGroupView, delegatingSoftwareKeyboardController2, collectAsState2);
                                    gapComposer5.updateRememberedValue(tapToPayInitiatorNotesKt$$ExternalSyntheticLambda3);
                                    obj21 = tapToPayInitiatorNotesKt$$ExternalSyntheticLambda3;
                                }
                                gapComposer5.end(false);
                                keyboardActionHandler = (KeyboardActionHandler) obj21;
                            } else {
                                gapComposer5.startReplaceGroup(1253431687);
                                gapComposer5.end(false);
                                keyboardActionHandler = obj20;
                            }
                            changedInstance = gapComposer5.changedInstance(rememberShaker);
                            rememberedValue = gapComposer5.rememberedValue();
                            if (!changedInstance || rememberedValue == neverEqualPolicy2) {
                                rememberedValue = new WandScene$ring$3(0, rememberShaker, Shaker.class, "shake", "shake()V", 0, 21);
                                gapComposer5.updateRememberedValue(rememberedValue);
                            }
                            FilterChain filterChain = new FilterChain(new FormTextInputTransformation(list5, (Function0) ((KFunction) rememberedValue)), new DeclareCashTipContentKt$$ExternalSyntheticLambda5(inputFieldModel, 2));
                            FormTextOutputTransformation formTextOutputTransformation2 = new FormTextOutputTransformation(((Boolean) mutableState2.getValue()).booleanValue(), list5);
                            if (((String) mutableState.getValue()) == null) {
                                gapComposer5.startReplaceGroup(1253995360);
                                mutableState4 = mutableState;
                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1010533991, new HeroCardViewKt$$ExternalSyntheticLambda28(5, mutableState4), gapComposer5);
                                gapComposer5.end(false);
                                obj7 = rememberComposableLambda;
                            } else {
                                mutableState4 = mutableState;
                                if (z6) {
                                    gapComposer5.startReplaceGroup(1254104356);
                                    if (i7 != list4.size() - 1 || arcadeFormTextInputGroupView.securityText == null) {
                                        z4 = false;
                                        gapComposer5.startReplaceGroup(1254366275);
                                        gapComposer5.end(false);
                                        obj6 = obj20;
                                    } else {
                                        gapComposer5.startReplaceGroup(1254175594);
                                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1816682731, new FormView$$ExternalSyntheticLambda0(arcadeFormTextInputGroupView, 2), gapComposer5);
                                        z4 = false;
                                        gapComposer5.end(false);
                                        obj6 = rememberComposableLambda2;
                                    }
                                    gapComposer5.end(z4);
                                    obj7 = obj6;
                                } else {
                                    gapComposer5.startReplaceGroup(1255060489);
                                    MultilineInputHelperTextType multilineInputHelperTextType = (MultilineInputHelperTextType) mutableState3.getValue();
                                    if (multilineInputHelperTextType instanceof MultilineInputHelperTextType.MaxCharCount) {
                                        gapComposer5.startReplaceGroup(-1206457181);
                                        MultilineInputHelperTextType.MaxCharCount maxCharCount = (MultilineInputHelperTextType.MaxCharCount) multilineInputHelperTextType;
                                        format2 = new MessageFormat(Room.stringResource(gapComposer5, R.string.form_multiline_input_max_char_count_helper_text)).format(new Object[]{Integer.valueOf(maxCharCount.currentCharCount), Integer.valueOf(maxCharCount.maxCharCount)});
                                        format2.getClass();
                                        z2 = false;
                                        gapComposer5.end(false);
                                    } else if (multilineInputHelperTextType instanceof MultilineInputHelperTextType.RequiredCharCount) {
                                        gapComposer5.startReplaceGroup(-1206447814);
                                        format2 = new MessageFormat(Room.stringResource(gapComposer5, R.string.form_multiline_input_min_char_count_helper_text)).format(new Object[]{Integer.valueOf(((MultilineInputHelperTextType.RequiredCharCount) multilineInputHelperTextType).requiredCharCount)});
                                        format2.getClass();
                                        z2 = false;
                                        gapComposer5.end(false);
                                    } else {
                                        z = false;
                                        if (!Intrinsics.areEqual(multilineInputHelperTextType, nothing)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1206459607, false);
                                        }
                                        gapComposer5.startReplaceGroup(1255037796);
                                        gapComposer5.end(false);
                                        r13 = obj20;
                                        if (r13 != 0) {
                                            gapComposer5.startReplaceGroup(1255060488);
                                            gapComposer5.end(z);
                                            z3 = z;
                                            obj5 = obj20;
                                        } else {
                                            gapComposer5.startReplaceGroup(1255060489);
                                            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(475307652, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(r13, 17), gapComposer5);
                                            z3 = false;
                                            gapComposer5.end(false);
                                            obj5 = rememberComposableLambda3;
                                        }
                                        gapComposer5.end(z3);
                                        obj7 = obj5;
                                    }
                                    boolean z7 = z2;
                                    r13 = format2;
                                    z = z7;
                                    if (r13 != 0) {
                                    }
                                    gapComposer5.end(z3);
                                    obj7 = obj5;
                                }
                            }
                            ?? r48 = obj7;
                            if (z6) {
                                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                                String str3 = str;
                                gapComposer5.startReplaceGroup(1258007070);
                                boolean z8 = inputFieldModel.isEnabled;
                                TextFieldState textFieldState = (TextFieldState) list.get(i7);
                                boolean z9 = ((String) mutableState4.getValue()) != null;
                                String str4 = inputFieldModel.placeholderText;
                                if (str3 == null) {
                                    gapComposer5.startReplaceGroup(1258261052);
                                    z5 = false;
                                    gapComposer5.end(false);
                                    r47 = obj20;
                                } else {
                                    z5 = false;
                                    gapComposer5.startReplaceGroup(1258261053);
                                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-952684528, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str3, 24), gapComposer5);
                                    gapComposer5.end(false);
                                    r47 = rememberComposableLambda4;
                                }
                                InputAreaKt.InputArea(textFieldState, then, z8, false, z9, r47, r48, str4, keyboardOptions, keyboardActionHandler, null, filterChain, formTextOutputTransformation2, null, null, gapComposer5, 0, 0, 25608);
                                gapComposer5.end(z5);
                            } else {
                                gapComposer5.startReplaceGroup(1255241343);
                                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                                    gapComposer5.startReplaceGroup(1255294384);
                                    Object rememberedValue9 = gapComposer5.rememberedValue();
                                    if (rememberedValue9 == neverEqualPolicy2) {
                                        GpsConfigQueries$$ExternalSyntheticLambda1 gpsConfigQueries$$ExternalSyntheticLambda1 = new GpsConfigQueries$$ExternalSyntheticLambda1(13);
                                        gapComposer5.updateRememberedValue(gpsConfigQueries$$ExternalSyntheticLambda1);
                                        obj10 = gpsConfigQueries$$ExternalSyntheticLambda1;
                                    } else {
                                        obj10 = rememberedValue9;
                                    }
                                    modifier = SemanticsModifierKt.semantics(companion, true, (Function1) obj10);
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.startReplaceGroup(1255695059);
                                    gapComposer5.end(false);
                                    modifier = companion;
                                }
                                ?? then2 = then.then(modifier);
                                FormBlocker.Element.TextInputElement.InputField.AutofillContentType autofillContentType = inputFieldModel.autofillType;
                                switch (autofillContentType == null ? -1 : ArcadeFormTextInputGroupView.WhenMappings.$EnumSwitchMapping$3[autofillContentType.ordinal()]) {
                                    case 1:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.PersonFirstName;
                                        break;
                                    case 2:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.PersonLastName;
                                        break;
                                    case 3:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.PostalAddress;
                                        break;
                                    case 4:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.AddressStreet;
                                        break;
                                    case 5:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.AddressAuxiliaryDetails;
                                        break;
                                    case 6:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.AddressLocality;
                                        break;
                                    case 7:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.AddressRegion;
                                        break;
                                    case 8:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.PostalCode;
                                        break;
                                    case 9:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.BirthDateFull;
                                        break;
                                    case 10:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.PhoneNumber;
                                        break;
                                    case 11:
                                        ContentType.Companion.getClass();
                                        obj8 = ContentType.Companion.EmailAddress;
                                        break;
                                    default:
                                        obj8 = obj20;
                                        break;
                                }
                                if (obj8 == null) {
                                    gapComposer5.startReplaceGroup(1255847175);
                                    gapComposer5.end(false);
                                    semantics = obj20;
                                } else {
                                    gapComposer5.startReplaceGroup(1255847176);
                                    boolean changedInstance4 = gapComposer5.changedInstance(obj8);
                                    Object rememberedValue10 = gapComposer5.rememberedValue();
                                    if (changedInstance4 || rememberedValue10 == neverEqualPolicy2) {
                                        GpsConfigQueries$$ExternalSyntheticLambda2 gpsConfigQueries$$ExternalSyntheticLambda2 = new GpsConfigQueries$$ExternalSyntheticLambda2(obj8, i6);
                                        gapComposer5.updateRememberedValue(gpsConfigQueries$$ExternalSyntheticLambda2);
                                        obj9 = gpsConfigQueries$$ExternalSyntheticLambda2;
                                    } else {
                                        obj9 = rememberedValue10;
                                    }
                                    semantics = SemanticsModifierKt.semantics(companion, false, (Function1) obj9);
                                    gapComposer5.end(false);
                                }
                                if (semantics == null) {
                                    semantics = companion;
                                }
                                Modifier then3 = then2.then(semantics);
                                boolean z10 = inputFieldModel.isEnabled;
                                TextFieldState textFieldState2 = (TextFieldState) list.get(i7);
                                boolean z11 = ((String) mutableState4.getValue()) != null;
                                String str5 = inputFieldModel.placeholderText;
                                if (str == null) {
                                    gapComposer5.startReplaceGroup(1256227452);
                                    gapComposer5.end(false);
                                    delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                                    formTextOutputTransformation = formTextOutputTransformation2;
                                    r472 = obj20;
                                } else {
                                    gapComposer5.startReplaceGroup(1256227453);
                                    delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                                    formTextOutputTransformation = formTextOutputTransformation2;
                                    ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(680122687, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, 23), gapComposer5);
                                    gapComposer5.end(false);
                                    r472 = rememberComposableLambda5;
                                }
                                InputFieldKt.InputField(textFieldState2, then3, z10, false, z11, r472, null, Expect_jvmKt.rememberComposableLambda(751412227, new MusicViewKt$$ExternalSyntheticLambda2(inputFieldModel, mutableState2, list, i7, mutableState4), gapComposer5), r48, str5, keyboardOptions, keyboardActionHandler, filterChain, formTextOutputTransformation, null, null, gapComposer5, 12582912, 0, 49224);
                                gapComposer5.end(false);
                            }
                            i7++;
                            list2 = list;
                            gapComposer4 = gapComposer5;
                            delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                            list3 = list4;
                            i6 = 9;
                            size = i8;
                        }
                        i = 3;
                        FormBlocker.Element.TextInputElement.KeyboardType keyboardType2 = inputFieldModel.keyboardType;
                        if (keyboardType2 != null) {
                        }
                        Object obj202 = obj4;
                        if (i2 != -1) {
                        }
                        if (security != null) {
                        }
                        if (i3 != -1) {
                        }
                        i4 = 1;
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(i, (Boolean) null, i4, (!z6 || inputFieldModel.inputTransformations.contains(NewlinesToSpacesTransformation.INSTANCE)) ? i7 != list4.size() + (-1) ? 7 : 6 : 0, (Boolean) null, 114);
                        if (i7 != list4.size() - 1) {
                        }
                        changedInstance = gapComposer5.changedInstance(rememberShaker);
                        rememberedValue = gapComposer5.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue = new WandScene$ring$3(0, rememberShaker, Shaker.class, "shake", "shake()V", 0, 21);
                        gapComposer5.updateRememberedValue(rememberedValue);
                        FilterChain filterChain2 = new FilterChain(new FormTextInputTransformation(list5, (Function0) ((KFunction) rememberedValue)), new DeclareCashTipContentKt$$ExternalSyntheticLambda5(inputFieldModel, 2));
                        FormTextOutputTransformation formTextOutputTransformation22 = new FormTextOutputTransformation(((Boolean) mutableState2.getValue()).booleanValue(), list5);
                        if (((String) mutableState.getValue()) == null) {
                        }
                        ?? r482 = obj7;
                        if (z6) {
                        }
                        i7++;
                        list2 = list;
                        gapComposer4 = gapComposer5;
                        delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                        list3 = list4;
                        i6 = 9;
                        size = i8;
                    }
                    GapComposer gapComposer6 = gapComposer4;
                    gapComposer6.end(false);
                    gapComposer6.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ArcadeFormTimelineCardListElementKt.ArcadeFormTimelineCardListElement((FormBlocker.Element.TimelineCardListElement) obj17, (Function1) obj15, (RealImageLoader) obj16, (Modifier) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ArcadeFormUpsellKt.ArcadeFormUpsell((FormBlocker.Element.UpsellElement) obj17, (Function1) obj15, (RealImageLoader) obj16, (Modifier) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                QuickAccessBarKt.GlobalSearchFeed((GlobalSearchViewModel) obj17, (LazyListState) obj16, (Function1) obj15, (Function0) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                e eVar = (e) obj17;
                TextureView textureView = (TextureView) obj16;
                CoroutineScope coroutineScope = (CoroutineScope) obj15;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj14;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer4;
                if (gapComposer7.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object rememberedValue11 = gapComposer7.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy2) {
                        rememberedValue11 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer7);
                        gapComposer7.updateRememberedValue(rememberedValue11);
                    }
                    eVar.SceneScope(textureView, (CoroutineScope) rememberedValue11, coroutineScope, composableLambdaImpl, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj17;
                InstrumentSelectionBlockerPresenter instrumentSelectionBlockerPresenter = (InstrumentSelectionBlockerPresenter) obj16;
                MutableState mutableState7 = (MutableState) obj15;
                MutableState mutableState8 = (MutableState) obj14;
                InstrumentLinkingOption instrumentLinkingOption = (InstrumentLinkingOption) obj2;
                ((InstrumentLinkingOptionsQuestion) obj).getClass();
                Continuation continuation = null;
                Object obj22 = null;
                if (instrumentLinkingOption instanceof InstrumentLinkingOption.Link) {
                    JobKt.launch$default(coroutineScope2, null, null, new InstrumentSelectionBlockerPresenter$models$1$1$1(instrumentSelectionBlockerPresenter, instrumentLinkingOption, mutableState7, continuation, 0), 3);
                } else if (instrumentLinkingOption instanceof InstrumentLinkingOption.ReplaceInstrument) {
                    JobKt.launch$default(coroutineScope2, null, null, new InstrumentSelectionBlockerPresenter$models$1$1$1(instrumentSelectionBlockerPresenter, instrumentLinkingOption, mutableState7, continuation, 1), 3);
                } else if (instrumentLinkingOption instanceof InstrumentLinkingOption.Replace) {
                    InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet showSheet = (InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) mutableState8.getValue();
                    if (showSheet != null) {
                        ArrayList arrayList = showSheet.options;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((InstrumentSelectionBlockerScreen.InstrumentOption) it.next()).action);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next instanceof InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) {
                                arrayList3.add(next);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next2 = it3.next();
                                InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction = ((InstrumentSelectionBlockerScreen.InstrumentOption) CollectionsKt.first((List) ((InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) next2).options)).action;
                                if ((instrumentAction instanceof InstrumentSelectionBlockerScreen.InstrumentAction.Replace) && ((InstrumentSelectionBlockerScreen.InstrumentAction.Replace) instrumentAction).instrumentType == ((InstrumentLinkingOption.Replace) instrumentLinkingOption).cashInstrumentType) {
                                    obj22 = next2;
                                }
                            }
                        }
                        continuation = (InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) obj22;
                    }
                    instrumentSelectionBlockerPresenter.logAction(instrumentSelectionBlockerPresenter.analytics, InstrumentSelectTapOption.Action.SHOW_SHEET, ((InstrumentLinkingOption.Replace) instrumentLinkingOption).cashInstrumentType);
                    mutableState8.setValue(continuation);
                    InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet showSheet2 = (InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet) mutableState8.getValue();
                    showSheet2.getClass();
                    instrumentSelectionBlockerPresenter.navigateToOptionsSheet(showSheet2);
                } else if (instrumentLinkingOption != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                InstrumentAvatarUtilsKt.InstrumentSelectionRow((InstrumentSelectionRowViewModel) obj17, (Function0) obj16, (RealImageLoader) obj15, (Modifier) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                InstrumentSelectionViewModel instrumentSelectionViewModel = (InstrumentSelectionViewModel) obj17;
                Function0 function0 = (Function0) obj16;
                Function1 function13 = (Function1) obj15;
                Function0 function02 = (Function0) obj14;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer5;
                if (gapComposer8.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Colors colors = (Colors) gapComposer8.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer8, -1762997026, gapComposer8, false);
                    } else {
                        gapComposer8.startReplaceGroup(-1762997739);
                        gapComposer8.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1);
                    boolean z12 = instrumentSelectionViewModel instanceof InstrumentSelectionViewModel.Loading;
                    Object rememberedValue12 = gapComposer8.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy2) {
                        rememberedValue12 = new ActivityItemLayout$$ExternalSyntheticLambda4(22);
                        gapComposer8.updateRememberedValue(rememberedValue12);
                    }
                    Strings.LoadableFullScreenContent(instrumentSelectionViewModel, z12, m177backgroundbw27NRU, (Function1) rememberedValue12, null, Expect_jvmKt.rememberComposableLambda(-453504082, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(function0, function13, function02), gapComposer8), gapComposer8, 199680, 16);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.MyInvestmentAmountSection((String) obj17, (String) obj16, (Modifier) obj15, (BiasAlignment.Horizontal) obj14, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 15:
                DependentAutoInvestViewModel dependentAutoInvestViewModel = (DependentAutoInvestViewModel) obj17;
                Function0 function03 = (Function0) obj16;
                Function1 function14 = (Function1) obj15;
                RealImageLoader realImageLoader3 = (RealImageLoader) obj14;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer6;
                boolean shouldExecute = gapComposer9.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2);
                Applier applier = gapComposer9.applier;
                if (shouldExecute) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(companion, MooncakeTheme.getColors(gapComposer9).background, rectangleShapeKt$RectangleShape$1), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer9, 0);
                    int hashCode2 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer9, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer9, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer9, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer9, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    ((DefaultSizes) gapComposer9.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    CardKt.m468DivideroMI9zvI(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 0L, 0.5f, gapComposer9, MLKEMEngine.KyberPolyBytes, 10);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer9, null);
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer9, 48);
                    int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer9, companion);
                    gapComposer9.startReusableNode();
                    if (gapComposer9.inserting) {
                        gapComposer9.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer9.useNode();
                    }
                    Updater.m576setimpl(gapComposer9, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer9, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer9, composeUiNode$Companion$SetModifier$13, gapComposer9, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer9, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String str6 = dependentAutoInvestViewModel.title;
                    long j = MooncakeTheme.getColors(gapComposer9).label;
                    TextStyle textStyle = MooncakeTheme.getTypography(gapComposer9).header4;
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer9, rowScopeInstance.weight(1.0f, companion, true), textStyle, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                    GapComposer gapComposer10 = gapComposer9;
                    boolean changed4 = gapComposer10.changed(function03);
                    Object rememberedValue13 = gapComposer10.rememberedValue();
                    if (!changed4) {
                        neverEqualPolicy = neverEqualPolicy2;
                        obj13 = rememberedValue13;
                        break;
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                    }
                    ComposeDialogKt$$ExternalSyntheticLambda10 composeDialogKt$$ExternalSyntheticLambda10 = new ComposeDialogKt$$ExternalSyntheticLambda10(23, function03);
                    gapComposer10.updateRememberedValue(composeDialogKt$$ExternalSyntheticLambda10);
                    obj13 = composeDialogKt$$ExternalSyntheticLambda10;
                    KeypadKt.IconButton((Function0) obj13, null, null, false, ComposableSingletons$DependentAutoInvestViewKt.f450lambda$1496847782, gapComposer10, 24576, 14);
                    boolean z13 = true;
                    gapComposer10.end(true);
                    DependentAutoInvestRecurringPurchaseViewModel dependentAutoInvestRecurringPurchaseViewModel = dependentAutoInvestViewModel.recurringPurchaseModel;
                    if (dependentAutoInvestRecurringPurchaseViewModel == null) {
                        gapComposer10.startReplaceGroup(-570621212);
                        gapComposer10.end(false);
                        gapComposer = gapComposer10;
                    } else {
                        gapComposer10.startReplaceGroup(-570621211);
                        Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, 1);
                        boolean changed5 = gapComposer10.changed(function14) | gapComposer10.changedInstance(dependentAutoInvestRecurringPurchaseViewModel);
                        Object rememberedValue14 = gapComposer10.rememberedValue();
                        Object obj23 = rememberedValue14;
                        if (changed5 || rememberedValue14 == neverEqualPolicy) {
                            IntentLauncher$$ExternalSyntheticLambda0 intentLauncher$$ExternalSyntheticLambda0 = new IntentLauncher$$ExternalSyntheticLambda0(13, function14, dependentAutoInvestRecurringPurchaseViewModel);
                            gapComposer10.updateRememberedValue(intentLauncher$$ExternalSyntheticLambda0);
                            obj23 = intentLauncher$$ExternalSyntheticLambda0;
                        }
                        Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default2, false, null, null, (Function0) obj23, 15);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer10, 48);
                        int hashCode4 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer10.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer10, m183clickableoSLSa3U$default);
                        gapComposer10.startReusableNode();
                        if (gapComposer10.inserting) {
                            gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer10.useNode();
                        }
                        Updater.m576setimpl(gapComposer10, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer10, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer10, composeUiNode$Companion$SetModifier$13, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer10, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                        LinkScanner linkScanner = dependentAutoInvestRecurringPurchaseViewModel.icon;
                        gapComposer10.startReplaceGroup(-1715663938);
                        ChannelsKt__ChannelsKt.Icon(linkScanner, dependentAutoInvestRecurringPurchaseViewModel.avatarCharacter, realImageLoader3, gapComposer10, 0);
                        gapComposer10.end(false);
                        SpacerKt.Spacer(gapComposer10, SizeKt.m290width3ABfNKs(companion, 18.0f));
                        Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                        ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer10, 0);
                        int hashCode5 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer10.currentCompositionLocalScope();
                        Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer10, weight);
                        gapComposer10.startReusableNode();
                        if (gapComposer10.inserting) {
                            gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer10.useNode();
                        }
                        Updater.m576setimpl(gapComposer10, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer10, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer10, composeUiNode$Companion$SetModifier$13, gapComposer10, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer10, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                        KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer10).label, (Composer) gapComposer10, (Modifier) null, MooncakeTheme.getTypography(gapComposer10).smallTitle, (TextLineBalancing) null, dependentAutoInvestRecurringPurchaseViewModel.stockName, (Map) null, (Function1) null, false);
                        KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, MooncakeTheme.getColors(gapComposer10).tertiaryLabel, (Composer) gapComposer10, (Modifier) null, MooncakeTheme.getTypography(gapComposer10).smallBody, (TextLineBalancing) null, dependentAutoInvestRecurringPurchaseViewModel.autoInvestScheduleText, (Map) null, (Function1) null, false);
                        GapComposer gapComposer11 = gapComposer10;
                        z13 = true;
                        Boxes$$ExternalSyntheticOutline1.m(gapComposer11, true, true, false);
                        gapComposer = gapComposer11;
                    }
                    gapComposer.end(z13);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                m4.InvestingSecurityCarouselCard((InvestingSecurityTileContentModel) obj17, (List) obj16, (Function1) obj15, (RealImageLoader) obj14, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                CustomOrderPeriodSelectorKt.PeriodSelection((AbstractPersistentList) obj17, (String) obj16, (Function1) obj15, (Modifier) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ASTUtilKt.InviteContactItem((Modifier) obj17, (Function1) obj15, (String) obj16, (InviteContactsViewModel.Contact) obj14, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 19:
                return invoke$com$squareup$cash$localization$views$LanguageDisclosureViewKt$$ExternalSyntheticLambda5(obj, obj2);
            case 20:
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj17;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj16;
                CardUpsellIllustration cardUpsellIllustration = (CardUpsellIllustration) obj15;
                Function2 function2 = (Function2) obj14;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer7;
                if (gapComposer12.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer12.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    ((DefaultSizes) gapComposer12.consume(staticProvidableCompositionLocal)).getClass();
                    ((DefaultSizes) gapComposer12.consume(staticProvidableCompositionLocal)).getClass();
                    ((DefaultSizes) gapComposer12.consume(staticProvidableCompositionLocal)).getClass();
                    CardUpsellKt.SmallUpsellCardContent(composableLambdaImpl2, composableLambdaImpl3, cardUpsellIllustration, SpacerKt.m301paddingqDBjuR0(companion, 4.0f, 16.0f, 16.0f, 16.0f), function2, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantProfileContent((Modifier) obj17, (MerchantProfileViewModel) obj16, (Function1) obj15, (RealImageLoader) obj14, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ((SquareLoyaltySheetView) obj17).GenericTreeElementsSection((Modifier) obj16, (GenericTreeElementsViewModel) obj14, (Function1) obj15, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                return invoke$com$squareup$cash$moneybot$genie$ButtonViewKt$$ExternalSyntheticLambda1(obj, obj2);
            case 24:
                return invoke$com$squareup$cash$moneybot$genie$DatePickerViewKt$$ExternalSyntheticLambda7(obj, obj2);
            case 25:
                return invoke$com$squareup$cash$moneybot$genie$SwitchViewKt$$ExternalSyntheticLambda0(obj, obj2);
            case 26:
                ((Integer) obj2).getClass();
                Transformations.ChatToolbar((MoneybotChatViewModel) obj17, (Function1) obj15, (Function1) obj16, (MoneybotToolbarSharedElementConfig) obj14, (Composer) obj, Updater.updateChangedFlags(4481));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                Transformations.ChatHistoryAction((Modifier) obj17, (MoneybotChatViewModel) obj16, (Function1) obj15, (Function1) obj14, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$moneybot$views$plugins$TemplateCardKt$$ExternalSyntheticLambda15(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                KeypadKt.CenterLineAlignmentRow((Modifier) obj17, (Function3) obj16, (PaddingValues) obj15, (Function4) obj14, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(RealImageLoader realImageLoader, RealObservabilityManager realObservabilityManager, DependentDetailViewModel dependentDetailViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = realImageLoader;
        this.f$1 = realObservabilityManager;
        this.f$3 = dependentDetailViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(SquareLoyaltySheetView squareLoyaltySheetView, Modifier modifier, GenericTreeElementsViewModel genericTreeElementsViewModel, Function1 function1, int i) {
        this.$r8$classId = 22;
        this.f$0 = squareLoyaltySheetView;
        this.f$1 = modifier;
        this.f$3 = genericTreeElementsViewModel;
        this.f$2 = function1;
    }

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$3 = obj3;
    }

    public /* synthetic */ MoneyUiFactory$$ExternalSyntheticLambda1(Function1 function1, LanguageDisclosureViewModel.Content.Copy copy, LanguageDisclosureViewModel.Content content, MutableState mutableState) {
        this.$r8$classId = 19;
        this.f$2 = function1;
        this.f$0 = copy;
        this.f$1 = content;
        this.f$3 = mutableState;
    }
}
