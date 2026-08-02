package com.squareup.cash.music.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.redwood.Modifier$$ExternalSyntheticLambda0;
import bo.app.q2$$ExternalSyntheticLambda8;
import coil3.RealImageLoader;
import com.google.android.libraries.places.api.model.zzco;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import com.squareup.cash.R;
import com.squareup.cash.amountchooser.viewmodels.AmountChooserViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerTaggingPromptViewModel;
import com.squareup.cash.earnings.views.home.EarningsHomeKt;
import com.squareup.cash.earnings.views.home.EarningsToolsSectionKt;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.earnings.views.payers.PresentationStyle;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.earningstracker.views.EarningsTrackerViewKt;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlsToggleViewModel;
import com.squareup.cash.family.familyhub.viewmodels.P2PControlListViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewModel;
import com.squareup.cash.family.requestsponsorship.views.SelectSponsorViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupViewKt;
import com.squareup.cash.formview.viewmodels.FormTextInputIconViewModel;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.activity.InvestingActivityHistoryViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentAutoInvestViewModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.viewmodels.MerchantProfileViewModel;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.merchant.views.components.ActionNoticeKt;
import com.squareup.cash.merchant.views.components.ButtonConfig;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.TooltipState;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.offers.views.OffersCollapsibleHeaderScaffoldState;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.protos.cash.ui.Icon;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import net.idrnd.face.iad.capture.internal.s2;
import org.commonmark.internal.util.LinkScanner;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Modifier modifier, OffersCollapsibleHeaderScaffoldState offersCollapsibleHeaderScaffoldState, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 28;
        this.f$3 = modifier;
        this.f$0 = offersCollapsibleHeaderScaffoldState;
        this.f$1 = composableLambdaImpl;
        this.f$2 = composableLambdaImpl2;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$0;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TrackRowKt.MusicView((RealImageLoader) obj4, (MusicViewModel) obj6, (Function1) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                EarningsHomeKt.EarningsHome((EarningsHomeViewModel) obj6, (Function1) obj5, (RealImageLoader) obj4, (LocalizedMoneyFormatter.Factory) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                EarningsToolsSectionKt.EarnerModeSheetContent((EarningsHomeViewModel.EarnerModeSheet) obj4, (Function1) obj5, (PaddingValues) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.AddPayerCustomersScreen((AddPayerCustomersViewModel) obj4, (Function1) obj5, (PresentationStyle) obj6, (PaddingValues) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.PayerTaggingPromptContent((PayerTaggingPromptViewModel) obj4, (Function1) obj5, (PaddingValues) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                EarningsTrackerViewKt.EarningsTrackerView((EarningsTrackerViewModel) obj6, (Function1) obj5, (RealImageLoader) obj4, (LocalizedMoneyFormatter.Factory) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                EarningsTrackerViewKt.EarningsTrackerUi((EarningsTrackerViewModel) obj4, (Function1) obj5, (MoneyFormatter) obj6, (MoneyFormatter) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AllowanceViewKt.P2PRowSection((P2PControlListViewModel) obj4, (P2PControlListViewModel) obj6, (P2PControlListViewModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AllowanceViewKt.ToggleSection((DependentControlsToggleViewModel) obj4, (ControlType) obj6, (String) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AllowanceViewKt.ControlRow((Icons) obj4, this.f$4, (ControlType) obj6, (zzco) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(391));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).intValue();
                AllowanceViewKt.AllowanceSelectionHeader((String) obj4, (String) obj6, (AmountChooserViewModel.Content.AmountChooserConfigButtonModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                SelectSponsorViewKt.SelectSponsorContent((SelectSponsorViewModel.SelectSponsor) obj4, (TextFieldState) obj6, (Modifier$$ExternalSyntheticLambda0) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 12:
                FormTextInputIconViewModel formTextInputIconViewModel = ((ArcadeFormTextInputGroupView.InputFieldModel) obj4).icon;
                MutableState mutableState = (MutableState) obj6;
                List list = (List) obj5;
                MutableState mutableState2 = (MutableState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (((String) mutableState2.getValue()) != null) {
                    gapComposer.startReplaceGroup(-47764008);
                    Trace.m1191Iconww6aTOc(Icons.AlertFill24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                    gapComposer.end(false);
                } else if (formTextInputIconViewModel != null) {
                    gapComposer.startReplaceGroup(-47519108);
                    int ordinal = formTextInputIconViewModel.ordinal();
                    if (ordinal != 0) {
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (ordinal == 1) {
                            gapComposer.startReplaceGroup(-47283477);
                            boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                            boolean changed = gapComposer.changed(mutableState);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new DrawerViewKt$$ExternalSyntheticLambda2(29, mutableState);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            ArcadeFormTextInputGroupViewKt.PasswordObfuscationToggleButton(0, gapComposer, null, (Function0) rememberedValue, booleanValue);
                            gapComposer.end(false);
                        } else {
                            if (ordinal != 2) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 552656454, false);
                            }
                            gapComposer.startReplaceGroup(-46975926);
                            Icons icons = Icons.ClearField24;
                            String stringResource = Room.stringResource(gapComposer, R.string.clear_field_content_description);
                            boolean changedInstance = gapComposer.changedInstance(list) | gapComposer.changed(i2);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new q2$$ExternalSyntheticLambda8(list, i2, 11);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            Trace.m1191Iconww6aTOc(icons, stringResource, ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, null, (Function0) rememberedValue2, 15), 0L, gapComposer, 6, 8);
                            gapComposer.end(false);
                        }
                    } else {
                        gapComposer.startReplaceGroup(-47467989);
                        Trace.m1191Iconww6aTOc(Icons.LockLockedFill24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-46543942);
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                QuickAccessBarKt.WarningModal((LazyItemScopeImpl) obj4, (String) obj6, (String) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.InvestingAvatar((LinkScanner) obj4, (ColorModel) obj6, (AvatarOverlay) obj5, (Boolean) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$4);
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.CollapsingHeader((InvestingStockSelectionViewModel.Loaded) obj4, (Modifier) obj3, (Function1) obj5, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                AnnotatedStringKtxKt.InvestingActivityHistory((RealImageLoader) obj4, (InvestingActivityHistoryViewModel) obj6, (Function1) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ChannelsKt__ChannelsKt.DependentAutoInvestView((DependentAutoInvestViewModel) obj6, (RealImageLoader) obj4, (Function1) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails((RealImageLoader) obj4, (InvestingEtfHoldingDetailsViewModel) obj6, (Function1) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).intValue();
                s2.SearchResults((List) obj6, (Function1) obj5, (Function0) obj3, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                InviteErrorDialogKt.InviteContactsView((RealImageLoader) obj4, (InviteContactsViewModel) obj6, (Function1) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                MerchantProfileViewKt.MerchantProfileView((MerchantScreen$MerchantProfileScreen) obj6, (RealImageLoader) obj4, (MerchantProfileViewModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ActionNoticeKt.ActionNotice((Modifier) obj3, (String) obj4, (String) obj6, (ButtonConfig) obj5, (Composer) obj, Updater.updateChangedFlags(7), this.f$4);
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                CardUiKt.CardUi((ChatCardViewModel) obj4, (Modifier) obj3, (Function1) obj5, (InsightBarChartSelectionState) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                InsightChartKt.m3626ChartDescriptionxqIIw2o((String) obj4, (Icon) obj6, (Modifier) obj3, (Color) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                TextCardKt.RenderedGenieCard((ViewPlan) obj4, (KeyValueMap) obj6, (GenieLogger) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                KeypadKt.m3647PillMogV5mo((String) obj4, (Modifier) obj3, this.f$4, (Color) obj6, (Color) obj5, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                KeypadKt.TooltipBox((ComposableLambdaImpl) obj4, (TooltipState) obj6, (Modifier) obj3, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                UtilsKt.OffersCollapsibleHeaderScaffold((Modifier) obj3, (OffersCollapsibleHeaderScaffoldState) obj4, (ComposableLambdaImpl) obj6, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaychecksReceiptContent((PaychecksReceiptViewModel) obj6, (Function1) obj5, (RealImageLoader) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Modifier modifier, String str, String str2, ButtonConfig buttonConfig, int i, int i2) {
        this.$r8$classId = 22;
        this.f$3 = modifier;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = buttonConfig;
        this.f$4 = i2;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Icons icons, int i, ControlType controlType, zzco zzcoVar, Function1 function1, int i2) {
        this.$r8$classId = 9;
        this.f$0 = icons;
        this.f$4 = i;
        this.f$1 = controlType;
        this.f$3 = zzcoVar;
        this.f$2 = function1;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(ArcadeFormTextInputGroupView.InputFieldModel inputFieldModel, MutableState mutableState, List list, int i, MutableState mutableState2) {
        this.$r8$classId = 12;
        this.f$0 = inputFieldModel;
        this.f$1 = mutableState;
        this.f$2 = list;
        this.f$4 = i;
        this.f$3 = mutableState2;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(DependentAutoInvestViewModel dependentAutoInvestViewModel, RealImageLoader realImageLoader, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 17;
        this.f$1 = dependentAutoInvestViewModel;
        this.f$0 = realImageLoader;
        this.f$2 = function1;
        this.f$3 = function0;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen, RealImageLoader realImageLoader, MerchantProfileViewModel merchantProfileViewModel, Function1 function1, int i) {
        this.$r8$classId = 21;
        this.f$1 = merchantScreen$MerchantProfileScreen;
        this.f$0 = realImageLoader;
        this.f$3 = merchantProfileViewModel;
        this.f$2 = function1;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = obj4;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, Modifier modifier, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$3 = modifier;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, RealImageLoader realImageLoader, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = function1;
        this.f$0 = realImageLoader;
        this.f$3 = obj2;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(Object obj, Function1 function1, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(String str, Modifier modifier, int i, Color color, Color color2, int i2) {
        this.$r8$classId = 26;
        this.f$0 = str;
        this.f$3 = modifier;
        this.f$4 = i;
        this.f$1 = color;
        this.f$2 = color2;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(List list, Function1 function1, Function0 function0, RealImageLoader realImageLoader, int i) {
        this.$r8$classId = 19;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$3 = function0;
        this.f$0 = realImageLoader;
        this.f$4 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda2(LinkScanner linkScanner, ColorModel colorModel, AvatarOverlay avatarOverlay, Boolean bool, int i, int i2) {
        this.$r8$classId = 14;
        this.f$0 = linkScanner;
        this.f$1 = colorModel;
        this.f$2 = avatarOverlay;
        this.f$3 = bool;
        this.f$4 = i2;
    }
}
