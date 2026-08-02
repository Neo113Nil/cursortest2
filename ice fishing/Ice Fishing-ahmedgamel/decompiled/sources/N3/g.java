package N3;

import E2.I;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class g implements B {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1971a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1972b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f1973c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public f f1974d;

    public g(Context context, Intent intent) {
        this.f1971a = context;
        if (!f3.b.a(context)) {
            throw new IllegalStateException("HSDP service is not available.");
        }
        this.f1972b = new v(context.getApplicationContext(), "HsdpService", intent, new c4.e());
    }

    public static void b(g gVar, String str, int i, Runnable runnable) {
        ((Handler) gVar.f1972b.f2014a.c()).post(new d(i, 1, gVar, runnable, str));
    }

    public final void a(String str, String str2, IBinder iBinder, int i, int i4, boolean z6, InterfaceC0323a interfaceC0323a) {
        o oVar = (o) this.f1973c.putIfAbsent(str, new o(str, interfaceC0323a));
        if (oVar != null) {
            oVar.f2005b = interfaceC0323a;
        }
        Bundle bundle = new Bundle();
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i4);
        bundle.putString("sdkVersion", "2.0.0");
        bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
        bundle.putBoolean("autoTrigger", z6);
        this.f1972b.a(new I(this, str, str2, bundle, 6));
    }
}
