package androidx.compose.material;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.home.LocalHomeGeoViewKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMenuAvailabilityTextStyle;
import app.cash.local.views.internal.ProgressBarKt;
import app.cash.local.views.map.BrandCollectionSheetViewKt;
import com.mikepenz.markdown.compose.MarkdownExtensionKt;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerKt;
import com.squareup.cash.bitcoin.views.keypad.BitcoinKeypadAmountPickerModel;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.views.EarnerEnrollmentBlockerViewKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.offers.viewmodels.shared.OffersAvatarViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.intellij.markdown.ast.ASTNodeImpl;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;

/* loaded from: classes3.dex */
public final /* synthetic */ class IconButtonKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, boolean z, Alignment alignment, Function3 function3, int i, int i2) {
        this.$r8$classId = 15;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$0 = alignment;
        this.f$4 = function3;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj3;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.f$6;
                CardKt.IconButton(updateChangedFlags, i3, composer, composableLambdaImpl, (Modifier) obj4, (Function0) obj5, this.f$2);
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                OffsetKt.BoxWithConstraints((Modifier) obj4, (Alignment) obj5, this.f$2, (ComposableLambdaImpl) obj3, composer2, updateChangedFlags2, this.f$6);
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                LocalAddBrandsViewKt.LocalBrandProfileComposeUi((Modifier) obj4, (LocalBrandProfileViewModel) obj5, this.f$2, (Function1) obj3, composer3, updateChangedFlags3, this.f$6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                LocalHomeGeoViewKt.LocalHomeGeoView((Modifier) obj4, (LocalHomeGeoViewModel) obj5, (Function1) obj3, this.f$2, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.LocalMenuAvailabilityText((Modifier) obj4, (MenuItemAvailability) obj5, this.f$2, (LocalMenuAvailabilityTextStyle) obj3, composer4, updateChangedFlags4, this.f$6);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(1);
                ProgressBarKt.LocalValueStepper((Modifier) obj4, this.f$2, this.f$5, this.f$6, (Function0) obj5, (Function0) obj3, (Composer) obj, updateChangedFlags5);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                BrandCollectionSheetViewKt.BrandCollectionSheetView((BrandCollectionModel) obj5, (Function1) obj4, (TextFieldState) obj3, this.f$2, (Composer) obj, updateChangedFlags6, this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                MarkdownExtensionKt.MarkdownElement((ASTNodeImpl) obj5, (DefaultMarkdownComponents) obj4, (String) obj3, this.f$2, (Composer) obj, updateChangedFlags7, this.f$6);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                AccountToDoKt.AccountProfileActions((AccountViewModel) obj5, (Function1) obj4, (ElementBoundsRegistry) obj3, this.f$2, (Composer) obj, updateChangedFlags8, this.f$6);
                break;
            case 9:
                Composer composer5 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                LegalSectionKt.ImageTextSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.ImageText) obj5, this.f$2, (Function1) obj3, composer5, updateChangedFlags9, this.f$6);
                break;
            case 10:
                Composer composer6 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                LegalSectionKt.StandaloneHeaderSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.StandaloneHeader) obj5, this.f$2, (Function1) obj3, composer6, updateChangedFlags10, this.f$6);
                break;
            case 11:
                Composer composer7 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                AfterpayCardKt.AfterpayCardSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) obj5, this.f$2, (Function1) obj3, composer7, updateChangedFlags11, this.f$6);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(i2 | 1);
                TextViewKt.Avatar((AvatarSize) obj5, (AvatarEntry) obj3, (Modifier) obj4, this.f$2, (Composer) obj, updateChangedFlags12, this.f$6);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i2 | 1);
                BitcoinKeypadAmountPickerKt.BitcoinKeypadAmountPicker((BitcoinKeypadAmountPickerModel) obj5, this.f$2, (Function1) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags13, this.f$6);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(i2 | 1);
                EarnerEnrollmentBlockerViewKt.EarnerEnrollmentBlockerContent((EarnerEnrollmentBlockerViewModel) obj5, (Function1) obj4, this.f$2, (PaddingValues) obj3, (Composer) obj, updateChangedFlags14, this.f$6);
                break;
            case 15:
                Composer composer8 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags15 = Updater.updateChangedFlags(i2 | 1);
                VisibleKt.ShimmerBox((Modifier) obj4, this.f$2, (Alignment) obj5, (Function3) obj3, composer8, updateChangedFlags15, this.f$6);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int updateChangedFlags16 = Updater.updateChangedFlags(i2 | 1);
                AtmPmdExplainerViewKt.ButtonCta((ActionableButtonDefault) obj5, (Function1) obj3, (Modifier) obj4, this.f$2, (Composer) obj, updateChangedFlags16, this.f$6);
                break;
            case 17:
                ((Integer) obj2).getClass();
                int updateChangedFlags17 = Updater.updateChangedFlags(i2 | 1);
                RetryKt.TwoColumnWidget((GenericComponentViewModel.TwoColumnViewModel) obj5, (Modifier) obj4, this.f$2, (Function1) obj3, (Composer) obj, updateChangedFlags17, this.f$6);
                break;
            case 18:
                ((Integer) obj2).getClass();
                int updateChangedFlags18 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.OffersAvatar((OffersAvatarViewModel) obj5, this.f$2, (Modifier) obj4, (AvatarSize) obj3, (Composer) obj, updateChangedFlags18, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.TitleSubtitleIconsInnerContent((DistributionWheelViewModel.Content.TitleConfiguration) obj5, (DistributionWheelViewModel.Content.TitleConfiguration) obj4, (DistributionWheelViewModel.Content.IconsConfiguration) obj3, this.f$2, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, Object obj, boolean z, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = modifier;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$4 = obj2;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, boolean z, int i, int i2, Function0 function0, Function0 function02, int i3) {
        this.$r8$classId = 5;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$0 = function0;
        this.f$4 = function02;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, LocalHomeGeoViewModel localHomeGeoViewModel, Function1 function1, boolean z, int i, int i2) {
        this.$r8$classId = 3;
        this.f$1 = modifier;
        this.f$0 = localHomeGeoViewModel;
        this.f$4 = function1;
        this.f$2 = z;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(BitcoinKeypadAmountPickerModel bitcoinKeypadAmountPickerModel, boolean z, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = 13;
        this.f$0 = bitcoinKeypadAmountPickerModel;
        this.f$2 = z;
        this.f$4 = function1;
        this.f$1 = modifier;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(OffersAvatarViewModel offersAvatarViewModel, boolean z, Modifier modifier, AvatarSize avatarSize, int i, int i2) {
        this.$r8$classId = 18;
        this.f$0 = offersAvatarViewModel;
        this.f$2 = z;
        this.f$1 = modifier;
        this.f$4 = avatarSize;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Serializable serializable, Object obj, Modifier modifier, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = serializable;
        this.f$4 = obj;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = obj3;
        this.f$2 = z;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$4 = obj3;
        this.f$5 = i;
        this.f$6 = i2;
    }
}
