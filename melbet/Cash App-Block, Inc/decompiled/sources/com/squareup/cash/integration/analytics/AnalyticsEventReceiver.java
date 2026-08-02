package com.squareup.cash.integration.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.ui.PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1;
import com.squareup.util.android.ShareResultReceiver$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes8.dex */
public final class AnalyticsEventReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int $r8$clinit = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        NotificationType notificationType = (NotificationType) intent.getSerializableExtra("event-type");
        Action action = (Action) intent.getSerializableExtra("event-action");
        if (action == null || notificationType == null) {
            return;
        }
        ContextScope MainScope = JobKt.MainScope();
        int i = 1;
        Countries.onCurrentSandboxComponentExt(context, MainScope, new PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1(new ShareResultReceiver$$ExternalSyntheticLambda0(i, action, notificationType), MainScope, i));
        JobKt.cancel(MainScope, (CancellationException) null);
    }
}
