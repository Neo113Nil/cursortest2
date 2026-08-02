package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zdc extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public zdc(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (aec.k) {
            try {
                Iterator it = ((wy0) aec.l.values()).iterator();
                while (it.hasNext()) {
                    ((aec) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
