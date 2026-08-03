package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.x;
import dd.i;
import java.util.UUID;
import o4.o;
import p4.n;
import w4.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class SystemForegroundService extends x {

    /* renamed from: l, reason: collision with root package name */
    public static final String f781l = o.f("SystemFgService");

    /* renamed from: h, reason: collision with root package name */
    public Handler f782h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f783i;

    /* renamed from: j, reason: collision with root package name */
    public b f784j;

    /* renamed from: k, reason: collision with root package name */
    public NotificationManager f785k;

    public final void c() {
        this.f782h = new Handler(Looper.getMainLooper());
        this.f785k = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f784j = bVar;
        if (bVar.f7656o != null) {
            o.d().b(b.f7647p, "A callback already exists.");
        } else {
            bVar.f7656o = this;
        }
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // androidx.lifecycle.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f784j.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.f783i;
        String str = f781l;
        if (z10) {
            o.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f784j.g();
            c();
            this.f783i = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f784j;
        bVar.getClass();
        String str2 = b.f7647p;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            o.d().e(str2, "Started foreground service " + intent);
            bVar.f7649h.a(new i(21, bVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            bVar.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.f(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            o.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.f7656o;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f783i = true;
            o.d().a(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        o.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        n nVar = bVar.f7648g;
        UUID fromString = UUID.fromString(stringExtra);
        nVar.getClass();
        nVar.f5496d.a(new y4.b(nVar, fromString, 0));
        return 3;
    }
}
