package Q2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class G extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f2504a;

    /* renamed from: b, reason: collision with root package name */
    public final t8.g f2505b;

    public G(t8.g gVar) {
        this.f2505b = gVar;
    }

    public final synchronized void a() {
        try {
            Context context = this.f2504a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f2504a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2505b.q();
            a();
        }
    }
}
