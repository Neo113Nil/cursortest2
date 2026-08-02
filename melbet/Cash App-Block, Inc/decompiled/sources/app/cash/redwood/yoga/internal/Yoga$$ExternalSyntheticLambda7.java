package app.cash.redwood.yoga.internal;

import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.local.viewmodels.internal.AddRemoveIcon;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.map.BrandSheetViewKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.detail.CompactValue;
import app.cash.redwood.yoga.internal.detail.StyleEnumFlagsKey;
import app.cash.redwood.yoga.internal.detail.Values;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import com.squareup.cardcustomizations.stampview.StampMovingListener;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.account.components.AccountDocumentDownloaderDialogView;
import com.squareup.cash.account.components.AccountDocumentsDownloadOptionsView;
import com.squareup.cash.account.components.AccountDocumentsView;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.AccountViewFactory$AccountSwitchingEmptyView;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.account.components.accountswitcher.AddAccountOptionsView;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloadOptionsViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsDownloaderViewModel;
import com.squareup.cash.account.settings.viewmodels.documents.AccountDocumentsViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewModel;
import com.squareup.cash.account.viewmodels.accountswitcher.AddAccountOptionsViewModel;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.composeui.BannerColors;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.util.Strings;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final /* synthetic */ class Yoga$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ Yoga$$ExternalSyntheticLambda7(AccountDocumentsViewModel.DocumentModel.BannerModel bannerModel, Function1 function1, AccountDocumentsViewModel accountDocumentsViewModel) {
        this.$r8$classId = 18;
        this.f$1 = bannerModel;
        this.f$0 = function1;
        this.f$2 = accountDocumentsViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier.Companion companion;
        AccountDocumentsViewModel accountDocumentsViewModel;
        String str;
        Function1 function1;
        BannerColors bannerColors;
        boolean z;
        int i = this.$r8$classId;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                KClass kClass = (KClass) obj3;
                Enum r3 = (Enum) obj2;
                ((YGStyle) obj).getClass();
                r3.getClass();
                YGStyle.BitfieldRef bitfieldRef = (YGStyle.BitfieldRef) ((Function1) obj4).invoke(((YGNode) obj5).style);
                bitfieldRef.getClass();
                kClass.getClass();
                Enum[] enumArr = bitfieldRef.enumValues;
                LinkedHashMap linkedHashMap = bitfieldRef.style.flags;
                int i2 = bitfieldRef.offset;
                enumArr.getClass();
                linkedHashMap.getClass();
                Object obj6 = linkedHashMap.get(new StyleEnumFlagsKey(i2, kClass));
                if (obj6 == null) {
                    obj6 = ArraysKt___ArraysKt.first(enumArr);
                }
                obj6.getClass();
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalAddBrandsViewKt.LocalEditorialBrandCarousel((Modifier) obj5, (LocalEditorialContent.BrandCarousel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.DeliveryView((Modifier) obj5, (FulfillmentPickerViewModel.Delivery) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(55));
                break;
            case 3:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.PickupView((Modifier) obj5, (FulfillmentPickerViewModel.Pickup) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(55));
                break;
            case 4:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.SchedulingDayOptions((List) obj5, (SchedulingDay) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalAddRemoveIcon((AddRemoveIcon) obj4, (Function0) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalCashActivityView((Modifier) obj5, (LocalCashBalanceViewModel.Activity) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalCashActivityRowIcon((Modifier) obj4, (LocalImage) obj5, (LocalColor) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalCombinedViews((Modifier) obj4, (Function2) obj5, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(391));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BrandSheetViewKt.BrandSheetContent((Modifier) obj5, (BrandCollectionModel.Location) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.MarketingMessageCard((Modifier) obj4, (LocalHomeViewModel.TabContent.Widget.MarketingMessage) obj5, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 11:
                CompactValue compactValue = (CompactValue) obj2;
                ((YGStyle) obj).getClass();
                compactValue.getClass();
                SVGAndroidRenderer sVGAndroidRenderer = ((Values) ((Function1) obj4).invoke(((YGNode) obj5).style)).getCompactValue(((Enum) obj3).ordinal()).payload_;
                YGUnit yGUnit = (YGUnit) sVGAndroidRenderer.fullPath;
                SVGAndroidRenderer sVGAndroidRenderer2 = compactValue.payload_;
                break;
            case 12:
                ((Integer) obj2).getClass();
                PickVisualMediaRequestKt.Stamp((Modifier) obj4, (StampState) obj5, (StampMovingListener) obj3, (Composer) obj, Updater.updateChangedFlags(65));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i3 = AccountDocumentDownloaderDialogView.$r8$clinit;
                ((AccountDocumentDownloaderDialogView) obj5).Content((AccountDocumentsDownloaderViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AccountToDoKt.AccountDocumentDownloaderDialog((AccountDocumentsDownloaderViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                int i4 = AccountDocumentsDownloadOptionsView.$r8$clinit;
                ((AccountDocumentsDownloadOptionsView) obj5).Content((AccountDocumentsDownloadOptionsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                AccountToDoKt.AccountDocumentsDownloadOptions((AccountDocumentsDownloadOptionsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                int i5 = AccountDocumentsView.$r8$clinit;
                ((AccountDocumentsView) obj5).Content((AccountDocumentsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 18:
                AccountDocumentsViewModel.DocumentModel.BannerModel bannerModel = (AccountDocumentsViewModel.DocumentModel.BannerModel) obj5;
                Function1 function12 = (Function1) obj4;
                AccountDocumentsViewModel accountDocumentsViewModel2 = (AccountDocumentsViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Icons icons = Icons.Taxes24;
                    String str2 = bannerModel.title;
                    String str3 = bannerModel.body;
                    String str4 = bannerModel.buttonLabel;
                    AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle bannerStyle = AccountDocumentsViewModel.DocumentModel.BannerModel.BannerStyle.BITCOIN_TAXES;
                    gapComposer.startReplaceGroup(745338380);
                    if (Strings.getColors(gapComposer).isLight) {
                        gapComposer.startReplaceGroup(1630682659);
                        accountDocumentsViewModel = accountDocumentsViewModel2;
                        str = str3;
                        companion = companion2;
                        bannerColors = new BannerColors(Strings.getColors(gapComposer).base.violet5, Strings.getColors(gapComposer).base.violet5, Strings.getColors(gapComposer).semantic.service.taxesBackground, Strings.getColors(gapComposer).semantic.service.taxesBackground, Strings.getColors(gapComposer).semantic.service.taxesBackground, Strings.getColors(gapComposer).semantic.service.taxesBackground, Strings.getColors(gapComposer).semantic.text.link, Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).semantic.service.taxesBackground, 14));
                        gapComposer.end(false);
                        z = false;
                        function1 = function12;
                    } else {
                        companion = companion2;
                        accountDocumentsViewModel = accountDocumentsViewModel2;
                        str = str3;
                        gapComposer.startReplaceGroup(1630728260);
                        function1 = function12;
                        bannerColors = new BannerColors(Strings.getColors(gapComposer).base.violet90, Strings.getColors(gapComposer).base.violet90, Strings.getColors(gapComposer).semantic.service.taxes, Strings.getColors(gapComposer).semantic.service.taxes, Strings.getColors(gapComposer).semantic.service.taxes, Strings.getColors(gapComposer).semantic.service.taxes, Strings.getColors(gapComposer).semantic.text.link, Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).semantic.service.taxes, 14));
                        z = false;
                        gapComposer.end(false);
                    }
                    BannerColors bannerColors2 = bannerColors;
                    gapComposer.end(z);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 8.0f, 16.0f, 16.0f);
                    AccountDocumentsViewModel accountDocumentsViewModel3 = accountDocumentsViewModel;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(accountDocumentsViewModel3);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda5(1, function1, accountDocumentsViewModel3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    VisibleKt.ArcadeBannerCard(icons, str2, m301paddingqDBjuR0, str, null, str4, (Function0) rememberedValue, bannerColors2, gapComposer, 0, 16);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 19:
                ((Integer) obj2).getClass();
                AccountToDoKt.Disclosure((Modifier) obj5, (AccountDocumentsViewModel.DocumentModel.DisclosureModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AccountToDoKt.Footer((Modifier) obj5, (AccountDocumentsViewModel.DocumentModel.FooterModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AccountToDoKt.ProfileDocuments((AccountDocumentsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AccountToDoKt.AccountView((AccountViewModel) obj5, (Function1) obj4, (ElementBoundsRegistry) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                int i6 = AccountViewFactory$AccountSwitchingEmptyView.$r8$clinit;
                ((AccountViewFactory$AccountSwitchingEmptyView) obj5).Content((Unit) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((P2PListView) obj5).Content((EditProfileViewModel$EditCustomerProfileViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 25:
                Animatable animatable = (Animatable) obj4;
                Animatable animatable2 = (Animatable) obj5;
                Animatable animatable3 = (Animatable) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ThemeSwitcherViewKt.CircularRevealAnimation(SizeKt.fillMaxSize(ZIndexModifierKt.zIndex(companion2, 1.0f), 1.0f), animatable, animatable2, animatable3, gapComposer2, 4678);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj5).Content((AccountSwitcherViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                BadgeTitleKt.AccountSwitcher((AccountSwitcherViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                int i7 = AddAccountOptionsView.$r8$clinit;
                ((AddAccountOptionsView) obj5).Content((AddAccountOptionsViewModel) obj3, (Function1) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                BadgeTitleKt.AddAccountOptions((AddAccountOptionsViewModel) obj5, (Function1) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ Yoga$$ExternalSyntheticLambda7(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ Yoga$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ Yoga$$ExternalSyntheticLambda7(Object obj, Object obj2, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = function1;
    }

    public /* synthetic */ Yoga$$ExternalSyntheticLambda7(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = function1;
        this.f$2 = obj2;
    }
}
