package com.squareup.cash.pools.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolInvitePeopleListViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PoolInvitePeopleListViewModel f$0;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ PoolInvitePeopleListViewKt$$ExternalSyntheticLambda0(PoolInvitePeopleListViewModel poolInvitePeopleListViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = poolInvitePeopleListViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        int i2 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-731938564, new PoolInvitePeopleListViewKt$$ExternalSyntheticLambda0(this.f$0, function1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = this.f$0;
                    boolean z = poolInvitePeopleListViewModel instanceof PoolInvitePeopleListViewModel.Loading;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new PoolsListViewKt$$ExternalSyntheticLambda6(4);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Strings.LoadableFullScreenContent(poolInvitePeopleListViewModel, z, Modifier.Companion.$$INSTANCE, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(-1700647450, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, false, 15), gapComposer2), gapComposer2, 199680, 16);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
