package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import defpackage.de2;
import defpackage.hgp;
import defpackage.jq;
import defpackage.kv0;
import defpackage.nsh;
import defpackage.qsm;
import defpackage.t9t;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        t9t.b(context);
        nsh a2 = de2.a();
        a2.L(queryParameter);
        a2.d = qsm.b(intValue);
        if (queryParameter2 != null) {
            a2.c = Base64.decode(queryParameter2, 0);
        }
        hgp hgpVar = t9t.a().d;
        ((Executor) hgpVar.f).execute(new kv0(hgpVar, a2.c(), i, new jq(0)));
    }
}
