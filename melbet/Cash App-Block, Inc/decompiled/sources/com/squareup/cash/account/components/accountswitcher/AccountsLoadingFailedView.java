package com.squareup.cash.account.components.accountswitcher;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountsLoadingFailedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class AccountsLoadingFailedView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountsLoadingFailedView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(final AccountsLoadingFailedViewModel accountsLoadingFailedViewModel, final Function1 function1, Composer composer, final int i) {
        AccountsLoadingFailedView accountsLoadingFailedView;
        AccountsLoadingFailedViewModel accountsLoadingFailedViewModel2;
        Function1 function12;
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1034072820);
        int i3 = (gapComposer.changedInstance(accountsLoadingFailedViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            accountsLoadingFailedView = this;
            accountsLoadingFailedViewModel2 = accountsLoadingFailedViewModel;
            function12 = function1;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (accountsLoadingFailedViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(this, accountsLoadingFailedViewModel, function1, i, i4) { // from class: com.squareup.cash.account.components.accountswitcher.AccountsLoadingFailedView$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ AccountsLoadingFailedView f$0;
                        public final /* synthetic */ AccountsLoadingFailedViewModel f$1;
                        public final /* synthetic */ Function1 f$2;

                        {
                            this.$r8$classId = i4;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Function1 function13 = this.f$2;
                            AccountsLoadingFailedViewModel accountsLoadingFailedViewModel3 = this.f$1;
                            AccountsLoadingFailedView accountsLoadingFailedView2 = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            int i6 = AccountsLoadingFailedView.$r8$clinit;
                            switch (i5) {
                                case 0:
                                    accountsLoadingFailedView2.Content(accountsLoadingFailedViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    accountsLoadingFailedView2.Content(accountsLoadingFailedViewModel3, function13, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            accountsLoadingFailedView = this;
            accountsLoadingFailedViewModel2 = accountsLoadingFailedViewModel;
            function12 = function1;
            i2 = i;
            BadgeTitleKt.AccountsLoadingFailedViewContent(function12, gapComposer, (i3 >> 3) & 14);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = i2;
            final Function1 function13 = function12;
            final AccountsLoadingFailedViewModel accountsLoadingFailedViewModel3 = accountsLoadingFailedViewModel2;
            final AccountsLoadingFailedView accountsLoadingFailedView2 = accountsLoadingFailedView;
            final int i6 = 1;
            endRestartGroup2.block = new Function2(accountsLoadingFailedView2, accountsLoadingFailedViewModel3, function13, i5, i6) { // from class: com.squareup.cash.account.components.accountswitcher.AccountsLoadingFailedView$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ AccountsLoadingFailedView f$0;
                public final /* synthetic */ AccountsLoadingFailedViewModel f$1;
                public final /* synthetic */ Function1 f$2;

                {
                    this.$r8$classId = i6;
                    this.f$0 = accountsLoadingFailedView2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.$r8$classId;
                    Function1 function132 = this.f$2;
                    AccountsLoadingFailedViewModel accountsLoadingFailedViewModel32 = this.f$1;
                    AccountsLoadingFailedView accountsLoadingFailedView22 = this.f$0;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    int i62 = AccountsLoadingFailedView.$r8$clinit;
                    switch (i52) {
                        case 0:
                            accountsLoadingFailedView22.Content(accountsLoadingFailedViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            accountsLoadingFailedView22.Content(accountsLoadingFailedViewModel32, function132, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((AccountsLoadingFailedViewModel) obj, function1, gapComposer, 0);
    }
}
