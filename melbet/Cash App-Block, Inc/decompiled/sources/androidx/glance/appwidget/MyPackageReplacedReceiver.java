package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes3.dex */
public final class MyPackageReplacedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        CoroutineBroadcastReceiverKt.goAsync(this, Dispatchers.Default, new MyPackageReplacedReceiver$onReceive$1(context, null, 0));
    }
}
