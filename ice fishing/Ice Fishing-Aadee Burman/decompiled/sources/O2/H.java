package O2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class H extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2186a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.g f2187b;

    public H(com.bumptech.glide.g gVar) {
        this.f2187b = gVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f2186a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f2186a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2187b.j();
            a();
        }
    }
}
