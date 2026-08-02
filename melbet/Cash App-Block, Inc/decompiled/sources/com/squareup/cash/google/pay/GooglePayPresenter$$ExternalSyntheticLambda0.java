package com.squareup.cash.google.pay;

import _COROUTINE.ArtificialStackFrames;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.mikepenz.markdown.compose.elements.MarkdownHeaderKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.genericelements.components.components.arcade.ArcadeUtilKt;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarUtilsKt;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.invitations.InviteErrorViewModel;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.localization.views.LanguageDisclosureViewKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.KTypesJvm;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.encoding.AbstractDecoder;

/* loaded from: classes6.dex */
public final /* synthetic */ class GooglePayPresenter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(int i, int i2, Icons icons, String str) {
        this.$r8$classId = 21;
        this.f$0 = str;
        this.f$1 = icons;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((GooglePayPresenter) obj4).m3561models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ArcadeUtilKt.CellActivityWidget((GenericComponentViewModel.CellActivityViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ArcadeUtilKt.CellDefaultWidget((GenericComponentViewModel.CellDefaultViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                QuickAccessBarKt.ShowMore((LazyItemScopeImpl) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((LocalEditorialPresenter) obj4).m1210models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((DisclosurePresenter) obj4).m3435models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((VerifyCheckDialogPresenter) obj4).m3467models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((GLSceneScope) obj4).Light((LightStateImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                KTypesJvm.Header((GrowToolsManagerViewModel.Loaded.Header) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                KTypesJvm.GrowToolsManagerView((GrowToolsManagerViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                KTypesJvm.ShowDialog((GrowToolsManagerViewModel.Loaded.Dialog) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj4).UI((AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((EndAppLockPresenter) obj4).m1348models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((DisclosurePresenter) obj4).m3435models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                InstrumentAvatarUtilsKt.InstrumentSelectionContent((InstrumentSelectionBlockerViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                InvestingCategoryDetailKt.InvestingFilterGroupCarousel((FilterGroupCarousel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                CustomOrderKt.CustomOrderTooltip((TypesJVMKt) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                CustomOrderKt.BottomText((String) obj4, (Icons) obj3, (Composer) obj, Updater.updateChangedFlags(1), i2);
                break;
            case 22:
                ((Integer) obj2).getClass();
                MarkdownHeaderKt.InvestingKeyStatsDetails((InvestingKeyStatsDetailsViewModel) obj4, (Function1) obj3, companion, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                AbstractDecoder.NewsArticle((InvestingCryptoNewsArticleViewModel) obj4, i2, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                AutoInvestPurchaseKt.AutoInvestFrequencyPicker((InvestingRecurringFrequencyPickerViewModel) obj4, (Function1) obj3, companion, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((LocalPosCheckInPresenter) obj4).m1222models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ArtificialStackFrames.HeaderInfo((InvestingCryptoNewsArticleViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).intValue();
                InviteErrorDialogKt.InviteErrorDialog((InviteErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).intValue();
                LanguageDisclosureViewKt.LanguageDisclosureView((LanguageDisclosureViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                LanguageDisclosureViewKt.LanguageDisclosureViewContent((LanguageDisclosureViewModel.Content) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(GenericComponentViewModel.CellActivityViewModel cellActivityViewModel, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$0 = cellActivityViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = cellDefaultViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(InvestingKeyStatsDetailsViewModel investingKeyStatsDetailsViewModel, Function1 function1, int i) {
        this.$r8$classId = 22;
        this.f$0 = investingKeyStatsDetailsViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(InvestingRecurringFrequencyPickerViewModel investingRecurringFrequencyPickerViewModel, Function1 function1, int i) {
        this.$r8$classId = 24;
        this.f$0 = investingRecurringFrequencyPickerViewModel;
        this.f$1 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel, int i, Function1 function1, int i2) {
        this.$r8$classId = 23;
        this.f$0 = investingCryptoNewsArticleViewModel;
        this.f$2 = i;
        this.f$1 = function1;
    }

    public /* synthetic */ GooglePayPresenter$$ExternalSyntheticLambda0(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
