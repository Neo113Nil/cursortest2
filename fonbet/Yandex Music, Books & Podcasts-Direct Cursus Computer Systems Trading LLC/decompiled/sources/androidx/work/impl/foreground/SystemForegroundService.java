package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.a4g;
import defpackage.ap1;
import defpackage.e8h;
import defpackage.fzr;
import defpackage.g4w;
import defpackage.izf;
import defpackage.jsg;
import defpackage.ogp;
import defpackage.qhp;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends izf {
    public static final String e = jsg.n("SystemFgService");
    public boolean b;
    public fzr c;
    public NotificationManager d;

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        fzr fzrVar = new fzr(getApplicationContext());
        this.c = fzrVar;
        if (fzrVar.i != null) {
            jsg.j().g(fzr.j, "A callback already exists.");
        } else {
            fzrVar.i = this;
        }
    }

    @Override // defpackage.izf, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.izf, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        String str = e;
        if (z) {
            jsg.j().k(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.e();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        fzr fzrVar = this.c;
        fzrVar.getClass();
        String str2 = fzr.j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            jsg.j().k(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            fzrVar.b.a.execute(new e8h(22, fzrVar, stringExtra));
            fzrVar.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            fzrVar.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            jsg.j().k(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = fzrVar.i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            jsg.j().e(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        jsg.j().k(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        g4w g4wVar = fzrVar.a;
        UUID fromString = UUID.fromString(stringExtra2);
        g4wVar.getClass();
        fromString.getClass();
        ogp ogpVar = g4wVar.b.m;
        qhp qhpVar = g4wVar.d.a;
        qhpVar.getClass();
        a4g.K(ogpVar, "CancelWorkById", qhpVar, new ap1(13, g4wVar, fromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
