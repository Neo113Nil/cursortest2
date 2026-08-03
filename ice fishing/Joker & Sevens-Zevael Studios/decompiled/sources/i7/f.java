package i7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f3227b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3228a;

    public f(Context context) {
        this.f3228a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f3229j) {
            try {
                Iterator it = ((s.e) g.f3230k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3228a.unregisterReceiver(this);
    }
}
