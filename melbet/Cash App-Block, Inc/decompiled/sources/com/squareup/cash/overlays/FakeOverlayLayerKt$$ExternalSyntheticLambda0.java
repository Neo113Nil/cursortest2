package com.squareup.cash.overlays;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.BackwardsCompatNodeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel$Attachment$ImageAttachment;
import com.squareup.cash.moneybot.viewmodels.plugins.BriefViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.GenieCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlotContentViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TextCardViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.home.ParticleGridRenderer;
import com.squareup.cash.moneybot.views.plugins.BriefKt;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.moneybot.views.textinput.MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.TooltipState;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewModel;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.viewmodels.ArcadeOffersTimelineViewModels;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersGreenStatusViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModel;
import com.squareup.cash.offers.viewmodels.OffersNotificationViewModel;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$Error;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$Loading;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$OffersTimelineSheet;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.views.OffersFilterGroupSheetKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.details.OffersLoadingKt;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.views.home.OffersHomeViewKt;
import com.squareup.cash.offers.views.listing.OffersSearchListingKt;
import com.squareup.cash.offers.views.sup.OffersNotificationView;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerOptionsMenuViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class FakeOverlayLayerKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ FakeOverlayLayerKt$$ExternalSyntheticLambda0(MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3 moneybotTextInputViewKt$MoneybotTextInputView$4$1$3, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 12;
        this.f$1 = moneybotTextInputViewKt$MoneybotTextInputView$4$1$3;
        this.f$0 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 7;
        int i3 = 9;
        int i4 = 18;
        int i5 = 17;
        int i6 = 8;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                FakeOverlayLayer fakeOverlayLayer = (FakeOverlayLayer) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    composableLambdaImpl.invoke((Object) fakeOverlayLayer, (Object) gapComposer, (Object) 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                MoneybotScaffoldViewKt.MoneybotScaffoldView((MoneybotScaffold) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                MoneybotColors moneybotColors = (MoneybotColors) obj3;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj4;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Updater.CompositionLocalProvider(MoneybotThemeKt.LocalMoneybotColors.defaultProvidedValue$runtime(moneybotColors), composableLambdaImpl2, gapComposer2, 8);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ViewfinderDefaults.InChatPromptAvatar((UiAvatar) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                CardViewApi21Impl.AttachmentThumbnail((ChatFooterViewModel$Attachment$ImageAttachment) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                MoneybotHomeViewKt.MoneybotParticleGrid((ParticleGridRenderer) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                BriefKt.Brief((BriefViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                TextCardKt.GenieCard((GenieCardViewModel) obj4, (GenieLogger) obj3, companion, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                SlottedCardKt.SlotContent((SlotContentViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                TextCardKt.TextCard((TextCardViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                RawMessagesViewModel rawMessagesViewModel = (RawMessagesViewModel) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    String title = rawMessagesViewModel.getTitle();
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MusicViewKt$$ExternalSyntheticLambda0(8, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(title, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer3, 48, 108);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                BadgedAvatarKt.PickerOptionRow((MoneybotStaticPickerViewModel.Option) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((MoneybotTextInputViewKt$MoneybotTextInputView$4$1$3) obj3).Decoration((ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 13:
                TooltipState tooltipState = (TooltipState) obj4;
                String str = (String) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(SpacerKt.m298padding3ABfNKs(AlphaKt.alpha(companion, tooltipState._alpha$delegate.getFloatValue()), 8.0f), ColorKt.Color(3865141601L), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), 16.0f, 6.5f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m299paddingVpY3zN4);
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
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    long j = Color.White;
                    MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer4.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography == null) {
                        mooncakeTypography = ((Boolean) gapComposer4.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 3072, 0, 4082, j, (Composer) gapComposer4, (Modifier) null, mooncakeTypography.caption, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((RealNearbyManager) obj4).advertiseNearby((NearbyAdvertisement) obj3, (Composer) obj, Updater.updateChangedFlags(9));
                return Unit.INSTANCE;
            case 15:
                Function1 function12 = (Function1) obj4;
                NearbyOrderedListsViewModel nearbyOrderedListsViewModel = (NearbyOrderedListsViewModel) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(companion), 1.0f);
                    Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(1596301484, new MusicViewKt$$ExternalSyntheticLambda7(i4, function12), gapComposer5), null, Expect_jvmKt.rememberComposableLambda(-1577677182, new P2PListViewKt$$ExternalSyntheticLambda12(nearbyOrderedListsViewModel, 11), gapComposer5), gapComposer5, 199680, 22);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                DragAndDrop_androidKt.AddViewAttributes((RealObservabilityManager) obj4, (Map) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                OffersFilterGroupSheetViewModel offersFilterGroupSheetViewModel = (OffersFilterGroupSheetViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    OffersFilterGroupSheetKt.OffersFilterGroupSheet(offersFilterGroupSheetViewModel, function13, null, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Function1 function14 = (Function1) obj4;
                OffersGreenStatusViewModel offersGreenStatusViewModel = (OffersGreenStatusViewModel) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    boolean changed2 = gapComposer7.changed(function14);
                    Object rememberedValue2 = gapComposer7.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MusicViewKt$$ExternalSyntheticLambda0(21, function14);
                        gapComposer7.updateRememberedValue(rememberedValue2);
                    }
                    SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-481410246, new MoneyTabUIKt$$ExternalSyntheticLambda11(i5, (Object) offersGreenStatusViewModel, (Object) function14), gapComposer7), gapComposer7, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                OfferDetailsSheetViewModel offerDetailsSheetViewModel = (OfferDetailsSheetViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(companion, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer8), null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer8, nestedScroll);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    if (offerDetailsSheetViewModel instanceof OfferDetailsSheetViewModel.Loading) {
                        gapComposer8.startReplaceGroup(664253958);
                        OffersLoadingKt.m3679OffersLoadingCt2sIOU(null, RecyclerView.DECELERATION_RATE, new Dp(250.0f), gapComposer8, MLKEMEngine.KyberPolyBytes, 3);
                        gapComposer8.end(false);
                    } else {
                        if (!(offerDetailsSheetViewModel instanceof OfferDetailsSheetViewModel.OfferDetails)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, 664252940, false);
                        }
                        gapComposer8.startReplaceGroup(664255899);
                        OfferDetailsSheetKt.OfferDetailsSheet(null, (OfferDetailsSheetViewModel.OfferDetails) offerDetailsSheetViewModel, function15, null, gapComposer8, 0);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                OffersHomeViewModel offersHomeViewModel = (OffersHomeViewModel) obj4;
                Function1 function16 = (Function1) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    OffersHomeViewKt.OffersHome(null, offersHomeViewModel, function16, gapComposer9, 0);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                OffersSearchListingKt.RenderAsCellSearchResult((OffersRowViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                OffersNotificationViewModel offersNotificationViewModel = (OffersNotificationViewModel) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                int i7 = OffersNotificationView.$r8$clinit;
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(companion);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    long j2 = offersNotificationViewModel.duration;
                    String str2 = offersNotificationViewModel.message;
                    Long valueOf = Long.valueOf(j2);
                    boolean changed3 = gapComposer10.changed(function17);
                    Object rememberedValue3 = gapComposer10.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda0(i2, function17);
                        gapComposer10.updateRememberedValue(rememberedValue3);
                    }
                    MoveBitcoinViewKt.OffersNotification(str2, valueOf, (Function0) rememberedValue3, gapComposer10, 0);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                BackwardsCompatNodeKt.OffersTimeline((OffersTimelineViewModel$OffersTimelineSheet) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                Function1 function18 = (Function1) obj4;
                OffersTimelineViewModelV2 offersTimelineViewModelV2 = (OffersTimelineViewModelV2) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    boolean changed4 = gapComposer11.changed(function18);
                    Object rememberedValue4 = gapComposer11.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda0(i6, function18);
                        gapComposer11.updateRememberedValue(rememberedValue4);
                    }
                    SheetKt.Sheet((Function0) rememberedValue4, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(854012021, new MoneyTabUIKt$$ExternalSyntheticLambda11(22, (Object) offersTimelineViewModelV2, (Object) function18), gapComposer11), gapComposer11, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ArcadeOffersTimelineViewModels arcadeOffersTimelineViewModels = (ArcadeOffersTimelineViewModels) obj4;
                Function1 function19 = (Function1) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    gapComposer12.skipToGroupEnd();
                } else if (arcadeOffersTimelineViewModels instanceof OffersTimelineViewModel$Loading) {
                    gapComposer12.startReplaceGroup(115574393);
                    OffersLoadingKt.m3679OffersLoadingCt2sIOU(null, RecyclerView.DECELERATION_RATE, null, gapComposer12, 0, 7);
                    gapComposer12.end(false);
                } else if (arcadeOffersTimelineViewModels instanceof OffersTimelineViewModel$Error) {
                    gapComposer12.startReplaceGroup(115625977);
                    OffersLoadingKt.m3679OffersLoadingCt2sIOU(null, RecyclerView.DECELERATION_RATE, null, gapComposer12, 0, 7);
                    gapComposer12.end(false);
                } else {
                    if (!(arcadeOffersTimelineViewModels instanceof OffersTimelineViewModel$OffersTimelineSheet)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer12, -1243198696, false);
                    }
                    gapComposer12.startReplaceGroup(115724650);
                    BackwardsCompatNodeKt.OffersTimeline((OffersTimelineViewModel$OffersTimelineSheet) arcadeOffersTimelineViewModels, function19, gapComposer12, 0);
                    gapComposer12.end(false);
                }
                return Unit.INSTANCE;
            case 26:
                AccountPickerOptionsMenuViewModel accountPickerOptionsMenuViewModel = (AccountPickerOptionsMenuViewModel) obj4;
                Function1 function110 = (Function1) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer13), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer13, 0);
                    int hashCode4 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer13.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer13, verticalScroll$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer13.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer13.startReusableNode();
                    if (gapComposer13.inserting) {
                        gapComposer13.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer13.useNode();
                    }
                    Updater.m576setimpl(gapComposer13, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer13, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer13, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer13, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    gapComposer13.startReplaceGroup(-1627970842);
                    List list = accountPickerOptionsMenuViewModel.options;
                    int size = list.size();
                    int i8 = 0;
                    while (i8 < size) {
                        AccountPickerOptionsMenuViewModel.Option option = (AccountPickerOptionsMenuViewModel.Option) list.get(i8);
                        if (i8 > 0) {
                            gapComposer13.startReplaceGroup(-1633787903);
                            ModalKt.HorizontalDivider(0, 1, gapComposer13, null);
                        } else {
                            gapComposer13.startReplaceGroup(892200820);
                        }
                        gapComposer13.end(false);
                        String str3 = option.label;
                        boolean changed5 = gapComposer13.changed(function110) | gapComposer13.changedInstance(option);
                        Object rememberedValue5 = gapComposer13.rememberedValue();
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(i3, function110, option);
                            gapComposer13.updateRememberedValue(rememberedValue5);
                        }
                        AliasPickerViewKt.Option(0, gapComposer13, str3, (Function0) rememberedValue5, i8 == 0);
                        i8++;
                    }
                    gapComposer13.end(false);
                    gapComposer13.end(true);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Function1 function111 = (Function1) obj4;
                OnboardingConfirmAccountRemovalScreen onboardingConfirmAccountRemovalScreen = (OnboardingConfirmAccountRemovalScreen) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    boolean changed6 = gapComposer14.changed(function111);
                    Object rememberedValue6 = gapComposer14.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new P2PListViewKt$$ExternalSyntheticLambda0(i5, function111);
                        gapComposer14.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function0 = (Function0) rememberedValue6;
                    boolean changed7 = gapComposer14.changed(function111);
                    Object rememberedValue7 = gapComposer14.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new P2PListViewKt$$ExternalSyntheticLambda0(i4, function111);
                        gapComposer14.updateRememberedValue(rememberedValue7);
                    }
                    AliasPickerViewKt.ConfirmAccountRemovalDialog(function0, (Function0) rememberedValue7, onboardingConfirmAccountRemovalScreen.account.cash_tag, null, gapComposer14, 0, 8);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                P2PListRowKt.P2PBlockFailureDialog((P2PFailureDialogModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                P2PListViewModel p2PListViewModel = (P2PListViewModel) obj4;
                Function1 function112 = (Function1) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    P2PListRowKt.P2PList(p2PListViewModel, function112, gapComposer15, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FakeOverlayLayerKt$$ExternalSyntheticLambda0(MoneybotColors moneybotColors, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = 2;
        this.f$1 = moneybotColors;
        this.f$0 = composableLambdaImpl;
    }

    public /* synthetic */ FakeOverlayLayerKt$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    public /* synthetic */ FakeOverlayLayerKt$$ExternalSyntheticLambda0(AccountPickerOptionsMenuViewModel accountPickerOptionsMenuViewModel, Function1 function1) {
        this.$r8$classId = 26;
        this.f$0 = accountPickerOptionsMenuViewModel;
        this.f$1 = function1;
    }

    public /* synthetic */ FakeOverlayLayerKt$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
