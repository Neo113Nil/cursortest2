package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Y2.e;
import Z1.i;
import Z1.o;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.onesignal.common.threading.a;
import j2.AbstractC4595a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23707a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        e a9 = i.a();
        a9.K(queryParameter);
        a9.f3965w = AbstractC4595a.b(intValue);
        if (queryParameter2 != null) {
            a9.f3964v = Base64.decode(queryParameter2, 0);
        }
        f2.i iVar = o.a().f4241d;
        i p6 = a9.p();
        a aVar = new a(1);
        iVar.getClass();
        iVar.f37690e.execute(new f2.e(iVar, p6, i, aVar));
    }
}
