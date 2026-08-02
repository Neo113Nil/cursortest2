package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.cash.work.views.SellerCardKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Size$Regular;
import com.stripe.android.financialconnections.ui.components.TextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class AccountAvatarKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda2(AccountAvatarViewModel accountAvatarViewModel, Function0 function0, Modifier modifier, AvatarSize avatarSize, Icons icons, boolean z, boolean z2, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = accountAvatarViewModel;
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$3 = avatarSize;
        this.f$4 = icons;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$0;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                AccountToDoKt.AccountAvatar((AccountAvatarViewModel) obj5, (Function0) obj7, (Modifier) obj6, (AvatarSize) obj4, (Icons) obj3, this.f$5, this.f$6, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ((InputChipGridScope) obj5).InputChip((String) obj4, (Modifier) obj6, (String) obj3, (Function0) obj7, this.f$5, this.f$6, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                int i3 = this.f$8;
                ((InputChipGridScope) obj5).InputChip(updateChangedFlags3, i3, (Composer) obj, (ComposableLambdaImpl) obj4, (Modifier) obj6, (String) obj3, (Function0) obj7, this.f$5, this.f$6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                FidesmoProvisioningViewKt.PositionedScanningInstructionBlock((String) obj5, (Integer) obj7, this.f$5, (Function1) obj4, (Modifier) obj6, this.f$6, (String) obj3, (Composer) obj, updateChangedFlags4, this.f$8);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                MessageFileKt.MessageFailedRetryUI((String) obj5, this.f$5, (Function1) obj7, (Function1) obj6, (Function1) obj4, (String) obj3, this.f$6, (Composer) obj, updateChangedFlags5, this.f$8);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(1);
                SellerCardKt.DisabledClickableButtonCta(this.f$5, this.f$7, (Function0) obj7, (Modifier) obj6, (ButtonProminence) obj5, this.f$6, (Function0) obj4, (String) obj3, (Composer) obj, updateChangedFlags6, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                TextKt.FinancialConnectionsButton((Function0) obj7, (Modifier) obj6, (TextKt) obj5, (FinancialConnectionsButton$Size$Regular) obj4, this.f$5, this.f$6, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags7, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda2(InputChipGridScope inputChipGridScope, Object obj, Modifier modifier, String str, Function0 function0, boolean z, boolean z2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = inputChipGridScope;
        this.f$3 = obj;
        this.f$2 = modifier;
        this.f$4 = str;
        this.f$1 = function0;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda2(String str, Integer num, boolean z, Function1 function1, Modifier modifier, boolean z2, String str2, int i, int i2) {
        this.$r8$classId = 3;
        this.f$0 = str;
        this.f$1 = num;
        this.f$5 = z;
        this.f$3 = function1;
        this.f$2 = modifier;
        this.f$6 = z2;
        this.f$4 = str2;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda2(String str, boolean z, Function1 function1, Function1 function12, Function1 function13, String str2, boolean z2, int i, int i2) {
        this.$r8$classId = 4;
        this.f$0 = str;
        this.f$5 = z;
        this.f$1 = function1;
        this.f$2 = function12;
        this.f$3 = function13;
        this.f$4 = str2;
        this.f$6 = z2;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda2(Function0 function0, Modifier modifier, TextKt textKt, FinancialConnectionsButton$Size$Regular financialConnectionsButton$Size$Regular, boolean z, boolean z2, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 6;
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$0 = textKt;
        this.f$3 = financialConnectionsButton$Size$Regular;
        this.f$5 = z;
        this.f$6 = z2;
        this.f$4 = composableLambdaImpl;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda2(boolean z, int i, Function0 function0, Modifier modifier, ButtonProminence buttonProminence, boolean z2, Function0 function02, String str, int i2, int i3) {
        this.$r8$classId = 5;
        this.f$5 = z;
        this.f$7 = i;
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$0 = buttonProminence;
        this.f$6 = z2;
        this.f$3 = function02;
        this.f$4 = str;
        this.f$8 = i3;
    }
}
