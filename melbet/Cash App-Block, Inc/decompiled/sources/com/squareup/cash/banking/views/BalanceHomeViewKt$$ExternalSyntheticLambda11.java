package com.squareup.cash.banking.views;

import androidx.camera.video.internal.DebugUtils;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSizeImpl;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewModel;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewModel;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewModel;
import com.squareup.cash.banking.viewmodels.BetterOverdraftViewModel;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup;
import com.squareup.cash.benefits.viewmodels.BenefitsHomeViewModel;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.viewmodels.PdsaBenefitsExplainerViewModel$Loaded;
import com.squareup.cash.benefits.views.BenefitDetailsViewKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceHomeViewKt$$ExternalSyntheticLambda11 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda11(int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? m177backgroundbw27NRU;
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                BalanceHomeViewKt.OverdraftManageRow((BalanceHomeViewModel.OverdraftPillViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                DebugUtils.ButtonAvatars((MutableInteractionSourceImpl) obj4, (ImmutableList) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                AvatarSizeImpl avatarSizeImpl = (AvatarSizeImpl) obj4;
                AvatarEntry avatarEntry = (AvatarEntry) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TextViewKt.m3620OverflowCountAvatarXOJAsU(this.f$2, avatarSizeImpl, avatarEntry.backgroundColor, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((RealCellActivityAvatarScope) obj4).Avatar((AvatarEntry) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                Color color = (Color) obj4;
                ColorFilter colorFilter = (ColorFilter) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(i2, 0, gapComposer2);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    if (color != null && (m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, color.value, ColorKt.RectangleShape)) != 0) {
                        companion = m177backgroundbw27NRU;
                    }
                    ImageKt.Image(painterResource, null, fillMaxSize.then(companion), null, null, RecyclerView.DECELERATION_RATE, colorFilter, gapComposer2, Painter.$stable | 48, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj2).intValue();
                BalanceHomeViewKt.OverdraftUpsellCard((BalanceHomeViewModel.Loaded.OverdraftUpsellViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                BalanceHomeViewKt.BankingSections((BankingSectionsViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                BalanceHomeViewKt.BankingSection((BankingTab.BankingTabSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                BalanceHomeViewKt.BankingOption((BankingTab.BankingOption) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                BenefitsLeafletViewKt.CtaGroup((ActionableButtonCtaGroup) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftUsageCircle((BetterOverdraftViewModel.Loaded) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                BankingDialogKt.OverdraftFooter((BetterOverdraftViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                BankingDialogKt.BetterOverdraftView((BetterOverdraftViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftPermanentlyDisabled((OverdraftViewModel.Loaded.PermanentlyDisabledViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftActivated((OverdraftViewModel.Loaded.ActivatedViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftEligible((OverdraftViewModel.Loaded.EligibleViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                BankingDialogKt.OverdraftDisabled((OverdraftViewModel.Loaded.DisabledViewModel) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                BenefitDetailsViewKt.BenefitDetailsView((BenefitDetailsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).intValue();
                BenefitsHomeViewKt.BenefitsExplanationView((BenefitsExplanationViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                BenefitsHomeViewKt.StatusPathInformationSection((BenefitsHomeViewModel.StatusPathInfoSection) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).intValue();
                BenefitsHubViewKt.CallToAction((BenefitsHubViewModel.Loaded.CallToActionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                BenefitsHubViewKt.CommonQuestions((BenefitsHubViewModel.Loaded.CommonQuestionsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 22:
                ((Integer) obj2).intValue();
                BenefitsHubViewKt.BenefitsHubView((BenefitsHubViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                BenefitsHubViewKt.BenefitsHub((BenefitsHubViewModel.Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                BenefitsHomeViewKt.PdsaBenefitsExplainerView((PdsaBenefitsExplainerViewModel$Loaded) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((MusicPresenter) obj4).m3665models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((AddAliasPresenter) obj4).m3724models((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((BitcoinHomePresenter) obj4).HandleScrollAnalytics((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((ErrorPresenter) obj4).HandleViewEvents((Flow) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ BalanceHomeViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
    }
}
