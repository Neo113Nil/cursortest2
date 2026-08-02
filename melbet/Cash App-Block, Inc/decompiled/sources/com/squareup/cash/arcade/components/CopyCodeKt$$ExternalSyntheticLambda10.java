package com.squareup.cash.arcade.components;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import coil3.RealImageLoader;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.afterpayapplet.backend.RetroTransaction;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpayListUnorderedScope;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.homesection.LegalSectionKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.afterpayapplet.views.retro.OrderSelectionRetroSectionKt;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentButtonProtoBindingKt;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.components.list.ListOrderedColors$Subtle;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewModel$Loaded;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt;
import com.squareup.cash.cashapplite.views.KycAppletTile;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Icon;
import com.stripe.hcaptcha.HCaptcha;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class CopyCodeKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda10(ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 14;
        this.f$0 = composableLambdaImpl;
        this.f$1 = tooltipState;
        this.f$2 = composableLambdaImpl2;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CopyCodeKt.CopyCodeAnimation((Modifier) obj5, (CopyCodeState) obj4, (CopyCodeColors) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((AfterpayListUnorderedScope) obj5).AfterpayListUnorderedItem((ComposableLambdaImpl) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.Content((AfterpaySearchViewModel) obj5, (SearchBarKeyboardState) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 3:
                ((Integer) obj2).getClass();
                LegalSectionKt.RetroAccessory((RealCellActivityAccessoryScope) obj5, (RetroTransaction) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AfterpayCardKt.CardImageTextView((Modifier) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 5:
                ((Integer) obj2).intValue();
                AfterpayCardKt.TransactionAccessory((RealCellActivityAccessoryScope) obj5, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AfterpayCardKt.TransactionRow((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel) obj4, (Modifier) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 7:
                ((Integer) obj2).getClass();
                OrderSelectionRetroSectionKt.OrderSelectionRetroSection((Modifier) obj5, (AfterpayAppletRetroOrderSelectionViewModel.RetroOrderSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 8:
                ((Integer) obj2).getClass();
                CameraGraph$OperatingMode.AfterpayCategoryIconTile((Modifier) obj5, (AfterpaySearchViewModel.CategoryTileViewModel.CategoryIconTileViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((KycAppletTile) obj5).UI((AgentsAppletTileViewModel) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 10:
                AgentsAppletTileViewModel.Installed installed = (AgentsAppletTileViewModel.Installed) obj5;
                AvatarSize avatarSize = (AvatarSize) obj4;
                List list = (List) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    gapComposer.skipToGroupEnd();
                } else if (installed.avatars.isEmpty()) {
                    gapComposer.startReplaceGroup(-1360411207);
                    AgentsHomeViewKt.m2976AgentsAppletIconlipvc(avatarSize.size, true, null, 45.0f, gapComposer, 3120, 4);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1360215008);
                    AgentsHomeViewKt.AvatarStackVisual(list, avatarSize, i2, gapComposer, 0);
                    gapComposer.end(false);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                ArcadeComponentButtonProtoBindingKt.ButtonContent((RowScope) obj5, (String) obj4, (Icon) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ArcadeComponentProtoBindingKt.m3378RenderCellDefaultxqIIw2o((CellDefault) obj5, (Function1) obj4, (Color) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ((RealToastIconScope) obj4).Icon((Icons) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 14:
                ((Integer) obj2).getClass();
                RuntimeHelpersKt.TooltipBox((ComposableLambdaImpl) obj5, (TooltipState) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ListOrderedKt.ListNumber((String) obj4, (ListOrderedColors$Subtle) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 16:
                ((Integer) obj2).intValue();
                PagerKt.BalanceObfuscationButtonIcon((BalanceAppletTileViewModel.BalanceObfuscationButton) obj5, (ElementBoundsRegistry) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 17:
                ((Integer) obj2).getClass();
                BenefitsLeafletViewKt.BenefitsLeaflet((RealImageLoader) obj5, (BenefitsLeafletViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 18:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftCoverage((OverdraftViewModel.Loaded) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 19:
                ((Integer) obj2).getClass();
                zzadn.Applet((BankingBenefitsAppletTileModel) obj5, (AppletTile.AppletTileAppearance) obj4, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 20:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.BenefitsHome((RealImageLoader) obj5, (BenefitsHomeViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 21:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.BenefitsHomeContent((BenefitsHomeViewModel.Content) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 22:
                ((Integer) obj2).intValue();
                BenefitsHomeViewKt.BenefitsHubError((BenefitsHubViewModel.Error) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 23:
                ((Integer) obj2).getClass();
                BenefitsHubViewKt.BenefitsList((BenefitsHubViewModel.Loaded.BenefitsViewModel) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 24:
                ((Integer) obj2).getClass();
                BillsSubscriptionsMerchantListViewKt.BillsSubscriptionsMerchantListView((BillsSubscriptionsMerchantListViewModel$Loaded) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((TaxesAppletTile) obj5).UI((BitcoinAppletTileModel) obj4, (AppletTile.AppletTileAppearance) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((TapToPayPresenter) obj5).RefreshInvoiceSideEffect((String) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((HCaptcha) obj5).IgnoreFirstLaunchedEffect(obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            case 28:
                ((Integer) obj2).getClass();
                BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencySettings((BitcoinDisplayCurrencyViewModel.Loaded) obj4, (Function1) obj3, (Modifier) obj5, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
            default:
                ((Integer) obj2).getClass();
                BitcoinHomeViewKt.BitcoinHomeContent((BitcoinHomeViewModel) obj5, (Function1) obj4, (zzc) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda10(int i, int i2, Modifier modifier, Object obj, Object obj2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = modifier;
        this.f$3 = i;
    }

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda10(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.TransactionRowViewModel transactionRowViewModel, Modifier modifier, Function1 function1, int i) {
        this.$r8$classId = 6;
        this.f$1 = transactionRowViewModel;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ CopyCodeKt$$ExternalSyntheticLambda10(CellDefault cellDefault, Function1 function1, Color color, int i) {
        this.$r8$classId = 12;
        this.f$0 = cellDefault;
        this.f$1 = function1;
        this.f$2 = color;
        this.f$3 = i;
    }
}
