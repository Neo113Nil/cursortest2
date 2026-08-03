package d8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public d0 f1754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f1755b;

    public c0(d0 d0Var, d0 d0Var2) {
        this.f1755b = d0Var;
        this.f1754a = d0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f1755b.f1761g.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            d0 d0Var = this.f1754a;
            if (d0Var == null) {
                return;
            }
            if (d0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                d0 d0Var2 = this.f1754a;
                d0Var2.f1764j.f1750f.schedule(d0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f1754a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
