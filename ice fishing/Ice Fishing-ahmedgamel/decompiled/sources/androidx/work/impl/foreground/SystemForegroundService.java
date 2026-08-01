package androidx.work.impl.foreground;

import J0.s;
import K0.p;
import R0.a;
import T0.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0506y;
import com.google.android.gms.internal.ads.LD;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0506y {

    /* renamed from: y, reason: collision with root package name */
    public static final String f5392y = s.f("SystemFgService");

    /* renamed from: u, reason: collision with root package name */
    public Handler f5393u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5394v;

    /* renamed from: w, reason: collision with root package name */
    public a f5395w;

    /* renamed from: x, reason: collision with root package name */
    public NotificationManager f5396x;

    public final void a() {
        this.f5393u = new Handler(Looper.getMainLooper());
        this.f5396x = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f5395w = aVar;
        if (aVar.f2690B != null) {
            s.d().b(a.f2688C, "A callback already exists.");
        } else {
            aVar.f2690B = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0506y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0506y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5395w.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i6) {
        super.onStartCommand(intent, i, i6);
        boolean z3 = this.f5394v;
        String str = f5392y;
        if (z3) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f5395w.g();
            a();
            this.f5394v = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f5395w;
        aVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f2688C;
        if (equals) {
            s.d().e(str2, "Started foreground service " + intent);
            aVar.f2692u.i(new LD(aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 21, false));
            aVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            s.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f2690B;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f5394v = true;
            s.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        s.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID fromString = UUID.fromString(stringExtra);
        p pVar = aVar.f2691n;
        pVar.getClass();
        pVar.f1535d.i(new b(pVar, fromString, 0));
        return 3;
    }
}
