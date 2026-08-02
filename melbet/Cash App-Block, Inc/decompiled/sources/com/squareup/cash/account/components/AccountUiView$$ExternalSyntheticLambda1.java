package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountUiView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ AccountUiView f$2;

    public /* synthetic */ AccountUiView$$ExternalSyntheticLambda1(AccountUiView accountUiView, AccountViewModel accountViewModel, Function1 function1, int i) {
        this.$r8$classId = 1;
        this.f$2 = accountUiView;
        this.f$0 = accountViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = 2;
        AccountUiView accountUiView = this.f$2;
        Function1 function1 = this.f$1;
        AccountViewModel accountViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1543981235, new AccountUiView$$ExternalSyntheticLambda1(accountViewModel, function1, accountUiView, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                accountUiView.Content(accountViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AccountToDoKt.AccountView(accountViewModel, function1, (ElementBoundsRegistry) accountUiView.elementBoundsRegistry, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountUiView$$ExternalSyntheticLambda1(AccountViewModel accountViewModel, Function1 function1, AccountUiView accountUiView, int i) {
        this.$r8$classId = i;
        this.f$0 = accountViewModel;
        this.f$1 = function1;
        this.f$2 = accountUiView;
    }
}
