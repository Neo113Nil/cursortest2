package com.squareup.cash.core.navigationcontainer.navigator;

import android.os.Bundle;
import androidx.datastore.core.SimpleActor;
import androidx.room.RoomDatabase$closeBarrier$1;
import com.squareup.cash.core.navigationcontainer.api.NavigatorState;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.MainContainerDelegate$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.StateFlowKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class CashNavigator {
    public boolean _needsColdStartNavigation;
    public boolean hasReceivedLockNavigation;
    public final SimpleActor navigator;

    public CashNavigator(BetterNavigator$Factory$Impl betterNavigator$Factory$Impl, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1, MainContainerDelegate$$ExternalSyntheticLambda0 mainContainerDelegate$$ExternalSyntheticLambda0, Bundle bundle, Set set) {
        set.getClass();
        Bundle bundle2 = bundle != null ? bundle.getBundle("navigator") : null;
        ScreenshotViewKt$$ExternalSyntheticLambda0 screenshotViewKt$$ExternalSyntheticLambda0 = new ScreenshotViewKt$$ExternalSyntheticLambda0(betterNavigator$Factory$Impl, roomDatabase$closeBarrier$1, mainContainerDelegate$$ExternalSyntheticLambda0, set, 3);
        NavigatorState[] values = NavigatorState.values();
        CashNavigator$special$$inlined$invoke$1 cashNavigator$special$$inlined$invoke$1 = CashNavigator$special$$inlined$invoke$1.INSTANCE;
        this.navigator = new SimpleActor(values, screenshotViewKt$$ExternalSyntheticLambda0, bundle2);
        this._needsColdStartNavigation = bundle != null ? bundle.getBoolean("needsColdStart") : true;
        this.hasReceivedLockNavigation = bundle != null ? bundle.getBoolean("hasReceivedLockNavigation") : false;
    }

    public final boolean onBack() {
        SimpleActor simpleActor = this.navigator;
        Object obj = ((LinkedHashMap) simpleActor.messageQueue).get((Enum) simpleActor.consumeMessage);
        obj.getClass();
        BetterNavigator betterNavigator = (BetterNavigator) obj;
        List<EventListener> list = betterNavigator.eventListeners;
        for (EventListener eventListener : list) {
            betterNavigator.createEventState();
            eventListener.getClass();
        }
        if (!betterNavigator.readyToNavigate) {
            StateFlowKt.emitOrThrow(betterNavigator.delayedBackPressed, Boolean.TRUE);
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).backStart(betterNavigator.createEventState());
        }
        boolean onBack = betterNavigator.onBack(true);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((EventListener) it2.next()).backEnd(betterNavigator.createEventState());
        }
        betterNavigator.emitIfDirty();
        return onBack;
    }
}
