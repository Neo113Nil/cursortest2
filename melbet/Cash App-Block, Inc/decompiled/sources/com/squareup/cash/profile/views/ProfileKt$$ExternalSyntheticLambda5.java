package com.squareup.cash.profile.views;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.homesection.IconTextSectionKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ProfileKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(boolean z, boolean z2, Function1 function1, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, int i, int i2) {
        this.$r8$classId = 8;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$2 = function1;
        this.f$0 = partnerAccount;
        this.f$1 = networkedAccount;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$5;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ProfileKt.ProfileLoaded((Modifier) obj4, (ProfileViewModel.Loaded) obj3, (Function1) obj5, this.f$3, this.f$4, (Composer) obj, updateChangedFlags, this.f$6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                AccountToDoKt.AccountHeader((AccountCardViewModel) obj3, (Modifier) obj4, this.f$3, this.f$4, (Function1) obj5, (Composer) obj, updateChangedFlags2, this.f$6);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                IconTextSectionKt.IconTextSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) obj3, this.f$3, this.f$4, (Function1) obj5, (Composer) obj, updateChangedFlags3, this.f$6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                ModalKt.Toggle(this.f$3, (Modifier) obj4, (Function1) obj5, this.f$4, (Function3) obj3, (Composer) obj, updateChangedFlags4, this.f$6);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                TextViewKt.Avatar((AvatarSizeOverride) obj3, (AvatarEntry) obj5, (Modifier) obj4, this.f$3, this.f$4, (Composer) obj, updateChangedFlags5, this.f$6);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(this.f$6 | 1);
                InsightChartKt.InteractiveBarChart((ChatCardViewModel.InsightCard.Chart.BarChart) obj4, this.f$5, (InsightBarChartSelectionState) obj3, this.f$3, this.f$4, (Function1) obj5, (Composer) obj, updateChangedFlags6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                ProfileUiViewKt.ProfileView((Modifier) obj4, (ProfileViewModel) obj3, (Function1) obj5, this.f$3, this.f$4, (Composer) obj, updateChangedFlags7, this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                CameraXPreviewKt.CashQrShortcutsOnboardingContent((PaddingValues) obj3, this.f$3, this.f$4, (Function1) obj5, (Modifier) obj4, (Composer) obj, updateChangedFlags8, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                ListItemKt.AccountItem(this.f$3, this.f$4, (Function1) obj5, (PartnerAccount) obj4, (NetworkedAccount) obj3, (Composer) obj, updateChangedFlags9, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(Modifier modifier, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText iconText, boolean z, boolean z2, Function1 function1, int i, int i2) {
        this.$r8$classId = 2;
        this.f$0 = modifier;
        this.f$1 = iconText;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$2 = function1;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(Modifier modifier, ProfileViewModel profileViewModel, Function1 function1, boolean z, boolean z2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = profileViewModel;
        this.f$2 = function1;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(AccountCardViewModel accountCardViewModel, Modifier modifier, boolean z, boolean z2, Function1 function1, int i, int i2) {
        this.$r8$classId = 1;
        this.f$1 = accountCardViewModel;
        this.f$0 = modifier;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$2 = function1;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(AvatarSizeOverride avatarSizeOverride, AvatarEntry avatarEntry, Modifier modifier, boolean z, boolean z2, int i, int i2) {
        this.$r8$classId = 4;
        this.f$1 = avatarSizeOverride;
        this.f$2 = avatarEntry;
        this.f$0 = modifier;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(ChatCardViewModel.InsightCard.Chart.BarChart barChart, int i, InsightBarChartSelectionState insightBarChartSelectionState, boolean z, boolean z2, Function1 function1, int i2) {
        this.$r8$classId = 5;
        this.f$0 = barChart;
        this.f$5 = i;
        this.f$1 = insightBarChartSelectionState;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$2 = function1;
        this.f$6 = i2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(boolean z, Modifier modifier, Function1 function1, boolean z2, Function3 function3, int i, int i2) {
        this.$r8$classId = 3;
        this.f$3 = z;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$4 = z2;
        this.f$1 = function3;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda5(PaddingValues paddingValues, boolean z, boolean z2, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = 7;
        this.f$1 = paddingValues;
        this.f$3 = z;
        this.f$4 = z2;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$5 = i;
        this.f$6 = i2;
    }
}
