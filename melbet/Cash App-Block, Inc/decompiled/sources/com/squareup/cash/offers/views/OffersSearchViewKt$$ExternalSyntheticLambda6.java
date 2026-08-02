package com.squareup.cash.offers.views;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavBackStackEntry;
import app.cash.local.viewmodels.LocalCheckoutGiftCardSectionViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import coil3.RealImageLoader;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.charting.components.EarningsBarChartConfig;
import com.squareup.cash.earnings.views.components.EarningsCardKt;
import com.squareup.cash.earningstracker.views.components.BarChartKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.views.article.ArticleViewKt;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.HeroPaymentDevicesRenderingMode;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.DepositPreference;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetKt;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.TextResource;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.encoding.AbstractEncoder;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersSearchViewKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(ColumnScope columnScope, NavBackStackEntry navBackStackEntry, ModalBottomSheetState modalBottomSheetState, SaveableStateHolder saveableStateHolder, Function1 function1, Function1 function12, int i) {
        this.$r8$classId = 14;
        this.f$0 = columnScope;
        this.f$1 = navBackStackEntry;
        this.f$2 = modalBottomSheetState;
        this.f$4 = saveableStateHolder;
        this.f$3 = function1;
        this.f$5 = function12;
        this.f$6 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                UtilsKt.OffersSearchView((OffersSearchViewModel) obj8, (TextFieldState) obj7, (Modifier) obj6, (Function1) obj4, (Function0) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags = 1 | Updater.updateChangedFlags(i2);
                ((ComposableLambdaImpl) obj8).invoke(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            case 2:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.CheckoutGiftCardSection((Modifier) obj6, (LocalCheckoutGiftCardSectionViewModel) obj8, (Function1) obj4, (Function1) obj7, (Function0) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractEncoder.MarkdownText((String) obj8, (ASTNodeImpl) obj7, (TextStyle) obj4, (Modifier) obj6, (MarkdownElementType) obj5, (JWECryptoParts) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                EarningsCardKt.EarningsCard((String) obj8, (String) obj7, (String) obj4, (Function0) obj5, (Painter) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                BarChartKt.BarChart((List) obj8, (String) obj7, (Modifier) obj6, (EarningsBarChartConfig) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1), this.f$6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                InsightChartKt.m3627ChartHeaderContentjM_yU8I((String) obj8, (String) obj7, (String) obj4, (Icon) obj5, (Color) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(1), this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.DistributionFlowScreen((ComposableLambdaImpl) obj8, (Function2) obj7, (ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj5, (ComposableLambdaImpl) obj3, (Modifier) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ArticleViewKt.LoadedArticle((ArticleViewModel.Loaded) obj8, (RealImageLoader) obj7, (Function1) obj4, (WebViewProvider) obj6, (ScrollState) obj5, (SupportActivityItemLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$6);
                break;
            case 9:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ManagedAccountAmountEntryContent((Modifier) obj6, (WithdrawViewModel.ManagedAccountAmountEntry) obj8, (MoneyFormatter) obj7, (RealCashVibrator) obj3, (Function1) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.ArcadeDepositPreferenceOptions((Modifier) obj6, (List) obj8, (WithdrawViewModel.ViewAmount.DepositPreferenceStyle) obj7, (DepositPreference) obj5, (String) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.squareup.cash.wallet.views.UtilsKt.HeroPaymentDevicesCarousel((CardSchemeViewModel.Module.HeroPaymentDevices) obj8, (Function1) obj4, (RealImageLoader) obj7, (Modifier) obj6, (Function1) obj5, (HeroPaymentDevicesRenderingMode) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                AccountPickerScreenKt.AccountPickerLoaded((Async) obj8, (AccountPickerState) obj7, (LazyListState) obj6, (Function1) obj4, (Function1) obj3, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ListItemKt.ModalBottomSheetContent((Function1) obj4, (String) obj8, (TextResource) obj7, (Function0) obj5, (Modifier) obj6, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                BottomSheetKt.SheetContentHost((ColumnScope) obj8, (NavBackStackEntry) obj7, (ModalBottomSheetState) obj6, (SaveableStateHolder) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(int i, int i2, Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, Function function) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = function;
        this.f$5 = obj4;
        this.f$2 = modifier;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(Modifier modifier, LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel, Function1 function1, Function1 function12, Function0 function0, Function1 function13, int i) {
        this.$r8$classId = 2;
        this.f$2 = modifier;
        this.f$0 = localCheckoutGiftCardSectionViewModel;
        this.f$3 = function1;
        this.f$1 = function12;
        this.f$4 = function0;
        this.f$5 = function13;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(Modifier modifier, WithdrawViewModel.ManagedAccountAmountEntry managedAccountAmountEntry, MoneyFormatter moneyFormatter, RealCashVibrator realCashVibrator, Function1 function1, Function0 function0, int i) {
        this.$r8$classId = 9;
        this.f$2 = modifier;
        this.f$0 = managedAccountAmountEntry;
        this.f$1 = moneyFormatter;
        this.f$5 = realCashVibrator;
        this.f$3 = function1;
        this.f$4 = function0;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(Modifier modifier, List list, WithdrawViewModel.ViewAmount.DepositPreferenceStyle depositPreferenceStyle, DepositPreference depositPreference, String str, Function1 function1, int i) {
        this.$r8$classId = 10;
        this.f$2 = modifier;
        this.f$0 = list;
        this.f$1 = depositPreferenceStyle;
        this.f$4 = depositPreference;
        this.f$5 = str;
        this.f$3 = function1;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(ArticleViewModel.Loaded loaded, RealImageLoader realImageLoader, Function1 function1, WebViewProvider webViewProvider, ScrollState scrollState, SupportActivityItemLoader supportActivityItemLoader, int i, int i2) {
        this.$r8$classId = 8;
        this.f$0 = loaded;
        this.f$1 = realImageLoader;
        this.f$3 = function1;
        this.f$2 = webViewProvider;
        this.f$4 = scrollState;
        this.f$5 = supportActivityItemLoader;
        this.f$6 = i2;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(CardSchemeViewModel.Module.HeroPaymentDevices heroPaymentDevices, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Function1 function12, HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode, int i) {
        this.$r8$classId = 11;
        this.f$0 = heroPaymentDevices;
        this.f$3 = function1;
        this.f$1 = realImageLoader;
        this.f$2 = modifier;
        this.f$4 = function12;
        this.f$5 = heroPaymentDevicesRenderingMode;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(Async async, AccountPickerState accountPickerState, LazyListState lazyListState, Function1 function1, Function1 function12, Function0 function0, int i) {
        this.$r8$classId = 12;
        this.f$0 = async;
        this.f$1 = accountPickerState;
        this.f$2 = lazyListState;
        this.f$3 = function1;
        this.f$5 = function12;
        this.f$4 = function0;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(String str, String str2, String str3, Icon icon, Color color, Modifier modifier, int i, int i2) {
        this.$r8$classId = 6;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = str3;
        this.f$4 = icon;
        this.f$5 = color;
        this.f$2 = modifier;
        this.f$6 = i2;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(String str, ASTNodeImpl aSTNodeImpl, TextStyle textStyle, Modifier modifier, MarkdownElementType markdownElementType, JWECryptoParts jWECryptoParts, int i) {
        this.$r8$classId = 3;
        this.f$0 = str;
        this.f$1 = aSTNodeImpl;
        this.f$3 = textStyle;
        this.f$2 = modifier;
        this.f$4 = markdownElementType;
        this.f$5 = jWECryptoParts;
        this.f$6 = i;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(List list, String str, Modifier modifier, EarningsBarChartConfig earningsBarChartConfig, Function1 function1, Function0 function0, int i, int i2) {
        this.$r8$classId = 5;
        this.f$0 = list;
        this.f$1 = str;
        this.f$2 = modifier;
        this.f$5 = earningsBarChartConfig;
        this.f$3 = function1;
        this.f$4 = function0;
        this.f$6 = i2;
    }

    public /* synthetic */ OffersSearchViewKt$$ExternalSyntheticLambda6(Function1 function1, String str, TextResource textResource, Function0 function0, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 13;
        this.f$3 = function1;
        this.f$0 = str;
        this.f$1 = textResource;
        this.f$4 = function0;
        this.f$2 = modifier;
        this.f$5 = composableLambdaImpl;
        this.f$6 = i;
    }
}
