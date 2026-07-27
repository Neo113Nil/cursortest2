package f4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public w f37792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f37793b;

    public v(w wVar, w wVar2) {
        this.f37793b = wVar;
        this.f37792a = wVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        w wVar = this.f37793b;
        wVar.f37797n.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            w wVar = this.f37792a;
            if (wVar == null) {
                return;
            }
            if (wVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                w wVar2 = this.f37792a;
                wVar2.f37800w.f37789f.schedule(wVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f37792a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
