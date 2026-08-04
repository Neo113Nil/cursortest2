package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.appsflyer.internal.s;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.c8.j;
import com.gamericefishpro.space.c8.r;
import com.gamericefishpro.space.i8.d;
import com.gamericefishpro.space.i8.h;
import com.gamericefishpro.space.m8.a;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        c cVarA = j.a();
        cVarA.C(queryParameter);
        cVarA.i = a.b(iIntValue);
        if (queryParameter2 != null) {
            cVarA.e = Base64.decode(queryParameter2, 0);
        }
        h hVar = r.a().d;
        ((Executor) hVar.e).execute(new d(hVar, cVarA.e(), i, new s(2)));
    }
}
