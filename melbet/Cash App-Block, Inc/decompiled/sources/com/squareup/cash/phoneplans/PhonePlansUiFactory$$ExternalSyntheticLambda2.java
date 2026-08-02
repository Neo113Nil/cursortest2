package com.squareup.cash.phoneplans;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhonePlansUiFactory$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WirelessProviderListViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PhonePlansUiFactory$$ExternalSyntheticLambda2(WirelessProviderListViewModel wirelessProviderListViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = wirelessProviderListViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        WirelessProviderListViewModel wirelessProviderListViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    PhonePlansHomeViewKt.WirelessProviderListView(wirelessProviderListViewModel, function1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    WirelessProviderListViewModel wirelessProviderListViewModel2 = this.f$0;
                    Strings.LoadableFullScreenContent(wirelessProviderListViewModel2, wirelessProviderListViewModel2 instanceof WirelessProviderListViewModel.Loading, null, null, null, Expect_jvmKt.rememberComposableLambda(-242308570, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, false, 13), gapComposer2), gapComposer2, 196608, 28);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                PhonePlansHomeViewKt.WirelessProviderListView(wirelessProviderListViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PhonePlansUiFactory$$ExternalSyntheticLambda2(WirelessProviderListViewModel wirelessProviderListViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = wirelessProviderListViewModel;
        this.f$1 = function1;
    }
}
