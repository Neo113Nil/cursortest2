package com.adjust.sdk;

import java.util.ArrayList;
import kotlin.text.CatchingFishMVPLiveData;

/* loaded from: classes.dex */
public final class CatchingFishFragmentFactory {
    public final ActivityHandler CatchingFishParcelableFAB;
    public final ArrayList CatchingFishSnackbar = new ArrayList();
    public int CatchingFishCoroutine = 0;

    public CatchingFishFragmentFactory(ActivityHandler activityHandler) {
        this.CatchingFishParcelableFAB = activityHandler;
    }

    public final void CatchingFishParcelableFAB(Runnable runnable, String str) {
        if (this.CatchingFishCoroutine != 3) {
            runnable.run();
        } else {
            this.CatchingFishParcelableFAB.getAdjustConfig().getLogger().debug(CatchingFishMVPLiveData.CatchingFishOkHttp("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.CatchingFishSnackbar.add(runnable);
        }
    }

    public final void CatchingFishSnackbar(String str, IRunActivityHandler iRunActivityHandler) {
        int i = this.CatchingFishCoroutine;
        ActivityHandler activityHandler = this.CatchingFishParcelableFAB;
        if (i != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(CatchingFishMVPLiveData.CatchingFishOkHttp("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }
}
