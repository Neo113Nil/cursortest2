package com.yandex.music.shared.downloading.api.service;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.f0;
import defpackage.bfj;
import defpackage.dm6;
import defpackage.es6;
import defpackage.f1d;
import defpackage.g3o;
import defpackage.gld;
import defpackage.imp;
import defpackage.jyr;
import defpackage.lhs;
import defpackage.mmo;
import defpackage.o7b;
import defpackage.ox6;
import defpackage.pcg;
import defpackage.rf3;
import defpackage.saf;
import defpackage.ssg;
import defpackage.su4;
import defpackage.tf6;
import defpackage.v3w;
import defpackage.v7g;
import defpackage.vka;
import defpackage.w6h;
import defpackage.xdr;
import defpackage.y7g;
import defpackage.yaa;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public class DownloadService extends Service {
    public static vka c;
    public static es6 d;
    public final tf6 a = gld.e(dm6.b());
    public mmo b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ssg.a(3, null, "onCreate", null);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ssg.a(3, null, "onDestroy", null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        NotificationManager notificationManager;
        String action = intent != null ? intent.getAction() : null;
        v3w.l("onStartCommand action=", action, 3, null, null);
        boolean d2 = Intrinsics.d(action, "ACTION_START_SERVICE");
        tf6 tf6Var = this.a;
        if (d2) {
            es6 es6Var = d;
            if (es6Var == null) {
                Intrinsics.j("notificationHelper");
                throw null;
            }
            Context context = (Context) es6Var.a;
            lhs lhsVar = MainScreenActivity.Q0;
            Intent addFlags = imp.J(context, rf3.l, null, w6h.a, 4).addFlags(876609536);
            addFlags.getClass();
            PendingIntent Q = pcg.Q(addFlags, context, 1, 134217728);
            bfj bfjVar = bfj.d;
            f0 f0Var = new f0(context, "ru.yandex.music.notifications.cache");
            f0Var.g = Q;
            f0Var.p = 0;
            f0Var.q = 0;
            f0Var.r = false;
            f0Var.K.icon = R.drawable.stat_sys_download;
            f0Var.A = context.getColor(ru.yandex.music.R.color.icon_accent_night);
            es6Var.c = f0Var;
            startForeground(2, v7g.o(f0Var));
            vka vkaVar = c;
            if (vkaVar == null) {
                Intrinsics.j("downloadingFactory");
                throw null;
            }
            tf6Var.getClass();
            mmo mmoVar = new mmo(tf6Var, vkaVar.c, vkaVar.k);
            this.b = mmoVar;
            ox6.B((xdr) mmoVar.d, tf6Var, new o7b(7, this));
            return 2;
        }
        if (!Intrinsics.d(action, "ACTION_STOP_SERVICE")) {
            su4.s(2, null, f1d.g("Unknown action = ", action), null);
            return 2;
        }
        saf.D(tf6Var.a, null);
        mmo mmoVar2 = this.b;
        if (mmoVar2 != null) {
            yaa yaaVar = (yaa) ((xdr) mmoVar2.d).getValue();
            int i3 = yaaVar.a;
            if (i3 != 0) {
                es6 es6Var2 = d;
                if (es6Var2 == null) {
                    Intrinsics.j("notificationHelper");
                    throw null;
                }
                int i4 = yaaVar.c;
                if (((f0) es6Var2.c) != null && (notificationManager = (NotificationManager) ((jyr) es6Var2.b).getValue()) != null) {
                    ssg.a(3, null, f1d.e(i3, i4, "caching finished notification, downloaded:", ", max:"), null);
                    f0 f0Var2 = (f0) es6Var2.c;
                    if (f0Var2 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var2.K.icon = R.drawable.stat_sys_download_done;
                    f0Var2.e(((Context) es6Var2.a).getString(ru.yandex.music.R.string.download_complete_title));
                    f0 f0Var3 = (f0) es6Var2.c;
                    if (f0Var3 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var3.d(g3o.a(ru.yandex.music.R.plurals.download_complete_content, i3, Integer.valueOf(i3)));
                    f0 f0Var4 = (f0) es6Var2.c;
                    if (f0Var4 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var4.p = 0;
                    f0Var4.q = 0;
                    f0Var4.r = false;
                    if (f0Var4 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    f0Var4.g(16, true);
                    f0 f0Var5 = (f0) es6Var2.c;
                    if (f0Var5 == null) {
                        Intrinsics.j("builder");
                        throw null;
                    }
                    y7g.K(notificationManager, 2, v7g.o(f0Var5));
                }
                stopForeground(2);
            } else {
                stopForeground(1);
            }
        }
        stopSelf();
        return 2;
    }
}
