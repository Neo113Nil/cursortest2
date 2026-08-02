package com.squareup.cash.pools.views;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.InputDropdownScope;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.arcade.ArcadeFormDetailRowKt$$ExternalSyntheticLambda4;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.history.views.ReportAbuseViewKt;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.localization.views.ComposableSingletons$LocalizationUiFactoryKt;
import com.squareup.cash.localization.views.LanguageDisclosureViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.applets.common.views.InstalledBalanceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.sections.AppletTileItem;
import com.squareup.cash.money.applets.sections.AppletTilePresentation;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.money.applets.sections.CustomResult;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.privacy.RealBalancePrivacy$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.chat.ComposableSingletons$MoneybotChatViewKt;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Leading;
import com.squareup.cash.moneybot.views.shared.MoneybotToolbarSharedKey$Trailing;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.paychecks.views.PaycheckCirclesKt$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.PaycheckDistributionWheel$PlacementConfig;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.coreflowsheet.AddedPaddingValues;
import com.squareup.cash.payments.views.coreflowsheet.AnimatedCornerShape;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.tabs.views.MoneybotToolbarSharedElementConfig;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xyz.block.genie.state.GenieStateBinding;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolToastKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PoolToastKt$$ExternalSyntheticLambda0(int i, Serializable serializable, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$1 = serializable;
        this.f$0 = obj;
        this.f$2 = obj2;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda22(Object obj, Object obj2, Object obj3) {
        final PaychecksHomeViewModel.Content.Section.DirectDeposit directDeposit = (PaychecksHomeViewModel.Content.Section.DirectDeposit) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        final int i = 0;
        final int i2 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean z = directDeposit instanceof PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit;
            int i3 = 18;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-1303095837);
                boolean changed = gapComposer.changed(function1);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda13(function1, mutableState, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                SizeKt.ButtonCta((Function0) rememberedValue, null, ButtonProminence.SUBTLE, false, false, null, Expect_jvmKt.rememberComposableLambda(1448502298, new Function3() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i4 = i;
                        PaychecksHomeViewModel.Content.Section.DirectDeposit directDeposit2 = directDeposit;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit) directDeposit2).secondaryText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, directDeposit2.getText(), (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1573248, 58);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1302845016);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(directDeposit);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i3, function1, directDeposit);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-705932331, new Function3() { // from class: com.squareup.cash.paychecks.views.ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    int i4 = i2;
                    PaychecksHomeViewModel.Content.Section.DirectDeposit directDeposit2 = directDeposit;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit) directDeposit2).secondaryText, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj5;
                            int intValue3 = ((Integer) obj6).intValue();
                            ((RowScope) obj4).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, directDeposit2.getText(), (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1573296, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda35(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) this.f$0;
        PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent pendingDirectDepositSheetContent = (PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent) this.f$1;
        Function0 function0 = (Function0) this.f$2;
        PaddingValues paddingValues = (PaddingValues) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        paddingValues.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.padding(modifier, paddingValues), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Transformations.SheetHeader(pendingDirectDepositSheetContent.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1567489274, new SuggestionUiKt$$ExternalSyntheticLambda8(pendingDirectDepositSheetContent, 26), gapComposer), pendingDirectDepositSheetContent.body, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1576568675, new ProfileKt$$ExternalSyntheticLambda1(3, function0, pendingDirectDepositSheetContent), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paychecks$views$EditDistributionViewKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.f$0;
        MutableState mutableState = (MutableState) this.f$1;
        EditDistributionViewModel.Content content = (EditDistributionViewModel.Content) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        boolean z = false;
        int i = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            DistributionWheelViewModel distributionWheelViewModel = (DistributionWheelViewModel) mutableState.getValue();
            PaycheckDistributionWheel$PlacementConfig paycheckDistributionWheel$PlacementConfig = PaycheckDistributionWheel$PlacementConfig.ARCADE_DISTRIBUTION_FLOW;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilKt$$ExternalSyntheticLambda0(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PaycheckCircles$$ExternalSyntheticLambda4(5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function2 function2 = (Function2) rememberedValue2;
            boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changedInstance(content);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new PaycheckCirclesKt$$ExternalSyntheticLambda3(13, content, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function2 function22 = (Function2) rememberedValue3;
            boolean changed3 = gapComposer.changed(function1);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, z, i);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            HelpSheetViewKt.PaycheckDistributionWheel(distributionWheelViewModel, paycheckDistributionWheel$PlacementConfig, null, function12, function2, function22, (Function2) rememberedValue4, gapComposer, 24576, 4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$paymentpad$views$HomeViewKt$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f$1;
        Function1 function1 = (Function1) this.f$0;
        ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) this.f$2;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier tabToolbarIconTonalBackground = TabToolbarsKt.tabToolbarIconTonalBackground(gapComposer);
            int i = intValue;
            Icons icons = Icons.NavigationScanQr;
            ElementBoundsRegistry.Element element = ElementBoundsRegistry.Element.KeypadQrButton;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new HomeViewKt$$ExternalSyntheticLambda8(4, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TransactorKt.IconAction(titleBarActionScope, icons, str, (Function0) rememberedValue, tabToolbarIconTonalBackground, null, null, elementBoundsRegistry, element, null, false, gapComposer, (i & 14) | 100663344, 816);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$QuickPayViewKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3) {
        QuickPayViewModel.ToolbarWithAvatarViewModel toolbarWithAvatarViewModel = (QuickPayViewModel.ToolbarWithAvatarViewModel) this.f$0;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        titleBarActionScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
        }
        int i = 18;
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (toolbarWithAvatarViewModel.showDetailsOverflow) {
            gapComposer.startReplaceGroup(-1771771875);
            Modifier testTag = TestTagKt.testTag(Modifier.Companion.$$INSTANCE, "overflowMenu");
            Icons icons = Icons.NavigationMore;
            String stringResource = Room.stringResource(gapComposer, R.string.show_more_button_label);
            boolean changed = gapComposer.changed(delegatingSoftwareKeyboardController) | gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function1, i);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, testTag, null, null, null, null, null, false, gapComposer, (intValue & 14) | 24624, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1771486210);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$RecipientsInputViewKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3) {
        boolean z;
        TextFieldValue textFieldValue = (TextFieldValue) this.f$0;
        String str = (String) this.f$1;
        MutableState mutableState = (MutableState) this.f$2;
        Function2 function2 = (Function2) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        function2.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changedInstance(function2) ? 4 : 2;
        }
        int i = intValue;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (textFieldValue.annotatedString.text.length() == 0) {
                gapComposer.startReplaceGroup(-1471648228);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.component.input.text.placeholder;
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).input, 0L, ((TextUnit) mutableState.getValue()).packedValue, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda9(29, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                z = true;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1597440, 0, 4002, j, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) rememberedValue, false);
                gapComposer.end(false);
            } else {
                z = true;
                gapComposer.startReplaceGroup(-1471207594);
                gapComposer.end(false);
            }
            Recorder$$ExternalSyntheticOutline1.m(i & 14, function2, gapComposer, z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$composer$InputAmountKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        PaymentConfigurationViewModel.InputAmount inputAmount = (PaymentConfigurationViewModel.InputAmount) this.f$0;
        Function0 function0 = (Function0) this.f$1;
        AmountKeypadState amountKeypadState = (AmountKeypadState) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean changedInstance = gapComposer.changedInstance(inputAmount) | gapComposer.changed(function0) | gapComposer.changed(amountKeypadState);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(10, inputAmount, function0, amountKeypadState);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, true, null, Expect_jvmKt.rememberComposableLambda(-2068679927, new PoolListSectionKt$$ExternalSyntheticLambda2(inputAmount, 8), gapComposer), gapComposer, 1597872, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$coreflowsheet$CoreFlowBasicShieetScope$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        CoreFlowBasicShieetScope coreFlowBasicShieetScope = (CoreFlowBasicShieetScope) this.f$0;
        AnimatedCornerShape animatedCornerShape = (AnimatedCornerShape) this.f$1;
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) this.f$2;
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
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).ime;
            AddedPaddingValues addedPaddingValues = new AddedPaddingValues(SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer).navigationBarsIgnoringVisibility, gapComposer), paddingValues);
            CoreFlowRealSheetState coreFlowRealSheetState = coreFlowBasicShieetScope.state;
            coreFlowRealSheetState.imeHeightPx$delegate.setValue(Integer.valueOf(androidWindowInsets.getInsets$foundation_layout().bottom));
            boolean booleanValue = ((Boolean) coreFlowRealSheetState.isImeAppearing$delegate.getValue()).booleanValue();
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            if (!booleanValue) {
                modifier = AnimatedContentKt.animateContentSize$default(modifier, coreFlowRealSheetState.enterAnimationSpec$views(), 2);
            }
            Modifier clip = ClipKt.clip(modifier, animatedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clip);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            composableLambdaImpl.invoke((Object) addedPaddingValues, (Object) gapComposer, (Object) 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$payments$views$personalization$CustomContentKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3) {
        Element element = (Element) this.f$0;
        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu = (PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu) this.f$1;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((BoxScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            AlphaKt.UiElement(element, loadedPersonalizePaymentMenu.elementsBeingDragged, function1, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x08ff  */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.squareup.cash.arcade.components.ModalButtonScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v154, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.squareup.cash.arcade.components.list.ListUnorderedScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.squareup.cash.arcade.components.avatar.AvatarImage] */
    /* JADX WARN: Type inference failed for: r3v88, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.runtime.GapComposer] */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        AvatarImage.LocalIcon localIcon;
        boolean changed;
        Object rememberedValue;
        GapComposer gapComposer;
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 15;
        int i4 = 10;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i5 = 18;
        AvatarImage.LocalIcon localIcon2 = null;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                Icons icons = (Icons) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (icons == null) {
                    gapComposer2.startReplaceGroup(-593746163);
                    gapComposer2.end(false);
                    composableLambdaImpl = null;
                } else {
                    gapComposer2.startReplaceGroup(-593746162);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(794488507, new PoolToastKt$$ExternalSyntheticLambda2(icons, r9 ? 1 : 0), gapComposer2);
                    gapComposer2.end(false);
                    composableLambdaImpl = rememberComposableLambda;
                }
                ModalKt.m3381ToastBAHpl2s(null, null, str, composableLambdaImpl, str2, null, null, composer, 0, 483);
                return Unit.INSTANCE;
            case 1:
                String str3 = (String) obj5;
                Function2 function2 = (Function2) obj6;
                String str4 = (String) obj4;
                ?? r15 = (ListUnorderedScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                r15.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(r15) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    r15.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(-701939020, new ArcadeFormDetailRowKt$$ExternalSyntheticLambda4(r12, str3, function2), gapComposer3), null, null, Expect_jvmKt.rememberComposableLambda(-1553767497, new ArcadeFormDetailRowKt$$ExternalSyntheticLambda4(3, str4, function2), gapComposer3), null, gapComposer3, ((intValue << 15) & 458752) | 3078, 22);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                FormBlocker.Element.MerchantTransactionElement merchantTransactionElement = (FormBlocker.Element.MerchantTransactionElement) obj5;
                Icons icons2 = (Icons) obj6;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                ?? r0 = (RealCellActivityAvatarScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                r0.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer3).changed(r0) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Avatar avatar = merchantTransactionElement.avatar;
                    UiAvatar uiAvatar = avatar != null ? StackedAvatarViewModelKt.toUiAvatar(avatar) : null;
                    AvatarOverlay.LocalIcon localIcon3 = Intrinsics.areEqual(merchantTransactionElement.avatarBadged, Boolean.TRUE) ? new AvatarOverlay.LocalIcon(14, 0L, 0L, Icons.Alert16) : null;
                    if (uiAvatar != null) {
                        gapComposer4.startReplaceGroup(583093441);
                        AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(uiAvatar, new UtilsKt$$ExternalSyntheticLambda0(realImageLoader, 1), gapComposer4, 0);
                        ?? r3 = avatarEntry.avatarImage;
                        if (r3 == null) {
                            if (StringsKt.isBlank(avatarEntry.monogram)) {
                                localIcon2 = new AvatarImage.LocalIcon(icons2, 0L, 6);
                            }
                            localIcon = localIcon2;
                        } else {
                            localIcon = r3;
                        }
                        r0.Avatar(AvatarEntry.m3382copyDuSw1wk$default(avatarEntry, 0L, localIcon, localIcon3, EnumC0170g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE), gapComposer4, (intValue2 << 6) & 896);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(583736939);
                        Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                        } else {
                            gapComposer4.startReplaceGroup(-1762997739);
                            gapComposer4.end(false);
                        }
                        r0.m3395AvatarOadGlvw("", colors.semantic.background.brand, new AvatarImage.LocalIcon(icons2, 0L, 6), localIcon3, gapComposer4, ((intValue2 << 18) & 3670016) | 3078, 32);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Function1 function1 = (Function1) obj6;
                GrowToolsManagerViewModel.Loaded.Dialog dialog = (GrowToolsManagerViewModel.Loaded.Dialog) obj4;
                String str5 = (String) obj5;
                ?? r02 = (ModalButtonScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                r02.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer4).changed(r02) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean changed2 = gapComposer5.changed(function1) | gapComposer5.changedInstance(dialog);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(29, function1, dialog);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    r02.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(2110836530, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str5, 20), gapComposer5), gapComposer5, ((intValue3 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                PasscodeDialogViewModel passcodeDialogViewModel = (PasscodeDialogViewModel) obj6;
                Shaker shaker = (Shaker) obj5;
                MutableState mutableState = (MutableState) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer5).changed(booleanValue) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (!gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    gapComposer6.skipToGroupEnd();
                } else if (booleanValue) {
                    gapComposer6.startReplaceGroup(-378195979);
                    Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer6, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 40.0f));
                    gapComposer6.end(true);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(-378024859);
                    ReportAbuseViewKt.PasscodePips(passcodeDialogViewModel.passcodeLength, ((String) mutableState.getValue()).length(), 0, gapComposer6, SharedViewEventsKt.shakeWith(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), shaker));
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 5:
                SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel = (SelectPaymentInstrumentViewModel) obj6;
                Function1 function12 = (Function1) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    List list = selectPaymentInstrumentViewModel.instruments;
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((SelectPaymentInstrumentViewModel.PaymentInstrument) it.next()) instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) {
                                gapComposer7.startReplaceGroup(-623759629);
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        ?? next = it2.next();
                                        if (((SelectPaymentInstrumentViewModel.PaymentInstrument) next) instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument) {
                                            localIcon2 = next;
                                        }
                                    }
                                }
                                SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) localIcon2;
                                Iterator it3 = list.iterator();
                                int i6 = 0;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        i6 = -1;
                                    } else if (!(((SelectPaymentInstrumentViewModel.PaymentInstrument) it3.next()) instanceof SelectPaymentInstrumentViewModel.PaymentInstrument.NewInstrument)) {
                                        i6++;
                                    }
                                }
                                if (i6 == -1 || paymentInstrument == null) {
                                    gapComposer7.startReplaceGroup(-623181479);
                                    gapComposer7.end(false);
                                } else {
                                    gapComposer7.startReplaceGroup(-623549976);
                                    Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                                    boolean changed3 = gapComposer7.changed(function12) | gapComposer7.changedInstance(selectPaymentInstrumentViewModel) | gapComposer7.changed(i6);
                                    Object rememberedValue3 = gapComposer7.rememberedValue();
                                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                        rememberedValue3 = new Http2Connection$$ExternalSyntheticLambda3(function12, selectPaymentInstrumentViewModel, i6, 5);
                                        gapComposer7.updateRememberedValue(rememberedValue3);
                                    }
                                    SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth2, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-981379858, new FormView$$ExternalSyntheticLambda0(paymentInstrument, 13), gapComposer7), gapComposer7, 1572912, 60);
                                    gapComposer7.end(false);
                                }
                                gapComposer7.end(false);
                                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                Modifier fillMaxWidth3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                                boolean z = parcelableSnapshotMutableIntState.getIntValue() == -1;
                                changed = gapComposer7.changed(function12) | gapComposer7.changedInstance(selectPaymentInstrumentViewModel) | gapComposer7.changed(parcelableSnapshotMutableIntState);
                                rememberedValue = gapComposer7.rememberedValue();
                                if (!changed || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(20, function12, selectPaymentInstrumentViewModel, parcelableSnapshotMutableIntState);
                                    gapComposer7.updateRememberedValue(rememberedValue);
                                }
                                SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth3, buttonProminence, false, z, null, InstrumentAvatarUtilsKt.f442lambda$151452124, gapComposer7, 1573296, 40);
                            }
                        }
                    }
                    gapComposer7.startReplaceGroup(-623169575);
                    gapComposer7.end(false);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth32 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    if (parcelableSnapshotMutableIntState.getIntValue() == -1) {
                    }
                    changed = gapComposer7.changed(function12) | gapComposer7.changedInstance(selectPaymentInstrumentViewModel) | gapComposer7.changed(parcelableSnapshotMutableIntState);
                    rememberedValue = gapComposer7.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new GLSceneScope$$ExternalSyntheticLambda2(20, function12, selectPaymentInstrumentViewModel, parcelableSnapshotMutableIntState);
                    gapComposer7.updateRememberedValue(rememberedValue);
                    SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth32, buttonProminence2, false, z, null, InstrumentAvatarUtilsKt.f442lambda$151452124, gapComposer7, 1573296, 40);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) ((TaxesAppletTile) obj6).onClick;
                AppletTile.AppletTileAppearance appletTileAppearance = (AppletTile.AppletTileAppearance) obj5;
                State state = (State) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    StocksAppletTileModel stocksAppletTileModel = (StocksAppletTileModel) state.getValue();
                    if (stocksAppletTileModel instanceof StocksAppletTileModel.Installed.LoadingPriceMovement) {
                        gapComposer8.startReplaceGroup(807944785);
                        SharedUIKt.LoadingBalanceAppletTile(Room.stringResource(gapComposer8, R.string.applets_pres_investing), taxesAppletViewsModule$$ExternalSyntheticLambda1, false, appletTileAppearance.useRedesignedTiles, gapComposer8, 0);
                        gapComposer8.end(false);
                    } else if (stocksAppletTileModel instanceof StocksAppletTileModel.Installed.LoadedPriceMovement) {
                        gapComposer8.startReplaceGroup(807952806);
                        BarcodeScanning.InstalledUI((StocksAppletTileModel.Installed.LoadedPriceMovement) stocksAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer8, 0);
                        gapComposer8.end(false);
                    } else if (stocksAppletTileModel instanceof StocksAppletTileModel.Uninstalled) {
                        gapComposer8.startReplaceGroup(807955260);
                        BarcodeScanning.UninstalledUI((StocksAppletTileModel.Uninstalled) stocksAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer8, 0);
                        gapComposer8.end(false);
                    } else {
                        if (!(stocksAppletTileModel instanceof StocksAppletTileModel.Installed.GraphError)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, 807941703, false);
                        }
                        gapComposer8.startReplaceGroup(807963207);
                        BarcodeScanning.GraphErrorUI((StocksAppletTileModel.Installed.GraphError) stocksAppletTileModel, appletTileAppearance, taxesAppletViewsModule$$ExternalSyntheticLambda1, gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                StocksAppletTileModel.Installed.LoadedPriceMovement loadedPriceMovement = (StocksAppletTileModel.Installed.LoadedPriceMovement) obj6;
                InstalledBalanceAppletTileLayoutConfig installedBalanceAppletTileLayoutConfig = (InstalledBalanceAppletTileLayoutConfig) obj5;
                AppletTile.AppletTileAppearance appletTileAppearance2 = (AppletTile.AppletTileAppearance) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    BarcodeScanning.m2064StocksVisualrAjV9yQ(loadedPriceMovement, installedBalanceAppletTileLayoutConfig.iconSize, appletTileAppearance2.useRedesignedTiles, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                InvestingCategoryFilterViewModel.Content.FilterOption.Selection selection = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection) obj6;
                Function1 function13 = (Function1) obj5;
                InvestingCategoryFilterViewModel.Content.FilterSection filterSection = (InvestingCategoryFilterViewModel.Content.FilterSection) obj4;
                InputDropdownScope inputDropdownScope = (InputDropdownScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                inputDropdownScope.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer9).changed(inputDropdownScope) ? 4 : 2;
                }
                int i7 = intValue8;
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
                    for (InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow optionRow : selection.selectableOptions) {
                        boolean changed4 = gapComposer10.changed(function13) | gapComposer10.changedInstance(filterSection) | gapComposer10.changedInstance(selection) | gapComposer10.changedInstance(optionRow);
                        Object rememberedValue4 = gapComposer10.rememberedValue();
                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                            l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(function13, filterSection, selection, optionRow, 28);
                            gapComposer10.updateRememberedValue(l2__externalsyntheticlambda7);
                            rememberedValue4 = l2__externalsyntheticlambda7;
                        }
                        InputChipKt.InputDropdownItem(inputDropdownScope, (Function0) rememberedValue4, null, Expect_jvmKt.rememberComposableLambda(-2074049124, new FormView$$ExternalSyntheticLambda0(optionRow, i5), gapComposer10), gapComposer10, (i7 & 14) | 3072);
                    }
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                CustomOrderKt.ExpandedWidget((Function0) obj6, (Function0) obj5, (Function0) obj4, (Composer) obj2, 0);
                return Unit.INSTANCE;
            case 10:
                LanguageDisclosureViewModel.Content content = (LanguageDisclosureViewModel.Content) obj6;
                Function1 function14 = (Function1) obj5;
                LanguageDisclosureViewModel.Content.Copy copy = (LanguageDisclosureViewModel.Content.Copy) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    if (content.isLocaleSettingsButtonEnabled) {
                        gapComposer11.startReplaceGroup(-1834436201);
                        Modifier fillMaxWidth4 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                        ButtonProminence buttonProminence3 = ButtonProminence.STANDARD;
                        boolean changed5 = gapComposer11.changed(function14);
                        Object rememberedValue5 = gapComposer11.rememberedValue();
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new CashMapViewKt$$ExternalSyntheticLambda4(6, function14);
                            gapComposer11.updateRememberedValue(rememberedValue5);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue5, fillMaxWidth4, buttonProminence3, false, false, null, ComposableSingletons$LocalizationUiFactoryKt.f461lambda$2062772053, gapComposer11, 1573296, 56);
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(-1834116777);
                        gapComposer11.end(false);
                    }
                    Modifier fillMaxWidth5 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    boolean changed6 = gapComposer11.changed(function14);
                    Object rememberedValue6 = gapComposer11.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new CashMapViewKt$$ExternalSyntheticLambda4(7, function14);
                        gapComposer11.updateRememberedValue(rememberedValue6);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue6, fillMaxWidth5, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(453389414, new LanguageDisclosureViewKt$$ExternalSyntheticLambda9(copy, 1), gapComposer11), gapComposer11, 1573296, 56);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                AppletId appletId = (AppletId) obj6;
                AppletTileSectionProvider appletTileSectionProvider = (AppletTileSectionProvider) obj5;
                AppletTile appletTile = (AppletTile) obj4;
                CustomResult customResult = (CustomResult) obj;
                RealBalancePrivacy$$ExternalSyntheticLambda1 realBalancePrivacy$$ExternalSyntheticLambda1 = (RealBalancePrivacy$$ExternalSyntheticLambda1) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                customResult.getClass();
                realBalancePrivacy$$ExternalSyntheticLambda1.getClass();
                if (!(customResult instanceof CustomResult.Failure)) {
                    if (customResult instanceof CustomResult.Success) {
                        AppletTileItem.Section section = (AppletTileItem.Section) ((CustomResult.Success) customResult).value;
                        if (section == null) {
                            return new AppletTileSectionProvider.Element.Loading(appletId);
                        }
                        appletTileSectionProvider.missingAppletIds.remove(appletId);
                        return new AppletTileSectionProvider.Element.Loaded(new AppletTileItem(appletId, appletTile, section, new AppletTile.AppletTileAppearance(booleanValue2, new EnumListAdapter$encode$1(1, realBalancePrivacy$$ExternalSyntheticLambda1, RealBalancePrivacy$$ExternalSyntheticLambda1.class, "mask", "mask(Ljava/lang/String;)Ljava/lang/String;", 0, 23)), AppletTilePresentation.Default));
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return null;
            case 12:
                String str6 = (String) obj5;
                GenieStateBinding genieStateBinding = (GenieStateBinding) obj6;
                TextStyle textStyle = (TextStyle) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    TextKt.m561TextNvy7gAk(StringsKt.isBlank(str6) ? (String) genieStateBinding.getValue() : str6 + ": " + genieStateBinding.getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, textStyle, gapComposer12, 0, 0, 131070);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                MoneybotChatViewModel moneybotChatViewModel = (MoneybotChatViewModel) obj6;
                Function1 function15 = (Function1) obj5;
                Function1 function16 = (Function1) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Modifier m277height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 44.0f);
                    Colors colors2 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors2.semantic.background.standard, RoundedCornerShapeKt.RoundedCornerShape(50));
                    boolean z2 = moneybotChatViewModel instanceof MoneybotChatViewModel.Content.Chat;
                    if (z2) {
                        m177backgroundbw27NRU = m177backgroundbw27NRU.then(SpacerKt.m300paddingVpY3zN4$default(companion, 4.0f, RecyclerView.DECELERATION_RATE, 2));
                    }
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.End, 1)), Alignment.Companion.CenterVertically, gapComposer13, 54);
                    int hashCode2 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer13, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    if (z2) {
                        gapComposer13.startReplaceGroup(2113949698);
                        Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 44.0f);
                        boolean changed7 = gapComposer13.changed(function15);
                        Object rememberedValue7 = gapComposer13.rememberedValue();
                        if (changed7 || rememberedValue7 == neverEqualPolicy) {
                            rememberedValue7 = new MoneyTabUIKt$$ExternalSyntheticLambda21(4, function15);
                            gapComposer13.updateRememberedValue(rememberedValue7);
                        }
                        MenuKt.IconButton((Function0) rememberedValue7, m285size3ABfNKs, false, null, null, ComposableSingletons$MoneybotChatViewKt.lambda$968449688, gapComposer13, 1572912, 60);
                        gapComposer = gapComposer13;
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer13;
                        gapComposer.startReplaceGroup(2114316273);
                        gapComposer.end(false);
                    }
                    if (moneybotChatViewModel.getShowOverflowMenu()) {
                        gapComposer.startReplaceGroup(2114360045);
                        Transformations.OverflowMenuAction(6, gapComposer, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 44.0f), function15);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(2114468328);
                        Transformations.ChatHistoryAction(androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 44.0f), moneybotChatViewModel, function15, function16, gapComposer, 6);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                MoneybotChatViewModel moneybotChatViewModel2 = (MoneybotChatViewModel) obj6;
                Function1 function17 = (Function1) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                UiScope uiScope = (UiScope) obj;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer13).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda9(i4, mutableState2);
                        gapComposer14.updateRememberedValue(rememberedValue8);
                    }
                    Transformations.ChatToolbar(moneybotChatViewModel2, function17, (Function1) rememberedValue8, new MoneybotToolbarSharedElementConfig(uiScope, uiScope, MoneybotToolbarSharedKey$Leading.INSTANCE, MoneybotToolbarSharedKey$Trailing.INSTANCE), gapComposer14, 4480);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Function1 function18 = (Function1) obj6;
                ManagedActivityResultLauncher managedActivityResultLauncher = (ManagedActivityResultLauncher) obj5;
                MutableState mutableState3 = (MutableState) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer15, R.string.moneybot_attachment_camera);
                    Icons icons3 = Icons.CameraFill16;
                    boolean changed8 = gapComposer15.changed(function18);
                    Object rememberedValue9 = gapComposer15.rememberedValue();
                    if (changed8 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new CashtagViewKt$$ExternalSyntheticLambda13(function18, mutableState3, i3);
                        gapComposer15.updateRememberedValue(rememberedValue9);
                    }
                    CardViewApi21Impl.AttachmentMenuItem(48, gapComposer15, icons3, stringResource, (Function0) rememberedValue9);
                    String stringResource2 = Room.stringResource(gapComposer15, R.string.moneybot_attachment_photo);
                    Icons icons4 = Icons.Image24;
                    boolean changedInstance = gapComposer15.changedInstance(managedActivityResultLauncher);
                    Object rememberedValue10 = gapComposer15.rememberedValue();
                    if (changedInstance || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0(i2, managedActivityResultLauncher, mutableState3);
                        gapComposer15.updateRememberedValue(rememberedValue10);
                    }
                    CardViewApi21Impl.AttachmentMenuItem(48, gapComposer15, icons4, stringResource2, (Function0) rememberedValue10);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                TextFieldState textFieldState = (TextFieldState) obj6;
                Function1 function19 = (Function1) obj5;
                Function0 function0 = (Function0) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, ExpandableContentKt.f502lambda$837318617, Expect_jvmKt.rememberComposableLambda(-75437306, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(textFieldState, 26), gapComposer16), Expect_jvmKt.rememberComposableLambda(2055161522, new MoneyTabUIKt$$ExternalSyntheticLambda11(i4, (Object) textFieldState, function19), gapComposer16), Expect_jvmKt.rememberComposableLambda(-1477924463, new DismissableToastKt$$ExternalSyntheticLambda3(22, function0), gapComposer16), (Function3) null, gapComposer16, 28080, 33);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                TextFieldValue textFieldValue = (TextFieldValue) obj6;
                String str7 = (String) obj5;
                TextStyle textStyle2 = (TextStyle) obj4;
                ?? r03 = (Function2) obj;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                r03.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer16).changedInstance(r03) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    if (textFieldValue.annotatedString.text.length() == 0) {
                        gapComposer17.startReplaceGroup(214506999);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, ComposerKt.composerHintColor(gapComposer17), (Composer) gapComposer17, (Modifier) null, textStyle2, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                        gapComposer17.end(false);
                    } else {
                        gapComposer17.startReplaceGroup(214596372);
                        gapComposer17.end(false);
                    }
                    r03.invoke(gapComposer17, Integer.valueOf(intValue15 & 14));
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                PaychecksAppletTileModel paychecksAppletTileModel = (PaychecksAppletTileModel) obj6;
                TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda12 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5;
                AppletTile.AppletTileAppearance appletTileAppearance3 = (AppletTile.AppletTileAppearance) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (!gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    gapComposer18.skipToGroupEnd();
                } else if (paychecksAppletTileModel instanceof PaychecksAppletTileModel.Loading) {
                    gapComposer18.startReplaceGroup(-616453649);
                    SharedUIKt.LoadingBalanceAppletTile("Paychecks", taxesAppletViewsModule$$ExternalSyntheticLambda12, false, appletTileAppearance3.useRedesignedTiles, gapComposer18, 6);
                    gapComposer18.end(false);
                } else if (paychecksAppletTileModel instanceof PaychecksAppletTileModel.Installed) {
                    gapComposer18.startReplaceGroup(-616447638);
                    JvmActuals_jvmKt.InstalledUI((PaychecksAppletTileModel.Installed) paychecksAppletTileModel, appletTileAppearance3, taxesAppletViewsModule$$ExternalSyntheticLambda12, gapComposer18, 0);
                    gapComposer18.end(false);
                } else {
                    if (!(paychecksAppletTileModel instanceof PaychecksAppletTileModel.Uninstalled)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer18, -616454745, false);
                    }
                    gapComposer18.startReplaceGroup(-616444763);
                    JvmActuals_jvmKt.UninstalledUI((PaychecksAppletTileModel.Uninstalled) paychecksAppletTileModel, taxesAppletViewsModule$$ExternalSyntheticLambda12, gapComposer18, 0);
                    gapComposer18.end(false);
                }
                return Unit.INSTANCE;
            case 19:
                return invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda22(obj, obj2, obj3);
            case 20:
                return invoke$com$squareup$cash$paychecks$views$ArcadePaychecksHomeViewKt$$ExternalSyntheticLambda35(obj, obj2, obj3);
            case 21:
                Function1 function110 = (Function1) obj6;
                Modifier modifier = (Modifier) obj4;
                String str8 = (String) obj5;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    boolean changed9 = gapComposer19.changed(function110);
                    Object rememberedValue11 = gapComposer19.rememberedValue();
                    if (changed9 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new HelpSheetViewKt$$ExternalSyntheticLambda2(19, function110);
                        gapComposer19.updateRememberedValue(rememberedValue11);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue11, modifier, null, false, false, null, Expect_jvmKt.rememberComposableLambda(1597487122, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str8, i5), gapComposer19), gapComposer19, 1572864, 60);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                return invoke$com$squareup$cash$paychecks$views$EditDistributionViewKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 23:
                return invoke$com$squareup$cash$paymentpad$views$HomeViewKt$$ExternalSyntheticLambda13(obj, obj2, obj3);
            case 24:
                return invoke$com$squareup$cash$payments$views$QuickPayViewKt$$ExternalSyntheticLambda7(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$payments$views$RecipientsInputViewKt$$ExternalSyntheticLambda5(obj, obj2, obj3);
            case 26:
                return invoke$com$squareup$cash$payments$views$composer$InputAmountKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$payments$views$coreflowsheet$CoreFlowBasicShieetScope$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$payments$views$personalization$CustomContentKt$$ExternalSyntheticLambda1(obj, obj2, obj3);
            default:
                PoolsAppletTileModel poolsAppletTileModel = (PoolsAppletTileModel) obj6;
                TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda13 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5;
                AppletTile.AppletTileAppearance appletTileAppearance4 = (AppletTile.AppletTileAppearance) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (!gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    gapComposer20.skipToGroupEnd();
                } else if (poolsAppletTileModel instanceof PoolsAppletTileModel.Installed) {
                    gapComposer20.startReplaceGroup(2134109494);
                    PoolsAppletTileKt.InstalledPoolsUI((PoolsAppletTileModel.Installed) poolsAppletTileModel, appletTileAppearance4, taxesAppletViewsModule$$ExternalSyntheticLambda13, gapComposer20, 0);
                    gapComposer20.end(false);
                } else {
                    if (!(poolsAppletTileModel instanceof PoolsAppletTileModel.Uninstalled)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer20, -1732280809, false);
                    }
                    gapComposer20.startReplaceGroup(2134238609);
                    PoolsAppletTileModel.Uninstalled uninstalled = (PoolsAppletTileModel.Uninstalled) poolsAppletTileModel;
                    SharedUIKt.AppletTileRowUninstalledContent(2131233361, 0, gapComposer20, uninstalled.title, uninstalled.subtitle, taxesAppletViewsModule$$ExternalSyntheticLambda13);
                    gapComposer20.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolToastKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ PoolToastKt$$ExternalSyntheticLambda0(int i, Object obj, String str, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$2 = obj;
        this.f$1 = str;
    }
}
