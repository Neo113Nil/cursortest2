package com.squareup.cash.profile.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.constraintlayout.motion.widget.Debug;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ConfirmReplaceInfoViewModel;
import com.squareup.cash.account.settings.viewmodels.ErrorViewModel;
import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.common.composeui.CharacterLimitTransformation;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolGoalMetKt;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.pools.views.StartPoolAmountKt;
import com.squareup.cash.pools.views.animation.GoalMetTimeline;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphTimeRangeViewModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.prepurchasecashcard.views.LocaleToggleKt;
import com.squareup.cash.profile.components.ProfilePhotoKt;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceViewModel;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerDeviceDetailsView;
import com.squareup.cash.profile.devicemanager.views.DeviceManagerListViewKt;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmRemoveAliasViewModel;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewModel;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuViewModel;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$$ExternalSyntheticLambda2;
import com.squareup.cash.support.chat.views.input.InputTextFieldKt$InputTextField$1;
import com.squareup.util.Strings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(ProfileConfirmRemoveAliasViewModel profileConfirmRemoveAliasViewModel, String str, Function1 function1) {
        this.$r8$classId = 24;
        this.f$0 = profileConfirmRemoveAliasViewModel;
        this.f$1 = str;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        String m;
        int i3 = this.$r8$classId;
        int i4 = 1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                int i5 = ErrorView.$r8$clinit;
                ((ErrorView) obj5).Content((ErrorViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolContributeReview((PoolContributeWithNoteViewModel.Review) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                PoolToastKt.StartPoolError((StartPoolViewModel.Error) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PoolToastKt.StartPoolName((StartPoolViewModel.Name) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 4:
                Function0 function0 = (Function0) obj5;
                Function0 function02 = (Function0) obj4;
                TextFieldState textFieldState = (TextFieldState) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(TestTagKt.testTag(Modifier.Companion.$$INSTANCE, "create_pool_hints"), 1.0f);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.prominent, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(2, (Boolean) null, 0, 6, (Boolean) null, 118);
                    boolean changed = gapComposer.changed(function0);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ChatInputView$$ExternalSyntheticLambda2(function0, 2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    BasicTextFieldKt.BasicTextField(textFieldState, fillMaxWidth, false, false, new CharacterLimitTransformation(40, function02), m994copyp1EtxEg$default, keyboardOptions, (KeyboardActionHandler) rememberedValue, TextFieldLineLimits.SingleLine.INSTANCE, null, new SolidColor(Strings.getColors(gapComposer).component.input.cursor), null, new InputTextFieldKt$InputTextField$1(i4, textFieldState), null, gapComposer, 100663344, 0, 22028);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                PoolGoalMetKt.AvatarLayoutAnimation((List) obj5, (Modifier) obj4, (GoalMetTimeline) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolMemberList((Function1) obj3, (Modifier) obj5, (PoolMemberListViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolsList((Modifier) obj5, (Function1) obj3, (PoolsListViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                StartPoolAmountKt.StartPoolAmount((StartPoolViewModel.Amount) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                InvestingGraphTabsViewKt.InvestingGraphTimeRangeMooncakeButtons((InvestingGraphTimeRangeViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(3121));
                break;
            case 10:
                ((Integer) obj2).getClass();
                LocaleToggleKt.LocaleToggle((PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.LocaleToggle) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                LocaleToggleKt.FAQSection((PrepurchaseCardFAQViewModel.FAQSectionData) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                break;
            case 12:
                ((Integer) obj2).getClass();
                LocaleToggleKt.OverviewSection((PrepurchaseCardFAQViewModel.OverviewData) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                ProfilePhotoKt.ProfilePhoto((String) obj5, (Function0) obj4, (ColorFilter) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((DeviceManagerDeviceDetailsView) obj5).Content((DeviceManagerDeviceDetailViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                DeviceManagerListViewKt.DeviceItemView((Modifier) obj5, (DeviceViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                int i6 = AccountSwitchInfoDialogView.$r8$clinit;
                ((AccountSwitchInfoDialogView) obj5).Content((AccountSwitchInfoDialogViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                int i7 = ConfirmReplaceInfoView.$r8$clinit;
                ((ConfirmReplaceInfoView) obj5).Content((ConfirmReplaceInfoViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                int i8 = ConfirmSignOutDialog.$r8$clinit;
                ((ConfirmSignOutDialog) obj5).Content((ProfileConfirmSignOutViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                int i9 = FamilyEligibilityLoadingView.$r8$clinit;
                ((FamilyEligibilityLoadingView) obj5).Content((Unit) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                BadgeNameKt.GenericProfileElements((Modifier) obj5, (Debug) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                int i10 = IncomingRequestsView.$r8$clinit;
                ((IncomingRequestsView) obj5).Content((IncomingRequestsViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                BadgeNameKt.IncomingRequests((IncomingRequestsViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                int i11 = ProfileConfirmRemoveAliasDialog.$r8$clinit;
                ((ProfileConfirmRemoveAliasDialog) obj5).Content((ProfileConfirmRemoveAliasViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 24:
                ProfileConfirmRemoveAliasViewModel profileConfirmRemoveAliasViewModel = (ProfileConfirmRemoveAliasViewModel) obj5;
                String str = (String) obj4;
                Function1 function1 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = profileConfirmRemoveAliasViewModel.f1191type.ordinal();
                    if (ordinal == 0) {
                        i = 227116256;
                        i2 = R.string.profile_remove_alias_number_are_you_sure;
                    } else if (ordinal != 1) {
                        gapComposer2.startReplaceGroup(-1549249281);
                        gapComposer2.end(false);
                        m = "";
                        ModalKt.Modal(Modifier.Companion.$$INSTANCE, m, str, Expect_jvmKt.rememberComposableLambda(-715456869, new PdfPreviewViewKt$$ExternalSyntheticLambda4(28, function1), gapComposer2), Expect_jvmKt.rememberComposableLambda(578961978, new PdfPreviewViewKt$$ExternalSyntheticLambda4(29, function1), gapComposer2), (Function3) null, gapComposer2, 27648, 32);
                    } else {
                        i = 227113215;
                        i2 = R.string.profile_remove_alias_email_are_you_sure;
                    }
                    m = re$$ExternalSyntheticOutline0.m(gapComposer2, i, i2, gapComposer2, false);
                    ModalKt.Modal(Modifier.Companion.$$INSTANCE, m, str, Expect_jvmKt.rememberComposableLambda(-715456869, new PdfPreviewViewKt$$ExternalSyntheticLambda4(28, function1), gapComposer2), Expect_jvmKt.rememberComposableLambda(578961978, new PdfPreviewViewKt$$ExternalSyntheticLambda4(29, function1), gapComposer2), (Function3) null, gapComposer2, 27648, 32);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                BadgeNameKt.ProfileConfirmRemoveAlias((ProfileConfirmRemoveAliasViewModel) obj5, (Function1) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                BadgeNameKt.ProfileHeader((Modifier) obj5, (ProfileHeaderViewModel) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(7));
                break;
            case 27:
                ((Integer) obj2).getClass();
                int i12 = ProfileHeaderMenuSheet.$r8$clinit;
                ((ProfileHeaderMenuSheet) obj5).Content((ProfileHeaderMenuViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((ProfileUiView) obj5).Content((ProfileViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int i13 = SearchVisibilityView.$r8$clinit;
                ((SearchVisibilityView) obj5).Content((ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(Object obj, Function1 function1, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = function1;
        this.f$1 = obj2;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(Function0 function0, Function0 function02, TextFieldState textFieldState) {
        this.$r8$classId = 4;
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = textFieldState;
    }

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda1(Function1 function1, Modifier modifier, PoolMemberListViewModel poolMemberListViewModel, int i) {
        this.$r8$classId = 6;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$1 = poolMemberListViewModel;
    }
}
