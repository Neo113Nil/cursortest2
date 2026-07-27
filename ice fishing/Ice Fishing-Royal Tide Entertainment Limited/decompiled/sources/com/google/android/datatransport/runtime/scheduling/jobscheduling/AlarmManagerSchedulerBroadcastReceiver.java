package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import kotlin.text.CatchingFishAsyncTaskDagger;
import kotlin.text.CatchingFishBundleMVIHilt;
import kotlin.text.CatchingFishGlideDagger;
import kotlin.text.CatchingFishGsonRetrofit;
import kotlin.text.CatchingFishKtorLifecycle;
import kotlin.text.CatchingFishMVVMWorkManager;
import kotlin.text.CatchingFishRoomGlide;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int CatchingFishParcelableFAB = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        CatchingFishGlideDagger.CatchingFishSnackbar(context);
        CatchingFishAsyncTaskDagger CatchingFishParcelableFAB2 = CatchingFishBundleMVIHilt.CatchingFishParcelableFAB();
        CatchingFishParcelableFAB2.CatchingFishMoshiDaggerHilt(queryParameter);
        CatchingFishParcelableFAB2.CatchingFishViewModelScope = CatchingFishRoomGlide.CatchingFishSnackbar(intValue);
        if (queryParameter2 != null) {
            CatchingFishParcelableFAB2.CatchingFishWorkManager = Base64.decode(queryParameter2, 0);
        }
        CatchingFishGsonRetrofit catchingFishGsonRetrofit = CatchingFishGlideDagger.CatchingFishParcelableFAB().CatchingFishReduxKtor;
        catchingFishGsonRetrofit.CatchingFishDaggerWebsocket.execute(new CatchingFishMVVMWorkManager(catchingFishGsonRetrofit, CatchingFishParcelableFAB2.CatchingFishCoroutineFlow(), i, new CatchingFishKtorLifecycle(0)));
    }
}
