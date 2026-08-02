package androidx.compose.material3;

import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.camera.viewfinder.core.TransformationInfo;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.Colors;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.PopupPositionProvider;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.orders.LocalOrderStatusViewKt;
import app.cash.local.views.brand.profile.CheckedInHeaderAnimationValues;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.map.BrandCollectionMapViewKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import coil3.RealImageLoader;
import coil3.svg.internal.ParseSvg_androidKt;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.compose.clustering.ClusteringKt;
import com.mikepenz.markdown.compose.elements.MarkdownHeaderKt;
import com.squareup.address.typeahead.views.AddressModel;
import com.squareup.address.typeahead.views.AddressTypeaheadKt;
import com.squareup.address.typeahead.views.AddressTypeaheadState;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.activity.viewmodels.ReceiptViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.compact.CompactCellActivityKt;
import com.squareup.cash.activity.views.compact.RealCompactActivityAvatarScope;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.RetroSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.ui.util.RealCashVibrator;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.ast.ASTNodeImpl;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes3.dex */
public final /* synthetic */ class AlertDialogKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ActivityItemViewModel activityItemViewModel, Function1 function1, int i) {
        this.$r8$classId = 22;
        this.f$1 = modifier;
        this.f$3 = composableLambdaImpl;
        this.f$0 = activityItemViewModel;
        this.f$2 = function1;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$1;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        Object obj6 = this.f$3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AlertDialogKt.BasicAlertDialog((Function0) obj5, (Modifier) obj3, (DialogProperties) obj4, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ViewfinderKt.Viewfinder((ViewfinderSurfaceRequest) obj5, (Modifier) obj3, (TransformationInfo) obj4, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                SimpleLayoutKt.SelectionContainer((Modifier) obj3, (Selection) obj5, (Function1) obj4, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                CardKt.MaterialTheme((Colors) obj5, (androidx.compose.material.Typography) obj3, (androidx.compose.material.Shapes) obj4, (ComposableLambdaImpl) obj6, (Composer) obj, Updater.updateChangedFlags(3073), this.f$4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                Icons$Filled.BasicTooltipBox((PopupPositionProvider) obj5, (ComposableLambdaImpl) obj6, (TooltipStateImpl) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((ComposableLambdaImpl) obj6).invoke(this.f$0, this.f$1, this.f$2, (Composer) obj, Updater.updateChangedFlags(i2) | 1);
                break;
            case 6:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.MenuCategoryItemCell((Modifier) obj3, (LocalBrandLocationMenuViewModel.MenuCategory) obj5, (LocalBrandLocationMenuViewModel.MenuCategory.MenuItem) obj4, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.BusinessHeader((Modifier) obj3, (LocalOrderStatusViewModel.Loaded.FulfillmentDetails) obj5, (AnnotatedString) obj4, (Function2) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                LocalOrderStatusViewKt.OrderDetailsView((String) obj5, (String) obj3, (String) obj4, (String) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.m1315SettledCheckedInHeaderLayoutTN_CM5M((String) obj5, (String) obj4, (LocalBrandProfileViewModel.Fulfillment.InStore) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.CheckedInHeaderTextColumn((String) obj5, (String) obj4, (CheckedInHeaderAnimationValues) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                Composer composer = (Composer) obj;
                ((Integer) obj2).intValue();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                BrandCollectionMapViewKt.MultipleLocationsSelectorSheetContent(updateChangedFlags, composer, (Modifier) obj3, (List) obj4, (Function0) obj5, (Function1) obj6);
                break;
            case 12:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.EducationalSheetColumn((Modifier) obj3, (EducationalSheetModelList) obj5, (Function1) obj4, (RealSheetState) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ClusteringKt.Clustering((Collection) obj5, (ClusterManager) obj3, (ComposableLambdaImpl) obj6, (DefaultClusterRenderer) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                MarkdownHeaderKt.MarkdownHeader((String) obj5, (ASTNodeImpl) obj3, (TextStyle) obj4, (MarkdownElementType) obj6, (Composer) obj, Updater.updateChangedFlags(1), this.f$4);
                break;
            case 15:
                ((Integer) obj2).getClass();
                AddressTypeaheadKt.Condensed((AddressModel.Condensed) obj5, (AddressTypeaheadState) obj4, (String) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ThemeSwitcherViewKt.ThemeSelection((Modifier) obj3, (String) obj5, (MainPaymentPadViewModel) obj4, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ParseSvg_androidKt.ConfirmationButton((Modifier) obj3, (String) obj4, (TextStyle) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1), this.f$4);
                break;
            case 18:
                ((Integer) obj2).getClass();
                ActivityItemViewKt.ImageButtonAccessory((RealCellActivityAccessoryScope) obj4, (ItemAccessory.PortraitImage) obj6, (Function0) obj5, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).intValue();
                AvatarsKt.FullScreenActivityView((FullScreenActivityViewModel) obj5, (Function1) obj3, (RealImageLoader) obj4, (RealCashVibrator) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((RealCompactActivityAvatarScope) obj3).Avatar((AvatarEntry) obj4, (AvatarBadgeViewModel) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((RealCompactActivityAvatarScope) obj3).DiagonalStackedAvatars((AvatarEntry) obj4, (AvatarEntry) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                CompactCellActivityKt.CompactActivityItemView((Modifier) obj3, (ComposableLambdaImpl) obj6, (ActivityItemViewModel) obj5, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                ReceiptUiKt.ReceiptUi((RealImageLoader) obj5, (RealCashVibrator) obj3, (ReceiptViewModel) obj4, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                FullscreenAdViewKt.FullscreenAd((FullscreenAdViewModel) obj5, (Function1) obj3, (RealImageLoader) obj4, (Flow) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ArcadeElement.Element.ButtonCta((Modifier) obj3, (ComposableLambdaImpl) obj6, (ButtonProminence) obj4, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                RetroSectionKt.ProgressRetroCreditSection((Modifier) obj3, (AfterpayAppletHomeContentViewModel.HomeSection.MoneyBarSectionHeader) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection) obj4, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                RetroSectionKt.DefaultRetroCreditSection((Modifier) obj3, (AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.DefaultCreditHeader) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.RetroTransactionSection) obj4, (Function1) obj6, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                AfterpayCardKt.PrepurchaseActiveCard((StyledCardViewModel) obj5, (SharedTransitionScope) obj4, (AnimatedContentScopeImpl) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((SheetAppMessageView) obj5).Header((SheetAppMessageModel.Loaded) obj4, (Function1) obj6, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = 5;
        this.f$3 = composableLambdaImpl;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(int i, int i2, Object obj, Object obj2, Object obj3, Function0 function0) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$0 = function0;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ButtonProminence buttonProminence, Function0 function0, int i) {
        this.$r8$classId = 25;
        this.f$1 = modifier;
        this.f$3 = composableLambdaImpl;
        this.f$2 = buttonProminence;
        this.f$0 = function0;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Modifier modifier, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Modifier modifier, String str, TextStyle textStyle, Function0 function0, int i, int i2) {
        this.$r8$classId = 17;
        this.f$1 = modifier;
        this.f$2 = str;
        this.f$3 = textStyle;
        this.f$0 = function0;
        this.f$4 = i2;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipStateImpl tooltipStateImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 4;
        this.f$0 = popupPositionProvider;
        this.f$3 = composableLambdaImpl;
        this.f$1 = tooltipStateImpl;
        this.f$2 = composableLambdaImpl2;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(RealCellActivityAccessoryScope realCellActivityAccessoryScope, ItemAccessory.PortraitImage portraitImage, Function0 function0, Modifier modifier, int i) {
        this.$r8$classId = 18;
        this.f$2 = realCellActivityAccessoryScope;
        this.f$3 = portraitImage;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = modifier;
        this.f$4 = i;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = i2;
    }

    public /* synthetic */ AlertDialogKt$$ExternalSyntheticLambda0(Collection collection, ClusterManager clusterManager, ComposableLambdaImpl composableLambdaImpl, DefaultClusterRenderer defaultClusterRenderer, int i) {
        this.$r8$classId = 13;
        this.f$0 = collection;
        this.f$1 = clusterManager;
        this.f$3 = composableLambdaImpl;
        this.f$2 = defaultClusterRenderer;
        this.f$4 = i;
    }
}
