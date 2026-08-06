package o0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public Context f8295a;

    /* renamed from: b, reason: collision with root package name */
    public final o.b f8296b;

    public p(o.b bVar) {
        this.f8296b = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((C.b) this.f8296b.f8227c).getClass();
            throw null;
        }
    }
}
