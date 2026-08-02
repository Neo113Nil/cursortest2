package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.glance.appwidget.CoroutineBroadcastReceiverKt;
import androidx.paging.PageFetcher$flow$1;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CoroutineBroadcastReceiverKt.goAsync(this, Dispatchers.Default, new PageFetcher$flow$1(intent, context, null, 12));
    }
}
