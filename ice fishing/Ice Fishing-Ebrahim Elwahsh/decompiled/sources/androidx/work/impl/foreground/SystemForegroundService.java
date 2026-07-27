package androidx.work.impl.foreground;

import B2.RunnableC0272f;
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
import androidx.lifecycle.AbstractServiceC0516y;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0516y {

    /* renamed from: y, reason: collision with root package name */
    public static final String f5504y = s.f("SystemFgService");

    /* renamed from: u, reason: collision with root package name */
    public Handler f5505u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5506v;

    /* renamed from: w, reason: collision with root package name */
    public a f5507w;

    /* renamed from: x, reason: collision with root package name */
    public NotificationManager f5508x;

    public final void a() {
        this.f5505u = new Handler(Looper.getMainLooper());
        this.f5508x = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f5507w = aVar;
        if (aVar.f2780B != null) {
            s.d().b(a.f2778C, "A callback already exists.");
        } else {
            aVar.f2780B = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0516y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0516y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5507w.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i4) {
        super.onStartCommand(intent, i, i4);
        boolean z8 = this.f5506v;
        String str = f5504y;
        if (z8) {
            s.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f5507w.g();
            a();
            this.f5506v = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f5507w;
        aVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f2778C;
        if (equals) {
            s.d().e(str2, "Started foreground service " + intent);
            aVar.f2782u.i(new RunnableC0272f(aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 19, false));
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
            SystemForegroundService systemForegroundService = aVar.f2780B;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f5506v = true;
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
        p pVar = aVar.f2781n;
        pVar.getClass();
        pVar.f1533d.i(new b(pVar, fromString, 0));
        return 3;
    }
}
