package com.squareup.cash.music.views;

import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.internal.DebugUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.theme.MoneybotColors;
import com.squareup.cash.moneybot.theme.MoneybotThemeKt;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.NavigationCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.PromptButtonListViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.TemplateCardViewModel;
import com.squareup.cash.moneybot.views.card.CardUiKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneybot.views.plugins.ActionCardKt;
import com.squareup.cash.moneybot.views.plugins.CellActionCardKt;
import com.squareup.cash.moneybot.views.plugins.PromptButtonListKt;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt;
import com.squareup.cash.moneybot.views.plugins.SlottedLineGraphKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.offers.viewmodels.OfferDetailsSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersFilterGroupSheetViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.offers.views.FittedTextState;
import com.squareup.cash.offers.views.OffersFilterGroupSheetKt;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import utils.AnyUtilsKt;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MusicViewKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda8(Modifier modifier, FittedTextState fittedTextState, Function2 function2, int i) {
        this.$r8$classId = 21;
        this.f$2 = modifier;
        this.f$0 = fittedTextState;
        this.f$1 = function2;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TrackRowKt.LoadedMusicContent((MusicViewModel.Loaded) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AnyUtilsKt.ButtonView((ComposePlatform.Button) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                StateBindingsKt.InnerView((ComposePlatform) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                QuirkSettingsLoader.DatePickerView((ComposePlatform.DatePicker) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                UseCaseAdditionSimulator.DropdownMenuView((ComposePlatform.DropdownMenu) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                UseCaseUtil.ImageView((ComposePlatform.Image) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ImageUtil.ProgressIndicatorView((ComposePlatform.ProgressIndicator) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                TargetUtils.SliderView((ComposePlatform.Slider) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                SwitchViewKt.SwitchView((ComposePlatform.Switch) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                DebugUtils.TextFieldView((ComposePlatform.TextField) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                TextViewKt.TextView((ComposePlatform.Text) obj5, (ResolvedStyle) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                MoneybotThemeKt.MoneybotTheme((Colors) obj5, (MoneybotColors) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(385), this.f$3);
                break;
            case 12:
                ((Integer) obj2).getClass();
                CardUiKt.ActivityListCard((ChatCardViewModel.ActivityList) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                InsightChartKt.LegendHeader((String) obj5, (ChatCardViewModel.InsightCard.Chart.Legend) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ActionCardKt.ActionCard((ActionCardViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                CellActionCardKt.CellActionCard((CellActionCardViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                TextCardKt.NavigationCard((NavigationCardViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                PromptButtonListKt.PromptButtonList((PromptButtonListViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                SlottedCardKt.SlottedCard((SlottedCardViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                SlottedLineGraphKt.SlottedLineGraph((LineChartViewModel) obj5, (Modifier) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                TextCardKt.TemplateCard((TemplateCardViewModel) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                UtilsKt.FittedText((Modifier) obj4, (FittedTextState) obj5, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                OffersFilterGroupSheetKt.OffersFilterGroupSheet((OffersFilterGroupSheetViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                UtilsKt.OffersMessageView((OffersMessageViewModel) obj5, (Function0) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1), this.f$3);
                break;
            case 24:
                ((Integer) obj2).intValue();
                UtilsKt.FilterBar((OffersSearchViewModel) obj5, (Function1) obj3, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.OfferDetailsFooter((OfferDetailsSheetViewModel.FooterSectionViewModel) obj5, (Function3) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.OffersDetailsSheetV2((RealImageLoader) obj5, (OffersDetailsSheetViewModelV2) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.OfferDetailsSheetLoaded((OffersDetailsSheetViewModelV2.Loaded) obj5, (Modifier) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.OfferDetailsSheetView((OfferDetailsSheetViewModel) obj5, (Function1) obj3, (RealImageLoader) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                OfferTileKt.OffersHomeV2((RealImageLoader) obj5, (OffersHomeViewModelV2) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i2;
    }

    public /* synthetic */ MusicViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = obj3;
        this.f$3 = i;
    }
}
