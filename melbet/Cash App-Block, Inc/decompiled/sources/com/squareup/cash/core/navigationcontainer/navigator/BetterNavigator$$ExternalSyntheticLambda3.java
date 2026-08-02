package com.squareup.cash.core.navigationcontainer.navigator;

import com.squareup.cash.tabprovider.api.TabInfoState;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ChannelResult;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class BetterNavigator$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BetterNavigator f$0;

    public /* synthetic */ BetterNavigator$$ExternalSyntheticLambda3(BetterNavigator betterNavigator, int i) {
        this.$r8$classId = i;
        this.f$0 = betterNavigator;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        BetterNavigator betterNavigator = this.f$0;
        switch (i) {
            case 0:
                Navigation navigation = (Navigation) obj;
                navigation.getClass();
                Timber.Forest forest = Timber.Forest;
                forest.e("Could not deliver " + navigation, new Object[0]);
                if (betterNavigator.goToQueue.mo1159trySendJP2dKIU(navigation) instanceof ChannelResult.Failed) {
                    forest.e("Could not redeliver " + navigation, new Object[0]);
                }
                return Unit.INSTANCE;
            default:
                TabInfoState tabInfoState = (TabInfoState) obj;
                tabInfoState.getClass();
                ArrayList arrayList = betterNavigator.tabs;
                arrayList.clear();
                if (!tabInfoState.equals(TabInfoState.NotReady.INSTANCE)) {
                    if (!tabInfoState.equals(TabInfoState.Onboarding.INSTANCE)) {
                        if (!(tabInfoState instanceof TabInfoState.Ready)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        arrayList.addAll(((TabInfoState.Ready) tabInfoState).getTabs());
                    }
                    z = true;
                }
                betterNavigator.setReadyToNavigate(z);
                return Unit.INSTANCE;
        }
    }
}
