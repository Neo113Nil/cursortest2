package app.cash.local.views.home;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.CanvasUtils;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.home.TabSheetUpperContent;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.pos.LocalPosCheckInViewKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import coil3.size.SizeKt;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.google.android.material.datepicker.DateStrings;
import com.google.android.play.core.splitcompat.zzd;
import com.google.android.play.core.splitcompat.zzf;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.card.onboarding.graphics.ActivationSuccessConfig;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.investing.components.exchange.InvestingExchangeAtmPickerKt;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.cash.wallet.views.WalletHomeViewKt;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.stripe.android.financialconnections.features.exit.ExitModalKt;
import com.stripe.android.financialconnections.features.success.SuccessContentKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.WindowUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda34 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(FidesmoProvisioningViewModel.Activating activating, Function1 function1, boolean z, Function1 function12, int i) {
        this.$r8$classId = 14;
        this.f$0 = activating;
        this.f$3 = function1;
        this.f$1 = z;
        this.f$2 = function12;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                LocalHomeGeoViewKt.LocalHomeGeoSheetUpperPill((TabSheetUpperContent.Pill) obj5, this.f$1, (Function0) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                zzacg.m2011ViewfinderEmbeddedExternalSurfacesv6N_fY((Modifier) obj5, this.f$1, (float[]) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                LocalBrandLocationRowKt.LocalBrandProfileView((Modifier) obj5, (LocalBrandProfileViewModel) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                LocalPosCheckInViewKt.BrandCard((Modifier) obj5, (LocalPosBrandOnboardingViewModel.CardModel) obj4, this.f$1, (ParcelableSnapshotMutableIntState) obj3, (Composer) obj, updateChangedFlags4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                LocalHomeViewKt.LocalBrandCollectionWidget((Modifier) obj5, (BrandCollectionModel) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                LegalSectionKt.AvatarTextSection((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AvatarText) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                LegalSectionKt.PaymentManagementSection((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PaymentManagement) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                ModalKt.BottomNavigation((Modifier) obj5, this.f$1, (DynamicColorConfiguration) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags8);
                break;
            case 8:
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                SizeKt.ToastButton((Function0) obj4, this.f$1, (MutableInteractionSourceImpl) obj5, (ComposableLambdaImpl) obj3, composer, updateChangedFlags9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                CanvasUtils.BitcoinAmountPickerView((BitcoinAmountViewModel) obj5, this.f$1, (Function1) obj3, (RealCashVibrator) obj4, (Composer) obj, updateChangedFlags10);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                CanvasUtils.BitcoinAmountPickerContent((BitcoinAmountViewModel) obj5, this.f$1, (Function1) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags11);
                break;
            case 11:
                ((Integer) obj2).intValue();
                int updateChangedFlags12 = Updater.updateChangedFlags(i2 | 1);
                BitcoinExchangeViewKt.OrderHeader((String) obj5, (BitcoinTransferViewModel.Content.Subtitle) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags12);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i2 | 1);
                FlowsKt.WandActivationSuccessAnimation((Modifier) obj5, this.f$1, (WandEdition) obj4, (ActivationSuccessConfig) obj3, (Composer) obj, updateChangedFlags13);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(i2 | 1);
                zzj.ButtonBar((DetailsPage) obj5, this.f$1, (Function1) obj3, (Modifier) obj4, (Composer) obj, updateChangedFlags14);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int updateChangedFlags15 = Updater.updateChangedFlags(i2 | 1);
                FidesmoProvisioningViewKt.ActivatingContent((FidesmoProvisioningViewModel.Activating) obj5, (Function1) obj3, this.f$1, (Function1) obj4, (Composer) obj, updateChangedFlags15);
                break;
            case 15:
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags16 = Updater.updateChangedFlags(i2 | 1);
                ContextUtilsKt.GenericTreeElementsEmpty(updateChangedFlags16, composer2, (Modifier) obj3, (String) obj5, (String) obj4, this.f$1);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int updateChangedFlags17 = Updater.updateChangedFlags(i2 | 1);
                DateStrings.BaseCardWidget((GenericComponentViewModel.BaseCardViewModel) obj5, (Modifier) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags17);
                break;
            case 17:
                ((Integer) obj2).getClass();
                int updateChangedFlags18 = Updater.updateChangedFlags(i2 | 1);
                com.withpersona.sdk2.inquiry.shared.ContextUtilsKt.GenericComponentWidget((GenericComponentViewModel) obj5, (Modifier) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags18);
                break;
            case 18:
                ((Integer) obj2).getClass();
                int updateChangedFlags19 = Updater.updateChangedFlags(i2 | 1);
                WindowUtilsKt.CardContainerWidget((GenericContainerViewModel.CardContainerViewModel) obj5, (Modifier) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags19);
                break;
            case 19:
                ((Integer) obj2).getClass();
                int updateChangedFlags20 = Updater.updateChangedFlags(i2 | 1);
                zzd.GenericContainerWidget((GenericContainerViewModel) obj5, (Function3) obj4, (Function1) obj3, this.f$1, (Composer) obj, updateChangedFlags20);
                break;
            case 20:
                ((Integer) obj2).getClass();
                int updateChangedFlags21 = Updater.updateChangedFlags(i2 | 1);
                zzf.SeriesContainerWidget((GenericContainerViewModel.SeriesContainerViewModel) obj5, (Modifier) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags21);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int updateChangedFlags22 = Updater.updateChangedFlags(i2 | 1);
                InvestingExchangeAtmPickerKt.OrderHeader((String) obj5, (InvestingExchangeViewModel.Content.Subtitle) obj4, this.f$1, (Function1) obj3, (Composer) obj, updateChangedFlags22);
                break;
            case 22:
                ((Integer) obj2).getClass();
                int updateChangedFlags23 = Updater.updateChangedFlags(i2 | 1);
                InsightChartKt.InsightChart((ChatCardViewModel.InsightCard) obj5, (Modifier) obj4, this.f$1, (InsightBarChartSelectionState) obj3, (Composer) obj, updateChangedFlags23);
                break;
            case 23:
                ((Integer) obj2).getClass();
                int updateChangedFlags24 = Updater.updateChangedFlags(i2 | 1);
                BadgeNameKt.ButtonWidgetView((GenericProfileElementViewModel.ButtonWidget) obj5, (Function1) obj3, (Modifier) obj4, this.f$1, (Composer) obj, updateChangedFlags24);
                break;
            case 24:
                ((Integer) obj2).getClass();
                int updateChangedFlags25 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.HeroTagInspectionStub((CardSchemeViewModel.Module.HeroTag) obj5, (TagFormFactor) obj4, this.f$1, (Modifier) obj3, (Composer) obj, updateChangedFlags25);
                break;
            case 25:
                ((Integer) obj2).getClass();
                int updateChangedFlags26 = Updater.updateChangedFlags(1);
                WalletHomeViewKt.CardHomeCopyActionButton((String) obj5, (Icons) obj3, this.f$1, this.f$4, (Function0) obj4, (Composer) obj, updateChangedFlags26);
                break;
            case 26:
                ((Integer) obj2).getClass();
                int updateChangedFlags27 = Updater.updateChangedFlags(i2 | 1);
                ExitModalKt.ExitModalContent((TextResource.StringId) obj5, this.f$1, (Function0) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags27);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags28 = Updater.updateChangedFlags(i2 | 1);
                boolean z = this.f$1;
                SuccessContentKt.m4017SpinnerToSuccessAnimation8GFhAUE(z, (TextResource) obj5, (TextResource) obj4, (Modifier) obj3, (Composer) obj, updateChangedFlags28);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(GenericProfileElementViewModel.ButtonWidget buttonWidget, Function1 function1, Modifier modifier, boolean z, int i) {
        this.$r8$classId = 23;
        this.f$0 = buttonWidget;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$1 = z;
        this.f$4 = i;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(Object obj, Object obj2, Object obj3, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = z;
        this.f$4 = i;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(Object obj, Object obj2, boolean z, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
        this.f$3 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(Object obj, boolean z, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = i;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(Object obj, boolean z, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$3 = function1;
        this.f$2 = obj2;
        this.f$4 = i;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(String str, Icons icons, boolean z, int i, Function0 function0, int i2) {
        this.$r8$classId = 25;
        this.f$0 = str;
        this.f$3 = icons;
        this.f$1 = z;
        this.f$4 = i;
        this.f$2 = function0;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(Function0 function0, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 8;
        this.f$2 = function0;
        this.f$1 = z;
        this.f$0 = mutableInteractionSourceImpl;
        this.f$3 = composableLambdaImpl;
        this.f$4 = i;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda34(boolean z, TextResource textResource, TextResource textResource2, Modifier modifier, int i) {
        this.$r8$classId = 27;
        this.f$1 = z;
        this.f$0 = textResource;
        this.f$2 = textResource2;
        this.f$3 = modifier;
        this.f$4 = i;
    }
}
