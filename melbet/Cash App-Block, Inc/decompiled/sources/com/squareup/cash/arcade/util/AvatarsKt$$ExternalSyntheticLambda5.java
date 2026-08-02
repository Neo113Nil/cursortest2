package com.squareup.cash.arcade.util;

import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.room.TransactorKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalStackedImageStyle;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$AuthenticatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityReadyViewModel$PasswordViewModel;
import com.squareup.cash.arcade.bindings.timeline.TimelineProtoBindingKt;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.banking.views.BalanceHomeViewKt;
import com.squareup.cash.benefits.viewmodels.BenefitsHubViewModel;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt;
import com.squareup.cash.borrow.views.LoanDetailsSheetState;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.CardStudioViewV2Kt;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.TooltipState;
import com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem;
import com.squareup.cash.offers.views.home.collectionCluster.ItemDirection;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.PrepurchasePlanningSheetHomeKt;
import com.squareup.cash.profile.views.security.WebSectionKt;
import com.squareup.cash.transfers.views.composer.ScheduledReloadConfigurationComposersKt;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.protos.franklin.ui.Timeline;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.encoding.AbstractEncoder;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarsKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(Modifier modifier, String str, int i, Integer num, Function0 function0, int i2, int i3) {
        this.$r8$classId = 24;
        this.f$2 = modifier;
        this.f$0 = str;
        this.f$5 = i;
        this.f$1 = num;
        this.f$3 = function0;
        this.f$6 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$3;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                AvatarsKt.HorizontalStackedAvatars((AvatarSize) obj5, (StackedAvatarViewModel) obj4, this.f$2, (Function3) obj3, (Composer) obj, updateChangedFlags, this.f$6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.LocalDiscountText(this.f$2, (String) obj5, (TextStyle) obj4, (Arrangement$Horizontal) obj3, (Composer) obj, updateChangedFlags2, this.f$6);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.StackedImageTile(this.f$2, (ContentScale) obj5, (LocalStackedImageStyle) obj4, (String) obj3, (Composer) obj, updateChangedFlags3, this.f$6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                AbstractEncoder.MarkdownText((String) obj5, (ASTNodeImpl) obj4, this.f$2, (TextStyle) obj3, (Composer) obj, updateChangedFlags4, this.f$6);
                break;
            case 4:
                Function0 function0 = (Function0) obj3;
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.f$6;
                AccountToDoKt.AccountSectionRowNoIcon(updateChangedFlags5, i3, (Composer) obj, this.f$2, (String) obj5, (String) obj4, function0);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                TimelineProtoBindingKt.Timeline((Timeline) obj5, (Function1) obj4, this.f$2, (Function1) obj3, (Composer) obj, updateChangedFlags6, this.f$6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                ModalKt.Dimmer(this.f$2, (Function0) obj5, (PaddingValues) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags7, this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                FilterBarKt.FilterBar(this.f$2, (LazyListState) obj5, (PaddingValues) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags8, this.f$6);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                AudioConfigUtil.DiagonalStackedAvatars((DiagonalAvatarValues) obj5, (AvatarEntry) obj4, (AvatarEntry) obj3, this.f$2, (Composer) obj, updateChangedFlags9, this.f$6);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(1 | i2);
                ViewfinderKt.HeroHeader((String) obj5, this.f$2, (String) obj4, (TextStyle) obj3, (Composer) obj, updateChangedFlags10, this.f$6);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(1 | i2);
                ViewfinderKt.HeroHeader((ComposableLambdaImpl) obj5, this.f$2, (Function2) obj4, (TextStyle) obj3, (Composer) obj, updateChangedFlags11, this.f$6);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(1 | i2);
                TransactorKt.CustomAction((TitleBarActionScope) obj5, this.f$2, (Badge) obj4, (Function3) obj3, (Composer) obj, updateChangedFlags12, this.f$6);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(1 | i2);
                StackedAvatarsKt.StackedAvatars((StackedAvatarViewModel) obj4, (Function3) obj3, this.f$2, (StackedAvatarView$TextSize) obj5, (Composer) obj, updateChangedFlags13, this.f$6);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(1 | i2);
                BalanceHomeViewKt.BalanceHome((BalanceHomeViewModel.Loaded) obj5, (Function1) obj4, this.f$2, (ScrollState) obj3, (Composer) obj, updateChangedFlags14, this.f$6);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int updateChangedFlags15 = Updater.updateChangedFlags(1 | i2);
                BenefitsHubViewKt.m3414InsightCardIColEu4((BenefitsHubViewModel.Loaded.Insight) obj5, (Function1) obj4, this.f$2, (Dp) obj3, (Composer) obj, updateChangedFlags15, this.f$6);
                break;
            case 15:
                ((Integer) obj2).getClass();
                int updateChangedFlags16 = Updater.updateChangedFlags(1 | i2);
                LoanDetailsSheetKt.LoanDetailsSheet((BorrowHomeOverlayViewModel.LoanDetails) obj5, (Function1) obj4, (LoanDetailsSheetState) obj3, this.f$2, (Composer) obj, updateChangedFlags16, this.f$6);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int updateChangedFlags17 = Updater.updateChangedFlags(1 | i2);
                CardStudioViewV2Kt.CardStudioV2Content(this.f$2, (Flow) obj5, (CardStudioViewModelV2.Content) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags17, this.f$6);
                break;
            case 17:
                ((Integer) obj2).getClass();
                int updateChangedFlags18 = Updater.updateChangedFlags(1 | i2);
                VisibleKt.SegmentedCircle((ArrayList) obj5, (SegmentedCircleConfig) obj4, this.f$2, (Modifier) obj3, (Composer) obj, updateChangedFlags18, this.f$6);
                break;
            case 18:
                ((Integer) obj2).getClass();
                int updateChangedFlags19 = Updater.updateChangedFlags(1 | i2);
                KeypadKt.TooltipBox((String) obj5, (TooltipState) obj4, this.f$2, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags19, this.f$6);
                break;
            case 19:
                ((Integer) obj2).getClass();
                int updateChangedFlags20 = Updater.updateChangedFlags(1 | i2);
                TileMode.CollectionItem(this.f$2, (ClusterItem) obj5, (ItemDirection) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags20, this.f$6);
                break;
            case 20:
                ((Integer) obj2).getClass();
                int updateChangedFlags21 = Updater.updateChangedFlags(1 | i2);
                AliasPickerViewKt.ConfirmAccountRemovalDialog((Function0) obj5, (Function0) obj4, (String) obj3, this.f$2, (Composer) obj, updateChangedFlags21, this.f$6);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int updateChangedFlags22 = Updater.updateChangedFlags(1 | this.f$6);
                PrepurchasePlanningSheetHomeKt.PrepurchaseCardLoadableListItem((ListUnorderedScope) obj5, (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow) obj4, this.f$5, (Function1) obj3, this.f$2, (Composer) obj, updateChangedFlags22);
                break;
            case 22:
                ((Integer) obj2).getClass();
                int updateChangedFlags23 = Updater.updateChangedFlags(1 | i2);
                WebSectionKt.PersonalizedAdsSection((ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel) obj5, (Function1) obj4, (Function1) obj3, this.f$2, (Composer) obj, updateChangedFlags23, this.f$6);
                break;
            case 23:
                ((Integer) obj2).getClass();
                int updateChangedFlags24 = Updater.updateChangedFlags(1 | i2);
                WebSectionKt.TaxesAccessSection((ProfileSecurityReadyViewModel$PasswordViewModel) obj5, (ProfileSecurityReadyViewModel$AuthenticatorViewModel) obj4, (Function1) obj3, this.f$2, (Composer) obj, updateChangedFlags24, this.f$6);
                break;
            case 24:
                ((Integer) obj2).getClass();
                int updateChangedFlags25 = Updater.updateChangedFlags(1);
                ScheduledReloadConfigurationComposersKt.DayItem(this.f$2, (String) obj5, this.f$5, (Integer) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags25, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags26 = Updater.updateChangedFlags(i2 | 1);
                SellerCardKt.SellerCard((SellerCardViewModel) obj5, this.f$2, (SellerCardSize) obj4, (SellerCardShape) obj3, (Composer) obj, updateChangedFlags26, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(Modifier modifier, Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(ListUnorderedScope listUnorderedScope, PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow infoRow, int i, Function1 function1, Modifier modifier, int i2) {
        this.$r8$classId = 21;
        this.f$0 = listUnorderedScope;
        this.f$1 = infoRow;
        this.f$5 = i;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(StackedAvatarViewModel stackedAvatarViewModel, Function3 function3, Modifier modifier, StackedAvatarView$TextSize stackedAvatarView$TextSize, int i, int i2) {
        this.$r8$classId = 12;
        this.f$1 = stackedAvatarViewModel;
        this.f$3 = function3;
        this.f$2 = modifier;
        this.f$0 = stackedAvatarView$TextSize;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(Object obj, Modifier modifier, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = modifier;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Modifier modifier, Object obj3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = modifier;
        this.f$3 = obj3;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = modifier;
        this.f$5 = i;
        this.f$6 = i2;
    }
}
