package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.r9.l;
import com.gamericefishpro.space.t6.b;
import com.gamericefishpro.space.z4.x;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends x {
    public static final String y = q.d("SystemFgService");
    public Handler e;
    public boolean i;
    public b v;
    public NotificationManager w;

    public final void c() {
        this.e = new Handler(Looper.getMainLooper());
        this.w = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.v = bVar;
        if (bVar.B != null) {
            q.c().a(b.C, "A callback already exists.");
        } else {
            bVar.B = this;
        }
    }

    @Override // com.gamericefishpro.space.z4.x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // com.gamericefishpro.space.z4.x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.v.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.i) {
            q.c().getClass();
            this.v.g();
            c();
            this.i = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.v;
        bVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            q qVarC = q.c();
            Objects.toString(intent);
            qVarC.getClass();
            bVar.e.a(new l(3, bVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            bVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            q.c().getClass();
            SystemForegroundService systemForegroundService = bVar.B;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.i = true;
            q.c().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        q qVarC2 = q.c();
        Objects.toString(intent);
        qVarC2.getClass();
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        o oVar = bVar.d;
        UUID uuidFromString = UUID.fromString(stringExtra);
        oVar.getClass();
        oVar.d.a(new com.gamericefishpro.space.v6.b(oVar, uuidFromString, 0));
        return 3;
    }
}
