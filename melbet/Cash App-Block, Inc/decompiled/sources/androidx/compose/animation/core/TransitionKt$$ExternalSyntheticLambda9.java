package androidx.compose.animation.core;

import android.webkit.WebView;
import androidx.camera.video.internal.DebugUtils;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.views.brand.profile.CheckedInHeaderAnimationValues;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.network.NetworkFetcher$fetch$2;
import com.fillr.e;
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans;
import com.mikepenz.markdown.model.NoOpImageTransformerImpl;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.InlineAppMessageKt;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.views.applet.performance.BitcoinPerformanceSummaryViewKt;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.blockers.actions.views.BlockerActionDialogActionViewKt;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.blockers.web.views.WebViewBlockerViewKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.LegacySheetConfig;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.views.DependentDetailViewKt;
import com.squareup.cash.favorites.components.AddFavoritesViewKt;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.investing.components.InvestingMetricView$Factory$Impl;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.BottomSheetStateListener;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.BlockerAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.serialization.encoding.AbstractEncoder;
import net.oneformapp.DLog;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class TransitionKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ TransitionKt$$ExternalSyntheticLambda9(String str, ComposableLambdaImpl composableLambdaImpl, String str2, ComposableLambdaImpl composableLambdaImpl2, String str3, int i) {
        this.$r8$classId = 19;
        this.f$0 = str;
        this.f$1 = composableLambdaImpl;
        this.f$2 = str2;
        this.f$3 = composableLambdaImpl2;
        this.f$4 = str3;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$4;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                AnimatableKt.UpdateInitialAndTargetValues((Transition) obj7, (Transition.TransitionAnimationState) obj6, this.f$2, this.f$3, (FiniteAnimationSpec) obj5, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.AnimatedCheckedInHeaderContent((String) obj7, (String) obj6, (LocalBrandProfileViewModel.Fulfillment.InStore) obj4, (CheckedInHeaderAnimationValues) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                LocalMapKt.m1317CollapsingHeaderScaffold_trzpw((Modifier) obj7, (ComposableLambdaImpl) obj6, (ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, (CollapsingToolbarScaffoldState) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                MarketingMessageKt.MarketingMessageProfileLogo((Modifier) obj7, (LocalImage) obj6, (LocalColor) obj4, (LocalColor) obj3, (String) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractEncoder.MarkdownText((AnnotatedString) obj7, (ASTNodeImpl) obj6, (Modifier) obj4, (TextStyle) obj3, (ExtendedSpans) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractEncoder.MarkdownText((AnnotatedString) obj7, (ASTNodeImpl) obj6, (Modifier) obj4, (TextStyle) obj3, (Function2) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractEncoder.MarkdownInlineImageWithSize((String) obj7, (ASTNodeImpl) obj6, (NoOpImageTransformerImpl) obj4, (Density) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ActivityItemViewKt.ImageButton((Function0) obj7, (AsyncImagePainter) obj6, (AsyncImagePainter.State) obj4, (ItemAccessory.PortraitImage) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1), this.f$5);
                break;
            case 8:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ((EmbeddedHeaderScope) obj7).DefaultHeaderInternal(updateChangedFlags2, composer, (Modifier) obj4, (String) obj6, (String) obj3, (Function0) obj5);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj7).UI((AfterpayAppletTileViewModel) obj6, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                AfterpayCardKt.PrepurchaseToggleFooterContent((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj7, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) obj6, (SharedTransitionScope) obj4, (AnimatedContentScopeImpl) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                InlineAppMessageKt.ImageHeader((ColumnScope) obj7, (String) obj6, (AppMessageImage) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((SheetAppMessageView) obj7).ScrollIndicatorText((SheetAppMessageModel.Loaded) obj6, (RealSheetState) obj4, (PaddingValues) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                DebugUtils.AvatarCarouselItemGroupBase((ImmutableList) obj7, (Function0) obj6, (Modifier) obj4, (String) obj3, (String) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                Trace.TitleBarCore((Modifier) obj7, (DynamicColorConfiguration) obj6, (Function3) obj4, (Function3) obj3, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                PagerKt.BalanceButtons((BalanceAppletTileViewModel) obj7, (Shaker) obj6, (Modifier) obj4, (Colors) obj3, (NetworkFetcher$fetch$2) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                PagerKt.BalanceHeader((BalanceAppletTileViewModel) obj7, (AppletTile.AppletTileAppearance) obj6, (Shaker) obj4, (NetworkFetcher$fetch$2) obj3, (ElementBoundsRegistry) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((BitcoinTransferPresenter) obj7).LaunchSellAllIfNeeded((List) obj6, (CurrencyCode) obj4, (BitcoinTransferScreen.SavedState) obj3, (CryptoBalance$BitcoinBalance) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                BitcoinPerformanceSummaryViewKt.PerformanceStats((String) obj7, (String) obj6, (String) obj4, (String) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                BitcoinAddressCopySheetViewKt.BitcoinAddressCopyScaffold((String) obj7, (ComposableLambdaImpl) obj6, (String) obj4, (ComposableLambdaImpl) obj3, (String) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                BlockerActionDialogActionViewKt.ModalButton((ModalButtonScope) obj7, (String) obj6, (Function0) obj4, (BlockerAction.DialogAction.Button.Style) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                SsnViewKt.ReferralCode((Modifier) obj7, (ReferralCodeViewModel) obj6, (Function1) obj4, (RealImageLoader) obj3, (RealCashVibrator) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                WebViewBlockerViewKt.WebViewBlocker((WebViewBlockerViewModel.LoadUrl) obj7, (WebView) obj6, (Function1) obj4, (Function0) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                UiContainerKt.BottomSheet((LegacySheetConfig) obj7, (BottomSheetStateListener) obj6, (Function0) obj4, (Function0) obj3, (Function2) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                DependentDetailViewKt.DependentDetailView((RealImageLoader) obj7, (RealObservabilityManager) obj6, (DependentDetailViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                AddFavoritesViewKt.ListFavoritesCard((Modifier) obj7, (ArrayList) obj6, (Function1) obj4, (Function0) obj3, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                QuickAccessBarKt.GlobalSearch((Modifier) obj7, (RealImageLoader) obj6, (RealCashVibrator) obj4, (GlobalSearchViewModel) obj3, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                AnimationsKt.CashEngineTextureView((Modifier) obj7, (String) obj6, (e) obj4, (Function1) obj3, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                DLog.InvestmentEntityContent((InvestmentEntityContentModel) obj7, (Function1) obj6, (RealImageLoader) obj4, (InvestingMetricView$Factory$Impl) obj3, (InvestingScreens) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                MarketingCompactCardKt.AppMessageImageView((AppMessageImage) obj7, (String) obj6, (Function1) obj4, (Modifier) obj3, (ContentScale) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TransitionKt$$ExternalSyntheticLambda9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = i;
    }

    public /* synthetic */ TransitionKt$$ExternalSyntheticLambda9(Function0 function0, AsyncImagePainter asyncImagePainter, AsyncImagePainter.State state, ItemAccessory.PortraitImage portraitImage, Modifier modifier, int i, int i2) {
        this.$r8$classId = 7;
        this.f$0 = function0;
        this.f$1 = asyncImagePainter;
        this.f$2 = state;
        this.f$3 = portraitImage;
        this.f$4 = modifier;
        this.f$5 = i2;
    }
}
