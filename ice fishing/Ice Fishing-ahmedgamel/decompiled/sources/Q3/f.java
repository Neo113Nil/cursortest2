package Q3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f2657b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2658a;

    public f(Context context) {
        this.f2658a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f2659j) {
            try {
                Iterator it = ((s.i) g.f2660k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2658a.unregisterReceiver(this);
    }
}
