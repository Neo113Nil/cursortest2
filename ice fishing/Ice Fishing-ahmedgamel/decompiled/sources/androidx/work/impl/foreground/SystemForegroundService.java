package androidx.work.impl.foreground;

import J0.r;
import K0.p;
import R0.a;
import T0.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0510y;
import com.google.android.gms.internal.ads.LD;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0510y {

    /* renamed from: y, reason: collision with root package name */
    public static final String f5357y = r.f("SystemFgService");

    /* renamed from: u, reason: collision with root package name */
    public Handler f5358u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5359v;

    /* renamed from: w, reason: collision with root package name */
    public a f5360w;

    /* renamed from: x, reason: collision with root package name */
    public NotificationManager f5361x;

    public final void a() {
        this.f5358u = new Handler(Looper.getMainLooper());
        this.f5361x = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f5360w = aVar;
        if (aVar.f2727B != null) {
            r.d().b(a.f2725C, "A callback already exists.");
        } else {
            aVar.f2727B = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0510y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0510y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5360w.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i4) {
        super.onStartCommand(intent, i, i4);
        boolean z6 = this.f5359v;
        String str = f5357y;
        if (z6) {
            r.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f5360w.g();
            a();
            this.f5359v = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f5360w;
        aVar.getClass();
        String action = intent.getAction();
        boolean equals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f2725C;
        if (equals) {
            r.d().e(str2, "Started foreground service " + intent);
            aVar.f2729u.h(new LD(aVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 21, false));
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
            r.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f2727B;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f5359v = true;
            r.d().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        r.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID fromString = UUID.fromString(stringExtra);
        p pVar = aVar.f2728n;
        pVar.getClass();
        pVar.f1644d.h(new b(pVar, fromString, 0));
        return 3;
    }
}
