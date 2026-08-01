package L3;

import C2.J;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class g implements E {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1692a;

    /* renamed from: b, reason: collision with root package name */
    public final y f1693b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f1694c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public BinderC0320f f1695d;

    public g(Context context, Intent intent) {
        this.f1692a = context;
        if (!d3.b.a(context)) {
            throw new IllegalStateException("HSDP service is not available.");
        }
        this.f1693b = new y(context.getApplicationContext(), "HsdpService", intent, new M2.i(6));
    }

    public static void b(g gVar, String str, int i, Runnable runnable) {
        ((Handler) gVar.f1693b.f1742a.c()).post(new RunnableC0318d(i, 1, gVar, runnable, str));
    }

    public final void a(String str, String str2, IBinder iBinder, int i, int i6, boolean z3, InterfaceC0315a interfaceC0315a) {
        r rVar = (r) this.f1694c.putIfAbsent(str, new r(str, interfaceC0315a));
        if (rVar != null) {
            rVar.f1732b = interfaceC0315a;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i6);
        bundle.putString("sdkVersion", "2.0.0");
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z3);
        this.f1693b.a(new J(this, str, str2, bundle, 6));
    }
}
