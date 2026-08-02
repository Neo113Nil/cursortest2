package l4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class w extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public x f38974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f38975b;

    public w(x xVar, x xVar2) {
        this.f38975b = xVar;
        this.f38974a = xVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        x xVar = this.f38975b;
        xVar.f38979n.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            x xVar = this.f38974a;
            if (xVar == null) {
                return;
            }
            if (xVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                x xVar2 = this.f38974a;
                xVar2.f38982w.f38971f.schedule(xVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f38974a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
