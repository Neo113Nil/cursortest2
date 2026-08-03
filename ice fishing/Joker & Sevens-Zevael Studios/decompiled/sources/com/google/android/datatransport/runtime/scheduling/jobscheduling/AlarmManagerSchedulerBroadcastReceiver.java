package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a5.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c6.e;
import c6.l;
import g6.a;
import java.util.concurrent.Executor;
import w5.i;
import w5.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1401a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        o.b(context);
        c a6 = i.a();
        a6.L(queryParameter);
        a6.f263i = a.b(intValue);
        if (queryParameter2 != null) {
            a6.f261g = Base64.decode(queryParameter2, 0);
        }
        l lVar = o.a().f7707d;
        ((Executor) lVar.f1272e).execute(new e(lVar, a6.n(), i10, new c6.a(0)));
    }
}
