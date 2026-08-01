package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Z1.i;
import Z1.o;
import Z2.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import j2.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23551a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        e a9 = i.a();
        a9.H(queryParameter);
        a9.f4172w = a.b(intValue);
        if (queryParameter2 != null) {
            a9.f4171v = Base64.decode(queryParameter2, 0);
        }
        f2.i iVar = o.a().f4164d;
        i n9 = a9.n();
        com.onesignal.common.threading.a aVar = new com.onesignal.common.threading.a(1);
        iVar.getClass();
        iVar.f37486e.execute(new f2.e(iVar, n9, i, aVar));
    }
}
