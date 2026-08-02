package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b2.i;
import b2.n;
import b3.e;
import l2.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24331a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        n.b(context);
        e a9 = i.a();
        a9.H(queryParameter);
        a9.f5559w = a.b(intValue);
        if (queryParameter2 != null) {
            a9.f5558v = Base64.decode(queryParameter2, 0);
        }
        h2.i iVar = n.a().f5551d;
        i o4 = a9.o();
        com.onesignal.common.threading.a aVar = new com.onesignal.common.threading.a(1);
        iVar.getClass();
        iVar.f38110e.execute(new h2.e(iVar, o4, i, aVar));
    }
}
