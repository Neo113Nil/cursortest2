package o6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.b f5276b;

    public f0(i7.b bVar) {
        this.f5276b = bVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f5275a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f5275a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f5276b.H();
            a();
        }
    }
}
